package o;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setContentScrimColor implements InputFilter {
    private final TextView MenuHostHelper$$ExternalSyntheticLambda0;
    private setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1 setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setContentScrimColor(TextView textView) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.isInEditMode()) {
            return charSequence;
        }
        int MenuHostHelper$$ExternalSyntheticLambda1 = setScrollContainer.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1();
        if (MenuHostHelper$$ExternalSyntheticLambda1 != 0) {
            boolean z = true;
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                if (i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == this.MenuHostHelper$$ExternalSyntheticLambda0.getText()) {
                    z = false;
                }
                if (!z || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return setScrollContainer.setIconTintList().setX(charSequence, 0, charSequence.length());
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 != 3) {
                return charSequence;
            }
        }
        setScrollContainer iconTintList = setScrollContainer.setIconTintList();
        if (this.setY == null) {
            this.setY = new setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, this);
        }
        iconTintList.MenuHostHelper$$ExternalSyntheticLambda1(this.setY);
        return charSequence;
    }

    /* loaded from: classes.dex */
    static class setIconTintList extends setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1 {
        private final Reference<setContentScrimColor> setIconTintList;
        private final Reference<TextView> setY;

        setIconTintList(TextView textView, setContentScrimColor setcontentscrimcolor) {
            this.setY = new WeakReference(textView);
            this.setIconTintList = new WeakReference(setcontentscrimcolor);
        }

        @Override // o.setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda1
        public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            CharSequence text;
            CharSequence iconTintList;
            InputFilter[] filters;
            super.MenuHostHelper$$ExternalSyntheticLambda0();
            TextView textView = this.setY.get();
            setContentScrimColor setcontentscrimcolor = this.setIconTintList.get();
            boolean z = false;
            if (setcontentscrimcolor != null && textView != null && (filters = textView.getFilters()) != null) {
                int i = 0;
                while (true) {
                    if (i >= filters.length) {
                        break;
                    } else if (filters[i] == setcontentscrimcolor) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z && textView.isAttachedToWindow() && text != (iconTintList = setScrollContainer.setIconTintList().setIconTintList((text = textView.getText())))) {
                int selectionStart = Selection.getSelectionStart(iconTintList);
                int selectionEnd = Selection.getSelectionEnd(iconTintList);
                textView.setText(iconTintList);
                if (iconTintList instanceof Spannable) {
                    setContentScrimColor.setIconTintList((Spannable) iconTintList, selectionStart, selectionEnd);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList(Spannable spannable, int i, int i2) {
        if (i >= 0 && i2 >= 0) {
            Selection.setSelection(spannable, i, i2);
        } else if (i >= 0) {
            Selection.setSelection(spannable, i);
        } else if (i2 >= 0) {
            Selection.setSelection(spannable, i2);
        }
    }
}