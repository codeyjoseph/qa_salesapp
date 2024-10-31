package org.lbg.c4;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class DoubleReaderTest {
    @Test
    public void verify_read_from_keyboard_prompts_once() {
        FunnyPrompt mockPrompt = mock(FunnyPrompt.class);
        DoubleReader cut = new DoubleReader(mockPrompt);
        cut.setPrpt("hi");
        Scanner sc = mock(Scanner.class);

        when(sc.nextDouble()).thenReturn(10.0);
        cut.readFromKeyboard(sc);

        verify(mockPrompt, times(1)).prompt("hi");
    }
}
