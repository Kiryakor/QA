package com.javatechie.travis.api.userHistory;

import lombok.AllArgsConstructor;
import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "UserHistory")
@Data
@AllArgsConstructor
public class UserHistory {

    public UserHistory(String answer, String request) {
        this.answer = answer;
        this.request = request;
    }

    public UserHistory(){}

    @Id
    @Column(name = "UserHistory_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "UserHistory_ANSWER")
    private String answer;

    @Column(name = "UserHistory_REQUEST")
    private String request;

}
