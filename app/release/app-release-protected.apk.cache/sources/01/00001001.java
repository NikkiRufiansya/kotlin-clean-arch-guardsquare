package o;

import android.graphics.Color;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class setSuffixTextColor implements setScaleY<setHintTextAppearance> {
    private int setY;

    public setSuffixTextColor(int i) {
        this.setY = i;
    }

    @Override // o.setScaleY
    public final /* synthetic */ setHintTextAppearance setX(setMeasureAllChildren setmeasureallchildren, float f) {
        double d;
        ArrayList arrayList = new ArrayList();
        boolean z = setmeasureallchildren.setTextAlignment() == setMeasureAllChildren$MenuHostHelper$$ExternalSyntheticLambda1.BEGIN_ARRAY;
        if (z) {
            setmeasureallchildren.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        while (setmeasureallchildren.setUnboundedRipple()) {
            arrayList.add(Float.valueOf((float) setmeasureallchildren.setNavigationOnClickListener()));
        }
        if (z) {
            setmeasureallchildren.setY();
        }
        if (this.setY == -1) {
            this.setY = arrayList.size() / 4;
        }
        int i = this.setY;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < (this.setY << 2); i4++) {
            int i5 = i4 / 4;
            double floatValue = ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        setHintTextAppearance sethinttextappearance = new setHintTextAppearance(fArr, iArr);
        int i7 = this.setY << 2;
        if (arrayList.size() > i7) {
            int size = (arrayList.size() - i7) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i8 = 0;
            while (i7 < arrayList.size()) {
                if (i7 % 2 == 0) {
                    dArr[i8] = ((Float) arrayList.get(i7)).floatValue();
                } else {
                    dArr2[i8] = ((Float) arrayList.get(i7)).floatValue();
                    i8++;
                }
                i7++;
            }
            for (int i9 = 0; i9 < sethinttextappearance.setX.length; i9++) {
                int i10 = sethinttextappearance.setX[i9];
                double d2 = sethinttextappearance.MenuHostHelper$$ExternalSyntheticLambda0[i9];
                int i11 = 1;
                while (true) {
                    if (i11 < size) {
                        int i12 = i11 - 1;
                        double d3 = dArr[i12];
                        double d4 = dArr[i11];
                        if (d4 >= d2) {
                            d = setAnimateOnTouchUp.setX(dArr2[i12], dArr2[i11], (d2 - d3) / (d4 - d3));
                            break;
                        }
                        i11++;
                    } else {
                        d = dArr2[size - 1];
                        break;
                    }
                }
                sethinttextappearance.setX[i9] = Color.argb((int) (d * 255.0d), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        return sethinttextappearance;
    }
}