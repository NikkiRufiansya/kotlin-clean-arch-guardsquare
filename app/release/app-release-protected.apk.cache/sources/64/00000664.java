package o;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class jk extends FilterInputStream {
    private int ViewPager$SavedState$1;
    private int setChipCornerRadius;
    private int setIconSize;
    private final int[] setLayoutAnimation;
    private final byte[] setNavigationOnClickListener;
    private final byte[][] setOnLongClickListener;
    private final byte[] setTextAlignment;
    private final int setUiOptions;
    private final int[] setUnboundedRipple;
    private static final byte[] setY = jn.setIconTintList;
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda1 = jn.setX;
    private static final int[] MenuHostHelper$$ExternalSyntheticLambda0 = jn.setY;
    private static final int[] setIconTintList = jn.MenuHostHelper$$ExternalSyntheticLambda1;
    private static final int[] setX = jn.MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public jk(InputStream inputStream, int i, byte[] bArr, byte[][] bArr2) {
        super(new BufferedInputStream(inputStream, 4096));
        this.setLayoutAnimation = new int[4];
        this.setNavigationOnClickListener = new byte[16];
        this.setTextAlignment = new byte[16];
        this.setChipCornerRadius = Integer.MAX_VALUE;
        this.setIconSize = 16;
        this.ViewPager$SavedState$1 = 16;
        this.setUiOptions = i;
        this.setUnboundedRipple = jn.MenuHostHelper$$ExternalSyntheticLambda1(bArr, i);
        byte[][] bArr3 = new byte[bArr2.length];
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            bArr3[i2] = new byte[bArr2[i2].length];
            for (int i3 = 0; i3 < bArr2[i2].length; i3++) {
                bArr3[i2][bArr2[i2][i3]] = (byte) i3;
            }
        }
        this.setOnLongClickListener = bArr3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        setIconTintList();
        int i = this.setIconSize;
        if (i >= this.ViewPager$SavedState$1) {
            return -1;
        }
        byte[] bArr = this.setTextAlignment;
        this.setIconSize = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = i + i2;
        for (int i4 = i; i4 < i3; i4++) {
            setIconTintList();
            int i5 = this.setIconSize;
            if (i5 >= this.ViewPager$SavedState$1) {
                if (i4 == i) {
                    return -1;
                }
                return i2 - (i3 - i4);
            }
            byte[] bArr2 = this.setTextAlignment;
            this.setIconSize = i5 + 1;
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
        setIconTintList();
        return this.ViewPager$SavedState$1 - this.setIconSize;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
    }

    private int setIconTintList() {
        if (this.setChipCornerRadius == Integer.MAX_VALUE) {
            this.setChipCornerRadius = ((FilterInputStream) this).in.read();
        }
        if (this.setIconSize == 16) {
            byte[] bArr = this.setNavigationOnClickListener;
            int i = this.setChipCornerRadius;
            bArr[0] = (byte) i;
            if (i < 0) {
                throw new IllegalStateException("unexpected block size");
            }
            int i2 = 1;
            do {
                int read = ((FilterInputStream) this).in.read(this.setNavigationOnClickListener, i2, 16 - i2);
                if (read <= 0) {
                    break;
                }
                i2 += read;
            } while (i2 < 16);
            if (i2 < 16) {
                throw new IllegalStateException("unexpected block size");
            }
            setY(this.setNavigationOnClickListener, this.setTextAlignment);
            int read2 = ((FilterInputStream) this).in.read();
            this.setChipCornerRadius = read2;
            this.setIconSize = 0;
            this.ViewPager$SavedState$1 = read2 < 0 ? 16 - (this.setTextAlignment[15] & 255) : 16;
        }
        return this.ViewPager$SavedState$1;
    }

    private void setY(byte[] bArr, byte[] bArr2) {
        int[] iArr = this.setLayoutAnimation;
        char c = 1;
        int i = (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        int[] iArr2 = this.setUnboundedRipple;
        iArr[0] = i ^ iArr2[0];
        iArr[1] = ((((bArr[4] << 24) | ((bArr[5] & 255) << 16)) | ((bArr[6] & 255) << 8)) | (bArr[7] & 255)) ^ iArr2[1];
        iArr[2] = ((((bArr[8] << 24) | ((bArr[9] & 255) << 16)) | ((bArr[10] & 255) << 8)) | (bArr[11] & 255)) ^ iArr2[2];
        int i2 = (bArr[13] & 255) << 16;
        iArr[3] = iArr2[3] ^ (((i2 | (bArr[12] << 24)) | ((bArr[14] & 255) << 8)) | (bArr[15] & 255));
        int i3 = 1;
        int i4 = 4;
        while (i3 < this.setUiOptions) {
            int[] iArr3 = MenuHostHelper$$ExternalSyntheticLambda1;
            int[] iArr4 = this.setLayoutAnimation;
            byte[][] bArr3 = this.setOnLongClickListener;
            int i5 = iArr3[iArr4[bArr3[0][0]] >>> 24];
            int[] iArr5 = MenuHostHelper$$ExternalSyntheticLambda0;
            int i6 = i5 ^ iArr5[(iArr4[bArr3[c][0]] >>> 16) & 255];
            int[] iArr6 = setIconTintList;
            int i7 = iArr6[(iArr4[bArr3[2][0]] >>> 8) & 255] ^ i6;
            int[] iArr7 = setX;
            int i8 = iArr7[iArr4[bArr3[3][0]] & 255] ^ i7;
            int[] iArr8 = this.setUnboundedRipple;
            int i9 = i8 ^ iArr8[i4];
            int i10 = ((iArr6[(iArr4[bArr3[2][c]] >>> 8) & 255] ^ (iArr3[iArr4[bArr3[0][c]] >>> 24] ^ iArr5[(iArr4[bArr3[c][c]] >>> 16) & 255])) ^ iArr7[iArr4[bArr3[3][c]] & 255]) ^ iArr8[i4 + 1];
            int i11 = (((iArr5[(iArr4[bArr3[c][2]] >>> 16) & 255] ^ iArr3[iArr4[bArr3[0][2]] >>> 24]) ^ iArr6[(iArr4[bArr3[2][2]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][2]] & 255]) ^ iArr8[i4 + 2];
            iArr4[0] = i9;
            iArr4[1] = i10;
            iArr4[2] = i11;
            iArr4[3] = (((iArr3[iArr4[bArr3[0][3]] >>> 24] ^ iArr5[(iArr4[bArr3[1][3]] >>> 16) & 255]) ^ iArr6[(iArr4[bArr3[2][3]] >>> 8) & 255]) ^ iArr7[iArr4[bArr3[3][3]] & 255]) ^ iArr8[i4 + 3];
            i3++;
            i4 += 4;
            c = 1;
        }
        int[] iArr9 = this.setUnboundedRipple;
        int i12 = iArr9[i4];
        byte[] bArr4 = setY;
        int[] iArr10 = this.setLayoutAnimation;
        byte[][] bArr5 = this.setOnLongClickListener;
        bArr2[0] = (byte) (bArr4[iArr10[bArr5[0][0]] >>> 24] ^ (i12 >>> 24));
        bArr2[1] = (byte) (bArr4[(iArr10[bArr5[1][0]] >>> 16) & 255] ^ (i12 >>> 16));
        bArr2[2] = (byte) (bArr4[(iArr10[bArr5[2][0]] >>> 8) & 255] ^ (i12 >>> 8));
        bArr2[3] = (byte) (i12 ^ bArr4[iArr10[bArr5[3][0]] & 255]);
        int i13 = iArr9[i4 + 1];
        bArr2[4] = (byte) (bArr4[iArr10[bArr5[0][1]] >>> 24] ^ (i13 >>> 24));
        bArr2[5] = (byte) (bArr4[(iArr10[bArr5[1][1]] >>> 16) & 255] ^ (i13 >>> 16));
        bArr2[6] = (byte) (bArr4[(iArr10[bArr5[2][1]] >>> 8) & 255] ^ (i13 >>> 8));
        bArr2[7] = (byte) (i13 ^ bArr4[iArr10[bArr5[3][1]] & 255]);
        int i14 = iArr9[i4 + 2];
        bArr2[8] = (byte) (bArr4[iArr10[bArr5[0][2]] >>> 24] ^ (i14 >>> 24));
        bArr2[9] = (byte) (bArr4[(iArr10[bArr5[1][2]] >>> 16) & 255] ^ (i14 >>> 16));
        bArr2[10] = (byte) (bArr4[(iArr10[bArr5[2][2]] >>> 8) & 255] ^ (i14 >>> 8));
        bArr2[11] = (byte) (i14 ^ bArr4[iArr10[bArr5[3][2]] & 255]);
        int i15 = iArr9[i4 + 3];
        bArr2[12] = (byte) (bArr4[iArr10[bArr5[0][3]] >>> 24] ^ (i15 >>> 24));
        bArr2[13] = (byte) (bArr4[(iArr10[bArr5[1][3]] >>> 16) & 255] ^ (i15 >>> 16));
        bArr2[14] = (byte) (bArr4[(iArr10[bArr5[2][3]] >>> 8) & 255] ^ (i15 >>> 8));
        bArr2[15] = (byte) (i15 ^ bArr4[iArr10[bArr5[3][3]] & 255]);
    }
}