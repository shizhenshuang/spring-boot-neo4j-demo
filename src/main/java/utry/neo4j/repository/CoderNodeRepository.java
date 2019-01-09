package utry.neo4j.repository;

import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import utry.neo4j.entity.CoderNode;

/**
 * @author szs
 * @date 2019/1/8 22:03
 */
@Repository
public interface CoderNodeRepository extends GraphRepository<CoderNode> {
}
