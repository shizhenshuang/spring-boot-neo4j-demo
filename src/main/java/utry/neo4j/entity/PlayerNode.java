package utry.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author szs
 * @date 2019/1/8 21:56
 */
@Data
@NodeEntity
public class PlayerNode extends BaseNode {
    private Integer height;
    private String location;
}
