package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class uZ implements InterfaceC0531va {
    static final /* synthetic */ AtomicReferenceFieldUpdater MenuHostHelper$$ExternalSyntheticLambda0 = AtomicReferenceFieldUpdater.newUpdater(uZ.class, Object.class, "_state");
    volatile /* synthetic */ Object _state;

    public uZ(boolean z) {
        this._state = z ? C0534vd.setX : C0534vd.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* loaded from: classes.dex */
    static final class setY extends pO implements InterfaceC0377pk<Throwable, nX> {
        private /* synthetic */ Object setX = null;

        setY(Object obj) {
            super(1);
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ nX setX(Throwable th) {
            uZ.this.setIconTintList(this.setX);
            return nX.setX;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends C0515ul {
        public volatile Object owner;

        public setIconTintList(Object obj) {
            this.owner = obj;
        }

        @Override // o.C0518uo
        public final String toString() {
            StringBuilder sb = new StringBuilder("LockedQueue[");
            sb.append(this.owner);
            sb.append(']');
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX extends tY<uZ> {
        private setIconTintList setIconTintList;

        @Override // o.tY
        public final /* synthetic */ Object setX(uZ uZVar) {
            Object obj;
            C0528uy c0528uy;
            setIconTintList seticontintlist = this.setIconTintList;
            while (true) {
                obj = seticontintlist._next;
                if (!(obj instanceof AbstractC0524uu)) {
                    break;
                }
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist);
            }
            if (obj == seticontintlist) {
                return null;
            }
            c0528uy = C0534vd.setY;
            return c0528uy;
        }

        @Override // o.tY
        public final /* synthetic */ void setX(uZ uZVar, Object obj) {
            uZ uZVar2 = uZVar;
            Object obj2 = obj == null ? C0534vd.MenuHostHelper$$ExternalSyntheticLambda1 : this.setIconTintList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = uZ.MenuHostHelper$$ExternalSyntheticLambda0;
            while (!atomicReferenceFieldUpdater.compareAndSet(uZVar2, this, obj2) && atomicReferenceFieldUpdater.get(uZVar2) == this) {
            }
        }

        public setX(setIconTintList seticontintlist) {
            this.setIconTintList = seticontintlist;
        }
    }

    @Override // o.InterfaceC0531va
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        C0528uy c0528uy;
        while (true) {
            Object obj = this._state;
            if (obj instanceof uX) {
                Object obj2 = ((uX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
                c0528uy = C0534vd.MenuHostHelper$$ExternalSyntheticLambda0;
                return obj2 != c0528uy;
            } else if (obj instanceof setIconTintList) {
                return true;
            } else {
                if (!(obj instanceof AbstractC0524uu)) {
                    StringBuilder sb = new StringBuilder("Illegal state ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                }
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }

    @Override // o.InterfaceC0531va
    public final void setIconTintList(Object obj) {
        uX uXVar;
        C0528uy c0528uy;
        C0518uo c0518uo;
        Object obj2;
        C0518uo c0518uo2;
        while (true) {
            Object obj3 = this._state;
            boolean z = false;
            if (obj3 instanceof uX) {
                if (obj == null) {
                    Object obj4 = ((uX) obj3).MenuHostHelper$$ExternalSyntheticLambda0;
                    c0528uy = C0534vd.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (!(obj4 != c0528uy)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    uX uXVar2 = (uX) obj3;
                    if (!(uXVar2.MenuHostHelper$$ExternalSyntheticLambda0 == obj)) {
                        StringBuilder sb = new StringBuilder("Mutex is locked by ");
                        sb.append(uXVar2.MenuHostHelper$$ExternalSyntheticLambda0);
                        sb.append(" but expected ");
                        sb.append(obj);
                        throw new IllegalStateException(sb.toString().toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MenuHostHelper$$ExternalSyntheticLambda0;
                uXVar = C0534vd.MenuHostHelper$$ExternalSyntheticLambda1;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, uXVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else if (obj3 instanceof AbstractC0524uu) {
                ((AbstractC0524uu) obj3).MenuHostHelper$$ExternalSyntheticLambda1(this);
            } else if (obj3 instanceof setIconTintList) {
                if (obj != null) {
                    setIconTintList seticontintlist = (setIconTintList) obj3;
                    if (!(seticontintlist.owner == obj)) {
                        StringBuilder sb2 = new StringBuilder("Mutex is locked by ");
                        sb2.append(seticontintlist.owner);
                        sb2.append(" but expected ");
                        sb2.append(obj);
                        throw new IllegalStateException(sb2.toString().toString());
                    }
                }
                setIconTintList seticontintlist2 = (setIconTintList) obj3;
                while (true) {
                    Object obj5 = seticontintlist2._next;
                    if (!(obj5 instanceof AbstractC0524uu)) {
                        c0518uo = (C0518uo) obj5;
                        if (c0518uo == seticontintlist2) {
                            c0518uo = null;
                            break;
                        } else if (c0518uo.q_()) {
                            break;
                        } else {
                            while (true) {
                                obj2 = c0518uo._next;
                                if (!(obj2 instanceof AbstractC0524uu)) {
                                    break;
                                }
                                ((AbstractC0524uu) obj2).MenuHostHelper$$ExternalSyntheticLambda1(c0518uo);
                            }
                            do {
                                c0518uo2 = ((C0526uw) obj2).setIconTintList;
                                while (true) {
                                    obj2 = c0518uo2._next;
                                    if (!(obj2 instanceof AbstractC0524uu)) {
                                        break;
                                    }
                                    ((AbstractC0524uu) obj2).MenuHostHelper$$ExternalSyntheticLambda1(c0518uo2);
                                }
                            } while (obj2 instanceof C0526uw);
                            c0518uo2.setIconTintList((AbstractC0524uu) null);
                        }
                    } else {
                        ((AbstractC0524uu) obj5).MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist2);
                    }
                }
                if (c0518uo == null) {
                    setX setx = new setX(seticontintlist2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = MenuHostHelper$$ExternalSyntheticLambda0;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj3, setx)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj3) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z && setx.MenuHostHelper$$ExternalSyntheticLambda1(this) == null) {
                        return;
                    }
                } else {
                    uZ$MenuHostHelper$$ExternalSyntheticLambda1 uz_menuhosthelper__externalsyntheticlambda1 = (uZ$MenuHostHelper$$ExternalSyntheticLambda1) c0518uo;
                    if (uz_menuhosthelper__externalsyntheticlambda1.setUnboundedRipple()) {
                        Object obj6 = uz_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (obj6 == null) {
                            obj6 = C0534vd.setIconTintList;
                        }
                        seticontintlist2.owner = obj6;
                        uz_menuhosthelper__externalsyntheticlambda1.setX();
                        return;
                    }
                }
            } else {
                StringBuilder sb3 = new StringBuilder("Illegal state ");
                sb3.append(obj3);
                throw new IllegalStateException(sb3.toString().toString());
            }
        }
    }

    public final String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof uX) {
                StringBuilder sb = new StringBuilder("Mutex[");
                sb.append(((uX) obj).MenuHostHelper$$ExternalSyntheticLambda0);
                sb.append(']');
                return sb.toString();
            } else if (!(obj instanceof AbstractC0524uu)) {
                if (!(obj instanceof setIconTintList)) {
                    StringBuilder sb2 = new StringBuilder("Illegal state ");
                    sb2.append(obj);
                    throw new IllegalStateException(sb2.toString().toString());
                }
                StringBuilder sb3 = new StringBuilder("Mutex[");
                sb3.append(((setIconTintList) obj).owner);
                sb3.append(']');
                return sb3.toString();
            } else {
                ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (r0 == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        return o.nX.setX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        r0 = o.C0443rw.setY(o.oP.setY(r14));
        r1 = r0;
        r7 = new o.uZ$MenuHostHelper$$ExternalSyntheticLambda0(null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
        r8 = r13._state;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
        if ((r8 instanceof o.uX) == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005e, code lost:
        r9 = (o.uX) r8;
        r10 = r9.MenuHostHelper$$ExternalSyntheticLambda0;
        r11 = o.C0534vd.MenuHostHelper$$ExternalSyntheticLambda0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
        if (r10 == r11) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0069, code lost:
        r10 = o.uZ.MenuHostHelper$$ExternalSyntheticLambda0;
        r11 = new o.uZ.setIconTintList(r9.MenuHostHelper$$ExternalSyntheticLambda0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0076, code lost:
        if (r10.compareAndSet(r13, r8, r11) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007c, code lost:
        if (r10.get(r13) == r8) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007f, code lost:
        r9 = o.C0534vd.setX;
        r10 = o.uZ.MenuHostHelper$$ExternalSyntheticLambda0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0089, code lost:
        if (r10.compareAndSet(r13, r8, r9) == false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        if (r10.get(r13) == r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0093, code lost:
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
        if (r8 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0096, code lost:
        r1.setX((o.C0444rx) o.nX.setX, (o.InterfaceC0377pk<? super java.lang.Throwable, o.nX>) new o.uZ.setY(r13, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        if ((r8 instanceof o.uZ.setIconTintList) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a7, code lost:
        r9 = (o.uZ.setIconTintList) r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ac, code lost:
        if (r9.owner == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ae, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b0, code lost:
        r10 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b1, code lost:
        if (r10 == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b3, code lost:
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b6, code lost:
        r11 = r9.setIconTintList((o.AbstractC0524uu) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ba, code lost:
        if (r11 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00bc, code lost:
        r11 = r9._prev;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c0, code lost:
        r11 = (o.C0518uo) r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00c4, code lost:
        if (r11.s_() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c7, code lost:
        r11 = r11._prev;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d0, code lost:
        if (r11.setIconTintList(r10, r9) == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d4, code lost:
        if (r13._state == r8) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00dc, code lost:
        if (o.uZ$MenuHostHelper$$ExternalSyntheticLambda1.setX.compareAndSet(r7, 0, 1) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00de, code lost:
        r7 = new o.uZ$MenuHostHelper$$ExternalSyntheticLambda0(null, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00e5, code lost:
        r1.setIconTintList((o.InterfaceC0377pk<? super java.lang.Throwable, o.nX>) new o.sN(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f1, code lost:
        r0 = r0.MenuHostHelper$$ExternalSyntheticLambda0();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00f7, code lost:
        if (r0 != o.oJ.COROUTINE_SUSPENDED) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00f9, code lost:
        o.pN.setY(r14, "");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0100, code lost:
        if (r0 != o.oJ.COROUTINE_SUSPENDED) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0103, code lost:
        r0 = o.nX.setX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0107, code lost:
        if (r0 != o.oJ.COROUTINE_SUSPENDED) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0109, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x010c, code lost:
        return o.nX.setX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x010d, code lost:
        r14 = new java.lang.StringBuilder("Already locked by ");
        r14.append((java.lang.Object) null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0122, code lost:
        throw new java.lang.IllegalStateException(r14.toString().toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0125, code lost:
        if ((r8 instanceof o.AbstractC0524uu) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0127, code lost:
        ((o.AbstractC0524uu) r8).MenuHostHelper$$ExternalSyntheticLambda1(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x012e, code lost:
        r14 = new java.lang.StringBuilder("Illegal state ");
        r14.append(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0143, code lost:
        throw new java.lang.IllegalStateException(r14.toString().toString());
     */
    @Override // o.InterfaceC0531va
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object MenuHostHelper$$ExternalSyntheticLambda1(o.oK<? super o.nX> r14) {
        /*
            Method dump skipped, instructions count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.uZ.MenuHostHelper$$ExternalSyntheticLambda1(o.oK):java.lang.Object");
    }
}