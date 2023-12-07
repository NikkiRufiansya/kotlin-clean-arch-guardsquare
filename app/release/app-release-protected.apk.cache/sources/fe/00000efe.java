package o;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import o.TextInputLayout$SavedState$1;
import o.setBackgroundTintMode;

/* loaded from: classes.dex */
public final class setRevealInfo implements setBackgroundTintMode, AdapterView.OnItemClickListener {
    int MenuHostHelper$$ExternalSyntheticLambda0;
    public LayoutInflater MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    public Fragment$5 setLayoutAnimation;
    private Context setNavigationOnClickListener;
    setNavigationIconTint setOnLongClickListener;
    private int setUiOptions;
    private int setUnboundedRipple;
    public setY setX;
    public setBackgroundTintMode.setY setY;

    @Override // o.setBackgroundTintMode
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return false;
    }

    @Override // o.setBackgroundTintMode
    public final boolean setX() {
        return false;
    }

    @Override // o.setBackgroundTintMode
    public final boolean setY(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return false;
    }

    public setRevealInfo(Context context, int i) {
        this(R.layout.res_0x7f0d0010);
        this.setNavigationOnClickListener = context;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = LayoutInflater.from(context);
    }

    private setRevealInfo(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.setUnboundedRipple = 0;
    }

    @Override // o.setBackgroundTintMode
    public final void setX(Context context, setNavigationIconTint setnavigationicontint) {
        if (this.setNavigationOnClickListener != null) {
            this.setNavigationOnClickListener = context;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = LayoutInflater.from(context);
            }
        }
        this.setOnLongClickListener = setnavigationicontint;
        setY sety = this.setX;
        if (sety != null) {
            sety.notifyDataSetChanged();
        }
    }

    @Override // o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        setY sety = this.setX;
        if (sety != null) {
            sety.notifyDataSetChanged();
        }
    }

    @Override // o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setBackgroundTintMode.setY sety) {
        this.setY = sety;
    }

    @Override // o.setBackgroundTintMode
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(minusKey minuskey) {
        if (minuskey.hasVisibleItems()) {
            setLineBreakStyle setlinebreakstyle = new setLineBreakStyle(minuskey);
            setNavigationIconTint setnavigationicontint = setlinebreakstyle.setY;
            setTextAppearanceResource$MenuHostHelper$$ExternalSyntheticLambda0 settextappearanceresource_menuhosthelper__externalsyntheticlambda0 = new setTextAppearanceResource$MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda0);
            setRevealInfo setrevealinfo = new setRevealInfo(settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.setX, R.layout.res_0x7f0d0010);
            setlinebreakstyle.MenuHostHelper$$ExternalSyntheticLambda1 = setrevealinfo;
            setrevealinfo.setY = setlinebreakstyle;
            setNavigationIconTint setnavigationicontint2 = setlinebreakstyle.setY;
            setnavigationicontint2.setIconTintList(setlinebreakstyle.MenuHostHelper$$ExternalSyntheticLambda1, setnavigationicontint2.MenuHostHelper$$ExternalSyntheticLambda0);
            setRevealInfo setrevealinfo2 = setlinebreakstyle.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setrevealinfo2.setX == null) {
                setrevealinfo2.setX = new setY();
            }
            settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.setY = setrevealinfo2.setX;
            settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.setLayoutDirection = setlinebreakstyle;
            View view = setnavigationicontint.setLayoutAnimation;
            if (view != null) {
                settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.setOnLongClickListener = view;
            } else {
                settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.setNavigationOnClickListener = setnavigationicontint.setIconTintList;
                settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.SearchView$SavedState$1 = setnavigationicontint.setUiOptions;
            }
            settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.setCheckedIconEnabled = setlinebreakstyle;
            setTextAppearanceResource MenuHostHelper$$ExternalSyntheticLambda1 = settextappearanceresource_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1();
            setlinebreakstyle.setIconTintList = MenuHostHelper$$ExternalSyntheticLambda1;
            MenuHostHelper$$ExternalSyntheticLambda1.setOnDismissListener(setlinebreakstyle);
            WindowManager.LayoutParams attributes = setlinebreakstyle.setIconTintList.getWindow().getAttributes();
            attributes.type = 1003;
            attributes.flags |= 131072;
            setlinebreakstyle.setIconTintList.show();
            setBackgroundTintMode.setY sety = this.setY;
            if (sety != null) {
                sety.setY(minuskey);
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // o.setBackgroundTintMode
    public final void setIconTintList(setNavigationIconTint setnavigationicontint, boolean z) {
        setBackgroundTintMode.setY sety = this.setY;
        if (sety != null) {
            sety.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint, z);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.setOnLongClickListener.setX(this.setX.getItem(i), this, 0);
    }

    @Override // o.setBackgroundTintMode
    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setUiOptions;
    }

    @Override // o.setBackgroundTintMode
    public final Parcelable setOnLongClickListener() {
        if (this.setLayoutAnimation == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        Fragment$5 fragment$5 = this.setLayoutAnimation;
        if (fragment$5 != null) {
            fragment$5.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // o.setBackgroundTintMode
    public final void setIconTintList(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.setLayoutAnimation.restoreHierarchyState(sparseParcelableArray);
        }
    }

    /* loaded from: classes.dex */
    public class setY extends BaseAdapter {
        private int setY = -1;

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        public setY() {
            setY();
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            int size = setRevealInfo.this.setOnLongClickListener.setX().size() - setRevealInfo.this.setIconTintList;
            return this.setY < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        /* renamed from: setX */
        public final ActionMenuPresenter$SavedState$1 getItem(int i) {
            ArrayList<ActionMenuPresenter$SavedState$1> x = setRevealInfo.this.setOnLongClickListener.setX();
            int i2 = i + setRevealInfo.this.setIconTintList;
            int i3 = this.setY;
            if (i3 >= 0 && i2 >= i3) {
                i2++;
            }
            return x.get(i2);
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = setRevealInfo.this.MenuHostHelper$$ExternalSyntheticLambda1.inflate(setRevealInfo.this.MenuHostHelper$$ExternalSyntheticLambda0, viewGroup, false);
            }
            ((TextInputLayout$SavedState$1.setY) view).setIconTintList(getItem(i));
            return view;
        }

        private void setY() {
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = setRevealInfo.this.setOnLongClickListener.setX;
            if (actionMenuPresenter$SavedState$1 != null) {
                ArrayList<ActionMenuPresenter$SavedState$1> x = setRevealInfo.this.setOnLongClickListener.setX();
                int size = x.size();
                for (int i = 0; i < size; i++) {
                    if (x.get(i) == actionMenuPresenter$SavedState$1) {
                        this.setY = i;
                        return;
                    }
                }
            }
            this.setY = -1;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            setY();
            super.notifyDataSetChanged();
        }
    }
}