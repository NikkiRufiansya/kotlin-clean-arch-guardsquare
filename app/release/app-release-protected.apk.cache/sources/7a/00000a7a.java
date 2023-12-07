package o;

/* loaded from: classes.dex */
public abstract class setCompatElevation {
    public abstract double MenuHostHelper$$ExternalSyntheticLambda0(double d);

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(double d, double[] dArr);

    public abstract double[] setIconTintList();

    public abstract void setX(double d, double[] dArr);

    public abstract void setX(double d, float[] fArr);

    public static setCompatElevation MenuHostHelper$$ExternalSyntheticLambda1(int i, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i = 2;
        }
        if (i != 0) {
            if (i == 2) {
                return new setY(dArr[0], dArr2[0]);
            }
            return new clone(dArr, dArr2);
        }
        return new SearchView(dArr, dArr2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY extends setCompatElevation {
        private double[] MenuHostHelper$$ExternalSyntheticLambda0;
        private double MenuHostHelper$$ExternalSyntheticLambda1;

        setY(double d, double[] dArr) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = d;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = dArr;
        }

        @Override // o.setCompatElevation
        public final void setX(double d, double[] dArr) {
            double[] dArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // o.setCompatElevation
        public final void setX(double d, float[] fArr) {
            int i = 0;
            while (true) {
                double[] dArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (i >= dArr.length) {
                    return;
                }
                fArr[i] = (float) dArr[i];
                i++;
            }
        }

        @Override // o.setCompatElevation
        public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0[0];
        }

        @Override // o.setCompatElevation
        public final void MenuHostHelper$$ExternalSyntheticLambda1(double d, double[] dArr) {
            for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda0.length; i++) {
                dArr[i] = 0.0d;
            }
        }

        @Override // o.setCompatElevation
        public final double[] setIconTintList() {
            return new double[]{this.MenuHostHelper$$ExternalSyntheticLambda1};
        }
    }
}