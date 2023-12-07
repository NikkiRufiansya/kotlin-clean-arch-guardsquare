package o;

import java.util.List;

/* loaded from: classes.dex */
public final class setOverScrollMode extends setMaxHeight<Integer> {
    public setOverScrollMode(List<setChildIndicatorBoundsRelative<Integer>> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int setIconTintList(setChildIndicatorBoundsRelative<Integer> setchildindicatorboundsrelative, float f) {
        if (setchildindicatorboundsrelative.setUiOptions == null || setchildindicatorboundsrelative.setIconTintList == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = setchildindicatorboundsrelative.setUiOptions.intValue();
        int intValue2 = setchildindicatorboundsrelative.setIconTintList.intValue();
        if (this.setIconTintList != null) {
            setPrompt<A> setprompt = this.setIconTintList;
            float f2 = setchildindicatorboundsrelative.setOnLongClickListener;
            Float f3 = setchildindicatorboundsrelative.setX;
            MenuHostHelper$$ExternalSyntheticLambda1();
            setX();
            Object obj = setprompt.setX;
            Integer num = (Integer) setprompt.setIconTintList;
            if (num != null) {
                return num.intValue();
            }
        }
        return setItemIconSize.setY(setAnimateOnTouchUp.setIconTintList(f, 0.0f, 1.0f), intValue, intValue2);
    }

    public final int setUnboundedRipple() {
        return setIconTintList(setIconTintList(), setY());
    }

    @Override // o.setSubtitleTextAppearance
    final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative setchildindicatorboundsrelative, float f) {
        return Integer.valueOf(setIconTintList(setchildindicatorboundsrelative, f));
    }
}