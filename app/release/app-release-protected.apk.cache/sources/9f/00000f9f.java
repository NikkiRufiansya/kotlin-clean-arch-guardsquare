package o;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class setSpeed implements Iterable<Byte>, Serializable {
    private static final setSpeed$MenuHostHelper$$ExternalSyntheticLambda1 setX;
    private int MenuHostHelper$$ExternalSyntheticLambda0 = 0;
    private static byte[] MenuHostHelper$$ExternalSyntheticLambda1 = {123, 85, -72, 69, 7, 1, -7, -4, 13, -9, -3, 51, -23, -16, 13, 39, -42, 13, 1, 11, -19, 23, 53, -60, 13, -11, 9, 59, -35, -36, 8, 1, 17, -6};
    public static final int setY = 40;
    public static final setSpeed setIconTintList = new setUiOptions(setViewCacheExtension.setIconTintList);

    /* loaded from: classes.dex */
    public interface setX extends Iterator<Byte> {
        byte MenuHostHelper$$ExternalSyntheticLambda0();
    }

    static /* synthetic */ int MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        return b & 255;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0033). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 16 - r8
            int r6 = r6 + 105
            int r7 = r7 + 4
            byte[] r0 = o.setSpeed.MenuHostHelper$$ExternalSyntheticLambda1
            byte[] r1 = new byte[r8]
            int r8 = r8 + (-1)
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L17:
            r3 = 0
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L33:
            int r8 = r8 - r6
            int r6 = r8 + 2
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setSpeed.a(short, int, short, java.lang.Object[]):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(setClipToOutline setcliptooutline);

    public abstract boolean MenuHostHelper$$ExternalSyntheticLambda0();

    protected abstract void setIconTintList(byte[] bArr, int i);

    abstract byte setX(int i);

    protected abstract String setX(Charset charset);

    public abstract setSpeed setX(int i, int i2);

    public abstract byte setY(int i);

    public abstract int setY();

    protected abstract int setY(int i, int i2);

    static {
        setX = setMenu.MenuHostHelper$$ExternalSyntheticLambda1() ? new setNavigationOnClickListener((byte) 0) : new setIconTintList((byte) 0);
        new Comparator<setSpeed>() { // from class: o.setSpeed.4
            @Override // java.util.Comparator
            public final /* synthetic */ int compare(setSpeed setspeed, setSpeed setspeed2) {
                setSpeed setspeed3 = setspeed;
                setSpeed setspeed4 = setspeed2;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2();
                AnonymousClass2 anonymousClass22 = new AnonymousClass2();
                while (anonymousClass2.hasNext() && anonymousClass22.hasNext()) {
                    int compare = Integer.compare(setSpeed.MenuHostHelper$$ExternalSyntheticLambda1(anonymousClass2.MenuHostHelper$$ExternalSyntheticLambda0()), setSpeed.MenuHostHelper$$ExternalSyntheticLambda1(anonymousClass22.MenuHostHelper$$ExternalSyntheticLambda0()));
                    if (compare != 0) {
                        return compare;
                    }
                }
                return Integer.compare(setspeed3.setY(), setspeed4.setY());
            }
        };
    }

    /* loaded from: classes.dex */
    static final class setNavigationOnClickListener implements setSpeed$MenuHostHelper$$ExternalSyntheticLambda1 {
        private setNavigationOnClickListener() {
        }

        /* synthetic */ setNavigationOnClickListener(byte b) {
            this();
        }

        @Override // o.setSpeed$MenuHostHelper$$ExternalSyntheticLambda1
        public final byte[] setIconTintList(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }
    }

    /* loaded from: classes.dex */
    static final class setIconTintList implements setSpeed$MenuHostHelper$$ExternalSyntheticLambda1 {
        private setIconTintList() {
        }

        /* synthetic */ setIconTintList(byte b) {
            this();
        }

        @Override // o.setSpeed$MenuHostHelper$$ExternalSyntheticLambda1
        public final byte[] setIconTintList(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }
    }

    setSpeed() {
    }

    /* renamed from: o.setSpeed$2  reason: invalid class name */
    /* loaded from: classes.dex */
    final class AnonymousClass2 extends setSpeed$MenuHostHelper$$ExternalSyntheticLambda0 {
        private int setIconTintList = 0;
        private final int setX;

        AnonymousClass2() {
            this.setX = setSpeed.this.setY();
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.setIconTintList < this.setX;
        }

        @Override // o.setSpeed.setX
        public final byte MenuHostHelper$$ExternalSyntheticLambda0() {
            int i = this.setIconTintList;
            if (i >= this.setX) {
                throw new NoSuchElementException();
            }
            this.setIconTintList = i + 1;
            return setSpeed.this.setX(i);
        }
    }

    public static setSpeed setX(byte[] bArr, int i, int i2) {
        setX(i, i + i2, bArr.length);
        return new setUiOptions(setX.setIconTintList(bArr, i, i2));
    }

    public static setSpeed setX(byte[] bArr) {
        int length = bArr.length;
        setX(0, length + 0, bArr.length);
        return new setUiOptions(setX.setIconTintList(bArr, 0, length));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setSpeed MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr) {
        return new setUiOptions(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setSpeed setIconTintList(byte[] bArr, int i, int i2) {
        return new setY(bArr, i, i2);
    }

    public static setSpeed setIconTintList(String str) {
        return new setUiOptions(str.getBytes(setViewCacheExtension.setY));
    }

    public final byte[] setIconTintList() {
        int y = setY();
        if (y == 0) {
            return setViewCacheExtension.setIconTintList;
        }
        byte[] bArr = new byte[y];
        setIconTintList(bArr, y);
        return bArr;
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return setY() == 0 ? "" : setX(setViewCacheExtension.setY);
    }

    /* loaded from: classes.dex */
    static abstract class setUnboundedRipple extends setSpeed {
        setUnboundedRipple() {
        }

        @Override // o.setSpeed, java.lang.Iterable
        public /* synthetic */ Iterator<Byte> iterator() {
            return new AnonymousClass2();
        }
    }

    public final int hashCode() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i == 0) {
            int y = setY();
            i = setY(y, y);
            if (i == 0) {
                i = 1;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setLayoutAnimation MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return new setLayoutAnimation(i, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setLayoutAnimation {
        final byte[] MenuHostHelper$$ExternalSyntheticLambda0;
        final setMenuPrepared setX;

        /* synthetic */ setLayoutAnimation(int i, byte b) {
            this(i);
        }

        private setLayoutAnimation(int i) {
            byte[] bArr = new byte[i];
            this.MenuHostHelper$$ExternalSyntheticLambda0 = bArr;
            this.setX = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(bArr);
        }
    }

    protected final int setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    static int setX(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i < 0) {
                StringBuilder sb = new StringBuilder("Beginning index: ");
                sb.append(i);
                sb.append(" < 0");
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (i2 < i) {
                StringBuilder sb2 = new StringBuilder("Beginning index larger than ending index: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new IndexOutOfBoundsException(sb2.toString());
            } else {
                StringBuilder sb3 = new StringBuilder("End index: ");
                sb3.append(i2);
                sb3.append(" >= ");
                sb3.append(i3);
                throw new IndexOutOfBoundsException(sb3.toString());
            }
        }
        return i4;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        try {
            Object[] objArr2 = {this};
            Object[] objArr3 = new Object[1];
            a(MenuHostHelper$$ExternalSyntheticLambda1[5], (byte) (MenuHostHelper$$ExternalSyntheticLambda1[8] + 1), (byte) (MenuHostHelper$$ExternalSyntheticLambda1[5] - 1), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            byte b = (byte) (-MenuHostHelper$$ExternalSyntheticLambda1[5]);
            Object[] objArr4 = new Object[1];
            a((byte) (MenuHostHelper$$ExternalSyntheticLambda1[5] - 1), b, (byte) (b + 1), objArr4);
            objArr[0] = Integer.toHexString(((Integer) cls.getMethod((String) objArr4[0], Object.class).invoke(null, objArr2)).intValue());
            objArr[1] = Integer.valueOf(setY());
            return String.format("<ByteString@%s size=%d>", objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setUiOptions extends setUnboundedRipple {
        protected final byte[] MenuHostHelper$$ExternalSyntheticLambda0;

        protected int setNavigationOnClickListener() {
            return 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setUiOptions(byte[] bArr) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = bArr;
        }

        @Override // o.setSpeed
        public byte setY(int i) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0[i];
        }

        @Override // o.setSpeed
        byte setX(int i) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0[i];
        }

        @Override // o.setSpeed
        public int setY() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.length;
        }

        @Override // o.setSpeed
        public final setSpeed setX(int i, int i2) {
            int x = setX(0, i2, setY());
            if (x == 0) {
                return setSpeed.setIconTintList;
            }
            return new setY(this.MenuHostHelper$$ExternalSyntheticLambda0, setNavigationOnClickListener(), x);
        }

        @Override // o.setSpeed
        protected void setIconTintList(byte[] bArr, int i) {
            System.arraycopy(this.MenuHostHelper$$ExternalSyntheticLambda0, 0, bArr, 0, i);
        }

        @Override // o.setSpeed
        final void MenuHostHelper$$ExternalSyntheticLambda0(setClipToOutline setcliptooutline) {
            setcliptooutline.setX(this.MenuHostHelper$$ExternalSyntheticLambda0, setNavigationOnClickListener(), setY());
        }

        @Override // o.setSpeed
        protected final String setX(Charset charset) {
            return new String(this.MenuHostHelper$$ExternalSyntheticLambda0, setNavigationOnClickListener(), setY(), charset);
        }

        @Override // o.setSpeed
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            int navigationOnClickListener = setNavigationOnClickListener();
            return setExpandedTitleMarginEnd.setY(this.MenuHostHelper$$ExternalSyntheticLambda0, navigationOnClickListener, setY() + navigationOnClickListener);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof setSpeed) && setY() == ((setSpeed) obj).setY()) {
                if (setY() == 0) {
                    return true;
                }
                if (obj instanceof setUiOptions) {
                    setUiOptions setuioptions = (setUiOptions) obj;
                    int x = setX();
                    int x2 = setuioptions.setX();
                    if (x == 0 || x2 == 0 || x == x2) {
                        int y = setY();
                        if (y > setuioptions.setY()) {
                            StringBuilder sb = new StringBuilder("Length too large: ");
                            sb.append(y);
                            sb.append(setY());
                            throw new IllegalArgumentException(sb.toString());
                        } else if (y > setuioptions.setY()) {
                            StringBuilder sb2 = new StringBuilder("Ran off end of other: ");
                            sb2.append(0);
                            sb2.append(", ");
                            sb2.append(y);
                            sb2.append(", ");
                            sb2.append(setuioptions.setY());
                            throw new IllegalArgumentException(sb2.toString());
                        } else if (setuioptions instanceof setUiOptions) {
                            setUiOptions setuioptions2 = setuioptions;
                            byte[] bArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
                            byte[] bArr2 = setuioptions2.MenuHostHelper$$ExternalSyntheticLambda0;
                            int navigationOnClickListener = setNavigationOnClickListener();
                            int navigationOnClickListener2 = setNavigationOnClickListener();
                            int navigationOnClickListener3 = setuioptions2.setNavigationOnClickListener();
                            while (navigationOnClickListener2 < navigationOnClickListener + y) {
                                if (bArr[navigationOnClickListener2] != bArr2[navigationOnClickListener3]) {
                                    return false;
                                }
                                navigationOnClickListener2++;
                                navigationOnClickListener3++;
                            }
                            return true;
                        } else {
                            return setuioptions.setX(0, y).equals(setX(0, y));
                        }
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // o.setSpeed
        protected final int setY(int i, int i2) {
            return setViewCacheExtension.setIconTintList(i, this.MenuHostHelper$$ExternalSyntheticLambda0, setNavigationOnClickListener(), i2);
        }
    }

    /* loaded from: classes.dex */
    static final class setY extends setUiOptions {
        private final int MenuHostHelper$$ExternalSyntheticLambda1;
        private final int setX;

        setY(byte[] bArr, int i, int i2) {
            super(bArr);
            setX(i, i + i2, bArr.length);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            this.setX = i2;
        }

        @Override // o.setSpeed.setUiOptions, o.setSpeed
        final byte setX(int i) {
            return ((setUiOptions) this).MenuHostHelper$$ExternalSyntheticLambda0[this.MenuHostHelper$$ExternalSyntheticLambda1 + i];
        }

        @Override // o.setSpeed.setUiOptions, o.setSpeed
        public final int setY() {
            return this.setX;
        }

        @Override // o.setSpeed.setUiOptions
        protected final int setNavigationOnClickListener() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        @Override // o.setSpeed.setUiOptions, o.setSpeed
        protected final void setIconTintList(byte[] bArr, int i) {
            System.arraycopy(((setUiOptions) this).MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, bArr, 0, i);
        }

        final Object writeReplace() {
            return new setUiOptions(setIconTintList());
        }

        private void readObject(ObjectInputStream objectInputStream) {
            throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
        }

        @Override // o.setSpeed.setUiOptions, o.setSpeed
        public final byte setY(int i) {
            int i2 = this.setX;
            if (((i2 - (i + 1)) | i) < 0) {
                if (i < 0) {
                    StringBuilder sb = new StringBuilder("Index < 0: ");
                    sb.append(i);
                    throw new ArrayIndexOutOfBoundsException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder("Index > length: ");
                sb2.append(i);
                sb2.append(", ");
                sb2.append(i2);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            return ((setUiOptions) this).MenuHostHelper$$ExternalSyntheticLambda0[this.MenuHostHelper$$ExternalSyntheticLambda1 + i];
        }
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new AnonymousClass2();
    }
}