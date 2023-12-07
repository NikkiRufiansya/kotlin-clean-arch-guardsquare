package o;

import java.io.OutputStream;

/* loaded from: classes.dex */
final class bG extends OutputStream {
    long setIconTintList = 0;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.setIconTintList++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.setIconTintList += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.setIconTintList += i2;
    }
}