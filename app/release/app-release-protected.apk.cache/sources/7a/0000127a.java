package o;

import java.util.List;

/* loaded from: classes.dex */
public interface wE {
    public static final wE setY;

    void MenuHostHelper$$ExternalSyntheticLambda0(EnumC0584wx enumC0584wx);

    boolean MenuHostHelper$$ExternalSyntheticLambda0(List<C0581wu> list);

    boolean setIconTintList(List<C0581wu> list);

    boolean setIconTintList(InterfaceC0607xr interfaceC0607xr, int i);

    /* loaded from: classes.dex */
    public static final class setIconTintList {
        private setIconTintList() {
        }

        public /* synthetic */ setIconTintList(byte b) {
            this();
        }

        /* loaded from: classes.dex */
        static final class setY implements wE {
            @Override // o.wE
            public final void MenuHostHelper$$ExternalSyntheticLambda0(EnumC0584wx enumC0584wx) {
                pN.setY(enumC0584wx, "");
            }

            @Override // o.wE
            public final boolean MenuHostHelper$$ExternalSyntheticLambda0(List<C0581wu> list) {
                pN.setY(list, "");
                return true;
            }

            @Override // o.wE
            public final boolean setIconTintList(List<C0581wu> list) {
                pN.setY(list, "");
                return true;
            }

            @Override // o.wE
            public final boolean setIconTintList(InterfaceC0607xr interfaceC0607xr, int i) {
                pN.setY(interfaceC0607xr, "");
                interfaceC0607xr.setOnLongClickListener(i);
                return true;
            }
        }
    }

    static {
        new setIconTintList((byte) 0);
        setY = new setIconTintList.setY();
    }
}