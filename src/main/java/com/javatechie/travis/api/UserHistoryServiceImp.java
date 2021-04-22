package com.javatechie.travis.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserHistoryServiceImp implements UserHistoryService {

    @Autowired
    private UserHistoryRepository userHistoryRepository;

    @Override
    public Iterable<UserHistory> listAll() {
        return userHistoryRepository.findAll();
    }

    @Override
    public UserHistory add(String answer, String request) {
        return userHistoryRepository.save(new UserHistory(answer,request));
    }

    @Override
    public void delete(Integer id) {
        userHistoryRepository.deleteById(id);
    }
}