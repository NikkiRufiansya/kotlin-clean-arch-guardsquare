package o;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import o.C0557vz;
import o.C0610xu;
import o.vE;
import o.vJ;
import o.vP;

/* renamed from: o.vi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0539vi implements Closeable, Flushable {
    public static final vi$MenuHostHelper$$ExternalSyntheticLambda1 setY = new vi$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    public int MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    public final vP setIconTintList;
    int setLayoutAnimation;
    int setUiOptions;
    public int setX;

    private C0539vi(File file, long j, wM wMVar) {
        pN.setY(file, "");
        pN.setY(wMVar, "");
        this.setIconTintList = new vP(wMVar, file, j, vV.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0539vi(File file, long j) {
        this(file, j, wM.MenuHostHelper$$ExternalSyntheticLambda1);
        pN.setY(file, "");
    }

    public static void setIconTintList(vP.setY sety) {
        if (sety != null) {
            try {
                sety.setIconTintList();
            } catch (IOException unused) {
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
        this.setIconTintList.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.setIconTintList.close();
    }

    /* renamed from: o.vi$setX */
    /* loaded from: classes.dex */
    final class setX implements vQ {
        final vP.setY MenuHostHelper$$ExternalSyntheticLambda0;
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        final /* synthetic */ C0539vi setIconTintList;
        private final xK setX;
        private final xK setY;

        public setX(C0539vi c0539vi, vP.setY sety) {
            pN.setY(sety, "");
            this.setIconTintList = c0539vi;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = sety;
            xK MenuHostHelper$$ExternalSyntheticLambda1 = sety.MenuHostHelper$$ExternalSyntheticLambda1(1);
            this.setX = MenuHostHelper$$ExternalSyntheticLambda1;
            this.setY = new AbstractC0609xt(MenuHostHelper$$ExternalSyntheticLambda1) { // from class: o.vi.setX.3
                @Override // o.AbstractC0609xt, o.xK, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    synchronized (setX.this.setIconTintList) {
                        if (setX.this.MenuHostHelper$$ExternalSyntheticLambda1) {
                            return;
                        }
                        setX.this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                        setX.this.setIconTintList.setUiOptions++;
                        super.close();
                        setX.this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                }
            };
        }

        @Override // o.vQ
        public final void setY() {
            synchronized (this.setIconTintList) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                this.setIconTintList.setLayoutAnimation++;
                vL.MenuHostHelper$$ExternalSyntheticLambda1(this.setX);
                try {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
                } catch (IOException unused) {
                }
            }
        }

        @Override // o.vQ
        public final xK MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setY;
        }
    }

    /* renamed from: o.vi$setY */
    /* loaded from: classes.dex */
    public static final class setY extends vH {
        public final vP$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
        private final String setUnboundedRipple;
        private final InterfaceC0607xr setX;
        private final String setY;

        public setY(vP$MenuHostHelper$$ExternalSyntheticLambda1 vp_menuhosthelper__externalsyntheticlambda1, String str, String str2) {
            pN.setY(vp_menuhosthelper__externalsyntheticlambda1, "");
            this.MenuHostHelper$$ExternalSyntheticLambda1 = vp_menuhosthelper__externalsyntheticlambda1;
            this.setUnboundedRipple = str;
            this.setY = str2;
            final xJ xJVar = vp_menuhosthelper__externalsyntheticlambda1.setIconTintList.get(1);
            AbstractC0608xs abstractC0608xs = new AbstractC0608xs(xJVar) { // from class: o.vi.setY.5
                @Override // o.AbstractC0608xs, o.xJ, java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                    setY.this.MenuHostHelper$$ExternalSyntheticLambda1.close();
                    super.close();
                }
            };
            pN.setY(abstractC0608xs, "");
            this.setX = new xB(abstractC0608xs);
        }

        @Override // o.vH
        public final vA MenuHostHelper$$ExternalSyntheticLambda0() {
            String str = this.setUnboundedRipple;
            if (str != null) {
                return vA.setY.MenuHostHelper$$ExternalSyntheticLambda0(str);
            }
            return null;
        }

        @Override // o.vH
        public final long setIconTintList() {
            String str = this.setY;
            if (str != null) {
                return vL.MenuHostHelper$$ExternalSyntheticLambda1(str, -1L);
            }
            return -1L;
        }

        @Override // o.vH
        public final InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setX;
        }
    }

    public final vJ setY(vE vEVar) {
        boolean z;
        pN.setY(vEVar, "");
        C0555vx c0555vx = vEVar.setLayoutAnimation;
        pN.setY(c0555vx, "");
        C0610xu.setX setx = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
        String obj = c0555vx.toString();
        pN.setY(obj, "");
        pN.setY(obj, "");
        byte[] bytes = obj.getBytes(qQ.setIconTintList);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
        C0610xu c0610xu = new C0610xu(bytes);
        c0610xu.setX = obj;
        try {
            vP$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(c0610xu.MenuHostHelper$$ExternalSyntheticLambda1("MD5").setIconTintList());
            if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                try {
                    boolean z2 = false;
                    vi$MenuHostHelper$$ExternalSyntheticLambda0 vi_menuhosthelper__externalsyntheticlambda0 = new vi$MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList.get(0));
                    pN.setY(MenuHostHelper$$ExternalSyntheticLambda1, "");
                    C0557vz c0557vz = vi_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation;
                    pN.setY("Content-Type", "");
                    C0557vz.setX setx2 = C0557vz.setX;
                    String y = C0557vz.setX.setY(c0557vz.setIconTintList, "Content-Type");
                    C0557vz c0557vz2 = vi_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation;
                    pN.setY("Content-Length", "");
                    C0557vz.setX setx3 = C0557vz.setX;
                    String y2 = C0557vz.setX.setY(c0557vz2.setIconTintList, "Content-Length");
                    vE.setIconTintList MenuHostHelper$$ExternalSyntheticLambda12 = new vE.setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1(vi_menuhosthelper__externalsyntheticlambda0.setUiOptions).MenuHostHelper$$ExternalSyntheticLambda1(vi_menuhosthelper__externalsyntheticlambda0.setOnLongClickListener, null);
                    C0557vz c0557vz3 = vi_menuhosthelper__externalsyntheticlambda0.setUnboundedRipple;
                    pN.setY(c0557vz3, "");
                    C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda0 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
                    C0348oi.setIconTintList((Collection) c0558vz$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1, (Object[]) c0557vz3.setIconTintList);
                    MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0 = c0558vz$MenuHostHelper$$ExternalSyntheticLambda0;
                    vE x = MenuHostHelper$$ExternalSyntheticLambda12.setX();
                    vJ.setIconTintList seticontintlist = new vJ.setIconTintList();
                    pN.setY(x, "");
                    seticontintlist.setTextAlignment = x;
                    vB vBVar = vi_menuhosthelper__externalsyntheticlambda0.setIconTintList;
                    pN.setY(vBVar, "");
                    seticontintlist.setLayoutAnimation = vBVar;
                    seticontintlist.setIconTintList = vi_menuhosthelper__externalsyntheticlambda0.setY;
                    String str = vi_menuhosthelper__externalsyntheticlambda0.setX;
                    pN.setY(str, "");
                    seticontintlist.setUnboundedRipple = str;
                    C0557vz c0557vz4 = vi_menuhosthelper__externalsyntheticlambda0.setLayoutAnimation;
                    pN.setY(c0557vz4, "");
                    C0558vz$MenuHostHelper$$ExternalSyntheticLambda0 c0558vz$MenuHostHelper$$ExternalSyntheticLambda02 = new C0558vz$MenuHostHelper$$ExternalSyntheticLambda0();
                    C0348oi.setIconTintList((Collection) c0558vz$MenuHostHelper$$ExternalSyntheticLambda02.MenuHostHelper$$ExternalSyntheticLambda1, (Object[]) c0557vz4.setIconTintList);
                    seticontintlist.setOnLongClickListener = c0558vz$MenuHostHelper$$ExternalSyntheticLambda02;
                    seticontintlist.setY = new setY(MenuHostHelper$$ExternalSyntheticLambda1, y, y2);
                    seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 = vi_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0;
                    seticontintlist.setIconSize = vi_menuhosthelper__externalsyntheticlambda0.setNavigationOnClickListener;
                    seticontintlist.setCenterIfNoTextEnabled = vi_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                    vJ MenuHostHelper$$ExternalSyntheticLambda13 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1();
                    pN.setY(vEVar, "");
                    pN.setY(MenuHostHelper$$ExternalSyntheticLambda13, "");
                    if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) vi_menuhosthelper__externalsyntheticlambda0.setUiOptions, (Object) vEVar.setLayoutAnimation.toString()) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) vi_menuhosthelper__externalsyntheticlambda0.setOnLongClickListener, (Object) vEVar.setX)) {
                        vi$MenuHostHelper$$ExternalSyntheticLambda1 vi_menuhosthelper__externalsyntheticlambda1 = setY;
                        C0557vz c0557vz5 = vi_menuhosthelper__externalsyntheticlambda0.setUnboundedRipple;
                        pN.setY(MenuHostHelper$$ExternalSyntheticLambda13, "");
                        pN.setY(c0557vz5, "");
                        pN.setY(vEVar, "");
                        Set<String> y3 = vi$MenuHostHelper$$ExternalSyntheticLambda1.setY(MenuHostHelper$$ExternalSyntheticLambda13.setNavigationOnClickListener);
                        if (!(y3 instanceof Collection) || !y3.isEmpty()) {
                            for (String str2 : y3) {
                                List<String> MenuHostHelper$$ExternalSyntheticLambda14 = c0557vz5.MenuHostHelper$$ExternalSyntheticLambda1(str2);
                                pN.setY(str2, "");
                                if (!pN.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda14, vEVar.setY.MenuHostHelper$$ExternalSyntheticLambda1(str2))) {
                                    z = false;
                                    break;
                                }
                            }
                        }
                        z = true;
                        if (z) {
                            z2 = true;
                        }
                    }
                    if (z2) {
                        return MenuHostHelper$$ExternalSyntheticLambda13;
                    }
                    vH vHVar = MenuHostHelper$$ExternalSyntheticLambda13.setIconTintList;
                    if (vHVar != null) {
                        vL.MenuHostHelper$$ExternalSyntheticLambda1(vHVar);
                    }
                    return null;
                } catch (IOException unused) {
                    vL.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final vQ MenuHostHelper$$ExternalSyntheticLambda0(vJ vJVar) {
        vP.setY sety;
        pN.setY(vJVar, "");
        String str = vJVar.setCenterIfNoTextEnabled.setX;
        C0572wl c0572wl = C0572wl.MenuHostHelper$$ExternalSyntheticLambda1;
        if (!C0572wl.MenuHostHelper$$ExternalSyntheticLambda1(vJVar.setCenterIfNoTextEnabled.setX)) {
            if (!pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, (Object) "GET")) {
                return null;
            }
            vi$MenuHostHelper$$ExternalSyntheticLambda1 vi_menuhosthelper__externalsyntheticlambda1 = setY;
            pN.setY(vJVar, "");
            if (vi$MenuHostHelper$$ExternalSyntheticLambda1.setY(vJVar.setNavigationOnClickListener).contains("*")) {
                return null;
            }
            vi$MenuHostHelper$$ExternalSyntheticLambda0 vi_menuhosthelper__externalsyntheticlambda0 = new vi$MenuHostHelper$$ExternalSyntheticLambda0(vJVar);
            try {
                vP vPVar = this.setIconTintList;
                C0555vx c0555vx = vJVar.setCenterIfNoTextEnabled.setLayoutAnimation;
                pN.setY(c0555vx, "");
                C0610xu.setX setx = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
                String obj = c0555vx.toString();
                pN.setY(obj, "");
                pN.setY(obj, "");
                byte[] bytes = obj.getBytes(qQ.setIconTintList);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes, "");
                C0610xu c0610xu = new C0610xu(bytes);
                c0610xu.setX = obj;
                sety = vP.setIconTintList(vPVar, c0610xu.MenuHostHelper$$ExternalSyntheticLambda1("MD5").setIconTintList());
                if (sety != null) {
                    try {
                        vi_menuhosthelper__externalsyntheticlambda0.setX(sety);
                        return new setX(this, sety);
                    } catch (IOException unused) {
                        if (sety != null) {
                            try {
                                sety.setIconTintList();
                            } catch (IOException unused2) {
                            }
                        }
                        return null;
                    }
                }
                return null;
            } catch (IOException unused3) {
                sety = null;
            }
        } else {
            try {
                vE vEVar = vJVar.setCenterIfNoTextEnabled;
                pN.setY(vEVar, "");
                vP vPVar2 = this.setIconTintList;
                C0555vx c0555vx2 = vEVar.setLayoutAnimation;
                pN.setY(c0555vx2, "");
                C0610xu.setX setx2 = C0610xu.MenuHostHelper$$ExternalSyntheticLambda0;
                String obj2 = c0555vx2.toString();
                pN.setY(obj2, "");
                pN.setY(obj2, "");
                byte[] bytes2 = obj2.getBytes(qQ.setIconTintList);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) bytes2, "");
                C0610xu c0610xu2 = new C0610xu(bytes2);
                c0610xu2.setX = obj2;
                vPVar2.setX(c0610xu2.MenuHostHelper$$ExternalSyntheticLambda1("MD5").setIconTintList());
            } catch (IOException unused4) {
            }
            return null;
        }
    }
}