package o;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.SingleGeneratedAdapterObserver;

/* loaded from: classes.dex */
public class setExpandedFormat {
    public static File setX(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(".font");
        sb.append(Process.myPid());
        sb.append("-");
        sb.append(Process.myTid());
        sb.append("-");
        String obj = sb.toString();
        for (int i = 0; i < 100; i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(i);
            File file = new File(cacheDir, sb2.toString());
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    private static ByteBuffer MenuHostHelper$$ExternalSyntheticLambda0(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    public static ByteBuffer setY(Context context, CancellationSignal cancellationSignal, Uri uri) {
        try {
            ParcelFileDescriptor y = setExpandedFormat$MenuHostHelper$$ExternalSyntheticLambda1.setY(context.getContentResolver(), uri, "r", cancellationSignal);
            if (y == null) {
                if (y != null) {
                    y.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(y.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                if (y != null) {
                    y.close();
                }
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static ByteBuffer MenuHostHelper$$ExternalSyntheticLambda1(Context context, Resources resources, int i) {
        File x = setX(context);
        if (x == null) {
            return null;
        }
        try {
            if (setY(x, resources, i)) {
                return MenuHostHelper$$ExternalSyntheticLambda0(x);
            }
            return null;
        } finally {
            x.delete();
        }
    }

    public static boolean setIconTintList(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            fileOutputStream.write(bArr, 0, read);
                        } else {
                            setX(fileOutputStream);
                            StrictMode.setThreadPolicy(allowThreadDiskWrites);
                            return true;
                        }
                    }
                } catch (IOException e) {
                    e = e;
                    fileOutputStream2 = fileOutputStream;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Error copying resource contents to temp file: ");
                    sb.append(e.getMessage());
                    Log.e("TypefaceCompatUtil", sb.toString());
                    setX(fileOutputStream2);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return false;
                } catch (Throwable th) {
                    th = th;
                    setX(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static boolean setY(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean iconTintList = setIconTintList(file, inputStream);
            setX(inputStream);
            return iconTintList;
        } catch (Throwable th2) {
            th = th2;
            setX(inputStream);
            throw th;
        }
    }

    public static void setX(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static Map<Uri, ByteBuffer> setIconTintList(Context context, SingleGeneratedAdapterObserver.setX[] setxArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (SingleGeneratedAdapterObserver.setX setx : setxArr) {
            if (setx.MenuHostHelper$$ExternalSyntheticLambda0() == 0) {
                Uri iconTintList = setx.setIconTintList();
                if (!hashMap.containsKey(iconTintList)) {
                    hashMap.put(iconTintList, setY(context, cancellationSignal, iconTintList));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }
}