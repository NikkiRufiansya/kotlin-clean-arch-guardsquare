package o;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class setPointerIcon extends Drawable implements Drawable.Callback, Animatable {
    public boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public setInputMethodMode MenuHostHelper$$ExternalSyntheticLambda1;
    boolean ViewPager$SavedState$1;
    private final Set<Object> setAnimationFromJson;
    boolean setCenterIfNoTextEnabled;
    private final ValueAnimator.AnimatorUpdateListener setCheckedIconEnabled;
    float setChipCornerRadius;
    boolean setIconSize;
    final dumpAsync setIconTintList;
    public BadgeState$State$1 setLayoutAnimation;
    private final Matrix setLayoutDirection = new Matrix();
    public setCameraDistance setMaxEms;
    private boolean setMinAndMaxProgress;
    public setLogoDescription setNavigationOnClickListener;
    public setBreakStrategy setOnLongClickListener;
    ImageView.ScaleType setOnNavigationItemSelectedListener;
    final ArrayList<setIconTintList> setTextAlignment;
    private int setTextScaleX;
    public String setUiOptions;
    public boolean setUnboundedRipple;
    setImageAssetsFolder setX;
    public setBoxStrokeErrorColor setY;
    boolean setZ;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface setIconTintList {
        void setY();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public setPointerIcon() {
        dumpAsync dumpasync = new dumpAsync();
        this.setIconTintList = dumpasync;
        this.setChipCornerRadius = 1.0f;
        this.setZ = true;
        this.setIconSize = false;
        this.setAnimationFromJson = new HashSet();
        this.setTextAlignment = new ArrayList<>();
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: o.setPointerIcon.4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (setPointerIcon.this.setX != null) {
                    setPointerIcon.this.setX.setX(setPointerIcon.this.setIconTintList.setIconTintList());
                }
            }
        };
        this.setCheckedIconEnabled = animatorUpdateListener;
        this.setTextScaleX = 255;
        this.setMinAndMaxProgress = true;
        this.ViewPager$SavedState$1 = false;
        dumpasync.addUpdateListener(animatorUpdateListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        this.setX = new setImageAssetsFolder(this, setStrokeWidthResource.MenuHostHelper$$ExternalSyntheticLambda1(this.setY), this.setY.setOnLongClickListener, this.setY);
    }

    public final void setIconTintList() {
        if (this.setIconTintList.isRunning()) {
            this.setIconTintList.cancel();
        }
        this.setY = null;
        this.setX = null;
        this.setNavigationOnClickListener = null;
        dumpAsync dumpasync = this.setIconTintList;
        dumpasync.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        dumpasync.setIconTintList = -2.1474836E9f;
        dumpasync.setY = 2.1474836E9f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        if (this.ViewPager$SavedState$1) {
            return;
        }
        this.ViewPager$SavedState$1 = true;
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.setTextScaleX = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.setTextScaleX;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        setDrawingCacheEnabled.setIconTintList("Use addColorFilter instead.");
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.ViewPager$SavedState$1 = false;
        if (this.setIconSize) {
            try {
                setY(canvas);
            } catch (Throwable th) {
                setDrawingCacheEnabled.setX("Lottie crashed in draw!", th);
            }
        } else {
            setY(canvas);
        }
        int i = setIntValues.setX;
        if (i > 0) {
            setIntValues.setX = i - 1;
        }
    }

    private void setY(Canvas canvas) {
        float f;
        float f2;
        int i = -1;
        if (ImageView.ScaleType.FIT_XY == this.setOnNavigationItemSelectedListener) {
            if (this.setX != null) {
                Rect bounds = getBounds();
                float width = bounds.width() / this.setY.MenuHostHelper$$ExternalSyntheticLambda0.width();
                float height = bounds.height() / this.setY.MenuHostHelper$$ExternalSyntheticLambda0.height();
                if (this.setMinAndMaxProgress) {
                    float min = Math.min(width, height);
                    if (min < 1.0f) {
                        f2 = 1.0f / min;
                        width /= f2;
                        height /= f2;
                    } else {
                        f2 = 1.0f;
                    }
                    if (f2 > 1.0f) {
                        i = canvas.save();
                        float width2 = bounds.width() / 2.0f;
                        float height2 = bounds.height() / 2.0f;
                        float f3 = width2 * min;
                        float f4 = min * height2;
                        canvas.translate(width2 - f3, height2 - f4);
                        canvas.scale(f2, f2, f3, f4);
                    }
                }
                this.setLayoutDirection.reset();
                this.setLayoutDirection.preScale(width, height);
                this.setX.setIconTintList(canvas, this.setLayoutDirection, this.setTextScaleX);
                if (i > 0) {
                    canvas.restoreToCount(i);
                }
            }
        } else if (this.setX != null) {
            float f5 = this.setChipCornerRadius;
            float min2 = Math.min(canvas.getWidth() / this.setY.MenuHostHelper$$ExternalSyntheticLambda0.width(), canvas.getHeight() / this.setY.MenuHostHelper$$ExternalSyntheticLambda0.height());
            if (f5 > min2) {
                f = this.setChipCornerRadius / min2;
            } else {
                min2 = f5;
                f = 1.0f;
            }
            if (f > 1.0f) {
                i = canvas.save();
                float width3 = this.setY.MenuHostHelper$$ExternalSyntheticLambda0.width() / 2.0f;
                float height3 = this.setY.MenuHostHelper$$ExternalSyntheticLambda0.height() / 2.0f;
                float f6 = width3 * min2;
                float f7 = height3 * min2;
                float f8 = this.setChipCornerRadius;
                canvas.translate((width3 * f8) - f6, (f8 * height3) - f7);
                canvas.scale(f, f, f6, f7);
            }
            this.setLayoutDirection.reset();
            this.setLayoutDirection.preScale(min2, min2);
            this.setX.setIconTintList(canvas, this.setLayoutDirection, this.setTextScaleX);
            if (i > 0) {
                canvas.restoreToCount(i);
            }
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setX == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.9
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.MenuHostHelper$$ExternalSyntheticLambda1();
                }
            });
            return;
        }
        if (this.setZ || this.setIconTintList.getRepeatCount() == 0) {
            this.setIconTintList.setLayoutAnimation();
        }
        if (this.setZ) {
            return;
        }
        setIconTintList((int) (this.setIconTintList.setUiOptions < 0.0f ? setLayoutAnimation() : setOnLongClickListener()));
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public final void setX() {
        if (this.setX == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.6
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.setX();
                }
            });
            return;
        }
        if (this.setZ || this.setIconTintList.getRepeatCount() == 0) {
            this.setIconTintList.setNavigationOnClickListener();
        }
        if (this.setZ) {
            return;
        }
        setIconTintList((int) (this.setIconTintList.setUiOptions < 0.0f ? setLayoutAnimation() : setOnLongClickListener()));
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(final int i) {
        if (this.setY == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.15
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.MenuHostHelper$$ExternalSyntheticLambda0(i);
                }
            });
            return;
        }
        dumpAsync dumpasync = this.setIconTintList;
        dumpasync.setX(i, (int) dumpasync.setY);
    }

    private float setLayoutAnimation() {
        dumpAsync dumpasync = this.setIconTintList;
        setBoxStrokeErrorColor setboxstrokeerrorcolor = dumpasync.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokeerrorcolor == null) {
            return 0.0f;
        }
        float f = dumpasync.setIconTintList;
        return f == -2.1474836E9f ? setboxstrokeerrorcolor.setChipCornerRadius : f;
    }

    public final void setIconTintList(final float f) {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.14
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.setIconTintList(f);
                }
            });
        } else {
            MenuHostHelper$$ExternalSyntheticLambda0((int) setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(setboxstrokeerrorcolor.setChipCornerRadius, this.setY.MenuHostHelper$$ExternalSyntheticLambda1, f));
        }
    }

    public final void setX(final int i) {
        if (this.setY == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.13
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.setX(i);
                }
            });
            return;
        }
        dumpAsync dumpasync = this.setIconTintList;
        dumpasync.setX(dumpasync.setIconTintList, i + 0.99f);
    }

    private float setOnLongClickListener() {
        dumpAsync dumpasync = this.setIconTintList;
        setBoxStrokeErrorColor setboxstrokeerrorcolor = dumpasync.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokeerrorcolor == null) {
            return 0.0f;
        }
        float f = dumpasync.setY;
        return f == 2.1474836E9f ? setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda1 : f;
    }

    public final void setY(final float f) {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.11
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.setY(f);
                }
            });
        } else {
            setX((int) setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(setboxstrokeerrorcolor.setChipCornerRadius, this.setY.MenuHostHelper$$ExternalSyntheticLambda1, f));
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(final String str) {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.12
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.MenuHostHelper$$ExternalSyntheticLambda1(str);
                }
            });
            return;
        }
        IconCompat MenuHostHelper$$ExternalSyntheticLambda0 = setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda0(str);
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        MenuHostHelper$$ExternalSyntheticLambda0((int) MenuHostHelper$$ExternalSyntheticLambda0.setX);
    }

    public final void setY(final String str) {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.17
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.setY(str);
                }
            });
            return;
        }
        IconCompat MenuHostHelper$$ExternalSyntheticLambda0 = setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda0(str);
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        setX((int) (MenuHostHelper$$ExternalSyntheticLambda0.setX + MenuHostHelper$$ExternalSyntheticLambda0.setY));
    }

    public final void setIconTintList(final String str) {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.5
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.setIconTintList(str);
                }
            });
            return;
        }
        IconCompat MenuHostHelper$$ExternalSyntheticLambda0 = setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda0(str);
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        int i = (int) MenuHostHelper$$ExternalSyntheticLambda0.setX;
        setX(i, ((int) MenuHostHelper$$ExternalSyntheticLambda0.setY) + i);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(final String str, final String str2, final boolean z) {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.3
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.MenuHostHelper$$ExternalSyntheticLambda1(str, str2, z);
                }
            });
            return;
        }
        IconCompat MenuHostHelper$$ExternalSyntheticLambda0 = setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda0(str);
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            StringBuilder sb = new StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new IllegalArgumentException(sb.toString());
        }
        int i = (int) MenuHostHelper$$ExternalSyntheticLambda0.setX;
        IconCompat MenuHostHelper$$ExternalSyntheticLambda02 = this.setY.MenuHostHelper$$ExternalSyntheticLambda0(str2);
        if (str2 == null) {
            StringBuilder sb2 = new StringBuilder("Cannot find marker with name ");
            sb2.append(str2);
            sb2.append(".");
            throw new IllegalArgumentException(sb2.toString());
        }
        setX(i, (int) (MenuHostHelper$$ExternalSyntheticLambda02.setX + (z ? 1.0f : 0.0f)));
    }

    public final void setX(final int i, final int i2) {
        if (this.setY == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.1
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.setX(i, i2);
                }
            });
        } else {
            this.setIconTintList.setX(i, i2 + 0.99f);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(final float f, final float f2) {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.2
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.MenuHostHelper$$ExternalSyntheticLambda0(f, f2);
                }
            });
        } else {
            setX((int) setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(setboxstrokeerrorcolor.setChipCornerRadius, this.setY.MenuHostHelper$$ExternalSyntheticLambda1, f), (int) setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(this.setY.setChipCornerRadius, this.setY.MenuHostHelper$$ExternalSyntheticLambda1, f2));
        }
    }

    public final void setIconTintList(final int i) {
        if (this.setY == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.8
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.setIconTintList(i);
                }
            });
        } else {
            this.setIconTintList.setIconTintList(i);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(final float f) {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.10
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.MenuHostHelper$$ExternalSyntheticLambda0(f);
                }
            });
            return;
        }
        this.setIconTintList.setIconTintList(setAnimateOnTouchUp.MenuHostHelper$$ExternalSyntheticLambda0(setboxstrokeerrorcolor.setChipCornerRadius, this.setY.MenuHostHelper$$ExternalSyntheticLambda1, f));
        int i = setIntValues.setX;
        if (i > 0) {
            setIntValues.setX = i - 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            return;
        }
        float f = this.setChipCornerRadius;
        setBounds(0, 0, (int) (setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda0.width() * f), (int) (this.setY.MenuHostHelper$$ExternalSyntheticLambda0.height() * f));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            return -1;
        }
        return (int) (setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda0.width() * this.setChipCornerRadius);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.setY;
        if (setboxstrokeerrorcolor == null) {
            return -1;
        }
        return (int) (setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda0.height() * this.setChipCornerRadius);
    }

    private List<setSupportBackgroundTintList> setIconTintList(setSupportBackgroundTintList setsupportbackgroundtintlist) {
        if (this.setX == null) {
            setDrawingCacheEnabled.setIconTintList("Cannot resolve KeyPath. Composition is not set yet.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        this.setX.setIconTintList(setsupportbackgroundtintlist, 0, arrayList, new setSupportBackgroundTintList(new String[0]));
        return arrayList;
    }

    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(final setSupportBackgroundTintList setsupportbackgroundtintlist, final T t, final setPrompt<T> setprompt) {
        if (this.setX == null) {
            this.setTextAlignment.add(new setIconTintList() { // from class: o.setPointerIcon.7
                @Override // o.setPointerIcon.setIconTintList
                public final void setY() {
                    setPointerIcon.this.MenuHostHelper$$ExternalSyntheticLambda1(setsupportbackgroundtintlist, (setSupportBackgroundTintList) t, (setPrompt<setSupportBackgroundTintList>) setprompt);
                }
            });
            return;
        }
        boolean z = true;
        if (setsupportbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            setsupportbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(t, setprompt);
        } else {
            List<setSupportBackgroundTintList> iconTintList = setIconTintList(setsupportbackgroundtintlist);
            for (int i = 0; i < iconTintList.size(); i++) {
                iconTintList.get(i).MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(t, setprompt);
            }
            z = true ^ iconTintList.isEmpty();
        }
        if (z) {
            invalidateSelf();
            if (t == setItemViewCacheSize.setGuidelinePercent) {
                MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList.setIconTintList());
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        dumpAsync dumpasync = this.setIconTintList;
        if (dumpasync == null) {
            return false;
        }
        return dumpasync.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.setTextAlignment.clear();
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1();
    }
}