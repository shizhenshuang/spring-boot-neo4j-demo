package neo4j;

import org.junit.Test;
import org.neo4j.ogm.session.SessionFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.data.geo.Distance;
import org.springframework.data.geo.Point;
import utry.neo4j.entity.CoderNode;
import utry.neo4j.entity.UserNode;
import utry.neo4j.repository.CoderNodeRepository;

import javax.annotation.Resource;

/**
 * @author szs
 * @date 2019/1/9 9:24
 */
public class CoderRepositoryTest extends BaseTest {

    @Resource
    private CoderNodeRepository coderNodeRepository;

    @Test
    public void findAllTest() {
        Iterable<CoderNode> coderNodeRepositoryAll = coderNodeRepository.findAll();
        System.out.println(coderNodeRepositoryAll);
    }

}
