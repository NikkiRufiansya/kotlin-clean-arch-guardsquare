package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class hE extends AbstractC0210hi<Object> {
    public static final InterfaceC0209hh setX = new InterfaceC0209hh() { // from class: o.hE.5
        @Override // o.InterfaceC0209hh
        public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
            if (hQVar.setIconTintList == Object.class) {
                return new hE(gSVar);
            }
            return null;
        }
    };
    private final gS MenuHostHelper$$ExternalSyntheticLambda0;

    hE(gS gSVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = gSVar;
    }

    /* renamed from: o.hE$2  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;

        static {
            int[] iArr = new int[hO.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
            try {
                iArr[hO.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[hO.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[hO.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[hO.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[hO.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[hO.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    @Override // o.AbstractC0210hi
    public final Object setX(hP hPVar) {
        switch (AnonymousClass2.MenuHostHelper$$ExternalSyntheticLambda0[hPVar.setCenterIfNoTextEnabled().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                hPVar.MenuHostHelper$$ExternalSyntheticLambda0();
                while (hPVar.setUiOptions()) {
                    arrayList.add(setX(hPVar));
                }
                hPVar.setY();
                return arrayList;
            case 2:
                C0218hq c0218hq = new C0218hq();
                hPVar.MenuHostHelper$$ExternalSyntheticLambda1();
                while (hPVar.setUiOptions()) {
                    c0218hq.put(hPVar.setTextAlignment(), setX(hPVar));
                }
                hPVar.setX();
                return c0218hq;
            case 3:
                return hPVar.setIconSize();
            case 4:
                return Double.valueOf(hPVar.setNavigationOnClickListener());
            case 5:
                return Boolean.valueOf(hPVar.setUnboundedRipple());
            case 6:
                hPVar.ViewPager$SavedState$1();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // o.AbstractC0210hi
    public final void setY(hR hRVar, Object obj) {
        if (obj == null) {
            hRVar.setY();
            return;
        }
        AbstractC0210hi MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(new hQ(obj.getClass()));
        if (MenuHostHelper$$ExternalSyntheticLambda1 instanceof hE) {
            hRVar.MenuHostHelper$$ExternalSyntheticLambda1();
            hRVar.setX();
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda1.setY(hRVar, obj);
    }
}