package o;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.reflect.Method;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public abstract class setCompoundDrawables extends setMinAndMaxProgress {
    private FrameLayout ViewPager$SavedState$1;
    private ImageView setCenterIfNoTextEnabled;
    private getRotation setChipCornerRadius;
    private View setIconSize;
    private ImageView setTextAlignment;
    Animator setUnboundedRipple;
    public static final byte[] $$m = {0, Byte.MIN_VALUE, -111, -10, 6};
    public static final int $$n = 2;
    public static final byte[] $$g = {116, 44, -28, -115, -11, 18, -24, -62, 65, -38, -62, 75, -1, -75, 44, 27, 12, 10, -42, 42, 7, 4, -41, 32, 10, 7, -8, 16, -75, 3, 36, 54, -1, -12, 16, -1, -10, 14, -22, 41, -8, 9, -9, 0, 18, -8, -3, -20, 24, 15, -8, 5, 0, -46};
    public static final int $$h = 138;
    public static final byte[] $$a = {25, 16, -94, 28, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 156;
    private static byte[] setAnimationFromJson = {93, 18, 67, -65, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setOnLongClickListener = setAnimationFromJson.setY.wrap;
    private static long setTextScaleX = 288946616539298331L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0039). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = o.setCompoundDrawables.$$a
            int r8 = r8 * 38
            int r8 = 115 - r8
            int r6 = 40 - r6
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L39
        L19:
            r3 = 0
            r5 = r8
            r8 = r7
            r7 = r5
        L1d:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L39:
            int r8 = r8 + r6
            int r6 = r8 + (-13)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCompoundDrawables.b(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = 106 - r7
            int r5 = r5 * 3
            int r5 = r5 + 16
            byte[] r0 = o.setCompoundDrawables.setAnimationFromJson
            int r6 = r6 * 15
            int r6 = r6 + 4
            byte[] r1 = new byte[r5]
            int r5 = r5 + (-1)
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = 0
            goto L28
        L16:
            r3 = 0
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + 2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCompoundDrawables.d(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 41
            int r8 = 45 - r8
            int r7 = r7 + 4
            byte[] r0 = o.setCompoundDrawables.$$g
            int r9 = r9 * 4
            int r9 = r9 + 111
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L18
            r9 = r7
            r3 = r1
            r5 = 0
            r1 = r0
            r0 = r10
            r10 = r8
            goto L37
        L18:
            r3 = 0
            r6 = r8
            r8 = r7
            r7 = r9
            r9 = r6
        L1d:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L2e
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2e:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L37:
            int r7 = r7 + r8
            int r7 = r7 + (-3)
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCompoundDrawables.e(int, byte, int, java.lang.Object[]):void");
    }

    private static void f(byte b, short s, int i, Object[] objArr) {
        int i2 = (s * 3) + 1;
        int i3 = 112 - (b * 5);
        byte[] bArr = $$m;
        int i4 = 4 - (i * 4);
        byte[] bArr2 = new byte[i2];
        int i5 = -1;
        int i6 = i2 - 1;
        if (bArr == null) {
            i3 += i4;
            i4 = i4;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i8 = i4 + 1;
            i3 = bArr[i8] + i3;
            i4 = i8;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i5 = i7;
        }
    }

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode);

    /* JADX WARN: Removed duplicated region for block: B:30:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0522 A[Catch: Exception -> 0x0953, TRY_LEAVE, TryCatch #10 {Exception -> 0x0953, blocks: (B:55:0x04e5, B:57:0x0522), top: B:117:0x04e5 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x06cc A[Catch: all -> 0x0941, TryCatch #0 {all -> 0x0941, blocks: (B:62:0x06ae, B:66:0x071f, B:65:0x06cc), top: B:97:0x06ae }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x08a2  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x093a A[ORIG_RETURN, RETURN] */
    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r29) {
        /*
            Method dump skipped, instructions count: 2399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCompoundDrawables.attachBaseContext(android.content.Context):void");
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.content.ContextWrapper
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    public abstract setProgressBackgroundTintBlendMode setMaxEms();

    public static final /* synthetic */ ImageView MenuHostHelper$$ExternalSyntheticLambda0(setCompoundDrawables setcompounddrawables) {
        ImageView imageView = setcompounddrawables.setCenterIfNoTextEnabled;
        if (imageView == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        return imageView;
    }

    public static final /* synthetic */ ImageView MenuHostHelper$$ExternalSyntheticLambda1(setCompoundDrawables setcompounddrawables) {
        ImageView imageView = setcompounddrawables.setTextAlignment;
        if (imageView == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        return imageView;
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, o.MenuHostHelper$$ExternalSyntheticLambda0, o.setCollapseContentDescription, android.app.Activity
    public void onCreate(Bundle bundle) {
        setSimpleItemSelectedRippleColor setsimpleitemselectedripplecolor;
        super.onCreate(bundle);
        setSimpleItemSelectedRippleColor$MenuHostHelper$$ExternalSyntheticLambda1 setsimpleitemselectedripplecolor_menuhosthelper__externalsyntheticlambda1 = setSimpleItemSelectedRippleColor.setIconTintList;
        setsimpleitemselectedripplecolor = setSimpleItemSelectedRippleColor.setY;
        setProgressBackgroundTintBlendMode maxEms = setMaxEms();
        pN.setY(this, "");
        pN.setY(maxEms, "");
        setsimpleitemselectedripplecolor.MenuHostHelper$$ExternalSyntheticLambda0 = this;
        setsimpleitemselectedripplecolor.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList((setCompatElevationResource<setProgressBackgroundTintBlendMode>) maxEms);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle, PersistableBundle persistableBundle) {
        setSimpleItemSelectedRippleColor setsimpleitemselectedripplecolor;
        super.onCreate(bundle, persistableBundle);
        setSimpleItemSelectedRippleColor$MenuHostHelper$$ExternalSyntheticLambda1 setsimpleitemselectedripplecolor_menuhosthelper__externalsyntheticlambda1 = setSimpleItemSelectedRippleColor.setIconTintList;
        setsimpleitemselectedripplecolor = setSimpleItemSelectedRippleColor.setY;
        setProgressBackgroundTintBlendMode maxEms = setMaxEms();
        pN.setY(this, "");
        pN.setY(maxEms, "");
        setsimpleitemselectedripplecolor.MenuHostHelper$$ExternalSyntheticLambda0 = this;
        setsimpleitemselectedripplecolor.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList((setCompatElevationResource<setProgressBackgroundTintBlendMode>) maxEms);
    }

    @Override // o.setMinAndMaxProgress, o.setEndIconContentDescription, android.app.Activity
    public void onStart() {
        setSimpleItemSelectedRippleColor setsimpleitemselectedripplecolor;
        super.onStart();
        setSimpleItemSelectedRippleColor$MenuHostHelper$$ExternalSyntheticLambda1 setsimpleitemselectedripplecolor_menuhosthelper__externalsyntheticlambda1 = setSimpleItemSelectedRippleColor.setIconTintList;
        setsimpleitemselectedripplecolor = setSimpleItemSelectedRippleColor.setY;
        setProgressBackgroundTintBlendMode MenuHostHelper$$ExternalSyntheticLambda1 = setsimpleitemselectedripplecolor.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }

    @Override // o.setMinAndMaxProgress, o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void setContentView(int i) {
        setTextAppearanceResource();
        FrameLayout frameLayout = this.ViewPager$SavedState$1;
        if (frameLayout == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        frameLayout.addView(LayoutInflater.from(this).inflate(i, (ViewGroup) null));
        View view = this.setIconSize;
        if (view == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        super.setContentView(view);
    }

    @Override // o.setMinAndMaxProgress, o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void setContentView(View view) {
        setTextAppearanceResource();
        FrameLayout frameLayout = this.ViewPager$SavedState$1;
        if (frameLayout == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        frameLayout.addView(view);
        View view2 = this.setIconSize;
        if (view2 == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        super.setContentView(view2);
    }

    @Override // o.setMinAndMaxProgress, o.MenuHostHelper$$ExternalSyntheticLambda0, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        setTextAppearanceResource();
        FrameLayout frameLayout = this.ViewPager$SavedState$1;
        if (frameLayout == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        frameLayout.addView(view, layoutParams);
        View view2 = this.setIconSize;
        if (view2 == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        super.setContentView(view2);
    }

    private final void setTextAppearanceResource() {
        View inflate = LayoutInflater.from(this).inflate(R.layout.res_0x7f0d001f, (ViewGroup) null);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) inflate, "");
        this.setIconSize = inflate;
        if (inflate == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        View findViewById = inflate.findViewById(R.id.res_0x7f0a010e);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) findViewById, "");
        this.ViewPager$SavedState$1 = (FrameLayout) findViewById;
        View view = this.setIconSize;
        if (view == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        View findViewById2 = view.findViewById(R.id.res_0x7f0a00d8);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) findViewById2, "");
        this.setCenterIfNoTextEnabled = (ImageView) findViewById2;
        View view2 = this.setIconSize;
        if (view2 == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        View findViewById3 = view2.findViewById(R.id.res_0x7f0a005f);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) findViewById3, "");
        this.setTextAlignment = (ImageView) findViewById3;
    }

    public final void setIconTintList(setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, setTextSelectHandleLeft settextselecthandleleft, long j, boolean z) {
        pN.setY(setprogressbackgroundtintblendmode, "");
        pN.setY(settextselecthandleleft, "");
        ImageView imageView = this.setCenterIfNoTextEnabled;
        if (imageView == null) {
            pN.MenuHostHelper$$ExternalSyntheticLambda1("");
        }
        if (imageView.getVisibility() != 0) {
            ImageView imageView2 = this.setTextAlignment;
            if (imageView2 == null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda1("");
            }
            if (imageView2.getVisibility() != 0) {
                Animator animator = this.setUnboundedRipple;
                boolean z2 = true;
                if ((animator == null || !animator.isRunning()) ? false : false) {
                    return;
                }
                FrameLayout frameLayout = this.ViewPager$SavedState$1;
                if (frameLayout == null) {
                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                }
                float measuredWidth = frameLayout.getMeasuredWidth();
                FrameLayout frameLayout2 = this.ViewPager$SavedState$1;
                if (frameLayout2 == null) {
                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                }
                float measuredHeight = frameLayout2.getMeasuredHeight();
                Bitmap createBitmap = Bitmap.createBitmap((int) measuredWidth, (int) measuredHeight, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                FrameLayout frameLayout3 = this.ViewPager$SavedState$1;
                if (frameLayout3 == null) {
                    pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                }
                frameLayout3.draw(canvas);
                MenuHostHelper$$ExternalSyntheticLambda1(setprogressbackgroundtintblendmode);
                float hypot = (float) Math.hypot(measuredWidth, measuredHeight);
                if (z) {
                    ImageView imageView3 = this.setCenterIfNoTextEnabled;
                    if (imageView3 == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    }
                    imageView3.setImageBitmap(createBitmap);
                    ImageView imageView4 = this.setCenterIfNoTextEnabled;
                    if (imageView4 == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    }
                    imageView4.setVisibility(0);
                    ImageView imageView5 = this.setCenterIfNoTextEnabled;
                    if (imageView5 == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    }
                    this.setUnboundedRipple = ViewAnimationUtils.createCircularReveal(imageView5, settextselecthandleleft.setIconTintList, settextselecthandleleft.setY, hypot, 0.0f);
                } else {
                    ImageView imageView6 = this.setTextAlignment;
                    if (imageView6 == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    }
                    imageView6.setImageBitmap(createBitmap);
                    ImageView imageView7 = this.setTextAlignment;
                    if (imageView7 == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    }
                    imageView7.setVisibility(0);
                    FrameLayout frameLayout4 = this.ViewPager$SavedState$1;
                    if (frameLayout4 == null) {
                        pN.MenuHostHelper$$ExternalSyntheticLambda1("");
                    }
                    this.setUnboundedRipple = ViewAnimationUtils.createCircularReveal(frameLayout4, settextselecthandleleft.setIconTintList, settextselecthandleleft.setY, 0.0f, hypot);
                }
                Animator animator2 = this.setUnboundedRipple;
                if (animator2 != null) {
                    animator2.setDuration(j);
                }
                Animator animator3 = this.setUnboundedRipple;
                if (animator3 != null) {
                    animator3.addListener(new setX());
                }
                Animator animator4 = this.setUnboundedRipple;
                if (animator4 != null) {
                    animator4.start();
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class setX implements Animator.AnimatorListener {
        setX() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            pN.setY(animator, "");
            getRotation getrotation = setCompoundDrawables.this.setChipCornerRadius;
            if (getrotation != null) {
                getrotation.setX(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            pN.setY(animator, "");
            setCompoundDrawables.MenuHostHelper$$ExternalSyntheticLambda1(setCompoundDrawables.this).setImageDrawable(null);
            setCompoundDrawables.MenuHostHelper$$ExternalSyntheticLambda0(setCompoundDrawables.this).setImageDrawable(null);
            setCompoundDrawables.MenuHostHelper$$ExternalSyntheticLambda0(setCompoundDrawables.this).setVisibility(8);
            setCompoundDrawables.MenuHostHelper$$ExternalSyntheticLambda1(setCompoundDrawables.this).setVisibility(8);
            getRotation getrotation = setCompoundDrawables.this.setChipCornerRadius;
            if (getrotation != null) {
                getrotation.setIconTintList(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            pN.setY(animator, "");
            getRotation getrotation = setCompoundDrawables.this.setChipCornerRadius;
            if (getrotation != null) {
                getrotation.setY(animator);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
            pN.setY(animator, "");
            getRotation getrotation = setCompoundDrawables.this.setChipCornerRadius;
            if (getrotation != null) {
                getrotation.MenuHostHelper$$ExternalSyntheticLambda0(animator);
            }
        }
    }

    public final void setX(getRotation getrotation) {
        pN.setY(getrotation, "");
        this.setChipCornerRadius = getrotation;
    }

    private static void c(int i, char[] cArr, Object[] objArr) {
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
                    byte b = $$m[0];
                    Object[] objArr3 = new Object[1];
                    f((byte) ($$n - 1), b, b, objArr3);
                    obj = ((Class) jC.setY((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 288, (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 4 - TextUtils.getOffsetAfter("", 0))).getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    jC.setTextScaleX.put(442390202, obj);
                }
                jArr[i2] = ((Long) ((Method) obj).invoke(null, objArr2)).longValue() ^ (setTextScaleX ^ (-34803645974414051L));
                try {
                    Object[] objArr4 = {jBVar, jBVar};
                    Object obj2 = jC.setTextScaleX.get(-1983260643);
                    if (obj2 == null) {
                        byte b2 = $$m[0];
                        byte b3 = b2;
                        Object[] objArr5 = new Object[1];
                        f(b2, b3, b3, objArr5);
                        obj2 = ((Class) jC.setY((ViewConfiguration.getTouchSlop() >> 8) + 321, (char) (Process.getGidForName("") + 501), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 4)).getMethod((String) objArr5[0], Object.class, Object.class);
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
                    byte b4 = $$m[0];
                    byte b5 = b4;
                    Object[] objArr7 = new Object[1];
                    f(b4, b5, b5, objArr7);
                    obj3 = ((Class) jC.setY(322 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (char) (501 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 4)).getMethod((String) objArr7[0], Object.class, Object.class);
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