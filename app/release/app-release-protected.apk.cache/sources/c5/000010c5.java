package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class setType extends setCompatElevation {
    private setY[] MenuHostHelper$$ExternalSyntheticLambda0;
    private final double[] MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setX = true;

    @Override // o.setCompatElevation
    public final void setX(double d, double[] dArr) {
        if (this.setX) {
            if (d < this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener) {
                double d2 = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
                double d3 = d - this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
                if (this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda0) {
                    dArr[0] = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setX(d2) + (this.MenuHostHelper$$ExternalSyntheticLambda0[0].setY * d3);
                    dArr[1] = this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda0(d2) + (d3 * this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda1);
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda1(d2);
                setY sety = this.MenuHostHelper$$ExternalSyntheticLambda0[0];
                dArr[0] = sety.setY + (sety.setIconTintList * sety.setLayoutAnimation) + (this.MenuHostHelper$$ExternalSyntheticLambda0[0].setX() * d3);
                setY sety2 = this.MenuHostHelper$$ExternalSyntheticLambda0[0];
                dArr[1] = sety2.MenuHostHelper$$ExternalSyntheticLambda1 + (sety2.setX * sety2.setUnboundedRipple) + (d3 * this.MenuHostHelper$$ExternalSyntheticLambda0[0].setIconTintList());
                return;
            }
            setY[] setyArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d > setyArr[setyArr.length - 1].setUiOptions) {
                setY[] setyArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                double d4 = setyArr2[setyArr2.length - 1].setUiOptions;
                double d5 = d - d4;
                setY[] setyArr3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                int length = setyArr3.length - 1;
                if (setyArr3[length].MenuHostHelper$$ExternalSyntheticLambda0) {
                    dArr[0] = this.MenuHostHelper$$ExternalSyntheticLambda0[length].setX(d4) + (this.MenuHostHelper$$ExternalSyntheticLambda0[length].setY * d5);
                    dArr[1] = this.MenuHostHelper$$ExternalSyntheticLambda0[length].MenuHostHelper$$ExternalSyntheticLambda0(d4) + (d5 * this.MenuHostHelper$$ExternalSyntheticLambda0[length].MenuHostHelper$$ExternalSyntheticLambda1);
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0[length].MenuHostHelper$$ExternalSyntheticLambda1(d);
                setY sety3 = this.MenuHostHelper$$ExternalSyntheticLambda0[length];
                dArr[0] = sety3.setY + (sety3.setIconTintList * sety3.setLayoutAnimation) + (this.MenuHostHelper$$ExternalSyntheticLambda0[length].setX() * d5);
                setY sety4 = this.MenuHostHelper$$ExternalSyntheticLambda0[length];
                dArr[1] = sety4.MenuHostHelper$$ExternalSyntheticLambda1 + (sety4.setX * sety4.setUnboundedRipple) + (d5 * this.MenuHostHelper$$ExternalSyntheticLambda0[length].setIconTintList());
                return;
            }
        } else {
            if (d < this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener) {
                d = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
            }
            setY[] setyArr4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d > setyArr4[setyArr4.length - 1].setUiOptions) {
                setY[] setyArr5 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                d = setyArr5[setyArr5.length - 1].setUiOptions;
            }
        }
        int i = 0;
        while (true) {
            setY[] setyArr6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i >= setyArr6.length) {
                return;
            }
            if (d <= setyArr6[i].setUiOptions) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda0) {
                    dArr[0] = this.MenuHostHelper$$ExternalSyntheticLambda0[i].setX(d);
                    dArr[1] = this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda0(d);
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda1(d);
                setY sety5 = this.MenuHostHelper$$ExternalSyntheticLambda0[i];
                dArr[0] = sety5.setY + (sety5.setIconTintList * sety5.setLayoutAnimation);
                setY sety6 = this.MenuHostHelper$$ExternalSyntheticLambda0[i];
                dArr[1] = sety6.MenuHostHelper$$ExternalSyntheticLambda1 + (sety6.setX * sety6.setUnboundedRipple);
                return;
            }
            i++;
        }
    }

    @Override // o.setCompatElevation
    public final void setX(double d, float[] fArr) {
        if (this.setX) {
            if (d < this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener) {
                double d2 = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
                double d3 = d - this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
                if (this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda0) {
                    fArr[0] = (float) (this.MenuHostHelper$$ExternalSyntheticLambda0[0].setX(d2) + (this.MenuHostHelper$$ExternalSyntheticLambda0[0].setY * d3));
                    fArr[1] = (float) (this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda0(d2) + (d3 * this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda1));
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda1(d2);
                setY sety = this.MenuHostHelper$$ExternalSyntheticLambda0[0];
                fArr[0] = (float) (sety.setY + (sety.setIconTintList * sety.setLayoutAnimation) + (this.MenuHostHelper$$ExternalSyntheticLambda0[0].setX() * d3));
                setY sety2 = this.MenuHostHelper$$ExternalSyntheticLambda0[0];
                fArr[1] = (float) (sety2.MenuHostHelper$$ExternalSyntheticLambda1 + (sety2.setX * sety2.setUnboundedRipple) + (d3 * this.MenuHostHelper$$ExternalSyntheticLambda0[0].setIconTintList()));
                return;
            }
            setY[] setyArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d > setyArr[setyArr.length - 1].setUiOptions) {
                setY[] setyArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                double d4 = setyArr2[setyArr2.length - 1].setUiOptions;
                double d5 = d - d4;
                setY[] setyArr3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                int length = setyArr3.length - 1;
                if (setyArr3[length].MenuHostHelper$$ExternalSyntheticLambda0) {
                    fArr[0] = (float) (this.MenuHostHelper$$ExternalSyntheticLambda0[length].setX(d4) + (this.MenuHostHelper$$ExternalSyntheticLambda0[length].setY * d5));
                    fArr[1] = (float) (this.MenuHostHelper$$ExternalSyntheticLambda0[length].MenuHostHelper$$ExternalSyntheticLambda0(d4) + (d5 * this.MenuHostHelper$$ExternalSyntheticLambda0[length].MenuHostHelper$$ExternalSyntheticLambda1));
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0[length].MenuHostHelper$$ExternalSyntheticLambda1(d);
                setY sety3 = this.MenuHostHelper$$ExternalSyntheticLambda0[length];
                fArr[0] = (float) (sety3.setY + (sety3.setIconTintList * sety3.setLayoutAnimation));
                setY sety4 = this.MenuHostHelper$$ExternalSyntheticLambda0[length];
                fArr[1] = (float) (sety4.MenuHostHelper$$ExternalSyntheticLambda1 + (sety4.setX * sety4.setUnboundedRipple));
                return;
            }
        } else if (d < this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener) {
            d = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
        } else {
            setY[] setyArr4 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d > setyArr4[setyArr4.length - 1].setUiOptions) {
                setY[] setyArr5 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                d = setyArr5[setyArr5.length - 1].setUiOptions;
            }
        }
        int i = 0;
        while (true) {
            setY[] setyArr6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i >= setyArr6.length) {
                return;
            }
            if (d <= setyArr6[i].setUiOptions) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda0) {
                    fArr[0] = (float) this.MenuHostHelper$$ExternalSyntheticLambda0[i].setX(d);
                    fArr[1] = (float) this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda0(d);
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda1(d);
                setY sety5 = this.MenuHostHelper$$ExternalSyntheticLambda0[i];
                fArr[0] = (float) (sety5.setY + (sety5.setIconTintList * sety5.setLayoutAnimation));
                setY sety6 = this.MenuHostHelper$$ExternalSyntheticLambda0[i];
                fArr[1] = (float) (sety6.MenuHostHelper$$ExternalSyntheticLambda1 + (sety6.setX * sety6.setUnboundedRipple));
                return;
            }
            i++;
        }
    }

    @Override // o.setCompatElevation
    public final void MenuHostHelper$$ExternalSyntheticLambda1(double d, double[] dArr) {
        if (d < this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener) {
            d = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
        } else {
            setY[] setyArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (d > setyArr[setyArr.length - 1].setUiOptions) {
                setY[] setyArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                d = setyArr2[setyArr2.length - 1].setUiOptions;
            }
        }
        int i = 0;
        while (true) {
            setY[] setyArr3 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i >= setyArr3.length) {
                return;
            }
            if (d <= setyArr3[i].setUiOptions) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda0) {
                    dArr[0] = this.MenuHostHelper$$ExternalSyntheticLambda0[i].setY;
                    dArr[1] = this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda1;
                    return;
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda1(d);
                dArr[0] = this.MenuHostHelper$$ExternalSyntheticLambda0[i].setX();
                dArr[1] = this.MenuHostHelper$$ExternalSyntheticLambda0[i].setIconTintList();
                return;
            }
            i++;
        }
    }

    @Override // o.setCompatElevation
    public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
        setY[] setyArr;
        setY[] setyArr2;
        setY[] setyArr3;
        setY[] setyArr4;
        double d2;
        double d3;
        double d4;
        int i = 0;
        if (this.setX) {
            if (d < this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener) {
                double d5 = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
                d2 = d - this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
                if (this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda0) {
                    d4 = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setX(d5);
                    d3 = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setY;
                } else {
                    this.MenuHostHelper$$ExternalSyntheticLambda0[0].MenuHostHelper$$ExternalSyntheticLambda1(d5);
                    setY sety = this.MenuHostHelper$$ExternalSyntheticLambda0[0];
                    d4 = sety.setY + (sety.setIconTintList * sety.setLayoutAnimation);
                    d3 = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setX();
                }
            } else {
                if (d > this.MenuHostHelper$$ExternalSyntheticLambda0[setyArr3.length - 1].setUiOptions) {
                    double d6 = this.MenuHostHelper$$ExternalSyntheticLambda0[setyArr4.length - 1].setUiOptions;
                    d2 = d - d6;
                    setY[] setyArr5 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    int length = setyArr5.length - 1;
                    double x = setyArr5[length].setX(d6);
                    d3 = this.MenuHostHelper$$ExternalSyntheticLambda0[length].setY;
                    d4 = x;
                }
            }
            return d4 + (d2 * d3);
        } else if (d < this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener) {
            d = this.MenuHostHelper$$ExternalSyntheticLambda0[0].setOnLongClickListener;
        } else {
            if (d > this.MenuHostHelper$$ExternalSyntheticLambda0[setyArr.length - 1].setUiOptions) {
                d = this.MenuHostHelper$$ExternalSyntheticLambda0[setyArr2.length - 1].setUiOptions;
            }
        }
        while (true) {
            setY[] setyArr6 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i >= setyArr6.length) {
                return Double.NaN;
            }
            if (d <= setyArr6[i].setUiOptions) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda0) {
                    return this.MenuHostHelper$$ExternalSyntheticLambda0[i].setX(d);
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0[i].MenuHostHelper$$ExternalSyntheticLambda1(d);
                setY sety2 = this.MenuHostHelper$$ExternalSyntheticLambda0[i];
                return sety2.setY + (sety2.setIconTintList * sety2.setLayoutAnimation);
            }
            i++;
        }
    }

    @Override // o.setCompatElevation
    public final double[] setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public setType(int[] iArr, double[] dArr, double[][] dArr2) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = dArr;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new setY[dArr.length - 1];
        int i = 0;
        int i2 = 1;
        int i3 = 1;
        while (true) {
            setY[] setyArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (i >= setyArr.length) {
                return;
            }
            int i4 = iArr[i];
            if (i4 == 0) {
                i3 = 3;
            } else if (i4 == 1) {
                i2 = 1;
                i3 = 1;
            } else if (i4 == 2) {
                i2 = 2;
                i3 = 2;
            } else if (i4 == 3) {
                i2 = i2 == 1 ? 2 : 1;
                i3 = i2;
            }
            double d = dArr[i];
            int i5 = i + 1;
            double d2 = dArr[i5];
            double[] dArr3 = dArr2[i];
            double d3 = dArr3[0];
            double d4 = dArr3[1];
            double[] dArr4 = dArr2[i5];
            setyArr[i] = new setY(i3, d, d2, d3, d4, dArr4[0], dArr4[1]);
            i = i5;
        }
    }

    /* loaded from: classes.dex */
    static class setY {
        private static double[] setNavigationOnClickListener = new double[91];
        boolean MenuHostHelper$$ExternalSyntheticLambda0;
        double MenuHostHelper$$ExternalSyntheticLambda1;
        private double ViewPager$SavedState$1;
        private double setAnimationFromJson;
        private double[] setCenterIfNoTextEnabled;
        private double setChipCornerRadius;
        private boolean setIconSize;
        double setIconTintList;
        double setLayoutAnimation;
        private double setMaxEms;
        double setOnLongClickListener;
        private double setOnNavigationItemSelectedListener;
        private double setTextAlignment;
        private double setTextScaleX;
        double setUiOptions;
        double setUnboundedRipple;
        double setX;
        double setY;

        setY(int i, double d, double d2, double d3, double d4, double d5, double d6) {
            double[] dArr;
            double[] dArr2;
            double d7;
            double d8 = d3;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            int i2 = 1;
            this.setIconSize = i == 1;
            this.setOnLongClickListener = d;
            this.setUiOptions = d2;
            this.ViewPager$SavedState$1 = 1.0d / (d2 - d);
            if (3 == i) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            }
            double d9 = d5 - d8;
            double d10 = d6 - d4;
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 || Math.abs(d9) < 0.001d || Math.abs(d10) < 0.001d) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                this.setMaxEms = d8;
                this.setAnimationFromJson = d5;
                this.setOnNavigationItemSelectedListener = d4;
                this.setTextScaleX = d6;
                double hypot = Math.hypot(d10, d9);
                this.setTextAlignment = hypot;
                this.setChipCornerRadius = hypot * this.ViewPager$SavedState$1;
                double d11 = this.setUiOptions - this.setOnLongClickListener;
                this.setY = d9 / d11;
                this.MenuHostHelper$$ExternalSyntheticLambda1 = d10 / d11;
                return;
            }
            this.setCenterIfNoTextEnabled = new double[101];
            boolean z = this.setIconSize;
            this.setIconTintList = (z ? -1 : 1) * d9;
            this.setX = d10 * (z ? 1 : -1);
            this.setY = z ? d5 : d8;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = z ? d4 : d6;
            int i3 = 0;
            double d12 = 0.0d;
            double d13 = 0.0d;
            double d14 = 0.0d;
            while (true) {
                if (i3 >= setNavigationOnClickListener.length) {
                    break;
                }
                double radians = Math.toRadians((i3 * 90.0d) / (dArr.length - i2));
                double sin = Math.sin(radians) * d9;
                double cos = Math.cos(radians) * (d4 - d6);
                if (i3 > 0) {
                    d7 = sin;
                    d12 += Math.hypot(sin - d13, cos - d14);
                    setNavigationOnClickListener[i3] = d12;
                } else {
                    d7 = sin;
                }
                i3++;
                d13 = d7;
                d14 = cos;
                i2 = 1;
            }
            this.setTextAlignment = d12;
            int i4 = 0;
            while (true) {
                double[] dArr3 = setNavigationOnClickListener;
                if (i4 >= dArr3.length) {
                    break;
                }
                dArr3[i4] = dArr3[i4] / d12;
                i4++;
            }
            int i5 = 0;
            while (true) {
                if (i5 >= this.setCenterIfNoTextEnabled.length) {
                    this.setChipCornerRadius = this.setTextAlignment * this.ViewPager$SavedState$1;
                    return;
                }
                double length = i5 / (dArr2.length - 1);
                int binarySearch = Arrays.binarySearch(setNavigationOnClickListener, length);
                if (binarySearch >= 0) {
                    this.setCenterIfNoTextEnabled[i5] = binarySearch / (setNavigationOnClickListener.length - 1);
                } else if (binarySearch == -1) {
                    this.setCenterIfNoTextEnabled[i5] = 0.0d;
                } else {
                    int i6 = -binarySearch;
                    int i7 = i6 - 2;
                    double[] dArr4 = setNavigationOnClickListener;
                    double d15 = dArr4[i7];
                    this.setCenterIfNoTextEnabled[i5] = (i7 + ((length - d15) / (dArr4[i6 - 1] - d15))) / (dArr4.length - 1);
                }
                i5++;
            }
        }

        final void MenuHostHelper$$ExternalSyntheticLambda1(double d) {
            double y = setY((this.setIconSize ? this.setUiOptions - d : d - this.setOnLongClickListener) * this.ViewPager$SavedState$1) * 1.5707963267948966d;
            this.setLayoutAnimation = Math.sin(y);
            this.setUnboundedRipple = Math.cos(y);
        }

        final double setX() {
            double d = this.setIconTintList * this.setUnboundedRipple;
            double hypot = this.setChipCornerRadius / Math.hypot(d, (-this.setX) * this.setLayoutAnimation);
            if (this.setIconSize) {
                d = -d;
            }
            return d * hypot;
        }

        final double setIconTintList() {
            double d = this.setIconTintList;
            double d2 = this.setUnboundedRipple;
            double d3 = (-this.setX) * this.setLayoutAnimation;
            double hypot = this.setChipCornerRadius / Math.hypot(d * d2, d3);
            return this.setIconSize ? (-d3) * hypot : d3 * hypot;
        }

        public final double setX(double d) {
            double d2 = this.setOnLongClickListener;
            double d3 = this.ViewPager$SavedState$1;
            double d4 = this.setMaxEms;
            return d4 + ((d - d2) * d3 * (this.setAnimationFromJson - d4));
        }

        public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
            double d2 = this.setOnLongClickListener;
            double d3 = this.ViewPager$SavedState$1;
            double d4 = this.setOnNavigationItemSelectedListener;
            return d4 + ((d - d2) * d3 * (this.setTextScaleX - d4));
        }

        private double setY(double d) {
            if (d <= 0.0d) {
                return 0.0d;
            }
            if (d >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.setCenterIfNoTextEnabled;
            double length = d * (dArr.length - 1);
            int i = (int) length;
            double d2 = dArr[i];
            return d2 + ((length - i) * (dArr[i + 1] - d2));
        }
    }
}