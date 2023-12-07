package o;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import o.lM;

/* loaded from: classes.dex */
public final class lX extends setWebViewRenderProcessClient {
    private kX FirebaseRemoteConfigKtxRegistrar;
    private lM setError;
    @nE
    public kO setTitleMarginEnd;

    @Override // o.setWebViewRenderProcessClient, o.setDropDownBackgroundResource
    public final void setX(Bundle bundle) {
        super.setX(bundle);
        this.setError = new lM(new lM.setX() { // from class: o.lX$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // o.lM.setX
            public final void setX(kP kPVar) {
                pN.setY(kPVar, "");
                finalize x = new setBackgroundTintList(lX.this.FragmentStateAdapter$5()).setX(lP.class, dump.MenuHostHelper$$ExternalSyntheticLambda1(new nT("news", kPVar)));
                if (!x.setX) {
                    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                }
                x.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                x.setTextAlignment = "article";
                x.setX();
            }
        });
    }

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pN.setY(layoutInflater, "");
        lM lMVar = null;
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d0031, (ViewGroup) null, false);
        int i = R.id.res_0x7f0a0062;
        setScrimVisibleHeightTrigger setscrimvisibleheighttrigger = (setScrimVisibleHeightTrigger) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0062);
        if (setscrimvisibleheighttrigger != null) {
            TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00a1);
            if (textView != null) {
                TextView textView2 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a015b);
                if (textView2 != null) {
                    setMIndicatorOptions setmindicatoroptions = (setMIndicatorOptions) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a015c);
                    if (setmindicatoroptions != null) {
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a018f);
                        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                            TextView textView3 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01fc);
                            if (textView3 != null) {
                                this.FirebaseRemoteConfigKtxRegistrar = new kX((setMIndicatorOptions) inflate, setscrimvisibleheighttrigger, textView, textView2, setmindicatoroptions, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, textView3);
                                C0311mz.setY.setX().setIconTintList(this);
                                lH lHVar = (lH) setAnimationFromJson();
                                if (lHVar != null) {
                                    lHVar.setLayoutDirection();
                                }
                                kX kXVar = this.FirebaseRemoteConfigKtxRegistrar;
                                pN.setX(kXVar);
                                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = kXVar.setUiOptions;
                                lM lMVar2 = this.setError;
                                if (lMVar2 == null) {
                                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                    lMVar2 = null;
                                }
                                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setAdapter(lMVar2);
                                kO kOVar = this.setTitleMarginEnd;
                                if (kOVar == null) {
                                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                    kOVar = null;
                                }
                                List<kP> y = kOVar.setY();
                                ArrayList arrayList = new ArrayList();
                                for (kP kPVar : y) {
                                    if (kPVar.isSaved) {
                                        arrayList.add(kPVar);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    lM lMVar3 = this.setError;
                                    if (lMVar3 == null) {
                                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                    } else {
                                        lMVar = lMVar3;
                                    }
                                    ArrayList arrayList2 = arrayList;
                                    pN.setY(arrayList2, "");
                                    lMVar.MenuHostHelper$$ExternalSyntheticLambda0 = arrayList2;
                                    lMVar.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                                    kX kXVar2 = this.FirebaseRemoteConfigKtxRegistrar;
                                    pN.setX(kXVar2);
                                    kXVar2.setIconTintList.setVisibility(8);
                                } else {
                                    lM lMVar4 = this.setError;
                                    if (lMVar4 == null) {
                                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                    } else {
                                        lMVar = lMVar4;
                                    }
                                    C0358os c0358os = C0358os.setIconTintList;
                                    pN.setY(c0358os, "");
                                    lMVar.MenuHostHelper$$ExternalSyntheticLambda0 = c0358os;
                                    lMVar.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                                    kX kXVar3 = this.FirebaseRemoteConfigKtxRegistrar;
                                    pN.setX(kXVar3);
                                    kXVar3.setIconTintList.setVisibility(0);
                                }
                                kX kXVar4 = this.FirebaseRemoteConfigKtxRegistrar;
                                pN.setX(kXVar4);
                                setMIndicatorOptions setmindicatoroptions2 = kXVar4.setY;
                                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setmindicatoroptions2, "");
                                return setmindicatoroptions2;
                            }
                            i = R.id.res_0x7f0a01fc;
                        } else {
                            i = R.id.res_0x7f0a018f;
                        }
                    } else {
                        i = R.id.res_0x7f0a015c;
                    }
                } else {
                    i = R.id.res_0x7f0a015b;
                }
            } else {
                i = R.id.res_0x7f0a00a1;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // o.setWebViewRenderProcessClient
    public final void setIconTintList(setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode) {
        pN.setY(setprogressbackgroundtintblendmode, "");
        lA lAVar = (lA) setprogressbackgroundtintblendmode;
        Context checkedIconEnabled = setCheckedIconEnabled();
        if (checkedIconEnabled != null) {
            kX kXVar = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(kXVar);
            kXVar.setY.setBackgroundColor(lAVar.setX(checkedIconEnabled));
            kX kXVar2 = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(kXVar2);
            kXVar2.setLayoutAnimation.setTextColor(lAVar.MenuHostHelper$$ExternalSyntheticLambda1(checkedIconEnabled));
            kX kXVar3 = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(kXVar3);
            kXVar3.MenuHostHelper$$ExternalSyntheticLambda1.setTextColor(lAVar.setLayoutAnimation(checkedIconEnabled));
            kX kXVar4 = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(kXVar4);
            kXVar4.MenuHostHelper$$ExternalSyntheticLambda0.setTextColor(lAVar.setLayoutAnimation(checkedIconEnabled));
            kX kXVar5 = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(kXVar5);
            kXVar5.setX.setCardBackgroundColor(lAVar.setY(checkedIconEnabled));
        }
    }
}