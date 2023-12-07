package o;

/* renamed from: o.gk  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0185gk implements bJ {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);
    
    private final int setUiOptions;

    EnumC0185gk(int i) {
        this.setUiOptions = i;
    }

    @Override // o.bJ
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setUiOptions;
    }
}