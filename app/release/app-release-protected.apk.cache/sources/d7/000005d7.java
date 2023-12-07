package o;

import java.lang.reflect.Type;
import java.util.Collection;

/* renamed from: o.hw  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0224hw implements InterfaceC0209hh {
    private final C0214hm setIconTintList;

    public C0224hw(C0214hm c0214hm) {
        this.setIconTintList = c0214hm;
    }

    /* renamed from: o.hw$setX */
    /* loaded from: classes.dex */
    static final class setX<E> extends AbstractC0210hi<Collection<E>> {
        private final InterfaceC0217hp<? extends Collection<E>> setIconTintList;
        private final AbstractC0210hi<E> setX;

        @Override // o.AbstractC0210hi
        public final /* synthetic */ void setY(hR hRVar, Object obj) {
            Collection<E> collection = (Collection) obj;
            if (collection == null) {
                hRVar.setY();
                return;
            }
            hRVar.MenuHostHelper$$ExternalSyntheticLambda0();
            for (E e : collection) {
                this.setX.setY(hRVar, e);
            }
            hRVar.setIconTintList();
        }

        public setX(gS gSVar, Type type, AbstractC0210hi<E> abstractC0210hi, InterfaceC0217hp<? extends Collection<E>> interfaceC0217hp) {
            this.setX = new hL(gSVar, abstractC0210hi, type);
            this.setIconTintList = interfaceC0217hp;
        }

        @Override // o.AbstractC0210hi
        public final /* synthetic */ Object setX(hP hPVar) {
            if (hPVar.setCenterIfNoTextEnabled() == hO.NULL) {
                hPVar.ViewPager$SavedState$1();
                return null;
            }
            Collection<E> x = this.setIconTintList.setX();
            hPVar.MenuHostHelper$$ExternalSyntheticLambda0();
            while (hPVar.setUiOptions()) {
                x.add(this.setX.setX(hPVar));
            }
            hPVar.setY();
            return x;
        }
    }

    @Override // o.InterfaceC0209hh
    public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
        Type type = hQVar.setY;
        Class<? super T> cls = hQVar.setIconTintList;
        if (Collection.class.isAssignableFrom(cls)) {
            Type x = C0213hl.setX(type, (Class<?>) cls);
            return new setX(gSVar, x, gSVar.MenuHostHelper$$ExternalSyntheticLambda1(new hQ<>(x)), this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1(hQVar));
        }
        return null;
    }
}