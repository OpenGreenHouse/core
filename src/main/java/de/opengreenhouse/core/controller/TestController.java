package de.opengreenhouse.core.controller;

import de.opengreenhouse.core.elastic.ElasticSendDemo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class TestController {

    @Autowired
    private ElasticSendDemo elasticSendDemo;

    @RequestMapping(method = RequestMethod.GET, path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test() {
        return "Hello World";
    }


    @RequestMapping(method = RequestMethod.GET, path = "/elk", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String testElasticRequest() throws IOException {
        return "Elastic response status: " + elasticSendDemo.testElastic();
    }

}
