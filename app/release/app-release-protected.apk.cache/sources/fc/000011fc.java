package o;

import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public final class vP$MenuHostHelper$$ExternalSyntheticLambda1 implements Closeable {
    public final String MenuHostHelper$$ExternalSyntheticLambda0;
    public final long MenuHostHelper$$ExternalSyntheticLambda1;
    public final List<xJ> setIconTintList;
    private final long[] setX;
    public final /* synthetic */ vP setY;

    /* JADX WARN: Multi-variable type inference failed */
    public vP$MenuHostHelper$$ExternalSyntheticLambda1(vP vPVar, String str, long j, List<? extends xJ> list, long[] jArr) {
        pN.setY(str, "");
        pN.setY(list, "");
        pN.setY(jArr, "");
        this.setY = vPVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
        this.setIconTintList = list;
        this.setX = jArr;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (xJ xJVar : this.setIconTintList) {
            vL.MenuHostHelper$$ExternalSyntheticLambda1(xJVar);
        }
    }
}