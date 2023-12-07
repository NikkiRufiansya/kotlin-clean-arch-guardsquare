package o;

/* loaded from: classes.dex */
final class rE {
    public final Throwable MenuHostHelper$$ExternalSyntheticLambda0;
    public final Object MenuHostHelper$$ExternalSyntheticLambda1;
    public final AbstractC0436rp setIconTintList;
    public final Object setX;
    public final InterfaceC0377pk<Throwable, nX> setY;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof rE) {
            rE rEVar = (rE) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, rEVar.MenuHostHelper$$ExternalSyntheticLambda1) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, rEVar.setIconTintList) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, rEVar.setY) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setX, rEVar.setX) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, rEVar.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int hashCode = obj == null ? 0 : obj.hashCode();
        AbstractC0436rp abstractC0436rp = this.setIconTintList;
        int hashCode2 = abstractC0436rp == null ? 0 : abstractC0436rp.hashCode();
        InterfaceC0377pk<Throwable, nX> interfaceC0377pk = this.setY;
        int hashCode3 = interfaceC0377pk == null ? 0 : interfaceC0377pk.hashCode();
        Object obj2 = this.setX;
        int hashCode4 = obj2 == null ? 0 : obj2.hashCode();
        Throwable th = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CompletedContinuation(result=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", cancelHandler=");
        sb.append(this.setIconTintList);
        sb.append(", onCancellation=");
        sb.append(this.setY);
        sb.append(", idempotentResume=");
        sb.append(this.setX);
        sb.append(", cancelCause=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private rE(Object obj, AbstractC0436rp abstractC0436rp, InterfaceC0377pk<? super Throwable, nX> interfaceC0377pk, Object obj2, Throwable th) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = obj;
        this.setIconTintList = abstractC0436rp;
        this.setY = interfaceC0377pk;
        this.setX = obj2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = th;
    }

    public /* synthetic */ rE(Object obj, AbstractC0436rp abstractC0436rp, InterfaceC0377pk interfaceC0377pk, Object obj2, Throwable th, int i) {
        this(obj, (i & 2) != 0 ? null : abstractC0436rp, (i & 4) != 0 ? null : interfaceC0377pk, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    public static /* synthetic */ rE setY(rE rEVar, Object obj, AbstractC0436rp abstractC0436rp, InterfaceC0377pk interfaceC0377pk, Object obj2, Throwable th, int i) {
        if ((i & 1) != 0) {
            obj = rEVar.MenuHostHelper$$ExternalSyntheticLambda1;
        }
        Object obj3 = obj;
        if ((i & 2) != 0) {
            abstractC0436rp = rEVar.setIconTintList;
        }
        AbstractC0436rp abstractC0436rp2 = abstractC0436rp;
        if ((i & 4) != 0) {
            interfaceC0377pk = rEVar.setY;
        }
        InterfaceC0377pk interfaceC0377pk2 = interfaceC0377pk;
        if ((i & 8) != 0) {
            obj2 = rEVar.setX;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = rEVar.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return new rE(obj3, abstractC0436rp2, interfaceC0377pk2, obj4, th);
    }
}