package o;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.aL;

/* renamed from: o.al  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0024al<T> {
    public final InterfaceC0027ao<T> MenuHostHelper$$ExternalSyntheticLambda0;
    public final Set<aL<? super T>> MenuHostHelper$$ExternalSyntheticLambda1;
    public final String setIconTintList;
    public final Set<Class<?>> setNavigationOnClickListener;
    public final int setOnLongClickListener;
    public final Set<C0037ay> setX;
    public final int setY;

    /* synthetic */ C0024al(String str, Set set, Set set2, int i, int i2, InterfaceC0027ao interfaceC0027ao, Set set3, byte b) {
        this(str, set, set2, i, i2, interfaceC0027ao, set3);
    }

    public C0024al(String str, Set<aL<? super T>> set, Set<C0037ay> set2, int i, int i2, InterfaceC0027ao<T> interfaceC0027ao, Set<Class<?>> set3) {
        this.setIconTintList = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = Collections.unmodifiableSet(set);
        this.setX = Collections.unmodifiableSet(set2);
        this.setY = i;
        this.setOnLongClickListener = i2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0027ao;
        this.setNavigationOnClickListener = Collections.unmodifiableSet(set3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.MenuHostHelper$$ExternalSyntheticLambda1.toArray()));
        sb.append(">{");
        sb.append(this.setY);
        sb.append(", type=");
        sb.append(this.setOnLongClickListener);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.setX.toArray()));
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: o.al$setX */
    /* loaded from: classes.dex */
    public static class setX<T> {
        public final Set<C0037ay> MenuHostHelper$$ExternalSyntheticLambda0;
        public int MenuHostHelper$$ExternalSyntheticLambda1;
        public InterfaceC0027ao<T> setIconTintList;
        private int setLayoutAnimation;
        private final Set<Class<?>> setOnLongClickListener;
        public String setX;
        public final Set<aL<? super T>> setY;

        public /* synthetic */ setX(Class cls, Class[] clsArr, byte b) {
            this(cls, clsArr);
        }

        public /* synthetic */ setX(aL aLVar, aL[] aLVarArr, byte b) {
            this(aLVar, aLVarArr);
        }

        @SafeVarargs
        private setX(Class<T> cls, Class<? super T>... clsArr) {
            this.setX = null;
            HashSet hashSet = new HashSet();
            this.setY = hashSet;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new HashSet();
            this.setLayoutAnimation = 0;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            this.setOnLongClickListener = new HashSet();
            if (cls != null) {
                hashSet.add(new aL(aL.setX.class, cls));
                for (Class<? super T> cls2 : clsArr) {
                    if (cls2 != null) {
                        this.setY.add(new aL<>(aL.setX.class, cls2));
                    } else {
                        throw new NullPointerException("Null interface");
                    }
                }
                return;
            }
            throw new NullPointerException("Null interface");
        }

        @SafeVarargs
        private setX(aL<T> aLVar, aL<? super T>... aLVarArr) {
            this.setX = null;
            HashSet hashSet = new HashSet();
            this.setY = hashSet;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = new HashSet();
            this.setLayoutAnimation = 0;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
            this.setOnLongClickListener = new HashSet();
            if (aLVar != null) {
                hashSet.add(aLVar);
                for (aL<? super T> aLVar2 : aLVarArr) {
                    if (aLVar2 == null) {
                        throw new NullPointerException("Null interface");
                    }
                }
                Collections.addAll(this.setY, aLVarArr);
                return;
            }
            throw new NullPointerException("Null interface");
        }

        public final C0024al<T> MenuHostHelper$$ExternalSyntheticLambda0() {
            if (this.setIconTintList != null) {
                return new C0024al<>(this.setX, new HashSet(this.setY), new HashSet(this.MenuHostHelper$$ExternalSyntheticLambda0), this.setLayoutAnimation, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, this.setOnLongClickListener, (byte) 0);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public final setX<T> setY(C0037ay c0037ay) {
            if (!this.setY.contains(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1)) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.add(c0037ay);
                return this;
            }
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }

        public final setX<T> MenuHostHelper$$ExternalSyntheticLambda1() {
            if (this.setLayoutAnimation == 0) {
                this.setLayoutAnimation = 2;
                return this;
            }
            throw new IllegalStateException("Instantiation type has already been set.");
        }
    }

    public static <T> C0024al<T> setY(final T t, Class<T> cls) {
        setX setx = new setX(cls, new Class[0], (byte) 0);
        setx.MenuHostHelper$$ExternalSyntheticLambda1 = 1;
        setx.setIconTintList = new InterfaceC0027ao() { // from class: o.ak
            @Override // o.InterfaceC0027ao
            public final Object setX(InterfaceC0025am interfaceC0025am) {
                return t;
            }
        };
        return setx.MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @SafeVarargs
    public static <T> C0024al<T> setY(T t, Class<T> cls, Class<? super T>... clsArr) {
        setX setx = new setX(cls, clsArr, (byte) 0);
        setx.setIconTintList = new C0021ai(t);
        return setx.MenuHostHelper$$ExternalSyntheticLambda0();
    }
}