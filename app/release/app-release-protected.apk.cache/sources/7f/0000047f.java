package o;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: o.fq  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0163fq {
    final fK MenuHostHelper$$ExternalSyntheticLambda0;
    final fW MenuHostHelper$$ExternalSyntheticLambda1;
    private final com.google.firebase.FirebaseApp ViewPager$SavedState$1;
    private final InterfaceC0083cq setCenterIfNoTextEnabled;
    public final Executor setIconTintList;
    public final fZ setLayoutAnimation;
    private final Context setNavigationOnClickListener;
    final fK setOnLongClickListener;
    public final fT setUiOptions;
    private final C0013aa setUnboundedRipple;
    public final fN setX;
    final fK setY;
    public static final byte[] $$d = {12, -73, 84, 57, -14, 15, -43, 26, 12, -1, -26, 21, 5, 6, -40, 29, 10, 1, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 64, 12, -65, 72, -40, -42, 79, -14, 15, -27};
    public static final int $$e = 9;
    public static final byte[] $$a = {49, 16, -25, 45, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = vZ.setIconSize;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 38
            int r8 = 115 - r8
            byte[] r0 = o.C0163fq.$$a
            int r6 = r6 + 4
            int r7 = r7 * 25
            int r7 = 40 - r7
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r8 = r7
            r4 = r8
            r3 = 0
            r7 = r6
            goto L30
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r8
            r8 = r5
        L30:
            int r6 = r6 + r4
            int r6 = r6 + (-13)
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0163fq.a(int, int, byte, java.lang.Object[]):void");
    }

    private static void b(int i, int i2, byte b, Object[] objArr) {
        int i3 = (b * 2) + 77;
        int i4 = i2 + 4;
        int i5 = i + 4;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i5];
        int i6 = -1;
        int i7 = i5 - 1;
        if (bArr == null) {
            i3 = i7 + i3;
            i7 = i7;
            i4 = i4;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            int i8 = i4 + 1;
            if (i6 == i7) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3 += bArr[i8];
            i7 = i7;
            i4 = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0163fq(Context context, com.google.firebase.FirebaseApp firebaseApp, InterfaceC0083cq interfaceC0083cq, C0013aa c0013aa, Executor executor, fK fKVar, fK fKVar2, fK fKVar3, fN fNVar, fT fTVar, fZ fZVar, fW fWVar) {
        this.setNavigationOnClickListener = context;
        this.ViewPager$SavedState$1 = firebaseApp;
        this.setCenterIfNoTextEnabled = interfaceC0083cq;
        this.setUnboundedRipple = c0013aa;
        this.setIconTintList = executor;
        this.setOnLongClickListener = fKVar;
        this.setY = fKVar2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = fKVar3;
        this.setX = fNVar;
        this.setUiOptions = fTVar;
        this.setLayoutAnimation = fZVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = fWVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:74:0x065b A[Catch: Z -> 0x07d1, JSONException -> 0x07db, TRY_LEAVE, TryCatch #9 {Z -> 0x07d1, JSONException -> 0x07db, blocks: (B:5:0x0009, B:6:0x0010, B:8:0x0016, B:9:0x0025, B:11:0x002b, B:12:0x0039, B:13:0x003f, B:15:0x0049, B:16:0x0052, B:18:0x0058, B:19:0x0066, B:21:0x006c, B:23:0x0074, B:25:0x0086, B:26:0x008d, B:27:0x008e, B:29:0x0096, B:30:0x00ad, B:32:0x00b3, B:33:0x00c1, B:34:0x00ca, B:36:0x00d0, B:38:0x00dc, B:39:0x00e6, B:40:0x00f2, B:42:0x00f8, B:44:0x0104, B:45:0x0108, B:47:0x011f, B:48:0x0133, B:49:0x013d, B:51:0x0143, B:52:0x0149, B:54:0x014f, B:55:0x0160, B:61:0x02b8, B:72:0x064c, B:74:0x065b, B:80:0x06b3, B:86:0x0709, B:119:0x07aa, B:92:0x0773, B:94:0x0779, B:95:0x077a, B:97:0x077c, B:99:0x0783, B:100:0x0784, B:102:0x0786, B:104:0x078d, B:105:0x078e, B:62:0x02fc, B:64:0x0408, B:69:0x04da, B:71:0x0607, B:106:0x078f, B:107:0x0794, B:109:0x0796, B:111:0x079d, B:112:0x079e, B:114:0x07a0, B:116:0x07a7, B:117:0x07a8, B:120:0x07ba, B:121:0x07bf, B:123:0x07c1, B:124:0x07c8, B:125:0x07c9, B:126:0x07d0), top: B:147:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(org.json.JSONArray r45) {
        /*
            Method dump skipped, instructions count: 2021
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0163fq.MenuHostHelper$$ExternalSyntheticLambda0(org.json.JSONArray):void");
    }
}