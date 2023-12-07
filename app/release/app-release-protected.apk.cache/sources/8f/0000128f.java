package o;

import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class wM$MenuHostHelper$$ExternalSyntheticLambda1 {
    private wM$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    public /* synthetic */ wM$MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        this();
    }

    /* loaded from: classes.dex */
    static final class setX implements wM {
        public static final byte[] $$g = {107, -40, -73, 40};
        public static final int $$h = 24;
        public static final byte[] $$d = {109, -87, 105, -77, 65, -65, -1, 14, -15, 28, -24, -9, -7, 45, -39, -4, -1, 44, -29, -7, -4, 11, -13, 78, 0, -33, -51, 4, 15, -13, 4, 13, -11, 25, -38, 11, -6, 12, 3, -15, 11, 6, 23, -21, -12, 11, -2, 3, 49, 65, -72, 40, 42, -79, 14, -15, 27};
        public static final int $$e = 119;
        public static final byte[] $$a = {95, 98, 60, -42, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
        public static final int $$b = 33;
        private static byte[] setOnLongClickListener = {54, -88, 36, -123, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
        public static final int setY = 73;
        private static char setX = 44616;
        private static char setIconTintList = 48891;
        private static char setNavigationOnClickListener = 31780;
        private static char MenuHostHelper$$ExternalSyntheticLambda0 = 60501;

        /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 38
                int r7 = r7 + 77
                int r8 = r8 + 4
                byte[] r0 = o.wM$MenuHostHelper$$ExternalSyntheticLambda1.setX.$$a
                int r9 = r9 * 25
                int r9 = 40 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L18
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                goto L34
            L18:
                r3 = 0
            L19:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                int r8 = r8 + 1
                if (r4 != r9) goto L2a
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L2a:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L34:
                int r8 = r8 + r7
                int r7 = r8 + (-13)
                r8 = r9
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.wM$MenuHostHelper$$ExternalSyntheticLambda1.setX.a(short, short, int, java.lang.Object[]):void");
        }

        private static void c(short s, byte b, int i, Object[] objArr) {
            int i2 = (b * 7) + 16;
            byte[] bArr = setOnLongClickListener;
            int i3 = 106 - i;
            int i4 = s + 4;
            byte[] bArr2 = new byte[i2];
            int i5 = -1;
            int i6 = i2 - 1;
            if (bArr == null) {
                i3 = (i6 - i4) - 4;
                i4++;
                i6 = i6;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i5 = -1;
            }
            while (true) {
                int i7 = i5 + 1;
                bArr2[i7] = (byte) i3;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                i3 = (i3 - bArr[i4]) - 4;
                i4++;
                i6 = i6;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i5 = i7;
            }
        }

        private static void d(byte b, int i, byte b2, Object[] objArr) {
            int i2 = 115 - (i * 2);
            byte[] bArr = $$d;
            int i3 = b + 4;
            int i4 = 40 - b2;
            byte[] bArr2 = new byte[i4];
            int i5 = -1;
            int i6 = i4 - 1;
            if (bArr == null) {
                i6 = i6;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i5 = -1;
                i2 = (-i3) + i2;
                i3 = i3;
            }
            while (true) {
                int i7 = i5 + 1;
                bArr2[i7] = (byte) i2;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i8 = i3 + 1;
                byte b3 = bArr[i8];
                i6 = i6;
                objArr = objArr;
                bArr = bArr;
                bArr2 = bArr2;
                i5 = i7;
                i2 = (-b3) + i2;
                i3 = i8;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(int r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 2
                int r8 = r8 + 4
                int r6 = r6 * 4
                int r6 = r6 + 117
                byte[] r0 = o.wM$MenuHostHelper$$ExternalSyntheticLambda1.setX.$$g
                int r7 = r7 * 2
                int r7 = r7 + 1
                byte[] r1 = new byte[r7]
                int r7 = r7 + (-1)
                r2 = 0
                if (r0 != 0) goto L1b
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r9
                r9 = r8
                goto L37
            L1b:
                r3 = 0
                r5 = r8
                r8 = r6
                r6 = r5
            L1f:
                byte r4 = (byte) r8
                r1[r3] = r4
                if (r3 != r7) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L2c:
                int r3 = r3 + 1
                r4 = r0[r6]
                r5 = r9
                r9 = r6
                r6 = r4
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r5
            L37:
                int r6 = -r6
                int r8 = r8 + r6
                int r6 = r9 + 1
                r9 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L1f
            */
            throw new UnsupportedOperationException("Method not decompiled: o.wM$MenuHostHelper$$ExternalSyntheticLambda1.setX.e(int, short, short, java.lang.Object[]):void");
        }

        public final String toString() {
            return "FileSystem.SYSTEM";
        }

        @Override // o.wM
        public final void MenuHostHelper$$ExternalSyntheticLambda1(File file) {
            pN.setY(file, "");
            if (file.delete() || !file.exists()) {
                return;
            }
            StringBuilder sb = new StringBuilder("failed to delete ");
            sb.append(file);
            throw new IOException(sb.toString());
        }

        @Override // o.wM
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0(File file) {
            pN.setY(file, "");
            return file.exists();
        }

        @Override // o.wM
        public final long setOnLongClickListener(File file) {
            pN.setY(file, "");
            return file.length();
        }

        @Override // o.wM
        public final void setIconTintList(File file, File file2) {
            pN.setY(file, "");
            pN.setY(file2, "");
            MenuHostHelper$$ExternalSyntheticLambda1(file2);
            if (file.renameTo(file2)) {
                return;
            }
            StringBuilder sb = new StringBuilder("failed to rename ");
            sb.append(file);
            sb.append(" to ");
            sb.append(file2);
            throw new IOException(sb.toString());
        }

        @Override // o.wM
        public final void setX(File file) {
            pN.setY(file, "");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                StringBuilder sb = new StringBuilder("not a readable directory: ");
                sb.append(file);
                throw new IOException(sb.toString());
            }
            for (File file2 : listFiles) {
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) file2, "");
                if (file2.isDirectory()) {
                    setX(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb2 = new StringBuilder("failed to delete ");
                    sb2.append(file2);
                    throw new IOException(sb2.toString());
                }
            }
        }

        @Override // o.wM
        public final xK setIconTintList(File file) {
            pN.setY(file, "");
            try {
                return C0615xz.setX(file);
            } catch (FileNotFoundException unused) {
                file.getParentFile().mkdirs();
                return C0615xz.setX(file);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0458  */
        @Override // o.wM
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.xK setY(java.io.File r30) {
            /*
                Method dump skipped, instructions count: 1512
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.wM$MenuHostHelper$$ExternalSyntheticLambda1.setX.setY(java.io.File):o.xK");
        }

        @Override // o.wM
        public final xJ setLayoutAnimation(File file) {
            pN.setY(file, "");
            return C0615xz.MenuHostHelper$$ExternalSyntheticLambda1(file);
        }

        private static void b(int i, char[] cArr, Object[] objArr) {
            jw jwVar = new jw();
            char[] cArr2 = new char[cArr.length];
            jwVar.setX = 0;
            char[] cArr3 = new char[2];
            while (jwVar.setX < cArr.length) {
                cArr3[0] = cArr[jwVar.setX];
                cArr3[1] = cArr[jwVar.setX + 1];
                int i2 = 58224;
                for (int i3 = 0; i3 < 16; i3++) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[1]), Integer.valueOf((cArr3[0] + i2) ^ ((cArr3[0] << 4) + ((char) (MenuHostHelper$$ExternalSyntheticLambda0 ^ 7915367849376928708L)))), Integer.valueOf(cArr3[0] >>> 5), Integer.valueOf(setNavigationOnClickListener)};
                        Object obj = jC.setTextScaleX.get(-496584909);
                        if (obj == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            Object[] objArr3 = new Object[1];
                            e(b, b2, b2, objArr3);
                            obj = ((Class) jC.setY(325 - AndroidCharacter.getMirror('0'), (char) ((-16734953) - Color.rgb(0, 0, 0)), ExpandableListView.getPackedPositionType(0L) + 4)).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(-496584909, obj);
                        }
                        cArr3[1] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        try {
                            Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cArr3[1] + i2) ^ ((cArr3[1] << 4) + ((char) (setIconTintList ^ 7915367849376928708L)))), Integer.valueOf(cArr3[1] >>> 5), Integer.valueOf(setX)};
                            Object obj2 = jC.setTextScaleX.get(-496584909);
                            if (obj2 == null) {
                                byte b3 = (byte) 0;
                                byte b4 = b3;
                                Object[] objArr5 = new Object[1];
                                e(b3, b4, b4, objArr5);
                                obj2 = ((Class) jC.setY(277 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (42263 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4)).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                                jC.setTextScaleX.put(-496584909, obj2);
                            }
                            cArr3[0] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                            i2 -= 40503;
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
                cArr2[jwVar.setX] = cArr3[0];
                cArr2[jwVar.setX + 1] = cArr3[1];
                try {
                    Object[] objArr6 = {jwVar, jwVar};
                    Object obj3 = jC.setTextScaleX.get(655848378);
                    if (obj3 == null) {
                        obj3 = ((Class) jC.setY((ViewConfiguration.getLongPressTimeout() >> 16) + 365, (char) (55120 - TextUtils.lastIndexOf("", '0')), 4 - View.getDefaultSize(0, 0))).getMethod("A", Object.class, Object.class);
                        jC.setTextScaleX.put(655848378, obj3);
                    }
                    ((Method) obj3).invoke(null, objArr6);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            objArr[0] = new String(cArr2, 0, i);
        }
    }
}