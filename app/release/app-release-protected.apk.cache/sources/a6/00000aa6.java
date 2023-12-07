package o;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import o.setBaselineAlignBottom;
import o.setContentHeight;
import o.setDecorPadding;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1 extends setContentHeight.setIconTintList {
    private final setShowDividers MenuHostHelper$$ExternalSyntheticLambda0;
    private final setShowDividers MenuHostHelper$$ExternalSyntheticLambda1;
    final /* synthetic */ setContentHeight setX;
    private WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0 setY;

    @Override // o.setContentHeight.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return true;
    }

    @Override // o.setContentHeight.setIconTintList
    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // o.setContentHeight.setIconTintList
    public final boolean setIconTintList(int i) {
        return i == 8192 || i == 4096;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1(setContentHeight setcontentheight) {
        super(setcontentheight, (byte) 0);
        this.setX = setcontentheight;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new setShowDividers() { // from class: o.setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1.5
            @Override // o.setShowDividers
            public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1 setcontentheight_menuhosthelper__externalsyntheticlambda1 = setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1.this;
                int i = ((setContentHeight) view).MenuHostHelper$$ExternalSyntheticLambda0 + 1;
                if (setcontentheight_menuhosthelper__externalsyntheticlambda1.setX.setUnboundedRipple) {
                    setcontentheight_menuhosthelper__externalsyntheticlambda1.setX.MenuHostHelper$$ExternalSyntheticLambda1(i, true);
                }
                return true;
            }
        };
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new setShowDividers() { // from class: o.setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1.2
            @Override // o.setShowDividers
            public final boolean MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1 setcontentheight_menuhosthelper__externalsyntheticlambda1 = setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1.this;
                int i = ((setContentHeight) view).MenuHostHelper$$ExternalSyntheticLambda0 - 1;
                if (setcontentheight_menuhosthelper__externalsyntheticlambda1.setX.setUnboundedRipple) {
                    setcontentheight_menuhosthelper__externalsyntheticlambda1.setX.MenuHostHelper$$ExternalSyntheticLambda1(i, true);
                }
                return true;
            }
        };
    }

    @Override // o.setContentHeight.setIconTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) {
        setBaselineAlignBottom.setUnboundedRipple(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0, 2);
        this.setY = new setContentHeight$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1.3
            @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda0
            public final void setY() {
                setContentHeight$MenuHostHelper$$ExternalSyntheticLambda1.this.setLayoutAnimation();
            }
        };
        if (setBaselineAlignBottom.setCenterIfNoTextEnabled(this.setX) == 0) {
            setBaselineAlignBottom.setUnboundedRipple(this.setX, 1);
        }
    }

    @Override // o.setContentHeight.setIconTintList
    public final void setY() {
        setLayoutAnimation();
    }

    @Override // o.setContentHeight.setIconTintList
    public final void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<?> windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1) {
        setLayoutAnimation();
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setX.registerObserver(this.setY);
        }
    }

    @Override // o.setContentHeight.setIconTintList
    public final void setY(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1<?> windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1) {
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setX.unregisterObserver(this.setY);
        }
    }

    @Override // o.setContentHeight.setIconTintList
    public final void setOnLongClickListener() {
        setLayoutAnimation();
    }

    @Override // o.setContentHeight.setIconTintList
    public final void setIconTintList() {
        setLayoutAnimation();
    }

    @Override // o.setContentHeight.setIconTintList
    public final void setUnboundedRipple() {
        setLayoutAnimation();
    }

    @Override // o.setContentHeight.setIconTintList
    public final void setX() {
        setLayoutAnimation();
    }

    @Override // o.setContentHeight.setIconTintList
    public final boolean setX(int i) {
        int i2;
        if (!(i == 8192 || i == 4096)) {
            throw new IllegalStateException();
        }
        if (i == 8192) {
            i2 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0 - 1;
        } else {
            i2 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
        }
        if (this.setX.setUnboundedRipple) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda1(i2, true);
        }
        return true;
    }

    @Override // o.setContentHeight.setIconTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda1(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.setX);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    final void setLayoutAnimation() {
        int y;
        int x;
        setContentHeight setcontentheight = this.setX;
        setBaselineAlignBottom.setIconTintList(setcontentheight, 16908360);
        setBaselineAlignBottom.setIconTintList(setcontentheight, 16908361);
        setBaselineAlignBottom.setIconTintList(setcontentheight, 16908358);
        setBaselineAlignBottom.setIconTintList(setcontentheight, 16908359);
        if (this.setX.setLayoutAnimation.setNavigationOnClickListener == null || (y = this.setX.setLayoutAnimation.setNavigationOnClickListener.setY()) == 0 || !this.setX.setUnboundedRipple) {
            return;
        }
        if (this.setX.setUiOptions.setNavigationOnClickListener != 0) {
            if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 < y - 1) {
                setBaselineAlignBottom.setX(setcontentheight, new setDecorPadding.setIconTintList(16908359, null), null, this.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                setBaselineAlignBottom.setX(setcontentheight, new setDecorPadding.setIconTintList(16908358, null), null, this.MenuHostHelper$$ExternalSyntheticLambda0);
                return;
            }
            return;
        }
        x = setBaselineAlignBottom.setX.setX(this.setX.setUiOptions.setMaxEms);
        boolean z = x == 1;
        int i = z ? 16908360 : 16908361;
        int i2 = z ? 16908361 : 16908360;
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 < y - 1) {
            setBaselineAlignBottom.setX(setcontentheight, new setDecorPadding.setIconTintList(i, null), null, this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
            setBaselineAlignBottom.setX(setcontentheight, new setDecorPadding.setIconTintList(i2, null), null, this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    @Override // o.setContentHeight.setIconTintList
    public final void setIconTintList(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1;
        int y;
        if (this.setX.setLayoutAnimation.setNavigationOnClickListener == null) {
            i = 0;
        } else if (this.setX.setUiOptions.setNavigationOnClickListener == 1) {
            i = this.setX.setLayoutAnimation.setNavigationOnClickListener.setY();
        } else {
            i2 = this.setX.setLayoutAnimation.setNavigationOnClickListener.setY();
            i = 0;
            setDecorPadding.setY(accessibilityNodeInfo).setX(setDecorPadding.setX.setIconTintList(i, i2, false, 0));
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.setLayoutAnimation.setNavigationOnClickListener;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 == null && (y = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY()) != 0 && this.setX.setUnboundedRipple) {
                if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 < y - 1) {
                    accessibilityNodeInfo.addAction(4096);
                }
                accessibilityNodeInfo.setScrollable(true);
                return;
            }
            return;
        }
        i2 = 0;
        setDecorPadding.setY(accessibilityNodeInfo).setX(setDecorPadding.setX.setIconTintList(i, i2, false, 0));
        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.setLayoutAnimation.setNavigationOnClickListener;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 == null) {
        }
    }
}