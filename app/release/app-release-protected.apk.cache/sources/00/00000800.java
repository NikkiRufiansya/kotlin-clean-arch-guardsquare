package o;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class pF implements InterfaceC0411qr, Serializable {
    public static final Object setIconTintList = setX.MenuHostHelper$$ExternalSyntheticLambda0;
    private final Class MenuHostHelper$$ExternalSyntheticLambda0;
    private final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setUiOptions;
    private transient InterfaceC0411qr setUnboundedRipple;
    public final Object setX;
    private final String setY;

    protected abstract InterfaceC0411qr MenuHostHelper$$ExternalSyntheticLambda0();

    /* loaded from: classes.dex */
    static class setX implements Serializable {
        private static final setX MenuHostHelper$$ExternalSyntheticLambda0 = new setX();

        private setX() {
        }

        private Object readResolve() {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    public pF() {
        this(setIconTintList);
    }

    private pF(Object obj) {
        this(obj, null, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public pF(Object obj, Class cls, String str, String str2, boolean z) {
        this.setX = obj;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = cls;
        this.setY = str;
        this.setUiOptions = str2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
    }

    public final Object setY() {
        return this.setX;
    }

    public final InterfaceC0411qr setX() {
        InterfaceC0411qr interfaceC0411qr = this.setUnboundedRipple;
        if (interfaceC0411qr == null) {
            InterfaceC0411qr MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
            this.setUnboundedRipple = MenuHostHelper$$ExternalSyntheticLambda0;
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return interfaceC0411qr;
    }

    public final InterfaceC0418qy setLayoutAnimation() {
        Class cls = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (cls == null) {
            return null;
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1 ? C0394qa.MenuHostHelper$$ExternalSyntheticLambda1(cls) : C0394qa.setY(cls);
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY;
    }

    public final String setUnboundedRipple() {
        return this.setUiOptions;
    }

    @Override // o.InterfaceC0411qr
    public final Object setY(Object... objArr) {
        return setUiOptions().setY(objArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public InterfaceC0411qr setUiOptions() {
        InterfaceC0411qr interfaceC0411qr = this.setUnboundedRipple;
        if (interfaceC0411qr == null) {
            interfaceC0411qr = MenuHostHelper$$ExternalSyntheticLambda0();
            this.setUnboundedRipple = interfaceC0411qr;
        }
        if (interfaceC0411qr != this) {
            return interfaceC0411qr;
        }
        throw new C0373pg();
    }
}