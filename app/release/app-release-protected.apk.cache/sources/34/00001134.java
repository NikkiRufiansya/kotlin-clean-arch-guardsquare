package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.nR;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class tG<T> extends tJ<tE> implements tC<T>, InterfaceC0491tq<T>, tR<T> {
    private volatile /* synthetic */ Object _state;
    private int setX;

    @Override // o.tJ
    public final /* bridge */ /* synthetic */ tE[] setX() {
        return new tE[2];
    }

    public tG(Object obj) {
        this._state = obj;
    }

    @Override // o.tC
    public final T MenuHostHelper$$ExternalSyntheticLambda0() {
        C0528uy c0528uy = tS.setIconTintList;
        T t = (T) this._state;
        if (t == c0528uy) {
            return null;
        }
        return t;
    }

    @Override // o.tC
    public final void MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        if (t == null) {
            t = (T) tS.setIconTintList;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(t);
    }

    private final boolean MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        int i;
        tE[] navigationOnClickListener;
        C0528uy c0528uy;
        C0528uy c0528uy2;
        C0528uy c0528uy3;
        boolean z;
        C0528uy c0528uy4;
        boolean z2;
        setNavigationOnClickListener();
        synchronized (this) {
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0(this._state, obj)) {
                return true;
            }
            this._state = obj;
            int i2 = this.setX;
            if ((i2 & 1) == 0) {
                int i3 = i2 + 1;
                this.setX = i3;
                tE[] navigationOnClickListener2 = setNavigationOnClickListener();
                nX nXVar = nX.setX;
                while (true) {
                    tE[] tEVarArr = navigationOnClickListener2;
                    if (tEVarArr != null) {
                        for (tE tEVar : tEVarArr) {
                            if (tEVar != null) {
                                while (true) {
                                    Object obj2 = tEVar._state;
                                    if (obj2 != null) {
                                        c0528uy = tI.setX;
                                        if (obj2 != c0528uy) {
                                            c0528uy2 = tI.MenuHostHelper$$ExternalSyntheticLambda0;
                                            if (obj2 == c0528uy2) {
                                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tE.setX;
                                                c0528uy3 = tI.setX;
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater.compareAndSet(tEVar, obj2, c0528uy3)) {
                                                        z = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater.get(tEVar) != obj2) {
                                                        z = false;
                                                        break;
                                                    }
                                                }
                                                if (z) {
                                                    break;
                                                }
                                            } else {
                                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = tE.setX;
                                                c0528uy4 = tI.MenuHostHelper$$ExternalSyntheticLambda0;
                                                while (true) {
                                                    if (atomicReferenceFieldUpdater2.compareAndSet(tEVar, obj2, c0528uy4)) {
                                                        z2 = true;
                                                        break;
                                                    } else if (atomicReferenceFieldUpdater2.get(tEVar) != obj2) {
                                                        z2 = false;
                                                        break;
                                                    }
                                                }
                                                if (z2) {
                                                    nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                                                    ((C0444rx) obj2).MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(nX.setX));
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    synchronized (this) {
                        i = this.setX;
                        if (i == i3) {
                            this.setX = i3 + 1;
                            return true;
                        }
                        navigationOnClickListener = setNavigationOnClickListener();
                        nX nXVar2 = nX.setX;
                    }
                    navigationOnClickListener2 = navigationOnClickListener;
                    i3 = i;
                }
            } else {
                this.setX = i2 + 2;
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ce, code lost:
        r11 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
        if (o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r0, r2) != false) goto L27;
     */
    /* JADX WARN: Not initialized variable reg: 10, insn: 0x016b: MOVE  (r2 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:85:0x016b */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:14:0x0042, B:43:0x00bc, B:45:0x00c0, B:48:0x00c7, B:49:0x00cb, B:51:0x00ce, B:61:0x00ef, B:66:0x010b, B:67:0x012f, B:73:0x013f, B:74:0x014f, B:76:0x0157, B:77:0x015c, B:80:0x0161, B:70:0x0137, B:53:0x00d4, B:57:0x00db, B:17:0x0048, B:18:0x004c, B:22:0x0067, B:25:0x006d, B:26:0x0071, B:28:0x0080, B:42:0x00ab, B:31:0x0085, B:32:0x0089), top: B:92:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ed A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x010b A[Catch: all -> 0x008a, TryCatch #0 {all -> 0x008a, blocks: (B:14:0x0042, B:43:0x00bc, B:45:0x00c0, B:48:0x00c7, B:49:0x00cb, B:51:0x00ce, B:61:0x00ef, B:66:0x010b, B:67:0x012f, B:73:0x013f, B:74:0x014f, B:76:0x0157, B:77:0x015c, B:80:0x0161, B:70:0x0137, B:53:0x00d4, B:57:0x00db, B:17:0x0048, B:18:0x004c, B:22:0x0067, B:25:0x006d, B:26:0x0071, B:28:0x0080, B:42:0x00ab, B:31:0x0085, B:32:0x0089), top: B:92:0x0028 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:84:0x0168 -> B:43:0x00bc). Please submit an issue!!! */
    @Override // o.tA, o.InterfaceC0492tr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object setIconTintList(o.InterfaceC0498tx<? super T> r18, o.oK<?> r19) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.tG.setIconTintList(o.tx, o.oK):java.lang.Object");
    }

    @Override // o.tJ
    public final /* synthetic */ tE setIconTintList() {
        return new tE();
    }

    @Override // o.InterfaceC0498tx
    public final Object setIconTintList(T t, oK<? super nX> oKVar) {
        if (t == null) {
            t = (T) tS.setIconTintList;
        }
        MenuHostHelper$$ExternalSyntheticLambda0(t);
        return nX.setX;
    }
}