package o;

import android.content.res.Resources;

/* loaded from: classes.dex */
public final class nA {
    public static final nA MenuHostHelper$$ExternalSyntheticLambda0 = new nA();

    public static float setX(float f) {
        return f / 2.0f;
    }

    private nA() {
    }

    public static final int setX() {
        Resources system = Resources.getSystem();
        pN.setIconTintList(system, "");
        return (int) ((system.getDisplayMetrics().density * 8.0f) + 0.5f);
    }

    public static float MenuHostHelper$$ExternalSyntheticLambda0(C0337ny c0337ny, float f, int i) {
        pN.setX(c0337ny, "");
        return (f / 2.0f) + ((c0337ny.setOnLongClickListener + c0337ny.ViewPager$SavedState$1) * i);
    }
}