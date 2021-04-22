package com.javatechie.travis.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public/rest/userHistory")
public class UserHistoryRestService {

    @Autowired
    private UserHistoryService userHistoryService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseEntity<Object> browse() {
        return ResponseEntity.ok(userHistoryService.listAll());
    }

    @RequestMapping(value = "/{answer}/{request}", method = RequestMethod.POST)
    public void add(@PathVariable("answer") String answer,
                                      @PathVariable("request") String request) {
         userHistoryService.add(answer, request);
    }
}
