package com.javatechie.travis.api.userHistory;

import com.javatechie.travis.api.parser.MyParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class UserHistoryServiceImp implements UserHistoryService {

    @Autowired
    private UserHistoryRepository userHistoryRepository;
    MyParser myParser = new MyParser();

    @Override
    public Iterable<UserHistory> listAll() {
        return userHistoryRepository.findAll();
    }

    @Override
    public UserHistory add(String answer) {
        String request = myParser.action(answer);
        return userHistoryRepository.save(new UserHistory(answer, request));
    }
}