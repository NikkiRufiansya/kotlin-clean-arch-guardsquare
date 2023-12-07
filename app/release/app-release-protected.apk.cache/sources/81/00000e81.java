package o;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setPlaceholderTextAppearance extends Writer {
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private StringBuilder setX = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public setPlaceholderTextAppearance(String str) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                MenuHostHelper$$ExternalSyntheticLambda1();
            } else {
                this.setX.append(c);
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setX.length() > 0) {
            Log.d(this.MenuHostHelper$$ExternalSyntheticLambda1, this.setX.toString());
            StringBuilder sb = this.setX;
            sb.delete(0, sb.length());
        }
    }
}