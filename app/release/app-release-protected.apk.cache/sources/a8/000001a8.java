package o;

import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Array;
import o.setActiveIndicatorDrawable;

/* loaded from: classes.dex */
public class FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1 extends FirebasePerfKtxRegistrar {
    private float[] MenuHostHelper$$ExternalSyntheticLambda0;
    public SparseArray<setActiveIndicatorDrawable> MenuHostHelper$$ExternalSyntheticLambda1;
    private String setIconTintList;

    public FirebasePerfKtxRegistrar$MenuHostHelper$$ExternalSyntheticLambda1(String str, SparseArray<setActiveIndicatorDrawable> sparseArray) {
        this.setIconTintList = str.split(",")[1];
        this.MenuHostHelper$$ExternalSyntheticLambda1 = sparseArray;
    }

    @Override // o.setChipStrokeColor
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
        int i2 = setActiveIndicatorDrawable.AnonymousClass4.MenuHostHelper$$ExternalSyntheticLambda1[this.MenuHostHelper$$ExternalSyntheticLambda1.valueAt(0).setNavigationOnClickListener.ordinal()];
        int i3 = 4;
        if (i2 != 4 && i2 != 5) {
            i3 = 1;
        }
        double[] dArr = new double[size];
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new float[i3];
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, i3);
        for (int i4 = 0; i4 < size; i4++) {
            dArr[i4] = this.MenuHostHelper$$ExternalSyntheticLambda1.keyAt(i4) * 0.01d;
            this.MenuHostHelper$$ExternalSyntheticLambda1.valueAt(i4).MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0);
            int i5 = 0;
            while (true) {
                float[] fArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i5 < fArr.length) {
                    dArr2[i4][i5] = fArr[i5];
                    i5++;
                }
            }
        }
        this.setY = setCompatElevation.MenuHostHelper$$ExternalSyntheticLambda1(i, dArr, dArr2);
    }

    @Override // o.setChipStrokeColor
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, float f) {
        throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
    }

    @Override // o.FirebasePerfKtxRegistrar
    public final void setY(View view, float f) {
        this.setY.setX(f, this.MenuHostHelper$$ExternalSyntheticLambda0);
        setStretchMode.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1.valueAt(0), view, this.MenuHostHelper$$ExternalSyntheticLambda0);
    }
}