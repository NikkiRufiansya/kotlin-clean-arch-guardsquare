package o;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public class transact {
    public static void setIconTintList(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT < 26) {
            setSelectedTabIndicatorGravity.setIconTintList(view, charSequence);
        } else {
            view.setTooltipText(charSequence);
        }
    }
}