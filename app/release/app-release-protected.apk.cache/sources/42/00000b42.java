package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.EmojiCompatInitializer;
import o.setChoiceMode;
import o.setScrollIndicators;
import o.setSimpleItems;
import o.setSubtitleTextAppearance;

/* loaded from: classes.dex */
public abstract class setEndIconCheckable implements EmojiCompatInitializer.AnonymousClass1, setSubtitleTextAppearance.setX, setDropDownBackgroundDrawable {
    final setSimpleItems MenuHostHelper$$ExternalSyntheticLambda0;
    final Matrix MenuHostHelper$$ExternalSyntheticLambda1;
    private final Paint setAnimationFromJson;
    private final RectF setChipCornerRadius;
    setOnTouchListener setIconTintList;
    private final RectF setLayoutDirection;
    private final RectF setMaxEms;
    private final String setNavigationOnClickListener;
    boolean setOnLongClickListener;
    private List<setEndIconCheckable> setOnNavigationItemSelectedListener;
    private setContentInsetsAbsolute setTextAlignment;
    private final RectF setTextAppearanceResource;
    private setEndIconCheckable setTextScaleX;
    private final Paint setUiOptions;
    final setChipIconSizeResource setUnboundedRipple;
    public final List<setSubtitleTextAppearance<?, ?>> setX;
    final setPointerIcon setY;
    private setEndIconCheckable setZ;
    private final Path setCheckedIconEnabled = new Path();
    private final Matrix setIconSize = new Matrix();
    private final Paint setLayoutAnimation = new setExpandedTitleMarginStart(1);
    private final Paint setCenterIfNoTextEnabled = new setExpandedTitleMarginStart(PorterDuff.Mode.DST_IN, (byte) 0);
    private final Paint ViewPager$SavedState$1 = new setExpandedTitleMarginStart(PorterDuff.Mode.DST_OUT, (byte) 0);

