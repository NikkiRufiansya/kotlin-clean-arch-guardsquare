package o;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import o.C0555vx;
import o.C0577wq;
import o.vJ;

/* renamed from: o.wv  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0582wv implements InterfaceC0574wn {
    private final vD MenuHostHelper$$ExternalSyntheticLambda0;
    public final InterfaceC0606xq MenuHostHelper$$ExternalSyntheticLambda1;
    private final C0580wt setIconTintList;
    private C0557vz setNavigationOnClickListener;
    private int setOnLongClickListener;
    private final InterfaceC0607xr setX;
    final C0563wd setY;

    static {
        new setIconTintList((byte) 0);
    }

    public C0582wv(vD vDVar, C0563wd c0563wd, InterfaceC0607xr interfaceC0607xr, InterfaceC0606xq interfaceC0606xq) {
        pN.setY(c0563wd, "");
        pN.setY(interfaceC0607xr, "");
        pN.setY(interfaceC0606xq, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = vDVar;
        this.setY = c0563wd;
        this.setX = interfaceC0607xr;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0606xq;
        this.setIconTintList = new C0580wt(interfaceC0607xr);
    }

    @Override // o.InterfaceC0574wn
    public final C0563wd setIconTintList() {
        return this.setY;
    }

    @Override // o.InterfaceC0574wn
    public final void setY(vE vEVar) {
        pN.setY(vEVar, "");
        C0579ws c0579ws = C0579ws.MenuHostHelper$$ExternalSyntheticLambda1;
        Proxy.Type type = this.setY.ViewPager$SavedState$1.setX.type();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) type, "");
        setX(vEVar.setY, C0579ws.setX(vEVar, type));
    }

    @Override // o.InterfaceC0574wn
    public final long setX(vJ vJVar) {
        pN.setY(vJVar, "");
        if (C0573wm.setIconTintList(vJVar)) {
            if ("chunked".equalsIgnoreCase(vJ.setY(vJVar, "Transfer-Encoding"))) {
                return -1L;
            }
            return vL.MenuHostHelper$$ExternalSyntheticLambda0(vJVar);
        }
        return 0L;
    }

    @Override // o.InterfaceC0574wn
    public final xJ MenuHostHelper$$ExternalSyntheticLambda1(vJ vJVar) {
        pN.setY(vJVar, "");
        if (C0573wm.setIconTintList(vJVar)) {
            if (!"chunked".equalsIgnoreCase(vJ.setY(vJVar, "Transfer-Encoding"))) {
                long MenuHostHelper$$ExternalSyntheticLambda0 = vL.MenuHostHelper$$ExternalSyntheticLambda0(vJVar);
                if (MenuHostHelper$$ExternalSyntheticLambda0 != -1) {
                    return setX(MenuHostHelper$$ExternalSyntheticLambda0);
                }
                return setX();
            }
            final C0555vx c0555vx = vJVar.setCenterIfNoTextEnabled.setLayoutAnimation;
            if (!(this.setOnLongClickListener == 4)) {
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(this.setOnLongClickListener);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.setOnLongClickListener = 5;
            return new wv$MenuHostHelper$$ExternalSyntheticLambda0(this, c0555vx) { // from class: o.wv$MenuHostHelper$$ExternalSyntheticLambda1
                private long MenuHostHelper$$ExternalSyntheticLambda0;
                private boolean MenuHostHelper$$ExternalSyntheticLambda1;
                private final C0555vx setIconTintList;
                private /* synthetic */ C0582wv setX;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this);
                    pN.setY(c0555vx, "");
                    this.setX = this;
                    this.setIconTintList = c0555vx;
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = -1L;
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                }

                @Override // o.wv$MenuHostHelper$$ExternalSyntheticLambda0, o.xJ
                public final long setY(C0602xo c0602xo, long j) {
                    InterfaceC0607xr interfaceC0607xr;
                    InterfaceC0607xr interfaceC0607xr2;
                    C0580wt c0580wt;
                    vD vDVar;
                    C0557vz c0557vz;
                    InterfaceC0607xr interfaceC0607xr3;
                    pN.setY(c0602xo, "");
                    if (!(j >= 0)) {
                        StringBuilder sb2 = new StringBuilder("byteCount < 0: ");
                        sb2.append(j);
                        throw new IllegalArgumentException(sb2.toString().toString());
                    } else if (!(!MenuHostHelper$$ExternalSyntheticLambda0())) {
                        throw new IllegalStateException("closed".toString());
                    } else {
                        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                            long j2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                            if (j2 == 0 || j2 == -1) {
                                if (this.MenuHostHelper$$ExternalSyntheticLambda0 != -1) {
                                    interfaceC0607xr3 = this.setX.setX;
                                    interfaceC0607xr3.setTextAlignment();
                                }
                                try {
                                    interfaceC0607xr = this.setX.setX;
                                    this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0607xr.setChipCornerRadius();
                                    interfaceC0607xr2 = this.setX.setX;
                                    String textAlignment = interfaceC0607xr2.setTextAlignment();
                                    if (textAlignment == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                    String obj = qR.MenuHostHelper$$ExternalSyntheticLambda0((CharSequence) textAlignment).toString();
                                    if (this.MenuHostHelper$$ExternalSyntheticLambda0 >= 0) {
                                        if (!(obj.length() > 0) || qR.setX(obj, ";", false)) {
                                            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
                                                this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
                                                C0582wv c0582wv = this.setX;
                                                c0580wt = c0582wv.setIconTintList;
                                                c0582wv.setNavigationOnClickListener = c0580wt.MenuHostHelper$$ExternalSyntheticLambda1();
                                                vDVar = this.setX.MenuHostHelper$$ExternalSyntheticLambda0;
                                                pN.setX(vDVar);
                                                InterfaceC0548vr interfaceC0548vr = vDVar.setUiOptions;
                                                C0555vx c0555vx2 = this.setIconTintList;
                                                c0557vz = this.setX.setNavigationOnClickListener;
                                                pN.setX(c0557vz);
                                                C0573wm.MenuHostHelper$$ExternalSyntheticLambda0(interfaceC0548vr, c0555vx2, c0557vz);
                                                setY();
                                            }
                                            if (!this.MenuHostHelper$$ExternalSyntheticLambda1) {
                                                return -1L;
                                            }
                                        }
                                    }
                                    StringBuilder sb3 = new StringBuilder("expected chunk size and optional extensions but was \"");
                                    sb3.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
                                    sb3.append(obj);
                                    sb3.append('\"');
                                    throw new ProtocolException(sb3.toString());
                                } catch (NumberFormatException e) {
                                    throw new ProtocolException(e.getMessage());
                                }
                            }
                            long y = super.setY(c0602xo, Math.min(j, this.MenuHostHelper$$ExternalSyntheticLambda0));
                            if (y != -1) {
                                this.MenuHostHelper$$ExternalSyntheticLambda0 -= y;
                                return y;
                            }
                            C0563wd c0563wd = this.setX.setY;
                            synchronized (c0563wd) {
                                c0563wd.setLayoutAnimation = true;
                            }
                            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                            setY();
                            throw protocolException;
                        }
                        return -1L;
                    }
                }

                @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    if (MenuHostHelper$$ExternalSyntheticLambda0()) {
                        return;
                    }
                    if (this.MenuHostHelper$$ExternalSyntheticLambda1 && !vL.setX(this, TimeUnit.MILLISECONDS)) {
                        C0563wd c0563wd = this.setX.setY;
                        synchronized (c0563wd) {
                            c0563wd.setLayoutAnimation = true;
                        }
                        setY();
                    }
                    MenuHostHelper$$ExternalSyntheticLambda1();
                }
            };
        }
        return setX(0L);
    }

    @Override // o.InterfaceC0574wn
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.flush();
    }

    @Override // o.InterfaceC0574wn
    public final void setY() {
        this.MenuHostHelper$$ExternalSyntheticLambda1.flush();
    }

    public final void setX(C0557vz c0557vz, String str) {
        pN.setY(c0557vz, "");
        pN.setY(str, "");
        if (!(this.setOnLongClickListener == 0)) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.setOnLongClickListener);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(str).setIconTintList("\r\n");
        int length = c0557vz.setIconTintList.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(c0557vz.setIconTintList[i2]).setIconTintList(": ").setIconTintList(c0557vz.setIconTintList[i2 + 1]).setIconTintList("\r\n");
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("\r\n");
        this.setOnLongClickListener = 1;
    }

    @Override // o.InterfaceC0574wn
    public final vJ.setIconTintList setIconTintList(boolean z) {
        int i = this.setOnLongClickListener;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (!z2) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.setOnLongClickListener);
            throw new IllegalStateException(sb.toString().toString());
        }
        try {
            C0577wq.setIconTintList seticontintlist = C0577wq.setIconTintList;
            C0580wt c0580wt = this.setIconTintList;
            String x = c0580wt.setIconTintList.setX(c0580wt.setY);
            c0580wt.setY -= x.length();
            C0577wq x2 = C0577wq.setIconTintList.setX(x);
            vJ.setIconTintList seticontintlist2 = new vJ.setIconTintList();
            vB vBVar = x2.setX;
            pN.setY(vBVar, "");
            vJ.setIconTintList seticontintlist3 = seticontintlist2;
            seticontintlist2.setLayoutAnimation = vBVar;
            vJ.setIconTintList seticontintlist4 = seticontintlist2;
            seticontintlist2.setIconTintList = x2.MenuHostHelper$$ExternalSyntheticLambda1;
            String str = x2.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY(str, "");
            vJ.setIconTintList seticontintlist5 = seticontintlist2;
            seticontintlist2.setUnboundedRipple = str;
            vJ.setIconTintList x3 = seticontintlist2.setX(this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1());
            if (z && x2.MenuHostHelper$$ExternalSyntheticLambda1 == 100) {
                return null;
            }
            if (x2.MenuHostHelper$$ExternalSyntheticLambda1 == 100) {
                this.setOnLongClickListener = 3;
                return x3;
            }
            this.setOnLongClickListener = 4;
            return x3;
        } catch (EOFException e) {
            C0555vx.setIconTintList y = this.setY.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.setY("/...");
            pN.setX(y);
            String obj = y.MenuHostHelper$$ExternalSyntheticLambda0("").MenuHostHelper$$ExternalSyntheticLambda1("").setY().toString();
            StringBuilder sb2 = new StringBuilder("unexpected end of stream on ");
            sb2.append(obj);
            throw new IOException(sb2.toString(), e);
        }
    }

    public final xJ setX(long j) {
        if (!(this.setOnLongClickListener == 4)) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.setOnLongClickListener);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.setOnLongClickListener = 5;
        return new setY(j);
    }

    private final xJ setX() {
        if (!(this.setOnLongClickListener == 4)) {
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.setOnLongClickListener);
            throw new IllegalStateException(sb.toString().toString());
        }
        this.setOnLongClickListener = 5;
        C0563wd c0563wd = this.setY;
        synchronized (c0563wd) {
            c0563wd.setLayoutAnimation = true;
        }
        return new setOnLongClickListener();
    }

    /* renamed from: o.wv$setLayoutAnimation */
    /* loaded from: classes.dex */
    final class setLayoutAnimation implements xK {
        private final C0611xv MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setX;

        public setLayoutAnimation() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new C0611xv(C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.setX());
        }

        @Override // o.xK
        public final xI setX() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        @Override // o.xK
        public final void a_(C0602xo c0602xo, long j) {
            pN.setY(c0602xo, "");
            if (!(!this.setX)) {
                throw new IllegalStateException("closed".toString());
            }
            vL.MenuHostHelper$$ExternalSyntheticLambda1(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0, 0L, j);
            C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.a_(c0602xo, j);
        }

        @Override // o.xK, java.io.Flushable
        public final void flush() {
            if (this.setX) {
                return;
            }
            C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.flush();
        }

        @Override // o.xK, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.setX) {
                return;
            }
            this.setX = true;
            C0582wv.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1);
            C0582wv.this.setOnLongClickListener = 3;
        }
    }

    /* renamed from: o.wv$setX */
    /* loaded from: classes.dex */
    final class setX implements xK {
        private final C0611xv MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setY;

        public setX() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new C0611xv(C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.setX());
        }

        @Override // o.xK
        public final xI setX() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        @Override // o.xK
        public final void a_(C0602xo c0602xo, long j) {
            pN.setY(c0602xo, "");
            if (!(!this.setY)) {
                throw new IllegalStateException("closed".toString());
            }
            if (j == 0) {
                return;
            }
            C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius(j);
            C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("\r\n");
            C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.a_(c0602xo, j);
            C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("\r\n");
        }

        @Override // o.xK, java.io.Flushable
        public final void flush() {
            synchronized (this) {
                if (this.setY) {
                    return;
                }
                C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.flush();
            }
        }

        @Override // o.xK, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            synchronized (this) {
                if (this.setY) {
                    return;
                }
                this.setY = true;
                C0582wv.this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList("0\r\n\r\n");
                C0582wv.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1);
                C0582wv.this.setOnLongClickListener = 3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.wv$setY */
    /* loaded from: classes.dex */
    public final class setY extends wv$MenuHostHelper$$ExternalSyntheticLambda0 {
        private long MenuHostHelper$$ExternalSyntheticLambda0;

        public setY(long j) {
            super(C0582wv.this);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
            if (j == 0) {
                setY();
            }
        }

        @Override // o.wv$MenuHostHelper$$ExternalSyntheticLambda0, o.xJ
        public final long setY(C0602xo c0602xo, long j) {
            pN.setY(c0602xo, "");
            if (!(j >= 0)) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (!(!MenuHostHelper$$ExternalSyntheticLambda0())) {
                throw new IllegalStateException("closed".toString());
            } else {
                long j2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (j2 == 0) {
                    return -1L;
                }
                long y = super.setY(c0602xo, Math.min(j2, j));
                if (y != -1) {
                    long j3 = this.MenuHostHelper$$ExternalSyntheticLambda0 - y;
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = j3;
                    if (j3 == 0) {
                        setY();
                    }
                    return y;
                }
                C0563wd c0563wd = C0582wv.this.setY;
                synchronized (c0563wd) {
                    c0563wd.setLayoutAnimation = true;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                setY();
                throw protocolException;
            }
        }

        @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (MenuHostHelper$$ExternalSyntheticLambda0()) {
                return;
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 != 0 && !vL.setX(this, TimeUnit.MILLISECONDS)) {
                C0563wd c0563wd = C0582wv.this.setY;
                synchronized (c0563wd) {
                    c0563wd.setLayoutAnimation = true;
                }
                setY();
            }
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.wv$setOnLongClickListener */
    /* loaded from: classes.dex */
    public final class setOnLongClickListener extends wv$MenuHostHelper$$ExternalSyntheticLambda0 {
        private boolean setX;

        public setOnLongClickListener() {
            super(C0582wv.this);
        }

        @Override // o.wv$MenuHostHelper$$ExternalSyntheticLambda0, o.xJ
        public final long setY(C0602xo c0602xo, long j) {
            pN.setY(c0602xo, "");
            if (!(j >= 0)) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString().toString());
            } else if (!(!MenuHostHelper$$ExternalSyntheticLambda0())) {
                throw new IllegalStateException("closed".toString());
            } else {
                if (this.setX) {
                    return -1L;
                }
                long y = super.setY(c0602xo, j);
                if (y == -1) {
                    this.setX = true;
                    setY();
                    return -1L;
                }
                return y;
            }
        }

        @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (MenuHostHelper$$ExternalSyntheticLambda0()) {
                return;
            }
            if (!this.setX) {
                setY();
            }
            MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    /* renamed from: o.wv$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }
    }

    public static final /* synthetic */ void setIconTintList(C0611xv c0611xv) {
        xI iconTintList = c0611xv.setIconTintList();
        xI xIVar = xI.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(xIVar, "");
        c0611xv.MenuHostHelper$$ExternalSyntheticLambda0 = xIVar;
        iconTintList.t_();
        iconTintList.u_();
    }

    @Override // o.InterfaceC0574wn
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        Socket socket = this.setY.setUnboundedRipple;
        if (socket != null) {
            vL.MenuHostHelper$$ExternalSyntheticLambda0(socket);
        }
    }

    @Override // o.InterfaceC0574wn
    public final xK setIconTintList(vE vEVar, long j) {
        pN.setY(vEVar, "");
        if (vEVar.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            vF vFVar = vEVar.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        if ("chunked".equalsIgnoreCase(vEVar.setIconTintList("Transfer-Encoding"))) {
            if (!(this.setOnLongClickListener == 1)) {
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(this.setOnLongClickListener);
                throw new IllegalStateException(sb.toString().toString());
            }
            this.setOnLongClickListener = 2;
            return new setX();
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else {
            if (!(this.setOnLongClickListener == 1)) {
                StringBuilder sb2 = new StringBuilder("state: ");
                sb2.append(this.setOnLongClickListener);
                throw new IllegalStateException(sb2.toString().toString());
            }
            this.setOnLongClickListener = 2;
            return new setLayoutAnimation();
        }
    }
}