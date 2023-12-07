package o;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class sK$MenuHostHelper$$ExternalSyntheticLambda1 implements InterfaceC0470sw {
    final sJ MenuHostHelper$$ExternalSyntheticLambda0;
    volatile /* synthetic */ Object _rootCause;
    volatile /* synthetic */ int _isCompleting = 0;
    volatile /* synthetic */ Object _exceptionsHolder = null;

    @Override // o.InterfaceC0470sw
    public final sJ p_() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public sK$MenuHostHelper$$ExternalSyntheticLambda1(sJ sJVar, Throwable th) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = sJVar;
        this._rootCause = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean, int] */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(((Throwable) this._rootCause) != null);
        sb.append(", completing=");
        sb.append((boolean) this._isCompleting);
        sb.append(", rootCause=");
        sb.append((Throwable) this._rootCause);
        sb.append(", exceptions=");
        sb.append(this._exceptionsHolder);
        sb.append(", list=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(']');
        return sb.toString();
    }

    public final void setIconTintList(Throwable th) {
        Throwable th2 = (Throwable) this._rootCause;
        if (th2 == null) {
            this._rootCause = th;
        } else if (th == th2) {
        } else {
            Object obj = this._exceptionsHolder;
            if (obj != null) {
                if (!(obj instanceof Throwable)) {
                    if (obj instanceof ArrayList) {
                        ((ArrayList) obj).add(th);
                        return;
                    }
                    StringBuilder sb = new StringBuilder("State is ");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString().toString());
                } else if (th == obj) {
                    return;
                } else {
                    ArrayList arrayList = new ArrayList(4);
                    arrayList.add(obj);
                    arrayList.add(th);
                    this._exceptionsHolder = arrayList;
                    return;
                }
            }
            this._exceptionsHolder = th;
        }
    }

    @Override // o.InterfaceC0470sw
    public final boolean setX() {
        return ((Throwable) this._rootCause) == null;
    }
}