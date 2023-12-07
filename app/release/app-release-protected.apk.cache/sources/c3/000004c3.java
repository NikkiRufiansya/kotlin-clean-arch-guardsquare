package o;

import java.io.IOException;
import java.io.StringWriter;

/* loaded from: classes.dex */
public abstract class gV {
    public boolean setIconTintList() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public Number MenuHostHelper$$ExternalSyntheticLambda0() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String setOnLongClickListener() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double setY() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long MenuHostHelper$$ExternalSyntheticLambda1() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int setX() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            hR hRVar = new hR(stringWriter);
            hRVar.setX = true;
            hI.setTextScaleX.setY(hRVar, this);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final C0202ha setUnboundedRipple() {
        if (this instanceof C0202ha) {
            return (C0202ha) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }
}