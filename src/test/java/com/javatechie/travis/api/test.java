package com.javatechie.travis.api;

import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class test {

    private FrameFixture window;

    @Before
    public void setUp() {
        SimpleGUI frame = GuiActionRunner.execute(() -> new SimpleGUI()); window = new FrameFixture(frame);
        window.show();
    }

    @Test
    public void simpleTest() {
        window.textBox().enterText("5+5+1-2");
        window.button("actionButton").click();
        Assert.assertEquals("9", window.label().text());
        window.cleanUp();
    }

    @Test
    public void simpleTest2() {
        window.textBox().enterText("5+5+1-2");
        window.button("actionButton").click();
        Assert.assertEquals("9", window.label().text());
        window.cleanUp();
    }

    @After
    public final void tearDown() {
        window.cleanUp();
    }
}

