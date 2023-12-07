package o;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import o.C0577wq;
import o.vJ;

/* renamed from: o.wy  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0585wy implements InterfaceC0574wn {
    private static final List<String> setX;
    private static final List<String> setY;
    private final C0563wd MenuHostHelper$$ExternalSyntheticLambda0;
    private volatile boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final C0576wp setIconTintList;
    private final vB setLayoutAnimation;
    private final wB setNavigationOnClickListener;
    private volatile wF setUiOptions;

    public C0585wy(vD vDVar, C0563wd c0563wd, C0576wp c0576wp, wB wBVar) {
        vB vBVar;
        pN.setY(vDVar, "");
        pN.setY(c0563wd, "");
        pN.setY(c0576wp, "");
        pN.setY(wBVar, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0563wd;
        this.setIconTintList = c0576wp;
        this.setNavigationOnClickListener = wBVar;
        if (vDVar.setTextScaleX.contains(vB.H2_PRIOR_KNOWLEDGE)) {
            vBVar = vB.H2_PRIOR_KNOWLEDGE;
        } else {
            vBVar = vB.HTTP_2;
        }
        this.setLayoutAnimation = vBVar;
    }

    @Override // o.InterfaceC0574wn
    public final C0563wd setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.InterfaceC0574wn
    public final xK setIconTintList(vE vEVar, long j) {
        pN.setY(vEVar, "");
        wF wFVar = this.setUiOptions;
        pN.setX(wFVar);
        return wFVar.setX();
    }

    @Override // o.InterfaceC0574wn
    public final void setY(vE vEVar) {
        pN.setY(vEVar, "");
        if (this.setUiOptions != null) {
            return;
        }
        boolean z = vEVar.MenuHostHelper$$ExternalSyntheticLambda0 != null;
        pN.setY(vEVar, "");
        C0557vz c0557vz = vEVar.setY;
        ArrayList arrayList = new ArrayList((c0557vz.setIconTintList.length / 2) + 4);
        arrayList.add(new C0581wu(C0581wu.setX, vEVar.setX));
        C0610xu c0610xu = C0581wu.MenuHostHelper$$ExternalSyntheticLambda1;
        C0579ws c0579ws = C0579ws.MenuHostHelper$$ExternalSyntheticLambda1;
        arrayList.add(new C0581wu(c0610xu, C0579ws.setIconTintList(vEVar.setLayoutAnimation)));
        String iconTintList = vEVar.setIconTintList("Host");
        if (iconTintList != null) {
            arrayList.add(new C0581wu(C0581wu.setIconTintList, iconTintList));
        }
        arrayList.add(new C0581wu(C0581wu.setOnLongClickListener, vEVar.setLayoutAnimation.setLayoutAnimation));
        int length = c0557vz.setIconTintList.length / 2;
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            String str = c0557vz.setIconTintList[i2];
            Locale locale = Locale.US;
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) locale, "");
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = str.toLowerCase(locale);
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, "");
            if (!setY.contains(lowerCase) || (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) lowerCase, (Object) "te") && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0557vz.setIconTintList[i2 + 1], (Object) "trailers"))) {
                arrayList.add(new C0581wu(lowerCase, c0557vz.setIconTintList[i2 + 1]));
            }
        }
        ArrayList arrayList2 = arrayList;
        wB wBVar = this.setNavigationOnClickListener;
        pN.setY(arrayList2, "");
        this.setUiOptions = wBVar.setIconTintList(arrayList2, z);
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            wF wFVar = this.setUiOptions;
            pN.setX(wFVar);
            EnumC0584wx enumC0584wx = EnumC0584wx.CANCEL;
            pN.setY(enumC0584wx, "");
            if (wFVar.MenuHostHelper$$ExternalSyntheticLambda1(enumC0584wx, (IOException) null)) {
                wFVar.setX.setX(wFVar.MenuHostHelper$$ExternalSyntheticLambda1, enumC0584wx);
            }
            throw new IOException("Canceled");
        }
        wF wFVar2 = this.setUiOptions;
        pN.setX(wFVar2);
        wFVar2.setOnLongClickListener.setY(this.setIconTintList.setY, TimeUnit.MILLISECONDS);
        wF wFVar3 = this.setUiOptions;
        pN.setX(wFVar3);
        wFVar3.ViewPager$SavedState$1.setY(this.setIconTintList.setNavigationOnClickListener, TimeUnit.MILLISECONDS);
    }

    @Override // o.InterfaceC0574wn
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setNavigationOnClickListener.setTextScaleX.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.InterfaceC0574wn
    public final void setY() {
        wF wFVar = this.setUiOptions;
        pN.setX(wFVar);
        wFVar.setX().close();
    }

    @Override // o.InterfaceC0574wn
    public final vJ.setIconTintList setIconTintList(boolean z) {
        wF wFVar = this.setUiOptions;
        pN.setX(wFVar);
        C0557vz navigationOnClickListener = wFVar.setNavigationOnClickListener();
        vB vBVar = this.setLayoutAnimation;
        pN.setY(navigationOnClickListener, "");
        pN.setY(vBVar, "");
        C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
        int length = navigationOnClickListener.setIconTintList.length / 2;
        C0577wq c0577wq = null;
        for (int i = 0; i < length; i++) {
            int i2 = i << 1;
            String str = navigationOnClickListener.setIconTintList[i2];
            String str2 = navigationOnClickListener.setIconTintList[i2 + 1];
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) ":status")) {
                C0577wq.setIconTintList seticontintlist = C0577wq.setIconTintList;
                StringBuilder sb = new StringBuilder("HTTP/1.1 ");
                sb.append(str2);
                c0577wq = C0577wq.setIconTintList.setX(sb.toString());
            } else if (!setX.contains(str)) {
                c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.setY(str, str2);
            }
        }
        if (c0577wq == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        vJ.setIconTintList seticontintlist2 = new vJ.setIconTintList();
        pN.setY(vBVar, "");
        seticontintlist2.setLayoutAnimation = vBVar;
        seticontintlist2.setIconTintList = c0577wq.MenuHostHelper$$ExternalSyntheticLambda1;
        String str3 = c0577wq.MenuHostHelper$$ExternalSyntheticLambda0;
        pN.setY(str3, "");
        seticontintlist2.setUnboundedRipple = str3;
        vJ.setIconTintList x = seticontintlist2.setX(c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.setX());
        if (z && x.setIconTintList == 100) {
            return null;
        }
        return x;
    }

    @Override // o.InterfaceC0574wn
    public final long setX(vJ vJVar) {
        pN.setY(vJVar, "");
        if (C0573wm.setIconTintList(vJVar)) {
            return vL.MenuHostHelper$$ExternalSyntheticLambda0(vJVar);
        }
        return 0L;
    }

    @Override // o.InterfaceC0574wn
    public final xJ MenuHostHelper$$ExternalSyntheticLambda1(vJ vJVar) {
        pN.setY(vJVar, "");
        wF wFVar = this.setUiOptions;
        pN.setX(wFVar);
        return wFVar.setLayoutAnimation;
    }

    @Override // o.InterfaceC0574wn
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        wF wFVar = this.setUiOptions;
        if (wFVar != null) {
            EnumC0584wx enumC0584wx = EnumC0584wx.CANCEL;
            pN.setY(enumC0584wx, "");
            if (wFVar.MenuHostHelper$$ExternalSyntheticLambda1(enumC0584wx, (IOException) null)) {
                wFVar.setX.setX(wFVar.MenuHostHelper$$ExternalSyntheticLambda1, enumC0584wx);
            }
        }
    }

    /* renamed from: o.wy$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private setX() {
        }

        public /* synthetic */ setX(byte b) {
            this();
        }
    }

    static {
        new setX((byte) 0);
        setY = vL.MenuHostHelper$$ExternalSyntheticLambda1("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
        setX = vL.MenuHostHelper$$ExternalSyntheticLambda1("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    }
}