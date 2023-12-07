package o;

import android.util.Log;
import o.nR;

/* loaded from: classes.dex */
final class gI$MenuHostHelper$$ExternalSyntheticLambda0 extends AbstractC0368pb implements InterfaceC0389pw<String, oK<? super nX>, Object> {
    private /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gI$MenuHostHelper$$ExternalSyntheticLambda0(oK<? super gI$MenuHostHelper$$ExternalSyntheticLambda0> oKVar) {
        super(2, oKVar);
    }

    @Override // o.oR
    public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        gI$MenuHostHelper$$ExternalSyntheticLambda0 gi_menuhosthelper__externalsyntheticlambda0 = new gI$MenuHostHelper$$ExternalSyntheticLambda0(oKVar);
        gi_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = obj;
        return gi_menuhosthelper__externalsyntheticlambda0;
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(String str, oK<? super nX> oKVar) {
        gI$MenuHostHelper$$ExternalSyntheticLambda0 gi_menuhosthelper__externalsyntheticlambda0 = new gI$MenuHostHelper$$ExternalSyntheticLambda0(oKVar);
        gi_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        return gi_menuhosthelper__externalsyntheticlambda0.setY(nX.setX);
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        if (!(obj instanceof nR.setX)) {
            StringBuilder sb = new StringBuilder("Error failing to fetch the remote configs: ");
            sb.append((String) this.MenuHostHelper$$ExternalSyntheticLambda1);
            Log.e("SessionConfigFetcher", sb.toString());
            return nX.setX;
        }
        throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
    }
}