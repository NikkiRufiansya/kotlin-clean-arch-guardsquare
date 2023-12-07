package o;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import o.TextInputLayout$SavedState$1;
import o.setBackgroundTintMode;

/* loaded from: classes.dex */
public abstract class onActivityResumed implements setBackgroundTintMode {
    public Context MenuHostHelper$$ExternalSyntheticLambda0;
    public setNavigationIconTint MenuHostHelper$$ExternalSyntheticLambda1;
    public setBackgroundTintMode.setY setIconTintList;
    private int setLayoutAnimation;
    private LayoutInflater setNavigationOnClickListener;
    private LayoutInflater setUnboundedRipple;
    public Context setX;
    public TextInputLayout$SavedState$1 setY;
    private int setUiOptions = R.layout.res_0x7f0d0003;
    private int setOnLongClickListener = R.layout.res_0x7f0d0002;

    @Override // o.setBackgroundTintMode
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return false;
    }

    public abstract void setIconTintList(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1, TextInputLayout$SavedState$1.setY sety);

    @Override // o.setBackgroundTintMode
    public boolean setX() {
        return false;
    }

    public boolean setX(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return true;
    }

    @Override // o.setBackgroundTintMode
    public final boolean setY(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return false;
    }

    public onActivityResumed(Context context, int i, int i2) {
        this.setX = context;
        this.setNavigationOnClickListener = LayoutInflater.from(context);
    }

    @Override // o.setBackgroundTintMode
    public void setX(Context context, setNavigationIconTint setnavigationicontint) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
        this.setUnboundedRipple = LayoutInflater.from(context);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setnavigationicontint;
    }

    public TextInputLayout$SavedState$1 MenuHostHelper$$ExternalSyntheticLambda1(ViewGroup viewGroup) {
        if (this.setY == null) {
            TextInputLayout$SavedState$1 textInputLayout$SavedState$1 = (TextInputLayout$SavedState$1) this.setNavigationOnClickListener.inflate(this.setUiOptions, viewGroup, false);
            this.setY = textInputLayout$SavedState$1;
            textInputLayout$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1);
            MenuHostHelper$$ExternalSyntheticLambda0(true);
        }
        return this.setY;
    }

    @Override // o.setBackgroundTintMode
    public void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        ViewGroup viewGroup = (ViewGroup) this.setY;
        if (viewGroup == null) {
            return;
        }
        setNavigationIconTint setnavigationicontint = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i = 0;
        if (setnavigationicontint != null) {
            setnavigationicontint.MenuHostHelper$$ExternalSyntheticLambda0();
            ArrayList<ActionMenuPresenter$SavedState$1> unboundedRipple = this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple();
            int size = unboundedRipple.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = unboundedRipple.get(i3);
                if (setX(actionMenuPresenter$SavedState$1)) {
                    View childAt = viewGroup.getChildAt(i2);
                    ActionMenuPresenter$SavedState$1 y = childAt instanceof TextInputLayout$SavedState$1.setY ? ((TextInputLayout$SavedState$1.setY) childAt).setY() : null;
                    View MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(actionMenuPresenter$SavedState$1, childAt, viewGroup);
                    if (actionMenuPresenter$SavedState$1 != y) {
                        MenuHostHelper$$ExternalSyntheticLambda1.setPressed(false);
                        MenuHostHelper$$ExternalSyntheticLambda1.jumpDrawablesToCurrentState();
                    }
                    if (MenuHostHelper$$ExternalSyntheticLambda1 != childAt) {
                        ViewGroup viewGroup2 = (ViewGroup) MenuHostHelper$$ExternalSyntheticLambda1.getParent();
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(MenuHostHelper$$ExternalSyntheticLambda1);
                        }
                        ((ViewGroup) this.setY).addView(MenuHostHelper$$ExternalSyntheticLambda1, i2);
                    }
                    i2++;
                }
            }
            i = i2;
        }
        while (i < viewGroup.getChildCount()) {
            if (!setX(viewGroup, i)) {
                i++;
            }
        }
    }

    public boolean setX(ViewGroup viewGroup, int i) {
        viewGroup.removeViewAt(i);
        return true;
    }

    @Override // o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setBackgroundTintMode.setY sety) {
        this.setIconTintList = sety;
    }

    public View MenuHostHelper$$ExternalSyntheticLambda1(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1, View view, ViewGroup viewGroup) {
        TextInputLayout$SavedState$1.setY sety;
        if (view instanceof TextInputLayout$SavedState$1.setY) {
            sety = (TextInputLayout$SavedState$1.setY) view;
        } else {
            sety = (TextInputLayout$SavedState$1.setY) this.setNavigationOnClickListener.inflate(this.setOnLongClickListener, viewGroup, false);
        }
        setIconTintList(actionMenuPresenter$SavedState$1, sety);
        return (View) sety;
    }

    @Override // o.setBackgroundTintMode
    public void setIconTintList(setNavigationIconTint setnavigationicontint, boolean z) {
        setBackgroundTintMode.setY sety = this.setIconTintList;
        if (sety != null) {
            sety.MenuHostHelper$$ExternalSyntheticLambda0(setnavigationicontint, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [o.setNavigationIconTint] */
    @Override // o.setBackgroundTintMode
    public boolean MenuHostHelper$$ExternalSyntheticLambda1(minusKey minuskey) {
        setBackgroundTintMode.setY sety = this.setIconTintList;
        minusKey minuskey2 = minuskey;
        if (sety != null) {
            if (minuskey == null) {
                minuskey2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            return sety.setY(minuskey2);
        }
        return false;
    }

    @Override // o.setBackgroundTintMode
    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setLayoutAnimation;
    }

    public final void setX(int i) {
        this.setLayoutAnimation = R.id.res_0x7f0a003f;
    }
}