package o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
final class aA {
    aA() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        final C0024al<?> MenuHostHelper$$ExternalSyntheticLambda0;
        final Set<setY> setX = new HashSet();
        final Set<setY> setY = new HashSet();

        setY(C0024al<?> c0024al) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = c0024al;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void MenuHostHelper$$ExternalSyntheticLambda0(List<C0024al<?>> list) {
        Set<setY> x = setX(list);
        Set<setY> MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(x);
        int i = 0;
        while (!MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
            setY next = MenuHostHelper$$ExternalSyntheticLambda0.iterator().next();
            MenuHostHelper$$ExternalSyntheticLambda0.remove(next);
            i++;
            for (setY sety : next.setX) {
                sety.setY.remove(next);
                if (sety.setY.isEmpty()) {
                    MenuHostHelper$$ExternalSyntheticLambda0.add(sety);
                }
            }
        }
        if (i == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (setY sety2 : x) {
            if (!sety2.setY.isEmpty() && !sety2.setX.isEmpty()) {
                arrayList.add(sety2.MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        throw new C0038az(arrayList);
    }

    private static Set<setY> setX(List<C0024al<?>> list) {
        boolean z;
        HashMap hashMap = new HashMap(list.size());
        for (C0024al<?> c0024al : list) {
            setY sety = new setY(c0024al);
            for (aL<? super Object> aLVar : c0024al.MenuHostHelper$$ExternalSyntheticLambda1) {
                aA$MenuHostHelper$$ExternalSyntheticLambda0 aa_menuhosthelper__externalsyntheticlambda0 = new aA$MenuHostHelper$$ExternalSyntheticLambda0(aLVar, !(c0024al.setOnLongClickListener == 0), (byte) 0);
                if (!hashMap.containsKey(aa_menuhosthelper__externalsyntheticlambda0)) {
                    hashMap.put(aa_menuhosthelper__externalsyntheticlambda0, new HashSet());
                }
                Set set = (Set) hashMap.get(aa_menuhosthelper__externalsyntheticlambda0);
                if (!set.isEmpty()) {
                    z = aa_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (!z) {
                        throw new IllegalArgumentException(String.format("Multiple components provide %s.", aLVar));
                    }
                }
                set.add(sety);
            }
        }
        for (Set<setY> set2 : hashMap.values()) {
            for (setY sety2 : set2) {
                for (C0037ay c0037ay : sety2.MenuHostHelper$$ExternalSyntheticLambda0.setX) {
                    if (c0037ay.setX == 0) {
                        Set<setY> set3 = (Set) hashMap.get(new aA$MenuHostHelper$$ExternalSyntheticLambda0(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1, c0037ay.MenuHostHelper$$ExternalSyntheticLambda0 == 2, (byte) 0));
                        if (set3 != null) {
                            for (setY sety3 : set3) {
                                sety2.setX.add(sety3);
                                sety3.setY.add(sety2);
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (Set set4 : hashMap.values()) {
            hashSet.addAll(set4);
        }
        return hashSet;
    }

    private static Set<setY> MenuHostHelper$$ExternalSyntheticLambda0(Set<setY> set) {
        HashSet hashSet = new HashSet();
        for (setY sety : set) {
            if (sety.setY.isEmpty()) {
                hashSet.add(sety);
            }
        }
        return hashSet;
    }
}