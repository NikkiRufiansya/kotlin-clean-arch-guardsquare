package o;

import android.graphics.drawable.Drawable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0 extends Drawable.ConstantState {
    setWebViewClient MenuHostHelper$$ExternalSyntheticLambda1;
    boolean setX;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    public setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0(setWebViewClient setwebviewclient) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setwebviewclient;
        this.setX = false;
    }

    public setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0(setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0 setonquerytextlistener_menuhosthelper__externalsyntheticlambda0) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = (setWebViewClient) setonquerytextlistener_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1.getConstantState().newDrawable();
        this.setX = setonquerytextlistener_menuhosthelper__externalsyntheticlambda0.setX;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final /* synthetic */ Drawable newDrawable() {
        return new setOnQueryTextListener(new setOnQueryTextListener$MenuHostHelper$$ExternalSyntheticLambda0(this), (byte) 0);
    }
}