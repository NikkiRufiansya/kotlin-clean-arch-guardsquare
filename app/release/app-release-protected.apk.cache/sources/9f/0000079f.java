package o;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class oG implements Comparator<Comparable<? super Object>> {
    public static final oG MenuHostHelper$$ExternalSyntheticLambda1 = new oG();

    private oG() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        Comparable<? super Object> comparable3 = comparable;
        Comparable<? super Object> comparable4 = comparable2;
        pN.setY(comparable3, "");
        pN.setY(comparable4, "");
        return comparable3.compareTo(comparable4);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return oF.MenuHostHelper$$ExternalSyntheticLambda1;
    }
}