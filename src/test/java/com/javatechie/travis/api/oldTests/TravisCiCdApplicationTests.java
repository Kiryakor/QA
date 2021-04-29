package com.javatechie.travis.api.oldTests;

import com.javatechie.travis.api.parser.MyParser;
import org.junit.Assert;

class TravisCiCdApplicationTests {

    @org.junit.jupiter.api.Test
    void action_1(){
        String line = MyParser.action("5+5*1-2");
        Assert.assertEquals("8",line);
    }

    @org.junit.jupiter.api.Test
    void action_2(){
        String line = MyParser.action("5+1*2");
        Assert.assertEquals("7",line);
    }

    @org.junit.jupiter.api.Test
    void action_3(){
        String line = MyParser.action("5/4");
        Assert.assertEquals("1",line);
    }

    @org.junit.jupiter.api.Test
    void action_4(){
        String line = MyParser.action("+5");
        Assert.assertEquals("Не вырные входные данные",line);
    }

    @org.junit.jupiter.api.Test
    void action_5(){
        String line = MyParser.action("5^2");
        Assert.assertEquals("Не вырные входные данные",line);
    }

    @org.junit.jupiter.api.Test
    void action_6(){
        String line = MyParser.action("-5+2");
        Assert.assertEquals("Не вырные входные данные",line);
    }
}
