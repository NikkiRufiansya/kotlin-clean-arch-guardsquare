package o;

/* loaded from: classes.dex */
public final class ReflectedParcelable {
    public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
    public final long setY;

    /* loaded from: classes.dex */
    public static final class setX {
        public long setY = 0;
        public setIconTintList setX = setIconTintList.REASON_UNKNOWN;
    }

    static {
        setX setx = new setX();
        new ReflectedParcelable(setx.setY, setx.setX);
    }

    public ReflectedParcelable(long j, setIconTintList seticontintlist) {
        this.setY = j;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = seticontintlist;
    }

    /* loaded from: classes.dex */
    public enum setIconTintList implements bI {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        
        public final int setUnboundedRipple;

        setIconTintList(int i) {
            this.setUnboundedRipple = i;
        }

        @Override // o.bI
        public final int setX() {
            return this.setUnboundedRipple;
        }
    }
}