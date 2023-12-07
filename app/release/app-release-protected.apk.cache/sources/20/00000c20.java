package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import o.setIconTint;
import o.setTextStartPaddingResource;

/* loaded from: classes.dex */
public class setHeight {
    public final ColorStateList MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    public final int ViewPager$SavedState$1;
    private int setAnimationFromJson;
    private boolean setCenterIfNoTextEnabled;
    private boolean setChipCornerRadius;
    private ColorStateList setIconSize;
    public final float setIconTintList;
    public ColorStateList setLayoutAnimation;
    public final float setNavigationOnClickListener;
    public float setOnLongClickListener;
    private String setTextAlignment;
    private ColorStateList setTextScaleX;
    public final float setUiOptions;
    public final float setUnboundedRipple;
    public Typeface setX;
    public final int setY;

    public setHeight(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, setIconTint.setIconTintList.setAdapter);
        this.setOnLongClickListener = obtainStyledAttributes.getDimension(0, 0.0f);
        this.setLayoutAnimation = setFastScrollEnabled.setX(context, obtainStyledAttributes, 3);
        this.setIconSize = setFastScrollEnabled.setX(context, obtainStyledAttributes, 4);
        this.setTextScaleX = setFastScrollEnabled.setX(context, obtainStyledAttributes, 5);
        this.ViewPager$SavedState$1 = obtainStyledAttributes.getInt(2, 0);
        this.setAnimationFromJson = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.setY = obtainStyledAttributes.getResourceId(i2, 0);
        this.setTextAlignment = obtainStyledAttributes.getString(i2);
        this.setChipCornerRadius = obtainStyledAttributes.getBoolean(14, false);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setFastScrollEnabled.setX(context, obtainStyledAttributes, 6);
        this.setUiOptions = obtainStyledAttributes.getFloat(7, 0.0f);
        this.setUnboundedRipple = obtainStyledAttributes.getFloat(8, 0.0f);
        this.setNavigationOnClickListener = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i, setIconTint.setIconTintList.setHasDecor);
        this.setCenterIfNoTextEnabled = obtainStyledAttributes2.hasValue(0);
        this.setIconTintList = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final Typeface setIconTintList(Context context) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return this.setX;
        }
        if (!context.isRestricted()) {
            try {
                Typeface MenuHostHelper$$ExternalSyntheticLambda0 = setTextStartPaddingResource.MenuHostHelper$$ExternalSyntheticLambda0(context, this.setY);
                this.setX = MenuHostHelper$$ExternalSyntheticLambda0;
                if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                    this.setX = Typeface.create(MenuHostHelper$$ExternalSyntheticLambda0, this.ViewPager$SavedState$1);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Error loading font ");
                sb.append(this.setTextAlignment);
                Log.d("TextAppearance", sb.toString(), e);
            }
        }
        setIconTintList();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        return this.setX;
    }

    public final void setIconTintList() {
        String str;
        if (this.setX == null && (str = this.setTextAlignment) != null) {
            this.setX = Typeface.create(str, this.ViewPager$SavedState$1);
        }
        if (this.setX == null) {
            int i = this.setAnimationFromJson;
            if (i == 1) {
                this.setX = Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.setX = Typeface.SERIF;
            } else if (i == 3) {
                this.setX = Typeface.MONOSPACE;
            } else {
                this.setX = Typeface.DEFAULT;
            }
            this.setX = Typeface.create(this.setX, this.ViewPager$SavedState$1);
        }
    }

    public final void setY(final Context context, final TextPaint textPaint, final setNumStars setnumstars) {
        setIconTintList();
        setX(context, textPaint, this.setX);
        setY(context, new setNumStars() { // from class: o.setHeight.3
            @Override // o.setNumStars
            public final void MenuHostHelper$$ExternalSyntheticLambda0(Typeface typeface, boolean z) {
                setHeight.this.setX(context, textPaint, typeface);
                setnumstars.MenuHostHelper$$ExternalSyntheticLambda0(typeface, z);
            }

            @Override // o.setNumStars
            public final void setX(int i) {
                setnumstars.setX(i);
            }
        });
    }

    public final void setY(Context context, final setNumStars setnumstars) {
        int i = this.setY;
        if ((i != 0 ? setTextStartPaddingResource.setX(context, i) : null) != null) {
            setIconTintList(context);
        } else {
            setIconTintList();
        }
        int i2 = this.setY;
        if (i2 == 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            setnumstars.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, true);
            return;
        }
        try {
            setTextStartPaddingResource.setY(context, i2, new setTextStartPaddingResource.setY() { // from class: o.setHeight.2
                @Override // o.setTextStartPaddingResource.setY
                public final void setIconTintList(Typeface typeface) {
                    setHeight setheight = setHeight.this;
                    setheight.setX = Typeface.create(typeface, setheight.ViewPager$SavedState$1);
                    setHeight.this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                    setnumstars.MenuHostHelper$$ExternalSyntheticLambda0(setHeight.this.setX, false);
                }

                @Override // o.setTextStartPaddingResource.setY
                public final void setIconTintList(int i3) {
                    setHeight.this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                    setnumstars.setX(i3);
                }
            }, null);
        } catch (Resources.NotFoundException unused) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            setnumstars.setX(1);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error loading font ");
            sb.append(this.setTextAlignment);
            Log.d("TextAppearance", sb.toString(), e);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
            setnumstars.setX(-3);
        }
    }

    public final void setX(Context context, TextPaint textPaint, setNumStars setnumstars) {
        int i = this.setY;
        if ((i != 0 ? setTextStartPaddingResource.setX(context, i) : null) != null) {
            setX(context, textPaint, setIconTintList(context));
        } else {
            setY(context, textPaint, setnumstars);
        }
        ColorStateList colorStateList = this.setLayoutAnimation;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.setLayoutAnimation.getDefaultColor()) : -16777216);
        float f = this.setNavigationOnClickListener;
        float f2 = this.setUiOptions;
        float f3 = this.setUnboundedRipple;
        ColorStateList colorStateList2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.MenuHostHelper$$ExternalSyntheticLambda0.getDefaultColor()) : 0);
    }

    public final void setX(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface y = setNextFocusForwardId.setY(context.getResources().getConfiguration(), typeface);
        if (y != null) {
            typeface = y;
        }
        textPaint.setTypeface(typeface);
        int i = this.ViewPager$SavedState$1 & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.setOnLongClickListener);
        if (this.setCenterIfNoTextEnabled) {
            textPaint.setLetterSpacing(this.setIconTintList);
        }
    }
}