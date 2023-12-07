package o;

import android.util.Log;

/* loaded from: classes.dex */
public final class lC {
    private static boolean MenuHostHelper$$ExternalSyntheticLambda1;
    public static final setY MenuHostHelper$$ExternalSyntheticLambda0 = new setY((byte) 0);
    private static String setY = "";
    private static final String setIconTintList = "SecurityApp";

    public static final /* synthetic */ String setIconTintList() {
        return setY;
    }

    public static final /* synthetic */ boolean setY() {
        return MenuHostHelper$$ExternalSyntheticLambda1;
    }

    /* loaded from: classes.dex */
    public static final class setY {
        public /* synthetic */ setY(byte b) {
            this();
        }

        private setY() {
        }
    }

    public static final void setIconTintList(long j, long j2) {
        MenuHostHelper$$ExternalSyntheticLambda1 = true;
        pN.setY("App Tamper Detection", "");
        setY = "App Tamper Detection";
        Log.d(setIconTintList, "App Tamper Detection");
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda0() {
        MenuHostHelper$$ExternalSyntheticLambda1 = true;
        pN.setY("Emulator Detected", "");
        setY = "Emulator Detected";
        Log.d(setIconTintList, "Emulator Detected");
    }

    public static final void setX(long j, long j2) {
        MenuHostHelper$$ExternalSyntheticLambda1 = true;
        pN.setY("hook Detected", "");
        setY = "hook Detected";
        Log.d(setIconTintList, "hook Detected");
    }

    public static final void setY(long j, long j2) {
        MenuHostHelper$$ExternalSyntheticLambda1 = true;
        pN.setY("root Detected", "");
        setY = "root Detected";
        Log.d(setIconTintList, "root Detected");
    }
}