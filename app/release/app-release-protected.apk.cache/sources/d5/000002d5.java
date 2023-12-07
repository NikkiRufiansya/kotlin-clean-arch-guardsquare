package o;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class aj$MenuHostHelper$$ExternalSyntheticLambda0 implements aj$MenuHostHelper$$ExternalSyntheticLambda1<Context> {
    private final Class<? extends Service> setY;

    public /* synthetic */ aj$MenuHostHelper$$ExternalSyntheticLambda0(Class cls, byte b) {
        this(cls);
    }

    @Override // o.aj$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ List setX(Context context) {
        Bundle y = setY(context);
        if (y == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : y.keySet()) {
            if ("com.google.firebase.components.ComponentRegistrar".equals(y.get(str)) && str.startsWith("com.google.firebase.components:")) {
                arrayList.add(str.substring(31));
            }
        }
        return arrayList;
    }

    private aj$MenuHostHelper$$ExternalSyntheticLambda0(Class<? extends Service> cls) {
        this.setY = cls;
    }

    private Bundle setY(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
                return null;
            }
            ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.setY), 128);
            if (serviceInfo == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.setY);
                sb.append(" has no service info.");
                Log.w("ComponentDiscovery", sb.toString());
                return null;
            }
            return ((PackageItemInfo) serviceInfo).metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
            return null;
        }
    }
}