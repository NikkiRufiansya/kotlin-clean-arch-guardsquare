package o;

/* loaded from: classes.dex */
public abstract class oZ extends oR {
    public oZ(oK<Object> oKVar) {
        super(oKVar);
        if (oKVar != null) {
            if (!(oKVar.setX() == oL.setX)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // o.oK
    public final oM setX() {
        return oL.setX;
    }
}