    abstract void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, Matrix matrix, int i);

    void MenuHostHelper$$ExternalSyntheticLambda1(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
    }

    @Override // o.setContentInsetStartWithNavigation
    public final void setX(List<setContentInsetStartWithNavigation> list, List<setContentInsetStartWithNavigation> list2) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setEndIconCheckable(setPointerIcon setpointericon, setSimpleItems setsimpleitems) {
        setExpandedTitleMarginStart setexpandedtitlemarginstart = new setExpandedTitleMarginStart(1);
        this.setAnimationFromJson = setexpandedtitlemarginstart;
        this.setUiOptions = new setExpandedTitleMarginStart(PorterDuff.Mode.CLEAR);
        this.setLayoutDirection = new RectF();
        this.setChipCornerRadius = new RectF();
        this.setMaxEms = new RectF();
        this.setTextAppearanceResource = new RectF();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new Matrix();
        this.setX = new ArrayList();
        this.setOnLongClickListener = true;
        this.setY = setpointericon;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setsimpleitems;
        StringBuilder sb = new StringBuilder();
        sb.append(setsimpleitems.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("#draw");
        this.setNavigationOnClickListener = sb.toString();
        if (setsimpleitems.setLayoutAnimation == setSimpleItems.setY.INVERT) {
            setexpandedtitlemarginstart.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            setexpandedtitlemarginstart.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        setChipIconSizeResource setchipiconsizeresource = new setChipIconSizeResource(setsimpleitems.setLayoutDirection);
        this.setUnboundedRipple = setchipiconsizeresource;
        setchipiconsizeresource.setX(this);
        if (setsimpleitems.setUiOptions != null && !setsimpleitems.setUiOptions.isEmpty()) {
            setContentInsetsAbsolute setcontentinsetsabsolute = new setContentInsetsAbsolute(setsimpleitems.setUiOptions);
            this.setTextAlignment = setcontentinsetsabsolute;
            for (setSubtitleTextAppearance<unregisterForContextMenu, Path> setsubtitletextappearance : setcontentinsetsabsolute.MenuHostHelper$$ExternalSyntheticLambda0) {
                setsubtitletextappearance.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            }
            for (setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance2 : this.setTextAlignment.setX) {
                if (setsubtitletextappearance2 != null) {
                    this.setX.add(setsubtitletextappearance2);
                }
                setsubtitletextappearance2.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            }
        }
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
            setOnTouchListener setontouchlistener = new setOnTouchListener(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0);
            this.setIconTintList = setontouchlistener;
            setontouchlistener.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0.add(new setSubtitleTextAppearance.setX() { // from class: o.setEndIconCheckable.1
                @Override // o.setSubtitleTextAppearance.setX
                public final void setY() {
                    setEndIconCheckable setendiconcheckable = setEndIconCheckable.this;
                    boolean z = setendiconcheckable.setIconTintList.setUiOptions() == 1.0f;
                    if (z != setendiconcheckable.setOnLongClickListener) {
                        setendiconcheckable.setOnLongClickListener = z;
                        setendiconcheckable.setY.invalidateSelf();
                    }
                }
            });
            boolean z = this.setIconTintList.setOnLongClickListener().floatValue() == 1.0f;
            if (z != this.setOnLongClickListener) {
                this.setOnLongClickListener = z;
                this.setY.invalidateSelf();
            }
            setOnTouchListener setontouchlistener2 = this.setIconTintList;
            if (setontouchlistener2 != null) {
                this.setX.add(setontouchlistener2);
            }
        } else if (true != this.setOnLongClickListener) {
            this.setOnLongClickListener = true;
            this.setY.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(setEndIconCheckable setendiconcheckable) {
        this.setZ = setendiconcheckable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(setEndIconCheckable setendiconcheckable) {
        this.setTextScaleX = setendiconcheckable;
    }

    @Override // o.EmojiCompatInitializer.AnonymousClass1
    public void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        this.setLayoutDirection.set(0.0f, 0.0f, 0.0f, 0.0f);
        setX();
        this.MenuHostHelper$$ExternalSyntheticLambda1.set(matrix);
        if (z) {
            List<setEndIconCheckable> list = this.setOnNavigationItemSelectedListener;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.preConcat(this.setOnNavigationItemSelectedListener.get(size).setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1());
                }
            } else {
                setEndIconCheckable setendiconcheckable = this.setTextScaleX;
                if (setendiconcheckable != null) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.preConcat(setendiconcheckable.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1());
                }
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.preConcat(this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1());
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e5 A[SYNTHETIC] */
    @Override // o.EmojiCompatInitializer.AnonymousClass1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setIconTintList(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            Method dump skipped, instructions count: 1090
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEndIconCheckable.setIconTintList(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(float f) {
        setChoiceMode setchoicemode = this.setY.setY.setIconSize;
        String str = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setchoicemode.MenuHostHelper$$ExternalSyntheticLambda0) {
            setForegroundGravity setforegroundgravity = setchoicemode.setY.get(str);
            if (setforegroundgravity == null) {
                setforegroundgravity = new setForegroundGravity();
                setchoicemode.setY.put(str, setforegroundgravity);
            }
            float f2 = setforegroundgravity.MenuHostHelper$$ExternalSyntheticLambda0 + 0.0f;
            setforegroundgravity.MenuHostHelper$$ExternalSyntheticLambda0 = f2;
            int i = setforegroundgravity.setX + 1;
            setforegroundgravity.setX = i;
            if (i == Integer.MAX_VALUE) {
                setforegroundgravity.MenuHostHelper$$ExternalSyntheticLambda0 = f2 / 2.0f;
                setforegroundgravity.setX = i / 2;
            }
            if (str.equals("__container")) {
                for (setChoiceMode.setIconTintList seticontintlist : setchoicemode.MenuHostHelper$$ExternalSyntheticLambda1) {
                }
            }
        }
    }

    private void setY(Canvas canvas) {
        canvas.drawRect(this.setLayoutDirection.left - 1.0f, this.setLayoutDirection.top - 1.0f, this.setLayoutDirection.right + 1.0f, this.setLayoutDirection.bottom + 1.0f, this.setUiOptions);
        int i = setIntValues.setX;
        if (i > 0) {
            setIntValues.setX = i - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setEndIconCheckable$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setIconTintList;
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setScrollIndicators.setX.values().length];
            setX = iArr;
            try {
                iArr[setScrollIndicators.setX.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[setScrollIndicators.setX.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setX[setScrollIndicators.setX.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setX[setScrollIndicators.setX.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0.values().length];
            setIconTintList = iArr2;
            try {
                iArr2[setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setIconTintList[setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setIconTintList[setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                setIconTintList[setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                setIconTintList[setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                setIconTintList[setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                setIconTintList[setSimpleItems$MenuHostHelper$$ExternalSyntheticLambda0.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX(float f) {
        setChipIconSizeResource setchipiconsizeresource = this.setUnboundedRipple;
        setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance = setchipiconsizeresource.setX;
        if (setsubtitletextappearance != null) {
            setsubtitletextappearance.setY(f);
        }
        setSubtitleTextAppearance<?, Float> setsubtitletextappearance2 = setchipiconsizeresource.setOnLongClickListener;
        if (setsubtitletextappearance2 != null) {
            setsubtitletextappearance2.setY(f);
        }
        setSubtitleTextAppearance<?, Float> setsubtitletextappearance3 = setchipiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setsubtitletextappearance3 != null) {
            setsubtitletextappearance3.setY(f);
        }
        setSubtitleTextAppearance<PointF, PointF> setsubtitletextappearance4 = setchipiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda0;
        if (setsubtitletextappearance4 != null) {
            setsubtitletextappearance4.setY(f);
        }
        setSubtitleTextAppearance<?, PointF> setsubtitletextappearance5 = setchipiconsizeresource.setIconTintList;
        if (setsubtitletextappearance5 != null) {
            setsubtitletextappearance5.setY(f);
        }
        setSubtitleTextAppearance<setLineSpacingAdd, setLineSpacingAdd> setsubtitletextappearance6 = setchipiconsizeresource.setUiOptions;
        if (setsubtitletextappearance6 != null) {
            setsubtitletextappearance6.setY(f);
        }
        setSubtitleTextAppearance<Float, Float> setsubtitletextappearance7 = setchipiconsizeresource.setY;
        if (setsubtitletextappearance7 != null) {
            setsubtitletextappearance7.setY(f);
        }
        setOnTouchListener setontouchlistener = setchipiconsizeresource.setLayoutAnimation;
        if (setontouchlistener != null) {
            setontouchlistener.setY(f);
        }
        setOnTouchListener setontouchlistener2 = setchipiconsizeresource.setUnboundedRipple;
        if (setontouchlistener2 != null) {
            setontouchlistener2.setY(f);
        }
        if (this.setTextAlignment != null) {
            for (int i = 0; i < this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0.size(); i++) {
                this.setTextAlignment.MenuHostHelper$$ExternalSyntheticLambda0.get(i).setY(f);
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.setMinAndMaxProgress != 0.0f) {
            f /= this.MenuHostHelper$$ExternalSyntheticLambda0.setMinAndMaxProgress;
        }
        setOnTouchListener setontouchlistener3 = this.setIconTintList;
        if (setontouchlistener3 != null) {
            setontouchlistener3.setY(f / this.MenuHostHelper$$ExternalSyntheticLambda0.setMinAndMaxProgress);
        }
        setEndIconCheckable setendiconcheckable = this.setZ;
        if (setendiconcheckable != null) {
            this.setZ.setX(setendiconcheckable.MenuHostHelper$$ExternalSyntheticLambda0.setMinAndMaxProgress * f);
        }
        for (int i2 = 0; i2 < this.setX.size(); i2++) {
            this.setX.get(i2).setY(f);
        }
    }

    private void setX() {
        if (this.setOnNavigationItemSelectedListener != null) {
            return;
        }
        if (this.setTextScaleX == null) {
            this.setOnNavigationItemSelectedListener = Collections.emptyList();
            return;
        }
        this.setOnNavigationItemSelectedListener = new ArrayList();
        for (setEndIconCheckable setendiconcheckable = this.setTextScaleX; setendiconcheckable != null; setendiconcheckable = setendiconcheckable.setTextScaleX) {
            this.setOnNavigationItemSelectedListener.add(setendiconcheckable);
        }
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        this.setUnboundedRipple.setY(t, setprompt);
    }

    @Override // o.setSubtitleTextAppearance.setX
    public final void setY() {
        this.setY.invalidateSelf();
    }

    @Override // o.setDropDownBackgroundDrawable
    public final void setIconTintList(setSupportBackgroundTintList setsupportbackgroundtintlist, int i, List<setSupportBackgroundTintList> list, setSupportBackgroundTintList setsupportbackgroundtintlist2) {
        if (setsupportbackgroundtintlist.setY(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, i)) {
            if (!"__container".equals(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1)) {
                String str = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                setSupportBackgroundTintList setsupportbackgroundtintlist3 = new setSupportBackgroundTintList(setsupportbackgroundtintlist2);
                setsupportbackgroundtintlist3.setIconTintList.add(str);
                if (setsupportbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, i)) {
                    setSupportBackgroundTintList setsupportbackgroundtintlist4 = new setSupportBackgroundTintList(setsupportbackgroundtintlist3);
                    setsupportbackgroundtintlist4.MenuHostHelper$$ExternalSyntheticLambda1 = this;
                    list.add(setsupportbackgroundtintlist4);
                }
                setsupportbackgroundtintlist2 = setsupportbackgroundtintlist3;
            }
            if (setsupportbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, i)) {
                MenuHostHelper$$ExternalSyntheticLambda1(setsupportbackgroundtintlist, i + setsupportbackgroundtintlist.setX(this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, i), list, setsupportbackgroundtintlist2);
            }
        }
    }
}