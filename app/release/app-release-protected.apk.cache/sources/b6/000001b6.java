package o;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class FirebasePerfRegistrar {
    private final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        public void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            return false;
        }

        public void setIconTintList(boolean z) {
        }
    }

    public FirebasePerfRegistrar(Window window, View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new FirebasePerfRegistrar$MenuHostHelper$$ExternalSyntheticLambda1(window, this);
        } else if (Build.VERSION.SDK_INT >= 26) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setX(window, view) { // from class: o.FirebasePerfRegistrar$MenuHostHelper$$ExternalSyntheticLambda0
                @Override // o.FirebasePerfRegistrar.setIconTintList
                public void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
                    if (z) {
                        setX(134217728);
                        MenuHostHelper$$ExternalSyntheticLambda0(Integer.MIN_VALUE);
                        setY(16);
                        return;
                    }
                    MenuHostHelper$$ExternalSyntheticLambda1(16);
                }
            };
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setX(window, view);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setY(window, view);
        }
    }

    public final boolean setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public final void setIconTintList(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(z);
    }

    public final void setY(boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(z);
    }

    /* loaded from: classes.dex */
    static class setY extends setIconTintList {
        private final View MenuHostHelper$$ExternalSyntheticLambda0;
        protected final Window setX;

        setY(Window window, View view) {
            this.setX = window;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = view;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void setY(int i) {
            View decorView = this.setX.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
            View decorView = this.setX.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            this.setX.addFlags(i);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void setX(int i) {
            this.setX.clearFlags(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX extends setY {
        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(Window window, View view) {
            super(window, view);
        }

        @Override // o.FirebasePerfRegistrar.setIconTintList
        public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            return (this.setX.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // o.FirebasePerfRegistrar.setIconTintList
        public void setIconTintList(boolean z) {
            if (z) {
                setX(67108864);
                MenuHostHelper$$ExternalSyntheticLambda0(Integer.MIN_VALUE);
                setY(8192);
                return;
            }
            MenuHostHelper$$ExternalSyntheticLambda1(8192);
        }
    }
}