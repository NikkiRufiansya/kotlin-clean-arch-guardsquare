package o;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
public class setCollapseContentDescription extends Activity implements setTouchDelegate, LifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1 {
    private setDividerHeight<Class<? extends Object>, Object> setIconTintList = new setDividerHeight<>();
    private setAdjustViewBounds setX = new setAdjustViewBounds(this);

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentRegistrar.setY(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        setAdjustViewBounds setadjustviewbounds = this.setX;
        registerIn$MenuHostHelper$$ExternalSyntheticLambda1 registerin_menuhosthelper__externalsyntheticlambda1 = registerIn$MenuHostHelper$$ExternalSyntheticLambda1.CREATED;
        setadjustviewbounds.MenuHostHelper$$ExternalSyntheticLambda0("markState");
        setadjustviewbounds.MenuHostHelper$$ExternalSyntheticLambda0(registerin_menuhosthelper__externalsyntheticlambda1);
        super.onSaveInstanceState(bundle);
    }

    public registerIn MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setX;
    }

    @Override // o.LifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1
    public boolean setY(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda0(decorView, keyEvent)) {
            return LifecycleController$observer$1.MenuHostHelper$$ExternalSyntheticLambda0(this, decorView, this, keyEvent);
        }
        return true;
    }
}