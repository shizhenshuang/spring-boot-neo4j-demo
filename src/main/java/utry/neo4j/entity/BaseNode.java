package utry.neo4j.entity;

import lombok.Getter;
import lombok.Setter;
import org.neo4j.ogm.annotation.GraphId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;

import java.io.Serializable;

/**
 * @author szs
 * @date 2019/1/8 21:36
 */
@Setter
@Getter
public abstract class BaseNode implements Serializable {
    @Id
    protected Long id;
    protected String name;
}
