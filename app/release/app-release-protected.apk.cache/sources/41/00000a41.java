package o;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
final class setCircularRevealOverlayDrawable {
    static final ViewGroup.MarginLayoutParams setY;
    androidx.recyclerview.widget.LinearLayoutManager setIconTintList;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        setY = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCircularRevealOverlayDrawable(androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager) {
        this.setIconTintList = linearLayoutManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setX(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (setX(viewGroup.getChildAt(i))) {
                    return true;
                }
            }
        }
        return false;
    }
}