package o;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class dumpAsync extends setErrorContentDescription implements Choreographer.FrameCallback {
    public setBoxStrokeErrorColor MenuHostHelper$$ExternalSyntheticLambda1;
    public float setUiOptions = 1.0f;
    private boolean setUnboundedRipple = false;
    private long setNavigationOnClickListener = 0;
    public float MenuHostHelper$$ExternalSyntheticLambda0 = 0.0f;
    private int setLayoutAnimation = 0;
    public float setIconTintList = -2.1474836E9f;
    public float setY = 2.1474836E9f;
    public boolean setOnLongClickListener = false;

    @Override // android.animation.ValueAnimator
    public final Object getAnimatedValue() {
        return Float.valueOf(setIconTintList());
    }

    public final float setIconTintList() {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokeerrorcolor == null) {
            return 0.0f;
        }
        return (this.MenuHostHelper$$ExternalSyntheticLambda0 - setboxstrokeerrorcolor.setChipCornerRadius) / (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 - this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius);
    }

    @Override // android.animation.ValueAnimator
    public final float getAnimatedFraction() {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = 0.0f;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return 0.0f;
        }
        if (!(this.setUiOptions < 0.0f)) {
            float f7 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            setBoxStrokeErrorColor setboxstrokeerrorcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setboxstrokeerrorcolor == null) {
                f = 0.0f;
            } else {
                f = this.setIconTintList;
                if (f == -2.1474836E9f) {
                    f = setboxstrokeerrorcolor.setChipCornerRadius;
                }
            }
            f2 = f7 - f;
            setBoxStrokeErrorColor setboxstrokeerrorcolor2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setboxstrokeerrorcolor2 == null) {
                f3 = 0.0f;
            } else {
                f3 = this.setY;
                if (f3 == 2.1474836E9f) {
                    f3 = setboxstrokeerrorcolor2.MenuHostHelper$$ExternalSyntheticLambda1;
                }
            }
            setBoxStrokeErrorColor setboxstrokeerrorcolor3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setboxstrokeerrorcolor3 != null) {
                f6 = this.setIconTintList;
                if (f6 == -2.1474836E9f) {
                    f4 = setboxstrokeerrorcolor3.setChipCornerRadius;
                    f6 = f4;
                }
            }
            return f2 / (f3 - f6);
        }
        setBoxStrokeErrorColor setboxstrokeerrorcolor4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokeerrorcolor4 == null) {
            f5 = 0.0f;
        } else {
            f5 = this.setY;
            if (f5 == 2.1474836E9f) {
                f5 = setboxstrokeerrorcolor4.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        }
        f2 = f5 - this.MenuHostHelper$$ExternalSyntheticLambda0;
        setBoxStrokeErrorColor setboxstrokeerrorcolor5 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokeerrorcolor5 == null) {
            f3 = 0.0f;
        } else {
            f3 = this.setY;
            if (f3 == 2.1474836E9f) {
                f3 = setboxstrokeerrorcolor5.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        }
        setBoxStrokeErrorColor setboxstrokeerrorcolor6 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokeerrorcolor6 != null) {
            f6 = this.setIconTintList;
            if (f6 == -2.1474836E9f) {
                f4 = setboxstrokeerrorcolor6.setChipCornerRadius;
                f6 = f4;
            }
        }
        return f2 / (f3 - f6);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final long getDuration() {
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokeerrorcolor == null) {
            return 0L;
        }
        return ((setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda1 - setboxstrokeerrorcolor.setChipCornerRadius) / setboxstrokeerrorcolor.setIconTintList) * 1000.0f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final boolean isRunning() {
        return this.setOnLongClickListener;
    }

    public final void setIconTintList(float f) {
        float f2;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == f) {
            return;
        }
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
        float f3 = 0.0f;
        if (setboxstrokeerrorcolor == null) {
            f2 = 0.0f;
        } else {
            f2 = this.setIconTintList;
            if (f2 == -2.1474836E9f) {
                f2 = setboxstrokeerrorcolor.setChipCornerRadius;
            }
        }
        setBoxStrokeErrorColor setboxstrokeerrorcolor2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokeerrorcolor2 != null) {
            f3 = this.setY;
            if (f3 == 2.1474836E9f) {
                f3 = setboxstrokeerrorcolor2.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setAnimateOnTouchUp.setIconTintList(f, f2, f3);
        this.setNavigationOnClickListener = 0L;
        setX();
    }

    public final void setX(float f, float f2) {
        if (f > f2) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
        setBoxStrokeErrorColor setboxstrokeerrorcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
        float f3 = setboxstrokeerrorcolor == null ? -3.4028235E38f : setboxstrokeerrorcolor.setChipCornerRadius;
        setBoxStrokeErrorColor setboxstrokeerrorcolor2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        float f4 = setboxstrokeerrorcolor2 == null ? Float.MAX_VALUE : setboxstrokeerrorcolor2.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setIconTintList = setAnimateOnTouchUp.setIconTintList(f, f3, f4);
        this.setY = setAnimateOnTouchUp.setIconTintList(f2, f3, f4);
        setIconTintList((int) setAnimateOnTouchUp.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, f, f2));
    }

    @Override // android.animation.ValueAnimator
    public final void setRepeatMode(int i) {
        super.setRepeatMode(i);
        if (i == 2 || !this.setUnboundedRipple) {
            return;
        }
        this.setUnboundedRipple = false;
        this.setUiOptions = -this.setUiOptions;
    }

    public final void setLayoutAnimation() {
        float f;
        float f2;
        this.setOnLongClickListener = true;
        float f3 = 0.0f;
        setX(this.setUiOptions < 0.0f);
        if (this.setUiOptions < 0.0f) {
            setBoxStrokeErrorColor setboxstrokeerrorcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setboxstrokeerrorcolor != null) {
                f = this.setY;
                if (f == 2.1474836E9f) {
                    f2 = setboxstrokeerrorcolor.MenuHostHelper$$ExternalSyntheticLambda1;
                    f3 = f2;
                }
                f3 = f;
            }
        } else {
            setBoxStrokeErrorColor setboxstrokeerrorcolor2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setboxstrokeerrorcolor2 != null) {
                f = this.setIconTintList;
                if (f == -2.1474836E9f) {
                    f2 = setboxstrokeerrorcolor2.setChipCornerRadius;
                    f3 = f2;
                }
                f3 = f;
            }
        }
        setIconTintList((int) f3);
        this.setNavigationOnClickListener = 0L;
        this.setLayoutAnimation = 0;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    public final void setNavigationOnClickListener() {
        float f;
        float f2;
        this.setOnLongClickListener = true;
        if (isRunning()) {
            Choreographer.getInstance().removeFrameCallback(this);
            Choreographer.getInstance().postFrameCallback(this);
        }
        this.setNavigationOnClickListener = 0L;
        float f3 = 0.0f;
        if (this.setUiOptions < 0.0f) {
            float f4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            setBoxStrokeErrorColor setboxstrokeerrorcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setboxstrokeerrorcolor == null) {
                f2 = 0.0f;
            } else {
                f2 = this.setIconTintList;
                if (f2 == -2.1474836E9f) {
                    f2 = setboxstrokeerrorcolor.setChipCornerRadius;
                }
            }
            if (f4 == f2) {
                setBoxStrokeErrorColor setboxstrokeerrorcolor2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (setboxstrokeerrorcolor2 != null) {
                    float f5 = this.setY;
                    f3 = f5 == 2.1474836E9f ? setboxstrokeerrorcolor2.MenuHostHelper$$ExternalSyntheticLambda1 : f5;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0 = f3;
                return;
            }
        }
        if (this.setUiOptions < 0.0f) {
            return;
        }
        float f6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        setBoxStrokeErrorColor setboxstrokeerrorcolor3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxstrokeerrorcolor3 == null) {
            f = 0.0f;
        } else {
            f = this.setY;
            if (f == 2.1474836E9f) {
                f = setboxstrokeerrorcolor3.MenuHostHelper$$ExternalSyntheticLambda1;
            }
        }
        if (f6 == f) {
            setBoxStrokeErrorColor setboxstrokeerrorcolor4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setboxstrokeerrorcolor4 != null) {
                float f7 = this.setIconTintList;
                f3 = f7 == -2.1474836E9f ? setboxstrokeerrorcolor4.setChipCornerRadius : f7;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = f3;
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public final void cancel() {
        MenuHostHelper$$ExternalSyntheticLambda0();
        Choreographer.getInstance().removeFrameCallback(this);
        this.setOnLongClickListener = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e9  */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void doFrame(long r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dumpAsync.doFrame(long):void");
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        Choreographer.getInstance().removeFrameCallback(this);
        this.setOnLongClickListener = false;
        setIconTintList(this.setUiOptions < 0.0f);
    }
}