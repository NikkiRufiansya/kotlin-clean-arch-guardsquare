package o;

/* JADX INFO: Access modifiers changed from: protected */
/* loaded from: classes.dex */
public final class cZ$MenuHostHelper$$ExternalSyntheticLambda0 extends AbstractC0095db<Boolean> {
    private static cZ$MenuHostHelper$$ExternalSyntheticLambda0 setX;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0095db
    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return "experiment_app_start_ttid";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0095db
    public final String l_() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.AbstractC0095db
    public final String m_() {
        return "fpr_experiment_app_start_ttid";
    }

    private cZ$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static cZ$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList() {
        cZ$MenuHostHelper$$ExternalSyntheticLambda0 cz_menuhosthelper__externalsyntheticlambda0;
        synchronized (cZ$MenuHostHelper$$ExternalSyntheticLambda0.class) {
            if (setX == null) {
                setX = new cZ$MenuHostHelper$$ExternalSyntheticLambda0();
            }
            cz_menuhosthelper__externalsyntheticlambda0 = setX;
        }
        return cz_menuhosthelper__externalsyntheticlambda0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Boolean setX() {
        return Boolean.FALSE;
    }
}