package o;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* loaded from: classes.dex */
public final class isTypeVisible {
    public final isTypeVisible$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    private int setX = Integer.MAX_VALUE;
    private int setIconTintList = 0;

    public isTypeVisible(EditText editText) {
        if (editText != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new setIconTintList(editText, false);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    /* loaded from: classes.dex */
    static class setIconTintList extends isTypeVisible$MenuHostHelper$$ExternalSyntheticLambda1 {
        private final setInputExtras MenuHostHelper$$ExternalSyntheticLambda1;
        private final EditText setIconTintList;

        setIconTintList(EditText editText, boolean z) {
            this.setIconTintList = editText;
            setInputExtras setinputextras = new setInputExtras(editText, z);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setinputextras;
            editText.addTextChangedListener(setinputextras);
            editText.setEditableFactory(setContentDescription.MenuHostHelper$$ExternalSyntheticLambda1());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.isTypeVisible$MenuHostHelper$$ExternalSyntheticLambda1
        public KeyListener setIconTintList(KeyListener keyListener) {
            if (keyListener instanceof setInterpolatedProgress) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new setInterpolatedProgress(keyListener);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.isTypeVisible$MenuHostHelper$$ExternalSyntheticLambda1
        public InputConnection MenuHostHelper$$ExternalSyntheticLambda1(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof linkToDeath ? inputConnection : new linkToDeath(this.setIconTintList, inputConnection, editorInfo);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.isTypeVisible$MenuHostHelper$$ExternalSyntheticLambda1
        public void setIconTintList(boolean z) {
            setInputExtras setinputextras = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setinputextras.MenuHostHelper$$ExternalSyntheticLambda1 != z) {
                if (setinputextras.setY != null) {
                    setScrollContainer.setIconTintList().setIconTintList(setinputextras.setY);
                }
                setinputextras.MenuHostHelper$$ExternalSyntheticLambda1 = z;
                if (z) {
                    setInputExtras.MenuHostHelper$$ExternalSyntheticLambda1(setinputextras.setX, setScrollContainer.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1());
                }
            }
        }
    }
}