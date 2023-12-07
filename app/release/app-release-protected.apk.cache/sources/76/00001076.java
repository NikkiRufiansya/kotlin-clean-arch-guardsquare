package o;

import android.util.SparseArray;

/* loaded from: classes.dex */
public enum setThumbTintMode {
    DEFAULT(0),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_ONLY(1),
    /* JADX INFO: Fake field, exist only in values array */
    UNMETERED_OR_DAILY(2),
    /* JADX INFO: Fake field, exist only in values array */
    FAST_IF_RADIO_AWAKE(3),
    /* JADX INFO: Fake field, exist only in values array */
    NEVER(4),
    /* JADX INFO: Fake field, exist only in values array */
    UNRECOGNIZED(-1);
    
    private final int setIconTintList;

    static {
        setThumbTintMode setthumbtintmode;
        setThumbTintMode setthumbtintmode2;
        setThumbTintMode setthumbtintmode3;
        setThumbTintMode setthumbtintmode4;
        setThumbTintMode setthumbtintmode5;
        setThumbTintMode setthumbtintmode6 = DEFAULT;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, setthumbtintmode6);
        sparseArray.put(1, setthumbtintmode);
        sparseArray.put(2, setthumbtintmode2);
        sparseArray.put(3, setthumbtintmode3);
        sparseArray.put(4, setthumbtintmode4);
        sparseArray.put(-1, setthumbtintmode5);
    }

    setThumbTintMode(int i) {
        this.setIconTintList = i;
    }
}