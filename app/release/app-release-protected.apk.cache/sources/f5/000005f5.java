package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class iU {
    private static final iU setX = new iU();
    private final ConcurrentMap<Class<?>, iY<?>> setY = new ConcurrentHashMap();
    private final iX MenuHostHelper$$ExternalSyntheticLambda0 = new C0254iz();

    public static iU setX() {
        return setX;
    }

    public final <T> iY<T> setIconTintList(Class<T> cls) {
        C0243ip.setX(cls, "messageType");
        iY<T> iYVar = (iY<T>) this.setY.get(cls);
        if (iYVar == null) {
            iY<T> MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(cls);
            C0243ip.setX(cls, "messageType");
            C0243ip.setX(MenuHostHelper$$ExternalSyntheticLambda0, "schema");
            iY<T> iYVar2 = (iY<T>) this.setY.putIfAbsent(cls, MenuHostHelper$$ExternalSyntheticLambda0);
            return iYVar2 != null ? iYVar2 : MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return iYVar;
    }

    private iU() {
    }
}