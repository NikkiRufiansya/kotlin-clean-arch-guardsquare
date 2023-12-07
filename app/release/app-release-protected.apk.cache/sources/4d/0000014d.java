package o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;

/* loaded from: classes.dex */
public final class AppDatabase extends setPrefixText {
    public AppDatabase(int i) {
        setX(i);
    }

    public AppDatabase() {
    }

    public AppDatabase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setChipBackgroundColor.setY);
        setX(setHandwritingBoundsOffsets.setX(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, setCenterIfNoTextEnabled()));
        obtainStyledAttributes.recycle();
    }

    @Override // o.setPrefixText, o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(windowInsetsCompat$Impl);
        windowInsetsCompat$Impl.setY.put("android:fade:transitionAlpha", Float.valueOf(setScrollBarFadeDuration.setX(windowInsetsCompat$Impl.setX)));
    }

    private Animator setIconTintList(final View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        setScrollBarFadeDuration.setX(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, setScrollBarFadeDuration.setIconTintList, f2);
        ofFloat.addListener(new setY(view));
        setY(new setBoxBackgroundColor() { // from class: o.AppDatabase.3
            @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
            public final void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy setrendererprioritypolicy) {
                setScrollBarFadeDuration.setX(view, 1.0f);
                setScrollBarFadeDuration.setX.setIconTintList(view);
                setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        });
        return ofFloat;
    }

    @Override // o.setPrefixText
    public final Animator setIconTintList(View view, WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        float x = setX(windowInsetsCompat$Impl, 0.0f);
        return setIconTintList(view, x != 1.0f ? x : 0.0f, 1.0f);
    }

    @Override // o.setPrefixText
    public final Animator setX(View view, WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        setScrollBarFadeDuration.setX.MenuHostHelper$$ExternalSyntheticLambda1(view);
        return setIconTintList(view, setX(windowInsetsCompat$Impl, 1.0f), 0.0f);
    }

    private static float setX(WindowInsetsCompat$Impl windowInsetsCompat$Impl, float f) {
        Float f2;
        return (windowInsetsCompat$Impl == null || (f2 = (Float) windowInsetsCompat$Impl.setY.get("android:fade:transitionAlpha")) == null) ? f : f2.floatValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY extends AnimatorListenerAdapter {
        private boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
        private final View setY;

        setY(View view) {
            this.setY = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (setBaselineAlignBottom.setHasDecor(this.setY) && this.setY.getLayerType() == 0) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                this.setY.setLayerType(2, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            setScrollBarFadeDuration.setX(this.setY, 1.0f);
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                this.setY.setLayerType(0, null);
            }
        }
    }
}