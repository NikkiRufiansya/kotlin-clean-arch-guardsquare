package o;

/* loaded from: classes.dex */
public final class gA$MenuHostHelper$$ExternalSyntheticLambda0 {
    public final InterfaceC0531va MenuHostHelper$$ExternalSyntheticLambda1;
    public gC setY;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gA$MenuHostHelper$$ExternalSyntheticLambda0) {
            gA$MenuHostHelper$$ExternalSyntheticLambda0 ga_menuhosthelper__externalsyntheticlambda0 = (gA$MenuHostHelper$$ExternalSyntheticLambda0) obj;
            return pN.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda1, ga_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1) && pN.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, ga_menuhosthelper__externalsyntheticlambda0.setY);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
        gC gCVar = this.setY;
        return (hashCode * 31) + (gCVar == null ? 0 : gCVar.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency(mutex=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", subscriber=");
        sb.append(this.setY);
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ gA$MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0531va interfaceC0531va) {
        this(interfaceC0531va, null);
    }

    private gA$MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0531va interfaceC0531va, gC gCVar) {
        pN.setY(interfaceC0531va, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = interfaceC0531va;
        this.setY = null;
    }
}