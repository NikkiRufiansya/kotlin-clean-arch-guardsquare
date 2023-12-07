package o;

/* loaded from: classes.dex */
final class plus extends getScaleX {
    private final setCollapseIcon MenuHostHelper$$ExternalSyntheticLambda0;
    private final getScaleX$MenuHostHelper$$ExternalSyntheticLambda0 setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ plus(getScaleX$MenuHostHelper$$ExternalSyntheticLambda0 getscalex_menuhosthelper__externalsyntheticlambda0, setCollapseIcon setcollapseicon, byte b) {
        this(getscalex_menuhosthelper__externalsyntheticlambda0, setcollapseicon);
    }

    private plus(getScaleX$MenuHostHelper$$ExternalSyntheticLambda0 getscalex_menuhosthelper__externalsyntheticlambda0, setCollapseIcon setcollapseicon) {
        this.setX = getscalex_menuhosthelper__externalsyntheticlambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setcollapseicon;
    }

    @Override // o.getScaleX
    public final getScaleX$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX;
    }

    @Override // o.getScaleX
    public final setCollapseIcon MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClientInfo{clientType=");
        sb.append(this.setX);
        sb.append(", androidClientInfo=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof getScaleX) {
            getScaleX getscalex = (getScaleX) obj;
            getScaleX$MenuHostHelper$$ExternalSyntheticLambda0 getscalex_menuhosthelper__externalsyntheticlambda0 = this.setX;
            if (getscalex_menuhosthelper__externalsyntheticlambda0 != null ? getscalex_menuhosthelper__externalsyntheticlambda0.equals(getscalex.MenuHostHelper$$ExternalSyntheticLambda0()) : getscalex.MenuHostHelper$$ExternalSyntheticLambda0() == null) {
                setCollapseIcon setcollapseicon = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (setcollapseicon == null) {
                    if (getscalex.MenuHostHelper$$ExternalSyntheticLambda1() == null) {
                        return true;
                    }
                } else if (setcollapseicon.equals(getscalex.MenuHostHelper$$ExternalSyntheticLambda1())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        getScaleX$MenuHostHelper$$ExternalSyntheticLambda0 getscalex_menuhosthelper__externalsyntheticlambda0 = this.setX;
        int hashCode = getscalex_menuhosthelper__externalsyntheticlambda0 == null ? 0 : getscalex_menuhosthelper__externalsyntheticlambda0.hashCode();
        setCollapseIcon setcollapseicon = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return ((hashCode ^ 1000003) * 1000003) ^ (setcollapseicon != null ? setcollapseicon.hashCode() : 0);
    }
}