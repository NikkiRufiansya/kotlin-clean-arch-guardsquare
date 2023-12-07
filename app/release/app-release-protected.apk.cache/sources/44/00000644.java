package o;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes.dex */
public class jC {
    public static final byte[] $$a;
    public static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static long ExtendableSavedState$1;
    private static Object setCheckedIconEnabled;
    private static int setChipIconTintResource;
    private static byte[] setGuidelinePercent;
    private static Object setLayoutDirection;
    private static byte[] setMinAndMaxProgress;
    private static final Map<String, Object> setTextAppearanceResource;
    public static final Map<Integer, Object> setTextScaleX;

    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a0 -> B:21:0x0062). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r8, short r9, short r10) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jC.$$c(int, short, short):java.lang.String");
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        Object[] objArr;
        byte b;
        byte b2;
        byte b3;
        String $$c;
        Class<?>[] clsArr;
        try {
            int i2 = $11;
            int i3 = (i2 ^ 23) + ((i2 & 23) << 1);
            try {
                $10 = i3 % 128;
                int i4 = i3 % 2;
                Object obj = setCheckedIconEnabled;
                try {
                    int i5 = $10;
                    int i6 = (i5 ^ 33) + ((i5 & 33) << 1);
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    int i8 = $10 + 75;
                    $11 = i8 % 128;
                    try {
                        if ((i8 % 2 == 0 ? '\\' : 'B') != '\\') {
                            objArr = new Object[]{Integer.valueOf(i)};
                        } else {
                            objArr = new Object[1];
                            objArr[1] = Integer.valueOf(i);
                        }
                        byte[] bArr = $$a;
                        try {
                            int i9 = $11;
                            int i10 = ((i9 | 75) << 1) - (i9 ^ 75);
                            try {
                                $10 = i10 % 128;
                                if (i10 % 2 != 0) {
                                    b = bArr[104];
                                    b2 = $$a[114];
                                    b3 = 30026;
                                } else {
                                    b = bArr[23];
                                    b2 = $$a[53];
                                    b3 = 579;
                                }
                                Class<?> cls = Class.forName($$c(b, b2, (short) ((b3 & b2) | (b2 ^ b3))), true, (ClassLoader) setLayoutDirection);
                                try {
                                    int i11 = ($10 + 90) - 1;
                                    try {
                                        $11 = i11 % 128;
                                        int i12 = i11 % 2;
                                        byte b4 = $$a[16];
                                        byte b5 = $$a[53];
                                        byte[] bArr2 = $$a;
                                        int i13 = $10 + 99;
                                        $11 = i13 % 128;
                                        if (i13 % 2 == 0) {
                                            $$c = $$c(b4, b5, bArr2[24548]);
                                            clsArr = new Class[0];
                                        } else {
                                            $$c = $$c(b4, b5, bArr2[383]);
                                            clsArr = new Class[1];
                                        }
                                        clsArr[0] = Integer.TYPE;
                                        int intValue = ((Integer) cls.getMethod($$c, clsArr).invoke(obj, objArr)).intValue();
                                        try {
                                            int i14 = $11 + 51;
                                            $10 = i14 % 128;
                                            if (!(i14 % 2 != 0)) {
                                                return intValue;
                                            }
                                            Object obj2 = null;
                                            obj2.hashCode();
                                            return intValue;
                                        } catch (IndexOutOfBoundsException e) {
                                            throw e;
                                        }
                                    } catch (IllegalStateException e2) {
                                        throw e2;
                                    }
                                } catch (IllegalArgumentException e3) {
                                    throw e3;
                                }
                            } catch (UnsupportedOperationException e4) {
                                throw e4;
                            }
                        } catch (NumberFormatException e5) {
                            throw e5;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } catch (RuntimeException e6) {
                    throw e6;
                }
            } catch (IndexOutOfBoundsException e7) {
                throw e7;
            }
        } catch (NullPointerException e8) {
            throw e8;
        }
    }

    public static int setIconTintList(Object obj) {
        Object invoke;
        int i = ($11 + 18) - 1;
        $10 = i % 128;
        int i2 = i % 2;
        Object obj2 = setCheckedIconEnabled;
        int i3 = $10 + 121;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        try {
            Object[] objArr = {obj};
            byte b = $$a[23];
            byte b2 = $$a[53];
            int i5 = (b2 ^ 579) | (b2 & 579);
            int i6 = $10;
            int i7 = (i6 ^ 63) + ((i6 & 63) << 1);
            $11 = i7 % 128;
            short s = (short) i5;
            Class<?> cls = (i7 % 2 == 0 ? '\\' : '5') != '5' ? Class.forName($$c(b, b2, s), false, (ClassLoader) setLayoutDirection) : Class.forName($$c(b, b2, s), true, (ClassLoader) setLayoutDirection);
            byte b3 = $$a[16];
            byte b4 = $$a[53];
            int i8 = ($10 + 120) - 1;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            String $$c = $$c(b3, b4, $$a[3]);
            Class<?>[] clsArr = new Class[1];
            try {
                int i10 = $11;
                int i11 = (i10 ^ 45) + ((i10 & 45) << 1);
                $10 = i11 % 128;
                if (i11 % 2 == 0) {
                    clsArr[0] = Object.class;
                    invoke = cls.getMethod($$c, clsArr).invoke(obj2, objArr);
                } else {
                    clsArr[0] = Object.class;
                    invoke = cls.getMethod($$c, clsArr).invoke(obj2, objArr);
                }
                int intValue = ((Integer) invoke).intValue();
                try {
                    int i12 = ($11 + 72) - 1;
                    try {
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        return intValue;
                    } catch (IllegalStateException e) {
                        throw e;
                    }
                } catch (IndexOutOfBoundsException e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                throw e3;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object setY(int i, char c, int i2) {
        Object obj = setCheckedIconEnabled;
        try {
            int i3 = $11 + 57;
            try {
                $10 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    int i5 = $11;
                    int i6 = (i5 ^ 51) + ((i5 & 51) << 1);
                    try {
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        try {
                            Object[] objArr = new Object[3];
                            objArr[2] = Integer.valueOf(i2);
                            Character valueOf = Character.valueOf(c);
                            int i8 = ($10 + 120) - 1;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            objArr[1] = valueOf;
                            objArr[0] = Integer.valueOf(i);
                            byte b = $$a[23];
                            byte b2 = $$a[53];
                            short s = (short) ((b2 ^ 579) | (b2 & 579));
                            try {
                                int i10 = $10 + 39;
                                $11 = i10 % 128;
                                Class<?> cls = !(i10 % 2 != 0) ? Class.forName($$c(b, b2, s), false, (ClassLoader) setLayoutDirection) : Class.forName($$c(b, b2, s), true, (ClassLoader) setLayoutDirection);
                                byte b3 = $$a[84];
                                byte b4 = $$a[7];
                                byte[] bArr = $$a;
                                int i11 = $11 + 115;
                                $10 = i11 % 128;
                                int i12 = i11 % 2;
                                String $$c = $$c(b3, b4, (short) (-bArr[453]));
                                Class<?>[] clsArr = new Class[3];
                                Class<?> cls2 = Integer.TYPE;
                                try {
                                    int i13 = $10;
                                    int i14 = ((i13 | 59) << 1) - (i13 ^ 59);
                                    try {
                                        $11 = i14 % 128;
                                        int i15 = i14 % 2;
                                        clsArr[0] = cls2;
                                        clsArr[1] = Character.TYPE;
                                        clsArr[2] = Integer.TYPE;
                                        Method method = cls.getMethod($$c, clsArr);
                                        int i16 = ($11 + 20) - 1;
                                        $10 = i16 % 128;
                                        int i17 = i16 % 2;
                                        return method.invoke(obj, objArr);
                                    } catch (IllegalStateException e) {
                                        throw e;
                                    }
                                } catch (IllegalArgumentException e2) {
                                    throw e2;
                                }
                            } catch (IndexOutOfBoundsException e3) {
                                throw e3;
                            }
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } catch (NullPointerException e4) {
                        throw e4;
                    }
                } catch (Exception e5) {
                    throw e5;
                }
            } catch (NumberFormatException e6) {
                throw e6;
            }
        } catch (IllegalStateException e7) {
            throw e7;
        }
    }

    private jC() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(38:(2:891|892)|12|(40:14|(1:16)(1:889)|17|18|(1:20)(1:887)|21|(0)(0)|(0)|25|(0)(0)|28|(0)|30|31|(0)|(0)|52|(0)|60|61|62|63|64|(0)(0)|(0)(0)|69|(0)(0)|72|(0)(0)|(0)(0)|77|78|(0)(0)|81|(0)(0)|84|85|(0)|863|864)|890|(0)(0)|(0)|25|(0)(0)|28|(0)|30|31|(0)|(0)|52|(0)|60|61|62|63|64|(0)(0)|(0)(0)|69|(0)(0)|72|(0)(0)|(0)(0)|77|78|(0)(0)|81|(0)(0)|84|85|(0)|863|864) */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x03ef, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0417, code lost:
        if ((!r15) != false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0426, code lost:
        if ((r11[r13] ? 16 : 'C') != 16) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00a4, code lost:
        if ((r6 == null) != false) goto L891;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0428, code lost:
        r33 = r2;
        r36 = r3;
        r40 = r6;
        r41 = r7;
        r42 = r8;
        r48 = r9;
        r18 = r10;
        r43 = r11;
        r45 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0447, code lost:
        r27 = r6[r13];
        r14 = r2[r13];
        r28 = r8[r13];
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x044d, code lost:
        if (r27 == false) goto L846;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x044f, code lost:
        r4 = 'C';
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0454, code lost:
        r4 = 26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x045a, code lost:
        if (r4 == 'C') goto L806;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x045c, code lost:
        r33 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0460, code lost:
        if (r14 == null) goto L845;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0462, code lost:
        r4 = '<';
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0465, code lost:
        r4 = '8';
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0469, code lost:
        if (r4 == '<') goto L822;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x046b, code lost:
        r33 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x046e, code lost:
        r4 = o.jC.$10 + 43;
        o.jC.$11 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0478, code lost:
        if ((r4 % 2) != 0) goto L844;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x047a, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x047c, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x047d, code lost:
        if (r4 == false) goto L826;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0482, code lost:
        r4 = 77 / r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0483, code lost:
        r4 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10));
        r15 = o.jC.$$a[72];
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x04a7, code lost:
        r5 = o.jC.$$a[88];
        r33 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x04c3, code lost:
        if (((java.lang.Boolean) r4.getMethod($$c(r15, r5, (short) ((r5 & 716) | (r5 ^ 716))), null).invoke(r14, null)).booleanValue() != false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x04c5, code lost:
        r2 = new java.lang.StringBuilder();
        r5 = o.jC.$$a[53];
        r2.append($$c(o.jC.$$a[141(0x8d, float:1.98E-43)], (byte) ((r5 ^ (-1)) + ((r5 & (-1)) << 1)), (short) 465));
        r2.append(r14);
        r2.append($$c((byte) (o.jC.$$b + 1), (byte) (-o.jC.$$a[355(0x163, float:4.97E-43)]), (short) 366));
        r2 = r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0507, code lost:
        r4 = o.jC.$10;
        r5 = (r4 ^ 5) + ((r4 & 5) << 1);
        o.jC.$11 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0516, code lost:
        r4 = new java.lang.Object[]{r2};
        r2 = $$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[134(0x86, float:1.88E-43)], (short) 755);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0530, code lost:
        r5 = (o.jC.$11 + 76) - 1;
        o.jC.$10 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0551, code lost:
        throw ((java.lang.Throwable) java.lang.Class.forName(r2).getDeclaredConstructor(java.lang.String.class).newInstance(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x055c, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x055d, code lost:
        r2 = r0;
        r36 = r3;
        r40 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0562, code lost:
        r41 = r7;
        r42 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0568, code lost:
        if (r27 == false) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x056a, code lost:
        r4 = new java.util.Random();
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x056f, code lost:
        r15 = o.jC.$$a[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x05b8, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x05be, code lost:
        r4.setSeed(((java.lang.Long) java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[33], (short) ((r15 & 1) + (r15 | 1)))).getMethod($$c(o.jC.$$a[72], o.jC.$$a[39], (short) 842), null).invoke(null, null)).longValue() ^ 3355321);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x05c1, code lost:
        r2 = null;
        r3 = null;
        r12 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x05c5, code lost:
        if (r2 != null) goto L798;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x05c7, code lost:
        if (r3 != null) goto L797;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x05c9, code lost:
        r37 = r2;
        r36 = r5;
        r2 = 22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x05d2, code lost:
        r37 = r2;
        r36 = r5;
        r2 = ']';
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x05dc, code lost:
        if (r2 == 22) goto L796;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x05de, code lost:
        if (r12 != null) goto L793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x05e0, code lost:
        r2 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x05e2, code lost:
        if (r15 != null) goto L795;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x05e4, code lost:
        r2 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x05e6, code lost:
        r2 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x05e8, code lost:
        r2 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x05eb, code lost:
        r40 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x05f7, code lost:
        r5 = new java.lang.StringBuilder((r2 ^ 1) + ((r2 & 1) << 1));
        r5.append('.');
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x05ff, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0600, code lost:
        if (r6 >= r2) goto L710;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x0602, code lost:
        r38 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x0604, code lost:
        if (r28 == false) goto L708;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0608, code lost:
        r2 = r4.nextInt(26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0610, code lost:
        if (r4.nextBoolean() == false) goto L703;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x0612, code lost:
        r39 = (r2 & 65) + (r2 | 65);
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0619, code lost:
        r39 = r2 + 96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x061b, code lost:
        r5.append((char) r39);
        r39 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0624, code lost:
        r2 = r4.nextInt(12);
        r39 = r4;
        r5.append((char) ((r2 ^ 8192) + ((r2 & 8192) << 1)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0639, code lost:
        r6 = r6 + 1;
        r2 = r38;
        r4 = r39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0640, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0641, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0644, code lost:
        r39 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0646, code lost:
        r2 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x064a, code lost:
        if (r3 != null) goto L719;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0696, code lost:
        r3 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10)).getDeclaredConstructor(java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10)), java.lang.String.class).newInstance(r14, r2);
        r41 = r7;
        r42 = r8;
        r2 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x06a9, code lost:
        if (r12 != null) goto L732;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x06ac, code lost:
        r5 = new java.lang.Object[]{r14, r2};
        r2 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10));
        r6 = new java.lang.Class[2];
        r4 = o.jC.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x06d0, code lost:
        r12 = o.jC.$10;
        r12 = ((r12 | 121) << 1) - (r12 ^ 121);
        r38 = r3;
        o.jC.$11 = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x06e4, code lost:
        if ((r12 % 2) != 0) goto L731;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x06e8, code lost:
        r3 = r4[6251(0x186b, float:8.76E-42)];
        r4 = (byte) (-o.jC.$$a[22862(0x594e, float:3.2036E-41)]);
        r12 = 15085;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x06f6, code lost:
        r3 = r4[281(0x119, float:3.94E-43)];
        r4 = (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]);
        r12 = 800;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0705, code lost:
        r6[0] = java.lang.Class.forName($$c(r3, r4, (short) r12));
        r6[1] = java.lang.String.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x071e, code lost:
        r12 = r2.getDeclaredConstructor(r6).newInstance(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x071f, code lost:
        r41 = r7;
        r42 = r8;
        r2 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0725, code lost:
        r3 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0733, code lost:
        r38 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x0735, code lost:
        if (r15 != null) goto L784;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0737, code lost:
        r3 = 29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x073a, code lost:
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x073c, code lost:
        if (r3 == 1) goto L745;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x073f, code lost:
        r5 = new java.lang.Object[]{r14, r2};
        r2 = o.jC.$$a[281(0x119, float:3.94E-43)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0753, code lost:
        r3 = (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]);
        r4 = o.jC.$10;
        r6 = (r4 & 75) + (r4 | 75);
        o.jC.$11 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0762, code lost:
        if ((r6 % 2) != 0) goto L744;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0764, code lost:
        r2 = java.lang.Class.forName($$c(r2, r3, r10));
        r3 = new java.lang.Class[2];
        r4 = o.jC.$$a;
        r6 = 1;
        r15 = 281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0774, code lost:
        r2 = java.lang.Class.forName($$c(r2, r3, r10));
        r6 = 0;
        r15 = 281;
        r4 = o.jC.$$a;
        r3 = new java.lang.Class[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0789, code lost:
        r3[r6] = java.lang.Class.forName($$c(r4[r15], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10));
        r3[1] = java.lang.String.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x07ab, code lost:
        r15 = r2.getDeclaredConstructor(r3).newInstance(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x07b9, code lost:
        r2 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10)).getDeclaredConstructor(java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10)), java.lang.String.class).newInstance(r14, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0802, code lost:
        r3 = new java.lang.Object[]{r2};
        r4 = o.jC.$$a[281(0x119, float:3.94E-43)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0813, code lost:
        r5 = o.jC.$$a[4];
        r41 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x081c, code lost:
        r3 = java.lang.Class.forName($$c(r4, r5, (short) ((r5 ^ 709) | (r5 & 709)))).getDeclaredConstructor(java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10))).newInstance(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x0849, code lost:
        r5 = o.jC.$$a[4];
        r4 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r5, (short) (r5 | 709)));
        r5 = o.jC.$$a[72];
        r6 = o.jC.$$a[53];
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x086e, code lost:
        r42 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x087f, code lost:
        r4.getMethod($$c(r5, (byte) ((r6 ^ (-1)) + ((r6 & (-1)) << 1)), (short) 654), null).invoke(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x088d, code lost:
        r5 = r36;
        r4 = r39;
        r6 = r40;
        r7 = r41;
        r8 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0899, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x089b, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x089e, code lost:
        r3 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x089f, code lost:
        r4 = r3.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x08a3, code lost:
        if (r4 != null) goto L763;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x08a5, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x08a6, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x08a7, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x08a9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x08ac, code lost:
        r3 = r0;
        r4 = r3.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x08b3, code lost:
        if (r4 != null) goto L773;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x08b5, code lost:
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x08b6, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x08b7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x08b9, code lost:
        r4 = new java.lang.StringBuilder();
        r6 = o.jC.$$a[53];
        r4.append($$c(o.jC.$$a[141(0x8d, float:1.98E-43)], (byte) (((r6 | (-1)) << 1) - (r6 ^ (-1))), (short) 832));
        r4.append((java.lang.Object) r2);
        r2 = o.jC.$$b;
        r4.append($$c((byte) ((r2 ^ 1) + ((r2 & 1) << 1)), (byte) (-o.jC.$$a[355(0x163, float:4.97E-43)]), (short) 366));
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0938, code lost:
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[134(0x86, float:1.88E-43)], (short) 755)).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(r4.toString(), r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x0951, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0953, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x0955, code lost:
        r37 = r2;
        r38 = r3;
        r36 = r5;
        r40 = r6;
        r41 = r7;
        r42 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0962, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0963, code lost:
        r36 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0978, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x097a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x097b, code lost:
        r36 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x097d, code lost:
        r40 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x097f, code lost:
        r41 = r7;
        r42 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x0983, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0984, code lost:
        r48 = r9;
        r18 = r10;
        r43 = r11;
        r45 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x098c, code lost:
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x0993, code lost:
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0997, code lost:
        r36 = r3;
        r40 = r6;
        r41 = r7;
        r42 = r8;
        r12 = null;
        r15 = null;
        r37 = null;
        r38 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x09a7, code lost:
        r2 = new byte[9804];
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x09c5, code lost:
        r5 = new java.lang.Object[]{o.jC.class.getResourceAsStream($$c(o.jC.$$a[285(0x11d, float:4.0E-43)], o.jC.$$a[20], (short) 628))};
        r6 = (short) 528;
        r3 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[6], r6));
        r8 = o.jC.$$a[134(0x86, float:1.88E-43)];
        r28 = r12;
        r3 = r3.getDeclaredConstructor(java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r8, (short) ((r8 & 904) | (r8 ^ 904))))).newInstance(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x0a0f, code lost:
        java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[6], r6)).getMethod($$c(o.jC.$$a[49], o.jC.$$a[857(0x359, float:1.201E-42)], (short) 310), byte[].class).invoke(r3, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0a4a, code lost:
        r4 = o.jC.$11;
        r5 = (r4 ^ 57) + ((r4 & 57) << 1);
        o.jC.$10 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0a59, code lost:
        r4 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[6], r6));
        r6 = o.jC.$$a[53];
        r4.getMethod($$c(o.jC.$$a[72], (byte) (((r6 | (-1)) << 1) - (r6 ^ (-1))), (short) 654), null).invoke(r3, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0a92, code lost:
        r3 = 20;
        r5 = 9763;
        r7 = r36;
        r6 = null;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0a99, code lost:
        r8 = (r3 + 834) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0a9f, code lost:
        r12 = r2[r3 + 9783];
        r2[r8] = (byte) ((r12 & (-60)) + (r12 | (-60)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0aaa, code lost:
        r8 = r2.length - r3;
        r12 = o.jC.$11 + 67;
        o.jC.$10 = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0ab5, code lost:
        if ((r12 % 2) == 0) goto L667;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0ab7, code lost:
        r12 = '3';
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0aba, code lost:
        r12 = '.';
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x0abe, code lost:
        if (r12 == '.') goto L665;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0ac1, code lost:
        r14 = new java.lang.Object[3];
        r14[3] = java.lang.Integer.valueOf(r8);
        r8 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x0ace, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x0acf, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x0ae4, code lost:
        r14 = new java.lang.Object[3];
        r14[2] = java.lang.Integer.valueOf(r8);
        r8 = java.lang.Integer.valueOf(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0af1, code lost:
        r14[1] = r8;
        r14[0] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0afd, code lost:
        r2 = o.jC.$$a[281(0x119, float:3.94E-43)];
        r8 = (o.jC.$10 + 22) - 1;
        o.jC.$11 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0b0a, code lost:
        r44 = (java.io.InputStream) java.lang.Class.forName($$c(r2, o.jC.$$a[81], (short) 248)).getDeclaredConstructor(byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).newInstance(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0b3c, code lost:
        if (o.jC.setCheckedIconEnabled != null) goto L608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0b40, code lost:
        r2 = new byte[]{-63, 79, 79, 58, -127, 7, 119, -125};
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0b6c, code lost:
        r50 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0bcc, code lost:
        r49 = (2 - (~(-(-(((java.lang.Float) java.lang.Class.forName($$c(o.jC.$$a[3], o.jC.$$a[6], o.jC.$$a[7])).getMethod($$c(o.jC.$$a[66], o.jC.$$a[21], (short) 720), java.lang.Float.TYPE, java.lang.Float.TYPE).invoke(null, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f))).floatValue() > 0.0f ? 1 : (((java.lang.Float) java.lang.Class.forName($$c(o.jC.$$a[3], o.jC.$$a[6], o.jC.$$a[7])).getMethod($$c(o.jC.$$a[66], o.jC.$$a[21], (short) 720), java.lang.Float.TYPE, java.lang.Float.TYPE).invoke(null, java.lang.Float.valueOf(0.0f), java.lang.Float.valueOf(0.0f))).floatValue() == 0.0f ? 0 : -1)))))) - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0c25, code lost:
        r4 = (-1586939943) - ((java.lang.Integer) java.lang.Class.forName($$c(o.jC.$$a[3], o.jC.$$a[66], (short) 150)).getMethod($$c(o.jC.$$a[4], o.jC.$$a[339(0x153, float:4.75E-43)], (short) 836), java.lang.Integer.TYPE).invoke(null, 0)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0c2b, code lost:
        r4 = new o.jm(r44, new int[]{((int) (o.jC.ExtendableSavedState$1 >>> 32)) ^ r4, r4 ^ ((int) o.jC.ExtendableSavedState$1)}, r2, o.jC.setChipIconTintResource, false, r49);
        r43 = r11;
        r44 = r15;
        r45 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x0c6d, code lost:
        r50 = r5;
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x0c70, code lost:
        r2 = o.jC.setCheckedIconEnabled;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x0c72, code lost:
        r4 = (o.jC.$11 + 28) - 1;
        o.jC.$10 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0c7e, code lost:
        if ((r4 % 2) == 0) goto L653;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x0c80, code lost:
        r4 = o.jC.$$a[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0c8c, code lost:
        r5 = o.jC.$$a[104(0x68, float:1.46E-43)];
        r8 = 21297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x0c90, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x0c91, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x0ca5, code lost:
        r4 = o.jC.$$a[3];
        r5 = o.jC.$$a[82];
        r8 = 196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x0d30, code lost:
        r15 = new java.lang.Object[]{r44, java.lang.Short.valueOf((short) (5 - (((java.lang.Integer) java.lang.Class.forName($$c(r4, r5, (short) r8)).getMethod($$c(o.jC.$$a[4], o.jC.$$a[39], (short) 811), null).invoke(null, null)).intValue() >> 16))), java.lang.Integer.valueOf(((-1073706415) - (~(-(-(((java.lang.Long) java.lang.Class.forName($$c(o.jC.$$a[3], o.jC.$$a[82], (short) 196)).getMethod($$c(o.jC.$$a[4], o.jC.$$a[14], (short) 345), null).invoke(null, null)).longValue() > 0 ? 1 : (((java.lang.Long) java.lang.Class.forName($$c(o.jC.$$a[3], o.jC.$$a[82], (short) 196)).getMethod($$c(o.jC.$$a[4], o.jC.$$a[14], (short) 345), null).invoke(null, null)).longValue() == 0 ? 0 : -1)))))) - 1)};
        r4 = o.jC.$$a[23];
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x0d4f, code lost:
        r5 = o.jC.$$a[53];
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0d56, code lost:
        r4 = java.lang.Class.forName($$c(r4, r5, (short) ((r5 ^ 579) | (r5 & 579))), true, (java.lang.ClassLoader) o.jC.setLayoutDirection);
        r5 = $$c(o.jC.$$a[16], o.jC.$$a[53], o.jC.$$a[383(0x17f, float:5.37E-43)]);
        r14 = new java.lang.Class[3];
        r8 = o.jC.$$a[281(0x119, float:3.94E-43)];
        r44 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0d8e, code lost:
        r12 = o.jC.$$a[134(0x86, float:1.88E-43)];
        r43 = r11;
        r45 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0d99, code lost:
        r14[0] = java.lang.Class.forName($$c(r8, r12, (short) ((r12 ^ 904) | (r12 & 904))));
        r14[1] = java.lang.Short.TYPE;
        r14[2] = java.lang.Integer.TYPE;
        r4 = (java.io.InputStream) r4.getMethod(r5, r14).invoke(r2, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0dbd, code lost:
        r8 = new java.lang.Object[]{java.lang.Long.valueOf(20)};
        r11 = o.jC.$$a[134(0x86, float:1.88E-43)];
        ((java.lang.Long) java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r11, (short) ((r11 ^ 904) | (r11 & 904)))).getMethod($$c(o.jC.$$a[16], o.jC.$$a[53], (short) 584), java.lang.Long.TYPE).invoke(r4, r8)).longValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0e0c, code lost:
        if (r27 == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0e10, code lost:
        if (o.jC.setCheckedIconEnabled != null) goto L601;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0e12, code lost:
        r5 = r38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:408:0x0e15, code lost:
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0e19, code lost:
        if (o.jC.setCheckedIconEnabled != null) goto L600;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0e1b, code lost:
        r8 = r44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0e1e, code lost:
        r8 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0e21, code lost:
        r13 = o.jC.$$a[4];
        r11 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r13, (short) (r13 | 709))).getDeclaredConstructor(java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10))).newInstance(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0e63, code lost:
        if (r9 == false) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x0e65, code lost:
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x0e67, code lost:
        r12 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x0e69, code lost:
        if (r12 == true) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0e6b, code lost:
        ((java.lang.Boolean) java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10)).getMethod($$c(o.jC.$$a[16], (byte) (-o.jC.$$a[557(0x22d, float:7.8E-43)]), (short) 518), null).invoke(r5, null)).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0ea7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x0ea9, code lost:
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x0ead, code lost:
        if (r3 != null) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x0eaf, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0eb0, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:428:0x0eb1, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x0eb2, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:430:0x0eb7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:431:0x0eb8, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x0ebd, code lost:
        r12 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0ebf, code lost:
        r13 = new byte[1024];
        r14 = r50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0ec3, code lost:
        if (r14 <= 0) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:435:0x0ec5, code lost:
        r15 = java.lang.Math.min(r12, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:437:0x0eca, code lost:
        r12 = new java.lang.Object[3];
        r12[2] = java.lang.Integer.valueOf(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0ed8, code lost:
        r2 = o.jC.$11 + 107;
        r48 = r9;
        o.jC.$10 = r2 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x0ee3, code lost:
        if ((r2 % 2) == 0) goto L552;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0ee6, code lost:
        r12[0] = 0;
        r12[0] = r13;
        r2 = o.jC.$$a[5018(0x139a, float:7.032E-42)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:442:0x0ef1, code lost:
        r12[1] = 0;
        r12[0] = r13;
        r2 = o.jC.$$a[281(0x119, float:3.94E-43)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0efd, code lost:
        r9 = o.jC.$$a[134(0x86, float:1.88E-43)];
        r47 = r6;
        r2 = ((java.lang.Integer) java.lang.Class.forName($$c(r2, r9, (short) ((r9 & 904) | (r9 ^ 904)))).getMethod($$c(o.jC.$$a[49], o.jC.$$a[53], (short) 342), byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(r4, r12)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0f4b, code lost:
        if (r2 == (-1)) goto L544;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x0f4d, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:447:0x0f4f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x0f50, code lost:
        if (r6 == false) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0f53, code lost:
        r9 = new java.lang.Object[]{r13, 0, java.lang.Integer.valueOf(r2)};
        r12 = o.jC.$$a[4];
        r6 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r12, (short) (r12 | 709)));
        r12 = o.jC.$$a[7];
        r49 = r13;
        r6.getMethod($$c(r12, (byte) ((r12 ^ 35) | (r12 & 35)), (short) 328), byte[].class, java.lang.Integer.TYPE, java.lang.Integer.TYPE).invoke(r11, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0fad, code lost:
        r14 = r14 - r2;
        r6 = r47;
        r9 = r48;
        r13 = r49;
        r12 = 1024;
     */
    /* JADX WARN: Code restructure failed: missing block: B:458:0x0fc4, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x0fc6, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x0fc9, code lost:
        r2 = r0;
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:463:0x0fce, code lost:
        if (r3 != null) goto L550;
     */
    /* JADX WARN: Code restructure failed: missing block: B:464:0x0fd0, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x0fd1, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:466:0x0fd2, code lost:
        r47 = r6;
        r48 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0fd6, code lost:
        r4 = o.jC.$$a[4];
        r2 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r4, (short) ((r4 ^ 709) | (r4 & 709)))).getMethod($$c(o.jC.$$a[4], (byte) ((o.jC.$$a[53] - 0) - 1), (short) 618), null).invoke(r11, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:468:0x1012, code lost:
        r6 = o.jC.$$a[14];
        java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r6, (short) ((r6 ^ 840) | (r6 & 840)))).getMethod($$c(o.jC.$$a[16], o.jC.$$a[53], (short) 440), null).invoke(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:469:0x104b, code lost:
        r4 = o.jC.$$a[4];
        r2 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r4, (short) ((r4 ^ 709) | (r4 & 709))));
        r6 = o.jC.$$a[53];
        r2.getMethod($$c(o.jC.$$a[72], (byte) ((r6 ^ (-1)) + ((r6 & (-1)) << 1)), (short) 654), null).invoke(r11, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:470:0x108a, code lost:
        r2 = o.jC.$$a[18];
        r2 = java.lang.Class.forName($$c(r2, r2, (short) 366));
        r4 = o.jC.$$a[66];
        r6 = o.jC.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:471:0x10a6, code lost:
        r9 = o.jC.$11 + 43;
        o.jC.$10 = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:472:0x10b0, code lost:
        if ((r9 % 2) == 0) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:474:0x10b4, code lost:
        r4 = $$c(r4, r6[7421(0x1cfd, float:1.0399E-41)], (short) 28833);
        r9 = new java.lang.Class[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x10c2, code lost:
        r4 = $$c(r4, r6[339(0x153, float:4.75E-43)], (short) 550);
        r9 = new java.lang.Class[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:476:0x10d1, code lost:
        r9[0] = java.lang.String.class;
        r9[1] = java.lang.String.class;
        r9[2] = java.lang.Integer.TYPE;
        r2 = r2.getDeclaredMethod(r4, r9);
        r6 = new java.lang.Object[3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x10e7, code lost:
        r12 = (short) 681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x111c, code lost:
        r6[0] = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10)).getMethod($$c(o.jC.$$a[4], o.jC.$$a[383(0x17f, float:5.37E-43)], r12), null).invoke(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:482:0x1150, code lost:
        r6[1] = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10)).getMethod($$c(o.jC.$$a[4], o.jC.$$a[383(0x17f, float:5.37E-43)], r12), null).invoke(r8, null);
        r6[2] = 0;
        r2 = r2.invoke(null, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:483:0x115e, code lost:
        r4 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10));
        r9 = o.jC.$$a[21];
        ((java.lang.Boolean) r4.getMethod($$c(o.jC.$$a[18], r9, (short) ((r9 ^ 576) | (r9 & 576))), null).invoke(r5, null)).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:484:0x119b, code lost:
        r4 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10));
        r6 = o.jC.$$a[21];
        ((java.lang.Boolean) r4.getMethod($$c(o.jC.$$a[18], r6, (short) ((r6 ^ 576) | (r6 & 576))), null).invoke(r8, null)).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x11da, code lost:
        if (o.jC.setLayoutDirection != null) goto L541;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x11de, code lost:
        r6 = o.jC.$$a[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x11fc, code lost:
        o.jC.setLayoutDirection = java.lang.Class.class.getMethod($$c(r6, (byte) ((r6 ^ 10) | (r6 & 10)), (short) 587), null).invoke(o.jC.class, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x1209, code lost:
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x1253, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x1257, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x125b, code lost:
        r3 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x125f, code lost:
        if (r3 != null) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x1261, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x1262, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x1264, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x1267, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x1268, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x1269, code lost:
        r3 = new java.lang.StringBuilder();
        r6 = o.jC.$$a[53];
        r3.append($$c(o.jC.$$a[141(0x8d, float:1.98E-43)], (byte) (((r6 | (-1)) << 1) - (r6 ^ (-1))), (short) 469));
        r3.append(r5);
        r4 = o.jC.$$b;
        r3.append($$c((byte) ((r4 & 1) + (r4 | 1)), (byte) (-o.jC.$$a[355(0x163, float:4.97E-43)]), (short) 366));
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x12af, code lost:
        r2 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[134(0x86, float:1.88E-43)], (short) 755)).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(r3.toString(), r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x12e5, code lost:
        r3 = o.jC.$10;
        r4 = (r3 ^ o.setAnimationFromJson.setY.wrap) + ((r3 & o.setAnimationFromJson.setY.wrap) << 1);
        o.jC.$11 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x12f4, code lost:
        if ((r4 % 2) != 0) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x12f6, code lost:
        r2 = (java.lang.Throwable) r2;
        r3 = null;
        r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x12fc, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x12ff, code lost:
        throw ((java.lang.Throwable) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x130a, code lost:
        r3 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10));
        r6 = o.jC.$$a[21];
        ((java.lang.Boolean) r3.getMethod($$c(o.jC.$$a[18], r6, (short) ((r6 ^ 576) | (r6 & 576))), null).invoke(r5, null)).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x1347, code lost:
        r3 = o.jC.$10;
        r4 = (r3 & 101) + (r3 | 101);
        o.jC.$11 = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x1354, code lost:
        r3 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], (byte) (-o.jC.$$a[363(0x16b, float:5.09E-43)]), r10));
        r5 = o.jC.$$a[21];
        ((java.lang.Boolean) r3.getMethod($$c(o.jC.$$a[18], r5, (short) (r5 | 576)), null).invoke(r8, null)).booleanValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x138e, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x13a3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:575:0x13a5, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x13a6, code lost:
        r48 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x13a8, code lost:
        r2 = r0;
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x13ad, code lost:
        r47 = r6;
        r48 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x13b1, code lost:
        r2 = new java.util.zip.ZipInputStream(r4);
        r4 = r2.getNextEntry();
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x13bb, code lost:
        r6 = new java.lang.Object[]{r2};
        r2 = o.jC.$$a[281(0x119, float:3.94E-43)];
        r2 = java.lang.Class.forName($$c(r2, r2, (short) (-o.jC.$$a[363(0x16b, float:5.09E-43)])));
        r9 = o.jC.$$a[134(0x86, float:1.88E-43)];
        r2 = r2.getDeclaredConstructor(java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r9, (short) (r9 | 904)))).newInstance(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x13ff, code lost:
        r8 = (short) 556;
        r5 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[66], r8)).getDeclaredConstructor(null).newInstance(null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x1423, code lost:
        r6 = new byte[1024];
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x1425, code lost:
        r9 = 0;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x1427, code lost:
        r11 = o.jC.$$a[281(0x119, float:3.94E-43)];
        r11 = ((java.lang.Integer) java.lang.Class.forName($$c(r11, r11, (short) (-o.jC.$$a[363(0x16b, float:5.09E-43)]))).getMethod($$c(o.jC.$$a[49], o.jC.$$a[53], (short) 342), byte[].class).invoke(r2, r6)).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x146d, code lost:
        if (r11 <= 0) goto L477;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x1476, code lost:
        if (r9 >= r4.getSize()) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x1479, code lost:
        r13 = new java.lang.Object[3];
        r13[2] = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x1487, code lost:
        r12 = o.jC.$11 + 111;
        r46 = r4;
        o.jC.$10 = r12 % 128;
        r12 = r12 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x1493, code lost:
        r13[1] = 0;
        r13[0] = r6;
        r4 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[66], r8));
        r12 = o.jC.$$a[7];
        r12 = $$c(r12, (byte) ((r12 ^ 35) | (r12 & 35)), (short) 328);
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x14c2, code lost:
        r18 = java.lang.Integer.TYPE;
        r4.getMethod(r12, new java.lang.Class[]{byte[].class, java.lang.Integer.TYPE, r18}).invoke(r5, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x14db, code lost:
        r4 = o.jC.$11 + 27;
        o.jC.$10 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x14e5, code lost:
        if ((r4 % 2) == 0) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x14e7, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x14e9, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x14ea, code lost:
        if (r4 == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x14ec, code lost:
        r4 = -(-r11);
        r9 = ((r9 | r4) << 1) - (r4 ^ r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x14f5, code lost:
        r4 = r46;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x14f9, code lost:
        r9 = r9 / r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x14fb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x14fd, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x14ff, code lost:
        r2 = r0;
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x1504, code lost:
        if (r3 != null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:613:0x1506, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x1507, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:616:0x1509, code lost:
        r4 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[66], r8));
        r6 = o.jC.$$a[42];
        r9 = o.jC.$$a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:617:0x1528, code lost:
        r11 = o.jC.$10;
        r12 = (r11 & 35) + (r11 | 35);
        o.jC.$11 = r12 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:618:0x1535, code lost:
        if ((r12 % 2) != 0) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:619:0x1537, code lost:
        r11 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:620:0x1539, code lost:
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:622:0x153b, code lost:
        if (r11 == true) goto L469;
     */
    /* JADX WARN: Code restructure failed: missing block: B:624:0x153f, code lost:
        r6 = $$c(r6, (byte) (-r9[6644(0x19f4, float:9.31E-42)]), (short) (o.jC.$$b & 17498));
     */
    /* JADX WARN: Code restructure failed: missing block: B:626:0x154e, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x154f, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x155f, code lost:
        r11 = o.jC.$$b;
        r6 = $$c(r6, (byte) (-r9[557(0x22d, float:7.8E-43)]), (short) ((r11 & 802) | (r11 ^ 802)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:630:0x1570, code lost:
        r4 = r4.getMethod(r6, null).invoke(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x1578, code lost:
        r6 = o.jC.$$a[281(0x119, float:3.94E-43)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:633:0x1584, code lost:
        r6 = java.lang.Class.forName($$c(r6, r6, (short) (-o.jC.$$a[363(0x16b, float:5.09E-43)])));
        r11 = o.jC.$$a[53];
        r6.getMethod($$c(o.jC.$$a[72], (byte) ((r11 & (-1)) + (r11 | (-1))), (short) 654), null).invoke(r2, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:635:0x15b3, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:637:0x15b5, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:639:0x15b8, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x15b9, code lost:
        r6 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:641:0x15bd, code lost:
        if (r6 != null) goto L456;
     */
    /* JADX WARN: Code restructure failed: missing block: B:642:0x15bf, code lost:
        throw r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:643:0x15c0, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:644:0x15c1, code lost:
        r2 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[66], r8));
        r8 = o.jC.$$a[53];
        r2.getMethod($$c(o.jC.$$a[72], (byte) (((r8 | (-1)) << 1) - (r8 ^ (-1))), (short) 654), null).invoke(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:646:0x15fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:648:0x15fe, code lost:
        r5 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:649:0x1602, code lost:
        if (r5 != null) goto L448;
     */
    /* JADX WARN: Code restructure failed: missing block: B:650:0x1604, code lost:
        throw r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:651:0x1605, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:653:0x1608, code lost:
        r6 = o.jC.$$a[4];
        r2 = java.lang.Class.class.getMethod($$c(r6, (byte) (r6 | 10), (short) 587), null).invoke(o.jC.class, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x162a, code lost:
        r5 = java.lang.Class.forName($$c(o.jC.$$a[18], o.jC.$$a[16], (short) 275));
        r13 = (short) 178;
        r15 = o.jC.$$b;
        r5 = r5.getDeclaredConstructor(java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[134(0x86, float:1.88E-43)], r13)), java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[18], (short) ((r15 ^ 400) | (r15 & 400)))));
        r9 = new java.lang.Object[2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:660:0x16c1, code lost:
        r9[0] = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[134(0x86, float:1.88E-43)], r13)).getMethod($$c(o.jC.$$a[7], o.jC.$$a[53], (short) 899), byte[].class).invoke(null, r4);
        r9[1] = r2;
        r4 = r5.newInstance(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:664:0x16cf, code lost:
        r5 = o.jC.$$a[18];
     */
    /* JADX WARN: Code restructure failed: missing block: B:665:0x16d0, code lost:
        r6 = o.jC.$$a[23];
        r5 = java.lang.Class.forName($$c(r5, r6, (short) ((r6 ^ 387) | (r6 & 387)))).getDeclaredField($$c(o.jC.$$a[76], o.jC.$$a[88], (short) 773));
        r5.setAccessible(true);
        r6 = r5.get(r2);
        r8 = r6.getClass();
        r9 = r8.getDeclaredField($$c(o.jC.$$a[24], o.jC.$$a[4], (short) 902));
        r9.setAccessible(true);
        r8 = r8.getDeclaredField($$c(o.jC.$$a[24], o.jC.$$a[57], (short) 630));
        r8.setAccessible(true);
        r11 = r9.get(r6);
        r6 = r8.get(r6);
        r5 = r5.get(r4);
        r13 = new java.util.ArrayList((java.util.List) r11);
        r11 = r6.getClass().getComponentType();
        r15 = java.lang.reflect.Array.getLength(r6);
        r11 = java.lang.reflect.Array.newInstance(r11, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:666:0x1766, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:667:0x1767, code lost:
        if (r12 >= r15) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:668:0x1769, code lost:
        r18 = r10;
        r14 = '[';
     */
    /* JADX WARN: Code restructure failed: missing block: B:669:0x1770, code lost:
        r18 = r10;
        r14 = '\r';
     */
    /* JADX WARN: Code restructure failed: missing block: B:671:0x1778, code lost:
        if (r14 == '\r') goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:672:0x177a, code lost:
        java.lang.reflect.Array.set(r11, r12, java.lang.reflect.Array.get(r6, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:673:0x1781, code lost:
        r12 = (((r12 ^ (-80)) + ((r12 & (-80)) << 1)) + 82) - 1;
        r10 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x1790, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x1791, code lost:
        r2 = r0;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:676:0x1794, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:677:0x1795, code lost:
        r3 = r0;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:678:0x179d, code lost:
        r9.set(r5, r13);
        r8.set(r5, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:680:0x17a5, code lost:
        if (o.jC.setLayoutDirection == null) goto L307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:681:0x17a7, code lost:
        o.jC.setLayoutDirection = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:682:0x17a9, code lost:
        r2 = r4;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:683:0x17aa, code lost:
        if (r27 == false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:684:0x17ac, code lost:
        r4 = 24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:685:0x17af, code lost:
        r4 = 'L';
     */
    /* JADX WARN: Code restructure failed: missing block: B:687:0x17b3, code lost:
        if (r4 == 'L') goto L396;
     */
    /* JADX WARN: Code restructure failed: missing block: B:688:0x17b5, code lost:
        r4 = o.jC.$10;
        r5 = (r4 ^ o.setAnimationFromJson.setY.wrap) + ((r4 & o.setAnimationFromJson.setY.wrap) << 1);
        o.jC.$11 = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:689:0x17c4, code lost:
        r4 = o.jC.$$a[18];
        r4 = java.lang.Class.forName($$c(r4, r4, (short) 366));
        r5 = $$c(o.jC.$$a[66], o.jC.$$a[857(0x359, float:1.201E-42)], (short) 889);
        r10 = o.jC.$$b;
        r5 = r4.getDeclaredMethod(r5, java.lang.String.class, java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[18], (short) ((r10 & 400) | (r10 ^ 400)))));
        r5.setAccessible(true);
        r8 = new java.lang.Object[2];
        r8[0] = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:692:0x1829, code lost:
        r9 = o.jC.$$a[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:694:0x1843, code lost:
        r8[1] = java.lang.Class.class.getMethod($$c(r9, (byte) ((r9 ^ 10) | (r9 & 10)), (short) 587), null).invoke(o.jC.class, null);
        r5 = r5.invoke(r2, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:695:0x1849, code lost:
        if (r5 != null) goto L326;
     */
    /* JADX WARN: Code restructure failed: missing block: B:700:0x185e, code lost:
        r4.getDeclaredMethod($$c(o.jC.$$a[72], (byte) (o.jC.$$a[53] - 1), (short) 654), new java.lang.Class[0]).invoke(r2, new java.lang.Object[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:701:0x186f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:702:0x1870, code lost:
        r2 = r0;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:703:0x1877, code lost:
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:704:0x187c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:706:0x187e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:708:0x1880, code lost:
        r2 = r0;
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:709:0x1885, code lost:
        if (r3 != null) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:710:0x1887, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:711:0x1888, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:712:0x1889, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:714:0x188b, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:716:0x188d, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:717:0x1892, code lost:
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:719:0x1897, code lost:
        r4 = o.jC.$$a[281(0x119, float:3.94E-43)];
     */
    /* JADX WARN: Code restructure failed: missing block: B:721:0x18a2, code lost:
        r8 = o.jC.$$b;
        r4 = java.lang.Class.forName($$c(r4, o.jC.$$a[18], (short) ((r8 & 400) | (r8 ^ 400)))).getDeclaredMethod($$c(o.jC.$$a[66], o.jC.$$a[857(0x359, float:1.201E-42)], (short) 889), java.lang.String.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:722:0x18d6, code lost:
        r4.setAccessible(true);
        r4 = r4.invoke(r2, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:724:0x18e2, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:725:0x18e3, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:726:0x18e7, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:729:0x18ef, code lost:
        throw ((java.lang.Exception) r0.getCause());
     */
    /* JADX WARN: Code restructure failed: missing block: B:730:0x18f0, code lost:
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:731:0x18f1, code lost:
        if (r4 != null) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:732:0x18f3, code lost:
        r4 = (java.lang.Class) r4;
        r7 = o.jC.$$a[21];
        r7 = $$c(o.jC.$$a[23], r7, (short) (r7 | 793));
        r5 = r4.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r5.setAccessible(true);
        r9 = new java.lang.Object[2];
        r9[0] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:733:0x1924, code lost:
        if (r27 == false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:734:0x1926, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:735:0x1928, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:736:0x1929, code lost:
        r9[1] = java.lang.Boolean.valueOf(r2);
        o.jC.setCheckedIconEnabled = r5.newInstance(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:737:0x1936, code lost:
        r2 = o.jC.$10 + 35;
        o.jC.$11 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:738:0x1943, code lost:
        r2 = new byte[79836];
     */
    /* JADX WARN: Code restructure failed: missing block: B:740:0x1961, code lost:
        r11 = new java.lang.Object[]{o.jC.class.getResourceAsStream($$c(o.jC.$$a[285(0x11d, float:4.0E-43)], o.jC.$$a[20], (short) 897))};
        r12 = (short) 528;
        r8 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[6], r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:741:0x197e, code lost:
        r9 = o.jC.$11 + 53;
        o.jC.$10 = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:742:0x198a, code lost:
        r14 = o.jC.$$a[134(0x86, float:1.88E-43)];
        r8 = r8.getDeclaredConstructor(java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], r14, (short) (r14 | 904)))).newInstance(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:744:0x19b1, code lost:
        java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[6], r12)).getMethod($$c(o.jC.$$a[49], o.jC.$$a[857(0x359, float:1.201E-42)], (short) 310), byte[].class).invoke(r8, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:745:0x19ec, code lost:
        r9 = java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[6], r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:747:0x1a05, code lost:
        r13 = o.jC.$$a[53];
        r9.getMethod($$c(o.jC.$$a[72], (byte) ((r13 ^ (-1)) + ((r13 & (-1)) << 1)), (short) 654), null).invoke(r8, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:748:0x1a27, code lost:
        r3 = java.lang.Math.abs(r3);
        r6 = r4;
        r10 = r18;
        r11 = r43;
        r15 = r44;
        r13 = r45;
        r9 = r48;
        r5 = 79792;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:749:0x1a3b, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:751:0x1a3d, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:753:0x1a40, code lost:
        r2 = r0;
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:754:0x1a45, code lost:
        if (r3 != null) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:755:0x1a47, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x1a48, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:767:0x1a61, code lost:
        r3 = r47.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r3.setAccessible(true);
        r5 = new java.lang.Object[2];
        r5[0] = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:768:0x1a7f, code lost:
        if (r27 == false) goto L376;
     */
    /* JADX WARN: Code restructure failed: missing block: B:769:0x1a81, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:770:0x1a83, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:771:0x1a84, code lost:
        r5[1] = java.lang.Boolean.valueOf(r2);
        o.jC.setCheckedIconEnabled = r3.newInstance(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:772:0x1a91, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:773:0x1a9a, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:775:0x1a9c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:777:0x1a9e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:779:0x1aa2, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:781:0x1aa4, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:783:0x1aa6, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:784:0x1aa7, code lost:
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:785:0x1aaa, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:786:0x1aab, code lost:
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:787:0x1aae, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:788:0x1aaf, code lost:
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:789:0x1ab1, code lost:
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:792:0x1ab6, code lost:
        r2 = r0;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:793:0x1abd, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:794:0x1abe, code lost:
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:795:0x1ac0, code lost:
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:796:0x1ac2, code lost:
        r3 = r0;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:797:0x1ac6, code lost:
        r4 = new java.lang.StringBuilder();
     */
    /* JADX WARN: Code restructure failed: missing block: B:799:0x1ad6, code lost:
        r4.append($$c(o.jC.$$a[141(0x8d, float:1.98E-43)], (byte) ((o.jC.$$a[53] - 0) - 1), (short) 473));
        r4.append(r2);
        r4.append($$c((byte) (o.jC.$$b + 1), (byte) (-o.jC.$$a[355(0x163, float:4.97E-43)]), (short) 366));
     */
    /* JADX WARN: Code restructure failed: missing block: B:801:0x1b06, code lost:
        r5 = new java.lang.Object[]{r4.toString(), r3};
     */
    /* JADX WARN: Code restructure failed: missing block: B:802:0x1b0e, code lost:
        r2 = o.jC.$11;
        r3 = (r2 & 21) + (r2 | 21);
        o.jC.$10 = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:804:0x1b4c, code lost:
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[134(0x86, float:1.88E-43)], (short) 755)).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:805:0x1b4d, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:807:0x1b4f, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:809:0x1b52, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:810:0x1b53, code lost:
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:811:0x1b57, code lost:
        if (r3 != null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:812:0x1b59, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:813:0x1b5a, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:814:0x1b5b, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:816:0x1b60, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:823:0x1b7c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:824:0x1b7d, code lost:
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x1b98, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:831:0x1b99, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:832:0x1ba5, code lost:
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:833:0x1ba9, code lost:
        if (r3 != null) goto L467;
     */
    /* JADX WARN: Code restructure failed: missing block: B:834:0x1bab, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:835:0x1bac, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:851:0x1bec, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:852:0x1bed, code lost:
        r18 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:858:0x1c08, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:860:0x1c0e, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:862:0x1c1c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:865:0x1c2b, code lost:
        r2 = r0;
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:866:0x1c33, code lost:
        if (r3 == null) goto L636;
     */
    /* JADX WARN: Code restructure failed: missing block: B:867:0x1c35, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:868:0x1c36, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x1c52, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x1c53, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x1c65, code lost:
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x1c69, code lost:
        if (r3 == null) goto L649;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x1c6b, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x1c6c, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x1c6d, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x1c6e, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:882:0x1c80, code lost:
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:883:0x1c84, code lost:
        if (r3 == null) goto L660;
     */
    /* JADX WARN: Code restructure failed: missing block: B:884:0x1c86, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:885:0x1c87, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:901:0x1cd9, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:903:0x1cdb, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:905:0x1cdd, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:907:0x1ce0, code lost:
        r2 = r0;
        r3 = r2.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:908:0x1cfe, code lost:
        if (r3 != null) goto L839;
     */
    /* JADX WARN: Code restructure failed: missing block: B:909:0x1d00, code lost:
        throw r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:910:0x1d01, code lost:
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:911:0x1d02, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:913:0x1d04, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:914:0x1d05, code lost:
        r33 = r2;
        r36 = r3;
        r40 = r6;
        r41 = r7;
        r42 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:915:0x1d0f, code lost:
        r48 = r9;
        r18 = r10;
        r43 = r11;
        r45 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:916:0x1d17, code lost:
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:918:0x1d20, code lost:
        r2 = r0;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:919:0x1d21, code lost:
        r3 = ((r45 | 1) << 1) - (r45 ^ 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:921:0x1d29, code lost:
        if (r3 >= 7) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:923:0x1d2d, code lost:
        if (r43[r3] != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:924:0x1d2f, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:925:0x1d31, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:926:0x1d32, code lost:
        if (r7 != false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:927:0x1d34, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:928:0x1d36, code lost:
        r3 = (r3 | 1) + (r3 & 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:929:0x1d3c, code lost:
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:930:0x1d3d, code lost:
        if (r3 == false) goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:931:0x1d3f, code lost:
        o.jC.setCheckedIconEnabled = null;
        o.jC.setLayoutDirection = null;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:932:0x1d44, code lost:
        r7 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:933:0x1d46, code lost:
        r3 = ((r45 | 17) << 1) - (r45 ^ 17);
        r13 = ((r3 | (-16)) << 1) - (r3 ^ (-16));
        r10 = r18;
        r2 = r33;
        r3 = r36;
        r6 = r40;
        r8 = r42;
        r11 = r43;
        r9 = r48;
        r5 = 0;
        r18 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:934:0x1d69, code lost:
        r3 = o.jC.$$a[6];
     */
    /* JADX WARN: Code restructure failed: missing block: B:937:0x1db6, code lost:
        throw ((java.lang.Throwable) java.lang.Class.forName($$c(o.jC.$$a[281(0x119, float:3.94E-43)], o.jC.$$a[134(0x86, float:1.88E-43)], (short) 755)).getDeclaredConstructor(java.lang.String.class, java.lang.Throwable.class).newInstance($$c(o.jC.$$a[141(0x8d, float:1.98E-43)], r3, (short) (r3 | 426)), r2));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1002:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1005:0x0166 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:1110:0x1d69 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1117:0x1a61 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:1123:0x1d3c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x12f6 A[Catch: all -> 0x1300, TRY_ENTER, TryCatch #90 {all -> 0x1263, blocks: (B:470:0x108a, B:474:0x10b4, B:476:0x10d1, B:479:0x111c, B:482:0x1150, B:475:0x10c2, B:462:0x0fc9, B:464:0x0fd0, B:465:0x0fd1, B:544:0x1269, B:536:0x125b, B:538:0x1261, B:539:0x1262, B:480:0x111e, B:477:0x10e7, B:469:0x104b, B:468:0x1012, B:467:0x0fd6, B:450:0x0f53, B:546:0x12af, B:549:0x12f6, B:550:0x12fc, B:551:0x12fd, B:552:0x12ff), top: B:1090:0x10b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:551:0x12fd A[Catch: all -> 0x1300, TryCatch #90 {all -> 0x1263, blocks: (B:470:0x108a, B:474:0x10b4, B:476:0x10d1, B:479:0x111c, B:482:0x1150, B:475:0x10c2, B:462:0x0fc9, B:464:0x0fd0, B:465:0x0fd1, B:544:0x1269, B:536:0x125b, B:538:0x1261, B:539:0x1262, B:480:0x111e, B:477:0x10e7, B:469:0x104b, B:468:0x1012, B:467:0x0fd6, B:450:0x0f53, B:546:0x12af, B:549:0x12f6, B:550:0x12fc, B:551:0x12fd, B:552:0x12ff), top: B:1090:0x10b4 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0203 A[Catch: Exception -> 0x1de0, TRY_ENTER, TRY_LEAVE, TryCatch #117 {Exception -> 0x1de0, blocks: (B:3:0x0032, B:5:0x004f, B:52:0x0199, B:55:0x01c5, B:56:0x01cc, B:61:0x01d1, B:65:0x0203, B:73:0x0293, B:74:0x02a7, B:83:0x0306, B:85:0x0377, B:104:0x03dd, B:108:0x03e4, B:112:0x03eb, B:124:0x040b, B:126:0x040f, B:922:0x1d2b, B:931:0x1d3f, B:933:0x1d46, B:934:0x1d69, B:928:0x1d36, B:135:0x041d, B:936:0x1d7e, B:937:0x1db6, B:67:0x0257, B:66:0x0212, B:62:0x01d8, B:75:0x02bc), top: B:1046:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:668:0x1769  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x1770  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x17a7 A[Catch: all -> 0x1790, TRY_ENTER, TRY_LEAVE, TryCatch #58 {all -> 0x1790, blocks: (B:672:0x177a, B:681:0x17a7), top: B:974:0x177a }] */
    /* JADX WARN: Removed duplicated region for block: B:684:0x17ac  */
    /* JADX WARN: Removed duplicated region for block: B:685:0x17af  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x17b5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0282 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:718:0x1896  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0293 A[Catch: Exception -> 0x1de0, TRY_ENTER, TryCatch #117 {Exception -> 0x1de0, blocks: (B:3:0x0032, B:5:0x004f, B:52:0x0199, B:55:0x01c5, B:56:0x01cc, B:61:0x01d1, B:65:0x0203, B:73:0x0293, B:74:0x02a7, B:83:0x0306, B:85:0x0377, B:104:0x03dd, B:108:0x03e4, B:112:0x03eb, B:124:0x040b, B:126:0x040f, B:922:0x1d2b, B:931:0x1d3f, B:933:0x1d46, B:934:0x1d69, B:928:0x1d36, B:135:0x041d, B:936:0x1d7e, B:937:0x1db6, B:67:0x0257, B:66:0x0212, B:62:0x01d8, B:75:0x02bc), top: B:1046:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02a7 A[Catch: Exception -> 0x1de0, TRY_LEAVE, TryCatch #117 {Exception -> 0x1de0, blocks: (B:3:0x0032, B:5:0x004f, B:52:0x0199, B:55:0x01c5, B:56:0x01cc, B:61:0x01d1, B:65:0x0203, B:73:0x0293, B:74:0x02a7, B:83:0x0306, B:85:0x0377, B:104:0x03dd, B:108:0x03e4, B:112:0x03eb, B:124:0x040b, B:126:0x040f, B:922:0x1d2b, B:931:0x1d3f, B:933:0x1d46, B:934:0x1d69, B:928:0x1d36, B:135:0x041d, B:936:0x1d7e, B:937:0x1db6, B:67:0x0257, B:66:0x0212, B:62:0x01d8, B:75:0x02bc), top: B:1046:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:867:0x1c35 A[Catch: all -> 0x1d02, TryCatch #111 {all -> 0x1d02, blocks: (B:810:0x1b53, B:812:0x1b59, B:813:0x1b5a, B:832:0x1ba5, B:834:0x1bab, B:835:0x1bac, B:865:0x1c2b, B:867:0x1c35, B:868:0x1c36, B:876:0x1c65, B:878:0x1c6b, B:879:0x1c6c, B:882:0x1c80, B:884:0x1c86, B:885:0x1c87, B:907:0x1ce0, B:909:0x1d00, B:910:0x1d01, B:659:0x1683, B:653:0x1608, B:340:0x0a59, B:338:0x0a0f, B:587:0x1427, B:336:0x09c5, B:582:0x13ff, B:581:0x13bb, B:403:0x0dbd, B:392:0x0ce7), top: B:1033:0x1683 }] */
    /* JADX WARN: Removed duplicated region for block: B:868:0x1c36 A[Catch: all -> 0x1d02, TryCatch #111 {all -> 0x1d02, blocks: (B:810:0x1b53, B:812:0x1b59, B:813:0x1b5a, B:832:0x1ba5, B:834:0x1bab, B:835:0x1bac, B:865:0x1c2b, B:867:0x1c35, B:868:0x1c36, B:876:0x1c65, B:878:0x1c6b, B:879:0x1c6c, B:882:0x1c80, B:884:0x1c86, B:885:0x1c87, B:907:0x1ce0, B:909:0x1d00, B:910:0x1d01, B:659:0x1683, B:653:0x1608, B:340:0x0a59, B:338:0x0a0f, B:587:0x1427, B:336:0x09c5, B:582:0x13ff, B:581:0x13bb, B:403:0x0dbd, B:392:0x0ce7), top: B:1033:0x1683 }] */
    /* JADX WARN: Removed duplicated region for block: B:878:0x1c6b A[Catch: all -> 0x1d02, TryCatch #111 {all -> 0x1d02, blocks: (B:810:0x1b53, B:812:0x1b59, B:813:0x1b5a, B:832:0x1ba5, B:834:0x1bab, B:835:0x1bac, B:865:0x1c2b, B:867:0x1c35, B:868:0x1c36, B:876:0x1c65, B:878:0x1c6b, B:879:0x1c6c, B:882:0x1c80, B:884:0x1c86, B:885:0x1c87, B:907:0x1ce0, B:909:0x1d00, B:910:0x1d01, B:659:0x1683, B:653:0x1608, B:340:0x0a59, B:338:0x0a0f, B:587:0x1427, B:336:0x09c5, B:582:0x13ff, B:581:0x13bb, B:403:0x0dbd, B:392:0x0ce7), top: B:1033:0x1683 }] */
    /* JADX WARN: Removed duplicated region for block: B:879:0x1c6c A[Catch: all -> 0x1d02, TryCatch #111 {all -> 0x1d02, blocks: (B:810:0x1b53, B:812:0x1b59, B:813:0x1b5a, B:832:0x1ba5, B:834:0x1bab, B:835:0x1bac, B:865:0x1c2b, B:867:0x1c35, B:868:0x1c36, B:876:0x1c65, B:878:0x1c6b, B:879:0x1c6c, B:882:0x1c80, B:884:0x1c86, B:885:0x1c87, B:907:0x1ce0, B:909:0x1d00, B:910:0x1d01, B:659:0x1683, B:653:0x1608, B:340:0x0a59, B:338:0x0a0f, B:587:0x1427, B:336:0x09c5, B:582:0x13ff, B:581:0x13bb, B:403:0x0dbd, B:392:0x0ce7), top: B:1033:0x1683 }] */
    /* JADX WARN: Removed duplicated region for block: B:884:0x1c86 A[Catch: all -> 0x1d02, TryCatch #111 {all -> 0x1d02, blocks: (B:810:0x1b53, B:812:0x1b59, B:813:0x1b5a, B:832:0x1ba5, B:834:0x1bab, B:835:0x1bac, B:865:0x1c2b, B:867:0x1c35, B:868:0x1c36, B:876:0x1c65, B:878:0x1c6b, B:879:0x1c6c, B:882:0x1c80, B:884:0x1c86, B:885:0x1c87, B:907:0x1ce0, B:909:0x1d00, B:910:0x1d01, B:659:0x1683, B:653:0x1608, B:340:0x0a59, B:338:0x0a0f, B:587:0x1427, B:336:0x09c5, B:582:0x13ff, B:581:0x13bb, B:403:0x0dbd, B:392:0x0ce7), top: B:1033:0x1683 }] */
    /* JADX WARN: Removed duplicated region for block: B:885:0x1c87 A[Catch: all -> 0x1d02, TryCatch #111 {all -> 0x1d02, blocks: (B:810:0x1b53, B:812:0x1b59, B:813:0x1b5a, B:832:0x1ba5, B:834:0x1bab, B:835:0x1bac, B:865:0x1c2b, B:867:0x1c35, B:868:0x1c36, B:876:0x1c65, B:878:0x1c6b, B:879:0x1c6c, B:882:0x1c80, B:884:0x1c86, B:885:0x1c87, B:907:0x1ce0, B:909:0x1d00, B:910:0x1d01, B:659:0x1683, B:653:0x1608, B:340:0x0a59, B:338:0x0a0f, B:587:0x1427, B:336:0x09c5, B:582:0x13ff, B:581:0x13bb, B:403:0x0dbd, B:392:0x0ce7), top: B:1033:0x1683 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:922:0x1d2b A[Catch: Exception -> 0x1de0, TRY_ENTER, TryCatch #117 {Exception -> 0x1de0, blocks: (B:3:0x0032, B:5:0x004f, B:52:0x0199, B:55:0x01c5, B:56:0x01cc, B:61:0x01d1, B:65:0x0203, B:73:0x0293, B:74:0x02a7, B:83:0x0306, B:85:0x0377, B:104:0x03dd, B:108:0x03e4, B:112:0x03eb, B:124:0x040b, B:126:0x040f, B:922:0x1d2b, B:931:0x1d3f, B:933:0x1d46, B:934:0x1d69, B:928:0x1d36, B:135:0x041d, B:936:0x1d7e, B:937:0x1db6, B:67:0x0257, B:66:0x0212, B:62:0x01d8, B:75:0x02bc), top: B:1046:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:931:0x1d3f A[Catch: Exception -> 0x1de0, TryCatch #117 {Exception -> 0x1de0, blocks: (B:3:0x0032, B:5:0x004f, B:52:0x0199, B:55:0x01c5, B:56:0x01cc, B:61:0x01d1, B:65:0x0203, B:73:0x0293, B:74:0x02a7, B:83:0x0306, B:85:0x0377, B:104:0x03dd, B:108:0x03e4, B:112:0x03eb, B:124:0x040b, B:126:0x040f, B:922:0x1d2b, B:931:0x1d3f, B:933:0x1d46, B:934:0x1d69, B:928:0x1d36, B:135:0x041d, B:936:0x1d7e, B:937:0x1db6, B:67:0x0257, B:66:0x0212, B:62:0x01d8, B:75:0x02bc), top: B:1046:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:974:0x177a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:983:0x18f3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:987:0x179d A[EDGE_INSN: B:987:0x179d->B:678:0x179d ?: BREAK  , EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03d5  */
    /* JADX WARN: Type inference failed for: r15v125, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r18v48, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r4v365, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v0 */
    static {
        /*
            Method dump skipped, instructions count: 7656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.jC.<clinit>():void");
    }
}