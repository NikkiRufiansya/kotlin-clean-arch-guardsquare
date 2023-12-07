package o;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class setCloseIconTint {
    private final Context setY;

    public setCloseIconTint(Context context) {
        this.setY = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File MenuHostHelper$$ExternalSyntheticLambda0(String str, InputStream inputStream, setBackgroundDrawable setbackgrounddrawable) {
        File file = new File(setX(), setIconTintList(str, setbackgrounddrawable, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final File setX() {
        File file = new File(this.setY.getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String setIconTintList(String str, setBackgroundDrawable setbackgrounddrawable, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder("lottie_cache_");
        sb.append(str.replaceAll("\\W+", ""));
        if (!z) {
            str2 = setbackgrounddrawable.MenuHostHelper$$ExternalSyntheticLambda1;
        } else {
            StringBuilder sb2 = new StringBuilder(".temp");
            sb2.append(setbackgrounddrawable.MenuHostHelper$$ExternalSyntheticLambda1);
            str2 = sb2.toString();
        }
        sb.append(str2);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setVerticalGravity<setBackgroundDrawable, InputStream> MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        setBackgroundDrawable setbackgrounddrawable;
        try {
            File file = new File(setX(), setIconTintList(str, setBackgroundDrawable.JSON, false));
            if (!file.exists()) {
                file = new File(setX(), setIconTintList(str, setBackgroundDrawable.ZIP, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (file.getAbsolutePath().endsWith(".zip")) {
                setbackgrounddrawable = setBackgroundDrawable.ZIP;
            } else {
                setbackgrounddrawable = setBackgroundDrawable.JSON;
            }
            StringBuilder sb = new StringBuilder("Cache hit for ");
            sb.append(str);
            sb.append(" at ");
            sb.append(file.getAbsolutePath());
            setDrawingCacheEnabled.MenuHostHelper$$ExternalSyntheticLambda1(sb.toString());
            return new setVerticalGravity<>(setbackgrounddrawable, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }
}