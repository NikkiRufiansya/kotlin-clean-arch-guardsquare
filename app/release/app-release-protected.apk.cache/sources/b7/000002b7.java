package o;

import o.InterfaceC0071ce;

/* loaded from: classes.dex */
public final class aJ<T> implements InterfaceC0073cg<T>, InterfaceC0071ce<T> {
    private static final InterfaceC0071ce.setIconTintList<Object> MenuHostHelper$$ExternalSyntheticLambda0 = new InterfaceC0071ce.setIconTintList() { // from class: o.aH
        @Override // o.InterfaceC0071ce.setIconTintList
        public final void MenuHostHelper$$ExternalSyntheticLambda0() {
            aJ.setY();
        }
    };
    static final InterfaceC0073cg<Object> setY = new InterfaceC0073cg() { // from class: o.aI
        @Override // o.InterfaceC0073cg
        public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
            return aJ.setIconTintList();
        }
    };
    InterfaceC0071ce.setIconTintList<T> setIconTintList;
    volatile InterfaceC0073cg<T> setX;

    public static /* synthetic */ Object setIconTintList() {
        return null;
    }

    public static /* synthetic */ void setY() {
    }

    private aJ(InterfaceC0071ce.setIconTintList<T> seticontintlist, InterfaceC0073cg<T> interfaceC0073cg) {
        this.setIconTintList = seticontintlist;
        this.setX = interfaceC0073cg;
    }

    public static <T> aJ<T> MenuHostHelper$$ExternalSyntheticLambda1() {
        return new aJ<>(MenuHostHelper$$ExternalSyntheticLambda0, setY);
    }

    @Override // o.InterfaceC0073cg
    public final T MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
    }
}