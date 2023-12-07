package o;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import o.aL;

/* loaded from: classes.dex */
final class aP implements InterfaceC0025am {
    private final Set<aL<?>> MenuHostHelper$$ExternalSyntheticLambda0;
    private final Set<aL<?>> MenuHostHelper$$ExternalSyntheticLambda1;
    private final Set<aL<?>> setIconTintList;
    private final InterfaceC0025am setNavigationOnClickListener;
    private final Set<aL<?>> setUiOptions;
    private final Set<aL<?>> setX;
    private final Set<Class<?>> setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aP(C0024al<?> c0024al, InterfaceC0025am interfaceC0025am) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C0037ay c0037ay : c0024al.setX) {
            if (c0037ay.setX == 0) {
                if (c0037ay.MenuHostHelper$$ExternalSyntheticLambda0 == 2) {
                    hashSet4.add(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1);
                } else {
                    hashSet.add(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1);
                }
            } else if (c0037ay.setX == 2) {
                hashSet3.add(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1);
            } else if (c0037ay.MenuHostHelper$$ExternalSyntheticLambda0 == 2) {
                hashSet5.add(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1);
            } else {
                hashSet2.add(c0037ay.MenuHostHelper$$ExternalSyntheticLambda1);
            }
        }
        if (!c0024al.setNavigationOnClickListener.isEmpty()) {
            hashSet.add(new aL(aL.setX.class, bQ.class));
        }
        this.setIconTintList = Collections.unmodifiableSet(hashSet);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = Collections.unmodifiableSet(hashSet2);
        this.setX = Collections.unmodifiableSet(hashSet3);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = Collections.unmodifiableSet(hashSet4);
        this.setUiOptions = Collections.unmodifiableSet(hashSet5);
        this.setY = c0024al.setNavigationOnClickListener;
        this.setNavigationOnClickListener = interfaceC0025am;
    }

    @Override // o.InterfaceC0025am
    public final <T> T setY(Class<T> cls) {
        if (!this.setIconTintList.contains(new aL(aL.setX.class, cls))) {
            throw new aB(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        T t = (T) this.setNavigationOnClickListener.setY(cls);
        return !cls.equals(bQ.class) ? t : (T) new bQ(this.setY, (bQ) t) { // from class: o.aP$MenuHostHelper$$ExternalSyntheticLambda1
            private final bQ MenuHostHelper$$ExternalSyntheticLambda0;
            private final Set<Class<?>> setX;

            {
                this.setX = r1;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = r2;
            }
        };
    }

    @Override // o.InterfaceC0025am
    public final <T> T setY(aL<T> aLVar) {
        if (!this.setIconTintList.contains(aLVar)) {
            throw new aB(String.format("Attempting to request an undeclared dependency %s.", aLVar));
        }
        return (T) this.setNavigationOnClickListener.setY(aLVar);
    }

    @Override // o.InterfaceC0025am
    public final <T> InterfaceC0073cg<T> MenuHostHelper$$ExternalSyntheticLambda0(aL<T> aLVar) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0.contains(aLVar)) {
            throw new aB(String.format("Attempting to request an undeclared dependency Provider<%s>.", aLVar));
        }
        return this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(aLVar);
    }

    @Override // o.InterfaceC0025am
    public final <T> InterfaceC0073cg<Set<T>> MenuHostHelper$$ExternalSyntheticLambda1(aL<T> aLVar) {
        if (!this.setUiOptions.contains(aLVar)) {
            throw new aB(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", aLVar));
        }
        return this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1(aLVar);
    }

    @Override // o.InterfaceC0025am
    public final <T> Set<T> setIconTintList(aL<T> aLVar) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1.contains(aLVar)) {
            throw new aB(String.format("Attempting to request an undeclared dependency Set<%s>.", aLVar));
        }
        return this.setNavigationOnClickListener.setIconTintList(aLVar);
    }

    @Override // o.InterfaceC0025am
    public final <T> InterfaceC0073cg<T> MenuHostHelper$$ExternalSyntheticLambda1(Class<T> cls) {
        return MenuHostHelper$$ExternalSyntheticLambda0(new aL<>(aL.setX.class, cls));
    }

    @Override // o.InterfaceC0025am
    public final /* synthetic */ Set setIconTintList(Class cls) {
        return setIconTintList(new aL(aL.setX.class, cls));
    }
}