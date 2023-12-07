package o;

/* loaded from: classes.dex */
public enum eU implements ip$MenuHostHelper$$ExternalSyntheticLambda0 {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);
    
    final int setY;

    static {
        new Object() { // from class: o.eU.5
        };
    }

    @Override // o.ip$MenuHostHelper$$ExternalSyntheticLambda0
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY;
    }

    public static eU setX(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return GAUGES_AND_SYSTEM_EVENTS;
        }
        return SESSION_VERBOSITY_NONE;
    }

    public static ip$MenuHostHelper$$ExternalSyntheticLambda1 setX() {
        return eU$MenuHostHelper$$ExternalSyntheticLambda0.setX;
    }

    eU(int i) {
        this.setY = i;
    }
}