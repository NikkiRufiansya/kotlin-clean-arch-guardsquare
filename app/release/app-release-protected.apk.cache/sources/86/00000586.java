package o;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* loaded from: classes.dex */
public class hQ<T> {
    private int MenuHostHelper$$ExternalSyntheticLambda1;
    public final Class<? super T> setIconTintList;
    public final Type setY;

    public hQ() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        Type MenuHostHelper$$ExternalSyntheticLambda1 = C0213hl.MenuHostHelper$$ExternalSyntheticLambda1(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.setY = MenuHostHelper$$ExternalSyntheticLambda1;
        this.setIconTintList = (Class<? super T>) C0213hl.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
    }

    public hQ(Type type) {
        Type MenuHostHelper$$ExternalSyntheticLambda1 = C0213hl.MenuHostHelper$$ExternalSyntheticLambda1(type);
        this.setY = MenuHostHelper$$ExternalSyntheticLambda1;
        this.setIconTintList = (Class<? super T>) C0213hl.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
    }

    public final int hashCode() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hQ) && C0213hl.setX(this.setY, ((hQ) obj).setY);
    }

    public final String toString() {
        return C0213hl.setIconTintList(this.setY);
    }
}