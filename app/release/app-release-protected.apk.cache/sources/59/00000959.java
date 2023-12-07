package o;

import android.view.View;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setAppSearchData {
    int MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    private int setLayoutAnimation;
    int setX;
    final View setY;
    boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
    private boolean setNavigationOnClickListener = true;

    public setAppSearchData(View view) {
        this.setY = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        View view = this.setY;
        setBaselineAlignBottom.setX(view, this.setIconTintList - (view.getTop() - this.setX));
        View view2 = this.setY;
        setBaselineAlignBottom.MenuHostHelper$$ExternalSyntheticLambda1(view2, this.setLayoutAnimation - (view2.getLeft() - this.MenuHostHelper$$ExternalSyntheticLambda1));
    }
}