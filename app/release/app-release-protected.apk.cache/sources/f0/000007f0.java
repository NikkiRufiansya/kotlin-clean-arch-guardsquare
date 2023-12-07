package o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* renamed from: o.or */
/* loaded from: classes.dex */
public class C0357or extends C0356oq {

    /* renamed from: o.or$setX */
    /* loaded from: classes.dex */
    public static final class setX<T> implements qC<T> {
        private /* synthetic */ Iterable setY;

        public setX(Iterable iterable) {
            this.setY = iterable;
        }

        @Override // o.qC
        public final Iterator<T> MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setY.iterator();
        }
    }

    public static final <T> T setIconTintList(List<? extends T> list) {
        pN.setY(list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static final <T> T setX(List<? extends T> list) {
        pN.setY(list, "");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        pN.setY(list, "");
        return list.get(list.size() - 1);
    }

    public static final <T> T MenuHostHelper$$ExternalSyntheticLambda1(Iterable<? extends T> iterable) {
        pN.setY(iterable, "");
        if (!(iterable instanceof List)) {
            Iterator<? extends T> it = iterable.iterator();
            if (!it.hasNext()) {
                throw new NoSuchElementException("Collection is empty.");
            }
            T next = it.next();
            if (it.hasNext()) {
                throw new IllegalArgumentException("Collection has more than one element.");
            }
            return next;
        }
        List list = (List) iterable;
        pN.setY(list, "");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return (T) list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    public static final <T> List<T> MenuHostHelper$$ExternalSyntheticLambda1(List<? extends T> list) {
        Object next;
        pN.setY(list, "");
        List<? extends T> list2 = list;
        int size = list.size() - 1;
        int i = 0;
        if (size < 0) {
            size = 0;
        }
        pN.setY(list2, "");
        if (!(size >= 0)) {
            StringBuilder sb = new StringBuilder("Requested element count ");
            sb.append(size);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (size != 0) {
            if (list2 instanceof Collection) {
                if (size >= list2.size()) {
                    return C0348oi.setX((Iterable) list2);
                }
                if (size == 1) {
                    pN.setY(list2, "");
                    if (list2 instanceof List) {
                        next = C0348oi.setIconTintList((List<? extends Object>) list2);
                    } else {
                        Iterator<T> it = list2.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException("Collection is empty.");
                        }
                        next = it.next();
                    }
                    List<T> singletonList = Collections.singletonList(next);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonList, "");
                    return singletonList;
                }
            }
            ArrayList arrayList = new ArrayList(size);
            for (T t : list2) {
                arrayList.add(t);
                i++;
                if (i == size) {
                    break;
                }
            }
            return C0348oi.MenuHostHelper$$ExternalSyntheticLambda0((List) arrayList);
        } else {
            return C0358os.setIconTintList;
        }
    }

    public static final <T, C extends Collection<? super T>> C setIconTintList(Iterable<? extends T> iterable, C c) {
        pN.setY(iterable, "");
        pN.setY(c, "");
        for (T t : iterable) {
            c.add(t);
        }
        return c;
    }

    public static final <T> List<T> setX(Iterable<? extends T> iterable) {
        pN.setY(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    pN.setY(collection, "");
                    return new ArrayList(collection);
                }
                List<T> singletonList = Collections.singletonList(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singletonList, "");
                return singletonList;
            }
            return C0358os.setIconTintList;
        }
        return C0348oi.MenuHostHelper$$ExternalSyntheticLambda0(C0348oi.setY(iterable));
    }

    public static final <T> List<T> setY(Iterable<? extends T> iterable) {
        pN.setY(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            pN.setY(collection, "");
            return new ArrayList(collection);
        }
        return (List) C0348oi.setIconTintList(iterable, new ArrayList());
    }

    public static final <T> List<T> setX(Collection<? extends T> collection) {
        pN.setY(collection, "");
        return new ArrayList(collection);
    }

    public static final <T> Set<T> setUnboundedRipple(Iterable<? extends T> iterable) {
        pN.setY(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    return (Set) C0348oi.setIconTintList(iterable, new LinkedHashSet(C0362ow.setX(collection.size())));
                }
                Set<T> singleton = Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singleton, "");
                return singleton;
            }
            return C0363ox.setY;
        }
        Set<T> set = (Set) C0348oi.setIconTintList(iterable, new LinkedHashSet());
        pN.setY(set, "");
        int size2 = set.size();
        if (size2 != 0) {
            if (size2 == 1) {
                Set<T> singleton2 = Collections.singleton(set.iterator().next());
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) singleton2, "");
                return singleton2;
            }
            return set;
        }
        return C0363ox.setY;
    }

    public static final <T extends Comparable<? super T>> T setIconTintList(Iterable<? extends T> iterable) {
        pN.setY(iterable, "");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (next.compareTo(next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        return null;
    }

    public static final <T> List<T> setIconTintList(Collection<? extends T> collection, T t) {
        pN.setY(collection, "");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    public static final <T> List<T> setX(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        pN.setY(collection, "");
        pN.setY(iterable, "");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C0348oi.setY(arrayList2, iterable);
        return arrayList2;
    }

    public static final <T, A extends Appendable> A setIconTintList(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, InterfaceC0377pk<? super T, ? extends CharSequence> interfaceC0377pk) {
        pN.setY(iterable, "");
        pN.setY(a, "");
        pN.setY(charSequence, "");
        pN.setY(charSequence2, "");
        pN.setY(charSequence3, "");
        pN.setY(charSequence4, "");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            qR.MenuHostHelper$$ExternalSyntheticLambda0(a, t, interfaceC0377pk);
        }
        a.append(charSequence3);
        return a;
    }

    public static /* synthetic */ String MenuHostHelper$$ExternalSyntheticLambda0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, InterfaceC0377pk interfaceC0377pk) {
        pN.setY(iterable, "");
        pN.setY(charSequence, "");
        pN.setY(charSequence2, "");
        pN.setY(charSequence3, "");
        pN.setY(r7, "");
        String obj = ((StringBuilder) C0348oi.setIconTintList(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, -1, r7, interfaceC0377pk)).toString();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
        return obj;
    }

    public static final <T> qC<T> MenuHostHelper$$ExternalSyntheticLambda0(Iterable<? extends T> iterable) {
        pN.setY(iterable, "");
        return new setX(iterable);
    }

    public static final <T, R> List<nT<T, R>> MenuHostHelper$$ExternalSyntheticLambda0(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        pN.setY(iterable, "");
        pN.setY(iterable2, "");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        pN.setY(iterable, "");
        int size = iterable instanceof Collection ? ((Collection) iterable).size() : 10;
        pN.setY(iterable2, "");
        ArrayList arrayList = new ArrayList(Math.min(size, iterable2 instanceof Collection ? ((Collection) iterable2).size() : 10));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new nT(it.next(), it2.next()));
        }
        return arrayList;
    }
}