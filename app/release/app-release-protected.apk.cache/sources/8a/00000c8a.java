package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import o.setEndIconCheckable;
import o.setSimpleItems;

/* loaded from: classes.dex */
public final class setImageAssetsFolder extends setEndIconCheckable {
    private setSubtitleTextAppearance<Float, Float> ViewPager$SavedState$1;
    private final RectF setCenterIfNoTextEnabled;
    private final List<setEndIconCheckable> setLayoutAnimation;
    private Paint setNavigationOnClickListener;
    private final RectF setUiOptions;

    public setImageAssetsFolder(setPointerIcon setpointericon, setSimpleItems setsimpleitems, List<setSimpleItems> list, setBoxStrokeErrorColor setboxstrokeerrorcolor) {
        super(setpointericon, setsimpleitems);
        setEndIconCheckable setendiconcheckable;
        setEndIconCheckable settransitiongroup;
        this.setLayoutAnimation = new ArrayList();
        this.setCenterIfNoTextEnabled = new RectF();
        this.setUiOptions = new RectF();
        this.setNavigationOnClickListener = new Paint();
        setOnReceiveContentListener setonreceivecontentlistener = setsimpleitems.setTextScaleX;
        if (setonreceivecontentlistener == null) {
            this.ViewPager$SavedState$1 = null;
        } else {
            setOnTouchListener setontouchlistener = new setOnTouchListener(setonreceivecontentlistener.MenuHostHelper$$ExternalSyntheticLambda1);
            this.ViewPager$SavedState$1 = setontouchlistener;
            this.setX.add(setontouchlistener);
            this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        }
        setPrefixTextAppearance setprefixtextappearance = new setPrefixTextAppearance(setboxstrokeerrorcolor.setOnLongClickListener.size());
        int size = list.size() - 1;
        setEndIconCheckable setendiconcheckable2 = null;
        while (true) {
            int i = 0;
            if (size >= 0) {
                setSimpleItems setsimpleitems2 = list.get(size);
                switch (setEndIconCheckable.AnonymousClass4.setIconTintList[setsimpleitems2.setOnLongClickListener.ordinal()]) {
                    case 1:
                        settransitiongroup = new setTransitionGroup(setpointericon, setsimpleitems2);
                        break;
                    case 2:
                        settransitiongroup = new setImageAssetsFolder(setpointericon, setsimpleitems2, setboxstrokeerrorcolor.setCenterIfNoTextEnabled.get(setsimpleitems2.setIconSize), setboxstrokeerrorcolor);
                        break;
                    case 3:
                        settransitiongroup = new setDefaultHintTextColor(setpointericon, setsimpleitems2);
                        break;
                    case 4:
                        settransitiongroup = new setOnHide(setpointericon, setsimpleitems2);
                        break;
                    case 5:
                        settransitiongroup = new setScrollCaptureHint(setpointericon, setsimpleitems2);
                        break;
                    case 6:
                        settransitiongroup = new setLongClickable(setpointericon, setsimpleitems2);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown layer type ");
                        sb.append(setsimpleitems2.setOnLongClickListener);
                        setDrawingCacheEnabled.setIconTintList(sb.toString());
                        settransitiongroup = null;
                        break;
                }
                if (settransitiongroup != null) {
                    setprefixtextappearance.setX(settransitiongroup.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList, settransitiongroup);
                    if (setendiconcheckable2 != null) {
                        setendiconcheckable2.setIconTintList(settransitiongroup);
                        setendiconcheckable2 = null;
                    } else {
                        this.setLayoutAnimation.add(0, settransitiongroup);
                        int i2 = AnonymousClass1.setX[setsimpleitems2.setLayoutAnimation.ordinal()];
                        if (i2 == 1 || i2 == 2) {
                            setendiconcheckable2 = settransitiongroup;
                        }
                    }
                }
                size--;
            } else {
                while (true) {
                    if (setprefixtextappearance.setIconTintList) {
                        setprefixtextappearance.setIconTintList();
                    }
                    if (i >= setprefixtextappearance.setX) {
                        return;
                    }
                    if (setprefixtextappearance.setIconTintList) {
                        setprefixtextappearance.setIconTintList();
                    }
                    setEndIconCheckable setendiconcheckable3 = (setEndIconCheckable) setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda0(setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda0[i], null);
                    if (setendiconcheckable3 != null && (setendiconcheckable = (setEndIconCheckable) setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda0(setendiconcheckable3.MenuHostHelper$$ExternalSyntheticLambda0.setNavigationOnClickListener, null)) != null) {
                        setendiconcheckable3.setY(setendiconcheckable);
                    }
                    i++;
                }
            }
        }
    }

