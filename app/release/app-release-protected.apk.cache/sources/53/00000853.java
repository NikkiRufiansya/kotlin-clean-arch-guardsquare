package o;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class qQ {
    public static Charset MenuHostHelper$$ExternalSyntheticLambda1;
    public static final Charset setIconTintList;
    public static final qQ setX = new qQ();
    public static Charset setY;

    private qQ() {
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) forName, "");
        setIconTintList = forName;
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) Charset.forName("UTF-16"), "");
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) Charset.forName("UTF-16BE"), "");
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) Charset.forName("UTF-16LE"), "");
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) Charset.forName("US-ASCII"), "");
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) Charset.forName("ISO-8859-1"), "");
    }
}