package o;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: o.gb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0176gb {
    private static final Map<String, C0176gb> setIconTintList = new HashMap();
    final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final Context setX;

    private C0176gb(Context context, String str) {
        this.setX = context;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
    }

    public final Void setY(fP fPVar) {
        synchronized (this) {
            FileOutputStream openFileOutput = this.setX.openFileOutput(this.MenuHostHelper$$ExternalSyntheticLambda0, 0);
            openFileOutput.write(fPVar.toString().getBytes("UTF-8"));
            openFileOutput.close();
        }
        return null;
    }

    @Nullable
    public final fP MenuHostHelper$$ExternalSyntheticLambda1() {
        FileInputStream fileInputStream;
        synchronized (this) {
            FileInputStream fileInputStream2 = null;
            try {
                fileInputStream = this.setX.openFileInput(this.MenuHostHelper$$ExternalSyntheticLambda0);
                try {
                    int available = fileInputStream.available();
                    byte[] bArr = new byte[available];
                    fileInputStream.read(bArr, 0, available);
                    fP y = fP.setY(new JSONObject(new String(bArr, "UTF-8")));
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return y;
                } catch (FileNotFoundException | JSONException unused) {
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream2 = fileInputStream;
                    if (fileInputStream2 != null) {
                        fileInputStream2.close();
                    }
                    throw th;
                }
            } catch (FileNotFoundException | JSONException unused2) {
                fileInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final Void setY() {
        synchronized (this) {
            this.setX.deleteFile(this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return null;
    }

    public static C0176gb setIconTintList(Context context, String str) {
        C0176gb c0176gb;
        synchronized (C0176gb.class) {
            Map<String, C0176gb> map = setIconTintList;
            if (!map.containsKey(str)) {
                map.put(str, new C0176gb(context, str));
            }
            c0176gb = map.get(str);
        }
        return c0176gb;
    }
}