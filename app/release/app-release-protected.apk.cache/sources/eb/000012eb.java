package o;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class xD implements InterfaceC0606xq {
    private boolean setIconTintList;
    private C0602xo setX;
    private xK setY;

    public xD(xK xKVar) {
        pN.setY(xKVar, "");
        this.setY = xKVar;
        this.setX = new C0602xo();
    }

    @Override // o.InterfaceC0606xq
    public final C0602xo setNavigationOnClickListener() {
        return this.setX;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        pN.setY(byteBuffer, "");
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        int write = this.setX.write(byteBuffer);
        setIconTintList();
        return write;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.setIconTintList;
    }

    @Override // o.xK
    public final void a_(C0602xo c0602xo, long j) {
        pN.setY(c0602xo, "");
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        this.setX.a_(c0602xo, j);
        setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq setY(C0610xu c0610xu) {
        pN.setY(c0610xu, "");
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        C0602xo c0602xo = this.setX;
        pN.setY(c0610xu, "");
        c0610xu.MenuHostHelper$$ExternalSyntheticLambda0(c0602xo, 0, c0610xu.MenuHostHelper$$ExternalSyntheticLambda0());
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq setIconTintList(String str) {
        pN.setY(str, "");
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        C0602xo c0602xo = this.setX;
        pN.setY(str, "");
        c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(str, 0, str.length());
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq MenuHostHelper$$ExternalSyntheticLambda0(String str, int i, int i2) {
        pN.setY(str, "");
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(str, i, i2);
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr) {
        pN.setY(bArr, "");
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        C0602xo c0602xo = this.setX;
        pN.setY(bArr, "");
        c0602xo.setY(bArr, 0, bArr.length);
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq setY(byte[] bArr, int i, int i2) {
        pN.setY(bArr, "");
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        this.setX.setY(bArr, i, i2);
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(i);
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq setLayoutAnimation(int i) {
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        this.setX.setLayoutAnimation(i);
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq setIconTintList(int i) {
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        this.setX.setIconTintList(i);
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq setLayoutAnimation(long j) {
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        this.setX.setLayoutAnimation(j);
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq setChipCornerRadius(long j) {
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        this.setX.setChipCornerRadius(j);
        return setIconTintList();
    }

    @Override // o.InterfaceC0606xq
    public final InterfaceC0606xq setIconTintList() {
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        long MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
            this.setY.a_(this.setX, MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return this;
    }

    @Override // o.InterfaceC0606xq, o.xK, java.io.Flushable
    public final void flush() {
        if (!(!this.setIconTintList)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
            xK xKVar = this.setY;
            C0602xo c0602xo = this.setX;
            xKVar.a_(c0602xo, c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        this.setY.flush();
    }

    @Override // o.xK, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.setIconTintList) {
            return;
        }
        Throwable th = null;
        try {
            if (this.setX.MenuHostHelper$$ExternalSyntheticLambda0 > 0) {
                xK xKVar = this.setY;
                C0602xo c0602xo = this.setX;
                xKVar.a_(c0602xo, c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.setY.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.setIconTintList = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // o.xK
    public final xI setX() {
        return this.setY.setX();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("buffer(");
        sb.append(this.setY);
        sb.append(')');
        return sb.toString();
    }
}