package com.xpfarm.exam3.controller;


import com.xpfarm.exam3.service.TicTacToeService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bot-game")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
class TicTacToeController {
    TicTacToeService ticTacToeService;

    @GetMapping
    public String botGame() {
        return ticTacToeService.playBotGame();
    }
}
