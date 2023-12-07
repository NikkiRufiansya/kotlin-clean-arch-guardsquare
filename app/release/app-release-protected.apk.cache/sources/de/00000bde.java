package o;

import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import o.setScrollContainer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setFocusable {
    private final setScrollContainer.setLayoutAnimation MenuHostHelper$$ExternalSyntheticLambda0;
    private final int[] MenuHostHelper$$ExternalSyntheticLambda1;
    private final LinearLayoutManager$SavedState$1 setIconTintList;
    private final boolean setX;
    private setScrollContainer.setY setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setFocusable(LinearLayoutManager$SavedState$1 linearLayoutManager$SavedState$1, setScrollContainer.setLayoutAnimation setlayoutanimation, setScrollContainer.setY sety, boolean z, int[] iArr) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setlayoutanimation;
        this.setIconTintList = linearLayoutManager$SavedState$1;
        this.setY = sety;
        this.setX = z;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d6, code lost:
        r0 = (o.setFabAlignmentModeEndMargin) r17;
        r0.MenuHostHelper$$ExternalSyntheticLambda1();
        r0.setIconTintList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013f, code lost:
        r7 = new o.getDisplayCutout((android.text.Spannable) new android.text.SpannableString(r17));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.CharSequence MenuHostHelper$$ExternalSyntheticLambda0(java.lang.CharSequence r17, int r18, int r19, int r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFocusable.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setY(Editable editable, KeyEvent keyEvent, boolean z) {
        setPopupBackgroundResource[] setpopupbackgroundresourceArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!(selectionStart == -1 || selectionEnd == -1 || selectionStart != selectionEnd) && (setpopupbackgroundresourceArr = (setPopupBackgroundResource[]) editable.getSpans(selectionStart, selectionEnd, setPopupBackgroundResource.class)) != null && setpopupbackgroundresourceArr.length > 0) {
            for (setPopupBackgroundResource setpopupbackgroundresource : setpopupbackgroundresourceArr) {
                int spanStart = editable.getSpanStart(setpopupbackgroundresource);
                int spanEnd = editable.getSpanEnd(setpopupbackgroundresource);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    private boolean setIconTintList(CharSequence charSequence, int i, int i2, setFailureListener setfailurelistener) {
        if (setfailurelistener.setIconTintList == 0) {
            setfailurelistener.setIconTintList = this.setY.setIconTintList(charSequence, i, i2, setfailurelistener.MenuHostHelper$$ExternalSyntheticLambda1().MenuHostHelper$$ExternalSyntheticLambda1()) ? 2 : 1;
        }
        return setfailurelistener.setIconTintList == 2;
    }
}