package com.xpfarm.exam3.service;

import com.xpfarm.exam3.helper.Board;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TicTacToeServiceImpl implements TicTacToeService {
    @Override
    public String init() {
        Board board = new Board();
        return board.print();
    }
}
