package o;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.sk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0458sk implements InterfaceC0470sw {
    final boolean setY;

    @Override // o.InterfaceC0470sw
    public final sJ p_() {
        return null;
    }

    public C0458sk(boolean z) {
        this.setY = z;
    }

    @Override // o.InterfaceC0470sw
    public final boolean setX() {
        return this.setY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Empty{");
        sb.append(this.setY ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}