package o;

import java.lang.Object;
import o.AbstractC0239il;
import o.il$MenuHostHelper$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public abstract class il$MenuHostHelper$$ExternalSyntheticLambda0<MessageType extends il$MenuHostHelper$$ExternalSyntheticLambda0<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends AbstractC0239il<MessageType, BuilderType> implements InterfaceC0242io<MessageType, BuilderType> {
    protected C0237ij<AbstractC0239il.setX> extensions = C0237ij.setX();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C0237ij<AbstractC0239il.setX> setX() {
        if (this.extensions.setX) {
            this.extensions = this.extensions.clone();
        }
        return this.extensions;
    }
}