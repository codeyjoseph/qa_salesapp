package org.lbg.c4;

public class FunnyPrompt implements ICustomPrompt {
    public void prompt(String msg)
    {
        System.out.print(getPrompt(msg));
    }

    public String getPrompt(String msg) {
        return "lol10-" + msg + "-lol: ";
    }
}
