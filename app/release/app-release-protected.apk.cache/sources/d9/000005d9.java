package o;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* renamed from: o.hx  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0225hx<E> extends AbstractC0210hi<Object> {
    public static final InterfaceC0209hh setY = new InterfaceC0209hh() { // from class: o.hx.3
        @Override // o.InterfaceC0209hh
        public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
            Type type = hQVar.setY;
            if ((type instanceof GenericArrayType) || ((type instanceof Class) && ((Class) type).isArray())) {
                Type y = C0213hl.setY(type);
                return new C0225hx(gSVar, gSVar.MenuHostHelper$$ExternalSyntheticLambda1(new hQ<>(y)), C0213hl.MenuHostHelper$$ExternalSyntheticLambda0(y));
            }
            return null;
        }
    };
    private final Class<E> MenuHostHelper$$ExternalSyntheticLambda0;
    private final AbstractC0210hi<E> setX;

    public C0225hx(gS gSVar, AbstractC0210hi<E> abstractC0210hi, Class<E> cls) {
        this.setX = new hL(gSVar, abstractC0210hi, cls);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = cls;
    }

    @Override // o.AbstractC0210hi
    public final Object setX(hP hPVar) {
        if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
            hPVar.ViewPager$SavedState$1();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        hPVar.MenuHostHelper$$ExternalSyntheticLambda0();
        while (hPVar.setUiOptions()) {
            arrayList.add(this.setX.setX(hPVar));
        }
        hPVar.setY();
        int size = arrayList.size();
        Object newInstance = Array.newInstance((Class<?>) this.MenuHostHelper$$ExternalSyntheticLambda0, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC0210hi
    public final void setY(hR hRVar, Object obj) {
        if (obj == null) {
            hRVar.setY();
            return;
        }
        hRVar.MenuHostHelper$$ExternalSyntheticLambda0();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.setX.setY(hRVar, Array.get(obj, i));
        }
        hRVar.setIconTintList();
    }
}