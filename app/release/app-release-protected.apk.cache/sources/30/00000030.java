package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import o.setTitleMarginBottom;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(setTitleMarginBottom settitlemarginbottom) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.MenuHostHelper$$ExternalSyntheticLambda1 = (IconCompat) settitlemarginbottom.setX((setTitleMarginBottom) remoteActionCompat.MenuHostHelper$$ExternalSyntheticLambda1);
        remoteActionCompat.setUnboundedRipple = settitlemarginbottom.setX(remoteActionCompat.setUnboundedRipple, 2);
        remoteActionCompat.setIconTintList = settitlemarginbottom.setX(remoteActionCompat.setIconTintList, 3);
        remoteActionCompat.setY = (PendingIntent) settitlemarginbottom.setX((setTitleMarginBottom) remoteActionCompat.setY, 4);
        remoteActionCompat.MenuHostHelper$$ExternalSyntheticLambda0 = settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(remoteActionCompat.MenuHostHelper$$ExternalSyntheticLambda0, 5);
        remoteActionCompat.setX = settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(remoteActionCompat.setX, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, setTitleMarginBottom settitlemarginbottom) {
        settitlemarginbottom.setY(remoteActionCompat.MenuHostHelper$$ExternalSyntheticLambda1);
        settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(remoteActionCompat.setUnboundedRipple, 2);
        settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(remoteActionCompat.setIconTintList, 3);
        settitlemarginbottom.MenuHostHelper$$ExternalSyntheticLambda0(remoteActionCompat.setY, 4);
        settitlemarginbottom.setX(remoteActionCompat.MenuHostHelper$$ExternalSyntheticLambda0, 5);
        settitlemarginbottom.setX(remoteActionCompat.setX, 6);
    }
}