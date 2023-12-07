package o;

import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import o.AbstractC0239il;
import o.C0243ip;
import o.jg;

/* renamed from: o.fc  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0149fc extends AbstractC0239il<C0149fc, setX> implements InterfaceC0147fa {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final C0149fc DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile iP<C0149fc> PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private static char[] setY;
    public int bitField0_;
    private long clientStartTimeUs_;
    public long durationUs_;
    private boolean isAuto_;
    public static final byte[] $$g = {8, 83, -102, 50};
    public static final int $$h = 101;
    public static final byte[] $$d = {45, -61, 23, 105, 1, -28, 30, -39, -25, -12, 13, -34, -18, -19, 27, -42, -23, -14, 52, -64, 19, 16, -54, -37, -22, -20, 32, -52, -17, -14, 31, -42, -20, -17, -2, -26, 65, -13, -46, -64, -9, 2, -26, -9, 0, -24, 12, -51, -2, -19, -1, -10, -28, -2, -7, 10, -34, -25, -2, -15, -10, 36};
    public static final int $$e = 3;
    public static final byte[] $$a = {108, -22, 67, 3, -1, 28, -14, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
    public static final int $$b = 10;
    public iA<String, Long> counters_ = iA.setX();
    public iA<String, String> customAttributes_ = iA.setX();
    public String name_ = "";
    public C0243ip.setY<C0149fc> subtraces_ = iR.setIconTintList();
    public C0243ip.setY<eX> perfSessions_ = iR.setIconTintList();

    /* renamed from: o.fc$setIconTintList */
    /* loaded from: classes.dex */
    static final class setIconTintList {
        static final C0250iw<String, String> MenuHostHelper$$ExternalSyntheticLambda0 = new C0250iw<>(jg.setIconTintList.STRING, "", jg.setIconTintList.STRING, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 38
            int r7 = 115 - r7
            byte[] r0 = o.C0149fc.$$a
            int r8 = r8 + 4
            int r9 = 40 - r9
            byte[] r1 = new byte[r9]
            int r9 = r9 + (-1)
            r2 = 0
            if (r0 != 0) goto L18
            r7 = r8
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r10
            r10 = r9
            goto L36
        L18:
            r3 = 0
        L19:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            if (r3 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
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
            int r8 = r8 + r9
            int r8 = r8 + (-13)
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0149fc.a(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002e -> B:11:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            byte[] r0 = o.C0149fc.$$d
            int r7 = r7 * 30
            int r7 = r7 + 15
            int r5 = r5 * 4
            int r5 = 115 - r5
            byte[] r1 = new byte[r7]
            r2 = -1
            int r7 = r7 + r2
            if (r0 != 0) goto L19
            r5 = r6
            r2 = r1
            r3 = -1
            r1 = r0
            r0 = r8
            r8 = r7
            goto L37
        L19:
            r4 = r6
            r6 = r5
            r5 = r4
        L1c:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r1[r2] = r3
            int r5 = r5 + 1
            if (r2 != r7) goto L2e
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L2e:
            r3 = r0[r5]
            r4 = r8
            r8 = r7
            r7 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            r0 = r4
        L37:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-13)
            r7 = r8
            r8 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0149fc.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0034). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = o.C0149fc.$$g
            int r6 = 111 - r6
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L1a
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L34
        L1a:
            r3 = 0
        L1b:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r8 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0149fc.d(short, int, short, java.lang.Object[]):void");
    }

    static void setIconTintList() {
        setY = new char[]{41015, 41056, 41070, 41068, 41079, 41067, 41057, 41038, 41033, 41078, 41047, 41031, 41057, 41073, 41076, 41067, 41070, 41055, 41040, 41066, 41070, 41056, 41082, 41210, 41212, 41200, 41213, 41215, 41213, 41220, 41209, 41201, 41194, 41194, 41202, 41215, 41221, 41013, 41061, 41060, 41068, 41066, 41049, 41057, 41073, 41065, 41064, 41064, 41065, 41068, 41045, 41008, 41032, 41079, 41071, 41024, 41038, 41057, 41067, 41079, 41068, 41070, 41056, 41085, 41202, 41204, 41202, 41206, 41198, 41194, 41206, 41202, 41200, 41176, 41190, 41215, 41207, 41205, 41214, 41213, 41204};
    }

    private C0149fc() {
    }

    /* renamed from: o.fc$setX */
    /* loaded from: classes.dex */
    public static final class setX extends il$MenuHostHelper$$ExternalSyntheticLambda1<C0149fc, setX> implements InterfaceC0147fa {
        /* synthetic */ setX(byte b) {
            this();
        }

        private setX() {
            super(C0149fc.DEFAULT_INSTANCE);
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda0(String str) {
            setTextAlignment();
            C0149fc.setIconTintList((C0149fc) this.setIconTintList, str);
            return this;
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda1(long j) {
            setTextAlignment();
            C0149fc.MenuHostHelper$$ExternalSyntheticLambda0((C0149fc) this.setIconTintList, j);
            return this;
        }

        public final setX setX(long j) {
            setTextAlignment();
            C0149fc.setIconTintList((C0149fc) this.setIconTintList, j);
            return this;
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda1(String str, long j) {
            setTextAlignment();
            C0149fc.MenuHostHelper$$ExternalSyntheticLambda1((C0149fc) this.setIconTintList).put(str, Long.valueOf(j));
            return this;
        }

        public final setX setX(Map<String, Long> map) {
            setTextAlignment();
            C0149fc.MenuHostHelper$$ExternalSyntheticLambda1((C0149fc) this.setIconTintList).putAll(map);
            return this;
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda1(C0149fc c0149fc) {
            setTextAlignment();
            C0149fc.setX((C0149fc) this.setIconTintList, c0149fc);
            return this;
        }

        public final setX setIconTintList(Iterable<? extends C0149fc> iterable) {
            setTextAlignment();
            C0149fc.MenuHostHelper$$ExternalSyntheticLambda1((C0149fc) this.setIconTintList, iterable);
            return this;
        }

        public final setX setX(String str, String str2) {
            setTextAlignment();
            C0149fc.setIconTintList((C0149fc) this.setIconTintList).put(str, str2);
            return this;
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda1(Map<String, String> map) {
            setTextAlignment();
            C0149fc.setIconTintList((C0149fc) this.setIconTintList).putAll(map);
            return this;
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda0(eX eXVar) {
            setTextAlignment();
            C0149fc.setX((C0149fc) this.setIconTintList, eXVar);
            return this;
        }

        public final setX MenuHostHelper$$ExternalSyntheticLambda0(Iterable<? extends eX> iterable) {
            setTextAlignment();
            C0149fc.setX((C0149fc) this.setIconTintList, iterable);
            return this;
        }
    }

    /* renamed from: o.fc$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[AbstractC0239il.setIconTintList.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[AbstractC0239il.setIconTintList.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[AbstractC0239il.setIconTintList.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // o.AbstractC0239il
    public final Object setX(AbstractC0239il.setIconTintList seticontintlist) {
        switch (AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda1[seticontintlist.ordinal()]) {
            case 1:
                return new C0149fc();
            case 2:
                return new setX((byte) 0);
            case 3:
                return new iS(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", fc$MenuHostHelper$$ExternalSyntheticLambda0.setX, "subtraces_", C0149fc.class, "customAttributes_", setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0, "perfSessions_", eX.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                iP<C0149fc> iPVar = PARSER;
                if (iPVar == null) {
                    synchronized (C0149fc.class) {
                        iPVar = PARSER;
                        if (iPVar == null) {
                            iPVar = new AbstractC0239il.setY<>(DEFAULT_INSTANCE);
                            PARSER = iPVar;
                        }
                    }
                }
                return iPVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        setIconTintList();
        C0149fc c0149fc = new C0149fc();
        DEFAULT_INSTANCE = c0149fc;
        AbstractC0239il.setY(C0149fc.class, c0149fc);
    }

    public static C0149fc setY() {
        return DEFAULT_INSTANCE;
    }

    static /* synthetic */ void setIconTintList(C0149fc c0149fc, String str) {
        c0149fc.bitField0_ |= 1;
        c0149fc.name_ = str;
    }

    static /* synthetic */ Map MenuHostHelper$$ExternalSyntheticLambda1(C0149fc c0149fc) {
        if (!c0149fc.counters_.MenuHostHelper$$ExternalSyntheticLambda0) {
            iA<String, Long> iAVar = c0149fc.counters_;
            c0149fc.counters_ = iAVar.isEmpty() ? new iA<>() : new iA<>(iAVar);
        }
        return c0149fc.counters_;
    }

    static /* synthetic */ void setX(C0149fc c0149fc, C0149fc c0149fc2) {
        C0243ip.setY<C0149fc> sety = c0149fc.subtraces_;
        if (!sety.setY()) {
            int size = sety.size();
            c0149fc.subtraces_ = sety.setX(size == 0 ? 10 : size << 1);
        }
        c0149fc.subtraces_.add(c0149fc2);
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(C0149fc c0149fc, Iterable iterable) {
        C0243ip.setY<C0149fc> sety = c0149fc.subtraces_;
        if (!sety.setY()) {
            int size = sety.size();
            c0149fc.subtraces_ = sety.setX(size == 0 ? 10 : size << 1);
        }
        hU.MenuHostHelper$$ExternalSyntheticLambda1(iterable, c0149fc.subtraces_);
    }

    static /* synthetic */ Map setIconTintList(C0149fc c0149fc) {
        if (!c0149fc.customAttributes_.MenuHostHelper$$ExternalSyntheticLambda0) {
            iA<String, String> iAVar = c0149fc.customAttributes_;
            c0149fc.customAttributes_ = iAVar.isEmpty() ? new iA<>() : new iA<>(iAVar);
        }
        return c0149fc.customAttributes_;
    }

    static /* synthetic */ void setX(C0149fc c0149fc, eX eXVar) {
        C0243ip.setY<eX> sety = c0149fc.perfSessions_;
        if (!sety.setY()) {
            int size = sety.size();
            c0149fc.perfSessions_ = sety.setX(size == 0 ? 10 : size << 1);
        }
        c0149fc.perfSessions_.add(eXVar);
    }

    static /* synthetic */ void setX(C0149fc c0149fc, Iterable iterable) {
        C0243ip.setY<eX> sety = c0149fc.perfSessions_;
        if (!sety.setY()) {
            int size = sety.size();
            c0149fc.perfSessions_ = sety.setX(size == 0 ? 10 : size << 1);
        }
        hU.MenuHostHelper$$ExternalSyntheticLambda1(iterable, c0149fc.perfSessions_);
    }

    static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(C0149fc c0149fc, long j) {
        c0149fc.bitField0_ |= 4;
        c0149fc.clientStartTimeUs_ = j;
    }

    static /* synthetic */ void setIconTintList(C0149fc c0149fc, long j) {
        c0149fc.bitField0_ |= 8;
        c0149fc.durationUs_ = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x03b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1163
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0149fc.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.String):boolean");
    }

    private static void b(int[] iArr, byte[] bArr, boolean z, Object[] objArr) {
        int i;
        char[] cArr;
        jx jxVar = new jx();
        char c = 0;
        int i2 = iArr[0];
        int i3 = 1;
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = 3;
        int i7 = iArr[3];
        char[] cArr2 = setY;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = new Object[i3];
                    objArr2[c] = Integer.valueOf(cArr2[i8]);
                    Object obj = jC.setTextScaleX.get(-2065108825);
                    if (obj != null) {
                        cArr = cArr2;
                    } else {
                        byte b = (byte) i6;
                        byte b2 = (byte) (b - 3);
                        cArr = cArr2;
                        Object[] objArr3 = new Object[1];
                        d(b, b2, b2, objArr3);
                        obj = ((Class) jC.setY(39 - ((byte) KeyEvent.getModifierMetaStateMask()), (char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + 35089), 6 - TextUtils.getTrimmedLength(""))).getMethod((String) objArr3[0], Integer.TYPE);
                        jC.setTextScaleX.put(-2065108825, obj);
                    }
                    cArr3[i8] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                    i8++;
                    cArr2 = cArr;
                    c = 0;
                    i3 = 1;
                    i6 = 3;
                    j = 0;
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i2, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
            char c2 = 0;
            while (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 < i4) {
                if (bArr[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] == 1) {
                    int i9 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c2)};
                        Object obj2 = jC.setTextScaleX.get(1237805447);
                        if (obj2 == null) {
                            byte b3 = (byte) 2;
                            byte b4 = (byte) (b3 - 2);
                            Object[] objArr5 = new Object[1];
                            d(b3, b4, b4, objArr5);
                            obj2 = ((Class) jC.setY((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 273, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), ((byte) KeyEvent.getModifierMetaStateMask()) + 5)).getMethod((String) objArr5[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(1237805447, obj2);
                        }
                        cArr5[i9] = ((Character) ((Method) obj2).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i10 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0;
                    try {
                        Object[] objArr6 = {Integer.valueOf(cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0]), Integer.valueOf(c2)};
                        Object obj3 = jC.setTextScaleX.get(997913035);
                        if (obj3 == null) {
                            byte b5 = (byte) ($$h & 3);
                            byte b6 = (byte) (b5 - 1);
                            Object[] objArr7 = new Object[1];
                            d(b5, b6, b6, objArr7);
                            obj3 = ((Class) jC.setY(MotionEvent.axisFromString("") + 270, (char) Drawable.resolveOpacity(0, 0), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 4)).getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE);
                            jC.setTextScaleX.put(997913035, obj3);
                        }
                        cArr5[i10] = ((Character) ((Method) obj3).invoke(null, objArr6)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c2 = cArr5[jxVar.MenuHostHelper$$ExternalSyntheticLambda0];
                try {
                    Object[] objArr8 = {jxVar, jxVar};
                    Object obj4 = jC.setTextScaleX.get(1233791110);
                    if (obj4 == null) {
                        byte b7 = (byte) 0;
                        byte b8 = b7;
                        Object[] objArr9 = new Object[1];
                        d(b7, b8, b8, objArr9);
                        obj4 = ((Class) jC.setY(236 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ExpandableListView.getPackedPositionGroup(0L), 5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)))).getMethod((String) objArr9[0], Object.class, Object.class);
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
            cArr4 = cArr5;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i4];
            i = 0;
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i11 = i4 - i7;
            System.arraycopy(cArr6, 0, cArr4, i11, i7);
            System.arraycopy(cArr6, i7, cArr4, 0, i11);
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i4];
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                    break;
                }
                cArr7[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = cArr4[(i4 - jxVar.MenuHostHelper$$ExternalSyntheticLambda0) - 1];
                i = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
            cArr4 = cArr7;
        }
        if (i5 > 0) {
            int i12 = 0;
            while (true) {
                jxVar.MenuHostHelper$$ExternalSyntheticLambda0 = i12;
                if (jxVar.MenuHostHelper$$ExternalSyntheticLambda0 >= i4) {
                    break;
                }
                cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] = (char) (cArr4[jxVar.MenuHostHelper$$ExternalSyntheticLambda0] - iArr[2]);
                i12 = jxVar.MenuHostHelper$$ExternalSyntheticLambda0 + 1;
            }
        }
        objArr[0] = new String(cArr4);
    }
}