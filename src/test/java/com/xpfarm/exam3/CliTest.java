package com.xpfarm.exam3;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.system.CapturedOutput;
import org.springframework.boot.test.system.OutputCaptureExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(OutputCaptureExtension.class)
class CliTest {
    static final String EOL = System.lineSeparator();

    @Test
    void testLogMessage(CapturedOutput output) {
        String[] args = {"cli"};
        Exam3Application.main(args);
        assertThat(output.getOut()).containsAnyOf(
                "Player X:" + EOL,
                "Player O:" + EOL,
                "GAME ENDS WITH A DRAW!" + EOL
        );
    }
}
