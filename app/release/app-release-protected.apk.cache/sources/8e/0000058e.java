package o;

import java.util.logging.Level;
import java.util.logging.Logger;
import o.jf;

/* loaded from: classes.dex */
public abstract class hX extends hZ {
    private static final Logger MenuHostHelper$$ExternalSyntheticLambda0 = Logger.getLogger(hX.class.getName());
    private static final boolean setY = ji.setIconTintList();
    C0230ib MenuHostHelper$$ExternalSyntheticLambda1;
    boolean setX;

    public static int MenuHostHelper$$ExternalSyntheticLambda0() {
        return 8;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1() {
        return 4;
    }

    public static int setChipCornerRadius(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int setLayoutAnimation() {
        return 4;
    }

    public static int setOnLongClickListener() {
        return 8;
    }

    public static int setUnboundedRipple() {
        return 4;
    }

    public static int setX() {
        return 8;
    }

    public static int setX(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int setY() {
        return 1;
    }

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(int i, long j);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(int i, hY hYVar);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(hY hYVar);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(int i, long j);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(long j);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(String str);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(iJ iJVar);

    public abstract void ViewPager$SavedState$1(int i);

    public abstract void setIconTintList(byte b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setIconTintList(int i, iJ iJVar, iY iYVar);

    public abstract void setIconTintList(long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setIconTintList(byte[] bArr, int i);

    public abstract void setLayoutAnimation(int i, int i2);

    public abstract void setMaxEms(int i);

    public abstract void setNavigationOnClickListener(int i, int i2);

    public abstract void setTextAlignment(int i);

    public abstract int setUiOptions();

    public abstract void setUiOptions(int i, int i2);

    public abstract void setX(int i, String str);

    public abstract void setX(int i, hY hYVar);

    public abstract void setX(int i, boolean z);

    public abstract void setY(int i, iJ iJVar);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ hX(byte b) {
        this();
    }

    public static hX setX(final byte[] bArr) {
        final int length = bArr.length;
        return new hX(bArr, 0, length) { // from class: o.hX$MenuHostHelper$$ExternalSyntheticLambda1
            private final int MenuHostHelper$$ExternalSyntheticLambda0;
            private final byte[] setIconTintList;
            private int setUnboundedRipple;
            private final int setY;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super((byte) 0);
                if (bArr == null) {
                    throw new NullPointerException("buffer");
                }
                int i = length + 0;
                if (((bArr.length - i) | length | 0) < 0) {
                    throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(length)));
                }
                this.setIconTintList = bArr;
                this.setY = 0;
                this.setUnboundedRipple = 0;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
            }

            @Override // o.hX
            public final void setUiOptions(int i, int i2) {
                setMaxEms((i << 3) | i2);
            }

            @Override // o.hX
            public final void MenuHostHelper$$ExternalSyntheticLambda0(hY hYVar) {
                setMaxEms(hYVar.setX());
                hYVar.setY(this);
            }

            @Override // o.hX
            public final void setIconTintList(byte[] bArr2, int i) {
                setMaxEms(i);
                setIconTintList(bArr2, 0, i);
            }

            @Override // o.hX
            public final void MenuHostHelper$$ExternalSyntheticLambda1(iJ iJVar) {
                setMaxEms(iJVar.setOnNavigationItemSelectedListener());
                iJVar.setX(this);
            }

            @Override // o.hX
            public final void setIconTintList(byte b) {
                try {
                    byte[] bArr2 = this.setIconTintList;
                    int i = this.setUnboundedRipple;
                    this.setUnboundedRipple = i + 1;
                    bArr2[i] = b;
                } catch (IndexOutOfBoundsException e) {
                    throw new hX$MenuHostHelper$$ExternalSyntheticLambda0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setUnboundedRipple), Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0), 1), e);
                }
            }

            @Override // o.hX
            public final void setTextAlignment(int i) {
                if (i >= 0) {
                    setMaxEms(i);
                } else {
                    setIconTintList(i);
                }
            }

