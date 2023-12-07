package o;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public final class setOnHide extends setEndIconCheckable {
    private final Paint setLayoutAnimation;
    private final Rect setNavigationOnClickListener;
    private final Rect setTextAlignment;
    private setSubtitleTextAppearance<ColorFilter, ColorFilter> setUiOptions;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnHide(setPointerIcon setpointericon, setSimpleItems setsimpleitems) {
        super(setpointericon, setsimpleitems);
        this.setLayoutAnimation = new setExpandedTitleMarginStart(3);
        this.setTextAlignment = new Rect();
        this.setNavigationOnClickListener = new Rect();
    }

    @Override // o.setEndIconCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, Matrix matrix, int i) {
        Bitmap iconTintList = setIconTintList();
        if (iconTintList == null || iconTintList.isRecycled()) {
            return;
        }
        float MenuHostHelper$$ExternalSyntheticLambda0 = setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0();
        this.setLayoutAnimation.setAlpha(i);
        setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance = this.setUiOptions;
        if (setsubtitletextappearance != null) {
            this.setLayoutAnimation.setColorFilter(setsubtitletextappearance.setOnLongClickListener());
        }
        canvas.save();
        canvas.concat(matrix);
        this.setTextAlignment.set(0, 0, iconTintList.getWidth(), iconTintList.getHeight());
        this.setNavigationOnClickListener.set(0, 0, (int) (iconTintList.getWidth() * MenuHostHelper$$ExternalSyntheticLambda0), (int) (iconTintList.getHeight() * MenuHostHelper$$ExternalSyntheticLambda0));
        canvas.drawBitmap(iconTintList, this.setTextAlignment, this.setNavigationOnClickListener, this.setLayoutAnimation);
        canvas.restore();
    }

    @Override // o.setEndIconCheckable, o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        super.setIconTintList(rectF, matrix, z);
        Bitmap iconTintList = setIconTintList();
        if (iconTintList != null) {
            rectF.set(0.0f, 0.0f, iconTintList.getWidth() * setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0(), iconTintList.getHeight() * setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0());
            this.MenuHostHelper$$ExternalSyntheticLambda1.mapRect(rectF);
        }
    }

    private Bitmap setIconTintList() {
        setLogoDescription setlogodescription;
        String str = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize;
        setPointerIcon setpointericon = this.setY;
        if (setpointericon.getCallback() == null) {
            setlogodescription = null;
        } else {
            setLogoDescription setlogodescription2 = setpointericon.setNavigationOnClickListener;
            if (setlogodescription2 != null) {
                Drawable.Callback callback = setpointericon.getCallback();
                Context context = (callback == null || !(callback instanceof View)) ? null : ((View) callback).getContext();
                if (!((context == null && setlogodescription2.MenuHostHelper$$ExternalSyntheticLambda0 == null) || setlogodescription2.MenuHostHelper$$ExternalSyntheticLambda0.equals(context))) {
                    setpointericon.setNavigationOnClickListener = null;
                }
            }
            if (setpointericon.setNavigationOnClickListener == null) {
                setpointericon.setNavigationOnClickListener = new setLogoDescription(setpointericon.getCallback(), setpointericon.setUiOptions, setpointericon.setLayoutAnimation, setpointericon.setY.setUnboundedRipple);
            }
            setlogodescription = setpointericon.setNavigationOnClickListener;
        }
        if (setlogodescription != null) {
            return setlogodescription.setX(str);
        }
        return null;
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