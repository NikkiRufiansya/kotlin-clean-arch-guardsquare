package o;

import android.graphics.Path;
import java.util.List;
import o.ExpandableTransformationBehavior;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public final class setChipIconTint implements setTitleEllipsize, setSubtitleTextAppearance.setX {
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final setPointerIcon setIconTintList;
    private final setSubtitleTextAppearance<?, Path> setNavigationOnClickListener;
    private boolean setX;
    private final boolean setY;
    private final Path MenuHostHelper$$ExternalSyntheticLambda1 = new Path();
    private setDuplicateParentStateEnabled setOnLongClickListener = new setDuplicateParentStateEnabled();

    public setChipIconTint(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, setNavigationIcon setnavigationicon) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setnavigationicon.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setY = setnavigationicon.setY;
        this.setIconTintList = setpointericon;
        setScrollBarStyle setscrollbarstyle = new setScrollBarStyle(setnavigationicon.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setNavigationOnClickListener = setscrollbarstyle;
        setendiconcheckable.setX.add(setscrollbarstyle);
        setscrollbarstyle.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
        for (int i = 0; i < list.size(); i++) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = list.get(i);
            if (setcontentinsetstartwithnavigation instanceof setActiveIndicatorHeight) {
                setActiveIndicatorHeight setactiveindicatorheight = (setActiveIndicatorHeight) setcontentinsetstartwithnavigation;
                if (setactiveindicatorheight.setUnboundedRipple == ExpandableTransformationBehavior.setX.SIMULTANEOUSLY) {
                    this.setOnLongClickListener.setY.add(setactiveindicatorheight);
                    setactiveindicatorheight.setIconTintList.add(this);
                }
            }
        }
    }

    @Override // o.setTitleEllipsize
    public final Path setX() {
        if (this.setX) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.reset();
        if (this.setY) {
            this.setX = true;
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.set(this.setNavigationOnClickListener.setOnLongClickListener());
        this.MenuHostHelper$$ExternalSyntheticLambda1.setFillType(Path.FillType.EVEN_ODD);
        this.setOnLongClickListener.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setX = true;
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        this.setX = false;
        this.setIconTintList.invalidateSelf();
    }
}