package o;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class setChipIconEnabled {
    Object MenuHostHelper$$ExternalSyntheticLambda0;
    boolean setIconTintList;

    /* loaded from: classes.dex */
    public interface setY {
        void MenuHostHelper$$ExternalSyntheticLambda0(setChipIconEnabled setchipiconenabled);

        boolean MenuHostHelper$$ExternalSyntheticLambda1(setChipIconEnabled setchipiconenabled, Menu menu);

        boolean setY(setChipIconEnabled setchipiconenabled, Menu menu);

        boolean setY(setChipIconEnabled setchipiconenabled, MenuItem menuItem);
    }

    public abstract MenuInflater MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(int i);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1();

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence);

    public abstract void setIconTintList(int i);

    public abstract CharSequence setLayoutAnimation();

    public boolean setNavigationOnClickListener() {
        return false;
    }

    public abstract void setUiOptions();

    public abstract CharSequence setUnboundedRipple();

    public abstract View setX();

    public abstract void setX(View view);

    public abstract Menu setY();

    public void setIconTintList(boolean z) {
        this.setIconTintList = z;
    }
}