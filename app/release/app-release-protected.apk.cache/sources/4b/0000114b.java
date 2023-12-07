package o;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class tY<T> extends AbstractC0524uu {
    private static final /* synthetic */ AtomicReferenceFieldUpdater MenuHostHelper$$ExternalSyntheticLambda0 = AtomicReferenceFieldUpdater.newUpdater(tY.class, Object.class, "_consensus");
    private volatile /* synthetic */ Object _consensus = C0504uc.setX;

    public abstract Object setX(T t);

    public abstract void setX(T t, Object obj);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC0524uu
    public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        boolean z;
        Object obj2 = this._consensus;
        if (obj2 == C0504uc.setX) {
            Object x = setX(obj);
            rX.setIconTintList();
            obj2 = this._consensus;
            if (obj2 == C0504uc.setX) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MenuHostHelper$$ExternalSyntheticLambda0;
                Object obj3 = C0504uc.setX;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, x)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                obj2 = z ? x : this._consensus;
            }
        }
        setX(obj, obj2);
        return obj2;
    }
}