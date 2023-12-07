package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public class setImageTintList<V extends View> extends CoordinatorLayout.setIconTintList<V> {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    private setAppSearchData setX;

    public setImageTintList() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    }

    public setImageTintList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.setIconTintList
    public boolean MenuHostHelper$$ExternalSyntheticLambda1(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
        setX(coordinatorLayout, (androidx.coordinatorlayout.widget.CoordinatorLayout) v, i);
        if (this.setX == null) {
            this.setX = new setAppSearchData(v);
        }
        setAppSearchData setappsearchdata = this.setX;
        setappsearchdata.setX = setappsearchdata.setY.getTop();
        setappsearchdata.MenuHostHelper$$ExternalSyntheticLambda1 = setappsearchdata.setY.getLeft();
        this.setX.setY();
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 != 0) {
            setAppSearchData setappsearchdata2 = this.setX;
            if (setappsearchdata2.MenuHostHelper$$ExternalSyntheticLambda0 && setappsearchdata2.setIconTintList != i2) {
                setappsearchdata2.setIconTintList = i2;
                setappsearchdata2.setY();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setX(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.MenuHostHelper$$ExternalSyntheticLambda1(v, i);
    }

    public boolean setX(int i) {
        setAppSearchData setappsearchdata = this.setX;
        if (setappsearchdata == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            return false;
        } else if (!setappsearchdata.MenuHostHelper$$ExternalSyntheticLambda0 || setappsearchdata.setIconTintList == i) {
            return false;
        } else {
            setappsearchdata.setIconTintList = i;
            setappsearchdata.setY();
            return true;
        }
    }

    public int setIconTintList() {
        setAppSearchData setappsearchdata = this.setX;
        if (setappsearchdata != null) {
            return setappsearchdata.setIconTintList;
        }
        return 0;
    }
}