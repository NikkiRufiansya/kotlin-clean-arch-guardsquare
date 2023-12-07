package o;

import android.util.Log;

/* renamed from: o.do  reason: invalid class name */
/* loaded from: classes.dex */
public class Cdo {
    private static Cdo setX;

    public static Cdo MenuHostHelper$$ExternalSyntheticLambda1() {
        Cdo cdo;
        synchronized (Cdo.class) {
            if (setX == null) {
                setX = new Cdo();
            }
            cdo = setX;
        }
        return cdo;
    }

    public static void setIconTintList(String str) {
        Log.d("FirebasePerformance", str);
    }

    public static void setX(String str) {
        Log.w("FirebasePerformance", str);
    }

    public static void setY(String str) {
        Log.e("FirebasePerformance", str);
    }

    private Cdo() {
    }
}