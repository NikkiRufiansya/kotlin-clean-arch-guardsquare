package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import o.EmojiCompatInitializer;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public final class setShowDividerHorizontal implements EmojiCompatInitializer.AnonymousClass1, setTitleEllipsize, setTouchscreenBlocksFocus, setSubtitleTextAppearance.setX, setOnScrollListener {
    private setFastScrollStyle MenuHostHelper$$ExternalSyntheticLambda0;
    private final setSubtitleTextAppearance<Float, Float> MenuHostHelper$$ExternalSyntheticLambda1;
    private final setPointerIcon setIconTintList;
    private final setChipIconSizeResource setNavigationOnClickListener;
    private final String setUiOptions;
    private final setSubtitleTextAppearance<Float, Float> setUnboundedRipple;
    private final boolean setX;
    private final setEndIconCheckable setY;
    private final Matrix setLayoutAnimation = new Matrix();
    private final Path setOnLongClickListener = new Path();

    public setShowDividerHorizontal(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, setItemActiveIndicatorHeight setitemactiveindicatorheight) {
        this.setIconTintList = setpointericon;
        this.setY = setendiconcheckable;
        this.setUiOptions = setitemactiveindicatorheight.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setX = setitemactiveindicatorheight.setY;
        setOnTouchListener setontouchlistener = new setOnTouchListener(setitemactiveindicatorheight.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setontouchlistener;
        setendiconcheckable.setX.add(setontouchlistener);
        setontouchlistener.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setOnTouchListener setontouchlistener2 = new setOnTouchListener(setitemactiveindicatorheight.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setUnboundedRipple = setontouchlistener2;
        setendiconcheckable.setX.add(setontouchlistener2);
        setontouchlistener2.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setChipIconSizeResource setchipiconsizeresource = new setChipIconSizeResource(setitemactiveindicatorheight.setX);
        this.setNavigationOnClickListener = setchipiconsizeresource;
        setchipiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1(setendiconcheckable);
        setchipiconsizeresource.setX(this);
    }

    @Override // o.setTouchscreenBlocksFocus
    public final void setIconTintList(ListIterator<setContentInsetStartWithNavigation> listIterator) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new setFastScrollStyle(this.setIconTintList, this.setY, "Repeater", this.setX, arrayList, null);
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setUiOptions;
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setX(list, list2);
    }

    @Override // o.setTitleEllipsize
    public final Path setX() {
        Path x = this.MenuHostHelper$$ExternalSyntheticLambda0.setX();
        this.setOnLongClickListener.reset();
        float floatValue = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener().floatValue();
        float floatValue2 = this.setUnboundedRipple.setOnLongClickListener().floatValue();
        for (int i = ((int) floatValue) - 1; i >= 0; i--) {
            this.setLayoutAnimation.set(this.setNavigationOnClickListener.setIconTintList(i + floatValue2));
            this.setOnLongClickListener.addPath(x, this.setLayoutAnimation);
        }
        return this.setOnLongClickListener;
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(Canvas canvas, Matrix matrix, int i) {
        float floatValue = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener().floatValue();
        float floatValue2 = this.setUnboundedRipple.setOnLongClickListener().floatValue();
        float floatValue3 = this.setNavigationOnClickListener.setOnLongClickListener.setOnLongClickListener().floatValue() / 100.0f;
        float floatValue4 = this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener().floatValue() / 100.0f;
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.setLayoutAnimation.set(matrix);
            float f = i2;
            this.setLayoutAnimation.preConcat(this.setNavigationOnClickListener.setIconTintList(f + floatValue2));
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(canvas, this.setLayoutAnimation, (int) (i * setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(floatValue3, floatValue4, f / floatValue)));
        }
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(rectF, matrix, z);
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        this.setIconTintList.invalidateSelf();
    }

    @Override // o.setDropDownBackgroundDrawable
    public final void setIconTintList(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda1(setsupportbackgroundtintlist, i, list, setsupportbackgroundtintlist2, this);
    }

    @Override // o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        if (this.setNavigationOnClickListener.setY(t, setprompt)) {
            return;
        }
        if (t == setItemViewCacheSize.setCenterIfNoTextEnabled) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setMaxEms) {
            this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        }
    }
}