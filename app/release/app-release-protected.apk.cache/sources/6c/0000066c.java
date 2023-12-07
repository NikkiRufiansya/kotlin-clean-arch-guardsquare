package o;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class jq extends FilterInputStream {
    private static final short MenuHostHelper$$ExternalSyntheticLambda1 = (short) ((Math.sqrt(5.0d) - 1.0d) * Math.pow(2.0d, 15.0d));
    private byte[] MenuHostHelper$$ExternalSyntheticLambda0;
    private int ViewPager$SavedState$1;
    private int setCenterIfNoTextEnabled;
    private int setIconSize;
    private byte[] setIconTintList;
    private int setLayoutAnimation;
    private int setNavigationOnClickListener;
    private int setOnLongClickListener;
    private int setUiOptions;
    private int setUnboundedRipple;
    private int setX;
    private byte[] setY;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public jq(InputStream inputStream, int[] iArr, int i, byte[] bArr, int i2, int i3) {
        super(new BufferedInputStream(inputStream, 4096));
        this.setNavigationOnClickListener = Integer.MAX_VALUE;
        this.setIconTintList = new byte[8];
        this.setY = new byte[8];
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new byte[8];
        this.setX = 8;
        this.setOnLongClickListener = 8;
        this.setUnboundedRipple = Math.min(Math.max(i2, 5), 16);
        this.setUiOptions = i3;
        if (i3 == 3) {
            System.arraycopy(bArr, 0, this.setY, 0, 8);
        }
        long j = ((iArr[0] & 4294967295L) << 32) | (4294967295L & iArr[1]);
        if (i != 0) {
            int i4 = (int) j;
            this.setLayoutAnimation = i4;
            this.setIconSize = i4 * i;
            this.ViewPager$SavedState$1 = i4 ^ i;
            this.setCenterIfNoTextEnabled = (int) (j >> 32);
            return;
        }
        this.setLayoutAnimation = (int) j;
        long j2 = j >> 3;
        short s = MenuHostHelper$$ExternalSyntheticLambda1;
        this.setIconSize = (int) ((s * j2) >> 32);
        this.ViewPager$SavedState$1 = (int) (j >> 32);
        this.setCenterIfNoTextEnabled = (int) (j2 + s);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        setX();
        int i = this.setX;
        if (i >= this.setOnLongClickListener) {
            return -1;
        }
        byte[] bArr = this.setIconTintList;
        this.setX = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            setX();
            int i5 = this.setX;
            if (i5 >= this.setOnLongClickListener) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.setIconTintList;
            this.setX = i5 + 1;
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
        setX();
        return this.setOnLongClickListener - this.setX;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setUiOptions == 3) {
            byte[] bArr = this.setIconTintList;
            System.arraycopy(bArr, 0, this.MenuHostHelper$$ExternalSyntheticLambda0, 0, bArr.length);
        }
        byte[] bArr2 = this.setIconTintList;
        int i = ((bArr2[0] << 24) & (-16777216)) + ((bArr2[1] << 16) & 16711680) + ((bArr2[2] << 8) & 65280) + (bArr2[3] & 255);
        int i2 = ((-16777216) & (bArr2[4] << 24)) + (16711680 & (bArr2[5] << 16)) + (65280 & (bArr2[6] << 8)) + (bArr2[7] & 255);
        int i3 = 0;
        while (true) {
            int i4 = this.setUnboundedRipple;
            if (i3 >= i4) {
                break;
            }
            short s = MenuHostHelper$$ExternalSyntheticLambda1;
            i2 -= ((((i4 - i3) * s) + i) ^ ((i << 4) + this.ViewPager$SavedState$1)) ^ ((i >>> 5) + this.setCenterIfNoTextEnabled);
            i -= (((i2 << 4) + this.setLayoutAnimation) ^ ((s * (i4 - i3)) + i2)) ^ ((i2 >>> 5) + this.setIconSize);
            i3++;
        }
        byte[] bArr3 = this.setIconTintList;
        bArr3[0] = (byte) (i >> 24);
        bArr3[1] = (byte) (i >> 16);
        bArr3[2] = (byte) (i >> 8);
        bArr3[3] = (byte) i;
        bArr3[4] = (byte) (i2 >> 24);
        bArr3[5] = (byte) (i2 >> 16);
        bArr3[6] = (byte) (i2 >> 8);
        bArr3[7] = (byte) i2;
        if (this.setUiOptions == 3) {
            for (int i5 = 0; i5 < 8; i5++) {
                byte[] bArr4 = this.setIconTintList;
                bArr4[i5] = (byte) (bArr4[i5] ^ this.setY[i5]);
            }
            byte[] bArr5 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            System.arraycopy(bArr5, 0, this.setY, 0, bArr5.length);
        }
    }

    private int setX() {
        if (this.setNavigationOnClickListener == Integer.MAX_VALUE) {
            this.setNavigationOnClickListener = ((FilterInputStream) this).in.read();
        }
        if (this.setX == 8) {
            byte[] bArr = this.setIconTintList;
            int i = this.setNavigationOnClickListener;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.setIconTintList, i2, 8 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 8);
            if (i2 < 8) {
                throw new IllegalStateException("unexpected block size");
            }
            MenuHostHelper$$ExternalSyntheticLambda0();
            int read2 = ((FilterInputStream) this).in.read();
            this.setNavigationOnClickListener = read2;
            this.setX = 0;
            this.setOnLongClickListener = read2 < 0 ? 8 - (this.setIconTintList[7] & 255) : 8;
        }
        return this.setOnLongClickListener;
    }
}