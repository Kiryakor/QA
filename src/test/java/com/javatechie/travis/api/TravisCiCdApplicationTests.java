package com.javatechie.travis.api;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(TravisCiCdApplication.class)
@RunWith(SpringRunner.class)
class TravisCiCdApplicationTests {
    @Autowired
    private MockMvc mockMvc;

    @Test
	public void testWelcome() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk());
	}

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
