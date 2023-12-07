package o;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class bN$MenuHostHelper$$ExternalSyntheticLambda0 implements InterfaceC0064by<bN$MenuHostHelper$$ExternalSyntheticLambda0> {
    private static final InterfaceC0057br<Object> setIconTintList = new InterfaceC0057br() { // from class: o.bK
        @Override // o.InterfaceC0058bs
        public final void setY(Object obj, InterfaceC0065bz interfaceC0065bz) {
            bN$MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(obj);
        }
    };
    public final Map<Class<?>, InterfaceC0057br<?>> setY = new HashMap();
    public final Map<Class<?>, InterfaceC0063bx<?>> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap();
    public InterfaceC0057br<Object> setX = setIconTintList;

    public static /* synthetic */ void setIconTintList(Object obj) {
        StringBuilder sb = new StringBuilder("Couldn't find encoder for type ");
        sb.append(obj.getClass().getCanonicalName());
        throw new C0060bu(sb.toString());
    }

    @Override // o.InterfaceC0064by
    public final /* synthetic */ bN$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1(Class cls, InterfaceC0057br interfaceC0057br) {
        this.setY.put(cls, interfaceC0057br);
        this.MenuHostHelper$$ExternalSyntheticLambda0.remove(cls);
        return this;
    }
}