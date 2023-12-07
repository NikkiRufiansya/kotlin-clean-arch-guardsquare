package o;

import java.util.concurrent.FutureTask;
import o.mU;

/* loaded from: classes.dex */
final class nb$MenuHostHelper$$ExternalSyntheticLambda0 extends FutureTask<mE> implements Comparable<nb$MenuHostHelper$$ExternalSyntheticLambda0> {
    private final mE MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(nb$MenuHostHelper$$ExternalSyntheticLambda0 nb_menuhosthelper__externalsyntheticlambda0) {
        nb$MenuHostHelper$$ExternalSyntheticLambda0 nb_menuhosthelper__externalsyntheticlambda02 = nb_menuhosthelper__externalsyntheticlambda0;
        mU.setY sety = this.MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius;
        mU.setY sety2 = nb_menuhosthelper__externalsyntheticlambda02.MenuHostHelper$$ExternalSyntheticLambda0.setChipCornerRadius;
        return sety == sety2 ? this.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled - nb_menuhosthelper__externalsyntheticlambda02.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled : sety2.ordinal() - sety.ordinal();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public nb$MenuHostHelper$$ExternalSyntheticLambda0(mE mEVar) {
        super(mEVar, null);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = mEVar;
    }
}