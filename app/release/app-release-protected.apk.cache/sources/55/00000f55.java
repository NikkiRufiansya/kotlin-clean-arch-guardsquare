package o;

import java.util.ArrayList;
import java.util.HashSet;
import o.setAnimateShowBeforeLayout;

/* loaded from: classes.dex */
public final class setSecondaryProgressTintList<T> {
    public final setAnimateShowBeforeLayout.setY<ArrayList<T>> setY = new setAnimateShowBeforeLayout.setIconTintList(10);
    public final setDividerHeight<T, ArrayList<T>> MenuHostHelper$$ExternalSyntheticLambda0 = new setDividerHeight<>();
    public final ArrayList<T> setIconTintList = new ArrayList<>();
    public final HashSet<T> setX = new HashSet<>();

    public final void MenuHostHelper$$ExternalSyntheticLambda1(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t)) {
            return;
        }
        if (hashSet.contains(t)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t);
        ArrayList<T> arrayList2 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(t);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                MenuHostHelper$$ExternalSyntheticLambda1(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(t);
        arrayList.add(t);
    }
}