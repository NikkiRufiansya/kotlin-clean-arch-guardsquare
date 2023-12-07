package o;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import o.setBackgroundTintMode;
import o.setTranscriptMode;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda1 implements setBackgroundTintMode {
    ActionMenuPresenter$SavedState$1 MenuHostHelper$$ExternalSyntheticLambda0;
    private setNavigationIconTint setX;
    final /* synthetic */ setTranscriptMode setY;

    @Override // o.setBackgroundTintMode
    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        return 0;
    }

    @Override // o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setBackgroundTintMode.setY sety) {
    }

    @Override // o.setBackgroundTintMode
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(minusKey minuskey) {
        return false;
    }

    @Override // o.setBackgroundTintMode
    public final void setIconTintList(Parcelable parcelable) {
    }

    @Override // o.setBackgroundTintMode
    public final void setIconTintList(setNavigationIconTint setnavigationicontint, boolean z) {
    }

    @Override // o.setBackgroundTintMode
    public final Parcelable setOnLongClickListener() {
        return null;
    }

    @Override // o.setBackgroundTintMode
    public final boolean setX() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda1(setTranscriptMode settranscriptmode) {
        this.setY = settranscriptmode;
    }

    @Override // o.setBackgroundTintMode
    public final void setX(Context context, setNavigationIconTint setnavigationicontint) {
        ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1;
        setNavigationIconTint setnavigationicontint2 = this.setX;
        if (setnavigationicontint2 != null && (actionMenuPresenter$SavedState$1 = this.MenuHostHelper$$ExternalSyntheticLambda0) != null) {
            setnavigationicontint2.setY(actionMenuPresenter$SavedState$1);
        }
        this.setX = setnavigationicontint;
    }

    @Override // o.setBackgroundTintMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            setNavigationIconTint setnavigationicontint = this.setX;
            boolean z2 = false;
            if (setnavigationicontint != null) {
                int size = setnavigationicontint.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    } else if (this.setX.getItem(i) == this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        z2 = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z2) {
                return;
            }
            setY(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    @Override // o.setBackgroundTintMode
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1();
        ViewParent parent = this.setY.setY.getParent();
        setTranscriptMode settranscriptmode = this.setY;
        if (parent != settranscriptmode) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(settranscriptmode.setY);
            }
            setTranscriptMode settranscriptmode2 = this.setY;
            settranscriptmode2.addView(settranscriptmode2.setY);
        }
        this.setY.setIconTintList = actionMenuPresenter$SavedState$1.getActionView();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = actionMenuPresenter$SavedState$1;
        ViewParent parent2 = this.setY.setIconTintList.getParent();
        setTranscriptMode settranscriptmode3 = this.setY;
        if (parent2 != settranscriptmode3) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(settranscriptmode3.setIconTintList);
            }
            setTranscriptMode.setIconTintList y = setTranscriptMode.setY();
            y.MenuHostHelper$$ExternalSyntheticLambda1 = (this.setY.MenuHostHelper$$ExternalSyntheticLambda0 & 112) | 8388611;
            y.setIconTintList = 2;
            this.setY.setIconTintList.setLayoutParams(y);
            setTranscriptMode settranscriptmode4 = this.setY;
            settranscriptmode4.addView(settranscriptmode4.setIconTintList);
        }
        setTranscriptMode settranscriptmode5 = this.setY;
        for (int childCount = settranscriptmode5.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = settranscriptmode5.getChildAt(childCount);
            if (((setTranscriptMode.setIconTintList) childAt.getLayoutParams()).setIconTintList != 2 && childAt != settranscriptmode5.setOnLongClickListener) {
                settranscriptmode5.removeViewAt(childCount);
                settranscriptmode5.MenuHostHelper$$ExternalSyntheticLambda1.add(childAt);
            }
        }
        this.setY.requestLayout();
        actionMenuPresenter$SavedState$1.setX = true;
        actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        if (this.setY.setIconTintList instanceof setChipSpacingVertical) {
            ((setChipSpacingVertical) this.setY.setIconTintList).setX();
        }
        return true;
    }

    @Override // o.setBackgroundTintMode
    public final boolean setY(ActionMenuPresenter$SavedState$1 actionMenuPresenter$SavedState$1) {
        if (this.setY.setIconTintList instanceof setChipSpacingVertical) {
            ((setChipSpacingVertical) this.setY.setIconTintList).setIconTintList();
        }
        setTranscriptMode settranscriptmode = this.setY;
        settranscriptmode.removeView(settranscriptmode.setIconTintList);
        setTranscriptMode settranscriptmode2 = this.setY;
        settranscriptmode2.removeView(settranscriptmode2.setY);
        this.setY.setIconTintList = null;
        setTranscriptMode settranscriptmode3 = this.setY;
        for (int size = settranscriptmode3.MenuHostHelper$$ExternalSyntheticLambda1.size() - 1; size >= 0; size--) {
            settranscriptmode3.addView(settranscriptmode3.MenuHostHelper$$ExternalSyntheticLambda1.get(size));
        }
        settranscriptmode3.MenuHostHelper$$ExternalSyntheticLambda1.clear();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        this.setY.requestLayout();
        actionMenuPresenter$SavedState$1.setX = false;
        actionMenuPresenter$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(false);
        return true;
    }
}