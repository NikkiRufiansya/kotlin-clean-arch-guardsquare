package o;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: o.hl  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0213hl {
    static final Type[] MenuHostHelper$$ExternalSyntheticLambda0 = new Type[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [o.hl$setIconTintList] */
    public static Type MenuHostHelper$$ExternalSyntheticLambda1(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                cls = new setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1(cls.getComponentType()));
            }
            return cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new hl$MenuHostHelper$$ExternalSyntheticLambda1(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new setIconTintList(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                return new setY(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
            }
            return type;
        }
    }

    public static Class<?> MenuHostHelper$$ExternalSyntheticLambda0(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(MenuHostHelper$$ExternalSyntheticLambda0(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    String name = type == null ? "null" : type.getClass().getName();
                    StringBuilder sb = new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <");
                    sb.append(type);
                    sb.append("> is of type ");
                    sb.append(name);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return (Class) type;
    }

    public static boolean setX(Type type, Type type2) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setX(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static String setIconTintList(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    private static Type setY(Type type, Class<?> cls, Class<?> cls2) {
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

    private static Type setX(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (!cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException();
        }
        return MenuHostHelper$$ExternalSyntheticLambda1(type, cls, setY(type, cls, cls2), new HashSet());
    }

    public static Type setY(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    public static Type setX(Type type, Class<?> cls) {
        Type x = setX(type, cls, Collection.class);
        if (x instanceof WildcardType) {
            x = ((WildcardType) x).getUpperBounds()[0];
        }
        if (x instanceof ParameterizedType) {
            return ((ParameterizedType) x).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type[] MenuHostHelper$$ExternalSyntheticLambda1(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type x = setX(type, cls, Map.class);
        return x instanceof ParameterizedType ? ((ParameterizedType) x).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Type setY(Type type, Class<?> cls, Type type2) {
        return MenuHostHelper$$ExternalSyntheticLambda1(type, cls, type2, new HashSet());
    }

    private static Type MenuHostHelper$$ExternalSyntheticLambda1(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        TypeVariable typeVariable;
        do {
            int i = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (collection.contains(typeVariable)) {
                    return type2;
                }
                collection.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
                if (cls2 != null) {
                    Type y = setY(type, cls, (Class<?>) cls2);
                    if (y instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i < length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) y).getActualTypeArguments()[i];
                                continue;
                            } else {
                                i++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(type, cls, componentType, collection);
                        return componentType == MenuHostHelper$$ExternalSyntheticLambda1 ? cls3 : new setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(type, cls, genericComponentType, collection);
                    return genericComponentType == MenuHostHelper$$ExternalSyntheticLambda12 ? genericArrayType : new setIconTintList(MenuHostHelper$$ExternalSyntheticLambda12);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda1(type, cls, ownerType, collection);
                    boolean z = MenuHostHelper$$ExternalSyntheticLambda13 != ownerType;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i < length2) {
                        Type MenuHostHelper$$ExternalSyntheticLambda14 = MenuHostHelper$$ExternalSyntheticLambda1(type, cls, actualTypeArguments[i], collection);
                        if (MenuHostHelper$$ExternalSyntheticLambda14 != actualTypeArguments[i]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i] = MenuHostHelper$$ExternalSyntheticLambda14;
                        }
                        i++;
                    }
                    return z ? new hl$MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda13, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
                } else {
                    boolean z2 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type MenuHostHelper$$ExternalSyntheticLambda15 = MenuHostHelper$$ExternalSyntheticLambda1(type, cls, lowerBounds[0], collection);
                            wildcardType = wildcardType2;
                            if (MenuHostHelper$$ExternalSyntheticLambda15 != lowerBounds[0]) {
                                return new setY(new Type[]{Object.class}, MenuHostHelper$$ExternalSyntheticLambda15 instanceof WildcardType ? ((WildcardType) MenuHostHelper$$ExternalSyntheticLambda15).getLowerBounds() : new Type[]{MenuHostHelper$$ExternalSyntheticLambda15});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type MenuHostHelper$$ExternalSyntheticLambda16 = MenuHostHelper$$ExternalSyntheticLambda1(type, cls, upperBounds[0], collection);
                                wildcardType = wildcardType2;
                                if (MenuHostHelper$$ExternalSyntheticLambda16 != upperBounds[0]) {
                                    return new setY(MenuHostHelper$$ExternalSyntheticLambda16 instanceof WildcardType ? ((WildcardType) MenuHostHelper$$ExternalSyntheticLambda16).getUpperBounds() : new Type[]{MenuHostHelper$$ExternalSyntheticLambda16}, MenuHostHelper$$ExternalSyntheticLambda0);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setX(Type type) {
        if (!(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true)) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.hl$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList implements GenericArrayType, Serializable {
        private final Type setY;

        public setIconTintList(Type type) {
            this.setY = C0213hl.MenuHostHelper$$ExternalSyntheticLambda1(type);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.setY;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C0213hl.setX(this, (GenericArrayType) obj);
        }

        public final int hashCode() {
            return this.setY.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(C0213hl.setIconTintList(this.setY));
            sb.append("[]");
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.hl$setY */
    /* loaded from: classes.dex */
    public static final class setY implements WildcardType, Serializable {
        private final Type setIconTintList;
        private final Type setX;

        public setY(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length <= 1) {
                if (typeArr.length == 1) {
                    if (typeArr2.length == 1) {
                        Type type = typeArr2[0];
                        C0213hl.setX(typeArr2[0]);
                        if (typeArr[0] == Object.class) {
                            this.setX = C0213hl.MenuHostHelper$$ExternalSyntheticLambda1(typeArr2[0]);
                            this.setIconTintList = Object.class;
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    Type type2 = typeArr[0];
                    C0213hl.setX(typeArr[0]);
                    this.setX = null;
                    this.setIconTintList = C0213hl.MenuHostHelper$$ExternalSyntheticLambda1(typeArr[0]);
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.setIconTintList};
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.setX;
            return type != null ? new Type[]{type} : C0213hl.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C0213hl.setX(this, (WildcardType) obj);
        }

        public final int hashCode() {
            Type type = this.setX;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.setIconTintList.hashCode() + 31);
        }

        public final String toString() {
            if (this.setX != null) {
                StringBuilder sb = new StringBuilder("? super ");
                sb.append(C0213hl.setIconTintList(this.setX));
                return sb.toString();
            } else if (this.setIconTintList == Object.class) {
                return "?";
            } else {
                StringBuilder sb2 = new StringBuilder("? extends ");
                sb2.append(C0213hl.setIconTintList(this.setIconTintList));
                return sb2.toString();
            }
        }
    }
}