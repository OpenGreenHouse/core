package de.opengreenhouse.core.service.elastic;

import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.support.WriteRequest;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Service
public class IndexManagerImpl implements IndexManager {

    public IndexRequest getIndexRequest(String indexName) {

        return new IndexRequest(indexName + "-" + getDate())
                .id(UUID.randomUUID().toString())
                .setRefreshPolicy(WriteRequest.RefreshPolicy.IMMEDIATE);
    }

    private String getDate() {
        String pattern = "yyyy.MM.dd";

        // Create an instance of SimpleDateFormat used for formatting
        // the string representation of date according to the chosen pattern
        DateFormat df = new SimpleDateFormat(pattern);

        // Get the today date using Calendar object.
        Date today = Calendar.getInstance().getTime();

        // Using DateFormat format method we can create a string
        // representation of a date with the defined format.
        return df.format(today);
    }

}
