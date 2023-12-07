package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import o.setChipIconEnabled;

/* loaded from: classes.dex */
public final class FirebaseRemoteConfigKtxRegistrar extends setChipIconEnabled implements setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 {
    private setChipIconEnabled.setY MenuHostHelper$$ExternalSyntheticLambda1;
    private WeakReference<View> setLayoutAnimation;
    private boolean setNavigationOnClickListener;
    private setNavigationIconTint setOnLongClickListener;
    private boolean setUnboundedRipple;
    private setRowOrderPreserved setX;
    private Context setY;

    public FirebaseRemoteConfigKtxRegistrar(Context context, setRowOrderPreserved setroworderpreserved, setChipIconEnabled.setY sety, boolean z) {
        this.setY = context;
        this.setX = setroworderpreserved;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = sety;
        setNavigationIconTint setnavigationicontint = new setNavigationIconTint(setroworderpreserved.getContext());
        setnavigationicontint.setY = 1;
        this.setOnLongClickListener = setnavigationicontint;
        setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda1(this);
        this.setUnboundedRipple = z;
    }

    @Override // o.setChipIconEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence) {
        this.setX.setTitle(charSequence);
    }

    @Override // o.setChipIconEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence) {
        this.setX.setSubtitle(charSequence);
    }

    @Override // o.setChipIconEnabled
    public final void setIconTintList(int i) {
        this.setX.setTitle(this.setY.getString(i));
    }

    @Override // o.setChipIconEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setX.setSubtitle(this.setY.getString(i));
    }

    @Override // o.setChipIconEnabled
    public final void setIconTintList(boolean z) {
        super.setIconTintList(z);
        this.setX.setTitleOptional(z);
    }

    @Override // o.setChipIconEnabled
    public final boolean setNavigationOnClickListener() {
        return this.setX.setOnLongClickListener;
    }

    @Override // o.setChipIconEnabled
    public final void setX(View view) {
        this.setX.setCustomView(view);
        this.setLayoutAnimation = view != null ? new WeakReference<>(view) : null;
    }

    @Override // o.setChipIconEnabled
    public final void setUiOptions() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this, this.setOnLongClickListener);
    }

    @Override // o.setChipIconEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setNavigationOnClickListener) {
            return;
        }
        this.setNavigationOnClickListener = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(this);
    }

    @Override // o.setChipIconEnabled
    public final Menu setY() {
        return this.setOnLongClickListener;
    }

    @Override // o.setChipIconEnabled
    public final CharSequence setLayoutAnimation() {
        return this.setX.setLayoutAnimation;
    }

    @Override // o.setChipIconEnabled
    public final CharSequence setUnboundedRipple() {
        return this.setX.setNavigationOnClickListener;
    }

    @Override // o.setChipIconEnabled
    public final View setX() {
        WeakReference<View> weakReference = this.setLayoutAnimation;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // o.setChipIconEnabled
    public final MenuInflater MenuHostHelper$$ExternalSyntheticLambda0() {
        return new setShrinkMotionSpec(this.setX.getContext());
    }

    @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
    public final boolean setY(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.setY(this, menuItem);
    }

    @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
    public final void setY(setNavigationIconTint setnavigationicontint) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this, this.setOnLongClickListener);
        this.setX.setY();
    }
}