package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
abstract class setCloseIconEndPadding {
    final Context MenuHostHelper$$ExternalSyntheticLambda0;
    private setDividerHeight<preHandler, SubMenu> MenuHostHelper$$ExternalSyntheticLambda1;
    private setDividerHeight<setCustomSelectionActionModeCallback, MenuItem> setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCloseIconEndPadding(Context context) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final MenuItem setIconTintList(MenuItem menuItem) {
        if (menuItem instanceof setCustomSelectionActionModeCallback) {
            setCustomSelectionActionModeCallback setcustomselectionactionmodecallback = (setCustomSelectionActionModeCallback) menuItem;
            if (this.setY == null) {
                this.setY = new setDividerHeight<>();
            }
            MenuItem menuItem2 = this.setY.get(setcustomselectionactionmodecallback);
            if (menuItem2 == null) {
                setEmptyView setemptyview = new setEmptyView(this.MenuHostHelper$$ExternalSyntheticLambda0, setcustomselectionactionmodecallback);
                this.setY.put(setcustomselectionactionmodecallback, setemptyview);
                return setemptyview;
            }
            return menuItem2;
        }
        return menuItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final SubMenu MenuHostHelper$$ExternalSyntheticLambda1(SubMenu subMenu) {
        if (subMenu instanceof preHandler) {
            preHandler prehandler = (preHandler) subMenu;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = new setDividerHeight<>();
            }
            SubMenu subMenu2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(prehandler);
            if (subMenu2 == null) {
                setMinEms setminems = new setMinEms(this.MenuHostHelper$$ExternalSyntheticLambda0, prehandler);
                this.MenuHostHelper$$ExternalSyntheticLambda1.put(prehandler, setminems);
                return setminems;
            }
            return subMenu2;
        }
        return subMenu;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        setDividerHeight<setCustomSelectionActionModeCallback, MenuItem> setdividerheight = this.setY;
        if (setdividerheight != null) {
            setdividerheight.clear();
        }
        setDividerHeight<preHandler, SubMenu> setdividerheight2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setdividerheight2 != null) {
            setdividerheight2.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (this.setY == null) {
            return;
        }
        int i2 = 0;
        while (i2 < this.setY.size()) {
            if (((setCustomSelectionActionModeCallback) this.setY.setX[i2 << 1]).getGroupId() == i) {
                this.setY.setIconTintList(i2);
                i2--;
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(int i) {
        if (this.setY == null) {
            return;
        }
        for (int i2 = 0; i2 < this.setY.size(); i2++) {
            if (((setCustomSelectionActionModeCallback) this.setY.setX[i2 << 1]).getItemId() == i) {
                this.setY.setIconTintList(i2);
                return;
            }
        }
    }
}