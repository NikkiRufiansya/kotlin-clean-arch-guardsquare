package o;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class setFlexWrap {
    double[] MenuHostHelper$$ExternalSyntheticLambda0;
    String setIconTintList;
    int setOnLongClickListener;
    SearchView setX;
    float[] setNavigationOnClickListener = new float[0];
    double[] setUnboundedRipple = new double[0];
    double MenuHostHelper$$ExternalSyntheticLambda1 = 6.283185307179586d;
    boolean setY = false;

    public final String toString() {
        StringBuilder sb = new StringBuilder("pos =");
        sb.append(Arrays.toString(this.setUnboundedRipple));
        sb.append(" period=");
        sb.append(Arrays.toString(this.setNavigationOnClickListener));
        return sb.toString();
    }

    public final void setIconTintList(double d, float f) {
        int length = this.setNavigationOnClickListener.length + 1;
        int binarySearch = Arrays.binarySearch(this.setUnboundedRipple, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.setUnboundedRipple = Arrays.copyOf(this.setUnboundedRipple, length);
        this.setNavigationOnClickListener = Arrays.copyOf(this.setNavigationOnClickListener, length);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new double[length];
        double[] dArr = this.setUnboundedRipple;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        this.setUnboundedRipple[binarySearch] = d;
        this.setNavigationOnClickListener[binarySearch] = f;
        this.setY = false;
    }
}