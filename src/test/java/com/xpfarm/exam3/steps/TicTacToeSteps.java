package com.xpfarm.exam3.steps;

import com.xpfarm.exam3.service.TicTacToeService;
import com.xpfarm.exam3.service.TicTacToeServiceImpl;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeSteps {
    static final String EOL = System.lineSeparator();
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
        String expectedOutput = " | | " + EOL
                + "-+-+-" + EOL
                + " | | " + EOL
                + "-+-+-" + EOL
                + " | | " + EOL;
        assertThat(output).contains(expectedOutput);
    }

    @Then("should show board creation messages")
    public void shouldShowBoardCreationMessages() {
        String expectedOutput1 = "Game Board Creation..." + EOL;
        String expectedOutput2 = "Board Created." + EOL
                + "The game will start with player X" + EOL;
        assertThat(output).contains(expectedOutput1);
        assertThat(output).contains(expectedOutput2);
    }
}
