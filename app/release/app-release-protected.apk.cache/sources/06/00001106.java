package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import o.SingleGeneratedAdapterObserver;
import o.setTextMetricsParams;

/* loaded from: classes.dex */
class setWindowInsetsAnimationCallback extends setKeyProgressIncrement {
    private static boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
    private static Method MenuHostHelper$$ExternalSyntheticLambda1;
    private static Class<?> setIconTintList;
    private static Method setX;
    private static Constructor<?> setY;

    private static void MenuHostHelper$$ExternalSyntheticLambda1() {
        Method method;
        Class<?> cls;
        Method method2;
        if (MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda0 = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            method = null;
            cls = null;
            method2 = null;
        }
        setY = constructor;
        setIconTintList = cls;
        setX = method2;
        MenuHostHelper$$ExternalSyntheticLambda1 = method;
    }

    private File MenuHostHelper$$ExternalSyntheticLambda1(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            StringBuilder sb = new StringBuilder("/proc/self/fd/");
            sb.append(parcelFileDescriptor.getFd());
            String readlink = Os.readlink(sb.toString());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
            return null;
        } catch (ErrnoException unused) {
            return null;
        }
    }

    private static Object setIconTintList() {
        MenuHostHelper$$ExternalSyntheticLambda1();
        try {
            return setY.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static Typeface setIconTintList(Object obj) {
        MenuHostHelper$$ExternalSyntheticLambda1();
        try {
            Object newInstance = Array.newInstance(setIconTintList, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) MenuHostHelper$$ExternalSyntheticLambda1.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(Object obj, String str, int i, boolean z) {
        MenuHostHelper$$ExternalSyntheticLambda1();
        try {
            return ((Boolean) setX.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // o.setKeyProgressIncrement
    public Typeface setX(Context context, CancellationSignal cancellationSignal, SingleGeneratedAdapterObserver.setX[] setxArr, int i) {
        if (setxArr.length <= 0) {
            return null;
        }
        SingleGeneratedAdapterObserver.setX MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(setxArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(MenuHostHelper$$ExternalSyntheticLambda02.setIconTintList(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            File MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(openFileDescriptor);
            if (MenuHostHelper$$ExternalSyntheticLambda12 != null && MenuHostHelper$$ExternalSyntheticLambda12.canRead()) {
                Typeface createFromFile = Typeface.createFromFile(MenuHostHelper$$ExternalSyntheticLambda12);
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return createFromFile;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            Typeface iconTintList = super.setIconTintList(context, fileInputStream);
            fileInputStream.close();
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
            }
            return iconTintList;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // o.setKeyProgressIncrement
    public Typeface setIconTintList(Context context, setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0 settextmetricsparams_menuhosthelper__externalsyntheticlambda0, Resources resources, int i) {
        setTextMetricsParams.setY[] MenuHostHelper$$ExternalSyntheticLambda02;
        Object iconTintList = setIconTintList();
        for (setTextMetricsParams.setY sety : settextmetricsparams_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0()) {
            File x = setExpandedFormat.setX(context);
            if (x == null) {
                return null;
            }
            try {
                if (!setExpandedFormat.setY(x, resources, sety.setIconTintList())) {
                    return null;
                }
                if (!MenuHostHelper$$ExternalSyntheticLambda0(iconTintList, x.getPath(), sety.MenuHostHelper$$ExternalSyntheticLambda0(), sety.setNavigationOnClickListener())) {
                    return null;
                }
                x.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                x.delete();
            }
        }
        return setIconTintList(iconTintList);
    }
}