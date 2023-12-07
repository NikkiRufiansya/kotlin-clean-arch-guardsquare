package o;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Map;

/* loaded from: classes.dex */
public final class create extends setRendererPriorityPolicy {
    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        setX(windowInsetsCompat$Impl);
    }

    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        setX(windowInsetsCompat$Impl);
    }

    private static void setX(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        if (windowInsetsCompat$Impl.setX instanceof TextView) {
            windowInsetsCompat$Impl.setY.put("android:textscale:scale", Float.valueOf(((TextView) windowInsetsCompat$Impl.setX).getScaleX()));
        }
    }

    @Override // o.setRendererPriorityPolicy
    public final Animator setIconTintList(ViewGroup viewGroup, WindowInsetsCompat$Impl windowInsetsCompat$Impl, WindowInsetsCompat$Impl windowInsetsCompat$Impl2) {
        if (windowInsetsCompat$Impl == null || windowInsetsCompat$Impl2 == null || !(windowInsetsCompat$Impl.setX instanceof TextView) || !(windowInsetsCompat$Impl2.setX instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) windowInsetsCompat$Impl2.setX;
        Map<String, Object> map = windowInsetsCompat$Impl.setY;
        Map<String, Object> map2 = windowInsetsCompat$Impl2.setY;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.create.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(floatValue3);
                textView.setScaleY(floatValue3);
            }
        });
        return ofFloat;
    }
}