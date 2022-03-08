package in.keepgrowing.springboottypesafeuserroles.example.adapters.driving.api.controllers;

import in.keepgrowing.springboottypesafeuserroles.testing.config.ControllerIntegrationTestConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@Import(value = ControllerIntegrationTestConfig.class)
class ExampleControllerTest {

    private static final String PATH = "/" + ExampleControllerPaths.EXAMPLE_PATH;

    @Autowired
    private ExampleController controller;

    @Autowired
    private MockMvc mvc;

    @Test
    void contextLoads() {
        assertNotNull(controller);
    }

    @Test
    @WithMockUser
    void shouldCallGetEndpoint() throws Exception {
        mvc.perform(get(PATH).contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    @WithMockUser(roles = "CHIEF_OPERATING_OFFICER")
    void shouldCallPostEndpoint() throws Exception {
        mvc.perform(post(PATH).contentType(MediaType.APPLICATION_JSON)
                        .with(csrf()))
                .andExpect(status().isOk());
    }

    @Test
    @WithMockUser
    void shouldDenyAccessToPostEndpoint() throws Exception {
        mvc.perform(post(PATH)
                        .with(csrf()))
                .andExpect(status().isForbidden());
    }
}