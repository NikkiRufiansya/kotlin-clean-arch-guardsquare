package o;

import o.setExpandedTitleMarginEnd;

/* loaded from: classes.dex */
public final class setExpandedTitleMarginEnd {
    private static final setX setY;

    /* loaded from: classes.dex */
    public static abstract class setX {
        abstract int MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence, byte[] bArr, int i, int i2);

        abstract String MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr, int i, int i2);

        abstract int setX(byte[] bArr, int i, int i2);
    }

    public static /* synthetic */ int setIconTintList(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static int setIconTintList(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static /* synthetic */ int setX(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static /* synthetic */ int setY(int i, int i2, int i3) {
        return setIconTintList(i, i2, i3);
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr) {
        return setY.setX(bArr, 0, bArr.length) == 0;
    }

    public static boolean setY(byte[] bArr, int i, int i2) {
        return setY.setX(bArr, i, i2) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList extends IllegalArgumentException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public setIconTintList(int r3, int r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = " of "
                r0.append(r3)
                r0.append(r4)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setExpandedTitleMarginEnd.setIconTintList.<init>(int, int):void");
        }
    }

    public static int setY(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) < 65536) {
                                throw new setIconTintList(i2, length2);
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        StringBuilder sb = new StringBuilder("UTF-8 length does not fit in int: ");
        sb.append(i3 + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int setY(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return setY.MenuHostHelper$$ExternalSyntheticLambda0(charSequence, bArr, i, i2);
    }

    public static String setX(byte[] bArr, int i, int i2) {
        return setY.MenuHostHelper$$ExternalSyntheticLambda0(bArr, i, i2);
    }

    static {
        boolean z;
        z = WindowInsetsCompat$Impl20.setX;
        setY = (!(z && WindowInsetsCompat$Impl20.setX()) || setMenu.MenuHostHelper$$ExternalSyntheticLambda1()) ? new setX() { // from class: o.setExpandedTitleMarginEnd$MenuHostHelper$$ExternalSyntheticLambda0
            @Override // o.setExpandedTitleMarginEnd.setX
            final String MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr, int i, int i2) {
                if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                    int i3 = i + i2;
                    char[] cArr = new char[i2];
                    int i4 = 0;
                    while (i < i3) {
                        byte b = bArr[i];
                        if (!(b >= 0)) {
                            break;
                        }
                        i++;
                        cArr[i4] = (char) b;
                        i4++;
                    }
                    int i5 = i4;
                    while (i < i3) {
                        int i6 = i + 1;
                        byte b2 = bArr[i];
                        if (b2 >= 0) {
                            cArr[i5] = (char) b2;
                            i = i6;
                            i5++;
                            while (i < i3) {
                                byte b3 = bArr[i];
                                if (b3 >= 0) {
                                    i++;
                                    cArr[i5] = (char) b3;
                                    i5++;
                                }
                            }
                        } else {
                            if (!(b2 < -32)) {
                                if (b2 < -16) {
                                    if (i6 >= i3 - 1) {
                                        throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
                                    }
                                    int i7 = i6 + 1;
                                    setExpandedTitleMarginEnd.setY.setIconTintList(b2, bArr[i6], bArr[i7], cArr, i5);
                                    i = i7 + 1;
                                } else if (i6 >= i3 - 2) {
                                    throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
                                } else {
                                    int i8 = i6 + 1;
                                    int i9 = i8 + 1;
                                    setExpandedTitleMarginEnd.setY.setX(b2, bArr[i6], bArr[i8], bArr[i9], cArr, i5);
                                    i = i9 + 1;
                                    i5 = i5 + 1 + 1;
                                }
                            } else if (i6 >= i3) {
                                throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
                            } else {
                                setExpandedTitleMarginEnd.setY.setY(b2, bArr[i6], cArr, i5);
                                i = i6 + 1;
                            }
                            i5++;
                        }
                    }
                    return new String(cArr, 0, i5);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
                return r10 + r0;
             */
            @Override // o.setExpandedTitleMarginEnd.setX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            final int MenuHostHelper$$ExternalSyntheticLambda0(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
                /*
                    Method dump skipped, instructions count: 251
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setExpandedTitleMarginEnd$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(java.lang.CharSequence, byte[], int, int):int");
            }

            @Override // o.setExpandedTitleMarginEnd.setX
            final int setX(byte[] bArr, int i, int i2) {
                while (i < i2 && bArr[i] >= 0) {
                    i++;
                }
                if (i >= i2) {
                    return 0;
                }
                while (i < i2) {
                    int i3 = i + 1;
                    byte b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 >= i2) {
                                return b;
                            }
                            if (b >= -62) {
                                i = i3 + 1;
                                if (bArr[i3] > -65) {
                                }
                            }
                            return -1;
                        } else if (b >= -16) {
                            if (i3 >= i2 - 2) {
                                return setExpandedTitleMarginEnd.MenuHostHelper$$ExternalSyntheticLambda1(bArr, i3, i2);
                            }
                            int i4 = i3 + 1;
                            byte b2 = bArr[i3];
                            if (b2 <= -65 && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                                int i5 = i4 + 1;
                                if (bArr[i4] <= -65) {
                                    i3 = i5 + 1;
                                    if (bArr[i5] > -65) {
                                    }
                                }
                            }
                            return -1;
                        } else if (i3 >= i2 - 1) {
                            return setExpandedTitleMarginEnd.MenuHostHelper$$ExternalSyntheticLambda1(bArr, i3, i2);
                        } else {
                            int i6 = i3 + 1;
                            byte b3 = bArr[i3];
                            if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                                i = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                            return -1;
                        }
                    }
                    i = i3;
                }
                return 0;
            }
        } : new setX() { // from class: o.setExpandedTitleMarginEnd$MenuHostHelper$$ExternalSyntheticLambda1
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0058, code lost:
                return -1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
                return -1;
             */
            @Override // o.setExpandedTitleMarginEnd.setX
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            final int setX(byte[] r13, int r14, int r15) {
                /*
                    Method dump skipped, instructions count: 208
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.setExpandedTitleMarginEnd$MenuHostHelper$$ExternalSyntheticLambda1.setX(byte[], int, int):int");
            }

            @Override // o.setExpandedTitleMarginEnd.setX
            final String MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr, int i, int i2) {
                byte x;
                byte x2;
                byte x3;
                byte x4;
                byte x5;
                byte x6;
                byte x7;
                byte x8;
                byte x9;
                if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                    int i3 = i + i2;
                    char[] cArr = new char[i2];
                    int i4 = 0;
                    while (i < i3) {
                        x9 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + i);
                        if (!(x9 >= 0)) {
                            break;
                        }
                        i++;
                        cArr[i4] = (char) x9;
                        i4++;
                    }
                    int i5 = i4;
                    while (i < i3) {
                        int i6 = i + 1;
                        x = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + i);
                        if (x >= 0) {
                            cArr[i5] = (char) x;
                            i = i6;
                            i5++;
                            while (i < i3) {
                                x2 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + i);
                                if (x2 >= 0) {
                                    i++;
                                    cArr[i5] = (char) x2;
                                    i5++;
                                }
                            }
                        } else {
                            if (!(x < -32)) {
                                if (x < -16) {
                                    if (i6 < i3 - 1) {
                                        int i7 = i6 + 1;
                                        x4 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + i6);
                                        x5 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + i7);
                                        setExpandedTitleMarginEnd.setY.setIconTintList(x, x4, x5, cArr, i5);
                                        i = i7 + 1;
                                    } else {
                                        throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
                                    }
                                } else if (i6 < i3 - 2) {
                                    int i8 = i6 + 1;
                                    x6 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + i6);
                                    int i9 = i8 + 1;
                                    x7 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + i8);
                                    x8 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + i9);
                                    setExpandedTitleMarginEnd.setY.setX(x, x6, x7, x8, cArr, i5);
                                    i = i9 + 1;
                                    i5 = i5 + 1 + 1;
                                } else {
                                    throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
                                }
                            } else if (i6 < i3) {
                                x3 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + i6);
                                setExpandedTitleMarginEnd.setY.setY(x, x3, cArr, i5);
                                i = i6 + 1;
                            } else {
                                throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
                            }
                            i5++;
                        }
                    }
                    return new String(cArr, 0, i5);
                }
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }

            @Override // o.setExpandedTitleMarginEnd.setX
            final int MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence, byte[] bArr, int i, int i2) {
                char c;
                long j;
                long j2;
                long j3;
                int i3;
                long j4;
                char charAt;
                long j5 = i;
                long j6 = i2 + j5;
                int length = charSequence.length();
                if (length > i2 || bArr.length - i2 < i) {
                    StringBuilder sb = new StringBuilder("Failed writing ");
                    sb.append(charSequence.charAt(length - 1));
                    sb.append(" at index ");
                    sb.append(i + i2);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                }
                int i4 = 0;
                while (true) {
                    c = 128;
                    j = 1;
                    if (i4 >= length || (charAt = charSequence.charAt(i4)) >= 128) {
                        break;
                    }
                    WindowInsetsCompat$Impl20.setY(bArr, j5, (byte) charAt);
                    i4++;
                    j5++;
                }
                if (i4 == length) {
                    return (int) j5;
                }
                while (i4 < length) {
                    char charAt2 = charSequence.charAt(i4);
                    if (charAt2 >= c || j5 >= j6) {
                        if (charAt2 < 2048 && j5 <= j6 - 2) {
                            long j7 = j5 + j;
                            WindowInsetsCompat$Impl20.setY(bArr, j5, (byte) ((charAt2 >>> 6) | 960));
                            WindowInsetsCompat$Impl20.setY(bArr, j7, (byte) ((charAt2 & '?') | c));
                            j4 = 1;
                            j3 = j7 + 1;
                        } else if ((charAt2 >= 55296 && 57343 >= charAt2) || j5 > j6 - 3) {
                            if (j5 <= j6 - 4) {
                                int i5 = i4 + 1;
                                if (i5 != length) {
                                    char charAt3 = charSequence.charAt(i5);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        long j8 = j5 + 1;
                                        WindowInsetsCompat$Impl20.setY(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                        long j9 = j8 + 1;
                                        WindowInsetsCompat$Impl20.setY(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                        long j10 = j9 + 1;
                                        WindowInsetsCompat$Impl20.setY(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                        j4 = 1;
                                        j3 = j10 + 1;
                                        WindowInsetsCompat$Impl20.setY(bArr, j10, (byte) ((codePoint & 63) | 128));
                                        i4 = i5;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                throw new setExpandedTitleMarginEnd.setIconTintList(i4 - 1, length);
                            } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                                throw new setExpandedTitleMarginEnd.setIconTintList(i4, length);
                            } else {
                                StringBuilder sb2 = new StringBuilder("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(j5);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                        } else {
                            long j11 = j5 + 1;
                            WindowInsetsCompat$Impl20.setY(bArr, j5, (byte) ((charAt2 >>> '\f') | 480));
                            long j12 = j11 + 1;
                            WindowInsetsCompat$Impl20.setY(bArr, j11, (byte) (((charAt2 >>> 6) & 63) | 128));
                            WindowInsetsCompat$Impl20.setY(bArr, j12, (byte) ((charAt2 & '?') | 128));
                            j2 = 1;
                            j3 = j12 + 1;
                        }
                        i4++;
                        c = 128;
                        long j13 = j4;
                        j5 = j3;
                        j = j13;
                    } else {
                        WindowInsetsCompat$Impl20.setY(bArr, j5, (byte) charAt2);
                        j2 = j;
                        j3 = j5 + j;
                    }
                    j4 = j2;
                    i4++;
                    c = 128;
                    long j132 = j4;
                    j5 = j3;
                    j = j132;
                }
                return (int) j5;
            }

            private static int MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr, int i, long j, int i2) {
                byte x;
                byte x2;
                byte x3;
                if (i2 != 0) {
                    if (i2 == 1) {
                        x = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + j);
                        return setExpandedTitleMarginEnd.setX(i, x);
                    } else if (i2 == 2) {
                        x2 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + j);
                        x3 = WindowInsetsCompat$Impl20.setUiOptions.setX(bArr, WindowInsetsCompat$Impl20.setIconTintList + j + 1);
                        return setExpandedTitleMarginEnd.setY(i, x2, x3);
                    } else {
                        throw new AssertionError();
                    }
                }
                return setExpandedTitleMarginEnd.setIconTintList(i);
            }
        };
    }

    /* loaded from: classes.dex */
    static class setY {
        public static /* synthetic */ void setX(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
            if (!(b2 > -65) && (((b << 28) + (b2 + 112)) >> 30) == 0) {
                if (!(b3 > -65)) {
                    if (!(b4 > -65)) {
                        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
                        cArr[i] = (char) ((i2 >>> 10) + 55232);
                        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
                        return;
                    }
                }
            }
            throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
        }

        public static /* synthetic */ void setY(byte b, byte b2, char[] cArr, int i) {
            if (b >= -62) {
                if (!(b2 > -65)) {
                    cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
                    return;
                }
            }
            throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
        }

        public static /* synthetic */ void setIconTintList(byte b, byte b2, byte b3, char[] cArr, int i) {
            if (!(b2 > -65) && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                if (!(b3 > -65)) {
                    cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
                    return;
                }
            }
            throw new setProgressDrawableTiled("Protocol message had invalid UTF-8.");
        }
    }

    public static /* synthetic */ int MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        } else if (i3 != 1) {
            if (i3 == 2) {
                return setIconTintList(b, bArr[i], bArr[i + 1]);
            }
            throw new AssertionError();
        } else {
            byte b2 = bArr[i];
            if (b > -12 || b2 > -65) {
                return -1;
            }
            return b ^ (b2 << 8);
        }
    }
}