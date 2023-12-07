package o;

import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import java.util.HashMap;

/* loaded from: classes.dex */
public class setLineHeight {
    private static final Object setX = new Object();
    private static final Object setIconTintList = new Object();

    public static boolean setX(Context context, Intent[] intentArr, Bundle bundle) {
        setLineHeight$MenuHostHelper$$ExternalSyntheticLambda0.setY(context, intentArr, bundle);
        return true;
    }

    public static Drawable MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i) {
        return context.getDrawable(i);
    }

    public static ColorStateList setIconTintList(Context context, int i) {
        return setTextStartPaddingResource.setIconTintList(context.getResources(), i, context.getTheme());
    }

    public static int setY(Context context, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            return context.getResources().getColor(i);
        }
        return context.getColor(i);
    }

    public static Context setIconTintList(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return setLineHeight$MenuHostHelper$$ExternalSyntheticLambda1.setY(context);
        }
        return null;
    }

    public static <T> T MenuHostHelper$$ExternalSyntheticLambda1(Context context, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) setX.setIconTintList(context, cls);
        }
        String MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(context, (Class<?>) cls);
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            return (T) context.getSystemService(MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return null;
    }

    public static String MenuHostHelper$$ExternalSyntheticLambda0(Context context, Class<?> cls) {
        if (Build.VERSION.SDK_INT < 23) {
            return setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1.get(cls);
        }
        return context.getSystemServiceName(cls);
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        static final HashMap<Class<?>, String> MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            HashMap<Class<?>, String> hashMap = new HashMap<>();
            MenuHostHelper$$ExternalSyntheticLambda1 = hashMap;
            if (Build.VERSION.SDK_INT >= 22) {
                hashMap.put(restoreCallingIdentity.setX(), "telephony_subscription_service");
                hashMap.put(UsageStatsManager.class, "usagestats");
            }
            hashMap.put(AppWidgetManager.class, "appwidget");
            hashMap.put(BatteryManager.class, "batterymanager");
            hashMap.put(CameraManager.class, "camera");
            hashMap.put(JobScheduler.class, "jobscheduler");
            hashMap.put(LauncherApps.class, "launcherapps");
            hashMap.put(MediaProjectionManager.class, "media_projection");
            hashMap.put(MediaSessionManager.class, "media_session");
            hashMap.put(RestrictionsManager.class, "restrictions");
            hashMap.put(TelecomManager.class, "telecom");
            hashMap.put(TvInputManager.class, "tv_input");
            hashMap.put(AppOpsManager.class, "appops");
            hashMap.put(CaptioningManager.class, "captioning");
            hashMap.put(ConsumerIrManager.class, "consumer_ir");
            hashMap.put(PrintManager.class, "print");
            hashMap.put(BluetoothManager.class, "bluetooth");
            hashMap.put(DisplayManager.class, "display");
            hashMap.put(UserManager.class, "user");
            hashMap.put(InputManager.class, "input");
            hashMap.put(MediaRouter.class, "media_router");
            hashMap.put(NsdManager.class, "servicediscovery");
            hashMap.put(AccessibilityManager.class, "accessibility");
            hashMap.put(AccountManager.class, "account");
            hashMap.put(ActivityManager.class, "activity");
            hashMap.put(AlarmManager.class, "alarm");
            hashMap.put(AudioManager.class, "audio");
            hashMap.put(ClipboardManager.class, "clipboard");
            hashMap.put(ConnectivityManager.class, "connectivity");
            hashMap.put(DevicePolicyManager.class, "device_policy");
            hashMap.put(DownloadManager.class, "download");
            hashMap.put(DropBoxManager.class, "dropbox");
            hashMap.put(InputMethodManager.class, "input_method");
            hashMap.put(KeyguardManager.class, "keyguard");
            hashMap.put(LayoutInflater.class, "layout_inflater");
            hashMap.put(LocationManager.class, "location");
            hashMap.put(NfcManager.class, "nfc");
            hashMap.put(NotificationManager.class, "notification");
            hashMap.put(PowerManager.class, "power");
            hashMap.put(SearchManager.class, "search");
            hashMap.put(SensorManager.class, "sensor");
            hashMap.put(StorageManager.class, "storage");
            hashMap.put(TelephonyManager.class, "phone");
            hashMap.put(TextServicesManager.class, "textservices");
            hashMap.put(UiModeManager.class, "uimode");
            hashMap.put(UsbManager.class, "usb");
            hashMap.put(Vibrator.class, "vibrator");
            hashMap.put(WallpaperManager.class, "wallpaper");
            hashMap.put(WifiP2pManager.class, "wifip2p");
            hashMap.put(WifiManager.class, "wifi");
            hashMap.put(WindowManager.class, "window");
        }
    }

    /* loaded from: classes.dex */
    public static class setY {
    }

    /* loaded from: classes.dex */
    public static class setX {
        static <T> T setIconTintList(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }
    }
}