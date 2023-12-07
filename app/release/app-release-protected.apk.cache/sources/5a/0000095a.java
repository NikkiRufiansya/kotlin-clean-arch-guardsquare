package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class setApplyingOpacityToLayersEnabled {
    private static Map<Class<?>, Integer> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap();
    private static Map<Class<?>, List<Constructor<? extends ComponentActivity$3>>> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setCheckable setX(Object obj) {
        boolean z = obj instanceof setCheckable;
        boolean z2 = obj instanceof setItemInvoker;
        if (z && z2) {
            return new androidx.lifecycle.FullLifecycleObserverAdapter((setItemInvoker) obj, (setCheckable) obj);
        }
        if (z2) {
            return new androidx.lifecycle.FullLifecycleObserverAdapter((setItemInvoker) obj, null);
        }
        if (z) {
            return (setCheckable) obj;
        }
        Class<?> cls = obj.getClass();
        if (MenuHostHelper$$ExternalSyntheticLambda0(cls) == 2) {
            List<Constructor<? extends ComponentActivity$3>> list = MenuHostHelper$$ExternalSyntheticLambda0.get(cls);
            if (list.size() == 1) {
                return new androidx.lifecycle.SingleGeneratedAdapterObserver(setX(list.get(0), obj));
            }
            ComponentActivity$3[] componentActivity$3Arr = new ComponentActivity$3[list.size()];
            for (int i = 0; i < list.size(); i++) {
                componentActivity$3Arr[i] = setX(list.get(i), obj);
            }
            return new androidx.lifecycle.CompositeGeneratedAdaptersObserver(componentActivity$3Arr);
        }
        return new androidx.lifecycle.ReflectiveGenericLifecycleObserver(obj);
    }

    private static ComponentActivity$3 setX(Constructor<? extends ComponentActivity$3> constructor, Object obj) {
        try {
            return constructor.newInstance(obj);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    private static Constructor<? extends ComponentActivity$3> MenuHostHelper$$ExternalSyntheticLambda1(Class<?> cls) {
        try {
            Package r1 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r1 != null ? r1.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(canonicalName.replace(".", "_"));
            sb.append("_LifecycleAdapter");
            String obj = sb.toString();
            if (!name.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append(".");
                sb2.append(obj);
                obj = sb2.toString();
            }
            Constructor declaredConstructor = Class.forName(obj).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda0(Class<?> cls) {
        boolean z;
        ArrayList arrayList;
        Integer num = MenuHostHelper$$ExternalSyntheticLambda1.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 2;
        if (cls.getCanonicalName() != null) {
            Constructor<? extends ComponentActivity$3> MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(cls);
            if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                MenuHostHelper$$ExternalSyntheticLambda0.put(cls, Collections.singletonList(MenuHostHelper$$ExternalSyntheticLambda12));
            } else {
                CoroutineExceptionHandler coroutineExceptionHandler = CoroutineExceptionHandler.setX;
                Boolean bool = coroutineExceptionHandler.setY.get(cls);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    Method[] iconTintList = CoroutineExceptionHandler.setIconTintList(cls);
                    int length = iconTintList.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (((setItemActiveIndicatorColor) iconTintList[i2].getAnnotation(setItemActiveIndicatorColor.class)) != null) {
                                coroutineExceptionHandler.setIconTintList(cls, iconTintList);
                                z = true;
                                break;
                            }
                            i2++;
                        } else {
                            coroutineExceptionHandler.setY.put(cls, Boolean.FALSE);
                            z = false;
                            break;
                        }
                    }
                }
                if (!z) {
                    Class<? super Object> superclass = cls.getSuperclass();
                    if (superclass != null && setOnFlingListener.class.isAssignableFrom(superclass)) {
                        arrayList = MenuHostHelper$$ExternalSyntheticLambda0(superclass) != 1 ? new ArrayList(MenuHostHelper$$ExternalSyntheticLambda0.get(superclass)) : null;
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length2 = interfaces.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 < length2) {
                            Class<?> cls2 = interfaces[i3];
                            if (cls2 != null && setOnFlingListener.class.isAssignableFrom(cls2)) {
                                if (MenuHostHelper$$ExternalSyntheticLambda0(cls2) == 1) {
                                    break;
                                }
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                arrayList.addAll(MenuHostHelper$$ExternalSyntheticLambda0.get(cls2));
                            }
                            i3++;
                        } else if (arrayList != null) {
                            MenuHostHelper$$ExternalSyntheticLambda0.put(cls, arrayList);
                        }
                    }
                }
            }
            MenuHostHelper$$ExternalSyntheticLambda1.put(cls, Integer.valueOf(i));
            return i;
        }
        i = 1;
        MenuHostHelper$$ExternalSyntheticLambda1.put(cls, Integer.valueOf(i));
        return i;
    }
}