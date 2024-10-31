package org.lbg.c4;

public class CustomPrompt implements ICustomPrompt{
    @Override
    public void prompt(String msg) {
        System.out.print(getPrompt(msg));
    }

    public String getPrompt(String msg) {
        return "[" + msg + "]: ";
    }
}
