package o;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class iG<T> implements iY<T> {
    private final je<?, ?> MenuHostHelper$$ExternalSyntheticLambda0;
    private final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final iJ setIconTintList;
    private final AbstractC0231ic<?> setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public iG(je<?, ?> jeVar, AbstractC0231ic<?> abstractC0231ic, iJ iJVar) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = jeVar;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = abstractC0231ic.MenuHostHelper$$ExternalSyntheticLambda1(iJVar);
        this.setX = abstractC0231ic;
        this.setIconTintList = iJVar;
    }

    @Override // o.iY
    public final T setY() {
        iJ iJVar = this.setIconTintList;
        if (iJVar instanceof AbstractC0239il) {
            return (T) ((AbstractC0239il) iJVar).setMaxEms();
        }
        return (T) iJVar.setAnimationFromJson().setChipCornerRadius();
    }

    @Override // o.iY
    public final boolean setY(T t, T t2) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0.setX(t).equals(this.MenuHostHelper$$ExternalSyntheticLambda0.setX(t2))) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t).equals(this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t2));
            }
            return true;
        }
        return false;
    }

    @Override // o.iY
    public final int setY(T t) {
        int hashCode = this.MenuHostHelper$$ExternalSyntheticLambda0.setX(t).hashCode();
        return this.MenuHostHelper$$ExternalSyntheticLambda1 ? (hashCode * 53) + this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t).hashCode() : hashCode;
    }

    @Override // o.iY
    public final void setIconTintList(T t, T t2) {
        iZ.setY(this.MenuHostHelper$$ExternalSyntheticLambda0, t, t2);
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            iZ.setY(this.setX, t, t2);
        }
    }

    @Override // o.iY
    public final void MenuHostHelper$$ExternalSyntheticLambda1(T t, jj jjVar) {
        Iterator<Map.Entry<?, Object>> y = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t).setY();
        while (y.hasNext()) {
            Map.Entry<?, Object> next = y.next();
            ij$MenuHostHelper$$ExternalSyntheticLambda0 ij_menuhosthelper__externalsyntheticlambda0 = (ij$MenuHostHelper$$ExternalSyntheticLambda0) next.getKey();
            if (ij_menuhosthelper__externalsyntheticlambda0.setY() != jg$MenuHostHelper$$ExternalSyntheticLambda1.MESSAGE || ij_menuhosthelper__externalsyntheticlambda0.setIconTintList() || ij_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof iu$MenuHostHelper$$ExternalSyntheticLambda1) {
                jjVar.setX(ij_menuhosthelper__externalsyntheticlambda0.setX(), ((iu$MenuHostHelper$$ExternalSyntheticLambda1) next).setY.getValue().MenuHostHelper$$ExternalSyntheticLambda0());
            } else {
                jjVar.setX(ij_menuhosthelper__externalsyntheticlambda0.setX(), next.getValue());
            }
        }
        je<?, ?> jeVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        jeVar.setY(jeVar.setX(t), jjVar);
    }

    @Override // o.iY
    public final void MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(t);
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(t);
    }

    @Override // o.iY
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(T t) {
        return this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t).MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.iY
    public final int setX(T t) {
        Iterable<Map.Entry> entrySet;
        je<?, ?> jeVar = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda0 = jeVar.MenuHostHelper$$ExternalSyntheticLambda0(jeVar.setX(t));
        if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            C0237ij<?> MenuHostHelper$$ExternalSyntheticLambda1 = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t);
            int i = 0;
            for (int i2 = 0; i2 < MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.size(); i2++) {
                i += C0237ij.setX(MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1.get(i2));
            }
            iW<?, Object> iWVar = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
            if (iWVar.setIconTintList.isEmpty()) {
                entrySet = iW$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
            } else {
                entrySet = iWVar.setIconTintList.entrySet();
            }
            for (Map.Entry entry : entrySet) {
                i += C0237ij.setX(entry);
            }
            return MenuHostHelper$$ExternalSyntheticLambda0 + i;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }
}