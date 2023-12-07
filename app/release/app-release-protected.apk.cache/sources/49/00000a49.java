package o;

import java.util.Arrays;
import o.setProgressDrawableTiled;

/* loaded from: classes.dex */
public abstract class setCloseIcon {
    BottomAppBar$Behavior MenuHostHelper$$ExternalSyntheticLambda0;
    int MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    int setX;
    private boolean setY;

    public abstract boolean MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract int MenuHostHelper$$ExternalSyntheticLambda1();

    public abstract boolean MenuHostHelper$$ExternalSyntheticLambda1(int i);

    public abstract int ViewPager$SavedState$1();

    public abstract int setAnimationFromJson();

    abstract long setCenterIfNoTextEnabled();

    public abstract long setChipCornerRadius();

    public abstract long setIconSize();

    public abstract void setIconTintList(int i);

    public abstract boolean setIconTintList();

    public abstract int setLayoutAnimation();

    public abstract long setLayoutDirection();

    public abstract String setMaxEms();

    public abstract long setNavigationOnClickListener();

    public abstract int setOnLongClickListener();

    public abstract String setOnNavigationItemSelectedListener();

    public abstract int setTextAlignment();

    public abstract int setTextScaleX();

    public abstract float setUiOptions();

    public abstract int setUnboundedRipple();

    public abstract int setX(int i);

    public abstract setSpeed setX();

    public abstract double setY();

    public abstract void setY(int i);

    public abstract long setZ();

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setCloseIcon(byte b) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setCloseIcon setY(byte[] bArr, int i, int i2, boolean z) {
        setY sety = new setY(bArr, 0, i2, false, (byte) 0);
        try {
            sety.setX(i2);
            return sety;
        } catch (setProgressDrawableTiled e) {
            throw new IllegalArgumentException(e);
        }
    }

