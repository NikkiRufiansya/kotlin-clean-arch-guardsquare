package o;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;
import o.setChipIconEnabled;

/* loaded from: classes.dex */
public class setAdapter$MenuHostHelper$$ExternalSyntheticLambda1 extends setChipIconEnabled implements setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0 {
    private final Context MenuHostHelper$$ExternalSyntheticLambda1;
    private WeakReference<View> setNavigationOnClickListener;
    private setChipIconEnabled.setY setOnLongClickListener;
    final /* synthetic */ setAdapter setX;
    final setNavigationIconTint setY;

    public setAdapter$MenuHostHelper$$ExternalSyntheticLambda1(setAdapter setadapter, Context context, setChipIconEnabled.setY sety) {
        this.setX = setadapter;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = context;
        this.setOnLongClickListener = sety;
        setNavigationIconTint setnavigationicontint = new setNavigationIconTint(context);
        setnavigationicontint.setY = 1;
        this.setY = setnavigationicontint;
        setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda1(this);
    }

    @Override // o.setChipIconEnabled
    public final MenuInflater MenuHostHelper$$ExternalSyntheticLambda0() {
        return new setShrinkMotionSpec(this.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    @Override // o.setChipIconEnabled
    public final Menu setY() {
        return this.setY;
    }

    @Override // o.setChipIconEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 != this) {
            return;
        }
        if (!setAdapter.setIconTintList(this.setX.setNavigationOnClickListener, this.setX.setTextAlignment, false)) {
            this.setX.setUnboundedRipple = this;
            this.setX.setOnLongClickListener = this.setOnLongClickListener;
        } else {
            this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(this);
        }
        this.setOnLongClickListener = null;
        this.setX.setIconTintList(false);
        setRowOrderPreserved setroworderpreserved = this.setX.setLayoutAnimation;
        if (setroworderpreserved.setUiOptions == null) {
            setroworderpreserved.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        this.setX.setIconSize.setHideOnContentScrollEnabled(this.setX.ViewPager$SavedState$1);
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0 = null;
    }

    @Override // o.setChipIconEnabled
    public final void setUiOptions() {
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 != this) {
            return;
        }
        this.setY.setIconSize();
        try {
            this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(this, this.setY);
        } finally {
            this.setY.setUiOptions();
        }
    }

    public final boolean setIconTintList() {
        this.setY.setIconSize();
        try {
            return this.setOnLongClickListener.setY(this, this.setY);
        } finally {
            this.setY.setUiOptions();
        }
    }

    @Override // o.setChipIconEnabled
    public final void setX(View view) {
        this.setX.setLayoutAnimation.setCustomView(view);
        this.setNavigationOnClickListener = new WeakReference<>(view);
    }

    @Override // o.setChipIconEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence) {
        this.setX.setLayoutAnimation.setSubtitle(charSequence);
    }

    @Override // o.setChipIconEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence) {
        this.setX.setLayoutAnimation.setTitle(charSequence);
    }

    @Override // o.setChipIconEnabled
    public final void setIconTintList(int i) {
        this.setX.setLayoutAnimation.setTitle(this.setX.MenuHostHelper$$ExternalSyntheticLambda1.getResources().getString(i));
    }

    @Override // o.setChipIconEnabled
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setX.setLayoutAnimation.setSubtitle(this.setX.MenuHostHelper$$ExternalSyntheticLambda1.getResources().getString(i));
    }

    @Override // o.setChipIconEnabled
    public final CharSequence setLayoutAnimation() {
        return this.setX.setLayoutAnimation.setLayoutAnimation;
    }

    @Override // o.setChipIconEnabled
    public final CharSequence setUnboundedRipple() {
        return this.setX.setLayoutAnimation.setNavigationOnClickListener;
    }

    @Override // o.setChipIconEnabled
    public final void setIconTintList(boolean z) {
        super.setIconTintList(z);
        this.setX.setLayoutAnimation.setTitleOptional(z);
    }

    @Override // o.setChipIconEnabled
    public final boolean setNavigationOnClickListener() {
        return this.setX.setLayoutAnimation.setOnLongClickListener;
    }

    @Override // o.setChipIconEnabled
    public final View setX() {
        WeakReference<View> weakReference = this.setNavigationOnClickListener;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
    public final boolean setY(setNavigationIconTint setnavigationicontint, MenuItem menuItem) {
        setChipIconEnabled.setY sety = this.setOnLongClickListener;
        if (sety != null) {
            return sety.setY(this, menuItem);
        }
        return false;
    }

    @Override // o.setNavigationIconTint$MenuHostHelper$$ExternalSyntheticLambda0
    public final void setY(setNavigationIconTint setnavigationicontint) {
        if (this.setOnLongClickListener == null) {
            return;
        }
        setUiOptions();
        this.setX.setLayoutAnimation.setY();
    }
}