package org.lbg.c4;

import java.io.InputStream;
import java.util.Scanner;

public class DoubleReader extends MsgReader implements IElementReader {
    private String prpt;
    public DoubleReader(ICustomPrompt prompt) {
        super(prompt);
    }

    @Override
    public Double readFromKeyboard(InputStream is) {
        Scanner sc = new Scanner(is);
        itsPrompt.prompt(prpt);
        Double dub = sc.nextDouble();
        return dub;
    }
    public void setPrpt(String prpt) {
        this.prpt = prpt;
    }
}
