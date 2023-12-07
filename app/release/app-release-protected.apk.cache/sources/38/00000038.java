package androidx.core.view;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final /* synthetic */ class WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 {
    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ WindowInsets.Builder m4m() {
        return new WindowInsets.Builder();
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* synthetic */ WindowInsets.Builder m5m(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    public static /* synthetic */ WindowInsetsAnimation m(int i, Interpolator interpolator, long j) {
        return new WindowInsetsAnimation(i, interpolator, j);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation m(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    /* renamed from: m  reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WindowInsetsController.OnControllableInsetsChangedListener m8m(Object obj) {
        return (WindowInsetsController.OnControllableInsetsChangedListener) obj;
    }
}