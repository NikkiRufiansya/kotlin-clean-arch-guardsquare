package o;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setTitleEnabled {
    protected static final Method MenuHostHelper$$ExternalSyntheticLambda0;
    private static Field MenuHostHelper$$ExternalSyntheticLambda1;
    private static final Handler setIconTintList = new Handler(Looper.getMainLooper());
    private static Field setUiOptions;
    protected static final Method setX;
    private static Method setY;

    static {
        Class<?> y = setY();
        MenuHostHelper$$ExternalSyntheticLambda1 = setIconTintList();
        setUiOptions = MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda1(y);
        setX = setX(y);
        setY = setY(y);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setX(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if ((Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) && setY == null) {
            return false;
        }
        if (setX == null && MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return false;
        }
        try {
            final Object obj2 = setUiOptions.get(activity);
            if (obj2 == null || (obj = MenuHostHelper$$ExternalSyntheticLambda1.get(activity)) == null) {
                return false;
            }
            final Application application = activity.getApplication();
            final setTitleEnabled$MenuHostHelper$$ExternalSyntheticLambda1 settitleenabled_menuhosthelper__externalsyntheticlambda1 = new setTitleEnabled$MenuHostHelper$$ExternalSyntheticLambda1(activity);
            application.registerActivityLifecycleCallbacks(settitleenabled_menuhosthelper__externalsyntheticlambda1);
            Handler handler = setIconTintList;
            handler.post(new Runnable() { // from class: o.setTitleEnabled.3
                @Override // java.lang.Runnable
                public final void run() {
                    setTitleEnabled$MenuHostHelper$$ExternalSyntheticLambda1.this.setX = obj2;
                }
            });
            if (Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) {
                setY.invoke(obj, obj2, null, null, 0, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE);
            } else {
                activity.recreate();
            }
            handler.post(new Runnable() { // from class: o.setTitleEnabled.2
                @Override // java.lang.Runnable
                public final void run() {
                    application.unregisterActivityLifecycleCallbacks(settitleenabled_menuhosthelper__externalsyntheticlambda1);
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean setIconTintList(Object obj, int i, Activity activity) {
        try {
            final Object obj2 = setUiOptions.get(activity);
            if (obj2 == obj && activity.hashCode() == i) {
                final Object obj3 = MenuHostHelper$$ExternalSyntheticLambda1.get(activity);
                setIconTintList.postAtFrontOfQueue(new Runnable() { // from class: o.setTitleEnabled.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            if (setTitleEnabled.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                                setTitleEnabled.MenuHostHelper$$ExternalSyntheticLambda0.invoke(obj3, obj2, Boolean.FALSE, "AppCompat recreation");
                            } else {
                                setTitleEnabled.setX.invoke(obj3, obj2, Boolean.FALSE);
                            }
                        } catch (RuntimeException e) {
                            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                                throw e;
                            }
                        } catch (Throwable th) {
                            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                        }
                    }
                });
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    private static Method MenuHostHelper$$ExternalSyntheticLambda1(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method setX(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field setIconTintList() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field MenuHostHelper$$ExternalSyntheticLambda1() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> setY() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method setY(Class<?> cls) {
        if (!(Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27) || cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }
}