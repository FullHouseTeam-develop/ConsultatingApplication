package controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.tinkoff.controllers.UserController;
import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@ContextConfiguration
class UserControllerTest {

    @Autowired
    private UserController controller;

    @Test
    void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }
}
