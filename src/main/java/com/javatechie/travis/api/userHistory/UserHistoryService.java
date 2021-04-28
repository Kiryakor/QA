package com.javatechie.travis.api.userHistory;

import com.javatechie.travis.api.userHistory.UserHistory;

public interface UserHistoryService {

    Iterable<UserHistory> listAll();

    UserHistory add(String answer);
}
