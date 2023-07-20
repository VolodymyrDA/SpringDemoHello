package org.springdemo;

import org.junit.jupiter.api.Test;
import org.springdemo.controller.HelloController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class ProjectTest {
    @Autowired
    private HelloController helloController;

    @Test
    void shouldLoadContext() {
        assertThat(helloController).isNotNull();
    }
}
