package o;

/* loaded from: classes.dex */
public class setAddStatesFromChildren {
    setSpeed MenuHostHelper$$ExternalSyntheticLambda0;
    volatile setDrawingCacheQuality MenuHostHelper$$ExternalSyntheticLambda1;
    volatile setSpeed setX;

    public int hashCode() {
        return 1;
    }

    static {
        setStateDescription.MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setAddStatesFromChildren) {
            setAddStatesFromChildren setaddstatesfromchildren = (setAddStatesFromChildren) obj;
            setDrawingCacheQuality setdrawingcachequality = this.MenuHostHelper$$ExternalSyntheticLambda1;
            setDrawingCacheQuality setdrawingcachequality2 = setaddstatesfromchildren.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setdrawingcachequality == null && setdrawingcachequality2 == null) {
                return setY().equals(setaddstatesfromchildren.setY());
            }
            if (setdrawingcachequality == null || setdrawingcachequality2 == null) {
                if (setdrawingcachequality != null) {
                    return setdrawingcachequality.equals(setaddstatesfromchildren.MenuHostHelper$$ExternalSyntheticLambda0(setdrawingcachequality.setIconSize()));
                }
                return MenuHostHelper$$ExternalSyntheticLambda0(setdrawingcachequality2.setIconSize()).equals(setdrawingcachequality2);
            }
            return setdrawingcachequality.equals(setdrawingcachequality2);
        }
        return false;
    }

    public final setDrawingCacheQuality MenuHostHelper$$ExternalSyntheticLambda0(setDrawingCacheQuality setdrawingcachequality) {
        MenuHostHelper$$ExternalSyntheticLambda1(setdrawingcachequality);
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final int setIconTintList() {
        if (this.setX != null) {
            return this.setX.setY();
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius();
        }
        return 0;
    }

    public final setSpeed setY() {
        if (this.setX != null) {
            return this.setX;
        }
        synchronized (this) {
            if (this.setX != null) {
                return this.setX;
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                this.setX = setSpeed.setIconTintList;
            } else {
                this.setX = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener();
            }
            return this.setX;
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(setDrawingCacheQuality setdrawingcachequality) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            return;
        }
        synchronized (this) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                return;
            }
            try {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = setdrawingcachequality;
                this.setX = setSpeed.setIconTintList;
            } catch (setProgressDrawableTiled unused) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = setdrawingcachequality;
                this.setX = setSpeed.setIconTintList;
            }
        }
    }
}