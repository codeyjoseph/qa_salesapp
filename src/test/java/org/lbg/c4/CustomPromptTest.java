package org.lbg.c4;

import org.junit.jupiter.api.Test;

import javax.swing.text.html.CSS;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class CustomPromptTest {
    @Test
    public void test_prompt_outputs_square_brackets() {
        CustomPrompt cut = new CustomPrompt();
        String expected = "[enter your message please]: ";
        String actual = cut.getPrompt("enter your message please");
        assertEquals(expected, actual);
    }

    @Test
    public void test_system_out_print_called_once() {
        PrintStream originalOut = System.out;
        PrintStream mockOut = mock(PrintStream.class);
        System.setOut(mockOut);
        CustomPrompt cut = new CustomPrompt();

        cut.prompt("hello world");

        verify(mockOut, times(1)).print("[hello world]: ");
        System.setOut(originalOut);
    }
}
