package o;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class wv$MenuHostHelper$$ExternalSyntheticLambda0 implements xJ {
    private /* synthetic */ C0582wv MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;
    private final C0611xv setY;

    public wv$MenuHostHelper$$ExternalSyntheticLambda0(C0582wv c0582wv) {
        InterfaceC0607xr interfaceC0607xr;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0582wv;
        interfaceC0607xr = c0582wv.setX;
        this.setY = new C0611xv(interfaceC0607xr.setX());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconTintList;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setIconTintList = true;
    }

    @Override // o.xJ
    public final xI setX() {
        return this.setY;
    }

    @Override // o.xJ
    public long setY(C0602xo c0602xo, long j) {
        InterfaceC0607xr interfaceC0607xr;
        pN.setY(c0602xo, "");
        try {
            interfaceC0607xr = this.MenuHostHelper$$ExternalSyntheticLambda1.setX;
            return interfaceC0607xr.setY(c0602xo, j);
        } catch (IOException e) {
            C0563wd c0563wd = this.MenuHostHelper$$ExternalSyntheticLambda1.setY;
            synchronized (c0563wd) {
                c0563wd.setLayoutAnimation = true;
                setY();
                throw e;
            }
        }
    }

    public final void setY() {
        int i;
        int i2;
        int i3;
        i = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
        if (i == 6) {
            return;
        }
        i2 = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
        if (i2 != 5) {
            StringBuilder sb = new StringBuilder("state: ");
            i3 = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
            sb.append(i3);
            throw new IllegalStateException(sb.toString());
        }
        C0582wv.setIconTintList(this.setY);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener = 6;
    }
}