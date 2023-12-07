package o;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Locale;

/* renamed from: o.mi */
/* loaded from: classes.dex */
public final class C0294mi extends setWebViewRenderProcessClient {
    private C0262lb FirebaseRemoteConfigKtxRegistrar;

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        pN.setY(layoutInflater, "");
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d0034, viewGroup, false);
        int i = R.id.res_0x7f0a005a;
        ImageView imageView = (ImageView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a005a);
        if (imageView != null) {
            RadioButton radioButton = (RadioButton) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a007c);
            if (radioButton != null) {
                RadioButton radioButton2 = (RadioButton) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00c1);
                if (radioButton2 != null) {
                    RadioButton radioButton3 = (RadioButton) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00db);
                    if (radioButton3 != null) {
                        RadioGroup radioGroup = (RadioGroup) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a017c);
                        if (radioGroup != null) {
                            RadioButton radioButton4 = (RadioButton) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a018e);
                            if (radioButton4 != null) {
                                RadioButton radioButton5 = (RadioButton) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01c0);
                                if (radioButton5 != null) {
                                    TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01fc);
                                    if (textView != null) {
                                        RadioButton radioButton6 = (RadioButton) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0209);
                                        if (radioButton6 != null) {
                                            this.FirebaseRemoteConfigKtxRegistrar = new C0262lb((setMIndicatorOptions) inflate, imageView, radioButton, radioButton2, radioButton3, radioGroup, radioButton4, radioButton5, textView, radioButton6);
                                            lH lHVar = (lH) setAnimationFromJson();
                                            if (lHVar != null) {
                                                lHVar.setGuidelinePercent();
                                            }
                                            mB mBVar = mB.setIconTintList;
                                            C0262lb c0262lb = this.FirebaseRemoteConfigKtxRegistrar;
                                            pN.setX(c0262lb);
                                            Context context = c0262lb.setIconTintList.getContext();
                                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context, "");
                                            pN.setY(context, "");
                                            String language = Locale.getDefault().getLanguage();
                                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) language, "");
                                            string = PreferenceManager.getDefaultSharedPreferences(context).getString("Locale.Helper.Selected.Language", language);
                                            if (string != null) {
                                                int hashCode = string.hashCode();
                                                if (hashCode != 3179) {
                                                    if (hashCode != 3201) {
                                                        if (hashCode != 3246) {
                                                            if (hashCode != 3651) {
                                                                if (hashCode == 3710 && string.equals("tr")) {
                                                                    C0262lb c0262lb2 = this.FirebaseRemoteConfigKtxRegistrar;
                                                                    pN.setX(c0262lb2);
                                                                    c0262lb2.setNavigationOnClickListener.setChecked(true);
                                                                }
                                                            } else if (string.equals("ru")) {
                                                                C0262lb c0262lb3 = this.FirebaseRemoteConfigKtxRegistrar;
                                                                pN.setX(c0262lb3);
                                                                c0262lb3.setLayoutAnimation.setChecked(true);
                                                            }
                                                        } else if (string.equals("es")) {
                                                            C0262lb c0262lb4 = this.FirebaseRemoteConfigKtxRegistrar;
                                                            pN.setX(c0262lb4);
                                                            c0262lb4.setOnLongClickListener.setChecked(true);
                                                        }
                                                    } else if (string.equals("de")) {
                                                        C0262lb c0262lb5 = this.FirebaseRemoteConfigKtxRegistrar;
                                                        pN.setX(c0262lb5);
                                                        c0262lb5.setX.setChecked(true);
                                                    }
                                                } else if (string.equals("cn")) {
                                                    C0262lb c0262lb6 = this.FirebaseRemoteConfigKtxRegistrar;
                                                    pN.setX(c0262lb6);
                                                    c0262lb6.setY.setChecked(true);
                                                }
                                            }
                                            C0262lb c0262lb7 = this.FirebaseRemoteConfigKtxRegistrar;
                                            pN.setX(c0262lb7);
                                            c0262lb7.MenuHostHelper$$ExternalSyntheticLambda0.setOnClickListener(new View.OnClickListener() { // from class: o.mh
                                                @Override // android.view.View.OnClickListener
                                                public final void onClick(View view) {
                                                    C0294mi.MenuHostHelper$$ExternalSyntheticLambda0(C0294mi.this);
                                                }
                                            });
                                            c0262lb7.MenuHostHelper$$ExternalSyntheticLambda1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // from class: o.mg
                                                @Override // android.widget.RadioGroup.OnCheckedChangeListener
                                                public final void onCheckedChanged(RadioGroup radioGroup2, int i2) {
                                                    C0294mi.setY(C0294mi.this, i2);
                                                }
                                            });
                                            C0262lb c0262lb8 = this.FirebaseRemoteConfigKtxRegistrar;
                                            pN.setX(c0262lb8);
                                            setMIndicatorOptions setmindicatoroptions = c0262lb8.setIconTintList;
                                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setmindicatoroptions, "");
                                            return setmindicatoroptions;
                                        }
                                        i = R.id.res_0x7f0a0209;
                                    } else {
                                        i = R.id.res_0x7f0a01fc;
                                    }
                                } else {
                                    i = R.id.res_0x7f0a01c0;
                                }
                            } else {
                                i = R.id.res_0x7f0a018e;
                            }
                        } else {
                            i = R.id.res_0x7f0a017c;
                        }
                    } else {
                        i = R.id.res_0x7f0a00db;
                    }
                } else {
                    i = R.id.res_0x7f0a00c1;
                }
            } else {
                i = R.id.res_0x7f0a007c;
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
            C0262lb c0262lb = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(c0262lb);
            c0262lb.setIconTintList.setBackgroundColor(lAVar.setX(checkedIconEnabled));
            C0262lb c0262lb2 = this.FirebaseRemoteConfigKtxRegistrar;
            pN.setX(c0262lb2);
            c0262lb2.setUnboundedRipple.setTextColor(lAVar.MenuHostHelper$$ExternalSyntheticLambda1(checkedIconEnabled));
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0294mi c0294mi) {
        pN.setY(c0294mi, "");
        lH lHVar = (lH) c0294mi.setAnimationFromJson();
        if (lHVar != null) {
            lHVar.setTextAppearanceResource();
        }
    }

    public static /* synthetic */ void setY(C0294mi c0294mi, int i) {
        String str;
        pN.setY(c0294mi, "");
        switch (i) {
            case R.id.res_0x7f0a007c /* 2131361916 */:
                str = "cn";
                break;
            case R.id.res_0x7f0a00db /* 2131362011 */:
                str = "de";
                break;
            case R.id.res_0x7f0a018e /* 2131362190 */:
                str = "ru";
                break;
            case R.id.res_0x7f0a01c0 /* 2131362240 */:
                str = "es";
                break;
            case R.id.res_0x7f0a0209 /* 2131362313 */:
                str = "tr";
                break;
            default:
                str = "";
                break;
        }
        mB mBVar = mB.setIconTintList;
        C0262lb c0262lb = c0294mi.FirebaseRemoteConfigKtxRegistrar;
        pN.setX(c0262lb);
        Context context = c0262lb.setIconTintList.getContext();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context, "");
        mB.setX(context, str);
        lH lHVar = (lH) c0294mi.setAnimationFromJson();
        if (lHVar != null) {
            lHVar.setMinAndMaxProgress();
        }
    }
}