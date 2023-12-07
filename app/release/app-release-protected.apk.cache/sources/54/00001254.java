package o;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import o.vI;

/* renamed from: o.vy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0556vy {
    public static final setX setX = new setX((byte) 0);
    public final C0544vn MenuHostHelper$$ExternalSyntheticLambda0;
    public final List<Certificate> MenuHostHelper$$ExternalSyntheticLambda1;
    public final vI setIconTintList;
    public final nP setY;

    /* JADX WARN: Multi-variable type inference failed */
    public C0556vy(vI vIVar, C0544vn c0544vn, List<? extends Certificate> list, InterfaceC0376pj<? extends List<? extends Certificate>> interfaceC0376pj) {
        pN.setY(vIVar, "");
        pN.setY(c0544vn, "");
        pN.setY(list, "");
        pN.setY(interfaceC0376pj, "");
        this.setIconTintList = vIVar;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0544vn;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = list;
        vy$MenuHostHelper$$ExternalSyntheticLambda1 vy_menuhosthelper__externalsyntheticlambda1 = new vy$MenuHostHelper$$ExternalSyntheticLambda1(interfaceC0376pj);
        pN.setY(vy_menuhosthelper__externalsyntheticlambda1, "");
        this.setY = new nS(vy_menuhosthelper__externalsyntheticlambda1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0556vy) {
            C0556vy c0556vy = (C0556vy) obj;
            if (c0556vy.setIconTintList == this.setIconTintList && pN.MenuHostHelper$$ExternalSyntheticLambda0(c0556vy.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda0) && pN.MenuHostHelper$$ExternalSyntheticLambda0((List) c0556vy.setY.setY(), (List) this.setY.setY()) && pN.MenuHostHelper$$ExternalSyntheticLambda0(c0556vy.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda1)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.setIconTintList.hashCode();
        return ((((((hashCode + 527) * 31) + this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode()) * 31) + ((List) this.setY.setY()).hashCode()) * 31) + this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
    }

    private static String setX(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) type, "");
        return type;
    }

    /* renamed from: o.vy$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }

        public final C0556vy MenuHostHelper$$ExternalSyntheticLambda0(SSLSession sSLSession) {
            C0358os c0358os;
            C0358os c0358os2;
            pN.setY(sSLSession, "");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite == null) {
                throw new IllegalStateException("cipherSuite == null".toString());
            }
            int hashCode = cipherSuite.hashCode();
            if (hashCode == 1019404634 ? cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
                StringBuilder sb = new StringBuilder("cipherSuite == ");
                sb.append(cipherSuite);
                throw new IOException(sb.toString());
            }
            C0544vn iconTintList = C0544vn.setY.setIconTintList(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null".toString());
            }
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) "NONE", (Object) protocol)) {
                throw new IOException("tlsVersion == NONE");
            }
            vI.setY sety = vI.setY;
            vI MenuHostHelper$$ExternalSyntheticLambda1 = vI.setY.MenuHostHelper$$ExternalSyntheticLambda1(protocol);
            try {
                setX setx = this;
                Certificate[] peerCertificates = sSLSession.getPeerCertificates();
                if (peerCertificates != null) {
                    c0358os = vL.MenuHostHelper$$ExternalSyntheticLambda1((Certificate[]) Arrays.copyOf(peerCertificates, peerCertificates.length));
                } else {
                    c0358os = C0358os.setIconTintList;
                }
            } catch (SSLPeerUnverifiedException unused) {
                c0358os = C0358os.setIconTintList;
            }
            Certificate[] localCertificates = sSLSession.getLocalCertificates();
            if (localCertificates != null) {
                c0358os2 = vL.MenuHostHelper$$ExternalSyntheticLambda1((Certificate[]) Arrays.copyOf(localCertificates, localCertificates.length));
            } else {
                c0358os2 = C0358os.setIconTintList;
            }
            return new C0556vy(MenuHostHelper$$ExternalSyntheticLambda1, iconTintList, c0358os2, new C0009setX(c0358os));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o.vy$setX$setX  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0009setX extends pO implements InterfaceC0376pj<List<? extends Certificate>> {
            private /* synthetic */ List MenuHostHelper$$ExternalSyntheticLambda0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0009setX(List list) {
                super(0);
                this.MenuHostHelper$$ExternalSyntheticLambda0 = list;
            }

            @Override // o.InterfaceC0376pj
            public final /* bridge */ /* synthetic */ List<? extends Certificate> setIconTintList() {
                return this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
        }
    }

    public final String toString() {
        List<Certificate> list = (List) this.setY.setY();
        pN.setY(list, "");
        ArrayList arrayList = new ArrayList(list instanceof Collection ? list.size() : 10);
        for (Certificate certificate : list) {
            arrayList.add(setX(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.setIconTintList);
        sb.append(" cipherSuite=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(" peerCertificates=");
        sb.append(obj);
        sb.append(" localCertificates=");
        List<Certificate> list2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setY(list2, "");
        ArrayList arrayList2 = new ArrayList(list2 instanceof Collection ? list2.size() : 10);
        for (Certificate certificate2 : list2) {
            arrayList2.add(setX(certificate2));
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}