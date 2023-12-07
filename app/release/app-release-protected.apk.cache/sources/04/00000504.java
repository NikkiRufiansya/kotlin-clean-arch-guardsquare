package o;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import o.SingleGeneratedAdapterObserver;
import o.setTextMetricsParams;

/* loaded from: classes.dex */
public class getStrokeColor extends setWindowInsetsAnimationCallback {
    protected final Method MenuHostHelper$$ExternalSyntheticLambda0;
    protected final Method MenuHostHelper$$ExternalSyntheticLambda1;
    protected final Method setIconTintList;
    protected final Method setNavigationOnClickListener;
    protected final Constructor<?> setOnLongClickListener;
    protected final Class<?> setX;
    protected final Method setY;

    public getStrokeColor() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            constructor = setY(MenuHostHelper$$ExternalSyntheticLambda0);
            method2 = setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
            method3 = MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0);
            method4 = setUiOptions(MenuHostHelper$$ExternalSyntheticLambda0);
            method5 = setX(MenuHostHelper$$ExternalSyntheticLambda0);
            method = MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0);
            cls = MenuHostHelper$$ExternalSyntheticLambda0;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            StringBuilder sb = new StringBuilder("Unable to collect necessary methods for class ");
            sb.append(e.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", sb.toString(), e);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.setX = cls;
        this.setOnLongClickListener = constructor;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = method2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = method3;
        this.setNavigationOnClickListener = method4;
        this.setY = method5;
        this.setIconTintList = method;
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1 != null;
    }

    private Object setIconTintList() {
        try {
            return this.setOnLongClickListener.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.MenuHostHelper$$ExternalSyntheticLambda1.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean MenuHostHelper$$ExternalSyntheticLambda0(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.MenuHostHelper$$ExternalSyntheticLambda0.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    protected Typeface setY(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.setX, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.setIconTintList.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    private boolean setIconTintList(Object obj) {
        try {
            return ((Boolean) this.setNavigationOnClickListener.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        try {
            this.setY.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // o.setWindowInsetsAnimationCallback, o.setKeyProgressIncrement
    public Typeface setIconTintList(Context context, setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0 settextmetricsparams_menuhosthelper__externalsyntheticlambda0, Resources resources, int i) {
        setTextMetricsParams.setY[] MenuHostHelper$$ExternalSyntheticLambda0;
        if (!MenuHostHelper$$ExternalSyntheticLambda1()) {
            return super.setIconTintList(context, settextmetricsparams_menuhosthelper__externalsyntheticlambda0, resources, i);
        }
        Object iconTintList = setIconTintList();
        if (iconTintList == null) {
            return null;
        }
        for (setTextMetricsParams.setY sety : settextmetricsparams_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0()) {
            if (!MenuHostHelper$$ExternalSyntheticLambda0(context, iconTintList, sety.setY(), sety.MenuHostHelper$$ExternalSyntheticLambda1(), sety.MenuHostHelper$$ExternalSyntheticLambda0(), sety.setNavigationOnClickListener() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(sety.setX()))) {
                MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
                return null;
            }
        }
        if (setIconTintList(iconTintList)) {
            return setY(iconTintList);
        }
        return null;
    }

    @Override // o.setWindowInsetsAnimationCallback, o.setKeyProgressIncrement
    public Typeface setX(Context context, CancellationSignal cancellationSignal, SingleGeneratedAdapterObserver.setX[] setxArr, int i) {
        Typeface y;
        if (setxArr.length <= 0) {
            return null;
        }
        if (!MenuHostHelper$$ExternalSyntheticLambda1()) {
            SingleGeneratedAdapterObserver.setX MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(setxArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(MenuHostHelper$$ExternalSyntheticLambda0.setX()).setItalic(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            }
        }
        Map<Uri, ByteBuffer> iconTintList = setExpandedFormat.setIconTintList(context, setxArr, cancellationSignal);
        Object iconTintList2 = setIconTintList();
        if (iconTintList2 == null) {
            return null;
        }
        boolean z = false;
        for (SingleGeneratedAdapterObserver.setX setx : setxArr) {
            ByteBuffer byteBuffer = iconTintList.get(setx.setIconTintList());
            if (byteBuffer != null) {
                if (!MenuHostHelper$$ExternalSyntheticLambda0(iconTintList2, byteBuffer, setx.setY(), setx.setX(), setx.MenuHostHelper$$ExternalSyntheticLambda1() ? 1 : 0)) {
                    MenuHostHelper$$ExternalSyntheticLambda0(iconTintList2);
                    return null;
                }
                z = true;
            }
        }
        if (!z) {
            MenuHostHelper$$ExternalSyntheticLambda0(iconTintList2);
            return null;
        } else if (setIconTintList(iconTintList2) && (y = setY(iconTintList2)) != null) {
            return Typeface.create(y, i);
        } else {
            return null;
        }
    }

    @Override // o.setKeyProgressIncrement
    public Typeface MenuHostHelper$$ExternalSyntheticLambda1(Context context, Resources resources, int i, String str, int i2) {
        if (!MenuHostHelper$$ExternalSyntheticLambda1()) {
            return super.MenuHostHelper$$ExternalSyntheticLambda1(context, resources, i, str, i2);
        }
        Object iconTintList = setIconTintList();
        if (iconTintList == null) {
            return null;
        }
        if (!MenuHostHelper$$ExternalSyntheticLambda0(context, iconTintList, str, 0, -1, -1, null)) {
            MenuHostHelper$$ExternalSyntheticLambda0(iconTintList);
            return null;
        } else if (setIconTintList(iconTintList)) {
            return setY(iconTintList);
        } else {
            return null;
        }
    }

    protected Class<?> MenuHostHelper$$ExternalSyntheticLambda0() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor<?> setY(Class<?> cls) {
        return cls.getConstructor(new Class[0]);
    }

    protected Method setIconTintList(Class<?> cls) {
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, FontVariationAxis[].class);
    }

    protected Method MenuHostHelper$$ExternalSyntheticLambda1(Class<?> cls) {
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, Integer.TYPE, FontVariationAxis[].class, Integer.TYPE, Integer.TYPE);
    }

    protected Method setUiOptions(Class<?> cls) {
        return cls.getMethod("freeze", new Class[0]);
    }

    protected Method setX(Class<?> cls) {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    protected Method MenuHostHelper$$ExternalSyntheticLambda0(Class<?> cls) {
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), Integer.TYPE, Integer.TYPE);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}