package o;

import java.lang.reflect.InvocationTargetException;
import o.setDropDownBackgroundResource;

/* loaded from: classes.dex */
public class setForegroundTintMode {
    private static final setDividerHeight<ClassLoader, setDividerHeight<String, Class<?>>> MenuHostHelper$$ExternalSyntheticLambda0 = new setDividerHeight<>();

    private static Class<?> MenuHostHelper$$ExternalSyntheticLambda0(ClassLoader classLoader, String str) {
        setDividerHeight<ClassLoader, setDividerHeight<String, Class<?>>> setdividerheight = MenuHostHelper$$ExternalSyntheticLambda0;
        setDividerHeight<String, Class<?>> setdividerheight2 = setdividerheight.get(classLoader);
        if (setdividerheight2 == null) {
            setdividerheight2 = new setDividerHeight<>();
            setdividerheight.put(classLoader, setdividerheight2);
        }
        Class<?> cls = setdividerheight2.get(str);
        if (cls == null) {
            Class<?> cls2 = Class.forName(str, false, classLoader);
            setdividerheight2.put(str, cls2);
            return cls2;
        }
        return cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setY(ClassLoader classLoader, String str) {
        try {
            return setDropDownBackgroundResource.class.isAssignableFrom(MenuHostHelper$$ExternalSyntheticLambda0(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class<? extends setDropDownBackgroundResource> setX(ClassLoader classLoader, String str) {
        try {
            return MenuHostHelper$$ExternalSyntheticLambda0(classLoader, str);
        } catch (ClassCastException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class is a valid subclass of Fragment");
            throw new setDropDownBackgroundResource.setIconTintList(sb.toString(), e);
        } catch (ClassNotFoundException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists");
            throw new setDropDownBackgroundResource.setIconTintList(sb2.toString(), e2);
        }
    }

    public setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda1(ClassLoader classLoader, String str) {
        try {
            return setX(classLoader, str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e) {
            StringBuilder sb = new StringBuilder("Unable to instantiate fragment ");
            sb.append(str);
            sb.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new setDropDownBackgroundResource.setIconTintList(sb.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sb2 = new StringBuilder("Unable to instantiate fragment ");
            sb2.append(str);
            sb2.append(": make sure class name exists, is public, and has an empty constructor that is public");
            throw new setDropDownBackgroundResource.setIconTintList(sb2.toString(), e2);
        } catch (NoSuchMethodException e3) {
            StringBuilder sb3 = new StringBuilder("Unable to instantiate fragment ");
            sb3.append(str);
            sb3.append(": could not find Fragment constructor");
            throw new setDropDownBackgroundResource.setIconTintList(sb3.toString(), e3);
        } catch (InvocationTargetException e4) {
            StringBuilder sb4 = new StringBuilder("Unable to instantiate fragment ");
            sb4.append(str);
            sb4.append(": calling Fragment constructor caused an exception");
            throw new setDropDownBackgroundResource.setIconTintList(sb4.toString(), e4);
        }
    }
}