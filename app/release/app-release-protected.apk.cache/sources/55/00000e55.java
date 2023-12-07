package o;

import java.util.List;

/* loaded from: classes.dex */
public final class setOnTouchListener extends setMaxHeight<Float> {
    public setOnTouchListener(List<setChildIndicatorBoundsRelative<Float>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private float setX(setChildIndicatorBoundsRelative<Float> setchildindicatorboundsrelative, float f) {
        if (setchildindicatorboundsrelative.setUiOptions == null || setchildindicatorboundsrelative.setIconTintList == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.setIconTintList != null) {
            setPrompt<A> setprompt = this.setIconTintList;
            float f2 = setchildindicatorboundsrelative.setOnLongClickListener;
            Float f3 = setchildindicatorboundsrelative.setX;
            Float f4 = setchildindicatorboundsrelative.setUiOptions;
            Float f5 = setchildindicatorboundsrelative.setIconTintList;
            MenuHostHelper$$ExternalSyntheticLambda1();
            setX();
            Object obj = setprompt.setX;
            Float f6 = (Float) setprompt.setIconTintList;
            if (f6 != null) {
                return f6.floatValue();
            }
        }
        if (setchildindicatorboundsrelative.setIconSize == -3987645.8f) {
            setchildindicatorboundsrelative.setIconSize = setchildindicatorboundsrelative.setUiOptions.floatValue();
        }
        float f7 = setchildindicatorboundsrelative.setIconSize;
        if (setchildindicatorboundsrelative.setY == -3987645.8f) {
            setchildindicatorboundsrelative.setY = setchildindicatorboundsrelative.setIconTintList.floatValue();
        }
        return setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(f7, setchildindicatorboundsrelative.setY, f);
    }

    public final float setUiOptions() {
        return setX(setIconTintList(), setY());
    }

    @Override // o.setSubtitleTextAppearance
    final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative setchildindicatorboundsrelative, float f) {
        return Float.valueOf(setX(setchildindicatorboundsrelative, f));
    }
}