package in.keepgrowing.springboottypesafeuserroles.example.adapters.driving.api.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
class ExampleControllerTest {

    @Autowired
    private ExampleController controller;

    @Autowired
    private MockMvc mvc;

    @Test
    void contextLoads() {
        assertNotNull(controller);
    }

    @Test
    void shouldCallGetEndpoint() throws Exception {
        mvc.perform(get("/example").contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }
}