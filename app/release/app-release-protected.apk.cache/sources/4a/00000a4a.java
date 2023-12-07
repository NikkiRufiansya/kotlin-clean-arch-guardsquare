package o;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import o.setProgressDrawableTiled;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setCloseIcon$MenuHostHelper$$ExternalSyntheticLambda1 extends setCloseIcon {
    private int setCenterIfNoTextEnabled;
    private int setChipCornerRadius;
    private setY setIconSize;
    private int setLayoutAnimation;
    private final InputStream setNavigationOnClickListener;
    private int setOnLongClickListener;
    private int setUiOptions;
    private int setUnboundedRipple;
    private final byte[] setY;

    /* loaded from: classes.dex */
    interface setY {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ setCloseIcon$MenuHostHelper$$ExternalSyntheticLambda1(InputStream inputStream, int i, byte b) {
        this(inputStream, 4096);
    }

    private setCloseIcon$MenuHostHelper$$ExternalSyntheticLambda1(InputStream inputStream, int i) {
        super((byte) 0);
        this.setUiOptions = Integer.MAX_VALUE;
        this.setIconSize = null;
        setViewCacheExtension.MenuHostHelper$$ExternalSyntheticLambda0(inputStream, "input");
        this.setNavigationOnClickListener = inputStream;
        this.setY = new byte[i];
        this.setLayoutAnimation = 0;
        this.setCenterIfNoTextEnabled = 0;
        this.setChipCornerRadius = 0;
    }

    @Override // o.setCloseIcon
    public final void setIconTintList(int i) {
        if (this.setOnLongClickListener != 0) {
            throw new setProgressDrawableTiled("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // o.setCloseIcon
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        int animationFromJson;
        int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(i);
        int i2 = 0;
        if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
            if (this.setLayoutAnimation - this.setCenterIfNoTextEnabled >= 10) {
                while (i2 < 10) {
                    byte[] bArr = this.setY;
                    int i3 = this.setCenterIfNoTextEnabled;
                    this.setCenterIfNoTextEnabled = i3 + 1;
                    if (bArr[i3] < 0) {
                        i2++;
                    }
                }
                throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
            }
            while (i2 < 10) {
                if (setTextAppearanceResource() < 0) {
                    i2++;
                }
            }
            throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
            return true;
        } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
            setTextAlignment(8);
            return true;
        } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
            setTextAlignment(SearchView$SavedState$1());
            return true;
        } else if (MenuHostHelper$$ExternalSyntheticLambda1 != 3) {
            if (MenuHostHelper$$ExternalSyntheticLambda1 != 4) {
                if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                    setTextAlignment(4);
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
            if (this.setOnLongClickListener == setCloseIconVisible.setY(setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(i), 4)) {
                return true;
            }
            throw new setProgressDrawableTiled("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // o.setCloseIcon
    public final double setY() {
        return Double.longBitsToDouble(setGuidelinePercent());
    }

    @Override // o.setCloseIcon
    public final float setUiOptions() {
        return Float.intBitsToFloat(setCheckedIconEnabled());
    }

    @Override // o.setCloseIcon
    public final long setLayoutDirection() {
        return setIconified();
    }

    @Override // o.setCloseIcon
    public final long setIconSize() {
        return setIconified();
    }

    @Override // o.setCloseIcon
    public final int setUnboundedRipple() {
        return SearchView$SavedState$1();
    }

    @Override // o.setCloseIcon
    public final long setNavigationOnClickListener() {
        return setGuidelinePercent();
    }

    @Override // o.setCloseIcon
    public final int setLayoutAnimation() {
        return setCheckedIconEnabled();
    }

    @Override // o.setCloseIcon
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return setIconified() != 0;
    }

    @Override // o.setCloseIcon
    public final String setOnNavigationItemSelectedListener() {
        int SearchView$SavedState$1 = SearchView$SavedState$1();
        if (SearchView$SavedState$1 > 0) {
            int i = this.setLayoutAnimation;
            int i2 = this.setCenterIfNoTextEnabled;
            if (SearchView$SavedState$1 <= i - i2) {
                String str = new String(this.setY, i2, SearchView$SavedState$1, setViewCacheExtension.setY);
                this.setCenterIfNoTextEnabled += SearchView$SavedState$1;
                return str;
            }
        }
        if (SearchView$SavedState$1 == 0) {
            return "";
        }
        if (SearchView$SavedState$1 <= this.setLayoutAnimation) {
            setNavigationOnClickListener(SearchView$SavedState$1);
            String str2 = new String(this.setY, this.setCenterIfNoTextEnabled, SearchView$SavedState$1, setViewCacheExtension.setY);
            this.setCenterIfNoTextEnabled += SearchView$SavedState$1;
            return str2;
        }
        return new String(MenuHostHelper$$ExternalSyntheticLambda0(SearchView$SavedState$1), setViewCacheExtension.setY);
    }

    @Override // o.setCloseIcon
    public final String setMaxEms() {
        byte[] MenuHostHelper$$ExternalSyntheticLambda0;
        int SearchView$SavedState$1 = SearchView$SavedState$1();
        int i = this.setCenterIfNoTextEnabled;
        int i2 = this.setLayoutAnimation;
        if (SearchView$SavedState$1 <= i2 - i && SearchView$SavedState$1 > 0) {
            MenuHostHelper$$ExternalSyntheticLambda0 = this.setY;
            this.setCenterIfNoTextEnabled = i + SearchView$SavedState$1;
        } else if (SearchView$SavedState$1 == 0) {
            return "";
        } else {
            i = 0;
            if (SearchView$SavedState$1 <= i2) {
                setNavigationOnClickListener(SearchView$SavedState$1);
                MenuHostHelper$$ExternalSyntheticLambda0 = this.setY;
                this.setCenterIfNoTextEnabled = SearchView$SavedState$1;
            } else {
                MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(SearchView$SavedState$1);
            }
        }
        return setExpandedTitleMarginEnd.setX(MenuHostHelper$$ExternalSyntheticLambda0, i, SearchView$SavedState$1);
    }

    @Override // o.setCloseIcon
    public final setSpeed setX() {
        int SearchView$SavedState$1 = SearchView$SavedState$1();
        int i = this.setLayoutAnimation;
        int i2 = this.setCenterIfNoTextEnabled;
        if (SearchView$SavedState$1 <= i - i2 && SearchView$SavedState$1 > 0) {
            setSpeed x = setSpeed.setX(this.setY, i2, SearchView$SavedState$1);
            this.setCenterIfNoTextEnabled += SearchView$SavedState$1;
            return x;
        } else if (SearchView$SavedState$1 == 0) {
            return setSpeed.setIconTintList;
        } else {
            byte[] onLongClickListener = setOnLongClickListener(SearchView$SavedState$1);
            if (onLongClickListener != null) {
                return setSpeed.setX(onLongClickListener);
            }
            int i3 = this.setCenterIfNoTextEnabled;
            int i4 = this.setLayoutAnimation;
            int i5 = i4 - i3;
            this.setChipCornerRadius += i4;
            this.setCenterIfNoTextEnabled = 0;
            this.setLayoutAnimation = 0;
            List<byte[]> uiOptions = setUiOptions(SearchView$SavedState$1 - i5);
            byte[] bArr = new byte[SearchView$SavedState$1];
            System.arraycopy(this.setY, i3, bArr, 0, i5);
            for (byte[] bArr2 : uiOptions) {
                System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
                i5 += bArr2.length;
            }
            return setSpeed.MenuHostHelper$$ExternalSyntheticLambda0(bArr);
        }
    }

    @Override // o.setCloseIcon
    public final int setTextScaleX() {
        return SearchView$SavedState$1();
    }

    @Override // o.setCloseIcon
    public final int setOnLongClickListener() {
        return SearchView$SavedState$1();
    }

    @Override // o.setCloseIcon
    public final int ViewPager$SavedState$1() {
        return setCheckedIconEnabled();
    }

    @Override // o.setCloseIcon
    public final long setChipCornerRadius() {
        return setGuidelinePercent();
    }

    @Override // o.setCloseIcon
    public final int setTextAlignment() {
        int SearchView$SavedState$1 = SearchView$SavedState$1();
        return (SearchView$SavedState$1 >>> 1) ^ (-(SearchView$SavedState$1 & 1));
    }

    @Override // o.setCloseIcon
    public final long setZ() {
        long iconified = setIconified();
        return (iconified >>> 1) ^ (-(1 & iconified));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        if (r2[r3] < 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int SearchView$SavedState$1() {
        /*
            r5 = this;
            int r0 = r5.setCenterIfNoTextEnabled
            int r1 = r5.setLayoutAnimation
            if (r1 == r0) goto L6c
            byte[] r2 = r5.setY
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L11
            r5.setCenterIfNoTextEnabled = r3
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
            r5.setCenterIfNoTextEnabled = r1
            return r0
        L6c:
            long r0 = r5.setCenterIfNoTextEnabled()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCloseIcon$MenuHostHelper$$ExternalSyntheticLambda1.SearchView$SavedState$1():int");
    }

    private long setIconified() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        int i2 = this.setCenterIfNoTextEnabled;
        int i3 = this.setLayoutAnimation;
        if (i3 != i2) {
            byte[] bArr = this.setY;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.setCenterIfNoTextEnabled = i4;
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
                                                    this.setCenterIfNoTextEnabled = i5;
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
                                this.setCenterIfNoTextEnabled = i5;
                                return j2;
                            }
                            j4 = 266354560;
                            j2 = j6 ^ j4;
                            i5 = i10;
                            this.setCenterIfNoTextEnabled = i5;
                            return j2;
                        }
                        i = i9 ^ (-2080896);
                    }
                    i5 = i7;
                    j2 = j;
                    this.setCenterIfNoTextEnabled = i5;
                    return j2;
                }
                i = i6 ^ (-128);
                j2 = i;
                this.setCenterIfNoTextEnabled = i5;
                return j2;
            }
        }
        return setCenterIfNoTextEnabled();
    }

    @Override // o.setCloseIcon
    final long setCenterIfNoTextEnabled() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte textAppearanceResource = setTextAppearanceResource();
            j |= (textAppearanceResource & Byte.MAX_VALUE) << i;
            if ((textAppearanceResource & 128) == 0) {
                return j;
            }
        }
        throw new setProgressDrawableTiled("CodedInputStream encountered a malformed varint.");
    }

    private int setCheckedIconEnabled() {
        int i = this.setCenterIfNoTextEnabled;
        if (this.setLayoutAnimation - i < 4) {
            setNavigationOnClickListener(4);
            i = this.setCenterIfNoTextEnabled;
        }
        byte[] bArr = this.setY;
        this.setCenterIfNoTextEnabled = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private long setGuidelinePercent() {
        int i = this.setCenterIfNoTextEnabled;
        if (this.setLayoutAnimation - i < 8) {
            setNavigationOnClickListener(8);
            i = this.setCenterIfNoTextEnabled;
        }
        byte[] bArr = this.setY;
        this.setCenterIfNoTextEnabled = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    @Override // o.setCloseIcon
    public final int setX(int i) {
        if (i < 0) {
            throw new setProgressDrawableTiled("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + this.setChipCornerRadius + this.setCenterIfNoTextEnabled;
        int i3 = this.setUiOptions;
        if (i2 > i3) {
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.setUiOptions = i2;
        setMinAndMaxProgress();
        return i3;
    }

    private void setMinAndMaxProgress() {
        int i = this.setLayoutAnimation + this.setUnboundedRipple;
        this.setLayoutAnimation = i;
        int i2 = this.setChipCornerRadius + i;
        int i3 = this.setUiOptions;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.setUnboundedRipple = i4;
            this.setLayoutAnimation = i - i4;
            return;
        }
        this.setUnboundedRipple = 0;
    }

    @Override // o.setCloseIcon
    public final void setY(int i) {
        this.setUiOptions = i;
        setMinAndMaxProgress();
    }

    @Override // o.setCloseIcon
    public final boolean setIconTintList() {
        return this.setCenterIfNoTextEnabled == this.setLayoutAnimation && !setUnboundedRipple(1);
    }

    @Override // o.setCloseIcon
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setChipCornerRadius + this.setCenterIfNoTextEnabled;
    }

    private void setNavigationOnClickListener(int i) {
        if (setUnboundedRipple(i)) {
            return;
        }
        if (i > (this.setX - this.setChipCornerRadius) - this.setCenterIfNoTextEnabled) {
            throw new setProgressDrawableTiled("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    private boolean setUnboundedRipple(int i) {
        if (this.setCenterIfNoTextEnabled + i <= this.setLayoutAnimation) {
            StringBuilder sb = new StringBuilder("refillBuffer() called when ");
            sb.append(i);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i2 = this.setX;
        int i3 = this.setChipCornerRadius;
        int i4 = this.setCenterIfNoTextEnabled;
        if (i <= (i2 - i3) - i4 && i3 + i4 + i <= this.setUiOptions) {
            if (i4 > 0) {
                int i5 = this.setLayoutAnimation;
                if (i5 > i4) {
                    byte[] bArr = this.setY;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.setChipCornerRadius += i4;
                this.setLayoutAnimation -= i4;
                this.setCenterIfNoTextEnabled = 0;
            }
            InputStream inputStream = this.setNavigationOnClickListener;
            byte[] bArr2 = this.setY;
            int i6 = this.setLayoutAnimation;
            int read = inputStream.read(bArr2, i6, Math.min(bArr2.length - i6, (this.setX - this.setChipCornerRadius) - this.setLayoutAnimation));
            if (read == 0 || read < -1 || read > this.setY.length) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.setNavigationOnClickListener.getClass());
                sb2.append("#read(byte[]) returned invalid result: ");
                sb2.append(read);
                sb2.append("\nThe InputStream implementation is buggy.");
                throw new IllegalStateException(sb2.toString());
            } else if (read > 0) {
                this.setLayoutAnimation += read;
                setMinAndMaxProgress();
                if (this.setLayoutAnimation >= i) {
                    return true;
                }
                return setUnboundedRipple(i);
            } else {
                return false;
            }
        }
        return false;
    }

    private byte setTextAppearanceResource() {
        if (this.setCenterIfNoTextEnabled == this.setLayoutAnimation) {
            setNavigationOnClickListener(1);
        }
        byte[] bArr = this.setY;
        int i = this.setCenterIfNoTextEnabled;
        this.setCenterIfNoTextEnabled = i + 1;
        return bArr[i];
    }

    private byte[] MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        byte[] onLongClickListener = setOnLongClickListener(i);
        if (onLongClickListener != null) {
            return onLongClickListener;
        }
        int i2 = this.setCenterIfNoTextEnabled;
        int i3 = this.setLayoutAnimation;
        int i4 = i3 - i2;
        this.setChipCornerRadius += i3;
        this.setCenterIfNoTextEnabled = 0;
        this.setLayoutAnimation = 0;
        List<byte[]> uiOptions = setUiOptions(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.setY, i2, bArr, 0, i4);
        for (byte[] bArr2 : uiOptions) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    private byte[] setOnLongClickListener(int i) {
        if (i == 0) {
            return setViewCacheExtension.setIconTintList;
        }
        if (i < 0) {
            throw new setProgressDrawableTiled("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.setChipCornerRadius + this.setCenterIfNoTextEnabled + i;
        if (i2 - this.setX > 0) {
            throw new setProgressDrawableTiled("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i3 = this.setUiOptions;
        if (i2 > i3) {
            setTextAlignment((i3 - this.setChipCornerRadius) - this.setCenterIfNoTextEnabled);
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i4 = this.setLayoutAnimation - this.setCenterIfNoTextEnabled;
        int i5 = i - i4;
        if (i5 < 4096 || i5 <= this.setNavigationOnClickListener.available()) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.setY, this.setCenterIfNoTextEnabled, bArr, 0, i4);
            this.setChipCornerRadius += this.setLayoutAnimation;
            this.setCenterIfNoTextEnabled = 0;
            this.setLayoutAnimation = 0;
            while (i4 < i) {
                int read = this.setNavigationOnClickListener.read(bArr, i4, i - i4);
                if (read == -1) {
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.setChipCornerRadius += read;
                i4 += read;
            }
            return bArr;
        }
        return null;
    }

    private List<byte[]> setUiOptions(int i) {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.setNavigationOnClickListener.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.setChipCornerRadius += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private void setTextAlignment(int i) {
        int i2 = this.setLayoutAnimation;
        int i3 = this.setCenterIfNoTextEnabled;
        if (i <= i2 - i3 && i >= 0) {
            this.setCenterIfNoTextEnabled = i3 + i;
        } else {
            setLayoutAnimation(i);
        }
    }

    private void setLayoutAnimation(int i) {
        if (i < 0) {
            throw new setProgressDrawableTiled("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.setChipCornerRadius;
        int i3 = this.setCenterIfNoTextEnabled;
        int i4 = this.setUiOptions;
        int i5 = i2 + i3;
        if (i5 + i > i4) {
            setTextAlignment((i4 - i2) - i3);
            throw new setProgressDrawableTiled("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.setChipCornerRadius = i5;
        int i6 = this.setLayoutAnimation;
        this.setLayoutAnimation = 0;
        this.setCenterIfNoTextEnabled = 0;
        int i7 = i6 - i3;
        while (i7 < i) {
            try {
                long j = i - i7;
                long skip = this.setNavigationOnClickListener.skip(j);
                int i8 = (skip > 0L ? 1 : (skip == 0L ? 0 : -1));
                if (i8 >= 0 && skip <= j) {
                    if (i8 == 0) {
                        break;
                    }
                    i7 += (int) skip;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.setNavigationOnClickListener.getClass());
                    sb.append("#skip returned invalid result: ");
                    sb.append(skip);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
            } finally {
                this.setChipCornerRadius += i7;
                setMinAndMaxProgress();
            }
        }
        if (i7 >= i) {
            return;
        }
        int i9 = this.setLayoutAnimation;
        int i10 = i9 - this.setCenterIfNoTextEnabled;
        this.setCenterIfNoTextEnabled = i9;
        setNavigationOnClickListener(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.setLayoutAnimation;
            if (i11 > i12) {
                i10 += i12;
                this.setCenterIfNoTextEnabled = i12;
                setNavigationOnClickListener(1);
            } else {
                this.setCenterIfNoTextEnabled = i11;
                return;
            }
        }
    }

    @Override // o.setCloseIcon
    public final int setAnimationFromJson() {
        boolean z = true;
        if ((this.setCenterIfNoTextEnabled != this.setLayoutAnimation || setUnboundedRipple(1)) ? false : false) {
            this.setOnLongClickListener = 0;
            return 0;
        }
        int SearchView$SavedState$1 = SearchView$SavedState$1();
        this.setOnLongClickListener = SearchView$SavedState$1;
        if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(SearchView$SavedState$1) == 0) {
            throw new setProgressDrawableTiled("Protocol message contained an invalid tag (zero).");
        }
        return this.setOnLongClickListener;
    }
}