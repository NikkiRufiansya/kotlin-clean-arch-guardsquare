package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Looper;
import android.os.Process;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.BitSet;
import o.setBoxStrokeColorStateList;
import o.setExpandedTitleTextAppearance;

/* loaded from: classes.dex */
public class setWebViewClient extends Drawable implements setButtonDrawable, FragmentManager$LaunchedFragmentInfo$1 {
    private static final Paint MenuHostHelper$$ExternalSyntheticLambda1;
    private static char setAnimationFromJson = 0;
    private static char setGuidelinePercent = 0;
    private static final String setIconTintList = "MaterialShapeDrawable";
    private static char setMaxEms;
    private static char setZ;
    public boolean FloatingActionButton$BaseBehavior;
    public final RectF FragmentStateAdapter$2;
    public boolean FragmentStateAdapter$5;
    private final Matrix MenuHostHelper$$ExternalSyntheticLambda0;
    final BitSet SearchView$SavedState$1;
    private final Region ViewPager$SavedState$1;
    private final onActivityStarted setCenterIfNoTextEnabled;
    private PorterDuffColorFilter setChipCornerRadius;
    public setIconTintList setChipIconTintResource;
    final setBoxStrokeColorStateList.setNavigationOnClickListener[] setConstraintSet;
    public int setContentScrimResource;
    final setBoxStrokeColorStateList.setNavigationOnClickListener[] setHasDecor;
    private setScrollBarDefaultDelayBeforeFade setIconSize;
    private final RectF setLayoutAnimation;
    private final Path setNavigationOnClickListener;
    private final Path setOnLongClickListener;
    private PorterDuffColorFilter setOnNavigationItemSelectedListener;
    private final Paint setTextAlignment;
    private final Region setTextScaleX;
    private final setExpandedTitleTextAppearance.setX setUiOptions;
    private final setExpandedTitleTextAppearance setUnboundedRipple;
    private final RectF setX;
    private final Paint setY;
    public static final byte[] $$p = {68, -4, -93, 76};
    public static final int $$q = 238;
    public static final byte[] $$j = {103, 121, -60, -41, -65, 63, 1, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -48, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 72, -40, -42, 79, -14, 15, -27};
    public static final int $$k = 206;
    public static final byte[] $$d = {42, -48, 107, -19, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
    public static final int $$e = 203;
    private static byte[] setLayoutDirection = {45, -79, -67, -1, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, 22, 1, 4, -9, 13, 10, -28, 24, 14, -9, 0, 7, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12, -5, 25, -17, -47, 66, -7, 17, -3, -53, 42, 24, 14, -9, 0, 7};
    public static final int setViewTranslationCallback = 253;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 68 - r7
            int r9 = 106 - r9
            byte[] r0 = o.setWebViewClient.setLayoutDirection
            int r8 = 23 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r8
            r3 = r1
            r4 = 0
            r8 = r7
            r1 = r0
            r0 = r10
            r10 = r9
            goto L2e
        L15:
            r3 = 0
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L2e:
            int r9 = r9 + r7
            int r7 = r8 + 1
            int r9 = r9 + (-4)
            r8 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setWebViewClient.f(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x003a). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 14
            int r8 = 17 - r8
            int r6 = r6 * 25
            int r6 = r6 + 15
            int r7 = r7 * 38
            int r7 = 115 - r7
            byte[] r0 = o.setWebViewClient.$$d
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L1d
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L3a
        L1d:
            r3 = 0
        L1e:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2d:
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
        L3a:
            int r6 = -r6
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
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setWebViewClient.g(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.setWebViewClient.$$j
            int r8 = r8 * 3
            int r8 = 85 - r8
            int r7 = r7 + 4
            int r6 = r6 * 34
            int r6 = 111 - r6
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r6 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L37
        L1a:
            r3 = 0
            r5 = r8
            r8 = r6
        L1d:
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r9
            r9 = r6
            r6 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L37:
            int r8 = r8 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setWebViewClient.i(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0035). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void j(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 4 - r9
            int r8 = r8 * 3
            int r8 = r8 + 117
            byte[] r0 = o.setWebViewClient.$$p
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L35
        L19:
            r3 = 0
        L1a:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L2c
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2c:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L35:
            int r9 = r9 + 1
            int r8 = r8 + r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setWebViewClient.j(byte, byte, byte, java.lang.Object[]):void");
    }

    static void setChipCornerRadius() {
        setMaxEms = (char) 15698;
        setAnimationFromJson = (char) 24240;
        setGuidelinePercent = (char) 14529;
        setZ = (char) 23040;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* synthetic */ setWebViewClient(setIconTintList seticontintlist, byte b) {
        this(seticontintlist);
    }

    static {
        setChipCornerRadius();
        Paint paint = new Paint(1);
        MenuHostHelper$$ExternalSyntheticLambda1 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public setWebViewClient() {
        this(new setScrollBarDefaultDelayBeforeFade());
    }

    public setWebViewClient(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this(new setIconTintList(setscrollbardefaultdelaybeforefade));
    }

    private setWebViewClient(setIconTintList seticontintlist) {
        setExpandedTitleTextAppearance setexpandedtitletextappearance;
        this.setHasDecor = new setBoxStrokeColorStateList.setNavigationOnClickListener[4];
        this.setConstraintSet = new setBoxStrokeColorStateList.setNavigationOnClickListener[4];
        this.SearchView$SavedState$1 = new BitSet(8);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new Matrix();
        this.setOnLongClickListener = new Path();
        this.setNavigationOnClickListener = new Path();
        this.FragmentStateAdapter$2 = new RectF();
        this.setX = new RectF();
        this.setTextScaleX = new Region();
        this.ViewPager$SavedState$1 = new Region();
        Paint paint = new Paint(1);
        this.setY = paint;
        Paint paint2 = new Paint(1);
        this.setTextAlignment = paint2;
        this.setCenterIfNoTextEnabled = new onActivityStarted();
        Thread thread = Looper.getMainLooper().getThread();
        try {
            Object[] objArr = new Object[1];
            f(setLayoutDirection[25], setLayoutDirection[37], setLayoutDirection[25], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(setLayoutDirection[63], setLayoutDirection[14], setLayoutDirection[37], objArr2);
            if (thread != cls.getMethod((String) objArr2[0], null).invoke(null, null)) {
                setexpandedtitletextappearance = new setExpandedTitleTextAppearance();
            } else {
                setexpandedtitletextappearance = setExpandedTitleTextAppearance$MenuHostHelper$$ExternalSyntheticLambda0.setY;
            }
            this.setUnboundedRipple = setexpandedtitletextappearance;
            this.setLayoutAnimation = new RectF();
            this.FragmentStateAdapter$5 = true;
            this.setChipIconTintResource = seticontintlist;
            paint2.setStyle(Paint.Style.STROKE);
            paint.setStyle(Paint.Style.FILL);
            MenuHostHelper$$ExternalSyntheticLambda1();
            setX(getState());
            this.setUiOptions = new setExpandedTitleTextAppearance.setX() { // from class: o.setWebViewClient.4
                @Override // o.setExpandedTitleTextAppearance.setX
                public final void setIconTintList(setBoxStrokeColorStateList setboxstrokecolorstatelist, Matrix matrix, int i) {
                    setWebViewClient.this.SearchView$SavedState$1.set(i, setboxstrokecolorstatelist.setX);
                    setWebViewClient.this.setHasDecor[i] = setboxstrokecolorstatelist.setIconTintList(matrix);
                }

                @Override // o.setExpandedTitleTextAppearance.setX
                public final void setY(setBoxStrokeColorStateList setboxstrokecolorstatelist, Matrix matrix, int i) {
                    setWebViewClient.this.SearchView$SavedState$1.set(i + 4, setboxstrokecolorstatelist.setX);
                    setWebViewClient.this.setConstraintSet[i] = setboxstrokecolorstatelist.setIconTintList(matrix);
                }
            };
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.setChipIconTintResource;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.setChipIconTintResource = new setIconTintList(this.setChipIconTintResource);
        return this;
    }

    @Override // o.FragmentManager$LaunchedFragmentInfo$1
    public void setShapeAppearanceModel(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
        this.setChipIconTintResource.setTextAlignment = setscrollbardefaultdelaybeforefade;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.setChipIconTintResource.setTextScaleX != mode) {
            this.setChipIconTintResource.setTextScaleX = mode;
            MenuHostHelper$$ExternalSyntheticLambda1();
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.setChipIconTintResource.setAnimationFromJson = colorStateList;
        MenuHostHelper$$ExternalSyntheticLambda1();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.setChipIconTintResource.setIconTintList;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.setChipIconTintResource.setIconTintList != i) {
            this.setChipIconTintResource.setIconTintList = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda1 = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.setTextScaleX.set(getBounds());
        this.FragmentStateAdapter$2.set(getBounds());
        setY(this.FragmentStateAdapter$2, this.setOnLongClickListener);
        this.ViewPager$SavedState$1.setPath(this.setOnLongClickListener, this.setTextScaleX);
        this.setTextScaleX.op(this.ViewPager$SavedState$1, Region.Op.DIFFERENCE);
        return this.setTextScaleX;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RectF setLayoutAnimation() {
        this.FragmentStateAdapter$2.set(getBounds());
        return this.FragmentStateAdapter$2;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        if (this.setChipIconTintResource.setUnboundedRipple != null) {
            rect.set(this.setChipIconTintResource.setUnboundedRipple);
            return true;
        }
        return super.getPadding(rect);
    }

    public final void setX(Context context) {
        this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0 = new setItemBackgroundResource(context);
        setTextAlignment();
    }

    public final void ViewPager$SavedState$1(float f) {
        if (this.setChipIconTintResource.setNavigationOnClickListener != f) {
            this.setChipIconTintResource.setNavigationOnClickListener = f;
            setTextAlignment();
        }
    }

    public final void setIconSize(float f) {
        if (this.setChipIconTintResource.setY != f) {
            this.setChipIconTintResource.setY = f;
            setTextAlignment();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0436  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int setUnboundedRipple() {
        /*
            Method dump skipped, instructions count: 1458
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setWebViewClient.setUnboundedRipple():int");
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.FloatingActionButton$BaseBehavior = true;
        super.invalidateSelf();
    }

    public final void setX() {
        super.invalidateSelf();
    }

    public final void setIconSize() {
        this.setCenterIfNoTextEnabled.setIconTintList(-12303292);
        this.setChipIconTintResource.setLayoutDirection = false;
        super.invalidateSelf();
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return (this.setChipIconTintResource.setOnLongClickListener == Paint.Style.FILL_AND_STROKE || this.setChipIconTintResource.setOnLongClickListener == Paint.Style.STROKE) && this.setTextAlignment.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.FloatingActionButton$BaseBehavior = true;
        super.onBoundsChange(rect);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00eb, code lost:
        if (((r2.setIconTintList(r11.FragmentStateAdapter$2) || r11.setOnLongClickListener.isConvex() || android.os.Build.VERSION.SDK_INT >= 29) ? false : true) != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e5  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void draw(android.graphics.Canvas r12) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setWebViewClient.draw(android.graphics.Canvas):void");
    }

    public final void setX(Canvas canvas, Paint paint, Path path, RectF rectF) {
        setX(canvas, paint, path, this.setChipIconTintResource.setTextAlignment, rectF);
    }

    private void setX(Canvas canvas, Paint paint, Path path, setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade, RectF rectF) {
        if (setscrollbardefaultdelaybeforefade.setIconTintList(rectF)) {
            float y = setscrollbardefaultdelaybeforefade.setChipCornerRadius.setY(rectF) * this.setChipIconTintResource.setUiOptions;
            canvas.drawRoundRect(rectF, y, y, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public void setX(Canvas canvas) {
        setX(canvas, this.setTextAlignment, this.setNavigationOnClickListener, this.setIconSize, setIconTintList());
    }

    private void setY(Canvas canvas) {
        if (this.SearchView$SavedState$1.cardinality() > 0) {
            Log.w(setIconTintList, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.setChipIconTintResource.setCenterIfNoTextEnabled != 0) {
            canvas.drawPath(this.setOnLongClickListener, this.setCenterIfNoTextEnabled.setLayoutAnimation);
        }
        for (int i = 0; i < 4; i++) {
            this.setHasDecor[i].setY(setBoxStrokeColorStateList.setNavigationOnClickListener.setIconTintList, this.setCenterIfNoTextEnabled, this.setChipIconTintResource.ViewPager$SavedState$1, canvas);
            this.setConstraintSet[i].setY(setBoxStrokeColorStateList.setNavigationOnClickListener.setIconTintList, this.setCenterIfNoTextEnabled, this.setChipIconTintResource.ViewPager$SavedState$1, canvas);
        }
        if (this.FragmentStateAdapter$5) {
            int sin = (int) (this.setChipIconTintResource.setCenterIfNoTextEnabled * Math.sin(Math.toRadians(this.setChipIconTintResource.setChipCornerRadius)));
            int cos = (int) (this.setChipIconTintResource.setCenterIfNoTextEnabled * Math.cos(Math.toRadians(this.setChipIconTintResource.setChipCornerRadius)));
            canvas.translate(-sin, -cos);
            canvas.drawPath(this.setOnLongClickListener, MenuHostHelper$$ExternalSyntheticLambda1);
            canvas.translate(sin, cos);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setIconTintList(RectF rectF, Path path) {
        this.setUnboundedRipple.setY(this.setChipIconTintResource.setTextAlignment, this.setChipIconTintResource.setUiOptions, rectF, this.setUiOptions, path);
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.setChipIconTintResource.setIconSize == 2) {
            return;
        }
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = this.setChipIconTintResource.setTextAlignment;
        this.FragmentStateAdapter$2.set(getBounds());
        if (setscrollbardefaultdelaybeforefade.setIconTintList(this.FragmentStateAdapter$2)) {
            setImageURI setimageuri = this.setChipIconTintResource.setTextAlignment.setCenterIfNoTextEnabled;
            this.FragmentStateAdapter$2.set(getBounds());
            outline.setRoundRect(getBounds(), setimageuri.setY(this.FragmentStateAdapter$2) * this.setChipIconTintResource.setUiOptions);
            return;
        }
        this.FragmentStateAdapter$2.set(getBounds());
        setY(this.FragmentStateAdapter$2, this.setOnLongClickListener);
        if (this.setOnLongClickListener.isConvex() || Build.VERSION.SDK_INT >= 29) {
            try {
                outline.setConvexPath(this.setOnLongClickListener);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        PorterDuffColorFilter porterDuffColorFilter = this.setOnNavigationItemSelectedListener;
        PorterDuffColorFilter porterDuffColorFilter2 = this.setChipCornerRadius;
        this.setOnNavigationItemSelectedListener = setY(this.setChipIconTintResource.setAnimationFromJson, this.setChipIconTintResource.setTextScaleX, this.setY, true);
        this.setChipCornerRadius = setY(this.setChipIconTintResource.setZ, this.setChipIconTintResource.setTextScaleX, this.setTextAlignment, false);
        if (this.setChipIconTintResource.setLayoutDirection) {
            this.setCenterIfNoTextEnabled.setIconTintList(this.setChipIconTintResource.setAnimationFromJson.getColorForState(getState(), 0));
        }
        return (setAllowStacking.MenuHostHelper$$ExternalSyntheticLambda0(porterDuffColorFilter, this.setOnNavigationItemSelectedListener) && setAllowStacking.MenuHostHelper$$ExternalSyntheticLambda0(porterDuffColorFilter2, this.setChipCornerRadius)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return super.isStateful() || (this.setChipIconTintResource.setAnimationFromJson != null && this.setChipIconTintResource.setAnimationFromJson.isStateful()) || ((this.setChipIconTintResource.setZ != null && this.setChipIconTintResource.setZ.isStateful()) || ((this.setChipIconTintResource.setOnNavigationItemSelectedListener != null && this.setChipIconTintResource.setOnNavigationItemSelectedListener.isStateful()) || (this.setChipIconTintResource.setX != null && this.setChipIconTintResource.setX.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable, o.setReferencedIds.setY
    public boolean onStateChange(int[] iArr) {
        boolean z = setX(iArr) || MenuHostHelper$$ExternalSyntheticLambda1();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    private boolean setX(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.setChipIconTintResource.setX == null || color2 == (colorForState2 = this.setChipIconTintResource.setX.getColorForState(iArr, (color2 = this.setY.getColor())))) {
            z = false;
        } else {
            this.setY.setColor(colorForState2);
            z = true;
        }
        if (this.setChipIconTintResource.setOnNavigationItemSelectedListener == null || color == (colorForState = this.setChipIconTintResource.setOnNavigationItemSelectedListener.getColorForState(iArr, (color = this.setTextAlignment.getColor())))) {
            return z;
        }
        this.setTextAlignment.setColor(colorForState);
        return true;
    }

    private RectF setIconTintList() {
        RectF rectF = this.setX;
        this.FragmentStateAdapter$2.set(getBounds());
        rectF.set(this.FragmentStateAdapter$2);
        float strokeWidth = MenuHostHelper$$ExternalSyntheticLambda0() ? this.setTextAlignment.getStrokeWidth() / 2.0f : 0.0f;
        this.setX.inset(strokeWidth, strokeWidth);
        return this.setX;
    }

    public final float setOnLongClickListener() {
        setImageURI setimageuri = this.setChipIconTintResource.setTextAlignment.setCenterIfNoTextEnabled;
        this.FragmentStateAdapter$2.set(getBounds());
        return setimageuri.setY(this.FragmentStateAdapter$2);
    }

    public final float setUiOptions() {
        setImageURI setimageuri = this.setChipIconTintResource.setTextAlignment.setChipCornerRadius;
        this.FragmentStateAdapter$2.set(getBounds());
        return setimageuri.setY(this.FragmentStateAdapter$2);
    }

    public final float setY() {
        setImageURI setimageuri = this.setChipIconTintResource.setTextAlignment.setX;
        this.FragmentStateAdapter$2.set(getBounds());
        return setimageuri.setY(this.FragmentStateAdapter$2);
    }

    public final float setNavigationOnClickListener() {
        setImageURI setimageuri = this.setChipIconTintResource.setTextAlignment.setUnboundedRipple;
        this.FragmentStateAdapter$2.set(getBounds());
        return setimageuri.setY(this.FragmentStateAdapter$2);
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends Drawable.ConstantState {
        public setItemBackgroundResource MenuHostHelper$$ExternalSyntheticLambda0;
        public ColorFilter MenuHostHelper$$ExternalSyntheticLambda1;
        public int ViewPager$SavedState$1;
        public ColorStateList setAnimationFromJson;
        public int setCenterIfNoTextEnabled;
        public int setChipCornerRadius;
        public int setIconSize;
        public int setIconTintList;
        public float setLayoutAnimation;
        public boolean setLayoutDirection;
        public float setMaxEms;
        public float setMinAndMaxProgress;
        public float setNavigationOnClickListener;
        public Paint.Style setOnLongClickListener;
        public ColorStateList setOnNavigationItemSelectedListener;
        public setScrollBarDefaultDelayBeforeFade setTextAlignment;
        public PorterDuff.Mode setTextScaleX;
        public float setUiOptions;
        public Rect setUnboundedRipple;
        public ColorStateList setX;
        public float setY;
        public ColorStateList setZ;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        public setIconTintList(setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade) {
            this.setX = null;
            this.setOnNavigationItemSelectedListener = null;
            this.setZ = null;
            this.setAnimationFromJson = null;
            this.setTextScaleX = PorterDuff.Mode.SRC_IN;
            this.setUnboundedRipple = null;
            this.setLayoutAnimation = 1.0f;
            this.setUiOptions = 1.0f;
            this.setIconTintList = 255;
            this.setNavigationOnClickListener = 0.0f;
            this.setY = 0.0f;
            this.setMinAndMaxProgress = 0.0f;
            this.setIconSize = 0;
            this.ViewPager$SavedState$1 = 0;
            this.setCenterIfNoTextEnabled = 0;
            this.setChipCornerRadius = 0;
            this.setLayoutDirection = false;
            this.setOnLongClickListener = Paint.Style.FILL_AND_STROKE;
            this.setTextAlignment = setscrollbardefaultdelaybeforefade;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        }

        public setIconTintList(setIconTintList seticontintlist) {
            this.setX = null;
            this.setOnNavigationItemSelectedListener = null;
            this.setZ = null;
            this.setAnimationFromJson = null;
            this.setTextScaleX = PorterDuff.Mode.SRC_IN;
            this.setUnboundedRipple = null;
            this.setLayoutAnimation = 1.0f;
            this.setUiOptions = 1.0f;
            this.setIconTintList = 255;
            this.setNavigationOnClickListener = 0.0f;
            this.setY = 0.0f;
            this.setMinAndMaxProgress = 0.0f;
            this.setIconSize = 0;
            this.ViewPager$SavedState$1 = 0;
            this.setCenterIfNoTextEnabled = 0;
            this.setChipCornerRadius = 0;
            this.setLayoutDirection = false;
            this.setOnLongClickListener = Paint.Style.FILL_AND_STROKE;
            this.setTextAlignment = seticontintlist.setTextAlignment;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setMaxEms = seticontintlist.setMaxEms;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setX = seticontintlist.setX;
            this.setOnNavigationItemSelectedListener = seticontintlist.setOnNavigationItemSelectedListener;
            this.setTextScaleX = seticontintlist.setTextScaleX;
            this.setAnimationFromJson = seticontintlist.setAnimationFromJson;
            this.setIconTintList = seticontintlist.setIconTintList;
            this.setLayoutAnimation = seticontintlist.setLayoutAnimation;
            this.setCenterIfNoTextEnabled = seticontintlist.setCenterIfNoTextEnabled;
            this.setIconSize = seticontintlist.setIconSize;
            this.setLayoutDirection = seticontintlist.setLayoutDirection;
            this.setUiOptions = seticontintlist.setUiOptions;
            this.setNavigationOnClickListener = seticontintlist.setNavigationOnClickListener;
            this.setY = seticontintlist.setY;
            this.setMinAndMaxProgress = seticontintlist.setMinAndMaxProgress;
            this.ViewPager$SavedState$1 = seticontintlist.ViewPager$SavedState$1;
            this.setChipCornerRadius = seticontintlist.setChipCornerRadius;
            this.setZ = seticontintlist.setZ;
            this.setOnLongClickListener = seticontintlist.setOnLongClickListener;
            if (seticontintlist.setUnboundedRipple != null) {
                this.setUnboundedRipple = new Rect(seticontintlist.setUnboundedRipple);
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            setWebViewClient setwebviewclient = new setWebViewClient(this, (byte) 0);
            setwebviewclient.FloatingActionButton$BaseBehavior = true;
            return setwebviewclient;
        }
    }

    public setWebViewClient(Context context, AttributeSet attributeSet, int i, int i2) {
        this(new setScrollBarDefaultDelayBeforeFade(setScrollBarDefaultDelayBeforeFade.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, i, i2, new setActionBarVisibilityCallback(0.0f)), (byte) 0));
    }

    private void setY(RectF rectF, Path path) {
        this.setUnboundedRipple.setY(this.setChipIconTintResource.setTextAlignment, this.setChipIconTintResource.setUiOptions, rectF, this.setUiOptions, path);
        if (this.setChipIconTintResource.setLayoutAnimation != 1.0f) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.reset();
            this.MenuHostHelper$$ExternalSyntheticLambda0.setScale(this.setChipIconTintResource.setLayoutAnimation, this.setChipIconTintResource.setLayoutAnimation, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        path.computeBounds(this.setLayoutAnimation, true);
    }

    private PorterDuffColorFilter setY(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = setY(colorForState);
            }
            this.setContentScrimResource = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        } else if (z) {
            int color = paint.getColor();
            int y = setY(color);
            this.setContentScrimResource = y;
            if (y != color) {
                return new PorterDuffColorFilter(y, PorterDuff.Mode.SRC_IN);
            }
            return null;
        } else {
            return null;
        }
    }

    private void setTextAlignment() {
        float f = this.setChipIconTintResource.setY + this.setChipIconTintResource.setMinAndMaxProgress;
        this.setChipIconTintResource.ViewPager$SavedState$1 = (int) Math.ceil(0.75f * f);
        this.setChipIconTintResource.setCenterIfNoTextEnabled = (int) Math.ceil(f * 0.25f);
        MenuHostHelper$$ExternalSyntheticLambda1();
        super.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int setY(int i) {
        return this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0 != null ? this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.setX(i, this.setChipIconTintResource.setY + this.setChipIconTintResource.setMinAndMaxProgress + this.setChipIconTintResource.setNavigationOnClickListener) : i;
    }

    private static void h(int i, char[] cArr, Object[] objArr) {
        jw jwVar = new jw();
        char[] cArr2 = new char[cArr.length];
        jwVar.setX = 0;
        char[] cArr3 = new char[2];
        while (jwVar.setX < cArr.length) {
            cArr3[0] = cArr[jwVar.setX];
            cArr3[1] = cArr[jwVar.setX + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[1]), Integer.valueOf((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ((char) (setZ ^ 7915367849376928708L)))), Integer.valueOf(cArr3[0] >>> 5), Integer.valueOf(setGuidelinePercent)};
                    Object obj = jC.setTextScaleX.get(-496584909);
                    if (obj == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        j(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 276, (char) (42263 - (ViewConfiguration.getScrollBarSize() >> 8)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 5)).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                        jC.setTextScaleX.put(-496584909, obj);
                    }
                    cArr3[1] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ((char) (setAnimationFromJson ^ 7915367849376928708L)))), Integer.valueOf(cArr3[1] >>> 5), Integer.valueOf(setMaxEms)};
                        Object obj2 = jC.setTextScaleX.get(-496584909);
                        if (obj2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            Object[] objArr5 = new Object[1];
                            j(b3, b4, b4, objArr5);
                            obj2 = ((Class) jC.setY(277 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 42262), 4 - TextUtils.getCapsMode("", 0, 0))).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(-496584909, obj2);
                        }
                        cArr3[0] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                        i2 -= 40503;
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
            cArr2[jwVar.setX] = cArr3[0];
            cArr2[jwVar.setX + 1] = cArr3[1];
            try {
                Object[] objArr6 = {jwVar, jwVar};
                Object obj3 = jC.setTextScaleX.get(655848378);
                if (obj3 == null) {
                    obj3 = ((Class) jC.setY(TextUtils.indexOf("", "") + 365, (char) (55121 - (ViewConfiguration.getJumpTapTimeout() >> 16)), View.MeasureSpec.getSize(0) + 4)).getMethod("A", Object.class, Object.class);
                    jC.setTextScaleX.put(655848378, obj3);
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
        objArr[0] = new String(cArr2, 0, i);
    }
}