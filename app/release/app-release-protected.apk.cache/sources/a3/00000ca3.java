package o;

import java.util.LinkedHashMap;
import java.util.Map;
import o.nR;
import o.setCropToPadding;

/* loaded from: classes.dex */
public final class setImportantForAutofill$MenuHostHelper$$ExternalSyntheticLambda0 extends AbstractC0368pb implements InterfaceC0389pw<setCropToPadding, oK<? super setCropToPadding>, Object> {
    final /* synthetic */ InterfaceC0389pw<setRepeatMode, oK<? super nX>, Object> MenuHostHelper$$ExternalSyntheticLambda0;
    private /* synthetic */ Object setIconTintList;
    private int setX;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public setImportantForAutofill$MenuHostHelper$$ExternalSyntheticLambda0(InterfaceC0389pw<? super setRepeatMode, ? super oK<? super nX>, ? extends Object> interfaceC0389pw, oK<? super setImportantForAutofill$MenuHostHelper$$ExternalSyntheticLambda0> oKVar) {
        super(2, oKVar);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0389pw;
    }

    @Override // o.oR
    public final oK<nX> MenuHostHelper$$ExternalSyntheticLambda0(Object obj, oK<?> oKVar) {
        setImportantForAutofill$MenuHostHelper$$ExternalSyntheticLambda0 setimportantforautofill_menuhosthelper__externalsyntheticlambda0 = new setImportantForAutofill$MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, oKVar);
        setimportantforautofill_menuhosthelper__externalsyntheticlambda0.setIconTintList = obj;
        return setimportantforautofill_menuhosthelper__externalsyntheticlambda0;
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ Object MenuHostHelper$$ExternalSyntheticLambda0(setCropToPadding setcroptopadding, oK<? super setCropToPadding> oKVar) {
        setImportantForAutofill$MenuHostHelper$$ExternalSyntheticLambda0 setimportantforautofill_menuhosthelper__externalsyntheticlambda0 = new setImportantForAutofill$MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0, oKVar);
        setimportantforautofill_menuhosthelper__externalsyntheticlambda0.setIconTintList = setcroptopadding;
        return setimportantforautofill_menuhosthelper__externalsyntheticlambda0.setY(nX.setX);
    }

    @Override // o.oR
    public final Object setY(Object obj) {
        oJ oJVar = oJ.COROUTINE_SUSPENDED;
        int i = this.setX;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            setRepeatMode setrepeatmode = (setRepeatMode) this.setIconTintList;
            if (obj instanceof nR.setX) {
                throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
            }
            return setrepeatmode;
        } else if (!(obj instanceof nR.setX)) {
            Map<setCropToPadding.setY<?>, Object> y = ((setCropToPadding) this.setIconTintList).setY();
            pN.setY(y, "");
            setRepeatMode setrepeatmode2 = new setRepeatMode(new LinkedHashMap(y), false);
            InterfaceC0389pw<setRepeatMode, oK<? super nX>, Object> interfaceC0389pw = this.MenuHostHelper$$ExternalSyntheticLambda0;
            this.setIconTintList = setrepeatmode2;
            this.setX = 1;
            return interfaceC0389pw.MenuHostHelper$$ExternalSyntheticLambda0(setrepeatmode2, this) == oJVar ? oJVar : setrepeatmode2;
        } else {
            throw ((nR.setX) obj).MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }
}