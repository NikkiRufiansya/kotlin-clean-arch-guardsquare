package o;

import android.text.Editable;

/* loaded from: classes.dex */
final class setContentDescription extends Editable.Factory {
    private static final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    private static Class<?> setX;
    private static volatile Editable.Factory setY;

    private setContentDescription() {
        try {
            setX = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, getClass().getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory MenuHostHelper$$ExternalSyntheticLambda1() {
        if (setY == null) {
            synchronized (MenuHostHelper$$ExternalSyntheticLambda1) {
                if (setY == null) {
                    setY = new setContentDescription();
                }
            }
        }
        return setY;
    }

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class<?> cls = setX;
        if (cls == null) {
            return super.newEditable(charSequence);
        }
        return new setFabAlignmentModeEndMargin(cls, charSequence);
    }
}