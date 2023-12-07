package o;

import java.util.List;

/* loaded from: classes.dex */
public final class CheckableImageButton$SavedState$1 extends setMaxHeight<setLineSpacingAdd> {
    private final setLineSpacingAdd setNavigationOnClickListener;

    public CheckableImageButton$SavedState$1(List<setChildIndicatorBoundsRelative<setLineSpacingAdd>> list) {
        super(list);
        this.setNavigationOnClickListener = new setLineSpacingAdd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setSubtitleTextAppearance
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative setchildindicatorboundsrelative, float f) {
        if (setchildindicatorboundsrelative.setUiOptions == 0 || setchildindicatorboundsrelative.setIconTintList == 0) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        setLineSpacingAdd setlinespacingadd = (setLineSpacingAdd) setchildindicatorboundsrelative.setUiOptions;
        setLineSpacingAdd setlinespacingadd2 = (setLineSpacingAdd) setchildindicatorboundsrelative.setIconTintList;
        if (this.setIconTintList != null) {
            setPrompt<A> setprompt = this.setIconTintList;
            float f2 = setchildindicatorboundsrelative.setOnLongClickListener;
            Float f3 = setchildindicatorboundsrelative.setX;
            MenuHostHelper$$ExternalSyntheticLambda1();
            setX();
            Object obj = setprompt.setX;
            setLineSpacingAdd setlinespacingadd3 = (setLineSpacingAdd) setprompt.setIconTintList;
            if (setlinespacingadd3 != null) {
                return setlinespacingadd3;
            }
        }
        setLineSpacingAdd setlinespacingadd4 = this.setNavigationOnClickListener;
        float MenuHostHelper$$ExternalSyntheticLambda0 = setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(setlinespacingadd.MenuHostHelper$$ExternalSyntheticLambda0, setlinespacingadd2.MenuHostHelper$$ExternalSyntheticLambda0, f);
        float MenuHostHelper$$ExternalSyntheticLambda02 = setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(setlinespacingadd.MenuHostHelper$$ExternalSyntheticLambda1, setlinespacingadd2.MenuHostHelper$$ExternalSyntheticLambda1, f);
        setlinespacingadd4.MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0;
        setlinespacingadd4.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda02;
        return this.setNavigationOnClickListener;
    }
}