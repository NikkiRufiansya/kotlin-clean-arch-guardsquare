package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public final class setInputType {
    private static MessageDigest setY(String str) {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    @Deprecated
    public static byte[] setX(Context context, String str) {
        MessageDigest y;
        PackageInfo packageInfo = setLayoutTransition.setX.setIconTintList(context).MenuHostHelper$$ExternalSyntheticLambda0.getPackageManager().getPackageInfo(str, 64);
        if (packageInfo.signatures == null || packageInfo.signatures.length != 1 || (y = setY("SHA1")) == null) {
            return null;
        }
        return y.digest(packageInfo.signatures[0].toByteArray());
    }
}