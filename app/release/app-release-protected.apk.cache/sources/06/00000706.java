package o;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
final class mQ extends InputStream {
    private final InputStream MenuHostHelper$$ExternalSyntheticLambda0;
    private long MenuHostHelper$$ExternalSyntheticLambda1;
    private long setIconTintList;
    private long setNavigationOnClickListener;
    private long setUiOptions;
    boolean setX;
    private int setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public mQ(InputStream inputStream) {
        this(inputStream, (byte) 0);
    }

    private mQ(InputStream inputStream, byte b) {
        this(inputStream, 4096);
    }

    private mQ(InputStream inputStream, int i) {
        this.setIconTintList = -1L;
        this.setX = true;
        this.setY = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
        this.setY = 1024;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.setIconTintList = MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    public final long MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        long j = this.setUiOptions + i;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 < j) {
            MenuHostHelper$$ExternalSyntheticLambda1(j);
        }
        return this.setUiOptions;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(long j) {
        try {
            long j2 = this.setNavigationOnClickListener;
            long j3 = this.setUiOptions;
            if (j2 < j3 && j3 <= this.MenuHostHelper$$ExternalSyntheticLambda1) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.reset();
                this.MenuHostHelper$$ExternalSyntheticLambda0.mark((int) (j - this.setNavigationOnClickListener));
                setY(this.setNavigationOnClickListener, this.setUiOptions);
            } else {
                this.setNavigationOnClickListener = j3;
                this.MenuHostHelper$$ExternalSyntheticLambda0.mark((int) (j - j3));
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = j;
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder("Unable to mark: ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        setX(this.setIconTintList);
    }

    public final void setX(long j) {
        if (this.setUiOptions > this.MenuHostHelper$$ExternalSyntheticLambda1 || j < this.setNavigationOnClickListener) {
            throw new IOException("Cannot reset");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.reset();
        setY(this.setNavigationOnClickListener, j);
        this.setUiOptions = j;
    }

    private void setY(long j, long j2) {
        while (j < j2) {
            long skip = this.MenuHostHelper$$ExternalSyntheticLambda0.skip(j2 - j);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                }
                skip = 1;
            }
            j += skip;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.setX) {
            long j = this.setUiOptions;
            long j2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (j + 1 > j2) {
                MenuHostHelper$$ExternalSyntheticLambda1(j2 + this.setY);
            }
        }
        int read = this.MenuHostHelper$$ExternalSyntheticLambda0.read();
        if (read != -1) {
            this.setUiOptions++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        if (!this.setX) {
            long j = this.setUiOptions;
            if (bArr.length + j > this.MenuHostHelper$$ExternalSyntheticLambda1) {
                MenuHostHelper$$ExternalSyntheticLambda1(j + bArr.length + this.setY);
            }
        }
        int read = this.MenuHostHelper$$ExternalSyntheticLambda0.read(bArr);
        if (read != -1) {
            this.setUiOptions += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.setX) {
            long j = this.setUiOptions + i2;
            if (j > this.MenuHostHelper$$ExternalSyntheticLambda1) {
                MenuHostHelper$$ExternalSyntheticLambda1(j + this.setY);
            }
        }
        int read = this.MenuHostHelper$$ExternalSyntheticLambda0.read(bArr, i, i2);
        if (read != -1) {
            this.setUiOptions += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (!this.setX) {
            long j2 = this.setUiOptions + j;
            if (j2 > this.MenuHostHelper$$ExternalSyntheticLambda1) {
                MenuHostHelper$$ExternalSyntheticLambda1(j2 + this.setY);
            }
        }
        long skip = this.MenuHostHelper$$ExternalSyntheticLambda0.skip(j);
        this.setUiOptions += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.MenuHostHelper$$ExternalSyntheticLambda0.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0.markSupported();
    }
}