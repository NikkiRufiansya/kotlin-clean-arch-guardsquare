package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.lang.reflect.Field;
import o.registerIn;
import o.setCheckable;
import o.setTouchDelegate;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements setCheckable {
    private static int MenuHostHelper$$ExternalSyntheticLambda0;
    private static Field MenuHostHelper$$ExternalSyntheticLambda1;
    private static Field setX;
    private static Field setY;
    private Activity setIconTintList;

    public ImmLeaksCleaner(Activity activity) {
        this.setIconTintList = activity;
    }

    @Override // o.setCheckable
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate, registerIn.setX setx) {
        if (setx != registerIn.setX.ON_DESTROY) {
            return;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
            try {
                MenuHostHelper$$ExternalSyntheticLambda0 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                setX = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                MenuHostHelper$$ExternalSyntheticLambda1 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                setY = declaredField3;
                declaredField3.setAccessible(true);
                MenuHostHelper$$ExternalSyntheticLambda0 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.setIconTintList.getSystemService("input_method");
            try {
                Object obj = setY.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        View view = (View) setX.get(inputMethodManager);
                        if (view == null) {
                            return;
                        }
                        if (view.isAttachedToWindow()) {
                            return;
                        }
                        try {
                            MenuHostHelper$$ExternalSyntheticLambda1.set(inputMethodManager, null);
                            inputMethodManager.isActive();
                        } catch (IllegalAccessException unused2) {
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}