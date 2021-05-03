package com.javatechie.travis.api.newTests;

import com.javatechie.travis.api.SimpleGUI;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.Assert;

class TravisCINewTests {

    @org.junit.jupiter.api.Test
    void simpleTest() {
        SimpleGUI frame = GuiActionRunner.execute(() -> new SimpleGUI());
        FrameFixture window = new FrameFixture(frame);
        window.show();

        window.textBox().enterText("5+5+1-2");
        window.button("actionButton").click();
        Assert.assertEquals("9", window.label().text());
        window.cleanUp();
    }

    @org.junit.jupiter.api.Test
    void simpleTest2() {
        SimpleGUI frame = GuiActionRunner.execute(() -> new SimpleGUI());
        FrameFixture window = new FrameFixture(frame);
        window.show();

        window.textBox().enterText("5+1-2");
        window.button("actionButton").click();
        Assert.assertEquals("4", window.label().text());
        window.cleanUp();
    }

    @org.junit.jupiter.api.Test
    void simpleTest3() {
        SimpleGUI frame = GuiActionRunner.execute(() -> new SimpleGUI());
        FrameFixture window = new FrameFixture(frame);
        window.show();

        window.textBox().enterText("+1-2");
        window.button("actionButton").click();
        Assert.assertEquals("Не вырные входные данные", window.label().text());
        window.cleanUp();
    }

    @org.junit.jupiter.api.Test
    void simpleTest4() {
        SimpleGUI frame = GuiActionRunner.execute(() -> new SimpleGUI());
        FrameFixture window = new FrameFixture(frame);
        window.show();

        window.textBox().enterText("1^2");
        window.button("actionButton").click();
        Assert.assertEquals("Не вырные входные данные", window.label().text());
        window.cleanUp();
    }
}

