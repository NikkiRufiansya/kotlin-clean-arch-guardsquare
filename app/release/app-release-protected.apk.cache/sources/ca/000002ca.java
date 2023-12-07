package o;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

/* renamed from: o.aa  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0013aa {
    public static final byte[] $$a = {28, 71, 97, 53};
    public static final int $$b = 248;
    public static byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {116, 58, -28, -63, -17, 6, -18, -1, 2, 1, 50, -57, -16, -3, -10, 11, -13, -10, 66, -25, -48, -3, -10, 11, -23, 0, 1, -5, -13, -10, 7, -15, -9, 45, -29, -22, 7, 33, -48, 7, -5, 5, -25, 17, 47, -66, 7, -17, 3, 53, -41, -42, 2, -5, 11, -12};
    public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 118;
    private static int setUnboundedRipple = 851212182;
    public final String setIconTintList;
    public final InterfaceC0073cg<InterfaceC0020ah> setX;
    public Integer setY = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 4
            int r7 = 1 - r7
            int r6 = r6 * 2
            int r6 = 104 - r6
            byte[] r0 = o.C0013aa.$$a
            byte[] r1 = new byte[r7]
            int r7 = r7 + (-1)
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r9
            r9 = r8
            r8 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r5
        L34:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0013aa.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 7
            int r6 = r6 + 16
            int r7 = 41 - r7
            int r8 = 106 - r8
            byte[] r0 = o.C0013aa.MenuHostHelper$$ExternalSyntheticLambda0
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = 0
            r8 = r7
            goto L2d
        L15:
            r3 = 0
        L16:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2d:
            int r7 = r7 + 1
            int r8 = r8 - r3
            int r8 = r8 + (-4)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0013aa.c(short, byte, byte, java.lang.Object[]):void");
    }

    public C0013aa(InterfaceC0073cg<InterfaceC0020ah> interfaceC0073cg, String str) {
        this.setX = interfaceC0073cg;
        this.setIconTintList = str;
    }

    public void setY(Collection<ah$MenuHostHelper$$ExternalSyntheticLambda1> collection) {
        for (ah$MenuHostHelper$$ExternalSyntheticLambda1 ah_menuhosthelper__externalsyntheticlambda1 : collection) {
            String str = ah_menuhosthelper__externalsyntheticlambda1.setX;
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(List<C0015ac> list, C0015ac c0015ac) {
        String str = c0015ac.MenuHostHelper$$ExternalSyntheticLambda1;
        String str2 = c0015ac.setIconTintList;
        for (C0015ac c0015ac2 : list) {
            if (c0015ac2.MenuHostHelper$$ExternalSyntheticLambda1.equals(str) && c0015ac2.setIconTintList.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public static void b(int i, char[] cArr, int i2, boolean z, int i3, Object[] objArr) {
        ju juVar = new ju();
        char[] cArr2 = new char[i];
        juVar.setX = 0;
        while (juVar.setX < i) {
            juVar.MenuHostHelper$$ExternalSyntheticLambda0 = cArr[juVar.setX];
            cArr2[juVar.setX] = (char) (i2 + juVar.MenuHostHelper$$ExternalSyntheticLambda0);
            int i4 = juVar.setX;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i4]), Integer.valueOf(setUnboundedRipple)};
                Object obj = jC.setTextScaleX.get(-1875803360);
                if (obj == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    Object[] objArr3 = new Object[1];
                    a(b, b2, (byte) (b2 - 1), objArr3);
                    obj = ((Class) jC.setY((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 341, (char) ((-16777216) - Color.rgb(0, 0, 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3)).getMethod((String) objArr3[0], Integer.TYPE, Integer.TYPE);
                    jC.setTextScaleX.put(-1875803360, obj);
                }
                cArr2[i4] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr4 = {juVar, juVar};
                    Object obj2 = jC.setTextScaleX.get(-257319855);
                    if (obj2 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        Object[] objArr5 = new Object[1];
                        a(b3, b4, (byte) (b4 - 1), objArr5);
                        obj2 = ((Class) jC.setY(Drawable.resolveOpacity(0, 0) + 206, (char) (65232 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 4 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod((String) objArr5[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-257319855, obj2);
                    }
                    ((Method) obj2).invoke(null, objArr4);
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
        if (i3 > 0) {
            juVar.setIconTintList = i3;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - juVar.setIconTintList, juVar.setIconTintList);
            System.arraycopy(cArr3, juVar.setIconTintList, cArr2, 0, i - juVar.setIconTintList);
        }
        if (z) {
            char[] cArr4 = new char[i];
            juVar.setX = 0;
            while (juVar.setX < i) {
                cArr4[juVar.setX] = cArr2[(i - juVar.setX) - 1];
                try {
                    Object[] objArr6 = {juVar, juVar};
                    Object obj3 = jC.setTextScaleX.get(-257319855);
                    if (obj3 == null) {
                        byte b5 = (byte) 1;
                        byte b6 = (byte) (b5 - 1);
                        Object[] objArr7 = new Object[1];
                        a(b5, b6, (byte) (b6 - 1), objArr7);
                        obj3 = ((Class) jC.setY(207 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (View.getDefaultSize(0, 0) + 65233), 4 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)))).getMethod((String) objArr7[0], Object.class, Object.class);
                        jC.setTextScaleX.put(-257319855, obj3);
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
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }
}