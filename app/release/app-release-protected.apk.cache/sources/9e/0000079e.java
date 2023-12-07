package o;

import java.util.Comparator;

/* loaded from: classes.dex */
final class oF implements Comparator<Comparable<? super Object>> {
    public static final oF MenuHostHelper$$ExternalSyntheticLambda1 = new oF();

    private oF() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        pN.setY(comparable3, "");
        pN.setY(comparable4, "");
        return comparable4.compareTo(comparable3);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return oG.MenuHostHelper$$ExternalSyntheticLambda1;
    }
}