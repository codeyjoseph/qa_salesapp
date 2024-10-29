package org.lbg.c4;

public abstract class MsgReader {
    protected ICustomPrompt itsPrompt;

    public MsgReader( ICustomPrompt cp ) {
        itsPrompt = cp;
    }

}
