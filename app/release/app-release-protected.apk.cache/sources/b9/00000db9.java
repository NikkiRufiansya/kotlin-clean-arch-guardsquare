package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class setNavigationIconTint implements setVerticalFadingEdgeEnabled {
    private static final int[] setTextAlignment = {1, 4, 5, 3, 2, 0};
    public final Context MenuHostHelper$$ExternalSyntheticLambda0;
    public setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1;
    private ContextMenu.ContextMenuInfo ViewPager$SavedState$1;
    private boolean setGuidelinePercent;
    Drawable setIconTintList;
    View setLayoutAnimation;
    private final Resources setLayoutDirection;
    private boolean setMinAndMaxProgress;
    CharSequence setUiOptions;
    ActionMenuPresenter$SavedState$1 setX;
    private boolean setZ;
    public int setY = 0;
    private boolean setCheckedIconEnabled = false;
    private boolean setOnNavigationItemSelectedListener = false;
    private boolean setTextAppearanceResource = false;
    boolean setIconSize = false;
    private boolean setMaxEms = false;
    private ArrayList<ActionMenuPresenter$SavedState$1> setHasDecor = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<setBackgroundTintMode>> setChipCornerRadius = new CopyOnWriteArrayList<>();
    private boolean setTextScaleX = false;
    ArrayList<ActionMenuPresenter$SavedState$1> setNavigationOnClickListener = new ArrayList<>();
    private ArrayList<ActionMenuPresenter$SavedState$1> SearchView$SavedState$1 = new ArrayList<>();
    boolean setOnLongClickListener = true;
    private ArrayList<ActionMenuPresenter$SavedState$1> setCenterIfNoTextEnabled = new ArrayList<>();
    private ArrayList<ActionMenuPresenter$SavedState$1> setAnimationFromJson = new ArrayList<>();
    boolean setUnboundedRipple = true;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        boolean MenuHostHelper$$ExternalSyntheticLambda0(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1);
    }

    public setNavigationIconTint MenuHostHelper$$ExternalSyntheticLambda1() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String setY() {
        return "android:menu:actionviewstates";
    }

    public setNavigationIconTint(Context context) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
        this.setLayoutDirection = context.getResources();
        setChipCornerRadius();
    }

    public final void setIconTintList(setBackgroundTintMode setbackgroundtintmode, Context context) {
        this.setChipCornerRadius.add(new WeakReference<>(setbackgroundtintmode));
        setbackgroundtintmode.setX(context, this);
        this.setUnboundedRipple = true;
    }

    public final void setX(setBackgroundTintMode setbackgroundtintmode) {
        Iterator<WeakReference<setBackgroundTintMode>> it = this.setChipCornerRadius.iterator();
        while (it.hasNext()) {
            WeakReference<setBackgroundTintMode> next = it.next();
            setBackgroundTintMode setbackgroundtintmode2 = next.get();
            if (setbackgroundtintmode2 == null || setbackgroundtintmode2 == setbackgroundtintmode) {
                this.setChipCornerRadius.remove(next);
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        if (this.setChipCornerRadius.isEmpty()) {
            return;
        }
        setIconSize();
        Iterator<WeakReference<setBackgroundTintMode>> it = this.setChipCornerRadius.iterator();
        while (it.hasNext()) {
            WeakReference<setBackgroundTintMode> next = it.next();
            setBackgroundTintMode setbackgroundtintmode = next.get();
            if (setbackgroundtintmode == null) {
                this.setChipCornerRadius.remove(next);
            } else {
                setbackgroundtintmode.MenuHostHelper$$ExternalSyntheticLambda0(z);
            }
        }
        setUiOptions();
    }

    private boolean setY(minusKey minuskey, setBackgroundTintMode setbackgroundtintmode) {
        if (this.setChipCornerRadius.isEmpty()) {
            return false;
        }
        boolean MenuHostHelper$$ExternalSyntheticLambda1 = setbackgroundtintmode != null ? setbackgroundtintmode.MenuHostHelper$$ExternalSyntheticLambda1(minuskey) : false;
        Iterator<WeakReference<setBackgroundTintMode>> it = this.setChipCornerRadius.iterator();
        while (it.hasNext()) {
            WeakReference<setBackgroundTintMode> next = it.next();
            setBackgroundTintMode setbackgroundtintmode2 = next.get();
            if (setbackgroundtintmode2 == null) {
                this.setChipCornerRadius.remove(next);
            } else if (!MenuHostHelper$$ExternalSyntheticLambda1) {
                MenuHostHelper$$ExternalSyntheticLambda1 = setbackgroundtintmode2.MenuHostHelper$$ExternalSyntheticLambda1(minuskey);
            }
        }
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((minusKey) item.getSubMenu()).MenuHostHelper$$ExternalSyntheticLambda1(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(setY(), sparseArray);
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(setY());
        int size = size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((minusKey) item.getSubMenu()).MenuHostHelper$$ExternalSyntheticLambda0(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 <= 0 || (findItem = findItem(i2)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 setnavigationicontint_menuhosthelper__externalsyntheticlambda0) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setnavigationicontint_menuhosthelper__externalsyntheticlambda0;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return MenuHostHelper$$ExternalSyntheticLambda0(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i) {
        return MenuHostHelper$$ExternalSyntheticLambda0(0, 0, 0, this.setLayoutDirection.getString(i));
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return MenuHostHelper$$ExternalSyntheticLambda0(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(int i, int i2, int i3, int i4) {
        return MenuHostHelper$$ExternalSyntheticLambda0(i, i2, i3, this.setLayoutDirection.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.setLayoutDirection.getString(i));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = (ActionMenuPresenter$SavedState$1) MenuHostHelper$$ExternalSyntheticLambda0(i, i2, i3, charSequence);
        minusKey minuskey = new minusKey(this.MenuHostHelper$$ExternalSyntheticLambda0, this, actionMenuPresenter$SavedState$1);
        actionMenuPresenter$SavedState$1.ViewPager$SavedState$1 = minuskey;
        minuskey.setHeaderTitle(actionMenuPresenter$SavedState$1.getTitle());
        return minuskey;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.setLayoutDirection.getString(i4));
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.setTextScaleX = z;
    }

    public boolean setOnLongClickListener() {
        return this.setTextScaleX;
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.MenuHostHelper$$ExternalSyntheticLambda0.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i5);
            Intent intent2 = new Intent(resolveInfo.specificIndex < 0 ? intent : intentArr[resolveInfo.specificIndex]);
            intent2.setComponent(new ComponentName(((PackageItemInfo) ((ComponentInfo) resolveInfo.activityInfo).applicationInfo).packageName, ((PackageItemInfo) resolveInfo.activityInfo).name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && resolveInfo.specificIndex >= 0) {
                menuItemArr[resolveInfo.specificIndex] = intent3;
            }
        }
        return size;
    }

    private void setY(int i, boolean z) {
        if (i < 0 || i >= this.setNavigationOnClickListener.size()) {
            return;
        }
        this.setNavigationOnClickListener.remove(i);
        if (z) {
            setIconTintList(true);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setX;
        if (actionMenuPresenter$SavedState$1 != null) {
            setY(actionMenuPresenter$SavedState$1);
        }
        this.setNavigationOnClickListener.clear();
        setIconTintList(true);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.setNavigationOnClickListener.size();
        for (int i2 = 0; i2 < size; i2++) {
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setNavigationOnClickListener.get(i2);
            if (actionMenuPresenter$SavedState$1.getGroupId() == i) {
                actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 = (actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 & (-5)) | (z2 ? 4 : 0);
                actionMenuPresenter$SavedState$1.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i, boolean z) {
        int size = this.setNavigationOnClickListener.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setNavigationOnClickListener.get(i2);
            if (actionMenuPresenter$SavedState$1.getGroupId() == i && actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(z)) {
                z2 = true;
            }
        }
        if (z2) {
            setIconTintList(true);
        }
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i, boolean z) {
        int size = this.setNavigationOnClickListener.size();
        for (int i2 = 0; i2 < size; i2++) {
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setNavigationOnClickListener.get(i2);
            if (actionMenuPresenter$SavedState$1.getGroupId() == i) {
                actionMenuPresenter$SavedState$1.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.setZ) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.setNavigationOnClickListener.get(i).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i) {
        MenuItem findItem;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setNavigationOnClickListener.get(i2);
            if (actionMenuPresenter$SavedState$1.getItemId() == i) {
                return actionMenuPresenter$SavedState$1;
            }
            if (actionMenuPresenter$SavedState$1.hasSubMenu() && (findItem = actionMenuPresenter$SavedState$1.getSubMenu().findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public int size() {
        return this.setNavigationOnClickListener.size();
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i) {
        return this.setNavigationOnClickListener.get(i);
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return setIconTintList(i, keyEvent) != null;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.setMinAndMaxProgress = z;
        setIconTintList(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setNavigationOnClickListener() {
        return this.setMinAndMaxProgress;
    }

    private void setChipCornerRadius() {
        boolean z = true;
        this.setGuidelinePercent = (this.setLayoutDirection.getConfiguration().keyboard == 1 || !setQuery.setIconTintList(ViewConfiguration.get(this.MenuHostHelper$$ExternalSyntheticLambda0), this.MenuHostHelper$$ExternalSyntheticLambda0)) ? false : false;
    }

    public boolean setLayoutAnimation() {
        return this.setGuidelinePercent;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
        setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 setnavigationicontint_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        return setnavigationicontint_menuhosthelper__externalsyntheticlambda0 != null && setnavigationicontint_menuhosthelper__externalsyntheticlambda0.setY(setnavigationicontint, menuItem);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        ActionMenuPresenter$SavedState$1 iconTintList = setIconTintList(i, keyEvent);
        boolean x = iconTintList != null ? setX(iconTintList, null, i2) : false;
        if ((i2 & 2) != 0) {
            setX(true);
        }
        return x;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(List<ActionMenuPresenter$SavedState$1> list, int i, KeyEvent keyEvent) {
        boolean navigationOnClickListener = setNavigationOnClickListener();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.setNavigationOnClickListener.size();
            for (int i2 = 0; i2 < size; i2++) {
                ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setNavigationOnClickListener.get(i2);
                if (actionMenuPresenter$SavedState$1.hasSubMenu()) {
                    ((setNavigationIconTint) actionMenuPresenter$SavedState$1.getSubMenu()).MenuHostHelper$$ExternalSyntheticLambda1(list, i, keyEvent);
                }
                char alphabeticShortcut = navigationOnClickListener ? actionMenuPresenter$SavedState$1.getAlphabeticShortcut() : actionMenuPresenter$SavedState$1.getNumericShortcut();
                if (((modifiers & 69647) == ((navigationOnClickListener ? actionMenuPresenter$SavedState$1.getAlphabeticModifiers() : actionMenuPresenter$SavedState$1.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0 && ((alphabeticShortcut == keyData.meta[0] || alphabeticShortcut == keyData.meta[2] || (navigationOnClickListener && alphabeticShortcut == '\b' && i == 67)) && actionMenuPresenter$SavedState$1.isEnabled())) {
                    list.add(actionMenuPresenter$SavedState$1);
                }
            }
        }
    }

    private ActionMenuPresenter$SavedState$1 setIconTintList(int i, KeyEvent keyEvent) {
        char numericShortcut;
        ArrayList<ActionMenuPresenter$SavedState$1> arrayList = this.setHasDecor;
        arrayList.clear();
        MenuHostHelper$$ExternalSyntheticLambda1(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean navigationOnClickListener = setNavigationOnClickListener();
        for (int i2 = 0; i2 < size; i2++) {
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = arrayList.get(i2);
            if (navigationOnClickListener) {
                numericShortcut = actionMenuPresenter$SavedState$1.getAlphabeticShortcut();
            } else {
                numericShortcut = actionMenuPresenter$SavedState$1.getNumericShortcut();
            }
            if ((numericShortcut == keyData.meta[0] && (metaState & 2) == 0) || ((numericShortcut == keyData.meta[2] && (metaState & 2) != 0) || (navigationOnClickListener && numericShortcut == '\b' && i == 67))) {
                return actionMenuPresenter$SavedState$1;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i, int i2) {
        return setX(findItem(i), null, i2);
    }

    public final boolean setX(MenuItem menuItem, setBackgroundTintMode setbackgroundtintmode, int i) {
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = (ActionMenuPresenter$SavedState$1) menuItem;
        if (actionMenuPresenter$SavedState$1 == null || !actionMenuPresenter$SavedState$1.isEnabled()) {
            return false;
        }
        boolean iconTintList = actionMenuPresenter$SavedState$1.setIconTintList();
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = actionMenuPresenter$SavedState$1.setY;
        boolean z = appBarLayout$BaseBehavior != null && appBarLayout$BaseBehavior.setIconTintList();
        if (actionMenuPresenter$SavedState$1.setX()) {
            iconTintList |= actionMenuPresenter$SavedState$1.expandActionView();
            if (iconTintList) {
                setX(true);
            }
        } else if (actionMenuPresenter$SavedState$1.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                setX(false);
            }
            if (!actionMenuPresenter$SavedState$1.hasSubMenu()) {
                minusKey minuskey = new minusKey(this.MenuHostHelper$$ExternalSyntheticLambda0, this, actionMenuPresenter$SavedState$1);
                actionMenuPresenter$SavedState$1.ViewPager$SavedState$1 = minuskey;
                minuskey.setHeaderTitle(actionMenuPresenter$SavedState$1.getTitle());
            }
            minusKey minuskey2 = (minusKey) actionMenuPresenter$SavedState$1.getSubMenu();
            if (z) {
                appBarLayout$BaseBehavior.setX(minuskey2);
            }
            iconTintList |= setY(minuskey2, setbackgroundtintmode);
            if (!iconTintList) {
                setX(true);
            }
        } else if ((i & 1) == 0) {
            setX(true);
        }
        return iconTintList;
    }

    public final void setX(boolean z) {
        if (this.setMaxEms) {
            return;
        }
        this.setMaxEms = true;
        Iterator<WeakReference<setBackgroundTintMode>> it = this.setChipCornerRadius.iterator();
        while (it.hasNext()) {
            WeakReference<setBackgroundTintMode> next = it.next();
            setBackgroundTintMode setbackgroundtintmode = next.get();
            if (setbackgroundtintmode == null) {
                this.setChipCornerRadius.remove(next);
            } else {
                setbackgroundtintmode.setIconTintList(this, z);
            }
        }
        this.setMaxEms = false;
    }

    @Override // android.view.Menu
    public void close() {
        setX(true);
    }

    public final void setIconTintList(boolean z) {
        if (!this.setCheckedIconEnabled) {
            if (z) {
                this.setOnLongClickListener = true;
                this.setUnboundedRipple = true;
            }
            MenuHostHelper$$ExternalSyntheticLambda1(z);
            return;
        }
        this.setOnNavigationItemSelectedListener = true;
        if (z) {
            this.setTextAppearanceResource = true;
        }
    }

    public final void setIconSize() {
        if (this.setCheckedIconEnabled) {
            return;
        }
        this.setCheckedIconEnabled = true;
        this.setOnNavigationItemSelectedListener = false;
        this.setTextAppearanceResource = false;
    }

    public final void setUiOptions() {
        this.setCheckedIconEnabled = false;
        if (this.setOnNavigationItemSelectedListener) {
            this.setOnNavigationItemSelectedListener = false;
            setIconTintList(this.setTextAppearanceResource);
        }
    }

    public final ArrayList<ActionMenuPresenter$SavedState$1> setUnboundedRipple() {
        if (this.setOnLongClickListener) {
            this.SearchView$SavedState$1.clear();
            int size = this.setNavigationOnClickListener.size();
            for (int i = 0; i < size; i++) {
                ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = this.setNavigationOnClickListener.get(i);
                if (actionMenuPresenter$SavedState$1.isVisible()) {
                    this.SearchView$SavedState$1.add(actionMenuPresenter$SavedState$1);
                }
            }
            this.setOnLongClickListener = false;
            this.setUnboundedRipple = true;
            return this.SearchView$SavedState$1;
        }
        return this.SearchView$SavedState$1;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        ArrayList<ActionMenuPresenter$SavedState$1> unboundedRipple = setUnboundedRipple();
        if (this.setUnboundedRipple) {
            Iterator<WeakReference<setBackgroundTintMode>> it = this.setChipCornerRadius.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference<setBackgroundTintMode> next = it.next();
                setBackgroundTintMode setbackgroundtintmode = next.get();
                if (setbackgroundtintmode == null) {
                    this.setChipCornerRadius.remove(next);
                } else {
                    z |= setbackgroundtintmode.setX();
                }
            }
            if (z) {
                this.setCenterIfNoTextEnabled.clear();
                this.setAnimationFromJson.clear();
                int size = unboundedRipple.size();
                for (int i = 0; i < size; i++) {
                    ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = unboundedRipple.get(i);
                    if ((actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 & 32) == 32) {
                        this.setCenterIfNoTextEnabled.add(actionMenuPresenter$SavedState$1);
                    } else {
                        this.setAnimationFromJson.add(actionMenuPresenter$SavedState$1);
                    }
                }
            } else {
                this.setCenterIfNoTextEnabled.clear();
                this.setAnimationFromJson.clear();
                this.setAnimationFromJson.addAll(setUnboundedRipple());
            }
            this.setUnboundedRipple = false;
        }
    }

    public final ArrayList<ActionMenuPresenter$SavedState$1> setIconTintList() {
        MenuHostHelper$$ExternalSyntheticLambda0();
        return this.setCenterIfNoTextEnabled;
    }

    public final ArrayList<ActionMenuPresenter$SavedState$1> setX() {
        MenuHostHelper$$ExternalSyntheticLambda0();
        return this.setAnimationFromJson;
    }

    public void clearHeader() {
        this.setIconTintList = null;
        this.setUiOptions = null;
        this.setLayoutAnimation = null;
        setIconTintList(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final setNavigationIconTint setX(CharSequence charSequence) {
        setY(0, charSequence, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final setNavigationIconTint MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        setY(i, null, 0, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final setNavigationIconTint setIconTintList(Drawable drawable) {
        setY(0, null, 0, drawable, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final setNavigationIconTint setX(int i) {
        setY(0, null, i, null, null);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final setNavigationIconTint setY(View view) {
        setY(0, null, 0, null, view);
        return this;
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda0(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        boolean z = false;
        if (this.setChipCornerRadius.isEmpty()) {
            return false;
        }
        setIconSize();
        Iterator<WeakReference<setBackgroundTintMode>> it = this.setChipCornerRadius.iterator();
        while (it.hasNext()) {
            WeakReference<setBackgroundTintMode> next = it.next();
            setBackgroundTintMode setbackgroundtintmode = next.get();
            if (setbackgroundtintmode == null) {
                this.setChipCornerRadius.remove(next);
            } else {
                z = setbackgroundtintmode.MenuHostHelper$$ExternalSyntheticLambda1(actionMenuPresenter$SavedState$1);
                if (z) {
                    break;
                }
            }
        }
        setUiOptions();
        if (z) {
            this.setX = actionMenuPresenter$SavedState$1;
        }
        return z;
    }

    public boolean setY(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        boolean z = false;
        if (!this.setChipCornerRadius.isEmpty() && this.setX == actionMenuPresenter$SavedState$1) {
            setIconSize();
            Iterator<WeakReference<setBackgroundTintMode>> it = this.setChipCornerRadius.iterator();
            while (it.hasNext()) {
                WeakReference<setBackgroundTintMode> next = it.next();
                setBackgroundTintMode setbackgroundtintmode = next.get();
                if (setbackgroundtintmode == null) {
                    this.setChipCornerRadius.remove(next);
                } else {
                    z = setbackgroundtintmode.setY(actionMenuPresenter$SavedState$1);
                    if (z) {
                        break;
                    }
                }
            }
            setUiOptions();
            if (z) {
                this.setX = null;
            }
        }
        return z;
    }

    public final void setY(boolean z) {
        this.setZ = z;
    }

    private void setY(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources resources = this.setLayoutDirection;
        if (view != null) {
            this.setLayoutAnimation = view;
            this.setUiOptions = null;
            this.setIconTintList = null;
        } else {
            if (i > 0) {
                this.setUiOptions = resources.getText(i);
            } else if (charSequence != null) {
                this.setUiOptions = charSequence;
            }
            if (i2 > 0) {
                this.setIconTintList = setLineHeight.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, i2);
            } else if (drawable != null) {
                this.setIconTintList = drawable;
            }
            this.setLayoutAnimation = null;
        }
        setIconTintList(false);
    }

    public MenuItem MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0) {
            int[] iArr = setTextAlignment;
            if (i5 < iArr.length) {
                int i6 = (iArr[i5] << 16) | (65535 & i3);
                ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = new ActionMenuPresenter$SavedState$1(this, i, i2, i3, i6, charSequence, this.setY);
                ArrayList<ActionMenuPresenter$SavedState$1> arrayList = this.setNavigationOnClickListener;
                int size = arrayList.size() - 1;
                while (true) {
                    if (size < 0) {
                        i4 = 0;
                        break;
                    } else if (arrayList.get(size).setIconTintList <= i6) {
                        i4 = size + 1;
                        break;
                    } else {
                        size--;
                    }
                }
                arrayList.add(i4, actionMenuPresenter$SavedState$1);
                setIconTintList(true);
                return actionMenuPresenter$SavedState$1;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    @Override // android.view.Menu
    public void removeGroup(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.setNavigationOnClickListener.get(i2).getGroupId() == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int size2 = this.setNavigationOnClickListener.size();
            for (int i3 = 0; i3 < size2 - i2 && this.setNavigationOnClickListener.get(i2).getGroupId() == i; i3++) {
                setY(i2, false);
            }
            setIconTintList(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i) {
        int size = size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (this.setNavigationOnClickListener.get(i2).getItemId() == i) {
                break;
            } else {
                i2++;
            }
        }
        setY(i2, true);
    }
}