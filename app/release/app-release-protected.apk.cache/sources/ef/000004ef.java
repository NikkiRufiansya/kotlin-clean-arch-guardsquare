package o;

import java.util.Arrays;
import o.setShortcut;

/* loaded from: classes.dex */
public final class getLoadPriority implements setShortcut.setIconTintList {
    protected final setCurrentTabByTag MenuHostHelper$$ExternalSyntheticLambda1;
    private final setShortcut setIconSize;
    private int setX = 0;
    private int MenuHostHelper$$ExternalSyntheticLambda0 = 8;
    private setBoxStrokeWidthResource setY = null;
    private int[] setIconTintList = new int[8];
    private int[] setUiOptions = new int[8];
    private float[] setLayoutAnimation = new float[8];
    private int setUnboundedRipple = -1;
    private int setOnLongClickListener = -1;
    private boolean setNavigationOnClickListener = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public getLoadPriority(setShortcut setshortcut, setCurrentTabByTag setcurrenttabbytag) {
        this.setIconSize = setshortcut;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setcurrenttabbytag;
    }

    @Override // o.setShortcut.setIconTintList
    public final void setY(setBoxStrokeWidthResource setboxstrokewidthresource, float f) {
        if (f == 0.0f) {
            setY(setboxstrokewidthresource, true);
            return;
        }
        int i = this.setUnboundedRipple;
        if (i == -1) {
            this.setUnboundedRipple = 0;
            this.setLayoutAnimation[0] = f;
            this.setIconTintList[0] = setboxstrokewidthresource.setY;
            this.setUiOptions[this.setUnboundedRipple] = -1;
            setboxstrokewidthresource.setTextAlignment++;
            setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconSize);
            this.setX++;
            if (this.setNavigationOnClickListener) {
                return;
            }
            int i2 = this.setOnLongClickListener + 1;
            this.setOnLongClickListener = i2;
            int[] iArr = this.setIconTintList;
            if (i2 >= iArr.length) {
                this.setNavigationOnClickListener = true;
                this.setOnLongClickListener = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.setX; i4++) {
            if (this.setIconTintList[i] == setboxstrokewidthresource.setY) {
                this.setLayoutAnimation[i] = f;
                return;
            }
            if (this.setIconTintList[i] < setboxstrokewidthresource.setY) {
                i3 = i;
            }
            i = this.setUiOptions[i];
        }
        int i5 = this.setOnLongClickListener;
        if (this.setNavigationOnClickListener) {
            int[] iArr2 = this.setIconTintList;
            if (iArr2[i5] != -1) {
                i5 = iArr2.length;
            }
        } else {
            i5++;
        }
        int[] iArr3 = this.setIconTintList;
        if (i5 >= iArr3.length && this.setX < iArr3.length) {
            int i6 = 0;
            while (true) {
                int[] iArr4 = this.setIconTintList;
                if (i6 >= iArr4.length) {
                    break;
                } else if (iArr4[i6] == -1) {
                    i5 = i6;
                    break;
                } else {
                    i6++;
                }
            }
        }
        int[] iArr5 = this.setIconTintList;
        if (i5 >= iArr5.length) {
            i5 = iArr5.length;
            int i7 = this.MenuHostHelper$$ExternalSyntheticLambda0 << 1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i7;
            this.setNavigationOnClickListener = false;
            this.setOnLongClickListener = i5 - 1;
            this.setLayoutAnimation = Arrays.copyOf(this.setLayoutAnimation, i7);
            this.setIconTintList = Arrays.copyOf(this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda0);
            this.setUiOptions = Arrays.copyOf(this.setUiOptions, this.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        this.setIconTintList[i5] = setboxstrokewidthresource.setY;
        this.setLayoutAnimation[i5] = f;
        if (i3 != -1) {
            int[] iArr6 = this.setUiOptions;
            iArr6[i5] = iArr6[i3];
            iArr6[i3] = i5;
        } else {
            this.setUiOptions[i5] = this.setUnboundedRipple;
            this.setUnboundedRipple = i5;
        }
        setboxstrokewidthresource.setTextAlignment++;
        setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconSize);
        int i8 = this.setX + 1;
        this.setX = i8;
        if (!this.setNavigationOnClickListener) {
            this.setOnLongClickListener++;
        }
        int[] iArr7 = this.setIconTintList;
        if (i8 >= iArr7.length) {
            this.setNavigationOnClickListener = true;
        }
        if (this.setOnLongClickListener >= iArr7.length) {
            this.setNavigationOnClickListener = true;
            this.setOnLongClickListener = iArr7.length - 1;
        }
    }

    @Override // o.setShortcut.setIconTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setBoxStrokeWidthResource setboxstrokewidthresource, float f, boolean z) {
        if (f <= -0.001f || f >= 0.001f) {
            int i = this.setUnboundedRipple;
            if (i == -1) {
                this.setUnboundedRipple = 0;
                this.setLayoutAnimation[0] = f;
                this.setIconTintList[0] = setboxstrokewidthresource.setY;
                this.setUiOptions[this.setUnboundedRipple] = -1;
                setboxstrokewidthresource.setTextAlignment++;
                setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconSize);
                this.setX++;
                if (this.setNavigationOnClickListener) {
                    return;
                }
                int i2 = this.setOnLongClickListener + 1;
                this.setOnLongClickListener = i2;
                int[] iArr = this.setIconTintList;
                if (i2 >= iArr.length) {
                    this.setNavigationOnClickListener = true;
                    this.setOnLongClickListener = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.setX; i4++) {
                if (this.setIconTintList[i] == setboxstrokewidthresource.setY) {
                    float[] fArr = this.setLayoutAnimation;
                    float f2 = fArr[i] + f;
                    if (f2 > -0.001f && f2 < 0.001f) {
                        f2 = 0.0f;
                    }
                    fArr[i] = f2;
                    if (f2 == 0.0f) {
                        if (i == this.setUnboundedRipple) {
                            this.setUnboundedRipple = this.setUiOptions[i];
                        } else {
                            int[] iArr2 = this.setUiOptions;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z) {
                            setboxstrokewidthresource.setIconTintList(this.setIconSize);
                        }
                        if (this.setNavigationOnClickListener) {
                            this.setOnLongClickListener = i;
                        }
                        setboxstrokewidthresource.setTextAlignment--;
                        this.setX--;
                        return;
                    }
                    return;
                }
                if (this.setIconTintList[i] < setboxstrokewidthresource.setY) {
                    i3 = i;
                }
                i = this.setUiOptions[i];
            }
            int i5 = this.setOnLongClickListener;
            if (this.setNavigationOnClickListener) {
                int[] iArr3 = this.setIconTintList;
                if (iArr3[i5] != -1) {
                    i5 = iArr3.length;
                }
            } else {
                i5++;
            }
            int[] iArr4 = this.setIconTintList;
            if (i5 >= iArr4.length && this.setX < iArr4.length) {
                int i6 = 0;
                while (true) {
                    int[] iArr5 = this.setIconTintList;
                    if (i6 >= iArr5.length) {
                        break;
                    } else if (iArr5[i6] == -1) {
                        i5 = i6;
                        break;
                    } else {
                        i6++;
                    }
                }
            }
            int[] iArr6 = this.setIconTintList;
            if (i5 >= iArr6.length) {
                i5 = iArr6.length;
                int i7 = this.MenuHostHelper$$ExternalSyntheticLambda0 << 1;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = i7;
                this.setNavigationOnClickListener = false;
                this.setOnLongClickListener = i5 - 1;
                this.setLayoutAnimation = Arrays.copyOf(this.setLayoutAnimation, i7);
                this.setIconTintList = Arrays.copyOf(this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda0);
                this.setUiOptions = Arrays.copyOf(this.setUiOptions, this.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            this.setIconTintList[i5] = setboxstrokewidthresource.setY;
            this.setLayoutAnimation[i5] = f;
            if (i3 != -1) {
                int[] iArr7 = this.setUiOptions;
                iArr7[i5] = iArr7[i3];
                iArr7[i3] = i5;
            } else {
                this.setUiOptions[i5] = this.setUnboundedRipple;
                this.setUnboundedRipple = i5;
            }
            setboxstrokewidthresource.setTextAlignment++;
            setboxstrokewidthresource.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconSize);
            this.setX++;
            if (!this.setNavigationOnClickListener) {
                this.setOnLongClickListener++;
            }
            int i8 = this.setOnLongClickListener;
            int[] iArr8 = this.setIconTintList;
            if (i8 >= iArr8.length) {
                this.setNavigationOnClickListener = true;
                this.setOnLongClickListener = iArr8.length - 1;
            }
        }
    }

    @Override // o.setShortcut.setIconTintList
    public final float MenuHostHelper$$ExternalSyntheticLambda1(setShortcut setshortcut, boolean z) {
        float iconTintList = setIconTintList(setshortcut.MenuHostHelper$$ExternalSyntheticLambda0);
        setY(setshortcut.MenuHostHelper$$ExternalSyntheticLambda0, z);
        setShortcut.setIconTintList seticontintlist = setshortcut.setY;
        int x = seticontintlist.setX();
        for (int i = 0; i < x; i++) {
            setBoxStrokeWidthResource y = seticontintlist.setY(i);
            MenuHostHelper$$ExternalSyntheticLambda1(y, seticontintlist.setIconTintList(y) * iconTintList, z);
        }
        return iconTintList;
    }

    @Override // o.setShortcut.setIconTintList
    public final float setY(setBoxStrokeWidthResource setboxstrokewidthresource, boolean z) {
        if (this.setY == setboxstrokewidthresource) {
            this.setY = null;
        }
        int i = this.setUnboundedRipple;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.setX) {
            if (this.setIconTintList[i] == setboxstrokewidthresource.setY) {
                if (i == this.setUnboundedRipple) {
                    this.setUnboundedRipple = this.setUiOptions[i];
                } else {
                    int[] iArr = this.setUiOptions;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    setboxstrokewidthresource.setIconTintList(this.setIconSize);
                }
                setboxstrokewidthresource.setTextAlignment--;
                this.setX--;
                this.setIconTintList[i] = -1;
                if (this.setNavigationOnClickListener) {
                    this.setOnLongClickListener = i;
                }
                return this.setLayoutAnimation[i];
            }
            i2++;
            i3 = i;
            i = this.setUiOptions[i];
        }
        return 0.0f;
    }