            @Override // o.hX
            public final void setMaxEms(int i) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr2 = this.setIconTintList;
                        int i2 = this.setUnboundedRipple;
                        this.setUnboundedRipple = i2 + 1;
                        bArr2[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new hX$MenuHostHelper$$ExternalSyntheticLambda0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setUnboundedRipple), Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0), 1), e);
                    }
                }
                byte[] bArr3 = this.setIconTintList;
                int i3 = this.setUnboundedRipple;
                this.setUnboundedRipple = i3 + 1;
                bArr3[i3] = (byte) i;
            }

            @Override // o.hX
            public final void ViewPager$SavedState$1(int i) {
                try {
                    byte[] bArr2 = this.setIconTintList;
                    int i2 = this.setUnboundedRipple;
                    int i3 = i2 + 1;
                    bArr2[i2] = (byte) i;
                    int i4 = i3 + 1;
                    bArr2[i3] = (byte) (i >> 8);
                    int i5 = i4 + 1;
                    bArr2[i4] = (byte) (i >> 16);
                    this.setUnboundedRipple = i5 + 1;
                    bArr2[i5] = (byte) (i >>> 24);
                } catch (IndexOutOfBoundsException e) {
                    throw new hX$MenuHostHelper$$ExternalSyntheticLambda0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setUnboundedRipple), Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0), 1), e);
                }
            }

            @Override // o.hX
            public final void setIconTintList(long j) {
                boolean z;
                z = hX.setY;
                if (z && this.MenuHostHelper$$ExternalSyntheticLambda0 - this.setUnboundedRipple >= 10) {
                    while ((j & (-128)) != 0) {
                        byte[] bArr2 = this.setIconTintList;
                        int i = this.setUnboundedRipple;
                        this.setUnboundedRipple = i + 1;
                        ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr2, ji.setIconTintList + i, (byte) ((((int) j) & 127) | 128));
                        j >>>= 7;
                    }
                    byte[] bArr3 = this.setIconTintList;
                    int i2 = this.setUnboundedRipple;
                    this.setUnboundedRipple = i2 + 1;
                    ji.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(bArr3, ji.setIconTintList + i2, (byte) j);
                    return;
                }
                while ((j & (-128)) != 0) {
                    try {
                        byte[] bArr4 = this.setIconTintList;
                        int i3 = this.setUnboundedRipple;
                        this.setUnboundedRipple = i3 + 1;
                        bArr4[i3] = (byte) ((((int) j) & 127) | 128);
                        j >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new hX$MenuHostHelper$$ExternalSyntheticLambda0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setUnboundedRipple), Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0), 1), e);
                    }
                }
                byte[] bArr5 = this.setIconTintList;
                int i4 = this.setUnboundedRipple;
                this.setUnboundedRipple = i4 + 1;
                bArr5[i4] = (byte) j;
            }

            @Override // o.hX
            public final void MenuHostHelper$$ExternalSyntheticLambda1(long j) {
                try {
                    byte[] bArr2 = this.setIconTintList;
                    int i = this.setUnboundedRipple;
                    int i2 = i + 1;
                    bArr2[i] = (byte) j;
                    int i3 = i2 + 1;
                    bArr2[i2] = (byte) (j >> 8);
                    int i4 = i3 + 1;
                    bArr2[i3] = (byte) (j >> 16);
                    int i5 = i4 + 1;
                    bArr2[i4] = (byte) (j >> 24);
                    int i6 = i5 + 1;
                    bArr2[i5] = (byte) (j >> 32);
                    int i7 = i6 + 1;
                    bArr2[i6] = (byte) (j >> 40);
                    int i8 = i7 + 1;
                    bArr2[i7] = (byte) (j >> 48);
                    this.setUnboundedRipple = i8 + 1;
                    bArr2[i8] = (byte) (j >> 56);
                } catch (IndexOutOfBoundsException e) {
                    throw new hX$MenuHostHelper$$ExternalSyntheticLambda0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setUnboundedRipple), Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0), 1), e);
                }
            }

            private void setIconTintList(byte[] bArr2, int i, int i2) {
                try {
                    System.arraycopy(bArr2, i, this.setIconTintList, this.setUnboundedRipple, i2);
                    this.setUnboundedRipple += i2;
                } catch (IndexOutOfBoundsException e) {
                    throw new hX$MenuHostHelper$$ExternalSyntheticLambda0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setUnboundedRipple), Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0), Integer.valueOf(i2)), e);
                }
            }

            @Override // o.hZ
            public final void setX(byte[] bArr2, int i, int i2) {
                setIconTintList(bArr2, i, i2);
            }

            @Override // o.hX
            public final void MenuHostHelper$$ExternalSyntheticLambda1(String str) {
                int i = this.setUnboundedRipple;
                try {
                    int chipCornerRadius = setChipCornerRadius(str.length() * 3);
                    int chipCornerRadius2 = setChipCornerRadius(str.length());
                    if (chipCornerRadius2 == chipCornerRadius) {
                        int i2 = i + chipCornerRadius2;
                        this.setUnboundedRipple = i2;
                        int iconTintList = jf.setIconTintList(str, this.setIconTintList, i2, this.MenuHostHelper$$ExternalSyntheticLambda0 - i2);
                        this.setUnboundedRipple = i;
                        setMaxEms((iconTintList - i) - chipCornerRadius2);
                        this.setUnboundedRipple = iconTintList;
                        return;
                    }
                    setMaxEms(jf.setIconTintList(str));
                    this.setUnboundedRipple = jf.setIconTintList(str, this.setIconTintList, this.setUnboundedRipple, this.MenuHostHelper$$ExternalSyntheticLambda0 - this.setUnboundedRipple);
                } catch (IndexOutOfBoundsException e) {
                    throw new hX$MenuHostHelper$$ExternalSyntheticLambda0(e);
                } catch (jf.setY e2) {
                    this.setUnboundedRipple = i;
                    setIconTintList(str, e2);
                }
            }

            @Override // o.hX
            public final int setUiOptions() {
                return this.MenuHostHelper$$ExternalSyntheticLambda0 - this.setUnboundedRipple;
            }

            @Override // o.hX
            public final void setX(int i, boolean z) {
                setMaxEms((i << 3) | 0);
                setIconTintList(z ? (byte) 1 : (byte) 0);
            }

            @Override // o.hX
            public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, hY hYVar) {
                setMaxEms((i << 3) | 2);
                setMaxEms(hYVar.setX());
                hYVar.setY(this);
            }

            @Override // o.hX
            public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
                setMaxEms((i << 3) | 5);
                ViewPager$SavedState$1(i2);
            }

            @Override // o.hX
            public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, long j) {
                setMaxEms((i << 3) | 1);
                MenuHostHelper$$ExternalSyntheticLambda1(j);
            }

            @Override // o.hX
            public final void setLayoutAnimation(int i, int i2) {
                setMaxEms((i << 3) | 0);
                if (i2 >= 0) {
                    setMaxEms(i2);
                } else {
                    setIconTintList(i2);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.hX
            public final void setIconTintList(int i, iJ iJVar, iY iYVar) {
                setMaxEms((i << 3) | 2);
                setMaxEms(((hU) iJVar).MenuHostHelper$$ExternalSyntheticLambda0(iYVar));
                iYVar.MenuHostHelper$$ExternalSyntheticLambda1(iJVar, this.MenuHostHelper$$ExternalSyntheticLambda1);
            }

            @Override // o.hX
            public final void setY(int i, iJ iJVar) {
                setMaxEms(11);
                setUiOptions(2, 0);
                setMaxEms(i);
                setMaxEms(26);
                setMaxEms(iJVar.setOnNavigationItemSelectedListener());
                iJVar.setX(this);
                setMaxEms(12);
            }

            @Override // o.hX
            public final void setX(int i, hY hYVar) {
                setMaxEms(11);
                setUiOptions(2, 0);
                setMaxEms(i);
                MenuHostHelper$$ExternalSyntheticLambda0(3, hYVar);
                setMaxEms(12);
            }

            @Override // o.hX
            public final void setX(int i, String str) {
                setMaxEms((i << 3) | 2);
                MenuHostHelper$$ExternalSyntheticLambda1(str);
            }

            @Override // o.hX
            public final void setNavigationOnClickListener(int i, int i2) {
                setMaxEms((i << 3) | 0);
                setMaxEms(i2);
            }

            @Override // o.hX
            public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, long j) {
                setMaxEms((i << 3) | 0);
                setIconTintList(j);
            }
        };
    }

    private hX() {
    }

    public static int setCenterIfNoTextEnabled(int i) {
        return setChipCornerRadius((i << 3) | 0);
    }

    public static int setLayoutAnimation(int i) {
        if (i >= 0) {
            return setChipCornerRadius(i);
        }
        return 10;
    }

    public static int setIconSize(int i) {
        return setChipCornerRadius((i << 1) ^ (i >> 31));
    }

    public static int setY(long j) {
        return setX((j << 1) ^ (j >> 63));
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        int length;
        try {
            length = jf.setIconTintList(str);
        } catch (jf.setY unused) {
            length = str.getBytes(C0243ip.setIconTintList).length;
        }
        return setChipCornerRadius(length) + length;
    }

    public static int setY(C0247it c0247it) {
        int MenuHostHelper$$ExternalSyntheticLambda1 = c0247it.MenuHostHelper$$ExternalSyntheticLambda1();
        return setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda1) + MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public static int setIconTintList(hY hYVar) {
        int x = hYVar.setX();
        return setChipCornerRadius(x) + x;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr) {
        int length = bArr.length;
        return setChipCornerRadius(length) + length;
    }

    public static int setIconTintList(iJ iJVar) {
        int onNavigationItemSelectedListener = iJVar.setOnNavigationItemSelectedListener();
        return setChipCornerRadius(onNavigationItemSelectedListener) + onNavigationItemSelectedListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setX(iJ iJVar, iY iYVar) {
        int MenuHostHelper$$ExternalSyntheticLambda02 = ((hU) iJVar).MenuHostHelper$$ExternalSyntheticLambda0(iYVar);
        return setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02) + MenuHostHelper$$ExternalSyntheticLambda02;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setUiOptions(int i) {
        return setChipCornerRadius(i) + i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(String str, jf.setY sety) {
        MenuHostHelper$$ExternalSyntheticLambda0.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) sety);
        byte[] bytes = str.getBytes(C0243ip.setIconTintList);
        try {
            setMaxEms(bytes.length);
            setX(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new hX$MenuHostHelper$$ExternalSyntheticLambda0(e);
        }
    }

    @Deprecated
    public static int setY(iJ iJVar) {
        return iJVar.setOnNavigationItemSelectedListener();
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return setChipCornerRadius((i << 3) | 0) + 1;
    }

    public static int setIconTintList(int i, hY hYVar) {
        int chipCornerRadius = setChipCornerRadius((i << 3) | 0);
        int x = hYVar.setX();
        return chipCornerRadius + setChipCornerRadius(x) + x;
    }

    public static int setX(int i) {
        return setChipCornerRadius((i << 3) | 0) + 8;
    }

    public static int setY(int i, int i2) {
        return setChipCornerRadius((i << 3) | 0) + (i2 >= 0 ? setChipCornerRadius(i2) : 10);
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if (i >= 0) {
            return setChipCornerRadius(i);
        }
        return 10;
    }

    public static int setIconTintList(int i) {
        return setChipCornerRadius((i << 3) | 0) + 4;
    }

    public static int setY(int i) {
        return setChipCornerRadius((i << 3) | 0) + 8;
    }

    public static int setNavigationOnClickListener(int i) {
        return setChipCornerRadius((i << 3) | 0) + 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int setX(int i, iJ iJVar, iY iYVar) {
        return (setChipCornerRadius((i << 3) | 0) << 1) + ((hU) iJVar).MenuHostHelper$$ExternalSyntheticLambda0(iYVar);
    }

    public static int setX(int i, int i2) {
        return setChipCornerRadius((i << 3) | 0) + (i2 >= 0 ? setChipCornerRadius(i2) : 10);
    }

    public static int setX(int i, long j) {
        return setChipCornerRadius((i << 3) | 0) + setX(j);
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i, C0247it c0247it) {
        int chipCornerRadius = setChipCornerRadius(8);
        int chipCornerRadius2 = setChipCornerRadius(16) + setChipCornerRadius(i);
        int chipCornerRadius3 = setChipCornerRadius(24);
        int MenuHostHelper$$ExternalSyntheticLambda1 = c0247it.MenuHostHelper$$ExternalSyntheticLambda1();
        return (chipCornerRadius << 1) + chipCornerRadius2 + chipCornerRadius3 + setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda1) + MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public static int setY(int i, C0247it c0247it) {
        int chipCornerRadius = setChipCornerRadius((i << 3) | 0);
        int MenuHostHelper$$ExternalSyntheticLambda1 = c0247it.MenuHostHelper$$ExternalSyntheticLambda1();
        return chipCornerRadius + setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda1) + MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public static int setIconTintList(int i, iJ iJVar) {
        int chipCornerRadius = setChipCornerRadius(8);
        int chipCornerRadius2 = setChipCornerRadius(16) + setChipCornerRadius(i);
        int chipCornerRadius3 = setChipCornerRadius(24);
        int onNavigationItemSelectedListener = iJVar.setOnNavigationItemSelectedListener();
        return (chipCornerRadius << 1) + chipCornerRadius2 + chipCornerRadius3 + setChipCornerRadius(onNavigationItemSelectedListener) + onNavigationItemSelectedListener;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, iJ iJVar, iY iYVar) {
        int chipCornerRadius = setChipCornerRadius((i << 3) | 0);
        int MenuHostHelper$$ExternalSyntheticLambda02 = ((hU) iJVar).MenuHostHelper$$ExternalSyntheticLambda0(iYVar);
        return chipCornerRadius + setChipCornerRadius(MenuHostHelper$$ExternalSyntheticLambda02) + MenuHostHelper$$ExternalSyntheticLambda02;
    }

    public static int setY(int i, hY hYVar) {
        int chipCornerRadius = setChipCornerRadius(8);
        int chipCornerRadius2 = setChipCornerRadius(16) + setChipCornerRadius(i);
        int chipCornerRadius3 = setChipCornerRadius(24);
        int x = hYVar.setX();
        return (chipCornerRadius << 1) + chipCornerRadius2 + chipCornerRadius3 + setChipCornerRadius(x) + x;
    }

    public static int setUnboundedRipple(int i) {
        return setChipCornerRadius((i << 3) | 0) + 4;
    }

    public static int setOnLongClickListener(int i) {
        return setChipCornerRadius((i << 3) | 0) + 8;
    }

    public static int setIconTintList(int i, int i2) {
        return setChipCornerRadius((i << 3) | 0) + setChipCornerRadius((i2 << 1) ^ (i2 >> 31));
    }

    public static int setIconTintList(int i, long j) {
        return setChipCornerRadius((i << 3) | 0) + setX((j << 1) ^ (j >> 63));
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i, String str) {
        return setChipCornerRadius((i << 3) | 0) + MenuHostHelper$$ExternalSyntheticLambda0(str);
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        return setChipCornerRadius((i << 3) | 0) + setChipCornerRadius(i2);
    }

    public static int setY(int i, long j) {
        return setChipCornerRadius((i << 3) | 0) + setX(j);
    }
}