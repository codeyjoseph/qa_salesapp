package org.lbg.c4;

public class FunnyPrompt implements ICustomPrompt {
    public void prompt( String msg )
    {
        System.out.print( "lol-" + msg + "-lol " );
    }
}
