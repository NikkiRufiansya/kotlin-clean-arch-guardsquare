package o;

import android.graphics.Color;

/* loaded from: classes.dex */
public final class setExtended {
    private static final ThreadLocal<double[]> setY = new ThreadLocal<>();

    public static int setY(int i, int i2) {
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i3 = 255 - alpha2;
        int i4 = 255 - (((255 - alpha) * i3) / 255);
        return Color.argb(i4, i4 == 0 ? 0 : (((Color.red(i) * 255) * alpha2) + ((Color.red(i2) * alpha) * i3)) / (i4 * 255), i4 == 0 ? 0 : (((Color.green(i) * 255) * alpha2) + ((Color.green(i2) * alpha) * i3)) / (i4 * 255), i4 != 0 ? (((Color.blue(i) * 255) * alpha2) + ((Color.blue(i2) * alpha) * i3)) / (i4 * 255) : 0);
    }

    public static int setIconTintList(int i, int i2) {
        if (i2 < 0 || i2 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i & 16777215) | (i2 << 24);
    }

    public static int setIconTintList(double d, double d2, double d3) {
        double d4 = (((3.2406d * d) + ((-1.5372d) * d2)) + ((-0.4986d) * d3)) / 100.0d;
        double d5 = ((((-0.9689d) * d) + (1.8758d * d2)) + (0.0415d * d3)) / 100.0d;
        double d6 = (((0.0557d * d) + ((-0.204d) * d2)) + (1.057d * d3)) / 100.0d;
        double pow = d4 > 0.0031308d ? (Math.pow(d4, 0.4166666666666667d) * 1.055d) - 0.055d : d4 * 12.92d;
        double pow2 = d5 > 0.0031308d ? (Math.pow(d5, 0.4166666666666667d) * 1.055d) - 0.055d : d5 * 12.92d;
        double pow3 = d6 > 0.0031308d ? (Math.pow(d6, 0.4166666666666667d) * 1.055d) - 0.055d : d6 * 12.92d;
        int round = (int) Math.round(pow * 255.0d);
        int min = round >= 0 ? Math.min(round, 255) : 0;
        int round2 = (int) Math.round(pow2 * 255.0d);
        int min2 = round2 >= 0 ? Math.min(round2, 255) : 0;
        int round3 = (int) Math.round(pow3 * 255.0d);
        return Color.rgb(min, min2, round3 >= 0 ? Math.min(round3, 255) : 0);
    }

    public static double MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        ThreadLocal<double[]> threadLocal = setY;
        double[] dArr = threadLocal.get();
        if (dArr == null) {
            dArr = new double[3];
            threadLocal.set(dArr);
        }
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d = red / 255.0d;
        double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
        double d2 = green / 255.0d;
        double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
        double d3 = blue / 255.0d;
        double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.4124d * pow) + (0.3576d * pow2) + (0.1805d * pow3)) * 100.0d;
        dArr[1] = ((0.2126d * pow) + (0.7152d * pow2) + (0.0722d * pow3)) * 100.0d;
        dArr[2] = ((pow * 0.0193d) + (pow2 * 0.1192d) + (pow3 * 0.9505d)) * 100.0d;
        return dArr[1] / 100.0d;
    }
}