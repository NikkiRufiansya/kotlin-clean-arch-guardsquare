package o;

import android.content.Context;
import java.io.File;
import o.InterfaceC0541vk;

/* loaded from: classes.dex */
public final class mS implements mL {
    private final C0539vi setIconTintList;
    private boolean setX;
    private InterfaceC0541vk.setY setY;

    public mS(Context context) {
        this(C0321ni.setX(context));
    }

    private mS(File file) {
        this(file, C0321ni.setIconTintList(file));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private mS(java.io.File r3, long r4) {
        /*
            r2 = this;
            o.vD$setIconTintList r0 = new o.vD$setIconTintList
            r0.<init>()
            o.vi r1 = new o.vi
            r1.<init>(r3, r4)
            r3 = r0
            o.vD$setIconTintList r3 = (o.vD.setIconTintList) r3
            r0.setX = r1
            o.vD r3 = new o.vD
            r3.<init>(r0)
            r2.<init>(r3)
            r3 = 0
            r2.setX = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.mS.<init>(java.io.File, long):void");
    }

    private mS(vD vDVar) {
        this.setX = true;
        this.setY = vDVar;
        this.setIconTintList = vDVar.setX;
    }

    @Override // o.mL
    public final vJ setY(vE vEVar) {
        return dE.MenuHostHelper$$ExternalSyntheticLambda0(this.setY.MenuHostHelper$$ExternalSyntheticLambda0(vEVar));
    }
}