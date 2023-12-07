package o;

import o.AbstractC0210hi;

/* loaded from: classes.dex */
public final class hB implements InterfaceC0209hh {
    private final C0214hm setIconTintList;

    public hB(C0214hm c0214hm) {
        this.setIconTintList = c0214hm;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0210hi<?> MenuHostHelper$$ExternalSyntheticLambda1(C0214hm c0214hm, gS gSVar, hQ<?> hQVar, InterfaceC0206he interfaceC0206he) {
        AbstractC0210hi<?> hHVar;
        Object x = c0214hm.MenuHostHelper$$ExternalSyntheticLambda1(new hQ(interfaceC0206he.setY())).setX();
        if (x instanceof AbstractC0210hi) {
            hHVar = (AbstractC0210hi) x;
        } else if (x instanceof InterfaceC0209hh) {
            hHVar = ((InterfaceC0209hh) x).setIconTintList(gSVar, hQVar);
        } else {
            boolean z = x instanceof InterfaceC0204hc;
            if (z || (x instanceof gU)) {
                hHVar = new hH<>(z ? (InterfaceC0204hc) x : null, x instanceof gU ? (gU) x : null, gSVar, hQVar);
            } else {
                StringBuilder sb = new StringBuilder("Invalid attempt to bind an instance of ");
                sb.append(x.getClass().getName());
                sb.append(" as a @JsonAdapter for ");
                sb.append(hQVar.toString());
                sb.append(". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return (hHVar == null || !interfaceC0206he.setX()) ? hHVar : new AbstractC0210hi.AnonymousClass2();
    }

    @Override // o.InterfaceC0209hh
    public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
        InterfaceC0206he interfaceC0206he = (InterfaceC0206he) hQVar.setIconTintList.getAnnotation(InterfaceC0206he.class);
        if (interfaceC0206he == null) {
            return null;
        }
        return (AbstractC0210hi<T>) MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList, gSVar, hQVar, interfaceC0206he);
    }
}