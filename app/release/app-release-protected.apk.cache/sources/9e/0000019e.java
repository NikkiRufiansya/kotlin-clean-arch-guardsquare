package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
public final class FirebaseApp extends setCardBackgroundColor implements setStatusBarScrimColor {
    private View[] setLayoutAnimation;
    private float setUiOptions;
    boolean setX;
    boolean setY;

    public final void setProgress(View view, float f) {
    }

    public FirebaseApp(Context context) {
        super(context);
        this.setX = false;
        this.setY = false;
    }

    public FirebaseApp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setX = false;
        this.setY = false;
        setY(attributeSet);
    }

    public FirebaseApp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setX = false;
        this.setY = false;
        setY(attributeSet);
    }

    @Override // o.setCardBackgroundColor
    public final void setY(AttributeSet attributeSet) {
        super.setY(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setPopupBackgroundDrawable);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setExpandedTitleMargin.setY.copyWindowDataInto) {
                    this.setX = obtainStyledAttributes.getBoolean(index, this.setX);
                } else if (index == setExpandedTitleMargin.setY.setActiveSelection) {
                    this.setY = obtainStyledAttributes.getBoolean(index, this.setY);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public final void setProgress(float f) {
        this.setUiOptions = f;
        int i = 0;
        if (this.setIconTintList > 0) {
            this.setLayoutAnimation = MenuHostHelper$$ExternalSyntheticLambda0((setMIndicatorOptions) getParent());
            while (i < this.setIconTintList) {
                setProgress(this.setLayoutAnimation[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof FirebaseApp)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }
}