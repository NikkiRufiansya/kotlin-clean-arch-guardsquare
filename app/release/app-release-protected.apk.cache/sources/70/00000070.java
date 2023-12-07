package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.setActiveIndicatorResizeable;
import o.setBaselineAlignBottom;
import o.setBoxBackgroundColorStateList;
import o.setOnHoverListener;
import o.setTextKeepState;

/* loaded from: classes.dex */
public class LinearLayoutManager extends WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions implements WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setZ.setX {
    private boolean ExtendableSavedState$1;
    final LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0;
    private final LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    private int[] SearchView$SavedState$1;
    private int setCheckedIconEnabled;
    private boolean setChipIconTintResource;
    private boolean setHasDecor;
    private int setIconTintList;
    private boolean setIconified;
    private int setLayoutDirection;
    public int setNavigationOnClickListener;
    setOnHoverListener setOnLongClickListener;
    setIconTintList setUiOptions;
    boolean setUnboundedRipple;
    private setY setX;
    private boolean setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0, int i) {
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean setUiOptions() {
        return true;
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.setNavigationOnClickListener = 1;
        this.setChipIconTintResource = false;
        this.setUnboundedRipple = false;
        this.setIconified = false;
        this.ExtendableSavedState$1 = true;
        this.setLayoutDirection = -1;
        this.setCheckedIconEnabled = Integer.MIN_VALUE;
        this.setUiOptions = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1();
        this.setIconTintList = 2;
        this.SearchView$SavedState$1 = new int[2];
        setIconTintList(i);
        if (this.setUiOptions == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1((String) null);
        }
        if (z != this.setChipIconTintResource) {
            this.setChipIconTintResource = z;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
            }
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.setNavigationOnClickListener = 1;
        this.setChipIconTintResource = false;
        this.setUnboundedRipple = false;
        this.setIconified = false;
        this.ExtendableSavedState$1 = true;
        this.setLayoutDirection = -1;
        this.setCheckedIconEnabled = Integer.MIN_VALUE;
        this.setUiOptions = null;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1();
        this.setIconTintList = 2;
        this.SearchView$SavedState$1 = new int[2];
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setIconTintList y = setY(context, attributeSet, i, i2);
        setIconTintList(y.setIconTintList);
        boolean z = y.setY;
        if (this.setUiOptions == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1((String) null);
        }
        if (z != this.setChipIconTintResource) {
            this.setChipIconTintResource = z;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
            }
        }
        setY(y.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setY() {
        return new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation(-2, -2);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, setmaxems);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(AccessibilityEvent accessibilityEvent) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(accessibilityEvent);
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        if ((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) > 0) {
            accessibilityEvent.setFromIndex(setLayoutAnimation());
            accessibilityEvent.setToIndex(setUnboundedRipple());
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final Parcelable setNavigationOnClickListener() {
        if (this.setUiOptions != null) {
            return new setIconTintList(this.setUiOptions);
        }
        setIconTintList seticontintlist = new setIconTintList();
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        if ((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) > 0) {
            if (this.setX == null) {
                this.setX = new setY();
            }
            boolean z = this.setY ^ this.setUnboundedRipple;
            seticontintlist.setIconTintList = z;
            if (z) {
                View maxEms = setMaxEms();
                seticontintlist.setY = this.setOnLongClickListener.setIconTintList() - this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(maxEms);
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) maxEms.getLayoutParams()).setUnboundedRipple;
                int i = setcheckediconenabled.setTextAlignment;
                if (i == -1) {
                    i = setcheckediconenabled.setIconSize;
                }
                seticontintlist.setX = i;
            } else {
                View z2 = setZ();
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) z2.getLayoutParams()).setUnboundedRipple;
                int i2 = setcheckediconenabled2.setTextAlignment;
                if (i2 == -1) {
                    i2 = setcheckediconenabled2.setIconSize;
                }
                seticontintlist.setX = i2;
                seticontintlist.setY = this.setOnLongClickListener.setY(z2) - this.setOnLongClickListener.setLayoutAnimation();
            }
        } else {
            seticontintlist.setX = -1;
        }
        return seticontintlist;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Parcelable parcelable) {
        if (parcelable instanceof setIconTintList) {
            this.setUiOptions = (setIconTintList) parcelable;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
            }
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setNavigationOnClickListener == 0;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean setIconTintList() {
        return this.setNavigationOnClickListener == 1;
    }

    public final void setIconTintList(int i) {
        setOnHoverListener anonymousClass4;
        if (i != 0 && i != 1) {
            StringBuilder sb = new StringBuilder("invalid orientation:");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (this.setUiOptions == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1((String) null);
        }
        if (i != this.setNavigationOnClickListener || this.setOnLongClickListener == null) {
            if (i == 0) {
                anonymousClass4 = new setOnHoverListener.AnonymousClass4(this);
            } else if (i != 1) {
                throw new IllegalArgumentException("invalid orientation");
            } else {
                anonymousClass4 = new setOnHoverListener.AnonymousClass3(this);
            }
            this.setOnLongClickListener = anonymousClass4;
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1 = anonymousClass4;
            this.setNavigationOnClickListener = i;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
            }
        }
    }

    private void setCheckedIconEnabled() {
        int x;
        if (this.setNavigationOnClickListener != 1) {
            x = setBaselineAlignBottom.setX.setX(this.setMaxEms);
            if (x == 1) {
                this.setUnboundedRipple = !this.setChipIconTintResource;
                return;
            }
        }
        this.setUnboundedRipple = this.setChipIconTintResource;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, int i) {
        setActiveIndicatorResizeable setactiveindicatorresizeable = new setActiveIndicatorResizeable(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getContext());
        setactiveindicatorresizeable.setLayoutAnimation = i;
        MenuHostHelper$$ExternalSyntheticLambda0(setactiveindicatorresizeable);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02d4  */
    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms r17, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress r18) {
        /*
            Method dump skipped, instructions count: 1433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress):void");
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(setminandmaxprogress);
        this.setUiOptions = null;
        this.setLayoutDirection = -1;
        this.setCheckedIconEnabled = Integer.MIN_VALUE;
        LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
        linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.setX = Integer.MIN_VALUE;
        linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.setY = false;
        linearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList = false;
    }

    private int MenuHostHelper$$ExternalSyntheticLambda0(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, boolean z) {
        int iconTintList;
        int iconTintList2 = this.setOnLongClickListener.setIconTintList() - i;
        if (iconTintList2 > 0) {
            int i2 = -MenuHostHelper$$ExternalSyntheticLambda1(-iconTintList2, setmaxems, setminandmaxprogress);
            if (!z || (iconTintList = this.setOnLongClickListener.setIconTintList() - (i + i2)) <= 0) {
                return i2;
            }
            this.setOnLongClickListener.setX(iconTintList);
            return iconTintList + i2;
        }
        return 0;
    }

    private int setIconTintList(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, boolean z) {
        int layoutAnimation;
        int layoutAnimation2 = i - this.setOnLongClickListener.setLayoutAnimation();
        if (layoutAnimation2 > 0) {
            int i2 = -MenuHostHelper$$ExternalSyntheticLambda1(layoutAnimation2, setmaxems, setminandmaxprogress);
            if (!z || (layoutAnimation = (i + i2) - this.setOnLongClickListener.setLayoutAnimation()) <= 0) {
                return i2;
            }
            this.setOnLongClickListener.setX(-layoutAnimation);
            return i2 - layoutAnimation;
        }
        return 0;
    }

    private void setUiOptions(int i, int i2) {
        this.setX.setX = this.setOnLongClickListener.setIconTintList() - i2;
        this.setX.setUiOptions = this.setUnboundedRipple ? -1 : 1;
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.setX.setOnLongClickListener = 1;
        this.setX.setNavigationOnClickListener = i2;
        this.setX.setChipCornerRadius = Integer.MIN_VALUE;
    }

    private void setNavigationOnClickListener(int i, int i2) {
        this.setX.setX = i2 - this.setOnLongClickListener.setLayoutAnimation();
        this.setX.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.setX.setUiOptions = this.setUnboundedRipple ? 1 : -1;
        this.setX.setOnLongClickListener = -1;
        this.setX.setNavigationOnClickListener = i2;
        this.setX.setChipCornerRadius = Integer.MIN_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setOnLongClickListener() {
        if (this.setX == null) {
            this.setX = new setY();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setX(int i) {
        this.setLayoutDirection = i;
        this.setCheckedIconEnabled = Integer.MIN_VALUE;
        setIconTintList seticontintlist = this.setUiOptions;
        if (seticontintlist != null) {
            seticontintlist.setX = -1;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public int setX(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (this.setNavigationOnClickListener == 1) {
            return 0;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(i, setmaxems, setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public int setY(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        if (this.setNavigationOnClickListener == 0) {
            return 0;
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(i, setmaxems, setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public int MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setUnboundedRipple(setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public int setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setUnboundedRipple(setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setUiOptions(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setNavigationOnClickListener(setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final int setLayoutAnimation(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setNavigationOnClickListener(setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public int setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setOnLongClickListener(setminandmaxprogress);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public int setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        return setOnLongClickListener(setminandmaxprogress);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, boolean z, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        int layoutAnimation;
        this.setX.setIconTintList = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0() == 0 && this.setOnLongClickListener.setY() == 0;
        this.setX.setOnLongClickListener = i;
        int[] iArr = this.SearchView$SavedState$1;
        iArr[0] = 0;
        iArr[1] = 0;
        MenuHostHelper$$ExternalSyntheticLambda1(setminandmaxprogress, iArr);
        int max = Math.max(0, this.SearchView$SavedState$1[0]);
        int max2 = Math.max(0, this.SearchView$SavedState$1[1]);
        boolean z2 = i == 1;
        this.setX.setY = z2 ? max2 : max;
        setY sety = this.setX;
        if (!z2) {
            max = max2;
        }
        sety.setLayoutAnimation = max;
        if (z2) {
            this.setX.setY += this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1();
            View maxEms = setMaxEms();
            this.setX.setUiOptions = this.setUnboundedRipple ? -1 : 1;
            setY sety2 = this.setX;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) maxEms.getLayoutParams()).setUnboundedRipple;
            int i3 = setcheckediconenabled.setTextAlignment;
            if (i3 == -1) {
                i3 = setcheckediconenabled.setIconSize;
            }
            sety2.MenuHostHelper$$ExternalSyntheticLambda1 = i3 + this.setX.setUiOptions;
            this.setX.setNavigationOnClickListener = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(maxEms);
            layoutAnimation = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(maxEms) - this.setOnLongClickListener.setIconTintList();
        } else {
            View z3 = setZ();
            this.setX.setY += this.setOnLongClickListener.setLayoutAnimation();
            this.setX.setUiOptions = this.setUnboundedRipple ? 1 : -1;
            setY sety3 = this.setX;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) z3.getLayoutParams()).setUnboundedRipple;
            int i4 = setcheckediconenabled2.setTextAlignment;
            if (i4 == -1) {
                i4 = setcheckediconenabled2.setIconSize;
            }
            sety3.MenuHostHelper$$ExternalSyntheticLambda1 = i4 + this.setX.setUiOptions;
            this.setX.setNavigationOnClickListener = this.setOnLongClickListener.setY(z3);
            layoutAnimation = (-this.setOnLongClickListener.setY(z3)) + this.setOnLongClickListener.setLayoutAnimation();
        }
        this.setX.setX = i2;
        if (z) {
            this.setX.setX -= layoutAnimation;
        }
        this.setX.setChipCornerRadius = layoutAnimation;
    }

    void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, setY sety, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setX setx) {
        int i = sety.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i >= 0) {
            if (i < (setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation)) {
                setx.MenuHostHelper$$ExternalSyntheticLambda0(i, Math.max(0, sety.setChipCornerRadius));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002a  */
    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setY(int r6, o.WindowInsetsCompat$Impl28$.ExternalSyntheticApiModelOutline0.setUiOptions.setX r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.LinearLayoutManager$setIconTintList r0 = r5.setUiOptions
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            int r0 = r0.setX
            if (r0 < 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L19
            androidx.recyclerview.widget.LinearLayoutManager$setIconTintList r0 = r5.setUiOptions
            boolean r0 = r0.setIconTintList
            androidx.recyclerview.widget.LinearLayoutManager$setIconTintList r4 = r5.setUiOptions
            int r4 = r4.setX
            goto L28
        L19:
            r5.setCheckedIconEnabled()
            boolean r0 = r5.setUnboundedRipple
            int r4 = r5.setLayoutDirection
            if (r4 != r1) goto L28
            if (r0 == 0) goto L27
            int r4 = r6 + (-1)
            goto L28
        L27:
            r4 = 0
        L28:
            if (r0 != 0) goto L2b
            r1 = 1
        L2b:
            r0 = 0
        L2c:
            int r2 = r5.setIconTintList
            if (r0 >= r2) goto L3b
            if (r4 < 0) goto L3b
            if (r4 >= r6) goto L3b
            r7.MenuHostHelper$$ExternalSyntheticLambda0(r4, r3)
            int r4 = r4 + r1
            int r0 = r0 + 1
            goto L2c
        L3b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.setY(int, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setUiOptions$setX):void");
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void setIconTintList(int i, int i2, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setX setx) {
        if (this.setNavigationOnClickListener != 0) {
            i = i2;
        }
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        if ((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) == 0 || i == 0) {
            return;
        }
        if (this.setX == null) {
            this.setX = new setY();
        }
        MenuHostHelper$$ExternalSyntheticLambda1(i > 0 ? 1 : -1, Math.abs(i), true, setminandmaxprogress);
        setIconTintList(setminandmaxprogress, this.setX, setx);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final void MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        if (this.setUiOptions == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1(str);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                setY(i, setmaxems);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            setY(i2, setmaxems);
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, setY sety) {
        if (!sety.setIconSize || sety.setIconTintList) {
            return;
        }
        int i = sety.setChipCornerRadius;
        int i2 = sety.setLayoutAnimation;
        if (sety.setOnLongClickListener == -1) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            int MenuHostHelper$$ExternalSyntheticLambda0 = setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0;
            if (i >= 0) {
                int y = (this.setOnLongClickListener.setY() - i) + i2;
                if (this.setUnboundedRipple) {
                    for (int i3 = 0; i3 < MenuHostHelper$$ExternalSyntheticLambda0; i3++) {
                        View onLongClickListener = setOnLongClickListener(i3);
                        if (this.setOnLongClickListener.setY(onLongClickListener) < y || this.setOnLongClickListener.setLayoutAnimation(onLongClickListener) < y) {
                            MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, 0, i3);
                            return;
                        }
                    }
                    return;
                }
                int i4 = MenuHostHelper$$ExternalSyntheticLambda0 - 1;
                for (int i5 = i4; i5 >= 0; i5--) {
                    View onLongClickListener2 = setOnLongClickListener(i5);
                    if (this.setOnLongClickListener.setY(onLongClickListener2) < y || this.setOnLongClickListener.setLayoutAnimation(onLongClickListener2) < y) {
                        MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, i4, i5);
                        return;
                    }
                }
            }
        } else if (i >= 0) {
            int i6 = i - i2;
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = this.setLayoutAnimation;
            int MenuHostHelper$$ExternalSyntheticLambda02 = setboxbackgroundcolorstatelist2 != null ? setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist2.setX.size() : 0;
            if (!this.setUnboundedRipple) {
                for (int i7 = 0; i7 < MenuHostHelper$$ExternalSyntheticLambda02; i7++) {
                    View onLongClickListener3 = setOnLongClickListener(i7);
                    if (this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener3) > i6 || this.setOnLongClickListener.setX(onLongClickListener3) > i6) {
                        MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = MenuHostHelper$$ExternalSyntheticLambda02 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View onLongClickListener4 = setOnLongClickListener(i9);
                if (this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener4) > i6 || this.setOnLongClickListener.setX(onLongClickListener4) > i6) {
                    MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, i8, i9);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008a A[EDGE_INSN: B:45:0x008a->B:40:0x008a ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms r9, androidx.recyclerview.widget.LinearLayoutManager.setY r10, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress r11, boolean r12) {
        /*
            r8 = this;
            int r0 = r10.setX
            int r1 = r10.setChipCornerRadius
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto L16
            int r1 = r10.setX
            if (r1 >= 0) goto L13
            int r1 = r10.setChipCornerRadius
            int r3 = r10.setX
            int r1 = r1 + r3
            r10.setChipCornerRadius = r1
        L13:
            r8.MenuHostHelper$$ExternalSyntheticLambda0(r9, r10)
        L16:
            int r1 = r10.setX
            int r3 = r10.setY
            int r1 = r1 + r3
            androidx.recyclerview.widget.LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 r3 = r8.MenuHostHelper$$ExternalSyntheticLambda1
        L1d:
            boolean r4 = r10.setIconTintList
            if (r4 != 0) goto L23
            if (r1 <= 0) goto L8a
        L23:
            int r4 = r10.MenuHostHelper$$ExternalSyntheticLambda1
            r5 = 0
            if (r4 < 0) goto L38
            boolean r6 = r11.setIconTintList
            if (r6 == 0) goto L32
            int r6 = r11.setNavigationOnClickListener
            int r7 = r11.setY
            int r6 = r6 - r7
            goto L34
        L32:
            int r6 = r11.setLayoutAnimation
        L34:
            if (r4 >= r6) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            if (r4 == 0) goto L8a
            r3.MenuHostHelper$$ExternalSyntheticLambda1 = r5
            r3.setX = r5
            r3.setY = r5
            r3.setIconTintList = r5
            r8.setX(r9, r11, r10, r3)
            boolean r4 = r3.setX
            if (r4 != 0) goto L8a
            int r4 = r10.setNavigationOnClickListener
            int r5 = r3.MenuHostHelper$$ExternalSyntheticLambda1
            int r6 = r10.setOnLongClickListener
            int r5 = r5 * r6
            int r4 = r4 + r5
            r10.setNavigationOnClickListener = r4
            boolean r4 = r3.setY
            if (r4 == 0) goto L61
            java.util.List<o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setCheckedIconEnabled> r4 = r10.setCenterIfNoTextEnabled
            if (r4 != 0) goto L61
            boolean r4 = r11.setIconTintList
            if (r4 != 0) goto L6b
        L61:
            int r4 = r10.setX
            int r5 = r3.MenuHostHelper$$ExternalSyntheticLambda1
            int r4 = r4 - r5
            r10.setX = r4
            int r4 = r3.MenuHostHelper$$ExternalSyntheticLambda1
            int r1 = r1 - r4
        L6b:
            int r4 = r10.setChipCornerRadius
            if (r4 == r2) goto L84
            int r4 = r10.setChipCornerRadius
            int r5 = r3.MenuHostHelper$$ExternalSyntheticLambda1
            int r4 = r4 + r5
            r10.setChipCornerRadius = r4
            int r4 = r10.setX
            if (r4 >= 0) goto L81
            int r4 = r10.setChipCornerRadius
            int r5 = r10.setX
            int r4 = r4 + r5
            r10.setChipCornerRadius = r4
        L81:
            r8.MenuHostHelper$$ExternalSyntheticLambda0(r9, r10)
        L84:
            if (r12 == 0) goto L1d
            boolean r4 = r3.setIconTintList
            if (r4 == 0) goto L1d
        L8a:
            int r9 = r10.setX
            int r0 = r0 - r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.MenuHostHelper$$ExternalSyntheticLambda0(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms, androidx.recyclerview.widget.LinearLayoutManager$setY, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress, boolean):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x0165, code lost:
        if (((r5.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 & 2) != 0) != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void setX(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms r19, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress r20, androidx.recyclerview.widget.LinearLayoutManager.setY r21, androidx.recyclerview.widget.LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 r22) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.setX(o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMaxEms, o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$setMinAndMaxProgress, androidx.recyclerview.widget.LinearLayoutManager$setY, androidx.recyclerview.widget.LinearLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int x;
        int x2;
        if (i == 1) {
            if (this.setNavigationOnClickListener == 1) {
                return -1;
            }
            x = setBaselineAlignBottom.setX.setX(this.setMaxEms);
            return x == 1 ? 1 : -1;
        } else if (i != 2) {
            return i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.setNavigationOnClickListener == 1) ? 1 : Integer.MIN_VALUE : this.setNavigationOnClickListener == 0 ? 1 : Integer.MIN_VALUE : this.setNavigationOnClickListener != 1 ? Integer.MIN_VALUE : -1 : this.setNavigationOnClickListener != 0 ? Integer.MIN_VALUE : -1;
        } else if (this.setNavigationOnClickListener == 1) {
            return 1;
        } else {
            x2 = setBaselineAlignBottom.setX.setX(this.setMaxEms);
            return x2 == 1 ? -1 : 1;
        }
    }

    private View setZ() {
        if (this.setUnboundedRipple) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            r1 = (setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) - 1;
        }
        return setOnLongClickListener(r1);
    }

    private View setMaxEms() {
        if (!this.setUnboundedRipple) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            r1 = (setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) - 1;
        }
        return setOnLongClickListener(r1);
    }

    private View setX(boolean z) {
        if (this.setUnboundedRipple) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            return setY((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) - 1, -1, z, true);
        }
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = this.setLayoutAnimation;
        return setY(0, setboxbackgroundcolorstatelist2 != null ? setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist2.setX.size() : 0, z, true);
    }

    private View MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        if (this.setUnboundedRipple) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            return setY(0, setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0, z, true);
        }
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist2 = this.setLayoutAnimation;
        return setY((setboxbackgroundcolorstatelist2 != null ? setboxbackgroundcolorstatelist2.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist2.setX.size() : 0) - 1, -1, z, true);
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public View setY(View view, int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        View animationFromJson;
        View maxEms;
        setCheckedIconEnabled();
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        if ((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) == 0 || (MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        if (this.setX == null) {
            this.setX = new setY();
        }
        MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, (int) (this.setOnLongClickListener.setUnboundedRipple() * 0.33333334f), false, setminandmaxprogress);
        this.setX.setChipCornerRadius = Integer.MIN_VALUE;
        this.setX.setIconSize = false;
        MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, this.setX, setminandmaxprogress, true);
        if (MenuHostHelper$$ExternalSyntheticLambda0 == -1) {
            animationFromJson = this.setUnboundedRipple ? setTextScaleX() : setAnimationFromJson();
        } else {
            animationFromJson = this.setUnboundedRipple ? setAnimationFromJson() : setTextScaleX();
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0 == -1) {
            maxEms = setZ();
        } else {
            maxEms = setMaxEms();
        }
        if (maxEms.hasFocusable()) {
            if (animationFromJson == null) {
                return null;
            }
            return maxEms;
        }
        return animationFromJson;
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setUiOptions == null && this.setY == this.setIconified;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int setChipCornerRadius;
        boolean setIconTintList;
        int setNavigationOnClickListener;
        int setOnLongClickListener;
        int setUiOptions;
        int setUnboundedRipple;
        int setX;
        boolean setIconSize = true;
        int setY = 0;
        int setLayoutAnimation = 0;
        boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
        List<WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled> setCenterIfNoTextEnabled = null;

        setY() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final View setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems) {
            if (this.setCenterIfNoTextEnabled != null) {
                return setY();
            }
            View x = setmaxems.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            this.MenuHostHelper$$ExternalSyntheticLambda1 += this.setUiOptions;
            return x;
        }

        private View setY() {
            int size = this.setCenterIfNoTextEnabled.size();
            for (int i = 0; i < size; i++) {
                View view = this.setCenterIfNoTextEnabled.get(i).setIconTintList;
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams();
                if (!((setlayoutanimation.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0)) {
                    int i2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = setlayoutanimation.setUnboundedRipple;
                    int i3 = setcheckediconenabled.setTextAlignment;
                    if (i3 == -1) {
                        i3 = setcheckediconenabled.setIconSize;
                    }
                    if (i2 == i3) {
                        MenuHostHelper$$ExternalSyntheticLambda0(view);
                        return view;
                    }
                }
            }
            return null;
        }

        public final void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            View x = setX(view);
            if (x == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
                return;
            }
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) x.getLayoutParams()).setUnboundedRipple;
            int i = setcheckediconenabled.setTextAlignment;
            if (i == -1) {
                i = setcheckediconenabled.setIconSize;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        }

        private View setX(View view) {
            int size = this.setCenterIfNoTextEnabled.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.setCenterIfNoTextEnabled.get(i2).setIconTintList;
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view3.getLayoutParams();
                if (view3 != view) {
                    if ((setlayoutanimation.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1 & 8) != 0) {
                        continue;
                    } else {
                        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = setlayoutanimation.setUnboundedRipple;
                        int i3 = setcheckediconenabled.setTextAlignment;
                        if (i3 == -1) {
                            i3 = setcheckediconenabled.setIconSize;
                        }
                        int i4 = (i3 - this.MenuHostHelper$$ExternalSyntheticLambda1) * this.setUiOptions;
                        if (i4 >= 0 && i4 < i) {
                            view2 = view3;
                            if (i4 == 0) {
                                break;
                            }
                            i = i4;
                        }
                    }
                }
            }
            return view2;
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList implements Parcelable {
        public static final Parcelable.Creator<setIconTintList> CREATOR = new Parcelable.Creator<setIconTintList>() { // from class: androidx.recyclerview.widget.LinearLayoutManager$SavedState$1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ LinearLayoutManager.setIconTintList createFromParcel(Parcel parcel) {
                return new LinearLayoutManager.setIconTintList(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ LinearLayoutManager.setIconTintList[] newArray(int i) {
                return new LinearLayoutManager.setIconTintList[i];
            }
        };
        boolean setIconTintList;
        int setX;
        int setY;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public setIconTintList() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setIconTintList(Parcel parcel) {
            this.setX = parcel.readInt();
            this.setY = parcel.readInt();
            this.setIconTintList = parcel.readInt() == 1;
        }

        public setIconTintList(setIconTintList seticontintlist) {
            this.setX = seticontintlist.setX;
            this.setY = seticontintlist.setY;
            this.setIconTintList = seticontintlist.setIconTintList;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.setX);
            parcel.writeInt(this.setY);
            parcel.writeInt(this.setIconTintList ? 1 : 0);
        }
    }

    private int setNavigationOnClickListener(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        if ((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) == 0) {
            return 0;
        }
        if (this.setX == null) {
            this.setX = new setY();
        }
        return setTextKeepState.setY(setminandmaxprogress, this.setOnLongClickListener, setX(!this.ExtendableSavedState$1), MenuHostHelper$$ExternalSyntheticLambda0(!this.ExtendableSavedState$1), this, this.ExtendableSavedState$1);
    }

    private int setUnboundedRipple(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        if ((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) == 0) {
            return 0;
        }
        if (this.setX == null) {
            this.setX = new setY();
        }
        return setTextKeepState.MenuHostHelper$$ExternalSyntheticLambda1(setminandmaxprogress, this.setOnLongClickListener, setX(!this.ExtendableSavedState$1), MenuHostHelper$$ExternalSyntheticLambda0(!this.ExtendableSavedState$1), this, this.ExtendableSavedState$1, this.setUnboundedRipple);
    }

    private int setOnLongClickListener(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        if ((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) == 0) {
            return 0;
        }
        if (this.setX == null) {
            this.setX = new setY();
        }
        return setTextKeepState.MenuHostHelper$$ExternalSyntheticLambda1(setminandmaxprogress, this.setOnLongClickListener, setX(!this.ExtendableSavedState$1), MenuHostHelper$$ExternalSyntheticLambda0(!this.ExtendableSavedState$1), this, this.ExtendableSavedState$1);
    }

    private View setAnimationFromJson() {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        return setUnboundedRipple(0, setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0);
    }

    private View setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        return setY(setmaxems, setminandmaxprogress, 0, setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0, setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation);
    }

    private View setTextScaleX() {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        return setUnboundedRipple((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) - 1, -1);
    }

    private View setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        return setY(setmaxems, setminandmaxprogress, (setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) - 1, -1, setminandmaxprogress.setIconTintList ? setminandmaxprogress.setNavigationOnClickListener - setminandmaxprogress.setY : setminandmaxprogress.setLayoutAnimation);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, int[] iArr) {
        int i;
        int unboundedRipple = setminandmaxprogress.setIconSize != -1 ? this.setOnLongClickListener.setUnboundedRipple() : 0;
        if (this.setX.setOnLongClickListener == -1) {
            i = 0;
        } else {
            i = unboundedRipple;
            unboundedRipple = 0;
        }
        iArr[0] = unboundedRipple;
        iArr[1] = i;
    }

    @Override // o.WindowInsetsCompat$Impl28$.ExternalSyntheticApiModelOutline0.setZ.setX
    public final PointF setY(int i) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        if ((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) == 0) {
            return null;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) setOnLongClickListener(0).getLayoutParams()).setUnboundedRipple;
        int i2 = setcheckediconenabled.setTextAlignment;
        if (i2 == -1) {
            i2 = setcheckediconenabled.setIconSize;
        }
        int i3 = (i < i2) == this.setUnboundedRipple ? 1 : -1;
        if (this.setNavigationOnClickListener == 0) {
            return new PointF(i3, 0.0f);
        }
        return new PointF(0.0f, i3);
    }

    public final int setLayoutAnimation() {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        View y = setY(0, setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0, false, true);
        if (y == null) {
            return -1;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) y.getLayoutParams()).setUnboundedRipple;
        int i = setcheckediconenabled.setTextAlignment;
        return i == -1 ? setcheckediconenabled.setIconSize : i;
    }

    public final int setUnboundedRipple() {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        View y = setY((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) - 1, -1, false, true);
        if (y != null) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) y.getLayoutParams()).setUnboundedRipple;
            int i = setcheckediconenabled.setTextAlignment;
            return i == -1 ? setcheckediconenabled.setIconSize : i;
        }
        return -1;
    }

    private View setUnboundedRipple(int i, int i2) {
        int i3;
        int i4;
        if (this.setX == null) {
            this.setX = new setY();
        }
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return setOnLongClickListener(i);
        }
        if (this.setOnLongClickListener.setY(setOnLongClickListener(i)) < this.setOnLongClickListener.setLayoutAnimation()) {
            i3 = 16644;
            i4 = 16388;
        } else {
            i3 = 4161;
            i4 = 4097;
        }
        if (this.setNavigationOnClickListener == 0) {
            return this.setCenterIfNoTextEnabled.setX(i, i2, i3, i4);
        }
        return this.setMinAndMaxProgress.setX(i, i2, i3, i4);
    }

    private View setY(int i, int i2, boolean z, boolean z2) {
        if (this.setX == null) {
            this.setX = new setY();
        }
        int i3 = z ? 24579 : 320;
        if (this.setNavigationOnClickListener == 0) {
            return this.setCenterIfNoTextEnabled.setX(i, i2, i3, 320);
        }
        return this.setMinAndMaxProgress.setX(i, i2, i3, 320);
    }

    View setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, int i, int i2, int i3) {
        if (this.setX == null) {
            this.setX = new setY();
        }
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
            if (i5 >= 0 && i5 < i3) {
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

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final View MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        int MenuHostHelper$$ExternalSyntheticLambda0 = setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0;
        if (MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            return null;
        }
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) setOnLongClickListener(0).getLayoutParams()).setUnboundedRipple;
        int i2 = setcheckediconenabled.setTextAlignment;
        if (i2 == -1) {
            i2 = setcheckediconenabled.setIconSize;
        }
        int i3 = i - i2;
        if (i3 >= 0 && i3 < MenuHostHelper$$ExternalSyntheticLambda0) {
            View onLongClickListener = setOnLongClickListener(i3);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCheckedIconEnabled setcheckediconenabled2 = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) onLongClickListener.getLayoutParams()).setUnboundedRipple;
            int i4 = setcheckediconenabled2.setTextAlignment;
            if (i4 == -1) {
                i4 = setcheckediconenabled2.setIconSize;
            }
            if (i4 == i) {
                return onLongClickListener;
            }
        }
        return super.MenuHostHelper$$ExternalSyntheticLambda1(i);
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1(int i, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMaxEms setmaxems, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress) {
        setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
        if ((setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0) == 0 || i == 0) {
            return 0;
        }
        if (this.setX == null) {
            this.setX = new setY();
        }
        this.setX.setIconSize = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        MenuHostHelper$$ExternalSyntheticLambda1(i2, abs, true, setminandmaxprogress);
        int MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.setChipCornerRadius + MenuHostHelper$$ExternalSyntheticLambda0(setmaxems, this.setX, setminandmaxprogress, false);
        if (MenuHostHelper$$ExternalSyntheticLambda0 < 0) {
            return 0;
        }
        if (abs > MenuHostHelper$$ExternalSyntheticLambda0) {
            i = i2 * MenuHostHelper$$ExternalSyntheticLambda0;
        }
        this.setOnLongClickListener.setX(-i);
        this.setX.setUnboundedRipple = i;
        return i;
    }

    public void setY(boolean z) {
        if (this.setUiOptions == null) {
            super.MenuHostHelper$$ExternalSyntheticLambda1((String) null);
        }
        if (this.setIconified == z) {
            return;
        }
        this.setIconified = z;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setMaxEms;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.requestLayout();
        }
    }

    @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions
    public final boolean setChipCornerRadius() {
        boolean z;
        if (this.setIconSize != 1073741824 && this.setTextAppearanceResource != 1073741824) {
            setBoxBackgroundColorStateList setboxbackgroundcolorstatelist = this.setLayoutAnimation;
            int MenuHostHelper$$ExternalSyntheticLambda0 = setboxbackgroundcolorstatelist != null ? setboxbackgroundcolorstatelist.setY.MenuHostHelper$$ExternalSyntheticLambda0() - setboxbackgroundcolorstatelist.setX.size() : 0;
            int i = 0;
            while (true) {
                if (i >= MenuHostHelper$$ExternalSyntheticLambda0) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = setOnLongClickListener(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }
}