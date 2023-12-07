package com.rmldemo.guardsquare.ui.activity;

import android.animation.Animator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.media.AudioTrack;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Locale;
import o.C0288mc;
import o.C0291mf;
import o.R;
import o.getRotation;
import o.jB;
import o.jC;
import o.kU;
import o.lA;
import o.lD;
import o.lF;
import o.lH;
import o.lW;
import o.lX;
import o.mB;
import o.pN;
import o.setBackgroundTintList;
import o.setCompoundDrawables;
import o.setProgressBackgroundTintBlendMode;

/* loaded from: classes.dex */
public final class MainActivity extends setCompoundDrawables implements lH, getRotation {
    public kU setChipCornerRadius;
    private SharedPreferences setTextAlignment;
    public static final byte[] $$p = {44, -51, -23, -10};
    public static final int $$q = 137;
    public static final byte[] $$j = {116, 44, -28, -115, 59, -70, 23, 8, -21, 37, -32, -18, -5, 20, -27, -11, -12, 34, -35, -16, -7, 8, -21, 22, 59, -71, -7, 59, -68, 35, -30, -15, -13, 39, -45, -10, -7, 38, -35, -13, -10, 5, -19, 72, -6, -39, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43, 59, -57, 26, 23, -47, -30, -15, -13, 39, -45, -10, -7, 38, -35, -13, -10, 5, -19, 72, -6, -39, -57, -2, 9, -19, -2, 7, -17, 19, -44, 5, -12, 6, -3, -21, 5, 0, 17, -27, -18, 5, -8, -3, 43};
    public static final int $$k = 67;
    public static final byte[] $$d = {8, 17, -121, -18, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$e = 52;
    private static byte[] ViewPager$SavedState$1 = {53, 93, -14, -126, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12, 2, 19, -47, 51, 4, 0, 1, -2, 2, 23, -7, 10, 3, -33, 41, -4, 13};
    public static final int setIconSize = 129;
    private static long setCenterIfNoTextEnabled = 7637518807340245716L;

    private static void h(int i, int i2, byte b, Object[] objArr) {
        int i3 = i + 4;
        int i4 = i2 + 4;
        byte[] bArr = $$d;
        int i5 = 115 - (b * 38);
        byte[] bArr2 = new byte[i3];
        int i6 = -1;
        int i7 = i3 - 1;
        if (bArr == null) {
            i5 = (i7 + i5) - 13;
            i7 = i7;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i5 = (i5 + bArr[i4]) - 13;
            i7 = i7;
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = 55 - r9
            int r8 = r8 + 97
            int r7 = r7 + 16
            byte[] r0 = com.rmldemo.guardsquare.ui.activity.MainActivity.ViewPager$SavedState$1
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L31
        L13:
            r3 = 0
        L14:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L31:
            int r10 = r10 + r8
            int r8 = r10 + (-4)
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.MainActivity.i(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = 45 - r6
            int r8 = r8 * 2
            int r8 = 115 - r8
            byte[] r0 = com.rmldemo.guardsquare.ui.activity.MainActivity.$$j
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L34
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r6 = -r6
            int r9 = r9 + r6
            int r6 = r8 + 1
            int r8 = r9 + (-6)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.MainActivity.j(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r5 = r5 * 5
            int r5 = 112 - r5
            byte[] r0 = com.rmldemo.guardsquare.ui.activity.MainActivity.$$p
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r7
            r3 = 0
            goto L2a
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r7]
            int r3 = r3 + 1
        L2a:
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.MainActivity.k(short, byte, short, java.lang.Object[]):void");
    }

    @Override // o.getRotation
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Animator animator) {
        pN.setY(animator, "");
    }

    @Override // o.setCompoundDrawables, o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // o.setCompoundDrawables, o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper
    public final Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // o.setCompoundDrawables, o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return super.getResources();
    }

    @Override // o.setCompoundDrawables, o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public final void onPause() {
        super.onPause();
    }

