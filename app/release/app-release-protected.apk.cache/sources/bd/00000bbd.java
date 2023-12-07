package o;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class setFabAlignmentModeEndMargin extends SpannableStringBuilder {
    private final List<setIconTintList> setIconTintList;
    private final Class<?> setY;

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(char c) {
        return append(c);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence) {
        return append(charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Editable append(CharSequence charSequence, int i, int i2) {
        return append(charSequence, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(char c) {
        return append(c);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence) {
        return append(charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final /* bridge */ /* synthetic */ Appendable append(CharSequence charSequence, int i, int i2) {
        return append(charSequence, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable delete(int i, int i2) {
        return delete(i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence) {
        return insert(i, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        return insert(i, charSequence, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        return replace(i, i2, charSequence);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        return replace(i, i2, charSequence, i3, i4);
    }

    public setFabAlignmentModeEndMargin(Class<?> cls, CharSequence charSequence) {
        super(charSequence);
        this.setIconTintList = new ArrayList();
        if (cls != null) {
            this.setY = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    private setFabAlignmentModeEndMargin(Class<?> cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.setIconTintList = new ArrayList();
        if (cls != null) {
            this.setY = cls;
            return;
        }
        throw new NullPointerException("watcherClass cannot be null");
    }

    private boolean setX(Object obj) {
        if (obj != null) {
            if (this.setY == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new setFabAlignmentModeEndMargin(this.setY, this, i, i2);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (setX(obj)) {
            setIconTintList seticontintlist = new setIconTintList(obj);
            this.setIconTintList.add(seticontintlist);
            obj = seticontintlist;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        setIconTintList seticontintlist;
        if (setX(obj)) {
            seticontintlist = MenuHostHelper$$ExternalSyntheticLambda1(obj);
            if (seticontintlist != null) {
                obj = seticontintlist;
            }
        } else {
            seticontintlist = null;
        }
        super.removeSpan(obj);
        if (seticontintlist != null) {
            this.setIconTintList.remove(seticontintlist);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;
        if (setX(obj) && (MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(obj)) != null) {
            obj = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;
        if (setX(obj) && (MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(obj)) != null) {
            obj = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;
        if (setX(obj) && (MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(obj)) != null) {
            obj = MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return super.getSpanFlags(obj);
    }

    private setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        for (int i = 0; i < this.setIconTintList.size(); i++) {
            setIconTintList seticontintlist = this.setIconTintList.get(i);
            if (seticontintlist.setX == obj) {
                return seticontintlist;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        for (int i = 0; i < this.setIconTintList.size(); i++) {
            this.setIconTintList.get(i).setIconTintList.incrementAndGet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        for (int i = 0; i < this.setIconTintList.size(); i++) {
            this.setIconTintList.get(i).setIconTintList.decrementAndGet();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList() {
        for (int i = 0; i < this.setIconTintList.size(); i++) {
            this.setIconTintList.get(i).onTextChanged(this, 0, length(), length());
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        MenuHostHelper$$ExternalSyntheticLambda0();
        super.replace(i, i2, charSequence);
        MenuHostHelper$$ExternalSyntheticLambda1();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        MenuHostHelper$$ExternalSyntheticLambda0();
        super.replace(i, i2, charSequence, i3, i4);
        MenuHostHelper$$ExternalSyntheticLambda1();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList implements TextWatcher, SpanWatcher {
        final AtomicInteger setIconTintList = new AtomicInteger(0);
        final Object setX;

        setIconTintList(Object obj) {
            this.setX = obj;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.setX).beforeTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            ((TextWatcher) this.setX).onTextChanged(charSequence, i, i2, i3);
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.setX).afterTextChanged(editable);
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
            if (this.setIconTintList.get() <= 0 || !(obj instanceof setPopupBackgroundResource)) {
                ((SpanWatcher) this.setX).onSpanAdded(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
            if (this.setIconTintList.get() <= 0 || !(obj instanceof setPopupBackgroundResource)) {
                ((SpanWatcher) this.setX).onSpanRemoved(spannable, obj, i, i2);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            if (this.setIconTintList.get() <= 0 || !(obj instanceof setPopupBackgroundResource)) {
                if (Build.VERSION.SDK_INT < 28) {
                    if (i > i2) {
                        i = 0;
                    }
                    if (i3 > i4) {
                        i5 = i;
                        i6 = 0;
                        ((SpanWatcher) this.setX).onSpanChanged(spannable, obj, i5, i2, i6, i4);
                    }
                }
                i5 = i;
                i6 = i3;
                ((SpanWatcher) this.setX).onSpanChanged(spannable, obj, i5, i2, i6, i4);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (this.setY == cls) {
            setIconTintList[] seticontintlistArr = (setIconTintList[]) super.getSpans(i, i2, setIconTintList.class);
            T[] tArr = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, seticontintlistArr.length));
            for (int i3 = 0; i3 < seticontintlistArr.length; i3++) {
                tArr[i3] = seticontintlistArr[i3].setX;
            }
            return tArr;
        }
        return (T[]) super.getSpans(i, i2, cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0009, code lost:
        if ((r1.setY == r4) != false) goto L10;
     */
    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int nextSpanTransition(int r2, int r3, java.lang.Class r4) {
        /*
            r1 = this;
            if (r4 == 0) goto Lb
            java.lang.Class<?> r0 = r1.setY
            if (r0 != r4) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            if (r0 == 0) goto Ld
        Lb:
            java.lang.Class<o.setFabAlignmentModeEndMargin$setIconTintList> r4 = o.setFabAlignmentModeEndMargin.setIconTintList.class
        Ld:
            int r2 = super.nextSpanTransition(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setFabAlignmentModeEndMargin.nextSpanTransition(int, int, java.lang.Class):int");
    }
}