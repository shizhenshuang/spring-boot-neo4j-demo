package utry.neo4j.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.List;

/**
 * @author szs
 * @date 2019/1/8 21:36
 */
@Data
@NodeEntity
public class CoderNode extends BaseNode {
    private String hobby;
    @Relationship(type = "have")
    @JsonProperty("have")
    private List<CatNode> catNodes;
    @Relationship(type = "like")
    @JsonProperty("like")
    @JsonIgnoreProperties("like")
    private List<PlayerNode> playerNodes;
}


