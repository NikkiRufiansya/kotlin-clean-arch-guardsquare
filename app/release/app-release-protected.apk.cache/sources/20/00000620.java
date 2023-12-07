package o;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: o.ip  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0243ip {
    static final Charset setIconTintList;
    public static final byte[] setX;

    /* renamed from: o.ip$setX */
    /* loaded from: classes.dex */
    public interface setX extends setY<Integer> {
        int MenuHostHelper$$ExternalSyntheticLambda0(int i);

        setX MenuHostHelper$$ExternalSyntheticLambda1(int i);

        void setIconTintList(int i);
    }

    /* renamed from: o.ip$setY */
    /* loaded from: classes.dex */
    public interface setY<E> extends List<E>, RandomAccess {
        void MenuHostHelper$$ExternalSyntheticLambda0();

        setY<E> setX(int i);

        boolean setY();
    }

    public static int setIconTintList(long j) {
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
        Charset.forName("US-ASCII");
        setIconTintList = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        setX = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC0229ia.setIconTintList(bArr, 0, 0, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T setX(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static String MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr) {
        return new String(bArr, setIconTintList);
    }

    public static int setIconTintList(byte[] bArr) {
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
    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: o.ip$setIconTintList */
    /* loaded from: classes.dex */
    public static class setIconTintList<F, T> extends AbstractList<T> {
        private final List<F> setIconTintList;
        private final setX<F, T> setY;

        /* renamed from: o.ip$setIconTintList$setX */
        /* loaded from: classes.dex */
        public interface setX<F, T> {
        }

        @Override // java.util.AbstractList, java.util.List
        public final T get(int i) {
            throw null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            throw null;
        }
    }
}