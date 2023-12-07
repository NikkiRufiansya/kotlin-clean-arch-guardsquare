package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.setBaselineAlignBottom;
import o.setBoxBackgroundColorStateList;
import o.setDecorPadding;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    private boolean ExtendableSavedState$1;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    private View[] SearchView$SavedState$1;
    private int[] setCheckedIconEnabled;
    private setY setChipIconTintResource;
    final SparseIntArray setIconTintList;
    private boolean setLayoutDirection;
    final Rect setX;
    final SparseIntArray setY;

    /* loaded from: classes.dex */
    public static abstract class setY {
        final SparseIntArray setIconTintList = new SparseIntArray();
        final SparseIntArray MenuHostHelper$$ExternalSyntheticLambda0 = new SparseIntArray();
        boolean setY = false;
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;

        public abstract int MenuHostHelper$$ExternalSyntheticLambda0();

        public int setX(int i, int i2) {
            if (1 == i2) {
                return 0;
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i; i4++) {
                i3++;
                if (i3 == i2) {
                    i3 = 0;
                } else if (i3 > i2) {
                    i3 = 1;
                }
            }
            if (i3 + 1 <= i2) {
                return i3;
            }
            return 0;
        }

        public final int setY(int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                i4++;
                if (i4 == i2) {
                    i3++;
                    i4 = 0;
                } else if (i4 > i2) {
                    i3++;
                    i4 = 1;
                }
            }
            return i4 + 1 > i2 ? i3 + 1 : i3;
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.setLayoutDirection = false;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setY = new SparseIntArray();
        this.setIconTintList = new SparseIntArray();
        this.setChipIconTintResource = new setY() { // from class: androidx.recyclerview.widget.GridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // androidx.recyclerview.widget.GridLayoutManager.setY
            public final int MenuHostHelper$$ExternalSyntheticLambda0() {
                return 1;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.setY
            public final int setX(int i3, int i4) {
                return i3 % i4;
            }
        };
        this.setX = new Rect();
        setChipCornerRadius(setY(context, attributeSet, i, i2).MenuHostHelper$$ExternalSyntheticLambda0);
    }

    public GridLayoutManager(int i) {
        super(1, false);
        this.setLayoutDirection = false;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
        this.setY = new SparseIntArray();
        this.setIconTintList = new SparseIntArray();
        this.setChipIconTintResource = new setY() { // from class: androidx.recyclerview.widget.GridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // androidx.recyclerview.widget.GridLayoutManager.setY
            public final int MenuHostHelper$$ExternalSyntheticLambda0() {
                return 1;
            }

            @Override // androidx.recyclerview.widget.GridLayoutManager.setY
            public final int setX(int i3, int i4) {
                return i3 % i4;
            }
        };
        this.setX = new Rect();
        setChipCornerRadius(3);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void setY(boolean z) {
        if (z) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.setY(false);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (this.setNavigationOnClickListener == 0) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        if ((setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation) <= 0) {
            return 0;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(setmaxems, setminandmaxprogress, (setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation) - 1) + 1;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (this.setNavigationOnClickListener == 1) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        if ((setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation) <= 0) {
            return 0;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(setmaxems, setminandmaxprogress, (setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation) - 1) + 1;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, View view, setDecorPadding setdecorpadding) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof setX)) {
            super.setY(view, setdecorpadding);
            return;
        }
        setX setx = (setX) layoutParams;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = setx.setUnboundedRipple;
        int i = setcheckediconenabled.setTextAlignment;
        if (i == -1) {
            i = setcheckediconenabled.setIconSize;
        }
        int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setmaxems, setminandmaxprogress, i);
        if (this.setNavigationOnClickListener == 0) {
            setdecorpadding.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(setx.setY, setx.MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda1, 1, false, false));
        } else {
            setdecorpadding.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1, 1, setx.setY, setx.MenuHostHelper$$ExternalSyntheticLambda1, false, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(setminandmaxprogress);
        this.setLayoutDirection = false;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        this.setChipIconTintResource.setIconTintList.clear();
        this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.clear();
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setX() {
        this.setChipIconTintResource.setIconTintList.clear();
        this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.clear();
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setX(int i, int i2) {
        this.setChipIconTintResource.setIconTintList.clear();
        this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.clear();
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        this.setChipIconTintResource.setIconTintList.clear();
        this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.clear();
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setY(int i, int i2) {
        this.setChipIconTintResource.setIconTintList.clear();
        this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setY() {
        if (this.setNavigationOnClickListener == 0) {
            return new setX(-2, -1);
        }
        return new setX(-1, -2);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setIconTintList(Context context, AttributeSet attributeSet) {
        return new setX(context, attributeSet);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setX(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new setX((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new setX(layoutParams);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation) {
        return setlayoutanimation instanceof setX;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Rect rect, int i, int i2) {
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int MenuHostHelper$$ExternalSyntheticLambda12;
        if (this.setCheckedIconEnabled == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1(rect, i, i2);
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
        int paddingLeft = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingLeft() : 0;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setMaxEms;
        int paddingRight = paddingLeft + (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getPaddingRight() : 0);
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setMaxEms;
        int paddingTop = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.getPaddingTop() : 0;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = this.setMaxEms;
        int paddingBottom = paddingTop + (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.getPaddingBottom() : 0);
        if (this.setNavigationOnClickListener == 1) {
            MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(i2, rect.height() + paddingBottom, setBaselineAlignBottom.setIconSize(this.setMaxEms));
            int[] iArr = this.setCheckedIconEnabled;
            MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i, iArr[iArr.length - 1] + paddingRight, setBaselineAlignBottom.setTextScaleX(this.setMaxEms));
        } else {
            MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i, rect.width() + paddingRight, setBaselineAlignBottom.setTextScaleX(this.setMaxEms));
            int[] iArr2 = this.setCheckedIconEnabled;
            MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(i2, iArr2[iArr2.length - 1] + paddingBottom, setBaselineAlignBottom.setIconSize(this.setMaxEms));
        }
        this.setMaxEms.setMeasuredDimension(MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda12);
    }

    private void setUiOptions(int i) {
        int i2;
        int[] iArr = this.setCheckedIconEnabled;
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.setCheckedIconEnabled = iArr;
    }

    private int setLayoutAnimation(int i, int i2) {
        int x;
        if (this.setNavigationOnClickListener == 1) {
            x = setBaselineAlignBottom.setX.setX(this.setMaxEms);
            if (x == 1) {
                int[] iArr = this.setCheckedIconEnabled;
                int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1 - i;
                return iArr[i3] - iArr[i3 - i2];
            }
        }
        int[] iArr2 = this.setCheckedIconEnabled;
        return iArr2[i2 + i] - iArr2[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0, int i) {
        int i2;
        int x;
        super.MenuHostHelper$$ExternalSyntheticLambda1(setmaxems, setminandmaxprogress, linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0, i);
        setMaxEms();
        if ((setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation) > 0 && !setminandmaxprogress.setIconTintList) {
            boolean z = i == 1;
            int x2 = setX(setmaxems, setminandmaxprogress, linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0);
            if (z) {
                while (x2 > 0 && linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                    linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0--;
                    x2 = setX(setmaxems, setminandmaxprogress, linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0);
                }
            } else {
                int i3 = setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation;
                int i4 = linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                while (i4 < i3 - 1 && (x = setX(setmaxems, setminandmaxprogress, (i2 = i4 + 1))) > x2) {
                    i4 = i2;
                    x2 = x;
                }
                linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = i4;
            }
        }
        View[] viewArr = this.SearchView$SavedState$1;
        if (viewArr == null || viewArr.length != this.MenuHostHelper$$ExternalSyntheticLambda1) {
            this.SearchView$SavedState$1 = new View[this.MenuHostHelper$$ExternalSyntheticLambda1];
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setX(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        setMaxEms();
        View[] viewArr = this.SearchView$SavedState$1;
        if (viewArr == null || viewArr.length != this.MenuHostHelper$$ExternalSyntheticLambda1) {
            this.SearchView$SavedState$1 = new View[this.MenuHostHelper$$ExternalSyntheticLambda1];
        }
        return super.setX(i, setmaxems, setminandmaxprogress);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setY(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        setMaxEms();
        View[] viewArr = this.SearchView$SavedState$1;
        if (viewArr == null || viewArr.length != this.MenuHostHelper$$ExternalSyntheticLambda1) {
            this.SearchView$SavedState$1 = new View[this.MenuHostHelper$$ExternalSyntheticLambda1];
        }
        return super.setY(i, setmaxems, setminandmaxprogress);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final View setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, int i, int i2, int i3) {
        setOnLongClickListener();
        int layoutAnimation = this.setOnLongClickListener.setLayoutAnimation();
        int iconTintList = this.setOnLongClickListener.setIconTintList();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View onLongClickListener = setOnLongClickListener(i);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) onLongClickListener.getLayoutParams()).setUnboundedRipple;
            int i5 = setcheckediconenabled.setTextAlignment;
            if (i5 == -1) {
                i5 = setcheckediconenabled.setIconSize;
            }
            if (i5 >= 0 && i5 < i3 && setX(setmaxems, setminandmaxprogress, i5) == 0) {
                if ((((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) onLongClickListener.getLayoutParams()).setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0) {
                    if (view2 == null) {
                        view2 = onLongClickListener;
                    }
                } else if (this.setOnLongClickListener.setY(onLongClickListener) < iconTintList && this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener) >= layoutAnimation) {
                    return onLongClickListener;
                } else {
                    if (view == null) {
                        view = onLongClickListener;
                    }
                }
            }
            i += i4;
        }
        return view == null ? view2 : view;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    final void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, LinearLayoutManager.setY sety, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setX setx) {
        boolean z;
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        for (int i2 = 0; i2 < this.MenuHostHelper$$ExternalSyntheticLambda1; i2++) {
            int i3 = sety.MenuHostHelper$$ExternalSyntheticLambda1;
            if (i3 >= 0) {
                if (i3 < (setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation)) {
                    z = true;
                    if (z || i <= 0) {
                        return;
                    }
                    setx.MenuHostHelper$$ExternalSyntheticLambda0(sety.MenuHostHelper$$ExternalSyntheticLambda1, Math.max(0, sety.setChipCornerRadius));
                    i -= this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0();
                    sety.MenuHostHelper$$ExternalSyntheticLambda1 += sety.setUiOptions;
                }
            }
            z = false;
            if (z) {
                return;
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x008c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void setX(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms r18, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress r19, androidx.recyclerview.widget.LinearLayoutManager.setY r20, androidx.recyclerview.widget.LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 r21) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.setX(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress, androidx.recyclerview.widget.LinearLayoutManager$setY, androidx.recyclerview.widget.LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1):void");
    }

    private void setX(View view, int i, boolean z) {
        int i2;
        int i3;
        setX setx = (setX) view.getLayoutParams();
        Rect rect = setx.setIconTintList;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) setx).topMargin + ((ViewGroup.MarginLayoutParams) setx).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) setx).leftMargin + ((ViewGroup.MarginLayoutParams) setx).rightMargin;
        int layoutAnimation = setLayoutAnimation(setx.setY, setx.MenuHostHelper$$ExternalSyntheticLambda1);
        if (this.setNavigationOnClickListener == 1) {
            i3 = setIconTintList(layoutAnimation, i, i5, ((ViewGroup.LayoutParams) setx).width, false);
            i2 = setIconTintList(this.setOnLongClickListener.setUnboundedRipple(), this.setIconSize, i4, ((ViewGroup.LayoutParams) setx).height, true);
        } else {
            int iconTintList = setIconTintList(layoutAnimation, i, i4, ((ViewGroup.LayoutParams) setx).height, false);
            int iconTintList2 = setIconTintList(this.setOnLongClickListener.setUnboundedRipple(), this.setTextAppearanceResource, i5, ((ViewGroup.LayoutParams) setx).width, true);
            i2 = iconTintList;
            i3 = iconTintList2;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(view, i3, i2, z);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(View view, int i, int i2, boolean z) {
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams();
        if (z) {
            MenuHostHelper$$ExternalSyntheticLambda1 = setX(view, i, i2, setlayoutanimation);
        } else {
            MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(view, i, i2, setlayoutanimation);
        }
        if (MenuHostHelper$$ExternalSyntheticLambda1) {
            view.measure(i, i2);
        }
    }

    private void setChipCornerRadius(int i) {
        if (i == this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return;
        }
        this.setLayoutDirection = true;
        if (i <= 0) {
            StringBuilder sb = new StringBuilder("Span count should be at least 1. Provided ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.setChipIconTintResource.setIconTintList.clear();
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f3, code lost:
        if (r13 == (r2 > r11)) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x011d, code lost:
        if (r13 != (r2 > r15)) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015e  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View setY(android.view.View r23, int r24, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms r25, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress r26) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.setY(android.view.View, int, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setUiOptions == null && !this.setLayoutDirection;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return super.setX(setminandmaxprogress);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return super.setIconTintList(setminandmaxprogress);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return super.MenuHostHelper$$ExternalSyntheticLambda1(setminandmaxprogress);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return super.setY(setminandmaxprogress);
    }

    /* loaded from: classes.dex */
    public static class setX extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation {
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int setY;

        public setX(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.setY = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        }

        public setX(int i, int i2) {
            super(i, i2);
            this.setY = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        }

        public setX(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.setY = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        }

        public setX(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.setY = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        }
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, int i) {
        if (!setminandmaxprogress.setIconTintList) {
            setY sety = this.setChipIconTintResource;
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            boolean z = sety.MenuHostHelper$$ExternalSyntheticLambda1;
            return sety.setY(i, i2);
        }
        int MenuHostHelper$$ExternalSyntheticLambda1 = setmaxems.MenuHostHelper$$ExternalSyntheticLambda1(i);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
            StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. ");
            sb.append(i);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        setY sety2 = this.setChipIconTintResource;
        int i3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        boolean z2 = sety2.MenuHostHelper$$ExternalSyntheticLambda1;
        return sety2.setY(MenuHostHelper$$ExternalSyntheticLambda1, i3);
    }

    private int setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, int i) {
        if (!setminandmaxprogress.setIconTintList) {
            setY sety = this.setChipIconTintResource;
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            boolean z = sety.setY;
            return sety.setX(i, i2);
        }
        int i3 = this.setIconTintList.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int MenuHostHelper$$ExternalSyntheticLambda1 = setmaxems.MenuHostHelper$$ExternalSyntheticLambda1(i);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
            StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(i);
            Log.w("GridLayoutManager", sb.toString());
            return 0;
        }
        setY sety2 = this.setChipIconTintResource;
        int i4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        boolean z2 = sety2.setY;
        return sety2.setX(MenuHostHelper$$ExternalSyntheticLambda1, i4);
    }

    private int setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, int i) {
        if (!setminandmaxprogress.setIconTintList) {
            return this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        int i2 = this.setY.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        if (setmaxems.MenuHostHelper$$ExternalSyntheticLambda1(i) == -1) {
            StringBuilder sb = new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:");
            sb.append(i);
            Log.w("GridLayoutManager", sb.toString());
            return 1;
        }
        return this.setChipIconTintResource.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    private void setMaxEms() {
        int paddingBottom;
        int i = 0;
        if (this.setNavigationOnClickListener == 1) {
            int i2 = this.setGuidelinePercent;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            paddingBottom = i2 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingRight() : 0);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null) {
                i = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getPaddingLeft();
            }
        } else {
            int i3 = this.ViewPager$SavedState$1;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 = this.setMaxEms;
            paddingBottom = i3 - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.getPaddingBottom() : 0);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04 != null) {
                i = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline04.getPaddingTop();
            }
        }
        setUiOptions(paddingBottom - i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (setminandmaxprogress.setIconTintList) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            int MenuHostHelper$$ExternalSyntheticLambda0 = setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0;
            for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda0; i++) {
                setX setx = (setX) setOnLongClickListener(i).getLayoutParams();
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = setx.setUnboundedRipple;
                int i2 = setcheckediconenabled.setTextAlignment;
                if (i2 == -1) {
                    i2 = setcheckediconenabled.setIconSize;
                }
                this.setY.put(i2, setx.MenuHostHelper$$ExternalSyntheticLambda1);
                this.setIconTintList.put(i2, setx.setY);
            }
        }
        super.MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, setminandmaxprogress);
        this.setY.clear();
        this.setIconTintList.clear();
    }
}