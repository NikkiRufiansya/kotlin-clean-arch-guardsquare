package o;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import o.AbstractC0210hi;

/* loaded from: classes.dex */
public final class hI {
    public static final InterfaceC0209hh ExtendableSavedState$1;
    public static final AbstractC0210hi<BigDecimal> MenuHostHelper$$ExternalSyntheticLambda0;
    public static final InterfaceC0209hh MenuHostHelper$$ExternalSyntheticLambda1;
    public static final InterfaceC0209hh SearchView$SavedState$1;
    public static final InterfaceC0209hh setAnimationFromJson;
    public static final AbstractC0210hi<Number> setCenterIfNoTextEnabled;
    public static final InterfaceC0209hh setCheckedIconEnabled;
    public static final InterfaceC0209hh setChipCornerRadius;
    public static final InterfaceC0209hh setChipIconTintResource;
    public static final InterfaceC0209hh setContentScrimResource;
    public static final AbstractC0210hi<Number> setGuidelinePercent;
    public static final InterfaceC0209hh setHasDecor;
    public static final InterfaceC0209hh setIconSize;
    public static final AbstractC0210hi<BigInteger> setIconTintList;
    public static final InterfaceC0209hh setIconified;
    public static final AbstractC0210hi<Boolean> setLayoutAnimation;
    public static final InterfaceC0209hh setLayoutDirection;
    public static final AbstractC0210hi<Number> setMaxEms;
    public static final InterfaceC0209hh setMinAndMaxProgress;
    public static final InterfaceC0209hh setNavigationOnClickListener;
    public static final InterfaceC0209hh setOnLongClickListener;
    public static final InterfaceC0209hh setOnNavigationItemSelectedListener;
    public static final InterfaceC0209hh setTextAlignment;
    public static final InterfaceC0209hh setTextAppearanceResource;
    public static final AbstractC0210hi<gV> setTextScaleX;
    public static final InterfaceC0209hh setUnboundedRipple;
    public static final InterfaceC0209hh setX;
    public static final InterfaceC0209hh setY;
    public static final InterfaceC0209hh setZ;
    public static final InterfaceC0209hh ViewPager$SavedState$1 = new AnonymousClass24(Class.class, new AbstractC0210hi.AnonymousClass2());
    public static final InterfaceC0209hh setUiOptions = new AnonymousClass24(BitSet.class, new AbstractC0210hi.AnonymousClass2());

