package com.javatechie.travis.api;

public interface UserHistoryService {

    Iterable<UserHistory> listAll();

    void add(String answer, String request);
}