    @Override // o.setCompoundDrawables, o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public final void onResume() {
        super.onResume();
    }

    @Override // o.getRotation
    public final void setX(Animator animator) {
        pN.setY(animator, "");
    }

    @Override // o.getRotation
    public final void setY(Animator animator) {
        pN.setY(animator, "");
    }

    @Override // o.setCompoundDrawables
    public final setProgressBackgroundTintBlendMode setMaxEms() {
        SharedPreferences sharedPreferences = getApplicationContext().getSharedPreferences("shared", 0);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sharedPreferences, "");
        pN.setY(sharedPreferences, "");
        this.setTextAlignment = sharedPreferences;
        if (sharedPreferences == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            sharedPreferences = null;
        }
        if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sharedPreferences.getString("mode", ""), (Object) "night")) {
            return new lF();
        }
        return new lD();
    }

    @Override // o.setCompoundDrawables, o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        String string;
        mB mBVar = mB.setIconTintList;
        pN.setX(context);
        pN.setY(context, "");
        String language = Locale.getDefault().getLanguage();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) language, "");
        string = PreferenceManager.getDefaultSharedPreferences(context).getString("Locale.Helper.Selected.Language", language);
        mB.setX(context, string);
        super.attachBaseContext(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0a82 A[Catch: Exception -> 0x0dec, TRY_LEAVE, TryCatch #1 {Exception -> 0x0dec, blocks: (B:153:0x0a3e, B:155:0x0a82), top: B:239:0x0a3e }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0ae5  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0b6f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0ccd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0d78  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0797 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0709 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0b75 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0413 A[Catch: Exception -> 0x0e10, TRY_LEAVE, TryCatch #13 {Exception -> 0x0e10, blocks: (B:60:0x03d2, B:62:0x0413), top: B:263:0x03d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04d5 A[Catch: all -> 0x0dfe, TryCatch #11 {all -> 0x0dfe, blocks: (B:67:0x04bb, B:71:0x0525, B:70:0x04d5), top: B:259:0x04bb }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06a8 A[Catch: Exception -> 0x0df2, TRY_LEAVE, TryCatch #5 {Exception -> 0x0df2, blocks: (B:85:0x0661, B:87:0x06a8), top: B:247:0x0661 }] */
    @Override // o.setCompoundDrawables, o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 3814
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.rmldemo.guardsquare.ui.activity.MainActivity.onCreate(android.os.Bundle):void");
    }

    @Override // o.setCompoundDrawables
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode) {
        pN.setY(setprogressbackgroundtintblendmode, "");
        lA lAVar = (lA) setprogressbackgroundtintblendmode;
        kU kUVar = this.setChipCornerRadius;
        if (kUVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            kUVar = null;
        }
        kUVar.MenuHostHelper$$ExternalSyntheticLambda1.setBackgroundColor(lAVar.setY(this));
    }

    @Override // o.lH
    public final void setGuidelinePercent() {
        kU kUVar = this.setChipCornerRadius;
        if (kUVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            kUVar = null;
        }
        kUVar.MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(8);
    }

    @Override // o.lH
    public final void setLayoutDirection() {
        kU kUVar = this.setChipCornerRadius;
        if (kUVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            kUVar = null;
        }
        kUVar.MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(0);
    }

    @Override // o.lH
    public final void setTextAppearanceResource() {
        onBackPressed();
    }

    @Override // o.lH
    public final void setMinAndMaxProgress() {
        recreate();
    }

    @Override // o.getRotation
    public final void setIconTintList(Animator animator) {
        pN.setY(animator, "");
        kU kUVar = this.setChipCornerRadius;
        if (kUVar == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            kUVar = null;
        }
        kUVar.setY.setVisibility(8);
    }

    public static /* synthetic */ boolean MenuHostHelper$$ExternalSyntheticLambda0(MainActivity mainActivity, MenuItem menuItem) {
        lX lXVar;
        pN.setY(mainActivity, "");
        pN.setY(menuItem, "");
        switch (menuItem.getItemId()) {
            case R.id.res_0x7f0a0063 /* 2131361891 */:
                lXVar = new lX();
                break;
            case R.id.res_0x7f0a0070 /* 2131361904 */:
                lXVar = new lW();
                break;
            case R.id.res_0x7f0a00e8 /* 2131362024 */:
                lXVar = new C0288mc();
                break;
            case R.id.res_0x7f0a0175 /* 2131362165 */:
                lXVar = new C0291mf();
                break;
            default:
                lXVar = new C0288mc();
                break;
        }
        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(mainActivity.setOnNavigationItemSelectedListener());
        setbackgroundtintlist.setIconTintList(R.id.res_0x7f0a00d5, lXVar, null, 2);
        setbackgroundtintlist.setX();
        return true;
    }

    private static void g(int i, char[] cArr, Object[] objArr) {
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
                    byte b = (byte) ($$q & 7);
                    byte b2 = (byte) (b - 1);
                    Object[] objArr3 = new Object[1];
                    k(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 288, (char) TextUtils.getOffsetBefore("", 0), 5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    jC.setTextScaleX.put(442390202, obj);
                }
                jArr[i2] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (setCenterIfNoTextEnabled ^ (-34803645974414051L));
                try {
                    Object[] objArr4 = {jBVar, jBVar};
                    Object obj2 = jC.setTextScaleX.get(-1983260643);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Object[] objArr5 = new Object[1];
                        k(b3, b4, b4, objArr5);
                        obj2 = ((Class) jC.setY((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 322, (char) (500 - (ViewConfiguration.getPressedStateDuration() >> 16)), (KeyEvent.getMaxKeyCode() >> 16) + 4)).getMethod((String) objArr5[0], Object.class, Object.class);
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
                    k(b5, b6, b6, objArr7);
                    obj3 = ((Class) jC.setY(321 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 500), 4 - View.MeasureSpec.makeMeasureSpec(0, 0))).getMethod((String) objArr7[0], Object.class, Object.class);
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