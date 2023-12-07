package o;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class setTickMark {
    private static SparseArray<isBinderAlive> MenuHostHelper$$ExternalSyntheticLambda0 = new SparseArray<>();
    private static HashMap<isBinderAlive, Integer> setX;

    static {
        HashMap<isBinderAlive, Integer> hashMap = new HashMap<>();
        setX = hashMap;
        hashMap.put(isBinderAlive.DEFAULT, 0);
        setX.put(isBinderAlive.VERY_LOW, 1);
        setX.put(isBinderAlive.HIGHEST, 2);
        for (isBinderAlive isbinderalive : setX.keySet()) {
            MenuHostHelper$$ExternalSyntheticLambda0.append(setX.get(isbinderalive).intValue(), isbinderalive);
        }
    }

    public static isBinderAlive setY(int i) {
        isBinderAlive isbinderalive = MenuHostHelper$$ExternalSyntheticLambda0.get(i);
        if (isbinderalive != null) {
            return isbinderalive;
        }
        StringBuilder sb = new StringBuilder("Unknown Priority for value ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static int setX(isBinderAlive isbinderalive) {
        Integer num = setX.get(isbinderalive);
        if (num == null) {
            StringBuilder sb = new StringBuilder("PriorityMapping is missing known Priority value ");
            sb.append(isbinderalive);
            throw new IllegalStateException(sb.toString());
        }
        return num.intValue();
    }
}