package de.opengreenhouse.core.elastic;

import de.opengreenhouse.core.service.elastic.IndexManager;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentBuilder;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;

@Service
public class ElasticSendDemo {

    @Autowired
    private IndexManager indexManager;

    @Autowired
    private RestHighLevelClient highLevelClient;

    public int testElastic() throws IOException {

        XContentBuilder builder = XContentFactory.jsonBuilder();
        builder.startObject();
        {
            builder.field("plant.name", "Tomato1");
            builder.field("plant.type", "Tomato");
            builder.field("plant.sensor.light", Math.random() * 10);
            builder.timeField("plant.timestamp", new Date());
        }
        builder.endObject();

        IndexRequest request = indexManager.getIndexRequest("plant");
        request = request.source(builder);

        IndexResponse response = highLevelClient.index(request, RequestOptions.DEFAULT);

        return response.status().getStatus();
    }
}
