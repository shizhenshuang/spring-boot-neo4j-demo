package neo4j;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import utry.App;
import utry.neo4j.entity.UserNode;
import utry.neo4j.repository.UserRepository;

import javax.annotation.Resource;

/**
 * @author szs
 * @date 2019/1/8 14:42
 */
public class UserRepositoryTest extends BaseTest {

    @Resource
    private UserRepository userRepository;

    @Test
    public void saveTest() {
        UserNode userNode = new UserNode();
        userNode.setUserId("2");
        userNode.setName("123");
        System.out.println(userRepository.save(userNode));
    }

    @Test
    public void queryTest() {
        System.out.println(userRepository.findAll());
    }

    @Test
    public void findByName() {
        System.out.println(userRepository.findByName("123"));
    }

    @Test
    public void deleteByNodeId() {
        userRepository.delete(169);
    }

    @Test
    public void deleteByName() {
        userRepository.deleteByName("123");
    }

    @Test
    public void update() {
        System.out.println(userRepository.updateByUserId("1", "old"));
    }
}
