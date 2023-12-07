package o;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* loaded from: classes.dex */
public final class setExpandedTitleColor extends setNavigationIconTint {
    private final Class<?> ViewPager$SavedState$1;
    private final int setCenterIfNoTextEnabled;

    public setExpandedTitleColor(Context context, Class<?> cls, int i) {
        super(context);
        this.ViewPager$SavedState$1 = cls;
        this.setCenterIfNoTextEnabled = i;
    }

    @Override // o.setNavigationIconTint, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.ViewPager$SavedState$1.getSimpleName());
        sb.append(" does not support submenus");
        throw new UnsupportedOperationException(sb.toString());
    }

    @Override // o.setNavigationIconTint
    public final MenuItem MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 > this.setCenterIfNoTextEnabled) {
            String simpleName = this.ViewPager$SavedState$1.getSimpleName();
            StringBuilder sb = new StringBuilder("Maximum number of items supported by ");
            sb.append(simpleName);
            sb.append(" is ");
            sb.append(this.setCenterIfNoTextEnabled);
            sb.append(". Limit can be checked with ");
            sb.append(simpleName);
            sb.append("#getMaxItemCount()");
            throw new IllegalArgumentException(sb.toString());
        }
        setIconSize();
        MenuItem MenuHostHelper$$ExternalSyntheticLambda0 = super.MenuHostHelper$$ExternalSyntheticLambda0(i, i2, i3, charSequence);
        if (MenuHostHelper$$ExternalSyntheticLambda0 instanceof ActionMenuPresenter$SavedState$1) {
            ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1 = (ActionMenuPresenter$SavedState$1) MenuHostHelper$$ExternalSyntheticLambda0;
            actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 = (actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 & (-5)) | 4;
        }
        setUiOptions();
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }
}