    static {
        AbstractC0210hi<Boolean> abstractC0210hi = new AbstractC0210hi<Boolean>() { // from class: o.hI.21
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Boolean bool) {
                hRVar.MenuHostHelper$$ExternalSyntheticLambda0(bool);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ Boolean setX(hP hPVar) {
                hO centerIfNoTextEnabled = hPVar.setCenterIfNoTextEnabled();
                if (centerIfNoTextEnabled == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                } else if (centerIfNoTextEnabled == hO.STRING) {
                    return Boolean.valueOf(Boolean.parseBoolean(hPVar.setIconSize()));
                } else {
                    return Boolean.valueOf(hPVar.setUnboundedRipple());
                }
            }
        };
        setLayoutAnimation = new AbstractC0210hi<Boolean>() { // from class: o.hI.27
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Boolean bool) {
                Boolean bool2 = bool;
                hRVar.setY(bool2 == null ? "null" : bool2.toString());
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ Boolean setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                return Boolean.valueOf(hPVar.setIconSize());
            }
        };
        setUnboundedRipple = new AnonymousClass28(Boolean.TYPE, Boolean.class, abstractC0210hi);
        setNavigationOnClickListener = new AnonymousClass28(Byte.TYPE, Byte.class, new AbstractC0210hi<Number>() { // from class: o.hI.31
            public static final byte[] $$g = {116, 44, -28, -115};
            public static final int $$h = 123;
            public static final byte[] $$d = {53, -98, 98, -100, -14, 15, -43, 26, 12, -1, -26, 21, 5, 6, -40, 29, 10, 1, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 64, 12, -65, 72, -40, -42, 79, -14, 15, -27};
            public static final int $$e = 114;
            public static final byte[] $$a = {8, -125, -40, -38, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
            public static final int $$b = 186;
            private static byte[] setX = {59, -54, -26, -72, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
            public static final int MenuHostHelper$$ExternalSyntheticLambda1 = 100;
            private static char[] setIconTintList = {41010, 41056, 41070, 41066, 41040, 41055, 41070, 41067, 41076, 41073, 41057, 41031, 41047, 41078, 41033, 41038, 41057, 41067, 41079, 41068, 41070, 41056, 41080, 41211, 41208, 41222, 41200, 41203, 41195, 41195, 41202, 41210, 41221, 41214, 41200, 41214, 41201, 41015, 41056, 41070, 41068, 41079, 41067, 41057, 41038, 41024, 41071, 41079, 41032, 41008, 41045, 41068, 41065, 41064, 41064, 41065, 41073, 41057, 41049, 41066, 41068, 41060, 41061, 41070, 41179, 41188, 41189, 41180, 41182, 41190, 41165, 41167, 41191, 41177, 41181, 41169, 41173, 41181, 41177, 41179, 41177};

            private static void a(short s, int i, byte b, Object[] objArr) {
                int i2 = (b * 38) + 77;
                byte[] bArr = $$a;
                int i3 = (s * 14) + 4;
                int i4 = (i * 25) + 15;
                byte[] bArr2 = new byte[i4];
                int i5 = -1;
                int i6 = i4 - 1;
                if (bArr == null) {
                    i2 = (i6 + (-i3)) - 13;
                    i3++;
                    i6 = i6;
                    objArr = objArr;
                    bArr = bArr;
                    bArr2 = bArr2;
                    i5 = -1;
                }
                while (true) {
                    int i7 = i5 + 1;
                    bArr2[i7] = (byte) i2;
                    if (i7 == i6) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i8 = i6;
                    int i9 = i3;
                    i2 = (i2 + (-bArr[i3])) - 13;
                    i3 = i9 + 1;
                    i6 = i8;
                    objArr = objArr;
                    bArr = bArr;
                    bArr2 = bArr2;
                    i5 = i7;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x001a  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0022  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0022 -> B:23:0x0024). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 + 4
                    byte[] r0 = o.hI.AnonymousClass31.setX
                    int r7 = r7 * 7
                    int r7 = r7 + 16
                    int r6 = 106 - r6
                    byte[] r1 = new byte[r7]
                    r2 = 0
                    if (r0 != 0) goto L12
                    r3 = r8
                    r4 = 0
                    goto L24
                L12:
                    r3 = 0
                L13:
                    int r4 = r3 + 1
                    byte r5 = (byte) r6
                    r1[r3] = r5
                    if (r4 != r7) goto L22
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L22:
                    r3 = r0[r8]
                L24:
                    int r8 = r8 + 1
                    int r6 = r6 + r3
                    int r6 = r6 + (-4)
                    r3 = r4
                    goto L13
                */
                throw new UnsupportedOperationException("Method not decompiled: o.hI.AnonymousClass31.c(int, int, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x0025  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x002d  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x002d -> B:23:0x0035). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void d(short r6, int r7, int r8, java.lang.Object[] r9) {
                /*
                    int r8 = r8 + 4
                    byte[] r0 = o.hI.AnonymousClass31.$$d
                    int r7 = r7 + 4
                    int r6 = r6 * 2
                    int r6 = r6 + 77
                    byte[] r1 = new byte[r8]
                    int r8 = r8 + (-1)
                    r2 = 0
                    if (r0 != 0) goto L18
                    r6 = r7
                    r3 = r1
                    r4 = 0
                    r1 = r0
                    r0 = r9
                    r9 = r8
                    goto L35
                L18:
                    r3 = 0
                    r5 = r7
                    r7 = r6
                    r6 = r5
                L1c:
                    byte r4 = (byte) r7
                    r1[r3] = r4
                    int r6 = r6 + 1
                    int r4 = r3 + 1
                    if (r3 != r8) goto L2d
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L2d:
                    r3 = r0[r6]
                    r5 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r5
                L35:
                    int r7 = r7 + r8
                    r8 = r9
                    r9 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L1c
                */
                throw new UnsupportedOperationException("Method not decompiled: o.hI.AnonymousClass31.d(short, int, int, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:20:0x001f  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0027  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0027 -> B:23:0x0033). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void e(int r6, byte r7, short r8, java.lang.Object[] r9) {
                /*
                    int r7 = r7 + 4
                    int r6 = 111 - r6
                    byte[] r0 = o.hI.AnonymousClass31.$$g
                    int r8 = r8 * 4
                    int r8 = 1 - r8
                    byte[] r1 = new byte[r8]
                    int r8 = r8 + (-1)
                    r2 = 0
                    if (r0 != 0) goto L17
                    r3 = r1
                    r4 = 0
                    r1 = r0
                    r0 = r9
                    r9 = r8
                    goto L33
                L17:
                    r3 = 0
                L18:
                    byte r4 = (byte) r6
                    r1[r3] = r4
                    int r7 = r7 + 1
                    if (r3 != r8) goto L27
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1, r2)
                    r9[r2] = r6
                    return
                L27:
                    int r3 = r3 + 1
                    r4 = r0[r7]
                    r5 = r8
                    r8 = r6
                    r6 = r4
                    r4 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r9
                    r9 = r5
                L33:
                    int r6 = r6 + r8
                    r8 = r9
                    r9 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    goto L18
                */
                throw new UnsupportedOperationException("Method not decompiled: o.hI.AnonymousClass31.e(int, byte, short, java.lang.Object[]):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:100:0x037d  */
            @Override // o.AbstractC0210hi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ java.lang.Number setX(o.hP r26) {
                /*
                    Method dump skipped, instructions count: 1281
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.hI.AnonymousClass31.setX(o.hP):java.lang.Object");
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Number number) {
                hRVar.setIconTintList(number);
            }

            private static Number MenuHostHelper$$ExternalSyntheticLambda1(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                try {
                    return Byte.valueOf((byte) hPVar.setLayoutAnimation());
                } catch (NumberFormatException e) {
                    throw new C0203hb(e);
                }
            }

            private static void b(int[] iArr, byte[] bArr, boolean z, Object[] objArr) {
                int i;
                jx jxVar = new jx();
                char c = 0;
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = setIconTintList;
                long j = 0;
                float f = 0.0f;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    int i6 = 0;
                    while (i6 < length) {
                        try {
                            Object[] objArr2 = new Object[1];
                            objArr2[c] = Integer.valueOf(cArr[i6]);
                            Object obj = jC.setTextScaleX.get(-2065108825);
                            if (obj == null) {
                                byte b = (byte) ($$h & 7);
                                byte b2 = (byte) (b - 4);
                                Object[] objArr3 = new Object[1];
                                e(b, b2, (byte) (b2 + 1), objArr3);
                                obj = ((Class) jC.setY((PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)) + 40, (char) (35091 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), 6 - (ViewConfiguration.getEdgeSlop() >> 16))).getMethod((String) objArr3[0], Integer.TYPE);
                                jC.setTextScaleX.put(-2065108825, obj);
                            }
                            cArr2[i6] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                            i6++;
                            c = 0;
                            j = 0;
                            f = 0.0f;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i3];
                System.arraycopy(cArr, i2, cArr3, 0, i3);
                if (bArr != null) {
                    char[] cArr4 = new char[i3];
                    jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                    char c2 = 0;
                    while (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 < i3) {
                        if (bArr[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] == 1) {
                            int i7 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                            try {
                                Object[] objArr4 = {Integer.valueOf(cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c2)};
                                Object obj2 = jC.setTextScaleX.get(1237805447);
                                if (obj2 == null) {
                                    byte b3 = (byte) ($$h & 6);
                                    byte b4 = (byte) (b3 - 3);
                                    Object[] objArr5 = new Object[1];
                                    e(b3, b4, (byte) (b4 + 1), objArr5);
                                    obj2 = ((Class) jC.setY((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 273, (char) Color.green(0), 4 - KeyEvent.getDeadChar(0, 0))).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE);
                                    jC.setTextScaleX.put(1237805447, obj2);
                                }
                                cArr4[i7] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            int i8 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                            try {
                                Object[] objArr6 = {Integer.valueOf(cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c2)};
                                Object obj3 = jC.setTextScaleX.get(997913035);
                                if (obj3 == null) {
                                    byte b5 = (byte) ($$h & 5);
                                    byte b6 = (byte) (-b5);
                                    Object[] objArr7 = new Object[1];
                                    e(b5, b6, (byte) (b6 + 1), objArr7);
                                    obj3 = ((Class) jC.setY((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 268, (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 3)).getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE);
                                    jC.setTextScaleX.put(997913035, obj3);
                                }
                                cArr4[i8] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                            } catch (Throwable th3) {
                                Throwable cause3 = th3.getCause();
                                if (cause3 == null) {
                                    throw th3;
                                }
                                throw cause3;
                            }
                        }
                        c2 = cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0];
                        try {
                            Object[] objArr8 = {jxVar, jxVar};
                            Object obj4 = jC.setTextScaleX.get(1233791110);
                            if (obj4 == null) {
                                byte b7 = (byte) 0;
                                byte b8 = (byte) (b7 - 1);
                                Object[] objArr9 = new Object[1];
                                e(b7, b8, (byte) (b8 + 1), objArr9);
                                obj4 = ((Class) jC.setY((ViewConfiguration.getPressedStateDuration() >> 16) + 236, (char) ((-1) - TextUtils.lastIndexOf("", '0')), 4 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).getMethod((String) objArr9[0], Object.class, Object.class);
                                jC.setTextScaleX.put(1233791110, obj4);
                            }
                            ((Method) obj4).invoke(null, objArr8);
                        } catch (Throwable th4) {
                            Throwable cause4 = th4.getCause();
                            if (cause4 == null) {
                                throw th4;
                            }
                            throw cause4;
                        }
                    }
                    cArr3 = cArr4;
                }
                if (i5 > 0) {
                    char[] cArr5 = new char[i3];
                    i = 0;
                    System.arraycopy(cArr3, 0, cArr5, 0, i3);
                    int i9 = i3 - i5;
                    System.arraycopy(cArr5, 0, cArr3, i9, i5);
                    System.arraycopy(cArr5, i5, cArr3, 0, i9);
                } else {
                    i = 0;
                }
                if (z) {
                    char[] cArr6 = new char[i3];
                    while (true) {
                        jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                        if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i3) {
                            break;
                        }
                        cArr6[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr3[(i3 - jxVar.MenuHostHelper$$ExternalSyntheticLambda0) - 1];
                        i = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
                    }
                    cArr3 = cArr6;
                }
                if (i4 > 0) {
                    int i10 = 0;
                    while (true) {
                        jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i10;
                        if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i3) {
                            break;
                        }
                        cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (cArr3[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] - iArr[2]);
                        i10 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
                    }
                }
                objArr[0] = new String(cArr3);
            }
        });
        setMinAndMaxProgress = new AnonymousClass28(Short.TYPE, Short.class, new AbstractC0210hi<Number>() { // from class: o.hI.32
            @Override // o.AbstractC0210hi
            public final /* synthetic */ Number setX(hP hPVar) {
                return MenuHostHelper$$ExternalSyntheticLambda0(hPVar);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Number number) {
                hRVar.setIconTintList(number);
            }

            private static Number MenuHostHelper$$ExternalSyntheticLambda0(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                try {
                    return Short.valueOf((short) hPVar.setLayoutAnimation());
                } catch (NumberFormatException e) {
                    throw new C0203hb(e);
                }
            }
        });
        setAnimationFromJson = new AnonymousClass28(Integer.TYPE, Integer.class, new AbstractC0210hi<Number>() { // from class: o.hI.33
            @Override // o.AbstractC0210hi
            public final /* synthetic */ Number setX(hP hPVar) {
                return MenuHostHelper$$ExternalSyntheticLambda0(hPVar);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Number number) {
                hRVar.setIconTintList(number);
            }

            private static Number MenuHostHelper$$ExternalSyntheticLambda0(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                try {
                    return Integer.valueOf(hPVar.setLayoutAnimation());
                } catch (NumberFormatException e) {
                    throw new C0203hb(e);
                }
            }
        });
        setX = new AnonymousClass24(AtomicInteger.class, new AbstractC0210hi.AnonymousClass2());
        MenuHostHelper$$ExternalSyntheticLambda1 = new AnonymousClass24(AtomicBoolean.class, new AbstractC0210hi.AnonymousClass2());
        setY = new AnonymousClass24(AtomicIntegerArray.class, new AbstractC0210hi.AnonymousClass2());
        setGuidelinePercent = new AbstractC0210hi<Number>() { // from class: o.hI.2
            @Override // o.AbstractC0210hi
            public final /* synthetic */ Number setX(hP hPVar) {
                return MenuHostHelper$$ExternalSyntheticLambda0(hPVar);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Number number) {
                hRVar.setIconTintList(number);
            }

            private static Number MenuHostHelper$$ExternalSyntheticLambda0(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                try {
                    return Long.valueOf(hPVar.setOnLongClickListener());
                } catch (NumberFormatException e) {
                    throw new C0203hb(e);
                }
            }
        };
        setMaxEms = new AbstractC0210hi<Number>() { // from class: o.hI.3
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Number number) {
                hRVar.setIconTintList(number);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ Number setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                return Float.valueOf((float) hPVar.setNavigationOnClickListener());
            }
        };
        setCenterIfNoTextEnabled = new AbstractC0210hi<Number>() { // from class: o.hI.5
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Number number) {
                hRVar.setIconTintList(number);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ Number setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                return Double.valueOf(hPVar.setNavigationOnClickListener());
            }
        };
        setTextAppearanceResource = new AnonymousClass24(Number.class, new AbstractC0210hi<Number>() { // from class: o.hI.8
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Number number) {
                hRVar.setIconTintList(number);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ Number setX(hP hPVar) {
                hO centerIfNoTextEnabled = hPVar.setCenterIfNoTextEnabled();
                int i = AnonymousClass26.setIconTintList[centerIfNoTextEnabled.ordinal()];
                if (i == 1 || i == 3) {
                    return new C0216ho(hPVar.setIconSize());
                }
                if (i == 4) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                StringBuilder sb = new StringBuilder("Expecting number, got: ");
                sb.append(centerIfNoTextEnabled);
                throw new C0203hb(sb.toString());
            }
        });
        setChipCornerRadius = new AnonymousClass28(Character.TYPE, Character.class, new AbstractC0210hi<Character>() { // from class: o.hI.10
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Character ch) {
                Character ch2 = ch;
                hRVar.setY(ch2 == null ? null : String.valueOf(ch2));
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ Character setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                String iconSize = hPVar.setIconSize();
                if (iconSize.length() != 1) {
                    StringBuilder sb = new StringBuilder("Expecting character, got: ");
                    sb.append(iconSize);
                    throw new C0203hb(sb.toString());
                }
                return Character.valueOf(iconSize.charAt(0));
            }
        });
        AbstractC0210hi<String> abstractC0210hi2 = new AbstractC0210hi<String>() { // from class: o.hI.7
            @Override // o.AbstractC0210hi
            public final /* bridge */ /* synthetic */ void setY(hR hRVar, String str) {
                hRVar.setY(str);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ String setX(hP hPVar) {
                hO centerIfNoTextEnabled = hPVar.setCenterIfNoTextEnabled();
                if (centerIfNoTextEnabled == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                } else if (centerIfNoTextEnabled == hO.BOOLEAN) {
                    return Boolean.toString(hPVar.setUnboundedRipple());
                } else {
                    return hPVar.setIconSize();
                }
            }
        };
        MenuHostHelper$$ExternalSyntheticLambda0 = new AbstractC0210hi<BigDecimal>() { // from class: o.hI.6
            @Override // o.AbstractC0210hi
            public final /* synthetic */ BigDecimal setX(hP hPVar) {
                return setIconTintList(hPVar);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, BigDecimal bigDecimal) {
                hRVar.setIconTintList(bigDecimal);
            }

            private static BigDecimal setIconTintList(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                try {
                    return new BigDecimal(hPVar.setIconSize());
                } catch (NumberFormatException e) {
                    throw new C0203hb(e);
                }
            }
        };
        setIconTintList = new AbstractC0210hi<BigInteger>() { // from class: o.hI.9
            @Override // o.AbstractC0210hi
            public final /* synthetic */ BigInteger setX(hP hPVar) {
                return setIconTintList(hPVar);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, BigInteger bigInteger) {
                hRVar.setIconTintList(bigInteger);
            }

            private static BigInteger setIconTintList(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                try {
                    return new BigInteger(hPVar.setIconSize());
                } catch (NumberFormatException e) {
                    throw new C0203hb(e);
                }
            }
        };
        setHasDecor = new AnonymousClass24(String.class, abstractC0210hi2);
        setIconified = new AnonymousClass24(StringBuilder.class, new AbstractC0210hi<StringBuilder>() { // from class: o.hI.12
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, StringBuilder sb) {
                StringBuilder sb2 = sb;
                hRVar.setY(sb2 == null ? null : sb2.toString());
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ StringBuilder setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                return new StringBuilder(hPVar.setIconSize());
            }
        });
        setCheckedIconEnabled = new AnonymousClass24(StringBuffer.class, new AbstractC0210hi<StringBuffer>() { // from class: o.hI.11
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, StringBuffer stringBuffer) {
                StringBuffer stringBuffer2 = stringBuffer;
                hRVar.setY(stringBuffer2 == null ? null : stringBuffer2.toString());
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ StringBuffer setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                return new StringBuffer(hPVar.setIconSize());
            }
        });
        setChipIconTintResource = new AnonymousClass24(URL.class, new AbstractC0210hi<URL>() { // from class: o.hI.13
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, URL url) {
                URL url2 = url;
                hRVar.setY(url2 == null ? null : url2.toExternalForm());
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ URL setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                String iconSize = hPVar.setIconSize();
                if ("null".equals(iconSize)) {
                    return null;
                }
                return new URL(iconSize);
            }
        });
        ExtendableSavedState$1 = new AnonymousClass24(URI.class, new AbstractC0210hi<URI>() { // from class: o.hI.15
            @Override // o.AbstractC0210hi
            public final /* synthetic */ URI setX(hP hPVar) {
                return setIconTintList(hPVar);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, URI uri) {
                URI uri2 = uri;
                hRVar.setY(uri2 == null ? null : uri2.toASCIIString());
            }

            private static URI setIconTintList(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                try {
                    String iconSize = hPVar.setIconSize();
                    if ("null".equals(iconSize)) {
                        return null;
                    }
                    return new URI(iconSize);
                } catch (URISyntaxException e) {
                    throw new gY(e);
                }
            }
        });
        final AbstractC0210hi<InetAddress> abstractC0210hi3 = new AbstractC0210hi<InetAddress>() { // from class: o.hI.20
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, InetAddress inetAddress) {
                InetAddress inetAddress2 = inetAddress;
                hRVar.setY(inetAddress2 == null ? null : inetAddress2.getHostAddress());
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ InetAddress setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                return InetAddress.getByName(hPVar.setIconSize());
            }
        };
        setZ = new InterfaceC0209hh() { // from class: o.hI.29
            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(abstractC0210hi3);
                sb.append("]");
                return sb.toString();
            }

