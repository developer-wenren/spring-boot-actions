package com.one.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WebApplicationTests {

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(new WebApplication()).build();
    }

    @Test
    public void contextLoads() {
    }

    @Test
    public void saveUsers() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/web/saveUser")
                .param("name", "")
                .param("age", "666")
                .param("pass", "test"));
    }
}
