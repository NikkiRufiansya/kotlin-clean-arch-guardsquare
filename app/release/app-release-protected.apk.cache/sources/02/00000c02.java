package o;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class setGroupIndicator implements getPathData {
    final ExtendedFloatingActionButton MenuHostHelper$$ExternalSyntheticLambda0;
    private FirebaseCommonKtxRegistrar MenuHostHelper$$ExternalSyntheticLambda1;
    private final ArrayList<Animator.AnimatorListener> setIconTintList = new ArrayList<>();
    private final ReflectiveGenericLifecycleObserver setOnLongClickListener;
    private final Context setX;
    private FirebaseCommonKtxRegistrar setY;

    public setGroupIndicator(ExtendedFloatingActionButton extendedFloatingActionButton, ReflectiveGenericLifecycleObserver reflectiveGenericLifecycleObserver) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = extendedFloatingActionButton;
        this.setX = extendedFloatingActionButton.getContext();
        this.setOnLongClickListener = reflectiveGenericLifecycleObserver;
    }

    @Override // o.getPathData
    public final void MenuHostHelper$$ExternalSyntheticLambda1(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = firebaseCommonKtxRegistrar;
    }

    public final FirebaseCommonKtxRegistrar setY() {
        FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (firebaseCommonKtxRegistrar != null) {
            return firebaseCommonKtxRegistrar;
        }
        if (this.setY == null) {
            this.setY = FirebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1(this.setX, setNavigationOnClickListener());
        }
        return this.setY;
    }

    @Override // o.getPathData
    public final List<Animator.AnimatorListener> setX() {
        return this.setIconTintList;
    }

    @Override // o.getPathData
    public void MenuHostHelper$$ExternalSyntheticLambda0(Animator animator) {
        ReflectiveGenericLifecycleObserver reflectiveGenericLifecycleObserver = this.setOnLongClickListener;
        Animator animator2 = reflectiveGenericLifecycleObserver.MenuHostHelper$$ExternalSyntheticLambda1;
        if (animator2 != null) {
            animator2.cancel();
        }
        reflectiveGenericLifecycleObserver.MenuHostHelper$$ExternalSyntheticLambda1 = animator;
    }

    @Override // o.getPathData
    public void setIconTintList() {
        this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 = null;
    }

    @Override // o.getPathData
    public void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1 = null;
    }

    @Override // o.getPathData
    public AnimatorSet MenuHostHelper$$ExternalSyntheticLambda0() {
        return setX(setY());
    }

    public final AnimatorSet setX(FirebaseCommonKtxRegistrar firebaseCommonKtxRegistrar) {
        ArrayList arrayList = new ArrayList();
        if (firebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1.get("opacity") != null) {
            arrayList.add(firebaseCommonKtxRegistrar.setX("opacity", this.MenuHostHelper$$ExternalSyntheticLambda0, View.ALPHA));
        }
        if (firebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1.get("scale") != null) {
            arrayList.add(firebaseCommonKtxRegistrar.setX("scale", this.MenuHostHelper$$ExternalSyntheticLambda0, View.SCALE_Y));
            arrayList.add(firebaseCommonKtxRegistrar.setX("scale", this.MenuHostHelper$$ExternalSyntheticLambda0, View.SCALE_X));
        }
        if (firebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1.get("width") != null) {
            arrayList.add(firebaseCommonKtxRegistrar.setX("width", this.MenuHostHelper$$ExternalSyntheticLambda0, ExtendedFloatingActionButton.setOnLongClickListener));
        }
        if (firebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1.get("height") != null) {
            arrayList.add(firebaseCommonKtxRegistrar.setX("height", this.MenuHostHelper$$ExternalSyntheticLambda0, ExtendedFloatingActionButton.setUnboundedRipple));
        }
        if (firebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1.get("paddingStart") != null) {
            arrayList.add(firebaseCommonKtxRegistrar.setX("paddingStart", this.MenuHostHelper$$ExternalSyntheticLambda0, ExtendedFloatingActionButton.setLayoutAnimation));
        }
        if (firebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1.get("paddingEnd") != null) {
            arrayList.add(firebaseCommonKtxRegistrar.setX("paddingEnd", this.MenuHostHelper$$ExternalSyntheticLambda0, ExtendedFloatingActionButton.setNavigationOnClickListener));
        }
        if (firebaseCommonKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda1.get("labelOpacity") != null) {
            arrayList.add(firebaseCommonKtxRegistrar.setX("labelOpacity", this.MenuHostHelper$$ExternalSyntheticLambda0, new Property<ExtendedFloatingActionButton, Float>(Float.class, "LABEL_OPACITY_PROPERTY") { // from class: o.setGroupIndicator.4
                @Override // android.util.Property
                public final /* synthetic */ Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
                    ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
                    return Float.valueOf(((Color.alpha(extendedFloatingActionButton2.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton2.setAnimationFromJson.getColorForState(extendedFloatingActionButton2.getDrawableState(), setGroupIndicator.this.MenuHostHelper$$ExternalSyntheticLambda0.setAnimationFromJson.getDefaultColor()))) + 0.0f);
                }

                @Override // android.util.Property
                public final /* synthetic */ void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f) {
                    ExtendedFloatingActionButton extendedFloatingActionButton2 = extendedFloatingActionButton;
                    Float f2 = f;
                    int colorForState = extendedFloatingActionButton2.setAnimationFromJson.getColorForState(extendedFloatingActionButton2.getDrawableState(), setGroupIndicator.this.MenuHostHelper$$ExternalSyntheticLambda0.setAnimationFromJson.getDefaultColor());
                    ColorStateList valueOf = ColorStateList.valueOf(Color.argb((int) (((f2.floatValue() * (Color.alpha(colorForState) / 255.0f)) + 0.0f) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
                    if (f2.floatValue() == 1.0f) {
                        extendedFloatingActionButton2.MenuHostHelper$$ExternalSyntheticLambda1(extendedFloatingActionButton2.setAnimationFromJson);
                    } else {
                        extendedFloatingActionButton2.MenuHostHelper$$ExternalSyntheticLambda1(valueOf);
                    }
                }
            }));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        setImeActionLabel.setX(animatorSet, arrayList);
        return animatorSet;
    }
}