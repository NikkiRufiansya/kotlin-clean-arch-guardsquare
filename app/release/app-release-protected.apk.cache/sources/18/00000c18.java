package o;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import o.setChipIconEnabled;

/* loaded from: classes.dex */
public class setHasDecor extends setUnboundedRipple implements setLayoutDirection {
    private final LifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    private setGuidelinePercent setY;

    @Override // o.setLayoutDirection
    public setChipIconEnabled MenuHostHelper$$ExternalSyntheticLambda0(setChipIconEnabled.setY sety) {
        return null;
    }

    @Override // o.setLayoutDirection
    public void MenuHostHelper$$ExternalSyntheticLambda0(setChipIconEnabled setchipiconenabled) {
    }

    @Override // o.setLayoutDirection
    public void setX(setChipIconEnabled setchipiconenabled) {
    }

    public setHasDecor(Context context, int i) {
        super(context, setIconTintList(context, i));
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new LifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.ExtendableSavedState$1
            @Override // o.LifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1
            public final boolean setY(KeyEvent keyEvent) {
                return setHasDecor.this.setY(keyEvent);
            }
        };
        setGuidelinePercent MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList(context, i));
        MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList((Bundle) null);
    }

    @Override // o.setUnboundedRipple, android.app.Dialog
    public void onCreate(Bundle bundle) {
        MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0();
        super.onCreate(bundle);
        MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList(bundle);
    }

    @Override // o.setUnboundedRipple, android.app.Dialog
    public void setContentView(int i) {
        MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    @Override // o.setUnboundedRipple, android.app.Dialog
    public void setContentView(View view) {
        MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0(view);
    }

    @Override // o.setUnboundedRipple, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        MenuHostHelper$$ExternalSyntheticLambda0().setX(view, layoutParams);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) MenuHostHelper$$ExternalSyntheticLambda0().setY(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        MenuHostHelper$$ExternalSyntheticLambda0().setY(charSequence);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        MenuHostHelper$$ExternalSyntheticLambda0().setY(getContext().getString(i));
    }

    @Override // o.setUnboundedRipple, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList(view, layoutParams);
    }

    @Override // o.setUnboundedRipple, android.app.Dialog
    public void onStop() {
        super.onStop();
        MenuHostHelper$$ExternalSyntheticLambda0().setUiOptions();
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        MenuHostHelper$$ExternalSyntheticLambda0().setUnboundedRipple();
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return MenuHostHelper$$ExternalSyntheticLambda0().setIconTintList(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        MenuHostHelper$$ExternalSyntheticLambda0().setNavigationOnClickListener();
    }

    public setGuidelinePercent MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setY == null) {
            this.setY = setGuidelinePercent.MenuHostHelper$$ExternalSyntheticLambda0(this, this);
        }
        return this.setY;
    }

    private static int setIconTintList(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.res_0x7f04014c, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setY(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return LifecycleController$observer$1.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, getWindow().getDecorView(), this, keyEvent);
    }
}