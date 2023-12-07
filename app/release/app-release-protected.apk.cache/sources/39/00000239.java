package o;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;
import o.readObject;
import o.setInterpolator;

/* loaded from: classes.dex */
public abstract class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 extends setCounterOverflowTextColor {
    private RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$MenuHostHelper$$ExternalSyntheticLambda1 setLayoutAnimation;
    private final View setUiOptions;
    private final AccessibilityManager setUnboundedRipple;
    private static final Rect setY = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final setInterpolator.setY<setDecorPadding> setX = new setInterpolator.setY<setDecorPadding>() { // from class: o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.1
        @Override // o.setInterpolator.setY
        public final /* synthetic */ void setIconTintList(setDecorPadding setdecorpadding, Rect rect) {
            setdecorpadding.MenuHostHelper$$ExternalSyntheticLambda0(rect);
        }
    };
    private static final setInterpolator.setIconTintList<onAppEnteredBackground<setDecorPadding>, setDecorPadding> setIconTintList = new setInterpolator.setIconTintList<onAppEnteredBackground<setDecorPadding>, setDecorPadding>() { // from class: o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.4
        @Override // o.setInterpolator.setIconTintList
        public final /* synthetic */ setDecorPadding MenuHostHelper$$ExternalSyntheticLambda0(onAppEnteredBackground<setDecorPadding> onappenteredbackground, int i) {
            return onappenteredbackground.setY(i);
        }

        @Override // o.setInterpolator.setIconTintList
        public final /* bridge */ /* synthetic */ int setY(onAppEnteredBackground<setDecorPadding> onappenteredbackground) {
            return onappenteredbackground.setY();
        }
    };
    private final Rect setChipCornerRadius = new Rect();
    private final Rect ViewPager$SavedState$1 = new Rect();
    private final Rect setCenterIfNoTextEnabled = new Rect();
    private final int[] setOnLongClickListener = new int[2];
    public int MenuHostHelper$$ExternalSyntheticLambda0 = Integer.MIN_VALUE;
    public int MenuHostHelper$$ExternalSyntheticLambda1 = Integer.MIN_VALUE;
    private int setNavigationOnClickListener = Integer.MIN_VALUE;

    protected abstract void MenuHostHelper$$ExternalSyntheticLambda0(List<Integer> list);

    protected abstract void MenuHostHelper$$ExternalSyntheticLambda1(int i, setDecorPadding setdecorpadding);

    protected abstract int setIconTintList(float f, float f2);

    protected void setX(setDecorPadding setdecorpadding) {
    }

    protected abstract boolean setX(int i, int i2);

