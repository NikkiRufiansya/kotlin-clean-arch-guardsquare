package o;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class bq$MenuHostHelper$$ExternalSyntheticLambda1 {
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private Map<Class<?>, Object> setY = null;

    public bq$MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
    }

    public final <T extends Annotation> bq$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        if (this.setY == null) {
            this.setY = new HashMap();
        }
        this.setY.put(t.annotationType(), t);
        return this;
    }

    public final C0056bq setX() {
        Map unmodifiableMap;
        String str = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (this.setY == null) {
            unmodifiableMap = Collections.emptyMap();
        } else {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.setY));
        }
        return new C0056bq(str, unmodifiableMap, (byte) 0);
    }
}