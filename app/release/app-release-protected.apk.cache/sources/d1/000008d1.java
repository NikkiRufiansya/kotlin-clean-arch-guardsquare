package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillId;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import o.C0447s;
import o.setBaselineAlignBottom;
import o.setScrollBarDefaultDelayBeforeFade;

/* renamed from: o.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0447s extends LinearLayout {
    private AppDatabase ActionMenuPresenter$SavedState$1;
    private int ExtendableSavedState$1;
    private int FabTransformationBehavior;
    private ColorStateList FirebaseRemoteConfigKtxRegistrar;
    private setWebViewClient FloatingActionButton$BaseBehavior;
    private int Fragment$5;
    private setWebViewClient FragmentStateAdapter$2;
    private int FragmentStateAdapter$5;
    int MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private int RecyclerView$SavedState$1;
    private setScrollBarDefaultDelayBeforeFade RemoteActionCompatParcelizer;
    private int SearchView$SavedState$1;
    private Drawable TextInputLayout$SavedState$1;
    boolean ViewPager$SavedState$1;
    private Drawable createDispatcher;
    private int getCallingPid;
    private final Rect minusKey;
    private int onActivityResumed;
    private ColorStateList setAdapter;
    private ColorStateList setBackgroundTintMode;
    private final RectF setCallingWorkSourceUid;
    boolean setCenterIfNoTextEnabled;
    private boolean setCheckedIconEnabled;
    final C0339o setChipCornerRadius;
    private int setChipIconEnabled;
    private TextView setChipIconEnabledResource;
    private int setChipIconTintResource;
    private int setChipSpacingHorizontal;
    private boolean setChipSpacingVertical;
    private int setCloseIconEndPadding;
    private int setConstraintSet;
    private int setContentScrimResource;
    private final Rect setEdgeEffectFactory;
    private setWebViewClient setEmptyView;
    private int setError;
    private Typeface setErrorIconTintList;
    private boolean setFilterRedundantCalls;
    private int setFilterTouchesWhenObscured;
    private int setFloatValues;
    private final int setHasDecor;
    private boolean setHint;
    boolean setIconSize;
    boolean setIconTintList;
    private int setIconified;
    private int setImageTintMode;
    TextView setLayoutAnimation;
    private boolean setLayoutDirection;
    private CharSequence setLineBreakStyle;
    boolean setMaxEms;
    private setWebViewClient setMinAndMaxProgress;
    private ColorStateList setMinEms;
    private AppDatabase setNavigationIconTint;
    CharSequence setNavigationOnClickListener;
    private ColorStateList setObjectValues;
    final C0174g setOnLongClickListener;
    boolean setOnNavigationItemSelectedListener;
    private int setRevealInfo;
    private Drawable setSelectedChildViewEnabled;
    private StateListDrawable setShrinkMotionSpec;
    private int setSubmitButtonEnabled;
    private ColorStateList setSuffixText;
    setY setTextAlignment;
    private ValueAnimator setTextAppearanceResource;
    CharSequence setTextScaleX;
    private int setTitleMarginEnd;
    private final FrameLayout setTooltipText;
    final LinkedHashSet<s$MenuHostHelper$$ExternalSyntheticLambda1> setUiOptions;
    public EditText setUnboundedRipple;
    private int setViewTranslationCallback;
    final StaggeredGridLayoutManager setX;
    int setY;
    final C0474t setZ;
    public static final byte[] $$d = {53, -98, 98, -100, 13, -16, 42, -27, -13, 0, 25, -22, -6, -7, 39, -30, -11, -2, 64, -63, 40};
    public static final int $$e = 172;
    public static final byte[] $$a = {4, -87, 42, 65, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
    public static final int $$b = 177;
    private static final int setAnimationFromJson = R.style._res_0x7f15030d;
    private static final int[][] setGuidelinePercent = {new int[]{16842919}, new int[0]};

    /* renamed from: o.s$setX */
    /* loaded from: classes.dex */
    public interface setX {
    }

    /* renamed from: o.s$setY */
    /* loaded from: classes.dex */
    public interface setY {
        int MenuHostHelper$$ExternalSyntheticLambda1(Editable editable);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002f -> B:11:0x0038). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 36
            int r8 = 40 - r8
            byte[] r0 = o.C0447s.$$a
            int r6 = r6 * 38
            int r6 = r6 + 77
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1c
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L38
        L1c:
            r3 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L20:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2f
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2f:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L38:
            int r6 = -r6
            int r7 = r7 + r6
            int r7 = r7 + (-13)
            int r6 = r8 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0447s.a(short, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = 115 - r8
            byte[] r0 = o.C0447s.$$d
            int r6 = r6 + 4
            int r7 = r7 * 11
            int r7 = 15 - r7
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r8
            r3 = 0
            r8 = r7
            r7 = r6
            goto L30
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0447s.b(short, int, byte, java.lang.Object[]):void");
    }

    public C0447s(Context context) {
        this(context, null);
    }

    public C0447s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f04043b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C0447s(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instructions count: 900
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0447s.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [o.s$MenuHostHelper$$ExternalSyntheticLambda0] */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.setTooltipText.addView(view, layoutParams2);
            this.setTooltipText.setLayoutParams(layoutParams);
            setMaxEms();
            EditText editText = (EditText) view;
            if (this.setUnboundedRipple != null) {
                throw new IllegalArgumentException("We already have an EditText, can only have one");
            }
            if (this.setOnLongClickListener.setLayoutAnimation != 3 && !(editText instanceof C0420r)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.setUnboundedRipple = editText;
            int i2 = this.FabTransformationBehavior;
            if (i2 != -1) {
                setMinEms(i2);
            } else {
                setMinWidth(this.setRevealInfo);
            }
            int i3 = this.setCloseIconEndPadding;
            if (i3 != -1) {
                setMaxEms(i3);
            } else {
                setMaxWidth(this.Fragment$5);
            }
            this.setLayoutDirection = false;
            setTextAlignment();
            setTextInputAccessibilityDelegate(new setCounterOverflowTextColor(this) { // from class: o.s$MenuHostHelper$$ExternalSyntheticLambda0
                private final C0447s setX;

                {
                    this.setX = this;
                }

                @Override // o.setCounterOverflowTextColor
                public void setY(View view2, setDecorPadding setdecorpadding) {
                    TextView textView;
                    super.setY(view2, setdecorpadding);
                    EditText editText2 = this.setX.setUnboundedRipple;
                    CharSequence charSequence = null;
                    CharSequence text = editText2 != null ? editText2.getText() : null;
                    C0447s c0447s = this.setX;
                    CharSequence charSequence2 = c0447s.setIconSize ? c0447s.setNavigationOnClickListener : null;
                    C0447s c0447s2 = this.setX;
                    CharSequence charSequence3 = c0447s2.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0 ? c0447s2.setChipCornerRadius.setUnboundedRipple : null;
                    C0447s c0447s3 = this.setX;
                    CharSequence charSequence4 = c0447s3.setMaxEms ? c0447s3.setTextScaleX : null;
                    int i4 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0;
                    C0447s c0447s4 = this.setX;
                    if (c0447s4.MenuHostHelper$$ExternalSyntheticLambda1 && c0447s4.setIconTintList && (textView = c0447s4.setLayoutAnimation) != null) {
                        charSequence = textView.getContentDescription();
                    }
                    boolean z = !TextUtils.isEmpty(text);
                    boolean isEmpty = TextUtils.isEmpty(charSequence2);
                    boolean z2 = this.setX.setCenterIfNoTextEnabled;
                    boolean z3 = !TextUtils.isEmpty(charSequence3);
                    boolean z4 = z3 || !TextUtils.isEmpty(charSequence);
                    String charSequence5 = isEmpty ^ true ? charSequence2.toString() : "";
                    C0474t c0474t = this.setX.setZ;
                    if (c0474t.setIconTintList.getVisibility() == 0) {
                        setdecorpadding.setIconTintList(c0474t.setIconTintList);
                        setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(c0474t.setIconTintList);
                    } else {
                        setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(c0474t.setUiOptions);
                    }
                    if (z) {
                        setdecorpadding.setNavigationOnClickListener(text);
                    } else if (!TextUtils.isEmpty(charSequence5)) {
                        setdecorpadding.setNavigationOnClickListener(charSequence5);
                        if ((!z2) && charSequence4 != null) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(charSequence5);
                            sb.append(", ");
                            sb.append((Object) charSequence4);
                            setdecorpadding.setNavigationOnClickListener(sb.toString());
                        }
                    } else if (charSequence4 != null) {
                        setdecorpadding.setNavigationOnClickListener(charSequence4);
                    }
                    if (!TextUtils.isEmpty(charSequence5)) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            setdecorpadding.setY((CharSequence) charSequence5);
                        } else {
                            if (z) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append((Object) text);
                                sb2.append(", ");
                                sb2.append(charSequence5);
                                charSequence5 = sb2.toString();
                            }
                            setdecorpadding.setNavigationOnClickListener(charSequence5);
                        }
                        setdecorpadding.setTextAlignment(!z);
                    }
                    setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0((text == null || text.length() != i4) ? -1 : -1);
                    if (z4) {
                        if (!z3) {
                            charSequence3 = charSequence;
                        }
                        setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda1(charSequence3);
                    }
                    View view3 = this.setX.setChipCornerRadius.setIconSize;
                    if (view3 != null) {
                        setdecorpadding.setIconTintList(view3);
                    }
                    C0174g c0174g = this.setX.setOnLongClickListener;
                    c0174g.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0174g.setLayoutAnimation).setX(setdecorpadding);
                }

                @Override // o.setCounterOverflowTextColor
                public void MenuHostHelper$$ExternalSyntheticLambda1(View view2, AccessibilityEvent accessibilityEvent) {
                    super.MenuHostHelper$$ExternalSyntheticLambda1(view2, accessibilityEvent);
                    C0174g c0174g = this.setX.setOnLongClickListener;
                    c0174g.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0174g.setLayoutAnimation).setY(accessibilityEvent);
                }
            });
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.setX;
            Typeface typeface = this.setUnboundedRipple.getTypeface();
            boolean MenuHostHelper$$ExternalSyntheticLambda1 = staggeredGridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1(typeface);
            boolean x = staggeredGridLayoutManager.setX(typeface);
            if (MenuHostHelper$$ExternalSyntheticLambda1 || x) {
                staggeredGridLayoutManager.setY(false);
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.setX;
            float textSize = this.setUnboundedRipple.getTextSize();
            if (staggeredGridLayoutManager2.setLayoutAnimation != textSize) {
                staggeredGridLayoutManager2.setLayoutAnimation = textSize;
                staggeredGridLayoutManager2.setY(false);
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager3 = this.setX;
            float letterSpacing = this.setUnboundedRipple.getLetterSpacing();
            if (staggeredGridLayoutManager3.setX != letterSpacing) {
                staggeredGridLayoutManager3.setX = letterSpacing;
                staggeredGridLayoutManager3.setY(false);
            }
            int gravity = this.setUnboundedRipple.getGravity();
            StaggeredGridLayoutManager staggeredGridLayoutManager4 = this.setX;
            int i4 = (gravity & (-113)) | 48;
            if (staggeredGridLayoutManager4.MenuHostHelper$$ExternalSyntheticLambda1 != i4) {
                staggeredGridLayoutManager4.MenuHostHelper$$ExternalSyntheticLambda1 = i4;
                staggeredGridLayoutManager4.setY(false);
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager5 = this.setX;
            if (staggeredGridLayoutManager5.setUiOptions != gravity) {
                staggeredGridLayoutManager5.setUiOptions = gravity;
                staggeredGridLayoutManager5.setY(false);
            }
            this.setUnboundedRipple.addTextChangedListener(new TextWatcher() { // from class: o.s.1
                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    C0447s c0447s = C0447s.this;
                    c0447s.MenuHostHelper$$ExternalSyntheticLambda0(!c0447s.setOnNavigationItemSelectedListener, false);
                    if (C0447s.this.MenuHostHelper$$ExternalSyntheticLambda1) {
                        C0447s.this.setY(editable);
                    }
                    if (C0447s.this.setMaxEms) {
                        C0447s c0447s2 = C0447s.this;
                        if (c0447s2.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1(editable) == 0 && !c0447s2.setCenterIfNoTextEnabled) {
                            c0447s2.setY();
                        } else {
                            c0447s2.setX();
                        }
                    }
                }
            });
            if (this.setAdapter == null) {
                this.setAdapter = this.setUnboundedRipple.getHintTextColors();
            }
            if (this.setIconSize) {
                if (TextUtils.isEmpty(this.setNavigationOnClickListener)) {
                    CharSequence hint = this.setUnboundedRipple.getHint();
                    this.setLineBreakStyle = hint;
                    setHint(hint);
                    this.setUnboundedRipple.setHint((CharSequence) null);
                }
                this.ViewPager$SavedState$1 = true;
            }
            if (this.setLayoutAnimation != null) {
                setY(this.setUnboundedRipple.getText());
            }
            MenuHostHelper$$ExternalSyntheticLambda1();
            this.setChipCornerRadius.setIconTintList();
            this.setZ.bringToFront();
            this.setOnLongClickListener.bringToFront();
            Iterator<s$MenuHostHelper$$ExternalSyntheticLambda1> it = this.setUiOptions.iterator();
            while (it.hasNext()) {
                it.next().MenuHostHelper$$ExternalSyntheticLambda0(this);
            }
            this.setOnLongClickListener.setOnLongClickListener();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            MenuHostHelper$$ExternalSyntheticLambda0(false, true);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.setY) {
            return;
        }
        this.setY = i;
        if (this.setUnboundedRipple != null) {
            setTextAlignment();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        EditText editText = this.setUnboundedRipple;
        if (editText == null || this.setMinAndMaxProgress == null) {
            return;
        }
        if ((this.setLayoutDirection || editText.getBackground() == null) && this.setY != 0) {
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this.setUnboundedRipple, setOnLongClickListener());
            this.setLayoutDirection = true;
        }
    }

    private Drawable setOnLongClickListener() {
        EditText editText = this.setUnboundedRipple;
        if (editText instanceof AutoCompleteTextView) {
            if (!(editText.getInputType() != 0)) {
                int MenuHostHelper$$ExternalSyntheticLambda1 = setIndeterminateDrawable.MenuHostHelper$$ExternalSyntheticLambda1(this.setUnboundedRipple, R.attr.res_0x7f0400e4);
                int i = this.setY;
                if (i != 2) {
                    if (i == 1) {
                        setWebViewClient setwebviewclient = this.setMinAndMaxProgress;
                        int i2 = this.setChipIconTintResource;
                        return new RippleDrawable(new ColorStateList(setGuidelinePercent, new int[]{setExtended.setY(setExtended.setIconTintList(i2, Math.round(Color.alpha(i2) * 0.1f)), MenuHostHelper$$ExternalSyntheticLambda1), i2}), setwebviewclient, setwebviewclient);
                    }
                    return null;
                }
                Context context = getContext();
                setWebViewClient setwebviewclient2 = this.setMinAndMaxProgress;
                int[][] iArr = setGuidelinePercent;
                int MenuHostHelper$$ExternalSyntheticLambda12 = setIndeterminateDrawable.MenuHostHelper$$ExternalSyntheticLambda1(context, R.attr.res_0x7f040101, "TextInputLayout");
                setWebViewClient setwebviewclient3 = new setWebViewClient(setwebviewclient2.setChipIconTintResource.setTextAlignment);
                int y = setExtended.setY(setExtended.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12, Math.round(Color.alpha(MenuHostHelper$$ExternalSyntheticLambda12) * 0.1f)), MenuHostHelper$$ExternalSyntheticLambda1);
                ColorStateList colorStateList = new ColorStateList(iArr, new int[]{y, 0});
                if (setwebviewclient3.setChipIconTintResource.setX != colorStateList) {
                    setwebviewclient3.setChipIconTintResource.setX = colorStateList;
                    setwebviewclient3.onStateChange(setwebviewclient3.getState());
                }
                setwebviewclient3.setTint(MenuHostHelper$$ExternalSyntheticLambda12);
                ColorStateList colorStateList2 = new ColorStateList(iArr, new int[]{y, MenuHostHelper$$ExternalSyntheticLambda12});
                setWebViewClient setwebviewclient4 = new setWebViewClient(setwebviewclient2.setChipIconTintResource.setTextAlignment);
                setwebviewclient4.setTint(-1);
                return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList2, setwebviewclient3, setwebviewclient4), setwebviewclient2});
            }
        }
        return this.setMinAndMaxProgress;
    }

    private setWebViewClient setY(boolean z) {
        float dimensionPixelOffset;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(R.dimen.res_0x7f07022f);
        float f = z ? dimensionPixelOffset2 : 0.0f;
        EditText editText = this.setUnboundedRipple;
        if (!(editText instanceof C0259k)) {
            dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.res_0x7f0701ee);
        } else {
            dimensionPixelOffset = ((C0259k) editText).setIconTintList;
        }
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(R.dimen.res_0x7f0701f0);
        setScrollBarDefaultDelayBeforeFade.setY sety = new setScrollBarDefaultDelayBeforeFade.setY();
        sety.setNavigationOnClickListener = new setActionBarVisibilityCallback(f);
        sety.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(f);
        sety.setY = new setActionBarVisibilityCallback(dimensionPixelOffset2);
        sety.setIconTintList = new setActionBarVisibilityCallback(dimensionPixelOffset2);
        setScrollBarDefaultDelayBeforeFade setscrollbardefaultdelaybeforefade = new setScrollBarDefaultDelayBeforeFade(sety, (byte) 0);
        Context context = getContext();
        int MenuHostHelper$$ExternalSyntheticLambda1 = setIndeterminateDrawable.MenuHostHelper$$ExternalSyntheticLambda1(context, R.attr.res_0x7f040101, "MaterialShapeDrawable");
        setWebViewClient setwebviewclient = new setWebViewClient();
        setwebviewclient.setX(context);
        ColorStateList valueOf = ColorStateList.valueOf(MenuHostHelper$$ExternalSyntheticLambda1);
        if (setwebviewclient.setChipIconTintResource.setX != valueOf) {
            setwebviewclient.setChipIconTintResource.setX = valueOf;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
        setwebviewclient.setIconSize(dimensionPixelOffset);
        setwebviewclient.setShapeAppearanceModel(setscrollbardefaultdelaybeforefade);
        if (setwebviewclient.setChipIconTintResource.setUnboundedRipple == null) {
            setwebviewclient.setChipIconTintResource.setUnboundedRipple = new Rect();
        }
        setwebviewclient.setChipIconTintResource.setUnboundedRipple.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        setwebviewclient.invalidateSelf();
        return setwebviewclient;
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.setIconified = i;
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidth(int i) {
        this.SearchView$SavedState$1 = i;
        setLayoutAnimation();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.FragmentStateAdapter$5 = i;
        setLayoutAnimation();
    }

    public void setBoxStrokeColor(int i) {
        if (this.setError != i) {
            this.setError = i;
            setLayoutAnimation();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.RecyclerView$SavedState$1 = colorStateList.getDefaultColor();
            this.setFloatValues = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.getCallingPid = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.setError = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.setError != colorStateList.getDefaultColor()) {
            this.setError = colorStateList.getDefaultColor();
        }
        setLayoutAnimation();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.setMinEms != colorStateList) {
            this.setMinEms = colorStateList;
            setLayoutAnimation();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(setLineHeight.setY(getContext(), i));
    }

    public void setBoxBackgroundColor(int i) {
        if (this.setChipIconTintResource != i) {
            this.setChipIconTintResource = i;
            this.setViewTranslationCallback = i;
            this.setTitleMarginEnd = i;
            this.onActivityResumed = i;
            setUnboundedRipple();
        }
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.setViewTranslationCallback = defaultColor;
        this.setChipIconTintResource = defaultColor;
        this.setChipIconEnabled = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.setTitleMarginEnd = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.onActivityResumed = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        setUnboundedRipple();
    }

    public void setBoxCornerRadiiResources(int i, int i2, int i3, int i4) {
        setBoxCornerRadii(getContext().getResources().getDimension(i), getContext().getResources().getDimension(i2), getContext().getResources().getDimension(i4), getContext().getResources().getDimension(i3));
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.setErrorIconTintList) {
            this.setErrorIconTintList = typeface;
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.setX;
            boolean MenuHostHelper$$ExternalSyntheticLambda1 = staggeredGridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1(typeface);
            boolean x = staggeredGridLayoutManager.setX(typeface);
            if (MenuHostHelper$$ExternalSyntheticLambda1 || x) {
                staggeredGridLayoutManager.setY(false);
            }
            C0339o c0339o = this.setChipCornerRadius;
            if (typeface != c0339o.setTextScaleX) {
                c0339o.setTextScaleX = typeface;
                TextView textView = c0339o.setUiOptions;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = c0339o.setIconSize;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.setLayoutAnimation;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public void setLengthCounter(setY sety) {
        this.setTextAlignment = sety;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        AutofillId autofillId;
        EditText editText = this.setUnboundedRipple;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.setLineBreakStyle != null) {
            boolean z = this.ViewPager$SavedState$1;
            this.ViewPager$SavedState$1 = false;
            CharSequence hint = editText.getHint();
            this.setUnboundedRipple.setHint(this.setLineBreakStyle);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.setUnboundedRipple.setHint(hint);
                this.ViewPager$SavedState$1 = z;
            }
        }
        autofillId = getAutofillId();
        viewStructure.setAutofillId(autofillId);
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.setTooltipText.getChildCount());
        for (int i2 = 0; i2 < this.setTooltipText.getChildCount(); i2++) {
            View childAt = this.setTooltipText.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.setUnboundedRipple) {
                newChild.setHint(this.setIconSize ? this.setNavigationOnClickListener : null);
            }
        }
    }

    private void setMaxEms() {
        if (this.setY != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.setTooltipText.getLayoutParams();
            int navigationOnClickListener = setNavigationOnClickListener();
            if (navigationOnClickListener != ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = navigationOnClickListener;
                this.setTooltipText.requestLayout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.setUnboundedRipple;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + setNavigationOnClickListener();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z, boolean z2) {
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.setUnboundedRipple;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.setUnboundedRipple;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.setAdapter;
        if (colorStateList2 != null) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.setX;
            if (staggeredGridLayoutManager.setIconTintList != colorStateList2) {
                staggeredGridLayoutManager.setIconTintList = colorStateList2;
                staggeredGridLayoutManager.setY(false);
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.setX;
            ColorStateList colorStateList3 = this.setAdapter;
            if (staggeredGridLayoutManager2.setNavigationOnClickListener != colorStateList3) {
                staggeredGridLayoutManager2.setNavigationOnClickListener = colorStateList3;
                staggeredGridLayoutManager2.setY(false);
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.setAdapter;
            if (colorStateList4 != null) {
                i = colorStateList4.getColorForState(new int[]{-16842910}, this.setFloatValues);
            } else {
                i = this.setFloatValues;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager3 = this.setX;
            ColorStateList valueOf = ColorStateList.valueOf(i);
            if (staggeredGridLayoutManager3.setIconTintList != valueOf) {
                staggeredGridLayoutManager3.setIconTintList = valueOf;
                staggeredGridLayoutManager3.setY(false);
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager4 = this.setX;
            ColorStateList valueOf2 = ColorStateList.valueOf(i);
            if (staggeredGridLayoutManager4.setNavigationOnClickListener != valueOf2) {
                staggeredGridLayoutManager4.setNavigationOnClickListener = valueOf2;
                staggeredGridLayoutManager4.setY(false);
            }
        } else if (this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1()) {
            StaggeredGridLayoutManager staggeredGridLayoutManager5 = this.setX;
            TextView textView2 = this.setChipCornerRadius.setUiOptions;
            ColorStateList textColors = textView2 != null ? textView2.getTextColors() : null;
            if (staggeredGridLayoutManager5.setIconTintList != textColors) {
                staggeredGridLayoutManager5.setIconTintList = textColors;
                staggeredGridLayoutManager5.setY(false);
            }
        } else if (this.setIconTintList && (textView = this.setLayoutAnimation) != null) {
            StaggeredGridLayoutManager staggeredGridLayoutManager6 = this.setX;
            ColorStateList textColors2 = textView.getTextColors();
            if (staggeredGridLayoutManager6.setIconTintList != textColors2) {
                staggeredGridLayoutManager6.setIconTintList = textColors2;
                staggeredGridLayoutManager6.setY(false);
            }
        } else if (z4 && (colorStateList = this.FirebaseRemoteConfigKtxRegistrar) != null) {
            StaggeredGridLayoutManager staggeredGridLayoutManager7 = this.setX;
            if (staggeredGridLayoutManager7.setIconTintList != colorStateList) {
                staggeredGridLayoutManager7.setIconTintList = colorStateList;
                staggeredGridLayoutManager7.setY(false);
            }
        }
        if (z3 || !this.setChipSpacingVertical || (isEnabled() && z4)) {
            if (z2 || this.setCenterIfNoTextEnabled) {
                MenuHostHelper$$ExternalSyntheticLambda1(z);
            }
        } else if (z2 || !this.setCenterIfNoTextEnabled) {
            setIconTintList(z);
        }
    }

    public void setMinEms(int i) {
        this.FabTransformationBehavior = i;
        EditText editText = this.setUnboundedRipple;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMaxEms(int i) {
        this.setCloseIconEndPadding = i;
        EditText editText = this.setUnboundedRipple;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMinWidth(int i) {
        this.setRevealInfo = i;
        EditText editText = this.setUnboundedRipple;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMaxWidth(int i) {
        this.Fragment$5 = i;
        EditText editText = this.setUnboundedRipple;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setHint(CharSequence charSequence) {
        if (this.setIconSize) {
            setIconTintList(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    private void setIconTintList(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.setNavigationOnClickListener)) {
            return;
        }
        this.setNavigationOnClickListener = charSequence;
        this.setX.setX(charSequence);
        if (this.setCenterIfNoTextEnabled) {
            return;
        }
        setChipCornerRadius();
    }

    public void setHintEnabled(boolean z) {
        if (z != this.setIconSize) {
            this.setIconSize = z;
            if (!z) {
                this.ViewPager$SavedState$1 = false;
                if (!TextUtils.isEmpty(this.setNavigationOnClickListener) && TextUtils.isEmpty(this.setUnboundedRipple.getHint())) {
                    this.setUnboundedRipple.setHint(this.setNavigationOnClickListener);
                }
                setIconTintList((CharSequence) null);
            } else {
                CharSequence hint = this.setUnboundedRipple.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.setNavigationOnClickListener)) {
                        setHint(hint);
                    }
                    this.setUnboundedRipple.setHint((CharSequence) null);
                }
                this.ViewPager$SavedState$1 = true;
            }
            if (this.setUnboundedRipple != null) {
                setMaxEms();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(i);
        this.FirebaseRemoteConfigKtxRegistrar = this.setX.setIconTintList;
        if (this.setUnboundedRipple != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(false, false);
            setMaxEms();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.FirebaseRemoteConfigKtxRegistrar != colorStateList) {
            if (this.setAdapter == null) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.setX;
                if (staggeredGridLayoutManager.setIconTintList != colorStateList) {
                    staggeredGridLayoutManager.setIconTintList = colorStateList;
                    staggeredGridLayoutManager.setY(false);
                }
            }
            this.FirebaseRemoteConfigKtxRegistrar = colorStateList;
            if (this.setUnboundedRipple != null) {
                MenuHostHelper$$ExternalSyntheticLambda0(false, false);
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.setAdapter = colorStateList;
        this.FirebaseRemoteConfigKtxRegistrar = colorStateList;
        if (this.setUnboundedRipple != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(false, false);
        }
    }

    public void setErrorEnabled(boolean z) {
        C0339o c0339o = this.setChipCornerRadius;
        if (c0339o.MenuHostHelper$$ExternalSyntheticLambda0 != z) {
            Animator animator = c0339o.setX;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                getStableInsets getstableinsets = new getStableInsets(c0339o.setY);
                c0339o.setUiOptions = getstableinsets;
                getstableinsets.setId(R.id.res_0x7f0a01f3);
                c0339o.setUiOptions.setTextAlignment(5);
                Typeface typeface = c0339o.setTextScaleX;
                if (typeface != null) {
                    c0339o.setUiOptions.setTypeface(typeface);
                }
                int i = c0339o.setNavigationOnClickListener;
                c0339o.setNavigationOnClickListener = i;
                TextView textView = c0339o.setUiOptions;
                if (textView != null) {
                    c0339o.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0(textView, i);
                }
                ColorStateList colorStateList = c0339o.setOnLongClickListener;
                c0339o.setOnLongClickListener = colorStateList;
                TextView textView2 = c0339o.setUiOptions;
                if (textView2 != null && colorStateList != null) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = c0339o.setLayoutAnimation;
                c0339o.setLayoutAnimation = charSequence;
                TextView textView3 = c0339o.setUiOptions;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                c0339o.setUiOptions.setVisibility(4);
                c0339o.setUiOptions.setAccessibilityLiveRegion(1);
                c0339o.MenuHostHelper$$ExternalSyntheticLambda0(c0339o.setUiOptions, 0);
            } else {
                c0339o.MenuHostHelper$$ExternalSyntheticLambda0();
                c0339o.MenuHostHelper$$ExternalSyntheticLambda1(c0339o.setUiOptions, 0);
                c0339o.setUiOptions = null;
                c0339o.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda1();
                c0339o.setMaxEms.setLayoutAnimation();
            }
            c0339o.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        }
    }

    public void setErrorTextAppearance(int i) {
        C0339o c0339o = this.setChipCornerRadius;
        c0339o.setNavigationOnClickListener = i;
        TextView textView = c0339o.setUiOptions;
        if (textView != null) {
            c0339o.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda0(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0339o c0339o = this.setChipCornerRadius;
        c0339o.setOnLongClickListener = colorStateList;
        TextView textView = c0339o.setUiOptions;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextTextAppearance(int i) {
        C0339o c0339o = this.setChipCornerRadius;
        c0339o.setChipCornerRadius = i;
        TextView textView = c0339o.setIconSize;
        if (textView != null) {
            setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(textView, i);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0339o c0339o = this.setChipCornerRadius;
        c0339o.setTextAlignment = colorStateList;
        TextView textView = c0339o.setIconSize;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        final C0339o c0339o = this.setChipCornerRadius;
        if (c0339o.ViewPager$SavedState$1 != z) {
            Animator animator = c0339o.setX;
            if (animator != null) {
                animator.cancel();
            }
            if (z) {
                getStableInsets getstableinsets = new getStableInsets(c0339o.setY);
                c0339o.setIconSize = getstableinsets;
                getstableinsets.setId(R.id.res_0x7f0a01f4);
                c0339o.setIconSize.setTextAlignment(5);
                Typeface typeface = c0339o.setTextScaleX;
                if (typeface != null) {
                    c0339o.setIconSize.setTypeface(typeface);
                }
                c0339o.setIconSize.setVisibility(4);
                c0339o.setIconSize.setAccessibilityLiveRegion(1);
                int i = c0339o.setChipCornerRadius;
                c0339o.setChipCornerRadius = i;
                TextView textView = c0339o.setIconSize;
                if (textView != null) {
                    setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(textView, i);
                }
                ColorStateList colorStateList = c0339o.setTextAlignment;
                c0339o.setTextAlignment = colorStateList;
                TextView textView2 = c0339o.setIconSize;
                if (textView2 != null && colorStateList != null) {
                    textView2.setTextColor(colorStateList);
                }
                c0339o.MenuHostHelper$$ExternalSyntheticLambda0(c0339o.setIconSize, 1);
                c0339o.setIconSize.setAccessibilityDelegate(new View.AccessibilityDelegate() { // from class: o.o.4
                    @Override // android.view.View.AccessibilityDelegate
                    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                        EditText editText = C0339o.this.setMaxEms.setUnboundedRipple;
                        if (editText != null) {
                            accessibilityNodeInfo.setLabeledBy(editText);
                        }
                    }
                });
            } else {
                Animator animator2 = c0339o.setX;
                if (animator2 != null) {
                    animator2.cancel();
                }
                int i2 = c0339o.MenuHostHelper$$ExternalSyntheticLambda1;
                if (i2 == 2) {
                    c0339o.setIconTintList = 0;
                }
                c0339o.MenuHostHelper$$ExternalSyntheticLambda0(i2, c0339o.setIconTintList, c0339o.setX(c0339o.setIconSize, ""));
                c0339o.MenuHostHelper$$ExternalSyntheticLambda1(c0339o.setIconSize, 1);
                c0339o.setIconSize = null;
                c0339o.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda1();
                c0339o.setMaxEms.setLayoutAnimation();
            }
            c0339o.ViewPager$SavedState$1 = z;
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.setChipCornerRadius.ViewPager$SavedState$1) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.setChipCornerRadius.ViewPager$SavedState$1) {
            setHelperTextEnabled(true);
        }
        C0339o c0339o = this.setChipCornerRadius;
        Animator animator = c0339o.setX;
        if (animator != null) {
            animator.cancel();
        }
        c0339o.setCenterIfNoTextEnabled = charSequence;
        c0339o.setIconSize.setText(charSequence);
        int i = c0339o.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i != 2) {
            c0339o.setIconTintList = 2;
        }
        c0339o.MenuHostHelper$$ExternalSyntheticLambda0(i, c0339o.setIconTintList, c0339o.setX(c0339o.setIconSize, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0339o c0339o = this.setChipCornerRadius;
        c0339o.setLayoutAnimation = charSequence;
        TextView textView = c0339o.setUiOptions;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            C0339o c0339o = this.setChipCornerRadius;
            Animator animator = c0339o.setX;
            if (animator != null) {
                animator.cancel();
            }
            c0339o.setUnboundedRipple = charSequence;
            c0339o.setUiOptions.setText(charSequence);
            int i = c0339o.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i != 1) {
                c0339o.setIconTintList = 1;
            }
            c0339o.MenuHostHelper$$ExternalSyntheticLambda0(i, c0339o.setIconTintList, c0339o.setX(c0339o.setUiOptions, charSequence));
            return;
        }
        this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public void setErrorIconDrawable(int i) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.ViewPager$SavedState$1.setImageDrawable(i != 0 ? setFilterTouchesWhenObscured.setIconTintList(c0174g.getContext(), i) : null);
        c0174g.setIconTintList();
        C0146f.setX(c0174g.setZ, c0174g.ViewPager$SavedState$1, c0174g.setIconSize, c0174g.setCenterIfNoTextEnabled);
        C0146f.MenuHostHelper$$ExternalSyntheticLambda1(c0174g.setZ, c0174g.ViewPager$SavedState$1, c0174g.setIconSize);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.ViewPager$SavedState$1.setImageDrawable(drawable);
        c0174g.setIconTintList();
        C0146f.setX(c0174g.setZ, c0174g.ViewPager$SavedState$1, c0174g.setIconSize, c0174g.setCenterIfNoTextEnabled);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0174g c0174g = this.setOnLongClickListener;
        if (c0174g.setIconSize != colorStateList) {
            c0174g.setIconSize = colorStateList;
            C0146f.setX(c0174g.setZ, c0174g.ViewPager$SavedState$1, colorStateList, c0174g.setCenterIfNoTextEnabled);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0174g c0174g = this.setOnLongClickListener;
        if (c0174g.setCenterIfNoTextEnabled != mode) {
            c0174g.setCenterIfNoTextEnabled = mode;
            C0146f.setX(c0174g.setZ, c0174g.ViewPager$SavedState$1, c0174g.setIconSize, mode);
        }
    }

    public void setCounterEnabled(boolean z) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != z) {
            if (z) {
                getStableInsets getstableinsets = new getStableInsets(getContext());
                this.setLayoutAnimation = getstableinsets;
                getstableinsets.setId(R.id.res_0x7f0a01f2);
                Typeface typeface = this.setErrorIconTintList;
                if (typeface != null) {
                    this.setLayoutAnimation.setTypeface(typeface);
                }
                this.setLayoutAnimation.setMaxLines(1);
                this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation, 2);
                setImeHintLocales.setIconTintList((ViewGroup.MarginLayoutParams) this.setLayoutAnimation.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.res_0x7f070249));
                setAnimationFromJson();
                if (this.setLayoutAnimation != null) {
                    EditText editText = this.setUnboundedRipple;
                    setY(editText != null ? editText.getText() : null);
                }
            } else {
                this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1(this.setLayoutAnimation, 2);
                this.setLayoutAnimation = null;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.setFilterTouchesWhenObscured != i) {
            this.setFilterTouchesWhenObscured = i;
            setAnimationFromJson();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.setObjectValues != colorStateList) {
            this.setObjectValues = colorStateList;
            setAnimationFromJson();
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.setConstraintSet != i) {
            this.setConstraintSet = i;
            setAnimationFromJson();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.setSuffixText != colorStateList) {
            this.setSuffixText = colorStateList;
            setAnimationFromJson();
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != i) {
            if (i > 0) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            }
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1 || this.setLayoutAnimation == null) {
                return;
            }
            EditText editText = this.setUnboundedRipple;
            setY(editText == null ? null : editText.getText());
        }
    }

    final void setY(Editable editable) {
        int MenuHostHelper$$ExternalSyntheticLambda1 = this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1(editable);
        boolean z = this.setIconTintList;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i == -1) {
            this.setLayoutAnimation.setText(String.valueOf(MenuHostHelper$$ExternalSyntheticLambda1));
            this.setLayoutAnimation.setContentDescription(null);
            this.setIconTintList = false;
        } else {
            this.setIconTintList = MenuHostHelper$$ExternalSyntheticLambda1 > i;
            setY(getContext(), this.setLayoutAnimation, MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList);
            if (z != this.setIconTintList) {
                setAnimationFromJson();
            }
            setChipEndPadding y = setChipEndPadding.setY();
            TextView textView = this.setLayoutAnimation;
            String string = getContext().getString(R.string.res_0x7f14002a, Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0));
            textView.setText(string != null ? y.setY(string, y.setX, true).toString() : null);
        }
        if (this.setUnboundedRipple == null || z == this.setIconTintList) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(false, false);
        setLayoutAnimation();
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    private static void setY(Context context, TextView textView, int i, int i2, boolean z) {
        textView.setContentDescription(context.getString(z ? R.string.res_0x7f140029 : R.string.res_0x7f140028, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.setChipIconEnabledResource == null) {
            getStableInsets getstableinsets = new getStableInsets(getContext());
            this.setChipIconEnabledResource = getstableinsets;
            getstableinsets.setId(R.id.res_0x7f0a01f5);
            setBaselineAlignBottom.setUnboundedRipple(this.setChipIconEnabledResource, 2);
            AppDatabase appDatabase = new AppDatabase();
            appDatabase.setY(87L);
            appDatabase.MenuHostHelper$$ExternalSyntheticLambda0(setCardElevation.setY);
            this.ActionMenuPresenter$SavedState$1 = appDatabase;
            appDatabase.setX(67L);
            AppDatabase appDatabase2 = new AppDatabase();
            appDatabase2.setY(87L);
            appDatabase2.MenuHostHelper$$ExternalSyntheticLambda0(setCardElevation.setY);
            this.setNavigationIconTint = appDatabase2;
            setPlaceholderTextAppearance(this.setSubmitButtonEnabled);
            setPlaceholderTextColor(this.setBackgroundTintMode);
        }
        if (TextUtils.isEmpty(charSequence)) {
            MenuHostHelper$$ExternalSyntheticLambda0(false);
        } else {
            if (!this.setMaxEms) {
                MenuHostHelper$$ExternalSyntheticLambda0(true);
            }
            this.setTextScaleX = charSequence;
        }
        EditText editText = this.setUnboundedRipple;
        if (this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1(editText == null ? null : editText.getText()) == 0 && !this.setCenterIfNoTextEnabled) {
            setY();
        } else {
            setX();
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        if (this.setMaxEms == z) {
            return;
        }
        if (z) {
            TextView textView = this.setChipIconEnabledResource;
            if (textView != null) {
                this.setTooltipText.addView(textView);
                this.setChipIconEnabledResource.setVisibility(0);
            }
        } else {
            TextView textView2 = this.setChipIconEnabledResource;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.setChipIconEnabledResource = null;
        }
        this.setMaxEms = z;
    }

    final void setY() {
        if (this.setChipIconEnabledResource == null || !this.setMaxEms || TextUtils.isEmpty(this.setTextScaleX)) {
            return;
        }
        this.setChipIconEnabledResource.setText(this.setTextScaleX);
        setHelperText.setIconTintList(this.setTooltipText, this.ActionMenuPresenter$SavedState$1);
        this.setChipIconEnabledResource.setVisibility(0);
        this.setChipIconEnabledResource.bringToFront();
        announceForAccessibility(this.setTextScaleX);
    }

    final void setX() {
        TextView textView = this.setChipIconEnabledResource;
        if (textView == null || !this.setMaxEms) {
            return;
        }
        textView.setText((CharSequence) null);
        setHelperText.setIconTintList(this.setTooltipText, this.setNavigationIconTint);
        this.setChipIconEnabledResource.setVisibility(4);
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.setBackgroundTintMode != colorStateList) {
            this.setBackgroundTintMode = colorStateList;
            TextView textView = this.setChipIconEnabledResource;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPlaceholderTextAppearance(int i) {
        this.setSubmitButtonEnabled = i;
        TextView textView = this.setChipIconEnabledResource;
        if (textView != null) {
            setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(textView, i);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0474t c0474t = this.setZ;
        c0474t.setX = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0474t.setIconTintList.setText(charSequence);
        c0474t.setIconTintList();
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.setZ.setIconTintList.setTextColor(colorStateList);
    }

    public void setPrefixTextAppearance(int i) {
        setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this.setZ.setIconTintList, i);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.setOnNavigationItemSelectedListener = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0174g.setAnimationFromJson.setText(charSequence);
        c0174g.setY();
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.setOnLongClickListener.setAnimationFromJson.setTextColor(colorStateList);
    }

    public void setSuffixTextAppearance(int i) {
        setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(this.setOnLongClickListener.setAnimationFromJson, i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        setY(this, z);
        super.setEnabled(z);
    }

    private static void setY(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                setY((ViewGroup) childAt, z);
            }
        }
    }

    private void setAnimationFromJson() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.setLayoutAnimation;
        if (textView != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(textView, this.setIconTintList ? this.setConstraintSet : this.setFilterTouchesWhenObscured);
            if (!this.setIconTintList && (colorStateList2 = this.setObjectValues) != null) {
                this.setLayoutAnimation.setTextColor(colorStateList2);
            }
            if (!this.setIconTintList || (colorStateList = this.setSuffixText) == null) {
                return;
            }
            this.setLayoutAnimation.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0015, code lost:
        if (r3.getTextColors().getDefaultColor() == (-65281)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MenuHostHelper$$ExternalSyntheticLambda0(android.widget.TextView r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            o.setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(r3, r4)     // Catch: java.lang.Exception -> L1a
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L1a
            r1 = 23
            if (r4 < r1) goto L18
            android.content.res.ColorStateList r4 = r3.getTextColors()     // Catch: java.lang.Exception -> L1a
            int r4 = r4.getDefaultColor()     // Catch: java.lang.Exception -> L1a
            r1 = -65281(0xffffffffffff00ff, float:NaN)
            if (r4 != r1) goto L18
            goto L1b
        L18:
            r0 = 0
            goto L1b
        L1a:
        L1b:
            if (r0 == 0) goto L31
            r4 = 2132083063(0x7f150177, float:1.9806258E38)
            o.setPreferKeepClearRects.MenuHostHelper$$ExternalSyntheticLambda1(r3, r4)
            android.content.Context r4 = r2.getContext()
            r0 = 2131099726(0x7f06004e, float:1.7811813E38)
            int r4 = o.setLineHeight.setY(r4, r0)
            r3.setTextColor(r4)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0447s.MenuHostHelper$$ExternalSyntheticLambda0(android.widget.TextView, int):void");
    }

    private int setNavigationOnClickListener() {
        float MenuHostHelper$$ExternalSyntheticLambda1;
        if (this.setIconSize) {
            int i = this.setY;
            if (i == 0) {
                MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1();
            } else if (i != 2) {
                return 0;
            } else {
                MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1() / 2.0f;
            }
            return (int) MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return 0;
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1(int i, boolean z) {
        int compoundPaddingLeft = i + this.setUnboundedRipple.getCompoundPaddingLeft();
        return (this.setZ.setX == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.setZ.setIconTintList.getMeasuredWidth()) + this.setZ.setIconTintList.getPaddingLeft();
    }

    private int MenuHostHelper$$ExternalSyntheticLambda0(int i, boolean z) {
        int compoundPaddingRight = i - this.setUnboundedRipple.getCompoundPaddingRight();
        return (this.setZ.setX == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.setZ.setIconTintList.getMeasuredWidth() - this.setZ.setIconTintList.getPaddingRight());
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setUnboundedRipple() {
        /*
            r6 = this;
            o.setWebViewClient r0 = r6.setMinAndMaxProgress
            if (r0 != 0) goto L5
            return
        L5:
            o.setWebViewClient$setIconTintList r0 = r0.setChipIconTintResource
            o.setScrollBarDefaultDelayBeforeFade r0 = r0.setTextAlignment
            o.setScrollBarDefaultDelayBeforeFade r1 = r6.RemoteActionCompatParcelizer
            if (r0 == r1) goto L12
            o.setWebViewClient r0 = r6.setMinAndMaxProgress
            r0.setShapeAppearanceModel(r1)
        L12:
            int r0 = r6.setY
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L28
            int r0 = r6.setContentScrimResource
            if (r0 < 0) goto L23
            int r0 = r6.ExtendableSavedState$1
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 == 0) goto L4e
            o.setWebViewClient r0 = r6.setMinAndMaxProgress
            int r1 = r6.setContentScrimResource
            float r1 = (float) r1
            int r4 = r6.ExtendableSavedState$1
            o.setWebViewClient$setIconTintList r5 = r0.setChipIconTintResource
            r5.setMaxEms = r1
            r0.invalidateSelf()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r4)
            o.setWebViewClient$setIconTintList r4 = r0.setChipIconTintResource
            android.content.res.ColorStateList r4 = r4.setOnNavigationItemSelectedListener
            if (r4 == r1) goto L4e
            o.setWebViewClient$setIconTintList r4 = r0.setChipIconTintResource
            r4.setOnNavigationItemSelectedListener = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        L4e:
            int r0 = r6.setChipIconTintResource
            int r1 = r6.setY
            if (r1 != r2) goto L65
            android.content.Context r0 = r6.getContext()
            r1 = 2130968833(0x7f040101, float:1.754633E38)
            int r0 = o.setIndeterminateDrawable.setY(r0, r1, r3)
            int r1 = r6.setChipIconTintResource
            int r0 = o.setExtended.setY(r1, r0)
        L65:
            r6.setChipIconTintResource = r0
            o.setWebViewClient r1 = r6.setMinAndMaxProgress
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            o.setWebViewClient$setIconTintList r4 = r1.setChipIconTintResource
            android.content.res.ColorStateList r4 = r4.setX
            if (r4 == r0) goto L7e
            o.setWebViewClient$setIconTintList r4 = r1.setChipIconTintResource
            r4.setX = r0
            int[] r0 = r1.getState()
            r1.onStateChange(r0)
        L7e:
            o.setWebViewClient r0 = r6.FragmentStateAdapter$2
            if (r0 == 0) goto Ld6
            o.setWebViewClient r0 = r6.FloatingActionButton$BaseBehavior
            if (r0 == 0) goto Ld6
            int r0 = r6.setContentScrimResource
            if (r0 < 0) goto L8f
            int r0 = r6.ExtendableSavedState$1
            if (r0 == 0) goto L8f
            goto L90
        L8f:
            r2 = 0
        L90:
            if (r2 == 0) goto Ld3
            o.setWebViewClient r0 = r6.FragmentStateAdapter$2
            android.widget.EditText r1 = r6.setUnboundedRipple
            boolean r1 = r1.isFocused()
            if (r1 == 0) goto La3
            int r1 = r6.RecyclerView$SavedState$1
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            goto La9
        La3:
            int r1 = r6.ExtendableSavedState$1
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
        La9:
            o.setWebViewClient$setIconTintList r2 = r0.setChipIconTintResource
            android.content.res.ColorStateList r2 = r2.setX
            if (r2 == r1) goto Lba
            o.setWebViewClient$setIconTintList r2 = r0.setChipIconTintResource
            r2.setX = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        Lba:
            o.setWebViewClient r0 = r6.FloatingActionButton$BaseBehavior
            int r1 = r6.ExtendableSavedState$1
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            o.setWebViewClient$setIconTintList r2 = r0.setChipIconTintResource
            android.content.res.ColorStateList r2 = r2.setX
            if (r2 == r1) goto Ld3
            o.setWebViewClient$setIconTintList r2 = r0.setChipIconTintResource
            r2.setX = r1
            int[] r1 = r0.getState()
            r0.onStateChange(r1)
        Ld3:
            r6.invalidate()
        Ld6:
            r6.MenuHostHelper$$ExternalSyntheticLambda0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0447s.setUnboundedRipple():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        Drawable background;
        TextView textView;
        EditText editText = this.setUnboundedRipple;
        if (editText == null || this.setY != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        setCheckMarkDrawable.setY();
        Drawable mutate = background.mutate();
        if (!this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (this.setIconTintList && (textView = this.setLayoutAnimation) != null) {
                mutate.setColorFilter(setSelectionFromTop.setX(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
                return;
            }
            setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(mutate);
            this.setUnboundedRipple.refreshDrawableState();
            return;
        }
        TextView textView2 = this.setChipCornerRadius.setUiOptions;
        mutate.setColorFilter(setSelectionFromTop.setX(textView2 != null ? textView2.getCurrentTextColor() : -1, PorterDuff.Mode.SRC_IN));
    }

    /* renamed from: o.s$setIconTintList */
    /* loaded from: classes.dex */
    public static class setIconTintList extends setOrientation {
        CharSequence MenuHostHelper$$ExternalSyntheticLambda1;
        boolean setY;
        private static byte[] setX = {116, 39, -17, 64, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
        public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 19;
        public static final Parcelable.Creator<setIconTintList> CREATOR = new Parcelable.ClassLoaderCreator<setIconTintList>() { // from class: com.google.android.material.textfield.TextInputLayout$SavedState$1
            @Override // android.os.Parcelable.Creator
            public /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new C0447s.setIconTintList(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public /* synthetic */ C0447s.setIconTintList createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C0447s.setIconTintList(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new C0447s.setIconTintList[i];
            }
        };

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = o.C0447s.setIconTintList.setX
                int r8 = r8 * 4
                int r8 = r8 + 16
                int r7 = r7 + 4
                int r6 = 106 - r6
                byte[] r1 = new byte[r8]
                int r8 = r8 + (-1)
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L32
            L17:
                r3 = 0
            L18:
                int r7 = r7 + 1
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r9
                r9 = r8
                r8 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L32:
                int r6 = r6 + r8
                int r6 = r6 + 2
                r8 = r9
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0447s.setIconTintList.a(int, short, int, java.lang.Object[]):void");
        }

        setIconTintList(Parcelable parcelable) {
            super(parcelable);
        }

        public setIconTintList(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.setY = parcel.readInt() == 1;
        }

        @Override // o.setOrientation, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.MenuHostHelper$$ExternalSyntheticLambda1, parcel, i);
            parcel.writeInt(this.setY ? 1 : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextInputLayout.SavedState{");
            try {
                Object[] objArr = {this};
                byte b = (byte) (setX[5] + 1);
                Object[] objArr2 = new Object[1];
                a(b, (byte) (b | 14), (byte) (setX[5] + 1), objArr2);
                Class<?> cls = Class.forName((String) objArr2[0]);
                byte b2 = setX[5];
                Object[] objArr3 = new Object[1];
                a((byte) (-setX[5]), b2, (byte) (b2 + 1), objArr3);
                sb.append(Integer.toHexString(((Integer) cls.getMethod((String) objArr3[0], Object.class).invoke(null, objArr)).intValue()));
                sb.append(" error=");
                sb.append((Object) this.MenuHostHelper$$ExternalSyntheticLambda1);
                sb.append("}");
                return sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        setIconTintList seticontintlist = new setIconTintList(super.onSaveInstanceState());
        if (this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1()) {
            seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0 ? this.setChipCornerRadius.setUnboundedRipple : null;
        }
        C0174g c0174g = this.setOnLongClickListener;
        boolean z = true;
        seticontintlist.setY = ((c0174g.setLayoutAnimation != 0) && c0174g.setOnLongClickListener.isChecked()) ? false : false;
        return seticontintlist;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof setIconTintList)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setIconTintList seticontintlist = (setIconTintList) parcelable;
        super.onRestoreInstanceState(seticontintlist.setUiOptions);
        setError(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1);
        if (seticontintlist.setY) {
            post(new Runnable() { // from class: o.s.2
                @Override // java.lang.Runnable
                public final void run() {
                    C0174g c0174g = C0447s.this.setOnLongClickListener;
                    c0174g.setOnLongClickListener.performClick();
                    c0174g.setOnLongClickListener.jumpDrawablesToCurrentState();
                }
            });
        }
        requestLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.setOnNavigationItemSelectedListener = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.setOnNavigationItemSelectedListener = false;
    }

    public void setHintAnimationEnabled(boolean z) {
        this.setHint = z;
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.setChipSpacingVertical != z) {
            this.setChipSpacingVertical = z;
            MenuHostHelper$$ExternalSyntheticLambda0(false, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = false;
        boolean z2 = i == 1;
        boolean z3 = this.setCheckedIconEnabled;
        if (z2 != z3) {
            if (z2 && !z3) {
                z = true;
            }
            float y = this.RemoteActionCompatParcelizer.setCenterIfNoTextEnabled.setY(this.setCallingWorkSourceUid);
            float y2 = this.RemoteActionCompatParcelizer.setChipCornerRadius.setY(this.setCallingWorkSourceUid);
            float y3 = this.RemoteActionCompatParcelizer.setX.setY(this.setCallingWorkSourceUid);
            float y4 = this.RemoteActionCompatParcelizer.setUnboundedRipple.setY(this.setCallingWorkSourceUid);
            float f = z ? y : y2;
            if (z) {
                y = y2;
            }
            float f2 = z ? y3 : y4;
            if (z) {
                y3 = y4;
            }
            setBoxCornerRadii(f, y, f2, y3);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        if (this.setUnboundedRipple == null || this.setUnboundedRipple.getMeasuredHeight() >= (max = Math.max(this.setOnLongClickListener.getMeasuredHeight(), this.setZ.getMeasuredHeight()))) {
            z = false;
        } else {
            this.setUnboundedRipple.setMinimumHeight(max);
            z = true;
        }
        boolean iconTintList = setIconTintList();
        if (z || iconTintList) {
            this.setUnboundedRipple.post(new Runnable() { // from class: o.s.3
                @Override // java.lang.Runnable
                public final void run() {
                    C0447s.this.setUnboundedRipple.requestLayout();
                }
            });
        }
        if (this.setChipIconEnabledResource != null && (editText = this.setUnboundedRipple) != null) {
            this.setChipIconEnabledResource.setGravity(editText.getGravity());
            this.setChipIconEnabledResource.setPadding(this.setUnboundedRipple.getCompoundPaddingLeft(), this.setUnboundedRipple.getCompoundPaddingTop(), this.setUnboundedRipple.getCompoundPaddingRight(), this.setUnboundedRipple.getCompoundPaddingBottom());
        }
        this.setOnLongClickListener.setOnLongClickListener();
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? setFilterTouchesWhenObscured.setIconTintList(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.setZ.setIconTintList(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0474t c0474t = this.setZ;
        setMinAndMaxFrame setminandmaxframe = c0474t.setUiOptions;
        View.OnLongClickListener onLongClickListener = c0474t.MenuHostHelper$$ExternalSyntheticLambda1;
        setminandmaxframe.setOnClickListener(onClickListener);
        C0146f.setY(setminandmaxframe, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0474t c0474t = this.setZ;
        c0474t.MenuHostHelper$$ExternalSyntheticLambda1 = onLongClickListener;
        setMinAndMaxFrame setminandmaxframe = c0474t.setUiOptions;
        setminandmaxframe.setOnLongClickListener(onLongClickListener);
        C0146f.setY(setminandmaxframe, onLongClickListener);
    }

    public void setStartIconVisible(boolean z) {
        this.setZ.setY(z);
    }

    public void setStartIconCheckable(boolean z) {
        this.setZ.setUiOptions.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        C0474t c0474t = this.setZ;
        if (c0474t.setUiOptions.getContentDescription() != charSequence) {
            c0474t.setUiOptions.setContentDescription(charSequence);
        }
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0474t c0474t = this.setZ;
        if (c0474t.setY != colorStateList) {
            c0474t.setY = colorStateList;
            C0146f.setX(c0474t.setUnboundedRipple, c0474t.setUiOptions, colorStateList, c0474t.setOnLongClickListener);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setStartIconTintMode(android.graphics.PorterDuff.Mode r28) {
        /*
            Method dump skipped, instructions count: 1089
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0447s.setStartIconTintMode(android.graphics.PorterDuff$Mode):void");
    }

    public void setEndIconMode(int i) {
        this.setOnLongClickListener.setIconTintList(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0174g c0174g = this.setOnLongClickListener;
        setMinAndMaxFrame setminandmaxframe = c0174g.setOnLongClickListener;
        View.OnLongClickListener onLongClickListener = c0174g.setNavigationOnClickListener;
        setminandmaxframe.setOnClickListener(onClickListener);
        C0146f.setY(setminandmaxframe, onLongClickListener);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0174g c0174g = this.setOnLongClickListener;
        setMinAndMaxFrame setminandmaxframe = c0174g.ViewPager$SavedState$1;
        View.OnLongClickListener onLongClickListener = c0174g.setChipCornerRadius;
        setminandmaxframe.setOnClickListener(onClickListener);
        C0146f.setY(setminandmaxframe, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.setNavigationOnClickListener = onLongClickListener;
        setMinAndMaxFrame setminandmaxframe = c0174g.setOnLongClickListener;
        setminandmaxframe.setOnLongClickListener(onLongClickListener);
        C0146f.setY(setminandmaxframe, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.setChipCornerRadius = onLongClickListener;
        setMinAndMaxFrame setminandmaxframe = c0174g.ViewPager$SavedState$1;
        setminandmaxframe.setOnLongClickListener(onLongClickListener);
        C0146f.setY(setminandmaxframe, onLongClickListener);
    }

    public void setEndIconVisible(boolean z) {
        this.setOnLongClickListener.setY(z);
    }

    public void setEndIconActivated(boolean z) {
        this.setOnLongClickListener.setOnLongClickListener.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.setOnLongClickListener.setOnLongClickListener.setCheckable(z);
    }

    public void setEndIconDrawable(int i) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.MenuHostHelper$$ExternalSyntheticLambda0(i != 0 ? setFilterTouchesWhenObscured.setIconTintList(c0174g.getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(drawable);
    }

    public void setEndIconContentDescription(int i) {
        this.setOnLongClickListener.setY(i);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        C0174g c0174g = this.setOnLongClickListener;
        if (c0174g.MenuHostHelper$$ExternalSyntheticLambda0() != charSequence) {
            c0174g.setOnLongClickListener.setContentDescription(charSequence);
        }
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0174g c0174g = this.setOnLongClickListener;
        if (c0174g.setUiOptions != colorStateList) {
            c0174g.setUiOptions = colorStateList;
            C0146f.setX(c0174g.setZ, c0174g.setOnLongClickListener, colorStateList, c0174g.setUnboundedRipple);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0174g c0174g = this.setOnLongClickListener;
        if (c0174g.setUnboundedRipple != mode) {
            c0174g.setUnboundedRipple = mode;
            C0146f.setX(c0174g.setZ, c0174g.setOnLongClickListener, c0174g.setUiOptions, mode);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.setOnLongClickListener.setImageDrawable(i != 0 ? setFilterTouchesWhenObscured.setIconTintList(c0174g.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.setOnLongClickListener.setOnLongClickListener.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.setOnLongClickListener.setContentDescription(i != 0 ? c0174g.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.setOnLongClickListener.setOnLongClickListener.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        C0174g c0174g = this.setOnLongClickListener;
        if (z && c0174g.setLayoutAnimation != 1) {
            c0174g.setIconTintList(1);
        } else if (z) {
        } else {
            c0174g.setIconTintList(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.setUiOptions = colorStateList;
        C0146f.setX(c0174g.setZ, c0174g.setOnLongClickListener, colorStateList, c0174g.setUnboundedRipple);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.setUnboundedRipple = mode;
        C0146f.setX(c0174g.setZ, c0174g.setOnLongClickListener, c0174g.setUiOptions, mode);
    }

    public void setTextInputAccessibilityDelegate(s$MenuHostHelper$$ExternalSyntheticLambda0 s_menuhosthelper__externalsyntheticlambda0) {
        EditText editText = this.setUnboundedRipple;
        if (editText != null) {
            setBaselineAlignBottom.setX(editText, s_menuhosthelper__externalsyntheticlambda0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setIconTintList() {
        boolean z;
        if (this.setUnboundedRipple == null) {
            return false;
        }
        boolean z2 = true;
        if (setCenterIfNoTextEnabled()) {
            int measuredWidth = this.setZ.getMeasuredWidth() - this.setUnboundedRipple.getPaddingLeft();
            if (this.TextInputLayout$SavedState$1 == null || this.setChipSpacingHorizontal != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.TextInputLayout$SavedState$1 = colorDrawable;
                this.setChipSpacingHorizontal = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] y = setPreferKeepClearRects.setY(this.setUnboundedRipple);
            Drawable drawable = y[0];
            Drawable drawable2 = this.TextInputLayout$SavedState$1;
            if (drawable != drawable2) {
                setPreferKeepClearRects.setX(this.setUnboundedRipple, drawable2, y[1], y[2], y[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.TextInputLayout$SavedState$1 != null) {
                Drawable[] y2 = setPreferKeepClearRects.setY(this.setUnboundedRipple);
                setPreferKeepClearRects.setX(this.setUnboundedRipple, null, y2[1], y2[2], y2[3]);
                this.TextInputLayout$SavedState$1 = null;
                z = true;
            }
            z = false;
        }
        if (setIconSize()) {
            int measuredWidth2 = this.setOnLongClickListener.setAnimationFromJson.getMeasuredWidth() - this.setUnboundedRipple.getPaddingRight();
            setMinAndMaxFrame x = this.setOnLongClickListener.setX();
            if (x != null) {
                measuredWidth2 = measuredWidth2 + x.getMeasuredWidth() + setImeHintLocales.setIconTintList((ViewGroup.MarginLayoutParams) x.getLayoutParams());
            }
            Drawable[] y3 = setPreferKeepClearRects.setY(this.setUnboundedRipple);
            Drawable drawable3 = this.setSelectedChildViewEnabled;
            if (drawable3 != null && this.setImageTintMode != measuredWidth2) {
                this.setImageTintMode = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                setPreferKeepClearRects.setX(this.setUnboundedRipple, y3[0], y3[1], this.setSelectedChildViewEnabled, y3[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.setSelectedChildViewEnabled = colorDrawable2;
                    this.setImageTintMode = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = y3[2];
                Drawable drawable5 = this.setSelectedChildViewEnabled;
                if (drawable4 != drawable5) {
                    this.createDispatcher = drawable4;
                    setPreferKeepClearRects.setX(this.setUnboundedRipple, y3[0], y3[1], drawable5, y3[3]);
                } else {
                    z2 = z;
                }
            }
        } else if (this.setSelectedChildViewEnabled == null) {
            return z;
        } else {
            Drawable[] y4 = setPreferKeepClearRects.setY(this.setUnboundedRipple);
            if (y4[2] == this.setSelectedChildViewEnabled) {
                setPreferKeepClearRects.setX(this.setUnboundedRipple, y4[0], y4[1], this.createDispatcher, y4[3]);
            } else {
                z2 = z;
            }
            this.setSelectedChildViewEnabled = null;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if ((r0.setY.getVisibility() == 0 && r0.setOnLongClickListener.getVisibility() == 0) == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r4.setOnLongClickListener.setOnNavigationItemSelectedListener != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean setIconSize() {
        /*
            r4 = this;
            o.g r0 = r4.setOnLongClickListener
            o.setMinAndMaxFrame r0 = r0.ViewPager$SavedState$1
            int r0 = r0.getVisibility()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            if (r0 != 0) goto L39
            o.g r0 = r4.setOnLongClickListener
            int r0 = r0.setLayoutAnimation
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L33
            o.g r0 = r4.setOnLongClickListener
            android.widget.FrameLayout r3 = r0.setY
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L30
            o.setMinAndMaxFrame r0 = r0.setOnLongClickListener
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 != 0) goto L39
        L33:
            o.g r0 = r4.setOnLongClickListener
            java.lang.CharSequence r0 = r0.setOnNavigationItemSelectedListener
            if (r0 == 0) goto L42
        L39:
            o.g r0 = r4.setOnLongClickListener
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L42
            goto L43
        L42:
            r1 = 0
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0447s.setIconSize():boolean");
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int x;
        int compoundPaddingTop;
        int compoundPaddingBottom;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.setUnboundedRipple;
        if (editText != null) {
            Rect rect = this.minusKey;
            rect.set(0, 0, editText.getWidth(), editText.getHeight());
            pingBinder.MenuHostHelper$$ExternalSyntheticLambda0(this, editText, rect);
            if (this.FragmentStateAdapter$2 != null) {
                this.FragmentStateAdapter$2.setBounds(rect.left, rect.bottom - this.SearchView$SavedState$1, rect.right, rect.bottom);
            }
            if (this.FloatingActionButton$BaseBehavior != null) {
                this.FloatingActionButton$BaseBehavior.setBounds(rect.left, rect.bottom - this.FragmentStateAdapter$5, rect.right, rect.bottom);
            }
            if (this.setIconSize) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = this.setX;
                float textSize = this.setUnboundedRipple.getTextSize();
                if (staggeredGridLayoutManager.setLayoutAnimation != textSize) {
                    staggeredGridLayoutManager.setLayoutAnimation = textSize;
                    staggeredGridLayoutManager.setY(false);
                }
                int gravity = this.setUnboundedRipple.getGravity();
                StaggeredGridLayoutManager staggeredGridLayoutManager2 = this.setX;
                int i5 = (gravity & (-113)) | 48;
                if (staggeredGridLayoutManager2.MenuHostHelper$$ExternalSyntheticLambda1 != i5) {
                    staggeredGridLayoutManager2.MenuHostHelper$$ExternalSyntheticLambda1 = i5;
                    staggeredGridLayoutManager2.setY(false);
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager3 = this.setX;
                if (staggeredGridLayoutManager3.setUiOptions != gravity) {
                    staggeredGridLayoutManager3.setUiOptions = gravity;
                    staggeredGridLayoutManager3.setY(false);
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager4 = this.setX;
                if (this.setUnboundedRipple == null) {
                    throw new IllegalStateException();
                }
                Rect rect2 = this.setEdgeEffectFactory;
                x = setBaselineAlignBottom.setX.setX(this);
                boolean z2 = true;
                boolean z3 = x == 1;
                rect2.bottom = rect.bottom;
                int i6 = this.setY;
                if (i6 == 1) {
                    rect2.left = MenuHostHelper$$ExternalSyntheticLambda1(rect.left, z3);
                    rect2.top = rect.top + this.setIconified;
                    rect2.right = MenuHostHelper$$ExternalSyntheticLambda0(rect.right, z3);
                } else if (i6 == 2) {
                    rect2.left = rect.left + this.setUnboundedRipple.getPaddingLeft();
                    rect2.top = rect.top - setNavigationOnClickListener();
                    rect2.right = rect.right - this.setUnboundedRipple.getPaddingRight();
                } else {
                    rect2.left = MenuHostHelper$$ExternalSyntheticLambda1(rect.left, z3);
                    rect2.top = getPaddingTop();
                    rect2.right = MenuHostHelper$$ExternalSyntheticLambda0(rect.right, z3);
                }
                staggeredGridLayoutManager4.setX(rect2.left, rect2.top, rect2.right, rect2.bottom);
                StaggeredGridLayoutManager staggeredGridLayoutManager5 = this.setX;
                if (this.setUnboundedRipple == null) {
                    throw new IllegalStateException();
                }
                Rect rect3 = this.setEdgeEffectFactory;
                TextPaint textPaint = staggeredGridLayoutManager5.SearchView$SavedState$1;
                textPaint.setTextSize(staggeredGridLayoutManager5.setLayoutAnimation);
                textPaint.setTypeface(staggeredGridLayoutManager5.ViewPager$SavedState$1);
                textPaint.setLetterSpacing(staggeredGridLayoutManager5.setX);
                float f = -staggeredGridLayoutManager5.SearchView$SavedState$1.ascent();
                rect3.left = rect.left + this.setUnboundedRipple.getCompoundPaddingLeft();
                if (this.setY == 1 && this.setUnboundedRipple.getMinLines() <= 1) {
                    compoundPaddingTop = (int) (rect.centerY() - (f / 2.0f));
                } else {
                    compoundPaddingTop = rect.top + this.setUnboundedRipple.getCompoundPaddingTop();
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.setUnboundedRipple.getCompoundPaddingRight();
                if ((this.setY != 1 || this.setUnboundedRipple.getMinLines() > 1) ? false : false) {
                    compoundPaddingBottom = (int) (rect3.top + f);
                } else {
                    compoundPaddingBottom = rect.bottom - this.setUnboundedRipple.getCompoundPaddingBottom();
                }
                rect3.bottom = compoundPaddingBottom;
                staggeredGridLayoutManager5.MenuHostHelper$$ExternalSyntheticLambda1(rect3.left, rect3.top, rect3.right, rect3.bottom);
                this.setX.setY(false);
                if (!setUiOptions() || this.setCenterIfNoTextEnabled) {
                    return;
                }
                setChipCornerRadius();
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        setWebViewClient setwebviewclient;
        super.draw(canvas);
        if (this.setIconSize) {
            this.setX.setIconTintList(canvas);
        }
        if (this.FloatingActionButton$BaseBehavior == null || (setwebviewclient = this.FragmentStateAdapter$2) == null) {
            return;
        }
        setwebviewclient.draw(canvas);
        if (this.setUnboundedRipple.isFocused()) {
            Rect bounds = this.FloatingActionButton$BaseBehavior.getBounds();
            Rect bounds2 = this.FragmentStateAdapter$2.getBounds();
            float f = this.setX.MenuHostHelper$$ExternalSyntheticLambda0;
            int centerX = bounds2.centerX();
            bounds.left = Math.round((bounds2.left - centerX) * f) + centerX;
            bounds.right = centerX + Math.round(f * (bounds2.right - centerX));
            this.FloatingActionButton$BaseBehavior.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.setX.setIconTintList(configuration);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        ValueAnimator valueAnimator = this.setTextAppearanceResource;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.setTextAppearanceResource.cancel();
        }
        if (z && this.setHint) {
            setIconTintList(1.0f);
        } else {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(1.0f);
        }
        this.setCenterIfNoTextEnabled = false;
        if (setUiOptions()) {
            setChipCornerRadius();
        }
        EditText editText = this.setUnboundedRipple;
        if (this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda1(editText == null ? null : editText.getText()) == 0 && !this.setCenterIfNoTextEnabled) {
            setY();
        } else {
            setX();
        }
        C0474t c0474t = this.setZ;
        c0474t.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        c0474t.setIconTintList();
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.setTextAlignment = false;
        c0174g.setY();
    }

    private boolean setUiOptions() {
        return this.setIconSize && !TextUtils.isEmpty(this.setNavigationOnClickListener) && (this.setMinAndMaxProgress instanceof setSelector);
    }

    private void setChipCornerRadius() {
        if (setUiOptions()) {
            RectF rectF = this.setCallingWorkSourceUid;
            this.setX.setX(rectF, this.setUnboundedRipple.getWidth(), this.setUnboundedRipple.getGravity());
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            rectF.left -= this.setHasDecor;
            rectF.right += this.setHasDecor;
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.setContentScrimResource);
            ((setSelector) this.setMinAndMaxProgress).setIconTintList(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    private void ViewPager$SavedState$1() {
        if (!setUiOptions() || this.setCenterIfNoTextEnabled) {
            return;
        }
        if (setUiOptions()) {
            ((setSelector) this.setMinAndMaxProgress).setIconTintList(0.0f, 0.0f, 0.0f, 0.0f);
        }
        setChipCornerRadius();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.setFilterRedundantCalls
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.setFilterRedundantCalls = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            o.StaggeredGridLayoutManager r2 = r4.setX
            r3 = 0
            if (r2 == 0) goto L21
            r2.setTextAppearanceResource = r1
            boolean r1 = r2.setY()
            if (r1 == 0) goto L21
            r2.setY(r3)
            r1 = 1
            goto L22
        L21:
            r1 = 0
        L22:
            android.widget.EditText r2 = r4.setUnboundedRipple
            if (r2 == 0) goto L36
            boolean r2 = o.setBaselineAlignBottom.setConstraintSet(r4)
            if (r2 == 0) goto L32
            boolean r2 = r4.isEnabled()
            if (r2 != 0) goto L33
        L32:
            r0 = 0
        L33:
            r4.MenuHostHelper$$ExternalSyntheticLambda0(r0, r3)
        L36:
            r4.MenuHostHelper$$ExternalSyntheticLambda1()
            r4.setLayoutAnimation()
            if (r1 == 0) goto L41
            r4.invalidate()
        L41:
            r4.setFilterRedundantCalls = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0447s.drawableStateChanged():void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setLayoutAnimation() {
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.setMinAndMaxProgress == null || this.setY == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.setUnboundedRipple) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.setUnboundedRipple) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.ExtendableSavedState$1 = this.setFloatValues;
        } else if (this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda1()) {
            if (this.setMinEms != null) {
                setX(z2, z);
            } else {
                TextView textView2 = this.setChipCornerRadius.setUiOptions;
                this.ExtendableSavedState$1 = textView2 != null ? textView2.getCurrentTextColor() : -1;
            }
        } else if (!this.setIconTintList || (textView = this.setLayoutAnimation) == null) {
            if (z2) {
                this.ExtendableSavedState$1 = this.setError;
            } else if (z) {
                this.ExtendableSavedState$1 = this.getCallingPid;
            } else {
                this.ExtendableSavedState$1 = this.RecyclerView$SavedState$1;
            }
        } else if (this.setMinEms != null) {
            setX(z2, z);
        } else {
            this.ExtendableSavedState$1 = textView.getCurrentTextColor();
        }
        this.setOnLongClickListener.setUiOptions();
        C0474t c0474t = this.setZ;
        C0146f.MenuHostHelper$$ExternalSyntheticLambda1(c0474t.setUnboundedRipple, c0474t.setUiOptions, c0474t.setY);
        if (this.setY == 2) {
            int i = this.setContentScrimResource;
            if (z2 && isEnabled()) {
                this.setContentScrimResource = this.FragmentStateAdapter$5;
            } else {
                this.setContentScrimResource = this.SearchView$SavedState$1;
            }
            if (this.setContentScrimResource != i) {
                ViewPager$SavedState$1();
            }
        }
        if (this.setY == 1) {
            if (!isEnabled()) {
                this.setChipIconTintResource = this.setChipIconEnabled;
            } else if (z && !z2) {
                this.setChipIconTintResource = this.onActivityResumed;
            } else if (z2) {
                this.setChipIconTintResource = this.setTitleMarginEnd;
            } else {
                this.setChipIconTintResource = this.setViewTranslationCallback;
            }
        }
        setUnboundedRipple();
    }

    private void setX(boolean z, boolean z2) {
        int defaultColor = this.setMinEms.getDefaultColor();
        int colorForState = this.setMinEms.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.setMinEms.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.ExtendableSavedState$1 = colorForState2;
        } else if (z2) {
            this.ExtendableSavedState$1 = colorForState;
        } else {
            this.ExtendableSavedState$1 = defaultColor;
        }
    }

    private void setIconTintList(boolean z) {
        ValueAnimator valueAnimator = this.setTextAppearanceResource;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.setTextAppearanceResource.cancel();
        }
        if (z && this.setHint) {
            setIconTintList(0.0f);
        } else {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(0.0f);
        }
        if (setUiOptions() && (!((setSelector) this.setMinAndMaxProgress).setY.isEmpty()) && setUiOptions()) {
            ((setSelector) this.setMinAndMaxProgress).setIconTintList(0.0f, 0.0f, 0.0f, 0.0f);
        }
        this.setCenterIfNoTextEnabled = true;
        setX();
        C0474t c0474t = this.setZ;
        c0474t.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        c0474t.setIconTintList();
        C0174g c0174g = this.setOnLongClickListener;
        c0174g.setTextAlignment = true;
        c0174g.setY();
    }

    private void setIconTintList(float f) {
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 == f) {
            return;
        }
        if (this.setTextAppearanceResource == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.setTextAppearanceResource = valueAnimator;
            valueAnimator.setInterpolator(setCardElevation.MenuHostHelper$$ExternalSyntheticLambda0);
            this.setTextAppearanceResource.setDuration(167L);
            this.setTextAppearanceResource.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.s.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    C0447s.this.setX.MenuHostHelper$$ExternalSyntheticLambda0(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.setTextAppearanceResource.setFloatValues(this.setX.MenuHostHelper$$ExternalSyntheticLambda0, f);
        this.setTextAppearanceResource.start();
    }

    private void setTextAlignment() {
        int i = this.setY;
        if (i == 0) {
            this.setMinAndMaxProgress = null;
            this.FragmentStateAdapter$2 = null;
            this.FloatingActionButton$BaseBehavior = null;
        } else if (i == 1) {
            this.setMinAndMaxProgress = new setWebViewClient(this.RemoteActionCompatParcelizer);
            this.FragmentStateAdapter$2 = new setWebViewClient();
            this.FloatingActionButton$BaseBehavior = new setWebViewClient();
        } else if (i == 2) {
            if (this.setIconSize && !(this.setMinAndMaxProgress instanceof setSelector)) {
                this.setMinAndMaxProgress = new setSelector(this.RemoteActionCompatParcelizer);
            } else {
                this.setMinAndMaxProgress = new setWebViewClient(this.RemoteActionCompatParcelizer);
            }
            this.FragmentStateAdapter$2 = null;
            this.FloatingActionButton$BaseBehavior = null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(this.setY);
            sb.append(" is illegal; only @BoxBackgroundMode constants are supported.");
            throw new IllegalArgumentException(sb.toString());
        }
        MenuHostHelper$$ExternalSyntheticLambda0();
        setLayoutAnimation();
        if (this.setY == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.setIconified = getResources().getDimensionPixelSize(R.dimen.res_0x7f070185);
            } else {
                if (getContext().getResources().getConfiguration().fontScale >= 1.3f) {
                    this.setIconified = getResources().getDimensionPixelSize(R.dimen.res_0x7f070184);
                }
            }
        }
        if (this.setUnboundedRipple != null && this.setY == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.setUnboundedRipple;
                setBaselineAlignBottom.setX.setX(editText, setBaselineAlignBottom.setAnimationFromJson(editText), getResources().getDimensionPixelSize(R.dimen.res_0x7f070183), setBaselineAlignBottom.setOnNavigationItemSelectedListener(this.setUnboundedRipple), getResources().getDimensionPixelSize(R.dimen.res_0x7f070182));
            } else {
                if (getContext().getResources().getConfiguration().fontScale >= 1.3f) {
                    EditText editText2 = this.setUnboundedRipple;
                    setBaselineAlignBottom.setX.setX(editText2, setBaselineAlignBottom.setAnimationFromJson(editText2), getResources().getDimensionPixelSize(R.dimen.res_0x7f070181), setBaselineAlignBottom.setOnNavigationItemSelectedListener(this.setUnboundedRipple), getResources().getDimensionPixelSize(R.dimen.res_0x7f070180));
                }
            }
        }
        if (this.setY != 0) {
            setMaxEms();
        }
        EditText editText3 = this.setUnboundedRipple;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i2 = this.setY;
                if (i2 == 2) {
                    if (this.setEmptyView == null) {
                        this.setEmptyView = setY(true);
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.setEmptyView);
                } else if (i2 == 1) {
                    if (this.setShrinkMotionSpec == null) {
                        StateListDrawable stateListDrawable = new StateListDrawable();
                        this.setShrinkMotionSpec = stateListDrawable;
                        int[] iArr = {16842922};
                        if (this.setEmptyView == null) {
                            this.setEmptyView = setY(true);
                        }
                        stateListDrawable.addState(iArr, this.setEmptyView);
                        this.setShrinkMotionSpec.addState(new int[0], setY(false));
                    }
                    autoCompleteTextView.setDropDownBackgroundDrawable(this.setShrinkMotionSpec);
                }
            }
        }
    }

    private boolean setCenterIfNoTextEnabled() {
        return (this.setZ.setUiOptions.getDrawable() != null || (this.setZ.setX != null && this.setZ.setIconTintList.getVisibility() == 0)) && this.setZ.getMeasuredWidth() > 0;
    }

    public void setBoxCornerRadii(float f, float f2, float f3, float f4) {
        int x;
        x = setBaselineAlignBottom.setX.setX(this);
        boolean z = x == 1;
        this.setCheckedIconEnabled = z;
        float f5 = z ? f2 : f;
        if (!z) {
            f = f2;
        }
        float f6 = z ? f4 : f3;
        if (!z) {
            f3 = f4;
        }
        setWebViewClient setwebviewclient = this.setMinAndMaxProgress;
        if (setwebviewclient != null && setwebviewclient.setOnLongClickListener() == f5 && this.setMinAndMaxProgress.setUiOptions() == f && this.setMinAndMaxProgress.setY() == f6 && this.setMinAndMaxProgress.setNavigationOnClickListener() == f3) {
            return;
        }
        setScrollBarDefaultDelayBeforeFade.setY sety = new setScrollBarDefaultDelayBeforeFade.setY(this.RemoteActionCompatParcelizer);
        sety.setNavigationOnClickListener = new setActionBarVisibilityCallback(f5);
        sety.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(f);
        sety.setY = new setActionBarVisibilityCallback(f6);
        sety.setIconTintList = new setActionBarVisibilityCallback(f3);
        this.RemoteActionCompatParcelizer = new setScrollBarDefaultDelayBeforeFade(sety, (byte) 0);
        setUnboundedRipple();
    }
}