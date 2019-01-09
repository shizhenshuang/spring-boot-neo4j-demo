package utry.neo4j.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utry.neo4j.entity.CoderNode;
import utry.neo4j.entity.UserNode;
import utry.neo4j.repository.CoderNodeRepository;
import utry.neo4j.service.INeo4jService;

import java.util.List;
import java.util.UUID;

/**
 * @author szs
 * @date 2019/1/7 20:28
 */
@Api("Neo4j相关操作")
@RestController
@RequestMapping("neo4j")
public class Neo4jController {

    @Autowired
    private INeo4jService neo4jService;

    @Autowired
    private CoderNodeRepository coderNodeRepository;

    @PostMapping("user")
    public List<UserNode> createUserNode(@ApiParam("参数") UserNode userNode) {
        userNode.setUserId(UUID.randomUUID().toString());
        return neo4jService.createUserNode(userNode);
    }

    @PostMapping("findAll")
    public Iterable<UserNode> findAll() {
        return neo4jService.findAll();
    }

    @PostMapping("findByName")
    public Iterable<UserNode> findByName(String name) {
        return neo4jService.findByName(name);
    }

    @PostMapping("saveCoder")
    public CoderNode saveCoder(@RequestBody CoderNode coderNode) {
        return coderNodeRepository.save(coderNode);
    }
}
