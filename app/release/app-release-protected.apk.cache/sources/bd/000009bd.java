package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@nH
/* loaded from: classes.dex */
final class setButtonIconTintMode implements setBoxBackgroundColorResource {
    private final setComposition MenuHostHelper$$ExternalSyntheticLambda1;
    private final Map<String, setCheckMarkTintMode> setIconTintList;
    private final setY setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    @nE
    public setButtonIconTintMode(Context context, setComposition setcomposition) {
        this(new setY(context), setcomposition);
    }

    private setButtonIconTintMode(setY sety, setComposition setcomposition) {
        this.setIconTintList = new HashMap();
        this.setX = sety;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setcomposition;
    }

    @Override // o.setBoxBackgroundColorResource
    public final setCheckMarkTintMode setX(String str) {
        synchronized (this) {
            if (this.setIconTintList.containsKey(str)) {
                return this.setIconTintList.get(str);
            }
            MainDispatcherFactory y = this.setX.setY(str);
            if (y == null) {
                return null;
            }
            setComposition setcomposition = this.MenuHostHelper$$ExternalSyntheticLambda1;
            setCheckMarkTintMode create = y.create(new setCloseIconEnabled(setcomposition.MenuHostHelper$$ExternalSyntheticLambda1, setcomposition.setY, setcomposition.setIconTintList, str));
            this.setIconTintList.put(str, create);
            return create;
        }
    }

    /* loaded from: classes.dex */
    static class setY {
        private final Context MenuHostHelper$$ExternalSyntheticLambda0;
        private Map<String, String> MenuHostHelper$$ExternalSyntheticLambda1 = null;

        setY(Context context) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
        }

        private static Bundle setIconTintList(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return ((PackageItemInfo) serviceInfo).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
                return null;
            }
        }

        final MainDispatcherFactory setY(String str) {
            Map<String, String> map;
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                Bundle iconTintList = setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0);
                if (iconTintList == null) {
                    Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    map = Collections.emptyMap();
                } else {
                    HashMap hashMap = new HashMap();
                    for (String str2 : iconTintList.keySet()) {
                        Object obj = iconTintList.get(str2);
                        if ((obj instanceof String) && str2.startsWith("backend:")) {
                            for (String str3 : ((String) obj).split(",", -1)) {
                                String trim = str3.trim();
                                if (!trim.isEmpty()) {
                                    hashMap.put(trim, str2.substring(8));
                                }
                            }
                        }
                    }
                    map = hashMap;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1 = map;
            }
            String str4 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (MainDispatcherFactory) Class.forName(str4).asSubclass(MainDispatcherFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e) {
                Log.w("BackendRegistry", String.format("Class %s is not found.", str4), e);
                return null;
            } catch (IllegalAccessException e2) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e2);
                return null;
            } catch (InstantiationException e3) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s.", str4), e3);
                return null;
            } catch (NoSuchMethodException e4) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e4);
                return null;
            } catch (InvocationTargetException e5) {
                Log.w("BackendRegistry", String.format("Could not instantiate %s", str4), e5);
                return null;
            }
        }
    }
}