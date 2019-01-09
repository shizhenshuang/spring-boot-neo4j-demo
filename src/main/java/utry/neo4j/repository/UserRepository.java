package utry.neo4j.repository;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import utry.neo4j.entity.UserNode;

import java.util.List;

/**
 * @author szs
 * @date 2019/1/7 20:45
 */
@Repository
public interface UserRepository extends GraphRepository<UserNode> {
    /**
     * 创建节点
     *
     * @param userId 用户id
     * @param name   用户名
     * @param age    用户年龄
     * @return 创建的节点集合
     */
    @Query("create (n:User {userId:{userId}, name:{name}, age:{age}}) return n")
    List<UserNode> createUserNode(@Param("userId") String userId, @Param("name") String name, @Param("age") Integer age);

    /**
     * 通过名称查询（该节点必须有该属性）
     *
     * @param name 名称
     * @return 满足条件的集合
     */
    List<UserNode> findByName(@Param("name") String name);

    /**
     * 通过节点id进行删除
     *
     * @param id 节点id
     */
    void delete(@Param("id") long id);

    /**
     * 通过名字删除
     *
     * @param name 名字
     */
    @Query("match (n:UserNode {name:{name}}) delete n")
    void deleteByName(@Param("name") String name);

    /**
     * 根据userId更新名称
     *
     * @param userId
     * @param name
     * @return 更新之后的节点
     */
    @Query("match (n:UserNode {userId:{userId}}) set n.name={name} return n")
    List<UserNode> updateByUserId(@Param("userId") String userId, @Param("name") String name);

    /**
     * 清空Neo4j数据库
     */
    @Query("match (n) detach delete n")
    void clearNeo4jDB();
}
