package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.un  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0517un<E> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater setY = AtomicReferenceFieldUpdater.newUpdater(C0517un.class, Object.class, "_cur");
    volatile /* synthetic */ Object _cur = new C0521ur(8, false);

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        long j = ((C0521ur) this._cur)._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final void setX() {
        while (true) {
            C0521ur c0521ur = (C0521ur) this._cur;
            if (c0521ur.setY()) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setY;
            C0521ur<E> MenuHostHelper$$ExternalSyntheticLambda0 = c0521ur.MenuHostHelper$$ExternalSyntheticLambda0(c0521ur.MenuHostHelper$$ExternalSyntheticLambda1());
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0521ur, MenuHostHelper$$ExternalSyntheticLambda0) && atomicReferenceFieldUpdater.get(this) == c0521ur) {
            }
        }
    }

    public final boolean setX(E e) {
        while (true) {
            C0521ur c0521ur = (C0521ur) this._cur;
            int y = c0521ur.setY(e);
            if (y == 0) {
                return true;
            }
            if (y == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setY;
                C0521ur<E> MenuHostHelper$$ExternalSyntheticLambda0 = c0521ur.MenuHostHelper$$ExternalSyntheticLambda0(c0521ur.MenuHostHelper$$ExternalSyntheticLambda1());
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0521ur, MenuHostHelper$$ExternalSyntheticLambda0) && atomicReferenceFieldUpdater.get(this) == c0521ur) {
                }
            } else if (y == 2) {
                return false;
            }
        }
    }

    public final E MenuHostHelper$$ExternalSyntheticLambda1() {
        while (true) {
            C0521ur c0521ur = (C0521ur) this._cur;
            E e = (E) c0521ur.setX();
            if (e != C0521ur.MenuHostHelper$$ExternalSyntheticLambda1) {
                return e;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = setY;
            C0521ur<E> MenuHostHelper$$ExternalSyntheticLambda0 = c0521ur.MenuHostHelper$$ExternalSyntheticLambda0(c0521ur.MenuHostHelper$$ExternalSyntheticLambda1());
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c0521ur, MenuHostHelper$$ExternalSyntheticLambda0) && atomicReferenceFieldUpdater.get(this) == c0521ur) {
            }
        }
    }
}