    @Override // o.setShortcut.setIconTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        int i = this.setUnboundedRipple;
        for (int i2 = 0; i != -1 && i2 < this.setX; i2++) {
            setBoxStrokeWidthResource setboxstrokewidthresource = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1[this.setIconTintList[i]];
            if (setboxstrokewidthresource != null) {
                setboxstrokewidthresource.setIconTintList(this.setIconSize);
            }
            i = this.setUiOptions[i];
        }
        this.setUnboundedRipple = -1;
        this.setOnLongClickListener = -1;
        this.setNavigationOnClickListener = false;
        this.setX = 0;
    }

    @Override // o.setShortcut.setIconTintList
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(setBoxStrokeWidthResource setboxstrokewidthresource) {
        int i = this.setUnboundedRipple;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.setX; i2++) {
            if (this.setIconTintList[i] == setboxstrokewidthresource.setY) {
                return true;
            }
            i = this.setUiOptions[i];
        }
        return false;
    }

    @Override // o.setShortcut.setIconTintList
    public final void setY() {
        int i = this.setUnboundedRipple;
        for (int i2 = 0; i != -1 && i2 < this.setX; i2++) {
            float[] fArr = this.setLayoutAnimation;
            fArr[i] = -fArr[i];
            i = this.setUiOptions[i];
        }
    }

    @Override // o.setShortcut.setIconTintList
    public final void setIconTintList(float f) {
        int i = this.setUnboundedRipple;
        for (int i2 = 0; i != -1 && i2 < this.setX; i2++) {
            float[] fArr = this.setLayoutAnimation;
            fArr[i] = fArr[i] / f;
            i = this.setUiOptions[i];
        }
    }

    @Override // o.setShortcut.setIconTintList
    public final int setX() {
        return this.setX;
    }

    @Override // o.setShortcut.setIconTintList
    public final setBoxStrokeWidthResource setY(int i) {
        int i2 = this.setUnboundedRipple;
        for (int i3 = 0; i2 != -1 && i3 < this.setX; i3++) {
            if (i3 == i) {
                return this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1[this.setIconTintList[i2]];
            }
            i2 = this.setUiOptions[i2];
        }
        return null;
    }

    @Override // o.setShortcut.setIconTintList
    public final float setIconTintList(int i) {
        int i2 = this.setUnboundedRipple;
        for (int i3 = 0; i2 != -1 && i3 < this.setX; i3++) {
            if (i3 == i) {
                return this.setLayoutAnimation[i2];
            }
            i2 = this.setUiOptions[i2];
        }
        return 0.0f;
    }

    @Override // o.setShortcut.setIconTintList
    public final float setIconTintList(setBoxStrokeWidthResource setboxstrokewidthresource) {
        int i = this.setUnboundedRipple;
        for (int i2 = 0; i != -1 && i2 < this.setX; i2++) {
            if (this.setIconTintList[i] == setboxstrokewidthresource.setY) {
                return this.setLayoutAnimation[i];
            }
            i = this.setUiOptions[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.setUnboundedRipple;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.setX; i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" -> ");
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(this.setLayoutAnimation[i]);
            sb2.append(" : ");
            String obj2 = sb2.toString();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj2);
            sb3.append(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1[this.setIconTintList[i]]);
            str = sb3.toString();
            i = this.setUiOptions[i];
        }
        return str;
    }
}