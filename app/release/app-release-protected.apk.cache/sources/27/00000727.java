package o;

import java.lang.reflect.Method;
import java.util.Map;

/* renamed from: o.md  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0289md {
    public static final byte[] $$a;
    public static final int $$b;
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object setCheckedIconEnabled;
    private static long setChipIconTintResource;
    private static byte[] setGuidelinePercent;
    private static byte setIconified;
    private static Object setLayoutDirection;
    private static final Map<String, Object> setMinAndMaxProgress;
    private static byte[] setTextAppearanceResource;
    public static final Map<Integer, Object> setTextScaleX;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0058 -> B:10:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r8, short r9, int r10) {
        /*
            Method dump skipped, instructions count: 156
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0289md.$$c(short, short, int):java.lang.String");
    }

    public static int setIconTintList(int i) {
        Object obj;
        Object[] objArr;
        int i2;
        byte b;
        byte[] bArr;
        char c;
        try {
            int i3 = $10;
            int i4 = ((i3 | 43) << 1) - (i3 ^ 43);
            try {
                $11 = i4 % 128;
                Object obj2 = null;
                if ((i4 % 2 == 0 ? '(' : (char) 19) != '(') {
                    try {
                        obj = setCheckedIconEnabled;
                    } catch (ArrayStoreException e) {
                        throw e;
                    }
                } else {
                    obj = setCheckedIconEnabled;
                    obj2.hashCode();
                }
                int i5 = ($11 + 50) - 1;
                $10 = i5 % 128;
                try {
                    if ((i5 % 2 != 0 ? '8' : 'b') != 'b') {
                        objArr = new Object[1];
                        objArr[1] = Integer.valueOf(i);
                        i2 = 5877;
                    } else {
                        objArr = new Object[]{Integer.valueOf(i)};
                        i2 = 380;
                    }
                    int i6 = $10;
                    int i7 = ((i6 | 89) << 1) - (i6 ^ 89);
                    $11 = i7 % 128;
                    short s = (short) i2;
                    if ((i7 % 2 == 0 ? (char) 16 : '[') != 16) {
                        b = $$a[7];
                        bArr = $$a;
                        c = 301;
                    } else {
                        b = $$a[50];
                        bArr = $$a;
                        c = 22585;
                    }
                    Class<?> cls = Class.forName($$c(s, b, (byte) (-bArr[c])), true, (ClassLoader) setLayoutDirection);
                    int i8 = $10 + 39;
                    try {
                        $11 = i8 % 128;
                        int i9 = i8 % 2;
                        String $$c = $$c((short) 966, $$a[7], $$a[465]);
                        Class<?>[] clsArr = new Class[1];
                        try {
                            int i10 = $10;
                            int i11 = (i10 & 35) + (i10 | 35);
                            try {
                                $11 = i11 % 128;
                                int i12 = i11 % 2;
                                clsArr[0] = Integer.TYPE;
                                Integer num = (Integer) cls.getMethod($$c, clsArr).invoke(obj, objArr);
                                try {
                                    int i13 = ($10 + 82) - 1;
                                    try {
                                        $11 = i13 % 128;
                                        if (i13 % 2 != 0) {
                                            return num.intValue();
                                        }
                                        int intValue = num.intValue();
                                        obj2.hashCode();
                                        return intValue;
                                    } catch (RuntimeException e2) {
                                        throw e2;
                                    }
                                } catch (NullPointerException e3) {
                                    throw e3;
                                }
                            } catch (IllegalArgumentException e4) {
                                throw e4;
                            }
                        } catch (NumberFormatException e5) {
                            throw e5;
                        }
                    } catch (IndexOutOfBoundsException e6) {
                        throw e6;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } catch (IllegalStateException e7) {
                throw e7;
            }
        } catch (NullPointerException e8) {
            throw e8;
        }
    }

    public static int setIconTintList(Object obj) {
        Object[] objArr;
        int i;
        String $$c;
        Object obj2;
        try {
            int i2 = $10;
            int i3 = (i2 & 67) + (i2 | 67);
            try {
                $11 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object obj3 = setCheckedIconEnabled;
                    try {
                        int i5 = $10;
                        int i6 = ((i5 | 67) << 1) - (i5 ^ 67);
                        try {
                            $11 = i6 % 128;
                            try {
                                if ((i6 % 2 == 0 ? 'c' : (char) 22) != 22) {
                                    objArr = new Object[0];
                                    objArr[0] = obj;
                                    i = 25565;
                                } else {
                                    objArr = new Object[]{obj};
                                    i = 380;
                                }
                                short s = (short) i;
                                byte b = $$a[7];
                                byte[] bArr = $$a;
                                int i7 = $10 + 23;
                                $11 = i7 % 128;
                                if (!(i7 % 2 == 0)) {
                                    $$c = $$c(s, b, (byte) (-bArr[301]));
                                    obj2 = setLayoutDirection;
                                } else {
                                    $$c = $$c(s, b, (byte) (-bArr[301]));
                                    obj2 = setLayoutDirection;
                                }
                                Class<?> cls = Class.forName($$c, true, (ClassLoader) obj2);
                                short s2 = (short) 876;
                                byte[] bArr2 = $$a;
                                int i8 = $11 + 41;
                                $10 = i8 % 128;
                                int i9 = i8 % 2;
                                String $$c2 = $$c(s2, (byte) (-bArr2[13]), $$a[742]);
                                try {
                                    int i10 = $11;
                                    int i11 = (i10 ^ 29) + ((i10 & 29) << 1);
                                    try {
                                        $10 = i11 % 128;
                                        int i12 = i11 % 2;
                                        Method method = cls.getMethod($$c2, Object.class);
                                        try {
                                            int i13 = $10;
                                            int i14 = (i13 & 95) + (i13 | 95);
                                            try {
                                                $11 = i14 % 128;
                                                if (i14 % 2 != 0) {
                                                    return ((Integer) method.invoke(obj3, objArr)).intValue();
                                                }
                                                int intValue = ((Integer) method.invoke(obj3, objArr)).intValue();
                                                Object obj4 = null;
                                                obj4.hashCode();
                                                return intValue;
                                            } catch (IllegalStateException e) {
                                                throw e;
                                            }
                                        } catch (RuntimeException e2) {
                                            throw e2;
                                        }
                                    } catch (NullPointerException e3) {
                                        throw e3;
                                    }
                                } catch (IllegalArgumentException e4) {
                                    throw e4;
                                }
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause != null) {
                                    throw cause;
                                }
                                throw th;
                            }
                        } catch (ArrayStoreException e5) {
                            throw e5;
                        }
                    } catch (IllegalStateException e6) {
                        throw e6;
                    }
                } catch (NumberFormatException e7) {
                    throw e7;
                }
            } catch (IndexOutOfBoundsException e8) {
                throw e8;
            }
        } catch (IndexOutOfBoundsException e9) {
            throw e9;
        }
    }

    public static Object setY(char c, int i, int i2) {
        Object obj;
        byte b;
        byte b2;
        byte b3;
        byte b4;
        int i3 = $11;
        int i4 = (i3 & 7) + (i3 | 7);
        $10 = i4 % 128;
        if ((i4 % 2 != 0 ? ';' : 'c') != 'c') {
            obj = setCheckedIconEnabled;
            Object obj2 = null;
            obj2.hashCode();
        } else {
            obj = setCheckedIconEnabled;
        }
        int i5 = $11 + 105;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            short s = (short) 380;
            try {
                int i7 = $11 + 49;
                try {
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        b = $$a[6];
                        b2 = $$a[942];
                    } else {
                        b = $$a[7];
                        b2 = $$a[301];
                    }
                    Class<?> cls = Class.forName($$c(s, b, (byte) (-b2)), true, (ClassLoader) setLayoutDirection);
                    try {
                        int i8 = ($11 + 118) - 1;
                        try {
                            $10 = i8 % 128;
                            short s2 = (short) 966;
                            if ((i8 % 2 != 0 ? ']' : '(') != ']') {
                                b3 = $$a[7];
                                b4 = $$a[465];
                            } else {
                                b3 = $$a[48];
                                b4 = $$a[22176];
                            }
                            String $$c = $$c(s2, b3, b4);
                            Class<?>[] clsArr = new Class[3];
                            clsArr[0] = Character.TYPE;
                            int i9 = $10 + 57;
                            $11 = i9 % 128;
                            if (!(i9 % 2 == 0)) {
                                clsArr[1] = Integer.TYPE;
                                clsArr[2] = Integer.TYPE;
                            } else {
                                clsArr[0] = Integer.TYPE;
                                clsArr[4] = Integer.TYPE;
                            }
                            Method method = cls.getMethod($$c, clsArr);
                            try {
                                int i10 = $10 + 121;
                                $11 = i10 % 128;
                                int i11 = i10 % 2;
                                return method.invoke(obj, objArr);
                            } catch (NullPointerException e) {
                                throw e;
                            }
                        } catch (IllegalStateException e2) {
                            throw e2;
                        }
                    } catch (IndexOutOfBoundsException e3) {
                        throw e3;
                    }
                } catch (ClassCastException e4) {
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
    }

    private C0289md() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:(38:818|819|820|821|(0)|20|(0)(0)|23|(0)|25|26|(0)(0)|29|(0)(0)|(0)(0)|(0)|49|50|51|52|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|65|66|(0)(0)|69|(0)(0)|72|73|(0)|782|783)|18|(0)|20|(0)(0)|23|(0)|25|26|(0)(0)|29|(0)(0)|(0)(0)|(0)|49|50|51|52|53|(0)(0)|56|(0)(0)|59|(0)(0)|62|(0)(0)|65|66|(0)(0)|69|(0)(0)|72|73|(0)|782|783) */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0412, code lost:
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00b1, code lost:
        if (r6 != null) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:1035:0x17cf A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:1057:0x1d5f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1063:0x1a9b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1068:0x1d33 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1070:0x17b2 A[EDGE_INSN: B:1070:0x17b2->B:640:0x17b2 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0c88 A[Catch: all -> 0x0cb2, TryCatch #73 {all -> 0x0cb2, blocks: (B:341:0x0c62, B:349:0x0c81, B:351:0x0c88, B:352:0x0c89, B:332:0x0b05, B:330:0x0a9e), top: B:1049:0x0c62 }] */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0c89 A[Catch: all -> 0x0cb2, TryCatch #73 {all -> 0x0cb2, blocks: (B:341:0x0c62, B:349:0x0c81, B:351:0x0c88, B:352:0x0c89, B:332:0x0b05, B:330:0x0a9e), top: B:1049:0x0c62 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x1578 A[Catch: all -> 0x157a, TryCatch #85 {all -> 0x157a, blocks: (B:594:0x156b, B:600:0x1572, B:602:0x1578, B:603:0x1579, B:623:0x1634, B:625:0x163a, B:626:0x163b, B:647:0x17cf, B:654:0x17e6, B:615:0x15f4, B:617:0x15fa, B:618:0x15fb), top: B:1028:0x156b }] */
    /* JADX WARN: Removed duplicated region for block: B:603:0x1579 A[Catch: all -> 0x157a, TRY_LEAVE, TryCatch #85 {all -> 0x157a, blocks: (B:594:0x156b, B:600:0x1572, B:602:0x1578, B:603:0x1579, B:623:0x1634, B:625:0x163a, B:626:0x163b, B:647:0x17cf, B:654:0x17e6, B:615:0x15f4, B:617:0x15fa, B:618:0x15fb), top: B:1028:0x156b }] */
    /* JADX WARN: Removed duplicated region for block: B:636:0x17a9  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x17ac  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x17c6  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x17c9  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x17df A[Catch: all -> 0x1af5, Exception -> 0x1aff, TRY_ENTER, TRY_LEAVE, TryCatch #101 {all -> 0x1af5, blocks: (B:634:0x170c, B:640:0x17b2, B:652:0x17e2, B:651:0x17df), top: B:981:0x170c }] */
    /* JADX WARN: Removed duplicated region for block: B:654:0x17e6 A[Catch: all -> 0x157a, TRY_ENTER, TRY_LEAVE, TryCatch #85 {all -> 0x157a, blocks: (B:594:0x156b, B:600:0x1572, B:602:0x1578, B:603:0x1579, B:623:0x1634, B:625:0x163a, B:626:0x163b, B:647:0x17cf, B:654:0x17e6, B:615:0x15f4, B:617:0x15fa, B:618:0x15fb), top: B:1028:0x156b }] */
    /* JADX WARN: Removed duplicated region for block: B:657:0x17eb  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x17ed  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x17f1  */
    /* JADX WARN: Removed duplicated region for block: B:693:0x18db  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:705:0x193f  */
    /* JADX WARN: Removed duplicated region for block: B:706:0x1941  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:748:0x1ad5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x1b75  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x1b77  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x1b7d A[Catch: all -> 0x1b9b, TRY_ENTER, TryCatch #78 {all -> 0x1c9b, blocks: (B:764:0x1b11, B:807:0x1bec, B:809:0x1bf2, B:810:0x1bf3, B:840:0x1c6a, B:842:0x1c70, B:843:0x1c71, B:867:0x1ce7, B:869:0x1ced, B:870:0x1cee, B:387:0x0d8c, B:385:0x0d46, B:322:0x0a48, B:766:0x1b3b, B:773:0x1b7d, B:775:0x1b98, B:776:0x1b9a, B:774:0x1b8b, B:317:0x09f4, B:631:0x16bf, B:314:0x09a9, B:316:0x09bb, B:628:0x163e, B:610:0x1584, B:556:0x1436, B:554:0x13ec, B:390:0x0e0c), top: B:1041:0x0d8c }] */
    /* JADX WARN: Removed duplicated region for block: B:774:0x1b8b A[Catch: all -> 0x1b9b, TryCatch #78 {all -> 0x1c9b, blocks: (B:764:0x1b11, B:807:0x1bec, B:809:0x1bf2, B:810:0x1bf3, B:840:0x1c6a, B:842:0x1c70, B:843:0x1c71, B:867:0x1ce7, B:869:0x1ced, B:870:0x1cee, B:387:0x0d8c, B:385:0x0d46, B:322:0x0a48, B:766:0x1b3b, B:773:0x1b7d, B:775:0x1b98, B:776:0x1b9a, B:774:0x1b8b, B:317:0x09f4, B:631:0x16bf, B:314:0x09a9, B:316:0x09bb, B:628:0x163e, B:610:0x1584, B:556:0x1436, B:554:0x13ec, B:390:0x0e0c), top: B:1041:0x0d8c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cd A[Catch: Exception -> 0x1deb, TRY_LEAVE, TryCatch #108 {Exception -> 0x1deb, blocks: (B:3:0x0036, B:7:0x0062, B:76:0x02b9, B:77:0x02c6, B:78:0x02cd, B:90:0x033d, B:92:0x03ab, B:109:0x03fc, B:113:0x0405, B:117:0x040f, B:124:0x0428, B:894:0x1d42, B:883:0x1d23, B:893:0x1d3d, B:895:0x1d5f, B:886:0x1d29, B:60:0x020c, B:47:0x0197, B:80:0x02de, B:82:0x0319, B:897:0x1d76, B:899:0x1da9, B:901:0x1dc5, B:902:0x1dcb, B:67:0x0276, B:61:0x021c, B:64:0x0251, B:66:0x026a, B:65:0x025f, B:48:0x01bb), top: B:995:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:809:0x1bf2 A[Catch: all -> 0x1c9b, TryCatch #78 {all -> 0x1c9b, blocks: (B:764:0x1b11, B:807:0x1bec, B:809:0x1bf2, B:810:0x1bf3, B:840:0x1c6a, B:842:0x1c70, B:843:0x1c71, B:867:0x1ce7, B:869:0x1ced, B:870:0x1cee, B:387:0x0d8c, B:385:0x0d46, B:322:0x0a48, B:766:0x1b3b, B:773:0x1b7d, B:775:0x1b98, B:776:0x1b9a, B:774:0x1b8b, B:317:0x09f4, B:631:0x16bf, B:314:0x09a9, B:316:0x09bb, B:628:0x163e, B:610:0x1584, B:556:0x1436, B:554:0x13ec, B:390:0x0e0c), top: B:1041:0x0d8c }] */
    /* JADX WARN: Removed duplicated region for block: B:810:0x1bf3 A[Catch: all -> 0x1c9b, TryCatch #78 {all -> 0x1c9b, blocks: (B:764:0x1b11, B:807:0x1bec, B:809:0x1bf2, B:810:0x1bf3, B:840:0x1c6a, B:842:0x1c70, B:843:0x1c71, B:867:0x1ce7, B:869:0x1ced, B:870:0x1cee, B:387:0x0d8c, B:385:0x0d46, B:322:0x0a48, B:766:0x1b3b, B:773:0x1b7d, B:775:0x1b98, B:776:0x1b9a, B:774:0x1b8b, B:317:0x09f4, B:631:0x16bf, B:314:0x09a9, B:316:0x09bb, B:628:0x163e, B:610:0x1584, B:556:0x1436, B:554:0x13ec, B:390:0x0e0c), top: B:1041:0x0d8c }] */
    /* JADX WARN: Removed duplicated region for block: B:842:0x1c70 A[Catch: all -> 0x1c9b, TryCatch #78 {all -> 0x1c9b, blocks: (B:764:0x1b11, B:807:0x1bec, B:809:0x1bf2, B:810:0x1bf3, B:840:0x1c6a, B:842:0x1c70, B:843:0x1c71, B:867:0x1ce7, B:869:0x1ced, B:870:0x1cee, B:387:0x0d8c, B:385:0x0d46, B:322:0x0a48, B:766:0x1b3b, B:773:0x1b7d, B:775:0x1b98, B:776:0x1b9a, B:774:0x1b8b, B:317:0x09f4, B:631:0x16bf, B:314:0x09a9, B:316:0x09bb, B:628:0x163e, B:610:0x1584, B:556:0x1436, B:554:0x13ec, B:390:0x0e0c), top: B:1041:0x0d8c }] */
    /* JADX WARN: Removed duplicated region for block: B:843:0x1c71 A[Catch: all -> 0x1c9b, TryCatch #78 {all -> 0x1c9b, blocks: (B:764:0x1b11, B:807:0x1bec, B:809:0x1bf2, B:810:0x1bf3, B:840:0x1c6a, B:842:0x1c70, B:843:0x1c71, B:867:0x1ce7, B:869:0x1ced, B:870:0x1cee, B:387:0x0d8c, B:385:0x0d46, B:322:0x0a48, B:766:0x1b3b, B:773:0x1b7d, B:775:0x1b98, B:776:0x1b9a, B:774:0x1b8b, B:317:0x09f4, B:631:0x16bf, B:314:0x09a9, B:316:0x09bb, B:628:0x163e, B:610:0x1584, B:556:0x1436, B:554:0x13ec, B:390:0x0e0c), top: B:1041:0x0d8c }] */
    /* JADX WARN: Removed duplicated region for block: B:880:0x1d1e  */
    /* JADX WARN: Removed duplicated region for block: B:881:0x1d20  */
    /* JADX WARN: Removed duplicated region for block: B:883:0x1d23 A[Catch: Exception -> 0x1deb, TRY_ENTER, TryCatch #108 {Exception -> 0x1deb, blocks: (B:3:0x0036, B:7:0x0062, B:76:0x02b9, B:77:0x02c6, B:78:0x02cd, B:90:0x033d, B:92:0x03ab, B:109:0x03fc, B:113:0x0405, B:117:0x040f, B:124:0x0428, B:894:0x1d42, B:883:0x1d23, B:893:0x1d3d, B:895:0x1d5f, B:886:0x1d29, B:60:0x020c, B:47:0x0197, B:80:0x02de, B:82:0x0319, B:897:0x1d76, B:899:0x1da9, B:901:0x1dc5, B:902:0x1dcb, B:67:0x0276, B:61:0x021c, B:64:0x0251, B:66:0x026a, B:65:0x025f, B:48:0x01bb), top: B:995:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:889:0x1d36  */
    /* JADX WARN: Removed duplicated region for block: B:890:0x1d38  */
    /* JADX WARN: Removed duplicated region for block: B:893:0x1d3d A[Catch: Exception -> 0x1deb, TryCatch #108 {Exception -> 0x1deb, blocks: (B:3:0x0036, B:7:0x0062, B:76:0x02b9, B:77:0x02c6, B:78:0x02cd, B:90:0x033d, B:92:0x03ab, B:109:0x03fc, B:113:0x0405, B:117:0x040f, B:124:0x0428, B:894:0x1d42, B:883:0x1d23, B:893:0x1d3d, B:895:0x1d5f, B:886:0x1d29, B:60:0x020c, B:47:0x0197, B:80:0x02de, B:82:0x0319, B:897:0x1d76, B:899:0x1da9, B:901:0x1dc5, B:902:0x1dcb, B:67:0x0276, B:61:0x021c, B:64:0x0251, B:66:0x026a, B:65:0x025f, B:48:0x01bb), top: B:995:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:950:0x1945 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:957:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:975:0x00f0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:986:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x03e9  */
    static {
        /*
            Method dump skipped, instructions count: 7667
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0289md.<clinit>():void");
    }
}