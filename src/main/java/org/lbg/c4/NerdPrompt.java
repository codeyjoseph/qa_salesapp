package org.lbg.c4;

public class NerdPrompt implements ICustomPrompt {
    public void prompt( String msg )
    {
        System.out.print( "><" + msg + ">< " );
    }
}
