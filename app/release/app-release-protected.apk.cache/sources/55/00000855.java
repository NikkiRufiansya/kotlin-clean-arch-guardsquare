package o;

/* loaded from: classes.dex */
public class qS {
    public static final <T> void MenuHostHelper$$ExternalSyntheticLambda0(Appendable appendable, T t, InterfaceC0377pk<? super T, ? extends CharSequence> interfaceC0377pk) {
        pN.setY(appendable, "");
        if (interfaceC0377pk != null) {
            appendable.append(interfaceC0377pk.setX(t));
            return;
        }
        if (t == null ? true : t instanceof CharSequence) {
            appendable.append((CharSequence) t);
        } else if (t instanceof Character) {
            appendable.append(((Character) t).charValue());
        } else {
            appendable.append(String.valueOf(t));
        }
    }
}