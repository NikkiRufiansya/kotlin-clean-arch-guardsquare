package o;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;

/* loaded from: classes.dex */
final class FloatingActionButton$BaseBehavior {
    static FloatingActionButton$BaseBehavior setY;
    final Context MenuHostHelper$$ExternalSyntheticLambda0;
    final FloatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = new FloatingActionButton$BaseBehavior$MenuHostHelper$$ExternalSyntheticLambda1();
    private final LocationManager setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FloatingActionButton$BaseBehavior(Context context, LocationManager locationManager) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = context;
        this.setIconTintList = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Location setX(String str) {
        try {
            if (this.setIconTintList.isProviderEnabled(str)) {
                return this.setIconTintList.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }
}