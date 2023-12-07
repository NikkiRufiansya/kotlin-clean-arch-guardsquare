package o;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.regex.Pattern;

/* renamed from: o.vt  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0550vt {
    public final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final boolean ViewPager$SavedState$1;
    private final String setCenterIfNoTextEnabled;
    private final boolean setIconSize;
    private final boolean setLayoutAnimation;
    private final long setOnLongClickListener;
    private final boolean setTextAlignment;
    private final String setUiOptions;
    public final String setX;
    public static final setIconTintList setY = new setIconTintList((byte) 0);
    private static final Pattern setNavigationOnClickListener = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MenuHostHelper$$ExternalSyntheticLambda1 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern setIconTintList = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern setUnboundedRipple = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    private C0550vt(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        this.setX = str2;
        this.setOnLongClickListener = j;
        this.setUiOptions = str3;
        this.setCenterIfNoTextEnabled = str4;
        this.setTextAlignment = z;
        this.setIconSize = z2;
        this.ViewPager$SavedState$1 = z3;
        this.setLayoutAnimation = z4;
    }

    public /* synthetic */ C0550vt(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, byte b) {
        this(str, str2, j, str3, str4, z, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0550vt) {
            C0550vt c0550vt = (C0550vt) obj;
            if (pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0550vt.MenuHostHelper$$ExternalSyntheticLambda0, (Object) this.MenuHostHelper$$ExternalSyntheticLambda0) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0550vt.setX, (Object) this.setX) && c0550vt.setOnLongClickListener == this.setOnLongClickListener && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0550vt.setUiOptions, (Object) this.setUiOptions) && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0550vt.setCenterIfNoTextEnabled, (Object) this.setCenterIfNoTextEnabled) && c0550vt.setTextAlignment == this.setTextAlignment && c0550vt.setIconSize == this.setIconSize && c0550vt.ViewPager$SavedState$1 == this.ViewPager$SavedState$1 && c0550vt.setLayoutAnimation == this.setLayoutAnimation) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.MenuHostHelper$$ExternalSyntheticLambda0.hashCode();
        int hashCode2 = this.setX.hashCode();
        long j = this.setOnLongClickListener;
        int i = (int) (j ^ (j >>> 32));
        int hashCode3 = this.setUiOptions.hashCode();
        int hashCode4 = this.setCenterIfNoTextEnabled.hashCode();
        int i2 = this.setTextAlignment ? 1231 : 1237;
        return ((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + i) * 31) + hashCode3) * 31) + hashCode4) * 31) + i2) * 31) + (this.setIconSize ? 1231 : 1237)) * 31) + (this.ViewPager$SavedState$1 ? 1231 : 1237)) * 31) + (this.setLayoutAnimation ? 1231 : 1237);
    }

    /* renamed from: o.vt$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList {
        public static final byte[] $$g = {42, -48, 107, -19};
        public static final int $$h = 59;
        public static final byte[] $$d = {65, 51, -100, -34, -14, 15, -43, 26, 12, -1, -26, 21, 5, 6, -40, 29, 10, 1, -65, 69, -14, 15, -32, 17, 19, -4, -48, 33, 7, -7, 2, -6, 19, -15, -65, 17, 24, 9, 7, -45, 39, 4, 1, -44, 29, 7, 4, -11, 13, -78, 0, 33, 51, -4, -15, 13, -4, -13, 11, -25, 38, -11, 6, -12, -3, 15, -11, -6, -23, 21, 12, -11, 2, -3, -49, -65, 72, -40, -42, 79, -14, 15, -27};
        public static final int $$e = 62;
        public static final byte[] $$a = {25, 60, 112, -12, -1, 28, -30, 39, 25, 12, -13, 34, 18, 19, -27, 42, 23, 14, 37, 22, 20, -32, 52, 17, 14, -31, 42, 20, 17, 2, 26, -65, 13, 46, 64, 9, -2, 26, 9, 0, 24, -12, 51, 2, 19, 1, 10, 28, 2, 7, -10, 34, 25, 2, 15, 10, -35};
        public static final int $$b = 24;
        private static byte[] setLayoutAnimation = {109, -87, 105, -77, 17, -6, 18, 1, -2, -1, -50, 57, 16, 3, 10, -11, 13, 10, -66, 25, 48, 3, 10, -11, 23, 0, -1, 5, 13, 10, -7, 15, 9, -45, 29, 22, -7, -33, 48, -7, 5, -5, 25, -17, -47, 66, -7, 17, -3, -53, 41, 42, -2, 5, -11, 12};
        public static final int setX = 3;
        private static char[] setY = {34161, 33932, 34166, 33920, 33923, 33929, 34124, 33927, 34151, 33945, 33926, 34165, 33933, 34135, 33934, 34167, 33935, 33922, 34144, 34129, 33924, 34150, 33930, 33925};
        private static boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
        private static boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;
        private static int setIconTintList = -1400797934;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0031). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = o.C0550vt.setIconTintList.$$a
                int r8 = r8 * 14
                int r8 = 18 - r8
                int r9 = r9 * 25
                int r9 = r9 + 15
                int r7 = r7 * 38
                int r7 = r7 + 77
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L19
                r3 = r1
                r5 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                goto L31
            L19:
                r3 = 0
            L1a:
                byte r4 = (byte) r7
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r9) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r8]
                r6 = r10
                r10 = r9
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L31:
                int r7 = r7 + r9
                int r7 = r7 + (-13)
                int r8 = r8 + 1
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0550vt.setIconTintList.a(short, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(short r7, byte r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 7
                int r7 = 23 - r7
                int r9 = 40 - r9
                int r8 = r8 + 97
                byte[] r0 = o.C0550vt.setIconTintList.setLayoutAnimation
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r1
                r5 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                goto L33
            L17:
                r3 = 0
            L18:
                int r9 = r9 + 1
                byte r4 = (byte) r8
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r7) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r9]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L33:
                int r9 = r9 + r7
                int r7 = r9 + (-4)
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r5
                r6 = r8
                r8 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0550vt.setIconTintList.c(short, byte, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002e). Please submit an issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(int r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r9 = 40 - r9
                int r7 = r7 * 2
                int r7 = 115 - r7
                int r8 = r8 + 4
                byte[] r0 = o.C0550vt.setIconTintList.$$d
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L16
                r7 = r8
                r3 = r1
                r4 = 0
                r1 = r0
                r0 = r10
                r10 = r9
                goto L2e
            L16:
                r3 = 0
            L17:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L26
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L26:
                r3 = r0[r8]
                r6 = r10
                r10 = r9
                r9 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L2e:
                int r8 = r8 + 1
                int r7 = r7 + r9
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0550vt.setIconTintList.d(int, short, byte, java.lang.Object[]):void");
        }

        private static void e(int i, short s, byte b, Object[] objArr) {
            int i2 = 4 - (i * 4);
            byte[] bArr = $$g;
            int i3 = (s * 3) + 1;
            int i4 = (b * 2) + 66;
            byte[] bArr2 = new byte[i3];
            int i5 = -1;
            int i6 = i3 - 1;
            if (bArr == null) {
                i2++;
                i4 = i6 + (-i4);
                i6 = i6;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i4;
                if (i5 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                }
                int i7 = i4;
                int i8 = i6;
                i2++;
                i4 = i7 + (-bArr[i2]);
                i6 = i8;
            }
        }

        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:170:0x0356, code lost:
            if (r4 <= 253402300799999L) goto L265;
         */
        /* JADX WARN: Removed duplicated region for block: B:176:0x0362  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0364  */
        /* JADX WARN: Removed duplicated region for block: B:188:0x0398 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:192:0x03a4  */
        /* JADX WARN: Removed duplicated region for block: B:221:0x0487 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:231:0x04c4  */
        /* JADX WARN: Removed duplicated region for block: B:235:0x04d4  */
        /* JADX WARN: Type inference failed for: r13v20 */
        /* JADX WARN: Type inference failed for: r13v24 */
        /* JADX WARN: Type inference failed for: r13v6, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v0 */
        /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r5v30 */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private o.C0550vt setX(long r35, o.C0555vx r37, java.lang.String r38) {
            /*
                Method dump skipped, instructions count: 1265
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0550vt.setIconTintList.setX(long, o.vx, java.lang.String):o.vt");
        }

        private static int MenuHostHelper$$ExternalSyntheticLambda1(String str, int i, int i2, boolean z) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && '9' >= charAt) || (('a' <= charAt && 'z' >= charAt) || (('A' <= charAt && 'Z' >= charAt) || charAt == ':'))) == (!z)) {
                    return i;
                }
                i++;
            }
            return i2;
        }

        private static long setX(String str) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 0) {
                    return parseLong;
                }
                return Long.MIN_VALUE;
            } catch (NumberFormatException e) {
                String str2 = str;
                qP qPVar = new qP("-?\\d+");
                pN.setY(str2, "");
                if (qPVar.setX.matcher(str2).matches()) {
                    return !qR.setX(str, "-", false) ? Long.MAX_VALUE : Long.MIN_VALUE;
                }
                throw e;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x03db  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0537  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0562  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x056a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.util.List<o.C0550vt> setIconTintList(o.C0555vx r31, o.C0557vz r32) {
            /*
                Method dump skipped, instructions count: 1429
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.C0550vt.setIconTintList.setIconTintList(o.vx, o.vz):java.util.List");
        }

        private static void b(char[] cArr, int i, byte[] bArr, int[] iArr, Object[] objArr) {
            jt jtVar = new jt();
            char[] cArr2 = setY;
            long j = 0;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i2 = 0;
                while (i2 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                        Object obj = jC.setTextScaleX.get(-2024796271);
                        if (obj == null) {
                            byte b = (byte) 0;
                            byte b2 = b;
                            Object[] objArr3 = new Object[1];
                            e(b, b2, (byte) (b2 + 1), objArr3);
                            obj = ((Class) jC.setY(232 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) - 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4)).getMethod((String) objArr3[0], Integer.TYPE);
                            jC.setTextScaleX.put(-2024796271, obj);
                        }
                        cArr3[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                        i2++;
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
            try {
                Object[] objArr4 = {Integer.valueOf(setIconTintList)};
                Object obj2 = jC.setTextScaleX.get(-192560398);
                if (obj2 == null) {
                    obj2 = ((Class) jC.setY((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 356, (char) (ExpandableListView.getPackedPositionGroup(0L) + 31791), 4 - (ViewConfiguration.getWindowTouchSlop() >> 8))).getMethod("C", Integer.TYPE);
                    jC.setTextScaleX.put(-192560398, obj2);
                }
                int intValue = ((Integer) ((Method) obj2).invoke(null, objArr4)).intValue();
                if (MenuHostHelper$$ExternalSyntheticLambda1) {
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
                                e(b3, b4, b4, objArr6);
                                obj3 = ((Class) jC.setY((Process.myPid() >> 22) + 210, (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 4 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod((String) objArr6[0], Object.class, Object.class);
                                jC.setTextScaleX.put(258277102, obj3);
                            }
                            ((Method) obj3).invoke(null, objArr5);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    objArr[0] = new String(cArr4);
                } else if (MenuHostHelper$$ExternalSyntheticLambda0) {
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
                                e(b5, b6, b6, objArr8);
                                obj4 = ((Class) jC.setY((ViewConfiguration.getScrollBarSize() >> 8) + 210, (char) (ViewConfiguration.getFadingEdgeLength() >> 16), 5 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod((String) objArr8[0], Object.class, Object.class);
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
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append('=');
        sb.append(this.setX);
        if (this.ViewPager$SavedState$1) {
            if (this.setOnLongClickListener == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(C0570wj.setIconTintList(new Date(this.setOnLongClickListener)));
            }
        }
        if (!this.setLayoutAnimation) {
            sb.append("; domain=");
            sb.append(this.setUiOptions);
        }
        sb.append("; path=");
        sb.append(this.setCenterIfNoTextEnabled);
        if (this.setTextAlignment) {
            sb.append("; secure");
        }
        if (this.setIconSize) {
            sb.append("; httponly");
        }
        String obj = sb.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        return obj;
    }
}