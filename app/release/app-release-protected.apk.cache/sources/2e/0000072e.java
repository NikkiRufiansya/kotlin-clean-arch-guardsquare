package o;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.preference.PreferenceManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.rmldemo.guardsquare.ui.activity.MainActivity;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Locale;
import o.lM;
import o.mA;
import o.nR;
import o.pY;

/* renamed from: o.mj */
/* loaded from: classes.dex */
public final class C0295mj extends setWebViewRenderProcessClient {
    @nE
    public C0304ms FirebaseRemoteConfigKtxRegistrar;
    private C0264ld setError;
    private lM setHint;
    private boolean setTitleMarginEnd = true;
    private boolean setTooltipText = true;

    @Override // o.setWebViewRenderProcessClient, o.setDropDownBackgroundResource
    public final void setX(Bundle bundle) {
        super.setX(bundle);
        this.setHint = new lM(new lM.setX() { // from class: o.mj$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // o.lM.setX
            public final void setX(kP kPVar) {
                pN.setY(kPVar, "");
                finalize x = new setBackgroundTintList(C0295mj.this.FragmentStateAdapter$5()).setX(lP.class, dump.MenuHostHelper$$ExternalSyntheticLambda1(new nT("news", kPVar)));
                if (!x.setX) {
                    throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                }
                x.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                x.setTextAlignment = "article";
                x.setX();
            }
        });
    }

