package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import o.lK;
import o.lM;
import o.mA;
import o.nR;
import o.pY;
import o.setMinuteHourDelegate;

/* renamed from: o.mc */
/* loaded from: classes.dex */
public final class C0288mc extends setWebViewRenderProcessClient {
    private Integer FabTransformationBehavior;
    @nE
    public mC FirebaseRemoteConfigKtxRegistrar;
    private boolean getCallingPid;
    private lM onActivityResumed;
    @nE
    public kO setError;
    private lK setFilterRedundantCalls;
    private kZ setHint;
    @nE
    public setTitleMarginTop setTitleMarginEnd$781c81df;
    @nE
    public SharedPreferences setTooltipText;

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        pN.setY(layoutInflater, "");
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d0033, viewGroup, false);
        int i = R.id.res_0x7f0a00a1;
        TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00a1);
        if (textView != null) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00ed);
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                ImageView imageView = (ImageView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0128);
                if (imageView != null) {
                    ProgressBar progressBar = (ProgressBar) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0177);
                    if (progressBar != null) {
                        ProgressBar progressBar2 = (ProgressBar) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0178);
                        if (progressBar2 != null) {
                            LinearLayout linearLayout = (LinearLayout) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a017e);
                            if (linearLayout != null) {
                                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a017f);
                                if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null) {
                                    TextView textView2 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0180);
                                    if (textView2 != null) {
                                        setScrimVisibleHeightTrigger setscrimvisibleheighttrigger = (setScrimVisibleHeightTrigger) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a019f);
                                        if (setscrimvisibleheighttrigger != null) {
                                            TextView textView3 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01a7);
                                            if (textView3 != null) {
                                                setMinuteHourDelegate setminutehourdelegate = (setMinuteHourDelegate) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01d9);
                                                if (setminutehourdelegate != null) {
                                                    TextView textView4 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01fc);
                                                    if (textView4 != null) {
                                                        this.setHint = new kZ((setVelocityScale) inflate, textView, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, imageView, progressBar, progressBar2, linearLayout, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02, textView2, setscrimvisibleheighttrigger, textView3, setminutehourdelegate, textView4);
                                                        C0311mz.setY.setX().MenuHostHelper$$ExternalSyntheticLambda0(this);
                                                        lH lHVar = (lH) setAnimationFromJson();
                                                        if (lHVar != null) {
                                                            lHVar.setLayoutDirection();
                                                        }
                                                        lM lMVar = null;
                                                        if (!this.getCallingPid) {
                                                            setX setx = new setX();
                                                            kO kOVar = this.setError;
                                                            if (kOVar == null) {
                                                                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                                                kOVar = null;
                                                            }
                                                            this.setFilterRedundantCalls = new lK(setx, kOVar);
                                                            this.onActivityResumed = new lM(new setY());
                                                        }
                                                        setInsetTop x = setFabAnimationMode.setX(this);
                                                        setIconTintList seticontintlist = new setIconTintList(null);
                                                        pN.setY(seticontintlist, "");
                                                        C0435ro.MenuHostHelper$$ExternalSyntheticLambda1(x, null, null, new setInsetTop$MenuHostHelper$$ExternalSyntheticLambda1(x, seticontintlist, null), 3);
                                                        this.getCallingPid = true;
                                                        pN.setX(this.setHint);
                                                        kZ kZVar = this.setHint;
                                                        pN.setX(kZVar);
                                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = kZVar.setY;
                                                        lK lKVar = this.setFilterRedundantCalls;
                                                        if (lKVar == null) {
                                                            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                                            lKVar = null;
                                                        }
                                                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.setAdapter(lKVar);
                                                        kZ kZVar2 = this.setHint;
                                                        pN.setX(kZVar2);
                                                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = kZVar2.setX;
                                                        lM lMVar2 = this.onActivityResumed;
                                                        if (lMVar2 == null) {
                                                            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                                        } else {
                                                            lMVar = lMVar2;
                                                        }
                                                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.setAdapter(lMVar);
                                                        kZ kZVar3 = this.setHint;
                                                        pN.setX(kZVar3);
                                                        kZVar3.setUnboundedRipple.setOnClickListener(new View.OnClickListener() { // from class: o.ma
                                                            @Override // android.view.View.OnClickListener
                                                            public final void onClick(View view) {
                                                                C0288mc.MenuHostHelper$$ExternalSyntheticLambda0(C0288mc.this);
                                                            }
                                                        });
                                                        kZ kZVar4 = this.setHint;
                                                        pN.setX(kZVar4);
                                                        setVelocityScale setvelocityscale = kZVar4.setNavigationOnClickListener;
                                                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setvelocityscale, "");
                                                        return setvelocityscale;
                                                    }
                                                    i = R.id.res_0x7f0a01fc;
                                                } else {
                                                    i = R.id.res_0x7f0a01d9;
                                                }
                                            } else {
                                                i = R.id.res_0x7f0a01a7;
                                            }
                                        } else {
                                            i = R.id.res_0x7f0a019f;
                                        }
                                    } else {
                                        i = R.id.res_0x7f0a0180;
                                    }
                                } else {
                                    i = R.id.res_0x7f0a017f;
                                }
                            } else {
                                i = R.id.res_0x7f0a017e;
                            }
                        } else {
                            i = R.id.res_0x7f0a0178;
                        }
                    } else {
                        i = R.id.res_0x7f0a0177;
                    }
                } else {
                    i = R.id.res_0x7f0a0128;
                }
            } else {
                i = R.id.res_0x7f0a00ed;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [T, java.lang.String] */
    @Override // o.setWebViewRenderProcessClient
    public final void setIconTintList(setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode) {
        ?? string;
        pN.setY(setprogressbackgroundtintblendmode, "");
        lA lAVar = (lA) setprogressbackgroundtintblendmode;
        Context checkedIconEnabled = setCheckedIconEnabled();
        if (checkedIconEnabled != null) {
            kZ kZVar = this.setHint;
            pN.setX(kZVar);
            kZVar.setNavigationOnClickListener.setBackgroundColor(lAVar.setX(checkedIconEnabled));
            kZ kZVar2 = this.setHint;
            pN.setX(kZVar2);
            kZVar2.setTextAlignment.setTextColor(lAVar.MenuHostHelper$$ExternalSyntheticLambda1(checkedIconEnabled));
            kZ kZVar3 = this.setHint;
            pN.setX(kZVar3);
            kZVar3.setOnLongClickListener.setCardBackgroundColor(lAVar.setIconTintList(checkedIconEnabled));
            kZ kZVar4 = this.setHint;
            pN.setX(kZVar4);
            kZVar4.setLayoutAnimation.setTextColor(lAVar.MenuHostHelper$$ExternalSyntheticLambda1(checkedIconEnabled));
            kZ kZVar5 = this.setHint;
            pN.setX(kZVar5);
            kZVar5.setIconTintList.setTextColor(lAVar.setLayoutAnimation(checkedIconEnabled));
            this.FabTransformationBehavior = Integer.valueOf(lAVar.setY(checkedIconEnabled));
            gS gSVar = new gS();
            SharedPreferences sharedPreferences = this.setTooltipText;
            if (sharedPreferences == null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                sharedPreferences = null;
            }
            String string2 = sharedPreferences.getString("topic", "");
            pN.setX((Object) string2);
            String[] strArr = (String[]) gSVar.setIconTintList(string2, String[].class);
            StringBuilder sb = new StringBuilder();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) strArr, "");
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                String str = strArr[i];
                if (i2 != strArr.length - 1) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(',');
                    sb.append(sb2.toString());
                } else {
                    sb.append(str);
                }
                i++;
                i2++;
            }
            final pY.setX setx = new pY.setX();
            mB mBVar = mB.setIconTintList;
            kZ kZVar6 = this.setHint;
            pN.setX(kZVar6);
            Context context = kZVar6.setNavigationOnClickListener.getContext();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) context, "");
            pN.setY(context, "");
            String language = Locale.getDefault().getLanguage();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) language, "");
            string = PreferenceManager.getDefaultSharedPreferences(context).getString("Locale.Helper.Selected.Language", language);
            setx.setX = string;
            T t = setx.setX;
            pN.setX(t);
            if (((CharSequence) t).length() == 0) {
                setx.setX = "en";
            }
            final String[] stringArray = setSuffixText().getStringArray(R.array.res_0x7f030000);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) stringArray, "");
            String[] stringArray2 = setSuffixText().getStringArray(R.array.res_0x7f030001);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) stringArray2, "");
            setTitleMarginTop settitlemargintop = this.setTitleMarginEnd$781c81df;
            if (settitlemargintop == null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                settitlemargintop = null;
            }
            String str2 = stringArray[0];
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str2, "");
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, "");
            try {
                Object[] objArr = {lowerCase, (String) setx.setX};
                Object obj = C0289md.setTextScaleX.get(-513320713);
                if (obj == null) {
                    obj = ((Class) C0289md.setY((char) Gravity.getAbsoluteGravity(0, 0), ViewConfiguration.getEdgeSlop() >> 16, 4 - (ViewConfiguration.getKeyRepeatTimeout() >> 16))).getMethod("setX", String.class, String.class);
                    C0289md.setTextScaleX.put(-513320713, obj);
                }
                ((Method) obj).invoke(settitlemargintop, objArr);
                setTitleMarginTop settitlemargintop2 = this.setTitleMarginEnd$781c81df;
                if (settitlemargintop2 == null) {
                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    settitlemargintop2 = null;
                }
                String obj2 = sb.toString();
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj2, "");
                try {
                    Object[] objArr2 = {obj2, (String) setx.setX};
                    Object obj3 = C0289md.setTextScaleX.get(1845986296);
                    if (obj3 == null) {
                        obj3 = ((Class) C0289md.setY((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), View.getDefaultSize(0, 0), View.resolveSizeAndState(0, 0, 0) + 4)).getMethod("setY", String.class, String.class);
                        C0289md.setTextScaleX.put(1845986296, obj3);
                    }
                    ((Method) obj3).invoke(settitlemargintop2, objArr2);
                    int length2 = stringArray.length;
                    for (int i3 = 0; i3 < length2; i3++) {
                        kZ kZVar7 = this.setHint;
                        pN.setX(kZVar7);
                        setMinuteHourDelegate setminutehourdelegate = kZVar7.setUiOptions;
                        kZ kZVar8 = this.setHint;
                        pN.setX(kZVar8);
                        setminutehourdelegate.setX(kZVar8.setUiOptions.setIconTintList(), i3, setminutehourdelegate.setGuidelinePercent.isEmpty());
                        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d003e, (ViewGroup) null, false);
                        setScrimVisibleHeightTrigger setscrimvisibleheighttrigger = (setScrimVisibleHeightTrigger) inflate;
                        TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01da);
                        if (textView == null) {
                            throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(R.id.res_0x7f0a01da)));
                        }
                        setScrimVisibleHeightTrigger setscrimvisibleheighttrigger2 = new C0273lm(setscrimvisibleheighttrigger, setscrimvisibleheighttrigger, textView).setY;
                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setscrimvisibleheighttrigger2, "");
                        setScrimVisibleHeightTrigger setscrimvisibleheighttrigger3 = setscrimvisibleheighttrigger2;
                        TextView textView2 = (TextView) setscrimvisibleheighttrigger3.findViewById(R.id.res_0x7f0a01da);
                        setScrimVisibleHeightTrigger setscrimvisibleheighttrigger4 = (setScrimVisibleHeightTrigger) setscrimvisibleheighttrigger3.findViewById(R.id.res_0x7f0a006e);
                        textView2.setText(stringArray2[i3]);
                        if (i3 == 0) {
                            setscrimvisibleheighttrigger4.setCardBackgroundColor(setLineHeight.setY(setCallingWorkSourceUid(), R.color.res_0x7f060022));
                            textView2.setTextColor(-1);
                        } else {
                            Integer num = this.FabTransformationBehavior;
                            if (num != null) {
                                setscrimvisibleheighttrigger4.setCardBackgroundColor(num.intValue());
                            }
                        }
                        setscrimvisibleheighttrigger3.setOnTouchListener(new View.OnTouchListener() { // from class: o.mc$MenuHostHelper$$ExternalSyntheticLambda0
                            @Override // android.view.View.OnTouchListener
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                mC mCVar = C0288mc.this.FirebaseRemoteConfigKtxRegistrar;
                                if (mCVar == null) {
                                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                    mCVar = null;
                                }
                                if (mCVar.setX()) {
                                    return false;
                                }
                                Toast.makeText(C0288mc.setX(C0288mc.this).setNavigationOnClickListener.getContext(), (int) R.string.res_0x7f1400a0, 0).show();
                                return true;
                            }
                        });
                        kZ kZVar9 = this.setHint;
                        pN.setX(kZVar9);
                        setMinuteHourDelegate.setUnboundedRipple MenuHostHelper$$ExternalSyntheticLambda0 = kZVar9.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(i3);
                        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                            MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = setscrimvisibleheighttrigger3;
                            setMinuteHourDelegate.setOnLongClickListener setonlongclicklistener = MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation;
                            if (setonlongclicklistener != null) {
                                setonlongclicklistener.setY();
                            }
                        }
                    }
                    kZ kZVar10 = this.setHint;
                    pN.setX(kZVar10);
                    setMinuteHourDelegate setminutehourdelegate2 = kZVar10.setUiOptions;
                    setMinuteHourDelegate.setIconTintList seticontintlist = new setMinuteHourDelegate.setIconTintList() { // from class: o.mc$MenuHostHelper$$ExternalSyntheticLambda1
                        @Override // o.setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1
                        public final void setIconTintList(setMinuteHourDelegate.setUnboundedRipple setunboundedripple) {
                            pN.setY(setunboundedripple, "");
                        }

                        @Override // o.setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1
                        public final void MenuHostHelper$$ExternalSyntheticLambda0(setMinuteHourDelegate.setUnboundedRipple setunboundedripple) {
                            pN.setY(setunboundedripple, "");
                            View view = setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0;
                            pN.setX(view);
                            ((setScrimVisibleHeightTrigger) view.findViewById(R.id.res_0x7f0a006e)).setCardBackgroundColor(setLineHeight.setY(C0288mc.setX(C0288mc.this).setNavigationOnClickListener.getContext(), R.color.res_0x7f060022));
                            ((TextView) view.findViewById(R.id.res_0x7f0a01da)).setTextColor(-1);
                            setTitleMarginTop settitlemargintop3 = C0288mc.this.setTitleMarginEnd$781c81df;
                            if (settitlemargintop3 == null) {
                                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                settitlemargintop3 = null;
                            }
                            String str3 = stringArray[setunboundedripple.setUiOptions];
                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str3, "");
                            String lowerCase2 = str3.toLowerCase(Locale.ROOT);
                            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase2, "");
                            try {
                                Object[] objArr3 = {lowerCase2, setx.setX};
                                Object obj4 = C0289md.setTextScaleX.get(-513320713);
                                if (obj4 == null) {
                                    obj4 = ((Class) C0289md.setY((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4)).getMethod("setX", String.class, String.class);
                                    C0289md.setTextScaleX.put(-513320713, obj4);
                                }
                                ((Method) obj4).invoke(settitlemargintop3, objArr3);
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        }

                        @Override // o.setMinuteHourDelegate$MenuHostHelper$$ExternalSyntheticLambda1
                        public final void setY(setMinuteHourDelegate.setUnboundedRipple setunboundedripple) {
                            Integer num2;
                            pN.setY(setunboundedripple, "");
                            View view = setunboundedripple.MenuHostHelper$$ExternalSyntheticLambda0;
                            pN.setX(view);
                            setScrimVisibleHeightTrigger setscrimvisibleheighttrigger5 = (setScrimVisibleHeightTrigger) view.findViewById(R.id.res_0x7f0a006e);
                            TextView textView3 = (TextView) view.findViewById(R.id.res_0x7f0a01da);
                            num2 = C0288mc.this.FabTransformationBehavior;
                            if (num2 != null) {
                                setscrimvisibleheighttrigger5.setCardBackgroundColor(num2.intValue());
                            }
                            textView3.setTextColor(setLineHeight.setY(C0288mc.this.setCallingWorkSourceUid(), R.color.res_0x7f060066));
                        }
                    };
                    if (setminutehourdelegate2.MenuHostHelper$$ExternalSyntheticLambda1.contains(seticontintlist)) {
                        return;
                    }
                    setminutehourdelegate2.MenuHostHelper$$ExternalSyntheticLambda1.add(seticontintlist);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    /* renamed from: o.mc$setX */
    /* loaded from: classes.dex */
    public static final class setX implements lK.setIconTintList {
        setX() {
            C0288mc.this = r1;
        }

        @Override // o.lK.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda0(kP kPVar) {
            pN.setY(kPVar, "");
            finalize x = new setBackgroundTintList(C0288mc.this.FragmentStateAdapter$5()).setX(lP.class, dump.MenuHostHelper$$ExternalSyntheticLambda1(new nT("news", kPVar)));
            if (!x.setX) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            x.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            x.setTextAlignment = "article";
            x.setX();
        }
    }

    /* renamed from: o.mc$setY */
    /* loaded from: classes.dex */
    public static final class setY implements lM.setX {
        setY() {
            C0288mc.this = r1;
        }

        @Override // o.lM.setX
        public final void setX(kP kPVar) {
            pN.setY(kPVar, "");
            finalize x = new setBackgroundTintList(C0288mc.this.FragmentStateAdapter$5()).setX(lP.class, dump.MenuHostHelper$$ExternalSyntheticLambda1(new nT("news", kPVar)));
            if (!x.setX) {
                throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
            }
            x.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            x.setTextAlignment = "article";
            x.setX();
        }
    }

    /* renamed from: o.mc$setIconTintList */
    /* loaded from: classes.dex */
    static final class setIconTintList extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
        private int MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ Object setX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setIconTintList(oK<? super setIconTintList> oKVar) {
            super(2, oKVar);
            C0288mc.this = r1;
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            setIconTintList seticontintlist = new setIconTintList(oKVar);
            seticontintlist.setX = obj;
            return seticontintlist;
        }

        /* renamed from: o.mc$setIconTintList$2 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
            private int MenuHostHelper$$ExternalSyntheticLambda0;
            private /* synthetic */ C0288mc setIconTintList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(C0288mc c0288mc, oK<? super AnonymousClass2> oKVar) {
                super(2, oKVar);
                this.setIconTintList = c0288mc;
            }

            @Override // o.oR
            public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
                return new AnonymousClass2(this.setIconTintList, oKVar);
            }

            @Override // o.InterfaceC0389pw
            public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
                return new AnonymousClass2(this.setIconTintList, oKVar).setY(nX.setX);
            }

            @Override // o.oR
            public final Object setY(Object obj) {
                oJ oJVar = oJ.COROUTINE_SUSPENDED;
                int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (obj instanceof nR.setX) {
                        throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                } else if (obj instanceof nR.setX) {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                } else {
                    setTitleMarginTop settitlemargintop = this.setIconTintList.setTitleMarginEnd$781c81df;
                    if (settitlemargintop == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                        settitlemargintop = null;
                    }
                    try {
                        Object obj2 = C0289md.setTextScaleX.get(-725045505);
                        if (obj2 == null) {
                            obj2 = ((Class) C0289md.setY((char) ((-1) - TextUtils.lastIndexOf("", '0')), ViewConfiguration.getWindowTouchSlop() >> 8, 4 - KeyEvent.keyCodeFromString(""))).getMethod("setX", null);
                            C0289md.setTextScaleX.put(-725045505, obj2);
                        }
                        tF tFVar = (tF) ((Method) obj2).invoke(settitlemargintop, null);
                        final C0288mc c0288mc = this.setIconTintList;
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = 1;
                        if (tFVar.setIconTintList(new InterfaceC0498tx() { // from class: o.mc.setIconTintList.2.3
                            @Override // o.InterfaceC0498tx
                            public final /* synthetic */ Object setIconTintList(Object obj3, oK oKVar) {
                                mA mAVar = (mA) obj3;
                                if (mAVar instanceof mA$MenuHostHelper$$ExternalSyntheticLambda0) {
                                    C0288mc.setX(c0288mc).MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(8);
                                } else {
                                    lK lKVar = null;
                                    if (mAVar instanceof mA.setIconTintList) {
                                        lK lKVar2 = c0288mc.setFilterRedundantCalls;
                                        if (lKVar2 == null) {
                                            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                        } else {
                                            lKVar = lKVar2;
                                        }
                                        C0358os c0358os = C0358os.setIconTintList;
                                        pN.setY(c0358os, "");
                                        lKVar.setIconTintList = c0358os;
                                        lKVar.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                                        C0288mc.setX(c0288mc).MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(0);
                                    } else if (mAVar instanceof mA.setY) {
                                        lK lKVar3 = c0288mc.setFilterRedundantCalls;
                                        if (lKVar3 == null) {
                                            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                        } else {
                                            lKVar = lKVar3;
                                        }
                                        List<kP> list = ((mA.setY) mAVar).setIconTintList;
                                        pN.setY(list, "");
                                        lKVar.setIconTintList = list;
                                        lKVar.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                                        C0288mc.setX(c0288mc).MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(8);
                                    } else if (mAVar instanceof mA$MenuHostHelper$$ExternalSyntheticLambda1) {
                                        Toast.makeText(C0288mc.setX(c0288mc).setNavigationOnClickListener.getContext(), ((mA$MenuHostHelper$$ExternalSyntheticLambda1) mAVar).setIconTintList, 0).show();
                                        C0288mc.setX(c0288mc).MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(8);
                                    }
                                }
                                return nX.setX;
                            }
                        }, this) == oJVar) {
                            return oJVar;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                throw new nN();
            }
        }

        /* renamed from: o.mc$setIconTintList$3 */
        /* loaded from: classes.dex */
        public static final class AnonymousClass3 extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
            private int MenuHostHelper$$ExternalSyntheticLambda1;
            private /* synthetic */ C0288mc setIconTintList;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(C0288mc c0288mc, oK<? super AnonymousClass3> oKVar) {
                super(2, oKVar);
                this.setIconTintList = c0288mc;
            }

            @Override // o.oR
            public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
                return new AnonymousClass3(this.setIconTintList, oKVar);
            }

            @Override // o.InterfaceC0389pw
            public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
                return new AnonymousClass3(this.setIconTintList, oKVar).setY(nX.setX);
            }

            @Override // o.oR
            public final Object setY(Object obj) {
                oJ oJVar = oJ.COROUTINE_SUSPENDED;
                int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    if (obj instanceof nR.setX) {
                        throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                } else if (obj instanceof nR.setX) {
                    throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                } else {
                    setTitleMarginTop settitlemargintop = this.setIconTintList.setTitleMarginEnd$781c81df;
                    if (settitlemargintop == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                        settitlemargintop = null;
                    }
                    try {
                        Object obj2 = C0289md.setTextScaleX.get(383197869);
                        if (obj2 == null) {
                            obj2 = ((Class) C0289md.setY((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4)).getMethod("MenuHostHelper$$ExternalSyntheticLambda0", null);
                            C0289md.setTextScaleX.put(383197869, obj2);
                        }
                        tF tFVar = (tF) ((Method) obj2).invoke(settitlemargintop, null);
                        final C0288mc c0288mc = this.setIconTintList;
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
                        if (tFVar.setIconTintList(new InterfaceC0498tx() { // from class: o.mc.setIconTintList.3.1
                            @Override // o.InterfaceC0498tx
                            public final /* synthetic */ Object setIconTintList(Object obj3, oK oKVar) {
                                mA mAVar = (mA) obj3;
                                if (mAVar instanceof mA$MenuHostHelper$$ExternalSyntheticLambda0) {
                                    C0288mc.setX(c0288mc).MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(8);
                                } else if (mAVar instanceof mA.setIconTintList) {
                                    C0288mc.setX(c0288mc).MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(0);
                                    C0288mc.setX(c0288mc).setLayoutAnimation.setVisibility(0);
                                } else if (mAVar instanceof mA.setY) {
                                    lM lMVar = c0288mc.onActivityResumed;
                                    if (lMVar == null) {
                                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                        lMVar = null;
                                    }
                                    List<kP> list = ((mA.setY) mAVar).setIconTintList;
                                    pN.setY(list, "");
                                    lMVar.MenuHostHelper$$ExternalSyntheticLambda0 = list;
                                    lMVar.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                                    C0288mc.setX(c0288mc).setLayoutAnimation.setVisibility(0);
                                    C0288mc.setX(c0288mc).MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(8);
                                } else if (mAVar instanceof mA$MenuHostHelper$$ExternalSyntheticLambda1) {
                                    C0288mc.setX(c0288mc).setLayoutAnimation.setVisibility(8);
                                    C0288mc.setX(c0288mc).MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(8);
                                    Toast.makeText(C0288mc.setX(c0288mc).setNavigationOnClickListener.getContext(), ((mA$MenuHostHelper$$ExternalSyntheticLambda1) mAVar).setIconTintList, 0).show();
                                }
                                return nX.setX;
                            }
                        }, this) == oJVar) {
                            return oJVar;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                throw new nN();
            }
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(rU rUVar, oK<? super nX> oKVar) {
            setIconTintList seticontintlist = new setIconTintList(oKVar);
            seticontintlist.setX = rUVar;
            return seticontintlist.setY(nX.setX);
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            if (!(obj instanceof nR.setX)) {
                rU rUVar = (rU) this.setX;
                C0435ro.MenuHostHelper$$ExternalSyntheticLambda1(rUVar, null, null, new AnonymousClass2(C0288mc.this, null), 3);
                C0435ro.MenuHostHelper$$ExternalSyntheticLambda1(rUVar, null, null, new AnonymousClass3(C0288mc.this, null), 3);
                return nX.setX;
            }
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0288mc c0288mc) {
        pN.setY(c0288mc, "");
        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(c0288mc.FragmentStateAdapter$5());
        setbackgroundtintlist.setIconTintList(R.id.res_0x7f0a00d5, new C0295mj(), null, 2);
        if (!setbackgroundtintlist.setX) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        setbackgroundtintlist.setTextAlignment = "search";
        setbackgroundtintlist.setX();
    }

    public static final /* synthetic */ kZ setX(C0288mc c0288mc) {
        kZ kZVar = c0288mc.setHint;
        pN.setX(kZVar);
        return kZVar;
    }
}