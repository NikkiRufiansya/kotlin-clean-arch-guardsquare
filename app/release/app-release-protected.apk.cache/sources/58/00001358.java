package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import javax.annotation.Nullable;
import o.C0555vx;
import o.C0623yg;
import o.InterfaceC0541vk;
import o.vE;
import o.vJ;

/* renamed from: o.yb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0618yb<T> implements xT<T> {
    private final Object[] MenuHostHelper$$ExternalSyntheticLambda0;
    @Nullable
    private Throwable MenuHostHelper$$ExternalSyntheticLambda1;
    private final InterfaceC0541vk.setY setIconTintList;
    private final xU<vH, T> setOnLongClickListener;
    @Nullable
    private InterfaceC0541vk setUiOptions;
    private final C0625yi setUnboundedRipple;
    private volatile boolean setX;
    private boolean setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0618yb(C0625yi c0625yi, Object[] objArr, InterfaceC0541vk.setY sety, xU<vH, T> xUVar) {
        this.setUnboundedRipple = c0625yi;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = objArr;
        this.setIconTintList = sety;
        this.setOnLongClickListener = xUVar;
    }

    @Override // o.xT
    public final vE setX() {
        vE iconTintList;
        synchronized (this) {
            try {
                iconTintList = setUnboundedRipple().setIconTintList();
            } catch (IOException e) {
                throw new RuntimeException("Unable to create request.", e);
            }
        }
        return iconTintList;
    }

    private InterfaceC0541vk setUnboundedRipple() {
        InterfaceC0541vk interfaceC0541vk = this.setUiOptions;
        if (interfaceC0541vk != null) {
            return interfaceC0541vk;
        }
        Throwable th = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            InterfaceC0541vk MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
            this.setUiOptions = MenuHostHelper$$ExternalSyntheticLambda1;
            return MenuHostHelper$$ExternalSyntheticLambda1;
        } catch (IOException | Error | RuntimeException e) {
            C0629ym.setX(e);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = e;
            throw e;
        }
    }

    @Override // o.xT
    public final void MenuHostHelper$$ExternalSyntheticLambda0(final xR<T> xRVar) {
        InterfaceC0541vk interfaceC0541vk;
        Throwable th;
        Objects.requireNonNull(xRVar, "callback == null");
        synchronized (this) {
            if (this.setY) {
                throw new IllegalStateException("Already executed.");
            }
            this.setY = true;
            interfaceC0541vk = this.setUiOptions;
            th = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (interfaceC0541vk == null && th == null) {
                InterfaceC0541vk MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
                this.setUiOptions = MenuHostHelper$$ExternalSyntheticLambda1;
                interfaceC0541vk = MenuHostHelper$$ExternalSyntheticLambda1;
            }
        }
        if (th != null) {
            xRVar.MenuHostHelper$$ExternalSyntheticLambda1(this, th);
            return;
        }
        if (this.setX) {
            interfaceC0541vk.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        InterfaceC0537vg interfaceC0537vg = new InterfaceC0537vg() { // from class: o.yb.5
            @Override // o.InterfaceC0537vg
            public final void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0541vk interfaceC0541vk2, vJ vJVar) {
                try {
                    try {
                        xRVar.setY(C0618yb.this, C0618yb.this.MenuHostHelper$$ExternalSyntheticLambda0(vJVar));
                    } catch (Throwable th2) {
                        C0629ym.setX(th2);
                        th2.printStackTrace();
                    }
                } catch (Throwable th3) {
                    C0629ym.setX(th3);
                    try {
                        xRVar.MenuHostHelper$$ExternalSyntheticLambda1(C0618yb.this, th3);
                    } catch (Throwable th4) {
                        C0629ym.setX(th4);
                        th4.printStackTrace();
                    }
                }
            }

            @Override // o.InterfaceC0537vg
            public final void MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0541vk interfaceC0541vk2, IOException iOException) {
                try {
                    xRVar.MenuHostHelper$$ExternalSyntheticLambda1(C0618yb.this, iOException);
                } catch (Throwable th2) {
                    C0629ym.setX(th2);
                    th2.printStackTrace();
                }
            }
        };
        eA eAVar = new eA();
        interfaceC0541vk.setY(new dL(interfaceC0537vg, C0126eg.setIconTintList(), eAVar, eAVar.MenuHostHelper$$ExternalSyntheticLambda0));
    }

    private InterfaceC0541vk MenuHostHelper$$ExternalSyntheticLambda1() {
        C0555vx y;
        InterfaceC0541vk.setY sety = this.setIconTintList;
        C0625yi c0625yi = this.setUnboundedRipple;
        Object[] objArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        AbstractC0621ye<?>[] abstractC0621yeArr = c0625yi.setUnboundedRipple;
        int length = objArr.length;
        if (length != abstractC0621yeArr.length) {
            StringBuilder sb = new StringBuilder("Argument count (");
            sb.append(length);
            sb.append(") doesn't match expected count (");
            sb.append(abstractC0621yeArr.length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        C0623yg c0623yg = new C0623yg(c0625yi.setX, c0625yi.MenuHostHelper$$ExternalSyntheticLambda0, c0625yi.setIconSize, c0625yi.setIconTintList, c0625yi.MenuHostHelper$$ExternalSyntheticLambda1, c0625yi.setY, c0625yi.setOnLongClickListener, c0625yi.setUiOptions);
        if (c0625yi.setNavigationOnClickListener) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            abstractC0621yeArr[i].setY(c0623yg, objArr[i]);
        }
        C0555vx.setIconTintList seticontintlist = c0623yg.ViewPager$SavedState$1;
        if (seticontintlist != null) {
            y = seticontintlist.setY();
        } else {
            C0555vx c0555vx = c0623yg.setX;
            String str = c0623yg.setUnboundedRipple;
            pN.setY(str, "");
            C0555vx.setIconTintList y2 = c0555vx.setY(str);
            y = y2 != null ? y2.setY() : null;
            if (y == null) {
                StringBuilder sb2 = new StringBuilder("Malformed URL. Base: ");
                sb2.append(c0623yg.setX);
                sb2.append(", Relative: ");
                sb2.append(c0623yg.setUnboundedRipple);
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        C0623yg.setIconTintList seticontintlist2 = c0623yg.setY;
        if (seticontintlist2 == null) {
            C0553vv$MenuHostHelper$$ExternalSyntheticLambda1 c0553vv$MenuHostHelper$$ExternalSyntheticLambda1 = c0623yg.MenuHostHelper$$ExternalSyntheticLambda1;
            if (c0553vv$MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                vC$MenuHostHelper$$ExternalSyntheticLambda1 vc_menuhosthelper__externalsyntheticlambda1 = c0623yg.setNavigationOnClickListener;
                if (vc_menuhosthelper__externalsyntheticlambda1 == null) {
                    if (c0623yg.setLayoutAnimation) {
                        seticontintlist2 = vF.MenuHostHelper$$ExternalSyntheticLambda1(new byte[0]);
                    }
                } else if (!(!vc_menuhosthelper__externalsyntheticlambda1.setY.isEmpty())) {
                    throw new IllegalStateException("Multipart body must have at least one part.".toString());
                } else {
                    seticontintlist2 = new vC(vc_menuhosthelper__externalsyntheticlambda1.setIconTintList, vc_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1, vL.MenuHostHelper$$ExternalSyntheticLambda0(vc_menuhosthelper__externalsyntheticlambda1.setY));
                }
            } else {
                seticontintlist2 = new C0552vv(c0553vv$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1, c0553vv$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList);
            }
        }
        vA vAVar = c0623yg.setIconTintList;
        if (vAVar != null) {
            if (seticontintlist2 != null) {
                seticontintlist2 = new C0623yg.setIconTintList(seticontintlist2, vAVar);
            } else {
                c0623yg.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1("Content-Type", vAVar.toString());
            }
        }
        vE.setIconTintList seticontintlist3 = c0623yg.setCenterIfNoTextEnabled;
        pN.setY(y, "");
        seticontintlist3.setY = y;
        return sety.MenuHostHelper$$ExternalSyntheticLambda0(seticontintlist3.setX(c0623yg.setUiOptions.setX()).MenuHostHelper$$ExternalSyntheticLambda1(c0623yg.setOnLongClickListener, seticontintlist2).MenuHostHelper$$ExternalSyntheticLambda0(C0617ya.class, new C0617ya(c0625yi.setLayoutAnimation, arrayList)).setX());
    }

    @Override // o.xT
    public final void setIconTintList() {
        InterfaceC0541vk interfaceC0541vk;
        this.setX = true;
        synchronized (this) {
            interfaceC0541vk = this.setUiOptions;
        }
        if (interfaceC0541vk != null) {
            interfaceC0541vk.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x000f, code lost:
        if (r0.setY() != false) goto L11;
     */
    @Override // o.xT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        /*
            r2 = this;
            boolean r0 = r2.setX
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            monitor-enter(r2)
            o.vk r0 = r2.setUiOptions     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            boolean r0 = r0.setY()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            monitor-exit(r2)
            return r1
        L15:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0618yb.MenuHostHelper$$ExternalSyntheticLambda0():boolean");
    }

    public final /* synthetic */ Object clone() {
        return new C0618yb(this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList, this.setOnLongClickListener);
    }

    @Override // o.xT
    public final /* synthetic */ xT setY() {
        return new C0618yb(this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList, this.setOnLongClickListener);
    }

    final C0622yf<T> MenuHostHelper$$ExternalSyntheticLambda0(vJ vJVar) {
        vH vHVar = vJVar.setIconTintList;
        vJ.setIconTintList seticontintlist = new vJ.setIconTintList(vJVar);
        seticontintlist.setY = new vH(vHVar.MenuHostHelper$$ExternalSyntheticLambda0(), vHVar.setIconTintList()) { // from class: o.yb$MenuHostHelper$$ExternalSyntheticLambda0
            private final long MenuHostHelper$$ExternalSyntheticLambda1;
            @Nullable
            private final vA setX;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.setX = r1;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = r2;
            }

            @Override // o.vH
            public final vA MenuHostHelper$$ExternalSyntheticLambda0() {
                return this.setX;
            }

            @Override // o.vH
            public final long setIconTintList() {
                return this.MenuHostHelper$$ExternalSyntheticLambda1;
            }

            @Override // o.vH
            public final InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda1() {
                throw new IllegalStateException("Cannot read raw response body of a converted body.");
            }
        };
        vJ MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1();
        int i = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i < 200 || i >= 300) {
            try {
                return C0622yf.setIconTintList(C0629ym.setY(vHVar), MenuHostHelper$$ExternalSyntheticLambda1);
            } finally {
                vHVar.close();
            }
        } else if (i == 204 || i == 205) {
            vHVar.close();
            return C0622yf.MenuHostHelper$$ExternalSyntheticLambda0(null, MenuHostHelper$$ExternalSyntheticLambda1);
        } else {
            yb$MenuHostHelper$$ExternalSyntheticLambda1 yb_menuhosthelper__externalsyntheticlambda1 = new yb$MenuHostHelper$$ExternalSyntheticLambda1(vHVar);
            try {
                return C0622yf.MenuHostHelper$$ExternalSyntheticLambda0(this.setOnLongClickListener.setY(yb_menuhosthelper__externalsyntheticlambda1), MenuHostHelper$$ExternalSyntheticLambda1);
            } catch (RuntimeException e) {
                IOException iOException = yb_menuhosthelper__externalsyntheticlambda1.setY;
                if (iOException == null) {
                    throw e;
                }
                throw iOException;
            }
        }
    }
}