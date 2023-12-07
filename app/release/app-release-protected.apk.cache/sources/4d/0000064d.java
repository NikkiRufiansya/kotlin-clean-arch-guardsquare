package o;

/* loaded from: classes.dex */
public final class jf {
    private static final setIconTintList setX;

    /* loaded from: classes.dex */
    public static abstract class setIconTintList {
        abstract int MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr, int i, int i2);

        abstract int setIconTintList(CharSequence charSequence, byte[] bArr, int i, int i2);
    }

    public static int setX(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    static /* synthetic */ int setY(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    static /* synthetic */ int setY(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static boolean setIconTintList(byte[] bArr) {
        return setX.MenuHostHelper$$ExternalSyntheticLambda1(bArr, 0, bArr.length) == 0;
    }

    public static boolean setY(byte[] bArr, int i, int i2) {
        return setX.MenuHostHelper$$ExternalSyntheticLambda1(bArr, i, i2) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY extends IllegalArgumentException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public setY(int r3, int r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: o.jf.setY.<init>(int, int):void");
        }
    }

    public static int setIconTintList(CharSequence charSequence) {
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
                                throw new setY(i2, length2);
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

    public static int setIconTintList(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return setX.setIconTintList(charSequence, bArr, i, i2);
    }

    /* loaded from: classes.dex */
    static final class setX extends setIconTintList {
        setX() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:148:0x008d, code lost:
            return -1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:176:0x00e2, code lost:
            return -1;
         */
        @Override // o.jf.setIconTintList
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final int MenuHostHelper$$ExternalSyntheticLambda1(byte[] r19, int r20, int r21) {
            /*
                Method dump skipped, instructions count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.jf.setX.MenuHostHelper$$ExternalSyntheticLambda1(byte[], int, int):int");
        }

        @Override // o.jf.setIconTintList
        final int setIconTintList(CharSequence charSequence, byte[] bArr, int i, int i2) {
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
                ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j5, (byte) charAt);
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
                        ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j5, (byte) ((charAt2 >>> 6) | 960));
                        ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j7, (byte) ((charAt2 & '?') | c));
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
                                    ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j5, (byte) ((codePoint >>> 18) | 240));
                                    long j9 = j8 + 1;
                                    ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                    long j10 = j9 + 1;
                                    ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                    j4 = 1;
                                    j3 = j10 + 1;
                                    ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j10, (byte) ((codePoint & 63) | 128));
                                    i4 = i5;
                                } else {
                                    i4 = i5;
                                }
                            }
                            throw new setY(i4 - 1, length);
                        } else if (55296 <= charAt2 && charAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                            throw new setY(i4, length);
                        } else {
                            StringBuilder sb2 = new StringBuilder("Failed writing ");
                            sb2.append(charAt2);
                            sb2.append(" at index ");
                            sb2.append(j5);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                    } else {
                        long j11 = j5 + 1;
                        ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j5, (byte) ((charAt2 >>> '\f') | 480));
                        long j12 = j11 + 1;
                        ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j11, (byte) (((charAt2 >>> 6) & 63) | 128));
                        ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j12, (byte) ((charAt2 & '?') | 128));
                        j2 = 1;
                        j3 = j12 + 1;
                    }
                    i4++;
                    c = 128;
                    long j13 = j4;
                    j5 = j3;
                    j = j13;
                } else {
                    ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr, ji.setIconTintList + j5, (byte) charAt2);
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

        private static int setX(byte[] bArr, int i, long j, int i2) {
            byte x;
            byte x2;
            byte x3;
            if (i2 != 0) {
                if (i2 == 1) {
                    x = ji.setNavigationOnClickListener.setX(bArr, ji.setIconTintList + j);
                    return jf.setY(i, x);
                } else if (i2 == 2) {
                    x2 = ji.setNavigationOnClickListener.setX(bArr, ji.setIconTintList + j);
                    x3 = ji.setNavigationOnClickListener.setX(bArr, ji.setIconTintList + j + 1);
                    return jf.setX(i, x2, x3);
                } else {
                    throw new AssertionError();
                }
            }
            return jf.setY(i);
        }
    }

    static {
        boolean z;
        setIconTintList seticontintlist;
        boolean z2;
        if (ji.setIconTintList()) {
            z2 = ji.MenuHostHelper$$ExternalSyntheticLambda1;
            if (z2) {
                z = true;
                if (!z && !hV.setX()) {
                    seticontintlist = new setX();
                } else {
                    seticontintlist = new setIconTintList() { // from class: o.jf$MenuHostHelper$$ExternalSyntheticLambda1
                        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
                            return r10 + r0;
                         */
                        @Override // o.jf.setIconTintList
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        final int setIconTintList(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
                            /*
                                Method dump skipped, instructions count: 251
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: o.jf$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(java.lang.CharSequence, byte[], int, int):int");
                        }

                        @Override // o.jf.setIconTintList
                        final int MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr, int i, int i2) {
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
                                            return jf.setX(bArr, i3, i2);
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
                                        return jf.setX(bArr, i3, i2);
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
                    };
                }
                setX = seticontintlist;
            }
        }
        z = false;
        if (!z) {
        }
        seticontintlist = new setIconTintList() { // from class: o.jf$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // o.jf.setIconTintList
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            final int setIconTintList(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
                /*
                    Method dump skipped, instructions count: 251
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: o.jf$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(java.lang.CharSequence, byte[], int, int):int");
            }

            @Override // o.jf.setIconTintList
            final int MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr, int i, int i2) {
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
                                return jf.setX(bArr, i3, i2);
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
                            return jf.setX(bArr, i3, i2);
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
        };
        setX = seticontintlist;
    }

    public static /* synthetic */ int setX(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            if (b > -12) {
                return -1;
            }
            return b;
        } else if (i3 != 1) {
            if (i3 == 2) {
                return setX(b, bArr[i], bArr[i + 1]);
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