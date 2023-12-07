package o;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

/* loaded from: classes.dex */
final class setInterpolatedProgress implements KeyListener {
    private final KeyListener MenuHostHelper$$ExternalSyntheticLambda1;
    private final setX setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setInterpolatedProgress(KeyListener keyListener) {
        this(keyListener, new setX());
    }

    private setInterpolatedProgress(KeyListener keyListener, setX setx) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = keyListener;
        this.setIconTintList = setx;
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.setIconTintList.setX(editable, i, keyEvent) || this.MenuHostHelper$$ExternalSyntheticLambda1.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.onKeyUp(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.clearMetaKeyState(view, editable, i);
    }

    /* loaded from: classes.dex */
    public static class setX {
        public boolean setX(Editable editable, int i, KeyEvent keyEvent) {
            return setScrollContainer.setY(editable, i, keyEvent);
        }
    }
}