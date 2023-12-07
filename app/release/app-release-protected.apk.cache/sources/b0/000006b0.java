package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class lW extends setWebViewRenderProcessClient {
    @nE
    public SharedPreferences FirebaseRemoteConfigKtxRegistrar;
    private kW setError;
    private lI setTitleMarginEnd;

    @Override // o.setWebViewRenderProcessClient, o.setDropDownBackgroundResource
    public final void setX(Bundle bundle) {
        super.setX(bundle);
        this.setTitleMarginEnd = new lI();
    }

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ArrayList<String> MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(layoutInflater, "");
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d0032, viewGroup, false);
        int i = R.id.res_0x7f0a00a1;
        TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00a1);
        if (textView != null) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a018f);
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                TextView textView2 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01fc);
                if (textView2 != null) {
                    this.setError = new kW((setMIndicatorOptions) inflate, textView, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, textView2);
                    C0311mz.setY.setX().MenuHostHelper$$ExternalSyntheticLambda0(this);
                    lH lHVar = (lH) setAnimationFromJson();
                    if (lHVar != null) {
                        lHVar.setLayoutDirection();
                    }
                    kW kWVar = this.setError;
                    pN.setX(kWVar);
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = kWVar.setX;
                    lI lIVar = this.setTitleMarginEnd;
                    lI lIVar2 = null;
                    if (lIVar == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                        lIVar = null;
                    }
                    windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setAdapter(lIVar);
                    gS gSVar = new gS();
                    SharedPreferences sharedPreferences = this.FirebaseRemoteConfigKtxRegistrar;
                    if (sharedPreferences == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                        sharedPreferences = null;
                    }
                    String string = sharedPreferences.getString("topic", "");
                    pN.setX((Object) string);
                    String[] strArr = (String[]) gSVar.setIconTintList(string, String[].class);
                    ArrayList<String> arrayList = new ArrayList<>();
                    ArrayList<String> arrayList2 = arrayList;
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) strArr, "");
                    pN.setY(arrayList2, "");
                    pN.setY(strArr, "");
                    pN.setY(strArr, "");
                    List asList = Arrays.asList(strArr);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) asList, "");
                    arrayList2.addAll(asList);
                    lI lIVar3 = this.setTitleMarginEnd;
                    if (lIVar3 == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    } else {
                        lIVar2 = lIVar3;
                    }
                    kW kWVar2 = this.setError;
                    pN.setX(kWVar2);
                    Context context = kWVar2.setY.getContext();
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context, "");
                    pN.setY(arrayList, "");
                    pN.setY(context, "");
                    lIVar2.MenuHostHelper$$ExternalSyntheticLambda1 = arrayList;
                    C0311mz c0311mz = C0311mz.setY;
                    MenuHostHelper$$ExternalSyntheticLambda1 = C0348oi.MenuHostHelper$$ExternalSyntheticLambda1("General", "Politics", "Sports", "Business", "Travel", "Tech", "Health", "Food", "Science", "Entertainment");
                    lIVar2.setUiOptions = MenuHostHelper$$ExternalSyntheticLambda1;
                    C0311mz c0311mz2 = C0311mz.setY;
                    lIVar2.setIconTintList = C0311mz.MenuHostHelper$$ExternalSyntheticLambda1(context);
                    StringBuilder sb = new StringBuilder();
                    for (String str : arrayList) {
                        sb.append(str);
                    }
                    String obj = sb.toString();
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
                    lIVar2.MenuHostHelper$$ExternalSyntheticLambda0 = obj;
                    lIVar2.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                    kW kWVar3 = this.setError;
                    pN.setX(kWVar3);
                    setMIndicatorOptions setmindicatoroptions = kWVar3.setY;
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setmindicatoroptions, "");
                    return setmindicatoroptions;
                }
                i = R.id.res_0x7f0a01fc;
            } else {
                i = R.id.res_0x7f0a018f;
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
            kW kWVar = this.setError;
            pN.setX(kWVar);
            kWVar.setY.setBackgroundColor(lAVar.setX(checkedIconEnabled));
            kW kWVar2 = this.setError;
            pN.setX(kWVar2);
            kWVar2.MenuHostHelper$$ExternalSyntheticLambda1.setTextColor(lAVar.MenuHostHelper$$ExternalSyntheticLambda1(checkedIconEnabled));
            kW kWVar3 = this.setError;
            pN.setX(kWVar3);
            kWVar3.MenuHostHelper$$ExternalSyntheticLambda0.setTextColor(lAVar.setLayoutAnimation(checkedIconEnabled));
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void setIconSize() {
        String x;
        super.setIconSize();
        SharedPreferences sharedPreferences = this.FirebaseRemoteConfigKtxRegistrar;
        lI lIVar = null;
        if (sharedPreferences == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        lI lIVar2 = this.setTitleMarginEnd;
        if (lIVar2 == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        } else {
            lIVar = lIVar2;
        }
        ArrayList<String> arrayList = lIVar.MenuHostHelper$$ExternalSyntheticLambda1;
        gS gSVar = new gS();
        if (arrayList == null) {
            x = gSVar.MenuHostHelper$$ExternalSyntheticLambda0(gW.setY);
        } else {
            x = gSVar.setX(arrayList, arrayList.getClass());
        }
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) x, "");
        edit.putString("topic", x);
        edit.apply();
    }
}