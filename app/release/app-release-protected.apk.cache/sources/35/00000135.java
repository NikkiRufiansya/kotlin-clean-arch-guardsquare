package kotlinx.coroutines.internal;

import java.util.List;
import o.sI;

/* loaded from: classes.dex */
public interface MainDispatcherFactory {
    sI createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}