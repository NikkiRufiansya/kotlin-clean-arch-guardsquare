package o;

import java.util.List;

/* loaded from: classes.dex */
public final class hashCode extends setMaxHeight<Integer> {
    public hashCode(List<setChildIndicatorBoundsRelative<Integer>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int setIconTintList(setChildIndicatorBoundsRelative<Integer> setchildindicatorboundsrelative, float f) {
        if (setchildindicatorboundsrelative.setUiOptions == null || setchildindicatorboundsrelative.setIconTintList == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.setIconTintList != null) {
            setPrompt<A> setprompt = this.setIconTintList;
            float f2 = setchildindicatorboundsrelative.setOnLongClickListener;
            Float f3 = setchildindicatorboundsrelative.setX;
            Integer num = setchildindicatorboundsrelative.setUiOptions;
            Integer num2 = setchildindicatorboundsrelative.setIconTintList;
            MenuHostHelper$$ExternalSyntheticLambda1();
            setX();
            Object obj = setprompt.setX;
            Integer num3 = (Integer) setprompt.setIconTintList;
            if (num3 != null) {
                return num3.intValue();
            }
        }
        if (setchildindicatorboundsrelative.setTextAlignment == 784923401) {
            setchildindicatorboundsrelative.setTextAlignment = setchildindicatorboundsrelative.setUiOptions.intValue();
        }
        int i = setchildindicatorboundsrelative.setTextAlignment;
        if (setchildindicatorboundsrelative.MenuHostHelper$$ExternalSyntheticLambda1 == 784923401) {
            setchildindicatorboundsrelative.MenuHostHelper$$ExternalSyntheticLambda1 = setchildindicatorboundsrelative.setIconTintList.intValue();
        }
        return setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda1(i, setchildindicatorboundsrelative.MenuHostHelper$$ExternalSyntheticLambda1, f);
    }

    public final int setUiOptions() {
        return setIconTintList(setIconTintList(), setY());
    }

    @Override // o.setSubtitleTextAppearance
    final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative setchildindicatorboundsrelative, float f) {
        return Integer.valueOf(setIconTintList(setchildindicatorboundsrelative, f));
    }
}