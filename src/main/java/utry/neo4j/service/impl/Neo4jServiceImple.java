package utry.neo4j.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utry.neo4j.entity.UserNode;
import utry.neo4j.repository.UserRepository;
import utry.neo4j.service.INeo4jService;

import java.util.List;

/**
 * @author szs
 * @date 2019/1/7 20:29
 */
@Service
public class Neo4jServiceImple implements INeo4jService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserNode> createUserNode(UserNode userNode) {
        return userRepository.createUserNode(userNode.getUserId(), userNode.getName(), userNode.getAge());
    }

    @Override
    public Iterable<UserNode> findAll() {
        Iterable<UserNode> all = userRepository.findAll();
        System.out.println(all);
        return all;
    }

    @Override
    public Iterable<UserNode> findByName(String name) {
        userRepository.findByName(name);
        return null;
    }
}
