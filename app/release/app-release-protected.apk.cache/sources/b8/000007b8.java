package o;

/* loaded from: classes.dex */
public abstract class oX extends oR {
    private transient oK<Object> MenuHostHelper$$ExternalSyntheticLambda1;
    private final oM setX;

    public oX(oK<Object> oKVar, oM oMVar) {
        super(oKVar);
        this.setX = oMVar;
    }

    public oX(oK<Object> oKVar) {
        this(oKVar, oKVar != null ? oKVar.setX() : null);
    }

    @Override // o.oK
    public oM setX() {
        oM oMVar = this.setX;
        pN.setX(oMVar);
        return oMVar;
    }

    public final oK<Object> setUiOptions() {
        oX oXVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (oXVar == null) {
            oN oNVar = (oN) setX().get(oN.MenuHostHelper$$ExternalSyntheticLambda0);
            oXVar = oNVar != null ? oNVar.MenuHostHelper$$ExternalSyntheticLambda1(this) : this;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = oXVar;
        }
        return oXVar;
    }

    @Override // o.oR
    public void setIconTintList() {
        oK<?> oKVar = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (oKVar != null && oKVar != this) {
            oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1 = setX().get(oN.MenuHostHelper$$ExternalSyntheticLambda0);
            pN.setX(om_menuhosthelper__externalsyntheticlambda1);
            ((oN) om_menuhosthelper__externalsyntheticlambda1).MenuHostHelper$$ExternalSyntheticLambda0(oKVar);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1 = oS.setY;
    }
}