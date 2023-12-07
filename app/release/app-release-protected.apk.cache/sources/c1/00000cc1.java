package o;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setInputExtras implements TextWatcher {
    private final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    final EditText setX;
    setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1 setY;
    private int setUnboundedRipple = Integer.MAX_VALUE;
    private int setIconTintList = 0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public setInputExtras(EditText editText, boolean z) {
        this.setX = editText;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (this.setX.isInEditMode()) {
            return;
        }
        if (((this.MenuHostHelper$$ExternalSyntheticLambda1 && (this.MenuHostHelper$$ExternalSyntheticLambda0 || setScrollContainer.setX())) ? false : true) || i2 > i3 || !(charSequence instanceof Spannable)) {
            return;
        }
        int MenuHostHelper$$ExternalSyntheticLambda1 = setScrollContainer.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda1 != 0) {
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                setScrollContainer.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda0((Spannable) charSequence, i, i + i3, this.setUnboundedRipple, this.setIconTintList);
                return;
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 != 3) {
                return;
            }
        }
        setScrollContainer iconTintList = setScrollContainer.setIconTintList();
        if (this.setY == null) {
            this.setY = new setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1(this.setX) { // from class: o.setInputExtras$MenuHostHelper$$ExternalSyntheticLambda1
                private final Reference<EditText> MenuHostHelper$$ExternalSyntheticLambda0;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = new WeakReference(r2);
                }

                @Override // o.setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1
                public final void MenuHostHelper$$ExternalSyntheticLambda0() {
                    super.MenuHostHelper$$ExternalSyntheticLambda0();
                    setInputExtras.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.get(), 1);
                }
            };
        }
        iconTintList.MenuHostHelper$$ExternalSyntheticLambda1(this.setY);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(EditText editText, int i) {
        if (i == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            setScrollContainer.setIconTintList().setIconTintList(editableText);
            setContentScrimColor.setIconTintList(editableText, selectionStart, selectionEnd);
        }
    }
}