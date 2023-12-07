package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.EmojiCompatInitializer;
import o.ExpandableTransformationBehavior;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public abstract class onActivityPreDestroyed implements setSubtitleTextAppearance.setX, setOnScrollListener, EmojiCompatInitializer.AnonymousClass1 {
    final Paint MenuHostHelper$$ExternalSyntheticLambda0;
    private final setSubtitleTextAppearance<?, Float> MenuHostHelper$$ExternalSyntheticLambda1;
    private final setSubtitleTextAppearance<?, Float> ViewPager$SavedState$1;
    protected final setEndIconCheckable setIconTintList;
    private final setSubtitleTextAppearance<?, Integer> setOnLongClickListener;
    private final float[] setUiOptions;
    private final setPointerIcon setUnboundedRipple;
    private setSubtitleTextAppearance<ColorFilter, ColorFilter> setX;
    private final List<setSubtitleTextAppearance<?, Float>> setY;
    private final PathMeasure setIconSize = new PathMeasure();
    private final Path setLayoutAnimation = new Path();
    private final Path setCenterIfNoTextEnabled = new Path();
    private final RectF setTextAlignment = new RectF();
    private final List<onActivityPreDestroyed$MenuHostHelper$$ExternalSyntheticLambda1> setNavigationOnClickListener = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public onActivityPreDestroyed(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable, Paint.Cap cap, Paint.Join join, float f, setFirstDayOfWeek setfirstdayofweek, setOnReceiveContentListener setonreceivecontentlistener, List<setOnReceiveContentListener> list, setOnReceiveContentListener setonreceivecontentlistener2) {
        setExpandedTitleMarginStart setexpandedtitlemarginstart = new setExpandedTitleMarginStart(1);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setexpandedtitlemarginstart;
        this.setUnboundedRipple = setpointericon;
        this.setIconTintList = setendiconcheckable;
        setexpandedtitlemarginstart.setStyle(Paint.Style.STROKE);
        setexpandedtitlemarginstart.setStrokeCap(cap);
        setexpandedtitlemarginstart.setStrokeJoin(join);
        setexpandedtitlemarginstart.setStrokeMiter(f);
        this.setOnLongClickListener = new hashCode(setfirstdayofweek.MenuHostHelper$$ExternalSyntheticLambda1);
        this.ViewPager$SavedState$1 = new setOnTouchListener(setonreceivecontentlistener.MenuHostHelper$$ExternalSyntheticLambda1);
        if (setonreceivecontentlistener2 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        } else {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setOnTouchListener(setonreceivecontentlistener2.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        this.setY = new ArrayList(list.size());
        this.setUiOptions = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.setY.add(new setOnTouchListener(list.get(i).MenuHostHelper$$ExternalSyntheticLambda1));
        }
        setSubtitleTextAppearance<?, Integer> setsubtitletextappearance = this.setOnLongClickListener;
        if (setsubtitletextappearance != null) {
            setendiconcheckable.setX.add(setsubtitletextappearance);
        }
        setSubtitleTextAppearance<?, Float> setsubtitletextappearance2 = this.ViewPager$SavedState$1;
        if (setsubtitletextappearance2 != null) {
            setendiconcheckable.setX.add(setsubtitletextappearance2);
        }
        for (int i2 = 0; i2 < this.setY.size(); i2++) {
            setSubtitleTextAppearance<?, Float> setsubtitletextappearance3 = this.setY.get(i2);
            if (setsubtitletextappearance3 != null) {
                setendiconcheckable.setX.add(setsubtitletextappearance3);
            }
        }
        setSubtitleTextAppearance<?, Float> setsubtitletextappearance4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setsubtitletextappearance4 != null && setsubtitletextappearance4 != null) {
            setendiconcheckable.setX.add(setsubtitletextappearance4);
        }
        this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.setY.get(i3).MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        }
        setSubtitleTextAppearance<?, Float> setsubtitletextappearance5 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setsubtitletextappearance5 != null) {
            setsubtitletextappearance5.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        }
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        this.setUnboundedRipple.invalidateSelf();
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
        onActivityPreDestroyed$MenuHostHelper$$ExternalSyntheticLambda1 onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1 = null;
        setActiveIndicatorHeight setactiveindicatorheight = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation = list.get(size);
            if (setcontentinsetstartwithnavigation instanceof setActiveIndicatorHeight) {
                setActiveIndicatorHeight setactiveindicatorheight2 = (setActiveIndicatorHeight) setcontentinsetstartwithnavigation;
                if (setactiveindicatorheight2.setUnboundedRipple == ExpandableTransformationBehavior.setX.INDIVIDUALLY) {
                    setactiveindicatorheight = setactiveindicatorheight2;
                }
            }
        }
        if (setactiveindicatorheight != null) {
            setactiveindicatorheight.setIconTintList.add(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            setContentInsetStartWithNavigation setcontentinsetstartwithnavigation2 = list2.get(size2);
            if (setcontentinsetstartwithnavigation2 instanceof setActiveIndicatorHeight) {
                setActiveIndicatorHeight setactiveindicatorheight3 = (setActiveIndicatorHeight) setcontentinsetstartwithnavigation2;
                if (setactiveindicatorheight3.setUnboundedRipple == ExpandableTransformationBehavior.setX.INDIVIDUALLY) {
                    if (onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1 != null) {
                        this.setNavigationOnClickListener.add(onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1);
                    }
                    onActivityPreDestroyed$MenuHostHelper$$ExternalSyntheticLambda1 onactivitypredestroyed_menuhosthelper__externalsyntheticlambda12 = new onActivityPreDestroyed$MenuHostHelper$$ExternalSyntheticLambda1(setactiveindicatorheight3, (byte) 0);
                    setactiveindicatorheight3.setIconTintList.add(this);
                    onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1 = onactivitypredestroyed_menuhosthelper__externalsyntheticlambda12;
                }
            }
            if (setcontentinsetstartwithnavigation2 instanceof setTitleEllipsize) {
                if (onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1 == null) {
                    onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1 = new onActivityPreDestroyed$MenuHostHelper$$ExternalSyntheticLambda1(setactiveindicatorheight, (byte) 0);
                }
                onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.setY.add((setTitleEllipsize) setcontentinsetstartwithnavigation2);
            }
        }
        if (onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1 != null) {
            this.setNavigationOnClickListener.add(onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1);
        }
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public void setIconTintList(Canvas canvas, Matrix matrix, int i) {
        int max;
        float f;
        float f2;
        float f3;
        if (!setOnPageChangeListener.setIconTintList(matrix)) {
            float f4 = 100.0f;
            Paint paint = this.MenuHostHelper$$ExternalSyntheticLambda0;
            max = Math.max(0, Math.min(255, (int) ((((i / 255.0f) * ((hashCode) this.setOnLongClickListener).setUiOptions()) / 100.0f) * 255.0f)));
            paint.setAlpha(max);
            this.MenuHostHelper$$ExternalSyntheticLambda0.setStrokeWidth(((setOnTouchListener) this.ViewPager$SavedState$1).setUiOptions() * setOnPageChangeListener.setY(matrix));
            if (this.MenuHostHelper$$ExternalSyntheticLambda0.getStrokeWidth() <= 0.0f) {
                int i2 = setIntValues.setX;
                if (i2 > 0) {
                    setIntValues.setX = i2 - 1;
                    return;
                }
                return;
            }
            float f5 = 1.0f;
            if (!this.setY.isEmpty()) {
                float y = setOnPageChangeListener.setY(matrix);
                for (int i3 = 0; i3 < this.setY.size(); i3++) {
                    this.setUiOptions[i3] = this.setY.get(i3).setOnLongClickListener().floatValue();
                    if (i3 % 2 == 0) {
                        float[] fArr = this.setUiOptions;
                        if (fArr[i3] < 1.0f) {
                            fArr[i3] = 1.0f;
                        }
                    } else {
                        float[] fArr2 = this.setUiOptions;
                        if (fArr2[i3] < 0.1f) {
                            fArr2[i3] = 0.1f;
                        }
                    }
                    float[] fArr3 = this.setUiOptions;
                    fArr3[i3] = fArr3[i3] * y;
                }
                setSubtitleTextAppearance<?, Float> setsubtitletextappearance = this.MenuHostHelper$$ExternalSyntheticLambda1;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setPathEffect(new DashPathEffect(this.setUiOptions, setsubtitletextappearance == null ? 0.0f : y * setsubtitletextappearance.setOnLongClickListener().floatValue()));
                int i4 = setIntValues.setX;
                if (i4 > 0) {
                    setIntValues.setX = i4 - 1;
                }
            } else {
                int i5 = setIntValues.setX;
                if (i5 > 0) {
                    setIntValues.setX = i5 - 1;
                }
            }
            setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance2 = this.setX;
            if (setsubtitletextappearance2 != null) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setColorFilter(setsubtitletextappearance2.setOnLongClickListener());
            }
            int i6 = 0;
            while (i6 < this.setNavigationOnClickListener.size()) {
                onActivityPreDestroyed$MenuHostHelper$$ExternalSyntheticLambda1 onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1 = this.setNavigationOnClickListener.get(i6);
                if (onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    this.setLayoutAnimation.reset();
                    for (int size = onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.setY.size() - 1; size >= 0; size--) {
                        this.setLayoutAnimation.addPath(onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.setY.get(size).setX(), matrix);
                    }
                    int i7 = setIntValues.setX;
                    if (i7 > 0) {
                        setIntValues.setX = i7 - 1;
                    }
                    canvas.drawPath(this.setLayoutAnimation, this.MenuHostHelper$$ExternalSyntheticLambda0);
                    int i8 = setIntValues.setX;
                    if (i8 > 0) {
                        setIntValues.setX = i8 - 1;
                    }
                } else if (onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                    this.setLayoutAnimation.reset();
                    for (int size2 = onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.setY.size() - 1; size2 >= 0; size2--) {
                        this.setLayoutAnimation.addPath(onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.setY.get(size2).setX(), matrix);
                    }
                    this.setIconSize.setPath(this.setLayoutAnimation, false);
                    float length = this.setIconSize.getLength();
                    while (this.setIconSize.nextContour()) {
                        length += this.setIconSize.getLength();
                    }
                    float floatValue = (onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener().floatValue() * length) / 360.0f;
                    float floatValue2 = ((onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener().floatValue() * length) / f4) + floatValue;
                    float floatValue3 = ((onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0.setY.setOnLongClickListener().floatValue() * length) / f4) + floatValue;
                    int size3 = onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.setY.size() - 1;
                    float f6 = 0.0f;
                    while (size3 >= 0) {
                        this.setCenterIfNoTextEnabled.set(onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.setY.get(size3).setX());
                        this.setCenterIfNoTextEnabled.transform(matrix);
                        this.setIconSize.setPath(this.setCenterIfNoTextEnabled, false);
                        float length2 = this.setIconSize.getLength();
                        if (floatValue3 > length) {
                            float f7 = floatValue3 - length;
                            if (f7 < f6 + length2 && f6 < f7) {
                                f = floatValue2 > length ? (floatValue2 - length) / length2 : 0.0f;
                                f3 = Math.min(f7 / length2, f5);
                                f2 = f;
                                setOnPageChangeListener.setIconTintList(this.setCenterIfNoTextEnabled, f2, f3, 0.0f);
                                canvas.drawPath(this.setCenterIfNoTextEnabled, this.MenuHostHelper$$ExternalSyntheticLambda0);
                                f6 += length2;
                                size3--;
                                f5 = 1.0f;
                            }
                        }
                        float f8 = f6 + length2;
                        if (f8 >= floatValue2 && f6 <= floatValue3) {
                            if (f8 > floatValue3 || floatValue2 >= f6) {
                                f = floatValue2 < f6 ? 0.0f : (floatValue2 - f6) / length2;
                                if (floatValue3 <= f8) {
                                    f3 = (floatValue3 - f6) / length2;
                                    f2 = f;
                                    setOnPageChangeListener.setIconTintList(this.setCenterIfNoTextEnabled, f2, f3, 0.0f);
                                    canvas.drawPath(this.setCenterIfNoTextEnabled, this.MenuHostHelper$$ExternalSyntheticLambda0);
                                } else {
                                    f2 = f;
                                    f3 = 1.0f;
                                    setOnPageChangeListener.setIconTintList(this.setCenterIfNoTextEnabled, f2, f3, 0.0f);
                                    canvas.drawPath(this.setCenterIfNoTextEnabled, this.MenuHostHelper$$ExternalSyntheticLambda0);
                                }
                            } else {
                                canvas.drawPath(this.setCenterIfNoTextEnabled, this.MenuHostHelper$$ExternalSyntheticLambda0);
                            }
                        }
                        f6 += length2;
                        size3--;
                        f5 = 1.0f;
                    }
                    int i9 = setIntValues.setX;
                    if (i9 > 0) {
                        setIntValues.setX = i9 - 1;
                    }
                } else {
                    int i10 = setIntValues.setX;
                    if (i10 > 0) {
                        setIntValues.setX = i10 - 1;
                    }
                }
                i6++;
                f4 = 100.0f;
                f5 = 1.0f;
            }
            int i11 = setIntValues.setX;
            if (i11 > 0) {
                setIntValues.setX = i11 - 1;
                return;
            }
            return;
        }
        int i12 = setIntValues.setX;
        if (i12 > 0) {
            setIntValues.setX = i12 - 1;
        }
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        this.setLayoutAnimation.reset();
        for (int i = 0; i < this.setNavigationOnClickListener.size(); i++) {
            onActivityPreDestroyed$MenuHostHelper$$ExternalSyntheticLambda1 onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1 = this.setNavigationOnClickListener.get(i);
            for (int i2 = 0; i2 < onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.setY.size(); i2++) {
                this.setLayoutAnimation.addPath(onactivitypredestroyed_menuhosthelper__externalsyntheticlambda1.setY.get(i2).setX(), matrix);
            }
        }
        this.setLayoutAnimation.computeBounds(this.setTextAlignment, false);
        float uiOptions = ((setOnTouchListener) this.ViewPager$SavedState$1).setUiOptions();
        RectF rectF2 = this.setTextAlignment;
        float f = uiOptions / 2.0f;
        rectF2.set(rectF2.left - f, this.setTextAlignment.top - f, this.setTextAlignment.right + f, this.setTextAlignment.bottom + f);
        rectF.set(this.setTextAlignment);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        int i3 = setIntValues.setX;
        if (i3 > 0) {
            setIntValues.setX = i3 - 1;
        }
    }

    @Override // o.setDropDownBackgroundDrawable
    public final void setIconTintList(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda1(setsupportbackgroundtintlist, i, list, setsupportbackgroundtintlist2, this);
    }

    @Override // o.setDropDownBackgroundDrawable
    public <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        if (t == setItemViewCacheSize.setUnboundedRipple) {
            this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setTextScaleX) {
            this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setY) {
            setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance = this.setX;
            if (setsubtitletextappearance != null) {
                this.setIconTintList.setX.remove(setsubtitletextappearance);
            }
            if (setprompt == null) {
                this.setX = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled = new setExtraMultilineHeightEnabled(setprompt);
            this.setX = setextramultilineheightenabled;
            setextramultilineheightenabled.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setEndIconCheckable setendiconcheckable = this.setIconTintList;
            setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance2 = this.setX;
            if (setsubtitletextappearance2 != null) {
                setendiconcheckable.setX.add(setsubtitletextappearance2);
            }
        }
    }
}