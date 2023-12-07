package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.registerIn;

@Deprecated
/* loaded from: classes.dex */
public final class CoroutineExceptionHandler {
    public static CoroutineExceptionHandler setX = new CoroutineExceptionHandler();
    public final Map<Class<?>, setY> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap();
    final Map<Class<?>, Boolean> setY = new HashMap();

    CoroutineExceptionHandler() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Method[] setIconTintList(Class<?> cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }

    private static void setX(Map<CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1, registerIn.setX> map, CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1 coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1, registerIn.setX setx, Class<?> cls) {
        registerIn.setX setx2 = map.get(coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1);
        if (setx2 == null || setx == setx2) {
            if (setx2 == null) {
                map.put(coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1, setx);
                return;
            }
            return;
        }
        Method method = coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
        StringBuilder sb = new StringBuilder("Method ");
        sb.append(method.getName());
        sb.append(" in ");
        sb.append(cls.getName());
        sb.append(" already declared with different @OnLifecycleEvent value: previous value ");
        sb.append(setx2);
        sb.append(", new value ");
        sb.append(setx);
        throw new IllegalArgumentException(sb.toString());
    }

    public final setY setIconTintList(Class<?> cls, Method[] methodArr) {
        Class<?>[] interfaces;
        int i;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            setY sety = this.MenuHostHelper$$ExternalSyntheticLambda0.get(superclass);
            if (sety == null) {
                sety = setIconTintList(superclass, null);
            }
            if (sety != null) {
                hashMap.putAll(sety.MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            setY sety2 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(cls2);
            if (sety2 == null) {
                sety2 = setIconTintList(cls2, null);
            }
            for (Map.Entry<CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1, registerIn.setX> entry : sety2.MenuHostHelper$$ExternalSyntheticLambda0.entrySet()) {
                setX(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = setIconTintList(cls);
        }
        boolean z = false;
        for (Method method : methodArr) {
            setItemActiveIndicatorColor setitemactiveindicatorcolor = (setItemActiveIndicatorColor) method.getAnnotation(setItemActiveIndicatorColor.class);
            if (setitemactiveindicatorcolor != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else if (!parameterTypes[0].isAssignableFrom(setTouchDelegate.class)) {
                    throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                } else {
                    i = 1;
                }
                registerIn.setX x = setitemactiveindicatorcolor.setX();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(registerIn.setX.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (x != registerIn.setX.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                setX(hashMap, new CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1(i, method), x, cls);
                z = true;
            }
        }
        setY sety3 = new setY(hashMap);
        this.MenuHostHelper$$ExternalSyntheticLambda0.put(cls, sety3);
        this.setY.put(cls, Boolean.valueOf(z));
        return sety3;
    }

    @Deprecated
    /* loaded from: classes.dex */
    public static class setY {
        final Map<CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1, registerIn.setX> MenuHostHelper$$ExternalSyntheticLambda0;
        public final Map<registerIn.setX, List<CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1>> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap();

        setY(Map<CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1, registerIn.setX> map) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = map;
            for (Map.Entry<CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1, registerIn.setX> entry : map.entrySet()) {
                registerIn.setX value = entry.getValue();
                List<CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1> list = this.MenuHostHelper$$ExternalSyntheticLambda1.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.MenuHostHelper$$ExternalSyntheticLambda1.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void setIconTintList(List<CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1> list, setTouchDelegate settouchdelegate, registerIn.setX setx, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    CoroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1 coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1 = list.get(size);
                    try {
                        int i = coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
                        if (i == 0) {
                            coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.invoke(obj, settouchdelegate);
                        } else if (i == 2) {
                            coroutineExceptionHandler$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.invoke(obj, settouchdelegate, setx);
                        }
                    } catch (IllegalAccessException e) {
                        throw new RuntimeException(e);
                    } catch (InvocationTargetException e2) {
                        throw new RuntimeException("Failed to call observer method", e2.getCause());
                    }
                }
            }
        }
    }
}