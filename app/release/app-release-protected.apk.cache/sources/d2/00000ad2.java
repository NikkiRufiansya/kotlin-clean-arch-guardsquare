package o;

import java.util.Iterator;
import java.util.Map;
import o.RemoteConfigRegistrar;
import o.setCloseIconVisible;
import o.setIconEndPadding;
import o.setPromptId;

/* loaded from: classes.dex */
final class setCounterOverflowTextAppearance<T> implements setValues<T> {
    private final setDrawingCacheQuality MenuHostHelper$$ExternalSyntheticLambda0;
    private final setHovered<?> MenuHostHelper$$ExternalSyntheticLambda1;
    private final LegacySavedStateHandleController$1<?, ?> setX;
    private final boolean setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCounterOverflowTextAppearance(LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$1, setHovered<?> sethovered, setDrawingCacheQuality setdrawingcachequality) {
        this.setX = legacySavedStateHandleController$1;
        this.setY = sethovered.setX(setdrawingcachequality);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = sethovered;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setdrawingcachequality;
    }

    @Override // o.setValues
    public final T setIconTintList() {
        return (T) this.MenuHostHelper$$ExternalSyntheticLambda0.setZ().MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.setValues
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(T t, T t2) {
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t).equals(this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t2))) {
            if (this.setY) {
                return this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(t).equals(this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(t2));
            }
            return true;
        }
        return false;
    }

    @Override // o.setValues
    public final int MenuHostHelper$$ExternalSyntheticLambda1(T t) {
        int hashCode = this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t).hashCode();
        return this.setY ? (hashCode * 53) + this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(t).hashCode() : hashCode;
    }

    @Override // o.setValues
    public final void setY(T t, T t2) {
        r0.MenuHostHelper$$ExternalSyntheticLambda1(t, r0.MenuHostHelper$$ExternalSyntheticLambda0(r0.MenuHostHelper$$ExternalSyntheticLambda1(t), this.setX.MenuHostHelper$$ExternalSyntheticLambda1(t2)));
        if (this.setY) {
            setRotationX.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, t, t2);
        }
    }

    @Override // o.setValues
    public final void setY(T t, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29) {
        Iterator<Map.Entry<?, Object>> y = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(t).setY();
        while (y.hasNext()) {
            Map.Entry<?, Object> next = y.next();
            RemoteConfigRegistrar.setY sety = (RemoteConfigRegistrar.setY) next.getKey();
            if (sety.MenuHostHelper$$ExternalSyntheticLambda0() != setCloseIconVisible.setIconTintList.MESSAGE || sety.setY() || sety.setIconTintList()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof setIconEndPadding.setIconTintList) {
                windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(sety.MenuHostHelper$$ExternalSyntheticLambda1(), ((setIconEndPadding.setIconTintList) next).setY.getValue().setY());
            } else {
                windowInsetsCompat$Impl29.MenuHostHelper$$ExternalSyntheticLambda1(sety.MenuHostHelper$$ExternalSyntheticLambda1(), next.getValue());
            }
        }
        LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$1 = this.setX;
        legacySavedStateHandleController$1.MenuHostHelper$$ExternalSyntheticLambda1((LegacySavedStateHandleController$1<?, ?>) legacySavedStateHandleController$1.MenuHostHelper$$ExternalSyntheticLambda1(t), windowInsetsCompat$Impl29);
    }

    @Override // o.setValues
    public final void MenuHostHelper$$ExternalSyntheticLambda1(T t, setTranslateX settranslatex, setStateDescription setstatedescription) {
        boolean z;
        LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$1 = this.setX;
        setHovered<?> sethovered = this.MenuHostHelper$$ExternalSyntheticLambda1;
        Object y = legacySavedStateHandleController$1.setY(t);
        RemoteConfigRegistrar<?> x = sethovered.setX(t);
        do {
            try {
                if (settranslatex.setIconTintList() == Integer.MAX_VALUE) {
                    return;
                }
                int MenuHostHelper$$ExternalSyntheticLambda1 = settranslatex.MenuHostHelper$$ExternalSyntheticLambda1();
                z = true;
                if (MenuHostHelper$$ExternalSyntheticLambda1 != setCloseIconVisible.setIconTintList) {
                    if (setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1) == 2) {
                        Object iconTintList = sethovered.setIconTintList(setstatedescription, this.MenuHostHelper$$ExternalSyntheticLambda0, setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1));
                        if (iconTintList != null) {
                            sethovered.MenuHostHelper$$ExternalSyntheticLambda1(settranslatex, iconTintList, setstatedescription, x);
                            continue;
                        } else {
                            z = legacySavedStateHandleController$1.setIconTintList(y, settranslatex);
                            continue;
                        }
                    } else {
                        z = settranslatex.setOnNavigationItemSelectedListener();
                        continue;
                    }
                } else {
                    int i = 0;
                    Object obj = null;
                    setSpeed setspeed = null;
                    while (settranslatex.setIconTintList() != Integer.MAX_VALUE) {
                        int MenuHostHelper$$ExternalSyntheticLambda12 = settranslatex.MenuHostHelper$$ExternalSyntheticLambda1();
                        if (MenuHostHelper$$ExternalSyntheticLambda12 == setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1) {
                            i = settranslatex.setTextScaleX();
                            obj = sethovered.setIconTintList(setstatedescription, this.MenuHostHelper$$ExternalSyntheticLambda0, i);
                        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0) {
                            if (obj != null) {
                                sethovered.MenuHostHelper$$ExternalSyntheticLambda1(settranslatex, obj, setstatedescription, x);
                            } else {
                                setspeed = settranslatex.setY();
                            }
                        } else if (!settranslatex.setOnNavigationItemSelectedListener()) {
                            break;
                        }
                    }
                    if (settranslatex.MenuHostHelper$$ExternalSyntheticLambda1() != setCloseIconVisible.setY) {
                        throw new setProgressDrawableTiled("Protocol message end-group tag did not match expected tag.");
                    } else if (setspeed == null) {
                        continue;
                    } else if (obj != null) {
                        sethovered.setX(setspeed, obj, setstatedescription, x);
                        continue;
                    } else {
                        legacySavedStateHandleController$1.MenuHostHelper$$ExternalSyntheticLambda1(y, i, setspeed);
                        continue;
                    }
                }
            } finally {
                legacySavedStateHandleController$1.setY(t, y);
            }
        } while (z);
    }

    @Override // o.setValues
    public final void setX(T t) {
        this.setX.MenuHostHelper$$ExternalSyntheticLambda0(t);
        this.MenuHostHelper$$ExternalSyntheticLambda1.setY(t);
    }

    @Override // o.setValues
    public final boolean setIconTintList(T t) {
        return this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(t).MenuHostHelper$$ExternalSyntheticLambda1();
    }

    @Override // o.setValues
    public final int setY(T t) {
        Iterable<Map.Entry> entrySet;
        LegacySavedStateHandleController$1<?, ?> legacySavedStateHandleController$1 = this.setX;
        int x = legacySavedStateHandleController$1.setX(legacySavedStateHandleController$1.MenuHostHelper$$ExternalSyntheticLambda1(t));
        if (this.setY) {
            RemoteConfigRegistrar<?> MenuHostHelper$$ExternalSyntheticLambda1 = this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(t);
            int i = 0;
            for (int i2 = 0; i2 < MenuHostHelper$$ExternalSyntheticLambda1.setX.setIconTintList.size(); i2++) {
                i += RemoteConfigRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1.setX.setIconTintList.get(i2));
            }
            setPromptId<?, Object> setpromptid = MenuHostHelper$$ExternalSyntheticLambda1.setX;
            if (setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.isEmpty()) {
                entrySet = setPromptId.setX.setY();
            } else {
                entrySet = setpromptid.MenuHostHelper$$ExternalSyntheticLambda0.entrySet();
            }
            for (Map.Entry entry : entrySet) {
                i += RemoteConfigRegistrar.MenuHostHelper$$ExternalSyntheticLambda0(entry);
            }
            return x + i;
        }
        return x;
    }
}