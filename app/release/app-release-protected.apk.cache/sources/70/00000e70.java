package o;

import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class setPasswordVisibilityToggleEnabled implements View.OnTouchListener {
    private static final int setOnLongClickListener = ViewConfiguration.getTapTimeout();
    public boolean MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setCenterIfNoTextEnabled;
    boolean setIconTintList;
    private int setLayoutAnimation;
    private boolean setNavigationOnClickListener;
    private Runnable setOnNavigationItemSelectedListener;
    private int setTextAlignment;
    final View setUnboundedRipple;
    boolean setY;
    final setX setX = new setX();
    private final Interpolator setUiOptions = new AccelerateInterpolator();
    private float[] setZ = {0.0f, 0.0f};
    private float[] ViewPager$SavedState$1 = {Float.MAX_VALUE, Float.MAX_VALUE};
    private float[] setTextScaleX = {0.0f, 0.0f};
    private float[] setIconSize = {0.0f, 0.0f};
    private float[] setChipCornerRadius = {Float.MAX_VALUE, Float.MAX_VALUE};

    static float MenuHostHelper$$ExternalSyntheticLambda0(float f, float f2, float f3) {
        if (f > 1.0f) {
            return 1.0f;
        }
        if (f < 0.0f) {
            return 0.0f;
        }
        return f;
    }

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(int i);

    public abstract boolean setY(int i);

    public setPasswordVisibilityToggleEnabled(View view) {
        this.setUnboundedRipple = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float[] fArr = this.setChipCornerRadius;
        float f = ((int) ((displayMetrics.density * 1575.0f) + 0.5f)) / 1000.0f;
        fArr[0] = f;
        fArr[1] = f;
        float[] fArr2 = this.setIconSize;
        float f2 = ((int) ((displayMetrics.density * 315.0f) + 0.5f)) / 1000.0f;
        fArr2[0] = f2;
        fArr2[1] = f2;
        this.setTextAlignment = 1;
        float[] fArr3 = this.ViewPager$SavedState$1;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        float[] fArr4 = this.setZ;
        fArr4[0] = 0.2f;
        fArr4[1] = 0.2f;
        float[] fArr5 = this.setTextScaleX;
        fArr5[0] = 0.001f;
        fArr5[1] = 0.001f;
        this.setLayoutAnimation = setOnLongClickListener;
        this.setX.setNavigationOnClickListener = 500;
        this.setX.setIconTintList = 500;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:
        if (r0 == 3) goto L27;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            boolean r0 = r5.MenuHostHelper$$ExternalSyntheticLambda0
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r7.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 == r2) goto L15
            r3 = 2
            if (r0 == r3) goto L1d
            r6 = 3
            if (r0 != r6) goto L7c
        L15:
            r5.MenuHostHelper$$ExternalSyntheticLambda1()
            goto L7c
        L19:
            r5.MenuHostHelper$$ExternalSyntheticLambda1 = r2
            r5.setNavigationOnClickListener = r1
        L1d:
            float r0 = r7.getX()
            int r3 = r6.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r5.setUnboundedRipple
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r0 = r5.setIconTintList(r1, r0, r3, r4)
            float r7 = r7.getY()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            android.view.View r3 = r5.setUnboundedRipple
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r6 = r5.setIconTintList(r2, r7, r6, r3)
            o.setPasswordVisibilityToggleEnabled$setX r7 = r5.setX
            r7.setLayoutAnimation = r0
            r7.setIconSize = r6
            boolean r6 = r5.setY
            if (r6 != 0) goto L7c
            boolean r6 = r5.setY()
            if (r6 == 0) goto L7c
            java.lang.Runnable r6 = r5.setOnNavigationItemSelectedListener
            if (r6 != 0) goto L60
            o.setPasswordVisibilityToggleEnabled$setIconTintList r6 = new o.setPasswordVisibilityToggleEnabled$setIconTintList
            r6.<init>()
            r5.setOnNavigationItemSelectedListener = r6
        L60:
            r5.setY = r2
            r5.setIconTintList = r2
            boolean r6 = r5.setNavigationOnClickListener
            if (r6 != 0) goto L75
            int r6 = r5.setLayoutAnimation
            if (r6 <= 0) goto L75
            android.view.View r7 = r5.setUnboundedRipple
            java.lang.Runnable r0 = r5.setOnNavigationItemSelectedListener
            long r3 = (long) r6
            o.setBaselineAlignBottom.setY(r7, r0, r3)
            goto L7a
        L75:
            java.lang.Runnable r6 = r5.setOnNavigationItemSelectedListener
            r6.run()
        L7a:
            r5.setNavigationOnClickListener = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPasswordVisibilityToggleEnabled.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    final boolean setY() {
        setX setx = this.setX;
        float f = setx.setIconSize;
        int abs = (int) (f / Math.abs(f));
        float f2 = setx.setLayoutAnimation;
        int abs2 = (int) (f2 / Math.abs(f2));
        return abs != 0 && setY(abs);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1() {
        int i = 0;
        if (this.setIconTintList) {
            this.setY = false;
            return;
        }
        setX setx = this.setX;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - setx.setUiOptions);
        int i3 = setx.setIconTintList;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        setx.setY = i;
        setx.setOnLongClickListener = setx.setIconTintList(currentAnimationTimeMillis);
        setx.setUnboundedRipple = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float setIconTintList(int r5, float r6, float r7, float r8) {
        /*
            r4 = this;
            float[] r0 = r4.setZ
            r0 = r0[r5]
            float[] r1 = r4.ViewPager$SavedState$1
            r1 = r1[r5]
            float r0 = r0 * r7
            r2 = 0
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 <= 0) goto L10
            goto L17
        L10:
            int r1 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r1 >= 0) goto L16
            r1 = 0
            goto L17
        L16:
            r1 = r0
        L17:
            float r0 = r4.setY(r6, r1)
            float r7 = r7 - r6
            float r6 = r4.setY(r7, r1)
            float r6 = r6 - r0
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L32
            android.view.animation.Interpolator r1 = r4.setUiOptions
            float r6 = -r6
            float r6 = r1.getInterpolation(r6)
            float r6 = -r6
            goto L3c
        L32:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 <= 0) goto L4a
            android.view.animation.Interpolator r1 = r4.setUiOptions
            float r6 = r1.getInterpolation(r6)
        L3c:
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 <= 0) goto L43
            r7 = 1065353216(0x3f800000, float:1.0)
            goto L4b
        L43:
            int r0 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r0 >= 0) goto L48
            goto L4b
        L48:
            r7 = r6
            goto L4b
        L4a:
            r7 = 0
        L4b:
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 != 0) goto L50
            return r2
        L50:
            float[] r0 = r4.setTextScaleX
            r0 = r0[r5]
            float[] r1 = r4.setIconSize
            r1 = r1[r5]
            float[] r2 = r4.setChipCornerRadius
            r5 = r2[r5]
            float r0 = r0 * r8
            if (r6 <= 0) goto L6d
            float r7 = r7 * r0
            int r6 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r6 <= 0) goto L67
            return r5
        L67:
            int r5 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r5 >= 0) goto L6c
            return r1
        L6c:
            return r7
        L6d:
            float r6 = -r7
            float r6 = r6 * r0
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 <= 0) goto L76
            r1 = r5
            goto L7c
        L76:
            int r5 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r5 >= 0) goto L7b
            goto L7c
        L7b:
            r1 = r6
        L7c:
            float r5 = -r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setPasswordVisibilityToggleEnabled.setIconTintList(int, float, float, float):float");
    }

    private float setY(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.setTextAlignment;
        if (i == 0 || i == 1) {
            if (f < f2) {
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.setY && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f < 0.0f) {
            return f / (-f2);
        }
        return 0.0f;
    }

    /* loaded from: classes.dex */
    class setIconTintList implements Runnable {
        setIconTintList() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (setPasswordVisibilityToggleEnabled.this.setY) {
                if (setPasswordVisibilityToggleEnabled.this.setIconTintList) {
                    setPasswordVisibilityToggleEnabled.this.setIconTintList = false;
                    setX setx = setPasswordVisibilityToggleEnabled.this.setX;
                    long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                    setx.setUiOptions = currentAnimationTimeMillis;
                    setx.setUnboundedRipple = -1L;
                    setx.MenuHostHelper$$ExternalSyntheticLambda0 = currentAnimationTimeMillis;
                    setx.setOnLongClickListener = 0.5f;
                    setx.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                    setx.setX = 0;
                }
                setX setx2 = setPasswordVisibilityToggleEnabled.this.setX;
                if ((setx2.setUnboundedRipple > 0 && AnimationUtils.currentAnimationTimeMillis() > setx2.setUnboundedRipple + ((long) setx2.setY)) || !setPasswordVisibilityToggleEnabled.this.setY()) {
                    setPasswordVisibilityToggleEnabled.this.setY = false;
                    return;
                }
                if (setPasswordVisibilityToggleEnabled.this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    setPasswordVisibilityToggleEnabled.this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                    setPasswordVisibilityToggleEnabled setpasswordvisibilitytoggleenabled = setPasswordVisibilityToggleEnabled.this;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    setpasswordvisibilitytoggleenabled.setUnboundedRipple.onTouchEvent(obtain);
                    obtain.recycle();
                }
                if (setx2.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
                    throw new RuntimeException("Cannot compute scroll delta before calling start()");
                }
                long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                float iconTintList = setx2.setIconTintList(currentAnimationTimeMillis2);
                long j = setx2.MenuHostHelper$$ExternalSyntheticLambda0;
                setx2.MenuHostHelper$$ExternalSyntheticLambda0 = currentAnimationTimeMillis2;
                float f = ((float) (currentAnimationTimeMillis2 - j)) * (((-4.0f) * iconTintList * iconTintList) + (iconTintList * 4.0f));
                setx2.MenuHostHelper$$ExternalSyntheticLambda1 = (int) (setx2.setLayoutAnimation * f);
                setx2.setX = (int) (f * setx2.setIconSize);
                int i = setx2.MenuHostHelper$$ExternalSyntheticLambda1;
                setPasswordVisibilityToggleEnabled.this.MenuHostHelper$$ExternalSyntheticLambda1(setx2.setX);
                setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(setPasswordVisibilityToggleEnabled.this.setUnboundedRipple, this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        float setIconSize;
        int setIconTintList;
        float setLayoutAnimation;
        int setNavigationOnClickListener;
        float setOnLongClickListener;
        int setY;
        long setUiOptions = Long.MIN_VALUE;
        long setUnboundedRipple = -1;
        long MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        int MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        int setX = 0;

        setX() {
        }

        final float setIconTintList(long j) {
            long j2 = this.setUiOptions;
            if (j < j2) {
                return 0.0f;
            }
            long j3 = this.setUnboundedRipple;
            if (j3 < 0 || j < j3) {
                return setPasswordVisibilityToggleEnabled.MenuHostHelper$$ExternalSyntheticLambda0(((float) (j - j2)) / this.setNavigationOnClickListener, 0.0f, 1.0f) * 0.5f;
            }
            float f = this.setOnLongClickListener;
            return (1.0f - f) + (f * setPasswordVisibilityToggleEnabled.MenuHostHelper$$ExternalSyntheticLambda0(((float) (j - j3)) / this.setY, 0.0f, 1.0f));
        }
    }
}