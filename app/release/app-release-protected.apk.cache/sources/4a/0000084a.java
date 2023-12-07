package o;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class qL extends qF {
    public static final <T> List<T> setIconTintList(qC<? extends T> qCVar) {
        pN.setY(qCVar, "");
        pN.setY(qCVar, "");
        ArrayList arrayList = new ArrayList();
        pN.setY(qCVar, "");
        pN.setY(arrayList, "");
        Iterator<? extends T> MenuHostHelper$$ExternalSyntheticLambda0 = qCVar.MenuHostHelper$$ExternalSyntheticLambda0();
        while (MenuHostHelper$$ExternalSyntheticLambda0.hasNext()) {
            arrayList.add(MenuHostHelper$$ExternalSyntheticLambda0.next());
        }
        return C0348oi.MenuHostHelper$$ExternalSyntheticLambda0((List) arrayList);
    }
}