    /* renamed from: o.setImageAssetsFolder$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setSimpleItems.setY.values().length];
            setX = iArr;
            try {
                iArr[setSimpleItems.setY.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[setSimpleItems.setY.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // o.setEndIconCheckable
    final void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, Matrix matrix, int i) {
        this.setUiOptions.set(0.0f, 0.0f, this.MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1, this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple);
        matrix.mapRect(this.setUiOptions);
        boolean z = this.setY.setUnboundedRipple && this.setLayoutAnimation.size() > 1 && i != 255;
        if (z) {
            this.setNavigationOnClickListener.setAlpha(i);
            setOnPageChangeListener.setX(canvas, this.setUiOptions, this.setNavigationOnClickListener, 31);
        } else {
            canvas.save();
        }
        if (z) {
            i = 255;
        }
        for (int size = this.setLayoutAnimation.size() - 1; size >= 0; size--) {
            if (!this.setUiOptions.isEmpty() ? canvas.clipRect(this.setUiOptions) : true) {
                this.setLayoutAnimation.get(size).setIconTintList(canvas, matrix, i);
            }
        }
        canvas.restore();
        int i2 = setIntValues.setX;
        if (i2 > 0) {
            setIntValues.setX = i2 - 1;
        }
    }

    @Override // o.setEndIconCheckable, o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        super.setIconTintList(rectF, matrix, z);
        for (int size = this.setLayoutAnimation.size() - 1; size >= 0; size--) {
            this.setCenterIfNoTextEnabled.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.setLayoutAnimation.get(size).setIconTintList(this.setCenterIfNoTextEnabled, this.MenuHostHelper$$ExternalSyntheticLambda1, true);
            rectF.union(this.setCenterIfNoTextEnabled);
        }
    }

    @Override // o.setEndIconCheckable
    public final void setX(float f) {
        super.setX(f);
        if (this.ViewPager$SavedState$1 != null) {
            setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY.setY;
            f = ((this.ViewPager$SavedState$1.setOnLongClickListener().floatValue() * this.MenuHostHelper$$ExternalSyntheticLambda0.setY.setIconTintList) - this.MenuHostHelper$$ExternalSyntheticLambda0.setY.setChipCornerRadius) / ((setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda1 - setboxstrokeerrorcolor.setChipCornerRadius) + 0.01f);
        }
        if (this.ViewPager$SavedState$1 == null) {
            setSimpleItems setsimpleitems = this.MenuHostHelper$$ExternalSyntheticLambda0;
            float f2 = setsimpleitems.setOnNavigationItemSelectedListener;
            setBoxStrokeErrorColor setboxstrokeerrorcolor2 = setsimpleitems.setY;
            f -= f2 / (setboxstrokeerrorcolor2.MenuHostHelper$$ExternalSyntheticLambda1 - setboxstrokeerrorcolor2.setChipCornerRadius);
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.setMinAndMaxProgress != 0.0f) {
            f /= this.MenuHostHelper$$ExternalSyntheticLambda0.setMinAndMaxProgress;
        }
        for (int size = this.setLayoutAnimation.size() - 1; size >= 0; size--) {
            this.setLayoutAnimation.get(size).setX(f);
        }
    }

    @Override // o.setEndIconCheckable
    protected final void MenuHostHelper$$ExternalSyntheticLambda1(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        for (int i2 = 0; i2 < this.setLayoutAnimation.size(); i2++) {
            this.setLayoutAnimation.get(i2).setIconTintList(setsupportbackgroundtintlist, i, list, setsupportbackgroundtintlist2);
        }
    }

    @Override // o.setEndIconCheckable, o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(t, setprompt);
        if (t == setItemViewCacheSize.setGuidelinePercent) {
            if (setprompt == null) {
                setSubtitleTextAppearance<Float, Float> setsubtitletextappearance = this.ViewPager$SavedState$1;
                if (setsubtitletextappearance != null) {
                    setsubtitletextappearance.MenuHostHelper$$ExternalSyntheticLambda1(null);
                    return;
                }
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled = new setExtraMultilineHeightEnabled(setprompt);
            this.ViewPager$SavedState$1 = setextramultilineheightenabled;
            setextramultilineheightenabled.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance2 = this.ViewPager$SavedState$1;
            if (setsubtitletextappearance2 != null) {
                this.setX.add(setsubtitletextappearance2);
            }
        }
    }
}