    protected void setY(int i, boolean z) {
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.setUiOptions = view;
        this.setUnboundedRipple = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (setBaselineAlignBottom.setCenterIfNoTextEnabled(view) == 0) {
            setBaselineAlignBottom.setUnboundedRipple(view, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$MenuHostHelper$$ExternalSyntheticLambda1] */
    @Override // o.setCounterOverflowTextColor
    public setCompoundDrawablesRelativeWithIntrinsicBounds setY(View view) {
        if (this.setLayoutAnimation == null) {
            this.setLayoutAnimation = new setCompoundDrawablesRelativeWithIntrinsicBounds() { // from class: o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$MenuHostHelper$$ExternalSyntheticLambda1
                @Override // o.setCompoundDrawablesRelativeWithIntrinsicBounds
                public final setDecorPadding MenuHostHelper$$ExternalSyntheticLambda0(int i) {
                    return setDecorPadding.setY(RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.this.MenuHostHelper$$ExternalSyntheticLambda0(i));
                }

                @Override // o.setCompoundDrawablesRelativeWithIntrinsicBounds
                public final boolean setIconTintList(int i, int i2, Bundle bundle) {
                    return RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.this.MenuHostHelper$$ExternalSyntheticLambda1(i, i2, bundle);
                }

                @Override // o.setCompoundDrawablesRelativeWithIntrinsicBounds
                public final setDecorPadding MenuHostHelper$$ExternalSyntheticLambda1(int i) {
                    int i2 = i == 2 ? RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.this.MenuHostHelper$$ExternalSyntheticLambda0 : RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.this.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (i2 == Integer.MIN_VALUE) {
                        return null;
                    }
                    return MenuHostHelper$$ExternalSyntheticLambda0(i2);
                }
            };
        }
        return this.setLayoutAnimation;
    }

    public final boolean setIconTintList(MotionEvent motionEvent) {
        if (this.setUnboundedRipple.isEnabled() && this.setUnboundedRipple.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int iconTintList = setIconTintList(motionEvent.getX(), motionEvent.getY());
                MenuHostHelper$$ExternalSyntheticLambda1(iconTintList);
                if (iconTintList != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && this.setNavigationOnClickListener != Integer.MIN_VALUE) {
                MenuHostHelper$$ExternalSyntheticLambda1(Integer.MIN_VALUE);
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(KeyEvent keyEvent) {
        int i = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount();
                                boolean z = false;
                                while (i < repeatCount + 1 && setIconTintList(i2, (Rect) null)) {
                                    i++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (i3 != Integer.MIN_VALUE) {
                        setX(i3, 16);
                        return true;
                    }
                    return true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return setIconTintList(2, (Rect) null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return setIconTintList(1, (Rect) null);
                }
            }
        }
        return false;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z, int i, Rect rect) {
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i2 != Integer.MIN_VALUE && i2 == i2) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = Integer.MIN_VALUE;
            setY(i2, false);
            MenuHostHelper$$ExternalSyntheticLambda1(i2, 8);
        }
        if (z) {
            setIconTintList(i, rect);
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.setUnboundedRipple.isEnabled() || (parent = this.setUiOptions.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.setUiOptions, setY(i, i2));
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        int i2 = this.setNavigationOnClickListener;
        if (i2 == i) {
            return;
        }
        this.setNavigationOnClickListener = i;
        MenuHostHelper$$ExternalSyntheticLambda1(i, 128);
        MenuHostHelper$$ExternalSyntheticLambda1(i2, 256);
    }

    @Override // o.setCounterOverflowTextColor
    public void setIconTintList(View view, AccessibilityEvent accessibilityEvent) {
        super.setIconTintList(view, accessibilityEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setDecorPadding MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (i == -1) {
            return setIconTintList();
        }
        return setY(i);
    }

    private setDecorPadding setIconTintList() {
        setDecorPadding y = setDecorPadding.setY(this.setUiOptions);
        setBaselineAlignBottom.setY(this.setUiOptions, y);
        ArrayList arrayList = new ArrayList();
        MenuHostHelper$$ExternalSyntheticLambda0(arrayList);
        if (y.MenuHostHelper$$ExternalSyntheticLambda1() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            y.setX(this.setUiOptions, ((Integer) arrayList.get(i)).intValue());
        }
        return y;
    }

    @Override // o.setCounterOverflowTextColor
    public void setY(View view, setDecorPadding setdecorpadding) {
        super.setY(view, setdecorpadding);
        setX(setdecorpadding);
    }

    private setDecorPadding setY(int i) {
        setDecorPadding y;
        setDecorPadding y2;
        y = setDecorPadding.setY(AccessibilityNodeInfo.obtain());
        y.setUiOptions(true);
        y.setUnboundedRipple(true);
        y.setIconTintList("android.view.View");
        Rect rect = setY;
        y.setY(rect);
        y.setIconTintList(rect);
        y.MenuHostHelper$$ExternalSyntheticLambda1(this.setUiOptions);
        MenuHostHelper$$ExternalSyntheticLambda1(i, y);
        if (y.setLayoutAnimation() == null && y.setNavigationOnClickListener() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        y.MenuHostHelper$$ExternalSyntheticLambda0(this.ViewPager$SavedState$1);
        if (this.ViewPager$SavedState$1.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int y3 = y.setY();
        if ((y3 & 64) == 0) {
            if ((y3 & 128) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            y.setUnboundedRipple(this.setUiOptions.getContext().getPackageName());
            y.setY(this.setUiOptions, i);
            boolean z = false;
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == i) {
                y.setY(true);
                y.setIconTintList(128);
            } else {
                y.setY(false);
                y.setIconTintList(64);
            }
            boolean z2 = this.MenuHostHelper$$ExternalSyntheticLambda1 == i;
            if (z2) {
                y.setIconTintList(2);
            } else if (y.setChipCornerRadius()) {
                y.setIconTintList(1);
            }
            y.setOnLongClickListener(z2);
            this.setUiOptions.getLocationOnScreen(this.setOnLongClickListener);
            y.MenuHostHelper$$ExternalSyntheticLambda1(this.setChipCornerRadius);
            if (this.setChipCornerRadius.equals(rect)) {
                y.MenuHostHelper$$ExternalSyntheticLambda0(this.setChipCornerRadius);
                if (y.setY != -1) {
                    y2 = setDecorPadding.setY(AccessibilityNodeInfo.obtain());
                    for (int i2 = y.setY; i2 != -1; i2 = y2.setY) {
                        y2.MenuHostHelper$$ExternalSyntheticLambda1(this.setUiOptions, -1);
                        y2.setY(setY);
                        MenuHostHelper$$ExternalSyntheticLambda1(i2, y2);
                        y2.MenuHostHelper$$ExternalSyntheticLambda0(this.ViewPager$SavedState$1);
                        this.setChipCornerRadius.offset(this.ViewPager$SavedState$1.left, this.ViewPager$SavedState$1.top);
                    }
                    y2.setLayoutDirection();
                }
                this.setChipCornerRadius.offset(this.setOnLongClickListener[0] - this.setUiOptions.getScrollX(), this.setOnLongClickListener[1] - this.setUiOptions.getScrollY());
            }
            if (this.setUiOptions.getLocalVisibleRect(this.setCenterIfNoTextEnabled)) {
                this.setCenterIfNoTextEnabled.offset(this.setOnLongClickListener[0] - this.setUiOptions.getScrollX(), this.setOnLongClickListener[1] - this.setUiOptions.getScrollY());
                if (this.setChipCornerRadius.intersect(this.setCenterIfNoTextEnabled)) {
                    y.setIconTintList(this.setChipCornerRadius);
                    Rect rect2 = this.setChipCornerRadius;
                    if (rect2 != null && !rect2.isEmpty() && this.setUiOptions.getWindowVisibility() == 0) {
                        ViewParent parent = this.setUiOptions.getParent();
                        while (true) {
                            if (parent instanceof View) {
                                View view = (View) parent;
                                if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                    break;
                                }
                                parent = view.getParent();
                            } else if (parent != null) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        y.ViewPager$SavedState$1(true);
                    }
                }
            }
            return y;
        }
        throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
    }

    private boolean setX(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == i) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Integer.MIN_VALUE;
            this.setUiOptions.invalidate();
            MenuHostHelper$$ExternalSyntheticLambda1(i, 65536);
            return true;
        }
        return false;
    }

    private boolean setIconTintList(int i) {
        int i2;
        if ((this.setUiOptions.isFocused() || this.setUiOptions.requestFocus()) && (i2 = this.MenuHostHelper$$ExternalSyntheticLambda1) != i) {
            if (i2 != Integer.MIN_VALUE && i2 == i2) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = Integer.MIN_VALUE;
                setY(i2, false);
                MenuHostHelper$$ExternalSyntheticLambda1(i2, 8);
            }
            if (i == Integer.MIN_VALUE) {
                return false;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            setY(i, true);
            MenuHostHelper$$ExternalSyntheticLambda1(i, 8);
            return true;
        }
        return false;
    }

    private AccessibilityEvent setY(int i, int i2) {
        setDecorPadding y;
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            if (i == -1) {
                y = setIconTintList();
            } else {
                y = setY(i);
            }
            obtain.getText().add(y.setLayoutAnimation());
            obtain.setContentDescription(y.setNavigationOnClickListener());
            obtain.setScrollable(y.setMaxEms());
            obtain.setPassword(y.setZ());
            obtain.setEnabled(y.ViewPager$SavedState$1());
            obtain.setChecked(y.setIconSize());
            if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            obtain.setClassName(y.setX());
            readObject.setIconTintList.setY(obtain, this.setUiOptions, i);
            obtain.setPackageName(this.setUiOptions.getContext().getPackageName());
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        this.setUiOptions.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0147, code lost:
        if (r13 < (((r6 * 13) * r6) + (r18 * r18))) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean setIconTintList(int r21, android.graphics.Rect r22) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1.setIconTintList(int, android.graphics.Rect):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, Bundle bundle) {
        int i3;
        if (i != -1) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (this.MenuHostHelper$$ExternalSyntheticLambda1 != i) {
                        return false;
                    }
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = Integer.MIN_VALUE;
                    setY(i, false);
                    MenuHostHelper$$ExternalSyntheticLambda1(i, 8);
                    return true;
                } else if (i2 != 64) {
                    if (i2 == 128) {
                        return setX(i);
                    }
                    return setX(i, i2);
                } else if (this.setUnboundedRipple.isEnabled() && this.setUnboundedRipple.isTouchExplorationEnabled() && (i3 = this.MenuHostHelper$$ExternalSyntheticLambda0) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        setX(i3);
                    }
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                    this.setUiOptions.invalidate();
                    MenuHostHelper$$ExternalSyntheticLambda1(i, 32768);
                    return true;
                } else {
                    return false;
                }
            }
            return setIconTintList(i);
        }
        return setBaselineAlignBottom.setY(this.setUiOptions, i2, bundle);
    }
}