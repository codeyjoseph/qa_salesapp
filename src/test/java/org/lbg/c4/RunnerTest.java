package org.lbg.c4;

import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RunnerTest {

    @Test
    public void verify_reader_throws_NSEE_with_wrong_value() {
        DoubleReader mockReader = mock(DoubleReader.class);
        Runner cut = new Runner(mockReader);
        Scanner mockSc = mock(Scanner.class);

        when(mockReader.readFromKeyboard(mockSc)).thenThrow(NoSuchElementException.class);

        assertThrows(NoSuchElementException.class, () -> cut.run(mockSc));
    }
}
