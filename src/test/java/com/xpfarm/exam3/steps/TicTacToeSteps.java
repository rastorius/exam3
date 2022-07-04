package com.xpfarm.exam3.steps;

import com.xpfarm.exam3.service.TicTacToeService;
import com.xpfarm.exam3.service.TicTacToeServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeSteps {
    static final String eol = System.lineSeparator();
    String output;
    TicTacToeService ticTacToeService;

    @Given("new tic-tact-toe service")
    public void givenNewTicTacToeService() {
        ticTacToeService = new TicTacToeServiceImpl();
    }

    @When("initialize")
    public void whenExecuteInit() {
        output = ticTacToeService.init();
    }

    @Then("should show empty board")
    public void shouldShowEmptyBoard() {
        String expectedOutput = " | | " + eol
                + "-+-+-" + eol
                + " | | " + eol
                + "-+-+-" + eol
                + " | | " + eol;
        assertThat(output).isEqualTo(expectedOutput);
    }
}
