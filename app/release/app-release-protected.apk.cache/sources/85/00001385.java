package o;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;

/* renamed from: o.ym */
/* loaded from: classes.dex */
public final class C0629ym {
    static final Type[] MenuHostHelper$$ExternalSyntheticLambda0 = new Type[0];

    public static RuntimeException MenuHostHelper$$ExternalSyntheticLambda0(Method method, String str, Object... objArr) {
        return MenuHostHelper$$ExternalSyntheticLambda0(method, null, str, objArr);
    }

    public static RuntimeException MenuHostHelper$$ExternalSyntheticLambda0(Method method, @Nullable Throwable th, String str, Object... objArr) {
        String format = String.format(str, objArr);
        StringBuilder sb = new StringBuilder();
        sb.append(format);
        sb.append("\n    for method ");
        sb.append(method.getDeclaringClass().getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        return new IllegalArgumentException(sb.toString(), th);
    }

    public static RuntimeException MenuHostHelper$$ExternalSyntheticLambda1(Method method, Throwable th, int i, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (parameter #");
        sb.append(i + 1);
        sb.append(")");
        return MenuHostHelper$$ExternalSyntheticLambda0(method, th, sb.toString(), objArr);
    }

    public static RuntimeException setY(Method method, int i, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" (parameter #");
        sb.append(i + 1);
        sb.append(")");
        return MenuHostHelper$$ExternalSyntheticLambda0(method, null, sb.toString(), objArr);
    }

    public static Class<?> setIconTintList(Type type) {
        while (true) {
            Objects.requireNonNull(type, "type == null");
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (!(rawType instanceof Class)) {
                    throw new IllegalArgumentException();
                }
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(setIconTintList(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(type.getClass().getName());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type ownerType2 = parameterizedType2.getOwnerType();
                    return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (type2 instanceof WildcardType) {
                    WildcardType wildcardType = (WildcardType) type;
                    WildcardType wildcardType2 = (WildcardType) type2;
                    return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                return false;
            } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            } else {
                return false;
            }
        }
        return true;
    }

    private static Type MenuHostHelper$$ExternalSyntheticLambda1(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                for (int i = 0; i < length; i++) {
                    Class<?> cls3 = interfaces[i];
                    if (cls3 == cls2) {
                        return cls.getGenericInterfaces()[i];
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        genericSuperclass = cls.getGenericInterfaces()[i];
                        superclass = interfaces[i];
                        break;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    superclass = cls.getSuperclass();
                    if (superclass == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(superclass)) {
                        genericSuperclass = cls.getGenericSuperclass();
                        Type type2 = genericSuperclass;
                        cls = superclass;
                        type = type2;
                    } else {
                        cls = superclass;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    public static String MenuHostHelper$$ExternalSyntheticLambda1(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type MenuHostHelper$$ExternalSyntheticLambda0(Type type, Class<?> cls, Class<?> cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        return setIconTintList(type, cls, MenuHostHelper$$ExternalSyntheticLambda1(type, cls, cls2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:?, code lost:
        r10 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0042 A[LOOP:0: B:90:0x0000->B:111:0x0042, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0041 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type setIconTintList(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0629ym.setIconTintList(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void setX(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean setY(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation annotation : annotationArr) {
            if (cls.isInstance(annotation)) {
                return true;
            }
        }
        return false;
    }

    public static vH setY(vH vHVar) {
        C0602xo c0602xo = new C0602xo();
        vHVar.MenuHostHelper$$ExternalSyntheticLambda1().setIconTintList(c0602xo);
        return vH.MenuHostHelper$$ExternalSyntheticLambda1(vHVar.MenuHostHelper$$ExternalSyntheticLambda0(), vHVar.setIconTintList(), c0602xo);
    }

    public static Type MenuHostHelper$$ExternalSyntheticLambda0(int i, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < 0 || i >= actualTypeArguments.length) {
            StringBuilder sb = new StringBuilder("Index ");
            sb.append(i);
            sb.append(" not in range [0,");
            sb.append(actualTypeArguments.length);
            sb.append(") for ");
            sb.append(parameterizedType);
            throw new IllegalArgumentException(sb.toString());
        }
        Type type = actualTypeArguments[i];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    public static Type setIconTintList(ParameterizedType parameterizedType) {
        Type type = parameterizedType.getActualTypeArguments()[0];
        return type instanceof WildcardType ? ((WildcardType) type).getLowerBounds()[0] : type;
    }

    public static boolean setY(@Nullable Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (setY(type2)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            } else {
                String name = type == null ? "null" : type.getClass().getName();
                StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                sb.append(type);
                sb.append("> is of type ");
                sb.append(name);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return false;
    }

    /* renamed from: o.ym$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList implements ParameterizedType {
        private final Type MenuHostHelper$$ExternalSyntheticLambda0;
        @Nullable
        private final Type MenuHostHelper$$ExternalSyntheticLambda1;
        private final Type[] setX;

        public setIconTintList(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() == null)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                C0629ym.setX(type3);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = type;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = type2;
            this.setX = (Type[]) typeArr.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.setX.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        @Override // java.lang.reflect.ParameterizedType
        @Nullable
        public final Type getOwnerType() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(this, (ParameterizedType) obj);
        }

        public final int hashCode() {
            int hashCode = Arrays.hashCode(this.setX);
            int hashCode2 = this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
            Type type = this.MenuHostHelper$$ExternalSyntheticLambda1;
            return (hashCode ^ hashCode2) ^ (type != null ? type.hashCode() : 0);
        }

        public final String toString() {
            Type[] typeArr = this.setX;
            if (typeArr.length == 0) {
                return C0629ym.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(C0629ym.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0));
            sb.append("<");
            sb.append(C0629ym.MenuHostHelper$$ExternalSyntheticLambda1(this.setX[0]));
            for (int i = 1; i < this.setX.length; i++) {
                sb.append(", ");
                sb.append(C0629ym.MenuHostHelper$$ExternalSyntheticLambda1(this.setX[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: o.ym$setX */
    /* loaded from: classes.dex */
    public static final class setX implements GenericArrayType {
        private final Type MenuHostHelper$$ExternalSyntheticLambda1;

        setX(Type type) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = type;
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C0629ym.MenuHostHelper$$ExternalSyntheticLambda0(this, (GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C0629ym.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1));
            sb.append("[]");
            return sb.toString();
        }
    }

    public static void setX(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}