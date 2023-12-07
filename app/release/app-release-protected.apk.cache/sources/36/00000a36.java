package o;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class setChipStrokeWidthResource {
    private setY setNavigationOnClickListener;
    private setCompatElevation setUnboundedRipple;
    public String setY;
    public int setIconTintList = 0;
    public String setX = null;
    public int MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    public ArrayList<setChipStrokeWidthResource$MenuHostHelper$$ExternalSyntheticLambda1> MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();

    protected void setY(Object obj) {
    }

    public String toString() {
        String str = this.setY;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<setChipStrokeWidthResource$MenuHostHelper$$ExternalSyntheticLambda1> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        while (it.hasNext()) {
            setChipStrokeWidthResource$MenuHostHelper$$ExternalSyntheticLambda1 next = it.next();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("[");
            sb.append(next.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append(" , ");
            sb.append(decimalFormat.format(next.setX));
            sb.append("] ");
            str = sb.toString();
        }
        return str;
    }

    public final float setX(float f) {
        double signum;
        double d;
        double abs;
        setY sety = this.setNavigationOnClickListener;
        setCompatElevation setcompatelevation = sety.setY;
        if (setcompatelevation != null) {
            setcompatelevation.setX(f, sety.setUiOptions);
        } else {
            double[] dArr = sety.setUiOptions;
            dArr[0] = sety.MenuHostHelper$$ExternalSyntheticLambda0[0];
            dArr[1] = sety.setUnboundedRipple[0];
            dArr[2] = sety.setOnLongClickListener[0];
        }
        double[] dArr2 = sety.setUiOptions;
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        setFlexWrap setflexwrap = sety.setIconTintList;
        double d4 = f;
        double d5 = 0.0d;
        if (d4 < 0.0d) {
            d4 = 0.0d;
        } else if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        int binarySearch = Arrays.binarySearch(setflexwrap.setUnboundedRipple, d4);
        if (binarySearch > 0) {
            d5 = 1.0d;
        } else if (binarySearch != 0) {
            int i = (-binarySearch) - 1;
            float[] fArr = setflexwrap.setNavigationOnClickListener;
            float f2 = fArr[i];
            int i2 = i - 1;
            float f3 = fArr[i2];
            double d6 = f2 - f3;
            double[] dArr3 = setflexwrap.setUnboundedRipple;
            double d7 = dArr3[i];
            double d8 = dArr3[i2];
            double d9 = d6 / (d7 - d8);
            d5 = setflexwrap.MenuHostHelper$$ExternalSyntheticLambda0[i2] + ((f3 - (d9 * d8)) * (d4 - d8)) + ((d9 * ((d4 * d4) - (d8 * d8))) / 2.0d);
        }
        double d10 = d5 + d3;
        switch (setflexwrap.setOnLongClickListener) {
            case 1:
                signum = Math.signum(0.5d - (d10 % 1.0d));
                break;
            case 2:
                d = 1.0d;
                abs = Math.abs((((d10 * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                signum = d - abs;
                break;
            case 3:
                signum = (((d10 * 2.0d) + 1.0d) % 2.0d) - 1.0d;
                break;
            case 4:
                d = 1.0d;
                abs = ((d10 * 2.0d) + 1.0d) % 2.0d;
                signum = d - abs;
                break;
            case 5:
                signum = Math.cos(setflexwrap.MenuHostHelper$$ExternalSyntheticLambda1 * (d3 + d10));
                break;
            case 6:
                d = 1.0d;
                double abs2 = 1.0d - Math.abs(((d10 * 4.0d) % 4.0d) - 2.0d);
                abs = abs2 * abs2;
                signum = d - abs;
                break;
            case 7:
                signum = setflexwrap.setX.MenuHostHelper$$ExternalSyntheticLambda0(d10 % 1.0d);
                break;
            default:
                signum = Math.sin(setflexwrap.MenuHostHelper$$ExternalSyntheticLambda1 * d10);
                break;
        }
        return (float) (d2 + (signum * sety.setUiOptions[2]));
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, int i2, String str, int i3, float f, float f2, float f3, float f4, Object obj) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.add(new setChipStrokeWidthResource$MenuHostHelper$$ExternalSyntheticLambda1(i, f, f2, f3, f4));
        if (i3 != -1) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
        }
        this.setIconTintList = i2;
        setY(obj);
        this.setX = str;
    }

    public final void setIconTintList(float f) {
        float[] fArr;
        float[] fArr2;
        float[] fArr3;
        int i;
        int i2;
        int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
        if (size == 0) {
            return;
        }
        Collections.sort(this.MenuHostHelper$$ExternalSyntheticLambda0, new Comparator<setChipStrokeWidthResource$MenuHostHelper$$ExternalSyntheticLambda1>() { // from class: o.setChipStrokeWidthResource.5
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(setChipStrokeWidthResource$MenuHostHelper$$ExternalSyntheticLambda1 setchipstrokewidthresource_menuhosthelper__externalsyntheticlambda1, setChipStrokeWidthResource$MenuHostHelper$$ExternalSyntheticLambda1 setchipstrokewidthresource_menuhosthelper__externalsyntheticlambda12) {
                return Integer.compare(setchipstrokewidthresource_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1, setchipstrokewidthresource_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        });
        double[] dArr = new double[size];
        char c = 0;
        double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, size, 3);
        this.setNavigationOnClickListener = new setY(this.setIconTintList, this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1, size);
        Iterator<setChipStrokeWidthResource$MenuHostHelper$$ExternalSyntheticLambda1> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            setChipStrokeWidthResource$MenuHostHelper$$ExternalSyntheticLambda1 next = it.next();
            dArr[i3] = next.setIconTintList * 0.01d;
            dArr2[i3][c] = next.setX;
            dArr2[i3][1] = next.MenuHostHelper$$ExternalSyntheticLambda0;
            dArr2[i3][2] = next.setY;
            setY sety = this.setNavigationOnClickListener;
            int i4 = next.MenuHostHelper$$ExternalSyntheticLambda1;
            float f2 = next.setIconTintList;
            float f3 = next.MenuHostHelper$$ExternalSyntheticLambda0;
            float f4 = next.setY;
            float f5 = next.setX;
            sety.setNavigationOnClickListener[i3] = i4 / 100.0d;
            sety.setX[i3] = f2;
            sety.MenuHostHelper$$ExternalSyntheticLambda0[i3] = f3;
            sety.setUnboundedRipple[i3] = f4;
            sety.setOnLongClickListener[i3] = f5;
            i3++;
            c = 0;
        }
        setY sety2 = this.setNavigationOnClickListener;
        sety2.MenuHostHelper$$ExternalSyntheticLambda1 = f;
        double[][] dArr3 = (double[][]) Array.newInstance(Double.TYPE, sety2.setNavigationOnClickListener.length, 3);
        float[] fArr4 = sety2.setOnLongClickListener;
        sety2.setUiOptions = new double[fArr4.length + 2];
        sety2.setLayoutAnimation = new double[fArr4.length + 2];
        if (sety2.setNavigationOnClickListener[0] > 0.0d) {
            sety2.setIconTintList.setIconTintList(0.0d, sety2.setX[0]);
        }
        double[] dArr4 = sety2.setNavigationOnClickListener;
        int length = dArr4.length - 1;
        if (dArr4[length] < 1.0d) {
            sety2.setIconTintList.setIconTintList(1.0d, sety2.setX[length]);
        }
        for (int i5 = 0; i5 < dArr3.length; i5++) {
            double[] dArr5 = dArr3[i5];
            dArr5[0] = sety2.MenuHostHelper$$ExternalSyntheticLambda0[i5];
            dArr5[1] = sety2.setUnboundedRipple[i5];
            dArr5[2] = sety2.setOnLongClickListener[i5];
            sety2.setIconTintList.setIconTintList(sety2.setNavigationOnClickListener[i5], sety2.setX[i5]);
        }
        setFlexWrap setflexwrap = sety2.setIconTintList;
        double d = 0.0d;
        int i6 = 0;
        while (true) {
            if (i6 >= setflexwrap.setNavigationOnClickListener.length) {
                break;
            }
            d += fArr[i6];
            i6++;
        }
        double d2 = 0.0d;
        int i7 = 1;
        while (true) {
            if (i7 >= setflexwrap.setNavigationOnClickListener.length) {
                break;
            }
            double[] dArr6 = setflexwrap.setUnboundedRipple;
            d2 += (dArr6[i7] - dArr6[i7 - 1]) * ((fArr2[i2] + fArr2[i7]) / 2.0f);
            i7++;
        }
        int i8 = 0;
        while (true) {
            float[] fArr5 = setflexwrap.setNavigationOnClickListener;
            if (i8 >= fArr5.length) {
                break;
            }
            fArr5[i8] = (float) (fArr5[i8] * (d / d2));
            i8++;
        }
        setflexwrap.MenuHostHelper$$ExternalSyntheticLambda0[0] = 0.0d;
        int i9 = 1;
        while (true) {
            if (i9 >= setflexwrap.setNavigationOnClickListener.length) {
                break;
            }
            int i10 = i9 - 1;
            double[] dArr7 = setflexwrap.setUnboundedRipple;
            double d3 = dArr7[i9];
            double d4 = dArr7[i10];
            double[] dArr8 = setflexwrap.MenuHostHelper$$ExternalSyntheticLambda0;
            dArr8[i9] = dArr8[i10] + ((d3 - d4) * ((fArr3[i10] + fArr3[i9]) / 2.0f));
            i9++;
        }
        setflexwrap.setY = true;
        double[] dArr9 = sety2.setNavigationOnClickListener;
        if (dArr9.length > 1) {
            i = 0;
            sety2.setY = setCompatElevation.MenuHostHelper$$ExternalSyntheticLambda1(0, dArr9, dArr3);
        } else {
            i = 0;
            sety2.setY = null;
        }
        this.setUnboundedRipple = setCompatElevation.MenuHostHelper$$ExternalSyntheticLambda1(i, dArr, dArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        float[] MenuHostHelper$$ExternalSyntheticLambda0;
        float MenuHostHelper$$ExternalSyntheticLambda1;
        private final int ViewPager$SavedState$1;
        private final int setCenterIfNoTextEnabled;
        private final int setChipCornerRadius;
        private final int setIconSize;
        setFlexWrap setIconTintList;
        double[] setLayoutAnimation;
        double[] setNavigationOnClickListener;
        float[] setOnLongClickListener;
        private float[] setTextAlignment;
        double[] setUiOptions;
        float[] setUnboundedRipple;
        float[] setX;
        setCompatElevation setY;
        private int setZ;

        setY(int i, String str, int i2, int i3) {
            long j;
            setFlexWrap setflexwrap = new setFlexWrap();
            this.setIconTintList = setflexwrap;
            this.ViewPager$SavedState$1 = 0;
            this.setCenterIfNoTextEnabled = 1;
            this.setIconSize = 2;
            this.setZ = i;
            this.setChipCornerRadius = i2;
            setflexwrap.setOnLongClickListener = i;
            setflexwrap.setIconTintList = str;
            if (str != null) {
                double[] dArr = new double[str.length() / 2];
                int indexOf = str.indexOf(40) + 1;
                int indexOf2 = str.indexOf(44, indexOf);
                int i4 = 0;
                while (indexOf2 != -1) {
                    dArr[i4] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
                    indexOf = indexOf2 + 1;
                    indexOf2 = str.indexOf(44, indexOf);
                    i4++;
                }
                dArr[i4] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
                double[] copyOf = Arrays.copyOf(dArr, i4 + 1);
                int length = (copyOf.length * 3) - 2;
                int length2 = copyOf.length - 1;
                double d = 1.0d / length2;
                double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, length, 1);
                double[] dArr3 = new double[length];
                for (int i5 = 0; i5 < copyOf.length; i5++) {
                    double d2 = copyOf[i5];
                    int i6 = i5 + length2;
                    dArr2[i6][0] = d2;
                    double d3 = i5 * d;
                    dArr3[i6] = d3;
                    if (i5 > 0) {
                        int i7 = (length2 << 1) + i5;
                        j = 4607182418800017408L;
                        dArr2[i7][0] = d2 + 1.0d;
                        dArr3[i7] = d3 + 1.0d;
                        int i8 = i5 - 1;
                        dArr2[i8][0] = (d2 - 1.0d) - d;
                        dArr3[i8] = (d3 - 1.0d) - d;
                    } else {
                        j = 4607182418800017408L;
                    }
                }
                setflexwrap.setX = new SearchView(dArr3, dArr2);
            }
            this.setOnLongClickListener = new float[i3];
            this.setNavigationOnClickListener = new double[i3];
            this.setX = new float[i3];
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new float[i3];
            this.setUnboundedRipple = new float[i3];
            this.setTextAlignment = new float[i3];
        }
    }
}