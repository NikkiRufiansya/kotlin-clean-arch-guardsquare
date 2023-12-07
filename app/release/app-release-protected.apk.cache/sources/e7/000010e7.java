package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class setViewCacheExtension {
    public static final byte[] setIconTintList;
    static final Charset setY = Charset.forName("UTF-8");

    /* loaded from: classes.dex */
    public interface setIconTintList<T extends setX> {
        T MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* loaded from: classes.dex */
    public interface setX {
        int MenuHostHelper$$ExternalSyntheticLambda0();
    }

    /* loaded from: classes.dex */
    public interface setY {
        boolean setX();
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int setIconTintList(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T setIconTintList(T t) {
        return t;
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        setIconTintList = bArr;
        ByteBuffer.wrap(bArr);
        setCloseIcon.setY(bArr, 0, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T MenuHostHelper$$ExternalSyntheticLambda0(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String setX(byte[] bArr) {
        return new String(bArr, setY);
    }

    public static int setY(byte[] bArr) {
        int length = bArr.length;
        int i = length;
        for (int i2 = 0; i2 < length + 0; i2++) {
            i = (i * 31) + bArr[i2];
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setIconTintList(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}