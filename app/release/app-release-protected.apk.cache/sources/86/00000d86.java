package o;

import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.setExpandedTitleMarginEnd;
import o.setMenuPrepared;

/* loaded from: classes.dex */
public abstract class setMenuPrepared extends setClipToOutline {
    private static final boolean setX;
    private static final Logger setY = Logger.getLogger(setMenuPrepared.class.getName());
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    setImageTintBlendMode MenuHostHelper$$ExternalSyntheticLambda1;

    public static int MenuHostHelper$$ExternalSyntheticLambda0() {
        return 8;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1() {
        return 4;
    }

    public static int setCenterIfNoTextEnabled(int i) {
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

    public static int setIconTintList() {
        return 8;
    }

    public static int setLayoutAnimation() {
        return 4;
    }

    public static int setOnLongClickListener() {
        return 8;
    }

    public static int setOnLongClickListener(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int setUnboundedRipple() {
        return 4;
    }

    public static int setX() {
        return 1;
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

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(byte b);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(setSpeed setspeed);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(int i, long j);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(setDrawingCacheQuality setdrawingcachequality);

    public abstract void setAnimationFromJson(int i);

    public abstract void setIconTintList(long j);

    public abstract void setIconTintList(byte[] bArr, int i);

    public abstract void setLayoutAnimation(int i, int i2);

    public abstract void setNavigationOnClickListener();

    public abstract void setOnLongClickListener(int i, int i2);

    public abstract void setTextScaleX(int i);

    public abstract int setUiOptions();

    public abstract void setUiOptions(int i, int i2);

    public abstract void setX(int i, long j);

    public abstract void setX(int i, String str);

    public abstract void setX(int i, setDrawingCacheQuality setdrawingcachequality);

    public abstract void setX(int i, setSpeed setspeed);

    public abstract void setX(int i, boolean z);

    public abstract void setY(int i, setDrawingCacheQuality setdrawingcachequality, setValues setvalues);

    public abstract void setY(int i, setSpeed setspeed);

    public abstract void setY(long j);

    public abstract void setY(String str);

    public abstract void setZ(int i);

    /* synthetic */ setMenuPrepared(byte b) {
        this();
    }

    static {
        boolean z;
        z = WindowInsetsCompat$Impl20.setX;
        setX = z;
    }

    public static setMenuPrepared MenuHostHelper$$ExternalSyntheticLambda1(OutputStream outputStream, int i) {
        return new setX(outputStream, i) { // from class: o.setMenuPrepared$MenuHostHelper$$ExternalSyntheticLambda1
            private final OutputStream setUnboundedRipple;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(i);
                if (outputStream == null) {
                    throw new NullPointerException("out");
                }
                this.setUnboundedRipple = outputStream;
            }

            @Override // o.setMenuPrepared
            public final void setOnLongClickListener(int i2, int i3) {
                int y = setCloseIconVisible.setY(i2, i3);
                setLayoutDirection(5);
                setMaxEms(y);
            }

            @Override // o.setMenuPrepared
            public final void setLayoutAnimation(int i2, int i3) {
                setLayoutDirection(20);
                setMaxEms(setCloseIconVisible.setY(i2, 0));
                if (i3 >= 0) {
                    setMaxEms(i3);
                } else {
                    setNavigationOnClickListener(i3);
                }
            }

            @Override // o.setMenuPrepared
            public final void setUiOptions(int i2, int i3) {
                setLayoutDirection(20);
                setMaxEms(setCloseIconVisible.setY(i2, 0));
                setMaxEms(i3);
            }

            @Override // o.setMenuPrepared
            public final void MenuHostHelper$$ExternalSyntheticLambda0(int i2, int i3) {
                setLayoutDirection(14);
                setMaxEms(setCloseIconVisible.setY(i2, 5));
                setOnNavigationItemSelectedListener(i3);
            }

            @Override // o.setMenuPrepared
            public final void setX(int i2, long j) {
                setLayoutDirection(20);
                setMaxEms(setCloseIconVisible.setY(i2, 0));
                setNavigationOnClickListener(j);
            }

            @Override // o.setMenuPrepared
            public final void MenuHostHelper$$ExternalSyntheticLambda1(int i2, long j) {
                setLayoutDirection(18);
                setMaxEms(setCloseIconVisible.setY(i2, 1));
                setLayoutAnimation(j);
            }

            @Override // o.setMenuPrepared
            public final void setX(int i2, boolean z) {
                setLayoutDirection(11);
                setMaxEms(setCloseIconVisible.setY(i2, 0));
                byte b = z ? (byte) 1 : (byte) 0;
                byte[] bArr = this.setY;
                int i3 = this.setIconTintList;
                this.setIconTintList = i3 + 1;
                bArr[i3] = b;
                this.setUiOptions++;
            }

            @Override // o.setMenuPrepared
            public final void MenuHostHelper$$ExternalSyntheticLambda0(setSpeed setspeed) {
                int y = setspeed.setY();
                setLayoutDirection(5);
                setMaxEms(y);
                setspeed.MenuHostHelper$$ExternalSyntheticLambda0(this);
            }

            @Override // o.setMenuPrepared
            public final void MenuHostHelper$$ExternalSyntheticLambda1(setDrawingCacheQuality setdrawingcachequality) {
                int chipCornerRadius = setdrawingcachequality.setChipCornerRadius();
                setLayoutDirection(5);
                setMaxEms(chipCornerRadius);
                setdrawingcachequality.setIconTintList(this);
            }

            @Override // o.setMenuPrepared
            public final void MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
                if (this.setIconTintList == this.setX) {
                    this.setUnboundedRipple.write(this.setY, 0, this.setIconTintList);
                    this.setIconTintList = 0;
                }
                byte[] bArr = this.setY;
                int i2 = this.setIconTintList;
                this.setIconTintList = i2 + 1;
                bArr[i2] = b;
                this.setUiOptions++;
            }

            @Override // o.setMenuPrepared
            public final void setAnimationFromJson(int i2) {
                setLayoutDirection(5);
                setMaxEms(i2);
            }

            @Override // o.setMenuPrepared
            public final void setTextScaleX(int i2) {
                setLayoutDirection(4);
                setOnNavigationItemSelectedListener(i2);
            }

            @Override // o.setMenuPrepared
            public final void setY(long j) {
                setLayoutDirection(10);
                setNavigationOnClickListener(j);
            }

            @Override // o.setMenuPrepared
            public final void setIconTintList(long j) {
                setLayoutDirection(8);
                setLayoutAnimation(j);
            }

            @Override // o.setMenuPrepared
            public final void setY(String str) {
                int y;
                try {
                    int length = str.length() * 3;
                    int centerIfNoTextEnabled = setCenterIfNoTextEnabled(length);
                    int i2 = centerIfNoTextEnabled + length;
                    if (i2 > this.setX) {
                        byte[] bArr = new byte[length];
                        int y2 = setExpandedTitleMarginEnd.setY(str, bArr, 0, length);
                        setLayoutDirection(5);
                        setMaxEms(y2);
                        MenuHostHelper$$ExternalSyntheticLambda0(bArr, 0, y2);
                        return;
                    }
                    if (i2 > this.setX - this.setIconTintList) {
                        this.setUnboundedRipple.write(this.setY, 0, this.setIconTintList);
                        this.setIconTintList = 0;
                    }
                    int centerIfNoTextEnabled2 = setCenterIfNoTextEnabled(str.length());
                    int i3 = this.setIconTintList;
                    try {
                        if (centerIfNoTextEnabled2 == centerIfNoTextEnabled) {
                            this.setIconTintList = i3 + centerIfNoTextEnabled2;
                            int y3 = setExpandedTitleMarginEnd.setY(str, this.setY, this.setIconTintList, this.setX - this.setIconTintList);
                            this.setIconTintList = i3;
                            y = (y3 - i3) - centerIfNoTextEnabled2;
                            setMaxEms(y);
                            this.setIconTintList = y3;
                        } else {
                            y = setExpandedTitleMarginEnd.setY(str);
                            setMaxEms(y);
                            this.setIconTintList = setExpandedTitleMarginEnd.setY(str, this.setY, this.setIconTintList, y);
                        }
                        this.setUiOptions += y;
                    } catch (ArrayIndexOutOfBoundsException e) {
                        throw new setMenuPrepared.setIconTintList(e);
                    } catch (setExpandedTitleMarginEnd.setIconTintList e2) {
                        this.setUiOptions -= this.setIconTintList - i3;
                        this.setIconTintList = i3;
                        throw e2;
                    }
                } catch (setExpandedTitleMarginEnd.setIconTintList e3) {
                    setY(str, e3);
                }
            }

            @Override // o.setMenuPrepared
            public final void setNavigationOnClickListener() {
                if (this.setIconTintList > 0) {
                    this.setUnboundedRipple.write(this.setY, 0, this.setIconTintList);
                    this.setIconTintList = 0;
                }
            }

            private void MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr, int i2, int i3) {
                if (this.setX - this.setIconTintList >= i3) {
                    System.arraycopy(bArr, i2, this.setY, this.setIconTintList, i3);
                    this.setIconTintList += i3;
                } else {
                    int i4 = this.setX - this.setIconTintList;
                    System.arraycopy(bArr, i2, this.setY, this.setIconTintList, i4);
                    int i5 = i2 + i4;
                    i3 -= i4;
                    this.setIconTintList = this.setX;
                    this.setUiOptions += i4;
                    this.setUnboundedRipple.write(this.setY, 0, this.setIconTintList);
                    this.setIconTintList = 0;
                    if (i3 <= this.setX) {
                        System.arraycopy(bArr, i5, this.setY, 0, i3);
                        this.setIconTintList = i3;
                    } else {
                        this.setUnboundedRipple.write(bArr, i5, i3);
                    }
                }
                this.setUiOptions += i3;
            }

            @Override // o.setClipToOutline
            public final void setX(byte[] bArr, int i2, int i3) {
                MenuHostHelper$$ExternalSyntheticLambda0(bArr, i2, i3);
            }

            private void setLayoutDirection(int i2) {
                if (this.setX - this.setIconTintList < i2) {
                    this.setUnboundedRipple.write(this.setY, 0, this.setIconTintList);
                    this.setIconTintList = 0;
                }
            }

            @Override // o.setMenuPrepared
            public final void setIconTintList(byte[] bArr, int i2) {
                setLayoutDirection(5);
                setMaxEms(i2);
                MenuHostHelper$$ExternalSyntheticLambda0(bArr, 0, i2);
            }

            @Override // o.setMenuPrepared
            public final void setX(int i2, setSpeed setspeed) {
                setAnimationFromJson(setCloseIconVisible.setY(i2, 2));
                setAnimationFromJson(setspeed.setY());
                setspeed.MenuHostHelper$$ExternalSyntheticLambda0(this);
            }

            @Override // o.setMenuPrepared
            public final void setZ(int i2) {
                if (i2 >= 0) {
                    setLayoutDirection(5);
                    setMaxEms(i2);
                    return;
                }
                setLayoutDirection(10);
                setNavigationOnClickListener(i2);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.setMenuPrepared
            public final void setY(int i2, setDrawingCacheQuality setdrawingcachequality, setValues setvalues) {
                setAnimationFromJson(setCloseIconVisible.setY(i2, 2));
                int MenuHostHelper$$ExternalSyntheticLambda1 = ((setLeftStripDrawable) setdrawingcachequality).MenuHostHelper$$ExternalSyntheticLambda1(setvalues);
                setLayoutDirection(5);
                setMaxEms(MenuHostHelper$$ExternalSyntheticLambda1);
                setvalues.setY((setValues) setdrawingcachequality, (WindowInsetsCompat$Impl29) this.MenuHostHelper$$ExternalSyntheticLambda1);
            }

            @Override // o.setMenuPrepared
            public final void setX(int i2, setDrawingCacheQuality setdrawingcachequality) {
                setAnimationFromJson(setCloseIconVisible.setY(1, 3));
                setLayoutDirection(20);
                setMaxEms(setCloseIconVisible.setY(2, 0));
                setMaxEms(i2);
                setAnimationFromJson(setCloseIconVisible.setY(3, 2));
                int chipCornerRadius = setdrawingcachequality.setChipCornerRadius();
                setLayoutDirection(5);
                setMaxEms(chipCornerRadius);
                setdrawingcachequality.setIconTintList(this);
                setAnimationFromJson(setCloseIconVisible.setY(1, 4));
            }

            @Override // o.setMenuPrepared
            public final void setY(int i2, setSpeed setspeed) {
                setAnimationFromJson(setCloseIconVisible.setY(1, 3));
                setLayoutDirection(20);
                setMaxEms(setCloseIconVisible.setY(2, 0));
                setMaxEms(i2);
                setX(3, setspeed);
                setAnimationFromJson(setCloseIconVisible.setY(1, 4));
            }

            @Override // o.setMenuPrepared
            public final void setX(int i2, String str) {
                setAnimationFromJson(setCloseIconVisible.setY(i2, 2));
                setY(str);
            }
        };
    }

    public static setMenuPrepared MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr) {
        return new setY(bArr, 0, bArr.length);
    }

    private setMenuPrepared() {
    }

    public static int ViewPager$SavedState$1(int i) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0));
    }

    public static int setUnboundedRipple(int i) {
        if (i >= 0) {
            return setCenterIfNoTextEnabled(i);
        }
        return 10;
    }

    public static int setChipCornerRadius(int i) {
        return setCenterIfNoTextEnabled((i << 1) ^ (i >> 31));
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(long j) {
        return setX(j);
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(long j) {
        return setX((j << 1) ^ (j >> 63));
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        int length;
        try {
            length = setExpandedTitleMarginEnd.setY(str);
        } catch (setExpandedTitleMarginEnd.setIconTintList unused) {
            length = str.getBytes(setViewCacheExtension.setY).length;
        }
        return setCenterIfNoTextEnabled(length) + length;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(setAddStatesFromChildren setaddstatesfromchildren) {
        int iconTintList = setaddstatesfromchildren.setIconTintList();
        return setCenterIfNoTextEnabled(iconTintList) + iconTintList;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(setSpeed setspeed) {
        int y = setspeed.setY();
        return setCenterIfNoTextEnabled(y) + y;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr) {
        int length = bArr.length;
        return setCenterIfNoTextEnabled(length) + length;
    }

    public static int setX(setDrawingCacheQuality setdrawingcachequality) {
        int chipCornerRadius = setdrawingcachequality.setChipCornerRadius();
        return setCenterIfNoTextEnabled(chipCornerRadius) + chipCornerRadius;
    }

    public static int setY(setDrawingCacheQuality setdrawingcachequality, setValues setvalues) {
        int MenuHostHelper$$ExternalSyntheticLambda1 = ((setLeftStripDrawable) setdrawingcachequality).MenuHostHelper$$ExternalSyntheticLambda1(setvalues);
        return setCenterIfNoTextEnabled(MenuHostHelper$$ExternalSyntheticLambda1) + MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public static int setUiOptions(int i) {
        return setCenterIfNoTextEnabled(i) + i;
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends IOException {
        setIconTintList() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public setIconTintList(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public setIconTintList(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                r0.<init>(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMenuPrepared.setIconTintList.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public final void setY(String str, setExpandedTitleMarginEnd.setIconTintList seticontintlist) {
        setY.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) seticontintlist);
        byte[] bytes = str.getBytes(setViewCacheExtension.setY);
        try {
            setAnimationFromJson(bytes.length);
            setX(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new setIconTintList(e);
        } catch (setIconTintList e2) {
            throw e2;
        }
    }

    @Deprecated
    public static int setIconTintList(setDrawingCacheQuality setdrawingcachequality) {
        return setdrawingcachequality.setChipCornerRadius();
    }

    @Deprecated
    public static int setNavigationOnClickListener(int i) {
        return setCenterIfNoTextEnabled(i);
    }

    /* loaded from: classes.dex */
    public static class setY extends setMenuPrepared {
        private final int setIconTintList;
        private int setNavigationOnClickListener;
        private final byte[] setX;
        private final int setY;

        @Override // o.setMenuPrepared
        public final void setNavigationOnClickListener() {
        }

        setY(byte[] bArr, int i, int i2) {
            super((byte) 0);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i2 + 0;
            if (((bArr.length - i3) | i2 | 0) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
            }
            this.setX = bArr;
            this.setIconTintList = 0;
            this.setNavigationOnClickListener = 0;
            this.setY = i3;
        }

        @Override // o.setMenuPrepared
        public final void setOnLongClickListener(int i, int i2) {
            setAnimationFromJson(setCloseIconVisible.setY(i, i2));
        }

        @Override // o.setMenuPrepared
        public final void MenuHostHelper$$ExternalSyntheticLambda0(setSpeed setspeed) {
            setAnimationFromJson(setspeed.setY());
            setspeed.MenuHostHelper$$ExternalSyntheticLambda0(this);
        }

        @Override // o.setMenuPrepared
        public final void setIconTintList(byte[] bArr, int i) {
            setAnimationFromJson(i);
            MenuHostHelper$$ExternalSyntheticLambda1(bArr, 0, i);
        }

        @Override // o.setMenuPrepared
        public final void MenuHostHelper$$ExternalSyntheticLambda1(setDrawingCacheQuality setdrawingcachequality) {
            setAnimationFromJson(setdrawingcachequality.setChipCornerRadius());
            setdrawingcachequality.setIconTintList(this);
        }

        @Override // o.setMenuPrepared
        public final void MenuHostHelper$$ExternalSyntheticLambda0(byte b) {
            try {
                byte[] bArr = this.setX;
                int i = this.setNavigationOnClickListener;
                this.setNavigationOnClickListener = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new setIconTintList(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setNavigationOnClickListener), Integer.valueOf(this.setY), 1), e);
            }
        }

        @Override // o.setMenuPrepared
        public final void setZ(int i) {
            if (i >= 0) {
                setAnimationFromJson(i);
            } else {
                setY(i);
            }
        }

        @Override // o.setMenuPrepared
        public final void setAnimationFromJson(int i) {
            if (setMenuPrepared.setX && !setMenu.MenuHostHelper$$ExternalSyntheticLambda1()) {
                int i2 = this.setY;
                int i3 = this.setNavigationOnClickListener;
                if (i2 - i3 >= 5) {
                    if ((i & (-128)) == 0) {
                        byte[] bArr = this.setX;
                        this.setNavigationOnClickListener = i3 + 1;
                        WindowInsetsCompat$Impl20.setY(bArr, i3, (byte) i);
                        return;
                    }
                    byte[] bArr2 = this.setX;
                    this.setNavigationOnClickListener = i3 + 1;
                    WindowInsetsCompat$Impl20.setY(bArr2, i3, (byte) (i | 128));
                    int i4 = i >>> 7;
                    if ((i4 & (-128)) == 0) {
                        byte[] bArr3 = this.setX;
                        int i5 = this.setNavigationOnClickListener;
                        this.setNavigationOnClickListener = i5 + 1;
                        WindowInsetsCompat$Impl20.setY(bArr3, i5, (byte) i4);
                        return;
                    }
                    byte[] bArr4 = this.setX;
                    int i6 = this.setNavigationOnClickListener;
                    this.setNavigationOnClickListener = i6 + 1;
                    WindowInsetsCompat$Impl20.setY(bArr4, i6, (byte) (i4 | 128));
                    int i7 = i4 >>> 7;
                    if ((i7 & (-128)) == 0) {
                        byte[] bArr5 = this.setX;
                        int i8 = this.setNavigationOnClickListener;
                        this.setNavigationOnClickListener = i8 + 1;
                        WindowInsetsCompat$Impl20.setY(bArr5, i8, (byte) i7);
                        return;
                    }
                    byte[] bArr6 = this.setX;
                    int i9 = this.setNavigationOnClickListener;
                    this.setNavigationOnClickListener = i9 + 1;
                    WindowInsetsCompat$Impl20.setY(bArr6, i9, (byte) (i7 | 128));
                    int i10 = i7 >>> 7;
                    if ((i10 & (-128)) == 0) {
                        byte[] bArr7 = this.setX;
                        int i11 = this.setNavigationOnClickListener;
                        this.setNavigationOnClickListener = i11 + 1;
                        WindowInsetsCompat$Impl20.setY(bArr7, i11, (byte) i10);
                        return;
                    }
                    byte[] bArr8 = this.setX;
                    int i12 = this.setNavigationOnClickListener;
                    this.setNavigationOnClickListener = i12 + 1;
                    WindowInsetsCompat$Impl20.setY(bArr8, i12, (byte) (i10 | 128));
                    byte[] bArr9 = this.setX;
                    int i13 = this.setNavigationOnClickListener;
                    this.setNavigationOnClickListener = i13 + 1;
                    WindowInsetsCompat$Impl20.setY(bArr9, i13, (byte) (i10 >>> 7));
                    return;
                }
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr10 = this.setX;
                    int i14 = this.setNavigationOnClickListener;
                    this.setNavigationOnClickListener = i14 + 1;
                    bArr10[i14] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new setIconTintList(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setNavigationOnClickListener), Integer.valueOf(this.setY), 1), e);
                }
            }
            byte[] bArr11 = this.setX;
            int i15 = this.setNavigationOnClickListener;
            this.setNavigationOnClickListener = i15 + 1;
            bArr11[i15] = (byte) i;
        }

        @Override // o.setMenuPrepared
        public final void setTextScaleX(int i) {
            try {
                byte[] bArr = this.setX;
                int i2 = this.setNavigationOnClickListener;
                int i3 = i2 + 1;
                bArr[i2] = (byte) i;
                int i4 = i3 + 1;
                bArr[i3] = (byte) (i >> 8);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (i >> 16);
                this.setNavigationOnClickListener = i5 + 1;
                bArr[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new setIconTintList(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setNavigationOnClickListener), Integer.valueOf(this.setY), 1), e);
            }
        }

        @Override // o.setMenuPrepared
        public final void setY(long j) {
            if (setMenuPrepared.setX && this.setY - this.setNavigationOnClickListener >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.setX;
                    int i = this.setNavigationOnClickListener;
                    this.setNavigationOnClickListener = i + 1;
                    WindowInsetsCompat$Impl20.setY(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.setX;
                int i2 = this.setNavigationOnClickListener;
                this.setNavigationOnClickListener = i2 + 1;
                WindowInsetsCompat$Impl20.setY(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.setX;
                    int i3 = this.setNavigationOnClickListener;
                    this.setNavigationOnClickListener = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new setIconTintList(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setNavigationOnClickListener), Integer.valueOf(this.setY), 1), e);
                }
            }
            byte[] bArr4 = this.setX;
            int i4 = this.setNavigationOnClickListener;
            this.setNavigationOnClickListener = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        @Override // o.setMenuPrepared
        public final void setIconTintList(long j) {
            try {
                byte[] bArr = this.setX;
                int i = this.setNavigationOnClickListener;
                int i2 = i + 1;
                bArr[i] = (byte) j;
                int i3 = i2 + 1;
                bArr[i2] = (byte) (j >> 8);
                int i4 = i3 + 1;
                bArr[i3] = (byte) (j >> 16);
                int i5 = i4 + 1;
                bArr[i4] = (byte) (j >> 24);
                int i6 = i5 + 1;
                bArr[i5] = (byte) (j >> 32);
                int i7 = i6 + 1;
                bArr[i6] = (byte) (j >> 40);
                int i8 = i7 + 1;
                bArr[i7] = (byte) (j >> 48);
                this.setNavigationOnClickListener = i8 + 1;
                bArr[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new setIconTintList(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setNavigationOnClickListener), Integer.valueOf(this.setY), 1), e);
            }
        }

        private void MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.setX, this.setNavigationOnClickListener, i2);
                this.setNavigationOnClickListener += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new setIconTintList(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.setNavigationOnClickListener), Integer.valueOf(this.setY), Integer.valueOf(i2)), e);
            }
        }

        @Override // o.setClipToOutline
        public final void setX(byte[] bArr, int i, int i2) {
            MenuHostHelper$$ExternalSyntheticLambda1(bArr, i, i2);
        }

        @Override // o.setMenuPrepared
        public final void setY(String str) {
            int i = this.setNavigationOnClickListener;
            try {
                int centerIfNoTextEnabled = setCenterIfNoTextEnabled(str.length() * 3);
                int centerIfNoTextEnabled2 = setCenterIfNoTextEnabled(str.length());
                if (centerIfNoTextEnabled2 == centerIfNoTextEnabled) {
                    int i2 = i + centerIfNoTextEnabled2;
                    this.setNavigationOnClickListener = i2;
                    int y = setExpandedTitleMarginEnd.setY(str, this.setX, i2, this.setY - i2);
                    this.setNavigationOnClickListener = i;
                    setAnimationFromJson((y - i) - centerIfNoTextEnabled2);
                    this.setNavigationOnClickListener = y;
                    return;
                }
                setAnimationFromJson(setExpandedTitleMarginEnd.setY(str));
                this.setNavigationOnClickListener = setExpandedTitleMarginEnd.setY(str, this.setX, this.setNavigationOnClickListener, this.setY - this.setNavigationOnClickListener);
            } catch (IndexOutOfBoundsException e) {
                throw new setIconTintList(e);
            } catch (setExpandedTitleMarginEnd.setIconTintList e2) {
                this.setNavigationOnClickListener = i;
                setY(str, e2);
            }
        }

        @Override // o.setMenuPrepared
        public final int setUiOptions() {
            return this.setY - this.setNavigationOnClickListener;
        }

        @Override // o.setMenuPrepared
        public final void setX(int i, boolean z) {
            setAnimationFromJson(setCloseIconVisible.setY(i, 0));
            MenuHostHelper$$ExternalSyntheticLambda0(z ? (byte) 1 : (byte) 0);
        }

        @Override // o.setMenuPrepared
        public final void setX(int i, setSpeed setspeed) {
            setAnimationFromJson(setCloseIconVisible.setY(i, 2));
            setAnimationFromJson(setspeed.setY());
            setspeed.MenuHostHelper$$ExternalSyntheticLambda0(this);
        }

        @Override // o.setMenuPrepared
        public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
            setAnimationFromJson(setCloseIconVisible.setY(i, 5));
            setTextScaleX(i2);
        }

        @Override // o.setMenuPrepared
        public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, long j) {
            setAnimationFromJson(setCloseIconVisible.setY(i, 1));
            setIconTintList(j);
        }

        @Override // o.setMenuPrepared
        public final void setLayoutAnimation(int i, int i2) {
            setAnimationFromJson(setCloseIconVisible.setY(i, 0));
            if (i2 >= 0) {
                setAnimationFromJson(i2);
            } else {
                setY(i2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setMenuPrepared
        public final void setY(int i, setDrawingCacheQuality setdrawingcachequality, setValues setvalues) {
            setAnimationFromJson(setCloseIconVisible.setY(i, 2));
            setAnimationFromJson(((setLeftStripDrawable) setdrawingcachequality).MenuHostHelper$$ExternalSyntheticLambda1(setvalues));
            setvalues.setY((setValues) setdrawingcachequality, (WindowInsetsCompat$Impl29) this.MenuHostHelper$$ExternalSyntheticLambda1);
        }

        @Override // o.setMenuPrepared
        public final void setX(int i, setDrawingCacheQuality setdrawingcachequality) {
            setAnimationFromJson(setCloseIconVisible.setY(1, 3));
            setOnLongClickListener(2, 0);
            setAnimationFromJson(i);
            setAnimationFromJson(setCloseIconVisible.setY(3, 2));
            setAnimationFromJson(setdrawingcachequality.setChipCornerRadius());
            setdrawingcachequality.setIconTintList(this);
            setAnimationFromJson(setCloseIconVisible.setY(1, 4));
        }

        @Override // o.setMenuPrepared
        public final void setY(int i, setSpeed setspeed) {
            setAnimationFromJson(setCloseIconVisible.setY(1, 3));
            setOnLongClickListener(2, 0);
            setAnimationFromJson(i);
            setX(3, setspeed);
            setAnimationFromJson(setCloseIconVisible.setY(1, 4));
        }

        @Override // o.setMenuPrepared
        public final void setX(int i, String str) {
            setAnimationFromJson(setCloseIconVisible.setY(i, 2));
            setY(str);
        }

        @Override // o.setMenuPrepared
        public final void setUiOptions(int i, int i2) {
            setAnimationFromJson(setCloseIconVisible.setY(i, 0));
            setAnimationFromJson(i2);
        }

        @Override // o.setMenuPrepared
        public final void setX(int i, long j) {
            setAnimationFromJson(setCloseIconVisible.setY(i, 0));
            setY(j);
        }
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class setX extends setMenuPrepared {
        int setIconTintList;
        int setUiOptions;
        final int setX;
        final byte[] setY;

        public setX(int i) {
            super((byte) 0);
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            int max = Math.max(i, 20);
            this.setY = new byte[max];
            this.setX = max;
        }

        @Override // o.setMenuPrepared
        public final int setUiOptions() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void setMaxEms(int i) {
            if (setMenuPrepared.setX) {
                long j = this.setIconTintList;
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.setY;
                    int i2 = this.setIconTintList;
                    this.setIconTintList = i2 + 1;
                    WindowInsetsCompat$Impl20.setY(bArr, i2, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                byte[] bArr2 = this.setY;
                int i3 = this.setIconTintList;
                this.setIconTintList = i3 + 1;
                WindowInsetsCompat$Impl20.setY(bArr2, i3, (byte) i);
                this.setUiOptions += (int) (this.setIconTintList - j);
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.setY;
                int i4 = this.setIconTintList;
                this.setIconTintList = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                this.setUiOptions++;
                i >>>= 7;
            }
            byte[] bArr4 = this.setY;
            int i5 = this.setIconTintList;
            this.setIconTintList = i5 + 1;
            bArr4[i5] = (byte) i;
            this.setUiOptions++;
        }

        public final void setNavigationOnClickListener(long j) {
            if (setMenuPrepared.setX) {
                long j2 = this.setIconTintList;
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.setY;
                    int i = this.setIconTintList;
                    this.setIconTintList = i + 1;
                    WindowInsetsCompat$Impl20.setY(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.setY;
                int i2 = this.setIconTintList;
                this.setIconTintList = i2 + 1;
                WindowInsetsCompat$Impl20.setY(bArr2, i2, (byte) j);
                this.setUiOptions += (int) (this.setIconTintList - j2);
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.setY;
                int i3 = this.setIconTintList;
                this.setIconTintList = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                this.setUiOptions++;
                j >>>= 7;
            }
            byte[] bArr4 = this.setY;
            int i4 = this.setIconTintList;
            this.setIconTintList = i4 + 1;
            bArr4[i4] = (byte) j;
            this.setUiOptions++;
        }

        public final void setOnNavigationItemSelectedListener(int i) {
            byte[] bArr = this.setY;
            int i2 = this.setIconTintList;
            int i3 = i2 + 1;
            bArr[i2] = (byte) i;
            int i4 = i3 + 1;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i >> 16);
            this.setIconTintList = i5 + 1;
            bArr[i5] = (byte) (i >>> 24);
            this.setUiOptions += 4;
        }

        public final void setLayoutAnimation(long j) {
            byte[] bArr = this.setY;
            int i = this.setIconTintList;
            int i2 = i + 1;
            bArr[i] = (byte) (j & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i5 + 1;
            bArr[i5] = (byte) (j >> 32);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (j >> 40);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (j >> 48);
            this.setIconTintList = i8 + 1;
            bArr[i8] = (byte) (j >> 56);
            this.setUiOptions += 8;
        }
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, setSpeed setspeed) {
        int centerIfNoTextEnabled = setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0));
        int y = setspeed.setY();
        return centerIfNoTextEnabled + setCenterIfNoTextEnabled(y) + y;
    }

    public static int setY(int i) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + 8;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + (i2 >= 0 ? setCenterIfNoTextEnabled(i2) : 10);
    }

    public static int setX(int i) {
        if (i >= 0) {
            return setCenterIfNoTextEnabled(i);
        }
        return 10;
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + 4;
    }

    public static int setIconTintList(int i) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + 8;
    }

    public static int setLayoutAnimation(int i) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + 4;
    }

    @Deprecated
    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, setDrawingCacheQuality setdrawingcachequality, setValues setvalues) {
        return (setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) << 1) + ((setLeftStripDrawable) setdrawingcachequality).MenuHostHelper$$ExternalSyntheticLambda1(setvalues);
    }

    public static int setX(int i, int i2) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + (i2 >= 0 ? setCenterIfNoTextEnabled(i2) : 10);
    }

    public static int setIconTintList(int i, long j) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + setX(j);
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, setAddStatesFromChildren setaddstatesfromchildren) {
        int centerIfNoTextEnabled = setCenterIfNoTextEnabled(setCloseIconVisible.setY(1, 0));
        int centerIfNoTextEnabled2 = setCenterIfNoTextEnabled(setCloseIconVisible.setY(2, 0)) + setCenterIfNoTextEnabled(i);
        int centerIfNoTextEnabled3 = setCenterIfNoTextEnabled(setCloseIconVisible.setY(3, 0));
        int iconTintList = setaddstatesfromchildren.setIconTintList();
        return (centerIfNoTextEnabled << 1) + centerIfNoTextEnabled2 + centerIfNoTextEnabled3 + setCenterIfNoTextEnabled(iconTintList) + iconTintList;
    }

    public static int setY(int i, setAddStatesFromChildren setaddstatesfromchildren) {
        int centerIfNoTextEnabled = setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0));
        int iconTintList = setaddstatesfromchildren.setIconTintList();
        return centerIfNoTextEnabled + setCenterIfNoTextEnabled(iconTintList) + iconTintList;
    }

    public static int setIconTintList(int i, setDrawingCacheQuality setdrawingcachequality) {
        int centerIfNoTextEnabled = setCenterIfNoTextEnabled(setCloseIconVisible.setY(1, 0));
        int centerIfNoTextEnabled2 = setCenterIfNoTextEnabled(setCloseIconVisible.setY(2, 0)) + setCenterIfNoTextEnabled(i);
        int centerIfNoTextEnabled3 = setCenterIfNoTextEnabled(setCloseIconVisible.setY(3, 0));
        int chipCornerRadius = setdrawingcachequality.setChipCornerRadius();
        return (centerIfNoTextEnabled << 1) + centerIfNoTextEnabled2 + centerIfNoTextEnabled3 + setCenterIfNoTextEnabled(chipCornerRadius) + chipCornerRadius;
    }

    public static int setX(int i, setDrawingCacheQuality setdrawingcachequality, setValues setvalues) {
        int centerIfNoTextEnabled = setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0));
        int MenuHostHelper$$ExternalSyntheticLambda1 = ((setLeftStripDrawable) setdrawingcachequality).MenuHostHelper$$ExternalSyntheticLambda1(setvalues);
        return centerIfNoTextEnabled + setCenterIfNoTextEnabled(MenuHostHelper$$ExternalSyntheticLambda1) + MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public static int setIconTintList(int i, setSpeed setspeed) {
        int centerIfNoTextEnabled = setCenterIfNoTextEnabled(setCloseIconVisible.setY(1, 0));
        int centerIfNoTextEnabled2 = setCenterIfNoTextEnabled(setCloseIconVisible.setY(2, 0)) + setCenterIfNoTextEnabled(i);
        int centerIfNoTextEnabled3 = setCenterIfNoTextEnabled(setCloseIconVisible.setY(3, 0));
        int y = setspeed.setY();
        return (centerIfNoTextEnabled << 1) + centerIfNoTextEnabled2 + centerIfNoTextEnabled3 + setCenterIfNoTextEnabled(y) + y;
    }

    public static int setTextAlignment(int i) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + 4;
    }

    public static int setIconSize(int i) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + 8;
    }

    public static int setIconTintList(int i, int i2) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + setCenterIfNoTextEnabled((i2 << 1) ^ (i2 >> 31));
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, long j) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + setX((j << 1) ^ (j >> 63));
    }

    public static int setIconTintList(int i, String str) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + MenuHostHelper$$ExternalSyntheticLambda0(str);
    }

    public static int setY(int i, int i2) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + setCenterIfNoTextEnabled(i2);
    }

    public static int setY(int i, long j) {
        return setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0)) + setX(j);
    }
}