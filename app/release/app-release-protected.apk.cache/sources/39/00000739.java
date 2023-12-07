package o;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import com.rmldemo.guardsquare.ui.activity.MainActivity;
import com.rmldemo.guardsquare.ui.activity.WelcomeActivity;
import o.lC;

/* renamed from: o.mq */
/* loaded from: classes.dex */
public final class C0302mq extends setWebViewRenderProcessClient {
    private C0266lf FirebaseRemoteConfigKtxRegistrar;
    @nE
    public SharedPreferences setTitleMarginEnd;

    @Override // o.setWebViewRenderProcessClient
    public final void setIconTintList(setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode) {
        pN.setY(setprogressbackgroundtintblendmode, "");
    }

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pN.setY(layoutInflater, "");
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d0038, viewGroup, false);
        CustomVersionedParcelable customVersionedParcelable = (CustomVersionedParcelable) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a004e);
        if (customVersionedParcelable != null) {
            this.FirebaseRemoteConfigKtxRegistrar = new C0266lf((setMIndicatorOptions) inflate, customVersionedParcelable);
            C0311mz.setY.setX().setIconTintList(this);
            SharedPreferences sharedPreferences = this.setTitleMarginEnd;
            if (sharedPreferences == null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                sharedPreferences = null;
            }
            final boolean z = sharedPreferences.getBoolean("isUserRegistered", false);
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: o.mo
                @Override // java.lang.Runnable
                public final void run() {
                    C0302mq.MenuHostHelper$$ExternalSyntheticLambda0(C0302mq.this, z);
                }
            }, 2500L);
            C0266lf c0266lf = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(c0266lf);
            setMIndicatorOptions setmindicatoroptions = c0266lf.setY;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setmindicatoroptions, "");
            return setmindicatoroptions;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.res_0x7f0a004e)));
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0302mq c0302mq, boolean z) {
        boolean z2;
        String str;
        pN.setY(c0302mq, "");
        Context checkedIconEnabled = c0302mq.setCheckedIconEnabled();
        if (checkedIconEnabled != null) {
            lC.setY sety = lC.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY(checkedIconEnabled, "");
            z2 = lC.MenuHostHelper$$ExternalSyntheticLambda1;
            if (z2) {
                str = lC.setY;
                Toast.makeText(checkedIconEnabled, str, 0).show();
                Process.killProcess(Process.myPid());
            }
        }
        if (z) {
            WelcomeActivity welcomeActivity = (WelcomeActivity) c0302mq.setAnimationFromJson();
            if (welcomeActivity != null) {
                welcomeActivity.finish();
            }
            C0266lf c0266lf = c0302mq.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(c0266lf);
            c0302mq.setIconTintList(new Intent(c0266lf.setY.getContext().getApplicationContext(), MainActivity.class));
            return;
        }
        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(c0302mq.FragmentStateAdapter$5());
        setbackgroundtintlist.setIconTintList(R.id.res_0x7f0a00d7, new C0301mp(), null, 2);
        setbackgroundtintlist.setX();
    }
}