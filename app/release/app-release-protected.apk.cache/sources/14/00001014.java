package o;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import o.setTabContainer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setTabContainer$MenuHostHelper$$ExternalSyntheticLambda0 implements setTabContainer.setUiOptions, DialogInterface.OnClickListener {
    private CharSequence MenuHostHelper$$ExternalSyntheticLambda0;
    setTextAppearanceResource MenuHostHelper$$ExternalSyntheticLambda1;
    final /* synthetic */ setTabContainer setX;
    private ListAdapter setY;

    @Override // o.setTabContainer.setUiOptions
    public int MenuHostHelper$$ExternalSyntheticLambda0() {
        return 0;
    }

    @Override // o.setTabContainer.setUiOptions
    public Drawable MenuHostHelper$$ExternalSyntheticLambda1() {
        return null;
    }

    @Override // o.setTabContainer.setUiOptions
    public int a_() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTabContainer$MenuHostHelper$$ExternalSyntheticLambda0(setTabContainer settabcontainer) {
        this.setX = settabcontainer;
    }

    @Override // o.setTabContainer.setUiOptions
    public void setIconTintList() {
        setTextAppearanceResource settextappearanceresource = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (settextappearanceresource != null) {
            settextappearanceresource.dismiss();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        }
    }

    @Override // o.setTabContainer.setUiOptions
    public boolean setUnboundedRipple() {
        setTextAppearanceResource settextappearanceresource = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (settextappearanceresource != null) {
            return settextappearanceresource.isShowing();
        }
        return false;
    }

    @Override // o.setTabContainer.setUiOptions
    public void setIconTintList(ListAdapter listAdapter) {
        this.setY = listAdapter;
    }

    @Override // o.setTabContainer.setUiOptions
    public void setY(CharSequence charSequence) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = charSequence;
    }

    @Override // o.setTabContainer.setUiOptions
    public CharSequence setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setTabContainer.setUiOptions
    public void setIconTintList(int i, int i2) {
        if (this.setY == null) {
            return;
        }
        setTextAppearanceResource$MenuHostHelper$$ExternalSyntheticLambda0 settextappearanceresource_menuhosthelper__externalsyntheticlambda0 = new setTextAppearanceResource$MenuHostHelper$$ExternalSyntheticLambda0(this.setX.getPopupContext());
        CharSequence charSequence = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (charSequence != null) {
            settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.SearchView$SavedState$1 = charSequence;
        }
        ListAdapter listAdapter = this.setY;
        int selectedItemPosition = this.setX.getSelectedItemPosition();
        settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.setY = listAdapter;
        settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.setLayoutDirection = this;
        settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.MenuHostHelper$$ExternalSyntheticLambda0 = selectedItemPosition;
        settextappearanceresource_menuhosthelper__externalsyntheticlambda0.setX.setIconSize = true;
        setTextAppearanceResource MenuHostHelper$$ExternalSyntheticLambda1 = settextappearanceresource_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1;
        ListView listView = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.setHasDecor;
        listView.setTextDirection(i);
        setTabContainer.setY.setX(listView, i2);
        this.MenuHostHelper$$ExternalSyntheticLambda1.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.setX.setSelection(i);
        if (this.setX.getOnItemClickListener() != null) {
            this.setX.performItemClick(null, i, this.setY.getItemId(i));
        }
        setIconTintList();
    }

    @Override // o.setTabContainer.setUiOptions
    public void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // o.setTabContainer.setUiOptions
    public void setIconTintList(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // o.setTabContainer.setUiOptions
    public void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // o.setTabContainer.setUiOptions
    public void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}