package o;

/* loaded from: classes.dex */
public final class setFailureListener {
    private static final ThreadLocal<setAutofillHints> setY = new ThreadLocal<>();
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    final LinearLayoutManager$SavedState$1 MenuHostHelper$$ExternalSyntheticLambda1;
    volatile int setIconTintList = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setFailureListener(LinearLayoutManager$SavedState$1 linearLayoutManager$SavedState$1, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = linearLayoutManager$SavedState$1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setAutofillHints MenuHostHelper$$ExternalSyntheticLambda1() {
        ThreadLocal<setAutofillHints> threadLocal = setY;
        setAutofillHints setautofillhints = threadLocal.get();
        if (setautofillhints == null) {
            setautofillhints = new setAutofillHints();
            threadLocal.set(setautofillhints);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setautofillhints, this.MenuHostHelper$$ExternalSyntheticLambda0);
        return setautofillhints;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(MenuHostHelper$$ExternalSyntheticLambda1().setX()));
        sb.append(", codepoints:");
        int iconTintList = MenuHostHelper$$ExternalSyntheticLambda1().setIconTintList();
        for (int i = 0; i < iconTintList; i++) {
            sb.append(Integer.toHexString(MenuHostHelper$$ExternalSyntheticLambda1().setY(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}