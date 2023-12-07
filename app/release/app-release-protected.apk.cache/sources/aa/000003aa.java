package o;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class dJ extends OutputStream {
    private long MenuHostHelper$$ExternalSyntheticLambda0 = -1;
    private dA MenuHostHelper$$ExternalSyntheticLambda1;
    private final eA setIconTintList;
    private final OutputStream setX;

    public dJ(OutputStream outputStream, dA dAVar, eA eAVar) {
        this.setX = outputStream;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = dAVar;
        this.setIconTintList = eAVar;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (j != -1) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.setX(j);
        }
        dA dAVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        eA eAVar = this.setIconTintList;
        dAVar.setY.MenuHostHelper$$ExternalSyntheticLambda1(new eA().setX - eAVar.setX);
        try {
            this.setX.close();
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.setIconTintList.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            this.setX.flush();
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.setIconTintList.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        try {
            this.setX.write(i);
            long j = this.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.setX(j);
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.setIconTintList.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        try {
            this.setX.write(bArr);
            long length = this.MenuHostHelper$$ExternalSyntheticLambda0 + bArr.length;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = length;
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.setX(length);
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.setIconTintList.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            this.setX.write(bArr, i, i2);
            long j = this.MenuHostHelper$$ExternalSyntheticLambda0 + i2;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY.setX(j);
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.setY(new eA().setX - this.setIconTintList.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1);
            throw e;
        }
    }
}