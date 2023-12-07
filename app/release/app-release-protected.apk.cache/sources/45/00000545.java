package o;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class hA implements InterfaceC0209hh {
    private final C0214hm MenuHostHelper$$ExternalSyntheticLambda0;
    final boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;

    public hA(C0214hm c0214hm, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0214hm;
    }

    /* loaded from: classes.dex */
    final class setIconTintList<K, V> extends AbstractC0210hi<Map<K, V>> {
        private final AbstractC0210hi<V> MenuHostHelper$$ExternalSyntheticLambda0;
        private final InterfaceC0217hp<? extends Map<K, V>> setX;
        private final AbstractC0210hi<K> setY;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.AbstractC0210hi
        public final /* synthetic */ void setY(hR hRVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                hRVar.setY();
            } else if (!hA.this.MenuHostHelper$$ExternalSyntheticLambda1) {
                hRVar.MenuHostHelper$$ExternalSyntheticLambda1();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    hRVar.setIconTintList(String.valueOf(entry.getKey()));
                    this.MenuHostHelper$$ExternalSyntheticLambda0.setY(hRVar, entry.getValue());
                }
                hRVar.setX();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    gV x = this.setY.setX((AbstractC0210hi<K>) entry2.getKey());
                    arrayList.add(x);
                    arrayList2.add(entry2.getValue());
                    z |= (x instanceof gX) || (x instanceof gZ);
                }
                if (z) {
                    hRVar.MenuHostHelper$$ExternalSyntheticLambda0();
                    int size = arrayList.size();
                    while (i < size) {
                        hRVar.MenuHostHelper$$ExternalSyntheticLambda0();
                        hI.setTextScaleX.setY(hRVar, (gV) arrayList.get(i));
                        this.MenuHostHelper$$ExternalSyntheticLambda0.setY(hRVar, arrayList2.get(i));
                        hRVar.setIconTintList();
                        i++;
                    }
                    hRVar.setIconTintList();
                    return;
                }
                hRVar.MenuHostHelper$$ExternalSyntheticLambda1();
                int size2 = arrayList.size();
                while (i < size2) {
                    gV gVVar = (gV) arrayList.get(i);
                    if (gVVar instanceof C0202ha) {
                        C0202ha unboundedRipple = gVVar.setUnboundedRipple();
                        if (unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Number) {
                            str = String.valueOf(unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0());
                        } else if (unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0 instanceof Boolean) {
                            str = Boolean.toString(unboundedRipple.setIconTintList());
                        } else if (unboundedRipple.MenuHostHelper$$ExternalSyntheticLambda0 instanceof String) {
                            str = unboundedRipple.setOnLongClickListener();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (!(gVVar instanceof gW)) {
                        throw new AssertionError();
                    } else {
                        str = "null";
                    }
                    hRVar.setIconTintList(str);
                    this.MenuHostHelper$$ExternalSyntheticLambda0.setY(hRVar, arrayList2.get(i));
                    i++;
                }
                hRVar.setX();
            }
        }

        public setIconTintList(gS gSVar, Type type, AbstractC0210hi<K> abstractC0210hi, Type type2, AbstractC0210hi<V> abstractC0210hi2, InterfaceC0217hp<? extends Map<K, V>> interfaceC0217hp) {
            this.setY = new hL(gSVar, abstractC0210hi, type);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new hL(gSVar, abstractC0210hi2, type2);
            this.setX = interfaceC0217hp;
        }

        @Override // o.AbstractC0210hi
        public final /* synthetic */ Object setX(hP hPVar) {
            hO centerIfNoTextEnabled = hPVar.setCenterIfNoTextEnabled();
            if (centerIfNoTextEnabled == hO.NULL) {
                hPVar.ViewPager$SavedState$1();
                return null;
            }
            Map<K, V> x = this.setX.setX();
            if (centerIfNoTextEnabled == hO.BEGIN_ARRAY) {
                hPVar.MenuHostHelper$$ExternalSyntheticLambda0();
                while (hPVar.setUiOptions()) {
                    hPVar.MenuHostHelper$$ExternalSyntheticLambda0();
                    K x2 = this.setY.setX(hPVar);
                    if (x.put(x2, this.MenuHostHelper$$ExternalSyntheticLambda0.setX(hPVar)) != null) {
                        StringBuilder sb = new StringBuilder("duplicate key: ");
                        sb.append(x2);
                        throw new C0203hb(sb.toString());
                    }
                    hPVar.setY();
                }
                hPVar.setY();
            } else {
                hPVar.MenuHostHelper$$ExternalSyntheticLambda1();
                while (hPVar.setUiOptions()) {
                    AbstractC0219hr.setIconTintList.setIconTintList(hPVar);
                    K x3 = this.setY.setX(hPVar);
                    if (x.put(x3, this.MenuHostHelper$$ExternalSyntheticLambda0.setX(hPVar)) != null) {
                        StringBuilder sb2 = new StringBuilder("duplicate key: ");
                        sb2.append(x3);
                        throw new C0203hb(sb2.toString());
                    }
                }
                hPVar.setX();
            }
            return x;
        }
    }

    @Override // o.InterfaceC0209hh
    public final <T> AbstractC0210hi<T> setIconTintList(gS gSVar, hQ<T> hQVar) {
        AbstractC0210hi<Boolean> abstractC0210hi;
        Type type = hQVar.setY;
        if (Map.class.isAssignableFrom(hQVar.setIconTintList)) {
            Type[] MenuHostHelper$$ExternalSyntheticLambda1 = C0213hl.MenuHostHelper$$ExternalSyntheticLambda1(type, C0213hl.MenuHostHelper$$ExternalSyntheticLambda0(type));
            Type type2 = MenuHostHelper$$ExternalSyntheticLambda1[0];
            if (type2 == Boolean.TYPE || type2 == Boolean.class) {
                abstractC0210hi = hI.setLayoutAnimation;
            } else {
                abstractC0210hi = gSVar.MenuHostHelper$$ExternalSyntheticLambda1(new hQ<>(type2));
            }
            AbstractC0210hi<T> MenuHostHelper$$ExternalSyntheticLambda12 = gSVar.MenuHostHelper$$ExternalSyntheticLambda1(new hQ<>(MenuHostHelper$$ExternalSyntheticLambda1[1]));
            InterfaceC0217hp<T> MenuHostHelper$$ExternalSyntheticLambda13 = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(hQVar);
            return new setIconTintList(gSVar, MenuHostHelper$$ExternalSyntheticLambda1[0], abstractC0210hi, MenuHostHelper$$ExternalSyntheticLambda1[1], MenuHostHelper$$ExternalSyntheticLambda12, MenuHostHelper$$ExternalSyntheticLambda13);
        }
        return null;
    }
}