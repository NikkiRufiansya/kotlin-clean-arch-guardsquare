package o;

/* loaded from: classes.dex */
public enum eP$MenuHostHelper$$ExternalSyntheticLambda1 implements ip$MenuHostHelper$$ExternalSyntheticLambda0 {
    HTTP_METHOD_UNKNOWN(0),
    GET(1),
    PUT(2),
    POST(3),
    DELETE(4),
    HEAD(5),
    PATCH(6),
    OPTIONS(7),
    TRACE(8),
    CONNECT(9);
    
    final int setIconSize;

    static {
        new Object() { // from class: o.eP$MenuHostHelper$$ExternalSyntheticLambda1.3
        };
    }

    @Override // o.ip$MenuHostHelper$$ExternalSyntheticLambda0
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconSize;
    }

    public static eP$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        switch (i) {
            case 0:
                return HTTP_METHOD_UNKNOWN;
            case 1:
                return GET;
            case 2:
                return PUT;
            case 3:
                return POST;
            case 4:
                return DELETE;
            case 5:
                return HEAD;
            case 6:
                return PATCH;
            case 7:
                return OPTIONS;
            case 8:
                return TRACE;
            case 9:
                return CONNECT;
            default:
                return null;
        }
    }

    public static ip$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList() {
        return setX.setX;
    }

    /* loaded from: classes.dex */
    static final class setX implements ip$MenuHostHelper$$ExternalSyntheticLambda1 {
        static final ip$MenuHostHelper$$ExternalSyntheticLambda1 setX = new setX();

        private setX() {
        }
    }

    eP$MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        this.setIconSize = i;
    }
}