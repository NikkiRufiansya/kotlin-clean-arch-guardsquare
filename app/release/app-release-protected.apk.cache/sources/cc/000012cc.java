package o;

import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.C0555vx;
import o.vE;
import o.vJ;

/* renamed from: o.wr  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0578wr implements InterfaceC0554vw {
    private final vD setIconTintList;

    static {
        new wr$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
    }

    public C0578wr(vD vDVar) {
        pN.setY(vDVar, "");
        this.setIconTintList = vDVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v33, types: [java.util.List] */
    @Override // o.InterfaceC0554vw
    public final vJ setX(vw$MenuHostHelper$$ExternalSyntheticLambda1 vw_menuhosthelper__externalsyntheticlambda1) {
        C0358os c0358os;
        boolean z;
        C0358os c0358os2;
        C0560wa c0560wa;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C0538vh c0538vh;
        pN.setY(vw_menuhosthelper__externalsyntheticlambda1, "");
        C0576wp c0576wp = (C0576wp) vw_menuhosthelper__externalsyntheticlambda1;
        vE vEVar = c0576wp.MenuHostHelper$$ExternalSyntheticLambda0;
        vZ vZVar = c0576wp.setIconTintList;
        boolean z2 = true;
        C0358os c0358os3 = C0358os.setIconTintList;
        vJ vJVar = null;
        int i = 0;
        vE vEVar2 = vEVar;
        boolean z3 = true;
        while (true) {
            pN.setY(vEVar2, "");
            if (!(vZVar.setLayoutAnimation == null)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            synchronized (vZVar) {
                if (!(vZVar.setCenterIfNoTextEnabled ^ z2)) {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()".toString());
                }
                if (!(vZVar.setNavigationOnClickListener ^ z2)) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                nX nXVar = nX.setX;
            }
            if (z3) {
                C0564we c0564we = vZVar.setX;
                C0555vx c0555vx = vEVar2.setLayoutAnimation;
                if (c0555vx.MenuHostHelper$$ExternalSyntheticLambda1) {
                    SSLSocketFactory sSLSocketFactory2 = vZVar.setIconTintList.ExtendableSavedState$1;
                    if (sSLSocketFactory2 == null) {
                        throw new IllegalStateException("CLEARTEXT-only client");
                    }
                    sSLSocketFactory = sSLSocketFactory2;
                    hostnameVerifier = vZVar.setIconTintList.setTextAlignment;
                    c0538vh = vZVar.setIconTintList.setIconTintList;
                } else {
                    sSLSocketFactory = null;
                    hostnameVerifier = null;
                    c0538vh = null;
                }
                c0358os = c0358os3;
                vZVar.setUnboundedRipple = new C0561wb(c0564we, new C0532vb(c0555vx.setY, c0555vx.setIconTintList, vZVar.setIconTintList.setY(), vZVar.setIconTintList.setLayoutDirection, sSLSocketFactory, hostnameVerifier, c0538vh, vZVar.setIconTintList.setOnNavigationItemSelectedListener, vZVar.setIconTintList.setMaxEms, vZVar.setIconTintList.setTextScaleX, vZVar.setIconTintList.setUnboundedRipple, vZVar.setIconTintList.setMinAndMaxProgress), vZVar, vZVar.setUiOptions);
            } else {
                c0358os = c0358os3;
            }
            try {
                if (vZVar.MenuHostHelper$$ExternalSyntheticLambda0) {
                    throw new IOException("Canceled");
                }
                try {
                    vJ MenuHostHelper$$ExternalSyntheticLambda0 = c0576wp.MenuHostHelper$$ExternalSyntheticLambda0(vEVar2);
                    if (vJVar != null) {
                        vJ.setIconTintList seticontintlist = new vJ.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
                        vJ.setIconTintList seticontintlist2 = new vJ.setIconTintList(vJVar);
                        vJ.setIconTintList seticontintlist3 = seticontintlist2;
                        seticontintlist2.setY = null;
                        vJ MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1();
                        vJ.setIconTintList seticontintlist4 = seticontintlist;
                        if (!(MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList == null)) {
                            throw new IllegalArgumentException("priorResponse.body != null".toString());
                        }
                        seticontintlist.setNavigationOnClickListener = MenuHostHelper$$ExternalSyntheticLambda1;
                        MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1();
                    }
                    vJVar = MenuHostHelper$$ExternalSyntheticLambda0;
                    c0560wa = vZVar.setLayoutAnimation;
                    vEVar2 = MenuHostHelper$$ExternalSyntheticLambda0(vJVar, c0560wa);
                } catch (IOException e) {
                    if (!MenuHostHelper$$ExternalSyntheticLambda0(e, vZVar, vEVar2, !(e instanceof C0583ww))) {
                        throw vL.setX(e, c0358os);
                    }
                    z = true;
                    c0358os2 = C0348oi.setIconTintList(c0358os, e);
                    vZVar.MenuHostHelper$$ExternalSyntheticLambda1(z);
                    c0358os3 = c0358os2;
                    z3 = false;
                    z2 = true;
                } catch (C0566wg e2) {
                    C0358os c0358os4 = c0358os;
                    if (!MenuHostHelper$$ExternalSyntheticLambda0(e2.MenuHostHelper$$ExternalSyntheticLambda0, vZVar, vEVar2, false)) {
                        throw vL.setX(e2.setX, c0358os4);
                    }
                    ?? iconTintList = C0348oi.setIconTintList(c0358os4, e2.setX);
                    z = true;
                    c0358os2 = iconTintList;
                    vZVar.MenuHostHelper$$ExternalSyntheticLambda1(z);
                    c0358os3 = c0358os2;
                    z3 = false;
                    z2 = true;
                }
                if (vEVar2 == null) {
                    if (c0560wa != null) {
                        boolean z4 = c0560wa.setNavigationOnClickListener;
                    }
                    vZVar.MenuHostHelper$$ExternalSyntheticLambda1(false);
                    return vJVar;
                }
                vF vFVar = vEVar2.MenuHostHelper$$ExternalSyntheticLambda0;
                vH vHVar = vJVar.setIconTintList;
                if (vHVar != null) {
                    vL.MenuHostHelper$$ExternalSyntheticLambda1(vHVar);
                }
                i++;
                if (i > 20) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Too many follow-up requests: ");
                    sb.append(i);
                    throw new ProtocolException(sb.toString());
                }
                vZVar.MenuHostHelper$$ExternalSyntheticLambda1(true);
                c0358os3 = c0358os;
                z3 = true;
                z2 = true;
            } catch (Throwable th) {
                vZVar.MenuHostHelper$$ExternalSyntheticLambda1(true);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006a, code lost:
        if ((r4.setY < r4.MenuHostHelper$$ExternalSyntheticLambda0.size()) != true) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean MenuHostHelper$$ExternalSyntheticLambda0(java.io.IOException r3, o.vZ r4, o.vE r5, boolean r6) {
        /*
            r2 = this;
            o.vD r0 = r2.setIconTintList
            boolean r0 = r0.setCheckedIconEnabled
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            if (r6 == 0) goto L11
            o.vF r5 = r5.MenuHostHelper$$ExternalSyntheticLambda0
            boolean r5 = r3 instanceof java.io.FileNotFoundException
            if (r5 == 0) goto L11
            return r1
        L11:
            boolean r5 = r3 instanceof java.net.ProtocolException
            r0 = 1
            if (r5 == 0) goto L18
        L16:
            r3 = 0
            goto L36
        L18:
            boolean r5 = r3 instanceof java.io.InterruptedIOException
            if (r5 == 0) goto L23
            boolean r3 = r3 instanceof java.net.SocketTimeoutException
            if (r3 == 0) goto L16
            if (r6 != 0) goto L16
            goto L35
        L23:
            boolean r5 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r5 == 0) goto L30
            java.lang.Throwable r5 = r3.getCause()
            boolean r5 = r5 instanceof java.security.cert.CertificateException
            if (r5 == 0) goto L30
            goto L16
        L30:
            boolean r3 = r3 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 == 0) goto L35
            goto L16
        L35:
            r3 = 1
        L36:
            if (r3 != 0) goto L39
            return r1
        L39:
            o.wb r3 = r4.setUnboundedRipple
            o.pN.setX(r3)
            int r4 = r3.MenuHostHelper$$ExternalSyntheticLambda1
            if (r4 != 0) goto L4c
            int r4 = r3.setY
            if (r4 != 0) goto L4c
            int r4 = r3.setX
            if (r4 != 0) goto L4c
            r3 = 0
            goto L76
        L4c:
            o.vG r4 = r3.setIconTintList
            if (r4 != 0) goto L75
            o.vG r4 = r3.setIconTintList()
            if (r4 == 0) goto L59
            r3.setIconTintList = r4
            goto L75
        L59:
            o.wi$setX r4 = r3.setLayoutAnimation
            if (r4 == 0) goto L6c
            int r5 = r4.setY
            java.util.List<o.vG> r4 = r4.MenuHostHelper$$ExternalSyntheticLambda0
            int r4 = r4.size()
            if (r5 >= r4) goto L69
            r4 = 1
            goto L6a
        L69:
            r4 = 0
        L6a:
            if (r4 == r0) goto L75
        L6c:
            o.wi r3 = r3.setNavigationOnClickListener
            if (r3 == 0) goto L75
            boolean r3 = r3.MenuHostHelper$$ExternalSyntheticLambda1()
            goto L76
        L75:
            r3 = 1
        L76:
            if (r3 != 0) goto L79
            return r1
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0578wr.MenuHostHelper$$ExternalSyntheticLambda0(java.io.IOException, o.vZ, o.vE, boolean):boolean");
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda0(vJ vJVar, int i) {
        String y = vJ.setY(vJVar, "Retry-After");
        if (y != null) {
            String str = y;
            qP qPVar = new qP("\\d+");
            pN.setY(str, "");
            if (qPVar.setX.matcher(str).matches()) {
                Integer valueOf = Integer.valueOf(y);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) valueOf, "");
                return valueOf.intValue();
            }
            return Integer.MAX_VALUE;
        }
        return i;
    }

    private final vE MenuHostHelper$$ExternalSyntheticLambda0(vJ vJVar, C0560wa c0560wa) {
        String y;
        C0563wd c0563wd;
        vG vGVar = (c0560wa == null || (c0563wd = c0560wa.setX) == null) ? null : c0563wd.ViewPager$SavedState$1;
        int i = vJVar.MenuHostHelper$$ExternalSyntheticLambda0;
        String str = vJVar.setCenterIfNoTextEnabled.setX;
        boolean z = false;
        if (i != 307 && i != 308) {
            if (i != 401) {
                if (i == 421) {
                    vF vFVar = vJVar.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (c0560wa == null || !(!pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0560wa.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.setY, (Object) c0560wa.setX.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled.setY))) {
                        return null;
                    }
                    C0563wd c0563wd2 = c0560wa.setX;
                    synchronized (c0563wd2) {
                        c0563wd2.setNavigationOnClickListener = true;
                    }
                    return vJVar.setCenterIfNoTextEnabled;
                } else if (i == 503) {
                    vJ vJVar2 = vJVar.setUnboundedRipple;
                    if ((vJVar2 == null || vJVar2.MenuHostHelper$$ExternalSyntheticLambda0 != 503) && MenuHostHelper$$ExternalSyntheticLambda0(vJVar, Integer.MAX_VALUE) == 0) {
                        return vJVar.setCenterIfNoTextEnabled;
                    }
                    return null;
                } else if (i == 407) {
                    pN.setX(vGVar);
                    if (vGVar.setX.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    return this.setIconTintList.setOnNavigationItemSelectedListener.MenuHostHelper$$ExternalSyntheticLambda1(vGVar, vJVar);
                } else if (i == 408) {
                    if (this.setIconTintList.setCheckedIconEnabled) {
                        vF vFVar2 = vJVar.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0;
                        vJ vJVar3 = vJVar.setUnboundedRipple;
                        if ((vJVar3 == null || vJVar3.MenuHostHelper$$ExternalSyntheticLambda0 != 408) && MenuHostHelper$$ExternalSyntheticLambda0(vJVar, 0) <= 0) {
                            return vJVar.setCenterIfNoTextEnabled;
                        }
                        return null;
                    }
                    return null;
                } else {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            break;
                        default:
                            return null;
                    }
                }
            } else {
                return this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(vGVar, vJVar);
            }
        }
        if (this.setIconTintList.ViewPager$SavedState$1 && (y = vJ.setY(vJVar, "Location")) != null) {
            C0555vx c0555vx = vJVar.setCenterIfNoTextEnabled.setLayoutAnimation;
            pN.setY(y, "");
            C0555vx.setIconTintList y2 = c0555vx.setY(y);
            C0555vx y3 = y2 != null ? y2.setY() : null;
            if (y3 != null && (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) y3.setLayoutAnimation, (Object) vJVar.setCenterIfNoTextEnabled.setLayoutAnimation.setLayoutAnimation) || this.setIconTintList.setIconSize)) {
                vE.setIconTintList seticontintlist = new vE.setIconTintList(vJVar.setCenterIfNoTextEnabled);
                if (C0572wl.setY(str)) {
                    int i2 = vJVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    C0572wl c0572wl = C0572wl.MenuHostHelper$$ExternalSyntheticLambda1;
                    z = (C0572wl.setX(str) || i2 == 308 || i2 == 307) ? true : true;
                    C0572wl c0572wl2 = C0572wl.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (C0572wl.setIconTintList(str) && i2 != 308 && i2 != 307) {
                        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1("GET", null);
                    } else {
                        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(str, z ? vJVar.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0 : null);
                    }
                    if (!z) {
                        pN.setY("Transfer-Encoding", "");
                        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Transfer-Encoding");
                        pN.setY("Content-Length", "");
                        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Content-Length");
                        pN.setY("Content-Type", "");
                        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Content-Type");
                    }
                }
                if (!vL.MenuHostHelper$$ExternalSyntheticLambda0(vJVar.setCenterIfNoTextEnabled.setLayoutAnimation, y3)) {
                    pN.setY("Authorization", "");
                    seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0.setX("Authorization");
                }
                pN.setY(y3, "");
                seticontintlist.setY = y3;
                return seticontintlist.setX();
            }
        }
        return null;
    }
}