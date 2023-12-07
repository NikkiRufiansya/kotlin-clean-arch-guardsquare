package o;

/* loaded from: classes.dex */
public final class setStrokeColor {
    private static float MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2, float f3, float f4) {
        return (f <= f2 || f <= f3 || f <= f4) ? (f2 <= f3 || f2 <= f4) ? f3 > f4 ? f3 : f4 : f2 : f;
    }

    public static float setX(float f, float f2, float f3, float f4) {
        double d = 0.0f - f;
        double d2 = 0.0f - f2;
        double d3 = f3 - f;
        double d4 = f4 - f2;
        return MenuHostHelper$$ExternalSyntheticLambda1((float) Math.hypot(d, d2), (float) Math.hypot(d3, d2), (float) Math.hypot(d3, d4), (float) Math.hypot(d, d4));
    }
}