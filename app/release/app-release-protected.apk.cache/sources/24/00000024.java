package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.R;
import o.handleException;
import o.onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0;
import o.queryLocalInterface;
import o.setAllowStacking;
import o.setAnimateShowBeforeLayout;
import o.setBaselineAlignBottom;
import o.setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1;
import o.setCircularRevealScrimColor;
import o.setEnsureMinTouchTargetSize;
import o.setOrientation;
import o.setSecondaryProgressTintList;
import o.setSupportCompoundDrawablesTintMode;
import o.setWeightSum;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements queryLocalInterface {
    private static final setAnimateShowBeforeLayout.setY<Rect> setLayoutAnimation;
    private static Comparator<View> setNavigationOnClickListener;
    private static String setOnLongClickListener;
    private static ThreadLocal<Map<String, Constructor<setIconTintList>>> setUiOptions;
    private static Class<?>[] setX;
    public WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final int[] ViewPager$SavedState$1;
    private boolean setAnimationFromJson;
    private final List<View> setCenterIfNoTextEnabled;
    private setLayoutAnimation setCheckedIconEnabled;
    private final setSecondaryProgressTintList<View> setChipCornerRadius;
    private final List<View> setGuidelinePercent;
    private boolean setIconSize;
    ViewGroup.OnHierarchyChangeListener setIconTintList;
    private Drawable setLayoutDirection;
    private boolean setMaxEms;
    private final List<View> setMinAndMaxProgress;
    private int[] setOnNavigationItemSelectedListener;
    private View setTextAlignment;
    private final int[] setTextAppearanceResource;
    private final handleException setTextScaleX;
    private setCircularRevealScrimColor setUnboundedRipple;
    private View setZ;
    private static byte[] setIconified = {44, 104, -53, -66, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4};
    public static final int setY = 224;

    /* loaded from: classes.dex */
    public interface setX {
        setIconTintList setX();
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    /* loaded from: classes.dex */
    public @interface setY {
        Class<? extends setIconTintList> MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x006c -> B:15:0x0071). Please submit an issue!!! */
    static {
        /*
            r0 = 26
            byte[] r0 = new byte[r0]
            r0 = {x007a: FILL_ARRAY_DATA  , data: [44, 104, -53, -66, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4} // fill-array
            androidx.coordinatorlayout.widget.CoordinatorLayout.setIconified = r0
            r0 = 224(0xe0, float:3.14E-43)
            androidx.coordinatorlayout.widget.CoordinatorLayout.setY = r0
            java.lang.Class<androidx.coordinatorlayout.widget.CoordinatorLayout> r0 = androidx.coordinatorlayout.widget.CoordinatorLayout.class
            java.lang.Package r0 = r0.getPackage()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r0.getName()
            goto L1b
        L1a:
            r0 = 0
        L1b:
            androidx.coordinatorlayout.widget.CoordinatorLayout.setOnLongClickListener = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$setUnboundedRipple r0 = new androidx.coordinatorlayout.widget.CoordinatorLayout$setUnboundedRipple
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.setNavigationOnClickListener = r0
            r0 = 2
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 3
            byte[] r2 = androidx.coordinatorlayout.widget.CoordinatorLayout.setIconified
            r3 = 23
            byte[] r4 = new byte[r3]
            r5 = 97
            r6 = 0
            r1 = r0
            if (r2 != 0) goto L3b
            r7 = r4
            r8 = 23
            r11 = 0
            r4 = r2
            r2 = 3
            goto L71
        L3b:
            r5 = r4
            r7 = 97
            r8 = 0
            r4 = r2
            r2 = 3
        L41:
            r9 = 1
            int r2 = r2 + r9
            byte r10 = (byte) r7
            int r11 = r8 + 1
            r5[r8] = r10
            if (r11 != r3) goto L6c
            java.lang.String r2 = new java.lang.String
            r2.<init>(r5, r6)
            java.lang.Class r2 = java.lang.Class.forName(r2)
            r0[r6] = r2
            java.lang.Class<android.util.AttributeSet> r0 = android.util.AttributeSet.class
            r1[r9] = r0
            androidx.coordinatorlayout.widget.CoordinatorLayout.setX = r1
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.coordinatorlayout.widget.CoordinatorLayout.setUiOptions = r0
            o.setAnimateShowBeforeLayout$setX r0 = new o.setAnimateShowBeforeLayout$setX
            r1 = 12
            r0.<init>(r1)
            androidx.coordinatorlayout.widget.CoordinatorLayout.setLayoutAnimation = r0
            return
        L6c:
            r8 = r4[r2]
            r12 = r7
            r7 = r5
            r5 = r12
        L71:
            int r5 = r5 - r8
            int r5 = r5 + (-8)
            r8 = r11
            r12 = r7
            r7 = r5
            r5 = r12
            goto L41
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<clinit>():void");
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040121);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.setCenterIfNoTextEnabled = new ArrayList();
        this.setChipCornerRadius = new setSecondaryProgressTintList<>();
        this.setMinAndMaxProgress = new ArrayList();
        this.setGuidelinePercent = new ArrayList();
        this.ViewPager$SavedState$1 = new int[2];
        this.setTextAppearanceResource = new int[2];
        this.setTextScaleX = new handleException();
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0, 0, R.style._res_0x7f15041e);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0, i, 0);
        }
        if (Build.VERSION.SDK_INT >= 29) {
            if (i == 0) {
                saveAttributeDataForStyleable(context, onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0, attributeSet, obtainStyledAttributes, 0, R.style._res_0x7f15041e);
            } else {
                saveAttributeDataForStyleable(context, onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0, attributeSet, obtainStyledAttributes, i, 0);
            }
        }
        int resourceId = obtainStyledAttributes.getResourceId(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.setOnNavigationItemSelectedListener = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.setOnNavigationItemSelectedListener.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.setOnNavigationItemSelectedListener;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.setLayoutDirection = obtainStyledAttributes.getDrawable(onActivityPaused$MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius);
        obtainStyledAttributes.recycle();
        MenuHostHelper$$ExternalSyntheticLambda1();
        super.setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                if (CoordinatorLayout.this.setIconTintList != null) {
                    CoordinatorLayout.this.setIconTintList.onChildViewAdded(view, view2);
                }
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
                CoordinatorLayout.this.setX(2);
                if (CoordinatorLayout.this.setIconTintList != null) {
                    CoordinatorLayout.this.setIconTintList.onChildViewRemoved(view, view2);
                }
            }
        });
        if (setBaselineAlignBottom.setCenterIfNoTextEnabled(this) == 0) {
            setBaselineAlignBottom.setUnboundedRipple(this, 1);
        }
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.setIconTintList = onHierarchyChangeListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setY(false);
        if (this.setAnimationFromJson) {
            if (this.setCheckedIconEnabled == null) {
                this.setCheckedIconEnabled = new setLayoutAnimation();
            }
            getViewTreeObserver().addOnPreDrawListener(this.setCheckedIconEnabled);
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null && setBaselineAlignBottom.setTextAlignment(this)) {
            setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this);
        }
        this.setMaxEms = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setY(false);
        if (this.setAnimationFromJson && this.setCheckedIconEnabled != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.setCheckedIconEnabled);
        }
        View view = this.setZ;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.setMaxEms = false;
    }

    public void setStatusBarBackground(Drawable drawable) {
        int x;
        Drawable drawable2 = this.setLayoutDirection;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable mutate = drawable != null ? drawable.mutate() : null;
            this.setLayoutDirection = mutate;
            if (mutate != null) {
                if (mutate.isStateful()) {
                    this.setLayoutDirection.setState(getDrawableState());
                }
                Drawable drawable3 = this.setLayoutDirection;
                x = setBaselineAlignBottom.setX.setX(this);
                setEnsureMinTouchTargetSize.MenuHostHelper$$ExternalSyntheticLambda0(drawable3, x);
                this.setLayoutDirection.setVisible(getVisibility() == 0, false);
                this.setLayoutDirection.setCallback(this);
            }
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.setLayoutDirection;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.setLayoutDirection;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.setLayoutDirection;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.setLayoutDirection.setVisible(z, false);
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    private void setY(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            setIconTintList seticontintlist = ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams()).setUnboundedRipple;
            if (seticontintlist != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    seticontintlist.setY(this, (CoordinatorLayout) childAt, obtain);
                } else {
                    seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) getChildAt(i2).getLayoutParams()).ViewPager$SavedState$1 = false;
        }
        this.setTextAlignment = null;
        this.setIconSize = false;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1(MotionEvent motionEvent, int i) {
        boolean z;
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.setMinAndMaxProgress;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = setNavigationOnClickListener;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
            setIconTintList seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple;
            if (!(z2 || z3) || actionMasked == 0) {
                if (!z2 && seticontintlist != null) {
                    if (i == 0) {
                        z2 = seticontintlist.setY(this, (CoordinatorLayout) view, motionEvent);
                    } else if (i == 1) {
                        z2 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(this, view, motionEvent);
                    }
                    if (z2) {
                        this.setTextAlignment = view;
                    }
                }
                if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple == null) {
                    coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1 = false;
                }
                boolean z4 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1;
                boolean z5 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1;
                if (z5) {
                    z = true;
                } else {
                    setIconTintList seticontintlist2 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple;
                    z = z5 | false;
                    coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1 = z;
                }
                z3 = z && !z4;
                if (z && !z3) {
                    break;
                }
            } else if (seticontintlist != null) {
                if (motionEvent2 == null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i == 0) {
                    seticontintlist.setY(this, (CoordinatorLayout) view, motionEvent2);
                } else if (i == 1) {
                    seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(this, view, motionEvent2);
                }
            }
        }
        list.clear();
        return z2;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            setY(true);
        }
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            setY(true);
        }
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r3 != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.setTextAlignment
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.MenuHostHelper$$ExternalSyntheticLambda1(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.setTextAlignment
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 r6 = (androidx.coordinatorlayout.widget.CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) r6
            androidx.coordinatorlayout.widget.CoordinatorLayout$setIconTintList r6 = r6.setUnboundedRipple
            if (r6 == 0) goto L29
            android.view.View r7 = r0.setTextAlignment
            boolean r6 = r6.MenuHostHelper$$ExternalSyntheticLambda0(r0, r7, r1)
            goto L2a
        L29:
            r6 = 0
        L2a:
            android.view.View r7 = r0.setTextAlignment
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.setY(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.setIconSize) {
            return;
        }
        setY(false);
        this.setIconSize = true;
    }

    private int setY(int i) {
        int[] iArr = this.setOnNavigationItemSelectedListener;
        if (iArr == null) {
            StringBuilder sb = new StringBuilder("No keylines defined for ");
            sb.append(this);
            sb.append(" - attempted index lookup ");
            sb.append(i);
            Log.e("CoordinatorLayout", sb.toString());
            return 0;
        } else if (i < 0 || i >= iArr.length) {
            StringBuilder sb2 = new StringBuilder("Keyline index ");
            sb2.append(i);
            sb2.append(" out of range for ");
            sb2.append(this);
            Log.e("CoordinatorLayout", sb2.toString());
            return 0;
        } else {
            return iArr[i];
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static setIconTintList setY(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            str = sb.toString();
        } else if (str.indexOf(46) < 0) {
            String str2 = setOnLongClickListener;
            if (!TextUtils.isEmpty(str2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append('.');
                sb2.append(str);
                str = sb2.toString();
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<setIconTintList>>> threadLocal = setUiOptions;
            Map<String, Constructor<setIconTintList>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<setIconTintList> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(setX);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("Could not inflate Behavior subclass ");
            sb3.append(str);
            throw new RuntimeException(sb3.toString(), e);
        }
    }

    private static CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 setY(View view) {
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
        if (!coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener) {
            if (view instanceof setX) {
                setIconTintList x = ((setX) view).setX();
                if (x == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(x);
                coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener = true;
            } else {
                setY sety = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    sety = (setY) cls.getAnnotation(setY.class);
                    if (sety != null) {
                        break;
                    }
                }
                if (sety != null) {
                    try {
                        coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(sety.MenuHostHelper$$ExternalSyntheticLambda0().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("Default behavior class ");
                        sb.append(sety.MenuHostHelper$$ExternalSyntheticLambda0().getName());
                        sb.append(" could not be instantiated. Did you forget a default constructor?");
                        Log.e("CoordinatorLayout", sb.toString(), e);
                    }
                }
                coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener = true;
            }
        }
        return coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int i3, int i4) {
        measureChildWithMargins(view, i, i2, i3, i4);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
        if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions == null && coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener != -1) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions != null) {
            MenuHostHelper$$ExternalSyntheticLambda1(view, coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions, i);
        } else if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 >= 0) {
            setY(view, coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0, i);
        } else {
            setX(view, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int x;
        setIconTintList seticontintlist;
        x = setBaselineAlignBottom.setX.setX(this);
        int size = this.setCenterIfNoTextEnabled.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.setCenterIfNoTextEnabled.get(i5);
            if (view.getVisibility() != 8 && ((seticontintlist = ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams()).setUnboundedRipple) == null || !seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this, (CoordinatorLayout) view, x))) {
                MenuHostHelper$$ExternalSyntheticLambda1(view, x);
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1 || this.setLayoutDirection == null) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int uiOptions = windowInsetsCompat != null ? windowInsetsCompat.setUiOptions() : 0;
        if (uiOptions > 0) {
            this.setLayoutDirection.setBounds(0, 0, getWidth(), uiOptions);
            this.setLayoutDirection.draw(canvas);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (!z) {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            setSupportCompoundDrawablesTintMode.MenuHostHelper$$ExternalSyntheticLambda1(this, view, rect);
        }
    }

    private static void setY(int i, Rect rect, Rect rect2, CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0, int i2, int i3) {
        int absoluteGravity;
        int absoluteGravity2;
        int width;
        int height;
        int i4 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setX;
        if (i4 == 0) {
            i4 = 17;
        }
        absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i8 != 5) {
            width = rect.left;
        } else {
            width = rect.right;
        }
        if (i9 == 16) {
            height = rect.top + (rect.height() / 2);
        } else if (i9 != 80) {
            height = rect.top;
        } else {
            height = rect.bottom;
        }
        if (i6 == 1) {
            width -= i2 / 2;
        } else if (i6 != 5) {
            width -= i2;
        }
        if (i7 == 16) {
            height -= i3 / 2;
        } else if (i7 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int i3 = ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).leftMargin;
        int i4 = paddingLeft + i3;
        int max = Math.max(i4, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).rightMargin));
        int paddingTop = getPaddingTop();
        int i5 = ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).topMargin;
        int i6 = paddingTop + i5;
        int max2 = Math.max(i6, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private void setY(View view, int i, int i2) {
        int absoluteGravity;
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
        int i3 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setX;
        if (i3 == 0) {
            i3 = 8388661;
        }
        absoluteGravity = Gravity.getAbsoluteGravity(i3, i2);
        int i4 = absoluteGravity & 7;
        int i5 = absoluteGravity & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i2 == 1) {
            i = width - i;
        }
        int y = setY(i) - measuredWidth;
        if (i4 == 1) {
            y += measuredWidth / 2;
        } else if (i4 == 5) {
            y += measuredWidth;
        }
        int i6 = 0;
        if (i5 == 16) {
            i6 = 0 + (measuredHeight / 2);
        } else if (i5 == 80) {
            i6 = measuredHeight;
        }
        int paddingLeft = getPaddingLeft();
        int i7 = ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).leftMargin;
        int i8 = paddingLeft + i7;
        int max = Math.max(i8, Math.min(y, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).rightMargin));
        int paddingTop = getPaddingTop();
        int i9 = ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).topMargin;
        int i10 = paddingTop + i9;
        int max2 = Math.max(i10, Math.min(i6, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).bottomMargin));
        view.layout(max, max2, measuredWidth + max, measuredHeight + max2);
    }

    private void setX(View view, int i) {
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
        Rect MenuHostHelper$$ExternalSyntheticLambda0 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            MenuHostHelper$$ExternalSyntheticLambda0 = new Rect();
        }
        MenuHostHelper$$ExternalSyntheticLambda0.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0).bottomMargin);
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null && setBaselineAlignBottom.setTextAlignment(this) && !setBaselineAlignBottom.setTextAlignment(view)) {
            MenuHostHelper$$ExternalSyntheticLambda0.left += this.MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener();
            MenuHostHelper$$ExternalSyntheticLambda0.top += this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions();
            MenuHostHelper$$ExternalSyntheticLambda0.right -= this.MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener();
            MenuHostHelper$$ExternalSyntheticLambda0.bottom -= this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple();
        }
        Rect MenuHostHelper$$ExternalSyntheticLambda02 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda02 == null) {
            MenuHostHelper$$ExternalSyntheticLambda02 = new Rect();
        }
        Rect rect = MenuHostHelper$$ExternalSyntheticLambda02;
        int i2 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setX;
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        if ((i2 & 112) == 0) {
            i2 |= 48;
        }
        setWeightSum.setIconTintList.setX(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), MenuHostHelper$$ExternalSyntheticLambda0, rect, i);
        view.layout(rect.left, rect.top, rect.right, rect.bottom);
        MenuHostHelper$$ExternalSyntheticLambda0.setEmpty();
        setLayoutAnimation.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
        rect.setEmpty();
        setLayoutAnimation.setIconTintList(rect);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
        if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple != null) {
            setIconTintList seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple;
        }
        return super.drawChild(canvas, view, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(int i) {
        int x;
        int i2;
        int i3;
        boolean z;
        int absoluteGravity;
        boolean z2;
        boolean z3;
        int width;
        int i4;
        int height;
        int i5;
        int absoluteGravity2;
        int i6;
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
        int i7;
        int i8;
        int i9;
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda02;
        boolean z4;
        setIconTintList seticontintlist;
        x = setBaselineAlignBottom.setX.setX(this);
        int size = this.setCenterIfNoTextEnabled.size();
        Rect MenuHostHelper$$ExternalSyntheticLambda0 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            MenuHostHelper$$ExternalSyntheticLambda0 = new Rect();
        }
        Rect rect = MenuHostHelper$$ExternalSyntheticLambda0;
        Rect MenuHostHelper$$ExternalSyntheticLambda02 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda02 == null) {
            MenuHostHelper$$ExternalSyntheticLambda02 = new Rect();
        }
        Rect rect2 = MenuHostHelper$$ExternalSyntheticLambda02;
        Rect MenuHostHelper$$ExternalSyntheticLambda03 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda03 == null) {
            MenuHostHelper$$ExternalSyntheticLambda03 = new Rect();
        }
        Rect rect3 = MenuHostHelper$$ExternalSyntheticLambda03;
        boolean z5 = false;
        int i10 = 0;
        while (i10 < size) {
            View view = this.setCenterIfNoTextEnabled.get(i10);
            CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda03 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
            if (i == 0 && view.getVisibility() == 8) {
                i3 = size;
                i2 = i10;
            } else {
                int i11 = 0;
                while (i11 < i10) {
                    if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda03.setLayoutAnimation == this.setCenterIfNoTextEnabled.get(i11)) {
                        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda04 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
                        if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda04.setUiOptions != null) {
                            Rect MenuHostHelper$$ExternalSyntheticLambda04 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
                            if (MenuHostHelper$$ExternalSyntheticLambda04 == null) {
                                MenuHostHelper$$ExternalSyntheticLambda04 = new Rect();
                            }
                            Rect rect4 = MenuHostHelper$$ExternalSyntheticLambda04;
                            Rect MenuHostHelper$$ExternalSyntheticLambda05 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
                            if (MenuHostHelper$$ExternalSyntheticLambda05 == null) {
                                MenuHostHelper$$ExternalSyntheticLambda05 = new Rect();
                            }
                            Rect MenuHostHelper$$ExternalSyntheticLambda06 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
                            if (MenuHostHelper$$ExternalSyntheticLambda06 == null) {
                                MenuHostHelper$$ExternalSyntheticLambda06 = new Rect();
                            }
                            Rect rect5 = MenuHostHelper$$ExternalSyntheticLambda06;
                            setSupportCompoundDrawablesTintMode.MenuHostHelper$$ExternalSyntheticLambda1(this, coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda04.setUiOptions, rect4);
                            MenuHostHelper$$ExternalSyntheticLambda1(view, z5, MenuHostHelper$$ExternalSyntheticLambda05);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i7 = size;
                            Rect rect6 = MenuHostHelper$$ExternalSyntheticLambda05;
                            i8 = i10;
                            i6 = i11;
                            coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda03;
                            setY(x, rect4, rect5, coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda04, measuredWidth, measuredHeight);
                            if (rect5.left == rect6.left && rect5.top == rect6.top) {
                                i9 = measuredWidth;
                                coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda02 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda04;
                                z4 = false;
                            } else {
                                i9 = measuredWidth;
                                coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda02 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda04;
                                z4 = true;
                            }
                            MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda02, rect5, i9, measuredHeight);
                            int i12 = rect5.left - rect6.left;
                            int i13 = rect5.top - rect6.top;
                            if (i12 != 0) {
                                setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(view, i12);
                            }
                            if (i13 != 0) {
                                setBaselineAlignBottom.setX(view, i13);
                            }
                            if (z4 && (seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda02.setUnboundedRipple) != null) {
                                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this, (CoordinatorLayout) view, coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda02.setUiOptions);
                            }
                            rect4.setEmpty();
                            setLayoutAnimation.setIconTintList(rect4);
                            rect6.setEmpty();
                            setLayoutAnimation.setIconTintList(rect6);
                            rect5.setEmpty();
                            setLayoutAnimation.setIconTintList(rect5);
                            i11 = i6 + 1;
                            size = i7;
                            i10 = i8;
                            coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda03 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
                            z5 = false;
                        }
                    }
                    i6 = i11;
                    coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda03;
                    i7 = size;
                    i8 = i10;
                    i11 = i6 + 1;
                    size = i7;
                    i10 = i8;
                    coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda03 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0;
                    z5 = false;
                }
                CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda05 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda03;
                int i14 = size;
                i2 = i10;
                MenuHostHelper$$ExternalSyntheticLambda1(view, true, rect2);
                if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda05.MenuHostHelper$$ExternalSyntheticLambda1 != 0 && !rect2.isEmpty()) {
                    absoluteGravity2 = Gravity.getAbsoluteGravity(coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda05.MenuHostHelper$$ExternalSyntheticLambda1, x);
                    int i15 = absoluteGravity2 & 112;
                    if (i15 == 48) {
                        rect.top = Math.max(rect.top, rect2.bottom);
                    } else if (i15 == 80) {
                        rect.bottom = Math.max(rect.bottom, getHeight() - rect2.top);
                    }
                    int i16 = absoluteGravity2 & 7;
                    if (i16 == 3) {
                        rect.left = Math.max(rect.left, rect2.right);
                    } else if (i16 == 5) {
                        rect.right = Math.max(rect.right, getWidth() - rect2.left);
                    }
                }
                if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda05.setY != 0 && view.getVisibility() == 0 && setBaselineAlignBottom.setConstraintSet(view) && view.getWidth() > 0 && view.getHeight() > 0) {
                    CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
                    setIconTintList seticontintlist2 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06.setUnboundedRipple;
                    Rect MenuHostHelper$$ExternalSyntheticLambda07 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
                    if (MenuHostHelper$$ExternalSyntheticLambda07 == null) {
                        MenuHostHelper$$ExternalSyntheticLambda07 = new Rect();
                    }
                    Rect MenuHostHelper$$ExternalSyntheticLambda08 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
                    if (MenuHostHelper$$ExternalSyntheticLambda08 == null) {
                        MenuHostHelper$$ExternalSyntheticLambda08 = new Rect();
                    }
                    MenuHostHelper$$ExternalSyntheticLambda08.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    if (seticontintlist2 != null && seticontintlist2.setX(this, view, MenuHostHelper$$ExternalSyntheticLambda07)) {
                        if (!MenuHostHelper$$ExternalSyntheticLambda08.contains(MenuHostHelper$$ExternalSyntheticLambda07)) {
                            StringBuilder sb = new StringBuilder("Rect should be within the child's bounds. Rect:");
                            sb.append(MenuHostHelper$$ExternalSyntheticLambda07.toShortString());
                            sb.append(" | Bounds:");
                            sb.append(MenuHostHelper$$ExternalSyntheticLambda08.toShortString());
                            throw new IllegalArgumentException(sb.toString());
                        }
                    } else {
                        MenuHostHelper$$ExternalSyntheticLambda07.set(MenuHostHelper$$ExternalSyntheticLambda08);
                    }
                    MenuHostHelper$$ExternalSyntheticLambda08.setEmpty();
                    setLayoutAnimation.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda08);
                    if (!MenuHostHelper$$ExternalSyntheticLambda07.isEmpty()) {
                        absoluteGravity = Gravity.getAbsoluteGravity(coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06.setY, x);
                        if ((absoluteGravity & 48) != 48 || (i5 = (MenuHostHelper$$ExternalSyntheticLambda07.top - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06).topMargin) - coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06.setOnNavigationItemSelectedListener) >= rect.top) {
                            z2 = false;
                        } else {
                            MenuHostHelper$$ExternalSyntheticLambda0(view, rect.top - i5);
                            z2 = true;
                        }
                        if ((absoluteGravity & 80) == 80 && (height = ((getHeight() - MenuHostHelper$$ExternalSyntheticLambda07.bottom) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06).bottomMargin) + coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06.setOnNavigationItemSelectedListener) < rect.bottom) {
                            MenuHostHelper$$ExternalSyntheticLambda0(view, height - rect.bottom);
                            z2 = true;
                        }
                        if (!z2) {
                            MenuHostHelper$$ExternalSyntheticLambda0(view, 0);
                        }
                        if ((absoluteGravity & 3) != 3 || (i4 = (MenuHostHelper$$ExternalSyntheticLambda07.left - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06).leftMargin) - coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06.setChipCornerRadius) >= rect.left) {
                            z3 = false;
                        } else {
                            setIconTintList(view, rect.left - i4);
                            z3 = true;
                        }
                        if ((absoluteGravity & 5) == 5 && (width = ((getWidth() - MenuHostHelper$$ExternalSyntheticLambda07.right) - ((ViewGroup.MarginLayoutParams) coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06).rightMargin) + coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda06.setChipCornerRadius) < rect.right) {
                            setIconTintList(view, width - rect.right);
                            z3 = true;
                        }
                        if (!z3) {
                            setIconTintList(view, 0);
                        }
                        MenuHostHelper$$ExternalSyntheticLambda07.setEmpty();
                        setLayoutAnimation.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda07);
                    } else {
                        MenuHostHelper$$ExternalSyntheticLambda07.setEmpty();
                        setLayoutAnimation.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda07);
                    }
                }
                if (i != 2) {
                    rect3.set(((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams()).setMaxEms);
                    if (rect3.equals(rect2)) {
                        i3 = i14;
                    } else {
                        ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams()).setMaxEms.set(rect2);
                    }
                }
                i3 = i14;
                for (int i17 = i2 + 1; i17 < i3; i17++) {
                    View view2 = this.setCenterIfNoTextEnabled.get(i17);
                    CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda07 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view2.getLayoutParams();
                    setIconTintList seticontintlist3 = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda07.setUnboundedRipple;
                    if (seticontintlist3 != null && seticontintlist3.setIconTintList(view2, view)) {
                        if (i == 0 && coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda07.setCenterIfNoTextEnabled) {
                            coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda07.setCenterIfNoTextEnabled = false;
                        } else {
                            if (i == 2) {
                                seticontintlist3.MenuHostHelper$$ExternalSyntheticLambda1(this, view);
                                z = true;
                            } else {
                                z = seticontintlist3.MenuHostHelper$$ExternalSyntheticLambda1(this, (CoordinatorLayout) view2, view);
                            }
                            if (i == 1) {
                                coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda07.setCenterIfNoTextEnabled = z;
                            }
                        }
                    }
                }
            }
            i10 = i2 + 1;
            size = i3;
            z5 = false;
        }
        rect.setEmpty();
        setLayoutAnimation.setIconTintList(rect);
        rect2.setEmpty();
        setLayoutAnimation.setIconTintList(rect2);
        rect3.setEmpty();
        setLayoutAnimation.setIconTintList(rect3);
    }

    private static void setIconTintList(View view, int i) {
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
        if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius != i) {
            setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(view, i - coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius);
            coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius = i;
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i) {
        CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
        if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setOnNavigationItemSelectedListener != i) {
            setBaselineAlignBottom.setX(view, i - coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setOnNavigationItemSelectedListener);
            coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setOnNavigationItemSelectedListener = i;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        ArrayList<View> arrayList = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0.get(view);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View view2 = arrayList.get(i);
            setIconTintList seticontintlist = ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view2.getLayoutParams()).setUnboundedRipple;
            if (seticontintlist != null) {
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this, (CoordinatorLayout) view2, view);
            }
        }
    }

    public final List<View> MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        setSecondaryProgressTintList<View> setsecondaryprogresstintlist = this.setChipCornerRadius;
        int size = setsecondaryprogresstintlist.MenuHostHelper$$ExternalSyntheticLambda0.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            int i2 = i << 1;
            ArrayList arrayList2 = (ArrayList) setsecondaryprogresstintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX[i2 + 1];
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(setsecondaryprogresstintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX[i2]);
            }
        }
        this.setGuidelinePercent.clear();
        if (arrayList != null) {
            this.setGuidelinePercent.addAll(arrayList);
        }
        return this.setGuidelinePercent;
    }

    public final List<View> setIconTintList(View view) {
        ArrayList<View> arrayList = this.setChipCornerRadius.MenuHostHelper$$ExternalSyntheticLambda0.get(view);
        this.setGuidelinePercent.clear();
        if (arrayList != null) {
            this.setGuidelinePercent.addAll(arrayList);
        }
        return this.setGuidelinePercent;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return MenuHostHelper$$ExternalSyntheticLambda1(view, view2, i, 0);
    }

    @Override // o.setDropDownVerticalOffset
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams();
                setIconTintList seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple;
                if (seticontintlist != null) {
                    boolean MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(this, childAt, view, view2, i, i2);
                    z |= MenuHostHelper$$ExternalSyntheticLambda0;
                    if (i2 == 0) {
                        coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment = MenuHostHelper$$ExternalSyntheticLambda0;
                    } else if (i2 == 1) {
                        coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize = MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                } else if (i2 == 0) {
                    coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment = false;
                } else if (i2 == 1) {
                    coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        MenuHostHelper$$ExternalSyntheticLambda0(view, view2, i, 0);
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, View view2, int i, int i2) {
        boolean z;
        handleException handleexception = this.setTextScaleX;
        if (i2 == 1) {
            handleexception.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        } else {
            handleexception.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        }
        this.setZ = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) getChildAt(i3).getLayoutParams();
            if (i2 == 0) {
                z = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment;
            } else {
                z = i2 != 1 ? false : coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize;
            }
            if (z) {
                setIconTintList seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        setY(view, 0);
    }

    @Override // o.setDropDownVerticalOffset
    public final void setY(View view, int i) {
        boolean z;
        handleException handleexception = this.setTextScaleX;
        if (i == 1) {
            handleexception.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        } else {
            handleexception.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams();
            if (i == 0) {
                z = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment;
            } else {
                z = i != 1 ? false : coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize;
            }
            if (z) {
                setIconTintList seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple;
                if (seticontintlist != null) {
                    seticontintlist.setX(this, (CoordinatorLayout) childAt, view, i);
                }
                if (i == 0) {
                    coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment = false;
                } else if (i == 1) {
                    coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize = false;
                }
                coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled = false;
            }
        }
        this.setZ = null;
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int i3, int i4, int i5) {
        setY(view, i, i2, i3, i4, 0, this.setTextAppearanceResource);
    }

    @Override // o.queryLocalInterface
    public final void setY(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        boolean z;
        setIconTintList seticontintlist;
        int min;
        int childCount = getChildCount();
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams();
                if (i5 == 0) {
                    z = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment;
                } else {
                    z = i5 != 1 ? false : coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize;
                }
                if (z && (seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple) != null) {
                    int[] iArr2 = this.ViewPager$SavedState$1;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    int i9 = i6;
                    seticontintlist.setX(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.ViewPager$SavedState$1;
                    i7 = i3 > 0 ? Math.max(i7, iArr3[0]) : Math.min(i7, iArr3[0]);
                    if (i4 > 0) {
                        min = Math.max(i9, this.ViewPager$SavedState$1[1]);
                    } else {
                        min = Math.min(i9, this.ViewPager$SavedState$1[1]);
                    }
                    i6 = min;
                    z2 = true;
                }
            }
            i6 = i6;
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i6;
        if (z2) {
            setX(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        MenuHostHelper$$ExternalSyntheticLambda0(view, i, i2, iArr, 0);
    }

    @Override // o.setDropDownVerticalOffset
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int[] iArr, int i3) {
        boolean z;
        setIconTintList seticontintlist;
        int childCount = getChildCount();
        boolean z2 = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams();
                if (i3 == 0) {
                    z = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment;
                } else {
                    z = i3 != 1 ? false : coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setIconSize;
                }
                if (z && (seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple) != null) {
                    int[] iArr2 = this.ViewPager$SavedState$1;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.ViewPager$SavedState$1;
                    i4 = i > 0 ? Math.max(i4, iArr3[0]) : Math.min(i4, iArr3[0]);
                    int[] iArr4 = this.ViewPager$SavedState$1;
                    i5 = i2 > 0 ? Math.max(i5, iArr4[1]) : Math.min(i5, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z2) {
            setX(1);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams();
                if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment) {
                    setIconTintList seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        setIconTintList seticontintlist;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams();
                if (coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setTextAlignment && (seticontintlist = coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple) != null) {
                    z |= seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        handleException handleexception = this.setTextScaleX;
        return handleexception.MenuHostHelper$$ExternalSyntheticLambda1 | handleexception.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* loaded from: classes.dex */
    class setLayoutAnimation implements ViewTreeObserver.OnPreDrawListener {
        setLayoutAnimation() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            CoordinatorLayout.this.setX(0);
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class setUnboundedRipple implements Comparator<View> {
        setUnboundedRipple() {
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(View view, View view2) {
            float guidelinePercent = setBaselineAlignBottom.setGuidelinePercent(view);
            float guidelinePercent2 = setBaselineAlignBottom.setGuidelinePercent(view2);
            if (guidelinePercent > guidelinePercent2) {
                return -1;
            }
            return guidelinePercent < guidelinePercent2 ? 1 : 0;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class setIconTintList<V extends View> {
        public void MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
            if (i2 == 0) {
            }
            return false;
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1() {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) {
        }

        public void MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, View view) {
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, V v, int i) {
            return false;
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, V v, View view) {
            return false;
        }

        public boolean MenuHostHelper$$ExternalSyntheticLambda1(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
            return false;
        }

        public boolean setIconTintList(V v, View view) {
            return false;
        }

        public void setX(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        }

        public boolean setX(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
            return false;
        }

        public boolean setX(CoordinatorLayout coordinatorLayout, V v, Rect rect) {
            return false;
        }

        public boolean setX(CoordinatorLayout coordinatorLayout, V v, Rect rect, boolean z) {
            return false;
        }

        public void setY(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        }

        public boolean setY(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
            return false;
        }

        public setIconTintList() {
        }

        public setIconTintList(Context context, AttributeSet attributeSet) {
        }

        public void setX(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            iArr[0] = iArr[0] + i3;
            iArr[1] = iArr[1] + i4;
        }

        public Parcelable MenuHostHelper$$ExternalSyntheticLambda0(CoordinatorLayout coordinatorLayout, V v) {
            return View.BaseSavedState.EMPTY_STATE;
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof setNavigationOnClickListener)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        setNavigationOnClickListener setnavigationonclicklistener = (setNavigationOnClickListener) parcelable;
        super.onRestoreInstanceState(setnavigationonclicklistener.setUiOptions);
        SparseArray<Parcelable> sparseArray = setnavigationonclicklistener.MenuHostHelper$$ExternalSyntheticLambda1;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            setIconTintList seticontintlist = setY(childAt).setUnboundedRipple;
            if (id != -1 && seticontintlist != null && (parcelable2 = sparseArray.get(id)) != null) {
                seticontintlist.setY(this, (CoordinatorLayout) childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable MenuHostHelper$$ExternalSyntheticLambda0;
        setNavigationOnClickListener setnavigationonclicklistener = new setNavigationOnClickListener(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            setIconTintList seticontintlist = ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams()).setUnboundedRipple;
            if (id != -1 && seticontintlist != null && (MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(this, childAt)) != null) {
                sparseArray.append(id, MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        setnavigationonclicklistener.MenuHostHelper$$ExternalSyntheticLambda1 = sparseArray;
        return setnavigationonclicklistener;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        setIconTintList seticontintlist = ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams()).setUnboundedRipple;
        if (seticontintlist == null || !seticontintlist.setX(this, (CoordinatorLayout) view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (!setBaselineAlignBottom.setTextAlignment(this)) {
            setBaselineAlignBottom.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(this, (setCircularRevealScrimColor) null);
            return;
        }
        if (this.setUnboundedRipple == null) {
            this.setUnboundedRipple = new setCircularRevealScrimColor() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.3
                @Override // o.setCircularRevealScrimColor
                public final WindowInsetsCompat setIconTintList(View view, WindowInsetsCompat windowInsetsCompat) {
                    boolean x;
                    CoordinatorLayout coordinatorLayout = CoordinatorLayout.this;
                    x = setAllowStacking.setX.setX(coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0, windowInsetsCompat);
                    if (!x) {
                        coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda0 = windowInsetsCompat;
                        boolean z = true;
                        boolean z2 = windowInsetsCompat != null && windowInsetsCompat.setUiOptions() > 0;
                        coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1 = z2;
                        coordinatorLayout.setWillNotDraw((z2 || coordinatorLayout.getBackground() != null) ? false : false);
                        if (!windowInsetsCompat.setLayoutAnimation()) {
                            int childCount = coordinatorLayout.getChildCount();
                            for (int i = 0; i < childCount; i++) {
                                View childAt = coordinatorLayout.getChildAt(i);
                                if (setBaselineAlignBottom.setTextAlignment(childAt) && ((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) childAt.getLayoutParams()).setUnboundedRipple != null && windowInsetsCompat.setLayoutAnimation()) {
                                    break;
                                }
                            }
                        }
                        coordinatorLayout.requestLayout();
                    }
                    return windowInsetsCompat;
                }
            };
        }
        setBaselineAlignBottom.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(this, this.setUnboundedRipple);
        setSystemUiVisibility(1280);
    }

    /* loaded from: classes.dex */
    protected static class setNavigationOnClickListener extends setOrientation {
        public static final Parcelable.Creator<setNavigationOnClickListener> CREATOR = new Parcelable.ClassLoaderCreator<setNavigationOnClickListener>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout$SavedState$1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return new CoordinatorLayout.setNavigationOnClickListener(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ CoordinatorLayout.setNavigationOnClickListener createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new CoordinatorLayout.setNavigationOnClickListener(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new CoordinatorLayout.setNavigationOnClickListener[i];
            }
        };
        SparseArray<Parcelable> MenuHostHelper$$ExternalSyntheticLambda1;

        public setNavigationOnClickListener(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.append(iArr[i], readParcelableArray[i]);
            }
        }

        public setNavigationOnClickListener(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // o.setOrientation, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.MenuHostHelper$$ExternalSyntheticLambda1.keyAt(i2);
                parcelableArr[i2] = this.MenuHostHelper$$ExternalSyntheticLambda1.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(View view, View view2, int i) {
        Rect MenuHostHelper$$ExternalSyntheticLambda0 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            MenuHostHelper$$ExternalSyntheticLambda0 = new Rect();
        }
        Rect MenuHostHelper$$ExternalSyntheticLambda02 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda02 == null) {
            MenuHostHelper$$ExternalSyntheticLambda02 = new Rect();
        }
        Rect rect = MenuHostHelper$$ExternalSyntheticLambda02;
        try {
            setSupportCompoundDrawablesTintMode.MenuHostHelper$$ExternalSyntheticLambda1(this, view2, MenuHostHelper$$ExternalSyntheticLambda0);
            CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0 = (CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) view.getLayoutParams();
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            setY(i, MenuHostHelper$$ExternalSyntheticLambda0, rect, coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0, measuredWidth, measuredHeight);
            MenuHostHelper$$ExternalSyntheticLambda0(coordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0, rect, measuredWidth, measuredHeight);
            view.layout(rect.left, rect.top, rect.right, rect.bottom);
        } finally {
            MenuHostHelper$$ExternalSyntheticLambda0.setEmpty();
            setLayoutAnimation.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
            rect.setEmpty();
            setLayoutAnimation.setIconTintList(rect);
        }
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) {
            return new CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0((CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new CoordinatorLayout$MenuHostHelper$$ExternalSyntheticLambda0(layoutParams);
    }

    public final boolean setIconTintList(View view, int i, int i2) {
        Rect MenuHostHelper$$ExternalSyntheticLambda0 = setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            MenuHostHelper$$ExternalSyntheticLambda0 = new Rect();
        }
        setSupportCompoundDrawablesTintMode.MenuHostHelper$$ExternalSyntheticLambda1(this, view, MenuHostHelper$$ExternalSyntheticLambda0);
        try {
            return MenuHostHelper$$ExternalSyntheticLambda0.contains(i, i2);
        } finally {
            MenuHostHelper$$ExternalSyntheticLambda0.setEmpty();
            setLayoutAnimation.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x0353, code lost:
        if (r0.setX(r31, r19, r25, r20, r26, 0) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (r5 != false) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0175 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0120  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r32, int r33) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        setY(view, i, i2, i3, i4, 0, this.setTextAppearanceResource);
    }
}