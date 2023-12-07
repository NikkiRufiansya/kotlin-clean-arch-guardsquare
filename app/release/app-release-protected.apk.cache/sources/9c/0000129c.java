package o;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class wR$MenuHostHelper$$ExternalSyntheticLambda1 {
    private wR$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    public /* synthetic */ wR$MenuHostHelper$$ExternalSyntheticLambda1(byte b) {
        this();
    }

    public static List<String> setX(List<? extends vB> list) {
        pN.setY(list, "");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((vB) obj) != vB.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList<vB> arrayList2 = arrayList;
        pN.setY(arrayList2, "");
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (vB vBVar : arrayList2) {
            arrayList3.add(vBVar.toString());
        }
        return arrayList3;
    }
}