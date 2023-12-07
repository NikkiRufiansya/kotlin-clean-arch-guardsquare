package com.google.android.datatransport.runtime.backends;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import o.jC;
import o.jD;

/* loaded from: classes.dex */
public class TransportBackendDiscovery extends Service {
    public static final byte[] $$g = {8, 83, -102, 50};
    public static final int $$h = 108;
    public static final byte[] $$d = {59, -103, 22, 57, 65, -64, 29, 65, -57, 35, 32, -41, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 48, 14, -15, 27, 14, -15, 43, -26, -12, 1, 26, -21, -5, -6, 40, -29, -10, -1, 14, -15, 28, 65, -65, -1, 65, -62, 41, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -72, 53, 29, -79, 14, -15, 43, -26, -12, 1, 26, -21, -5, -6, 40, -29, -10, -1, 65, -72, 4, 78, -41, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -51, 32, 29, -41, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49};
    public static final int $$e = 167;
    public static final byte[] $$a = {107, -40, -73, 40, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
    public static final int $$b = 211;
    private static byte[] setY = {99, 56, -99, 122, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12, -2, -19, 47, -51, -4, 0, -1, 2, -2, -23, 7, -10, -3, 33, -41, 4, -13};
    public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 192;
    private static long MenuHostHelper$$ExternalSyntheticLambda1 = 256001797452943207L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 38
            int r7 = r7 + 77
            byte[] r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$a
            int r6 = r6 + 4
            int r8 = 63 - r8
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r6
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L32
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r8 = r8 + 1
            int r9 = r9 + r6
            int r6 = r9 + (-13)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.a(int, short, byte, java.lang.Object[]):void");
    }

    private static void c(short s, short s2, byte b, Object[] objArr) {
        int i = s2 + 97;
        byte[] bArr = setY;
        int i2 = b + 4;
        int i3 = s + 16;
        byte[] bArr2 = new byte[i3];
        int i4 = -1;
        int i5 = i3 - 1;
        if (bArr == null) {
            i = (i - i2) - 4;
            i2 = i2;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = -1;
        }
        while (true) {
            int i6 = i2 + 1;
            int i7 = i4 + 1;
            bArr2[i7] = (byte) i;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            Object[] objArr2 = objArr;
            byte[] bArr3 = bArr2;
            byte[] bArr4 = bArr;
            i = (i - bArr[i6]) - 4;
            i2 = i6;
            objArr = objArr2;
            bArr = bArr4;
            bArr2 = bArr3;
            i4 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 179 - r8
            int r7 = r7 * 2
            int r7 = 115 - r7
            int r6 = 45 - r6
            byte[] r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$d
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L2f
        L17:
            r3 = 0
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r8]
            r5 = r9
            r9 = r8
            r8 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L2f:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.d(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 5
            int r8 = r8 + 116
            byte[] r0 = com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.$$g
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r9 = r9 * 4
            int r9 = 4 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L1a
            r8 = r7
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L36
        L1a:
            r3 = 0
        L1b:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2a:
            r4 = r0[r9]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L36:
            int r7 = r7 + r9
            int r9 = r10 + 1
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.e(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0593 A[Catch: Exception -> 0x0a39, TRY_LEAVE, TryCatch #5 {Exception -> 0x0a39, blocks: (B:57:0x0555, B:59:0x0593), top: B:109:0x0555 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0768 A[Catch: all -> 0x0a27, TryCatch #3 {all -> 0x0a27, blocks: (B:64:0x074a, B:68:0x07c1, B:67:0x0768), top: B:105:0x074a }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0977  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0a20 A[ORIG_RETURN, RETURN] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instructions count: 2629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.attachBaseContext(android.content.Context):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x08f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0a6f A[Catch: Exception -> 0x0d0a, TRY_LEAVE, TryCatch #11 {Exception -> 0x0d0a, blocks: (B:147:0x0a2d, B:149:0x0a6f), top: B:240:0x0a2d }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0ad1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0c7c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0784 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0b17 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x042a A[Catch: Exception -> 0x0d2e, TRY_LEAVE, TryCatch #2 {Exception -> 0x0d2e, blocks: (B:59:0x03ee, B:61:0x042a), top: B:222:0x03ee }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x04f0 A[Catch: all -> 0x0d1c, TryCatch #22 {all -> 0x0d1c, blocks: (B:67:0x04d2, B:71:0x0542, B:70:0x04f0), top: B:262:0x04d2 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x05e1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x06ce A[Catch: Exception -> 0x0d10, TRY_LEAVE, TryCatch #0 {Exception -> 0x0d10, blocks: (B:85:0x068e, B:87:0x06ce), top: B:218:0x068e }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0731  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x077e  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate() {
        /*
            Method dump skipped, instructions count: 3630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.onCreate():void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) {
        jD jDVar = new jD();
        char[] MenuHostHelper$$ExternalSyntheticLambda02 = jD.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1 ^ 2449010268519698653L, cArr, i);
        int i2 = 4;
        jDVar.setIconTintList = 4;
        while (jDVar.setIconTintList < MenuHostHelper$$ExternalSyntheticLambda02.length) {
            jDVar.setX = jDVar.setIconTintList - i2;
            int i3 = jDVar.setIconTintList;
            try {
                Object[] objArr2 = {Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda02[jDVar.setIconTintList] ^ MenuHostHelper$$ExternalSyntheticLambda02[jDVar.setIconTintList % i2]), Long.valueOf(jDVar.setX), Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda1)};
                Object obj = jC.setTextScaleX.get(-244088302);
                if (obj == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr3 = new Object[1];
                    e(b, b2, b2, objArr3);
                    obj = ((Class) jC.setY(277 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (42262 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + i2)).getMethod((String) objArr3[0], Long.TYPE, Long.TYPE, Long.TYPE);
                    jC.setTextScaleX.put(-244088302, obj);
                }
                MenuHostHelper$$ExternalSyntheticLambda02[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr4 = {jDVar, jDVar};
                    Object obj2 = jC.setTextScaleX.get(467845792);
                    if (obj2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        Object[] objArr5 = new Object[1];
                        e(b3, b4, (byte) (b4 - 1), objArr5);
                        obj2 = ((Class) jC.setY(KeyEvent.getDeadChar(0, 0) + 305, (char) (36290 - View.MeasureSpec.makeMeasureSpec(0, 0)), TextUtils.indexOf((CharSequence) "", '0') + 5)).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(467845792, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
                    i2 = 4;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(MenuHostHelper$$ExternalSyntheticLambda02, 4, MenuHostHelper$$ExternalSyntheticLambda02.length - 4);
    }
}