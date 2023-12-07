package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.setActiveIndicatorResizeable;
import o.setBaselineAlignBottom;
import o.setDecorPadding;
import o.setFabCradleRoundedCornerRadius;
import o.setOnHoverListener;
import o.setTextKeepState;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions implements WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ.setX {
    private StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 ExtendableSavedState$1;
    private int FragmentStateAdapter$2;
    private BitSet FragmentStateAdapter$5;
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private int[] SearchView$SavedState$1;
    private setOnHoverListener setConstraintSet;
    private int setIconified;
    private final setFabCradleRoundedCornerRadius setLayoutDirection;
    private boolean setNavigationOnClickListener;
    private int setSuffixText;
    private boolean setUiOptions;
    private setY[] setViewTranslationCallback;
    setOnHoverListener setY;
    boolean setX = false;
    private boolean FloatingActionButton$BaseBehavior = false;
    private int setChipIconTintResource = -1;
    private int setHasDecor = Integer.MIN_VALUE;
    private StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 setCheckedIconEnabled = new StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0();
    private int setUnboundedRipple = 2;
    private final Rect setFilterTouchesWhenObscured = new Rect();
    private final setX setIconTintList = new setX();
    private boolean setOnLongClickListener = false;
    private boolean setContentScrimResource = true;
    private final Runnable MenuHostHelper$$ExternalSyntheticLambda1 = new Runnable() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager.5
        @Override // java.lang.Runnable
        public final void run() {
            StaggeredGridLayoutManager.this.setOnLongClickListener();
        }
    };

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.setSuffixText = -1;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setIconTintList y = setY(context, attributeSet, i, i2);
        int i3 = y.setIconTintList;
        if (i3 != 0 && i3 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        if (this.ExtendableSavedState$1 == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1((String) null);
        }
        if (i3 != this.setIconified) {
            this.setIconified = i3;
            setOnHoverListener setonhoverlistener = this.setY;
            this.setY = this.setConstraintSet;
            this.setConstraintSet = setonhoverlistener;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
            }
        }
        int i4 = y.MenuHostHelper$$ExternalSyntheticLambda0;
        if (this.ExtendableSavedState$1 == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1((String) null);
        }
        if (i4 != this.setSuffixText) {
            StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 = this.setCheckedIconEnabled;
            int[] iArr = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.requestLayout();
            }
            this.setSuffixText = i4;
            this.FragmentStateAdapter$5 = new BitSet(this.setSuffixText);
            this.setViewTranslationCallback = new setY[this.setSuffixText];
            for (int i5 = 0; i5 < this.setSuffixText; i5++) {
                this.setViewTranslationCallback[i5] = new setY(i5);
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 != null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.requestLayout();
            }
        }
        setIconTintList(y.setY);
        this.setLayoutDirection = new setFabCradleRoundedCornerRadius();
        this.setY = setOnHoverListener.setX(this, this.setIconified);
        this.setConstraintSet = setOnHoverListener.setX(this, 1 - this.setIconified);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean setUiOptions() {
        return this.setUnboundedRipple != 0;
    }

    final boolean setOnLongClickListener() {
        int i;
        if (ViewPager$SavedState$1() != 0 && this.setUnboundedRipple != 0 && this.setTextAlignment) {
            if (this.FloatingActionButton$BaseBehavior) {
                int ViewPager$SavedState$1 = ViewPager$SavedState$1();
                if (ViewPager$SavedState$1 == 0) {
                    i = 0;
                } else {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) setOnLongClickListener(ViewPager$SavedState$1 - 1).getLayoutParams()).setUnboundedRipple;
                    i = setcheckediconenabled.setTextAlignment;
                    if (i == -1) {
                        i = setcheckediconenabled.setIconSize;
                    }
                }
                if (ViewPager$SavedState$1() != 0) {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) setOnLongClickListener(0).getLayoutParams()).setUnboundedRipple;
                    if (setcheckediconenabled2.setTextAlignment == -1) {
                        int i2 = setcheckediconenabled2.setIconSize;
                    }
                }
            } else {
                if (ViewPager$SavedState$1() != 0) {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled3 = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) setOnLongClickListener(0).getLayoutParams()).setUnboundedRipple;
                    i = setcheckediconenabled3.setTextAlignment;
                    if (i == -1) {
                        i = setcheckediconenabled3.setIconSize;
                    }
                } else {
                    i = 0;
                }
                int ViewPager$SavedState$12 = ViewPager$SavedState$1();
                if (ViewPager$SavedState$12 != 0) {
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled4 = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) setOnLongClickListener(ViewPager$SavedState$12 - 1).getLayoutParams()).setUnboundedRipple;
                    if (setcheckediconenabled4.setTextAlignment == -1) {
                        int i3 = setcheckediconenabled4.setIconSize;
                    }
                }
            }
            if (i == 0 && setUnboundedRipple() != null) {
                StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 = this.setCheckedIconEnabled;
                int[] iArr = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = null;
                this.setTextScaleX = true;
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
                if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                    windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
                }
                return true;
            }
        }
        return false;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setNavigationOnClickListener(int i) {
        if (i == 0) {
            setOnLongClickListener();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, setmaxems);
        Runnable runnable = this.MenuHostHelper$$ExternalSyntheticLambda1;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setMaxEms;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.removeCallbacks(runnable);
        }
        for (int i = 0; i < this.setSuffixText; i++) {
            setY sety = this.setViewTranslationCallback[i];
            sety.MenuHostHelper$$ExternalSyntheticLambda0.clear();
            sety.setX = Integer.MIN_VALUE;
            sety.MenuHostHelper$$ExternalSyntheticLambda1 = Integer.MIN_VALUE;
            sety.setY = 0;
        }
        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
        if (r10 == r11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
        if (r10 == r11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008d, code lost:
        r10 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View setUnboundedRipple() {
        /*
            r12 = this;
            int r0 = r12.ViewPager$SavedState$1()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.setSuffixText
            r2.<init>(r3)
            int r3 = r12.setSuffixText
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.setIconified
            r5 = -1
            if (r3 != r1) goto L27
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r3 = r12.setMaxEms
            int r3 = o.setBaselineAlignBottom.ViewPager$SavedState$1(r3)
            if (r3 == r1) goto L22
            r3 = 0
            goto L23
        L22:
            r3 = 1
        L23:
            if (r3 == 0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = -1
        L28:
            boolean r6 = r12.FloatingActionButton$BaseBehavior
            if (r6 == 0) goto L2e
            r6 = -1
            goto L32
        L2e:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L32:
            if (r0 >= r6) goto L35
            r5 = 1
        L35:
            if (r0 == r6) goto Lac
            android.view.View r7 = r12.setOnLongClickListener(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setIconTintList r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.setIconTintList) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setY r9 = r8.setY
            int r9 = r9.setIconTintList
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L5b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setY r9 = r8.setY
            boolean r9 = r12.setY(r9)
            if (r9 == 0) goto L54
            return r7
        L54:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setY r9 = r8.setY
            int r9 = r9.setIconTintList
            r2.clear(r9)
        L5b:
            boolean r9 = r8.MenuHostHelper$$ExternalSyntheticLambda1
            int r0 = r0 + r5
            if (r0 == r6) goto L35
            android.view.View r9 = r12.setOnLongClickListener(r0)
            boolean r10 = r12.FloatingActionButton$BaseBehavior
            if (r10 == 0) goto L7a
            o.setOnHoverListener r10 = r12.setY
            int r10 = r10.MenuHostHelper$$ExternalSyntheticLambda0(r7)
            o.setOnHoverListener r11 = r12.setY
            int r11 = r11.MenuHostHelper$$ExternalSyntheticLambda0(r9)
            if (r10 >= r11) goto L77
            return r7
        L77:
            if (r10 != r11) goto L8d
            goto L8b
        L7a:
            o.setOnHoverListener r10 = r12.setY
            int r10 = r10.setY(r7)
            o.setOnHoverListener r11 = r12.setY
            int r11 = r11.setY(r9)
            if (r10 <= r11) goto L89
            return r7
        L89:
            if (r10 != r11) goto L8d
        L8b:
            r10 = 1
            goto L8e
        L8d:
            r10 = 0
        L8e:
            if (r10 == 0) goto L35
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setIconTintList r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.setIconTintList) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setY r8 = r8.setY
            int r8 = r8.setIconTintList
            androidx.recyclerview.widget.StaggeredGridLayoutManager$setY r9 = r9.setY
            int r9 = r9.setIconTintList
            int r8 = r8 - r9
            if (r8 >= 0) goto La3
            r8 = 1
            goto La4
        La3:
            r8 = 0
        La4:
            if (r3 >= 0) goto La8
            r9 = 1
            goto La9
        La8:
            r9 = 0
        La9:
            if (r8 == r9) goto L35
            return r7
        Lac:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.setUnboundedRipple():android.view.View");
    }

    private boolean setY(setY sety) {
        if (this.FloatingActionButton$BaseBehavior) {
            int i = sety.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i == Integer.MIN_VALUE) {
                sety.setY();
                i = sety.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            if (i < this.setY.setIconTintList()) {
                boolean z = ((setIconTintList) sety.MenuHostHelper$$ExternalSyntheticLambda0.get(sety.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1).getLayoutParams()).MenuHostHelper$$ExternalSyntheticLambda1;
                return true;
            }
        } else {
            int i2 = sety.setX;
            if (i2 == Integer.MIN_VALUE) {
                sety.setIconTintList();
                i2 = sety.setX;
            }
            if (i2 > this.setY.setLayoutAnimation()) {
                boolean z2 = ((setIconTintList) sety.MenuHostHelper$$ExternalSyntheticLambda0.get(0).getLayoutParams()).MenuHostHelper$$ExternalSyntheticLambda1;
                return true;
            }
        }
        return false;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        if (this.ExtendableSavedState$1 == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1(str);
        }
    }

    private void setLayoutAnimation() {
        int x;
        if (this.setIconified != 1) {
            x = setBaselineAlignBottom.setX.setX(this.setMaxEms);
            if (x == 1) {
                this.FloatingActionButton$BaseBehavior = !this.setX;
                return;
            }
        }
        this.FloatingActionButton$BaseBehavior = this.setX;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(setminandmaxprogress);
        this.setChipIconTintResource = -1;
        this.setHasDecor = Integer.MIN_VALUE;
        this.ExtendableSavedState$1 = null;
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.ExtendableSavedState$1 == null;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setOnLongClickListener(setminandmaxprogress);
    }

    private int setOnLongClickListener(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (ViewPager$SavedState$1() == 0) {
            return 0;
        }
        return setTextKeepState.MenuHostHelper$$ExternalSyntheticLambda1(setminandmaxprogress, this.setY, MenuHostHelper$$ExternalSyntheticLambda0(!this.setContentScrimResource), setX(!this.setContentScrimResource), this, this.setContentScrimResource, this.FloatingActionButton$BaseBehavior);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setOnLongClickListener(setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setUiOptions(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setNavigationOnClickListener(setminandmaxprogress);
    }

    private int setNavigationOnClickListener(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (ViewPager$SavedState$1() == 0) {
            return 0;
        }
        return setTextKeepState.setY(setminandmaxprogress, this.setY, MenuHostHelper$$ExternalSyntheticLambda0(!this.setContentScrimResource), setX(!this.setContentScrimResource), this, this.setContentScrimResource);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setLayoutAnimation(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setNavigationOnClickListener(setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setUnboundedRipple(setminandmaxprogress);
    }

    private int setUnboundedRipple(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (ViewPager$SavedState$1() == 0) {
            return 0;
        }
        return setTextKeepState.MenuHostHelper$$ExternalSyntheticLambda1(setminandmaxprogress, this.setY, MenuHostHelper$$ExternalSyntheticLambda0(!this.setContentScrimResource), setX(!this.setContentScrimResource), this, this.setContentScrimResource);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setUnboundedRipple(setminandmaxprogress);
    }

    private void setIconTintList(View view, int i, int i2, boolean z) {
        Rect rect = this.setFilterTouchesWhenObscured;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setNavigationOnClickListener(view));
        }
        setIconTintList seticontintlist = (setIconTintList) view.getLayoutParams();
        int x = setX(i, ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin + this.setFilterTouchesWhenObscured.left, ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin + this.setFilterTouchesWhenObscured.right);
        int x2 = setX(i2, ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin + this.setFilterTouchesWhenObscured.top, ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin + this.setFilterTouchesWhenObscured.bottom);
        if (MenuHostHelper$$ExternalSyntheticLambda1(view, x, x2, seticontintlist)) {
            view.measure(x, x2);
        }
    }

    private static int setX(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Parcelable parcelable) {
        if (parcelable instanceof StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1) {
            this.ExtendableSavedState$1 = (StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1) parcelable;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Parcelable setNavigationOnClickListener() {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.setNavigationOnClickListener():android.os.Parcelable");
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, View view, setDecorPadding setdecorpadding) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof setIconTintList)) {
            super.setY(view, setdecorpadding);
            return;
        }
        setIconTintList seticontintlist = (setIconTintList) layoutParams;
        if (this.setIconified == 0) {
            setY sety = seticontintlist.setY;
            int i = sety == null ? -1 : sety.setIconTintList;
            boolean z = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
            setdecorpadding.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(i, 1, -1, -1, false, false));
            return;
        }
        setY sety2 = seticontintlist.setY;
        int i2 = sety2 == null ? -1 : sety2.setIconTintList;
        boolean z2 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
        setdecorpadding.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(-1, -1, i2, 1, false, false));
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(AccessibilityEvent accessibilityEvent) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(accessibilityEvent);
        if (ViewPager$SavedState$1() > 0) {
            View MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(false);
            View x = setX(false);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null || x == null) {
                return;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) MenuHostHelper$$ExternalSyntheticLambda0.getLayoutParams()).setUnboundedRipple;
            int i = setcheckediconenabled.setTextAlignment;
            if (i == -1) {
                i = setcheckediconenabled.setIconSize;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) x.getLayoutParams()).setUnboundedRipple;
            int i2 = setcheckediconenabled2.setTextAlignment;
            if (i2 == -1) {
                i2 = setcheckediconenabled2.setIconSize;
            }
            if (i < i2) {
                accessibilityEvent.setFromIndex(i);
                accessibilityEvent.setToIndex(i2);
                return;
            }
            accessibilityEvent.setFromIndex(i2);
            accessibilityEvent.setToIndex(i);
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (this.setIconified == 0) {
            return this.setSuffixText;
        }
        return super.setIconTintList(setmaxems, setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (this.setIconified == 1) {
            return this.setSuffixText;
        }
        return super.MenuHostHelper$$ExternalSyntheticLambda1(setmaxems, setminandmaxprogress);
    }

    private View MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        int layoutAnimation = this.setY.setLayoutAnimation();
        int iconTintList = this.setY.setIconTintList();
        int ViewPager$SavedState$1 = ViewPager$SavedState$1();
        View view = null;
        for (int i = 0; i < ViewPager$SavedState$1; i++) {
            View onLongClickListener = setOnLongClickListener(i);
            int y = this.setY.setY(onLongClickListener);
            if (this.setY.MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener) > layoutAnimation && y < iconTintList) {
                if (y >= layoutAnimation || !z) {
                    return onLongClickListener;
                }
                if (view == null) {
                    view = onLongClickListener;
                }
            }
        }
        return view;
    }

    private View setX(boolean z) {
        int layoutAnimation = this.setY.setLayoutAnimation();
        int iconTintList = this.setY.setIconTintList();
        View view = null;
        for (int ViewPager$SavedState$1 = ViewPager$SavedState$1() - 1; ViewPager$SavedState$1 >= 0; ViewPager$SavedState$1--) {
            View onLongClickListener = setOnLongClickListener(ViewPager$SavedState$1);
            int y = this.setY.setY(onLongClickListener);
            int MenuHostHelper$$ExternalSyntheticLambda0 = this.setY.MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener);
            if (MenuHostHelper$$ExternalSyntheticLambda0 > layoutAnimation && y < iconTintList) {
                if (MenuHostHelper$$ExternalSyntheticLambda0 <= iconTintList || !z) {
                    return onLongClickListener;
                }
                if (view == null) {
                    view = onLongClickListener;
                }
            }
        }
        return view;
    }

    private void setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, boolean z) {
        int iconTintList;
        int iconTintList2 = setIconTintList(Integer.MIN_VALUE);
        if (iconTintList2 != Integer.MIN_VALUE && (iconTintList = this.setY.setIconTintList() - iconTintList2) > 0) {
            int i = iconTintList - (-MenuHostHelper$$ExternalSyntheticLambda1(-iconTintList, setmaxems, setminandmaxprogress));
            if (!z || i <= 0) {
                return;
            }
            this.setY.setX(i);
        }
    }

    private void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, boolean z) {
        int layoutAnimation;
        int textAlignment = setTextAlignment(Integer.MAX_VALUE);
        if (textAlignment != Integer.MAX_VALUE && (layoutAnimation = textAlignment - this.setY.setLayoutAnimation()) > 0) {
            int MenuHostHelper$$ExternalSyntheticLambda1 = layoutAnimation - MenuHostHelper$$ExternalSyntheticLambda1(layoutAnimation, setmaxems, setminandmaxprogress);
            if (!z || MenuHostHelper$$ExternalSyntheticLambda1 <= 0) {
                return;
            }
            this.setY.setX(-MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setIconTintList(int r5, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress r6) {
        /*
            r4 = this;
            o.setFabCradleRoundedCornerRadius r0 = r4.setLayoutDirection
            r1 = 0
            r0.MenuHostHelper$$ExternalSyntheticLambda0 = r1
            o.setFabCradleRoundedCornerRadius r0 = r4.setLayoutDirection
            r0.setY = r5
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setZ r0 = r4.setAnimationFromJson
            r2 = 1
            if (r0 == 0) goto L14
            boolean r0 = r0.setUiOptions
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L35
            int r6 = r6.setIconSize
            r0 = -1
            if (r6 == r0) goto L35
            boolean r0 = r4.FloatingActionButton$BaseBehavior
            if (r6 >= r5) goto L22
            r5 = 1
            goto L23
        L22:
            r5 = 0
        L23:
            if (r0 != r5) goto L2c
            o.setOnHoverListener r5 = r4.setY
            int r5 = r5.setUnboundedRipple()
            goto L36
        L2c:
            o.setOnHoverListener r5 = r4.setY
            int r5 = r5.setUnboundedRipple()
            r6 = r5
            r5 = 0
            goto L37
        L35:
            r5 = 0
        L36:
            r6 = 0
        L37:
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r0 = r4.setMaxEms
            if (r0 == 0) goto L41
            boolean r0 = r0.setUnboundedRipple
            if (r0 == 0) goto L41
            r0 = 1
            goto L42
        L41:
            r0 = 0
        L42:
            if (r0 == 0) goto L5b
            o.setFabCradleRoundedCornerRadius r0 = r4.setLayoutDirection
            o.setOnHoverListener r3 = r4.setY
            int r3 = r3.setLayoutAnimation()
            int r3 = r3 - r6
            r0.setLayoutAnimation = r3
            o.setFabCradleRoundedCornerRadius r6 = r4.setLayoutDirection
            o.setOnHoverListener r0 = r4.setY
            int r0 = r0.setIconTintList()
            int r0 = r0 + r5
            r6.setIconTintList = r0
            goto L6b
        L5b:
            o.setFabCradleRoundedCornerRadius r0 = r4.setLayoutDirection
            o.setOnHoverListener r3 = r4.setY
            int r3 = r3.setY()
            int r3 = r3 + r5
            r0.setIconTintList = r3
            o.setFabCradleRoundedCornerRadius r5 = r4.setLayoutDirection
            int r6 = -r6
            r5.setLayoutAnimation = r6
        L6b:
            o.setFabCradleRoundedCornerRadius r5 = r4.setLayoutDirection
            r5.setUiOptions = r1
            o.setFabCradleRoundedCornerRadius r5 = r4.setLayoutDirection
            r5.setOnLongClickListener = r2
            o.setFabCradleRoundedCornerRadius r5 = r4.setLayoutDirection
            o.setOnHoverListener r6 = r4.setY
            int r6 = r6.MenuHostHelper$$ExternalSyntheticLambda0()
            if (r6 != 0) goto L86
            o.setOnHoverListener r6 = r4.setY
            int r6 = r6.setY()
            if (r6 != 0) goto L86
            r1 = 1
        L86:
            r5.MenuHostHelper$$ExternalSyntheticLambda1 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.setIconTintList(int, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress):void");
    }

    private void setCenterIfNoTextEnabled(int i) {
        this.setLayoutDirection.setUnboundedRipple = i;
        this.setLayoutDirection.setX = this.FloatingActionButton$BaseBehavior != (i == -1) ? -1 : 1;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setLayoutAnimation(int i) {
        super.setLayoutAnimation(i);
        for (int i2 = 0; i2 < this.setSuffixText; i2++) {
            this.setViewTranslationCallback[i2].setY(i);
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setUnboundedRipple(int i) {
        super.setUnboundedRipple(i);
        for (int i2 = 0; i2 < this.setSuffixText; i2++) {
            this.setViewTranslationCallback[i2].setY(i);
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setX(int i, int i2) {
        setY(i, i2, 2);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        setY(i, i2, 1);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setX() {
        StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 = this.setCheckedIconEnabled;
        int[] iArr = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setY(int i, int i2) {
        setY(i, i2, 8);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        setY(i, i2, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setY(int r9, int r10, int r11) {
        /*
            r8 = this;
            boolean r0 = r8.FloatingActionButton$BaseBehavior
            r1 = -1
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L22
            int r0 = r8.ViewPager$SavedState$1()
            if (r0 != 0) goto Le
            goto L3c
        Le:
            int r0 = r0 - r3
            android.view.View r0 = r8.setOnLongClickListener(r0)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setLayoutAnimation r0 = (o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) r0
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r0 = r0.setUnboundedRipple
            int r4 = r0.setTextAlignment
            if (r4 != r1) goto L3d
            int r4 = r0.setIconSize
            goto L3d
        L22:
            int r0 = r8.ViewPager$SavedState$1()
            if (r0 == 0) goto L3c
            android.view.View r0 = r8.setOnLongClickListener(r2)
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setLayoutAnimation r0 = (o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) r0
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r0 = r0.setUnboundedRipple
            int r4 = r0.setTextAlignment
            if (r4 != r1) goto L3d
            int r0 = r0.setIconSize
            r4 = r0
            goto L3d
        L3c:
            r4 = 0
        L3d:
            r0 = 8
            if (r11 != r0) goto L4a
            if (r9 >= r10) goto L46
            int r5 = r10 + 1
            goto L4c
        L46:
            int r5 = r9 + 1
            r6 = r10
            goto L4d
        L4a:
            int r5 = r9 + r10
        L4c:
            r6 = r9
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 r7 = r8.setCheckedIconEnabled
            r7.MenuHostHelper$$ExternalSyntheticLambda0(r6)
            if (r11 == r3) goto L6a
            r7 = 2
            if (r11 == r7) goto L64
            if (r11 != r0) goto L6f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 r11 = r8.setCheckedIconEnabled
            r11.MenuHostHelper$$ExternalSyntheticLambda1(r9, r3)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 r9 = r8.setCheckedIconEnabled
            r9.MenuHostHelper$$ExternalSyntheticLambda0(r10, r3)
            goto L6f
        L64:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 r11 = r8.setCheckedIconEnabled
            r11.MenuHostHelper$$ExternalSyntheticLambda1(r9, r10)
            goto L6f
        L6a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 r11 = r8.setCheckedIconEnabled
            r11.MenuHostHelper$$ExternalSyntheticLambda0(r9, r10)
        L6f:
            if (r5 > r4) goto L72
            return
        L72:
            boolean r9 = r8.FloatingActionButton$BaseBehavior
            if (r9 == 0) goto L92
            int r9 = r8.ViewPager$SavedState$1()
            if (r9 == 0) goto Lad
            android.view.View r9 = r8.setOnLongClickListener(r2)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setLayoutAnimation r9 = (o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) r9
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r9 = r9.setUnboundedRipple
            int r10 = r9.setTextAlignment
            if (r10 != r1) goto L90
            int r9 = r9.setIconSize
        L8e:
            r2 = r9
            goto Lad
        L90:
            r2 = r10
            goto Lad
        L92:
            int r9 = r8.ViewPager$SavedState$1()
            if (r9 != 0) goto L99
            goto Lad
        L99:
            int r9 = r9 - r3
            android.view.View r9 = r8.setOnLongClickListener(r9)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setLayoutAnimation r9 = (o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) r9
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r9 = r9.setUnboundedRipple
            int r10 = r9.setTextAlignment
            if (r10 != r1) goto L90
            int r9 = r9.setIconSize
            goto L8e
        Lad:
            if (r6 > r2) goto Lb6
            o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 r9 = r8.setMaxEms
            if (r9 == 0) goto Lb6
            r9.requestLayout()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.setY(int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01dd, code lost:
        if (((r12.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 & 2) != 0) != false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0228, code lost:
        if (((r11.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 & 2) != 0) != false) goto L134;
     */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms r19, o.setFabCradleRoundedCornerRadius r20, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress r21) {
        /*
            Method dump skipped, instructions count: 753
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms, o.setFabCradleRoundedCornerRadius, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress):int");
    }

    private void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, setFabCradleRoundedCornerRadius setfabcradleroundedcornerradius) {
        int min;
        int min2;
        if (!setfabcradleroundedcornerradius.setOnLongClickListener || setfabcradleroundedcornerradius.MenuHostHelper$$ExternalSyntheticLambda1) {
            return;
        }
        if (setfabcradleroundedcornerradius.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            if (setfabcradleroundedcornerradius.setUnboundedRipple == -1) {
                MenuHostHelper$$ExternalSyntheticLambda1(setmaxems, setfabcradleroundedcornerradius.setIconTintList);
            } else {
                setIconTintList(setmaxems, setfabcradleroundedcornerradius.setLayoutAnimation);
            }
        } else if (setfabcradleroundedcornerradius.setUnboundedRipple == -1) {
            int uiOptions = setfabcradleroundedcornerradius.setLayoutAnimation - setUiOptions(setfabcradleroundedcornerradius.setLayoutAnimation);
            if (uiOptions < 0) {
                min2 = setfabcradleroundedcornerradius.setIconTintList;
            } else {
                min2 = setfabcradleroundedcornerradius.setIconTintList - Math.min(uiOptions, setfabcradleroundedcornerradius.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            MenuHostHelper$$ExternalSyntheticLambda1(setmaxems, min2);
        } else {
            int ViewPager$SavedState$1 = ViewPager$SavedState$1(setfabcradleroundedcornerradius.setIconTintList) - setfabcradleroundedcornerradius.setIconTintList;
            if (ViewPager$SavedState$1 < 0) {
                min = setfabcradleroundedcornerradius.setLayoutAnimation;
            } else {
                min = Math.min(ViewPager$SavedState$1, setfabcradleroundedcornerradius.MenuHostHelper$$ExternalSyntheticLambda0) + setfabcradleroundedcornerradius.setLayoutAnimation;
            }
            setIconTintList(setmaxems, min);
        }
    }

    private int setUiOptions(int i) {
        int iconTintList = this.setViewTranslationCallback[0].setIconTintList(i);
        for (int i2 = 1; i2 < this.setSuffixText; i2++) {
            int iconTintList2 = this.setViewTranslationCallback[i2].setIconTintList(i);
            if (iconTintList2 > iconTintList) {
                iconTintList = iconTintList2;
            }
        }
        return iconTintList;
    }

    private int setTextAlignment(int i) {
        int iconTintList = this.setViewTranslationCallback[0].setIconTintList(i);
        for (int i2 = 1; i2 < this.setSuffixText; i2++) {
            int iconTintList2 = this.setViewTranslationCallback[i2].setIconTintList(i);
            if (iconTintList2 < iconTintList) {
                iconTintList = iconTintList2;
            }
        }
        return iconTintList;
    }

    private int setIconTintList(int i) {
        int x = this.setViewTranslationCallback[0].setX(i);
        for (int i2 = 1; i2 < this.setSuffixText; i2++) {
            int x2 = this.setViewTranslationCallback[i2].setX(i);
            if (x2 > x) {
                x = x2;
            }
        }
        return x;
    }

    private int ViewPager$SavedState$1(int i) {
        int x = this.setViewTranslationCallback[0].setX(i);
        for (int i2 = 1; i2 < this.setSuffixText; i2++) {
            int x2 = this.setViewTranslationCallback[i2].setX(i);
            if (x2 < x) {
                x = x2;
            }
        }
        return x;
    }

    private void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, int i) {
        while (ViewPager$SavedState$1() > 0) {
            View onLongClickListener = setOnLongClickListener(0);
            if (this.setY.MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener) > i || this.setY.setX(onLongClickListener) > i) {
                return;
            }
            setIconTintList seticontintlist = (setIconTintList) onLongClickListener.getLayoutParams();
            boolean z = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
            if (seticontintlist.setY.MenuHostHelper$$ExternalSyntheticLambda0.size() == 1) {
                return;
            }
            seticontintlist.setY.setNavigationOnClickListener();
            this.setLayoutAnimation.setX(onLongClickListener);
            setmaxems.setY(onLongClickListener);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, int i) {
        for (int ViewPager$SavedState$1 = ViewPager$SavedState$1() - 1; ViewPager$SavedState$1 >= 0; ViewPager$SavedState$1--) {
            View onLongClickListener = setOnLongClickListener(ViewPager$SavedState$1);
            if (this.setY.setY(onLongClickListener) < i || this.setY.setLayoutAnimation(onLongClickListener) < i) {
                return;
            }
            setIconTintList seticontintlist = (setIconTintList) onLongClickListener.getLayoutParams();
            boolean z = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
            if (seticontintlist.setY.MenuHostHelper$$ExternalSyntheticLambda0.size() == 1) {
                return;
            }
            seticontintlist.setY.MenuHostHelper$$ExternalSyntheticLambda0();
            this.setLayoutAnimation.setX(onLongClickListener);
            setmaxems.setY(onLongClickListener);
        }
    }

    private boolean setIconSize(int i) {
        int x;
        if (this.setIconified == 0) {
            return (i == -1) != this.FloatingActionButton$BaseBehavior;
        }
        boolean z = (i == -1) == this.FloatingActionButton$BaseBehavior;
        x = setBaselineAlignBottom.setX.setX(this.setMaxEms);
        return z == (x == 1);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean setIconTintList() {
        return this.setIconified == 1;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconified == 0;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setX(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return MenuHostHelper$$ExternalSyntheticLambda1(i, setmaxems, setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setY(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return MenuHostHelper$$ExternalSyntheticLambda1(i, setmaxems, setminandmaxprogress);
    }

    private int MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int i2;
        if (ViewPager$SavedState$1() == 0) {
            return this.FloatingActionButton$BaseBehavior ? 1 : -1;
        }
        if (ViewPager$SavedState$1() != 0) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) setOnLongClickListener(0).getLayoutParams()).setUnboundedRipple;
            i2 = setcheckediconenabled.setTextAlignment;
            if (i2 == -1) {
                i2 = setcheckediconenabled.setIconSize;
            }
        } else {
            i2 = 0;
        }
        return (i < i2) == this.FloatingActionButton$BaseBehavior ? 1 : -1;
    }

    @Override // o.WindowInsetsCompat$Impl28$.ExternalSyntheticApiModelOutline0.setZ.setX
    public final PointF setY(int i) {
        int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(i);
        PointF pointF = new PointF();
        if (MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            return null;
        }
        if (this.setIconified == 0) {
            pointF.x = MenuHostHelper$$ExternalSyntheticLambda0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return pointF;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i) {
        setActiveIndicatorResizeable setactiveindicatorresizeable = new setActiveIndicatorResizeable(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getContext());
        setactiveindicatorresizeable.setLayoutAnimation = i;
        MenuHostHelper$$ExternalSyntheticLambda0(setactiveindicatorresizeable);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setX(int i) {
        StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 = this.ExtendableSavedState$1;
        if (staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 != null && staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList != i) {
            StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda12 = this.ExtendableSavedState$1;
            staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda12.setLayoutAnimation = null;
            staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda12.setNavigationOnClickListener = 0;
            staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda12.setIconTintList = -1;
            staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda12.setUiOptions = -1;
        }
        this.setChipIconTintResource = i;
        this.setHasDecor = Integer.MIN_VALUE;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setIconTintList(int i, int i2, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setX setx) {
        int x;
        int i3;
        if (this.setIconified != 0) {
            i = i2;
        }
        if (ViewPager$SavedState$1() == 0 || i == 0) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda1(i, setminandmaxprogress);
        int[] iArr = this.SearchView$SavedState$1;
        if (iArr == null || iArr.length < this.setSuffixText) {
            this.SearchView$SavedState$1 = new int[this.setSuffixText];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.setSuffixText; i5++) {
            if (this.setLayoutDirection.setX == -1) {
                x = this.setLayoutDirection.setLayoutAnimation;
                i3 = this.setViewTranslationCallback[i5].setIconTintList(this.setLayoutDirection.setLayoutAnimation);
            } else {
                x = this.setViewTranslationCallback[i5].setX(this.setLayoutDirection.setIconTintList);
                i3 = this.setLayoutDirection.setIconTintList;
            }
            int i6 = x - i3;
            if (i6 >= 0) {
                this.SearchView$SavedState$1[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.SearchView$SavedState$1, 0, i4);
        for (int i7 = 0; i7 < i4 && this.setLayoutDirection.setX(setminandmaxprogress); i7++) {
            setx.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutDirection.setY, this.SearchView$SavedState$1[i7]);
            this.setLayoutDirection.setY += this.setLayoutDirection.setX;
        }
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (ViewPager$SavedState$1() == 0 || i == 0) {
            return 0;
        }
        MenuHostHelper$$ExternalSyntheticLambda1(i, setminandmaxprogress);
        int MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, this.setLayoutDirection, setminandmaxprogress);
        if (this.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0 >= MenuHostHelper$$ExternalSyntheticLambda0) {
            i = i < 0 ? -MenuHostHelper$$ExternalSyntheticLambda0 : MenuHostHelper$$ExternalSyntheticLambda0;
        }
        this.setY.setX(-i);
        this.setUiOptions = this.FloatingActionButton$BaseBehavior;
        this.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        setIconTintList(setmaxems, this.setLayoutDirection);
        return i;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setY() {
        if (this.setIconified == 0) {
            return new setIconTintList(-2, -1);
        }
        return new setIconTintList(-1, -2);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setIconTintList(Context context, AttributeSet attributeSet) {
        return new setIconTintList(context, attributeSet);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setX(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new setIconTintList((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new setIconTintList(layoutParams);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation) {
        return setlayoutanimation instanceof setIconTintList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003b, code lost:
        if (r9.setIconified != 1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
        if (r9.setIconified != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0054, code lost:
        if ((r11 == 1) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0066, code lost:
        if ((r11 == 1) != false) goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0133 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0164 A[LOOP:2: B:116:0x0164->B:125:0x0184, LOOP_START, PHI: r3 
      PHI: (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:103:0x013a, B:125:0x0184] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0129  */
    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View setY(android.view.View r10, int r11, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms r12, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress r13) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.setY(android.view.View, int, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress):android.view.View");
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation {
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        setY setY;

        public setIconTintList(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public setIconTintList(int i, int i2) {
            super(i, i2);
        }

        public setIconTintList(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public setIconTintList(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setY {
        final int setIconTintList;
        ArrayList<View> MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
        int setX = Integer.MIN_VALUE;
        int MenuHostHelper$$ExternalSyntheticLambda1 = Integer.MIN_VALUE;
        int setY = 0;

        setY(int i) {
            this.setIconTintList = i;
        }

        final int setIconTintList(int i) {
            int i2 = this.setX;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.size() == 0) {
                return i;
            }
            setIconTintList();
            return this.setX;
        }

        final void setIconTintList() {
            View view = this.MenuHostHelper$$ExternalSyntheticLambda0.get(0);
            this.setX = StaggeredGridLayoutManager.this.setY.setY(view);
            boolean z = ((setIconTintList) view.getLayoutParams()).MenuHostHelper$$ExternalSyntheticLambda1;
        }

        final int setX(int i) {
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.size() == 0) {
                return i;
            }
            setY();
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        final void setY() {
            ArrayList<View> arrayList = this.MenuHostHelper$$ExternalSyntheticLambda0;
            View view = arrayList.get(arrayList.size() - 1);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = StaggeredGridLayoutManager.this.setY.MenuHostHelper$$ExternalSyntheticLambda0(view);
            boolean z = ((setIconTintList) view.getLayoutParams()).MenuHostHelper$$ExternalSyntheticLambda1;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
            if (((r2.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 & 2) != 0) != false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final void MenuHostHelper$$ExternalSyntheticLambda0() {
            /*
                r6 = this;
                java.util.ArrayList<android.view.View> r0 = r6.MenuHostHelper$$ExternalSyntheticLambda0
                int r0 = r0.size()
                java.util.ArrayList<android.view.View> r1 = r6.MenuHostHelper$$ExternalSyntheticLambda0
                int r2 = r0 + (-1)
                java.lang.Object r1 = r1.remove(r2)
                android.view.View r1 = (android.view.View) r1
                android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$setIconTintList r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.setIconTintList) r2
                r3 = 0
                r2.setY = r3
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r3 = r2.setUnboundedRipple
                int r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1
                r3 = r3 & 8
                r4 = 0
                r5 = 1
                if (r3 == 0) goto L25
                r3 = 1
                goto L26
            L25:
                r3 = 0
            L26:
                if (r3 != 0) goto L33
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r2 = r2.setUnboundedRipple
                int r2 = r2.MenuHostHelper$$ExternalSyntheticLambda1
                r2 = r2 & 2
                if (r2 == 0) goto L31
                r4 = 1
            L31:
                if (r4 == 0) goto L40
            L33:
                int r2 = r6.setY
                androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                o.setOnHoverListener r3 = r3.setY
                int r1 = r3.MenuHostHelper$$ExternalSyntheticLambda1(r1)
                int r2 = r2 - r1
                r6.setY = r2
            L40:
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r5) goto L46
                r6.setX = r1
            L46:
                r6.MenuHostHelper$$ExternalSyntheticLambda1 = r1
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.setY.MenuHostHelper$$ExternalSyntheticLambda0():void");
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
            if (((r2.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 & 2) != 0) != false) goto L15;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final void setNavigationOnClickListener() {
            /*
                r6 = this;
                java.util.ArrayList<android.view.View> r0 = r6.MenuHostHelper$$ExternalSyntheticLambda0
                r1 = 0
                java.lang.Object r0 = r0.remove(r1)
                android.view.View r0 = (android.view.View) r0
                android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
                androidx.recyclerview.widget.StaggeredGridLayoutManager$setIconTintList r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.setIconTintList) r2
                r3 = 0
                r2.setY = r3
                java.util.ArrayList<android.view.View> r3 = r6.MenuHostHelper$$ExternalSyntheticLambda0
                int r3 = r3.size()
                r4 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r3 != 0) goto L1e
                r6.MenuHostHelper$$ExternalSyntheticLambda1 = r4
            L1e:
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r3 = r2.setUnboundedRipple
                int r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1
                r3 = r3 & 8
                r5 = 1
                if (r3 == 0) goto L29
                r3 = 1
                goto L2a
            L29:
                r3 = 0
            L2a:
                if (r3 != 0) goto L37
                o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled r2 = r2.setUnboundedRipple
                int r2 = r2.MenuHostHelper$$ExternalSyntheticLambda1
                r2 = r2 & 2
                if (r2 == 0) goto L35
                r1 = 1
            L35:
                if (r1 == 0) goto L44
            L37:
                int r1 = r6.setY
                androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
                o.setOnHoverListener r2 = r2.setY
                int r0 = r2.MenuHostHelper$$ExternalSyntheticLambda1(r0)
                int r1 = r1 - r0
                r6.setY = r1
            L44:
                r6.setX = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.setY.setNavigationOnClickListener():void");
        }

        final void setY(int i) {
            int i2 = this.setX;
            if (i2 != Integer.MIN_VALUE) {
                this.setX = i2 + i;
            }
            int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i3 != Integer.MIN_VALUE) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = i3 + i;
            }
        }

        public final int MenuHostHelper$$ExternalSyntheticLambda1() {
            if (StaggeredGridLayoutManager.this.setX) {
                return setX(this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1, -1, true);
            }
            return setX(0, this.MenuHostHelper$$ExternalSyntheticLambda0.size(), true);
        }

        public final int setX() {
            if (StaggeredGridLayoutManager.this.setX) {
                return setX(0, this.MenuHostHelper$$ExternalSyntheticLambda0.size(), true);
            }
            return setX(this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1, -1, true);
        }

        private int setX(int i, int i2, boolean z) {
            int layoutAnimation = StaggeredGridLayoutManager.this.setY.setLayoutAnimation();
            int iconTintList = StaggeredGridLayoutManager.this.setY.setIconTintList();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.MenuHostHelper$$ExternalSyntheticLambda0.get(i);
                int y = StaggeredGridLayoutManager.this.setY.setY(view);
                int MenuHostHelper$$ExternalSyntheticLambda0 = StaggeredGridLayoutManager.this.setY.MenuHostHelper$$ExternalSyntheticLambda0(view);
                boolean z2 = y <= iconTintList;
                boolean z3 = MenuHostHelper$$ExternalSyntheticLambda0 >= layoutAnimation;
                if (z2 && z3 && (y < layoutAnimation || MenuHostHelper$$ExternalSyntheticLambda0 > iconTintList)) {
                    return StaggeredGridLayoutManager.setOnLongClickListener(view);
                }
                i += i3;
            }
            return -1;
        }

        public final View MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
            View view = null;
            if (i2 == -1) {
                int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
                int i3 = 0;
                while (i3 < size) {
                    View view2 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(i3);
                    if ((StaggeredGridLayoutManager.this.setX && StaggeredGridLayoutManager.setOnLongClickListener(view2) <= i) || ((!StaggeredGridLayoutManager.this.setX && StaggeredGridLayoutManager.setOnLongClickListener(view2) >= i) || !view2.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view2;
                }
            } else {
                int size2 = this.MenuHostHelper$$ExternalSyntheticLambda0.size() - 1;
                while (size2 >= 0) {
                    View view3 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(size2);
                    if ((StaggeredGridLayoutManager.this.setX && StaggeredGridLayoutManager.setOnLongClickListener(view3) >= i) || ((!StaggeredGridLayoutManager.this.setX && StaggeredGridLayoutManager.setOnLongClickListener(view3) <= i) || !view3.hasFocusable())) {
                        break;
                    }
                    size2--;
                    view = view3;
                }
            }
            return view;
        }
    }

    /* loaded from: classes.dex */
    class setX {
        boolean MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        boolean setIconTintList;
        boolean setLayoutAnimation;
        int setX;
        int[] setY;

        setX() {
            MenuHostHelper$$ExternalSyntheticLambda1();
        }

        final void MenuHostHelper$$ExternalSyntheticLambda1() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
            this.setX = Integer.MIN_VALUE;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            this.setIconTintList = false;
            this.setLayoutAnimation = false;
            int[] iArr = this.setY;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    private void setY(setY sety, int i, int i2) {
        int i3 = sety.setY;
        if (i == -1) {
            int i4 = sety.setX;
            if (i4 == Integer.MIN_VALUE) {
                sety.setIconTintList();
                i4 = sety.setX;
            }
            if (i4 + i3 <= i2) {
                this.FragmentStateAdapter$5.set(sety.setIconTintList, false);
                return;
            }
            return;
        }
        int i5 = sety.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i5 == Integer.MIN_VALUE) {
            sety.setY();
            i5 = sety.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        if (i5 - i3 >= i2) {
            this.FragmentStateAdapter$5.set(sety.setIconTintList, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x029d, code lost:
        if ((r8 == 1) != r13.setNavigationOnClickListener) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04f8 A[LOOP:0: B:3:0x0003->B:285:0x04f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0500 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017d  */
    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms r14, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress r15) {
        /*
            Method dump skipped, instructions count: 1281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress):void");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        int i2 = -1;
        int i3 = 0;
        if (i > 0) {
            int ViewPager$SavedState$1 = ViewPager$SavedState$1();
            if (ViewPager$SavedState$1 != 0) {
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) setOnLongClickListener(ViewPager$SavedState$1 - 1).getLayoutParams()).setUnboundedRipple;
                int i4 = setcheckediconenabled.setTextAlignment;
                i3 = i4 == -1 ? setcheckediconenabled.setIconSize : i4;
            }
            i2 = 1;
        } else if (ViewPager$SavedState$1() != 0) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) setOnLongClickListener(0).getLayoutParams()).setUnboundedRipple;
            int i5 = setcheckediconenabled2.setTextAlignment;
            i3 = i5 == -1 ? setcheckediconenabled2.setIconSize : i5;
        }
        this.setLayoutDirection.setOnLongClickListener = true;
        setIconTintList(i3, setminandmaxprogress);
        setCenterIfNoTextEnabled(i2);
        setFabCradleRoundedCornerRadius setfabcradleroundedcornerradius = this.setLayoutDirection;
        setfabcradleroundedcornerradius.setY = i3 + setfabcradleroundedcornerradius.setX;
        this.setLayoutDirection.MenuHostHelper$$ExternalSyntheticLambda0 = Math.abs(i);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Rect rect, int i, int i2) {
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int MenuHostHelper$$ExternalSyntheticLambda12;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
        int paddingLeft = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingLeft() : 0;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setMaxEms;
        int paddingRight = paddingLeft + (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getPaddingRight() : 0);
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setMaxEms;
        int paddingTop = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.getPaddingTop() : 0;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = this.setMaxEms;
        int paddingBottom = paddingTop + (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.getPaddingBottom() : 0);
        if (this.setIconified == 1) {
            MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(i2, rect.height() + paddingBottom, setBaselineAlignBottom.setIconSize(this.setMaxEms));
            MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i, (this.FragmentStateAdapter$2 * this.setSuffixText) + paddingRight, setBaselineAlignBottom.setTextScaleX(this.setMaxEms));
        } else {
            MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i, rect.width() + paddingRight, setBaselineAlignBottom.setTextScaleX(this.setMaxEms));
            MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(i2, (this.FragmentStateAdapter$2 * this.setSuffixText) + paddingBottom, setBaselineAlignBottom.setIconSize(this.setMaxEms));
        }
        this.setMaxEms.setMeasuredDimension(MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda12);
    }

    private void setIconTintList(boolean z) {
        if (this.ExtendableSavedState$1 == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1((String) null);
        }
        StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 = this.ExtendableSavedState$1;
        if (staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 != null && staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setY != z) {
            this.ExtendableSavedState$1.setY = z;
        }
        this.setX = z;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
        }
    }
}