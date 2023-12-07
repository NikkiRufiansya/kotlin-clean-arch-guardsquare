package o;

import o.setProgressDrawableTiled;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class LegacySavedStateHandleController$1<T, B> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T MenuHostHelper$$ExternalSyntheticLambda0(T t, T t2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void MenuHostHelper$$ExternalSyntheticLambda0(Object obj);

    abstract void MenuHostHelper$$ExternalSyntheticLambda0(B b, int i, int i2);

    abstract void MenuHostHelper$$ExternalSyntheticLambda0(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T MenuHostHelper$$ExternalSyntheticLambda1(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(B b, int i, setSpeed setspeed);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(Object obj, T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void MenuHostHelper$$ExternalSyntheticLambda1(T t, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int setIconTintList(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B setIconTintList();

    abstract void setIconTintList(B b, int i, T t);

    abstract T setUiOptions(B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int setX(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setX(B b, int i, long j);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setX(T t, WindowInsetsCompat$Impl29 windowInsetsCompat$Impl29);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract B setY(Object obj);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setY(Object obj, B b);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setIconTintList(B b, setTranslateX settranslatex) {
        int MenuHostHelper$$ExternalSyntheticLambda1 = settranslatex.MenuHostHelper$$ExternalSyntheticLambda1();
        int MenuHostHelper$$ExternalSyntheticLambda0 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1);
        int MenuHostHelper$$ExternalSyntheticLambda12 = setCloseIconVisible.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda1);
        if (MenuHostHelper$$ExternalSyntheticLambda12 == 0) {
            setX(b, MenuHostHelper$$ExternalSyntheticLambda0, settranslatex.setIconSize());
            return true;
        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 1) {
            MenuHostHelper$$ExternalSyntheticLambda0((LegacySavedStateHandleController$1<T, B>) b, MenuHostHelper$$ExternalSyntheticLambda0, settranslatex.setUiOptions());
            return true;
        } else if (MenuHostHelper$$ExternalSyntheticLambda12 == 2) {
            MenuHostHelper$$ExternalSyntheticLambda1(b, MenuHostHelper$$ExternalSyntheticLambda0, settranslatex.setY());
            return true;
        } else if (MenuHostHelper$$ExternalSyntheticLambda12 != 3) {
            if (MenuHostHelper$$ExternalSyntheticLambda12 != 4) {
                if (MenuHostHelper$$ExternalSyntheticLambda12 == 5) {
                    MenuHostHelper$$ExternalSyntheticLambda0((LegacySavedStateHandleController$1<T, B>) b, MenuHostHelper$$ExternalSyntheticLambda0, settranslatex.setNavigationOnClickListener());
                    return true;
                }
                throw new setProgressDrawableTiled.setY("Protocol message tag had invalid wire type.");
            }
            return false;
        } else {
            B iconTintList = setIconTintList();
            int y = setCloseIconVisible.setY(MenuHostHelper$$ExternalSyntheticLambda0, 4);
            while (settranslatex.setIconTintList() != Integer.MAX_VALUE && setIconTintList(iconTintList, settranslatex)) {
            }
            if (y != settranslatex.MenuHostHelper$$ExternalSyntheticLambda1()) {
                throw new setProgressDrawableTiled("Protocol message end-group tag did not match expected tag.");
            }
            setIconTintList(b, MenuHostHelper$$ExternalSyntheticLambda0, setUiOptions(iconTintList));
            return true;
        }
    }
}