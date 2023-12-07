package o;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import o.TextInputLayout$SavedState$1;

/* loaded from: classes.dex */
public final class setSubmitButtonEnabled extends BaseAdapter {
    private int MenuHostHelper$$ExternalSyntheticLambda0 = -1;
    private final int MenuHostHelper$$ExternalSyntheticLambda1;
    private final LayoutInflater setIconTintList;
    private final boolean setLayoutAnimation;
    boolean setX;
    public setNavigationIconTint setY;

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    public setSubmitButtonEnabled(setNavigationIconTint setnavigationicontint, LayoutInflater layoutInflater, boolean z, int i) {
        this.setLayoutAnimation = z;
        this.setIconTintList = layoutInflater;
        this.setY = setnavigationicontint;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<ActionMenuPresenter$SavedState$1> x = this.setLayoutAnimation ? this.setY.setX() : this.setY.setUnboundedRipple();
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 < 0) {
            return x.size();
        }
        return x.size() - 1;
    }

    @Override // android.widget.Adapter
    /* renamed from: setIconTintList */
    public final ActionMenuPresenter$SavedState$1 getItem(int i) {
        ArrayList<ActionMenuPresenter$SavedState$1> x = this.setLayoutAnimation ? this.setY.setX() : this.setY.setUnboundedRipple();
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return x.get(i);
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.setIconTintList.inflate(this.MenuHostHelper$$ExternalSyntheticLambda1, viewGroup, false);
        }
        int groupId = getItem(i).getGroupId();
        int i2 = i - 1;
        int groupId2 = i2 >= 0 ? getItem(i2).getGroupId() : groupId;
        FabTransformationBehavior fabTransformationBehavior = (FabTransformationBehavior) view;
        if (this.setY.setOnLongClickListener() && groupId != groupId2) {
            z = true;
        }
        fabTransformationBehavior.setGroupDividerEnabled(z);
        TextInputLayout$SavedState$1.setY sety = (TextInputLayout$SavedState$1.setY) view;
        if (this.setX) {
            fabTransformationBehavior.setForceShowIcon(true);
        }
        sety.setIconTintList(getItem(i));
        return view;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setY.setX;
        if (actionMenuPresenter$SavedState$1 != null) {
            ArrayList<ActionMenuPresenter$SavedState$1> x = this.setY.setX();
            int size = x.size();
            for (int i = 0; i < size; i++) {
                if (x.get(i) == actionMenuPresenter$SavedState$1) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                    return;
                }
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        MenuHostHelper$$ExternalSyntheticLambda0();
        super.notifyDataSetChanged();
    }
}