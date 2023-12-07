package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class asInterface {
    private static volatile asInterface MenuHostHelper$$ExternalSyntheticLambda0;
    private static final Object setX = new Object();
    final Context setIconTintList;
    final Set<Class<? extends setItemActiveIndicatorEnabled<?>>> MenuHostHelper$$ExternalSyntheticLambda1 = new HashSet();
    final Map<Class<?>, Object> setY = new HashMap();

    private asInterface(Context context) {
        this.setIconTintList = context.getApplicationContext();
    }

    public static asInterface setIconTintList(Context context) {
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            synchronized (setX) {
                if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    MenuHostHelper$$ExternalSyntheticLambda0 = new asInterface(context);
                }
            }
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<? extends setItemActiveIndicatorEnabled<T>> cls) {
        return (T) setY(cls);
    }

    public final boolean setX(Class<? extends setItemActiveIndicatorEnabled<?>> cls) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.contains(cls);
    }

    private <T> T setY(Class<? extends setItemActiveIndicatorEnabled<?>> cls) {
        T t;
        synchronized (setX) {
            t = (T) this.setY.get(cls);
            if (t == null) {
                t = (T) MenuHostHelper$$ExternalSyntheticLambda0(cls, new HashSet());
            }
        }
        return t;
    }

    private <T> T MenuHostHelper$$ExternalSyntheticLambda0(Class<? extends setItemActiveIndicatorEnabled<?>> cls, Set<Class<?>> set) {
        T t;
        if (setStartIconCheckable.setIconTintList()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (!this.setY.containsKey(cls)) {
            set.add(cls);
            setItemActiveIndicatorEnabled<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            List<Class<? extends setItemActiveIndicatorEnabled<?>>> x = newInstance.setX();
            if (!x.isEmpty()) {
                for (Class<? extends setItemActiveIndicatorEnabled<?>> cls2 : x) {
                    if (!this.setY.containsKey(cls2)) {
                        MenuHostHelper$$ExternalSyntheticLambda0(cls2, set);
                    }
                }
            }
            t = (T) newInstance.setX(this.setIconTintList);
            set.remove(cls);
            this.setY.put(cls, t);
        } else {
            t = (T) this.setY.get(cls);
        }
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if ("androidx.startup".equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (setItemActiveIndicatorEnabled.class.isAssignableFrom(cls)) {
                            this.MenuHostHelper$$ExternalSyntheticLambda1.add(cls);
                        }
                    }
                }
                for (Class<? extends setItemActiveIndicatorEnabled<?>> cls2 : this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    MenuHostHelper$$ExternalSyntheticLambda0(cls2, hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new fold(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        try {
            try {
                Trace.beginSection("Startup");
                MenuHostHelper$$ExternalSyntheticLambda1(((PackageItemInfo) this.setIconTintList.getPackageManager().getProviderInfo(new ComponentName(this.setIconTintList.getPackageName(), setCacheColorHint.class.getName()), 128)).metaData);
            } catch (PackageManager.NameNotFoundException e) {
                throw new fold(e);
            }
        } finally {
            Trace.endSection();
        }
    }
}