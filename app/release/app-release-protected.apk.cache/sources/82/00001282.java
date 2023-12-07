package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class wG implements Closeable {
    static final Logger setIconTintList;
    final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    final wA$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1;
    int setUiOptions;
    final InterfaceC0606xq setUnboundedRipple;
    boolean setX;
    final C0602xo setY;

    public wG(InterfaceC0606xq interfaceC0606xq, boolean z) {
        pN.setY(interfaceC0606xq, "");
        this.setUnboundedRipple = interfaceC0606xq;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        C0602xo c0602xo = new C0602xo();
        this.setY = c0602xo;
        this.setUiOptions = 16384;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new wA$MenuHostHelper$$ExternalSyntheticLambda0(c0602xo);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        synchronized (this) {
            if (this.setX) {
                throw new IOException("closed");
            }
            this.setUnboundedRipple.flush();
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, EnumC0584wx enumC0584wx) {
        synchronized (this) {
            pN.setY(enumC0584wx, "");
            if (this.setX) {
                throw new IOException("closed");
            }
            if (!(enumC0584wx.setUnboundedRipple != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            MenuHostHelper$$ExternalSyntheticLambda1(i, 4, 3, 0);
            this.setUnboundedRipple.setIconTintList(enumC0584wx.setUnboundedRipple);
            this.setUnboundedRipple.flush();
        }
    }

    public final void setY(boolean z, int i, C0602xo c0602xo, int i2) {
        synchronized (this) {
            if (this.setX) {
                throw new IOException("closed");
            }
            setIconTintList(i, z ? 1 : 0, c0602xo, i2);
        }
    }

    private void setIconTintList(int i, int i2, C0602xo c0602xo, int i3) {
        MenuHostHelper$$ExternalSyntheticLambda1(i, i3, 0, i2);
        if (i3 > 0) {
            InterfaceC0606xq interfaceC0606xq = this.setUnboundedRipple;
            pN.setX(c0602xo);
            interfaceC0606xq.a_(c0602xo, i3);
        }
    }

    public final void setY(boolean z, int i, int i2) {
        synchronized (this) {
            if (this.setX) {
                throw new IOException("closed");
            }
            MenuHostHelper$$ExternalSyntheticLambda1(0, 8, 6, z ? 1 : 0);
            this.setUnboundedRipple.setIconTintList(i);
            this.setUnboundedRipple.setIconTintList(i2);
            this.setUnboundedRipple.flush();
        }
    }

    public final void setY(int i, EnumC0584wx enumC0584wx, byte[] bArr) {
        synchronized (this) {
            pN.setY(enumC0584wx, "");
            pN.setY(bArr, "");
            if (this.setX) {
                throw new IOException("closed");
            }
            if (!(enumC0584wx.setUnboundedRipple != -1)) {
                throw new IllegalArgumentException("errorCode.httpCode == -1".toString());
            }
            MenuHostHelper$$ExternalSyntheticLambda1(0, bArr.length + 8, 7, 0);
            this.setUnboundedRipple.setIconTintList(i);
            this.setUnboundedRipple.setIconTintList(enumC0584wx.setUnboundedRipple);
            if (!(bArr.length == 0)) {
                this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(bArr);
            }
            this.setUnboundedRipple.flush();
        }
    }

    public final void setIconTintList(int i, long j) {
        synchronized (this) {
            if (this.setX) {
                throw new IOException("closed");
            }
            if (!(j != 0 && j <= 2147483647L)) {
                StringBuilder sb = new StringBuilder("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            }
            MenuHostHelper$$ExternalSyntheticLambda1(i, 4, 8, 0);
            this.setUnboundedRipple.setIconTintList((int) j);
            this.setUnboundedRipple.flush();
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, int i3, int i4) {
        Logger logger = setIconTintList;
        if (logger.isLoggable(Level.FINE)) {
            C0586wz c0586wz = C0586wz.setX;
            logger.fine(C0586wz.setY(false, i, i2, i3, i4));
        }
        if (!(i2 <= this.setUiOptions)) {
            StringBuilder sb = new StringBuilder("FRAME_SIZE_ERROR length > ");
            sb.append(this.setUiOptions);
            sb.append(": ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (!((Integer.MIN_VALUE & i) == 0)) {
            StringBuilder sb2 = new StringBuilder("reserved bit set: ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        vL.setX(this.setUnboundedRipple, i2);
        this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(i3 & 255);
        this.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0(i4 & 255);
        this.setUnboundedRipple.setIconTintList(i & Integer.MAX_VALUE);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.setX = true;
            this.setUnboundedRipple.close();
        }
    }

    static {
        new wG$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
        setIconTintList = Logger.getLogger(C0586wz.class.getName());
    }
}