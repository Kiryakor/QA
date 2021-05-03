package com.javatechie.travis.api.userHistory;

public interface UserHistoryService {

    Iterable<UserHistory> listAll();

    UserHistory add(String answer);
}
