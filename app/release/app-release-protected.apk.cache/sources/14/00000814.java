package o;

/* loaded from: classes.dex */
public final class pX {
    public static String MenuHostHelper$$ExternalSyntheticLambda0(pJ pJVar) {
        String obj = pJVar.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}