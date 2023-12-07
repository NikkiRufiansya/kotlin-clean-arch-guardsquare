package o;

import java.util.ArrayList;
import java.util.List;
import o.ExpandableTransformationBehavior;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public final class setActiveIndicatorHeight implements setContentInsetStartWithNavigation, setSubtitleTextAppearance.setX {
    public final setSubtitleTextAppearance<?, Float> MenuHostHelper$$ExternalSyntheticLambda0;
    public final setSubtitleTextAppearance<?, Float> MenuHostHelper$$ExternalSyntheticLambda1;
    final List<setSubtitleTextAppearance.setX> setIconTintList = new ArrayList();
    private final String setUiOptions;
    final ExpandableTransformationBehavior.setX setUnboundedRipple;
    public final boolean setX;
    public final setSubtitleTextAppearance<?, Float> setY;

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
    }

    public setActiveIndicatorHeight(setEndIconCheckable setendiconcheckable, ExpandableTransformationBehavior expandableTransformationBehavior) {
        this.setUiOptions = expandableTransformationBehavior.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setX = expandableTransformationBehavior.setY;
        this.setUnboundedRipple = expandableTransformationBehavior.setOnLongClickListener;
        setOnTouchListener setontouchlistener = new setOnTouchListener(expandableTransformationBehavior.setX.MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setontouchlistener;
        setOnTouchListener setontouchlistener2 = new setOnTouchListener(expandableTransformationBehavior.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setY = setontouchlistener2;
        setOnTouchListener setontouchlistener3 = new setOnTouchListener(expandableTransformationBehavior.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setontouchlistener3;
        setendiconcheckable.setX.add(setontouchlistener);
        setendiconcheckable.setX.add(setontouchlistener2);
        setendiconcheckable.setX.add(setontouchlistener3);
        setontouchlistener.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setontouchlistener2.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setontouchlistener3.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        for (int i = 0; i < this.setIconTintList.size(); i++) {
            this.setIconTintList.get(i).setY();
        }
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setUiOptions;
    }
}