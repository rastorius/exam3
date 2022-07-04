package com.xpfarm.exam3.service;

import com.xpfarm.exam3.helper.Board;
import com.xpfarm.exam3.helper.MessageGenerator;
import com.xpfarm.exam3.helper.Symbol;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TicTacToeServiceImpl implements TicTacToeService {
    Board board;
    MessageGenerator messageGenerator;
    Symbol currentPlayer;

    @Override
    public String init() {
        board = new Board();
        messageGenerator = new MessageGenerator();
        currentPlayer = Symbol.X;
        return messageGenerator.printBoardCreationHeader()
                + board.print()
                + messageGenerator.printBoardCreationFooter();
    }

    @Override
    public String step(int x, int y) {
        board.mark(x, y, currentPlayer);
        return messageGenerator.printStepHeader(currentPlayer) + board.print();
    }
}
