package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import o.setExpandedTitleMargin;
import o.setMIndicatorOptions;

/* loaded from: classes.dex */
public class AndroidExceptionPreHandler extends setCardBackgroundColor {
    private int setUnboundedRipple;
    zzB setX;
    int setY;

    public AndroidExceptionPreHandler(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public AndroidExceptionPreHandler(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    public AndroidExceptionPreHandler(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    public void setType(int i) {
        this.setY = i;
    }

    private void setX(setVisibility setvisibility, int i, boolean z) {
        this.setUnboundedRipple = i;
        if (z) {
            int i2 = this.setY;
            if (i2 == 5) {
                this.setUnboundedRipple = 1;
            } else if (i2 == 6) {
                this.setUnboundedRipple = 0;
            }
        } else {
            int i3 = this.setY;
            if (i3 == 5) {
                this.setUnboundedRipple = 0;
            } else if (i3 == 6) {
                this.setUnboundedRipple = 1;
            }
        }
        if (setvisibility instanceof zzB) {
            ((zzB) setvisibility).setY = this.setUnboundedRipple;
        }
    }

    @Override // o.setCardBackgroundColor
    public final void setX(setVisibility setvisibility, boolean z) {
        setX(setvisibility, this.setY, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setCardBackgroundColor
    public final void setY(AttributeSet attributeSet) {
        super.setY(attributeSet);
        this.setX = new zzB();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setX);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setExpandedTitleMargin.setY.setOnLongClickListener) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index != setExpandedTitleMargin.setY.setUnboundedRipple) {
                    if (index == setExpandedTitleMargin.setY.setLayoutAnimation) {
                        this.setX.setX = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    }
                } else {
                    this.setX.setIconTintList = obtainStyledAttributes.getBoolean(index, true);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = this.setX;
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.setX.setIconTintList = z;
    }

    public void setDpMargin(int i) {
        this.setX.setX = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.setX.setX = i;
    }

    @Override // o.setCardBackgroundColor
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx, setForceApplySystemWindowInsetTop setforceapplysystemwindowinsettop, setMIndicatorOptions.setIconTintList seticontintlist, SparseArray<setVisibility> sparseArray) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(setx, setforceapplysystemwindowinsettop, seticontintlist, sparseArray);
        if (setforceapplysystemwindowinsettop instanceof zzB) {
            zzB zzb = (zzB) setforceapplysystemwindowinsettop;
            setX(zzb, setx.setY.setImageTintMode, ((setButtonTintBlendMode) setforceapplysystemwindowinsettop.RecyclerView$SavedState$1).TextInputLayout$SavedState$1);
            zzb.setIconTintList = setx.setY.setSelectedChildViewEnabled;
            zzb.setX = setx.setY.setChipIconEnabled;
        }
    }
}