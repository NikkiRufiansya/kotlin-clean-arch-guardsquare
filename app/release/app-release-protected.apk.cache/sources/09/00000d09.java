package o;

import java.util.Arrays;
import o.setProgressDrawableTiled;

/* loaded from: classes.dex */
public final class setLayerPaint {
    private static final setLayerPaint setUiOptions = new setLayerPaint(0, new int[0], new Object[0], false);
    int MenuHostHelper$$ExternalSyntheticLambda0;
    int[] MenuHostHelper$$ExternalSyntheticLambda1;
    Object[] setIconTintList;
    boolean setX;
    int setY;

    public static setLayerPaint setIconTintList() {
        return setUiOptions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setLayerPaint setY() {
        return new setLayerPaint();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static setLayerPaint MenuHostHelper$$ExternalSyntheticLambda0(setLayerPaint setlayerpaint, setLayerPaint setlayerpaint2) {
        int i = setlayerpaint.MenuHostHelper$$ExternalSyntheticLambda0 + setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda0;
        int[] copyOf = Arrays.copyOf(setlayerpaint.MenuHostHelper$$ExternalSyntheticLambda1, i);
        System.arraycopy(setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda1, 0, copyOf, setlayerpaint.MenuHostHelper$$ExternalSyntheticLambda0, setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda0);
        Object[] copyOf2 = Arrays.copyOf(setlayerpaint.setIconTintList, i);
        System.arraycopy(setlayerpaint2.setIconTintList, 0, copyOf2, setlayerpaint.MenuHostHelper$$ExternalSyntheticLambda0, setlayerpaint2.MenuHostHelper$$ExternalSyntheticLambda0);
        return new setLayerPaint(i, copyOf, copyOf2, true);
    }

    private setLayerPaint() {
        this(0, new int[8], new Object[8], true);
    }

    private setLayerPaint(int i, int[] iArr, Object[] objArr, boolean z) {
        this.setY = -1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
        this.setIconTintList = objArr;
        this.setX = z;
    }

    public final void setX(WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            return;
        }
        if (windowInsetsCompat$Impl29.setIconTintList() == WindowInsetsCompat$Impl29$MenuHostHelper$$ExternalSyntheticLambda0.ASCENDING) {
            for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0; i++) {
                setY(this.MenuHostHelper$$ExternalSyntheticLambda1[i], this.setIconTintList[i], windowInsetsCompat$Impl29);
            }
            return;
        }
        for (int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0 - 1; i2 >= 0; i2--) {
            setY(this.MenuHostHelper$$ExternalSyntheticLambda1[i2], this.setIconTintList[i2], windowInsetsCompat$Impl29);
        }
    }

    private static void setY(int i, Object obj, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29) {
        int MenuHostHelper$$ExternalSyntheticLambda0 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(i);
        int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(i);
        if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
            windowInsetsCompat$Impl29.setY(MenuHostHelper$$ExternalSyntheticLambda0, ((Long) obj).longValue());
        } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
            windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0, ((Long) obj).longValue());
        } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
            windowInsetsCompat$Impl29.setX(MenuHostHelper$$ExternalSyntheticLambda0, (setSpeed) obj);
        } else if (MenuHostHelper$$ExternalSyntheticLambda1 != 3) {
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                windowInsetsCompat$Impl29.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type."));
        } else if (windowInsetsCompat$Impl29.setIconTintList() == WindowInsetsCompat$Impl29$MenuHostHelper$$ExternalSyntheticLambda0.ASCENDING) {
            windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0);
            ((setLayerPaint) obj).setX(windowInsetsCompat$Impl29);
            windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0);
        } else {
            windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0);
            ((setLayerPaint) obj).setX(windowInsetsCompat$Impl29);
            windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0);
        }
    }

    public final int setX() {
        int y;
        int i = this.setY;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.MenuHostHelper$$ExternalSyntheticLambda0; i3++) {
            int i4 = this.MenuHostHelper$$ExternalSyntheticLambda1[i3];
            int MenuHostHelper$$ExternalSyntheticLambda0 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(i4);
            int MenuHostHelper$$ExternalSyntheticLambda1 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(i4);
            if (MenuHostHelper$$ExternalSyntheticLambda1 == 0) {
                y = setMenuPrepared.setY(MenuHostHelper$$ExternalSyntheticLambda0, ((Long) this.setIconTintList[i3]).longValue());
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 1) {
                Long l = (Long) this.setIconTintList[i3];
                y = setMenuPrepared.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0);
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 2) {
                y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0, (setSpeed) this.setIconTintList[i3]);
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 3) {
                y = (setMenuPrepared.ViewPager$SavedState$1(MenuHostHelper$$ExternalSyntheticLambda0) << 1) + ((setLayerPaint) this.setIconTintList[i3]).setX();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1 == 5) {
                Integer num = (Integer) this.setIconTintList[i3];
                y = setMenuPrepared.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0);
            } else {
                throw new IllegalStateException(new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type."));
            }
            i2 += y;
        }
        this.setY = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof setLayerPaint)) {
            setLayerPaint setlayerpaint = (setLayerPaint) obj;
            int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i == setlayerpaint.MenuHostHelper$$ExternalSyntheticLambda0) {
                int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
                int[] iArr2 = setlayerpaint.MenuHostHelper$$ExternalSyntheticLambda1;
                int i2 = 0;
                while (true) {
                    if (i2 >= i) {
                        z = true;
                        break;
                    } else if (iArr[i2] != iArr2[i2]) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    Object[] objArr = this.setIconTintList;
                    Object[] objArr2 = setlayerpaint.setIconTintList;
                    int i3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= i3) {
                            z2 = true;
                            break;
                        } else if (!objArr[i4].equals(objArr2[i4])) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (z2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i2 = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (((i + 527) * 31) + i3) * 31;
        Object[] objArr = this.setIconTintList;
        int i6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = (i2 * 31) + objArr[i7].hashCode();
        }
        return i5 + i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.MenuHostHelper$$ExternalSyntheticLambda0; i2++) {
            setTextOff.setX(sb, i, String.valueOf(setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1[i2])), this.setIconTintList[i2]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(int i, Object obj) {
        if (!this.setX) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = Arrays.copyOf(iArr, i3);
            this.setIconTintList = Arrays.copyOf(this.setIconTintList, i3);
        }
        int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        iArr2[i4] = i;
        this.setIconTintList[i4] = obj;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i4 + 1;
    }
}