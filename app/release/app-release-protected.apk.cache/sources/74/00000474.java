package o;

import android.content.Context;
import android.os.UserManager;

/* loaded from: classes.dex */
class findFragmentById$MenuHostHelper$$ExternalSyntheticLambda0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setY(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }
}