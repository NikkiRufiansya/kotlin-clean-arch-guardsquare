package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import o.SingleGeneratedAdapterObserver;
import o.setTextMetricsParams;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setKeyProgressIncrement {
    private ConcurrentHashMap<Long, setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0> MenuHostHelper$$ExternalSyntheticLambda1 = new ConcurrentHashMap<>();

    private static <T> T MenuHostHelper$$ExternalSyntheticLambda0(T[] tArr, int i, setKeyProgressIncrement$MenuHostHelper$$ExternalSyntheticLambda1<T> setkeyprogressincrement_menuhosthelper__externalsyntheticlambda1) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(setkeyprogressincrement_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0(t2) - i2) << 1) + (setkeyprogressincrement_menuhosthelper__externalsyntheticlambda1.setIconTintList(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    private static long MenuHostHelper$$ExternalSyntheticLambda0(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public SingleGeneratedAdapterObserver.setX MenuHostHelper$$ExternalSyntheticLambda0(SingleGeneratedAdapterObserver.setX[] setxArr, int i) {
        return (SingleGeneratedAdapterObserver.setX) MenuHostHelper$$ExternalSyntheticLambda0(setxArr, i, new setKeyProgressIncrement$MenuHostHelper$$ExternalSyntheticLambda1<SingleGeneratedAdapterObserver.setX>() { // from class: o.setKeyProgressIncrement.4
            @Override // o.setKeyProgressIncrement$MenuHostHelper$$ExternalSyntheticLambda1
            /* renamed from: setY */
            public int MenuHostHelper$$ExternalSyntheticLambda0(SingleGeneratedAdapterObserver.setX setx) {
                return setx.setX();
            }

            @Override // o.setKeyProgressIncrement$MenuHostHelper$$ExternalSyntheticLambda1
            public boolean setIconTintList(SingleGeneratedAdapterObserver.setX setx) {
                return setx.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Typeface setIconTintList(Context context, InputStream inputStream) {
        File x = setExpandedFormat.setX(context);
        if (x == null) {
            return null;
        }
        try {
            if (setExpandedFormat.setIconTintList(x, inputStream)) {
                return Typeface.createFromFile(x.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x.delete();
        }
    }

    public Typeface setX(Context context, CancellationSignal cancellationSignal, SingleGeneratedAdapterObserver.setX[] setxArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (setxArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(MenuHostHelper$$ExternalSyntheticLambda0(setxArr, i).setIconTintList());
            try {
                Typeface iconTintList = setIconTintList(context, inputStream);
                setExpandedFormat.setX(inputStream);
                return iconTintList;
            } catch (IOException unused) {
                setExpandedFormat.setX(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                setExpandedFormat.setX(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private setTextMetricsParams.setY setX(setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0 settextmetricsparams_menuhosthelper__externalsyntheticlambda0, int i) {
        return (setTextMetricsParams.setY) MenuHostHelper$$ExternalSyntheticLambda0(settextmetricsparams_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0(), i, new setKeyProgressIncrement$MenuHostHelper$$ExternalSyntheticLambda1<setTextMetricsParams.setY>() { // from class: o.setKeyProgressIncrement.3
            @Override // o.setKeyProgressIncrement$MenuHostHelper$$ExternalSyntheticLambda1
            /* renamed from: setIconTintList  reason: avoid collision after fix types in other method */
            public int MenuHostHelper$$ExternalSyntheticLambda0(setTextMetricsParams.setY sety) {
                return sety.MenuHostHelper$$ExternalSyntheticLambda0();
            }

            @Override // o.setKeyProgressIncrement$MenuHostHelper$$ExternalSyntheticLambda1
            /* renamed from: setX */
            public boolean setIconTintList(setTextMetricsParams.setY sety) {
                return sety.setNavigationOnClickListener();
            }
        });
    }

    public Typeface setIconTintList(Context context, setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0 settextmetricsparams_menuhosthelper__externalsyntheticlambda0, Resources resources, int i) {
        setTextMetricsParams.setY x = setX(settextmetricsparams_menuhosthelper__externalsyntheticlambda0, i);
        if (x == null) {
            return null;
        }
        Typeface y = copyRootViewBounds.setY(context, resources, x.setIconTintList(), x.setY(), 0, i);
        setIconTintList(y, settextmetricsparams_menuhosthelper__externalsyntheticlambda0);
        return y;
    }

    public Typeface MenuHostHelper$$ExternalSyntheticLambda1(Context context, Resources resources, int i, String str, int i2) {
        File x = setExpandedFormat.setX(context);
        if (x == null) {
            return null;
        }
        try {
            if (setExpandedFormat.setY(x, resources, i)) {
                return Typeface.createFromFile(x.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            x.delete();
        }
    }

    private void setIconTintList(Typeface typeface, setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0 settextmetricsparams_menuhosthelper__externalsyntheticlambda0) {
        long MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(typeface);
        if (MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.put(Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda0), settextmetricsparams_menuhosthelper__externalsyntheticlambda0);
        }
    }
}