package com.javatechie.travis.api.userHistory;

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

    @RequestMapping(value = "/{answer}", method = RequestMethod.POST)
    public ResponseEntity<Object> add(@PathVariable("answer") String answer) {
        return ResponseEntity.ok(userHistoryService.add(answer));
    }
}
