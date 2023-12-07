package o;

/* renamed from: o.ri  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0429ri implements Comparable<C0429ri> {
    private static final long MenuHostHelper$$ExternalSyntheticLambda0;
    private static final long MenuHostHelper$$ExternalSyntheticLambda1;
    public static final ri$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList = new ri$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    public final long setY;

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda1(long j) {
        return j > 0;
    }

    public static final /* synthetic */ C0429ri setIconTintList(long j) {
        return new C0429ri(j);
    }

    public final int hashCode() {
        long j = this.setY;
        return (int) (j ^ (j >>> 32));
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(C0429ri c0429ri) {
        return setIconTintList(this.setY, c0429ri.setY);
    }

    private /* synthetic */ C0429ri(long j) {
        this.setY = j;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: MarkMethodsForInline
        java.lang.IndexOutOfBoundsException: Index: 0
        	at java.base/java.util.Collections$EmptyList.get(Collections.java:4807)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:104)
        	at jadx.core.dex.visitors.MarkMethodsForInline.isSyntheticAccessPattern(MarkMethodsForInline.java:117)
        	at jadx.core.dex.visitors.MarkMethodsForInline.inlineMth(MarkMethodsForInline.java:86)
        	at jadx.core.dex.visitors.MarkMethodsForInline.process(MarkMethodsForInline.java:53)
        	at jadx.core.dex.visitors.MarkMethodsForInline.visit(MarkMethodsForInline.java:37)
        */
    public static long MenuHostHelper$$ExternalSyntheticLambda0(long r0) {
        /*
            o.C0428rh.MenuHostHelper$$ExternalSyntheticLambda1()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0429ri.MenuHostHelper$$ExternalSyntheticLambda0(long):long");
    }

    public static int setIconTintList(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0) {
            if ((((int) j3) & 1) != 0) {
                int i = (((int) j) & 1) - (((int) j2) & 1);
                return j < 0 ? -i : i;
            }
        }
        return pN.MenuHostHelper$$ExternalSyntheticLambda0(j, j2);
    }

    private static long setIconTintList(long j, EnumC0425re enumC0425re) {
        pN.setY(enumC0425re, "");
        if (j == MenuHostHelper$$ExternalSyntheticLambda1) {
            return Long.MAX_VALUE;
        }
        if (j == MenuHostHelper$$ExternalSyntheticLambda0) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        EnumC0425re enumC0425re2 = (((int) j) & 1) == 0 ? EnumC0425re.NANOSECONDS : EnumC0425re.MILLISECONDS;
        pN.setY(enumC0425re2, "");
        pN.setY(enumC0425re, "");
        return enumC0425re.setUiOptions.convert(j2, enumC0425re2.setUiOptions);
    }

    public final String toString() {
        long j;
        int i;
        long j2 = this.setY;
        int i2 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i2 == 0) {
            return "0s";
        }
        if (j2 == MenuHostHelper$$ExternalSyntheticLambda1) {
            return "Infinity";
        }
        if (j2 == MenuHostHelper$$ExternalSyntheticLambda0) {
            return "-Infinity";
        }
        int i3 = 0;
        boolean z = i2 < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (i2 < 0) {
            j2 = (((int) j2) & 1) + ((-(j2 >> 1)) << 1);
            C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        long iconTintList = setIconTintList(j2, EnumC0425re.DAYS);
        int iconTintList2 = (j2 > MenuHostHelper$$ExternalSyntheticLambda1 ? 1 : (j2 == MenuHostHelper$$ExternalSyntheticLambda1 ? 0 : -1)) == 0 || (j2 > MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : (j2 == MenuHostHelper$$ExternalSyntheticLambda0 ? 0 : -1)) == 0 ? 0 : (int) (setIconTintList(j2, EnumC0425re.HOURS) % 24);
        int iconTintList3 = (j2 > MenuHostHelper$$ExternalSyntheticLambda1 ? 1 : (j2 == MenuHostHelper$$ExternalSyntheticLambda1 ? 0 : -1)) == 0 || (j2 > MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : (j2 == MenuHostHelper$$ExternalSyntheticLambda0 ? 0 : -1)) == 0 ? 0 : (int) (setIconTintList(j2, EnumC0425re.MINUTES) % 60);
        int iconTintList4 = (j2 > MenuHostHelper$$ExternalSyntheticLambda1 ? 1 : (j2 == MenuHostHelper$$ExternalSyntheticLambda1 ? 0 : -1)) == 0 || (j2 > MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : (j2 == MenuHostHelper$$ExternalSyntheticLambda0 ? 0 : -1)) == 0 ? 0 : (int) (setIconTintList(j2, EnumC0425re.SECONDS) % 60);
        if (j2 == MenuHostHelper$$ExternalSyntheticLambda1 || j2 == MenuHostHelper$$ExternalSyntheticLambda0) {
            i = 0;
        } else {
            if ((((int) j2) & 1) == 1) {
                j = ((j2 >> 1) % 1000) * 1000000;
            } else {
                j = (j2 >> 1) % 1000000000;
            }
            i = (int) j;
        }
        boolean z2 = iconTintList != 0;
        boolean z3 = iconTintList2 != 0;
        boolean z4 = iconTintList3 != 0;
        boolean z5 = (iconTintList4 == 0 && i == 0) ? false : true;
        if (z2) {
            sb.append(iconTintList);
            sb.append('d');
            i3 = 1;
        }
        if (z3 || (z2 && (z4 || z5))) {
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(iconTintList2);
            sb.append('h');
            i3++;
        }
        if (z4 || (z5 && (z3 || z2))) {
            if (i3 > 0) {
                sb.append(' ');
            }
            sb.append(iconTintList3);
            sb.append('m');
            i3++;
        }
        if (z5) {
            if (i3 > 0) {
                sb.append(' ');
            }
            if (iconTintList4 != 0 || z2 || z3 || z4) {
                setIconTintList(sb, iconTintList4, i, 9, "s");
            } else if (i >= 1000000) {
                setIconTintList(sb, i / 1000000, i % 1000000, 6, "ms");
            } else if (i >= 1000) {
                setIconTintList(sb, i / 1000, i % 1000, 3, "us");
            } else {
                sb.append(i);
                sb.append("ns");
            }
            i3++;
        }
        if (z && i3 > 1) {
            sb.insert(1, '(').append(')');
        }
        String obj = sb.toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        return obj;
    }

    private static final void setIconTintList(StringBuilder sb, int i, int i2, int i3, String str) {
        StringBuilder sb2;
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String valueOf = String.valueOf(i2);
            pN.setY(valueOf, "");
            String str2 = valueOf;
            pN.setY(str2, "");
            if (i3 < 0) {
                StringBuilder sb3 = new StringBuilder("Desired length ");
                sb3.append(i3);
                sb3.append(" is less than zero.");
                throw new IllegalArgumentException(sb3.toString());
            }
            if (i3 <= str2.length()) {
                sb2 = str2.subSequence(0, str2.length());
            } else {
                StringBuilder sb4 = new StringBuilder(i3);
                C0405ql c0405ql = new C0405ql(1, i3 - str2.length());
                C0408qo c0408qo = new C0408qo(c0405ql.MenuHostHelper$$ExternalSyntheticLambda1, c0405ql.setIconTintList, c0405ql.setX);
                while (c0408qo.hasNext()) {
                    c0408qo.setY();
                    sb4.append('0');
                }
                sb4.append((CharSequence) str2);
                sb2 = sb4;
            }
            String obj = sb2.toString();
            int length = obj.length() - 1;
            int i4 = -1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (obj.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (i6 < 3) {
                sb.append((CharSequence) obj, 0, i6);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sb, "");
            } else {
                sb.append((CharSequence) obj, 0, ((i6 + 2) / 3) * 3);
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) sb, "");
            }
        }
        sb.append(str);
    }

    static {
        C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
        C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda1 = Long.MAX_VALUE;
        C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda0 = -9223372036854775805L;
    }

    private static final long setY(long j, long j2) {
        long j3 = j2 / 1000000;
        long j4 = j + j3;
        C0407qn c0407qn = new C0407qn(-4611686018426L, 4611686018426L);
        if (!(c0407qn.MenuHostHelper$$ExternalSyntheticLambda1 <= j4 && j4 <= c0407qn.setIconTintList)) {
            long MenuHostHelper$$ExternalSyntheticLambda12 = (C0412qs.MenuHostHelper$$ExternalSyntheticLambda1(j4) << 1) + 1;
            C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
            return MenuHostHelper$$ExternalSyntheticLambda12;
        }
        long j5 = ((j4 * 1000000) + (j2 - (j3 * 1000000))) << 1;
        C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
        return j5;
    }

    public static final boolean setY(long j) {
        return !(j == MenuHostHelper$$ExternalSyntheticLambda1 || j == MenuHostHelper$$ExternalSyntheticLambda0);
    }

    public static final long MenuHostHelper$$ExternalSyntheticLambda1(long j, long j2) {
        long j3 = ((-(j2 >> 1)) << 1) + (((int) j2) & 1);
        C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
        if (j == MenuHostHelper$$ExternalSyntheticLambda1 || j == MenuHostHelper$$ExternalSyntheticLambda0) {
            if ((!((j3 == MenuHostHelper$$ExternalSyntheticLambda1 || j3 == MenuHostHelper$$ExternalSyntheticLambda0) ? true : true)) || (j3 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (j3 == MenuHostHelper$$ExternalSyntheticLambda1 || j3 == MenuHostHelper$$ExternalSyntheticLambda0) {
            return j3;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j3) & 1)) {
            if (i == 1) {
                return setY(j >> 1, j3 >> 1);
            }
            return setY(j3 >> 1, j >> 1);
        }
        long j4 = (j >> 1) + (j3 >> 1);
        if (i == 0) {
            C0407qn c0407qn = new C0407qn(-4611686018426999999L, 4611686018426999999L);
            if (c0407qn.MenuHostHelper$$ExternalSyntheticLambda1 <= j4 && j4 <= c0407qn.setIconTintList) {
                r3 = true;
            }
            if (r3) {
                long j5 = j4 << 1;
                C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
                return j5;
            }
            long j6 = ((j4 / 1000000) << 1) + 1;
            C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
            return j6;
        }
        C0407qn c0407qn2 = new C0407qn(-4611686018426L, 4611686018426L);
        if (c0407qn2.MenuHostHelper$$ExternalSyntheticLambda1 <= j4 && j4 <= c0407qn2.setIconTintList) {
            r3 = true;
        }
        if (!r3) {
            long MenuHostHelper$$ExternalSyntheticLambda12 = (C0412qs.MenuHostHelper$$ExternalSyntheticLambda1(j4) << 1) + 1;
            C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
            return MenuHostHelper$$ExternalSyntheticLambda12;
        }
        long j7 = (j4 * 1000000) << 1;
        C0428rh.MenuHostHelper$$ExternalSyntheticLambda1();
        return j7;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0429ri) && this.setY == ((C0429ri) obj).setY;
    }
}