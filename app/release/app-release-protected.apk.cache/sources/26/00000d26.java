package o;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import o.setBackgroundTintMode;
import o.setRevealInfo;

/* loaded from: classes.dex */
final class setLineBreakStyle implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, setBackgroundTintMode.setY {
    setRevealInfo MenuHostHelper$$ExternalSyntheticLambda1;
    setTextAppearanceResource setIconTintList;
    private setBackgroundTintMode.setY setX;
    setNavigationIconTint setY;

    @Override // o.setBackgroundTintMode.setY
    public final boolean setY(setNavigationIconTint setnavigationicontint) {
        return false;
    }

    public setLineBreakStyle(setNavigationIconTint setnavigationicontint) {
        this.setY = setnavigationicontint;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.setIconTintList.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.setIconTintList.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.setY.setX(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.setY.performShortcut(i, keyEvent, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(this.setY, true);
    }

    @Override // o.setBackgroundTintMode.setY
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setNavigationIconTint setnavigationicontint, boolean z) {
        setTextAppearanceResource settextappearanceresource;
        if ((z || setnavigationicontint == this.setY) && (settextappearanceresource = this.setIconTintList) != null) {
            settextappearanceresource.dismiss();
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        setNavigationIconTint setnavigationicontint = this.setY;
        setRevealInfo setrevealinfo = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setrevealinfo.setX == null) {
            setrevealinfo.setX = new setRevealInfo.setY();
        }
        setnavigationicontint.setX((ActionMenuPresenter$SavedState$1) setrevealinfo.setX.getItem(i), null, 0);
    }
}