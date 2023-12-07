package o;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* loaded from: classes.dex */
final class F implements TextView.OnEditorActionListener, View.OnKeyListener {
    final C0559w MenuHostHelper$$ExternalSyntheticLambda0;
    private boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    final C0559w setX;
    private final D setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public F(C0559w c0559w, C0559w c0559w2, D d) {
        this.setX = c0559w;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0559w2;
        this.setY = d;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.setChecked(i == 12);
        this.setX.setChecked(i == 10);
        this.setY.setUnboundedRipple = i;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            MenuHostHelper$$ExternalSyntheticLambda1(12);
        }
        return z;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            return false;
        }
        boolean z = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        EditText editText = (EditText) view;
        if (this.setY.setUnboundedRipple == 12) {
            if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
                MenuHostHelper$$ExternalSyntheticLambda1(10);
            }
            z = false;
        } else {
            Editable text = editText.getText();
            if (text != null) {
                if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
                    MenuHostHelper$$ExternalSyntheticLambda1(12);
                }
            }
            z = false;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        return z;
    }
}