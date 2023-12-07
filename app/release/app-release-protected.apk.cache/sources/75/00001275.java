package o;

import java.io.IOException;

/* loaded from: classes.dex */
public final class wC$MenuHostHelper$$ExternalSyntheticLambda0 {
    private wC$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    public /* synthetic */ wC$MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
        this();
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        StringBuilder sb = new StringBuilder("PROTOCOL_ERROR padding ");
        sb.append(i3);
        sb.append(" > remaining length ");
        sb.append(i);
        throw new IOException(sb.toString());
    }
}