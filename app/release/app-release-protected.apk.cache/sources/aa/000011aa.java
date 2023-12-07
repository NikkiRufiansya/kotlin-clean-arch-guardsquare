package o;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import o.nR;

/* renamed from: o.ud */
/* loaded from: classes.dex */
public final class C0505ud {
    private static final AbstractC0508ue setX;
    private static final int setY = setY(Throwable.class, -1);

    static {
        uJ uJVar;
        boolean z;
        try {
            z = C0513uj.MenuHostHelper$$ExternalSyntheticLambda0;
            uJVar = z ? uJ.setIconTintList : C0503ub.setIconTintList;
        } catch (Throwable unused) {
            uJVar = uJ.setIconTintList;
        }
        setX = uJVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E extends Throwable> E setY(E e) {
        Object x;
        if (e instanceof rK) {
            try {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                x = nR.setX(((rK) e).MenuHostHelper$$ExternalSyntheticLambda0());
            } catch (Throwable th) {
                nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setY((Object) th, "");
                x = nR.setX(new nR.setX(th));
            }
            if (nR.MenuHostHelper$$ExternalSyntheticLambda1(x)) {
                x = null;
            }
            return (E) x;
        }
        return (E) setX.MenuHostHelper$$ExternalSyntheticLambda0(e.getClass()).setX(e);
    }

    /* renamed from: o.ud$setNavigationOnClickListener */
    /* loaded from: classes.dex */
    public static final class setNavigationOnClickListener extends pO implements InterfaceC0377pk<Throwable, Throwable> {
        private /* synthetic */ Constructor MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setNavigationOnClickListener(Constructor constructor) {
            super(1);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = constructor;
        }

        @Override // o.InterfaceC0377pk
        public Throwable setX(Throwable th) {
            Object x;
            Object newInstance;
            try {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                newInstance = this.MenuHostHelper$$ExternalSyntheticLambda0.newInstance(new Object[0]);
            } catch (Throwable th2) {
                nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setY((Object) th2, "");
                x = nR.setX(new nR.setX(th2));
            }
            if (newInstance != null) {
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th);
                x = nR.setX(th3);
                if (nR.MenuHostHelper$$ExternalSyntheticLambda1(x)) {
                    x = null;
                }
                return (Throwable) x;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* renamed from: o.ud$setX */
    /* loaded from: classes.dex */
    public static final class setX extends pO implements InterfaceC0377pk<Throwable, Throwable> {
        private /* synthetic */ Constructor MenuHostHelper$$ExternalSyntheticLambda0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setX(Constructor constructor) {
            super(1);
            this.MenuHostHelper$$ExternalSyntheticLambda0 = constructor;
        }

        @Override // o.InterfaceC0377pk
        /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
        public Throwable setX(Throwable th) {
            Object x;
            Object newInstance;
            try {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                newInstance = this.MenuHostHelper$$ExternalSyntheticLambda0.newInstance(th);
            } catch (Throwable th2) {
                nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setY((Object) th2, "");
                x = nR.setX(new nR.setX(th2));
            }
            if (newInstance != null) {
                x = nR.setX((Throwable) newInstance);
                if (nR.MenuHostHelper$$ExternalSyntheticLambda1(x)) {
                    x = null;
                }
                return (Throwable) x;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    /* renamed from: o.ud$setY */
    /* loaded from: classes.dex */
    public static final class setY extends pO implements InterfaceC0377pk<Throwable, Throwable> {
        private /* synthetic */ Constructor setX;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public setY(Constructor constructor) {
            super(1);
            this.setX = constructor;
        }

        @Override // o.InterfaceC0377pk
        public Throwable setX(Throwable th) {
            Object x;
            Object newInstance;
            try {
                nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                newInstance = this.setX.newInstance(th.getMessage(), th);
            } catch (Throwable th2) {
                nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
                pN.setY((Object) th2, "");
                x = nR.setX(new nR.setX(th2));
            }
            if (newInstance != null) {
                x = nR.setX((Throwable) newInstance);
                if (nR.MenuHostHelper$$ExternalSyntheticLambda1(x)) {
                    x = null;
                }
                return (Throwable) x;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    private static final int setY(Class<?> cls, int i) {
        Object x;
        pN.setY(cls, "");
        C0394qa.setY(cls);
        try {
            nR.setIconTintList seticontintlist = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            int i2 = 0;
            do {
                int i3 = 0;
                for (Field field : cls.getDeclaredFields()) {
                    if (!Modifier.isStatic(field.getModifiers())) {
                        i3++;
                    }
                }
                i2 += i3;
                cls = cls.getSuperclass();
            } while (cls != null);
            x = nR.setX(Integer.valueOf(i2));
        } catch (Throwable th) {
            nR.setIconTintList seticontintlist2 = nR.MenuHostHelper$$ExternalSyntheticLambda0;
            pN.setY((Object) th, "");
            x = nR.setX(new nR.setX(th));
        }
        if (nR.MenuHostHelper$$ExternalSyntheticLambda1(x)) {
            x = Integer.valueOf(i);
        }
        return ((Number) x).intValue();
    }

    /* renamed from: o.ud$setIconTintList */
    /* loaded from: classes.dex */
    public static final class setIconTintList<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            Integer valueOf = Integer.valueOf(((Constructor) t2).getParameterTypes().length);
            Integer valueOf2 = Integer.valueOf(((Constructor) t).getParameterTypes().length);
            if (valueOf == valueOf2) {
                return 0;
            }
            if (valueOf == null) {
                return -1;
            }
            if (valueOf2 == null) {
                return 1;
            }
            return valueOf.compareTo(valueOf2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x00b6, code lost:
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ o.InterfaceC0377pk MenuHostHelper$$ExternalSyntheticLambda1(java.lang.Class r8) {
        /*
            o.ud$MenuHostHelper$$ExternalSyntheticLambda0 r0 = o.C0506ud$MenuHostHelper$$ExternalSyntheticLambda0.setY
            o.pk r0 = (o.InterfaceC0377pk) r0
            int r1 = o.C0505ud.setY
            r2 = 0
            int r3 = setY(r8, r2)
            if (r1 != r3) goto Lb7
            java.lang.reflect.Constructor[] r8 = r8.getConstructors()
            o.ud$setIconTintList r1 = new o.ud$setIconTintList
            r1.<init>()
            java.util.Comparator r1 = (java.util.Comparator) r1
            java.lang.String r3 = ""
            o.pN.setY(r8, r3)
            o.pN.setY(r1, r3)
            o.pN.setY(r8, r3)
            o.pN.setY(r1, r3)
            int r4 = r8.length
            r5 = 1
            if (r4 != 0) goto L2c
            r4 = 1
            goto L2d
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L43
            int r4 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r4)
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r8, r3)
            o.pN.setY(r8, r3)
            o.pN.setY(r1, r3)
            int r4 = r8.length
            if (r4 <= r5) goto L43
            java.util.Arrays.sort(r8, r1)
        L43:
            o.pN.setY(r8, r3)
            java.util.List r8 = java.util.Arrays.asList(r8)
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r8, r3)
            java.util.Iterator r8 = r8.iterator()
        L51:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Lb7
            java.lang.Object r1 = r8.next()
            java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
            java.lang.Class[] r3 = r1.getParameterTypes()
            int r4 = r3.length
            r6 = 0
            if (r4 == 0) goto Lac
            if (r4 == r5) goto L88
            r7 = 2
            if (r4 == r7) goto L6b
            goto Lb4
        L6b:
            r4 = r3[r2]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            boolean r4 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r4, r7)
            if (r4 == 0) goto Lb4
            r3 = r3[r5]
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            boolean r3 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r3, r4)
            if (r3 == 0) goto Lb4
            o.ud$setY r3 = new o.ud$setY
            r3.<init>(r1)
            r6 = r3
            o.pk r6 = (o.InterfaceC0377pk) r6
            goto Lb4
        L88:
            r3 = r3[r2]
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            boolean r4 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r3, r4)
            if (r4 == 0) goto L9b
            o.ud$setX r3 = new o.ud$setX
            r3.<init>(r1)
            r6 = r3
            o.pk r6 = (o.InterfaceC0377pk) r6
            goto Lb4
        L9b:
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r3 = o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r3, r4)
            if (r3 == 0) goto Lb4
            o.ud$MenuHostHelper$$ExternalSyntheticLambda1 r3 = new o.ud$MenuHostHelper$$ExternalSyntheticLambda1
            r3.<init>(r1)
            r6 = r3
            o.pk r6 = (o.InterfaceC0377pk) r6
            goto Lb4
        Lac:
            o.ud$setNavigationOnClickListener r3 = new o.ud$setNavigationOnClickListener
            r3.<init>(r1)
            r6 = r3
            o.pk r6 = (o.InterfaceC0377pk) r6
        Lb4:
            if (r6 == 0) goto L51
            return r6
        Lb7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0505ud.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.Class):o.pk");
    }
}