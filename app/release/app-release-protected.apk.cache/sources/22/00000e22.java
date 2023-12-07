package o;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class setOnKeyListener implements setOnTabChangedListener {
    @Override // o.setOnTabChangedListener
    public final setStrokeAlpha MenuHostHelper$$ExternalSyntheticLambda0(View view, setStrokeAlpha setstrokealpha) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            StringBuilder sb = new StringBuilder("onReceive: ");
            sb.append(setstrokealpha);
            Log.d("ReceiveContent", sb.toString());
        }
        if (setstrokealpha.MenuHostHelper$$ExternalSyntheticLambda0() == 2) {
            return setstrokealpha;
        }
        ClipData x = setstrokealpha.setX();
        int MenuHostHelper$$ExternalSyntheticLambda1 = setstrokealpha.MenuHostHelper$$ExternalSyntheticLambda1();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z = false;
        for (int i = 0; i < x.getItemCount(); i++) {
            CharSequence MenuHostHelper$$ExternalSyntheticLambda0 = setY.MenuHostHelper$$ExternalSyntheticLambda0(context, x.getItemAt(i), MenuHostHelper$$ExternalSyntheticLambda1);
            if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                if (!z) {
                    MenuHostHelper$$ExternalSyntheticLambda1(editable, MenuHostHelper$$ExternalSyntheticLambda0);
                    z = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), MenuHostHelper$$ExternalSyntheticLambda0);
                }
            }
        }
        return null;
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    /* loaded from: classes.dex */
    static final class setY {
        static CharSequence MenuHostHelper$$ExternalSyntheticLambda0(Context context, ClipData.Item item, int i) {
            if ((i & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                return coerceToText instanceof Spanned ? coerceToText.toString() : coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }
}