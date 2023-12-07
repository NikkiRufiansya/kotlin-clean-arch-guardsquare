package o;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class setCloseIconResource {
    public static void setIconTintList(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            setCloseIconResource$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(window, z);
        } else {
            setY.setIconTintList(window, z);
        }
    }

    public static FirebasePerfRegistrar setY(Window window, View view) {
        return new FirebasePerfRegistrar(window, view);
    }

    /* loaded from: classes.dex */
    static class setY {
        static void setIconTintList(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }
}