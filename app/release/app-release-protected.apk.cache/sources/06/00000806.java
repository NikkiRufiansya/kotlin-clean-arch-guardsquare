package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class pK implements InterfaceC0410qq<Object>, pL {
    private static final Map<Class<? extends nG<?>>, Integer> MenuHostHelper$$ExternalSyntheticLambda1;
    private final Class<?> setX;

    public pK(Class<?> cls) {
        pN.setY(cls, "");
        this.setX = cls;
    }

    @Override // o.pL
    public final Class<?> setY() {
        return this.setX;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof pK) && pN.MenuHostHelper$$ExternalSyntheticLambda0(C0372pf.setY(this), C0372pf.setY((InterfaceC0410qq) obj));
    }

    public final int hashCode() {
        return C0372pf.setY(this).hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setX.toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }

    static {
        int i = 0;
        new pK$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
        List x = C0348oi.setX(InterfaceC0376pj.class, InterfaceC0377pk.class, InterfaceC0389pw.class, pB.class, pA.class, InterfaceC0392pz.class, InterfaceC0391py.class, pD.class, pC.class, pE.class, InterfaceC0379pm.class, InterfaceC0375pi.class, InterfaceC0378pl.class, InterfaceC0383pq.class, InterfaceC0384pr.class, InterfaceC0381po.class, InterfaceC0380pn.class, InterfaceC0382pp.class, InterfaceC0388pv.class, InterfaceC0387pu.class, InterfaceC0385ps.class, InterfaceC0386pt.class, InterfaceC0390px.class);
        pN.setY(x, "");
        ArrayList arrayList = new ArrayList(x instanceof Collection ? x.size() : 10);
        for (Object obj : x) {
            if (i >= 0) {
                arrayList.add(new nT((Class) obj, Integer.valueOf(i)));
                i++;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda1 = C0362ow.setIconTintList(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) values, "");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) str, "");
            sb.append(qR.setIconTintList(str, '.', str));
            sb.append("CompanionObject");
            String obj2 = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(".Companion");
            nT nTVar = new nT(obj2, sb2.toString());
            hashMap3.put(nTVar.MenuHostHelper$$ExternalSyntheticLambda0, nTVar.setX);
        }
        HashMap hashMap4 = hashMap3;
        for (Map.Entry<Class<? extends nG<?>>, Integer> entry : MenuHostHelper$$ExternalSyntheticLambda1.entrySet()) {
            int intValue = entry.getValue().intValue();
            String name = entry.getKey().getName();
            StringBuilder sb3 = new StringBuilder("kotlin.Function");
            sb3.append(intValue);
            hashMap3.put(name, sb3.toString());
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C0362ow.setX(hashMap4.size()));
        for (Map.Entry entry2 : hashMap4.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, qR.setIconTintList(str2, '.', str2));
        }
    }
}