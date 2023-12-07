package o;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public abstract class AppBarLayout$BaseBehavior {
    private final Context MenuHostHelper$$ExternalSyntheticLambda1;
    private setIconTintList setIconTintList;
    private AppBarLayout$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1 setX;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        void setX();
    }

    public boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return true;
    }

    public abstract View MenuHostHelper$$ExternalSyntheticLambda1();

    public boolean setIconTintList() {
        return false;
    }

    public void setX(SubMenu subMenu) {
    }

    public boolean setX() {
        return false;
    }

    public boolean setY() {
        return false;
    }

    public AppBarLayout$BaseBehavior(Context context) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = context;
    }

    public View setX(MenuItem menuItem) {
        return MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public void MenuHostHelper$$ExternalSyntheticLambda1(AppBarLayout$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1 appBarLayout$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1) {
        this.setX = appBarLayout$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList seticontintlist) {
        if (this.setIconTintList != null && seticontintlist != null) {
            StringBuilder sb = new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.setIconTintList = seticontintlist;
    }

    public void setUnboundedRipple() {
        this.setIconTintList = null;
        this.setX = null;
    }
}