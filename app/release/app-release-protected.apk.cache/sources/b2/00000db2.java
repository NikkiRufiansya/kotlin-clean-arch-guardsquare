package o;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
class setNavigationContentDescription$MenuHostHelper$$ExternalSyntheticLambda1 extends BottomSheetBehavior.setY {
    private Window MenuHostHelper$$ExternalSyntheticLambda0;
    private final WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setX;
    private final Boolean setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setNavigationContentDescription$MenuHostHelper$$ExternalSyntheticLambda1(View view, WindowInsetsCompat windowInsetsCompat, byte b) {
        this(view, windowInsetsCompat);
    }

    private setNavigationContentDescription$MenuHostHelper$$ExternalSyntheticLambda1(View view, WindowInsetsCompat windowInsetsCompat) {
        ColorStateList layoutAnimation;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = windowInsetsCompat;
        setWebViewClient setwebviewclient = com.google.android.material.bottomsheet.BottomSheetBehavior.MenuHostHelper$$ExternalSyntheticLambda0(view).ViewPager$SavedState$1;
        if (setwebviewclient == null) {
            layoutAnimation = setBaselineAlignBottom.setLayoutAnimation(view);
        } else {
            layoutAnimation = setwebviewclient.setChipIconTintResource.setX;
        }
        boolean z = true;
        if (layoutAnimation != null) {
            int defaultColor = layoutAnimation.getDefaultColor();
            this.setY = Boolean.valueOf((defaultColor == 0 || setExtended.MenuHostHelper$$ExternalSyntheticLambda0(defaultColor) <= 0.5d) ? false : false);
        } else if (view.getBackground() instanceof ColorDrawable) {
            int color = ((ColorDrawable) view.getBackground()).getColor();
            this.setY = Boolean.valueOf((color == 0 || setExtended.MenuHostHelper$$ExternalSyntheticLambda0(color) <= 0.5d) ? false : false);
        } else {
            this.setY = null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda1(View view, int i) {
        MenuHostHelper$$ExternalSyntheticLambda0(view);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.setY
    public final void setX(View view) {
        MenuHostHelper$$ExternalSyntheticLambda0(view);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.setY
    public final void setY(View view) {
        MenuHostHelper$$ExternalSyntheticLambda0(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(Window window) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == window) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = window;
        if (window != null) {
            this.setX = setCloseIconResource.setY(window, window.getDecorView()).setY();
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        if (view.getTop() < this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions()) {
            Window window = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (window != null) {
                Boolean bool = this.setY;
                setCloseIconResource.setY(window, window.getDecorView()).setIconTintList(bool == null ? this.setX : bool.booleanValue());
            }
            view.setPadding(view.getPaddingLeft(), this.MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
        } else if (view.getTop() != 0) {
            Window window2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (window2 != null) {
                setCloseIconResource.setY(window2, window2.getDecorView()).setIconTintList(this.setX);
            }
            view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
        }
    }
}