package o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public final class setProgress {
    public static void setY(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
        setY.setY(checkedTextView, mode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void setX(CheckedTextView checkedTextView, ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static void setY(CheckedTextView checkedTextView, PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
    }
}