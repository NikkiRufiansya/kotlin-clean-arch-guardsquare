package o;

/* renamed from: o.ie  reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0233ie {
    private static final AbstractC0231ic<?> MenuHostHelper$$ExternalSyntheticLambda0 = new C0234ig();
    private static final AbstractC0231ic<?> setX = MenuHostHelper$$ExternalSyntheticLambda1();

    C0233ie() {
    }

    private static AbstractC0231ic<?> MenuHostHelper$$ExternalSyntheticLambda1() {
        try {
            return (AbstractC0231ic) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0231ic<?> setY() {
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0231ic<?> setX() {
        AbstractC0231ic<?> abstractC0231ic = setX;
        if (abstractC0231ic != null) {
            return abstractC0231ic;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}