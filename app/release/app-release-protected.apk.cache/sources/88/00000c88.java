package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import o.setAnimationFromJson;

/* loaded from: classes.dex */
public final class setImageAssetDelegate extends View {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private WeakReference<View> MenuHostHelper$$ExternalSyntheticLambda1;
    private LayoutInflater setIconTintList;
    private setX setX;
    private int setY;

    /* loaded from: classes.dex */
    public interface setX {
        void setIconTintList(setImageAssetDelegate setimageassetdelegate, View view);
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public setImageAssetDelegate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public setImageAssetDelegate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setSecondaryProgress, i, 0);
        this.setY = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.setOnSearchClickListener, -1);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.wait, 0);
        setId(obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.setTabIconTintResource, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final void setInflatedId(int i) {
        this.setY = i;
    }

    public final void setLayoutResource(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.setIconTintList = layoutInflater;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        WeakReference<View> weakReference = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            setIconTintList();
        }
    }

    public final View setIconTintList() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.setIconTintList;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.MenuHostHelper$$ExternalSyntheticLambda0, viewGroup, false);
                int i = this.setY;
                if (i != -1) {
                    inflate.setId(i);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = new WeakReference<>(inflate);
                setX setx = this.setX;
                if (setx != null) {
                    setx.setIconTintList(this, inflate);
                }
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public final void setOnInflateListener(setX setx) {
        this.setX = setx;
    }
}