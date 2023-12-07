package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import o.setAllowStacking;
import o.setBaselineAlignBottom;
import o.setCompoundDrawableTintMode;
import o.setHelperTextColor;

/* loaded from: classes.dex */
public class WindowInsetsCompat {
    public static final WindowInsetsCompat setX;
    private final Impl MenuHostHelper$$ExternalSyntheticLambda0;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            setX = Impl30.CONSUMED;
        } else {
            setX = Impl.CONSUMED;
        }
    }

    private WindowInsetsCompat(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl30(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl29(this, windowInsets);
        } else if (Build.VERSION.SDK_INT >= 28) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl28(this, windowInsets);
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl21(this, windowInsets);
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            Impl impl = windowInsetsCompat.MenuHostHelper$$ExternalSyntheticLambda0;
            if (Build.VERSION.SDK_INT >= 30 && (impl instanceof Impl30)) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl30(this, (Impl30) impl);
            } else if (Build.VERSION.SDK_INT >= 29 && (impl instanceof Impl29)) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl29(this, (Impl29) impl);
            } else if (Build.VERSION.SDK_INT >= 28 && (impl instanceof Impl28)) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl28(this, (Impl28) impl);
            } else if (impl instanceof Impl21) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl21(this, (Impl21) impl);
            } else if (impl instanceof Impl20) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl20(this, (Impl20) impl);
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl(this);
            }
            impl.copyWindowDataInto(this);
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new Impl(this);
    }

    public static WindowInsetsCompat setX(WindowInsets windowInsets) {
        return setY(windowInsets, null);
    }

    public static WindowInsetsCompat setY(WindowInsets windowInsets, View view) {
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && setBaselineAlignBottom.setChipIconTintResource(view)) {
            windowInsetsCompat.setY(setBaselineAlignBottom.setZ(view));
            windowInsetsCompat.MenuHostHelper$$ExternalSyntheticLambda0(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @Deprecated
    public int setNavigationOnClickListener() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.getSystemWindowInsets().setY;
    }

    @Deprecated
    public int setUiOptions() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.getSystemWindowInsets().MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Deprecated
    public int setOnLongClickListener() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.getSystemWindowInsets().setX;
    }

    @Deprecated
    public int setUnboundedRipple() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.getSystemWindowInsets().setIconTintList;
    }

    public boolean setLayoutAnimation() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.isConsumed();
    }

    @Deprecated
    public WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.consumeSystemWindowInsets();
    }

    @Deprecated
    public WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3, int i4) {
        return new WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1(this).setX(setHelperTextColor.setY(i, i2, i3, i4)).setIconTintList();
    }

    @Deprecated
    public WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.consumeStableInsets();
    }

    public setCompoundDrawableTintMode setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.getDisplayCutout();
    }

    @Deprecated
    public WindowInsetsCompat setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.consumeDisplayCutout();
    }

    @Deprecated
    public setHelperTextColor setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.getStableInsets();
    }

    public WindowInsetsCompat setIconTintList(int i, int i2, int i3, int i4) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.inset(i, i2, i3, i4);
    }

    public setHelperTextColor MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.getInsets(i);
    }

    public boolean equals(Object obj) {
        boolean x;
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            x = setAllowStacking.setX.setX(this.MenuHostHelper$$ExternalSyntheticLambda0, ((WindowInsetsCompat) obj).MenuHostHelper$$ExternalSyntheticLambda0);
            return x;
        }
        return false;
    }

    public int hashCode() {
        Impl impl = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public WindowInsets setIconSize() {
        Impl impl = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    /* loaded from: classes.dex */
    public static class Impl {
        static final WindowInsetsCompat CONSUMED = new WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1().setIconTintList().setX().MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda0();
        final WindowInsetsCompat mHost;

        void copyRootViewBounds(View view) {
        }

        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
        }

        setCompoundDrawableTintMode getDisplayCutout() {
            return null;
        }

        boolean isConsumed() {
            return false;
        }

        boolean isRound() {
            return false;
        }

        boolean isVisible(int i) {
            return true;
        }

        public void setOverriddenInsets(setHelperTextColor[] sethelpertextcolorArr) {
        }

        void setRootViewData(setHelperTextColor sethelpertextcolor) {
        }

        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        }

        public void setStableInsets(setHelperTextColor sethelpertextcolor) {
        }

        Impl(WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        setHelperTextColor getSystemWindowInsets() {
            return setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        setHelperTextColor getStableInsets() {
            return setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        setHelperTextColor getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        setHelperTextColor getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        setHelperTextColor getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return CONSUMED;
        }

        setHelperTextColor getInsets(int i) {
            return setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        setHelperTextColor getInsetsIgnoringVisibility(int i) {
            if ((i & 8) != 0) {
                throw new IllegalArgumentException("Unable to query the maximum insets for IME");
            }
            return setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        public boolean equals(Object obj) {
            boolean x;
            boolean x2;
            boolean x3;
            if (this == obj) {
                return true;
            }
            if (obj instanceof Impl) {
                Impl impl = (Impl) obj;
                if (isRound() == impl.isRound() && isConsumed() == impl.isConsumed()) {
                    x = setAllowStacking.setX.setX(getSystemWindowInsets(), impl.getSystemWindowInsets());
                    if (x) {
                        x2 = setAllowStacking.setX.setX(getStableInsets(), impl.getStableInsets());
                        if (x2) {
                            x3 = setAllowStacking.setX.setX(getDisplayCutout(), impl.getDisplayCutout());
                            if (x3) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            }
            return false;
        }

        public int hashCode() {
            int x;
            x = setAllowStacking.setX.setX(Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
            return x;
        }
    }

    /* loaded from: classes.dex */
    public static class Impl20 extends Impl {
        private static Class<?> sAttachInfoClass = null;
        private static Field sAttachInfoField = null;
        private static Method sGetViewRootImplMethod = null;
        private static Field sVisibleInsetsField = null;
        private static boolean sVisibleRectReflectionFetched = false;
        private setHelperTextColor[] mOverriddenInsets;
        final WindowInsets mPlatformInsets;
        setHelperTextColor mRootViewVisibleInsets;
        private WindowInsetsCompat mRootWindowInsets;
        private setHelperTextColor mSystemWindowInsets;

        Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mPlatformInsets = windowInsets;
        }

        Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.mPlatformInsets));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public setHelperTextColor getInsets(int i) {
            return getInsets(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public setHelperTextColor getInsetsIgnoringVisibility(int i) {
            return getInsets(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isVisible(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !isTypeVisible(i2)) {
                    return false;
                }
            }
            return true;
        }

        private setHelperTextColor getInsets(int i, boolean z) {
            setHelperTextColor sethelpertextcolor = setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    sethelpertextcolor = setHelperTextColor.setY(sethelpertextcolor, getInsetsForType(i2, z));
                }
            }
            return sethelpertextcolor;
        }

        protected setHelperTextColor getInsetsForType(int i, boolean z) {
            setHelperTextColor y;
            setCompoundDrawableTintMode displayCutout;
            if (i == 1) {
                if (z) {
                    return setHelperTextColor.setY(0, Math.max(getRootStableInsets().MenuHostHelper$$ExternalSyntheticLambda1, getSystemWindowInsets().MenuHostHelper$$ExternalSyntheticLambda1), 0, 0);
                }
                return setHelperTextColor.setY(0, getSystemWindowInsets().MenuHostHelper$$ExternalSyntheticLambda1, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    setHelperTextColor rootStableInsets = getRootStableInsets();
                    setHelperTextColor stableInsets = getStableInsets();
                    return setHelperTextColor.setY(Math.max(rootStableInsets.setY, stableInsets.setY), 0, Math.max(rootStableInsets.setX, stableInsets.setX), Math.max(rootStableInsets.setIconTintList, stableInsets.setIconTintList));
                }
                setHelperTextColor systemWindowInsets = getSystemWindowInsets();
                WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                y = windowInsetsCompat != null ? windowInsetsCompat.setY() : null;
                int i2 = systemWindowInsets.setIconTintList;
                if (y != null) {
                    i2 = Math.min(i2, y.setIconTintList);
                }
                return setHelperTextColor.setY(systemWindowInsets.setY, 0, systemWindowInsets.setX, i2);
            } else if (i == 8) {
                setHelperTextColor[] sethelpertextcolorArr = this.mOverriddenInsets;
                y = sethelpertextcolorArr != null ? sethelpertextcolorArr[setNavigationOnClickListener.setX(8)] : null;
                if (y != null) {
                    return y;
                }
                setHelperTextColor systemWindowInsets2 = getSystemWindowInsets();
                setHelperTextColor rootStableInsets2 = getRootStableInsets();
                if (systemWindowInsets2.setIconTintList > rootStableInsets2.setIconTintList) {
                    return setHelperTextColor.setY(0, 0, 0, systemWindowInsets2.setIconTintList);
                }
                setHelperTextColor sethelpertextcolor = this.mRootViewVisibleInsets;
                if (sethelpertextcolor != null && !sethelpertextcolor.equals(setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0) && this.mRootViewVisibleInsets.setIconTintList > rootStableInsets2.setIconTintList) {
                    return setHelperTextColor.setY(0, 0, 0, this.mRootViewVisibleInsets.setIconTintList);
                }
                return setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
            } else if (i != 16) {
                if (i != 32) {
                    if (i != 64) {
                        if (i == 128) {
                            WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                            if (windowInsetsCompat2 != null) {
                                displayCutout = windowInsetsCompat2.setIconTintList();
                            } else {
                                displayCutout = getDisplayCutout();
                            }
                            if (displayCutout != null) {
                                return setHelperTextColor.setY(displayCutout.MenuHostHelper$$ExternalSyntheticLambda1(), displayCutout.MenuHostHelper$$ExternalSyntheticLambda0(), displayCutout.setIconTintList(), displayCutout.setX());
                            }
                            return setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
                        }
                        return setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                    return getTappableElementInsets();
                }
                return getMandatorySystemGestureInsets();
            } else {
                return getSystemGestureInsets();
            }
        }

        protected boolean isTypeVisible(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !getInsetsForType(i, false).equals(setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final setHelperTextColor getSystemWindowInsets() {
            if (this.mSystemWindowInsets == null) {
                this.mSystemWindowInsets = setHelperTextColor.setY(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
            }
            return this.mSystemWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1 = new WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat.setX(this.mPlatformInsets));
            windowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1.setX(WindowInsetsCompat.setX(getSystemWindowInsets(), i, i2, i3, i4));
            windowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1.setY(WindowInsetsCompat.setX(getStableInsets(), i, i2, i3, i4));
            return windowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.setY(this.mRootWindowInsets);
            windowInsetsCompat.setY(this.mRootViewVisibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
            this.mRootWindowInsets = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(setHelperTextColor sethelpertextcolor) {
            this.mRootViewVisibleInsets = sethelpertextcolor;
        }

        private setHelperTextColor getRootStableInsets() {
            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.setY();
            }
            return setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(View view) {
            setHelperTextColor visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = setHelperTextColor.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            setRootViewData(visibleInsets);
        }

        private setHelperTextColor getVisibleInsets(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!sVisibleRectReflectionFetched) {
                loadReflectionField();
            }
            Method method = sGetViewRootImplMethod;
            if (method != null && sAttachInfoClass != null && sVisibleInsetsField != null) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) sVisibleInsetsField.get(sAttachInfoField.get(invoke));
                    if (rect != null) {
                        return setHelperTextColor.setIconTintList(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(setHelperTextColor[] sethelpertextcolorArr) {
            this.mOverriddenInsets = sethelpertextcolorArr;
        }

        private static void loadReflectionField() {
            try {
                sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            sVisibleRectReflectionFetched = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.mRootViewVisibleInsets, ((Impl20) obj).mRootViewVisibleInsets);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Impl21 extends Impl20 {
        private setHelperTextColor mStableInsets;

        Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }

        Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeStableInsets() {
            return WindowInsetsCompat.setX(this.mPlatformInsets.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeSystemWindowInsets() {
            return WindowInsetsCompat.setX(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final setHelperTextColor getStableInsets() {
            if (this.mStableInsets == null) {
                this.mStableInsets = setHelperTextColor.setY(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
            }
            return this.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(setHelperTextColor sethelpertextcolor) {
            this.mStableInsets = sethelpertextcolor;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Impl28 extends Impl21 {
        Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        setCompoundDrawableTintMode getDisplayCutout() {
            DisplayCutout displayCutout;
            displayCutout = this.mPlatformInsets.getDisplayCutout();
            return setCompoundDrawableTintMode.setIconTintList(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat consumeDisplayCutout() {
            WindowInsets consumeDisplayCutout;
            consumeDisplayCutout = this.mPlatformInsets.consumeDisplayCutout();
            return WindowInsetsCompat.setX(consumeDisplayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Impl28) {
                Impl28 impl28 = (Impl28) obj;
                return Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) && Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets);
            }
            return false;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Impl29 extends Impl28 {
        private setHelperTextColor mMandatorySystemGestureInsets;
        private setHelperTextColor mSystemGestureInsets;
        private setHelperTextColor mTappableElementInsets;

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(setHelperTextColor sethelpertextcolor) {
        }

        Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        setHelperTextColor getSystemGestureInsets() {
            Insets systemGestureInsets;
            if (this.mSystemGestureInsets == null) {
                systemGestureInsets = this.mPlatformInsets.getSystemGestureInsets();
                this.mSystemGestureInsets = setHelperTextColor.setIconTintList(systemGestureInsets);
            }
            return this.mSystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        setHelperTextColor getMandatorySystemGestureInsets() {
            Insets mandatorySystemGestureInsets;
            if (this.mMandatorySystemGestureInsets == null) {
                mandatorySystemGestureInsets = this.mPlatformInsets.getMandatorySystemGestureInsets();
                this.mMandatorySystemGestureInsets = setHelperTextColor.setIconTintList(mandatorySystemGestureInsets);
            }
            return this.mMandatorySystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        setHelperTextColor getTappableElementInsets() {
            Insets tappableElementInsets;
            if (this.mTappableElementInsets == null) {
                tappableElementInsets = this.mPlatformInsets.getTappableElementInsets();
                this.mTappableElementInsets = setHelperTextColor.setIconTintList(tappableElementInsets);
            }
            return this.mTappableElementInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            WindowInsets inset;
            inset = this.mPlatformInsets.inset(i, i2, i3, i4);
            return WindowInsetsCompat.setX(inset);
        }
    }

    static setHelperTextColor setX(setHelperTextColor sethelpertextcolor, int i, int i2, int i3, int i4) {
        int max = Math.max(0, sethelpertextcolor.setY - i);
        int max2 = Math.max(0, sethelpertextcolor.MenuHostHelper$$ExternalSyntheticLambda1 - i2);
        int max3 = Math.max(0, sethelpertextcolor.setX - i3);
        int max4 = Math.max(0, sethelpertextcolor.setIconTintList - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? sethelpertextcolor : setHelperTextColor.setY(max, max2, max3, max4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class Impl30 extends Impl29 {
        static final WindowInsetsCompat CONSUMED;

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(View view) {
        }

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            CONSUMED = WindowInsetsCompat.setX(windowInsets);
        }

        Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public setHelperTextColor getInsets(int i) {
            Insets insets;
            insets = this.mPlatformInsets.getInsets(setOnLongClickListener.setY(i));
            return setHelperTextColor.setIconTintList(insets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public setHelperTextColor getInsetsIgnoringVisibility(int i) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.mPlatformInsets.getInsetsIgnoringVisibility(setOnLongClickListener.setY(i));
            return setHelperTextColor.setIconTintList(insetsIgnoringVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            boolean isVisible;
            isVisible = this.mPlatformInsets.isVisible(setOnLongClickListener.setY(i));
            return isVisible;
        }
    }

    /* loaded from: classes.dex */
    public static class setY {
        private final WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda1;
        setHelperTextColor[] setX;

        void MenuHostHelper$$ExternalSyntheticLambda0(setHelperTextColor sethelpertextcolor) {
        }

        void MenuHostHelper$$ExternalSyntheticLambda1(setHelperTextColor sethelpertextcolor) {
        }

        void setIconTintList(setHelperTextColor sethelpertextcolor) {
        }

        public void setX(setHelperTextColor sethelpertextcolor) {
        }

        public void setY(setHelperTextColor sethelpertextcolor) {
        }

        public setY() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }

        public setY(WindowInsetsCompat windowInsetsCompat) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = windowInsetsCompat;
        }

        public final void setIconTintList() {
            setHelperTextColor[] sethelpertextcolorArr = this.setX;
            if (sethelpertextcolorArr != null) {
                setHelperTextColor sethelpertextcolor = sethelpertextcolorArr[setNavigationOnClickListener.setX(1)];
                setHelperTextColor sethelpertextcolor2 = this.setX[setNavigationOnClickListener.setX(2)];
                if (sethelpertextcolor2 == null) {
                    sethelpertextcolor2 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(2);
                }
                if (sethelpertextcolor == null) {
                    sethelpertextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(1);
                }
                setX(setHelperTextColor.setY(sethelpertextcolor, sethelpertextcolor2));
                setHelperTextColor sethelpertextcolor3 = this.setX[setNavigationOnClickListener.setX(16)];
                if (sethelpertextcolor3 != null) {
                    setIconTintList(sethelpertextcolor3);
                }
                setHelperTextColor sethelpertextcolor4 = this.setX[setNavigationOnClickListener.setX(32)];
                if (sethelpertextcolor4 != null) {
                    MenuHostHelper$$ExternalSyntheticLambda0(sethelpertextcolor4);
                }
                setHelperTextColor sethelpertextcolor5 = this.setX[setNavigationOnClickListener.setX(64)];
                if (sethelpertextcolor5 != null) {
                    MenuHostHelper$$ExternalSyntheticLambda1(sethelpertextcolor5);
                }
            }
        }

        public WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda0() {
            setIconTintList();
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(setHelperTextColor[] sethelpertextcolorArr) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setOverriddenInsets(sethelpertextcolorArr);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(setHelperTextColor sethelpertextcolor) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setStableInsets(sethelpertextcolor);
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends setY {
        final WindowInsets.Builder setY;

        public setIconTintList() {
            this.setY = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m4m();
        }

        public setIconTintList(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets.Builder m4m;
            WindowInsets iconSize = windowInsetsCompat.setIconSize();
            if (iconSize != null) {
                m4m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m5m(iconSize);
            } else {
                m4m = WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.m4m();
            }
            this.setY = m4m;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.WindowInsetsCompat.setY
        public void setX(setHelperTextColor sethelpertextcolor) {
            this.setY.setSystemWindowInsets(setHelperTextColor.setX.setY(sethelpertextcolor.setY, sethelpertextcolor.MenuHostHelper$$ExternalSyntheticLambda1, sethelpertextcolor.setX, sethelpertextcolor.setIconTintList));
        }

        @Override // androidx.core.view.WindowInsetsCompat.setY
        void setIconTintList(setHelperTextColor sethelpertextcolor) {
            this.setY.setSystemGestureInsets(setHelperTextColor.setX.setY(sethelpertextcolor.setY, sethelpertextcolor.MenuHostHelper$$ExternalSyntheticLambda1, sethelpertextcolor.setX, sethelpertextcolor.setIconTintList));
        }

        @Override // androidx.core.view.WindowInsetsCompat.setY
        void MenuHostHelper$$ExternalSyntheticLambda0(setHelperTextColor sethelpertextcolor) {
            this.setY.setMandatorySystemGestureInsets(setHelperTextColor.setX.setY(sethelpertextcolor.setY, sethelpertextcolor.MenuHostHelper$$ExternalSyntheticLambda1, sethelpertextcolor.setX, sethelpertextcolor.setIconTintList));
        }

        @Override // androidx.core.view.WindowInsetsCompat.setY
        void MenuHostHelper$$ExternalSyntheticLambda1(setHelperTextColor sethelpertextcolor) {
            this.setY.setTappableElementInsets(setHelperTextColor.setX.setY(sethelpertextcolor.setY, sethelpertextcolor.MenuHostHelper$$ExternalSyntheticLambda1, sethelpertextcolor.setX, sethelpertextcolor.setIconTintList));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.WindowInsetsCompat.setY
        public void setY(setHelperTextColor sethelpertextcolor) {
            this.setY.setStableInsets(setHelperTextColor.setX.setY(sethelpertextcolor.setY, sethelpertextcolor.MenuHostHelper$$ExternalSyntheticLambda1, sethelpertextcolor.setX, sethelpertextcolor.setIconTintList));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.core.view.WindowInsetsCompat.setY
        public WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda0() {
            WindowInsets build;
            setIconTintList();
            build = this.setY.build();
            WindowInsetsCompat x = WindowInsetsCompat.setX(build);
            x.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
            return x;
        }
    }

    /* loaded from: classes.dex */
    public static class setLayoutAnimation extends setIconTintList {
        public setLayoutAnimation() {
        }

        public setLayoutAnimation(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* loaded from: classes.dex */
    public static final class setNavigationOnClickListener {
        public static int MenuHostHelper$$ExternalSyntheticLambda1() {
            return 32;
        }

        public static int setIconTintList() {
            return 7;
        }

        static int setX(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 8) {
                            if (i != 16) {
                                if (i != 32) {
                                    if (i != 64) {
                                        if (i != 128) {
                                            if (i == 256) {
                                                return 8;
                                            }
                                            StringBuilder sb = new StringBuilder("type needs to be >= FIRST and <= LAST, type=");
                                            sb.append(i);
                                            throw new IllegalArgumentException(sb.toString());
                                        }
                                        return 7;
                                    }
                                    return 6;
                                }
                                return 5;
                            }
                            return 4;
                        }
                        return 3;
                    }
                    return 2;
                }
                return 1;
            }
            return 0;
        }
    }

    /* loaded from: classes.dex */
    static final class setOnLongClickListener {
        static int setY(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    public void setY(WindowInsetsCompat windowInsetsCompat) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setRootWindowInsets(windowInsetsCompat);
    }

    void setY(setHelperTextColor sethelpertextcolor) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setRootViewData(sethelpertextcolor);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.copyRootViewBounds(view);
    }

    /* loaded from: classes.dex */
    public static class setX {
        private static Field MenuHostHelper$$ExternalSyntheticLambda0;
        private static boolean MenuHostHelper$$ExternalSyntheticLambda1;
        private static Field setX;
        private static Field setY;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                MenuHostHelper$$ExternalSyntheticLambda0 = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                setX = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                setY = declaredField3;
                declaredField3.setAccessible(true);
                MenuHostHelper$$ExternalSyntheticLambda1 = true;
            } catch (ReflectiveOperationException e) {
                StringBuilder sb = new StringBuilder("Failed to get visible insets from AttachInfo ");
                sb.append(e.getMessage());
                Log.w("WindowInsetsCompat", sb.toString(), e);
            }
        }

        public static WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            if (MenuHostHelper$$ExternalSyntheticLambda1 && view.isAttachedToWindow()) {
                try {
                    Object obj = MenuHostHelper$$ExternalSyntheticLambda0.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) setX.get(obj);
                        Rect rect2 = (Rect) setY.get(obj);
                        if (rect == null || rect2 == null) {
                            return null;
                        }
                        WindowInsetsCompat iconTintList = new WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda1().setY(setHelperTextColor.setIconTintList(rect)).setX(setHelperTextColor.setIconTintList(rect2)).setIconTintList();
                        iconTintList.setY(iconTintList);
                        iconTintList.MenuHostHelper$$ExternalSyntheticLambda0(view.getRootView());
                        return iconTintList;
                    }
                    return null;
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder("Failed to get insets from AttachInfo. ");
                    sb.append(e.getMessage());
                    Log.w("WindowInsetsCompat", sb.toString(), e);
                    return null;
                }
            }
            return null;
        }
    }
}