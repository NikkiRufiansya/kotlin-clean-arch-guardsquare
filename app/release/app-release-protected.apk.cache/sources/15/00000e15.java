package o;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;

/* loaded from: classes.dex */
public abstract class setOnHoverListener {
    final Rect setIconTintList;
    protected final WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setX;
    public int setY;

    public abstract int MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract int MenuHostHelper$$ExternalSyntheticLambda0(View view);

    public abstract int MenuHostHelper$$ExternalSyntheticLambda1();

    public abstract int MenuHostHelper$$ExternalSyntheticLambda1(View view);

    public abstract int setIconTintList();

    public abstract int setIconTintList(View view);

    public abstract int setLayoutAnimation();

    public abstract int setLayoutAnimation(View view);

    public abstract int setUnboundedRipple();

    public abstract int setX();

    public abstract int setX(View view);

    public abstract void setX(int i);

    public abstract int setY();

    public abstract int setY(View view);

    /* synthetic */ setOnHoverListener(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, byte b) {
        this(setuioptions);
    }

    private setOnHoverListener(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions) {
        this.setY = Integer.MIN_VALUE;
        this.setIconTintList = new Rect();
        this.setX = setuioptions;
    }

    /* renamed from: o.setOnHoverListener$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends setOnHoverListener {
        public AnonymousClass4(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions) {
            super(setuioptions, (byte) 0);
        }

        @Override // o.setOnHoverListener
        public final int setIconTintList() {
            int i = this.setX.setGuidelinePercent;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setX.setMaxEms;
            return i - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingRight() : 0);
        }

        @Override // o.setOnHoverListener
        public final int setY() {
            return this.setX.setGuidelinePercent;
        }

        @Override // o.setOnHoverListener
        public final void setX(int i) {
            this.setX.setLayoutAnimation(i);
        }

        @Override // o.setOnHoverListener
        public final int setLayoutAnimation() {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setX.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                return windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingLeft();
            }
            return 0;
        }

        @Override // o.setOnHoverListener
        public final int MenuHostHelper$$ExternalSyntheticLambda1(View view) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams();
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setX;
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setUiOptions(view) + ((ViewGroup.MarginLayoutParams) setlayoutanimation).leftMargin + ((ViewGroup.MarginLayoutParams) setlayoutanimation).rightMargin;
        }

        @Override // o.setOnHoverListener
        public final int setIconTintList(View view) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams();
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setX;
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(view) + ((ViewGroup.MarginLayoutParams) setlayoutanimation).topMargin + ((ViewGroup.MarginLayoutParams) setlayoutanimation).bottomMargin;
        }

        @Override // o.setOnHoverListener
        public final int MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setX;
            return view.getRight() + WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setNavigationOnClickListener(view) + ((ViewGroup.MarginLayoutParams) ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams())).rightMargin;
        }

        @Override // o.setOnHoverListener
        public final int setY(View view) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setX;
            return (view.getLeft() - WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setUnboundedRipple(view)) - ((ViewGroup.MarginLayoutParams) ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams())).leftMargin;
        }

        @Override // o.setOnHoverListener
        public final int setX(View view) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(view, this.setIconTintList);
            return this.setIconTintList.right;
        }

        @Override // o.setOnHoverListener
        public final int setLayoutAnimation(View view) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(view, this.setIconTintList);
            return this.setIconTintList.left;
        }

        @Override // o.setOnHoverListener
        public final int setUnboundedRipple() {
            int i = this.setX.setGuidelinePercent;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setX.setMaxEms;
            int paddingLeft = i - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingLeft() : 0);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setX.setMaxEms;
            return paddingLeft - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getPaddingRight() : 0);
        }

        @Override // o.setOnHoverListener
        public final int MenuHostHelper$$ExternalSyntheticLambda1() {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setX.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                return windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingRight();
            }
            return 0;
        }

        @Override // o.setOnHoverListener
        public final int MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setX.setTextAppearanceResource;
        }

        @Override // o.setOnHoverListener
        public final int setX() {
            return this.setX.setIconSize;
        }
    }

    /* renamed from: o.setOnHoverListener$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends setOnHoverListener {
        public AnonymousClass3(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions) {
            super(setuioptions, (byte) 0);
        }

        @Override // o.setOnHoverListener
        public final int setIconTintList() {
            int i = this.setX.ViewPager$SavedState$1;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setX.setMaxEms;
            return i - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingBottom() : 0);
        }

        @Override // o.setOnHoverListener
        public final int setY() {
            return this.setX.ViewPager$SavedState$1;
        }

        @Override // o.setOnHoverListener
        public final void setX(int i) {
            this.setX.setUnboundedRipple(i);
        }

        @Override // o.setOnHoverListener
        public final int setLayoutAnimation() {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setX.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                return windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingTop();
            }
            return 0;
        }

        @Override // o.setOnHoverListener
        public final int MenuHostHelper$$ExternalSyntheticLambda1(View view) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams();
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setX;
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(view) + ((ViewGroup.MarginLayoutParams) setlayoutanimation).topMargin + ((ViewGroup.MarginLayoutParams) setlayoutanimation).bottomMargin;
        }

        @Override // o.setOnHoverListener
        public final int setIconTintList(View view) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation setlayoutanimation = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams();
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setX;
            return WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setUiOptions(view) + ((ViewGroup.MarginLayoutParams) setlayoutanimation).leftMargin + ((ViewGroup.MarginLayoutParams) setlayoutanimation).rightMargin;
        }

        @Override // o.setOnHoverListener
        public final int MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            int i;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setX;
            int bottom = view.getBottom();
            i = ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams()).setIconTintList.bottom;
            return bottom + i + ((ViewGroup.MarginLayoutParams) ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams())).bottomMargin;
        }

        @Override // o.setOnHoverListener
        public final int setY(View view) {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions = this.setX;
            return (view.getTop() - WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions.setLayoutAnimation(view)) - ((ViewGroup.MarginLayoutParams) ((WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setLayoutAnimation) view.getLayoutParams())).topMargin;
        }

        @Override // o.setOnHoverListener
        public final int setX(View view) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(view, this.setIconTintList);
            return this.setIconTintList.bottom;
        }

        @Override // o.setOnHoverListener
        public final int setLayoutAnimation(View view) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(view, this.setIconTintList);
            return this.setIconTintList.top;
        }

        @Override // o.setOnHoverListener
        public final int setUnboundedRipple() {
            int i = this.setX.ViewPager$SavedState$1;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setX.setMaxEms;
            int paddingTop = i - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingTop() : 0);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setX.setMaxEms;
            return paddingTop - (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 != null ? windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getPaddingBottom() : 0);
        }

        @Override // o.setOnHoverListener
        public final int MenuHostHelper$$ExternalSyntheticLambda1() {
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = this.setX.setMaxEms;
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
                return windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.getPaddingBottom();
            }
            return 0;
        }

        @Override // o.setOnHoverListener
        public final int MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setX.setIconSize;
        }

        @Override // o.setOnHoverListener
        public final int setX() {
            return this.setX.setTextAppearanceResource;
        }
    }

    public static setOnHoverListener setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUiOptions setuioptions, int i) {
        if (i != 0) {
            if (i != 1) {
                throw new IllegalArgumentException("invalid orientation");
            }
            return new AnonymousClass3(setuioptions);
        }
        return new AnonymousClass4(setuioptions);
    }
}