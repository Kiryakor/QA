package com.javatechie.travis.api.userHistory;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class UserHistoryRepository {

    public String path = "file.txt";

    public Iterable<UserHistory> findAll() {
        LinkedList<UserHistory> userHistoriesList = new LinkedList<UserHistory>();
        List<String> data;

        try {
            data = readFile();
            for (String std : data) {
                userHistoriesList.add(new UserHistory(std.split("\t")[0],std.split("\t")[1]));
            }
        } catch (IOException e) {
        }

        return userHistoriesList;
    }

    public UserHistory save(UserHistory userHistory){
        try {
            write(userHistory);
        } catch (IOException e) {
        }

        return userHistory;
    }

    private void write(UserHistory userHistory) throws IOException {
        try {
            List<String> readData = readFile();
            readData.add(userHistory.getAnswer() + "\t" + userHistory.getRequest());

            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for(String str : readData) {
                writer.write(str);
                writer.write(System.getProperty("line.separator"));
            }

            writer.close();
        } catch (IOException e) {
        }
    }

    private List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get(path), StandardCharsets.UTF_8);
    }
}