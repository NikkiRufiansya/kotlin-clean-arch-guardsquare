package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import o.SingleGeneratedAdapterObserver;
import o.setTextMetricsParams;

/* loaded from: classes.dex */
class setMinLines extends setKeyProgressIncrement {
    private static final Method MenuHostHelper$$ExternalSyntheticLambda0;
    private static final Method MenuHostHelper$$ExternalSyntheticLambda1;
    private static final Class<?> setIconTintList;
    private static final Constructor<?> setX;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            method2 = null;
        }
        setX = constructor;
        setIconTintList = cls;
        MenuHostHelper$$ExternalSyntheticLambda1 = method2;
        MenuHostHelper$$ExternalSyntheticLambda0 = method;
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        Method method = MenuHostHelper$$ExternalSyntheticLambda1;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    private static Object MenuHostHelper$$ExternalSyntheticLambda0() {
        try {
            return setX.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean setIconTintList(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) MenuHostHelper$$ExternalSyntheticLambda1.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private static Typeface setX(Object obj) {
        try {
            Object newInstance = Array.newInstance(setIconTintList, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) MenuHostHelper$$ExternalSyntheticLambda0.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // o.setKeyProgressIncrement
    public Typeface setX(Context context, CancellationSignal cancellationSignal, SingleGeneratedAdapterObserver.setX[] setxArr, int i) {
        Object MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda02 == null) {
            return null;
        }
        setDividerHeight setdividerheight = new setDividerHeight();
        for (SingleGeneratedAdapterObserver.setX setx : setxArr) {
            Uri iconTintList = setx.setIconTintList();
            ByteBuffer byteBuffer = (ByteBuffer) setdividerheight.get(iconTintList);
            if (byteBuffer == null) {
                byteBuffer = setExpandedFormat.setY(context, cancellationSignal, iconTintList);
                setdividerheight.put(iconTintList, byteBuffer);
            }
            if (byteBuffer == null || !setIconTintList(MenuHostHelper$$ExternalSyntheticLambda02, byteBuffer, setx.setY(), setx.setX(), setx.MenuHostHelper$$ExternalSyntheticLambda1())) {
                return null;
            }
        }
        Typeface x = setX(MenuHostHelper$$ExternalSyntheticLambda02);
        if (x == null) {
            return null;
        }
        return Typeface.create(x, i);
    }

    @Override // o.setKeyProgressIncrement
    public Typeface setIconTintList(Context context, setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0 settextmetricsparams_menuhosthelper__externalsyntheticlambda0, Resources resources, int i) {
        setTextMetricsParams.setY[] MenuHostHelper$$ExternalSyntheticLambda02;
        Object MenuHostHelper$$ExternalSyntheticLambda03 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda03 == null) {
            return null;
        }
        for (setTextMetricsParams.setY sety : settextmetricsparams_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0()) {
            ByteBuffer MenuHostHelper$$ExternalSyntheticLambda12 = setExpandedFormat.MenuHostHelper$$ExternalSyntheticLambda1(context, resources, sety.setIconTintList());
            if (MenuHostHelper$$ExternalSyntheticLambda12 == null || !setIconTintList(MenuHostHelper$$ExternalSyntheticLambda03, MenuHostHelper$$ExternalSyntheticLambda12, sety.MenuHostHelper$$ExternalSyntheticLambda1(), sety.MenuHostHelper$$ExternalSyntheticLambda0(), sety.setNavigationOnClickListener())) {
                return null;
            }
        }
        return setX(MenuHostHelper$$ExternalSyntheticLambda03);
    }
}