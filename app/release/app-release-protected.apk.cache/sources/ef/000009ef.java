package o;

import android.widget.ListView;
import o.setItemHorizontalTranslationEnabled;

/* loaded from: classes.dex */
public final class setCheckedIconGravity extends setPasswordVisibilityToggleEnabled {
    private final ListView setNavigationOnClickListener;

    public setCheckedIconGravity(ListView listView) {
        super(listView);
        this.setNavigationOnClickListener = listView;
    }

    @Override // o.setPasswordVisibilityToggleEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        setItemHorizontalTranslationEnabled.setIconTintList.setIconTintList(this.setNavigationOnClickListener, i);
    }

    @Override // o.setPasswordVisibilityToggleEnabled
    public final boolean setY(int i) {
        ListView listView = this.setNavigationOnClickListener;
        int count = listView.getCount();
        if (count == 0) {
            return false;
        }
        int childCount = listView.getChildCount();
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        if (i > 0) {
            if (firstVisiblePosition + childCount >= count && listView.getChildAt(childCount - 1).getBottom() <= listView.getHeight()) {
                return false;
            }
        } else if (i >= 0) {
            return false;
        } else {
            if (firstVisiblePosition <= 0 && listView.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }
}