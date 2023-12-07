package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.WindowInsetsCompat;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import o.setCounterOverflowTextColor;
import o.setDecorPadding;

/* loaded from: classes.dex */
public class setBaselineAlignBottom {
    private static ThreadLocal<Rect> setUnboundedRipple;
    private static Field setY;
    private static final AtomicInteger setOnLongClickListener = new AtomicInteger(1);
    private static WeakHashMap<View, setHeaderDividersEnabled> setLayoutAnimation = null;
    private static boolean setIconTintList = false;
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = {R.id.res_0x7f0a0010, R.id.res_0x7f0a0011, R.id.res_0x7f0a001c, R.id.res_0x7f0a0027, R.id.res_0x7f0a002a, R.id.res_0x7f0a002b, R.id.res_0x7f0a002c, R.id.res_0x7f0a002d, R.id.res_0x7f0a002e, R.id.res_0x7f0a002f, R.id.res_0x7f0a0012, R.id.res_0x7f0a0013, R.id.res_0x7f0a0014, R.id.res_0x7f0a0015, R.id.res_0x7f0a0016, R.id.res_0x7f0a0017, R.id.res_0x7f0a0018, R.id.res_0x7f0a0019, R.id.res_0x7f0a001a, R.id.res_0x7f0a001b, R.id.res_0x7f0a001d, R.id.res_0x7f0a001e, R.id.res_0x7f0a001f, R.id.res_0x7f0a0020, R.id.res_0x7f0a0021, R.id.res_0x7f0a0022, R.id.res_0x7f0a0023, R.id.res_0x7f0a0024, R.id.res_0x7f0a0025, R.id.res_0x7f0a0026, R.id.res_0x7f0a0028, R.id.res_0x7f0a0029};
    private static final setCompoundDrawablesRelative MenuHostHelper$$ExternalSyntheticLambda0 = new setCompoundDrawablesRelative() { // from class: o.setItemsCanFocus
        @Override // o.setCompoundDrawablesRelative
        public final setStrokeAlpha setX(setStrokeAlpha setstrokealpha) {
            return setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(setstrokealpha);
        }
    };
    private static final setIconTintList setX = new setIconTintList();

    /* loaded from: classes.dex */
    public interface setMaxEms {
        boolean setX(View view, KeyEvent keyEvent);
    }

    public static /* synthetic */ setStrokeAlpha MenuHostHelper$$ExternalSyntheticLambda1(setStrokeAlpha setstrokealpha) {
        return setstrokealpha;
    }

