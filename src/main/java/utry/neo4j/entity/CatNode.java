package utry.neo4j.entity;

import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;

/**
 * @author szs
 * @date 2019/1/8 21:53
 */
@NodeEntity
@Data
public class CatNode extends BaseNode {
    private String color;
}
