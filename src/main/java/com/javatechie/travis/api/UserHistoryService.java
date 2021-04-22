package com.javatechie.travis.api;

public interface UserHistoryService {

    Iterable<UserHistory> listAll();

    UserHistory add(String answer, String request);

    void delete(Integer id);

}
