package o;

/* renamed from: o.gu  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0195gu implements bJ {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);
    
    private final int setLayoutAnimation;

    EnumC0195gu(int i) {
        this.setLayoutAnimation = i;
    }

    @Override // o.bJ
    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setLayoutAnimation;
    }
}