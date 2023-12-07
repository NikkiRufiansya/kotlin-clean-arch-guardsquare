package o;

import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: o.vh  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0538vh {
    final Set<vh$MenuHostHelper$$ExternalSyntheticLambda1> MenuHostHelper$$ExternalSyntheticLambda0;
    public final AbstractC0592xe setIconTintList;
    public static final vh$MenuHostHelper$$ExternalSyntheticLambda0 setX = new vh$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
    public static final C0538vh MenuHostHelper$$ExternalSyntheticLambda1 = new C0538vh(C0348oi.setUnboundedRipple(new setX().setX));

    /* renamed from: o.vh$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        final List<vh$MenuHostHelper$$ExternalSyntheticLambda1> setX = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0538vh(Set<vh$MenuHostHelper$$ExternalSyntheticLambda1> set, AbstractC0592xe abstractC0592xe) {
        pN.setY(set, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = set;
        this.setIconTintList = abstractC0592xe;
    }

    private /* synthetic */ C0538vh(Set set) {
        this(set, null);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(String str, InterfaceC0376pj<? extends List<? extends X509Certificate>> interfaceC0376pj) {
        pN.setY(str, "");
        pN.setY(interfaceC0376pj, "");
        pN.setY(str, "");
        List<vh$MenuHostHelper$$ExternalSyntheticLambda1> list = C0358os.setIconTintList;
        for (Object obj : this.MenuHostHelper$$ExternalSyntheticLambda0) {
            vh$MenuHostHelper$$ExternalSyntheticLambda1 vh_menuhosthelper__externalsyntheticlambda1 = (vh$MenuHostHelper$$ExternalSyntheticLambda1) obj;
            pN.setY(str, "");
            String str2 = vh_menuhosthelper__externalsyntheticlambda1.setX;
            if (qR.setX(null, "**.", false)) {
                String str3 = vh_menuhosthelper__externalsyntheticlambda1.setX;
                throw null;
            } else if (qR.setX(vh_menuhosthelper__externalsyntheticlambda1.setX, "*.", false)) {
                String str4 = vh_menuhosthelper__externalsyntheticlambda1.setX;
                throw null;
            } else if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) vh_menuhosthelper__externalsyntheticlambda1.setX)) {
                if (list.isEmpty()) {
                    list = new ArrayList();
                }
                if (list == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<T>");
                }
                pZ.setX(list).add(obj);
            }
        }
        if (list.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> iconTintList = interfaceC0376pj.setIconTintList();
        for (X509Certificate x509Certificate : iconTintList) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                String str5 = ((vh$MenuHostHelper$$ExternalSyntheticLambda1) it.next()).MenuHostHelper$$ExternalSyntheticLambda0;
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : iconTintList) {
            sb.append("\n    ");
            sb.append(setX.setIconTintList(x509Certificate2));
            sb.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) subjectDN, "");
            sb.append(subjectDN.getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(":");
        for (vh$MenuHostHelper$$ExternalSyntheticLambda1 vh_menuhosthelper__externalsyntheticlambda12 : list) {
            sb.append("\n    ");
            sb.append(vh_menuhosthelper__externalsyntheticlambda12);
        }
        String obj2 = sb.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj2, "");
        throw new SSLPeerUnverifiedException(obj2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0538vh) {
            C0538vh c0538vh = (C0538vh) obj;
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(c0538vh.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda0) && pN.MenuHostHelper$$ExternalSyntheticLambda0(c0538vh.setIconTintList, this.setIconTintList)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
        AbstractC0592xe abstractC0592xe = this.setIconTintList;
        return ((hashCode + 1517) * 41) + (abstractC0592xe != null ? abstractC0592xe.hashCode() : 0);
    }

    /* renamed from: o.vh$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends pO implements InterfaceC0376pj<List<? extends X509Certificate>> {
        private /* synthetic */ List MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ String setY;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setIconTintList(List list, String str) {
            super(0);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = list;
            this.setY = str;
        }

        @Override // o.InterfaceC0376pj
        public final /* synthetic */ List<? extends X509Certificate> setIconTintList() {
            List<Certificate> list;
            AbstractC0592xe abstractC0592xe = C0538vh.this.setIconTintList;
            if (abstractC0592xe == null || (list = abstractC0592xe.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setY)) == null) {
                list = this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            List<Certificate> list2 = list;
            pN.setY(list2, "");
            ArrayList arrayList = new ArrayList(list2 instanceof Collection ? list2.size() : 10);
            for (Certificate certificate : list2) {
                if (certificate == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
                }
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }
}