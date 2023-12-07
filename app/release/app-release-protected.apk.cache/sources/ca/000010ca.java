package o;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import o.registerIn;

/* loaded from: classes.dex */
public class setUnboundedRipple extends Dialog implements setNavigationOnClickListener {
    private final OnBackPressedDispatcher MenuHostHelper$$ExternalSyntheticLambda1;
    private setAdjustViewBounds setY;

    public static /* synthetic */ void setX(setUnboundedRipple setunboundedripple) {
        setY(setunboundedripple);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setUnboundedRipple(Context context, int i) {
        super(context, i);
        pN.setY(context, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new OnBackPressedDispatcher(new Runnable() { // from class: o.setLayoutAnimation
            @Override // java.lang.Runnable
            public final void run() {
                setUnboundedRipple.setX(setUnboundedRipple.this);
            }
        });
    }

    private final setAdjustViewBounds setY() {
        setAdjustViewBounds setadjustviewbounds = this.setY;
        if (setadjustviewbounds == null) {
            setAdjustViewBounds setadjustviewbounds2 = new setAdjustViewBounds(this);
            this.setY = setadjustviewbounds2;
            return setadjustviewbounds2;
        }
        return setadjustviewbounds;
    }

    @Override // o.setTouchDelegate
    public final registerIn MenuHostHelper$$ExternalSyntheticLambda1() {
        return setY();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setY().MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_CREATE);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        setY().MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        setY().MenuHostHelper$$ExternalSyntheticLambda1(registerIn.setX.ON_DESTROY);
        this.setY = null;
        super.onStop();
    }

    public static final void setY(setUnboundedRipple setunboundedripple) {
        pN.setY(setunboundedripple, "");
        super.onBackPressed();
    }

    @Override // o.setNavigationOnClickListener
    public final OnBackPressedDispatcher setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        MenuHostHelper$$ExternalSyntheticLambda0();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        pN.setY(view, "");
        MenuHostHelper$$ExternalSyntheticLambda0();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        pN.setY(view, "");
        MenuHostHelper$$ExternalSyntheticLambda0();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        pN.setY(view, "");
        MenuHostHelper$$ExternalSyntheticLambda0();
        super.addContentView(view, layoutParams);
    }

    private final void MenuHostHelper$$ExternalSyntheticLambda0() {
        Window window = getWindow();
        pN.setX(window);
        setShadowLayer.setX(window.getDecorView(), this);
        Window window2 = getWindow();
        pN.setX(window2);
        View decorView = window2.getDecorView();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) decorView, "");
        setUnboundedRipple setunboundedripple = this;
        pN.setY(decorView, "");
        pN.setY(setunboundedripple, "");
        decorView.setTag(R.id.res_0x7f0a0217, setunboundedripple);
    }
}