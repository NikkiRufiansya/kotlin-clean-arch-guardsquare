package o;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* loaded from: classes.dex */
public final class mC {
    private final Context MenuHostHelper$$ExternalSyntheticLambda0;

    @nE
    public mC(Context context) {
        pN.setY(context, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
    }

    public final boolean setX() {
        NetworkCapabilities networkCapabilities;
        Object systemService = this.MenuHostHelper$$ExternalSyntheticLambda0.getSystemService("connectivity");
        pN.setX(systemService);
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        if (Build.VERSION.SDK_INT < 23) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                return type == 0 || type == 1 || type == 9;
            }
            return false;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3);
    }
}