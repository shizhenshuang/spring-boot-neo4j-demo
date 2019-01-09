package utry.neo4j.service;

import utry.neo4j.entity.UserNode;

import java.util.List;

/**
 * @author szs
 * @date 2019/1/7 20:30
 */
public interface INeo4jService {
    /**
     * 创建节点
     *
     * @param userNode 节点
     * @return 创建的节点集合
     */
    List<UserNode> createUserNode(UserNode userNode);

    /**
     * 查询所有
     *
     * @return
     */
    Iterable<UserNode> findAll();

    /**
     * 根据名字查找
     *
     * @return
     */
    Iterable<UserNode> findByName(String name);


}
