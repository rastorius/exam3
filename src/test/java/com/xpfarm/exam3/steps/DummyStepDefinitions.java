package com.xpfarm.exam3.steps;

import com.xpfarm.exam3.service.DummyService;
import com.xpfarm.exam3.service.DummyServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import static org.assertj.core.api.Assertions.assertThat;

@FieldDefaults(level = AccessLevel.PRIVATE)
@RequiredArgsConstructor
public class DummyStepDefinitions {
    String actual;
    DummyService dummyService;

    @Given("DummyService")
    public void givenDummyService() {
        dummyService = new DummyServiceImpl();
    }

    @When("hello")
    public void whenExecuteGet() {
        actual = dummyService.hello();
    }

    @Then("should return {}")
    public void shouldHavePropertyWithIntValue(String expected) {
        assertThat(actual).isEqualTo(expected);
    }
}
