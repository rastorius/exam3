package com.xpfarm.exam3.helper;

public class Game {
    Board board;
    MessageGenerator messageGenerator;
    Symbol currentPlayer;
    GameState gameState;

    public String init() {
        board = new Board();
        messageGenerator = new MessageGenerator();
        currentPlayer = Symbol.X;
        gameState = GameState.IN_PROGRESS;
        return messageGenerator.printBoardCreationHeader()
                + board.print()
                + messageGenerator.printBoardCreationFooter();
    }

    public String step(int x, int y) {
        board.mark(x, y, currentPlayer);
        String output = messageGenerator.printStepHeader(currentPlayer) + board.print();

        if (board.isGameEnded()) {
            output += messageGenerator.printWonFooter(currentPlayer);
        } else if (board.isFull()) {
            output += messageGenerator.printDraw();
        } else {
            switchCurrentPlayer();
        }

        return output;
    }

    public GameState getState() {
        return gameState;
    }

    private void switchCurrentPlayer() {
        currentPlayer = currentPlayer == Symbol.X ? Symbol.O : Symbol.X;
    }
}
