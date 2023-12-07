package o;

/* loaded from: classes.dex */
public final class setLeftEdgeEffectColor extends IllegalStateException {
    private setLeftEdgeEffectColor(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException setX(setAutoSizeTextTypeUniformWithConfiguration<?> setautosizetexttypeuniformwithconfiguration) {
        String str;
        if (!setautosizetexttypeuniformwithconfiguration.setX()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception y = setautosizetexttypeuniformwithconfiguration.setY();
        if (y != null) {
            str = "failure";
        } else if (setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda0()) {
            str = "result ".concat(String.valueOf(String.valueOf(setautosizetexttypeuniformwithconfiguration.MenuHostHelper$$ExternalSyntheticLambda1())));
        } else {
            str = setautosizetexttypeuniformwithconfiguration.setIconTintList() ? "cancellation" : "unknown issue";
        }
        return new setLeftEdgeEffectColor("Complete with: ".concat(str), y);
    }
}