package o;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class sQ extends CancellationException implements rK<sQ> {
    private transient sB setX;

    private sQ(String str, sB sBVar) {
        super(str);
        this.setX = sBVar;
    }

    @Override // o.rK
    public final /* synthetic */ sQ MenuHostHelper$$ExternalSyntheticLambda0() {
        String message = getMessage();
        if (message == null) {
            message = "";
        }
        sQ sQVar = new sQ(message, this.setX);
        sQVar.initCause(this);
        return sQVar;
    }
}