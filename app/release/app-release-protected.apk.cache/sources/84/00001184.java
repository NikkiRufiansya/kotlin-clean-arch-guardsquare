package o;

/* loaded from: classes.dex */
final class uD$MenuHostHelper$$ExternalSyntheticLambda1 extends pO implements InterfaceC0389pw<Object, oM$MenuHostHelper$$ExternalSyntheticLambda1, Object> {
    public static final uD$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0 = new uD$MenuHostHelper$$ExternalSyntheticLambda1();

    uD$MenuHostHelper$$ExternalSyntheticLambda1() {
        super(2);
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1) {
        oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda12 = om_menuhosthelper__externalsyntheticlambda1;
        if (om_menuhosthelper__externalsyntheticlambda12 instanceof sS) {
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num != null ? num.intValue() : 1;
            return intValue != 0 ? Integer.valueOf(intValue + 1) : om_menuhosthelper__externalsyntheticlambda12;
        }
        return obj;
    }
}