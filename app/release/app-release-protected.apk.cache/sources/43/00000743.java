package o;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.rmldemo.guardsquare.ui.activity.MainActivity;
import com.rmldemo.guardsquare.ui.activity.WelcomeActivity;
import java.util.ArrayList;

/* renamed from: o.mx */
/* loaded from: classes.dex */
public final class C0309mx extends setDropDownBackgroundResource {
    private lQ FirebaseRemoteConfigKtxRegistrar;
    private C0271lk setError;
    @nE
    public SharedPreferences setTitleMarginEnd;

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pN.setY(layoutInflater, "");
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d0039, viewGroup, false);
        int i = R.id.res_0x7f0a00a1;
        TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00a1);
        if (textView != null) {
            FabTransformationSheetBehavior fabTransformationSheetBehavior = (FabTransformationSheetBehavior) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0113);
            if (fabTransformationSheetBehavior != null) {
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a018f);
                if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                    TextView textView2 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01fc);
                    if (textView2 != null) {
                        this.setError = new C0271lk((setMIndicatorOptions) inflate, textView, fabTransformationSheetBehavior, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, textView2);
                        C0311mz.setY.setX().setIconTintList(this);
                        C0311mz c0311mz = C0311mz.setY;
                        C0271lk c0271lk = this.setError;
                        pN.setX(c0271lk);
                        Context context = c0271lk.MenuHostHelper$$ExternalSyntheticLambda0.getContext();
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context, "");
                        this.FirebaseRemoteConfigKtxRegistrar = new lQ(C0311mz.MenuHostHelper$$ExternalSyntheticLambda1(context));
                        C0271lk c0271lk2 = this.setError;
                        pN.setX(c0271lk2);
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = c0271lk2.setY;
                        lQ lQVar = this.FirebaseRemoteConfigKtxRegistrar;
                        if (lQVar == null) {
                            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                            lQVar = null;
                        }
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setAdapter(lQVar);
                        C0271lk c0271lk3 = this.setError;
                        pN.setX(c0271lk3);
                        c0271lk3.setX.setOnClickListener(new View.OnClickListener() { // from class: o.mt
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                C0309mx.MenuHostHelper$$ExternalSyntheticLambda0(C0309mx.this);
                            }
                        });
                        C0271lk c0271lk4 = this.setError;
                        pN.setX(c0271lk4);
                        setMIndicatorOptions setmindicatoroptions = c0271lk4.MenuHostHelper$$ExternalSyntheticLambda0;
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setmindicatoroptions, "");
                        return setmindicatoroptions;
                    }
                    i = R.id.res_0x7f0a01fc;
                } else {
                    i = R.id.res_0x7f0a018f;
                }
            } else {
                i = R.id.res_0x7f0a0113;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0309mx c0309mx) {
        String x;
        pN.setY(c0309mx, "");
        SharedPreferences sharedPreferences = c0309mx.setTitleMarginEnd;
        lQ lQVar = null;
        if (sharedPreferences == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        lQ lQVar2 = c0309mx.FirebaseRemoteConfigKtxRegistrar;
        if (lQVar2 == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        } else {
            lQVar = lQVar2;
        }
        ArrayList<String> arrayList = lQVar.MenuHostHelper$$ExternalSyntheticLambda1;
        gS gSVar = new gS();
        if (arrayList == null) {
            x = gSVar.MenuHostHelper$$ExternalSyntheticLambda0(gW.setY);
        } else {
            x = gSVar.setX(arrayList, arrayList.getClass());
        }
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) x, "");
        edit.putString("topic", x);
        edit.putBoolean("isUserRegistered", true);
        edit.apply();
        setEndIconContentDescription animationFromJson = c0309mx.setAnimationFromJson();
        pN.setX(animationFromJson);
        ((WelcomeActivity) animationFromJson).finish();
        C0271lk c0271lk = c0309mx.setError;
        pN.setX(c0271lk);
        c0309mx.setIconTintList(new Intent(c0271lk.MenuHostHelper$$ExternalSyntheticLambda0.getContext().getApplicationContext(), MainActivity.class));
    }
}