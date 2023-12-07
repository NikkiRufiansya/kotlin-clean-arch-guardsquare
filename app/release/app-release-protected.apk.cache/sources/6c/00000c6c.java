package o;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import o.setBaselineAlignBottom;
import o.setChipIconEnabled;

/* loaded from: classes.dex */
class setIconified$MenuHostHelper$$ExternalSyntheticLambda1 implements setChipIconEnabled.setY {
    private setChipIconEnabled.setY setIconTintList;
    final /* synthetic */ setIconified setX;

    public setIconified$MenuHostHelper$$ExternalSyntheticLambda1(setIconified seticonified, setChipIconEnabled.setY sety) {
        this.setX = seticonified;
        this.setIconTintList = sety;
    }

    @Override // o.setChipIconEnabled.setY
    public boolean setY(setChipIconEnabled setchipiconenabled, Menu menu) {
        return this.setIconTintList.setY(setchipiconenabled, menu);
    }

    @Override // o.setChipIconEnabled.setY
    public boolean MenuHostHelper$$ExternalSyntheticLambda1(setChipIconEnabled setchipiconenabled, Menu menu) {
        setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this.setX.setMaxEms);
        return this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(setchipiconenabled, menu);
    }

    @Override // o.setChipIconEnabled.setY
    public boolean setY(setChipIconEnabled setchipiconenabled, MenuItem menuItem) {
        return this.setIconTintList.setY(setchipiconenabled, menuItem);
    }

    @Override // o.setChipIconEnabled.setY
    public void MenuHostHelper$$ExternalSyntheticLambda0(setChipIconEnabled setchipiconenabled) {
        this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(setchipiconenabled);
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            this.setX.setAnimationFromJson.getDecorView().removeCallbacks(this.setX.setTextScaleX);
        }
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            this.setX.setChipCornerRadius();
            setIconified seticonified = this.setX;
            seticonified.setNavigationOnClickListener = setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(seticonified.MenuHostHelper$$ExternalSyntheticLambda0).setX(0.0f);
            this.setX.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(new setCloseIconStartPaddingResource() { // from class: o.setIconified$MenuHostHelper$$ExternalSyntheticLambda1.1
                @Override // o.setCloseIconStartPaddingResource, o.setSelectAllOnFocus
                public void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
                    setIconified$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(8);
                    if (setIconified$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                        setIconified$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.MenuHostHelper$$ExternalSyntheticLambda1.dismiss();
                    } else if (setIconified$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.MenuHostHelper$$ExternalSyntheticLambda0.getParent() instanceof View) {
                        setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1((View) setIconified$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.MenuHostHelper$$ExternalSyntheticLambda0.getParent());
                    }
                    setIconified$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
                    setIconified$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0((setSelectAllOnFocus) null);
                    setIconified$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.setNavigationOnClickListener = null;
                    setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(setIconified$MenuHostHelper$$ExternalSyntheticLambda1.this.setX.setMaxEms);
                }
            });
        }
        if (this.setX.setIconTintList != null) {
            this.setX.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(this.setX.setY);
        }
        this.setX.setY = null;
        setBaselineAlignBottom.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(this.setX.setMaxEms);
    }
}