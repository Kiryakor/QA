package com.javatechie.travis.api.userHistory;

import com.javatechie.travis.api.parser.MyParser;

public class UserHistoryServiceImp implements UserHistoryService {

    UserHistoryRepository userHistoryRepository = new UserHistoryRepository();
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