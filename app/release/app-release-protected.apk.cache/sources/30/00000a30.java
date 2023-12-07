package o;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class setChipStrokeColor {
    private int setIconTintList;
    public String setX;
    public setCompatElevation setY;
    private int[] MenuHostHelper$$ExternalSyntheticLambda1 = new int[10];
    private float[] MenuHostHelper$$ExternalSyntheticLambda0 = new float[10];

    public String toString() {
        String str = this.setX;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.setIconTintList; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.MenuHostHelper$$ExternalSyntheticLambda0[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    public final float MenuHostHelper$$ExternalSyntheticLambda1(float f) {
        return (float) this.setY.MenuHostHelper$$ExternalSyntheticLambda0(f);
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(int i, float f) {
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (iArr.length < this.setIconTintList + 1) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = Arrays.copyOf(iArr, iArr.length << 1);
            float[] fArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Arrays.copyOf(fArr, fArr.length << 1);
        }
        int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int i2 = this.setIconTintList;
        iArr2[i2] = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0[i2] = f;
        this.setIconTintList = i2 + 1;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int i2;
        int i3 = this.setIconTintList;
        if (i3 == 0) {
            return;
        }
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda1;
        float[] fArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int[] iArr2 = new int[iArr.length + 10];
        iArr2[0] = i3 - 1;
        iArr2[1] = 0;
        int i4 = 2;
        while (i4 > 0) {
            int i5 = i4 - 1;
            int i6 = iArr2[i5];
            i4 = i5 - 1;
            int i7 = iArr2[i4];
            if (i6 < i7) {
                int i8 = iArr[i7];
                int i9 = i6;
                int i10 = i9;
                while (i9 < i7) {
                    if (iArr[i9] <= i8) {
                        int i11 = iArr[i10];
                        iArr[i10] = iArr[i9];
                        iArr[i9] = i11;
                        float f = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = f;
                        i10++;
                    }
                    i9++;
                }
                int i12 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i12;
                float f2 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = f2;
                int i13 = i4 + 1;
                iArr2[i4] = i10 - 1;
                int i14 = i13 + 1;
                iArr2[i13] = i6;
                int i15 = i14 + 1;
                iArr2[i14] = i7;
                i4 = i15 + 1;
                iArr2[i15] = i10 + 1;
            }
        }
        int i16 = 1;
        for (int i17 = 1; i17 < this.setIconTintList; i17++) {
            int[] iArr3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (iArr3[i17 - 1] != iArr3[i17]) {
                i16++;
            }
        }
        double[] dArr = new double[i16];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i16, 1);
        int i18 = 0;
        while (i2 < this.setIconTintList) {
            if (i2 > 0) {
                int[] iArr4 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                i2 = iArr4[i2] == iArr4[i2 + (-1)] ? i2 + 1 : 0;
            }
            dArr[i18] = this.MenuHostHelper$$ExternalSyntheticLambda1[i2] * 0.01d;
            dArr2[i18][0] = this.MenuHostHelper$$ExternalSyntheticLambda0[i2];
            i18++;
        }
        this.setY = setCompatElevation.MenuHostHelper$$ExternalSyntheticLambda1(i, dArr, dArr2);
    }
}