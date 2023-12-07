package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import o.C0243ip;

/* renamed from: o.is  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0246is extends hS<String> implements InterfaceC0249iv, RandomAccess {
    private final List<Object> setX;

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        setX();
        this.setX.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // o.hS, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // o.hS, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // o.hS, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.hS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // o.hS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // o.hS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        setX();
        return setX(this.setX.set(i, (String) obj));
    }

    @Override // o.hS, o.C0243ip.setY
    public final /* bridge */ /* synthetic */ boolean setY() {
        return super.setY();
    }

    static {
        new C0246is().MenuHostHelper$$ExternalSyntheticLambda0();
    }

    public C0246is() {
        this(10);
    }

    public C0246is(int i) {
        this(new ArrayList(i));
    }

    private C0246is(ArrayList<Object> arrayList) {
        this.setX = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.setX.size();
    }

    @Override // o.hS, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        setX();
        if (collection instanceof InterfaceC0249iv) {
            collection = ((InterfaceC0249iv) collection).MenuHostHelper$$ExternalSyntheticLambda1();
        }
        boolean addAll = this.setX.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // o.hS, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        setX();
        this.setX.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.InterfaceC0249iv
    public final void MenuHostHelper$$ExternalSyntheticLambda0(hY hYVar) {
        setX();
        this.setX.add(hYVar);
        ((AbstractList) this).modCount++;
    }

    @Override // o.InterfaceC0249iv
    public final Object setIconTintList(int i) {
        return this.setX.get(i);
    }

    private static String setX(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof hY) {
            return ((hY) obj).MenuHostHelper$$ExternalSyntheticLambda1();
        }
        return C0243ip.MenuHostHelper$$ExternalSyntheticLambda1((byte[]) obj);
    }

    @Override // o.InterfaceC0249iv
    public final List<?> MenuHostHelper$$ExternalSyntheticLambda1() {
        return Collections.unmodifiableList(this.setX);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        boolean iconTintList;
        Object obj = this.setX.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof hY) {
            hY hYVar = (hY) obj;
            String MenuHostHelper$$ExternalSyntheticLambda1 = hYVar.MenuHostHelper$$ExternalSyntheticLambda1();
            if (hYVar.MenuHostHelper$$ExternalSyntheticLambda0()) {
                this.setX.set(i, MenuHostHelper$$ExternalSyntheticLambda1);
            }
            return MenuHostHelper$$ExternalSyntheticLambda1;
        }
        byte[] bArr = (byte[]) obj;
        String MenuHostHelper$$ExternalSyntheticLambda12 = C0243ip.MenuHostHelper$$ExternalSyntheticLambda1(bArr);
        iconTintList = jf.setIconTintList(bArr);
        if (iconTintList) {
            this.setX.set(i, MenuHostHelper$$ExternalSyntheticLambda12);
        }
        return MenuHostHelper$$ExternalSyntheticLambda12;
    }

    @Override // o.InterfaceC0249iv
    public final InterfaceC0249iv setIconTintList() {
        return super.setY() ? new jh(this) : this;
    }

    @Override // o.C0243ip.setY
    public final /* synthetic */ C0243ip.setY setX(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.setX);
        return new C0246is(arrayList);
    }

    @Override // o.hS, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        setX();
        Object remove = this.setX.remove(i);
        ((AbstractList) this).modCount++;
        return setX(remove);
    }
}