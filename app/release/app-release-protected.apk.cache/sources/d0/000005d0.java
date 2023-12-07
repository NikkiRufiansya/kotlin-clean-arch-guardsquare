package o;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: o.ht  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0221ht {
    public static gV setX(hP hPVar) {
        boolean z;
        try {
            try {
                hPVar.setCenterIfNoTextEnabled();
                z = false;
                try {
                    return hI.setTextScaleX.setX(hPVar);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return gW.setY;
                    }
                    throw new C0203hb(e);
                }
            } catch (NumberFormatException e2) {
                throw new C0203hb(e2);
            } catch (hW e3) {
                throw new C0203hb(e3);
            } catch (IOException e4) {
                throw new gY(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }
}