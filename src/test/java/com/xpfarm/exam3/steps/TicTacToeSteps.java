package com.xpfarm.exam3.steps;

import com.xpfarm.exam3.helper.Bot;
import com.xpfarm.exam3.helper.Game;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TicTacToeSteps {
    static final String EOL = System.lineSeparator();
    String output;
    Game game;

    Bot bot;

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

    @Given("new game")
    public void givenNewGame() {
        game = new Game();
    }

    @When("initialize")
    public void whenExecuteInit() {
        output = game.init();
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
        game = new Game();
        game.init();
    }

    @When("step to [{int},{int}]")
    public void whenStepTo(int x, int y) {
        output = game.step(x, y);
    }

    @Then("should show board")
    public void thenShouldShowBoard(DataTable table) {
        String expectedOutput = convertToBoardOutput(table);
        assertThat(output).contains(expectedOutput);
    }

    @Then("should show step header with {}")
    public void thenShouldShowStepHeaderWith(String player) {
        String expectedOutput = "Player " + player + ":" + EOL;
        assertThat(output).contains(expectedOutput);
    }

    @Then("should show win with {}")
    public void thenShouldShowWinWith(String player) {
        String expectedOutput = "PLAYER " + player + " WON!" + EOL;
        assertThat(output).contains(expectedOutput);
    }

    @Then("should show draw")
    public void thenShouldShowDraw() {
        String expectedOutput = "GAME ENDS WITH A DRAW!" + EOL;
        assertThat(output).contains(expectedOutput);
    }

    @Given("new bot")
    public void givenNewBot() {
        bot = new Bot();
    }

    @When("play")
    public void whenPlay() {
        output = bot.play();
    }

    @Then("should show valid end message")
    public void thenShouldShowValidEndMessage() {
        assertThat(output).containsAnyOf(
                "Player X:" + EOL,
                "Player O:" + EOL,
                "GAME ENDS WITH A DRAW!" + EOL
        );
    }
}
