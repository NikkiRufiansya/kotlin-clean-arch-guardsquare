package o;

import java.util.List;

/* loaded from: classes.dex */
public final class consumeStableInsets extends setMaxHeight<setHintTextAppearance> {
    private final setHintTextAppearance setNavigationOnClickListener;

    public consumeStableInsets(List<setChildIndicatorBoundsRelative<setHintTextAppearance>> list) {
        super(list);
        setHintTextAppearance sethinttextappearance = list.get(0).setUiOptions;
        int length = sethinttextappearance != null ? sethinttextappearance.setX.length : 0;
        this.setNavigationOnClickListener = new setHintTextAppearance(new float[length], new int[length]);
    }

    @Override // o.setSubtitleTextAppearance
    final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative setchildindicatorboundsrelative, float f) {
        setHintTextAppearance sethinttextappearance = this.setNavigationOnClickListener;
        setHintTextAppearance sethinttextappearance2 = (setHintTextAppearance) setchildindicatorboundsrelative.setUiOptions;
        setHintTextAppearance sethinttextappearance3 = (setHintTextAppearance) setchildindicatorboundsrelative.setIconTintList;
        if (sethinttextappearance2.setX.length != sethinttextappearance3.setX.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(sethinttextappearance2.setX.length);
            sb.append(" vs ");
            sb.append(sethinttextappearance3.setX.length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        for (int i = 0; i < sethinttextappearance2.setX.length; i++) {
            sethinttextappearance.MenuHostHelper$$ExternalSyntheticLambda0[i] = setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(sethinttextappearance2.MenuHostHelper$$ExternalSyntheticLambda0[i], sethinttextappearance3.MenuHostHelper$$ExternalSyntheticLambda0[i], f);
            sethinttextappearance.setX[i] = setItemIconSize.setY(f, sethinttextappearance2.setX[i], sethinttextappearance3.setX[i]);
        }
        return this.setNavigationOnClickListener;
    }
}