package o;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: o.xo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0602xo implements InterfaceC0607xr, InterfaceC0606xq, Cloneable, ByteChannel {
    public long MenuHostHelper$$ExternalSyntheticLambda0;
    public xE MenuHostHelper$$ExternalSyntheticLambda1;

    @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // o.InterfaceC0606xq, o.xK, java.io.Flushable
    public final void flush() {
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // o.InterfaceC0607xr
    public final C0602xo setNavigationOnClickListener() {
        return this;
    }

    @Override // o.InterfaceC0606xq
    public final /* synthetic */ InterfaceC0606xq MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr) {
        pN.setY(bArr, "");
        return setY(bArr, 0, bArr.length);
    }

    @Override // o.InterfaceC0606xq
    public final /* bridge */ /* synthetic */ InterfaceC0606xq setIconTintList() {
        return this;
    }

    @Override // o.InterfaceC0606xq
    public final /* synthetic */ InterfaceC0606xq setIconTintList(String str) {
        pN.setY(str, "");
        return MenuHostHelper$$ExternalSyntheticLambda0(str, 0, str.length());
    }

    @Override // o.InterfaceC0606xq
    public final /* synthetic */ InterfaceC0606xq setY(C0610xu c0610xu) {
        pN.setY(c0610xu, "");
        c0610xu.MenuHostHelper$$ExternalSyntheticLambda0(this, 0, c0610xu.MenuHostHelper$$ExternalSyntheticLambda0());
        return this;
    }

    /* renamed from: o.xo$setX */
    /* loaded from: classes.dex */
    public static final class setX extends OutputStream {
        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
        }

        public setX() {
        }

        @Override // java.io.OutputStream
        public final void write(int i) {
            C0602xo.this.MenuHostHelper$$ExternalSyntheticLambda0(i);
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i, int i2) {
            pN.setY(bArr, "");
            C0602xo.this.setY(bArr, i, i2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C0602xo.this);
            sb.append(".outputStream()");
            return sb.toString();
        }
    }

    @Override // o.InterfaceC0607xr
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0 == 0;
    }

    @Override // o.InterfaceC0607xr
    public final void setUiOptions(long j) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 < j) {
            throw new EOFException();
        }
    }

    @Override // o.InterfaceC0607xr
    public final boolean setY(long j) {
        return this.MenuHostHelper$$ExternalSyntheticLambda0 >= j;
    }

    /* renamed from: o.xo$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends InputStream {
        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        public setIconTintList() {
        }

        @Override // java.io.InputStream
        public final int read() {
            if (C0602xo.this.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                return C0602xo.this.setUnboundedRipple() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            pN.setY(bArr, "");
            return C0602xo.this.setX(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int available() {
            return (int) Math.min(C0602xo.this.MenuHostHelper$$ExternalSyntheticLambda0, 2147483647L);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C0602xo.this);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    @Override // o.InterfaceC0607xr
    public final InputStream setOnLongClickListener() {
        return new setIconTintList();
    }

    public final int setCenterIfNoTextEnabled() {
        int iconSize = setIconSize();
        return ((iconSize & 65280) << 8) | (((-16777216) & iconSize) >>> 24) | ((16711680 & iconSize) >>> 8) | ((iconSize & 255) << 24);
    }

    public final String setY(long j, Charset charset) {
        pN.setY(charset, "");
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (!(i >= 0 && j <= 2147483647L)) {
            StringBuilder sb = new StringBuilder("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.MenuHostHelper$$ExternalSyntheticLambda0 >= j) {
            if (i == 0) {
                return "";
            }
            xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setX(xEVar);
            if (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j > xEVar.setIconTintList) {
                return new String(setIconTintList(j), charset);
            }
            int i2 = (int) j;
            String str = new String(xEVar.MenuHostHelper$$ExternalSyntheticLambda0, xEVar.MenuHostHelper$$ExternalSyntheticLambda1, i2, charset);
            xEVar.MenuHostHelper$$ExternalSyntheticLambda1 += i2;
            this.MenuHostHelper$$ExternalSyntheticLambda0 -= j;
            if (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 == xEVar.setIconTintList) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0();
                xC.setIconTintList(xEVar);
            }
            return str;
        } else {
            throw new EOFException();
        }
    }

    @Override // o.InterfaceC0607xr
    public final String setTextAlignment() {
        return setX(Long.MAX_VALUE);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        pN.setY(byteBuffer, "");
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (xEVar != null) {
            int min = Math.min(byteBuffer.remaining(), xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1);
            byteBuffer.put(xEVar.MenuHostHelper$$ExternalSyntheticLambda0, xEVar.MenuHostHelper$$ExternalSyntheticLambda1, min);
            xEVar.MenuHostHelper$$ExternalSyntheticLambda1 += min;
            this.MenuHostHelper$$ExternalSyntheticLambda0 -= min;
            if (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 == xEVar.setIconTintList) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0();
                xC.setIconTintList(xEVar);
            }
            return min;
        }
        return -1;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        pN.setY(byteBuffer, "");
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            xE x = setX(1);
            int min = Math.min(i, 8192 - x.setIconTintList);
            byteBuffer.get(x.MenuHostHelper$$ExternalSyntheticLambda0, x.setIconTintList, min);
            i -= min;
            x.setIconTintList += min;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 += remaining;
        return remaining;
    }

    @Override // o.InterfaceC0607xr
    public final long MenuHostHelper$$ExternalSyntheticLambda1(C0610xu c0610xu) {
        pN.setY(c0610xu, "");
        return setY(c0610xu, 0L);
    }

    @Override // o.xJ
    public final xI setX() {
        return xI.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.InterfaceC0607xr
    public final int MenuHostHelper$$ExternalSyntheticLambda0(C0612xw c0612xw) {
        int MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(c0612xw, "");
        MenuHostHelper$$ExternalSyntheticLambda1 = xN.MenuHostHelper$$ExternalSyntheticLambda1(this, c0612xw, false);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
            return -1;
        }
        setOnLongClickListener(c0612xw.setIconTintList[MenuHostHelper$$ExternalSyntheticLambda1].MenuHostHelper$$ExternalSyntheticLambda0());
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.InterfaceC0607xr
    public final String setX(long j) {
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder("limit < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j2 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1((byte) 10, 0L, j2);
        if (MenuHostHelper$$ExternalSyntheticLambda1 != -1) {
            return xN.setX(this, MenuHostHelper$$ExternalSyntheticLambda1);
        }
        if (j2 < this.MenuHostHelper$$ExternalSyntheticLambda0 && MenuHostHelper$$ExternalSyntheticLambda1(j2 - 1) == 13 && MenuHostHelper$$ExternalSyntheticLambda1(j2) == 10) {
            return xN.setX(this, j2);
        }
        C0602xo c0602xo = new C0602xo();
        setX(c0602xo, 0L, Math.min(32L, this.MenuHostHelper$$ExternalSyntheticLambda0));
        StringBuilder sb2 = new StringBuilder("\\n not found: limit=");
        sb2.append(Math.min(this.MenuHostHelper$$ExternalSyntheticLambda0, j));
        sb2.append(" content=");
        sb2.append(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0).setIconTintList());
        sb2.append((char) 8230);
        throw new EOFException(sb2.toString());
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr) {
        pN.setY(bArr, "");
        int i = 0;
        while (i < bArr.length) {
            int x = setX(bArr, i, bArr.length - i);
            if (x == -1) {
                throw new EOFException();
            }
            i += x;
        }
    }

    public final int setX(byte[] bArr, int i, int i2) {
        pN.setY(bArr, "");
        C0601xn.setIconTintList(bArr.length, i, i2);
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (xEVar != null) {
            int min = Math.min(i2, xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1);
            byte[] bArr2 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
            int i3 = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setY(bArr2, "");
            pN.setY(bArr, "");
            System.arraycopy(bArr2, i3, bArr, i, (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + min) - i3);
            xEVar.MenuHostHelper$$ExternalSyntheticLambda1 += min;
            this.MenuHostHelper$$ExternalSyntheticLambda0 -= min;
            if (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 == xEVar.setIconTintList) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0();
                xC.setIconTintList(xEVar);
                return min;
            }
            return min;
        }
        return -1;
    }

    @Override // o.InterfaceC0607xr
    public final void setOnLongClickListener(long j) {
        while (j > 0) {
            xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (xEVar == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1);
            long j2 = min;
            this.MenuHostHelper$$ExternalSyntheticLambda0 -= j2;
            j -= j2;
            xEVar.MenuHostHelper$$ExternalSyntheticLambda1 += min;
            if (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 == xEVar.setIconTintList) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0();
                xC.setIconTintList(xEVar);
            }
        }
    }

    @Override // o.InterfaceC0606xq
    /* renamed from: setX */
    public final C0602xo MenuHostHelper$$ExternalSyntheticLambda0(String str, int i, int i2) {
        pN.setY(str, "");
        if (!(i >= 0)) {
            StringBuilder sb = new StringBuilder("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (!(i2 >= i)) {
            StringBuilder sb2 = new StringBuilder("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (!(i2 <= str.length())) {
            StringBuilder sb3 = new StringBuilder("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                xE x = setX(1);
                byte[] bArr = x.MenuHostHelper$$ExternalSyntheticLambda0;
                int i3 = x.setIconTintList - i;
                int min = Math.min(i2, 8192 - i3);
                bArr[i + i3] = (byte) charAt;
                i++;
                while (i < min) {
                    char charAt2 = str.charAt(i);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i + i3] = (byte) charAt2;
                    i++;
                }
                int i4 = (i3 + i) - x.setIconTintList;
                x.setIconTintList += i4;
                this.MenuHostHelper$$ExternalSyntheticLambda0 += i4;
            } else {
                if (charAt < 2048) {
                    xE x2 = setX(2);
                    x2.MenuHostHelper$$ExternalSyntheticLambda0[x2.setIconTintList] = (byte) ((charAt >> 6) | 192);
                    x2.MenuHostHelper$$ExternalSyntheticLambda0[x2.setIconTintList + 1] = (byte) ((charAt & '?') | 128);
                    x2.setIconTintList += 2;
                    this.MenuHostHelper$$ExternalSyntheticLambda0 += 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    xE x3 = setX(3);
                    x3.MenuHostHelper$$ExternalSyntheticLambda0[x3.setIconTintList] = (byte) ((charAt >> '\f') | 224);
                    x3.MenuHostHelper$$ExternalSyntheticLambda0[x3.setIconTintList + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                    x3.MenuHostHelper$$ExternalSyntheticLambda0[x3.setIconTintList + 2] = (byte) ((charAt & '?') | 128);
                    x3.setIconTintList += 3;
                    this.MenuHostHelper$$ExternalSyntheticLambda0 += 3;
                } else {
                    int i5 = i + 1;
                    char charAt3 = i5 < i2 ? str.charAt(i5) : (char) 0;
                    if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                        MenuHostHelper$$ExternalSyntheticLambda0(63);
                        i = i5;
                    } else {
                        int i6 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 65536;
                        xE x4 = setX(4);
                        x4.MenuHostHelper$$ExternalSyntheticLambda0[x4.setIconTintList] = (byte) ((i6 >> 18) | 240);
                        x4.MenuHostHelper$$ExternalSyntheticLambda0[x4.setIconTintList + 1] = (byte) (((i6 >> 12) & 63) | 128);
                        x4.MenuHostHelper$$ExternalSyntheticLambda0[x4.setIconTintList + 2] = (byte) (((i6 >> 6) & 63) | 128);
                        x4.MenuHostHelper$$ExternalSyntheticLambda0[x4.setIconTintList + 3] = (byte) ((i6 & 63) | 128);
                        x4.setIconTintList += 4;
                        this.MenuHostHelper$$ExternalSyntheticLambda0 += 4;
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public final C0602xo setNavigationOnClickListener(int i) {
        if (i < 128) {
            MenuHostHelper$$ExternalSyntheticLambda0(i);
        } else if (i < 2048) {
            xE x = setX(2);
            x.MenuHostHelper$$ExternalSyntheticLambda0[x.setIconTintList] = (byte) ((i >> 6) | 192);
            x.MenuHostHelper$$ExternalSyntheticLambda0[x.setIconTintList + 1] = (byte) ((i & 63) | 128);
            x.setIconTintList += 2;
            this.MenuHostHelper$$ExternalSyntheticLambda0 += 2;
        } else if (55296 <= i && 57343 >= i) {
            MenuHostHelper$$ExternalSyntheticLambda0(63);
        } else if (i < 65536) {
            xE x2 = setX(3);
            x2.MenuHostHelper$$ExternalSyntheticLambda0[x2.setIconTintList] = (byte) ((i >> 12) | 224);
            x2.MenuHostHelper$$ExternalSyntheticLambda0[x2.setIconTintList + 1] = (byte) (((i >> 6) & 63) | 128);
            x2.MenuHostHelper$$ExternalSyntheticLambda0[x2.setIconTintList + 2] = (byte) ((i & 63) | 128);
            x2.setIconTintList += 3;
            this.MenuHostHelper$$ExternalSyntheticLambda0 += 3;
        } else if (i <= 1114111) {
            xE x3 = setX(4);
            x3.MenuHostHelper$$ExternalSyntheticLambda0[x3.setIconTintList] = (byte) ((i >> 18) | 240);
            x3.MenuHostHelper$$ExternalSyntheticLambda0[x3.setIconTintList + 1] = (byte) (((i >> 12) & 63) | 128);
            x3.MenuHostHelper$$ExternalSyntheticLambda0[x3.setIconTintList + 2] = (byte) (((i >> 6) & 63) | 128);
            x3.MenuHostHelper$$ExternalSyntheticLambda0[x3.setIconTintList + 3] = (byte) ((i & 63) | 128);
            x3.setIconTintList += 4;
            this.MenuHostHelper$$ExternalSyntheticLambda0 += 4;
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
            sb.append(C0601xn.setIconTintList(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    @Override // o.InterfaceC0606xq
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
    public final C0602xo setY(byte[] bArr, int i, int i2) {
        pN.setY(bArr, "");
        long j = i2;
        C0601xn.setIconTintList(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            xE x = setX(1);
            int min = Math.min(i3 - i, 8192 - x.setIconTintList);
            byte[] bArr2 = x.MenuHostHelper$$ExternalSyntheticLambda0;
            int i4 = x.setIconTintList;
            int i5 = i + min;
            pN.setY(bArr, "");
            pN.setY(bArr2, "");
            System.arraycopy(bArr, i, bArr2, i4, i5 - i);
            x.setIconTintList += min;
            i = i5;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 += j;
        return this;
    }

    public final long setY(xJ xJVar) {
        pN.setY(xJVar, "");
        long j = 0;
        while (true) {
            long y = xJVar.setY(this, 8192L);
            if (y == -1) {
                return j;
            }
            j += y;
        }
    }

    @Override // o.InterfaceC0606xq
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
    public final C0602xo MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        xE x = setX(1);
        byte[] bArr = x.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = x.setIconTintList;
        x.setIconTintList = i2 + 1;
        bArr[i2] = (byte) i;
        this.MenuHostHelper$$ExternalSyntheticLambda0++;
        return this;
    }

    @Override // o.InterfaceC0606xq
    /* renamed from: setUiOptions */
    public final C0602xo setLayoutAnimation(int i) {
        xE x = setX(2);
        byte[] bArr = x.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = x.setIconTintList;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 8);
        bArr[i3] = (byte) i;
        x.setIconTintList = i3 + 1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 += 2;
        return this;
    }

    @Override // o.InterfaceC0606xq
    /* renamed from: setY */
    public final C0602xo setIconTintList(int i) {
        xE x = setX(4);
        byte[] bArr = x.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = x.setIconTintList;
        int i3 = i2 + 1;
        bArr[i2] = (byte) (i >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i >>> 8);
        bArr[i5] = (byte) i;
        x.setIconTintList = i5 + 1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 += 4;
        return this;
    }

    @Override // o.InterfaceC0606xq
    /* renamed from: setUnboundedRipple */
    public final C0602xo setLayoutAnimation(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return MenuHostHelper$$ExternalSyntheticLambda0(48);
        }
        boolean z = false;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                pN.setY("-9223372036854775808", "");
                return MenuHostHelper$$ExternalSyntheticLambda0("-9223372036854775808", 0, 20);
            }
            z = true;
        }
        int i2 = j < 100000000 ? j < 10000 ? j < 100 ? j >= 10 ? 2 : 1 : j < 1000 ? 3 : 4 : j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8 : j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        if (z) {
            i2++;
        }
        xE x = setX(i2);
        byte[] bArr = x.MenuHostHelper$$ExternalSyntheticLambda0;
        int i3 = x.setIconTintList + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = xN.setIconTintList()[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        x.setIconTintList += i2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 += i2;
        return this;
    }

    @Override // o.InterfaceC0606xq
    /* renamed from: setNavigationOnClickListener */
    public final C0602xo setChipCornerRadius(long j) {
        if (j == 0) {
            return MenuHostHelper$$ExternalSyntheticLambda0(48);
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        xE x = setX(i);
        byte[] bArr = x.MenuHostHelper$$ExternalSyntheticLambda0;
        int i2 = x.setIconTintList;
        for (int i3 = (x.setIconTintList + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = xN.setIconTintList()[(int) (15 & j)];
            j >>>= 4;
        }
        x.setIconTintList += i;
        this.MenuHostHelper$$ExternalSyntheticLambda0 += i;
        return this;
    }

    public final xE setX(int i) {
        if (!(i > 0 && i <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (xEVar == null) {
            xE iconTintList = xC.setIconTintList();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = iconTintList;
            iconTintList.setUiOptions = iconTintList;
            iconTintList.setY = iconTintList;
            return iconTintList;
        }
        pN.setX(xEVar);
        xE xEVar2 = xEVar.setUiOptions;
        pN.setX(xEVar2);
        return (xEVar2.setIconTintList + i > 8192 || !xEVar2.setX) ? xEVar2.setY(xC.setIconTintList()) : xEVar2;
    }

    public final long setY(C0610xu c0610xu, long j) {
        int i;
        int i2;
        long j2 = j;
        pN.setY(c0610xu, "");
        long j3 = 0;
        if (!(j2 >= 0)) {
            StringBuilder sb = new StringBuilder("fromIndex < 0: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (xEVar != null) {
            long j4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (j4 - j2 < j2) {
                while (j4 > j2) {
                    xEVar = xEVar.setUiOptions;
                    pN.setX(xEVar);
                    j4 -= xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                }
                if (xEVar != null) {
                    if (c0610xu.MenuHostHelper$$ExternalSyntheticLambda0() != 2) {
                        byte[] x = c0610xu.setX();
                        while (j4 < this.MenuHostHelper$$ExternalSyntheticLambda0) {
                            byte[] bArr = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
                            i = (int) ((xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j2) - j4);
                            int i3 = xEVar.setIconTintList;
                            while (i < i3) {
                                byte b = bArr[i];
                                for (byte b2 : x) {
                                    if (b == b2) {
                                        i2 = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                                    }
                                }
                                i++;
                            }
                            j4 += xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                            xEVar = xEVar.setY;
                            pN.setX(xEVar);
                            j2 = j4;
                        }
                        return -1L;
                    }
                    byte y = c0610xu.setY(0);
                    byte y2 = c0610xu.setY(1);
                    while (j4 < this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        byte[] bArr2 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
                        i = (int) ((xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j2) - j4);
                        int i4 = xEVar.setIconTintList;
                        while (i < i4) {
                            byte b3 = bArr2[i];
                            if (b3 != y && b3 != y2) {
                                i++;
                            }
                            i2 = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                        }
                        j4 += xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                        xEVar = xEVar.setY;
                        pN.setX(xEVar);
                        j2 = j4;
                    }
                    return -1L;
                }
                return -1L;
            }
            while (true) {
                long j5 = (xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1) + j3;
                if (j5 > j2) {
                    break;
                }
                xEVar = xEVar.setY;
                pN.setX(xEVar);
                j3 = j5;
            }
            if (xEVar != null) {
                if (c0610xu.MenuHostHelper$$ExternalSyntheticLambda0() != 2) {
                    byte[] x2 = c0610xu.setX();
                    j4 = j3;
                    while (j4 < this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        byte[] bArr3 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
                        i = (int) ((xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j2) - j4);
                        int i5 = xEVar.setIconTintList;
                        while (i < i5) {
                            byte b4 = bArr3[i];
                            for (byte b5 : x2) {
                                if (b4 == b5) {
                                    i2 = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                                }
                            }
                            i++;
                        }
                        j4 += xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                        xEVar = xEVar.setY;
                        pN.setX(xEVar);
                        j2 = j4;
                    }
                    return -1L;
                }
                byte y3 = c0610xu.setY(0);
                byte y4 = c0610xu.setY(1);
                j4 = j3;
                while (j4 < this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    byte[] bArr4 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    i = (int) ((xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j2) - j4);
                    int i6 = xEVar.setIconTintList;
                    while (i < i6) {
                        byte b6 = bArr4[i];
                        if (b6 != y3 && b6 != y4) {
                            i++;
                        }
                        i2 = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                    }
                    j4 += xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                    xEVar = xEVar.setY;
                    pN.setX(xEVar);
                    j2 = j4;
                }
                return -1L;
            }
            return -1L;
            return (i - i2) + j4;
        }
        return -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0602xo) {
            long j = this.MenuHostHelper$$ExternalSyntheticLambda0;
            C0602xo c0602xo = (C0602xo) obj;
            if (j == c0602xo.MenuHostHelper$$ExternalSyntheticLambda0) {
                if (j == 0) {
                    return true;
                }
                xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setX(xEVar);
                xE xEVar2 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setX(xEVar2);
                int i = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                int i2 = xEVar2.MenuHostHelper$$ExternalSyntheticLambda1;
                long j2 = 0;
                while (j2 < this.MenuHostHelper$$ExternalSyntheticLambda0) {
                    long min = Math.min(xEVar.setIconTintList - i, xEVar2.setIconTintList - i2);
                    long j3 = 0;
                    while (j3 < min) {
                        if (xEVar.MenuHostHelper$$ExternalSyntheticLambda0[i] == xEVar2.MenuHostHelper$$ExternalSyntheticLambda0[i2]) {
                            j3++;
                            i++;
                            i2++;
                        }
                    }
                    if (i == xEVar.setIconTintList) {
                        xEVar = xEVar.setY;
                        pN.setX(xEVar);
                        i = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                    }
                    if (i2 == xEVar2.setIconTintList) {
                        xEVar2 = xEVar2.setY;
                        pN.setX(xEVar2);
                        i2 = xEVar2.MenuHostHelper$$ExternalSyntheticLambda1;
                    }
                    j2 += min;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (xEVar != null) {
            int i = 1;
            do {
                int i2 = xEVar.setIconTintList;
                for (int i3 = xEVar.MenuHostHelper$$ExternalSyntheticLambda1; i3 < i2; i3++) {
                    i = (i * 31) + xEVar.MenuHostHelper$$ExternalSyntheticLambda0[i3];
                }
                xEVar = xEVar.setY;
                pN.setX(xEVar);
            } while (xEVar != this.MenuHostHelper$$ExternalSyntheticLambda1);
            return i;
        }
        return 0;
    }

    /* renamed from: setY */
    public final C0602xo clone() {
        C0602xo c0602xo = new C0602xo();
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
            xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setX(xEVar);
            xEVar.setUnboundedRipple = true;
            xE xEVar2 = new xE(xEVar.MenuHostHelper$$ExternalSyntheticLambda0, xEVar.MenuHostHelper$$ExternalSyntheticLambda1, xEVar.setIconTintList, true);
            c0602xo.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar2;
            xEVar2.setUiOptions = xEVar2;
            xEVar2.setY = xEVar2.setUiOptions;
            for (xE xEVar3 = xEVar.setY; xEVar3 != xEVar; xEVar3 = xEVar3.setY) {
                xE xEVar4 = xEVar2.setUiOptions;
                pN.setX(xEVar4);
                pN.setX(xEVar3);
                xEVar3.setUnboundedRipple = true;
                xEVar4.setY(new xE(xEVar3.MenuHostHelper$$ExternalSyntheticLambda0, xEVar3.MenuHostHelper$$ExternalSyntheticLambda1, xEVar3.setIconTintList, true));
            }
            c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return c0602xo;
    }

    private C0610xu setUnboundedRipple(int i) {
        if (i == 0) {
            return C0610xu.setY;
        }
        C0601xn.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, 0L, i);
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            pN.setX(xEVar);
            if (xEVar.setIconTintList == xEVar.MenuHostHelper$$ExternalSyntheticLambda1) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
            i4++;
            xEVar = xEVar.setY;
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 << 1];
        xE xEVar2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i5 = 0;
        while (i2 < i) {
            pN.setX(xEVar2);
            bArr[i5] = xEVar2.MenuHostHelper$$ExternalSyntheticLambda0;
            i2 += xEVar2.setIconTintList - xEVar2.MenuHostHelper$$ExternalSyntheticLambda1;
            iArr[i5] = Math.min(i2, i);
            iArr[bArr.length + i5] = xEVar2.MenuHostHelper$$ExternalSyntheticLambda1;
            xEVar2.setUnboundedRipple = true;
            i5++;
            xEVar2 = xEVar2.setY;
        }
        return new xH(bArr, iArr);
    }

    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        long j = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (j != 0) {
            xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setX(xEVar);
            xE xEVar2 = xEVar.setUiOptions;
            pN.setX(xEVar2);
            return (xEVar2.setIconTintList >= 8192 || !xEVar2.setX) ? j : j - (xEVar2.setIconTintList - xEVar2.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        return 0L;
    }

    public final C0602xo setX(C0602xo c0602xo, long j, long j2) {
        pN.setY(c0602xo, "");
        C0601xn.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, j, j2);
        if (j2 != 0) {
            c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 += j2;
            xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
            while (true) {
                pN.setX(xEVar);
                if (j < xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1) {
                    break;
                }
                j -= xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                xEVar = xEVar.setY;
            }
            while (j2 > 0) {
                pN.setX(xEVar);
                xEVar.setUnboundedRipple = true;
                xE xEVar2 = new xE(xEVar.MenuHostHelper$$ExternalSyntheticLambda0, xEVar.MenuHostHelper$$ExternalSyntheticLambda1, xEVar.setIconTintList, true);
                xEVar2.MenuHostHelper$$ExternalSyntheticLambda1 += (int) j;
                xEVar2.setIconTintList = Math.min(xEVar2.MenuHostHelper$$ExternalSyntheticLambda1 + ((int) j2), xEVar2.setIconTintList);
                xE xEVar3 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
                if (xEVar3 == null) {
                    xEVar2.setUiOptions = xEVar2;
                    xEVar2.setY = xEVar2.setUiOptions;
                    c0602xo.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar2.setY;
                } else {
                    pN.setX(xEVar3);
                    xE xEVar4 = xEVar3.setUiOptions;
                    pN.setX(xEVar4);
                    xEVar4.setY(xEVar2);
                }
                j2 -= xEVar2.setIconTintList - xEVar2.MenuHostHelper$$ExternalSyntheticLambda1;
                xEVar = xEVar.setY;
                j = 0;
            }
        }
        return this;
    }

    public final byte MenuHostHelper$$ExternalSyntheticLambda1(long j) {
        C0601xn.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, j, 1L);
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (xEVar == null) {
            xE xEVar2 = null;
            pN.setX((Object) null);
            byte[] bArr = xEVar2.MenuHostHelper$$ExternalSyntheticLambda0;
            throw null;
        }
        long j2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (j2 - j < j) {
            while (j2 > j) {
                xEVar = xEVar.setUiOptions;
                pN.setX(xEVar);
                j2 -= xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
            }
            pN.setX(xEVar);
            return xEVar.MenuHostHelper$$ExternalSyntheticLambda0[(int) ((xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            long j4 = (xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1) + j3;
            if (j4 > j) {
                pN.setX(xEVar);
                return xEVar.MenuHostHelper$$ExternalSyntheticLambda0[(int) ((xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j) - j3)];
            }
            xEVar = xEVar.setY;
            pN.setX(xEVar);
            j3 = j4;
        }
    }

    public final long MenuHostHelper$$ExternalSyntheticLambda1(byte b, long j, long j2) {
        xE xEVar;
        int i;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (!(0 <= j3 && j4 >= j3)) {
            StringBuilder sb = new StringBuilder("size=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            sb.append(" fromIndex=");
            sb.append(j3);
            sb.append(" toIndex=");
            sb.append(j4);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (j4 > j6) {
            j4 = j6;
        }
        if (j3 != j4 && (xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1) != null) {
            long j7 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (j7 - j3 < j3) {
                while (j7 > j3) {
                    xEVar = xEVar.setUiOptions;
                    pN.setX(xEVar);
                    j7 -= xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                }
                if (xEVar != null) {
                    while (j7 < j4) {
                        byte[] bArr = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
                        int min = (int) Math.min(xEVar.setIconTintList, (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j4) - j7);
                        i = (int) ((xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j3) - j7);
                        while (i < min) {
                            if (bArr[i] == b) {
                                return (i - xEVar.MenuHostHelper$$ExternalSyntheticLambda1) + j7;
                            }
                            i++;
                        }
                        j7 += xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                        xEVar = xEVar.setY;
                        pN.setX(xEVar);
                        j3 = j7;
                    }
                }
            } else {
                while (true) {
                    long j8 = (xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1) + j5;
                    if (j8 > j3) {
                        break;
                    }
                    xEVar = xEVar.setY;
                    pN.setX(xEVar);
                    j5 = j8;
                }
                if (xEVar != null) {
                    j7 = j5;
                    while (j7 < j4) {
                        byte[] bArr2 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
                        int min2 = (int) Math.min(xEVar.setIconTintList, (xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j4) - j7);
                        i = (int) ((xEVar.MenuHostHelper$$ExternalSyntheticLambda1 + j3) - j7);
                        while (i < min2) {
                            if (bArr2[i] == b) {
                                return (i - xEVar.MenuHostHelper$$ExternalSyntheticLambda1) + j7;
                            }
                            i++;
                        }
                        j7 += xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                        xEVar = xEVar.setY;
                        pN.setX(xEVar);
                        j3 = j7;
                    }
                }
            }
        }
        return -1L;
    }

    @Override // o.InterfaceC0607xr
    public final boolean setIconTintList(long j, C0610xu c0610xu) {
        pN.setY(c0610xu, "");
        int MenuHostHelper$$ExternalSyntheticLambda0 = c0610xu.MenuHostHelper$$ExternalSyntheticLambda0();
        pN.setY(c0610xu, "");
        if (j < 0 || MenuHostHelper$$ExternalSyntheticLambda0 < 0 || this.MenuHostHelper$$ExternalSyntheticLambda0 - j < MenuHostHelper$$ExternalSyntheticLambda0 || c0610xu.MenuHostHelper$$ExternalSyntheticLambda0() < MenuHostHelper$$ExternalSyntheticLambda0) {
            return false;
        }
        for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda0; i++) {
            if (MenuHostHelper$$ExternalSyntheticLambda1(i + j) != c0610xu.setY(i)) {
                return false;
            }
        }
        return true;
    }

    @Override // o.xJ
    public final long setY(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (j2 == 0) {
            return -1L;
        }
        if (j > j2) {
            j = j2;
        }
        c0602xo.a_(this, j);
        return j;
    }

    @Override // o.InterfaceC0607xr
    public final long setIconTintList(xK xKVar) {
        pN.setY(xKVar, "");
        long j = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (j > 0) {
            xKVar.a_(this, j);
        }
        return j;
    }

    @Override // o.InterfaceC0607xr
    public final byte setUnboundedRipple() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            throw new EOFException();
        }
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(xEVar);
        int i = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
        int i2 = xEVar.setIconTintList;
        int i3 = i + 1;
        byte b = xEVar.MenuHostHelper$$ExternalSyntheticLambda0[i];
        this.MenuHostHelper$$ExternalSyntheticLambda0--;
        if (i3 == i2) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0();
            xC.setIconTintList(xEVar);
        } else {
            xEVar.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
        }
        return b;
    }

    @Override // o.InterfaceC0607xr
    public final byte[] setUiOptions() {
        return setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    @Override // o.InterfaceC0607xr
    public final byte[] setIconTintList(long j) {
        if (!(j >= 0 && j <= 2147483647L)) {
            StringBuilder sb = new StringBuilder("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.MenuHostHelper$$ExternalSyntheticLambda0 < j) {
            throw new EOFException();
        } else {
            byte[] bArr = new byte[(int) j];
            MenuHostHelper$$ExternalSyntheticLambda1(bArr);
            return bArr;
        }
    }

    @Override // o.InterfaceC0607xr
    public final C0610xu MenuHostHelper$$ExternalSyntheticLambda0(long j) {
        if (!(j >= 0 && j <= 2147483647L)) {
            StringBuilder sb = new StringBuilder("byteCount: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (this.MenuHostHelper$$ExternalSyntheticLambda0 >= j) {
            if (j >= 4096) {
                C0610xu unboundedRipple = setUnboundedRipple((int) j);
                setOnLongClickListener(j);
                return unboundedRipple;
            }
            return new C0610xu(setIconTintList(j));
        } else {
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be A[EDGE_INSN: B:48:0x00be->B:40:0x00be ?: BREAK  , SYNTHETIC] */
    @Override // o.InterfaceC0607xr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long setLayoutAnimation() {
        /*
            Method dump skipped, instructions count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0602xo.setLayoutAnimation():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[EDGE_INSN: B:41:0x00a9->B:36:0x00a9 ?: BREAK  , SYNTHETIC] */
    @Override // o.InterfaceC0607xr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long setChipCornerRadius() {
        /*
            r15 = this;
            long r0 = r15.MenuHostHelper$$ExternalSyntheticLambda0
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb0
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            o.xE r6 = r15.MenuHostHelper$$ExternalSyntheticLambda1
            o.pN.setX(r6)
            byte[] r7 = r6.MenuHostHelper$$ExternalSyntheticLambda0
            int r8 = r6.MenuHostHelper$$ExternalSyntheticLambda1
            int r9 = r6.setIconTintList
        L16:
            if (r8 >= r9) goto L95
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3c
        L25:
            r11 = 65
            r12 = 97
            if (r10 < r12) goto L32
            r13 = 102(0x66, float:1.43E-43)
            if (r10 > r13) goto L32
            r11 = 97
            goto L38
        L32:
            if (r10 < r11) goto L77
            r12 = 70
            if (r10 > r12) goto L77
        L38:
            int r11 = r10 - r11
            int r11 = r11 + 10
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4c:
            o.xo r0 = new o.xo
            r0.<init>()
            o.xo r0 = r0.setChipCornerRadius(r4)
            o.xo r0 = r0.MenuHostHelper$$ExternalSyntheticLambda0(r10)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            long r2 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            java.nio.charset.Charset r4 = o.qQ.setIconTintList
            java.lang.String r0 = r0.setY(r2, r4)
            r1.append(r0)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L77:
            if (r0 == 0) goto L7b
            r1 = 1
            goto L95
        L7b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = o.C0601xn.MenuHostHelper$$ExternalSyntheticLambda0(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L95:
            if (r8 != r9) goto La1
            o.xE r7 = r6.MenuHostHelper$$ExternalSyntheticLambda0()
            r15.MenuHostHelper$$ExternalSyntheticLambda1 = r7
            o.xC.setIconTintList(r6)
            goto La3
        La1:
            r6.MenuHostHelper$$ExternalSyntheticLambda1 = r8
        La3:
            if (r1 != 0) goto La9
            o.xE r6 = r15.MenuHostHelper$$ExternalSyntheticLambda1
            if (r6 != 0) goto Lb
        La9:
            long r1 = r15.MenuHostHelper$$ExternalSyntheticLambda0
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.MenuHostHelper$$ExternalSyntheticLambda0 = r1
            return r4
        Lb0:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0602xo.setChipCornerRadius():long");
    }

    @Override // o.InterfaceC0607xr
    public final int setIconSize() {
        int i;
        int i2;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 < 4) {
            throw new EOFException();
        }
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(xEVar);
        int i3 = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
        int i4 = xEVar.setIconTintList;
        if (i4 - i3 < 4) {
            i = ((setUnboundedRipple() & 255) << 24) | ((setUnboundedRipple() & 255) << 16) | ((setUnboundedRipple() & 255) << 8);
            i2 = setUnboundedRipple() & 255;
        } else {
            byte[] bArr = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            int i6 = i5 + 1;
            byte b2 = bArr[i5];
            int i7 = i6 + 1;
            byte b3 = bArr[i6];
            int i8 = i7 + 1;
            byte b4 = bArr[i7];
            this.MenuHostHelper$$ExternalSyntheticLambda0 -= 4;
            if (i8 == i4) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0();
                xC.setIconTintList(xEVar);
            } else {
                xEVar.MenuHostHelper$$ExternalSyntheticLambda1 = i8;
            }
            i = ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
            i2 = b4 & 255;
        }
        return i | i2;
    }

    @Override // o.InterfaceC0607xr
    public final short ViewPager$SavedState$1() {
        int i;
        int i2;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 < 2) {
            throw new EOFException();
        }
        xE xEVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(xEVar);
        int i3 = xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
        int i4 = xEVar.setIconTintList;
        if (i4 - i3 < 2) {
            i = (setUnboundedRipple() & 255) << 8;
            i2 = setUnboundedRipple() & 255;
        } else {
            byte[] bArr = xEVar.MenuHostHelper$$ExternalSyntheticLambda0;
            int i5 = i3 + 1;
            byte b = bArr[i3];
            int i6 = i5 + 1;
            byte b2 = bArr[i5];
            this.MenuHostHelper$$ExternalSyntheticLambda0 -= 2;
            if (i6 == i4) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar.MenuHostHelper$$ExternalSyntheticLambda0();
                xC.setIconTintList(xEVar);
            } else {
                xEVar.MenuHostHelper$$ExternalSyntheticLambda1 = i6;
            }
            i = (b & 255) << 8;
            i2 = b2 & 255;
        }
        return (short) (i | i2);
    }

    public final String toString() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 <= 2147483647L) {
            return setUnboundedRipple((int) this.MenuHostHelper$$ExternalSyntheticLambda0).toString();
        }
        StringBuilder sb = new StringBuilder("size > Int.MAX_VALUE: ");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        throw new IllegalStateException(sb.toString().toString());
    }

    @Override // o.xK
    public final void a_(C0602xo c0602xo, long j) {
        xE xEVar;
        xE xEVar2;
        pN.setY(c0602xo, "");
        if (!(c0602xo != this)) {
            throw new IllegalArgumentException("source == this".toString());
        }
        C0601xn.setIconTintList(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0, 0L, j);
        while (j > 0) {
            xE xEVar3 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setX(xEVar3);
            int i = xEVar3.setIconTintList;
            pN.setX(c0602xo.MenuHostHelper$$ExternalSyntheticLambda1);
            if (j < i - xEVar.MenuHostHelper$$ExternalSyntheticLambda1) {
                xE xEVar4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (xEVar4 != null) {
                    pN.setX(xEVar4);
                    xEVar2 = xEVar4.setUiOptions;
                } else {
                    xEVar2 = null;
                }
                if (xEVar2 != null && xEVar2.setX) {
                    if ((xEVar2.setIconTintList + j) - (xEVar2.setUnboundedRipple ? 0 : xEVar2.MenuHostHelper$$ExternalSyntheticLambda1) <= 8192) {
                        xE xEVar5 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
                        pN.setX(xEVar5);
                        xEVar5.MenuHostHelper$$ExternalSyntheticLambda0(xEVar2, (int) j);
                        c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 -= j;
                        this.MenuHostHelper$$ExternalSyntheticLambda0 += j;
                        return;
                    }
                }
                xE xEVar6 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
                pN.setX(xEVar6);
                c0602xo.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar6.setY((int) j);
            }
            xE xEVar7 = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setX(xEVar7);
            long j2 = xEVar7.setIconTintList - xEVar7.MenuHostHelper$$ExternalSyntheticLambda1;
            c0602xo.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar7.MenuHostHelper$$ExternalSyntheticLambda0();
            xE xEVar8 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (xEVar8 == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = xEVar7;
                xEVar7.setUiOptions = xEVar7;
                xEVar7.setY = xEVar7.setUiOptions;
            } else {
                pN.setX(xEVar8);
                xE xEVar9 = xEVar8.setUiOptions;
                pN.setX(xEVar9);
                xEVar9.setY(xEVar7).setY();
            }
            c0602xo.MenuHostHelper$$ExternalSyntheticLambda0 -= j2;
            this.MenuHostHelper$$ExternalSyntheticLambda0 += j2;
            j -= j2;
        }
    }
}