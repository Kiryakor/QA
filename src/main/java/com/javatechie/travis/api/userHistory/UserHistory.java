package com.javatechie.travis.api.userHistory;

public class UserHistory {

    public UserHistory(String answer, String request) {
        this.answer = answer;
        this.request = request;
    }

    public UserHistory(){}

    private String answer;

    private String request;

    public String getAnswer() {
        return answer;
    }

    public String getRequest() {
        return request;
    }
}
