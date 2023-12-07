package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* loaded from: classes.dex */
public final class setError extends ActionMode {
    final Context setIconTintList;
    final setChipIconEnabled setY;

    public setError(Context context, setChipIconEnabled setchipiconenabled) {
        this.setIconTintList = context;
        this.setY = setchipiconenabled;
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0 = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0(charSequence);
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.setY.setUiOptions();
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new setChipSpacingHorizontal(this.setIconTintList, (setVerticalFadingEdgeEnabled) this.setY.setY());
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.setY.setLayoutAnimation();
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.setY.setIconTintList(i);
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.setY.setUnboundedRipple();
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.setY.setX();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.setY.setX(view);
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.setY.setIconTintList;
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.setY.setIconTintList(z);
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.setY.setNavigationOnClickListener();
    }
}