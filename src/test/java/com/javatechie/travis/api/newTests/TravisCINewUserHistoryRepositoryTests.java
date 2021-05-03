package com.javatechie.travis.api.newTests;

import com.javatechie.travis.api.userHistory.UserHistory;
import com.javatechie.travis.api.userHistory.UserHistoryRepository;
import org.junit.Assert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TravisCINewUserHistoryRepositoryTests {

    @org.junit.jupiter.api.Test
    void action_1() {
        UserHistoryRepository userHistoryRepository = new UserHistoryRepository();
        userHistoryRepository.save(new UserHistory("7+6", "13"));

        try {
            List<String> readFiles = readFile();

            String anser = "7+6" + "\t" + "13";
            String wrilteLase = readFiles.get(readFiles.size() - 1);
            readFiles.remove(readFiles.size() - 1);
            write(readFiles);
            Assert.assertEquals(wrilteLase, anser);
        } catch (IOException e){}
    }

    @org.junit.jupiter.api.Test
    void action_2() {
        UserHistoryRepository userHistoryRepository = new UserHistoryRepository();
        userHistoryRepository.save(new UserHistory("5+6", "11"));

        try {
            List<String> readFiles = readFile();

            String anser = "5+6" + "\t" + "11";
            String wrilteLase = readFiles.get(readFiles.size() - 1);
            readFiles.remove(readFiles.size() - 1);
            write(readFiles);
            Assert.assertEquals(wrilteLase, anser);
        } catch (IOException e){}
    }

    private List<String> readFile() throws IOException {
        return Files.readAllLines(Paths.get("file.txt"), StandardCharsets.UTF_8);
    }

    private void write(List<String> readFiles) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
            for(String str : readFiles) {
                writer.write(str);
                writer.write(System.getProperty("line.separator"));
            }

            writer.close();
        } catch (IOException e) {
        }
    }

}
