package o;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o.InterfaceC0071ce;
import o.aL;

/* renamed from: o.au */
/* loaded from: classes.dex */
public final class C0033au implements InterfaceC0025am, InterfaceC0054bo {
    private static final InterfaceC0073cg<Set<Object>> MenuHostHelper$$ExternalSyntheticLambda1 = new InterfaceC0073cg() { // from class: o.as
        @Override // o.InterfaceC0073cg
        public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
            return Collections.emptySet();
        }
    };
    private final AtomicReference<Boolean> MenuHostHelper$$ExternalSyntheticLambda0;
    private final aD setIconTintList;
    private final Map<aL<?>, InterfaceC0073cg<?>> setLayoutAnimation;
    private final Map<aL<?>, aC<?>> setNavigationOnClickListener;
    private final List<InterfaceC0073cg<com.google.firebase.components.ComponentRegistrar>> setOnLongClickListener;
    private Set<String> setUiOptions;
    private final InterfaceC0029aq setX;
    private final Map<C0024al<?>, InterfaceC0073cg<?>> setY;

    public /* synthetic */ C0033au(Executor executor, Iterable iterable, Collection collection, InterfaceC0029aq interfaceC0029aq, byte b) {
        this(executor, iterable, collection, interfaceC0029aq);
    }

    public static setY setY(Executor executor) {
        return new setY(executor);
    }

    private C0033au(Executor executor, Iterable<InterfaceC0073cg<com.google.firebase.components.ComponentRegistrar>> iterable, Collection<C0024al<?>> collection, InterfaceC0029aq interfaceC0029aq) {
        this.setY = new HashMap();
        this.setLayoutAnimation = new HashMap();
        this.setNavigationOnClickListener = new HashMap();
        this.setUiOptions = new HashSet();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new AtomicReference<>();
        aD aDVar = new aD(executor);
        this.setIconTintList = aDVar;
        this.setX = interfaceC0029aq;
        ArrayList<C0024al<?>> arrayList = new ArrayList();
        arrayList.add(C0024al.setY(aDVar, aD.class, bT.class, bQ.class));
        arrayList.add(C0024al.setY(this, InterfaceC0054bo.class, new Class[0]));
        for (C0024al<?> c0024al : collection) {
            if (c0024al != null) {
                arrayList.add(c0024al);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC0073cg<com.google.firebase.components.ComponentRegistrar> interfaceC0073cg : iterable) {
            arrayList2.add(interfaceC0073cg);
        }
        this.setOnLongClickListener = arrayList2;
        ArrayList<Runnable> arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator<InterfaceC0073cg<com.google.firebase.components.ComponentRegistrar>> it = this.setOnLongClickListener.iterator();
            while (it.hasNext()) {
                try {
                    com.google.firebase.components.ComponentRegistrar MenuHostHelper$$ExternalSyntheticLambda0 = it.next().MenuHostHelper$$ExternalSyntheticLambda0();
                    if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                        arrayList.addAll(this.setX.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0));
                        it.remove();
                    }
                } catch (aG e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C0024al) it2.next()).MenuHostHelper$$ExternalSyntheticLambda1.toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.setUiOptions.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.setUiOptions.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.setY.isEmpty()) {
                aA.MenuHostHelper$$ExternalSyntheticLambda0(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.setY.keySet());
                arrayList4.addAll(arrayList);
                aA.MenuHostHelper$$ExternalSyntheticLambda0(arrayList4);
            }
            for (final C0024al<?> c0024al2 : arrayList) {
                this.setY.put(c0024al2, new aF(new InterfaceC0073cg() { // from class: o.av
                    @Override // o.InterfaceC0073cg
                    public final Object MenuHostHelper$$ExternalSyntheticLambda0() {
                        C0033au c0033au = C0033au.this;
                        C0024al c0024al3 = c0024al2;
                        return c0024al3.MenuHostHelper$$ExternalSyntheticLambda0.setX(new aP(c0024al3, c0033au));
                    }
                }));
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C0024al c0024al3 = (C0024al) it3.next();
                if (c0024al3.setOnLongClickListener == 0) {
                    final InterfaceC0073cg<?> interfaceC0073cg2 = this.setY.get(c0024al3);
                    Iterator it4 = c0024al3.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
                    while (it4.hasNext()) {
                        aL<?> aLVar = (aL) it4.next();
                        if (!this.setLayoutAnimation.containsKey(aLVar)) {
                            this.setLayoutAnimation.put(aLVar, interfaceC0073cg2);
                        } else {
                            final aJ aJVar = (aJ) this.setLayoutAnimation.get(aLVar);
                            arrayList5.add(new Runnable() { // from class: o.aw
                                @Override // java.lang.Runnable
                                public final void run() {
                                    C0033au.MenuHostHelper$$ExternalSyntheticLambda1(aJ.this, interfaceC0073cg2);
                                }
                            });
                        }
                    }
                }
            }
            arrayList3.addAll(arrayList5);
            ArrayList arrayList6 = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Map.Entry<C0024al<?>, InterfaceC0073cg<?>> entry : this.setY.entrySet()) {
                C0024al<?> key = entry.getKey();
                if (!(key.setOnLongClickListener == 0)) {
                    InterfaceC0073cg<?> value = entry.getValue();
                    for (aL<? super Object> aLVar2 : key.MenuHostHelper$$ExternalSyntheticLambda1) {
                        if (!hashMap.containsKey(aLVar2)) {
                            hashMap.put(aLVar2, new HashSet());
                        }
                        ((Set) hashMap.get(aLVar2)).add(value);
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (!this.setNavigationOnClickListener.containsKey(entry2.getKey())) {
                    this.setNavigationOnClickListener.put((aL) entry2.getKey(), new aC<>((Set) ((Collection) entry2.getValue())));
                } else {
                    final aC<?> aCVar = this.setNavigationOnClickListener.get(entry2.getKey());
                    for (final InterfaceC0073cg interfaceC0073cg3 : (Set) entry2.getValue()) {
                        arrayList6.add(new Runnable() { // from class: o.at
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0033au.setY(aC.this, interfaceC0073cg3);
                            }
                        });
                    }
                }
            }
            arrayList3.addAll(arrayList6);
            for (C0024al<?> c0024al4 : this.setY.keySet()) {
                for (C0037ay c0037ay : c0024al4.setX) {
                    if ((c0037ay.MenuHostHelper$$ExternalSyntheticLambda0 == 2) && !this.setNavigationOnClickListener.containsKey(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1)) {
                        this.setNavigationOnClickListener.put(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1, new aC<>(Collections.emptySet()));
                    } else if (this.setLayoutAnimation.containsKey(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1)) {
                        continue;
                    } else {
                        if (c0037ay.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
                            throw new aK(String.format("Unsatisfied dependency for component %s: %s", c0024al4, c0037ay.MenuHostHelper$$ExternalSyntheticLambda1));
                        }
                        if (!(c0037ay.MenuHostHelper$$ExternalSyntheticLambda0 == 2)) {
                            this.setLayoutAnimation.put(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1, aJ.MenuHostHelper$$ExternalSyntheticLambda1());
                        }
                    }
                }
            }
        }
        for (Runnable runnable : arrayList3) {
            runnable.run();
        }
        Boolean bool = this.MenuHostHelper$$ExternalSyntheticLambda0.get();
        if (bool != null) {
            setY(this.setY, bool.booleanValue());
        }
    }

    public static /* synthetic */ void setY(aC aCVar, InterfaceC0073cg interfaceC0073cg) {
        synchronized (aCVar) {
            if (aCVar.setY == null) {
                aCVar.MenuHostHelper$$ExternalSyntheticLambda1.add(interfaceC0073cg);
            } else {
                aCVar.setY.add(interfaceC0073cg.MenuHostHelper$$ExternalSyntheticLambda0());
            }
        }
    }

    @Override // o.InterfaceC0025am
    public final <T> InterfaceC0073cg<T> MenuHostHelper$$ExternalSyntheticLambda0(aL<T> aLVar) {
        InterfaceC0073cg<T> interfaceC0073cg;
        synchronized (this) {
            if (aLVar != null) {
                interfaceC0073cg = (InterfaceC0073cg<T>) this.setLayoutAnimation.get(aLVar);
            } else {
                throw new NullPointerException("Null interface requested.");
            }
        }
        return interfaceC0073cg;
    }

    @Override // o.InterfaceC0025am
    public final <T> InterfaceC0073cg<Set<T>> MenuHostHelper$$ExternalSyntheticLambda1(aL<T> aLVar) {
        synchronized (this) {
            aC<?> aCVar = this.setNavigationOnClickListener.get(aLVar);
            if (aCVar != null) {
                return aCVar;
            }
            return (InterfaceC0073cg<Set<T>>) MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        boolean z2;
        HashMap hashMap;
        AtomicReference<Boolean> atomicReference = this.MenuHostHelper$$ExternalSyntheticLambda0;
        Boolean valueOf = Boolean.valueOf(z);
        while (true) {
            if (!atomicReference.compareAndSet(null, valueOf)) {
                if (atomicReference.get() != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (z2) {
            synchronized (this) {
                hashMap = new HashMap(this.setY);
            }
            setY(hashMap, z);
        }
    }

    private void setY(Map<C0024al<?>, InterfaceC0073cg<?>> map, boolean z) {
        for (Map.Entry<C0024al<?>, InterfaceC0073cg<?>> entry : map.entrySet()) {
            C0024al<?> key = entry.getKey();
            InterfaceC0073cg<?> value = entry.getValue();
            if (!(key.setY == 1)) {
                if ((key.setY == 2) && z) {
                }
            }
            value.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        this.setIconTintList.setY();
    }

    /* renamed from: o.au$setY */
    /* loaded from: classes.dex */
    public static final class setY {
        public final Executor MenuHostHelper$$ExternalSyntheticLambda0;
        public final List<InterfaceC0073cg<com.google.firebase.components.ComponentRegistrar>> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList();
        public final List<C0024al<?>> setIconTintList = new ArrayList();
        public InterfaceC0029aq setX = InterfaceC0029aq.MenuHostHelper$$ExternalSyntheticLambda1;

        setY(Executor executor) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = executor;
        }
    }

    public static /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(aJ aJVar, InterfaceC0073cg interfaceC0073cg) {
        InterfaceC0071ce.setIconTintList<T> seticontintlist;
        if (aJVar.setX != aJ.setY) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (aJVar) {
            seticontintlist = aJVar.setIconTintList;
            aJVar.setIconTintList = null;
            aJVar.setX = interfaceC0073cg;
        }
        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.InterfaceC0025am
    public final /* synthetic */ Object setY(aL aLVar) {
        InterfaceC0073cg MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(aLVar);
        if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
            return null;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.InterfaceC0025am
    public final /* synthetic */ Object setY(Class cls) {
        return setY(new aL(aL.setX.class, cls));
    }

    @Override // o.InterfaceC0025am
    public final /* synthetic */ InterfaceC0073cg MenuHostHelper$$ExternalSyntheticLambda1(Class cls) {
        return MenuHostHelper$$ExternalSyntheticLambda0(new aL(aL.setX.class, cls));
    }

    @Override // o.InterfaceC0025am
    public final /* synthetic */ Set setIconTintList(aL aLVar) {
        return (Set) MenuHostHelper$$ExternalSyntheticLambda1(aLVar).MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.InterfaceC0025am
    public final /* synthetic */ Set setIconTintList(Class cls) {
        return setIconTintList(new aL(aL.setX.class, cls));
    }
}