package o;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class aD implements bT, bQ {
    private final Executor MenuHostHelper$$ExternalSyntheticLambda0;
    private final Map<Class<?>, ConcurrentHashMap<bR<Object>, Executor>> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap();
    private Queue<bS<?>> setY = new ArrayDeque();

    public aD(Executor executor) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = executor;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(final bS<?> bSVar) {
        synchronized (this) {
            Queue<bS<?>> queue = this.setY;
            if (queue != null) {
                queue.add(bSVar);
                return;
            }
            for (final Map.Entry<bR<Object>, Executor> entry : setX(bSVar)) {
                entry.getValue().execute(new Runnable() { // from class: o.aE
                    @Override // java.lang.Runnable
                    public final void run() {
                        aD.setX(entry);
                    }
                });
            }
        }
    }

    public static /* synthetic */ void setX(Map.Entry entry) {
        bR bRVar = (bR) entry.getKey();
    }

    private Set<Map.Entry<bR<Object>, Executor>> setX(bS<?> bSVar) {
        Set<Map.Entry<bR<Object>, Executor>> emptySet;
        synchronized (this) {
            ConcurrentHashMap<bR<Object>, Executor> concurrentHashMap = this.MenuHostHelper$$ExternalSyntheticLambda1.get(bSVar.setY);
            emptySet = concurrentHashMap == null ? Collections.emptySet() : concurrentHashMap.entrySet();
        }
        return emptySet;
    }

    public final void setY() {
        Queue<bS<?>> queue;
        synchronized (this) {
            queue = this.setY;
            if (queue != null) {
                this.setY = null;
            } else {
                queue = null;
            }
        }
        if (queue != null) {
            for (bS<?> bSVar : queue) {
                MenuHostHelper$$ExternalSyntheticLambda0(bSVar);
            }
        }
    }
}