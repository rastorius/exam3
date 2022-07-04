package com.xpfarm.exam3.service;

import com.xpfarm.exam3.helper.Bot;
import org.springframework.stereotype.Service;

@Service
public class TicTacToeServiceImpl implements TicTacToeService {
    @Override
    public String playBotGame() {
        Bot bot = new Bot();
        return bot.play();
    }
}
