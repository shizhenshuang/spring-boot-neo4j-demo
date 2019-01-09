package utry.neo4j.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author szs
 * @date 2019/1/7 20:42
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "utry.neo4j.repository")
@EnableTransactionManagement
@EntityScan(basePackages = "utry.neo4j.entity")
public class Neo4jConfig {
}
