package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public class setChipSpacingHorizontal extends setCloseIconEndPadding implements Menu {
    private final setVerticalFadingEdgeEnabled setIconTintList;

    public setChipSpacingHorizontal(Context context, setVerticalFadingEdgeEnabled setverticalfadingedgeenabled) {
        super(context);
        if (setverticalfadingedgeenabled == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.setIconTintList = setverticalfadingedgeenabled;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return setIconTintList(this.setIconTintList.add(charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return setIconTintList(this.setIconTintList.add(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return setIconTintList(this.setIconTintList.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return setIconTintList(this.setIconTintList.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.addSubMenu(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.addSubMenu(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int addIntentOptions = this.setIconTintList.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = setIconTintList(menuItemArr2[i5]);
            }
        }
        return addIntentOptions;
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        setY(i);
        this.setIconTintList.removeItem(i);
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        MenuHostHelper$$ExternalSyntheticLambda0(i);
        this.setIconTintList.removeGroup(i);
    }

    @Override // android.view.Menu
    public void clear() {
        MenuHostHelper$$ExternalSyntheticLambda0();
        this.setIconTintList.clear();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.setIconTintList.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        this.setIconTintList.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        this.setIconTintList.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.setIconTintList.hasVisibleItems();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        return setIconTintList(this.setIconTintList.findItem(i));
    }

    @Override // android.view.Menu
    public int size() {
        return this.setIconTintList.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return setIconTintList(this.setIconTintList.getItem(i));
    }

    @Override // android.view.Menu
    public void close() {
        this.setIconTintList.close();
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.setIconTintList.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.setIconTintList.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return this.setIconTintList.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.setIconTintList.setQwertyMode(z);
    }
}