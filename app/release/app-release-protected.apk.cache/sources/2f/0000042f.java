package o;

/* loaded from: classes.dex */
public enum es$MenuHostHelper$$ExternalSyntheticLambda1 {
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");
    
    private String setUiOptions;

    es$MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        this.setUiOptions = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.setUiOptions;
    }
}