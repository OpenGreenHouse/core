package de.opengreenhouse.core.service.elastic;

import org.elasticsearch.action.index.IndexRequest;

public interface IndexManager {

    public IndexRequest getIndexRequest(String indexName);

}
