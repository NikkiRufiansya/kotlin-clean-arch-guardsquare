package o;

/* loaded from: classes.dex */
public enum mV {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int MenuHostHelper$$ExternalSyntheticLambda1;

    public static boolean setY(int i) {
        return (i & NO_CACHE.MenuHostHelper$$ExternalSyntheticLambda1) == 0;
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return (i & NO_STORE.MenuHostHelper$$ExternalSyntheticLambda1) == 0;
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        return (i & OFFLINE.MenuHostHelper$$ExternalSyntheticLambda1) != 0;
    }

    mV(int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }
}