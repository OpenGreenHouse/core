package de.opengreenhouse.core.config;

import de.opengreenhouse.core.config.property.ElasticProperties;
import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigElastic {

    @Autowired
    private ElasticProperties elasticProperties;

    @Bean
    public RestHighLevelClient client() {

        return new RestHighLevelClient(
                RestClient.builder(
                        new HttpHost(elasticProperties.getHost(), elasticProperties.getPort(), elasticProperties.getSchema())
                ));
    }

}