    private static Rect setX() {
        if (setUnboundedRipple == null) {
            setUnboundedRipple = new ThreadLocal<>();
        }
        Rect rect = setUnboundedRipple.get();
        if (rect == null) {
            rect = new Rect();
            setUnboundedRipple.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void setY(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            setBaselineAlignBottom$ViewPager$SavedState$1.setX(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void setY(View view, setDecorPadding setdecorpadding) {
        view.onInitializeAccessibilityNodeInfo(setdecorpadding.setGuidelinePercent());
    }

    public static void setX(View view, setCounterOverflowTextColor setcounteroverflowtextcolor) {
        if (setcounteroverflowtextcolor == null && (setFilterTouchesWhenObscured(view) instanceof setCounterOverflowTextColor.setX)) {
            setcounteroverflowtextcolor = new setCounterOverflowTextColor();
        }
        view.setAccessibilityDelegate(setcounteroverflowtextcolor == null ? null : setcounteroverflowtextcolor.MenuHostHelper$$ExternalSyntheticLambda1());
    }

    public static int setChipCornerRadius(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return setTextAlignment.setX(view);
        }
        return 0;
    }

    public static void setNavigationOnClickListener(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    public static boolean setCheckedIconEnabled(View view) {
        return setFilterTouchesWhenObscured(view) != null;
    }

    public static setCounterOverflowTextColor setY(View view) {
        View.AccessibilityDelegate filterTouchesWhenObscured = setFilterTouchesWhenObscured(view);
        if (filterTouchesWhenObscured == null) {
            return null;
        }
        if (filterTouchesWhenObscured instanceof setCounterOverflowTextColor.setX) {
            return ((setCounterOverflowTextColor.setX) filterTouchesWhenObscured).setIconTintList;
        }
        return new setCounterOverflowTextColor(filterTouchesWhenObscured);
    }

    static void setX(View view) {
        setCounterOverflowTextColor y = setY(view);
        if (y == null) {
            y = new setCounterOverflowTextColor();
        }
        setX(view, y);
    }

    private static View.AccessibilityDelegate setFilterTouchesWhenObscured(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return setBaselineAlignBottom$ViewPager$SavedState$1.setIconTintList(view);
        }
        return setSuffixText(view);
    }

    private static View.AccessibilityDelegate setSuffixText(View view) {
        if (setIconTintList) {
            return null;
        }
        if (setY == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                setY = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                setIconTintList = true;
                return null;
            }
        }
        try {
            Object obj = setY.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            setIconTintList = true;
            return null;
        }
    }

    public static boolean setIconified(View view) {
        return setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions(view);
    }

    public static void setY(View view, boolean z) {
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(view, z);
    }

    public static void FloatingActionButton$BaseBehavior(View view) {
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener(view);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(View view, Runnable runnable) {
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(view, runnable);
    }

    public static void setY(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int setCenterIfNoTextEnabled(View view) {
        return setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(view);
    }

    public static void setUnboundedRipple(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static boolean setY(View view, int i, Bundle bundle) {
        return setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(view, i, bundle);
    }

    public static int setX(View view, CharSequence charSequence, setShowDividers setshowdividers) {
        int x = setX(view, charSequence);
        if (x != -1) {
            setX(view, new setDecorPadding.setIconTintList(x, charSequence, setshowdividers));
        }
        return x;
    }

    private static int setX(View view, CharSequence charSequence) {
        List<setDecorPadding.setIconTintList> objectValues = setObjectValues(view);
        for (int i = 0; i < objectValues.size(); i++) {
            if (TextUtils.equals(charSequence, objectValues.get(i).setIconTintList())) {
                return objectValues.get(i).MenuHostHelper$$ExternalSyntheticLambda0();
            }
        }
        int i2 = 0;
        int i3 = -1;
        while (true) {
            int[] iArr = MenuHostHelper$$ExternalSyntheticLambda1;
            if (i2 >= iArr.length || i3 != -1) {
                break;
            }
            int i4 = iArr[i2];
            boolean z = true;
            for (int i5 = 0; i5 < objectValues.size(); i5++) {
                z &= objectValues.get(i5).MenuHostHelper$$ExternalSyntheticLambda0() != i4;
            }
            if (z) {
                i3 = i4;
            }
            i2++;
        }
        return i3;
    }

    public static void setX(View view, setDecorPadding.setIconTintList seticontintlist, CharSequence charSequence, setShowDividers setshowdividers) {
        if (setshowdividers == null && charSequence == null) {
            setIconTintList(view, seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0());
        } else {
            setX(view, seticontintlist.setIconTintList(charSequence, setshowdividers));
        }
    }

    private static void setX(View view, setDecorPadding.setIconTintList seticontintlist) {
        setX(view);
        setX(seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0(), view);
        setObjectValues(view).add(seticontintlist);
        setY(view, 0);
    }

    public static void setIconTintList(View view, int i) {
        setX(i, view);
        setY(view, 0);
    }

    private static void setX(int i, View view) {
        List<setDecorPadding.setIconTintList> objectValues = setObjectValues(view);
        for (int i2 = 0; i2 < objectValues.size(); i2++) {
            if (objectValues.get(i2).MenuHostHelper$$ExternalSyntheticLambda0() == i) {
                objectValues.remove(i2);
                return;
            }
        }
    }

    private static List<setDecorPadding.setIconTintList> setObjectValues(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.res_0x7f0a01db);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.res_0x7f0a01db, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static CharSequence setTextAppearanceResource(View view) {
        return setLayoutAnimation().setIconTintList(view);
    }

    public static void setOnLongClickListener(View view, int i) {
        view.setLabelFor(i);
    }

    public static int ViewPager$SavedState$1(View view) {
        return setX.setX(view);
    }

    public static int setAnimationFromJson(View view) {
        return view.getPaddingStart();
    }

    public static int setOnNavigationItemSelectedListener(View view) {
        return view.getPaddingEnd();
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, int i3, int i4) {
        setX.setX(view, i, i2, i3, i4);
    }

    public static int setTextScaleX(View view) {
        return setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setX(view);
    }

    public static int setIconSize(View view) {
        return setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(view);
    }

    public static setHeaderDividersEnabled MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        if (setLayoutAnimation == null) {
            setLayoutAnimation = new WeakHashMap<>();
        }
        setHeaderDividersEnabled setheaderdividersenabled = setLayoutAnimation.get(view);
        if (setheaderdividersenabled == null) {
            setHeaderDividersEnabled setheaderdividersenabled2 = new setHeaderDividersEnabled(view);
            setLayoutAnimation.put(view, setheaderdividersenabled2);
            return setheaderdividersenabled2;
        }
        return setheaderdividersenabled;
    }

    public static float setUiOptions(View view) {
        return setUnboundedRipple.setIconTintList(view);
    }

    public static String setLayoutDirection(View view) {
        return view.getTransitionName();
    }

    @Deprecated
    public static int setMinAndMaxProgress(View view) {
        int windowSystemUiVisibility;
        windowSystemUiVisibility = view.getWindowSystemUiVisibility();
        return windowSystemUiVisibility;
    }

    public static void FragmentStateAdapter$5(View view) {
        view.requestApplyInsets();
    }

    public static boolean setTextAlignment(View view) {
        boolean fitsSystemWindows;
        fitsSystemWindows = view.getFitsSystemWindows();
        return fitsSystemWindows;
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(View view, setCircularRevealScrimColor setcircularrevealscrimcolor) {
        setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(view, setcircularrevealscrimcolor);
    }

    public static WindowInsetsCompat setIconTintList(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets iconSize = windowInsetsCompat.setIconSize();
        if (iconSize != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(iconSize);
            if (!onApplyWindowInsets.equals(iconSize)) {
                return WindowInsetsCompat.setY(onApplyWindowInsets, view);
            }
        }
        return windowInsetsCompat;
    }

    public static WindowInsetsCompat setX(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets iconSize = windowInsetsCompat.setIconSize();
        if (iconSize != null) {
            WindowInsets iconTintList = setUiOptions.setIconTintList(view, iconSize);
            if (!iconTintList.equals(iconSize)) {
                return WindowInsetsCompat.setY(iconTintList, view);
            }
        }
        return windowInsetsCompat;
    }

    public static WindowInsetsCompat setZ(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(view);
        }
        return WindowInsetsCompat.setX.MenuHostHelper$$ExternalSyntheticLambda0(view);
    }

    public static String[] setMaxEms(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return setTextScaleX.setIconTintList(view);
        }
        return (String[]) view.getTag(R.id.res_0x7f0a01e1);
    }

    public static setStrokeAlpha MenuHostHelper$$ExternalSyntheticLambda0(View view, setStrokeAlpha setstrokealpha) {
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder("performReceiveContent: ");
            sb.append(setstrokealpha);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
            Log.d("ViewCompat", sb.toString());
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(view, setstrokealpha);
        }
        setOnTabChangedListener setontabchangedlistener = (setOnTabChangedListener) view.getTag(R.id.res_0x7f0a01e0);
        if (setontabchangedlistener != null) {
            setStrokeAlpha MenuHostHelper$$ExternalSyntheticLambda02 = setontabchangedlistener.MenuHostHelper$$ExternalSyntheticLambda0(view, setstrokealpha);
            if (MenuHostHelper$$ExternalSyntheticLambda02 == null) {
                return null;
            }
            return setViewTranslationCallback(view).setX(MenuHostHelper$$ExternalSyntheticLambda02);
        }
        return setViewTranslationCallback(view).setX(setstrokealpha);
    }

    private static setCompoundDrawablesRelative setViewTranslationCallback(View view) {
        if (view instanceof setCompoundDrawablesRelative) {
            return (setCompoundDrawablesRelative) view;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* loaded from: classes.dex */
    public static final class setTextScaleX {
        public static String[] setIconTintList(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static setStrokeAlpha MenuHostHelper$$ExternalSyntheticLambda0(View view, setStrokeAlpha setstrokealpha) {
            ContentInfo y = setstrokealpha.setY();
            ContentInfo performReceiveContent = view.performReceiveContent(y);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == y ? setstrokealpha : setStrokeAlpha.setIconTintList(performReceiveContent);
        }
    }

    public static boolean setHasDecor(View view) {
        return setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple(view);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(View view, Drawable drawable) {
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(view, drawable);
    }

    public static ColorStateList setLayoutAnimation(View view) {
        return setUnboundedRipple.setY(view);
    }

    public static void setY(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (setUnboundedRipple.setY(view) == null && setUnboundedRipple.setX(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(view, background);
        }
    }

    public static PorterDuff.Mode setNavigationOnClickListener(View view) {
        return setUnboundedRipple.setX(view);
    }

    public static void setX(View view, PorterDuff.Mode mode) {
        setUnboundedRipple.setX(view, mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = (setUnboundedRipple.setY(view) == null && setUnboundedRipple.setX(view) == null) ? false : true;
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(view, background);
        }
    }

    public static void setAdapter(View view) {
        setUnboundedRipple.setUiOptions(view);
    }

    public static boolean setConstraintSet(View view) {
        return setLayoutAnimation.setIconTintList(view);
    }

    public static float setGuidelinePercent(View view) {
        return setUnboundedRipple.setUnboundedRipple(view);
    }

    public static void setX(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect x = setX();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        setUiOptions(view, i);
        if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(x);
        }
    }

    private static void setUiOptions(View view, int i) {
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            RecyclerView$SavedState$1(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                RecyclerView$SavedState$1((View) parent);
            }
        }
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect x = setX();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            x.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !x.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        setLayoutAnimation(view, i);
        if (z && x.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(x);
        }
    }

    private static void setLayoutAnimation(View view, int i) {
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            RecyclerView$SavedState$1(view);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                RecyclerView$SavedState$1((View) parent);
            }
        }
    }

    private static void RecyclerView$SavedState$1(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static Rect setOnLongClickListener(View view) {
        return setOnLongClickListener.setIconTintList(view);
    }

    public static boolean setChipIconTintResource(View view) {
        return setLayoutAnimation.setX(view);
    }

    public static void setY(View view, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            setNavigationOnClickListener.setY(view, i, i2);
        }
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(View view, setVerticalScrollbarThumbDrawable setverticalscrollbarthumbdrawable) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon(setErrorIconDrawable.MenuHostHelper$$ExternalSyntheticLambda0(setverticalscrollbarthumbdrawable != null ? setverticalscrollbarthumbdrawable.setY() : null));
        }
    }

    public static Display setUnboundedRipple(View view) {
        return setX.setY(view);
    }

    @Deprecated
    protected setBaselineAlignBottom() {
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return setOnNavigationItemSelectedListener.setIconTintList(view).MenuHostHelper$$ExternalSyntheticLambda1(keyEvent);
    }

    public static boolean setX(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return setOnNavigationItemSelectedListener.setIconTintList(view).setX(view, keyEvent);
    }

    public static void setX(View view, boolean z) {
        setY().setX(view, (View) Boolean.valueOf(z));
    }

    public static boolean setContentScrimResource(View view) {
        Boolean iconTintList = setY().setIconTintList(view);
        return iconTintList != null && iconTintList.booleanValue();
    }

    private static setY<Boolean> setY() {
        return new setY<Boolean>(R.id.res_0x7f0a01e2, Boolean.class, 28) { // from class: o.setBaselineAlignBottom.1
            @Override // o.setBaselineAlignBottom.setY
            /* renamed from: setY */
            public Boolean setX(View view) {
                return Boolean.valueOf(setCenterIfNoTextEnabled.setX(view));
            }

            @Override // o.setBaselineAlignBottom.setY
            public void setIconTintList(View view, Boolean bool) {
                setCenterIfNoTextEnabled.setX(view, bool.booleanValue());
            }

            @Override // o.setBaselineAlignBottom.setY
            /* renamed from: setY */
            public boolean setX(Boolean bool, Boolean bool2) {
                return !setX(bool, bool2);
            }
        };
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(View view, CharSequence charSequence) {
        setIconTintList().setX(view, (View) charSequence);
        if (charSequence != null) {
            setX.MenuHostHelper$$ExternalSyntheticLambda1(view);
        } else {
            setX.setIconTintList(view);
        }
    }

    public static CharSequence setIconTintList(View view) {
        return setIconTintList().setIconTintList(view);
    }

    private static setY<CharSequence> setIconTintList() {
        return new setY<CharSequence>(R.id.res_0x7f0a01de, CharSequence.class, 8, 28) { // from class: o.setBaselineAlignBottom.4
            @Override // o.setBaselineAlignBottom.setY
            /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
            public CharSequence setX(View view) {
                return view.getAccessibilityPaneTitle();
            }

            @Override // o.setBaselineAlignBottom.setY
            /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
            public void setIconTintList(View view, CharSequence charSequence) {
                setCenterIfNoTextEnabled.setY(view, charSequence);
            }

            @Override // o.setBaselineAlignBottom.setY
            public boolean setX(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    private static setY<CharSequence> setLayoutAnimation() {
        return new setY<CharSequence>(R.id.res_0x7f0a01e3, CharSequence.class, 64, 30) { // from class: o.setBaselineAlignBottom.2
            @Override // o.setBaselineAlignBottom.setY
            /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
            public CharSequence setX(View view) {
                return setIconSize.setIconTintList(view);
            }

            @Override // o.setBaselineAlignBottom.setY
            /* renamed from: setY */
            public void setIconTintList(View view, CharSequence charSequence) {
                view.setStateDescription(charSequence);
            }

            @Override // o.setBaselineAlignBottom.setY
            public boolean setX(CharSequence charSequence, CharSequence charSequence2) {
                return !TextUtils.equals(charSequence, charSequence2);
            }
        };
    }

    public static boolean SearchView$SavedState$1(View view) {
        Boolean iconTintList = MenuHostHelper$$ExternalSyntheticLambda1().setIconTintList(view);
        return iconTintList != null && iconTintList.booleanValue();
    }

    public static void setIconTintList(View view, boolean z) {
        MenuHostHelper$$ExternalSyntheticLambda1().setX(view, (View) Boolean.valueOf(z));
    }

    private static setY<Boolean> MenuHostHelper$$ExternalSyntheticLambda1() {
        return new setY<Boolean>(R.id.res_0x7f0a01dd, Boolean.class, 28) { // from class: o.setBaselineAlignBottom.3
            @Override // o.setBaselineAlignBottom.setY
            /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
            public Boolean setX(View view) {
                return Boolean.valueOf(setCenterIfNoTextEnabled.setY(view));
            }

            @Override // o.setBaselineAlignBottom.setY
            /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
            public void setIconTintList(View view, Boolean bool) {
                view.setAccessibilityHeading(bool.booleanValue());
            }

            @Override // o.setBaselineAlignBottom.setY
            /* renamed from: setIconTintList */
            public boolean setX(Boolean bool, Boolean bool2) {
                return !setX(bool, bool2);
            }
        };
    }

    /* loaded from: classes.dex */
    public static abstract class setY<T> {
        private final int MenuHostHelper$$ExternalSyntheticLambda1;
        private final int setIconTintList;
        private final Class<T> setX;
        private final int setY;

        private boolean MenuHostHelper$$ExternalSyntheticLambda1() {
            return true;
        }

        abstract void setIconTintList(View view, T t);

        abstract T setX(View view);

        setY(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        setY(int i, Class<T> cls, int i2, int i3) {
            this.setY = i;
            this.setX = cls;
            this.setIconTintList = i2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
        }

        void setX(View view, T t) {
            if (setX()) {
                setIconTintList(view, t);
            } else if (MenuHostHelper$$ExternalSyntheticLambda1() && setX(setIconTintList(view), t)) {
                setBaselineAlignBottom.setX(view);
                view.setTag(this.setY, t);
                setBaselineAlignBottom.setY(view, this.setIconTintList);
            }
        }

        T setIconTintList(View view) {
            if (setX()) {
                return setX(view);
            }
            if (MenuHostHelper$$ExternalSyntheticLambda1()) {
                T t = (T) view.getTag(this.setY);
                if (this.setX.isInstance(t)) {
                    return t;
                }
                return null;
            }
            return null;
        }

        private boolean setX() {
            return Build.VERSION.SDK_INT >= this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        boolean setX(T t, T t2) {
            return !t2.equals(t);
        }

        boolean setX(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }
    }

    static void setY(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = setIconTintList(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                setLayoutAnimation.setIconTintList(obtain, i);
                if (z) {
                    obtain.getText().add(setIconTintList(view));
                    setFloatValues(view);
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                setLayoutAnimation.setIconTintList(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add(setIconTintList(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(view.getParent().getClass().getSimpleName());
                    sb.append(" does not fully implement ViewParent");
                    Log.e("ViewCompat", sb.toString(), e);
                }
            }
        }
    }

    private static void setFloatValues(View view) {
        if (setCenterIfNoTextEnabled(view) == 0) {
            setUnboundedRipple(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (setCenterIfNoTextEnabled((View) parent) == 4) {
                setUnboundedRipple(view, 2);
                return;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {
        private final WeakHashMap<View, Boolean> setIconTintList = new WeakHashMap<>();

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }

        setIconTintList() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.setIconTintList.entrySet()) {
                    setY(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            MenuHostHelper$$ExternalSyntheticLambda0(view);
        }

        void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
            this.setIconTintList.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (setLayoutAnimation.setX(view)) {
                MenuHostHelper$$ExternalSyntheticLambda0(view);
            }
        }

        void setIconTintList(View view) {
            this.setIconTintList.remove(view);
            view.removeOnAttachStateChangeListener(this);
            setX(view);
        }

        private void setY(View view, boolean z) {
            boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
            if (z != z2) {
                setBaselineAlignBottom.setY(view, z2 ? 16 : 32);
                this.setIconTintList.put(view, Boolean.valueOf(z2));
            }
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void setX(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* loaded from: classes.dex */
    public static class setOnNavigationItemSelectedListener {
        private static final ArrayList<WeakReference<View>> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();
        private WeakHashMap<View, Boolean> setIconTintList = null;
        private SparseArray<WeakReference<View>> setX = null;
        private WeakReference<KeyEvent> MenuHostHelper$$ExternalSyntheticLambda0 = null;

        setOnNavigationItemSelectedListener() {
        }

        private SparseArray<WeakReference<View>> setIconTintList() {
            if (this.setX == null) {
                this.setX = new SparseArray<>();
            }
            return this.setX;
        }

        static setOnNavigationItemSelectedListener setIconTintList(View view) {
            setOnNavigationItemSelectedListener setonnavigationitemselectedlistener = (setOnNavigationItemSelectedListener) view.getTag(R.id.res_0x7f0a01e5);
            if (setonnavigationitemselectedlistener == null) {
                setOnNavigationItemSelectedListener setonnavigationitemselectedlistener2 = new setOnNavigationItemSelectedListener();
                view.setTag(R.id.res_0x7f0a01e5, setonnavigationitemselectedlistener2);
                return setonnavigationitemselectedlistener2;
            }
            return setonnavigationitemselectedlistener;
        }

        boolean setX(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                MenuHostHelper$$ExternalSyntheticLambda1();
            }
            View MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (MenuHostHelper$$ExternalSyntheticLambda12 != null && !KeyEvent.isModifierKey(keyCode)) {
                    setIconTintList().put(keyCode, new WeakReference<>(MenuHostHelper$$ExternalSyntheticLambda12));
                }
            }
            return MenuHostHelper$$ExternalSyntheticLambda12 != null;
        }

        private View MenuHostHelper$$ExternalSyntheticLambda1(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.setIconTintList;
            if (weakHashMap == null || !weakHashMap.containsKey(view)) {
                return null;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(viewGroup.getChildAt(childCount), keyEvent);
                    if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                        return MenuHostHelper$$ExternalSyntheticLambda12;
                    }
                }
            }
            if (setIconTintList(view, keyEvent)) {
                return view;
            }
            return null;
        }

        boolean MenuHostHelper$$ExternalSyntheticLambda1(KeyEvent keyEvent) {
            WeakReference<View> weakReference;
            int indexOfKey;
            WeakReference<KeyEvent> weakReference2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new WeakReference<>(keyEvent);
                SparseArray<WeakReference<View>> iconTintList = setIconTintList();
                if (keyEvent.getAction() != 1 || (indexOfKey = iconTintList.indexOfKey(keyEvent.getKeyCode())) < 0) {
                    weakReference = null;
                } else {
                    weakReference = iconTintList.valueAt(indexOfKey);
                    iconTintList.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = iconTintList.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    View view = weakReference.get();
                    if (view != null && setBaselineAlignBottom.setChipIconTintResource(view)) {
                        setIconTintList(view, keyEvent);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }

        private boolean setIconTintList(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.res_0x7f0a01e6);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((setMaxEms) arrayList.get(size)).setX(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        private void MenuHostHelper$$ExternalSyntheticLambda1() {
            WeakHashMap<View, Boolean> weakHashMap = this.setIconTintList;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList = MenuHostHelper$$ExternalSyntheticLambda1;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                if (this.setIconTintList == null) {
                    this.setIconTintList = new WeakHashMap<>();
                }
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ArrayList<WeakReference<View>> arrayList2 = MenuHostHelper$$ExternalSyntheticLambda1;
                    View view = arrayList2.get(size).get();
                    if (view == null) {
                        arrayList2.remove(size);
                    } else {
                        this.setIconTintList.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.setIconTintList.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setUnboundedRipple {
        public static WindowInsetsCompat setIconTintList(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
            WindowInsets iconSize = windowInsetsCompat.setIconSize();
            if (iconSize != null) {
                return WindowInsetsCompat.setY(view.computeSystemWindowInsets(iconSize, rect), view);
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        public static void MenuHostHelper$$ExternalSyntheticLambda1(final View view, final setCircularRevealScrimColor setcircularrevealscrimcolor) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.res_0x7f0a01df, setcircularrevealscrimcolor);
            }
            if (setcircularrevealscrimcolor == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.res_0x7f0a01e7));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.setBaselineAlignBottom.setUnboundedRipple.3
                    WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda0 = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        WindowInsetsCompat y = WindowInsetsCompat.setY(windowInsets, view2);
                        if (Build.VERSION.SDK_INT < 30) {
                            setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(windowInsets, view);
                            if (y.equals(this.MenuHostHelper$$ExternalSyntheticLambda0)) {
                                return setcircularrevealscrimcolor.setIconTintList(view2, y).setIconSize();
                            }
                        }
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = y;
                        WindowInsetsCompat iconTintList = setcircularrevealscrimcolor.setIconTintList(view2, y);
                        if (Build.VERSION.SDK_INT < 30) {
                            setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(view2);
                            return iconTintList.setIconSize();
                        }
                        return iconTintList.setIconSize();
                    }
                });
            }
        }

        static void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.res_0x7f0a01e7);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static float setUnboundedRipple(View view) {
            return view.getZ();
        }

        public static void setIconTintList(View view, float f) {
            view.setElevation(f);
        }

        static float setIconTintList(View view) {
            return view.getElevation();
        }

        static ColorStateList setY(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode setX(View view) {
            return view.getBackgroundTintMode();
        }

        static void setX(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static boolean setNavigationOnClickListener(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void setUiOptions(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setNavigationOnClickListener {
        public static WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda1(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat x = WindowInsetsCompat.setX(rootWindowInsets);
            x.setY(x);
            x.MenuHostHelper$$ExternalSyntheticLambda0(view.getRootView());
            return x;
        }

        static void setY(View view, int i, int i2) {
            view.setScrollIndicators(i, i2);
        }
    }

    /* loaded from: classes.dex */
    public static class setIconSize {
        static CharSequence setIconTintList(View view) {
            return view.getStateDescription();
        }
    }

    /* loaded from: classes.dex */
    public static class setTextAlignment {
        static int setX(View view) {
            return view.getImportantForAutofill();
        }
    }

    /* loaded from: classes.dex */
    public static class setOnLongClickListener {
        static Rect setIconTintList(View view) {
            return view.getClipBounds();
        }
    }

    /* loaded from: classes.dex */
    public static class setLayoutAnimation {
        static boolean setIconTintList(View view) {
            return view.isLaidOut();
        }

        static boolean setX(View view) {
            return view.isAttachedToWindow();
        }

        static void setIconTintList(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* loaded from: classes.dex */
    public static class setChipCornerRadius {
    }

    /* loaded from: classes.dex */
    public static class setX {
        static Display setY(View view) {
            return view.getDisplay();
        }

        public static int setIconTintList() {
            return View.generateViewId();
        }

        public static int setX(View view) {
            return view.getLayoutDirection();
        }

        public static void setX(View view, int i, int i2, int i3, int i4) {
            view.setPaddingRelative(i, i2, i3, i4);
        }
    }

    /* loaded from: classes.dex */
    public static class setCenterIfNoTextEnabled {
        static void setY(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static boolean setY(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean setX(View view) {
            return view.isScreenReaderFocusable();
        }

        static void setX(View view, boolean z) {
            view.setScreenReaderFocusable(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setUiOptions {
        public static void MenuHostHelper$$ExternalSyntheticLambda1(View view) {
            view.requestApplyInsets();
        }

        static WindowInsets setIconTintList(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }
    }
}