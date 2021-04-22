package com.javatechie.travis.api;

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
    @Column(name = "UserHistory_HistoryId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "UserHistory_Answer")
    private String answer;

    @Column(name = "UserHistory_Request")
    private String request;

}
