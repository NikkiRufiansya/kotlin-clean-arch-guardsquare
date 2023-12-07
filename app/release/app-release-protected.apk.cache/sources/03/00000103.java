package com.google.firebase;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o.C0033au;
import o.InterfaceC0073cg;
import o.TransportRegistrar;
import o.U;
import o.aF;
import o.aL;
import o.bV;
import o.cL;
import o.findFragmentById;
import o.jC;
import o.jD;
import o.setFabAnchorMode;
import o.setOnMenuItemClickListener$MenuHostHelper$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public class FirebaseApp {
    public final C0033au MenuHostHelper$$ExternalSyntheticLambda0;
    public final InterfaceC0073cg<bV> MenuHostHelper$$ExternalSyntheticLambda1;
    public final Context setIconTintList;
    public final U setNavigationOnClickListener;
    public final String setOnLongClickListener;
    public final aF<cL> setY;
    private static byte[] setIconSize = {29, 64, 35, 67, -21, 2, -22, -5, -2, -3, 46, -61, -20, -7, -14, 7, -17, -14, 62, -29, -52, -7, -14, 7, -27, -4};
    public static final int setLayoutAnimation = 166;
    private static final Object setChipCornerRadius = new Object();
    static final Map<String, FirebaseApp> setX = new setFabAnchorMode();
    private final AtomicBoolean setCenterIfNoTextEnabled = new AtomicBoolean(false);
    public final AtomicBoolean setUiOptions = new AtomicBoolean();
    private final List<setX> setTextAlignment = new CopyOnWriteArrayList();
    public final List<Object> setUnboundedRipple = new CopyOnWriteArrayList();

    /* loaded from: classes.dex */
    public interface setX {
        void setX(boolean z);
    }

    public boolean equals(Object obj) {
        if (obj instanceof FirebaseApp) {
            String str = this.setOnLongClickListener;
            FirebaseApp firebaseApp = (FirebaseApp) obj;
            if (!firebaseApp.setUiOptions.get()) {
                return str.equals(firebaseApp.setOnLongClickListener);
            }
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        return false;
    }

    public int hashCode() {
        return this.setOnLongClickListener.hashCode();
    }

    public static FirebaseApp MenuHostHelper$$ExternalSyntheticLambda0() {
        FirebaseApp firebaseApp;
        synchronized (setChipCornerRadius) {
            firebaseApp = setX.get("[DEFAULT]");
            if (firebaseApp == null) {
                StringBuilder sb = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                sb.append(TransportRegistrar.MenuHostHelper$$ExternalSyntheticLambda1());
                sb.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                throw new IllegalStateException(sb.toString());
            }
            firebaseApp.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return firebaseApp;
    }

    public static FirebaseApp setX(Context context) {
        synchronized (setChipCornerRadius) {
            if (setX.containsKey("[DEFAULT]")) {
                return MenuHostHelper$$ExternalSyntheticLambda0();
            }
            U y = U.setY(context);
            if (y == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return setY(context, y, "[DEFAULT]");
        }
    }

    private static FirebaseApp setY(Context context, U u, String str) {
        FirebaseApp firebaseApp;
        FirebaseApp$MenuHostHelper$$ExternalSyntheticLambda1.setX(context);
        String trim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (setChipCornerRadius) {
            Map<String, FirebaseApp> map = setX;
            boolean z = !map.containsKey(trim);
            StringBuilder sb = new StringBuilder("FirebaseApp name ");
            sb.append(trim);
            sb.append(" already exists!");
            String obj = sb.toString();
            if (!z) {
                throw new IllegalStateException(String.valueOf(obj));
            }
            if (context != null) {
                firebaseApp = new FirebaseApp(context, trim, u);
                map.put(trim, firebaseApp);
            } else {
                throw new NullPointerException("Application context cannot be null.");
            }
        }
        firebaseApp.setX();
        return firebaseApp;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01c6 -> B:35:0x01cf). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private FirebaseApp(android.content.Context r18, java.lang.String r19, o.U r20) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.<init>(android.content.Context, java.lang.String, o.U):void");
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        StringBuilder sb = new StringBuilder();
        if (!this.setUiOptions.get()) {
            byte[] bytes = this.setOnLongClickListener.getBytes(Charset.defaultCharset());
            sb.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
            sb.append("+");
            if (!this.setUiOptions.get()) {
                byte[] bytes2 = this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0.getBytes(Charset.defaultCharset());
                sb.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
                return sb.toString();
            }
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setX() {
        if (!findFragmentById.setX(this.setIconTintList)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            if (!this.setUiOptions.get()) {
                sb.append(this.setOnLongClickListener);
                Log.i("FirebaseApp", sb.toString());
                setIconTintList.setX(this.setIconTintList);
                return;
            }
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        if (!this.setUiOptions.get()) {
            sb2.append(this.setOnLongClickListener);
            Log.i("FirebaseApp", sb2.toString());
            C0033au c0033au = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (!this.setUiOptions.get()) {
                c0033au.MenuHostHelper$$ExternalSyntheticLambda1("[DEFAULT]".equals(this.setOnLongClickListener));
                this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0().MenuHostHelper$$ExternalSyntheticLambda0();
                return;
            }
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        throw new IllegalStateException("FirebaseApp was deleted");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList extends BroadcastReceiver {
        private static long setX;
        private static AtomicReference<setIconTintList> setY;
        private final Context MenuHostHelper$$ExternalSyntheticLambda1;
        public static final byte[] $$g = {104, -34, -42, -1};
        public static final int $$h = 236;
        public static final byte[] $$d = {64, 34, -50, 73, -59, 70, -23, -59, 63, -29, -26, 47, 30, 15, 13, -39, 45, 10, 7, -38, 35, 13, 10, -5, 19, -72, 6, 39, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -42, -8, 21, -21, -8, 21, -22, -59, 69, 7, 30, 15, 13, -39, 45, 10, 7, -38, 35, 13, 10, -5, 19, -72, 6, 39, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -42, -59, 68, -35, 30, 15, 13, -39, 45, 10, 7, -38, 35, 13, 10, -5, 19, -72, 6, 39, 57, 2, -9, 19, 2, -7, 17, -19, 44, -5, 12, -6, 3, 21, -5, 0, -17, 27, 18, -5, 8, 3, -43, -59, 71, -36};
        public static final int $$e = 150;
        public static final byte[] $$a = {117, -10, 119, -11, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, -1, 28, -15, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -36};
        public static final int $$b = 212;
        private static byte[] setIconTintList = {112, 91, -28, 61, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
        public static final int MenuHostHelper$$ExternalSyntheticLambda0 = 84;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(byte r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = 63 - r7
                int r8 = r8 * 38
                int r8 = 115 - r8
                int r6 = r6 + 4
                byte[] r0 = com.google.firebase.FirebaseApp.setIconTintList.$$a
                byte[] r1 = new byte[r6]
                int r6 = r6 + (-1)
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                r7 = r6
                goto L34
            L19:
                r3 = 0
            L1a:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r0[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L34:
                int r9 = r9 + r6
                int r6 = r9 + (-13)
                int r8 = r8 + 1
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r7
                r7 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.setIconTintList.b(byte, int, int, java.lang.Object[]):void");
        }

        private static void c(byte b, byte b2, int i, Object[] objArr) {
            int i2 = 106 - b;
            int i3 = (i * 7) + 16;
            int i4 = b2 + 4;
            byte[] bArr = setIconTintList;
            byte[] bArr2 = new byte[i3];
            int i5 = -1;
            int i6 = i3 - 1;
            if (bArr == null) {
                i2 = (i6 - i2) - 4;
                i6 = i6;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i5 = -1;
            }
            while (true) {
                i4++;
                int i7 = i5 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i8 = i6;
                i2 = (i2 - bArr[i4]) - 4;
                i6 = i8;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i5 = i7;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r6 = 45 - r6
                byte[] r0 = com.google.firebase.FirebaseApp.setIconTintList.$$d
                int r8 = r8 * 2
                int r8 = 115 - r8
                int r7 = r7 + 4
                byte[] r1 = new byte[r6]
                int r6 = r6 + (-1)
                r2 = 0
                if (r0 != 0) goto L15
                r4 = r8
                r3 = 0
                r8 = r7
                goto L2c
            L15:
                r3 = 0
            L16:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r6) goto L23
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L23:
                int r3 = r3 + 1
                int r7 = r7 + 1
                r4 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2c:
                int r7 = r7 + r4
                int r7 = r7 + (-6)
                r5 = r8
                r8 = r7
                r7 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.setIconTintList.d(byte, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(short r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.firebase.FirebaseApp.setIconTintList.$$g
                int r8 = r8 * 4
                int r8 = r8 + 4
                int r9 = r9 * 5
                int r9 = 121 - r9
                int r7 = r7 * 2
                int r7 = 1 - r7
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = 0
                r9 = r8
                goto L2f
            L17:
                r3 = 0
            L18:
                r6 = r9
                r9 = r8
                r8 = r6
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r7) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r9]
                r6 = r9
                r9 = r8
                r8 = r6
            L2f:
                int r3 = -r3
                int r8 = r8 + 1
                int r9 = r9 + r3
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.setIconTintList.e(short, byte, short, java.lang.Object[]):void");
        }

        static void setIconTintList() {
            setX = -4419893999352557072L;
        }

        static {
            setIconTintList();
            setY = new AtomicReference<>();
        }

        private setIconTintList(Context context) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:143:0x0977 A[Catch: Exception -> 0x0be1, TRY_LEAVE, TryCatch #23 {Exception -> 0x0be1, blocks: (B:141:0x092f, B:143:0x0977), top: B:262:0x092f }] */
        /* JADX WARN: Removed duplicated region for block: B:148:0x09dc  */
        /* JADX WARN: Removed duplicated region for block: B:149:0x09e1  */
        /* JADX WARN: Removed duplicated region for block: B:163:0x0b3a  */
        /* JADX WARN: Removed duplicated region for block: B:226:0x068d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:238:0x09e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:260:0x0bbd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x02c8  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0390 A[Catch: Exception -> 0x0c05, TRY_LEAVE, TryCatch #18 {Exception -> 0x0c05, blocks: (B:56:0x034c, B:58:0x0390), top: B:252:0x034c }] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0453  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0454 A[Catch: all -> 0x0bf3, TryCatch #13 {all -> 0x0bf3, blocks: (B:64:0x043a, B:68:0x04a7, B:67:0x0454), top: B:242:0x043a }] */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0546  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0628 A[Catch: Exception -> 0x0be7, TRY_LEAVE, TryCatch #16 {Exception -> 0x0be7, blocks: (B:82:0x05e4, B:84:0x0628), top: B:248:0x05e4 }] */
        /* JADX WARN: Removed duplicated region for block: B:89:0x0684  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0689  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x07ec  */
        @Override // android.content.BroadcastReceiver
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onReceive(android.content.Context r28, android.content.Intent r29) {
            /*
                Method dump skipped, instructions count: 3143
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.FirebaseApp.setIconTintList.onReceive(android.content.Context, android.content.Intent):void");
        }

        static /* synthetic */ void setX(Context context) {
            boolean z;
            if (setY.get() == null) {
                setIconTintList seticontintlist = new setIconTintList(context);
                AtomicReference<setIconTintList> atomicReference = setY;
                while (true) {
                    if (!atomicReference.compareAndSet(null, seticontintlist)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    context.registerReceiver(seticontintlist, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        private static void a(int i, char[] cArr, Object[] objArr) {
            jD jDVar = new jD();
            char[] MenuHostHelper$$ExternalSyntheticLambda02 = jD.MenuHostHelper$$ExternalSyntheticLambda0(setX ^ 2449010268519698653L, cArr, i);
            int i2 = 4;
            jDVar.setIconTintList = 4;
            while (jDVar.setIconTintList < MenuHostHelper$$ExternalSyntheticLambda02.length) {
                jDVar.setX = jDVar.setIconTintList - i2;
                int i3 = jDVar.setIconTintList;
                try {
                    Object[] objArr2 = {Long.valueOf(MenuHostHelper$$ExternalSyntheticLambda02[jDVar.setIconTintList] ^ MenuHostHelper$$ExternalSyntheticLambda02[jDVar.setIconTintList % i2]), Long.valueOf(jDVar.setX), Long.valueOf(setX)};
                    Object obj = jC.setTextScaleX.get(-244088302);
                    if (obj == null) {
                        byte b = (byte) ($$g[3] + 1);
                        Object[] objArr3 = new Object[1];
                        e(b, b, (byte) (-$$g[3]), objArr3);
                        obj = ((Class) jC.setY(277 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) ((Process.myTid() >> 22) + 42263), '4' - AndroidCharacter.getMirror('0'))).getMethod((String) objArr3[0], Long.TYPE, Long.TYPE, Long.TYPE);
                        jC.setTextScaleX.put(-244088302, obj);
                    }
                    MenuHostHelper$$ExternalSyntheticLambda02[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr4 = {jDVar, jDVar};
                        Object obj2 = jC.setTextScaleX.get(467845792);
                        if (obj2 == null) {
                            byte b2 = (byte) ($$g[3] + 1);
                            byte b3 = b2;
                            Object[] objArr5 = new Object[1];
                            e(b2, b3, b3, objArr5);
                            obj2 = ((Class) jC.setY(305 - KeyEvent.getDeadChar(0, 0), (char) (36290 - TextUtils.getOffsetBefore("", 0)), TextUtils.indexOf((CharSequence) "", '0', 0) + 5)).getMethod((String) objArr5[0], Object.class, Object.class);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(FirebaseApp firebaseApp, boolean z) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        for (setX setx : firebaseApp.setTextAlignment) {
            setx.setX(z);
        }
    }

    public final <T> T setY(Class<T> cls) {
        if (!(!this.setUiOptions.get())) {
            throw new IllegalStateException("FirebaseApp was deleted");
        }
        return (T) this.MenuHostHelper$$ExternalSyntheticLambda0.setY(new aL<>(aL.setX.class, cls));
    }

    public String toString() {
        return new setOnMenuItemClickListener$MenuHostHelper$$ExternalSyntheticLambda1(this).setX("name", this.setOnLongClickListener).setX("options", this.setNavigationOnClickListener).toString();
    }
}