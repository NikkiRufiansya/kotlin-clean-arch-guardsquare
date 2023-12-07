package o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setMinEms extends setChipSpacingHorizontal implements SubMenu {
    private final preHandler setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setMinEms(Context context, preHandler prehandler) {
        super(context, prehandler);
        this.setY = prehandler;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.setY.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.setY.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.setY.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.setY.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.setY.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.setY.clearHeader();
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.setY.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.setY.setIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return setIconTintList(this.setY.getItem());
    }
}