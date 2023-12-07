package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* renamed from: o.vs */
/* loaded from: classes.dex */
public abstract class AbstractC0549vs {
    private static char[] MenuHostHelper$$ExternalSyntheticLambda1;
    private static boolean setOnLongClickListener;
    private static boolean setUiOptions;
    public static final AbstractC0549vs setX;
    private static int setY;
    public static final byte[] $$a = {95, 85, -94, 50};
    public static final int $$b = 179;
    public static final byte[] MenuHostHelper$$ExternalSyntheticLambda0 = {38, -105, 32, 30, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
    public static final int setIconTintList = 113;

    /* renamed from: o.vs$setX */
    /* loaded from: classes.dex */
    public interface setX {
        AbstractC0549vs setX(InterfaceC0541vk interfaceC0541vk);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0541vk interfaceC0541vk, IOException iOException) {
        pN.setY(interfaceC0541vk, "");
        pN.setY((Object) iOException, "");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0541vk interfaceC0541vk, String str) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(str, "");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0541vk interfaceC0541vk, String str, List<InetAddress> list) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(str, "");
        pN.setY(list, "");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0541vk interfaceC0541vk, vJ vJVar) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(vJVar, "");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0541vk interfaceC0541vk, InterfaceC0545vo interfaceC0545vo) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(interfaceC0545vo, "");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0541vk interfaceC0541vk, vJ vJVar) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(vJVar, "");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0541vk interfaceC0541vk, InterfaceC0545vo interfaceC0545vo) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(interfaceC0545vo, "");
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(InterfaceC0541vk interfaceC0541vk, C0555vx c0555vx, List<Proxy> list) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(c0555vx, "");
        pN.setY(list, "");
    }

    private static void a(short s, short s2, byte b, Object[] objArr) {
        int i = 3 - (s * 2);
        int i2 = 68 - (b * 2);
        int i3 = (s2 * 2) + 1;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i3];
        int i4 = -1;
        int i5 = i3 - 1;
        if (bArr == null) {
            i2 = i5 + (-i);
            i = i;
            i5 = i5;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = -1;
        }
        while (true) {
            int i6 = i4 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i7 = i + 1;
            i2 += -bArr[i7];
            i = i7;
            i5 = i5;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i4 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002b -> B:23:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 106 - r8
            int r7 = r7 * 15
            int r7 = 18 - r7
            byte[] r0 = o.AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda0
            int r6 = r6 * 3
            int r6 = 16 - r6
            byte[] r1 = new byte[r6]
            int r6 = r6 + (-1)
            r2 = 0
            if (r0 != 0) goto L1b
            r8 = r7
            r3 = r1
            r4 = 0
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L37
        L1b:
            r3 = 0
        L1c:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L37:
            int r8 = r8 + r6
            int r8 = r8 + 2
            r6 = r7
            r7 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.AbstractC0549vs.c(byte, short, int, java.lang.Object[]):void");
    }

    public static void setCenterIfNoTextEnabled(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    public static void setIconSize(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    public static void setIconTintList(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    public static void setIconTintList(InterfaceC0541vk interfaceC0541vk, IOException iOException) {
        pN.setY(interfaceC0541vk, "");
        pN.setY((Object) iOException, "");
    }

    public static void setLayoutAnimation(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    public static void setNavigationOnClickListener(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    public static void setOnLongClickListener(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    public static void setUiOptions(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    public static void setUnboundedRipple(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    static void setX() {
        MenuHostHelper$$ExternalSyntheticLambda1 = new char[]{33988, 34007, 34009, 34027, 34006, 34012, 33943, 34026, 33994, 34028, 34025, 34008, 34000, 33978, 34001, 34010, 34002, 34005, 33995, 33956, 34031, 33993, 34013, 34024};
        setOnLongClickListener = true;
        setUiOptions = true;
        setY = -1400797851;
    }

    public static void setX(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    public static void setX(InterfaceC0541vk interfaceC0541vk, InetSocketAddress inetSocketAddress, Proxy proxy) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(inetSocketAddress, "");
        pN.setY(proxy, "");
    }

    public static void setX(InterfaceC0541vk interfaceC0541vk, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(inetSocketAddress, "");
        pN.setY(proxy, "");
        pN.setY((Object) iOException, "");
    }

    public static void setX(InterfaceC0541vk interfaceC0541vk, vJ vJVar) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(vJVar, "");
    }

    public static void setX(InterfaceC0541vk interfaceC0541vk, C0555vx c0555vx) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(c0555vx, "");
    }

    public static void setY(InterfaceC0541vk interfaceC0541vk) {
        pN.setY(interfaceC0541vk, "");
    }

    public static void setY(InterfaceC0541vk interfaceC0541vk, IOException iOException) {
        pN.setY(interfaceC0541vk, "");
        pN.setY((Object) iOException, "");
    }

    public static void setY(InterfaceC0541vk interfaceC0541vk, InetSocketAddress inetSocketAddress, Proxy proxy) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(inetSocketAddress, "");
        pN.setY(proxy, "");
    }

    public static void setY(InterfaceC0541vk interfaceC0541vk, vE vEVar) {
        pN.setY(interfaceC0541vk, "");
        pN.setY(vEVar, "");
    }

    /* renamed from: o.vs$setY */
    /* loaded from: classes.dex */
    public static final class setY {
        private setY() {
        }

        public /* synthetic */ setY(byte b) {
            this();
        }
    }

    /* renamed from: o.vs$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList extends AbstractC0549vs {
        setIconTintList() {
        }
    }

    static {
        setX();
        new setY((byte) 0);
        setX = new setIconTintList();
    }

    public static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) {
        jt jtVar = new jt();
        char[] cArr2 = MenuHostHelper$$ExternalSyntheticLambda1;
        int i2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i2] = Integer.valueOf(cArr2[i3]);
                    Object obj = jC.setTextScaleX.get(-2024796271);
                    if (obj == null) {
                        byte b = (byte) i2;
                        byte b2 = b;
                        Object[] objArr3 = new Object[1];
                        a(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY(MotionEvent.axisFromString("") + 233, (char) (ViewConfiguration.getJumpTapTimeout() >> 16), 5 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-2024796271, obj);
                    }
                    cArr3[i3] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i3++;
                    i2 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(setY)};
            Object obj2 = jC.setTextScaleX.get(-192560398);
            long j = 0;
            if (obj2 == null) {
                obj2 = ((Class) jC.setY((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 356, (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 31792), ((byte) KeyEvent.getModifierMetaStateMask()) + 5)).getMethod("C", Integer.TYPE);
                jC.setTextScaleX.put(-192560398, obj2);
            }
            int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
            if (setUiOptions) {
                jtVar.setIconTintList = bArr.length;
                char[] cArr4 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr4[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[bArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] + i] - intValue);
                    try {
                        Object[] objArr5 = {jtVar, jtVar};
                        Object obj3 = jC.setTextScaleX.get(258277102);
                        if (obj3 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            Object[] objArr6 = new Object[1];
                            a(b3, b4, (byte) (b4 + 1), objArr6);
                            obj3 = ((Class) jC.setY(View.getDefaultSize(0, 0) + 210, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 4 - ExpandableListView.getPackedPositionType(j))).getMethod((String) objArr6[0], Object.class, Object.class);
                            jC.setTextScaleX.put(258277102, obj3);
                        }
                        ((Method) obj3).invoke(null, objArr5);
                        j = 0;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                objArr[0] = new String(cArr4);
            } else if (setOnLongClickListener) {
                jtVar.setIconTintList = cArr.length;
                char[] cArr5 = new char[jtVar.setIconTintList];
                jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                    cArr5[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[cArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                    try {
                        Object[] objArr7 = {jtVar, jtVar};
                        Object obj4 = jC.setTextScaleX.get(258277102);
                        if (obj4 == null) {
                            byte b5 = (byte) 0;
                            byte b6 = b5;
                            Object[] objArr8 = new Object[1];
                            a(b5, b6, (byte) (b6 + 1), objArr8);
                            obj4 = ((Class) jC.setY(210 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.rgb(0, 0, 0) + 16777220)).getMethod((String) objArr8[0], Object.class, Object.class);
                            jC.setTextScaleX.put(258277102, obj4);
                        }
                        ((Method) obj4).invoke(null, objArr7);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                objArr[0] = new String(cArr5);
            } else {
                int i4 = 0;
                jtVar.setIconTintList = iArr.length;
                char[] cArr6 = new char[jtVar.setIconTintList];
                while (true) {
                    jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = i4;
                    if (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                        cArr6[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[iArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                        i4 = jtVar.MenuHostHelper$$ExternalSyntheticLambda1 + 1;
                    } else {
                        objArr[0] = new String(cArr6);
                        return;
                    }
                }
            }
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }
}