package com.javatechie.travis.api;

import org.springframework.stereotype.Service;

import java.util.LinkedList;

@Service
public class UserHistoryServiceImp implements UserHistoryService {

    LinkedList<UserHistory> userHistory = new LinkedList<>();

    @Override
    public Iterable<UserHistory> listAll() {
        return userHistory;
    }

    @Override
    public void add(String answer, String request) {
        userHistory.add(new UserHistory(answer,request));
    }
}