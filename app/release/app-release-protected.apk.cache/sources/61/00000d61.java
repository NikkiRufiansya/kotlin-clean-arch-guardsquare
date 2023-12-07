package o;

import android.os.Build;
import android.text.TextPaint;
import o.setScrollContainer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setMaxWidth implements setScrollContainer.setY {
    private static final ThreadLocal<StringBuilder> MenuHostHelper$$ExternalSyntheticLambda0 = new ThreadLocal<>();
    private final TextPaint MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setMaxWidth() {
        TextPaint textPaint = new TextPaint();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // o.setScrollContainer.setY
    public final boolean setIconTintList(CharSequence charSequence, int i, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23 || i3 <= Build.VERSION.SDK_INT) {
            ThreadLocal<StringBuilder> threadLocal = MenuHostHelper$$ExternalSyntheticLambda0;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            return setOverriddenInsets.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1, sb.toString());
        }
        return false;
    }
}