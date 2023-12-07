package o;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;
import o.ExpandableTransformationBehavior;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public final class setBaseline implements setSubtitleTextAppearance.setX, setOnScrollListener, setTitleEllipsize {
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private final setSubtitleTextAppearance<?, Float> MenuHostHelper$$ExternalSyntheticLambda1;
    private final boolean setIconTintList;
    private final setSubtitleTextAppearance<?, PointF> setUiOptions;
    private final setSubtitleTextAppearance<?, PointF> setUnboundedRipple;
    private final setPointerIcon setX;
    private final String setY;
    private final Path setLayoutAnimation = new Path();
    private final RectF setOnLongClickListener = new RectF();
    private setDuplicateParentStateEnabled setNavigationOnClickListener = new setDuplicateParentStateEnabled();

    public setBaseline(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, setBoxStrokeWidth setboxstrokewidth) {
        this.setY = setboxstrokewidth.setY;
        this.setIconTintList = setboxstrokewidth.setX;
        this.setX = setpointericon;
        setSubtitleTextAppearance<PointF, PointF> x = setboxstrokewidth.MenuHostHelper$$ExternalSyntheticLambda0.setX();
        this.setUiOptions = x;
        setChildIndicatorBounds setchildindicatorbounds = new setChildIndicatorBounds(setboxstrokewidth.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setUnboundedRipple = setchildindicatorbounds;
        setOnTouchListener setontouchlistener = new setOnTouchListener(setboxstrokewidth.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setontouchlistener;
        setendiconcheckable.setX.add(x);
        setendiconcheckable.setX.add(setchildindicatorbounds);
        setendiconcheckable.setX.add(setontouchlistener);
        x.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setchildindicatorbounds.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setontouchlistener.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
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

    @Override // o.setTitleEllipsize
    public final Path setX() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return this.setLayoutAnimation;
        }
        this.setLayoutAnimation.reset();
        if (this.setIconTintList) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            return this.setLayoutAnimation;
        }
        PointF onLongClickListener = this.setUnboundedRipple.setOnLongClickListener();
        float f = onLongClickListener.x / 2.0f;
        float f2 = onLongClickListener.y / 2.0f;
        setSubtitleTextAppearance<?, Float> setsubtitletextappearance = this.MenuHostHelper$$ExternalSyntheticLambda1;
        float uiOptions = setsubtitletextappearance == null ? 0.0f : ((setOnTouchListener) setsubtitletextappearance).setUiOptions();
        float min = Math.min(f, f2);
        if (uiOptions > min) {
            uiOptions = min;
        }
        PointF onLongClickListener2 = this.setUiOptions.setOnLongClickListener();
        this.setLayoutAnimation.moveTo(onLongClickListener2.x + f, (onLongClickListener2.y - f2) + uiOptions);
        this.setLayoutAnimation.lineTo(onLongClickListener2.x + f, (onLongClickListener2.y + f2) - uiOptions);
        int i = (uiOptions > 0.0f ? 1 : (uiOptions == 0.0f ? 0 : -1));
        if (i > 0) {
            float f3 = uiOptions * 2.0f;
            this.setOnLongClickListener.set((onLongClickListener2.x + f) - f3, (onLongClickListener2.y + f2) - f3, onLongClickListener2.x + f, onLongClickListener2.y + f2);
            this.setLayoutAnimation.arcTo(this.setOnLongClickListener, 0.0f, 90.0f, false);
        }
        this.setLayoutAnimation.lineTo((onLongClickListener2.x - f) + uiOptions, onLongClickListener2.y + f2);
        if (i > 0) {
            float f4 = uiOptions * 2.0f;
            this.setOnLongClickListener.set(onLongClickListener2.x - f, (onLongClickListener2.y + f2) - f4, (onLongClickListener2.x - f) + f4, onLongClickListener2.y + f2);
            this.setLayoutAnimation.arcTo(this.setOnLongClickListener, 90.0f, 90.0f, false);
        }
        this.setLayoutAnimation.lineTo(onLongClickListener2.x - f, (onLongClickListener2.y - f2) + uiOptions);
        if (i > 0) {
            float f5 = uiOptions * 2.0f;
            this.setOnLongClickListener.set(onLongClickListener2.x - f, onLongClickListener2.y - f2, (onLongClickListener2.x - f) + f5, (onLongClickListener2.y - f2) + f5);
            this.setLayoutAnimation.arcTo(this.setOnLongClickListener, 180.0f, 90.0f, false);
        }
        this.setLayoutAnimation.lineTo((onLongClickListener2.x + f) - uiOptions, onLongClickListener2.y - f2);
        if (i > 0) {
            float f6 = uiOptions * 2.0f;
            this.setOnLongClickListener.set((onLongClickListener2.x + f) - f6, onLongClickListener2.y - f2, onLongClickListener2.x + f, (onLongClickListener2.y - f2) + f6);
            this.setLayoutAnimation.arcTo(this.setOnLongClickListener, 270.0f, 90.0f, false);
        }
        this.setLayoutAnimation.close();
        this.setNavigationOnClickListener.setIconTintList(this.setLayoutAnimation);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        return this.setLayoutAnimation;
    }

    @Override // o.setDropDownBackgroundDrawable
    public final void setIconTintList(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda1(setsupportbackgroundtintlist, i, list, setsupportbackgroundtintlist2, this);
    }

    @Override // o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        if (t == setItemViewCacheSize.setChipCornerRadius) {
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setTextAlignment) {
            this.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setX) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        }
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        this.setX.invalidateSelf();
    }
}