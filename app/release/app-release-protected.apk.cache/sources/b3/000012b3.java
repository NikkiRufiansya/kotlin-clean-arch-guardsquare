package o;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.security.cert.Certificate;
import java.util.ArrayList;
import java.util.List;
import o.wB;

/* renamed from: o.wd  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0563wd extends wB.setY implements InterfaceC0545vo {
    public static final int setOnNavigationItemSelectedListener = 10;
    long MenuHostHelper$$ExternalSyntheticLambda0;
    public C0556vy MenuHostHelper$$ExternalSyntheticLambda1;
    public final vG ViewPager$SavedState$1;
    Socket setCenterIfNoTextEnabled;
    InterfaceC0607xr setChipCornerRadius;
    int setIconSize;
    int setIconTintList;
    public boolean setLayoutAnimation;
    private final C0564we setMaxEms;
    public boolean setNavigationOnClickListener;
    int setOnLongClickListener;
    InterfaceC0606xq setTextAlignment;
    int setTextScaleX;
    vB setUiOptions;
    public Socket setUnboundedRipple;
    final List<Reference<vZ>> setX;
    public wB setY;

    static {
        new wd$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
    }

    public C0563wd(C0564we c0564we, vG vGVar) {
        pN.setY(c0564we, "");
        pN.setY(vGVar, "");
        this.setMaxEms = c0564we;
        this.ViewPager$SavedState$1 = vGVar;
        this.setIconTintList = 1;
        this.setX = new ArrayList();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, InterfaceC0541vk interfaceC0541vk) {
        Socket socket;
        wR wRVar;
        int i3;
        Proxy proxy = this.ViewPager$SavedState$1.setX;
        C0532vb c0532vb = this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0;
        Proxy.Type type = proxy.type();
        if (type != null && ((i3 = C0562wc.setY[type.ordinal()]) == 1 || i3 == 2)) {
            socket = c0532vb.setLayoutAnimation.createSocket();
            pN.setX(socket);
        } else {
            socket = new Socket(proxy);
        }
        this.setUnboundedRipple = socket;
        AbstractC0549vs.setX(interfaceC0541vk, this.ViewPager$SavedState$1.setY, proxy);
        socket.setSoTimeout(i2);
        try {
            wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
            wRVar = wR.MenuHostHelper$$ExternalSyntheticLambda1;
            wRVar.MenuHostHelper$$ExternalSyntheticLambda0(socket, this.ViewPager$SavedState$1.setY, i);
            try {
                xJ MenuHostHelper$$ExternalSyntheticLambda0 = C0615xz.MenuHostHelper$$ExternalSyntheticLambda0(socket);
                pN.setY(MenuHostHelper$$ExternalSyntheticLambda0, "");
                this.setChipCornerRadius = new xB(MenuHostHelper$$ExternalSyntheticLambda0);
                xK MenuHostHelper$$ExternalSyntheticLambda1 = C0615xz.MenuHostHelper$$ExternalSyntheticLambda1(socket);
                pN.setY(MenuHostHelper$$ExternalSyntheticLambda1, "");
                this.setTextAlignment = new xD(MenuHostHelper$$ExternalSyntheticLambda1);
            } catch (NullPointerException e) {
                if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) e.getMessage(), (Object) "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.ViewPager$SavedState$1.setY);
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        Socket socket = this.setCenterIfNoTextEnabled;
        pN.setX(socket);
        InterfaceC0607xr interfaceC0607xr = this.setChipCornerRadius;
        pN.setX(interfaceC0607xr);
        InterfaceC0606xq interfaceC0606xq = this.setTextAlignment;
        pN.setX(interfaceC0606xq);
        socket.setSoTimeout(0);
        wB$MenuHostHelper$$ExternalSyntheticLambda0 x = new wB$MenuHostHelper$$ExternalSyntheticLambda0(vV.MenuHostHelper$$ExternalSyntheticLambda1).setX(socket, this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.setY, interfaceC0607xr, interfaceC0606xq);
        C0563wd c0563wd = this;
        pN.setY(c0563wd, "");
        x.setIconTintList = c0563wd;
        x.setY = i;
        wB wBVar = new wB(x);
        this.setY = wBVar;
        wB.setIconTintList seticontintlist = wB.MenuHostHelper$$ExternalSyntheticLambda0;
        wH MenuHostHelper$$ExternalSyntheticLambda1 = wB.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setIconTintList = (MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0 & 16) != 0 ? MenuHostHelper$$ExternalSyntheticLambda1.setY[4] : Integer.MAX_VALUE;
        wB.setCenterIfNoTextEnabled(wBVar);
    }

    @Override // o.wB.setY
    public final void setY(wF wFVar) {
        pN.setY(wFVar, "");
        EnumC0584wx enumC0584wx = EnumC0584wx.REFUSED_STREAM;
        pN.setY(enumC0584wx, "");
        if (wFVar.MenuHostHelper$$ExternalSyntheticLambda1(enumC0584wx, (IOException) null)) {
            wB wBVar = wFVar.setX;
            int i = wFVar.MenuHostHelper$$ExternalSyntheticLambda1;
            pN.setY(enumC0584wx, "");
            wBVar.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda0(i, enumC0584wx);
        }
    }

    @Override // o.InterfaceC0545vo
    public final vB MenuHostHelper$$ExternalSyntheticLambda1() {
        vB vBVar = this.setUiOptions;
        pN.setX(vBVar);
        return vBVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.setY);
        sb.append(':');
        sb.append(this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.setIconTintList);
        sb.append(", proxy=");
        sb.append(this.ViewPager$SavedState$1.setX);
        sb.append(" hostAddress=");
        sb.append(this.ViewPager$SavedState$1.setY);
        sb.append(" cipherSuite=");
        C0556vy c0556vy = this.MenuHostHelper$$ExternalSyntheticLambda1;
        sb.append((c0556vy == null || (r1 = c0556vy.MenuHostHelper$$ExternalSyntheticLambda0) == null) ? "none" : "none");
        sb.append(" protocol=");
        sb.append(this.setUiOptions);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e7, code lost:
        if (r8 == false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean setIconTintList(o.C0532vb r7, java.util.List<o.vG> r8) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0563wd.setIconTintList(o.vb, java.util.List):boolean");
    }

    public final boolean setY(boolean z) {
        long j;
        boolean z2 = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        long nanoTime = System.nanoTime();
        Socket socket = this.setUnboundedRipple;
        pN.setX(socket);
        Socket socket2 = this.setCenterIfNoTextEnabled;
        pN.setX(socket2);
        InterfaceC0607xr interfaceC0607xr = this.setChipCornerRadius;
        pN.setX(interfaceC0607xr);
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        wB wBVar = this.setY;
        if (wBVar != null) {
            return wBVar.setY(nanoTime);
        }
        synchronized (this) {
            j = this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        if (nanoTime - j < 10000000000L || !z) {
            return true;
        }
        return vL.MenuHostHelper$$ExternalSyntheticLambda0(socket2, interfaceC0607xr);
    }

    /* renamed from: o.wd$setIconTintList */
    /* loaded from: classes.dex */
    static final class setIconTintList extends pO implements InterfaceC0376pj<List<? extends Certificate>> {
        private /* synthetic */ C0538vh MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ C0532vb setIconTintList;
        private /* synthetic */ C0556vy setX;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setIconTintList(C0538vh c0538vh, C0556vy c0556vy, C0532vb c0532vb) {
            super(0);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = c0538vh;
            this.setX = c0556vy;
            this.setIconTintList = c0532vb;
        }

        @Override // o.InterfaceC0376pj
        public final /* synthetic */ List<? extends Certificate> setIconTintList() {
            AbstractC0592xe abstractC0592xe = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList;
            pN.setX(abstractC0592xe);
            return abstractC0592xe.MenuHostHelper$$ExternalSyntheticLambda0((List) this.setX.setY.setY(), this.setIconTintList.setCenterIfNoTextEnabled.setY);
        }
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(vD vDVar, vG vGVar, IOException iOException) {
        pN.setY(vDVar, "");
        pN.setY(vGVar, "");
        pN.setY((Object) iOException, "");
        if (vGVar.setX.type() != Proxy.Type.DIRECT) {
            C0532vb c0532vb = vGVar.MenuHostHelper$$ExternalSyntheticLambda0;
            c0532vb.setOnLongClickListener.connectFailed(c0532vb.setCenterIfNoTextEnabled.setLayoutAnimation(), vGVar.setX.address(), iOException);
        }
        C0565wf c0565wf = vDVar.setGuidelinePercent;
        synchronized (c0565wf) {
            pN.setY(vGVar, "");
            c0565wf.setIconTintList.add(vGVar);
        }
    }

    @Override // o.wB.setY
    public final void setY(wB wBVar, wH wHVar) {
        synchronized (this) {
            pN.setY(wBVar, "");
            pN.setY(wHVar, "");
            this.setIconTintList = (wHVar.MenuHostHelper$$ExternalSyntheticLambda0 & 16) != 0 ? wHVar.setY[4] : Integer.MAX_VALUE;
        }
    }
}