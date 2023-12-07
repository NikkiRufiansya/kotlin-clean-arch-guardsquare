package o;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;
import o.ExpandableTransformationBehavior;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements setTitleEllipsize, setSubtitleTextAppearance.setX, setOnScrollListener {
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final setPointerIcon MenuHostHelper$$ExternalSyntheticLambda1;
    private final setChipSpacing setIconTintList;
    private final setSubtitleTextAppearance<?, PointF> setOnLongClickListener;
    private final setSubtitleTextAppearance<?, PointF> setUnboundedRipple;
    private boolean setX;
    private final Path setY = new Path();
    private setDuplicateParentStateEnabled setNavigationOnClickListener = new setDuplicateParentStateEnabled();

    public CompositeGeneratedAdaptersObserver(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, setChipSpacing setchipspacing) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setchipspacing.setIconTintList;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setpointericon;
        setChildIndicatorBounds setchildindicatorbounds = new setChildIndicatorBounds(setchipspacing.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setOnLongClickListener = setchildindicatorbounds;
        setSubtitleTextAppearance<PointF, PointF> x = setchipspacing.MenuHostHelper$$ExternalSyntheticLambda1.setX();
        this.setUnboundedRipple = x;
        this.setIconTintList = setchipspacing;
        setendiconcheckable.setX.add(setchildindicatorbounds);
        setendiconcheckable.setX.add(x);
        setchildindicatorbounds.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        x.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
        for (int i = 0; i < list.size(); i++) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = list.get(i);
            if (setcontentinsetstartwithnavigation instanceof setActiveIndicatorHeight) {
                setActiveIndicatorHeight setactiveindicatorheight = (setActiveIndicatorHeight) setcontentinsetstartwithnavigation;
                if (setactiveindicatorheight.setUnboundedRipple == ExpandableTransformationBehavior.setX.SIMULTANEOUSLY) {
                    this.setNavigationOnClickListener.setY.add(setactiveindicatorheight);
                    setactiveindicatorheight.setIconTintList.add(this);
                }
            }
        }
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setTitleEllipsize
    public final Path setX() {
        if (this.setX) {
            return this.setY;
        }
        this.setY.reset();
        if (this.setIconTintList.setX) {
            this.setX = true;
            return this.setY;
        }
        PointF onLongClickListener = this.setOnLongClickListener.setOnLongClickListener();
        float f = onLongClickListener.x / 2.0f;
        float f2 = onLongClickListener.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.setY.reset();
        if (this.setIconTintList.setY) {
            float f5 = -f2;
            this.setY.moveTo(0.0f, f5);
            float f6 = 0.0f - f3;
            float f7 = -f;
            float f8 = 0.0f - f4;
            this.setY.cubicTo(f6, f5, f7, f8, f7, 0.0f);
            float f9 = f4 + 0.0f;
            this.setY.cubicTo(f7, f9, f6, f2, 0.0f, f2);
            float f10 = f3 + 0.0f;
            this.setY.cubicTo(f10, f2, f, f9, f, 0.0f);
            this.setY.cubicTo(f, f8, f10, f5, 0.0f, f5);
        } else {
            float f11 = -f2;
            this.setY.moveTo(0.0f, f11);
            float f12 = f3 + 0.0f;
            float f13 = 0.0f - f4;
            this.setY.cubicTo(f12, f11, f, f13, f, 0.0f);
            float f14 = f4 + 0.0f;
            this.setY.cubicTo(f, f14, f12, f2, 0.0f, f2);
            float f15 = 0.0f - f3;
            float f16 = -f;
            this.setY.cubicTo(f15, f2, f16, f14, f16, 0.0f);
            this.setY.cubicTo(f16, f13, f15, f11, 0.0f, f11);
        }
        PointF onLongClickListener2 = this.setUnboundedRipple.setOnLongClickListener();
        this.setY.offset(onLongClickListener2.x, onLongClickListener2.y);
        this.setY.close();
        this.setNavigationOnClickListener.setIconTintList(this.setY);
        this.setX = true;
        return this.setY;
    }

    @Override // o.setDropDownBackgroundDrawable
    public final void setIconTintList(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda1(setsupportbackgroundtintlist, i, list, setsupportbackgroundtintlist2, this);
    }

    @Override // o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        if (t == setItemViewCacheSize.MenuHostHelper$$ExternalSyntheticLambda1) {
            this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setTextAlignment) {
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        }
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        this.setX = false;
        this.MenuHostHelper$$ExternalSyntheticLambda1.invalidateSelf();
    }
}