package o;

import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import o.AbstractC0210hi;

/* loaded from: classes.dex */
public final class gS {
    private static hQ<?> setY = new hQ<>(Object.class);
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private int ViewPager$SavedState$1;
    private hB setAnimationFromJson;
    private String setCenterIfNoTextEnabled;
    private Map<hQ<?>, AbstractC0210hi<?>> setCheckedIconEnabled;
    private List<InterfaceC0209hh> setChipCornerRadius;
    private C0212hk setIconSize;
    public boolean setIconTintList;
    private List<InterfaceC0209hh> setLayoutAnimation;
    private int setLayoutDirection;
    private EnumC0208hg setMaxEms;
    private C0214hm setNavigationOnClickListener;
    private boolean setOnLongClickListener;
    private boolean setOnNavigationItemSelectedListener;
    private gT setTextAlignment;
    private boolean setTextScaleX;
    private List<InterfaceC0209hh> setUiOptions;
    private ThreadLocal<Map<hQ<?>, setIconTintList<?>>> setUnboundedRipple;
    public boolean setX;
    private Map<Type, gQ<?>> setZ;

    public gS() {
        this(C0212hk.setIconTintList, gR.IDENTITY, Collections.emptyMap(), EnumC0208hg.DEFAULT, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    private gS(C0212hk c0212hk, gT gTVar, Map<Type, gQ<?>> map, EnumC0208hg enumC0208hg, List<InterfaceC0209hh> list, List<InterfaceC0209hh> list2, List<InterfaceC0209hh> list3) {
        final AbstractC0210hi<Number> abstractC0210hi;
        this.setUnboundedRipple = new ThreadLocal<>();
        this.setCheckedIconEnabled = new ConcurrentHashMap();
        this.setIconSize = c0212hk;
        this.setTextAlignment = gTVar;
        this.setZ = map;
        C0214hm c0214hm = new C0214hm(map);
        this.setNavigationOnClickListener = c0214hm;
        this.setIconTintList = false;
        this.setOnLongClickListener = false;
        this.setX = false;
        this.setTextScaleX = true;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = false;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        this.setOnNavigationItemSelectedListener = false;
        this.setMaxEms = enumC0208hg;
        this.setCenterIfNoTextEnabled = null;
        this.ViewPager$SavedState$1 = 2;
        this.setLayoutDirection = 2;
        this.setLayoutAnimation = list;
        this.setUiOptions = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(hI.setOnNavigationItemSelectedListener);
        arrayList.add(hE.setX);
        arrayList.add(c0212hk);
        arrayList.addAll(list3);
        arrayList.add(hI.setHasDecor);
        arrayList.add(hI.setAnimationFromJson);
        arrayList.add(hI.setUnboundedRipple);
        arrayList.add(hI.setNavigationOnClickListener);
        arrayList.add(hI.setMinAndMaxProgress);
        if (enumC0208hg == EnumC0208hg.DEFAULT) {
            abstractC0210hi = hI.setGuidelinePercent;
        } else {
            abstractC0210hi = new AbstractC0210hi<Number>() { // from class: o.gS.1
                @Override // o.AbstractC0210hi
                public final /* synthetic */ void setY(hR hRVar, Number number) {
                    Number number2 = number;
                    if (number2 == null) {
                        hRVar.setY();
                    } else {
                        hRVar.setY(number2.toString());
                    }
                }

                @Override // o.AbstractC0210hi
                public final /* synthetic */ Number setX(hP hPVar) {
                    if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                        hPVar.ViewPager$SavedState$1();
                        return null;
                    }
                    return Long.valueOf(hPVar.setOnLongClickListener());
                }
            };
        }
        arrayList.add(hI.MenuHostHelper$$ExternalSyntheticLambda1(Long.TYPE, Long.class, abstractC0210hi));
        arrayList.add(hI.MenuHostHelper$$ExternalSyntheticLambda1(Double.TYPE, Double.class, new AbstractC0210hi<Number>() { // from class: o.gS.2
            public static final byte[] $$g = {54, -88, 36, -123};
            public static final int $$h = 3;
            public static final byte[] $$d = {18, 119, 36, -59, -13, 16, -42, 27, 13, 0, -25, 22, 6, 7, -39, 30, 11, 2, -64, 63, -40};
            public static final int $$e = 190;
            public static final byte[] $$a = {82, -89, -124, -60, 1, -28, 15, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 35};
            public static final int $$b = 18;
            private static byte[] setLayoutAnimation = {10, -99, -17, -84, -7, -1, 7, 4, -13, 9, 3, -51, 23, 16, -13, -39, 42, -13, -1, -11, 19, -23, -53, 60, -13, 11, -9, -59, 35, 36, -8, -1, -17, 6};
            public static final int setX = 116;
            private static char[] setY = {34017, 34044, 34022, 34032, 34035, 34041, 33980, 34039, 34007, 33801, 34038, 34021, 34045, 33991, 34046, 34023, 34047, 34034, 34000, 33985, 34036, 34006, 34042, 34037};
            private static boolean setIconTintList = true;
            private static boolean setNavigationOnClickListener = true;
            private static int MenuHostHelper$$ExternalSyntheticLambda1 = -1400798078;

            private static void a(short s, short s2, byte b, Object[] objArr) {
                byte[] bArr = $$a;
                int i = 40 - (s * 36);
                int i2 = 115 - (b * 38);
                int i3 = 7 - (s2 * 3);
                byte[] bArr2 = new byte[i];
                int i4 = -1;
                int i5 = i - 1;
                if (bArr == null) {
                    objArr = objArr;
                    bArr = bArr;
                    bArr2 = bArr2;
                    i4 = -1;
                    i2 = (i2 + (-i5)) - 13;
                    i5 = i5;
                    i3++;
                }
                while (true) {
                    int i6 = i4 + 1;
                    bArr2[i6] = (byte) i2;
                    if (i6 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    byte b2 = bArr[i3];
                    int i7 = i3;
                    int i8 = i5;
                    objArr = objArr;
                    bArr = bArr;
                    bArr2 = bArr2;
                    i4 = i6;
                    i2 = (i2 + (-b2)) - 13;
                    i5 = i8;
                    i3 = i7 + 1;
                }
            }

            private static void c(int i, byte b, int i2, Object[] objArr) {
                int i3 = i2 + 4;
                int i4 = i + 105;
                int i5 = 16 - (b * 3);
                byte[] bArr = setLayoutAnimation;
                byte[] bArr2 = new byte[i5];
                int i6 = -1;
                int i7 = i5 - 1;
                if (bArr == null) {
                    i4 = i4 + i3 + 2;
                    i3 = i3;
                    objArr = objArr;
                    bArr = bArr;
                    bArr2 = bArr2;
                    i6 = -1;
                }
                while (true) {
                    int i8 = i6 + 1;
                    bArr2[i8] = (byte) i4;
                    if (i8 == i7) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i9 = i3 + 1;
                    Object[] objArr2 = objArr;
                    byte[] bArr3 = bArr2;
                    byte[] bArr4 = bArr;
                    i4 = i4 + bArr[i9] + 2;
                    i3 = i9;
                    objArr = objArr2;
                    bArr = bArr4;
                    bArr2 = bArr3;
                    i6 = i8;
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0037). Please submit an issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void d(short r7, byte r8, short r9, java.lang.Object[] r10) {
                /*
                    byte[] r0 = o.gS.AnonymousClass2.$$d
                    int r9 = r9 + 4
                    int r8 = r8 * 11
                    int r8 = 15 - r8
                    int r7 = r7 * 4
                    int r7 = r7 + 111
                    byte[] r1 = new byte[r8]
                    r2 = 0
                    if (r0 != 0) goto L19
                    r7 = r9
                    r3 = r1
                    r4 = 0
                    r9 = r8
                    r1 = r0
                    r0 = r10
                    r10 = r7
                    goto L37
                L19:
                    r3 = 0
                    r6 = r9
                    r9 = r7
                    r7 = r6
                L1d:
                    int r4 = r3 + 1
                    byte r5 = (byte) r9
                    r1[r3] = r5
                    int r7 = r7 + 1
                    if (r4 != r8) goto L2e
                    java.lang.String r7 = new java.lang.String
                    r7.<init>(r1, r2)
                    r10[r2] = r7
                    return
                L2e:
                    r3 = r0[r7]
                    r6 = r9
                    r9 = r8
                    r8 = r3
                    r3 = r1
                    r1 = r0
                    r0 = r10
                    r10 = r6
                L37:
                    int r10 = r10 + r8
                    int r8 = r10 + (-1)
                    r10 = r0
                    r0 = r1
                    r1 = r3
                    r3 = r4
                    r6 = r9
                    r9 = r8
                    r8 = r6
                    goto L1d
                */
                throw new UnsupportedOperationException("Method not decompiled: o.gS.AnonymousClass2.d(short, byte, short, java.lang.Object[]):void");
            }

            private static void e(byte b, int i, short s, Object[] objArr) {
                int i2 = 1 - (i * 2);
                int i3 = (b * 4) + 4;
                int i4 = 68 - (s * 2);
                byte[] bArr = $$g;
                byte[] bArr2 = new byte[i2];
                int i5 = i2 - 1;
                int i6 = 0;
                if (bArr == null) {
                    i3++;
                    i4 = i5 + (-i3);
                    i5 = i5;
                }
                while (true) {
                    bArr2[i6] = (byte) i4;
                    if (i6 == i5) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    i6++;
                    byte b2 = bArr[i3];
                    i3++;
                    i4 += -b2;
                    i5 = i5;
                }
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Number number) {
                Number number2 = number;
                if (number2 == null) {
                    hRVar.setY();
                    return;
                }
                gS.MenuHostHelper$$ExternalSyntheticLambda1(number2.doubleValue());
                hRVar.setIconTintList(number2);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x03b4  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x043c  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x0440  */
            @Override // o.AbstractC0210hi
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final /* synthetic */ java.lang.Number setX(o.hP r29) {
                /*
                    Method dump skipped, instructions count: 1135
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.gS.AnonymousClass2.setX(o.hP):java.lang.Object");
            }

            private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) {
                jt jtVar = new jt();
                char[] cArr2 = setY;
                if (cArr2 != null) {
                    int length = cArr2.length;
                    char[] cArr3 = new char[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                            Object obj = jC.setTextScaleX.get(-2024796271);
                            if (obj == null) {
                                byte b = (byte) ($$h - 3);
                                byte b2 = b;
                                Object[] objArr3 = new Object[1];
                                e(b, b2, b2, objArr3);
                                obj = ((Class) jC.setY(View.MeasureSpec.getMode(0) + 232, (char) ((Process.getThreadPriority(0) + 20) >> 6), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4)).getMethod((String) objArr3[0], Integer.TYPE);
                                jC.setTextScaleX.put(-2024796271, obj);
                            }
                            cArr3[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
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
                    Object[] objArr4 = {Integer.valueOf(MenuHostHelper$$ExternalSyntheticLambda1)};
                    Object obj2 = jC.setTextScaleX.get(-192560398);
                    if (obj2 == null) {
                        obj2 = ((Class) jC.setY(405 - AndroidCharacter.getMirror('0'), (char) (TextUtils.indexOf("", "") + 31791), KeyEvent.keyCodeFromString("") + 4)).getMethod("C", Integer.TYPE);
                        jC.setTextScaleX.put(-192560398, obj2);
                    }
                    int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                    long j = 0;
                    if (setNavigationOnClickListener) {
                        jtVar.setIconTintList = bArr.length;
                        char[] cArr4 = new char[jtVar.setIconTintList];
                        jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                        while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                            cArr4[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[bArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] + i] - intValue);
                            try {
                                Object[] objArr5 = {jtVar, jtVar};
                                Object obj3 = jC.setTextScaleX.get(258277102);
                                if (obj3 == null) {
                                    byte b3 = (byte) ($$h - 3);
                                    byte b4 = b3;
                                    Object[] objArr6 = new Object[1];
                                    e(b3, b4, (byte) (b4 + 1), objArr6);
                                    obj3 = ((Class) jC.setY(ImageFormat.getBitsPerPixel(0) + 211, (char) ((SystemClock.elapsedRealtimeNanos() > j ? 1 : (SystemClock.elapsedRealtimeNanos() == j ? 0 : -1)) - 1), MotionEvent.axisFromString("") + 5)).getMethod((String) objArr6[0], Object.class, Object.class);
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
                    } else if (setIconTintList) {
                        jtVar.setIconTintList = cArr.length;
                        char[] cArr5 = new char[jtVar.setIconTintList];
                        jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                        while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                            cArr5[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[cArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                            try {
                                Object[] objArr7 = {jtVar, jtVar};
                                Object obj4 = jC.setTextScaleX.get(258277102);
                                if (obj4 == null) {
                                    byte b5 = (byte) ($$h - 3);
                                    byte b6 = b5;
                                    Object[] objArr8 = new Object[1];
                                    e(b5, b6, (byte) (b6 + 1), objArr8);
                                    obj4 = ((Class) jC.setY(KeyEvent.keyCodeFromString("") + 210, (char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 4)).getMethod((String) objArr8[0], Object.class, Object.class);
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
                        jtVar.setIconTintList = iArr.length;
                        char[] cArr6 = new char[jtVar.setIconTintList];
                        jtVar.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
                        while (jtVar.MenuHostHelper$$ExternalSyntheticLambda1 < jtVar.setIconTintList) {
                            cArr6[jtVar.MenuHostHelper$$ExternalSyntheticLambda1] = (char) (cArr2[iArr[(jtVar.setIconTintList - 1) - jtVar.MenuHostHelper$$ExternalSyntheticLambda1] - i] - intValue);
                            jtVar.MenuHostHelper$$ExternalSyntheticLambda1++;
                        }
                        objArr[0] = new String(cArr6);
                    }
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
        }));
        arrayList.add(hI.MenuHostHelper$$ExternalSyntheticLambda1(Float.TYPE, Float.class, new AbstractC0210hi<Number>() { // from class: o.gS.5
            @Override // o.AbstractC0210hi
            public final /* synthetic */ void setY(hR hRVar, Number number) {
                Number number2 = number;
                if (number2 == null) {
                    hRVar.setY();
                    return;
                }
                gS.MenuHostHelper$$ExternalSyntheticLambda1(number2.floatValue());
                hRVar.setIconTintList(number2);
            }

            @Override // o.AbstractC0210hi
            public final /* synthetic */ Number setX(hP hPVar) {
                if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                    hPVar.ViewPager$SavedState$1();
                    return null;
                }
                return Float.valueOf((float) hPVar.setNavigationOnClickListener());
            }
        }));
        arrayList.add(hI.setTextAppearanceResource);
        arrayList.add(hI.setX);
        arrayList.add(hI.MenuHostHelper$$ExternalSyntheticLambda1);
        arrayList.add(hI.MenuHostHelper$$ExternalSyntheticLambda0(AtomicLong.class, new AbstractC0210hi.AnonymousClass2()));
        arrayList.add(hI.MenuHostHelper$$ExternalSyntheticLambda0(AtomicLongArray.class, new AbstractC0210hi.AnonymousClass2()));
        arrayList.add(hI.setY);
        arrayList.add(hI.setChipCornerRadius);
        arrayList.add(hI.setIconified);
        arrayList.add(hI.setCheckedIconEnabled);
        arrayList.add(hI.MenuHostHelper$$ExternalSyntheticLambda0(BigDecimal.class, hI.MenuHostHelper$$ExternalSyntheticLambda0));
        arrayList.add(hI.MenuHostHelper$$ExternalSyntheticLambda0(BigInteger.class, hI.setIconTintList));
        arrayList.add(hI.setChipIconTintResource);
        arrayList.add(hI.ExtendableSavedState$1);
        arrayList.add(hI.setContentScrimResource);
        arrayList.add(hI.setIconSize);
        arrayList.add(hI.setLayoutDirection);
        arrayList.add(hI.setZ);
        arrayList.add(hI.setUiOptions);
        arrayList.add(hC.MenuHostHelper$$ExternalSyntheticLambda1);
        arrayList.add(hI.setOnLongClickListener);
        arrayList.add(hF.setX);
        arrayList.add(hG.MenuHostHelper$$ExternalSyntheticLambda1);
        arrayList.add(hI.SearchView$SavedState$1);
        arrayList.add(C0225hx.setY);
        arrayList.add(hI.ViewPager$SavedState$1);
        arrayList.add(new C0224hw(c0214hm));
        arrayList.add(new hA(c0214hm, false));
        hB hBVar = new hB(c0214hm);
        this.setAnimationFromJson = hBVar;
        arrayList.add(hBVar);
        arrayList.add(hI.setTextAlignment);
        arrayList.add(new hD(c0214hm, gTVar, c0212hk, hBVar));
        this.setChipCornerRadius = Collections.unmodifiableList(arrayList);
    }

    static void MenuHostHelper$$ExternalSyntheticLambda1(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d)) {
            StringBuilder sb = new StringBuilder();
            sb.append(d);
            sb.append(" is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final <T> AbstractC0210hi<T> MenuHostHelper$$ExternalSyntheticLambda1(hQ<T> hQVar) {
        boolean z;
        AbstractC0210hi<T> abstractC0210hi = (AbstractC0210hi<T>) this.setCheckedIconEnabled.get(hQVar);
        if (abstractC0210hi != null) {
            return abstractC0210hi;
        }
        Map<hQ<?>, setIconTintList<?>> map = this.setUnboundedRipple.get();
        if (map == null) {
            map = new HashMap<>();
            this.setUnboundedRipple.set(map);
            z = true;
        } else {
            z = false;
        }
        setIconTintList<?> seticontintlist = map.get(hQVar);
        if (seticontintlist != null) {
            return seticontintlist;
        }
        try {
            setIconTintList<?> seticontintlist2 = new setIconTintList<>();
            map.put(hQVar, seticontintlist2);
            for (InterfaceC0209hh interfaceC0209hh : this.setChipCornerRadius) {
                AbstractC0210hi<T> iconTintList = interfaceC0209hh.setIconTintList(this, hQVar);
                if (iconTintList != null) {
                    if (seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                        throw new AssertionError();
                    }
                    seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1 = iconTintList;
                    this.setCheckedIconEnabled.put(hQVar, iconTintList);
                    return iconTintList;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("GSON (2.8.5) cannot handle ");
            sb.append(hQVar);
            throw new IllegalArgumentException(sb.toString());
        } finally {
            map.remove(hQVar);
            if (z) {
                this.setUnboundedRipple.remove();
            }
        }
    }

    public final <T> AbstractC0210hi<T> setY(InterfaceC0209hh interfaceC0209hh, hQ<T> hQVar) {
        if (!this.setChipCornerRadius.contains(interfaceC0209hh)) {
            interfaceC0209hh = this.setAnimationFromJson;
        }
        boolean z = false;
        for (InterfaceC0209hh interfaceC0209hh2 : this.setChipCornerRadius) {
            if (z) {
                AbstractC0210hi<T> iconTintList = interfaceC0209hh2.setIconTintList(this, hQVar);
                if (iconTintList != null) {
                    return iconTintList;
                }
            } else if (interfaceC0209hh2 == interfaceC0209hh) {
                z = true;
            }
        }
        StringBuilder sb = new StringBuilder("GSON cannot serialize ");
        sb.append(hQVar);
        throw new IllegalArgumentException(sb.toString());
    }

    public final String setX(Object obj, Type type) {
        StringWriter stringWriter = new StringWriter();
        try {
            hR hRVar = new hR(stringWriter);
            hRVar.setLayoutAnimation = false;
            AbstractC0210hi MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(new hQ(type));
            boolean z = hRVar.setX;
            hRVar.setX = true;
            boolean z2 = hRVar.setY;
            hRVar.setY = this.setTextScaleX;
            boolean z3 = hRVar.setLayoutAnimation;
            hRVar.setLayoutAnimation = false;
            try {
                MenuHostHelper$$ExternalSyntheticLambda1.setY(hRVar, obj);
                hRVar.setX = z;
                hRVar.setY = z2;
                hRVar.setLayoutAnimation = z3;
                return stringWriter.toString();
            } catch (IOException e) {
                throw new gY(e);
            } catch (AssertionError e2) {
                StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
                sb.append(e2.getMessage());
                throw new AssertionError(sb.toString(), e2);
            }
        } catch (IOException e3) {
            throw new gY(e3);
        }
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda0(gV gVVar) {
        StringWriter stringWriter = new StringWriter();
        try {
            hR hRVar = new hR(stringWriter);
            hRVar.setLayoutAnimation = false;
            boolean z = hRVar.setX;
            hRVar.setX = true;
            boolean z2 = hRVar.setY;
            hRVar.setY = this.setTextScaleX;
            boolean z3 = hRVar.setLayoutAnimation;
            hRVar.setLayoutAnimation = false;
            try {
                hI.setTextScaleX.setY(hRVar, gVVar);
                hRVar.setX = z;
                hRVar.setY = z2;
                hRVar.setLayoutAnimation = z3;
                return stringWriter.toString();
            } catch (IOException e) {
                throw new gY(e);
            } catch (AssertionError e2) {
                StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
                sb.append(e2.getMessage());
                throw new AssertionError(sb.toString(), e2);
            }
        } catch (IOException e3) {
            throw new gY(e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList<T> extends AbstractC0210hi<T> {
        AbstractC0210hi<T> MenuHostHelper$$ExternalSyntheticLambda1;

        setIconTintList() {
        }

        @Override // o.AbstractC0210hi
        public final T setX(hP hPVar) {
            AbstractC0210hi<T> abstractC0210hi = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (abstractC0210hi == null) {
                throw new IllegalStateException();
            }
            return abstractC0210hi.setX(hPVar);
        }

        @Override // o.AbstractC0210hi
        public final void setY(hR hRVar, T t) {
            AbstractC0210hi<T> abstractC0210hi = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (abstractC0210hi == null) {
                throw new IllegalStateException();
            }
            abstractC0210hi.setY(hRVar, t);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{serializeNulls:");
        sb.append(false);
        sb.append(",factories:");
        sb.append(this.setChipCornerRadius);
        sb.append(",instanceCreators:");
        sb.append(this.setNavigationOnClickListener);
        sb.append("}");
        return sb.toString();
    }

    private <T> T setIconTintList(hP hPVar, Type type) {
        boolean z = hPVar.MenuHostHelper$$ExternalSyntheticLambda0;
        boolean z2 = true;
        hPVar.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        try {
            try {
                try {
                    hPVar.setCenterIfNoTextEnabled();
                } catch (IOException e) {
                    throw new C0203hb(e);
                } catch (AssertionError e2) {
                    StringBuilder sb = new StringBuilder("AssertionError (GSON 2.8.5): ");
                    sb.append(e2.getMessage());
                    throw new AssertionError(sb.toString(), e2);
                } catch (IllegalStateException e3) {
                    throw new C0203hb(e3);
                }
            } catch (EOFException e4) {
                e = e4;
            }
            try {
                return MenuHostHelper$$ExternalSyntheticLambda1(new hQ<>(type)).setX(hPVar);
            } catch (EOFException e5) {
                e = e5;
                z2 = false;
                if (!z2) {
                    throw new C0203hb(e);
                }
                hPVar.MenuHostHelper$$ExternalSyntheticLambda0 = z;
                return null;
            }
        } finally {
            hPVar.MenuHostHelper$$ExternalSyntheticLambda0 = z;
        }
    }

    public final <T> T setY(Reader reader, Type type) {
        hP hPVar = new hP(reader);
        hPVar.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        T t = (T) setIconTintList(hPVar, type);
        if (t != null) {
            try {
                if (hPVar.setCenterIfNoTextEnabled() != hO.END_DOCUMENT) {
                    throw new gY("JSON document was not fully consumed.");
                }
            } catch (hW e) {
                throw new C0203hb(e);
            } catch (IOException e2) {
                throw new gY(e2);
            }
        }
        return t;
    }

    public final <T> T setIconTintList(String str, Class<T> cls) {
        return (T) C0223hv.setIconTintList(cls).cast(str == null ? null : setY(new StringReader(str), cls));
    }
}