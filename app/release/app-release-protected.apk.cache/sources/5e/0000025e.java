package o;

import android.os.Process;
import android.os.StrictMode;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public final class TransportRegistrar {
    @Nullable
    private static String MenuHostHelper$$ExternalSyntheticLambda0;
    private static int setIconTintList;

    public static String MenuHostHelper$$ExternalSyntheticLambda1() {
        String str;
        BufferedReader bufferedReader;
        String readLine;
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            int i = setIconTintList;
            if (i == 0) {
                i = Process.myPid();
                setIconTintList = i;
            }
            String str2 = null;
            String str3 = null;
            BufferedReader bufferedReader2 = null;
            BufferedReader bufferedReader3 = null;
            if (i > 0) {
                try {
                    StringBuilder sb = new StringBuilder("/proc/");
                    sb.append(i);
                    sb.append("/cmdline");
                    String obj = sb.toString();
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    bufferedReader = new BufferedReader(new FileReader(obj));
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    try {
                        readLine = bufferedReader.readLine();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader3 = bufferedReader;
                        if (bufferedReader3 != null) {
                            try {
                                bufferedReader3.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException unused3) {
                    str = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (readLine == null) {
                    throw new NullPointerException("null reference");
                }
                str3 = readLine.trim();
                str = str3;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                str2 = str;
            }
            MenuHostHelper$$ExternalSyntheticLambda0 = str2;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }
}