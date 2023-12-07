package o;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class aC<T> implements InterfaceC0073cg<Set<T>> {
    volatile Set<T> setY = null;
    volatile Set<InterfaceC0073cg<T>> MenuHostHelper$$ExternalSyntheticLambda1 = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: Access modifiers changed from: package-private */
    public aC(Collection<InterfaceC0073cg<T>> collection) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.addAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.InterfaceC0073cg
    /* renamed from: setIconTintList */
    public Set<T> MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.setY == null) {
            synchronized (this) {
                if (this.setY == null) {
                    this.setY = Collections.newSetFromMap(new ConcurrentHashMap());
                    synchronized (this) {
                        for (InterfaceC0073cg<T> interfaceC0073cg : this.MenuHostHelper$$ExternalSyntheticLambda1) {
                            this.setY.add(interfaceC0073cg.MenuHostHelper$$ExternalSyntheticLambda0());
                        }
                        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
                    }
                }
            }
        }
        return Collections.unmodifiableSet(this.setY);
    }
}