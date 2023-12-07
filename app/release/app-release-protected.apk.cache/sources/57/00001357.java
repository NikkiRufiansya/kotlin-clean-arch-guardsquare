package o;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/* renamed from: o.ya  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0617ya {
    final Method setIconTintList;
    private final List<?> setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0617ya(Method method, List<?> list) {
        this.setIconTintList = method;
        this.setX = Collections.unmodifiableList(list);
    }

    public final String toString() {
        return String.format("%s.%s() %s", this.setIconTintList.getDeclaringClass().getName(), this.setIconTintList.getName(), this.setX);
    }
}