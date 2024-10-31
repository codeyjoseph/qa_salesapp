package org.lbg.c4;

import org.junit.jupiter.api.Test;

import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class FunnyPromptTest {
    @Test
    public void test_prompt_outputs_square_brackets() {
        FunnyPrompt cut = new FunnyPrompt();
        String expected = "lol-enter your message please-lol: ";
        String actual = cut.getPrompt("enter your message please");
        assertEquals(expected, actual);
    }

    @Test
    public void test_system_out_print_called_once() {
        PrintStream originalOut = System.out;
        PrintStream mockOut = mock(PrintStream.class);
        System.setOut(mockOut);
        FunnyPrompt cut = new FunnyPrompt();

        cut.prompt("hello world");

        verify(mockOut, times(1)).print("lol-hello world-lol: ");
        System.setOut(originalOut);
    }
}
