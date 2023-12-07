package o;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class hl$MenuHostHelper$$ExternalSyntheticLambda1 implements ParameterizedType, Serializable {
    private final Type MenuHostHelper$$ExternalSyntheticLambda0;
    private final Type[] setIconTintList;
    private final Type setY;

    public hl$MenuHostHelper$$ExternalSyntheticLambda1(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Class cls = (Class) type2;
            boolean z = true;
            boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
            if (type == null && !z2) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException();
            }
        }
        this.setY = type == null ? null : C0213hl.MenuHostHelper$$ExternalSyntheticLambda1(type);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = C0213hl.MenuHostHelper$$ExternalSyntheticLambda1(type2);
        Type[] typeArr2 = (Type[]) typeArr.clone();
        this.setIconTintList = typeArr2;
        int length = typeArr2.length;
        for (int i = 0; i < length; i++) {
            Type[] typeArr3 = this.setIconTintList;
            Type type3 = typeArr3[i];
            C0213hl.setX(typeArr3[i]);
            Type[] typeArr4 = this.setIconTintList;
            typeArr4[i] = C0213hl.MenuHostHelper$$ExternalSyntheticLambda1(typeArr4[i]);
        }
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type[] getActualTypeArguments() {
        return (Type[]) this.setIconTintList.clone();
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getRawType() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // java.lang.reflect.ParameterizedType
    public final Type getOwnerType() {
        return this.setY;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && C0213hl.setX(this, (ParameterizedType) obj);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.setIconTintList) ^ this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode()) ^ C0213hl.setX((Object) this.setY);
    }

    public final String toString() {
        int length = this.setIconTintList.length;
        if (length == 0) {
            return C0213hl.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        StringBuilder sb = new StringBuilder((length + 1) * 30);
        sb.append(C0213hl.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0));
        sb.append("<");
        sb.append(C0213hl.setIconTintList(this.setIconTintList[0]));
        for (int i = 1; i < length; i++) {
            sb.append(", ");
            sb.append(C0213hl.setIconTintList(this.setIconTintList[i]));
        }
        sb.append(">");
        return sb.toString();
    }
}