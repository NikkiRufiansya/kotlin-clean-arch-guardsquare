package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.EmojiCompatInitializer;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public final class setFontAssetDelegate implements EmojiCompatInitializer.AnonymousClass1, setSubtitleTextAppearance.setX, setOnScrollListener {
    private setSubtitleTextAppearance<ColorFilter, ColorFilter> MenuHostHelper$$ExternalSyntheticLambda0;
    private final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final setPointerIcon setIconTintList;
    private final String setLayoutAnimation;
    private final Path setNavigationOnClickListener;
    private final setSubtitleTextAppearance<Integer, Integer> setOnLongClickListener;
    private final List<setTitleEllipsize> setUiOptions;
    private final Paint setUnboundedRipple;
    private final setEndIconCheckable setX;
    private final setSubtitleTextAppearance<Integer, Integer> setY;

    public setFontAssetDelegate(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, setTextStartPadding settextstartpadding) {
        Path path = new Path();
        this.setNavigationOnClickListener = path;
        this.setUnboundedRipple = new setExpandedTitleMarginStart(1);
        this.setUiOptions = new ArrayList();
        this.setX = setendiconcheckable;
        this.setLayoutAnimation = settextstartpadding.setIconTintList;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = settextstartpadding.setY;
        this.setIconTintList = setpointericon;
        if (settextstartpadding.MenuHostHelper$$ExternalSyntheticLambda0 == null || settextstartpadding.setX == null) {
            this.setY = null;
            this.setOnLongClickListener = null;
            return;
        }
        path.setFillType(settextstartpadding.MenuHostHelper$$ExternalSyntheticLambda1);
        setOverScrollMode setoverscrollmode = new setOverScrollMode(settextstartpadding.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setY = setoverscrollmode;
        setoverscrollmode.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setendiconcheckable.setX.add(setoverscrollmode);
        hashCode hashcode = new hashCode(settextstartpadding.setX.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setOnLongClickListener = hashcode;
        hashcode.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setendiconcheckable.setX.add(hashcode);
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        this.setIconTintList.invalidateSelf();
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
        for (int i = 0; i < list2.size(); i++) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = list2.get(i);
            if (setcontentinsetstartwithnavigation instanceof setTitleEllipsize) {
                this.setUiOptions.add((setTitleEllipsize) setcontentinsetstartwithnavigation);
            }
        }
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setLayoutAnimation;
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(Canvas canvas, Matrix matrix, int i) {
        int max;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return;
        }
        this.setUnboundedRipple.setColor(((setOverScrollMode) this.setY).setUnboundedRipple());
        Paint paint = this.setUnboundedRipple;
        max = Math.max(0, Math.min(255, (int) ((((i / 255.0f) * this.setOnLongClickListener.setOnLongClickListener().intValue()) / 100.0f) * 255.0f)));
        paint.setAlpha(max);
        setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setsubtitletextappearance != null) {
            this.setUnboundedRipple.setColorFilter(setsubtitletextappearance.setOnLongClickListener());
        }
        this.setNavigationOnClickListener.reset();
        for (int i2 = 0; i2 < this.setUiOptions.size(); i2++) {
            this.setNavigationOnClickListener.addPath(this.setUiOptions.get(i2).setX(), matrix);
        }
        canvas.drawPath(this.setNavigationOnClickListener, this.setUnboundedRipple);
        int i3 = setIntValues.setX;
        if (i3 > 0) {
            setIntValues.setX = i3 - 1;
        }
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        this.setNavigationOnClickListener.reset();
        for (int i = 0; i < this.setUiOptions.size(); i++) {
            this.setNavigationOnClickListener.addPath(this.setUiOptions.get(i).setX(), matrix);
        }
        this.setNavigationOnClickListener.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // o.setDropDownBackgroundDrawable
    public final void setIconTintList(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda1(setsupportbackgroundtintlist, i, list, setsupportbackgroundtintlist2, this);
    }

    @Override // o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        if (t == setItemViewCacheSize.setIconTintList) {
            this.setY.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setUnboundedRipple) {
            this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setY) {
            setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setsubtitletextappearance != null) {
                this.setX.setX.remove(setsubtitletextappearance);
            }
            if (setprompt == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled = new setExtraMultilineHeightEnabled(setprompt);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setextramultilineheightenabled;
            setextramultilineheightenabled.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setEndIconCheckable setendiconcheckable = this.setX;
            setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setsubtitletextappearance2 != null) {
                setendiconcheckable.setX.add(setsubtitletextappearance2);
            }
        }
    }
}