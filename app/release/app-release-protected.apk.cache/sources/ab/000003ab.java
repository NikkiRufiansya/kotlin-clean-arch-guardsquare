package o;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class dK extends InputStream {
    private final dA MenuHostHelper$$ExternalSyntheticLambda0;
    private long MenuHostHelper$$ExternalSyntheticLambda1;
    private final eA setUnboundedRipple;
    private final InputStream setX;
    private long setIconTintList = -1;
    private long setY = -1;

    public dK(InputStream inputStream, dA dAVar, eA eAVar) {
        this.setUnboundedRipple = eAVar;
        this.setX = inputStream;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = dAVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = dAVar.setY.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.setX.available();
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(new eA().setX - this.setUnboundedRipple.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = new eA().setX - this.setUnboundedRipple.setX;
        if (this.setY == -1) {
            this.setY = j;
        }
        try {
            this.setX.close();
            long j2 = this.setIconTintList;
            if (j2 != -1) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY.MenuHostHelper$$ExternalSyntheticLambda0(j2);
            }
            long j3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (j3 != -1) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY.setOnLongClickListener(j3);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(this.setY);
            this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(new eA().setX - this.setUnboundedRipple.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.setX.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.setX.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            int read = this.setX.read();
            long j = new eA().setX - this.setUnboundedRipple.setX;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
            }
            if (read == -1 && this.setY == -1) {
                this.setY = j;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY(j);
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
            } else {
                long j2 = this.setIconTintList + 1;
                this.setIconTintList = j2;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY.MenuHostHelper$$ExternalSyntheticLambda0(j2);
            }
            return read;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(new eA().setX - this.setUnboundedRipple.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            int read = this.setX.read(bArr, i, i2);
            long j = new eA().setX - this.setUnboundedRipple.setX;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
            }
            if (read == -1 && this.setY == -1) {
                this.setY = j;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY(j);
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
            } else {
                long j2 = this.setIconTintList + read;
                this.setIconTintList = j2;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY.MenuHostHelper$$ExternalSyntheticLambda0(j2);
            }
            return read;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(new eA().setX - this.setUnboundedRipple.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            int read = this.setX.read(bArr);
            long j = new eA().setX - this.setUnboundedRipple.setX;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
            }
            if (read == -1 && this.setY == -1) {
                this.setY = j;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY(j);
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1();
            } else {
                long j2 = this.setIconTintList + read;
                this.setIconTintList = j2;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY.MenuHostHelper$$ExternalSyntheticLambda0(j2);
            }
            return read;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(new eA().setX - this.setUnboundedRipple.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        try {
            this.setX.reset();
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(new eA().setX - this.setUnboundedRipple.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            long skip = this.setX.skip(j);
            long j2 = new eA().setX - this.setUnboundedRipple.setX;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = j2;
            }
            if (skip == -1 && this.setY == -1) {
                this.setY = j2;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY(j2);
            } else {
                long j3 = this.setIconTintList + skip;
                this.setIconTintList = j3;
                this.MenuHostHelper$$ExternalSyntheticLambda0.setY.MenuHostHelper$$ExternalSyntheticLambda0(j3);
            }
            return skip;
        } catch (IOException e) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setY(new eA().setX - this.setUnboundedRipple.setX);
            dN.setX(this.MenuHostHelper$$ExternalSyntheticLambda0);
            throw e;
        }
    }
}