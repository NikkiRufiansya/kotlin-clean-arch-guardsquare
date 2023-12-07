package o;

/* renamed from: o.it  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0247it {
    volatile hY MenuHostHelper$$ExternalSyntheticLambda0;
    hY MenuHostHelper$$ExternalSyntheticLambda1;
    volatile iJ setIconTintList;

    public int hashCode() {
        return 1;
    }

    static {
        C0232id.setY();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0247it) {
            C0247it c0247it = (C0247it) obj;
            iJ iJVar = this.setIconTintList;
            iJ iJVar2 = c0247it.setIconTintList;
            if (iJVar == null && iJVar2 == null) {
                return MenuHostHelper$$ExternalSyntheticLambda0().equals(c0247it.MenuHostHelper$$ExternalSyntheticLambda0());
            }
            if (iJVar == null || iJVar2 == null) {
                if (iJVar != null) {
                    return iJVar.equals(c0247it.setX(iJVar.setIconSize()));
                }
                return setX(iJVar2.setIconSize()).equals(iJVar2);
            }
            return iJVar.equals(iJVar2);
        }
        return false;
    }

    public final iJ setX(iJ iJVar) {
        setY(iJVar);
        return this.setIconTintList;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0.setX();
        }
        if (this.setIconTintList != null) {
            return this.setIconTintList.setOnNavigationItemSelectedListener();
        }
        return 0;
    }

    public final hY MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        synchronized (this) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                return this.MenuHostHelper$$ExternalSyntheticLambda0;
            }
            if (this.setIconTintList == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = hY.setY;
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = this.setIconTintList.setChipCornerRadius();
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    private void setY(iJ iJVar) {
        if (this.setIconTintList != null) {
            return;
        }
        synchronized (this) {
            if (this.setIconTintList != null) {
                return;
            }
            try {
                this.setIconTintList = iJVar;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = hY.setY;
            } catch (C0241in unused) {
                this.setIconTintList = iJVar;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = hY.setY;
            }
        }
    }
}