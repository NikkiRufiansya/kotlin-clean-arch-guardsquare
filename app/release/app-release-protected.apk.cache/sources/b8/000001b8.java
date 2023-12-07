package o;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import o.FirebasePerfRegistrar;

/* loaded from: classes.dex */
class FirebasePerfRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 extends FirebasePerfRegistrar.setIconTintList {
    final WindowInsetsController MenuHostHelper$$ExternalSyntheticLambda0;
    protected Window MenuHostHelper$$ExternalSyntheticLambda1;
    final FirebasePerfRegistrar setIconTintList;
    private final setDividerHeight<Object, WindowInsetsController.OnControllableInsetsChangedListener> setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FirebasePerfRegistrar$MenuHostHelper$$ExternalSyntheticLambda1(android.view.Window r2, o.FirebasePerfRegistrar r3) {
        /*
            r1 = this;
            android.view.WindowInsetsController r0 = androidx.core.view.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m(r2)
            r1.<init>(r0, r3)
            r1.MenuHostHelper$$ExternalSyntheticLambda1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.FirebasePerfRegistrar$MenuHostHelper$$ExternalSyntheticLambda1.<init>(android.view.Window, o.FirebasePerfRegistrar):void");
    }

    FirebasePerfRegistrar$MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsController windowInsetsController, FirebasePerfRegistrar firebasePerfRegistrar) {
        this.setX = new setDividerHeight<>();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = windowInsetsController;
        this.setIconTintList = firebasePerfRegistrar;
    }

    @Override // o.FirebasePerfRegistrar.setIconTintList
    public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        int systemBarsAppearance;
        systemBarsAppearance = this.MenuHostHelper$$ExternalSyntheticLambda0.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // o.FirebasePerfRegistrar.setIconTintList
    public void setIconTintList(boolean z) {
        if (z) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                MenuHostHelper$$ExternalSyntheticLambda1(8192);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setSystemBarsAppearance(8, 8);
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            setX(8192);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setSystemBarsAppearance(0, 8);
    }

    @Override // o.FirebasePerfRegistrar.setIconTintList
    public void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        if (z) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                MenuHostHelper$$ExternalSyntheticLambda1(16);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setSystemBarsAppearance(16, 16);
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            setX(16);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setSystemBarsAppearance(0, 16);
    }

    protected void setX(int i) {
        View decorView = this.MenuHostHelper$$ExternalSyntheticLambda1.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    protected void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        View decorView = this.MenuHostHelper$$ExternalSyntheticLambda1.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }
}