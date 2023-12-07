package o;

/* renamed from: o.dm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0106dm {
    private static volatile C0106dm setY;
    public boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public final Cdo MenuHostHelper$$ExternalSyntheticLambda1;

    public static C0106dm setY() {
        if (setY == null) {
            synchronized (C0106dm.class) {
                if (setY == null) {
                    setY = new C0106dm();
                }
            }
        }
        return setY;
    }

    private C0106dm(byte b) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = Cdo.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    private C0106dm() {
        this((byte) 0);
    }
}