package o;

import java.util.List;

/* renamed from: o.up  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0519up {
    public static final sI setY(kotlinx.coroutines.internal.MainDispatcherFactory mainDispatcherFactory, List<? extends kotlinx.coroutines.internal.MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return new C0522us(th, mainDispatcherFactory.hintOnError());
        }
    }
}