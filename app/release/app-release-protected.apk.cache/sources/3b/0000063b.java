package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.C0243ip;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o.ix  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0252ix {
    private static final AbstractC0252ix setY = new setY((byte) 0);
    private static final AbstractC0252ix setX = new setX((byte) 0);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setIconTintList(Object obj, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void setY(Object obj, Object obj2, long j);

    /* synthetic */ AbstractC0252ix(byte b) {
        this();
    }

    private AbstractC0252ix() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static AbstractC0252ix setX() {
        return setY;
    }

    /* renamed from: o.ix$setY */
    /* loaded from: classes.dex */
    static final class setY extends AbstractC0252ix {
        private static final Class<?> MenuHostHelper$$ExternalSyntheticLambda1 = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private setY() {
            super((byte) 0);
        }

        /* synthetic */ setY(byte b) {
            this();
        }

        @Override // o.AbstractC0252ix
        final void setIconTintList(Object obj, long j) {
            Object unmodifiableList;
            List list = (List) ji.setNavigationOnClickListener(obj, j);
            if (list instanceof InterfaceC0249iv) {
                unmodifiableList = ((InterfaceC0249iv) list).setIconTintList();
            } else if (MenuHostHelper$$ExternalSyntheticLambda1.isAssignableFrom(list.getClass())) {
                return;
            } else {
                if ((list instanceof iM) && (list instanceof C0243ip.setY)) {
                    C0243ip.setY sety = (C0243ip.setY) list;
                    if (sety.setY()) {
                        sety.MenuHostHelper$$ExternalSyntheticLambda0();
                        return;
                    }
                    return;
                }
                unmodifiableList = Collections.unmodifiableList(list);
            }
            ji.setX(obj, j, unmodifiableList);
        }

        @Override // o.AbstractC0252ix
        final <E> void setY(Object obj, Object obj2, long j) {
            AbstractList c0246is;
            AbstractList abstractList;
            List arrayList;
            List list = (List) ji.setNavigationOnClickListener(obj2, j);
            int size = list.size();
            List list2 = (List) ji.setNavigationOnClickListener(obj, j);
            if (list2.isEmpty()) {
                if (list2 instanceof InterfaceC0249iv) {
                    arrayList = new C0246is(size);
                } else if ((list2 instanceof iM) && (list2 instanceof C0243ip.setY)) {
                    arrayList = ((C0243ip.setY) list2).setX(size);
                } else {
                    arrayList = new ArrayList(size);
                }
                ji.setX(obj, j, arrayList);
                abstractList = arrayList;
            } else {
                if (MenuHostHelper$$ExternalSyntheticLambda1.isAssignableFrom(list2.getClass())) {
                    c0246is = new ArrayList(list2.size() + size);
                    c0246is.addAll(list2);
                    ji.setX(obj, j, c0246is);
                } else if (list2 instanceof jh) {
                    c0246is = new C0246is(list2.size() + size);
                    c0246is.addAll((jh) list2);
                    ji.setX(obj, j, c0246is);
                } else {
                    boolean z = list2 instanceof iM;
                    abstractList = list2;
                    if (z) {
                        boolean z2 = list2 instanceof C0243ip.setY;
                        abstractList = list2;
                        if (z2) {
                            C0243ip.setY sety = (C0243ip.setY) list2;
                            abstractList = list2;
                            if (!sety.setY()) {
                                C0243ip.setY<E> x = sety.setX(list2.size() + size);
                                ji.setX(obj, j, x);
                                abstractList = x;
                            }
                        }
                    }
                }
                abstractList = c0246is;
            }
            int size2 = abstractList.size();
            int size3 = list.size();
            if (size2 > 0 && size3 > 0) {
                abstractList.addAll(list);
            }
            if (size2 > 0) {
                list = abstractList;
            }
            ji.setX(obj, j, list);
        }
    }

    /* renamed from: o.ix$setX */
    /* loaded from: classes.dex */
    static final class setX extends AbstractC0252ix {
        private setX() {
            super((byte) 0);
        }

        /* synthetic */ setX(byte b) {
            this();
        }

        @Override // o.AbstractC0252ix
        final void setIconTintList(Object obj, long j) {
            ((C0243ip.setY) ji.setNavigationOnClickListener(obj, j)).MenuHostHelper$$ExternalSyntheticLambda0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v3, types: [o.ip$setY] */
        @Override // o.AbstractC0252ix
        final <E> void setY(Object obj, Object obj2, long j) {
            C0243ip.setY<E> sety = (C0243ip.setY) ji.setNavigationOnClickListener(obj, j);
            C0243ip.setY<E> sety2 = (C0243ip.setY) ji.setNavigationOnClickListener(obj2, j);
            int size = sety.size();
            int size2 = sety2.size();
            C0243ip.setY<E> sety3 = sety;
            sety3 = sety;
            if (size > 0 && size2 > 0) {
                boolean y = sety.setY();
                C0243ip.setY<E> sety4 = sety;
                if (!y) {
                    sety4 = sety.setX(size2 + size);
                }
                sety4.addAll(sety2);
                sety3 = sety4;
            }
            if (size > 0) {
                sety2 = sety3;
            }
            ji.setX(obj, j, sety2);
        }
    }
}