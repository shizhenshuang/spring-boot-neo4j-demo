package utry.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;


/**
 * @author szs
 * @date 2019/1/7 20:31
 */
@NodeEntity
@Data
public class UserNode extends BaseNode {
    @Property
    private String userId;
    @Property
    private String name;
    @Property
    private Integer age;
}
