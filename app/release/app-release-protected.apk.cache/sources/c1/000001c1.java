package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import o.setNavigationIconTint;

/* loaded from: classes.dex */
public final class Fragment$5 extends ListView implements setNavigationIconTint.setIconTintList, TextInputLayout$SavedState$1, AdapterView.OnItemClickListener {
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = {16842964, 16843049};
    private setNavigationIconTint setY;

    public Fragment$5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public Fragment$5(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(context, attributeSet, MenuHostHelper$$ExternalSyntheticLambda1, i, 0);
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(0)) {
            setBackgroundDrawable(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(0));
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(1)) {
            setDivider(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(1));
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
    }

    @Override // o.TextInputLayout$SavedState$1
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint) {
        this.setY = setnavigationicontint;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // o.setNavigationIconTint.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        return this.setY.setX(actionMenuPresenter$SavedState$1, null, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.setY.setX((ActionMenuPresenter$SavedState$1) getAdapter().getItem(i), null, 0);
    }
}