package o;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ni  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321ni {
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {113, 46, 115, -60, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, -22, -1, -4, 9, -13, -10, 28, -24, -14, 9, 0, -7, 5, -25, 17, 47, -66, 7, -17, 3, 53, -42, -24, -14, 9, 0, -7, -2, -19, 47, -51, -4, 0, -1, 2, -2, -23, 7, -10, -3, 33, -41, 4, -13};
    public static final int setY = 138;
    private static StringBuilder MenuHostHelper$$ExternalSyntheticLambda1 = new StringBuilder();
    private static final C0610xu setX = C0610xu.setIconTintList("RIFF");
    private static final C0610xu setIconTintList = C0610xu.setIconTintList("WEBP");

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 13
            int r8 = 52 - r8
            int r7 = r7 + 97
            byte[] r0 = o.C0321ni.MenuHostHelper$$ExternalSyntheticLambda0
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L2f
        L14:
            r3 = 0
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r9) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r6
        L2f:
            int r7 = r7 - r8
            int r7 = r7 + (-4)
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0321ni.a(int, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int MenuHostHelper$$ExternalSyntheticLambda1(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        StringBuilder sb = new StringBuilder("Negative size: ");
        sb.append(bitmap);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T setY(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setIconTintList() {
        if (!MenuHostHelper$$ExternalSyntheticLambda0()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        Thread thread = Looper.getMainLooper().getThread();
        try {
            byte b = MenuHostHelper$$ExternalSyntheticLambda0[29];
            Object[] objArr = new Object[1];
            a(b, (byte) (b | 6), MenuHostHelper$$ExternalSyntheticLambda0[45], objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            byte b2 = MenuHostHelper$$ExternalSyntheticLambda0[8];
            Object[] objArr2 = new Object[1];
            a(b2, (byte) (b2 | 25), MenuHostHelper$$ExternalSyntheticLambda0[25], objArr2);
            return thread == cls.getMethod((String) objArr2[0], null).invoke(null, null);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String setX(mE mEVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        mH mHVar = mEVar.setIconTintList;
        if (mHVar != null) {
            sb.append(mHVar.setOnLongClickListener.setIconTintList());
        }
        List<mH> list = mEVar.MenuHostHelper$$ExternalSyntheticLambda0;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (i > 0 || mHVar != null) {
                    sb.append(", ");
                }
                sb.append(list.get(i).setOnLongClickListener.setIconTintList());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda1(String str, String str2, String str3) {
        MenuHostHelper$$ExternalSyntheticLambda0(str, str2, str3, "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda0(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String MenuHostHelper$$ExternalSyntheticLambda1(mY mYVar) {
        StringBuilder sb = MenuHostHelper$$ExternalSyntheticLambda1;
        if (mYVar.setIconSize != null) {
            sb.ensureCapacity(mYVar.setIconSize.length() + 50);
            sb.append(mYVar.setIconSize);
        } else if (mYVar.setZ != null) {
            String obj = mYVar.setZ.toString();
            sb.ensureCapacity(obj.length() + 50);
            sb.append(obj);
        } else {
            sb.ensureCapacity(50);
            sb.append(mYVar.ViewPager$SavedState$1);
        }
        sb.append('\n');
        if (mYVar.setTextAlignment != 0.0f) {
            sb.append("rotation:");
            sb.append(mYVar.setTextAlignment);
            if (mYVar.MenuHostHelper$$ExternalSyntheticLambda0) {
                sb.append('@');
                sb.append(mYVar.setChipCornerRadius);
                sb.append('x');
                sb.append(mYVar.setCenterIfNoTextEnabled);
            }
            sb.append('\n');
        }
        if ((mYVar.setMaxEms == 0 && mYVar.setOnNavigationItemSelectedListener == 0) ? false : true) {
            sb.append("resize:");
            sb.append(mYVar.setMaxEms);
            sb.append('x');
            sb.append(mYVar.setOnNavigationItemSelectedListener);
            sb.append('\n');
        }
        if (mYVar.setX) {
            sb.append("centerCrop:");
            sb.append(mYVar.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append('\n');
        } else if (mYVar.setY) {
            sb.append("centerInside");
            sb.append('\n');
        }
        if (mYVar.setAnimationFromJson != null) {
            int size = mYVar.setAnimationFromJson.size();
            for (int i = 0; i < size; i++) {
                sb.append(mYVar.setAnimationFromJson.get(i).setX());
                sb.append('\n');
            }
        }
        String obj2 = sb.toString();
        sb.setLength(0);
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static File setX(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long setIconTintList(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800L), 5242880L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setIconTintList(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T MenuHostHelper$$ExternalSyntheticLambda0(Context context, String str) {
        return (T) context.getSystemService(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setY(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0607xr interfaceC0607xr) {
        return interfaceC0607xr.setIconTintList(0L, setX) && interfaceC0607xr.setIconTintList(8L, setIconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(Resources resources, mY mYVar) {
        if (mYVar.ViewPager$SavedState$1 != 0 || mYVar.setZ == null) {
            return mYVar.ViewPager$SavedState$1;
        }
        String authority = mYVar.setZ.getAuthority();
        if (authority == null) {
            StringBuilder sb = new StringBuilder("No package provided: ");
            sb.append(mYVar.setZ);
            throw new FileNotFoundException(sb.toString());
        }
        List<String> pathSegments = mYVar.setZ.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            StringBuilder sb2 = new StringBuilder("No path segments: ");
            sb2.append(mYVar.setZ);
            throw new FileNotFoundException(sb2.toString());
        } else if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                StringBuilder sb3 = new StringBuilder("Last path segment is not a resource ID: ");
                sb3.append(mYVar.setZ);
                throw new FileNotFoundException(sb3.toString());
            }
        } else if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        } else {
            StringBuilder sb4 = new StringBuilder("More than two path segments: ");
            sb4.append(mYVar.setZ);
            throw new FileNotFoundException(sb4.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Resources MenuHostHelper$$ExternalSyntheticLambda1(Context context, mY mYVar) {
        if (mYVar.ViewPager$SavedState$1 != 0 || mYVar.setZ == null) {
            return context.getResources();
        }
        String authority = mYVar.setZ.getAuthority();
        if (authority == null) {
            StringBuilder sb = new StringBuilder("No package provided: ");
            sb.append(mYVar.setZ);
            throw new FileNotFoundException(sb.toString());
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb2 = new StringBuilder("Unable to obtain resources for package: ");
            sb2.append(mYVar.setZ);
            throw new FileNotFoundException(sb2.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda0(Looper looper) {
        Handler handler = new Handler(looper) { // from class: o.ni.2
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                sendMessageDelayed(obtainMessage(), 1000L);
            }
        };
        handler.sendMessageDelayed(handler.obtainMessage(), 1000L);
    }

    /* renamed from: o.ni$setX */
    /* loaded from: classes.dex */
    static class setX implements ThreadFactory {
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new setY(runnable);
        }
    }

    /* renamed from: o.ni$setY */
    /* loaded from: classes.dex */
    static class setY extends Thread {
        setY(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        try {
            byte b = MenuHostHelper$$ExternalSyntheticLambda0[25];
            Object[] objArr = new Object[1];
            a(b, (byte) (b | 49), (byte) (-MenuHostHelper$$ExternalSyntheticLambda0[14]), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(MenuHostHelper$$ExternalSyntheticLambda0[5], MenuHostHelper$$ExternalSyntheticLambda0[25], MenuHostHelper$$ExternalSyntheticLambda0[38], objArr2);
            return (int) ((((((ApplicationInfo) cls.getMethod((String) objArr2[0], null).invoke(context, null)).flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * 1048576) / 7);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}