    private setCloseIcon() {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 100;
        this.setX = Integer.MAX_VALUE;
        this.setY = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY extends setCloseIcon {
        private int ViewPager$SavedState$1;
        private int setCenterIfNoTextEnabled;
        private int setLayoutAnimation;
        private int setNavigationOnClickListener;
        private boolean setOnLongClickListener;
        private int setTextAlignment;
        private int setUiOptions;
        private final boolean setUnboundedRipple;
        private final byte[] setY;

        /* synthetic */ setY(byte[] bArr, int i, int i2, boolean z, byte b) {
            this(bArr, i, i2, z);
        }

        private setY(byte[] bArr, int i, int i2, boolean z) {
            super((byte) 0);
            this.setNavigationOnClickListener = Integer.MAX_VALUE;
            this.setY = bArr;
            this.ViewPager$SavedState$1 = i2 + i;
            this.setTextAlignment = i;
            this.setCenterIfNoTextEnabled = i;
            this.setUnboundedRipple = z;
        }

        @Override // o.setCloseIcon
        public final void setIconTintList(int i) {
            if (this.setUiOptions != 0) {
                throw new setProgressDrawableTiled("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // o.setCloseIcon
        public final boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
            int animationFromJson;
            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(i);
            int i2 = 0;
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                if (this.ViewPager$SavedState$1 - this.setTextAlignment >= 10) {
                    while (i2 < 10) {
                        byte[] bArr = this.setY;
                        int i3 = this.setTextAlignment;
                        this.setTextAlignment = i3 + 1;
                        if (bArr[i3] < 0) {
                            i2++;
                        }
                    }
                    throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
                }
                while (i2 < 10) {
                    if (setMinAndMaxProgress() < 0) {
                        i2++;
                    }
                }
                throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
                return true;
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                MenuHostHelper$$ExternalSyntheticLambda0(8);
                return true;
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                MenuHostHelper$$ExternalSyntheticLambda0(setChipIconTintResource());
                return true;
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 != 3) {
                if (MenuHostHelper$$ExternalSyntheticLambda1 != 4) {
                    if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                        MenuHostHelper$$ExternalSyntheticLambda0(4);
                        return true;
                    }
                    throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
                }
                return false;
            } else {
                do {
                    animationFromJson = setAnimationFromJson();
                    if (animationFromJson == 0) {
                        break;
                    }
                } while (MenuHostHelper$$ExternalSyntheticLambda1(animationFromJson));
                if (this.setUiOptions == setCloseIconVisible.setY(setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(i), 4)) {
                    return true;
                }
                throw new setProgressDrawableTiled("Protocol message end-group tag did not match expected tag.");
            }
        }

        @Override // o.setCloseIcon
        public final double setY() {
            return Double.longBitsToDouble(setCheckedIconEnabled());
        }

        @Override // o.setCloseIcon
        public final float setUiOptions() {
            return Float.intBitsToFloat(setGuidelinePercent());
        }

        @Override // o.setCloseIcon
        public final long setLayoutDirection() {
            return ExtendableSavedState$1();
        }

        @Override // o.setCloseIcon
        public final long setIconSize() {
            return ExtendableSavedState$1();
        }

        @Override // o.setCloseIcon
        public final int setUnboundedRipple() {
            return setChipIconTintResource();
        }

        @Override // o.setCloseIcon
        public final long setNavigationOnClickListener() {
            return setCheckedIconEnabled();
        }

        @Override // o.setCloseIcon
        public final int setLayoutAnimation() {
            return setGuidelinePercent();
        }

        @Override // o.setCloseIcon
        public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
            return ExtendableSavedState$1() != 0;
        }

        @Override // o.setCloseIcon
        public final String setOnNavigationItemSelectedListener() {
            int chipIconTintResource = setChipIconTintResource();
            if (chipIconTintResource > 0) {
                int i = this.ViewPager$SavedState$1;
                int i2 = this.setTextAlignment;
                if (chipIconTintResource <= i - i2) {
                    String str = new String(this.setY, i2, chipIconTintResource, setViewCacheExtension.setY);
                    this.setTextAlignment += chipIconTintResource;
                    return str;
                }
            }
            if (chipIconTintResource == 0) {
                return "";
            }
            if (chipIconTintResource < 0) {
                throw new setProgressDrawableTiled("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setCloseIcon
        public final String setMaxEms() {
            int chipIconTintResource = setChipIconTintResource();
            if (chipIconTintResource > 0) {
                int i = this.ViewPager$SavedState$1;
                int i2 = this.setTextAlignment;
                if (chipIconTintResource <= i - i2) {
                    String x = setExpandedTitleMarginEnd.setX(this.setY, i2, chipIconTintResource);
                    this.setTextAlignment += chipIconTintResource;
                    return x;
                }
            }
            if (chipIconTintResource == 0) {
                return "";
            }
            if (chipIconTintResource <= 0) {
                throw new setProgressDrawableTiled("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setCloseIcon
        public final setSpeed setX() {
            byte[] bArr;
            int chipIconTintResource = setChipIconTintResource();
            if (chipIconTintResource > 0) {
                int i = this.ViewPager$SavedState$1;
                int i2 = this.setTextAlignment;
                if (chipIconTintResource <= i - i2) {
                    boolean z = this.setUnboundedRipple;
                    setSpeed x = setSpeed.setX(this.setY, i2, chipIconTintResource);
                    this.setTextAlignment += chipIconTintResource;
                    return x;
                }
            }
            if (chipIconTintResource == 0) {
                return setSpeed.setIconTintList;
            }
            if (chipIconTintResource > 0) {
                int i3 = this.ViewPager$SavedState$1;
                int i4 = this.setTextAlignment;
                if (chipIconTintResource <= i3 - i4) {
                    int i5 = chipIconTintResource + i4;
                    this.setTextAlignment = i5;
                    bArr = Arrays.copyOfRange(this.setY, i4, i5);
                    return setSpeed.MenuHostHelper$$ExternalSyntheticLambda0(bArr);
                }
            }
            if (chipIconTintResource <= 0) {
                if (chipIconTintResource == 0) {
                    bArr = setViewCacheExtension.setIconTintList;
                    return setSpeed.MenuHostHelper$$ExternalSyntheticLambda0(bArr);
                }
                throw new setProgressDrawableTiled("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setCloseIcon
        public final int setTextScaleX() {
            return setChipIconTintResource();
        }

        @Override // o.setCloseIcon
        public final int setOnLongClickListener() {
            return setChipIconTintResource();
        }

        @Override // o.setCloseIcon
        public final int ViewPager$SavedState$1() {
            return setGuidelinePercent();
        }

        @Override // o.setCloseIcon
        public final long setChipCornerRadius() {
            return setCheckedIconEnabled();
        }

        @Override // o.setCloseIcon
        public final int setTextAlignment() {
            int chipIconTintResource = setChipIconTintResource();
            return (chipIconTintResource >>> 1) ^ (-(chipIconTintResource & 1));
        }

        @Override // o.setCloseIcon
        public final long setZ() {
            long ExtendableSavedState$1 = ExtendableSavedState$1();
            return (ExtendableSavedState$1 >>> 1) ^ (-(1 & ExtendableSavedState$1));
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
            if (r2[r3] < 0) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private int setChipIconTintResource() {
            /*
                r5 = this;
                int r0 = r5.setTextAlignment
                int r1 = r5.ViewPager$SavedState$1
                if (r1 == r0) goto L6c
                byte[] r2 = r5.setY
                int r3 = r0 + 1
                r0 = r2[r0]
                if (r0 < 0) goto L11
                r5.setTextAlignment = r3
                return r0
            L11:
                int r1 = r1 - r3
                r4 = 9
                if (r1 < r4) goto L6c
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L22
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L69
            L22:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L2f
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L2d:
                r1 = r3
                goto L69
            L2f:
                int r1 = r3 + 1
                r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L3d
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L69
            L3d:
                int r3 = r1 + 1
                r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L2d
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L69
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2d
                int r1 = r3 + 1
                r3 = r2[r3]
                if (r3 >= 0) goto L69
                int r3 = r1 + 1
                r1 = r2[r1]
                if (r1 >= 0) goto L2d
                int r1 = r3 + 1
                r2 = r2[r3]
                if (r2 >= 0) goto L69
                goto L6c
            L69:
                r5.setTextAlignment = r1
                return r0
            L6c:
                long r0 = r5.setCenterIfNoTextEnabled()
                int r1 = (int) r0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setCloseIcon.setY.setChipIconTintResource():int");
        }

        private long ExtendableSavedState$1() {
            long j;
            long j2;
            long j3;
            long j4;
            int i;
            int i2 = this.setTextAlignment;
            int i3 = this.ViewPager$SavedState$1;
            if (i3 != i2) {
                byte[] bArr = this.setY;
                int i4 = i2 + 1;
                byte b = bArr[i2];
                if (b >= 0) {
                    this.setTextAlignment = i4;
                    return b;
                } else if (i3 - i4 >= 9) {
                    int i5 = i4 + 1;
                    int i6 = b ^ (bArr[i4] << 7);
                    if (i6 >= 0) {
                        int i7 = i5 + 1;
                        int i8 = i6 ^ (bArr[i5] << 14);
                        if (i8 >= 0) {
                            j = i8 ^ 16256;
                        } else {
                            i5 = i7 + 1;
                            int i9 = i8 ^ (bArr[i7] << 21);
                            if (i9 >= 0) {
                                long j5 = i9;
                                int i10 = i5 + 1;
                                long j6 = j5 ^ (bArr[i5] << 28);
                                if (j6 < 0) {
                                    i5 = i10 + 1;
                                    long j7 = j6 ^ (bArr[i10] << 35);
                                    if (j7 < 0) {
                                        j3 = -34093383808L;
                                    } else {
                                        i10 = i5 + 1;
                                        j6 = j7 ^ (bArr[i5] << 42);
                                        if (j6 >= 0) {
                                            j4 = 4363953127296L;
                                        } else {
                                            i5 = i10 + 1;
                                            j7 = j6 ^ (bArr[i10] << 49);
                                            if (j7 < 0) {
                                                j3 = -558586000294016L;
                                            } else {
                                                int i11 = i5 + 1;
                                                long j8 = (j7 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                                if (j8 < 0) {
                                                    i5 = i11 + 1;
                                                    if (bArr[i11] >= 0) {
                                                        j2 = j8;
                                                        this.setTextAlignment = i5;
                                                        return j2;
                                                    }
                                                } else {
                                                    i7 = i11;
                                                    j = j8;
                                                }
                                            }
                                        }
                                    }
                                    j2 = j7 ^ j3;
                                    this.setTextAlignment = i5;
                                    return j2;
                                }
                                j4 = 266354560;
                                j2 = j6 ^ j4;
                                i5 = i10;
                                this.setTextAlignment = i5;
                                return j2;
                            }
                            i = i9 ^ (-2080896);
                        }
                        i5 = i7;
                        j2 = j;
                        this.setTextAlignment = i5;
                        return j2;
                    }
                    i = i6 ^ (-128);
                    j2 = i;
                    this.setTextAlignment = i5;
                    return j2;
                }
            }
            return setCenterIfNoTextEnabled();
        }

        @Override // o.setCloseIcon
        final long setCenterIfNoTextEnabled() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte minAndMaxProgress = setMinAndMaxProgress();
                j |= (minAndMaxProgress & Byte.MAX_VALUE) << i;
                if ((minAndMaxProgress & 128) == 0) {
                    return j;
                }
            }
            throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
        }

        private int setGuidelinePercent() {
            int i = this.setTextAlignment;
            if (this.ViewPager$SavedState$1 - i < 4) {
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.setY;
            this.setTextAlignment = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        private long setCheckedIconEnabled() {
            int i = this.setTextAlignment;
            if (this.ViewPager$SavedState$1 - i < 8) {
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.setY;
            this.setTextAlignment = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        private void setTextAppearanceResource() {
            int i = this.ViewPager$SavedState$1 + this.setLayoutAnimation;
            this.ViewPager$SavedState$1 = i;
            int i2 = i - this.setCenterIfNoTextEnabled;
            int i3 = this.setNavigationOnClickListener;
            if (i2 > i3) {
                int i4 = i2 - i3;
                this.setLayoutAnimation = i4;
                this.ViewPager$SavedState$1 = i - i4;
                return;
            }
            this.setLayoutAnimation = 0;
        }

        @Override // o.setCloseIcon
        public final void setY(int i) {
            this.setNavigationOnClickListener = i;
            setTextAppearanceResource();
        }

        @Override // o.setCloseIcon
        public final boolean setIconTintList() {
            return this.setTextAlignment == this.ViewPager$SavedState$1;
        }

        @Override // o.setCloseIcon
        public final int MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setTextAlignment - this.setCenterIfNoTextEnabled;
        }

        private byte setMinAndMaxProgress() {
            int i = this.setTextAlignment;
            if (i == this.ViewPager$SavedState$1) {
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.setY;
            this.setTextAlignment = i + 1;
            return bArr[i];
        }

        private void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            if (i >= 0) {
                int i2 = this.ViewPager$SavedState$1;
                int i3 = this.setTextAlignment;
                if (i <= i2 - i3) {
                    this.setTextAlignment = i3 + i;
                    return;
                }
            }
            if (i < 0) {
                throw new setProgressDrawableTiled("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }

        @Override // o.setCloseIcon
        public final int setX(int i) {
            if (i < 0) {
                throw new setProgressDrawableTiled("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            int i2 = i + (this.setTextAlignment - this.setCenterIfNoTextEnabled);
            int i3 = this.setNavigationOnClickListener;
            if (i2 > i3) {
                throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.setNavigationOnClickListener = i2;
            setTextAppearanceResource();
            return i3;
        }

        @Override // o.setCloseIcon
        public final int setAnimationFromJson() {
            if (this.setTextAlignment == this.ViewPager$SavedState$1) {
                this.setUiOptions = 0;
                return 0;
            }
            int chipIconTintResource = setChipIconTintResource();
            this.setUiOptions = chipIconTintResource;
            if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(chipIconTintResource) == 0) {
                throw new setProgressDrawableTiled("Protocol message contained an invalid tag (zero).");
            }
            return this.setUiOptions;
        }
    }
}