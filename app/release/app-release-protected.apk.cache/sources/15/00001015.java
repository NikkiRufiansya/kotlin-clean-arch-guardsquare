package o;

import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import o.setTabContainer;

/* loaded from: classes.dex */
class setTabContainer$MenuHostHelper$$ExternalSyntheticLambda1 implements ListAdapter, SpinnerAdapter {
    private SpinnerAdapter setIconTintList;
    private ListAdapter setY;

    @Override // android.widget.Adapter
    public int getItemViewType(int i) {
        return 0;
    }

    @Override // android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    public setTabContainer$MenuHostHelper$$ExternalSyntheticLambda1(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
        this.setIconTintList = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.setY = (ListAdapter) spinnerAdapter;
        }
        if (theme != null) {
            if (Build.VERSION.SDK_INT >= 23 && setMinProgress.MenuHostHelper$$ExternalSyntheticLambda1(spinnerAdapter)) {
                setTabContainer.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(setMinProgress.setX(spinnerAdapter), theme);
            } else if (spinnerAdapter instanceof setHelperTextEnabled) {
                setHelperTextEnabled sethelpertextenabled = (setHelperTextEnabled) spinnerAdapter;
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        SpinnerAdapter spinnerAdapter = this.setIconTintList;
        if (spinnerAdapter == null) {
            return 0;
        }
        return spinnerAdapter.getCount();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        SpinnerAdapter spinnerAdapter = this.setIconTintList;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getItem(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        SpinnerAdapter spinnerAdapter = this.setIconTintList;
        if (spinnerAdapter == null) {
            return -1L;
        }
        return spinnerAdapter.getItemId(i);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        SpinnerAdapter spinnerAdapter = this.setIconTintList;
        if (spinnerAdapter == null) {
            return null;
        }
        return spinnerAdapter.getDropDownView(i, view, viewGroup);
    }

    @Override // android.widget.Adapter
    public boolean hasStableIds() {
        SpinnerAdapter spinnerAdapter = this.setIconTintList;
        return spinnerAdapter != null && spinnerAdapter.hasStableIds();
    }

    @Override // android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.setIconTintList;
        if (spinnerAdapter != null) {
            spinnerAdapter.registerDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        SpinnerAdapter spinnerAdapter = this.setIconTintList;
        if (spinnerAdapter != null) {
            spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
        }
    }

    @Override // android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.setY;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    @Override // android.widget.ListAdapter
    public boolean isEnabled(int i) {
        ListAdapter listAdapter = this.setY;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    @Override // android.widget.Adapter
    public boolean isEmpty() {
        return getCount() == 0;
    }
}