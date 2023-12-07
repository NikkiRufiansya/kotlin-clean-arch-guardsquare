package o;

import javax.annotation.Nonnull;
import o.C0166ft;

/* loaded from: classes.dex */
public final class fB extends C0166ft {
    public final int setIconTintList;

    public fB(int i, String str) {
        super(str);
        this.setIconTintList = i;
    }

    public fB(int i, String str, Throwable th) {
        super(str, th);
        this.setIconTintList = i;
    }

    public fB(String str, @Nonnull C0166ft.setIconTintList seticontintlist) {
        super(str, seticontintlist);
        this.setIconTintList = -1;
    }

    public fB(int i, String str, @Nonnull C0166ft.setIconTintList seticontintlist) {
        super(str, seticontintlist);
        this.setIconTintList = i;
    }
}