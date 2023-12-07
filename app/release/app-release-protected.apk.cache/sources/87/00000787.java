package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import o.setContentHeight;
import o.setErrorAccessibilityLabelResource;

/* renamed from: o.nq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0329nq extends View implements InterfaceC0327no {
    private setErrorAccessibilityLabelResource MenuHostHelper$$ExternalSyntheticLambda0;
    public C0337ny MenuHostHelper$$ExternalSyntheticLambda1;
    private final nq$MenuHostHelper$$ExternalSyntheticLambda1 setX;
    private setContentHeight setY;

    @Override // o.setErrorAccessibilityLabelResource.setOnLongClickListener
    public final void setIconTintList(int i) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v1, types: [o.nq$MenuHostHelper$$ExternalSyntheticLambda1] */
    public C0329nq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        pN.setX(context, "");
        this.setX = new setContentHeight.setY() { // from class: o.nq$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // o.setContentHeight.setY
            public final void MenuHostHelper$$ExternalSyntheticLambda0(int i2) {
            }

            @Override // o.setContentHeight.setY
            public final void setY(int i2, float f, int i3) {
                C0329nq.this.MenuHostHelper$$ExternalSyntheticLambda1(i2, f);
            }

            @Override // o.setContentHeight.setY
            public final void MenuHostHelper$$ExternalSyntheticLambda1(int i2) {
                C0329nq c0329nq = C0329nq.this;
                if (c0329nq.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation == 0) {
                    c0329nq.setCurrentPosition(i2);
                    c0329nq.setSlideProgress(0.0f);
                    c0329nq.invalidate();
                }
            }
        };
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new C0337ny();
    }

    public final void setMIndicatorOptions(C0337ny c0337ny) {
        pN.setX(c0337ny, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0337ny;
    }

    public final void setNormalSlideWidth(float f) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener = f;
    }

    public final void setCheckedSlideWidth(float f) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 = f;
    }

    public final void setCurrentPosition(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList = i;
    }

    public final void setIndicatorGap(float f) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1 = f;
    }

    public final void setCheckedColor(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setX = i;
    }

    public final void setNormalColor(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    public final void setSlideProgress(float f) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconSize = f;
    }

    public final void setupWithViewPager(setErrorAccessibilityLabelResource seterroraccessibilitylabelresource) {
        pN.setX(seterroraccessibilitylabelresource, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = seterroraccessibilitylabelresource;
        setX();
    }

    public final void setupWithViewPager(setContentHeight setcontentheight) {
        pN.setX(setcontentheight, "");
        this.setY = setcontentheight;
        setX();
    }

    public void setIndicatorOptions(C0337ny c0337ny) {
        pN.setX(c0337ny, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0337ny;
    }

    public void setX() {
        setErrorAccessibilityLabelResource seterroraccessibilitylabelresource = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (seterroraccessibilitylabelresource != null) {
            if (seterroraccessibilitylabelresource != null) {
                C0329nq c0329nq = this;
                List<setErrorAccessibilityLabelResource.setOnLongClickListener> list = seterroraccessibilitylabelresource.setX;
                if (list != null) {
                    list.remove(c0329nq);
                }
            }
            setErrorAccessibilityLabelResource seterroraccessibilitylabelresource2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (seterroraccessibilitylabelresource2 != null) {
                C0329nq c0329nq2 = this;
                if (seterroraccessibilitylabelresource2.setX == null) {
                    seterroraccessibilitylabelresource2.setX = new ArrayList();
                }
                seterroraccessibilitylabelresource2.setX.add(c0329nq2);
            }
            setErrorAccessibilityLabelResource seterroraccessibilitylabelresource3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (seterroraccessibilitylabelresource3 != null && seterroraccessibilitylabelresource3.setY != null) {
                setErrorAccessibilityLabelResource seterroraccessibilitylabelresource4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (seterroraccessibilitylabelresource4 == null) {
                    pN.setY();
                }
                setSelected setselected = seterroraccessibilitylabelresource4.setY;
                if (setselected == null) {
                    pN.setY();
                }
                pN.setIconTintList(setselected, "");
                this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions = setselected.setIconTintList();
            }
        }
        setContentHeight setcontentheight = this.setY;
        if (setcontentheight != null) {
            if (setcontentheight != null) {
                setcontentheight.setX.setIconTintList.remove(this.setX);
            }
            setContentHeight setcontentheight2 = this.setY;
            if (setcontentheight2 != null) {
                setcontentheight2.setX.setIconTintList.add(this.setX);
            }
            setContentHeight setcontentheight3 = this.setY;
            if (setcontentheight3 != null && setcontentheight3.setLayoutAnimation.setNavigationOnClickListener != null) {
                setContentHeight setcontentheight4 = this.setY;
                if (setcontentheight4 == null) {
                    pN.setY();
                }
                WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 = setcontentheight4.setLayoutAnimation.setNavigationOnClickListener;
                if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    pN.setY();
                }
                pN.setIconTintList(windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1, "");
                this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0$MenuHostHelper$$ExternalSyntheticLambda1.setY();
            }
        }
        requestLayout();
        invalidate();
    }

    @Override // o.setErrorAccessibilityLabelResource.setOnLongClickListener
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, float f) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation == 0 || this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions <= 1) {
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation == 4 || this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation == 5) {
            setCurrentPosition(i);
            setSlideProgress(f);
        } else if (i % this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions != this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions - 1) {
            setCurrentPosition(i);
            setSlideProgress(f);
        } else if (f < 0.5d) {
            setCurrentPosition(i);
            setSlideProgress(0.0f);
        } else {
            setCurrentPosition(0);
            setSlideProgress(0.0f);
        }
        invalidate();
    }

    @Override // o.setErrorAccessibilityLabelResource.setOnLongClickListener
    public final void setY(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation == 0) {
            setCurrentPosition(i);
            setSlideProgress(0.0f);
            invalidate();
        }
    }
}