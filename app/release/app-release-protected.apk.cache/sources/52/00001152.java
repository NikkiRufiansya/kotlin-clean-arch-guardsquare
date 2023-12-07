package o;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import o.C0483ti;

/* renamed from: o.tb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0476tb<E> implements InterfaceC0494tt<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater MenuHostHelper$$ExternalSyntheticLambda0 = AtomicReferenceFieldUpdater.newUpdater(AbstractC0476tb.class, Object.class, "onCloseHandler");
    protected final InterfaceC0377pk<E, nX> setIconTintList;
    private final C0515ul setY = new C0515ul();
    private volatile /* synthetic */ Object onCloseHandler = null;

    protected String setUiOptions() {
        return "";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0476tb(InterfaceC0377pk<? super E, nX> interfaceC0377pk) {
        this.setIconTintList = interfaceC0377pk;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final C0515ul setUnboundedRipple() {
        return this.setY;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object setY(E e) {
        InterfaceC0489to<E> y;
        do {
            y = setY();
            if (y == null) {
                return C0479te.setIconTintList;
            }
        } while (y.setIconTintList(e) == null);
        rX.setIconTintList();
        y.setX();
        return y.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    protected final C0482th<?> setOnLongClickListener() {
        C0515ul c0515ul = this.setY;
        C0518uo iconTintList = c0515ul.setIconTintList((AbstractC0524uu) null);
        if (iconTintList == null) {
            iconTintList = C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) c0515ul._prev);
        }
        C0482th<?> c0482th = iconTintList instanceof C0482th ? (C0482th) iconTintList : null;
        if (c0482th != null) {
            setIconTintList(c0482th);
            return c0482th;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o.AbstractC0490tp setLayoutAnimation() {
        /*
            r5 = this;
            o.ul r0 = r5.setY
            o.uo r0 = (o.C0518uo) r0
        L4:
            java.lang.Object r1 = r0._next
            boolean r2 = r1 instanceof o.AbstractC0524uu
            if (r2 != 0) goto L45
            o.uo r1 = (o.C0518uo) r1
            r2 = 0
            if (r1 != r0) goto L10
            goto L41
        L10:
            boolean r3 = r1 instanceof o.AbstractC0490tp
            if (r3 == 0) goto L41
            r3 = r1
            o.tp r3 = (o.AbstractC0490tp) r3
            boolean r3 = r3 instanceof o.C0482th
            if (r3 == 0) goto L21
            boolean r3 = r1.s_()
            if (r3 == 0) goto L42
        L21:
            o.uo r3 = r1.setY()
            if (r3 != 0) goto L28
            goto L42
        L28:
            java.lang.Object r1 = r3._next
            boolean r4 = r1 instanceof o.AbstractC0524uu
            if (r4 != 0) goto L3b
            boolean r4 = r1 instanceof o.C0526uw
            if (r4 == 0) goto L37
            o.uw r1 = (o.C0526uw) r1
            o.uo r3 = r1.setIconTintList
            goto L28
        L37:
            r3.setIconTintList(r2)
            goto L4
        L3b:
            o.uu r1 = (o.AbstractC0524uu) r1
            r1.MenuHostHelper$$ExternalSyntheticLambda1(r3)
            goto L28
        L41:
            r1 = r2
        L42:
            o.tp r1 = (o.AbstractC0490tp) r1
            return r1
        L45:
            o.uu r1 = (o.AbstractC0524uu) r1
            r1.MenuHostHelper$$ExternalSyntheticLambda1(r0)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0476tb.setLayoutAnimation():o.tp");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final InterfaceC0489to<?> MenuHostHelper$$ExternalSyntheticLambda1(E e) {
        C0518uo iconTintList;
        C0515ul c0515ul = this.setY;
        setIconTintList seticontintlist = new setIconTintList(e);
        do {
            iconTintList = c0515ul.setIconTintList((AbstractC0524uu) null);
            if (iconTintList == null) {
                iconTintList = C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) c0515ul._prev);
            }
            if (iconTintList instanceof InterfaceC0489to) {
                return (InterfaceC0489to) iconTintList;
            }
        } while (!iconTintList.setIconTintList(seticontintlist, c0515ul));
        return null;
    }

    @Override // o.InterfaceC0494tt
    public final Object setX(E e) {
        C0483ti.setX setx;
        Object y = setY(e);
        if (y != C0479te.MenuHostHelper$$ExternalSyntheticLambda1) {
            if (y == C0479te.setIconTintList) {
                C0482th<?> onLongClickListener = setOnLongClickListener();
                if (onLongClickListener != null) {
                    ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda1 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
                    setIconTintList(onLongClickListener);
                    C0488tn c0488tn = onLongClickListener.setX;
                    if (c0488tn == null) {
                        c0488tn = new C0488tn("Channel was closed");
                    }
                    return C0483ti.setX(new ti$MenuHostHelper$$ExternalSyntheticLambda0(c0488tn));
                }
                ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda12 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
                setx = C0483ti.MenuHostHelper$$ExternalSyntheticLambda0;
                return C0483ti.setX(setx);
            } else if (y instanceof C0482th) {
                ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda13 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
                C0482th c0482th = (C0482th) y;
                setIconTintList(c0482th);
                C0488tn c0488tn2 = c0482th.setX;
                if (c0488tn2 == null) {
                    c0488tn2 = new C0488tn("Channel was closed");
                }
                return C0483ti.setX(new ti$MenuHostHelper$$ExternalSyntheticLambda0(c0488tn2));
            } else {
                StringBuilder sb = new StringBuilder("trySend returned ");
                sb.append(y);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda14 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
        return C0483ti.setX(nX.setX);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4 */
    @Override // o.InterfaceC0494tt
    public final boolean setIconTintList(Throwable th) {
        boolean z;
        boolean z2;
        Object obj;
        C0482th c0482th = new C0482th(th);
        C0515ul c0515ul = this.setY;
        while (true) {
            C0518uo iconTintList = c0515ul.setIconTintList((AbstractC0524uu) null);
            if (iconTintList == null) {
                iconTintList = C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) c0515ul._prev);
            }
            z = false;
            if (!(!(iconTintList instanceof C0482th))) {
                z2 = false;
                break;
            } else if (iconTintList.setIconTintList(c0482th, c0515ul)) {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            C0515ul c0515ul2 = this.setY;
            C0518uo iconTintList2 = c0515ul2.setIconTintList((AbstractC0524uu) null);
            if (iconTintList2 == null) {
                iconTintList2 = C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) c0515ul2._prev);
            }
            c0482th = iconTintList2;
        }
        setIconTintList(c0482th);
        if (z2 && (obj = this.onCloseHandler) != null && obj != C0479te.setY) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MenuHostHelper$$ExternalSyntheticLambda0;
            C0528uy c0528uy = C0479te.setY;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0528uy)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                ((InterfaceC0377pk) pZ.setIconTintList(obj, 1)).setX(th);
            }
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0041, code lost:
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o.InterfaceC0489to<E> setY() {
        /*
            r5 = this;
            o.ul r0 = r5.setY
            o.uo r0 = (o.C0518uo) r0
        L4:
            java.lang.Object r1 = r0._next
            boolean r2 = r1 instanceof o.AbstractC0524uu
            if (r2 != 0) goto L45
            o.uo r1 = (o.C0518uo) r1
            r2 = 0
            if (r1 != r0) goto L10
            goto L41
        L10:
            boolean r3 = r1 instanceof o.InterfaceC0489to
            if (r3 == 0) goto L41
            r3 = r1
            o.to r3 = (o.InterfaceC0489to) r3
            boolean r3 = r3 instanceof o.C0482th
            if (r3 == 0) goto L21
            boolean r3 = r1.s_()
            if (r3 == 0) goto L42
        L21:
            o.uo r3 = r1.setY()
            if (r3 != 0) goto L28
            goto L42
        L28:
            java.lang.Object r1 = r3._next
            boolean r4 = r1 instanceof o.AbstractC0524uu
            if (r4 != 0) goto L3b
            boolean r4 = r1 instanceof o.C0526uw
            if (r4 == 0) goto L37
            o.uw r1 = (o.C0526uw) r1
            o.uo r3 = r1.setIconTintList
            goto L28
        L37:
            r3.setIconTintList(r2)
            goto L4
        L3b:
            o.uu r1 = (o.AbstractC0524uu) r1
            r1.MenuHostHelper$$ExternalSyntheticLambda1(r3)
            goto L28
        L41:
            r1 = r2
        L42:
            o.to r1 = (o.InterfaceC0489to) r1
            return r1
        L45:
            o.uu r1 = (o.AbstractC0524uu) r1
            r1.MenuHostHelper$$ExternalSyntheticLambda1(r0)
            goto L4
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0476tb.setY():o.to");
    }

    public String toString() {
        String simpleName;
        Object obj;
        String obj2;
        String str;
        Object obj3;
        Object obj4;
        StringBuilder sb = new StringBuilder();
        simpleName = getClass().getSimpleName();
        sb.append(simpleName);
        sb.append('@');
        sb.append(rZ.setY(this));
        sb.append('{');
        C0515ul c0515ul = this.setY;
        while (true) {
            obj = c0515ul._next;
            if (!(obj instanceof AbstractC0524uu)) {
                break;
            }
            ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(c0515ul);
        }
        C0518uo iconTintList = C0516um.setIconTintList(obj);
        if (iconTintList == this.setY) {
            str = "EmptyQueue";
        } else {
            if (iconTintList instanceof C0482th) {
                obj2 = iconTintList.toString();
            } else if (iconTintList instanceof AbstractC0486tl) {
                obj2 = "ReceiveQueued";
            } else if (iconTintList instanceof AbstractC0490tp) {
                obj2 = "SendQueued";
            } else {
                StringBuilder sb2 = new StringBuilder("UNEXPECTED:");
                sb2.append(iconTintList);
                obj2 = sb2.toString();
            }
            C0515ul c0515ul2 = this.setY;
            C0518uo iconTintList2 = c0515ul2.setIconTintList((AbstractC0524uu) null);
            if (iconTintList2 == null) {
                iconTintList2 = C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) c0515ul2._prev);
            }
            if (iconTintList2 != iconTintList) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(obj2);
                sb3.append(",queueSize=");
                C0515ul c0515ul3 = this.setY;
                while (true) {
                    obj3 = c0515ul3._next;
                    if (!(obj3 instanceof AbstractC0524uu)) {
                        break;
                    }
                    ((AbstractC0524uu) obj3).MenuHostHelper$$ExternalSyntheticLambda1(c0515ul3);
                }
                C0518uo c0518uo = (C0518uo) obj3;
                int i = 0;
                while (!pN.MenuHostHelper$$ExternalSyntheticLambda0(c0518uo, c0515ul3)) {
                    if (c0518uo instanceof C0518uo) {
                        i++;
                    }
                    int i2 = i;
                    while (true) {
                        obj4 = c0518uo._next;
                        if (!(obj4 instanceof AbstractC0524uu)) {
                            break;
                        }
                        ((AbstractC0524uu) obj4).MenuHostHelper$$ExternalSyntheticLambda1(c0518uo);
                    }
                    c0518uo = C0516um.setIconTintList(obj4);
                    i = i2;
                }
                sb3.append(i);
                str = sb3.toString();
                if (iconTintList2 instanceof C0482th) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str);
                    sb4.append(",closedForSend=");
                    sb4.append(iconTintList2);
                    str = sb4.toString();
                }
            } else {
                str = obj2;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(setUiOptions());
        return sb.toString();
    }

    /* renamed from: o.tb$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList<E> extends AbstractC0490tp {
        private E setX;

        public setIconTintList(E e) {
            this.setX = e;
        }

        @Override // o.AbstractC0490tp
        public final Object setIconTintList() {
            return this.setX;
        }

        @Override // o.AbstractC0490tp
        public final C0528uy MenuHostHelper$$ExternalSyntheticLambda1() {
            return C0442rv.setIconTintList;
        }

        @Override // o.C0518uo
        public final String toString() {
            StringBuilder sb = new StringBuilder("SendBuffered@");
            sb.append(rZ.setY(this));
            sb.append('(');
            sb.append(this.setX);
            sb.append(')');
            return sb.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    private static void setIconTintList(C0482th<?> c0482th) {
        Object obj;
        C0518uo c0518uo;
        AbstractC0486tl abstractC0486tl = null;
        while (true) {
            C0518uo iconTintList = c0482th.setIconTintList((AbstractC0524uu) null);
            if (iconTintList == null) {
                iconTintList = C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) c0482th._prev);
            }
            AbstractC0486tl abstractC0486tl2 = iconTintList instanceof AbstractC0486tl ? (AbstractC0486tl) iconTintList : null;
            if (abstractC0486tl2 == null) {
                if (abstractC0486tl != null) {
                    if (!(abstractC0486tl instanceof ArrayList)) {
                        abstractC0486tl.setIconTintList(c0482th);
                    } else if (abstractC0486tl != null) {
                        ArrayList arrayList = (ArrayList) abstractC0486tl;
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            ((AbstractC0486tl) arrayList.get(size)).setIconTintList(c0482th);
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                    }
                }
                return;
            } else if (!abstractC0486tl2.q_()) {
                while (true) {
                    obj = abstractC0486tl2._next;
                    if (!(obj instanceof AbstractC0524uu)) {
                        break;
                    }
                    ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(abstractC0486tl2);
                }
                do {
                    c0518uo = ((C0526uw) obj).setIconTintList;
                    while (true) {
                        obj = c0518uo._next;
                        if (!(obj instanceof AbstractC0524uu)) {
                            break;
                        }
                        ((AbstractC0524uu) obj).MenuHostHelper$$ExternalSyntheticLambda1(c0518uo);
                    }
                } while (obj instanceof C0526uw);
                c0518uo.setIconTintList((AbstractC0524uu) null);
            } else {
                rX.setIconTintList();
                if (abstractC0486tl == null) {
                    abstractC0486tl = abstractC0486tl2;
                } else if (!(abstractC0486tl instanceof ArrayList)) {
                    ?? arrayList2 = new ArrayList(4);
                    arrayList2.add(abstractC0486tl);
                    arrayList2.add(abstractC0486tl2);
                    abstractC0486tl = arrayList2;
                } else if (abstractC0486tl == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }");
                } else {
                    ((ArrayList) abstractC0486tl).add(abstractC0486tl2);
                }
            }
        }
    }
}