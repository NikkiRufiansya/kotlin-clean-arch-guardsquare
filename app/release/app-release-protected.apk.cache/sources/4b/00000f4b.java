package o;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* loaded from: classes.dex */
class setScrollY {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static InputConnection MenuHostHelper$$ExternalSyntheticLambda1(InputConnection inputConnection, EditorInfo editorInfo, View view) {
        if (inputConnection != null && editorInfo.hintText == null) {
            ViewParent parent = view.getParent();
            while (true) {
                if (!(parent instanceof View)) {
                    break;
                } else if (parent instanceof setStartIconVisible) {
                    editorInfo.hintText = ((setStartIconVisible) parent).setX();
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
        }
        return inputConnection;
    }
}