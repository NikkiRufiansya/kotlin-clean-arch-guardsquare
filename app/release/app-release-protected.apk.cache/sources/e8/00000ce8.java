package o;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class setItemOnTouchListener {
    private SparseIntArray MenuHostHelper$$ExternalSyntheticLambda0 = new SparseIntArray();
    private HashMap<Integer, HashSet<WeakReference<setX>>> setY = new HashMap<>();

    /* loaded from: classes.dex */
    public interface setX {
    }

    public final void setX(int i, setX setx) {
        HashSet<WeakReference<setX>> hashSet = this.setY.get(Integer.valueOf(i));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.setY.put(Integer.valueOf(i), hashSet);
        }
        hashSet.add(new WeakReference<>(setx));
    }
}