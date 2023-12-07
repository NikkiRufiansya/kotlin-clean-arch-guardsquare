package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/* renamed from: o.hm  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214hm {
    private final Map<Type, gQ<?>> MenuHostHelper$$ExternalSyntheticLambda1;
    private final hJ setY;

    public C0214hm(Map<Type, gQ<?>> map) {
        hJ hJVar;
        hJVar = hJ.MenuHostHelper$$ExternalSyntheticLambda1;
        this.setY = hJVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = map;
    }

    private <T> InterfaceC0217hp<T> setIconTintList(Class<? super T> cls) {
        try {
            final Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.setY.setIconTintList(declaredConstructor);
            }
            return new InterfaceC0217hp<T>() { // from class: o.hm.7
                @Override // o.InterfaceC0217hp
                public final T setX() {
                    try {
                        return (T) declaredConstructor.newInstance(null);
                    } catch (IllegalAccessException e) {
                        throw new AssertionError(e);
                    } catch (InstantiationException e2) {
                        StringBuilder sb = new StringBuilder("Failed to invoke ");
                        sb.append(declaredConstructor);
                        sb.append(" with no args");
                        throw new RuntimeException(sb.toString(), e2);
                    } catch (InvocationTargetException e3) {
                        StringBuilder sb2 = new StringBuilder("Failed to invoke ");
                        sb2.append(declaredConstructor);
                        sb2.append(" with no args");
                        throw new RuntimeException(sb2.toString(), e3.getTargetException());
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public final String toString() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.toString();
    }

    public final <T> InterfaceC0217hp<T> MenuHostHelper$$ExternalSyntheticLambda1(hQ<T> hQVar) {
        InterfaceC0217hp<T> interfaceC0217hp;
        final Type type = hQVar.setY;
        final Class<? super T> cls = hQVar.setIconTintList;
        final gQ<?> gQVar = this.MenuHostHelper$$ExternalSyntheticLambda1.get(type);
        if (gQVar != null) {
            return new InterfaceC0217hp<T>() { // from class: o.hm.2
                @Override // o.InterfaceC0217hp
                public final T setX() {
                    return (T) gQVar.MenuHostHelper$$ExternalSyntheticLambda1();
                }
            };
        }
        final gQ<?> gQVar2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(cls);
        if (gQVar2 != null) {
            return new InterfaceC0217hp<T>() { // from class: o.hm.9
                @Override // o.InterfaceC0217hp
                public final T setX() {
                    return (T) gQVar2.MenuHostHelper$$ExternalSyntheticLambda1();
                }
            };
        }
        InterfaceC0217hp<T> iconTintList = setIconTintList(cls);
        if (iconTintList != null) {
            return iconTintList;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            if (SortedSet.class.isAssignableFrom(cls)) {
                interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.8
                    @Override // o.InterfaceC0217hp
                    public final T setX() {
                        return (T) new TreeSet();
                    }
                };
            } else if (EnumSet.class.isAssignableFrom(cls)) {
                interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.6
                    @Override // o.InterfaceC0217hp
                    public final T setX() {
                        Type type2 = type;
                        if (type2 instanceof ParameterizedType) {
                            Type type3 = ((ParameterizedType) type2).getActualTypeArguments()[0];
                            if (type3 instanceof Class) {
                                return (T) EnumSet.noneOf((Class) type3);
                            }
                            StringBuilder sb = new StringBuilder("Invalid EnumSet type: ");
                            sb.append(type.toString());
                            throw new gY(sb.toString());
                        }
                        StringBuilder sb2 = new StringBuilder("Invalid EnumSet type: ");
                        sb2.append(type.toString());
                        throw new gY(sb2.toString());
                    }
                };
            } else if (Set.class.isAssignableFrom(cls)) {
                interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.14
                    @Override // o.InterfaceC0217hp
                    public final T setX() {
                        return (T) new LinkedHashSet();
                    }
                };
            } else if (Queue.class.isAssignableFrom(cls)) {
                interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.11
                    @Override // o.InterfaceC0217hp
                    public final T setX() {
                        return (T) new ArrayDeque();
                    }
                };
            } else {
                interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.13
                    @Override // o.InterfaceC0217hp
                    public final T setX() {
                        return (T) new ArrayList();
                    }
                };
            }
        } else if (!Map.class.isAssignableFrom(cls)) {
            interfaceC0217hp = null;
        } else if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
            interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.15
                @Override // o.InterfaceC0217hp
                public final T setX() {
                    return (T) new ConcurrentSkipListMap();
                }
            };
        } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
            interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.1
                @Override // o.InterfaceC0217hp
                public final T setX() {
                    return (T) new ConcurrentHashMap();
                }
            };
        } else if (SortedMap.class.isAssignableFrom(cls)) {
            interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.4
                @Override // o.InterfaceC0217hp
                public final T setX() {
                    return (T) new TreeMap();
                }
            };
        } else if ((type instanceof ParameterizedType) && !String.class.isAssignableFrom(new hQ(((ParameterizedType) type).getActualTypeArguments()[0]).setIconTintList)) {
            interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.3
                @Override // o.InterfaceC0217hp
                public final T setX() {
                    return (T) new LinkedHashMap();
                }
            };
        } else {
            interfaceC0217hp = new InterfaceC0217hp<T>() { // from class: o.hm.5
                @Override // o.InterfaceC0217hp
                public final T setX() {
                    return (T) new C0218hq();
                }
            };
        }
        return interfaceC0217hp != null ? interfaceC0217hp : new InterfaceC0217hp<T>() { // from class: o.hm.10
            private final AbstractC0222hu setX = AbstractC0222hu.MenuHostHelper$$ExternalSyntheticLambda0();

            @Override // o.InterfaceC0217hp
            public final T setX() {
                try {
                    return (T) this.setX.MenuHostHelper$$ExternalSyntheticLambda0(cls);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Unable to invoke no-args constructor for ");
                    sb.append(type);
                    sb.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(sb.toString(), e);
                }
            }
        };
    }
}