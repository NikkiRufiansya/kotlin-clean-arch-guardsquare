package o;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.material.appbar.AppBarLayout;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class lP extends setWebViewRenderProcessClient implements AppBarLayout.setUnboundedRipple {
    private kP FirebaseRemoteConfigKtxRegistrar;
    private kP onActivityResumed;
    @nE
    public lB setError;
    private C0261la setTitleMarginEnd;

    @Override // com.google.android.material.appbar.AppBarLayout.setIconTintList
    public final void setY(int i) {
    }

    @Override // o.setWebViewRenderProcessClient, o.setDropDownBackgroundResource
    public final void setX(Bundle bundle) {
        super.setX(bundle);
        Bundle maxEms = setMaxEms();
        if (maxEms != null) {
            Serializable serializable = maxEms.getSerializable("news");
            pN.setX(serializable);
            this.onActivityResumed = (kP) serializable;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c5  */
    @Override // o.setDropDownBackgroundResource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View setY(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.lP.setY(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    @Override // o.setWebViewRenderProcessClient
    public final void setIconTintList(setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode) {
        pN.setY(setprogressbackgroundtintblendmode, "");
        lA lAVar = (lA) setprogressbackgroundtintblendmode;
        Context checkedIconEnabled = setCheckedIconEnabled();
        if (checkedIconEnabled != null) {
            C0261la c0261la = this.setTitleMarginEnd;
            pN.setX(c0261la);
            c0261la.setUnboundedRipple.setBackgroundColor(lAVar.setX(checkedIconEnabled));
            C0261la c0261la2 = this.setTitleMarginEnd;
            pN.setX(c0261la2);
            c0261la2.setUiOptions.setBackground(lAVar.MenuHostHelper$$ExternalSyntheticLambda0(checkedIconEnabled));
            C0261la c0261la3 = this.setTitleMarginEnd;
            pN.setX(c0261la3);
            c0261la3.setLayoutAnimation.setTextColor(lAVar.MenuHostHelper$$ExternalSyntheticLambda1(checkedIconEnabled));
            C0261la c0261la4 = this.setTitleMarginEnd;
            pN.setX(c0261la4);
            c0261la4.MenuHostHelper$$ExternalSyntheticLambda0.setTextColor(lAVar.setLayoutAnimation(checkedIconEnabled));
        }
    }

    public static /* synthetic */ void setY(lP lPVar) {
        pN.setY(lPVar, "");
        lH lHVar = (lH) lPVar.setAnimationFromJson();
        if (lHVar != null) {
            lHVar.setTextAppearanceResource();
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(lP lPVar) {
        pN.setY(lPVar, "");
        kP kPVar = lPVar.FirebaseRemoteConfigKtxRegistrar;
        pN.setX(kPVar);
        lB lBVar = null;
        if (kPVar.isSaved) {
            C0261la c0261la = lPVar.setTitleMarginEnd;
            pN.setX(c0261la);
            c0261la.setOnLongClickListener.setImageResource(R.drawable.res_0x7f080082);
            kP kPVar2 = lPVar.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(kPVar2);
            kPVar2.isSaved = false;
            lB lBVar2 = lPVar.setError;
            if (lBVar2 != null) {
                lBVar = lBVar2;
            } else {
                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            }
            kP kPVar3 = lPVar.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(kPVar3);
            pN.setY(kPVar3, "");
            lBVar.setX.setY(kPVar3);
            return;
        }
        C0261la c0261la2 = lPVar.setTitleMarginEnd;
        pN.setX(c0261la2);
        c0261la2.setOnLongClickListener.setImageResource(R.drawable.res_0x7f080081);
        kP kPVar4 = lPVar.FirebaseRemoteConfigKtxRegistrar;
        if (kPVar4 != null) {
            kPVar4.isSaved = true;
        }
        lB lBVar3 = lPVar.setError;
        if (lBVar3 != null) {
            lBVar = lBVar3;
        } else {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        kP kPVar5 = lPVar.FirebaseRemoteConfigKtxRegistrar;
        pN.setX(kPVar5);
        pN.setY(kPVar5, "");
        lBVar.setX.setY(kPVar5);
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(lP lPVar) {
        pN.setY(lPVar, "");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        kP kPVar = lPVar.onActivityResumed;
        intent.putExtra("android.intent.extra.TITLE", kPVar != null ? kPVar.title : null);
        kP kPVar2 = lPVar.onActivityResumed;
        intent.putExtra("android.intent.extra.TEXT", kPVar2 != null ? kPVar2.description : null);
        intent.setType("text/plain");
        lPVar.setIconTintList(Intent.createChooser(intent, null));
    }
}