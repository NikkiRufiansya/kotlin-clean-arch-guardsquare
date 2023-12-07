package o;

/* loaded from: classes.dex */
public final class setOnCheckedChangeListener extends joinThreadPool {
    private double MenuHostHelper$$ExternalSyntheticLambda0;
    private double setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnCheckedChangeListener(String str) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        int indexOf = str.indexOf(40);
        int indexOf2 = str.indexOf(44, indexOf);
        this.setIconTintList = Double.parseDouble(str.substring(indexOf + 1, indexOf2).trim());
        int i = indexOf2 + 1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = Double.parseDouble(str.substring(i, str.indexOf(44, i)).trim());
    }

    @Override // o.joinThreadPool
    public final double setIconTintList(double d) {
        double d2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (d < d2) {
            return (d2 * d) / (d + (this.setIconTintList * (d2 - d)));
        }
        return ((1.0d - d2) * (d - 1.0d)) / ((1.0d - d) - (this.setIconTintList * (d2 - d)));
    }

    @Override // o.joinThreadPool
    public final double MenuHostHelper$$ExternalSyntheticLambda0(double d) {
        double d2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (d < d2) {
            double d3 = this.setIconTintList;
            double d4 = d3 * d2 * d2;
            double d5 = ((d2 - d) * d3) + d;
            return d4 / (d5 * d5);
        }
        double d6 = this.setIconTintList;
        double d7 = d2 - 1.0d;
        double d8 = (((-d6) * (d2 - d)) - d) + 1.0d;
        return ((d7 * d6) * d7) / (d8 * d8);
    }
}