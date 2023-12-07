package o;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import o.C0555vx;

/* loaded from: classes.dex */
public final class vZ implements InterfaceC0541vk {
    public static final int setIconSize = 244;
    public volatile boolean MenuHostHelper$$ExternalSyntheticLambda0;
    C0563wd MenuHostHelper$$ExternalSyntheticLambda1;
    public final setY ViewPager$SavedState$1;
    private boolean setAnimationFromJson;
    public boolean setCenterIfNoTextEnabled;
    private Object setChipCornerRadius;
    public final vD setIconTintList;
    public C0560wa setLayoutAnimation;
    private boolean setMaxEms;
    public boolean setNavigationOnClickListener;
    public final vE setOnLongClickListener;
    private volatile C0560wa setOnNavigationItemSelectedListener;
    public boolean setTextAlignment;
    private final AtomicBoolean setTextScaleX;
    public final AbstractC0549vs setUiOptions;
    public C0561wb setUnboundedRipple;
    public final C0564we setX;
    volatile C0563wd setY;

    public vZ(vD vDVar, vE vEVar, boolean z) {
        pN.setY(vDVar, "");
        pN.setY(vEVar, "");
        this.setIconTintList = vDVar;
        this.setOnLongClickListener = vEVar;
        this.setMaxEms = z;
        this.setX = vDVar.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setUiOptions = vDVar.setCenterIfNoTextEnabled.setX(this);
        setY sety = new setY();
        sety.setY(vDVar.setY, TimeUnit.MILLISECONDS);
        nX nXVar = nX.setX;
        this.ViewPager$SavedState$1 = sety;
        this.setTextScaleX = new AtomicBoolean();
        this.setAnimationFromJson = true;
    }

    /* loaded from: classes.dex */
    public static final class setY extends C0603xp {
        setY() {
        }

