package o;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class xB implements InterfaceC0607xr {
    public final C0602xo MenuHostHelper$$ExternalSyntheticLambda1;
    public final xJ setIconTintList;
    public boolean setX;

    public xB(xJ xJVar) {
        pN.setY(xJVar, "");
        this.setIconTintList = xJVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new C0602xo();
    }

    @Override // o.InterfaceC0607xr
    public final C0602xo setNavigationOnClickListener() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.InterfaceC0607xr
    public final String setTextAlignment() {
        return setX(Long.MAX_VALUE);
    }

    @Override // o.InterfaceC0607xr
    public final long MenuHostHelper$$ExternalSyntheticLambda1(C0610xu c0610xu) {
        pN.setY(c0610xu, "");
        pN.setY(c0610xu, "");
        if (!(!this.setX)) {
            throw new IllegalStateException("closed".toString());
        }
        long j = 0;
        while (true) {
            long y = this.MenuHostHelper$$ExternalSyntheticLambda1.setY(c0610xu, j);
            if (y != -1) {
                return y;
            }
            long j2 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
            if (this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1) {
                return -1L;
            }
            j = Math.max(j, j2);
        }
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends InputStream {
        setIconTintList() {
        }

        @Override // java.io.InputStream
        public final int read() {
            if (xB.this.setX) {
                throw new IOException("closed");
            }
            if (xB.this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 == 0 && xB.this.setIconTintList.setY(xB.this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1) {
                return -1;
            }
            return xB.this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple() & 255;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) {
            pN.setY(bArr, "");
            if (xB.this.setX) {
                throw new IOException("closed");
            }
            C0601xn.setIconTintList(bArr.length, i, i2);
            if (xB.this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 == 0 && xB.this.setIconTintList.setY(xB.this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1) {
                return -1;
            }
            return xB.this.MenuHostHelper$$ExternalSyntheticLambda1.setX(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public final int available() {
            if (xB.this.setX) {
                throw new IOException("closed");
            }
            return (int) Math.min(xB.this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            xB.this.close();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(xB.this);
            sb.append(".inputStream()");
            return sb.toString();
        }
    }

    @Override // o.InterfaceC0607xr
    public final InputStream setOnLongClickListener() {
        return new setIconTintList();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.setX;
    }

    @Override // o.xJ
    public final long setY(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (true ^ this.setX) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 == 0 && this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1) {
                return -1L;
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setY(c0602xo, Math.min(j, this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    @Override // o.InterfaceC0607xr
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        if (!this.setX) {
            return ((this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 > 0L ? 1 : (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 == 0L ? 0 : -1)) == 0) && this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o.InterfaceC0607xr
    public final void setUiOptions(long j) {
        if (!setY(j)) {
            throw new EOFException();
        }
    }

    @Override // o.InterfaceC0607xr
    public final boolean setY(long j) {
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (!(!this.setX)) {
            throw new IllegalStateException("closed".toString());
        } else {
            while (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 < j) {
                if (this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1) {
                    return false;
                }
            }
            return true;
        }
    }

    @Override // o.InterfaceC0607xr
    public final int MenuHostHelper$$ExternalSyntheticLambda0(C0612xw c0612xw) {
        pN.setY(c0612xw, "");
        if (!this.setX) {
            while (true) {
                int MenuHostHelper$$ExternalSyntheticLambda1 = xN.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1, c0612xw, true);
                if (MenuHostHelper$$ExternalSyntheticLambda1 == -2) {
                    if (this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1) {
                        break;
                    }
                } else if (MenuHostHelper$$ExternalSyntheticLambda1 != -1) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener(c0612xw.setIconTintList[MenuHostHelper$$ExternalSyntheticLambda1].MenuHostHelper$$ExternalSyntheticLambda0());
                    return MenuHostHelper$$ExternalSyntheticLambda1;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o.InterfaceC0607xr
    public final byte[] setUiOptions() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.setY(this.setIconTintList);
        C0602xo c0602xo = this.MenuHostHelper$$ExternalSyntheticLambda1;
        return c0602xo.setIconTintList(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        pN.setY(byteBuffer, "");
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 == 0 && this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1) {
            return -1;
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1.read(byteBuffer);
    }

    @Override // o.InterfaceC0607xr
    public final long setIconTintList(xK xKVar) {
        pN.setY(xKVar, "");
        long j = 0;
        while (this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) != -1) {
            long MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                j += MenuHostHelper$$ExternalSyntheticLambda0;
                xKVar.a_(this.MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
            long j2 = j + this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
            C0602xo c0602xo = this.MenuHostHelper$$ExternalSyntheticLambda1;
            xKVar.a_(c0602xo, c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
            return j2;
        }
        return j;
    }

    @Override // o.InterfaceC0607xr
    public final String setX(long j) {
        if (!(j >= 0)) {
            StringBuilder sb = new StringBuilder("limit < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
        long y = setY((byte) 10, 0L, j2);
        if (y != -1) {
            return xN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, y);
        }
        if (j2 < Long.MAX_VALUE && setY(j2) && this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(j2 - 1) == 13 && setY(1 + j2) && this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(j2) == 10) {
            return xN.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, j2);
        }
        C0602xo c0602xo = new C0602xo();
        C0602xo c0602xo2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        c0602xo2.setX(c0602xo, 0L, Math.min(32L, c0602xo2.MenuHostHelper$$ExternalSyntheticLambda0));
        StringBuilder sb2 = new StringBuilder("\\n not found: limit=");
        sb2.append(Math.min(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0, j));
        sb2.append(" content=");
        sb2.append(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0).setIconTintList());
        sb2.append("…");
        throw new EOFException(sb2.toString());
    }

    @Override // o.InterfaceC0607xr
    public final void setOnLongClickListener(long j) {
        if (!(!this.setX)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j > 0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 == 0 && this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0);
            this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener(min);
            j -= min;
        }
    }

    public final long setY(byte b, long j, long j2) {
        if (!this.setX) {
            if (!(j2 >= 0)) {
                StringBuilder sb = new StringBuilder("fromIndex=");
                sb.append(0L);
                sb.append(" toIndex=");
                sb.append(j2);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            while (j < j2) {
                long MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(b, j, j2);
                if (MenuHostHelper$$ExternalSyntheticLambda1 != -1) {
                    return MenuHostHelper$$ExternalSyntheticLambda1;
                }
                long j3 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                if (j3 >= j2 || this.setIconTintList.setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 8192L) == -1) {
                    return -1L;
                }
                j = Math.max(j, j3);
            }
            return -1L;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.setX) {
            return;
        }
        this.setX = true;
        this.setIconTintList.close();
        C0602xo c0602xo = this.MenuHostHelper$$ExternalSyntheticLambda1;
        c0602xo.setOnLongClickListener(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    @Override // o.xJ
    public final xI setX() {
        return this.setIconTintList.setX();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.setIconTintList);
        sb.append(')');
        return sb.toString();
    }

    @Override // o.InterfaceC0607xr
    public final boolean setIconTintList(long j, C0610xu c0610xu) {
        int i;
        pN.setY(c0610xu, "");
        int MenuHostHelper$$ExternalSyntheticLambda0 = c0610xu.MenuHostHelper$$ExternalSyntheticLambda0();
        pN.setY(c0610xu, "");
        if (!(!this.setX)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j >= 0 && MenuHostHelper$$ExternalSyntheticLambda0 >= 0 && c0610xu.MenuHostHelper$$ExternalSyntheticLambda0() >= MenuHostHelper$$ExternalSyntheticLambda0) {
            while (i < MenuHostHelper$$ExternalSyntheticLambda0) {
                long j2 = i + j;
                i = (setY(1 + j2) && this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(j2) == c0610xu.setY(i)) ? i + 1 : 0;
            }
            return true;
        }
        return false;
    }

    @Override // o.InterfaceC0607xr
    public final byte setUnboundedRipple() {
        if (setY(1L)) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple();
        }
        throw new EOFException();
    }

    @Override // o.InterfaceC0607xr
    public final byte[] setIconTintList(long j) {
        if (setY(j)) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(j);
        }
        throw new EOFException();
    }

    @Override // o.InterfaceC0607xr
    public final C0610xu MenuHostHelper$$ExternalSyntheticLambda0(long j) {
        if (setY(j)) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(j);
        }
        throw new EOFException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
        if (r9 == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
        r0 = new java.lang.StringBuilder("Expected leading [0-9] or '-' character but was 0x");
        r1 = java.lang.Integer.toString(r8, o.qK.MenuHostHelper$$ExternalSyntheticLambda1(o.qK.MenuHostHelper$$ExternalSyntheticLambda1(16)));
        o.pN.MenuHostHelper$$ExternalSyntheticLambda0((java.lang.Object) r1, "");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0056, code lost:
        throw new java.lang.NumberFormatException(r0.toString());
     */
    @Override // o.InterfaceC0607xr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long setLayoutAnimation() {
        /*
            r10 = this;
            r0 = 1
            boolean r2 = r10.setY(r0)
            if (r2 == 0) goto L5e
            r2 = 0
            r4 = r2
        Lb:
            long r6 = r4 + r0
            boolean r8 = r10.setY(r6)
            if (r8 == 0) goto L57
            o.xo r8 = r10.MenuHostHelper$$ExternalSyntheticLambda1
            byte r8 = r8.MenuHostHelper$$ExternalSyntheticLambda1(r4)
            r9 = 48
            if (r8 < r9) goto L21
            r9 = 57
            if (r8 <= r9) goto L29
        L21:
            int r9 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r9 != 0) goto L2b
            r4 = 45
            if (r8 != r4) goto L2b
        L29:
            r4 = r6
            goto Lb
        L2b:
            if (r9 == 0) goto L2e
            goto L57
        L2e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9] or '-' character but was 0x"
            r0.<init>(r1)
            r1 = 16
            int r1 = o.qK.MenuHostHelper$$ExternalSyntheticLambda1(r1)
            int r1 = o.qK.MenuHostHelper$$ExternalSyntheticLambda1(r1)
            java.lang.String r1 = java.lang.Integer.toString(r8, r1)
            java.lang.String r2 = ""
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r1, r2)
            r0.append(r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L57:
            o.xo r0 = r10.MenuHostHelper$$ExternalSyntheticLambda1
            long r0 = r0.setLayoutAnimation()
            return r0
        L5e:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xB.setLayoutAnimation():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
        r0 = new java.lang.StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
        r1 = java.lang.Integer.toString(r2, o.qK.MenuHostHelper$$ExternalSyntheticLambda1(o.qK.MenuHostHelper$$ExternalSyntheticLambda1(16)));
        o.pN.MenuHostHelper$$ExternalSyntheticLambda0((java.lang.Object) r1, "");
        r0.append(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
        throw new java.lang.NumberFormatException(r0.toString());
     */
    @Override // o.InterfaceC0607xr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long setChipCornerRadius() {
        /*
            r5 = this;
            r0 = 1
            boolean r0 = r5.setY(r0)
            if (r0 == 0) goto L66
            r0 = 0
        L9:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r5.setY(r2)
            if (r2 == 0) goto L5f
            o.xo r2 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            long r3 = (long) r0
            byte r2 = r2.MenuHostHelper$$ExternalSyntheticLambda1(r3)
            r3 = 48
            if (r2 < r3) goto L21
            r3 = 57
            if (r2 <= r3) goto L31
        L21:
            r3 = 97
            if (r2 < r3) goto L29
            r3 = 102(0x66, float:1.43E-43)
            if (r2 <= r3) goto L31
        L29:
            r3 = 65
            if (r2 < r3) goto L33
            r3 = 70
            if (r2 > r3) goto L33
        L31:
            r0 = r1
            goto L9
        L33:
            if (r0 == 0) goto L36
            goto L5f
        L36:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            r1 = 16
            int r1 = o.qK.MenuHostHelper$$ExternalSyntheticLambda1(r1)
            int r1 = o.qK.MenuHostHelper$$ExternalSyntheticLambda1(r1)
            java.lang.String r1 = java.lang.Integer.toString(r2, r1)
            java.lang.String r2 = ""
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r1, r2)
            r0.append(r1)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        L5f:
            o.xo r0 = r5.MenuHostHelper$$ExternalSyntheticLambda1
            long r0 = r0.setChipCornerRadius()
            return r0
        L66:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.xB.setChipCornerRadius():long");
    }

    @Override // o.InterfaceC0607xr
    public final int setIconSize() {
        if (setY(4L)) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setIconSize();
        }
        throw new EOFException();
    }

    @Override // o.InterfaceC0607xr
    public final short ViewPager$SavedState$1() {
        if (setY(2L)) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1();
        }
        throw new EOFException();
    }
}