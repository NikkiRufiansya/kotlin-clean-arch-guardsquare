package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;
import o.EmojiCompatInitializer;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public final class setProgressBackgroundTintMode implements EmojiCompatInitializer.AnonymousClass1, setSubtitleTextAppearance.setX, setOnScrollListener {
    private setSubtitleTextAppearance<ColorFilter, ColorFilter> MenuHostHelper$$ExternalSyntheticLambda0;
    private setExtraMultilineHeightEnabled MenuHostHelper$$ExternalSyntheticLambda1;
    private final Paint ViewPager$SavedState$1;
    private final setSubtitleTextAppearance<Integer, Integer> setCenterIfNoTextEnabled;
    private final List<setTitleEllipsize> setChipCornerRadius;
    private final String setIconSize;
    private final RectF setIconTintList;
    private final boolean setLayoutAnimation;
    private final setSubtitleTextAppearance<PointF, PointF> setMaxEms;
    private final setSubtitleTextAppearance<PointF, PointF> setNavigationOnClickListener;
    private final getCallingWorkSourceUid setOnNavigationItemSelectedListener;
    private final Path setTextAlignment;
    private final setPointerIcon setUiOptions;
    private final setEndIconCheckable setUnboundedRipple;
    private final int setX;
    private final setSubtitleTextAppearance<setHintTextAppearance, setHintTextAppearance> setY;
    private final setPrefixTextAppearance<LinearGradient> setOnLongClickListener = new setPrefixTextAppearance<>();
    private final setPrefixTextAppearance<RadialGradient> setTextScaleX = new setPrefixTextAppearance<>();

    public setProgressBackgroundTintMode(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay) {
        Path path = new Path();
        this.setTextAlignment = path;
        this.ViewPager$SavedState$1 = new setExpandedTitleMarginStart(1);
        this.setIconTintList = new RectF();
        this.setChipCornerRadius = new ArrayList();
        this.setUnboundedRipple = setendiconcheckable;
        this.setIconSize = sethorizontalscrollbaroverlay.setOnLongClickListener;
        this.setLayoutAnimation = sethorizontalscrollbaroverlay.setX;
        this.setUiOptions = setpointericon;
        this.setOnNavigationItemSelectedListener = sethorizontalscrollbaroverlay.MenuHostHelper$$ExternalSyntheticLambda1;
        path.setFillType(sethorizontalscrollbaroverlay.setIconTintList);
        setBoxStrokeErrorColor setboxstrokeerrorcolor = setpointericon.setY;
        this.setX = (int) ((((setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda1 - setboxstrokeerrorcolor.setChipCornerRadius) / setboxstrokeerrorcolor.setIconTintList) * 1000.0f) / 32.0f);
        consumeStableInsets consumestableinsets = new consumeStableInsets(sethorizontalscrollbaroverlay.setY.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setY = consumestableinsets;
        consumestableinsets.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setendiconcheckable.setX.add(consumestableinsets);
        hashCode hashcode = new hashCode(sethorizontalscrollbaroverlay.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setCenterIfNoTextEnabled = hashcode;
        hashcode.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setendiconcheckable.setX.add(hashcode);
        setChildIndicatorBounds setchildindicatorbounds = new setChildIndicatorBounds(sethorizontalscrollbaroverlay.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setMaxEms = setchildindicatorbounds;
        setchildindicatorbounds.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setendiconcheckable.setX.add(setchildindicatorbounds);
        setChildIndicatorBounds setchildindicatorbounds2 = new setChildIndicatorBounds(sethorizontalscrollbaroverlay.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setNavigationOnClickListener = setchildindicatorbounds2;
        setchildindicatorbounds2.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setendiconcheckable.setX.add(setchildindicatorbounds2);
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        this.setUiOptions.invalidateSelf();
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
        for (int i = 0; i < list2.size(); i++) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = list2.get(i);
            if (setcontentinsetstartwithnavigation instanceof setTitleEllipsize) {
                this.setChipCornerRadius.add((setTitleEllipsize) setcontentinsetstartwithnavigation);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(Canvas canvas, Matrix matrix, int i) {
        RadialGradient MenuHostHelper$$ExternalSyntheticLambda0;
        int max;
        if (this.setLayoutAnimation) {
            return;
        }
        this.setTextAlignment.reset();
        for (int i2 = 0; i2 < this.setChipCornerRadius.size(); i2++) {
            this.setTextAlignment.addPath(this.setChipCornerRadius.get(i2).setX(), matrix);
        }
        this.setTextAlignment.computeBounds(this.setIconTintList, false);
        if (this.setOnNavigationItemSelectedListener == getCallingWorkSourceUid.LINEAR) {
            long MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
            MenuHostHelper$$ExternalSyntheticLambda0 = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1, null);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                PointF onLongClickListener = this.setMaxEms.setOnLongClickListener();
                PointF onLongClickListener2 = this.setNavigationOnClickListener.setOnLongClickListener();
                setHintTextAppearance onLongClickListener3 = this.setY.setOnLongClickListener();
                LinearGradient linearGradient = new LinearGradient(onLongClickListener.x, onLongClickListener.y, onLongClickListener2.x, onLongClickListener2.y, setY(onLongClickListener3.setX), onLongClickListener3.MenuHostHelper$$ExternalSyntheticLambda0, Shader.TileMode.CLAMP);
                this.setOnLongClickListener.setX(MenuHostHelper$$ExternalSyntheticLambda1, linearGradient);
                MenuHostHelper$$ExternalSyntheticLambda0 = linearGradient;
            }
        } else {
            long MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1();
            MenuHostHelper$$ExternalSyntheticLambda0 = this.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda12, null);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                PointF onLongClickListener4 = this.setMaxEms.setOnLongClickListener();
                PointF onLongClickListener5 = this.setNavigationOnClickListener.setOnLongClickListener();
                setHintTextAppearance onLongClickListener6 = this.setY.setOnLongClickListener();
                int[] y = setY(onLongClickListener6.setX);
                float[] fArr = onLongClickListener6.MenuHostHelper$$ExternalSyntheticLambda0;
                float f = onLongClickListener4.x;
                float f2 = onLongClickListener4.y;
                float hypot = (float) Math.hypot(onLongClickListener5.x - f, onLongClickListener5.y - f2);
                MenuHostHelper$$ExternalSyntheticLambda0 = new RadialGradient(f, f2, hypot <= 0.0f ? 0.001f : hypot, y, fArr, Shader.TileMode.CLAMP);
                this.setTextScaleX.setX(MenuHostHelper$$ExternalSyntheticLambda12, MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setLocalMatrix(matrix);
        this.ViewPager$SavedState$1.setShader(MenuHostHelper$$ExternalSyntheticLambda0);
        setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setsubtitletextappearance != null) {
            this.ViewPager$SavedState$1.setColorFilter(setsubtitletextappearance.setOnLongClickListener());
        }
        Paint paint = this.ViewPager$SavedState$1;
        max = Math.max(0, Math.min(255, (int) ((((i / 255.0f) * this.setCenterIfNoTextEnabled.setOnLongClickListener().intValue()) / 100.0f) * 255.0f)));
        paint.setAlpha(max);
        canvas.drawPath(this.setTextAlignment, this.ViewPager$SavedState$1);
        int i3 = setIntValues.setX;
        if (i3 > 0) {
            setIntValues.setX = i3 - 1;
        }
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        this.setTextAlignment.reset();
        for (int i = 0; i < this.setChipCornerRadius.size(); i++) {
            this.setTextAlignment.addPath(this.setChipCornerRadius.get(i).setX(), matrix);
        }
        this.setTextAlignment.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setIconSize;
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1() {
        int round = Math.round(this.setMaxEms.setX() * this.setX);
        int round2 = Math.round(this.setNavigationOnClickListener.setX() * this.setX);
        int round3 = Math.round(this.setY.setX() * this.setX);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] setY(int[] iArr) {
        setExtraMultilineHeightEnabled setextramultilineheightenabled = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setextramultilineheightenabled != null) {
            Integer[] numArr = (Integer[]) setextramultilineheightenabled.setOnLongClickListener();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // o.setDropDownBackgroundDrawable
    public final void setIconTintList(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda1(setsupportbackgroundtintlist, i, list, setsupportbackgroundtintlist2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        if (t == setItemViewCacheSize.setUnboundedRipple) {
            this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setY) {
            setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setsubtitletextappearance != null) {
                this.setUnboundedRipple.setX.remove(setsubtitletextappearance);
            }
            if (setprompt == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled = new setExtraMultilineHeightEnabled(setprompt);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setextramultilineheightenabled;
            setextramultilineheightenabled.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setEndIconCheckable setendiconcheckable = this.setUnboundedRipple;
            setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setsubtitletextappearance2 != null) {
                setendiconcheckable.setX.add(setsubtitletextappearance2);
            }
        } else if (t == setItemViewCacheSize.MenuHostHelper$$ExternalSyntheticLambda0) {
            setExtraMultilineHeightEnabled setextramultilineheightenabled2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setextramultilineheightenabled2 != null) {
                this.setUnboundedRipple.setX.remove(setextramultilineheightenabled2);
            }
            if (setprompt == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled3 = new setExtraMultilineHeightEnabled(setprompt);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setextramultilineheightenabled3;
            setextramultilineheightenabled3.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setEndIconCheckable setendiconcheckable2 = this.setUnboundedRipple;
            setExtraMultilineHeightEnabled setextramultilineheightenabled4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setextramultilineheightenabled4 != null) {
                setendiconcheckable2.setX.add(setextramultilineheightenabled4);
            }
        }
    }
}