            @Override // o.InterfaceC0209hh
            public final <T2> AbstractC0210hi<T2> setIconTintList(gS gSVar, hQ<T2> hQVar) {
                final Class<? super T2> cls = hQVar.setIconTintList;
                if (r1.isAssignableFrom(cls)) {
                    return (AbstractC0210hi<T2>) new AbstractC0210hi<T1>() { // from class: o.hI.29.2
                        {
                            AnonymousClass29.this = this;
                        }

                        @Override // o.AbstractC0210hi
                        public final void setY(hR hRVar, T1 t1) {
                            abstractC0210hi3.setY(hRVar, t1);
                        }

                        @Override // o.AbstractC0210hi
                        public final T1 setX(hP hPVar) {
                            T1 t1 = (T1) abstractC0210hi3.setX(hPVar);
                            if (t1 == null || cls.isInstance(t1)) {
                                return t1;
                            }
                            StringBuilder sb = new StringBuilder("Expected a ");
                            sb.append(cls.getName());
                            sb.append(" but was ");
                            sb.append(t1.getClass().getName());
                            throw new C0203hb(sb.toString());
                        }
                    };
                }
                return null;
            }
        };
        setContentScrimResource = new AnonymousClass24(UUID.class, new AbstractC0210hi<UUID>() { // from class: o.hI.17
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, UUID uuid) {
                UUID uuid2 = uuid;
                hRVar.setY(uuid2 == null ? null : uuid2.toString());
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ UUID setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                return UUID.fromString(hPVar.setIconSize());
            }
        });
        setIconSize = new AnonymousClass24(Currency.class, new AbstractC0210hi.AnonymousClass2());
        SearchView$SavedState$1 = new InterfaceC0209hh() { // from class: o.hI.18
            @Override // o.InterfaceC0209hh
            public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
                if (hQVar.setIconTintList != Timestamp.class) {
                    return null;
                }
                final AbstractC0210hi<T> MenuHostHelper$$ExternalSyntheticLambda12 = gSVar.MenuHostHelper$$ExternalSyntheticLambda1(new hQ<>(Date.class));
                return (AbstractC0210hi<T>) new AbstractC0210hi<Timestamp>() { // from class: o.hI.18.4
                    {
                        AnonymousClass18.this = this;
                    }

                    @Override // o.AbstractC0210hi
                    public final /* bridge */ /* synthetic */ void setY(hR hRVar, Timestamp timestamp) {
                        MenuHostHelper$$ExternalSyntheticLambda12.setY(hRVar, timestamp);
                    }

                    @Override // o.AbstractC0210hi
                    public final /* synthetic */ Timestamp setX(hP hPVar) {
                        Date date = (Date) MenuHostHelper$$ExternalSyntheticLambda12.setX(hPVar);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }
                };
            }
        };
        final AbstractC0210hi<Calendar> abstractC0210hi4 = new AbstractC0210hi<Calendar>() { // from class: o.hI.16
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Calendar calendar) {
                Calendar calendar2 = calendar;
                if (calendar2 == null) {
                    hRVar.setY();
                    return;
                }
                hRVar.MenuHostHelper$$ExternalSyntheticLambda1();
                hRVar.setIconTintList("year");
                hRVar.setX(calendar2.get(1));
                hRVar.setIconTintList("month");
                hRVar.setX(calendar2.get(2));
                hRVar.setIconTintList("dayOfMonth");
                hRVar.setX(calendar2.get(5));
                hRVar.setIconTintList("hourOfDay");
                hRVar.setX(calendar2.get(11));
                hRVar.setIconTintList("minute");
                hRVar.setX(calendar2.get(12));
                hRVar.setIconTintList("second");
                hRVar.setX(calendar2.get(13));
                hRVar.setX();
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ Calendar setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                hPVar.MenuHostHelper$$ExternalSyntheticLambda1();
                int i = 0;
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (hPVar.setCenterIfNoTextEnabled() != hO.END_OBJECT) {
                    String textAlignment = hPVar.setTextAlignment();
                    int layoutAnimation = hPVar.setLayoutAnimation();
                    if ("year".equals(textAlignment)) {
                        i = layoutAnimation;
                    } else if ("month".equals(textAlignment)) {
                        i2 = layoutAnimation;
                    } else if ("dayOfMonth".equals(textAlignment)) {
                        i3 = layoutAnimation;
                    } else if ("hourOfDay".equals(textAlignment)) {
                        i4 = layoutAnimation;
                    } else if ("minute".equals(textAlignment)) {
                        i5 = layoutAnimation;
                    } else if ("second".equals(textAlignment)) {
                        i6 = layoutAnimation;
                    }
                }
                hPVar.setX();
                return new GregorianCalendar(i, i2, i3, i4, i5, i6);
            }
        };
        setOnLongClickListener = new InterfaceC0209hh() { // from class: o.hI.30
            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[type=");
                sb.append(r1.getName());
                sb.append("+");
                sb.append(r2.getName());
                sb.append(",adapter=");
                sb.append(abstractC0210hi4);
                sb.append("]");
                return sb.toString();
            }

            @Override // o.InterfaceC0209hh
            public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
                Class<? super T> cls = hQVar.setIconTintList;
                if (cls == r1 || cls == r2) {
                    return abstractC0210hi4;
                }
                return null;
            }
        };
        setLayoutDirection = new AnonymousClass24(Locale.class, new AbstractC0210hi<Locale>() { // from class: o.hI.25
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Locale locale) {
                Locale locale2 = locale;
                hRVar.setY(locale2 == null ? null : locale2.toString());
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ Locale setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(hPVar.setIconSize(), "_");
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (nextToken2 == null && nextToken3 == null) {
                    return new Locale(nextToken);
                }
                if (nextToken3 == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, nextToken3);
            }
        });
        final AbstractC0210hi<gV> abstractC0210hi5 = new AbstractC0210hi<gV>() { // from class: o.hI.23
            @Override // o.AbstractC0210hi
            /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
            public gV setX(hP hPVar) {
                switch (AnonymousClass26.setIconTintList[hPVar.setCenterIfNoTextEnabled().ordinal()]) {
                    case 1:
                        return new C0202ha(new C0216ho(hPVar.setIconSize()));
                    case 2:
                        return new C0202ha(Boolean.valueOf(hPVar.setUnboundedRipple()));
                    case 3:
                        return new C0202ha(hPVar.setIconSize());
                    case 4:
                        hPVar.ViewPager$SavedState$1();
                        return gW.setY;
                    case 5:
                        gX gXVar = new gX();
                        hPVar.MenuHostHelper$$ExternalSyntheticLambda0();
                        while (hPVar.setUiOptions()) {
                            gV x = setX(hPVar);
                            if (x == null) {
                                x = gW.setY;
                            }
                            gXVar.setY.add(x);
                        }
                        hPVar.setY();
                        return gXVar;
                    case 6:
                        gZ gZVar = new gZ();
                        hPVar.MenuHostHelper$$ExternalSyntheticLambda1();
                        while (hPVar.setUiOptions()) {
                            String textAlignment = hPVar.setTextAlignment();
                            gV x2 = setX(hPVar);
                            if (x2 == null) {
                                x2 = gW.setY;
                            }
                            gZVar.setIconTintList.put(textAlignment, x2);
                        }
                        hPVar.setX();
                        return gZVar;
                    default:
                        throw new IllegalArgumentException();
                }
            }

            @Override // o.AbstractC0210hi
            /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
            public void setY(hR hRVar, gV gVVar) {
                if (gVVar == null || (gVVar instanceof gW)) {
                    hRVar.setY();
                } else if (gVVar instanceof C0202ha) {
                    C0202ha unboundedRipple = gVVar.setUnboundedRipple();
                    if (unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Number) {
                        hRVar.setIconTintList(unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0());
                    } else if (unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Boolean) {
                        hRVar.MenuHostHelper$$ExternalSyntheticLambda1(unboundedRipple.setIconTintList());
                    } else {
                        hRVar.setY(unboundedRipple.setOnLongClickListener());
                    }
                } else {
                    boolean z = gVVar instanceof gX;
                    if (z) {
                        hRVar.MenuHostHelper$$ExternalSyntheticLambda0();
                        if (z) {
                            Iterator<gV> it = ((gX) gVVar).iterator();
                            while (it.hasNext()) {
                                setY(hRVar, it.next());
                            }
                            hRVar.setIconTintList();
                            return;
                        }
                        StringBuilder sb = new StringBuilder("Not a JSON Array: ");
                        sb.append(gVVar);
                        throw new IllegalStateException(sb.toString());
                    }
                    boolean z2 = gVVar instanceof gZ;
                    if (z2) {
                        hRVar.MenuHostHelper$$ExternalSyntheticLambda1();
                        if (z2) {
                            for (Map.Entry<String, gV> entry : ((gZ) gVVar).setIconTintList.entrySet()) {
                                hRVar.setIconTintList(entry.getKey());
                                setY(hRVar, entry.getValue());
                            }
                            hRVar.setX();
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder("Not a JSON Object: ");
                        sb2.append(gVVar);
                        throw new IllegalStateException(sb2.toString());
                    }
                    StringBuilder sb3 = new StringBuilder("Couldn't write ");
                    sb3.append(gVVar.getClass());
                    throw new IllegalArgumentException(sb3.toString());
                }
            }
        };
        setTextScaleX = abstractC0210hi5;
        setOnNavigationItemSelectedListener = new InterfaceC0209hh() { // from class: o.hI.29
            public final String toString() {
                StringBuilder sb = new StringBuilder("Factory[typeHierarchy=");
                sb.append(r1.getName());
                sb.append(",adapter=");
                sb.append(abstractC0210hi5);
                sb.append("]");
                return sb.toString();
            }

            @Override // o.InterfaceC0209hh
            public final <T2> AbstractC0210hi<T2> setIconTintList(gS gSVar, hQ<T2> hQVar) {
                final Class cls = hQVar.setIconTintList;
                if (r1.isAssignableFrom(cls)) {
                    return (AbstractC0210hi<T2>) new AbstractC0210hi<T1>() { // from class: o.hI.29.2
                        {
                            AnonymousClass29.this = this;
                        }

                        @Override // o.AbstractC0210hi
                        public final void setY(hR hRVar, T1 t1) {
                            abstractC0210hi5.setY(hRVar, t1);
                        }

                        @Override // o.AbstractC0210hi
                        public final T1 setX(hP hPVar) {
                            T1 t1 = (T1) abstractC0210hi5.setX(hPVar);
                            if (t1 == null || cls.isInstance(t1)) {
                                return t1;
                            }
                            StringBuilder sb = new StringBuilder("Expected a ");
                            sb.append(cls.getName());
                            sb.append(" but was ");
                            sb.append(t1.getClass().getName());
                            throw new C0203hb(sb.toString());
                        }
                    };
                }
                return null;
            }
        };
        setTextAlignment = new InterfaceC0209hh() { // from class: o.hI.22
            @Override // o.InterfaceC0209hh
            public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
                Class<? super T> cls = hQVar.setIconTintList;
                if (!Enum.class.isAssignableFrom(cls) || cls == Enum.class) {
                    return null;
                }
                if (!cls.isEnum()) {
                    cls = cls.getSuperclass();
                }
                return new AbstractC0210hi<T>(cls) { // from class: o.hI$MenuHostHelper$$ExternalSyntheticLambda0
                    private final Map<String, T> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap();
                    private final Map<T, String> setX = new HashMap();

                    @Override // o.AbstractC0210hi
                    public final /* synthetic */ void setY(hR hRVar, Object obj) {
                        Enum r3 = (Enum) obj;
                        hRVar.setY(r3 == null ? null : this.setX.get(r3));
                    }

                    {
                        T[] enumConstants;
                        try {
                            for (T t : cls.getEnumConstants()) {
                                String name = t.name();
                                InterfaceC0207hf interfaceC0207hf = (InterfaceC0207hf) cls.getField(name).getAnnotation(InterfaceC0207hf.class);
                                if (interfaceC0207hf != null) {
                                    name = interfaceC0207hf.MenuHostHelper$$ExternalSyntheticLambda0();
                                    for (String str : interfaceC0207hf.setX()) {
                                        this.MenuHostHelper$$ExternalSyntheticLambda0.put(str, t);
                                    }
                                }
                                this.MenuHostHelper$$ExternalSyntheticLambda0.put(name, t);
                                this.setX.put(t, name);
                            }
                        } catch (NoSuchFieldException e) {
                            throw new AssertionError(e);
                        }
                    }

                    @Override // o.AbstractC0210hi
                    public final /* synthetic */ Object setX(hP hPVar) {
                        if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                            hPVar.ViewPager$SavedState$1();
                            return null;
                        }
                        return this.MenuHostHelper$$ExternalSyntheticLambda0.get(hPVar.setIconSize());
                    }
                };
            }
        };
    }

    /* renamed from: o.hI$26 */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass26 {
        static final /* synthetic */ int[] setIconTintList;

        static {
            int[] iArr = new int[hO.values().length];
            setIconTintList = iArr;
            try {
                iArr[hO.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setIconTintList[hO.BOOLEAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setIconTintList[hO.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setIconTintList[hO.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setIconTintList[hO.BEGIN_ARRAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setIconTintList[hO.BEGIN_OBJECT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setIconTintList[hO.END_DOCUMENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                setIconTintList[hO.NAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                setIconTintList[hO.END_OBJECT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                setIconTintList[hO.END_ARRAY.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* renamed from: o.hI$24 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass24 implements InterfaceC0209hh {
        private /* synthetic */ Class setX;
        private /* synthetic */ AbstractC0210hi setY;

        AnonymousClass24(Class cls, AbstractC0210hi abstractC0210hi) {
            this.setX = cls;
            this.setY = abstractC0210hi;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Factory[type=");
            sb.append(this.setX.getName());
            sb.append(",adapter=");
            sb.append(this.setY);
            sb.append("]");
            return sb.toString();
        }

        @Override // o.InterfaceC0209hh
        public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
            if (hQVar.setIconTintList == this.setX) {
                return this.setY;
            }
            return null;
        }
    }

    public static <TT> InterfaceC0209hh MenuHostHelper$$ExternalSyntheticLambda0(Class<TT> cls, AbstractC0210hi<TT> abstractC0210hi) {
        return new AnonymousClass24(cls, abstractC0210hi);
    }

    /* renamed from: o.hI$28 */
    /* loaded from: classes.dex */
    public static final class AnonymousClass28 implements InterfaceC0209hh {
        private /* synthetic */ AbstractC0210hi MenuHostHelper$$ExternalSyntheticLambda0;
        private /* synthetic */ Class MenuHostHelper$$ExternalSyntheticLambda1;
        private /* synthetic */ Class setIconTintList;

        AnonymousClass28(Class cls, Class cls2, AbstractC0210hi abstractC0210hi) {
            this.setIconTintList = cls;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = cls2;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = abstractC0210hi;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Factory[type=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1.getName());
            sb.append("+");
            sb.append(this.setIconTintList.getName());
            sb.append(",adapter=");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            sb.append("]");
            return sb.toString();
        }

        @Override // o.InterfaceC0209hh
        public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
            Class<? super T> cls = hQVar.setIconTintList;
            if (cls == this.setIconTintList || cls == this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            return null;
        }
    }

    public static <TT> InterfaceC0209hh MenuHostHelper$$ExternalSyntheticLambda1(Class<TT> cls, Class<TT> cls2, AbstractC0210hi<? super TT> abstractC0210hi) {
        return new AnonymousClass28(cls, cls2, abstractC0210hi);
    }
}