package o;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
final class getDisplayCutout implements Spannable {
    private boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    Spannable setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getDisplayCutout(Spannable spannable) {
        this.setX = spannable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public getDisplayCutout(CharSequence charSequence) {
        this.setX = new SpannableString(charSequence);
    }

    private void setY() {
        Spannable spannable = this.setX;
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1) {
            if ((Build.VERSION.SDK_INT < 28 ? new setIconTintList() : new setIconTintList() { // from class: o.getDisplayCutout$MenuHostHelper$$ExternalSyntheticLambda1
                @Override // o.getDisplayCutout.setIconTintList
                final boolean setX(CharSequence charSequence) {
                    return setErrorIconDrawable.MenuHostHelper$$ExternalSyntheticLambda1(charSequence) || (charSequence instanceof setHighlights);
                }
            }).setX(spannable)) {
                this.setX = new SpannableString(spannable);
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        setY();
        this.setX.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        setY();
        this.setX.removeSpan(obj);
    }

    @Override // android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        return (T[]) this.setX.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.setX.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.setX.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.setX.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.setX.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.setX.length();
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.setX.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.setX.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.setX.toString();
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.setX.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.setX.codePoints();
        return codePoints;
    }

    /* loaded from: classes.dex */
    static class setY {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        boolean setX(CharSequence charSequence) {
            return charSequence instanceof setHighlights;
        }
    }
}