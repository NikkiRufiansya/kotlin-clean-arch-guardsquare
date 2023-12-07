package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Arrays;
import o.setEnsureMinTouchTargetSize;
import o.setReferencedIds;

/* loaded from: classes.dex */
public class DynamiteApi extends setWebViewClient implements Drawable.Callback, setReferencedIds.setY {
    private static char minusKey;
    private static final ShapeDrawable setAdapter;
    private static char[] setMinEms;
    private static final int[] setObjectValues;
    private boolean ActionMenuPresenter$SavedState$1;
    private int FabTransformationBehavior;
    private ColorStateList FirebaseRemoteConfigKtxRegistrar;
    private int Fragment$5;
    float MenuHostHelper$$ExternalSyntheticLambda0;
    float MenuHostHelper$$ExternalSyntheticLambda1;
    private Drawable RecyclerView$SavedState$1;
    private final RectF RemoteActionCompatParcelizer;
    private final Path TextInputLayout$SavedState$1;
    ColorStateList ViewPager$SavedState$1;
    private int createDispatcher;
    private ColorStateList getCallingPid;
    private boolean onActivityResumed;
    boolean setAnimationFromJson;
    private float setBackgroundTintMode;
    final Context setCenterIfNoTextEnabled;
    CharSequence setCheckedIconEnabled;
    float setChipCornerRadius;
    private ColorStateList setChipIconEnabled;
    private final PointF setChipIconEnabledResource;
    private ColorStateList setChipSpacingHorizontal;
    private Drawable setChipSpacingVertical;
    private int setCloseIconEndPadding;
    private PorterDuff.Mode setEdgeEffectFactory;
    private final Paint.FontMetrics setEmptyView;
    private boolean setError;
    private PorterDuffColorFilter setErrorIconTintList;
    private int setFilterRedundantCalls;
    private int setFilterTouchesWhenObscured;
    private boolean setFloatValues;
    TextUtils.TruncateAt setGuidelinePercent;
    private int[] setHint;
    float setIconSize;
    boolean setIconTintList;
    boolean setIconified;
    private float setImageTintMode;
    Drawable setLayoutAnimation;
    float setLayoutDirection;
    private int setLineBreakStyle;
    boolean setMaxEms;
    final setReferencedIds setMinAndMaxProgress;
    private float setNavigationIconTint;
    ColorStateList setNavigationOnClickListener;
    CharSequence setOnLongClickListener;
    int setOnNavigationItemSelectedListener;
    private int setRevealInfo;
    private ColorStateList setSelectedChildViewEnabled;
    private final Paint setShrinkMotionSpec;
    private final Paint setSubmitButtonEnabled;
    private Drawable setSuffixText;
    boolean setTextAlignment;
    float setTextAppearanceResource;
    WeakReference<DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1> setTextScaleX;
    private float setTitleMarginEnd;
    private ColorFilter setTooltipText;
    float setUiOptions;
    float setUnboundedRipple;
    ColorStateList setX;
    float setY;
    ColorStateList setZ;
    public static final byte[] $$m = {68, -4, -93, 76};
    public static final int $$n = 53;
    public static final byte[] $$g = {45, -61, 23, 105, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, 52, -64, 19, 16, -54, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 36};
    public static final int $$h = 105;
    public static final byte[] $$a = {108, -22, 67, 3, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 236;
    private static byte[] setCallingWorkSourceUid = {18, -87, -121, -123, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int ExtendableSavedState$1 = 104;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.DynamiteApi.$$a
            int r7 = 40 - r7
            int r8 = 20 - r8
            int r6 = r6 * 38
            int r6 = 115 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L15:
            r3 = 0
        L16:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            int r3 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2a:
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r9 = r9 + r6
            int r6 = r9 + (-13)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DynamiteApi.a(int, short, short, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, short s, Object[] objArr) {
        int i3 = 106 - s;
        byte[] bArr = setCallingWorkSourceUid;
        int i4 = (i2 * 3) + 16;
        int i5 = 19 - (i * 15);
        byte[] bArr2 = new byte[i4];
        int i6 = -1;
        int i7 = i4 - 1;
        if (bArr == null) {
            i5++;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = -1;
            i3 = (i3 - i7) + 2;
            i7 = i7;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            byte b = bArr[i5];
            int i9 = i3;
            i5++;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i6 = i8;
            i3 = (i9 - b) + 2;
            i7 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 30
            int r7 = r7 + 15
            int r8 = r8 * 14
            int r8 = 18 - r8
            int r6 = r6 * 4
            int r6 = r6 + 111
            byte[] r0 = o.DynamiteApi.$$g
            byte[] r1 = new byte[r7]
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
            int r3 = r3 + 1
            if (r3 != r7) goto L2d
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2d:
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
            int r7 = -r7
            int r8 = r8 + r7
            int r8 = r8 + (-13)
            int r7 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DynamiteApi.d(byte, short, byte, java.lang.Object[]):void");
    }

    private static void e(byte b, int i, short s, Object[] objArr) {
        int i2 = (b * 3) + 1;
        int i3 = 4 - (i * 4);
        byte[] bArr = $$m;
        int i4 = s + 103;
        byte[] bArr2 = new byte[i2];
        int i5 = -1;
        int i6 = i2 - 1;
        if (bArr == null) {
            i4 = i6 + (-i4);
            i6 = i6;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i4;
            if (i5 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 += -bArr[i3];
            i6 = i6;
            i3++;
        }
    }

    static void setIconTintList() {
        minusKey = (char) 63084;
        setMinEms = new char[]{50072, 50096, 50078, 50055, 50077, 50064, 50079, 50081, 50051, 50054, 50048, 50075, 50076, 50058, 50087, 50098, 50053, 50074, 50065, 50070, 50066, 50071, 50080, 50141, 50049};
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    static {
        setIconTintList();
        setObjectValues = new int[]{16842910};
        setAdapter = new ShapeDrawable(new OvalShape());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DynamiteApi(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1.0f;
        this.setShrinkMotionSpec = new Paint(1);
        this.setEmptyView = new Paint.FontMetrics();
        this.RemoteActionCompatParcelizer = new RectF();
        this.setChipIconEnabledResource = new PointF();
        this.TextInputLayout$SavedState$1 = new Path();
        this.setFilterTouchesWhenObscured = 255;
        this.setEdgeEffectFactory = PorterDuff.Mode.SRC_IN;
        this.setTextScaleX = new WeakReference<>(null);
        setX(context);
        this.setCenterIfNoTextEnabled = context;
        setReferencedIds setreferencedids = new setReferencedIds(this);
        this.setMinAndMaxProgress = setreferencedids;
        this.setCheckedIconEnabled = "";
        setreferencedids.setY.density = context.getResources().getDisplayMetrics().density;
        this.setSubmitButtonEnabled = null;
        int[] iArr = setObjectValues;
        setState(iArr);
        setX(iArr);
        this.setAnimationFromJson = true;
        if (setChipText.MenuHostHelper$$ExternalSyntheticLambda0) {
            setAdapter.setTint(-1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        float f;
        float f2 = this.setUiOptions;
        float MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        float f3 = this.setLayoutDirection;
        setReferencedIds setreferencedids = this.setMinAndMaxProgress;
        String charSequence = this.setCheckedIconEnabled.toString();
        if (!setreferencedids.setOnLongClickListener) {
            f = setreferencedids.setX;
        } else {
            float measureText = charSequence == null ? 0.0f : setreferencedids.setY.measureText((CharSequence) charSequence, 0, charSequence.length());
            setreferencedids.setX = measureText;
            setreferencedids.setOnLongClickListener = false;
            f = measureText;
        }
        return Math.min(Math.round(f2 + MenuHostHelper$$ExternalSyntheticLambda0 + f3 + f + this.setTextAppearanceResource + setCenterIfNoTextEnabled() + this.MenuHostHelper$$ExternalSyntheticLambda0), this.setOnNavigationItemSelectedListener);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.setY;
    }

    private float ViewPager$SavedState$1() {
        Drawable drawable = this.onActivityResumed ? this.setSuffixText : this.RecyclerView$SavedState$1;
        float f = this.setImageTintMode;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        float f;
        int i2;
        int saveLayerAlpha;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        if (this.setFilterTouchesWhenObscured < 255) {
            float f2 = bounds.left;
            float f3 = bounds.top;
            float f4 = bounds.right;
            float f5 = bounds.bottom;
            int i3 = this.setFilterTouchesWhenObscured;
            if (Build.VERSION.SDK_INT > 21) {
                saveLayerAlpha = canvas.saveLayerAlpha(f2, f3, f4, f5, i3);
            } else {
                saveLayerAlpha = canvas.saveLayerAlpha(f2, f3, f4, f5, i3, 31);
            }
            i = saveLayerAlpha;
        } else {
            i = 0;
        }
        if (!this.setMaxEms) {
            this.setShrinkMotionSpec.setColor(this.Fragment$5);
            this.setShrinkMotionSpec.setStyle(Paint.Style.FILL);
            this.RemoteActionCompatParcelizer.set(bounds);
            canvas.drawRoundRect(this.RemoteActionCompatParcelizer, this.setMaxEms ? setOnLongClickListener() : this.MenuHostHelper$$ExternalSyntheticLambda1, this.setMaxEms ? setOnLongClickListener() : this.MenuHostHelper$$ExternalSyntheticLambda1, this.setShrinkMotionSpec);
        }
        if (!this.setMaxEms) {
            this.setShrinkMotionSpec.setColor(this.setFilterRedundantCalls);
            this.setShrinkMotionSpec.setStyle(Paint.Style.FILL);
            Paint paint = this.setShrinkMotionSpec;
            ColorFilter colorFilter = this.setTooltipText;
            if (colorFilter == null) {
                colorFilter = this.setErrorIconTintList;
            }
            paint.setColorFilter(colorFilter);
            this.RemoteActionCompatParcelizer.set(bounds);
            canvas.drawRoundRect(this.RemoteActionCompatParcelizer, this.setMaxEms ? setOnLongClickListener() : this.MenuHostHelper$$ExternalSyntheticLambda1, this.setMaxEms ? setOnLongClickListener() : this.MenuHostHelper$$ExternalSyntheticLambda1, this.setShrinkMotionSpec);
        }
        if (this.setMaxEms) {
            super.draw(canvas);
        }
        if (this.setTitleMarginEnd > 0.0f && !this.setMaxEms) {
            this.setShrinkMotionSpec.setColor(this.FabTransformationBehavior);
            this.setShrinkMotionSpec.setStyle(Paint.Style.STROKE);
            if (!this.setMaxEms) {
                Paint paint2 = this.setShrinkMotionSpec;
                ColorFilter colorFilter2 = this.setTooltipText;
                if (colorFilter2 == null) {
                    colorFilter2 = this.setErrorIconTintList;
                }
                paint2.setColorFilter(colorFilter2);
            }
            this.RemoteActionCompatParcelizer.set(bounds.left + (this.setTitleMarginEnd / 2.0f), bounds.top + (this.setTitleMarginEnd / 2.0f), bounds.right - (this.setTitleMarginEnd / 2.0f), bounds.bottom - (this.setTitleMarginEnd / 2.0f));
            float f6 = this.MenuHostHelper$$ExternalSyntheticLambda1 - (this.setTitleMarginEnd / 2.0f);
            canvas.drawRoundRect(this.RemoteActionCompatParcelizer, f6, f6, this.setShrinkMotionSpec);
        }
        this.setShrinkMotionSpec.setColor(this.createDispatcher);
        this.setShrinkMotionSpec.setStyle(Paint.Style.FILL);
        this.RemoteActionCompatParcelizer.set(bounds);
        boolean z = this.setMaxEms;
        if (!z) {
            canvas.drawRoundRect(this.RemoteActionCompatParcelizer, z ? setOnLongClickListener() : this.MenuHostHelper$$ExternalSyntheticLambda1, this.setMaxEms ? setOnLongClickListener() : this.MenuHostHelper$$ExternalSyntheticLambda1, this.setShrinkMotionSpec);
        } else {
            setIconTintList(new RectF(bounds), this.TextInputLayout$SavedState$1);
            super.setX(canvas, this.setShrinkMotionSpec, this.TextInputLayout$SavedState$1, setLayoutAnimation());
        }
        if (this.setError && this.RecyclerView$SavedState$1 != null) {
            setY(bounds, this.RemoteActionCompatParcelizer);
            float f7 = this.RemoteActionCompatParcelizer.left;
            float f8 = this.RemoteActionCompatParcelizer.top;
            canvas.translate(f7, f8);
            this.RecyclerView$SavedState$1.setBounds(0, 0, (int) this.RemoteActionCompatParcelizer.width(), (int) this.RemoteActionCompatParcelizer.height());
            this.RecyclerView$SavedState$1.draw(canvas);
            canvas.translate(-f7, -f8);
        }
        if (this.setFloatValues && this.setSuffixText != null && this.onActivityResumed) {
            setY(bounds, this.RemoteActionCompatParcelizer);
            float f9 = this.RemoteActionCompatParcelizer.left;
            float f10 = this.RemoteActionCompatParcelizer.top;
            canvas.translate(f9, f10);
            this.setSuffixText.setBounds(0, 0, (int) this.RemoteActionCompatParcelizer.width(), (int) this.RemoteActionCompatParcelizer.height());
            this.setSuffixText.draw(canvas);
            canvas.translate(-f9, -f10);
        }
        if (this.setAnimationFromJson && this.setCheckedIconEnabled != null) {
            PointF pointF = this.setChipIconEnabledResource;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.setCheckedIconEnabled != null) {
                float MenuHostHelper$$ExternalSyntheticLambda0 = this.setUiOptions + MenuHostHelper$$ExternalSyntheticLambda0() + this.setLayoutDirection;
                if (setEnsureMinTouchTargetSize.setIconTintList(this) == 0) {
                    pointF.x = bounds.left + MenuHostHelper$$ExternalSyntheticLambda0;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - MenuHostHelper$$ExternalSyntheticLambda0;
                    align = Paint.Align.RIGHT;
                }
                this.setMinAndMaxProgress.setY.getFontMetrics(this.setEmptyView);
                pointF.y = bounds.centerY() - ((this.setEmptyView.descent + this.setEmptyView.ascent) / 2.0f);
            }
            RectF rectF = this.RemoteActionCompatParcelizer;
            rectF.setEmpty();
            if (this.setCheckedIconEnabled != null) {
                float MenuHostHelper$$ExternalSyntheticLambda02 = this.setUiOptions + MenuHostHelper$$ExternalSyntheticLambda0() + this.setLayoutDirection;
                float centerIfNoTextEnabled = this.MenuHostHelper$$ExternalSyntheticLambda0 + setCenterIfNoTextEnabled() + this.setTextAppearanceResource;
                if (setEnsureMinTouchTargetSize.setIconTintList(this) == 0) {
                    rectF.left = bounds.left + MenuHostHelper$$ExternalSyntheticLambda02;
                    rectF.right = bounds.right - centerIfNoTextEnabled;
                } else {
                    rectF.left = bounds.left + centerIfNoTextEnabled;
                    rectF.right = bounds.right - MenuHostHelper$$ExternalSyntheticLambda02;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            if (this.setMinAndMaxProgress.setIconTintList != null) {
                this.setMinAndMaxProgress.setY.drawableState = getState();
                setReferencedIds setreferencedids = this.setMinAndMaxProgress;
                setreferencedids.setIconTintList.setX(this.setCenterIfNoTextEnabled, setreferencedids.setY, setreferencedids.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            this.setMinAndMaxProgress.setY.setTextAlign(align);
            setReferencedIds setreferencedids2 = this.setMinAndMaxProgress;
            String charSequence = this.setCheckedIconEnabled.toString();
            if (!setreferencedids2.setOnLongClickListener) {
                f = setreferencedids2.setX;
            } else {
                float measureText = charSequence != null ? setreferencedids2.setY.measureText((CharSequence) charSequence, 0, charSequence.length()) : 0.0f;
                setreferencedids2.setX = measureText;
                setreferencedids2.setOnLongClickListener = false;
                f = measureText;
            }
            boolean z2 = Math.round(f) > Math.round(this.RemoteActionCompatParcelizer.width());
            if (z2) {
                int save = canvas.save();
                canvas.clipRect(this.RemoteActionCompatParcelizer);
                i2 = save;
            } else {
                i2 = 0;
            }
            CharSequence charSequence2 = this.setCheckedIconEnabled;
            if (z2 && this.setGuidelinePercent != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, this.setMinAndMaxProgress.setY, this.RemoteActionCompatParcelizer.width(), this.setGuidelinePercent);
            }
            CharSequence charSequence3 = charSequence2;
            int i4 = i2;
            canvas.drawText(charSequence3, 0, charSequence3.length(), this.setChipIconEnabledResource.x, this.setChipIconEnabledResource.y, this.setMinAndMaxProgress.setY);
            if (z2) {
                canvas.restoreToCount(i4);
            }
        }
        if (this.setTextAlignment && this.setLayoutAnimation != null) {
            RectF rectF2 = this.RemoteActionCompatParcelizer;
            rectF2.setEmpty();
            if (this.setTextAlignment && this.setLayoutAnimation != null) {
                float f11 = this.MenuHostHelper$$ExternalSyntheticLambda0 + this.setUnboundedRipple;
                if (setEnsureMinTouchTargetSize.setIconTintList(this) == 0) {
                    rectF2.right = bounds.right - f11;
                    rectF2.left = rectF2.right - this.setChipCornerRadius;
                } else {
                    rectF2.left = bounds.left + f11;
                    rectF2.right = rectF2.left + this.setChipCornerRadius;
                }
                rectF2.top = bounds.exactCenterY() - (this.setChipCornerRadius / 2.0f);
                rectF2.bottom = rectF2.top + this.setChipCornerRadius;
            }
            float f12 = this.RemoteActionCompatParcelizer.left;
            float f13 = this.RemoteActionCompatParcelizer.top;
            canvas.translate(f12, f13);
            this.setLayoutAnimation.setBounds(0, 0, (int) this.RemoteActionCompatParcelizer.width(), (int) this.RemoteActionCompatParcelizer.height());
            if (setChipText.MenuHostHelper$$ExternalSyntheticLambda0) {
                this.setChipSpacingVertical.setBounds(this.setLayoutAnimation.getBounds());
                this.setChipSpacingVertical.jumpToCurrentState();
                this.setChipSpacingVertical.draw(canvas);
            } else {
                this.setLayoutAnimation.draw(canvas);
            }
            canvas.translate(-f12, -f13);
        }
        if (this.setFilterTouchesWhenObscured < 255) {
            canvas.restoreToCount(i);
        }
    }

    private void setY(Rect rect, RectF rectF) {
        float f;
        rectF.setEmpty();
        boolean z = false;
        if (!(this.setError && this.RecyclerView$SavedState$1 != null)) {
            if (this.setFloatValues && this.setSuffixText != null && this.onActivityResumed) {
                z = true;
            }
            if (!z) {
                return;
            }
        }
        float f2 = this.setUiOptions + this.setBackgroundTintMode;
        float ViewPager$SavedState$1 = ViewPager$SavedState$1();
        if (setEnsureMinTouchTargetSize.setIconTintList(this) == 0) {
            rectF.left = rect.left + f2;
            rectF.right = rectF.left + ViewPager$SavedState$1;
        } else {
            rectF.right = rect.right - f2;
            rectF.left = rectF.right - ViewPager$SavedState$1;
        }
        Drawable drawable = this.onActivityResumed ? this.setSuffixText : this.RecyclerView$SavedState$1;
        float f3 = this.setImageTintMode;
        if (f3 <= 0.0f && drawable != null) {
            f3 = (float) Math.ceil(TypedValue.applyDimension(1, 24.0f, this.setCenterIfNoTextEnabled.getResources().getDisplayMetrics()));
            if (drawable.getIntrinsicHeight() <= f3) {
                f = drawable.getIntrinsicHeight();
                rectF.top = rect.exactCenterY() - (f / 2.0f);
                rectF.bottom = rectF.top + f;
            }
        }
        f = f3;
        rectF.top = rect.exactCenterY() - (f / 2.0f);
        rectF.bottom = rectF.top + f;
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.setNavigationOnClickListener;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.setX;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.FirebaseRemoteConfigKtxRegistrar;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        if (this.setIconified) {
            ColorStateList colorStateList4 = this.ViewPager$SavedState$1;
            if (colorStateList4 != null && colorStateList4.isStateful()) {
                return true;
            }
        }
        setHeight setheight = this.setMinAndMaxProgress.setIconTintList;
        if ((setheight == null || setheight.setLayoutAnimation == null || !setheight.setLayoutAnimation.isStateful()) ? false : true) {
            return true;
        }
        if (this.setFloatValues && this.setSuffixText != null && this.setIconTintList) {
            return true;
        }
        Drawable drawable = this.RecyclerView$SavedState$1;
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        Drawable drawable2 = this.setSuffixText;
        if (drawable2 != null && drawable2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList5 = this.setChipSpacingHorizontal;
        return colorStateList5 != null && colorStateList5.isStateful();
    }

    public final boolean setX(int[] iArr) {
        if (!Arrays.equals(this.setHint, iArr)) {
            this.setHint = iArr;
            if (this.setTextAlignment && this.setLayoutAnimation != null) {
                return setX(getState(), iArr);
            }
        }
        return false;
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable, o.setReferencedIds.setY
    public boolean onStateChange(int[] iArr) {
        if (this.setMaxEms) {
            super.onStateChange(iArr);
        }
        return setX(iArr, this.setHint);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean setX(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DynamiteApi.setX(int[], int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        boolean z = false;
        if (this.setError && this.RecyclerView$SavedState$1 != null) {
            onLayoutDirectionChanged |= setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(this.RecyclerView$SavedState$1, i);
        }
        if (this.setFloatValues && this.setSuffixText != null && this.onActivityResumed) {
            onLayoutDirectionChanged |= setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(this.setSuffixText, i);
        }
        if (this.setTextAlignment && this.setLayoutAnimation != null) {
            z = true;
        }
        if (z) {
            onLayoutDirectionChanged |= setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        boolean z = true;
        if (this.setError && this.RecyclerView$SavedState$1 != null) {
            onLevelChange |= this.RecyclerView$SavedState$1.setLevel(i);
        }
        if (this.setFloatValues && this.setSuffixText != null && this.onActivityResumed) {
            onLevelChange |= this.setSuffixText.setLevel(i);
        }
        if ((!this.setTextAlignment || this.setLayoutAnimation == null) ? false : false) {
            onLevelChange |= this.setLayoutAnimation.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        boolean z3 = true;
        if (this.setError && this.RecyclerView$SavedState$1 != null) {
            visible |= this.RecyclerView$SavedState$1.setVisible(z, z2);
        }
        if (this.setFloatValues && this.setSuffixText != null && this.onActivityResumed) {
            visible |= this.setSuffixText.setVisible(z, z2);
        }
        if ((!this.setTextAlignment || this.setLayoutAnimation == null) ? false : false) {
            visible |= this.setLayoutAnimation.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.setFilterTouchesWhenObscured != i) {
            this.setFilterTouchesWhenObscured = i;
            invalidateSelf();
        }
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.setFilterTouchesWhenObscured;
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.setTooltipText != colorFilter) {
            this.setTooltipText = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.setTooltipText;
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        if (this.setChipSpacingHorizontal != colorStateList) {
            this.setChipSpacingHorizontal = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.setEdgeEffectFactory != mode) {
            this.setEdgeEffectFactory = mode;
            ColorStateList colorStateList = this.setChipSpacingHorizontal;
            this.setErrorIconTintList = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // o.setWebViewClient, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.setMaxEms) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.MenuHostHelper$$ExternalSyntheticLambda1);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    private void setY(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(drawable, setEnsureMinTouchTargetSize.setIconTintList(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.setLayoutAnimation) {
            if (drawable.isStateful()) {
                drawable.setState(this.setHint);
            }
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable, this.getCallingPid);
            return;
        }
        Drawable drawable2 = this.RecyclerView$SavedState$1;
        if (drawable == drawable2 && this.ActionMenuPresenter$SavedState$1) {
            setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(drawable2, this.setChipIconEnabled);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void setX(float f) {
        if (this.setY != f) {
            this.setY = f;
            invalidateSelf();
            DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
            if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }
    }

    public final void setIconTintList(ColorStateList colorStateList) {
        if (this.FirebaseRemoteConfigKtxRegistrar != colorStateList) {
            this.FirebaseRemoteConfigKtxRegistrar = colorStateList;
            if (this.setMaxEms && this.setChipIconTintResource.setOnNavigationItemSelectedListener != colorStateList) {
                this.setChipIconTintResource.setOnNavigationItemSelectedListener = colorStateList;
                onStateChange(getState());
            }
            onStateChange(getState());
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(float f) {
        if (this.setTitleMarginEnd != f) {
            this.setTitleMarginEnd = f;
            this.setShrinkMotionSpec.setStrokeWidth(f);
            if (this.setMaxEms) {
                this.setChipIconTintResource.setMaxEms = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(android.content.res.ColorStateList r31) {
        /*
            Method dump skipped, instructions count: 1316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.DynamiteApi.MenuHostHelper$$ExternalSyntheticLambda0(android.content.res.ColorStateList):void");
    }

    public final void setX(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.setCheckedIconEnabled, charSequence)) {
            return;
        }
        this.setCheckedIconEnabled = charSequence;
        this.setMinAndMaxProgress.setOnLongClickListener = true;
        invalidateSelf();
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
        if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setIconTintList(boolean z) {
        boolean z2 = this.setError;
        if (z2 != z) {
            boolean z3 = z2 && this.RecyclerView$SavedState$1 != null;
            this.setError = z;
            boolean z4 = z && this.RecyclerView$SavedState$1 != null;
            if (z3 != z4) {
                if (z4) {
                    setY(this.RecyclerView$SavedState$1);
                } else {
                    Drawable drawable = this.RecyclerView$SavedState$1;
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                }
                invalidateSelf();
                DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
                if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
                }
            }
        }
    }

    public final void setX(ColorStateList colorStateList) {
        boolean z = true;
        this.ActionMenuPresenter$SavedState$1 = true;
        if (this.setChipIconEnabled != colorStateList) {
            this.setChipIconEnabled = colorStateList;
            if ((!this.setError || this.RecyclerView$SavedState$1 == null) ? false : false) {
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(this.RecyclerView$SavedState$1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(float f) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setImageTintMode != f) {
            float MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            this.setImageTintMode = f;
            float MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
            invalidateSelf();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == MenuHostHelper$$ExternalSyntheticLambda02 || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setX(boolean z) {
        boolean z2 = this.setTextAlignment;
        if (z2 != z) {
            boolean z3 = z2 && this.setLayoutAnimation != null;
            this.setTextAlignment = z;
            boolean z4 = z && this.setLayoutAnimation != null;
            if (z3 != z4) {
                if (z4) {
                    setY(this.setLayoutAnimation);
                } else {
                    Drawable drawable = this.setLayoutAnimation;
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                }
                invalidateSelf();
                DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
                if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
                }
            }
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(ColorStateList colorStateList) {
        if (this.getCallingPid != colorStateList) {
            this.getCallingPid = colorStateList;
            if (this.setTextAlignment && this.setLayoutAnimation != null) {
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(this.setLayoutAnimation, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void setUnboundedRipple(float f) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setChipCornerRadius != f) {
            this.setChipCornerRadius = f;
            invalidateSelf();
            if (!(this.setTextAlignment && this.setLayoutAnimation != null) || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setIconTintList != z) {
            this.setIconTintList = z;
            float MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            if (!z && this.onActivityResumed) {
                this.onActivityResumed = false;
            }
            float MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
            invalidateSelf();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == MenuHostHelper$$ExternalSyntheticLambda02 || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        boolean z2 = this.setFloatValues;
        if (z2 != z) {
            boolean z3 = z2 && this.setSuffixText != null && this.onActivityResumed;
            this.setFloatValues = z;
            boolean z4 = z && this.setSuffixText != null && this.onActivityResumed;
            if (z3 != z4) {
                if (z4) {
                    setY(this.setSuffixText);
                } else {
                    Drawable drawable = this.setSuffixText;
                    if (drawable != null) {
                        drawable.setCallback(null);
                    }
                }
                invalidateSelf();
                DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
                if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
                }
            }
        }
    }

    public final void setIconTintList(Drawable drawable) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setSuffixText != drawable) {
            float MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            this.setSuffixText = drawable;
            float MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
            Drawable drawable2 = this.setSuffixText;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            setY(this.setSuffixText);
            invalidateSelf();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == MenuHostHelper$$ExternalSyntheticLambda02 || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setY(ColorStateList colorStateList) {
        if (this.setSelectedChildViewEnabled != colorStateList) {
            this.setSelectedChildViewEnabled = colorStateList;
            if (this.setFloatValues && this.setSuffixText != null && this.setIconTintList) {
                setEnsureMinTouchTargetSize.setIconTintList.setIconTintList(this.setSuffixText, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void setIconTintList(float f) {
        if (this.setUiOptions != f) {
            this.setUiOptions = f;
            invalidateSelf();
            DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
            if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }
    }

    public final void setUiOptions(float f) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setBackgroundTintMode != f) {
            float MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            this.setBackgroundTintMode = f;
            float MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
            invalidateSelf();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == MenuHostHelper$$ExternalSyntheticLambda02 || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setOnLongClickListener(float f) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setNavigationIconTint != f) {
            float MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            this.setNavigationIconTint = f;
            float MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
            invalidateSelf();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == MenuHostHelper$$ExternalSyntheticLambda02 || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setCenterIfNoTextEnabled(float f) {
        if (this.setLayoutDirection != f) {
            this.setLayoutDirection = f;
            invalidateSelf();
            DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
            if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }
    }

    public final void setChipCornerRadius(float f) {
        if (this.setTextAppearanceResource != f) {
            this.setTextAppearanceResource = f;
            invalidateSelf();
            DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
            if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }
    }

    public final void setLayoutAnimation(float f) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setIconSize != f) {
            this.setIconSize = f;
            invalidateSelf();
            if (!(this.setTextAlignment && this.setLayoutAnimation != null) || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setNavigationOnClickListener(float f) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setUnboundedRipple != f) {
            this.setUnboundedRipple = f;
            invalidateSelf();
            if (!(this.setTextAlignment && this.setLayoutAnimation != null) || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setY(float f) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != f) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = f;
            invalidateSelf();
            DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
            if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float MenuHostHelper$$ExternalSyntheticLambda0() {
        boolean z = true;
        if (!(this.setError && this.RecyclerView$SavedState$1 != null)) {
            if (!((this.setFloatValues && this.setSuffixText != null && this.onActivityResumed) ? false : false)) {
                return 0.0f;
            }
        }
        return this.setBackgroundTintMode + ViewPager$SavedState$1() + this.setNavigationIconTint;
    }

    private float setCenterIfNoTextEnabled() {
        if (this.setTextAlignment && this.setLayoutAnimation != null) {
            return this.setIconSize + this.setChipCornerRadius + this.setUnboundedRipple;
        }
        return 0.0f;
    }

    @Override // o.setReferencedIds.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get();
        if (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        invalidateSelf();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        Drawable drawable2 = this.RecyclerView$SavedState$1;
        Drawable onLongClickListener = drawable2 != null ? setEnsureMinTouchTargetSize.setOnLongClickListener(drawable2) : null;
        if (onLongClickListener != drawable) {
            float MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            this.RecyclerView$SavedState$1 = drawable != null ? setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate() : null;
            float MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
            if (onLongClickListener != null) {
                onLongClickListener.setCallback(null);
            }
            if (this.setError && this.RecyclerView$SavedState$1 != null) {
                setY(this.RecyclerView$SavedState$1);
            }
            invalidateSelf();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == MenuHostHelper$$ExternalSyntheticLambda02 || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    public final void setX(Drawable drawable) {
        DynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1;
        Drawable drawable2 = this.setLayoutAnimation;
        Drawable onLongClickListener = drawable2 != null ? setEnsureMinTouchTargetSize.setOnLongClickListener(drawable2) : null;
        if (onLongClickListener != drawable) {
            float centerIfNoTextEnabled = setCenterIfNoTextEnabled();
            this.setLayoutAnimation = drawable != null ? setEnsureMinTouchTargetSize.setNavigationOnClickListener(drawable).mutate() : null;
            if (setChipText.MenuHostHelper$$ExternalSyntheticLambda0) {
                this.setChipSpacingVertical = new RippleDrawable(setChipText.setY(this.setZ), this.setLayoutAnimation, setAdapter);
            }
            float centerIfNoTextEnabled2 = setCenterIfNoTextEnabled();
            if (onLongClickListener != null) {
                onLongClickListener.setCallback(null);
            }
            if (this.setTextAlignment && this.setLayoutAnimation != null) {
                setY(this.setLayoutAnimation);
            }
            invalidateSelf();
            if (centerIfNoTextEnabled == centerIfNoTextEnabled2 || (dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextScaleX.get()) == null) {
                return;
            }
            dynamiteApi$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    private static void b(char[] cArr, int i, byte b, Object[] objArr) {
        int i2;
        jr jrVar = new jr();
        char[] cArr2 = setMinEms;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object obj = jC.setTextScaleX.get(1058594953);
                    if (obj == null) {
                        byte b2 = (byte) 0;
                        byte b3 = b2;
                        Object[] objArr3 = new Object[1];
                        e(b2, b3, (byte) (b3 + 2), objArr3);
                        obj = ((Class) jC.setY(166 - TextUtils.indexOf("", ""), (char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20)).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(1058594953, obj);
                    }
                    cArr3[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(minusKey)};
            Object obj2 = jC.setTextScaleX.get(1058594953);
            long j = 0;
            char c = '\b';
            if (obj2 == null) {
                byte b4 = (byte) 0;
                byte b5 = b4;
                Object[] objArr5 = new Object[1];
                e(b4, b5, (byte) (b5 + 2), objArr5);
                obj2 = ((Class) jC.setY(166 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getScrollBarSize() >> 8) + 20)).getMethod((String) objArr5[0], Integer.TYPE);
                jC.setTextScaleX.put(1058594953, obj2);
            }
            char charValue = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                jrVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                while (jrVar.MenuHostHelper$$ExternalSyntheticLambda0 < i2) {
                    jrVar.MenuHostHelper$$ExternalSyntheticLambda1 = cArr[jrVar.MenuHostHelper$$ExternalSyntheticLambda0];
                    jrVar.setX = cArr[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1];
                    if (jrVar.MenuHostHelper$$ExternalSyntheticLambda1 == jrVar.setX) {
                        cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (jrVar.MenuHostHelper$$ExternalSyntheticLambda1 - b);
                        cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = (char) (jrVar.setX - b);
                    } else {
                        try {
                            Object[] objArr6 = new Object[13];
                            objArr6[12] = jrVar;
                            objArr6[11] = Integer.valueOf(charValue);
                            objArr6[10] = jrVar;
                            objArr6[9] = jrVar;
                            objArr6[c] = Integer.valueOf(charValue);
                            objArr6[7] = jrVar;
                            objArr6[6] = jrVar;
                            objArr6[5] = Integer.valueOf(charValue);
                            objArr6[4] = jrVar;
                            objArr6[3] = jrVar;
                            objArr6[2] = Integer.valueOf(charValue);
                            objArr6[1] = jrVar;
                            objArr6[0] = jrVar;
                            Object obj3 = jC.setTextScaleX.get(23685139);
                            if (obj3 == null) {
                                byte b6 = (byte) 0;
                                byte b7 = b6;
                                Object[] objArr7 = new Object[1];
                                e(b6, b7, b7, objArr7);
                                obj3 = ((Class) jC.setY(253 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), (char) (13777 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), ExpandableListView.getPackedPositionChild(j) + 10)).getMethod((String) objArr7[0], Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class);
                                jC.setTextScaleX.put(23685139, obj3);
                            }
                            if (((Integer) ((Method) obj3).invoke(null, objArr6)).intValue() == jrVar.setLayoutAnimation) {
                                try {
                                    Object[] objArr8 = {jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, jrVar, Integer.valueOf(charValue), Integer.valueOf(charValue), jrVar, Integer.valueOf(charValue), jrVar};
                                    Object obj4 = jC.setTextScaleX.get(-1549003164);
                                    if (obj4 == null) {
                                        byte b8 = (byte) 0;
                                        byte b9 = b8;
                                        Object[] objArr9 = new Object[1];
                                        e(b8, b9, (byte) (b9 + 3), objArr9);
                                        obj4 = ((Class) jC.setY((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 235, (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 4 - TextUtils.indexOf("", ""))).getMethod((String) objArr9[0], Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class);
                                        jC.setTextScaleX.put(-1549003164, obj4);
                                    }
                                    int intValue = ((Integer) ((Method) obj4).invoke(null, objArr8)).intValue();
                                    int i4 = (jrVar.setY * charValue) + jrVar.setLayoutAnimation;
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[intValue];
                                    cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i4];
                                } catch (Throwable th2) {
                                    Throwable cause2 = th2.getCause();
                                    if (cause2 == null) {
                                        throw th2;
                                    }
                                    throw cause2;
                                }
                            } else if (jrVar.setIconTintList == jrVar.setY) {
                                jrVar.setOnLongClickListener = ((jrVar.setOnLongClickListener + charValue) - 1) % charValue;
                                jrVar.setLayoutAnimation = ((jrVar.setLayoutAnimation + charValue) - 1) % charValue;
                                int i5 = (jrVar.setIconTintList * charValue) + jrVar.setOnLongClickListener;
                                int i6 = (jrVar.setY * charValue) + jrVar.setLayoutAnimation;
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[i5];
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i6];
                            } else {
                                int i7 = (jrVar.setIconTintList * charValue) + jrVar.setLayoutAnimation;
                                int i8 = (jrVar.setY * charValue) + jrVar.setOnLongClickListener;
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr2[i7];
                                cArr4[jrVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1] = cArr2[i8];
                            }
                        } catch (Throwable th3) {
                            Throwable cause3 = th3.getCause();
                            if (cause3 == null) {
                                throw th3;
                            }
                            throw cause3;
                        }
                    }
                    jrVar.MenuHostHelper$$ExternalSyntheticLambda0 += 2;
                    j = 0;
                    c = '\b';
                }
            }
            for (int i9 = 0; i9 < i; i9++) {
                cArr4[i9] = (char) (cArr4[i9] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }
}