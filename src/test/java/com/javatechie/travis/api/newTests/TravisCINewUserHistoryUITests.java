package com.javatechie.travis.api.newTests;

import com.javatechie.travis.api.SimpleGUI;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.Assert;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TravisCINewUserHistoryUITests {

    @org.junit.jupiter.api.Test
    void simpleTest() throws IOException {
        List<String> content = readFile();
        SimpleGUI frame = GuiActionRunner.execute(() -> new SimpleGUI());
        FrameFixture window = new FrameFixture(frame);
        window.show();

        window.textBox().enterText("5+5+1-2");
        window.button("actionButton").click();
        String[][] contents = window.table().contents();

        Assert.assertEquals(contents.length, readFile().size());
        write(content);
        window.cleanUp();
    }

    @org.junit.jupiter.api.Test
    void simpleTest2() throws IOException {
        List<String> content = readFile();
        SimpleGUI frame = GuiActionRunner.execute(() -> new SimpleGUI());
        FrameFixture window = new FrameFixture(frame);
        window.show();

        window.textBox().enterText("5+1");
        window.button("actionButton").click();
        String[][] contents = window.table().contents();

        Assert.assertEquals(contents.length, readFile().size());
        write(content);
        window.cleanUp();
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
