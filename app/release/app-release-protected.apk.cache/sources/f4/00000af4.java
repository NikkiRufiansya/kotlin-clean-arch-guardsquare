package o;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public final class setDefaultHintTextColor extends setEndIconCheckable {
    private final Path ViewPager$SavedState$1;
    private final float[] setChipCornerRadius;
    private final RectF setIconSize;
    private final Paint setLayoutAnimation;
    private final setSimpleItems setNavigationOnClickListener;
    private setSubtitleTextAppearance<ColorFilter, ColorFilter> setUiOptions;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setDefaultHintTextColor(setPointerIcon setpointericon, setSimpleItems setsimpleitems) {
        super(setpointericon, setsimpleitems);
        this.setIconSize = new RectF();
        setExpandedTitleMarginStart setexpandedtitlemarginstart = new setExpandedTitleMarginStart();
        this.setLayoutAnimation = setexpandedtitlemarginstart;
        this.setChipCornerRadius = new float[8];
        this.ViewPager$SavedState$1 = new Path();
        this.setNavigationOnClickListener = setsimpleitems;
        setexpandedtitlemarginstart.setAlpha(0);
        setexpandedtitlemarginstart.setStyle(Paint.Style.FILL);
        setexpandedtitlemarginstart.setColor(setsimpleitems.setCenterIfNoTextEnabled);
    }

    @Override // o.setEndIconCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.setNavigationOnClickListener.setCenterIfNoTextEnabled);
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i / 255.0f) * (((alpha / 255.0f) * (this.setUnboundedRipple.setX == null ? 100 : this.setUnboundedRipple.setX.setOnLongClickListener().intValue())) / 100.0f) * 255.0f);
        this.setLayoutAnimation.setAlpha(intValue);
        setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance = this.setUiOptions;
        if (setsubtitletextappearance != null) {
            this.setLayoutAnimation.setColorFilter(setsubtitletextappearance.setOnLongClickListener());
        }
        if (intValue > 0) {
            float[] fArr = this.setChipCornerRadius;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.setNavigationOnClickListener.setAnimationFromJson;
            float[] fArr2 = this.setChipCornerRadius;
            fArr2[3] = 0.0f;
            fArr2[4] = this.setNavigationOnClickListener.setAnimationFromJson;
            this.setChipCornerRadius[5] = this.setNavigationOnClickListener.setChipCornerRadius;
            float[] fArr3 = this.setChipCornerRadius;
            fArr3[6] = 0.0f;
            fArr3[7] = this.setNavigationOnClickListener.setChipCornerRadius;
            matrix.mapPoints(this.setChipCornerRadius);
            this.ViewPager$SavedState$1.reset();
            Path path = this.ViewPager$SavedState$1;
            float[] fArr4 = this.setChipCornerRadius;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.ViewPager$SavedState$1;
            float[] fArr5 = this.setChipCornerRadius;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.ViewPager$SavedState$1;
            float[] fArr6 = this.setChipCornerRadius;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.ViewPager$SavedState$1;
            float[] fArr7 = this.setChipCornerRadius;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.ViewPager$SavedState$1;
            float[] fArr8 = this.setChipCornerRadius;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.ViewPager$SavedState$1.close();
            canvas.drawPath(this.ViewPager$SavedState$1, this.setLayoutAnimation);
        }
    }

    @Override // o.setEndIconCheckable, o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        super.setIconTintList(rectF, matrix, z);
        this.setIconSize.set(0.0f, 0.0f, this.setNavigationOnClickListener.setAnimationFromJson, this.setNavigationOnClickListener.setChipCornerRadius);
        this.MenuHostHelper$$ExternalSyntheticLambda1.mapRect(this.setIconSize);
        rectF.set(this.setIconSize);
    }

    @Override // o.setEndIconCheckable, o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(t, setprompt);
        if (t == setItemViewCacheSize.setY) {
            if (setprompt == null) {
                this.setUiOptions = null;
            } else {
                this.setUiOptions = new setExtraMultilineHeightEnabled(setprompt);
            }
        }
    }
}