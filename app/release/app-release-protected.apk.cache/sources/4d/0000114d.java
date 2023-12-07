package o;

import o.C0483ti;
import o.C0518uo;
import o.C0523ut;
import o.nR;

/* renamed from: o.ta  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0475ta<E> extends AbstractC0476tb<E> implements InterfaceC0480tf<E> {
    protected abstract boolean MenuHostHelper$$ExternalSyntheticLambda1();

    protected abstract boolean setIconTintList();

    /* renamed from: o.ta$setY */
    /* loaded from: classes.dex */
    public static final class setY extends C0518uo.setX {
        private /* synthetic */ AbstractC0475ta MenuHostHelper$$ExternalSyntheticLambda1;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setY(C0518uo c0518uo, AbstractC0475ta abstractC0475ta) {
            super(c0518uo);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = abstractC0475ta;
        }

        @Override // o.tY
        public final /* synthetic */ Object setX(C0518uo c0518uo) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList()) {
                return null;
            }
            return C0516um.setY();
        }
    }

    public AbstractC0475ta(InterfaceC0377pk<? super E, nX> interfaceC0377pk) {
        super(interfaceC0377pk);
    }

    protected Object setX() {
        AbstractC0490tp layoutAnimation;
        do {
            layoutAnimation = setLayoutAnimation();
            if (layoutAnimation == null) {
                return C0479te.setX;
            }
        } while (layoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1() == null);
        rX.setIconTintList();
        return layoutAnimation.setIconTintList();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    @Override // o.InterfaceC0487tm
    public final Object setX(oK<? super E> oKVar) {
        setX<E> setx;
        C0483ti c0483ti;
        Object x = setX();
        if (x == C0479te.setX || (x instanceof C0482th)) {
            C0444rx y = C0443rw.setY(oP.setY(oKVar));
            C0444rx c0444rx = y;
            if (this.setIconTintList == null) {
                setx = new setX<>(c0444rx, 0);
            } else {
                setx = new setX<E>(c0444rx, 0, this.setIconTintList) { // from class: o.ta$MenuHostHelper$$ExternalSyntheticLambda0
                    private InterfaceC0377pk<E, nX> setY;

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.setY = r3;
                    }

                    @Override // o.AbstractC0486tl
                    public final InterfaceC0377pk<Throwable, nX> setX(E e) {
                        return new C0523ut.setY(this.setY, e, this.setX.setX());
                    }
                };
            }
            while (true) {
                setX<E> setx2 = setx;
                if (!MenuHostHelper$$ExternalSyntheticLambda0(setx2)) {
                    ?? x2 = setX();
                    if (x2 instanceof C0482th) {
                        setx.setIconTintList((C0482th) x2);
                        break;
                    } else if (x2 != C0479te.setX) {
                        if (setx.MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                            ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda1 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
                            c0483ti = C0483ti.MenuHostHelper$$ExternalSyntheticLambda0(C0483ti.setX(x2));
                        } else {
                            c0483ti = x2;
                        }
                        c0444rx.setX((C0444rx) c0483ti, (InterfaceC0377pk<? super Throwable, nX>) setx.setX(x2));
                    }
                } else {
                    c0444rx.setIconTintList((InterfaceC0377pk<? super Throwable, nX>) new setIconTintList(setx2));
                    break;
                }
            }
            Object MenuHostHelper$$ExternalSyntheticLambda0 = y.MenuHostHelper$$ExternalSyntheticLambda0();
            if (MenuHostHelper$$ExternalSyntheticLambda0 == oJ.COROUTINE_SUSPENDED) {
                pN.setY(oKVar, "");
            }
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return x;
    }

    protected boolean MenuHostHelper$$ExternalSyntheticLambda0(AbstractC0486tl<? super E> abstractC0486tl) {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        C0518uo iconTintList;
        if (MenuHostHelper$$ExternalSyntheticLambda1()) {
            C0515ul unboundedRipple = setUnboundedRipple();
            do {
                iconTintList = unboundedRipple.setIconTintList((AbstractC0524uu) null);
                if (iconTintList == null) {
                    iconTintList = C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) unboundedRipple._prev);
                }
                if (!(!(iconTintList instanceof AbstractC0490tp))) {
                    return false;
                }
            } while (!iconTintList.setIconTintList(abstractC0486tl, unboundedRipple));
        } else {
            C0515ul unboundedRipple2 = setUnboundedRipple();
            AbstractC0486tl<? super E> abstractC0486tl2 = abstractC0486tl;
            setY sety = new setY(abstractC0486tl2, this);
            do {
                C0518uo iconTintList2 = unboundedRipple2.setIconTintList((AbstractC0524uu) null);
                if (iconTintList2 == null) {
                    iconTintList2 = C0518uo.MenuHostHelper$$ExternalSyntheticLambda1((C0518uo) unboundedRipple2._prev);
                }
                if (!(!(iconTintList2 instanceof AbstractC0490tp))) {
                    return false;
                }
                MenuHostHelper$$ExternalSyntheticLambda0 = iconTintList2.MenuHostHelper$$ExternalSyntheticLambda0(abstractC0486tl2, unboundedRipple2, sety);
                if (MenuHostHelper$$ExternalSyntheticLambda0 != 1) {
                }
            } while (MenuHostHelper$$ExternalSyntheticLambda0 != 2);
            return false;
        }
        return true;
    }

    @Override // o.InterfaceC0487tm
    public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
        C0483ti.setX setx;
        Object x = setX();
        if (x == C0479te.setX) {
            ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda1 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
            setx = C0483ti.MenuHostHelper$$ExternalSyntheticLambda0;
            return C0483ti.setX(setx);
        } else if (!(x instanceof C0482th)) {
            ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda12 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
            return C0483ti.setX(x);
        } else {
            ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda13 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
            return C0483ti.setX(new ti$MenuHostHelper$$ExternalSyntheticLambda0(((C0482th) x).setX));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0476tb
    public final InterfaceC0489to<E> setY() {
        return super.setY();
    }

    /* renamed from: o.ta$setIconTintList */
    /* loaded from: classes.dex */
    final class setIconTintList extends AbstractC0432rl {
        private final AbstractC0486tl<?> setIconTintList;

        public setIconTintList(AbstractC0486tl<?> abstractC0486tl) {
            this.setIconTintList = abstractC0486tl;
        }

        @Override // o.InterfaceC0377pk
        public final /* synthetic */ nX setX(Throwable th) {
            this.setIconTintList.q_();
            return nX.setX;
        }

        @Override // o.AbstractC0439rs
        public final void MenuHostHelper$$ExternalSyntheticLambda1(Throwable th) {
            this.setIconTintList.q_();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoveReceiveOnCancel[");
            sb.append(this.setIconTintList);
            sb.append(']');
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.ta$setX */
    /* loaded from: classes.dex */
    public static class setX<E> extends AbstractC0486tl<E> {
        public final int MenuHostHelper$$ExternalSyntheticLambda1;
        public final InterfaceC0441ru<Object> setX;

        public setX(InterfaceC0441ru<Object> interfaceC0441ru, int i) {
            this.setX = interfaceC0441ru;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        }

        @Override // o.InterfaceC0489to
        public final C0528uy setIconTintList(E e) {
            Object obj;
            InterfaceC0441ru<Object> interfaceC0441ru = this.setX;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda1 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
                obj = C0483ti.MenuHostHelper$$ExternalSyntheticLambda0(C0483ti.setX(e));
            } else {
                obj = e;
            }
            if (interfaceC0441ru.MenuHostHelper$$ExternalSyntheticLambda0(obj, null, setX(e)) == null) {
                return null;
            }
            rX.setIconTintList();
            return C0442rv.setIconTintList;
        }

        @Override // o.InterfaceC0489to
        public final void setX() {
            this.setX.setIconTintList(C0442rv.setIconTintList);
        }

        @Override // o.AbstractC0486tl
        public final void setIconTintList(C0482th<?> c0482th) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 != 1) {
                InterfaceC0441ru<Object> interfaceC0441ru = this.setX;
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                C0481tg c0481tg = c0482th.setX;
                if (c0481tg == null) {
                    c0481tg = new C0481tg("Channel was closed");
                }
                pN.setY((Object) c0481tg, "");
                interfaceC0441ru.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(new nR.setX(c0481tg)));
                return;
            }
            ti$MenuHostHelper$$ExternalSyntheticLambda1 ti_menuhosthelper__externalsyntheticlambda1 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda1;
            C0483ti MenuHostHelper$$ExternalSyntheticLambda0 = C0483ti.MenuHostHelper$$ExternalSyntheticLambda0(C0483ti.setX(new ti$MenuHostHelper$$ExternalSyntheticLambda0(c0482th.setX)));
            nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0(nR.setX(MenuHostHelper$$ExternalSyntheticLambda0));
        }

        @Override // o.C0518uo
        public String toString() {
            StringBuilder sb = new StringBuilder("ReceiveElement@");
            sb.append(rZ.setY(this));
            sb.append("[receiveMode=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append(']');
            return sb.toString();
        }
    }
}