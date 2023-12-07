package o;

/* loaded from: classes.dex */
public final class clone extends setCompatElevation {
    private double[] MenuHostHelper$$ExternalSyntheticLambda0;
    private double[][] MenuHostHelper$$ExternalSyntheticLambda1;
    private double[] setIconTintList;
    private boolean setX = true;
    private double setY;

    public clone(double[] dArr, double[][] dArr2) {
        this.setY = Double.NaN;
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new double[length2];
        this.setIconTintList = dArr;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = dArr2;
        if (length2 > 2) {
            for (int i = 0; i < dArr.length; i++) {
                double d = dArr2[i][0];
            }
            this.setY = 0.0d;
        }
    }

    @Override // o.setCompatElevation
    public final void setX(double d, double[] dArr) {
        double[] dArr2 = this.setIconTintList;
        int length = dArr2.length;
        int i = 0;
        int length2 = this.MenuHostHelper$$ExternalSyntheticLambda1[0].length;
        if (this.setX) {
            double d2 = dArr2[0];
            if (d <= d2) {
                MenuHostHelper$$ExternalSyntheticLambda1(d2, this.MenuHostHelper$$ExternalSyntheticLambda0);
                for (int i2 = 0; i2 < length2; i2++) {
                    dArr[i2] = this.MenuHostHelper$$ExternalSyntheticLambda1[0][i2] + ((d - this.setIconTintList[0]) * this.MenuHostHelper$$ExternalSyntheticLambda0[i2]);
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr2[i3];
            if (d >= d3) {
                MenuHostHelper$$ExternalSyntheticLambda1(d3, this.MenuHostHelper$$ExternalSyntheticLambda0);
                while (i < length2) {
                    dArr[i] = this.MenuHostHelper$$ExternalSyntheticLambda1[i3][i] + ((d - this.setIconTintList[i3]) * this.MenuHostHelper$$ExternalSyntheticLambda0[i]);
                    i++;
                }
                return;
            }
        } else if (d <= dArr2[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                dArr[i4] = this.MenuHostHelper$$ExternalSyntheticLambda1[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr2[i5]) {
                while (i < length2) {
                    dArr[i] = this.MenuHostHelper$$ExternalSyntheticLambda1[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.setIconTintList[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.MenuHostHelper$$ExternalSyntheticLambda1[i6][i7];
                }
            }
            double[] dArr3 = this.setIconTintList;
            int i8 = i6 + 1;
            double d4 = dArr3[i8];
            if (d < d4) {
                double d5 = dArr3[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    dArr[i] = (dArr4[i6][i] * (1.0d - d6)) + (dArr4[i8][i] * d6);
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // o.setCompatElevation
    public final void setX(double d, float[] fArr) {
        double[] dArr = this.setIconTintList;
        int length = dArr.length;
        int i = 0;
        int length2 = this.MenuHostHelper$$ExternalSyntheticLambda1[0].length;
        if (this.setX) {
            double d2 = dArr[0];
            if (d <= d2) {
                MenuHostHelper$$ExternalSyntheticLambda1(d2, this.MenuHostHelper$$ExternalSyntheticLambda0);
                for (int i2 = 0; i2 < length2; i2++) {
                    fArr[i2] = (float) (this.MenuHostHelper$$ExternalSyntheticLambda1[0][i2] + ((d - this.setIconTintList[0]) * this.MenuHostHelper$$ExternalSyntheticLambda0[i2]));
                }
                return;
            }
            int i3 = length - 1;
            double d3 = dArr[i3];
            if (d >= d3) {
                MenuHostHelper$$ExternalSyntheticLambda1(d3, this.MenuHostHelper$$ExternalSyntheticLambda0);
                while (i < length2) {
                    fArr[i] = (float) (this.MenuHostHelper$$ExternalSyntheticLambda1[i3][i] + ((d - this.setIconTintList[i3]) * this.MenuHostHelper$$ExternalSyntheticLambda0[i]));
                    i++;
                }
                return;
            }
        } else if (d <= dArr[0]) {
            for (int i4 = 0; i4 < length2; i4++) {
                fArr[i4] = (float) this.MenuHostHelper$$ExternalSyntheticLambda1[0][i4];
            }
            return;
        } else {
            int i5 = length - 1;
            if (d >= dArr[i5]) {
                while (i < length2) {
                    fArr[i] = (float) this.MenuHostHelper$$ExternalSyntheticLambda1[i5][i];
                    i++;
                }
                return;
            }
        }
        int i6 = 0;
        while (i6 < length - 1) {
            if (d == this.setIconTintList[i6]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.MenuHostHelper$$ExternalSyntheticLambda1[i6][i7];
                }
            }
            double[] dArr2 = this.setIconTintList;
            int i8 = i6 + 1;
            double d4 = dArr2[i8];
            if (d < d4) {
                double d5 = dArr2[i6];
                double d6 = (d - d5) / (d4 - d5);
                while (i < length2) {
                    double[][] dArr3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    fArr[i] = (float) ((dArr3[i6][i] * (1.0d - d6)) + (dArr3[i8][i] * d6));
                    i++;
                }
                return;
            }
            i6 = i8;
        }
    }

    @Override // o.setCompatElevation
    public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
        double d2;
        double d3;
        double x;
        double[] dArr = this.setIconTintList;
        int length = dArr.length;
        if (this.setX) {
            double d4 = dArr[0];
            if (d <= d4) {
                d2 = this.MenuHostHelper$$ExternalSyntheticLambda1[0][0];
                d3 = d - d4;
                x = setX(d4, 0);
            } else {
                int i = length - 1;
                double d5 = dArr[i];
                if (d >= d5) {
                    d2 = this.MenuHostHelper$$ExternalSyntheticLambda1[i][0];
                    d3 = d - d5;
                    x = setX(d5, 0);
                }
            }
            return d2 + (d3 * x);
        } else if (d <= dArr[0]) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1[0][0];
        } else {
            int i2 = length - 1;
            if (d >= dArr[i2]) {
                return this.MenuHostHelper$$ExternalSyntheticLambda1[i2][0];
            }
        }
        int i3 = 0;
        while (i3 < length - 1) {
            double[] dArr2 = this.setIconTintList;
            double d6 = dArr2[i3];
            if (d == d6) {
                return this.MenuHostHelper$$ExternalSyntheticLambda1[i3][0];
            }
            int i4 = i3 + 1;
            double d7 = dArr2[i4];
            if (d < d7) {
                double d8 = (d - d6) / (d7 - d6);
                double[][] dArr3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                return (dArr3[i3][0] * (1.0d - d8)) + (dArr3[i4][0] * d8);
            }
            i3 = i4;
        }
        return 0.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r13 >= r4) goto L3;
     */
    @Override // o.setCompatElevation
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(double r13, double[] r15) {
        /*
            r12 = this;
            double[] r0 = r12.setIconTintList
            int r1 = r0.length
            double[][] r2 = r12.MenuHostHelper$$ExternalSyntheticLambda1
            r3 = 0
            r2 = r2[r3]
            int r2 = r2.length
            r4 = r0[r3]
            int r6 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r6 > 0) goto L11
        Lf:
            r13 = r4
            goto L1a
        L11:
            int r4 = r1 + (-1)
            r4 = r0[r4]
            int r0 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r0 < 0) goto L1a
            goto Lf
        L1a:
            r0 = 0
        L1b:
            int r4 = r1 + (-1)
            if (r0 >= r4) goto L42
            double[] r4 = r12.setIconTintList
            int r5 = r0 + 1
            r6 = r4[r5]
            int r8 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r8 > 0) goto L40
            r13 = r4[r0]
        L2b:
            if (r3 >= r2) goto L42
            double[][] r1 = r12.MenuHostHelper$$ExternalSyntheticLambda1
            r4 = r1[r0]
            r8 = r4[r3]
            r1 = r1[r5]
            r10 = r1[r3]
            double r10 = r10 - r8
            double r8 = r6 - r13
            double r10 = r10 / r8
            r15[r3] = r10
            int r3 = r3 + 1
            goto L2b
        L40:
            r0 = r5
            goto L1b
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clone.MenuHostHelper$$ExternalSyntheticLambda1(double, double[]):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0012, code lost:
        if (r9 >= r2) goto L3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private double setX(double r9, int r11) {
        /*
            r8 = this;
            double[] r11 = r8.setIconTintList
            int r0 = r11.length
            r1 = 0
            r2 = r11[r1]
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lc
        La:
            r9 = r2
            goto L15
        Lc:
            int r2 = r0 + (-1)
            r2 = r11[r2]
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 < 0) goto L15
            goto La
        L15:
            r11 = 0
        L16:
            int r2 = r0 + (-1)
            if (r11 >= r2) goto L36
            double[] r2 = r8.setIconTintList
            int r3 = r11 + 1
            r4 = r2[r3]
            int r6 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r6 > 0) goto L34
            r9 = r2[r11]
            double[][] r0 = r8.MenuHostHelper$$ExternalSyntheticLambda1
            r11 = r0[r11]
            r6 = r11[r1]
            r11 = r0[r3]
            r0 = r11[r1]
            double r0 = r0 - r6
            double r4 = r4 - r9
            double r0 = r0 / r4
            return r0
        L34:
            r11 = r3
            goto L16
        L36:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: o.clone.setX(double, int):double");
    }

    @Override // o.setCompatElevation
    public final double[] setIconTintList() {
        return this.setIconTintList;
    }
}