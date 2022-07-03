package com.xpfarm.exam3.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DummyServiceTest {
    @Test
    @DisplayName("GIVEN dummy service WHEN hello THEN should return 'Hello World!'")
    void shouldReturnHelloWorld() {
        // given
        DummyService dummyService = new DummyServiceImpl();
        String expectedResult = "Hello World!";

        // when
        String actualResult = dummyService.hello();

        // then
        assertThat(actualResult).isEqualTo(expectedResult);
    }
}
