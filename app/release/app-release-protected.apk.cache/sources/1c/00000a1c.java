package o;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class setChipIconEnabledResource implements setEdgeEffectFactory, setBackgroundTintMode, AdapterView.OnItemClickListener {
    Rect setUnboundedRipple;

    @Override // o.setBackgroundTintMode
    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        return 0;
    }

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(int i);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(PopupWindow.OnDismissListener onDismissListener);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(int i);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(View view);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(boolean z);

    protected boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return true;
    }

    @Override // o.setBackgroundTintMode
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return false;
    }

    public abstract void setX(int i);

    @Override // o.setBackgroundTintMode
    public final void setX(Context context, setNavigationIconTint setnavigationicontint) {
    }

    public abstract void setY(setNavigationIconTint setnavigationicontint);

    public abstract void setY(boolean z);

    @Override // o.setBackgroundTintMode
    public final boolean setY(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        setSubmitButtonEnabled setsubmitbuttonenabled;
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        if (listAdapter instanceof HeaderViewListAdapter) {
            setsubmitbuttonenabled = (setSubmitButtonEnabled) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter();
        } else {
            setsubmitbuttonenabled = (setSubmitButtonEnabled) listAdapter;
        }
        setsubmitbuttonenabled.setY.setX((MenuItem) listAdapter.getItem(i), this, MenuHostHelper$$ExternalSyntheticLambda1() ? 0 : 4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int setY(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        FrameLayout frameLayout = null;
        View view = null;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean setIconTintList(setNavigationIconTint setnavigationicontint) {
        int size = setnavigationicontint.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = setnavigationicontint.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }
}