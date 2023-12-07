package o;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import o.setAnimationFromJson;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setSecondaryProgressTintMode {
    private final EditText MenuHostHelper$$ExternalSyntheticLambda1;
    private final isTypeVisible setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setSecondaryProgressTintMode(EditText editText) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = editText;
        this.setY = new isTypeVisible(editText);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.MenuHostHelper$$ExternalSyntheticLambda1.getContext().obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setRevealInfo, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(setAnimationFromJson.setY.RemoteActionCompatParcelizer) ? obtainStyledAttributes.getBoolean(setAnimationFromJson.setY.RemoteActionCompatParcelizer, true) : true;
            obtainStyledAttributes.recycle();
            setIconTintList(z);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setIconTintList(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList(boolean z) {
        this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KeyListener setY(KeyListener keyListener) {
        return setIconTintList(keyListener) ? this.setY.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(keyListener) : keyListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public InputConnection setX(InputConnection inputConnection, EditorInfo editorInfo) {
        isTypeVisible istypevisible = this.setY;
        if (inputConnection == null) {
            return null;
        }
        return istypevisible.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(inputConnection, editorInfo);
    }
}