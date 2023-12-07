package o;

/* renamed from: o.ua  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0502ua implements rU {
    private final oM setY;

    public C0502ua(oM oMVar) {
        this.setY = oMVar;
    }

    @Override // o.rU
    public final oM setIconTintList() {
        return this.setY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineScope(coroutineContext=");
        sb.append(this.setY);
        sb.append(')');
        return sb.toString();
    }
}