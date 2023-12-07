package o;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class writeReplace {
    private static final writeReplace MenuHostHelper$$ExternalSyntheticLambda0 = new writeReplace();
    private final ConcurrentMap<Class<?>, setValues<?>> setIconTintList = new ConcurrentHashMap();
    private final setTranslateY setX = new setActiveIndicatorMarginHorizontal();

    public static writeReplace setY() {
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final <T> setValues<T> MenuHostHelper$$ExternalSyntheticLambda0(Class<T> cls) {
        setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(cls, "messageType");
        setValues<T> setvalues = (setValues<T>) this.setIconTintList.get(cls);
        if (setvalues == null) {
            setValues<T> MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(cls);
            setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(cls, "messageType");
            setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1, "schema");
            setValues<T> setvalues2 = (setValues<T>) this.setIconTintList.putIfAbsent(cls, MenuHostHelper$$ExternalSyntheticLambda1);
            return setvalues2 != null ? setvalues2 : MenuHostHelper$$ExternalSyntheticLambda1;
        }
        return setvalues;
    }

    private writeReplace() {
    }
}