        @Override // o.C0603xp
        public final void setY() {
            vZ.this.MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    @Override // o.InterfaceC0541vk
    public final vE setIconTintList() {
        return this.setOnLongClickListener;
    }

    @Override // o.InterfaceC0541vk
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        Socket socket;
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        C0560wa c0560wa = this.setOnNavigationItemSelectedListener;
        if (c0560wa != null) {
            c0560wa.setY.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        C0563wd c0563wd = this.setY;
        if (c0563wd != null && (socket = c0563wd.setUnboundedRipple) != null) {
            vL.MenuHostHelper$$ExternalSyntheticLambda0(socket);
        }
        AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda1(this);
    }

    @Override // o.InterfaceC0541vk
    public final boolean setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.InterfaceC0541vk
    public final vJ MenuHostHelper$$ExternalSyntheticLambda0() {
        wR wRVar;
        if (this.setTextScaleX.compareAndSet(false, true)) {
            this.ViewPager$SavedState$1.setIconTintList();
            wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
            wRVar = wR.MenuHostHelper$$ExternalSyntheticLambda1;
            this.setChipCornerRadius = wRVar.MenuHostHelper$$ExternalSyntheticLambda0("response.body().close()");
            AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda0(this);
            try {
                C0547vq c0547vq = this.setIconTintList.setOnLongClickListener;
                synchronized (c0547vq) {
                    pN.setY(this, "");
                    c0547vq.setX.add(this);
                }
                return setX();
            } finally {
                C0547vq c0547vq2 = this.setIconTintList.setOnLongClickListener;
                pN.setY(this, "");
                c0547vq2.setX(c0547vq2.setX, this);
            }
        }
        throw new IllegalStateException("Already Executed".toString());
    }

    @Override // o.InterfaceC0541vk
    public final void setY(InterfaceC0537vg interfaceC0537vg) {
        wR wRVar;
        vZ$MenuHostHelper$$ExternalSyntheticLambda1 vz_menuhosthelper__externalsyntheticlambda1;
        pN.setY(interfaceC0537vg, "");
        if (!this.setTextScaleX.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed".toString());
        }
        wR$MenuHostHelper$$ExternalSyntheticLambda1 wr_menuhosthelper__externalsyntheticlambda1 = wR.setX;
        wRVar = wR.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setChipCornerRadius = wRVar.MenuHostHelper$$ExternalSyntheticLambda0("response.body().close()");
        AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda0(this);
        C0547vq c0547vq = this.setIconTintList.setOnLongClickListener;
        vZ$MenuHostHelper$$ExternalSyntheticLambda1 vz_menuhosthelper__externalsyntheticlambda12 = new vZ$MenuHostHelper$$ExternalSyntheticLambda1(this, interfaceC0537vg);
        pN.setY(vz_menuhosthelper__externalsyntheticlambda12, "");
        synchronized (c0547vq) {
            c0547vq.MenuHostHelper$$ExternalSyntheticLambda0.add(vz_menuhosthelper__externalsyntheticlambda12);
            if (!vz_menuhosthelper__externalsyntheticlambda12.setY.setMaxEms) {
                String str = vz_menuhosthelper__externalsyntheticlambda12.setY.setOnLongClickListener.setLayoutAnimation.setY;
                Iterator<vZ$MenuHostHelper$$ExternalSyntheticLambda1> it = c0547vq.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
                while (true) {
                    if (it.hasNext()) {
                        vz_menuhosthelper__externalsyntheticlambda1 = it.next();
                        if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) vz_menuhosthelper__externalsyntheticlambda1.setY.setOnLongClickListener.setLayoutAnimation.setY, (Object) str)) {
                            break;
                        }
                    } else {
                        Iterator<vZ$MenuHostHelper$$ExternalSyntheticLambda1> it2 = c0547vq.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                vz_menuhosthelper__externalsyntheticlambda1 = null;
                                break;
                            }
                            vz_menuhosthelper__externalsyntheticlambda1 = it2.next();
                            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) vz_menuhosthelper__externalsyntheticlambda1.setY.setOnLongClickListener.setLayoutAnimation.setY, (Object) str)) {
                                break;
                            }
                        }
                    }
                }
                if (vz_menuhosthelper__externalsyntheticlambda1 != null) {
                    pN.setY(vz_menuhosthelper__externalsyntheticlambda1, "");
                    vz_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1 = vz_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1;
                }
            }
            nX nXVar = nX.setX;
        }
        c0547vq.setX();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.vJ setX() {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            o.vD r1 = r10.setIconTintList
            java.util.List<o.vw> r1 = r1.setChipCornerRadius
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            o.C0348oi.setY(r0, r1)
            o.wr r1 = new o.wr
            o.vD r2 = r10.setIconTintList
            r1.<init>(r2)
            r0.add(r1)
            o.wh r1 = new o.wh
            o.vD r2 = r10.setIconTintList
            o.vr r2 = r2.setUiOptions
            r1.<init>(r2)
            r0.add(r1)
            o.vN r1 = new o.vN
            o.vD r2 = r10.setIconTintList
            o.vi r2 = r2.setX
            r1.<init>(r2)
            r0.add(r1)
            o.vX r1 = o.vX.setY
            r0.add(r1)
            boolean r1 = r10.setMaxEms
            if (r1 != 0) goto L48
            o.vD r1 = r10.setIconTintList
            java.util.List<o.vw> r1 = r1.setAnimationFromJson
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            o.C0348oi.setY(r0, r1)
        L48:
            o.wk r1 = new o.wk
            boolean r2 = r10.setMaxEms
            r1.<init>(r2)
            r0.add(r1)
            o.vE r6 = r10.setOnLongClickListener
            o.vD r0 = r10.setIconTintList
            int r7 = r0.setNavigationOnClickListener
            o.vD r0 = r10.setIconTintList
            int r8 = r0.setTextAppearanceResource
            o.vD r0 = r10.setIconTintList
            int r9 = r0.setHasDecor
            o.wp r0 = new o.wp
            r4 = 0
            r5 = 0
            r1 = r0
            r2 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r1 = 0
            r2 = 1
            r3 = 0
            o.vE r4 = r10.setOnLongClickListener     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            o.vJ r0 = r0.MenuHostHelper$$ExternalSyntheticLambda0(r4)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            boolean r4 = r10.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            if (r4 != 0) goto L7a
            r10.MenuHostHelper$$ExternalSyntheticLambda0(r1)
            return r0
        L7a:
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            o.vL.MenuHostHelper$$ExternalSyntheticLambda1(r0)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r4 = "Canceled"
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            throw r0     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
        L89:
            r0 = move-exception
            r2 = 0
            goto L9f
        L8c:
            r0 = move-exception
            java.io.IOException r0 = r10.MenuHostHelper$$ExternalSyntheticLambda0(r0)     // Catch: java.lang.Throwable -> L9e
            if (r0 != 0) goto L9b
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L9e
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Throwable"
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9e
            throw r0     // Catch: java.lang.Throwable -> L9e
        L9b:
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L9e
            throw r0     // Catch: java.lang.Throwable -> L9e
        L9e:
            r0 = move-exception
        L9f:
            if (r2 != 0) goto La4
            r10.MenuHostHelper$$ExternalSyntheticLambda0(r1)
        La4:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vZ.setX():o.vJ");
    }

    public final C0560wa MenuHostHelper$$ExternalSyntheticLambda0(C0576wp c0576wp) {
        pN.setY(c0576wp, "");
        synchronized (this) {
            if (!this.setAnimationFromJson) {
                throw new IllegalStateException("released".toString());
            }
            if (!(!this.setCenterIfNoTextEnabled)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (!(!this.setNavigationOnClickListener)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            nX nXVar = nX.setX;
        }
        C0561wb c0561wb = this.setUnboundedRipple;
        pN.setX(c0561wb);
        C0560wa c0560wa = new C0560wa(this, this.setUiOptions, c0561wb, c0561wb.setIconTintList(this.setIconTintList, c0576wp));
        this.setLayoutAnimation = c0560wa;
        this.setOnNavigationItemSelectedListener = c0560wa;
        synchronized (this) {
            this.setNavigationOnClickListener = true;
            this.setCenterIfNoTextEnabled = true;
            nX nXVar2 = nX.setX;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            throw new IOException("Canceled");
        }
        return c0560wa;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001f, code lost:
        if (r2.setCenterIfNoTextEnabled != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <E extends java.io.IOException> E MenuHostHelper$$ExternalSyntheticLambda0(o.C0560wa r3, boolean r4, boolean r5, E r6) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            o.pN.setY(r3, r0)
            o.wa r0 = r2.setOnNavigationItemSelectedListener
            boolean r3 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r3, r0)
            r0 = 1
            r3 = r3 ^ r0
            if (r3 == 0) goto L10
            return r6
        L10:
            monitor-enter(r2)
            r3 = 0
            if (r4 == 0) goto L1b
            boolean r1 = r2.setNavigationOnClickListener     // Catch: java.lang.Throwable -> L19
            if (r1 != 0) goto L21
            goto L1b
        L19:
            r3 = move-exception
            goto L62
        L1b:
            if (r5 == 0) goto L42
            boolean r1 = r2.setCenterIfNoTextEnabled     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L42
        L21:
            if (r4 == 0) goto L25
            r2.setNavigationOnClickListener = r3     // Catch: java.lang.Throwable -> L19
        L25:
            if (r5 == 0) goto L29
            r2.setCenterIfNoTextEnabled = r3     // Catch: java.lang.Throwable -> L19
        L29:
            boolean r4 = r2.setNavigationOnClickListener     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L33
            boolean r5 = r2.setCenterIfNoTextEnabled     // Catch: java.lang.Throwable -> L19
            if (r5 != 0) goto L33
            r5 = 1
            goto L34
        L33:
            r5 = 0
        L34:
            if (r4 != 0) goto L41
            boolean r4 = r2.setCenterIfNoTextEnabled     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L41
            boolean r4 = r2.setAnimationFromJson     // Catch: java.lang.Throwable -> L19
            if (r4 != 0) goto L41
            r3 = r5
            r4 = 1
            goto L43
        L41:
            r3 = r5
        L42:
            r4 = 0
        L43:
            o.nX r5 = o.nX.setX     // Catch: java.lang.Throwable -> L19
            monitor-exit(r2)
            if (r3 == 0) goto L5a
            r3 = 0
            r2.setOnNavigationItemSelectedListener = r3
            o.wd r3 = r2.MenuHostHelper$$ExternalSyntheticLambda1
            if (r3 == 0) goto L5a
            monitor-enter(r3)
            int r5 = r3.setTextScaleX     // Catch: java.lang.Throwable -> L57
            int r5 = r5 + r0
            r3.setTextScaleX = r5     // Catch: java.lang.Throwable -> L57
            monitor-exit(r3)
            goto L5a
        L57:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        L5a:
            if (r4 == 0) goto L61
            java.io.IOException r3 = r2.setY(r6)
            return r3
        L61:
            return r6
        L62:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vZ.MenuHostHelper$$ExternalSyntheticLambda0(o.wa, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException MenuHostHelper$$ExternalSyntheticLambda0(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.setAnimationFromJson) {
                this.setAnimationFromJson = false;
                if (!this.setNavigationOnClickListener && !this.setCenterIfNoTextEnabled) {
                    z = true;
                }
            }
            nX nXVar = nX.setX;
        }
        return z ? setY((vZ) iOException) : iOException;
    }

    public final Socket setNavigationOnClickListener() {
        C0563wd c0563wd = this.MenuHostHelper$$ExternalSyntheticLambda1;
        pN.setX(c0563wd);
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        List<Reference<vZ>> list = c0563wd.setX;
        Iterator<Reference<vZ>> it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (pN.MenuHostHelper$$ExternalSyntheticLambda0(it.next().get(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (!(i != -1)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        list.remove(i);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        if (list.isEmpty()) {
            c0563wd.MenuHostHelper$$ExternalSyntheticLambda0 = System.nanoTime();
            if (this.setX.MenuHostHelper$$ExternalSyntheticLambda1(c0563wd)) {
                Socket socket = c0563wd.setCenterIfNoTextEnabled;
                pN.setX(socket);
                return socket;
            }
        }
        return null;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        C0560wa c0560wa;
        synchronized (this) {
            if (!this.setAnimationFromJson) {
                throw new IllegalStateException("released".toString());
            }
            nX nXVar = nX.setX;
        }
        if (z && (c0560wa = this.setOnNavigationItemSelectedListener) != null) {
            c0560wa.setY.MenuHostHelper$$ExternalSyntheticLambda1();
            c0560wa.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(c0560wa, true, true, null);
        }
        this.setLayoutAnimation = null;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(C0563wd c0563wd) {
        pN.setY(c0563wd, "");
        boolean z = vL.MenuHostHelper$$ExternalSyntheticLambda0;
        if (!(this.MenuHostHelper$$ExternalSyntheticLambda1 == null)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0563wd;
        c0563wd.setX.add(new vZ$MenuHostHelper$$ExternalSyntheticLambda0(this, this.setChipCornerRadius));
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final <E extends java.io.IOException> E setY(E r5) {
        /*
            r4 = this;
            boolean r0 = o.vL.MenuHostHelper$$ExternalSyntheticLambda0
            o.wd r0 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            r1 = 0
            if (r0 == 0) goto L3a
            boolean r2 = o.vL.MenuHostHelper$$ExternalSyntheticLambda0
            monitor-enter(r0)
            java.net.Socket r2 = r4.setNavigationOnClickListener()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r0)
            o.wd r3 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            if (r3 != 0) goto L21
            if (r2 == 0) goto L18
            o.vL.MenuHostHelper$$ExternalSyntheticLambda0(r2)
        L18:
            r2 = r4
            o.vk r2 = (o.InterfaceC0541vk) r2
            o.vo r0 = (o.InterfaceC0545vo) r0
            o.AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda1(r2, r0)
            goto L3a
        L21:
            if (r2 != 0) goto L25
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            if (r0 == 0) goto L29
            goto L3a
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Check failed."
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            throw r5
        L37:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        L3a:
            boolean r0 = r4.setTextAlignment
            if (r0 == 0) goto L3f
            goto L50
        L3f:
            o.vZ$setY r0 = r4.ViewPager$SavedState$1
            boolean r2 = r0.setIconTintList
            if (r2 != 0) goto L46
            goto L4e
        L46:
            r0.setIconTintList = r1
            o.xp$setX r1 = o.C0603xp.setX
            boolean r1 = o.C0603xp.setX.setY(r0)
        L4e:
            if (r1 != 0) goto L52
        L50:
            r0 = r5
            goto L63
        L52:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r5 == 0) goto L61
            r1 = r5
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.initCause(r1)
        L61:
            java.io.IOException r0 = (java.io.IOException) r0
        L63:
            if (r5 == 0) goto L6f
            r5 = r4
            o.vk r5 = (o.InterfaceC0541vk) r5
            o.pN.setX(r0)
            o.AbstractC0549vs.setY(r5, r0)
            goto L75
        L6f:
            r5 = r4
            o.vk r5 = (o.InterfaceC0541vk) r5
            o.AbstractC0549vs.setX(r5)
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.vZ.setY(java.io.IOException):java.io.IOException");
    }

    public static final /* synthetic */ String setY(vZ vZVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(vZVar.MenuHostHelper$$ExternalSyntheticLambda0 ? "canceled " : "");
        sb.append(vZVar.setMaxEms ? "web socket" : "call");
        sb.append(" to ");
        C0555vx.setIconTintList y = vZVar.setOnLongClickListener.setLayoutAnimation.setY("/...");
        pN.setX(y);
        sb.append(y.MenuHostHelper$$ExternalSyntheticLambda0("").MenuHostHelper$$ExternalSyntheticLambda1("").setY().toString());
        return sb.toString();
    }

    public final /* synthetic */ Object clone() {
        return new vZ(this.setIconTintList, this.setOnLongClickListener, this.setMaxEms);
    }
}