    /* JADX WARN: Type inference failed for: r14v16, types: [T, java.lang.String] */
    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ?? string;
        pN.setY(layoutInflater, "");
        View inflate = FragmentStateAdapter$2().inflate(R.layout.res_0x7f0d0037, viewGroup, false);
        int i = R.id.res_0x7f0a00a1;
        TextView textView = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a00a1);
        if (textView != null) {
            ImageView imageView = (ImageView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0128);
            if (imageView != null) {
                ProgressBar progressBar = (ProgressBar) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a0176);
                if (progressBar != null) {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a018f);
                    if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                        setScrimVisibleHeightTrigger setscrimvisibleheighttrigger = (setScrimVisibleHeightTrigger) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a019f);
                        if (setscrimvisibleheighttrigger != null) {
                            EditText editText = (EditText) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01a2);
                            if (editText != null) {
                                TextView textView2 = (TextView) setDividerDrawableHorizontal.setX(inflate, R.id.res_0x7f0a01fc);
                                if (textView2 != null) {
                                    this.setError = new C0264ld((setVelocityScale) inflate, textView, imageView, progressBar, windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, setscrimvisibleheighttrigger, editText, textView2);
                                    C0311mz.setY.setX().setIconTintList(this);
                                    lH lHVar = (lH) setAnimationFromJson();
                                    if (lHVar != null) {
                                        lHVar.setGuidelinePercent();
                                    }
                                    if (this.setTitleMarginEnd) {
                                        C0264ld c0264ld = this.setError;
                                        pN.setX(c0264ld);
                                        c0264ld.setOnLongClickListener.post(new Runnable() { // from class: o.mk
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                C0295mj.MenuHostHelper$$ExternalSyntheticLambda0(C0295mj.this);
                                            }
                                        });
                                    }
                                    final pY.setX setx = new pY.setX();
                                    mB mBVar = mB.setIconTintList;
                                    C0264ld c0264ld2 = this.setError;
                                    pN.setX(c0264ld2);
                                    Context context = c0264ld2.setIconTintList.getContext();
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
                                    C0264ld c0264ld3 = this.setError;
                                    pN.setX(c0264ld3);
                                    c0264ld3.setOnLongClickListener.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: o.mj$MenuHostHelper$$ExternalSyntheticLambda0
                                        @Override // android.widget.TextView.OnEditorActionListener
                                        public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                                            if (i2 == 6) {
                                                C0304ms c0304ms = C0295mj.this.FirebaseRemoteConfigKtxRegistrar;
                                                if (c0304ms == null) {
                                                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                                    c0304ms = null;
                                                }
                                                String valueOf = String.valueOf(textView3 != null ? textView3.getText() : null);
                                                String str = setx.setX;
                                                pN.setY(valueOf, "");
                                                pN.setY(str, "");
                                                if (c0304ms.setY.setX()) {
                                                    c0304ms.setX.MenuHostHelper$$ExternalSyntheticLambda1(mA.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0);
                                                    C0435ro.MenuHostHelper$$ExternalSyntheticLambda1(setDebugMode.setX(c0304ms), null, null, new ms$MenuHostHelper$$ExternalSyntheticLambda0(c0304ms, valueOf, str, null), 3);
                                                } else {
                                                    c0304ms.setX.MenuHostHelper$$ExternalSyntheticLambda1(new mA$MenuHostHelper$$ExternalSyntheticLambda1("Internet not connected!"));
                                                }
                                                C0295mj.MenuHostHelper$$ExternalSyntheticLambda1(C0295mj.this);
                                                return true;
                                            }
                                            return false;
                                        }
                                    });
                                    this.setTitleMarginEnd = false;
                                    lM lMVar = null;
                                    if (this.setTooltipText) {
                                        setTouchDelegate shrinkMotionSpec = setShrinkMotionSpec();
                                        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) shrinkMotionSpec, "");
                                        C0435ro.MenuHostHelper$$ExternalSyntheticLambda1(setFabAnimationMode.setX(shrinkMotionSpec), null, null, new setY(null), 3);
                                        this.setTooltipText = false;
                                    }
                                    C0264ld c0264ld4 = this.setError;
                                    pN.setX(c0264ld4);
                                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = c0264ld4.setX;
                                    lM lMVar2 = this.setHint;
                                    if (lMVar2 == null) {
                                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                    } else {
                                        lMVar = lMVar2;
                                    }
                                    windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setAdapter(lMVar);
                                    C0264ld c0264ld5 = this.setError;
                                    pN.setX(c0264ld5);
                                    setVelocityScale setvelocityscale = c0264ld5.setIconTintList;
                                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) setvelocityscale, "");
                                    return setvelocityscale;
                                }
                                i = R.id.res_0x7f0a01fc;
                            } else {
                                i = R.id.res_0x7f0a01a2;
                            }
                        } else {
                            i = R.id.res_0x7f0a019f;
                        }
                    } else {
                        i = R.id.res_0x7f0a018f;
                    }
                } else {
                    i = R.id.res_0x7f0a0176;
                }
            } else {
                i = R.id.res_0x7f0a0128;
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
            C0264ld c0264ld = this.setError;
            pN.setX(c0264ld);
            c0264ld.setIconTintList.setBackgroundColor(lAVar.setX(checkedIconEnabled));
            C0264ld c0264ld2 = this.setError;
            pN.setX(c0264ld2);
            c0264ld2.setY.setCardBackgroundColor(lAVar.setIconTintList(checkedIconEnabled));
            C0264ld c0264ld3 = this.setError;
            pN.setX(c0264ld3);
            c0264ld3.setUnboundedRipple.setTextColor(lAVar.MenuHostHelper$$ExternalSyntheticLambda1(checkedIconEnabled));
            C0264ld c0264ld4 = this.setError;
            pN.setX(c0264ld4);
            c0264ld4.MenuHostHelper$$ExternalSyntheticLambda1.setTextColor(lAVar.setLayoutAnimation(checkedIconEnabled));
        }
    }

    /* renamed from: o.mj$setY */
    /* loaded from: classes.dex */
    static final class setY extends AbstractC0368pb implements InterfaceC0389pw<rU, oK<? super nX>, Object> {
        private int setX;
        public static final byte[] $$g = {61, 16, -46, 32};
        public static final int $$h = 103;
        public static final byte[] $$d = {25, 60, 112, -12, 13, -16, 42, -27, -13, 0, 25, -22, -6, -7, 39, -30, -11, -2, 64, -63, 40};
        public static final int $$e = 224;
        public static final byte[] $$a = {104, -68, 0, 44, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
        public static final int $$b = 48;
        private static byte[] setIconTintList = {8, 17, -121, -18, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
        public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 209;
        private static long setY = -406649610294875349L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        setY(oK<? super setY> oKVar) {
            super(2, oKVar);
            C0295mj.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0029  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0029 -> B:23:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 * 38
                int r6 = r6 + 77
                int r8 = r8 + 4
                int r7 = r7 * 36
                int r7 = 40 - r7
                byte[] r0 = o.C0295mj.setY.$$a
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L34
            L19:
                r3 = 0
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r8 = r8 + 1
                if (r3 != r7) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                r4 = r0[r8]
                int r3 = r3 + 1
                r5 = r9
                r9 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L34:
                int r6 = r6 + r8
                int r6 = r6 + (-13)
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0295mj.setY.a(byte, short, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:23:0x0032). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = o.C0295mj.setY.setIconTintList
                int r8 = r8 * 15
                int r8 = r8 + 4
                int r6 = 106 - r6
                int r7 = r7 * 2
                int r7 = r7 + 16
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L32
            L19:
                r3 = 0
            L1a:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r9
                r9 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L32:
                int r6 = r6 - r8
                int r6 = r6 + 2
                int r8 = r9 + 1
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0295mj.setY.c(int, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:23:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 4
                int r7 = r7 + 111
                int r8 = r8 * 11
                int r8 = r8 + 4
                int r6 = r6 * 14
                int r6 = r6 + 4
                byte[] r0 = o.C0295mj.setY.$$d
                byte[] r1 = new byte[r8]
                r2 = -1
                int r8 = r8 + r2
                if (r0 != 0) goto L1a
                r3 = r1
                r4 = -1
                r1 = r0
                r0 = r9
                r9 = r8
                goto L34
            L1a:
                r3 = -1
            L1b:
                int r3 = r3 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L2b
                java.lang.String r6 = new java.lang.String
                r7 = 0
                r6.<init>(r1, r7)
                r9[r7] = r6
                return
            L2b:
                r4 = r0[r6]
                r5 = r9
                r9 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L34:
                int r8 = -r8
                int r7 = r7 + r8
                int r7 = r7 + r2
                int r6 = r6 + 1
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0295mj.setY.d(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x002c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002c -> B:23:0x0035). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(byte r7, int r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 5
                int r7 = 112 - r7
                byte[] r0 = o.C0295mj.setY.$$g
                int r9 = r9 * 4
                int r9 = 3 - r9
                int r8 = r8 * 2
                int r8 = 1 - r8
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L1a
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L35
            L1a:
                r3 = 0
            L1b:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r9 = r9 + 1
                if (r4 != r8) goto L2c
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2c:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r6
            L35:
                int r8 = -r8
                int r7 = r7 + r8
                r8 = r9
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0295mj.setY.e(byte, int, int, java.lang.Object[]):void");
        }

        @Override // o.oR
        public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
            return new setY(oKVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:86:0x0408  */
        @Override // o.InterfaceC0389pw
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* synthetic */ java.lang.Object MenuHostHelper$$ExternalSyntheticLambda0(o.rU r27, o.oK<? super o.nX> r28) {
            /*
                Method dump skipped, instructions count: 1236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0295mj.setY.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.Object, java.lang.Object):java.lang.Object");
        }

        @Override // o.oR
        public final Object setY(Object obj) {
            oJ oJVar = oJ.COROUTINE_SUSPENDED;
            int i = this.setX;
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
                C0304ms c0304ms = C0295mj.this.FirebaseRemoteConfigKtxRegistrar;
                if (c0304ms == null) {
                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    c0304ms = null;
                }
                final C0295mj c0295mj = C0295mj.this;
                this.setX = 1;
                if (c0304ms.setX.setIconTintList(new InterfaceC0498tx() { // from class: o.mj.setY.1
                    @Override // o.InterfaceC0498tx
                    public final /* synthetic */ Object setIconTintList(Object obj2, oK oKVar) {
                        mA mAVar = (mA) obj2;
                        if (mAVar instanceof mA$MenuHostHelper$$ExternalSyntheticLambda0) {
                            C0295mj.setY(c0295mj).MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(8);
                        } else {
                            lM lMVar = null;
                            if (mAVar instanceof mA.setIconTintList) {
                                C0295mj.setY(c0295mj).MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(0);
                                lM lMVar2 = c0295mj.setHint;
                                if (lMVar2 == null) {
                                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                } else {
                                    lMVar = lMVar2;
                                }
                                C0358os c0358os = C0358os.setIconTintList;
                                pN.setY(c0358os, "");
                                lMVar.MenuHostHelper$$ExternalSyntheticLambda0 = c0358os;
                                lMVar.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                            } else if (mAVar instanceof mA.setY) {
                                C0295mj.setY(c0295mj).MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(8);
                                mA.setY sety = (mA.setY) mAVar;
                                if (sety.setIconTintList.isEmpty()) {
                                    Toast.makeText(C0295mj.setY(c0295mj).setIconTintList.getContext(), "News not found!", 0).show();
                                }
                                lM lMVar3 = c0295mj.setHint;
                                if (lMVar3 == null) {
                                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                                } else {
                                    lMVar = lMVar3;
                                }
                                List<kP> list = sety.setIconTintList;
                                pN.setY(list, "");
                                lMVar.MenuHostHelper$$ExternalSyntheticLambda0 = list;
                                lMVar.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                            } else if (mAVar instanceof mA$MenuHostHelper$$ExternalSyntheticLambda1) {
                                C0295mj.setY(c0295mj).MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(8);
                                Toast.makeText(C0295mj.setY(c0295mj).setIconTintList.getContext(), ((mA$MenuHostHelper$$ExternalSyntheticLambda1) mAVar).setIconTintList, 0).show();
                            }
                        }
                        return nX.setX;
                    }
                }, this) == oJVar) {
                    return oJVar;
                }
            }
            throw new nN();
        }

        private static void b(int i, char[] cArr, Object[] objArr) {
            jB jBVar = new jB();
            jBVar.setY = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            jBVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            while (jBVar.MenuHostHelper$$ExternalSyntheticLambda0 < cArr.length) {
                int i2 = jBVar.MenuHostHelper$$ExternalSyntheticLambda0;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[jBVar.MenuHostHelper$$ExternalSyntheticLambda0]), jBVar, jBVar};
                    Object obj = jC.setTextScaleX.get(442390202);
                    if (obj == null) {
                        byte b = (byte) ($$h & 1);
                        byte b2 = (byte) (b - 1);
                        Object[] objArr3 = new Object[1];
                        e(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 289, (char) Color.alpha(0), View.getDefaultSize(0, 0) + 4)).getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                        jC.setTextScaleX.put(442390202, obj);
                    }
                    jArr[i2] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (setY ^ (-34803645974414051L));
                    try {
                        Object[] objArr4 = {jBVar, jBVar};
                        Object obj2 = jC.setTextScaleX.get(-1983260643);
                        if (obj2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            Object[] objArr5 = new Object[1];
                            e(b3, b4, b4, objArr5);
                            obj2 = ((Class) jC.setY(321 - (ViewConfiguration.getJumpTapTimeout() >> 16), (char) (500 - (Process.myTid() >> 22)), Color.blue(0) + 4)).getMethod((String) objArr5[0], Object.class, Object.class);
                            jC.setTextScaleX.put(-1983260643, obj2);
                        }
                        ((Method) obj2).invoke(null, objArr4);
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
            char[] cArr2 = new char[length];
            jBVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            while (jBVar.MenuHostHelper$$ExternalSyntheticLambda0 < cArr.length) {
                cArr2[jBVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) jArr[jBVar.MenuHostHelper$$ExternalSyntheticLambda0];
                try {
                    Object[] objArr6 = {jBVar, jBVar};
                    Object obj3 = jC.setTextScaleX.get(-1983260643);
                    if (obj3 == null) {
                        byte b5 = (byte) 0;
                        byte b6 = b5;
                        Object[] objArr7 = new Object[1];
                        e(b5, b6, b6, objArr7);
                        obj3 = ((Class) jC.setY((ViewConfiguration.getJumpTapTimeout() >> 16) + 321, (char) (ExpandableListView.getPackedPositionType(0L) + 500), 4 - Color.blue(0))).getMethod((String) objArr7[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-1983260643, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            objArr[0] = new String(cArr2);
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0295mj c0295mj) {
        pN.setY(c0295mj, "");
        C0264ld c0264ld = c0295mj.setError;
        pN.setX(c0264ld);
        c0264ld.setOnLongClickListener.requestFocus();
        setEndIconContentDescription animationFromJson = c0295mj.setAnimationFromJson();
        pN.setX(animationFromJson);
        Object systemService = ((MainActivity) animationFromJson).getSystemService("input_method");
        pN.setX(systemService);
        C0264ld c0264ld2 = c0295mj.setError;
        pN.setX(c0264ld2);
        ((InputMethodManager) systemService).showSoftInput(c0264ld2.setOnLongClickListener, 1);
    }

    public static final /* synthetic */ C0264ld setY(C0295mj c0295mj) {
        C0264ld c0264ld = c0295mj.setError;
        pN.setX(c0264ld);
        return c0264ld;
    }

    public static final /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(C0295mj c0295mj) {
        setEndIconContentDescription animationFromJson = c0295mj.setAnimationFromJson();
        pN.setX(animationFromJson);
        View currentFocus = ((MainActivity) animationFromJson).getCurrentFocus();
        if (currentFocus != null) {
            setEndIconContentDescription animationFromJson2 = c0295mj.setAnimationFromJson();
            pN.setX(animationFromJson2);
            Object systemService = ((MainActivity) animationFromJson2).getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            }
        }
    }
}