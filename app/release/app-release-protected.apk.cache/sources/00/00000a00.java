package o;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class setChildDivider {
    private final setFillViewport MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean setIconTintList;
    public final setCompoundDrawablePadding setX;

    static {
        new setX((byte) 0);
    }

    public /* synthetic */ setChildDivider(setFillViewport setfillviewport, byte b) {
        this(setfillviewport);
    }

    private setChildDivider(setFillViewport setfillviewport) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setfillviewport;
        this.setX = new setCompoundDrawablePadding();
    }

    public final setCompoundDrawablePadding MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setX;
    }

    public final void setX() {
        registerIn MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda1, "");
        if (!(MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0() == registerIn$MenuHostHelper$$ExternalSyntheticLambda1.INITIALIZED)) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
        }
        MenuHostHelper$$ExternalSyntheticLambda1.setY(new androidx.savedstate.Recreator(this.MenuHostHelper$$ExternalSyntheticLambda0));
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1);
        this.setIconTintList = true;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(Bundle bundle) {
        if (!this.setIconTintList) {
            setX();
        }
        registerIn MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) MenuHostHelper$$ExternalSyntheticLambda1, "");
        if (!(!(MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0().compareTo(registerIn$MenuHostHelper$$ExternalSyntheticLambda1.STARTED) >= 0))) {
            StringBuilder sb = new StringBuilder("performRestore cannot be called when owner is ");
            sb.append(MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0());
            throw new IllegalStateException(sb.toString().toString());
        }
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(bundle);
    }

    public final void setY(Bundle bundle) {
        pN.setY(bundle, "");
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
    }

    /* loaded from: classes.dex */
    public static final class setX {
        public /* synthetic */ setX(byte b) {
            this();
        }

        private setX() {
        }
    }

    public static final setChildDivider MenuHostHelper$$ExternalSyntheticLambda1(setFillViewport setfillviewport) {
        pN.setY(setfillviewport, "");
        return new setChildDivider(setfillviewport, (byte) 0);
    }
}