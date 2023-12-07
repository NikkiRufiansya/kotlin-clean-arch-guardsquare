package o;

import android.graphics.Path;
import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class setIconifiedByDefault {
    static float[] MenuHostHelper$$ExternalSyntheticLambda1(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    public static Path setX(String str) {
        Path path = new Path();
        setIconTintList[] iconTintList = setIconTintList(str);
        if (iconTintList != null) {
            try {
                setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList, path);
                return path;
            } catch (RuntimeException e) {
                StringBuilder sb = new StringBuilder("Error in parsing ");
                sb.append(str);
                throw new RuntimeException(sb.toString(), e);
            }
        }
        return null;
    }

    public static setIconTintList[] setIconTintList(String str) {
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 0;
        while (i < str.length()) {
            while (i < str.length()) {
                char charAt = str.charAt(i);
                if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                    break;
                }
                i++;
            }
            String trim = str.substring(i2, i).trim();
            if (trim.length() > 0) {
                arrayList.add(new setIconTintList(trim.charAt(0), setY(trim)));
            }
            i2 = i;
            i++;
        }
        if (i - i2 == 1 && i2 < str.length()) {
            arrayList.add(new setIconTintList(str.charAt(i2), new float[0]));
        }
        return (setIconTintList[]) arrayList.toArray(new setIconTintList[arrayList.size()]);
    }

    public static setIconTintList[] setIconTintList(setIconTintList[] seticontintlistArr) {
        if (seticontintlistArr == null) {
            return null;
        }
        setIconTintList[] seticontintlistArr2 = new setIconTintList[seticontintlistArr.length];
        for (int i = 0; i < seticontintlistArr.length; i++) {
            seticontintlistArr2[i] = new setIconTintList(seticontintlistArr[i]);
        }
        return seticontintlistArr2;
    }

    public static boolean setIconTintList(setIconTintList[] seticontintlistArr, setIconTintList[] seticontintlistArr2) {
        if (seticontintlistArr == null || seticontintlistArr2 == null || seticontintlistArr.length != seticontintlistArr2.length) {
            return false;
        }
        for (int i = 0; i < seticontintlistArr.length; i++) {
            if (seticontintlistArr[i].setX != seticontintlistArr2[i].setX || seticontintlistArr[i].MenuHostHelper$$ExternalSyntheticLambda1.length != seticontintlistArr2[i].MenuHostHelper$$ExternalSyntheticLambda1.length) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005b A[Catch: NumberFormatException -> 0x007e, LOOP:1: B:9:0x002b->B:29:0x005b, LOOP_END, TryCatch #0 {NumberFormatException -> 0x007e, blocks: (B:6:0x0011, B:8:0x0025, B:9:0x002b, B:11:0x0031, B:17:0x0041, B:29:0x005b, B:21:0x0049, B:24:0x0050, B:30:0x005e, B:32:0x0064, B:33:0x0070, B:36:0x0076, B:37:0x0079), top: B:44:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0064 A[Catch: NumberFormatException -> 0x007e, TryCatch #0 {NumberFormatException -> 0x007e, blocks: (B:6:0x0011, B:8:0x0025, B:9:0x002b, B:11:0x0031, B:17:0x0041, B:29:0x005b, B:21:0x0049, B:24:0x0050, B:30:0x005e, B:32:0x0064, B:33:0x0070, B:36:0x0076, B:37:0x0079), top: B:44:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x005e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static float[] setY(java.lang.String r13) {
        /*
            r0 = 0
            char r1 = r13.charAt(r0)
            r2 = 122(0x7a, float:1.71E-43)
            if (r1 == r2) goto L98
            char r1 = r13.charAt(r0)
            r2 = 90
            if (r1 == r2) goto L98
            int r1 = r13.length()     // Catch: java.lang.NumberFormatException -> L7e
            float[] r1 = new float[r1]     // Catch: java.lang.NumberFormatException -> L7e
            o.setIconifiedByDefault$MenuHostHelper$$ExternalSyntheticLambda1 r2 = new o.setIconifiedByDefault$MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.NumberFormatException -> L7e
            r2.<init>()     // Catch: java.lang.NumberFormatException -> L7e
            int r3 = r13.length()     // Catch: java.lang.NumberFormatException -> L7e
            r4 = 1
            r5 = 1
            r6 = 0
        L23:
            if (r5 >= r3) goto L79
            r2.setIconTintList = r0     // Catch: java.lang.NumberFormatException -> L7e
            r7 = r5
            r8 = 0
            r9 = 0
            r10 = 0
        L2b:
            int r11 = r13.length()     // Catch: java.lang.NumberFormatException -> L7e
            if (r7 >= r11) goto L5e
            char r11 = r13.charAt(r7)     // Catch: java.lang.NumberFormatException -> L7e
            r12 = 32
            if (r11 == r12) goto L57
            r12 = 69
            if (r11 == r12) goto L55
            r12 = 101(0x65, float:1.42E-43)
            if (r11 == r12) goto L55
            switch(r11) {
                case 44: goto L57;
                case 45: goto L4c;
                case 46: goto L45;
                default: goto L44;
            }     // Catch: java.lang.NumberFormatException -> L7e
        L44:
            goto L53
        L45:
            if (r8 != 0) goto L49
            r8 = 1
            goto L53
        L49:
            r2.setIconTintList = r4     // Catch: java.lang.NumberFormatException -> L7e
            goto L57
        L4c:
            if (r7 == r5) goto L53
            if (r9 != 0) goto L53
            r2.setIconTintList = r4     // Catch: java.lang.NumberFormatException -> L7e
            goto L57
        L53:
            r9 = 0
            goto L59
        L55:
            r9 = 1
            goto L59
        L57:
            r9 = 0
            r10 = 1
        L59:
            if (r10 != 0) goto L5e
            int r7 = r7 + 1
            goto L2b
        L5e:
            r2.setX = r7     // Catch: java.lang.NumberFormatException -> L7e
            int r7 = r2.setX     // Catch: java.lang.NumberFormatException -> L7e
            if (r5 >= r7) goto L70
            java.lang.String r5 = r13.substring(r5, r7)     // Catch: java.lang.NumberFormatException -> L7e
            float r5 = java.lang.Float.parseFloat(r5)     // Catch: java.lang.NumberFormatException -> L7e
            r1[r6] = r5     // Catch: java.lang.NumberFormatException -> L7e
            int r6 = r6 + 1
        L70:
            boolean r5 = r2.setIconTintList     // Catch: java.lang.NumberFormatException -> L7e
            if (r5 == 0) goto L76
            r5 = r7
            goto L23
        L76:
            int r5 = r7 + 1
            goto L23
        L79:
            float[] r13 = MenuHostHelper$$ExternalSyntheticLambda1(r1, r6)     // Catch: java.lang.NumberFormatException -> L7e
            return r13
        L7e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error in parsing \""
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r13 = "\""
            r1.append(r13)
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r1 = r1.toString()
            r13.<init>(r1, r0)
            throw r13
        L98:
            float[] r13 = new float[r0]
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setIconifiedByDefault.setY(java.lang.String):float[]");
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        public float[] MenuHostHelper$$ExternalSyntheticLambda1;
        public char setX;

        setIconTintList(char c, float[] fArr) {
            this.setX = c;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = fArr;
        }

        setIconTintList(setIconTintList seticontintlist) {
            this.setX = seticontintlist.setX;
            float[] fArr = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setIconifiedByDefault.MenuHostHelper$$ExternalSyntheticLambda1(fArr, fArr.length);
        }

        public static void MenuHostHelper$$ExternalSyntheticLambda0(setIconTintList[] seticontintlistArr, Path path) {
            int i;
            int i2;
            float[] fArr;
            char c;
            int i3;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            float f9;
            float f10;
            float f11;
            float f12;
            float f13;
            float f14;
            float f15;
            float f16;
            float f17;
            setIconTintList[] seticontintlistArr2 = seticontintlistArr;
            float[] fArr2 = new float[6];
            char c2 = 'm';
            char c3 = 0;
            char c4 = 'm';
            int i4 = 0;
            while (i4 < seticontintlistArr2.length) {
                setIconTintList seticontintlist = seticontintlistArr2[i4];
                char c5 = seticontintlist.setX;
                float[] fArr3 = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1;
                float f18 = fArr2[c3];
                float f19 = fArr2[1];
                float f20 = fArr2[2];
                float f21 = fArr2[3];
                float f22 = fArr2[4];
                float f23 = fArr2[5];
                switch (c5) {
                    case 'A':
                    case 'a':
                        i = 7;
                        break;
                    case 'C':
                    case 'c':
                        i = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path.close();
                        path.moveTo(f22, f23);
                        f18 = f22;
                        f20 = f18;
                        f19 = f23;
                        f21 = f19;
                    default:
                        i = 2;
                        break;
                }
                float f24 = f22;
                float f25 = f23;
                float f26 = f18;
                float f27 = f19;
                int i5 = 0;
                while (i5 < fArr3.length) {
                    if (c5 != 'A') {
                        if (c5 != 'C') {
                            if (c5 == 'H') {
                                i2 = i5;
                                fArr = fArr3;
                                c = c5;
                                i3 = i4;
                                path.lineTo(fArr[i2], f27);
                                f26 = fArr[i2];
                            } else if (c5 == 'Q') {
                                i2 = i5;
                                fArr = fArr3;
                                c = c5;
                                i3 = i4;
                                int i6 = i2 + 1;
                                int i7 = i2 + 2;
                                int i8 = i2 + 3;
                                path.quadTo(fArr[i2], fArr[i6], fArr[i7], fArr[i8]);
                                f = fArr[i2];
                                f2 = fArr[i6];
                                f26 = fArr[i7];
                                f27 = fArr[i8];
                            } else if (c5 == 'V') {
                                i2 = i5;
                                fArr = fArr3;
                                c = c5;
                                i3 = i4;
                                path.lineTo(f26, fArr[i2]);
                                f27 = fArr[i2];
                            } else if (c5 != 'a') {
                                if (c5 != 'c') {
                                    if (c5 == 'h') {
                                        i2 = i5;
                                        path.rLineTo(fArr3[i2], 0.0f);
                                        f26 += fArr3[i2];
                                    } else if (c5 != 'q') {
                                        if (c5 == 'v') {
                                            i2 = i5;
                                            f8 = f27;
                                            path.rLineTo(0.0f, fArr3[i2]);
                                            f9 = fArr3[i2];
                                        } else if (c5 == 'L') {
                                            i2 = i5;
                                            int i9 = i2 + 1;
                                            path.lineTo(fArr3[i2], fArr3[i9]);
                                            f26 = fArr3[i2];
                                            f27 = fArr3[i9];
                                        } else if (c5 == 'M') {
                                            i2 = i5;
                                            f26 = fArr3[i2];
                                            f27 = fArr3[i2 + 1];
                                            if (i2 > 0) {
                                                path.lineTo(f26, f27);
                                            } else {
                                                path.moveTo(f26, f27);
                                                f25 = f27;
                                                f24 = f26;
                                            }
                                        } else if (c5 == 'S') {
                                            i2 = i5;
                                            float f28 = f27;
                                            float f29 = f26;
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f10 = (f28 * 2.0f) - f21;
                                                f11 = (f29 * 2.0f) - f20;
                                            } else {
                                                f11 = f29;
                                                f10 = f28;
                                            }
                                            int i10 = i2 + 1;
                                            int i11 = i2 + 2;
                                            int i12 = i2 + 3;
                                            path.cubicTo(f11, f10, fArr3[i2], fArr3[i10], fArr3[i11], fArr3[i12]);
                                            f4 = fArr3[i2];
                                            f7 = fArr3[i10];
                                            f26 = fArr3[i11];
                                            f27 = fArr3[i12];
                                            f21 = f7;
                                            f20 = f4;
                                        } else if (c5 == 'T') {
                                            i2 = i5;
                                            float f30 = f27;
                                            float f31 = f26;
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f12 = (f31 * 2.0f) - f20;
                                                f13 = (f30 * 2.0f) - f21;
                                            } else {
                                                f12 = f31;
                                                f13 = f30;
                                            }
                                            int i13 = i2 + 1;
                                            path.quadTo(f12, f13, fArr3[i2], fArr3[i13]);
                                            f21 = f13;
                                            f20 = f12;
                                            fArr = fArr3;
                                            c = c5;
                                            i3 = i4;
                                            f26 = fArr3[i2];
                                            f27 = fArr3[i13];
                                        } else if (c5 == 'l') {
                                            i2 = i5;
                                            f8 = f27;
                                            int i14 = i2 + 1;
                                            path.rLineTo(fArr3[i2], fArr3[i14]);
                                            f26 += fArr3[i2];
                                            f9 = fArr3[i14];
                                        } else if (c5 == c2) {
                                            i2 = i5;
                                            float f32 = fArr3[i2];
                                            f26 += f32;
                                            float f33 = fArr3[i2 + 1];
                                            f27 += f33;
                                            if (i2 > 0) {
                                                path.rLineTo(f32, f33);
                                            } else {
                                                path.rMoveTo(f32, f33);
                                                f25 = f27;
                                                f24 = f26;
                                            }
                                        } else if (c5 == 's') {
                                            if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                                f14 = f26 - f20;
                                                f15 = f27 - f21;
                                            } else {
                                                f14 = 0.0f;
                                                f15 = 0.0f;
                                            }
                                            int i15 = i5 + 1;
                                            int i16 = i5 + 2;
                                            int i17 = i5 + 3;
                                            i2 = i5;
                                            f3 = f27;
                                            float f34 = f26;
                                            path.rCubicTo(f14, f15, fArr3[i5], fArr3[i15], fArr3[i16], fArr3[i17]);
                                            f4 = fArr3[i2] + f34;
                                            f5 = fArr3[i15] + f3;
                                            f26 = f34 + fArr3[i16];
                                            f6 = fArr3[i17];
                                        } else if (c5 == 't') {
                                            if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                                f16 = f26 - f20;
                                                f17 = f27 - f21;
                                            } else {
                                                f17 = 0.0f;
                                                f16 = 0.0f;
                                            }
                                            int i18 = i5 + 1;
                                            path.rQuadTo(f16, f17, fArr3[i5], fArr3[i18]);
                                            float f35 = f16 + f26;
                                            f21 = f17 + f27;
                                            f26 = fArr3[i5] + f26;
                                            i2 = i5;
                                            f27 = fArr3[i18] + f27;
                                            fArr = fArr3;
                                            c = c5;
                                            i3 = i4;
                                            f20 = f35;
                                        } else {
                                            i2 = i5;
                                        }
                                        f27 = f8 + f9;
                                    } else {
                                        i2 = i5;
                                        f3 = f27;
                                        float f36 = f26;
                                        int i19 = i2 + 1;
                                        int i20 = i2 + 2;
                                        int i21 = i2 + 3;
                                        path.rQuadTo(fArr3[i2], fArr3[i19], fArr3[i20], fArr3[i21]);
                                        f4 = fArr3[i2] + f36;
                                        f5 = fArr3[i19] + f3;
                                        f26 = f36 + fArr3[i20];
                                        f6 = fArr3[i21];
                                    }
                                    fArr = fArr3;
                                    c = c5;
                                    i3 = i4;
                                } else {
                                    i2 = i5;
                                    f3 = f27;
                                    float f37 = f26;
                                    int i22 = i2 + 2;
                                    int i23 = i2 + 3;
                                    int i24 = i2 + 4;
                                    int i25 = i2 + 5;
                                    path.rCubicTo(fArr3[i2], fArr3[i2 + 1], fArr3[i22], fArr3[i23], fArr3[i24], fArr3[i25]);
                                    f4 = fArr3[i22] + f37;
                                    f5 = fArr3[i23] + f3;
                                    f26 = f37 + fArr3[i24];
                                    f6 = fArr3[i25];
                                }
                                f27 = f3 + f6;
                                f7 = f5;
                                f21 = f7;
                                f20 = f4;
                                fArr = fArr3;
                                c = c5;
                                i3 = i4;
                            } else {
                                i2 = i5;
                                float f38 = f27;
                                float f39 = f26;
                                int i26 = i2 + 5;
                                int i27 = i2 + 6;
                                fArr = fArr3;
                                c = c5;
                                i3 = i4;
                                setY(path, f39, f38, fArr3[i26] + f39, fArr3[i27] + f38, fArr3[i2], fArr3[i2 + 1], fArr3[i2 + 2], fArr3[i2 + 3] != 0.0f, fArr3[i2 + 4] != 0.0f);
                                f26 = f39 + fArr[i26];
                                f27 = f38 + fArr[i27];
                            }
                            i5 = i2 + i;
                            c2 = 'm';
                            c4 = c;
                            c5 = c4;
                            fArr3 = fArr;
                            i4 = i3;
                        } else {
                            i2 = i5;
                            fArr = fArr3;
                            c = c5;
                            i3 = i4;
                            int i28 = i2 + 2;
                            int i29 = i2 + 3;
                            int i30 = i2 + 4;
                            int i31 = i2 + 5;
                            path.cubicTo(fArr[i2], fArr[i2 + 1], fArr[i28], fArr[i29], fArr[i30], fArr[i31]);
                            f26 = fArr[i30];
                            f27 = fArr[i31];
                            f = fArr[i28];
                            f2 = fArr[i29];
                        }
                        f20 = f;
                        f21 = f2;
                        i5 = i2 + i;
                        c2 = 'm';
                        c4 = c;
                        c5 = c4;
                        fArr3 = fArr;
                        i4 = i3;
                    } else {
                        i2 = i5;
                        fArr = fArr3;
                        c = c5;
                        i3 = i4;
                        int i32 = i2 + 5;
                        int i33 = i2 + 6;
                        setY(path, f26, f27, fArr[i32], fArr[i33], fArr[i2], fArr[i2 + 1], fArr[i2 + 2], fArr[i2 + 3] != 0.0f, fArr[i2 + 4] != 0.0f);
                        f26 = fArr[i32];
                        f27 = fArr[i33];
                    }
                    f21 = f27;
                    f20 = f26;
                    i5 = i2 + i;
                    c2 = 'm';
                    c4 = c;
                    c5 = c4;
                    fArr3 = fArr;
                    i4 = i3;
                }
                int i34 = i4;
                fArr2[0] = f26;
                fArr2[1] = f27;
                fArr2[2] = f20;
                fArr2[3] = f21;
                fArr2[4] = f24;
                fArr2[5] = f25;
                i4 = i34 + 1;
                c4 = seticontintlistArr[i34].setX;
                c2 = 'm';
                c3 = 0;
                seticontintlistArr2 = seticontintlistArr;
            }
        }

        private static void setY(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            float f8 = f;
            float f9 = f3;
            float f10 = f5;
            float f11 = f6;
            float f12 = f7;
            while (true) {
                double radians = Math.toRadians(f12);
                double cos = Math.cos(radians);
                double sin = Math.sin(radians);
                double d3 = f8;
                double d4 = f2;
                double d5 = f10;
                double d6 = ((d3 * cos) + (d4 * sin)) / d5;
                double d7 = d3;
                float f13 = f10;
                double d8 = f11;
                double d9 = (((-f8) * sin) + (d4 * cos)) / d8;
                double d10 = d4;
                double d11 = f4;
                double d12 = ((f9 * cos) + (d11 * sin)) / d5;
                double d13 = (((-f9) * sin) + (d11 * cos)) / d8;
                double d14 = d6 - d12;
                double d15 = d9 - d13;
                double d16 = (d6 + d12) / 2.0d;
                double d17 = (d9 + d13) / 2.0d;
                double d18 = (d14 * d14) + (d15 * d15);
                if (d18 == 0.0d) {
                    Log.w("PathParser", " Points are coincident");
                    return;
                }
                double d19 = (1.0d / d18) - 0.25d;
                if (d19 < 0.0d) {
                    StringBuilder sb = new StringBuilder("Points are too far apart ");
                    sb.append(d18);
                    Log.w("PathParser", sb.toString());
                    float sqrt = (float) (Math.sqrt(d18) / 1.99999d);
                    f10 = f13 * sqrt;
                    f11 *= sqrt;
                    f8 = f;
                    f9 = f3;
                    f12 = f7;
                } else {
                    double sqrt2 = Math.sqrt(d19);
                    double d20 = d14 * sqrt2;
                    double d21 = sqrt2 * d15;
                    if (z == z2) {
                        d = d16 - d21;
                        d2 = d17 + d20;
                    } else {
                        d = d16 + d21;
                        d2 = d17 - d20;
                    }
                    double atan2 = Math.atan2(d9 - d2, d6 - d);
                    double atan22 = Math.atan2(d13 - d2, d12 - d) - atan2;
                    int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
                    if (z2 != (i >= 0)) {
                        atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
                    }
                    double d22 = d * d5;
                    double d23 = d2 * d8;
                    double d24 = (d22 * cos) - (d23 * sin);
                    double d25 = (d22 * sin) + (d23 * cos);
                    int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
                    double cos2 = Math.cos(radians);
                    double sin2 = Math.sin(radians);
                    double cos3 = Math.cos(atan2);
                    double sin3 = Math.sin(atan2);
                    double d26 = -d5;
                    double d27 = d26 * cos2;
                    double d28 = d8 * sin2;
                    double d29 = d26 * sin2;
                    double d30 = d8 * cos2;
                    double d31 = atan22 / ceil;
                    double d32 = (sin3 * d27) - (cos3 * d28);
                    double d33 = (sin3 * d29) + (cos3 * d30);
                    int i2 = 0;
                    while (i2 < ceil) {
                        double d34 = atan2 + d31;
                        double sin4 = Math.sin(d34);
                        double cos4 = Math.cos(d34);
                        double d35 = d31;
                        double d36 = (d24 + ((d5 * cos2) * cos4)) - (d28 * sin4);
                        double d37 = cos2;
                        double d38 = d25 + (d5 * sin2 * cos4) + (d30 * sin4);
                        double d39 = (d27 * sin4) - (d28 * cos4);
                        double d40 = (sin4 * d29) + (cos4 * d30);
                        double d41 = d34 - atan2;
                        double tan = Math.tan(d41 / 2.0d);
                        double sin5 = (Math.sin(d41) * (Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d)) / 3.0d;
                        path.rLineTo(0.0f, 0.0f);
                        path.cubicTo((float) (d7 + (d32 * sin5)), (float) (d10 + (d33 * sin5)), (float) (d36 - (sin5 * d39)), (float) (d38 - (sin5 * d40)), (float) d36, (float) d38);
                        i2++;
                        d29 = d29;
                        d7 = d36;
                        ceil = ceil;
                        d10 = d38;
                        atan2 = d34;
                        d33 = d40;
                        d32 = d39;
                        d31 = d35;
                        cos2 = d37;
                    }
                    return;
                }
            }
        }
    }
}