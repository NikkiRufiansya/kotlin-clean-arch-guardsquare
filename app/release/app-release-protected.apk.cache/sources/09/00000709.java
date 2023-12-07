package o;

/* loaded from: classes.dex */
public enum mT {
    NO_CACHE(1),
    NO_STORE(2);
    
    private int setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setY(int i) {
        return (i & NO_CACHE.setY) == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return (i & NO_STORE.setY) == 0;
    }

    mT(int i) {
        this.setY = i;
    }
}