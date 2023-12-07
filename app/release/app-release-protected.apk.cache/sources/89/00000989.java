package o;

import android.app.AppOpsManager;
import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setBaselineAlignedChildIndex$MenuHostHelper$$ExternalSyntheticLambda1 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String setY(String str) {
        return AppOpsManager.permissionToOp(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T MenuHostHelper$$ExternalSyntheticLambda0(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setIconTintList(AppOpsManager appOpsManager, String str, String str2) {
        return appOpsManager.noteProxyOpNoThrow(str, str2);
    }
}