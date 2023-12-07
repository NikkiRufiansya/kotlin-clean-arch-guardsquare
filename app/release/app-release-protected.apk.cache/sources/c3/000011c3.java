package o;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* renamed from: o.uq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0520uq {
    public static final sI MenuHostHelper$$ExternalSyntheticLambda0;
    private static final boolean setX;

    private C0520uq() {
    }

    private static sI MenuHostHelper$$ExternalSyntheticLambda0() {
        Object next;
        sI y;
        try {
            List<kotlinx.coroutines.internal.MainDispatcherFactory> MenuHostHelper$$ExternalSyntheticLambda02 = setX ? C0509uf.setY.MenuHostHelper$$ExternalSyntheticLambda0() : qI.setIconTintList(qI.MenuHostHelper$$ExternalSyntheticLambda1(ServiceLoader.load(kotlinx.coroutines.internal.MainDispatcherFactory.class, kotlinx.coroutines.internal.MainDispatcherFactory.class.getClassLoader()).iterator()));
            Iterator<T> it = MenuHostHelper$$ExternalSyntheticLambda02.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int loadPriority = ((kotlinx.coroutines.internal.MainDispatcherFactory) next).getLoadPriority();
                    do {
                        Object next2 = it.next();
                        int loadPriority2 = ((kotlinx.coroutines.internal.MainDispatcherFactory) next2).getLoadPriority();
                        if (loadPriority < loadPriority2) {
                            next = next2;
                            loadPriority = loadPriority2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory = (kotlinx.coroutines.internal.MainDispatcherFactory) next;
            return (mainDispatcherFactory == null || (y = C0519up.setY(mainDispatcherFactory, MenuHostHelper$$ExternalSyntheticLambda02)) == null) ? new C0522us(null, null) : y;
        } catch (Throwable th) {
            return new C0522us(th, null);
        }
    }

    static {
        new C0520uq();
        String x = C0527ux.setX("kotlinx.coroutines.fast.service.loader");
        setX = x != null ? Boolean.parseBoolean(x) : true;
        MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
    }
}