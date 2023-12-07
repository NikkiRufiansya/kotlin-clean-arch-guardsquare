package o;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class jm extends FilterInputStream {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    private byte[] MenuHostHelper$$ExternalSyntheticLambda1;
    private byte[] setIconTintList;
    private int setLayoutAnimation;
    private int setNavigationOnClickListener;
    private int setOnLongClickListener;
    private int[] setUiOptions;
    private int setUnboundedRipple;
    private jl setX;
    private byte[] setY;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public jm(InputStream inputStream, int[] iArr, byte[] bArr, int i, boolean z, int i2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.setUnboundedRipple = Integer.MAX_VALUE;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = Math.min(Math.max(i, 3), 16);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new byte[8];
        byte[] bArr2 = new byte[8];
        this.setY = bArr2;
        this.setIconTintList = new byte[8];
        this.setUiOptions = new int[2];
        this.setLayoutAnimation = 8;
        this.setOnLongClickListener = 8;
        this.setNavigationOnClickListener = i2;
        if (i2 == 2) {
            System.arraycopy(bArr, 0, bArr2, 0, 8);
        }
        this.setX = new jl(iArr, this.MenuHostHelper$$ExternalSyntheticLambda0, true, false);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        int i = this.setLayoutAnimation;
        if (i >= this.setOnLongClickListener) {
            return -1;
        }
        byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setLayoutAnimation = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            MenuHostHelper$$ExternalSyntheticLambda1();
            int i5 = this.setLayoutAnimation;
            if (i5 >= this.setOnLongClickListener) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setLayoutAnimation = i5 + 1;
            bArr[i4] = bArr2[i5];
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long j2 = 0;
        while (j2 < j && read() != -1) {
            j2++;
        }
        return j2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        return this.setOnLongClickListener - this.setLayoutAnimation;
    }

    private void setY() {
        if (this.setNavigationOnClickListener == 2) {
            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            System.arraycopy(bArr, 0, this.setIconTintList, 0, bArr.length);
        }
        byte[] bArr2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        jo.setY(((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255), ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255), false, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setX.setX, this.setX.setY, this.setUiOptions);
        int[] iArr = this.setUiOptions;
        int i = iArr[0];
        int i2 = iArr[1];
        byte[] bArr3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.setNavigationOnClickListener == 2) {
            for (int i3 = 0; i3 < 8; i3++) {
                byte[] bArr4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                bArr4[i3] = (byte) (bArr4[i3] ^ this.setY[i3]);
            }
            byte[] bArr5 = this.setIconTintList;
            System.arraycopy(bArr5, 0, this.setY, 0, bArr5.length);
        }
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setUnboundedRipple == Integer.MAX_VALUE) {
            this.setUnboundedRipple = ((FilterInputStream) this).in.read();
        }
        if (this.setLayoutAnimation == 8) {
            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
            int i = this.setUnboundedRipple;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.MenuHostHelper$$ExternalSyntheticLambda1, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            setY();
            int read2 = ((FilterInputStream) this).in.read();
            this.setUnboundedRipple = read2;
            this.setLayoutAnimation = 0;
            this.setOnLongClickListener = read2 < 0 ? 8 - (this.MenuHostHelper$$ExternalSyntheticLambda1[7] & 255) : 8;
        }
        return this.setOnLongClickListener;
    }
}