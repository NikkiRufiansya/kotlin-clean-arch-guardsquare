package o;

/* loaded from: classes.dex */
public final class oS implements oK<Object> {
    public static final oS setY = new oS();

    public final String toString() {
        return "This continuation is already complete";
    }

    private oS() {
    }

    @Override // o.oK
    public final oM setX() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // o.oK
    public final void MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }
}