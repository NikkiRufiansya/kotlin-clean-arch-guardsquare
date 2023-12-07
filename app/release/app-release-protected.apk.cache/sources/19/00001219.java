package o;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import o.C0555vx;

/* renamed from: o.vb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0532vb {
    public final InterfaceC0551vu MenuHostHelper$$ExternalSyntheticLambda0;
    public final List<C0543vm> MenuHostHelper$$ExternalSyntheticLambda1;
    public final C0555vx setCenterIfNoTextEnabled;
    public final List<vB> setIconTintList;
    public final SocketFactory setLayoutAnimation;
    public final Proxy setNavigationOnClickListener;
    public final ProxySelector setOnLongClickListener;
    public final SSLSocketFactory setUiOptions;
    public final InterfaceC0533vc setUnboundedRipple;
    public final C0538vh setX;
    public final HostnameVerifier setY;

    public C0532vb(String str, int i, InterfaceC0551vu interfaceC0551vu, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C0538vh c0538vh, InterfaceC0533vc interfaceC0533vc, Proxy proxy, List<? extends vB> list, List<C0543vm> list2, ProxySelector proxySelector) {
        pN.setY(str, "");
        pN.setY(interfaceC0551vu, "");
        pN.setY(socketFactory, "");
        pN.setY(interfaceC0533vc, "");
        pN.setY(list, "");
        pN.setY(list2, "");
        pN.setY(proxySelector, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0551vu;
        this.setLayoutAnimation = socketFactory;
        this.setUiOptions = sSLSocketFactory;
        this.setY = hostnameVerifier;
        this.setX = c0538vh;
        this.setUnboundedRipple = interfaceC0533vc;
        this.setNavigationOnClickListener = proxy;
        this.setOnLongClickListener = proxySelector;
        C0555vx.setIconTintList seticontintlist = new C0555vx.setIconTintList();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        pN.setY(str2, "");
        if (str2.equalsIgnoreCase("http")) {
            seticontintlist.setNavigationOnClickListener = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            seticontintlist.setNavigationOnClickListener = "https";
        } else {
            StringBuilder sb = new StringBuilder("unexpected scheme: ");
            sb.append(str2);
            throw new IllegalArgumentException(sb.toString());
        }
        pN.setY(str, "");
        String iconTintList = vO.setIconTintList(vx$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(C0555vx.MenuHostHelper$$ExternalSyntheticLambda0, str, 0, 0, false, 7));
        if (iconTintList == null) {
            StringBuilder sb2 = new StringBuilder("unexpected host: ");
            sb2.append(str);
            throw new IllegalArgumentException(sb2.toString());
        }
        seticontintlist.setUiOptions = iconTintList;
        boolean z = true;
        if (!((i <= 0 || 65535 < i) ? false : false)) {
            StringBuilder sb3 = new StringBuilder("unexpected port: ");
            sb3.append(i);
            throw new IllegalArgumentException(sb3.toString().toString());
        }
        seticontintlist.setUnboundedRipple = i;
        this.setCenterIfNoTextEnabled = seticontintlist.setY();
        this.setIconTintList = vL.MenuHostHelper$$ExternalSyntheticLambda0(list);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda0(list2);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0532vb) {
            C0532vb c0532vb = (C0532vb) obj;
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setCenterIfNoTextEnabled, c0532vb.setCenterIfNoTextEnabled) && setX(c0532vb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.setCenterIfNoTextEnabled.hashCode();
        int hashCode2 = this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
        int hashCode3 = this.setUnboundedRipple.hashCode();
        int hashCode4 = this.setIconTintList.hashCode();
        int hashCode5 = this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
        int hashCode6 = this.setOnLongClickListener.hashCode();
        int hashCode7 = Objects.hashCode(this.setNavigationOnClickListener);
        return ((((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + Objects.hashCode(this.setUiOptions)) * 31) + Objects.hashCode(this.setY)) * 31) + Objects.hashCode(this.setX);
    }

    public final boolean setX(C0532vb c0532vb) {
        pN.setY(c0532vb, "");
        return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, c0532vb.MenuHostHelper$$ExternalSyntheticLambda0) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setUnboundedRipple, c0532vb.setUnboundedRipple) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, c0532vb.setIconTintList) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, c0532vb.MenuHostHelper$$ExternalSyntheticLambda1) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnLongClickListener, c0532vb.setOnLongClickListener) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setNavigationOnClickListener, c0532vb.setNavigationOnClickListener) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setUiOptions, c0532vb.setUiOptions) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, c0532vb.setY) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, c0532vb.setX) && this.setCenterIfNoTextEnabled.setIconTintList == c0532vb.setCenterIfNoTextEnabled.setIconTintList;
    }

    public final String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.setCenterIfNoTextEnabled.setY);
        sb2.append(':');
        sb2.append(this.setCenterIfNoTextEnabled.setIconTintList);
        sb2.append(", ");
        if (this.setNavigationOnClickListener != null) {
            sb = new StringBuilder("proxy=");
            obj = this.setNavigationOnClickListener;
        } else {
            sb = new StringBuilder("proxySelector=");
            obj = this.setOnLongClickListener;
        }
        sb.append(obj);
        sb2.append(sb.toString());
        sb2.append("}");
        return sb2.toString();
    }
}