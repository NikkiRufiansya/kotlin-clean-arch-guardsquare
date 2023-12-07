package o;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public abstract class zzC {
    public long setIconTintList;
    private int setNavigationOnClickListener;
    public String setOnLongClickListener;
    public setCompatElevation setX;
    public int setUiOptions = 0;
    private int[] setLayoutAnimation = new int[10];
    private float[][] setUnboundedRipple = (float[][]) Array.newInstance(Float.TYPE, 10, 3);
    public float[] setY = new float[3];
    public boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    public float MenuHostHelper$$ExternalSyntheticLambda0 = Float.NaN;

    public String toString() {
        String str = this.setOnLongClickListener;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i = 0; i < this.setNavigationOnClickListener; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(this.setLayoutAnimation[i]);
            sb.append(" , ");
            sb.append(decimalFormat.format(this.setUnboundedRipple[i]));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    public final void setX(String str) {
        this.setOnLongClickListener = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float setX(float f) {
        float abs;
        switch (this.setUiOptions) {
            case 1:
                return Math.signum(f * 6.2831855f);
            case 2:
                abs = Math.abs(f);
                break;
            case 3:
                return (((f * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                abs = ((f * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f * 6.2831855f);
            case 6:
                float abs2 = 1.0f - Math.abs(((f * 4.0f) % 4.0f) - 2.0f);
                abs = abs2 * abs2;
                break;
            default:
                return (float) Math.sin(f * 6.2831855f);
        }
        return 1.0f - abs;
    }

    public final void setY(long j) {
        this.setIconTintList = j;
    }

    public void setIconTintList(int i, float f, float f2, int i2, float f3) {
        int[] iArr = this.setLayoutAnimation;
        int i3 = this.setNavigationOnClickListener;
        iArr[i3] = i;
        float[] fArr = this.setUnboundedRipple[i3];
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        this.setUiOptions = Math.max(this.setUiOptions, i2);
        this.setNavigationOnClickListener++;
    }

    public void setX(int i) {
        int i2;
        int i3 = this.setNavigationOnClickListener;
        if (i3 == 0) {
            PrintStream printStream = System.err;
            StringBuilder sb = new StringBuilder("Error no points added to ");
            sb.append(this.setOnLongClickListener);
            printStream.println(sb.toString());
            return;
        }
        int[] iArr = this.setLayoutAnimation;
        float[][] fArr = this.setUnboundedRipple;
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
                        float[] fArr2 = fArr[i10];
                        fArr[i10] = fArr[i9];
                        fArr[i9] = fArr2;
                        i10++;
                    }
                    i9++;
                }
                int i12 = iArr[i10];
                iArr[i10] = iArr[i7];
                iArr[i7] = i12;
                float[] fArr3 = fArr[i10];
                fArr[i10] = fArr[i7];
                fArr[i7] = fArr3;
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
        int i17 = 0;
        while (true) {
            int[] iArr3 = this.setLayoutAnimation;
            if (i16 >= iArr3.length) {
                break;
            }
            if (iArr3[i16] != iArr3[i16 - 1]) {
                i17++;
            }
            i16++;
        }
        if (i17 == 0) {
            i17 = 1;
        }
        double[] dArr = new double[i17];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, i17, 3);
        int i18 = 0;
        while (i2 < this.setNavigationOnClickListener) {
            if (i2 > 0) {
                int[] iArr4 = this.setLayoutAnimation;
                i2 = iArr4[i2] == iArr4[i2 + (-1)] ? i2 + 1 : 0;
            }
            dArr[i18] = this.setLayoutAnimation[i2] * 0.01d;
            double[] dArr3 = dArr2[i18];
            float[] fArr4 = this.setUnboundedRipple[i2];
            dArr3[0] = fArr4[0];
            dArr3[1] = fArr4[1];
            dArr3[2] = fArr4[2];
            i18++;
        }
        this.setX = setCompatElevation.MenuHostHelper$$ExternalSyntheticLambda1(i, dArr, dArr2);
    }
}