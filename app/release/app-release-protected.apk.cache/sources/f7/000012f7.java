package o;

/* loaded from: classes.dex */
public final class xM {
    public static final long MenuHostHelper$$ExternalSyntheticLambda0(String str, int i, int i2) {
        int i3;
        pN.setY(str, "");
        if (!(i2 >= 0)) {
            StringBuilder sb = new StringBuilder("endIndex < beginIndex: ");
            sb.append(i2);
            sb.append(" < ");
            sb.append(0);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        if (!(i2 <= str.length())) {
            StringBuilder sb2 = new StringBuilder("endIndex > string.length: ");
            sb2.append(i2);
            sb2.append(" > ");
            sb2.append(str.length());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        long j = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i3 = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i3 = 3;
                } else {
                    int i4 = i + 1;
                    char charAt2 = i4 < i2 ? str.charAt(i4) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i = i4;
                    } else {
                        j += 4;
                        i += 2;
                    }
                }
                j += i3;
            }
            i++;
        }
        return j;
    }
}