package de.opengreenhouse.core.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(method = RequestMethod.GET, path = "/", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String test() {
        return "Hello World";
    }

}
