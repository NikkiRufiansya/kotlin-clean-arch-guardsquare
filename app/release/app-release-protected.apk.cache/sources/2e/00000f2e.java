package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setScrollBarFadeDuration {
    static final Property<View, Float> setIconTintList;
    private static final findFragmentByTag setX;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            setX = new setStartIconOnClickListener() { // from class: o.PerfSession$1
                @Override // o.setShrinkMotionSpecResource, o.findFragmentByTag
                public void setX(View view, float f) {
                    view.setTransitionAlpha(f);
                }

                @Override // o.setShrinkMotionSpecResource, o.findFragmentByTag
                public float setY(View view) {
                    float transitionAlpha;
                    transitionAlpha = view.getTransitionAlpha();
                    return transitionAlpha;
                }

                @Override // o.setStartIconOnClickListener, o.findFragmentByTag
                public void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
                    view.setTransitionVisibility(i);
                }

                @Override // o.setMaxProgress, o.findFragmentByTag
                public void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i, int i2, int i3, int i4) {
                    view.setLeftTopRightBottom(i, i2, i3, i4);
                }

                @Override // o.setPressable, o.findFragmentByTag
                public void setX(View view, Matrix matrix) {
                    view.transformMatrixToGlobal(matrix);
                }

                @Override // o.setPressable, o.findFragmentByTag
                public void MenuHostHelper$$ExternalSyntheticLambda0(View view, Matrix matrix) {
                    view.transformMatrixToLocal(matrix);
                }
            };
        } else if (Build.VERSION.SDK_INT >= 23) {
            setX = new setStartIconOnClickListener();
        } else if (Build.VERSION.SDK_INT >= 22) {
            setX = new setMaxProgress();
        } else {
            setX = new setPressable();
        }
        setIconTintList = new Property<View, Float>(Float.class, "translationAlpha") { // from class: o.setScrollBarFadeDuration.4
            @Override // android.util.Property
            public final /* synthetic */ Float get(View view) {
                return Float.valueOf(setScrollBarFadeDuration.setX(view));
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(View view, Float f) {
                setScrollBarFadeDuration.setX(view, f.floatValue());
            }
        };
        new Property<View, Rect>(Rect.class, "clipBounds") { // from class: o.setScrollBarFadeDuration.2
            @Override // android.util.Property
            public final /* synthetic */ Rect get(View view) {
                return setBaselineAlignBottom.setOnLongClickListener(view);
            }

            @Override // android.util.Property
            public final /* synthetic */ void set(View view, Rect rect) {
                view.setClipBounds(rect);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setActivated setY(View view) {
        return new setPadding(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setX(View view, float f) {
        setX.setX(view, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float setX(View view) {
        return setX.setY(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setY(View view, int i) {
        setX.MenuHostHelper$$ExternalSyntheticLambda1(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setY(View view, Matrix matrix) {
        setX.MenuHostHelper$$ExternalSyntheticLambda0(view, matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setX(View view, int i, int i2, int i3, int i4) {
        setX.MenuHostHelper$$ExternalSyntheticLambda1(view, i, i2, i3, i4);
    }
}