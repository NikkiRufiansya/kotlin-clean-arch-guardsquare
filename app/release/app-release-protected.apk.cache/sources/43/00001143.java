package o;

/* loaded from: classes.dex */
public final class tT {

    /* loaded from: classes.dex */
    static final class setIconTintList extends pO implements InterfaceC0389pw<Integer, oM$MenuHostHelper$$ExternalSyntheticLambda1, Integer> {
        private /* synthetic */ tV<?> setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setIconTintList(tV<?> tVVar) {
            super(2);
            this.setY = tVVar;
        }

        @Override // o.InterfaceC0389pw
        public final /* synthetic */ Integer MenuHostHelper$$ExternalSyntheticLambda0(Integer num, oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda1) {
            int intValue = num.intValue();
            oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda12 = om_menuhosthelper__externalsyntheticlambda1;
            oM$MenuHostHelper$$ExternalSyntheticLambda0<?> key = om_menuhosthelper__externalsyntheticlambda12.getKey();
            oM$MenuHostHelper$$ExternalSyntheticLambda1 om_menuhosthelper__externalsyntheticlambda13 = this.setY.MenuHostHelper$$ExternalSyntheticLambda0.get(key);
            if (key != sB.MenuHostHelper$$ExternalSyntheticLambda1) {
                return Integer.valueOf(om_menuhosthelper__externalsyntheticlambda12 != om_menuhosthelper__externalsyntheticlambda13 ? Integer.MIN_VALUE : intValue + 1);
            }
            sB sBVar = (sB) om_menuhosthelper__externalsyntheticlambda13;
            sB sBVar2 = (sB) om_menuhosthelper__externalsyntheticlambda12;
            while (true) {
                if (sBVar2 != null) {
                    if (sBVar2 == sBVar || !(sBVar2 instanceof uA)) {
                        break;
                    }
                    rB rBVar = (rB) ((uA) sBVar2)._parentHandle;
                    sBVar2 = rBVar != null ? rBVar.setIconTintList() : null;
                } else {
                    sBVar2 = null;
                    break;
                }
            }
            if (sBVar2 != sBVar) {
                StringBuilder sb = new StringBuilder("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of ");
                sb.append(sBVar2);
                sb.append(", expected child of ");
                sb.append(sBVar);
                sb.append(".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'");
                throw new IllegalStateException(sb.toString().toString());
            }
            if (sBVar != null) {
                intValue++;
            }
            return Integer.valueOf(intValue);
        }
    }
}