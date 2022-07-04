package com.xpfarm.exam3.steps;

import com.xpfarm.exam3.service.TicTacToeService;
import com.xpfarm.exam3.service.TicTacToeServiceImpl;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeSteps {
    static final String EOL = System.lineSeparator();
    String output;
    TicTacToeService ticTacToeService;

    private String convertNullSymbol(String symbol) {
        return symbol == null ? " " : symbol;
    }

    private String convertToBoardOutput(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);
        List<String> symbols = data.get(0);
        return convertNullSymbol(symbols.get(0)) + "|"
                + convertNullSymbol(symbols.get(1)) + "|"
                + convertNullSymbol(symbols.get(2)) + EOL
                + "-+-+-" + EOL
                + convertNullSymbol(symbols.get(3)) + "|"
                + convertNullSymbol(symbols.get(4)) + "|"
                + convertNullSymbol(symbols.get(5)) + EOL
                + "-+-+-" + EOL
                + convertNullSymbol(symbols.get(6)) + "|"
                + convertNullSymbol(symbols.get(7)) + "|"
                + convertNullSymbol(symbols.get(8)) + EOL;
    }

    @Given("new tic-tact-toe service")
    public void givenNewTicTacToeService() {
        ticTacToeService = new TicTacToeServiceImpl();
    }

    @When("initialize")
    public void whenExecuteInit() {
        output = ticTacToeService.init();
    }

    @Then("should show empty board")
    public void thenShouldShowEmptyBoard() {
        String expectedOutput = " | | " + EOL
                + "-+-+-" + EOL
                + " | | " + EOL
                + "-+-+-" + EOL
                + " | | " + EOL;
        assertThat(output).contains(expectedOutput);
    }

    @Then("should show board creation messages")
    public void thenShouldShowBoardCreationMessages() {
        String expectedOutput1 = "Game Board Creation..." + EOL;
        String expectedOutput2 = "Board Created." + EOL
                + "The game will start with player X" + EOL;
        assertThat(output).contains(expectedOutput1);
        assertThat(output).contains(expectedOutput2);
    }

    @Given("new game initialized")
    public void givenNextPlayerIs() {
        ticTacToeService = new TicTacToeServiceImpl();
        ticTacToeService.init();
    }

    @When("step to [{int},{int}]")
    public void whenStepTo(int x, int y) {
        output = ticTacToeService.step(x, y);
    }

    @Then("should show board")
    public void thenShouldShowBoard(DataTable table) {
        String expectedOutput = convertToBoardOutput(table);
        System.out.println(expectedOutput);
        assertThat(output).contains(expectedOutput);
    }
}
