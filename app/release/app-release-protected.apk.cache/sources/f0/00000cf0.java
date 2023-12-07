package o;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class setItemTextColor extends setDataDirectorySuffix<String> implements ExecutorsRegistrar, RandomAccess {
    private final List<Object> setY;

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        setIconTintList();
        this.setY.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        setIconTintList();
        return setIconTintList(this.setY.set(i, (String) obj));
    }

    @Override // o.setDataDirectorySuffix, o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* bridge */ /* synthetic */ boolean setY() {
        return super.setY();
    }

    static {
        new setItemTextColor().setX();
    }

    public setItemTextColor() {
        this(10);
    }

    public setItemTextColor(int i) {
        this(new ArrayList(i));
    }

    private setItemTextColor(ArrayList<Object> arrayList) {
        this.setY = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.setY.size();
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        setIconTintList();
        if (collection instanceof ExecutorsRegistrar) {
            collection = ((ExecutorsRegistrar) collection).MenuHostHelper$$ExternalSyntheticLambda1();
        }
        boolean addAll = this.setY.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return addAll;
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        setIconTintList();
        this.setY.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // o.ExecutorsRegistrar
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setSpeed setspeed) {
        setIconTintList();
        this.setY.add(setspeed);
        ((AbstractList) this).modCount++;
    }

    @Override // o.ExecutorsRegistrar
    public final Object setIconTintList(int i) {
        return this.setY.get(i);
    }

    private static String setIconTintList(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof setSpeed) {
            return ((setSpeed) obj).MenuHostHelper$$ExternalSyntheticLambda1();
        }
        return setViewCacheExtension.setX((byte[]) obj);
    }

    @Override // o.ExecutorsRegistrar
    public final List<?> MenuHostHelper$$ExternalSyntheticLambda1() {
        return Collections.unmodifiableList(this.setY);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        boolean MenuHostHelper$$ExternalSyntheticLambda1;
        Object obj = this.setY.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof setSpeed) {
            setSpeed setspeed = (setSpeed) obj;
            String MenuHostHelper$$ExternalSyntheticLambda12 = setspeed.MenuHostHelper$$ExternalSyntheticLambda1();
            if (setspeed.MenuHostHelper$$ExternalSyntheticLambda0()) {
                this.setY.set(i, MenuHostHelper$$ExternalSyntheticLambda12);
            }
            return MenuHostHelper$$ExternalSyntheticLambda12;
        }
        byte[] bArr = (byte[]) obj;
        String x = setViewCacheExtension.setX(bArr);
        MenuHostHelper$$ExternalSyntheticLambda1 = setExpandedTitleMarginEnd.MenuHostHelper$$ExternalSyntheticLambda1(bArr);
        if (MenuHostHelper$$ExternalSyntheticLambda1) {
            this.setY.set(i, x);
        }
        return x;
    }

    @Override // o.ExecutorsRegistrar
    public final ExecutorsRegistrar MenuHostHelper$$ExternalSyntheticLambda0() {
        return super.setY() ? new setExpandedComponentIdHint(this) : this;
    }

    @Override // o.setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1
    public final /* synthetic */ setViewCacheExtension$MenuHostHelper$$ExternalSyntheticLambda1 setX(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.setY);
        return new setItemTextColor(arrayList);
    }

    @Override // o.setDataDirectorySuffix, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        setIconTintList();
        Object remove = this.setY.remove(i);
        ((AbstractList) this).modCount++;
        return setIconTintList(remove);
    }
}