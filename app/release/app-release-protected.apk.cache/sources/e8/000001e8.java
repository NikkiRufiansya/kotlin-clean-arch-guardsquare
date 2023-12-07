package o;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class LifecycleController$observer$1 {
    private static Field MenuHostHelper$$ExternalSyntheticLambda0 = null;
    private static Method setIconTintList = null;
    private static boolean setX = false;
    private static boolean setY = false;

    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(LifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1 lifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1, View view, Window.Callback callback, KeyEvent keyEvent) {
        if (lifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return lifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setY(keyEvent);
        }
        if (callback instanceof Activity) {
            return setIconTintList((Activity) callback, keyEvent);
        }
        if (callback instanceof Dialog) {
            return setX((Dialog) callback, keyEvent);
        }
        return (view != null && setBaselineAlignBottom.setX(view, keyEvent)) || lifecycleController$observer$1$MenuHostHelper$$ExternalSyntheticLambda1.setY(keyEvent);
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(ActionBar actionBar, KeyEvent keyEvent) {
        if (!setY) {
            try {
                setIconTintList = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
            } catch (NoSuchMethodException unused) {
            }
            setY = true;
        }
        Method method = setIconTintList;
        if (method != null) {
            try {
                Object invoke = method.invoke(actionBar, keyEvent);
                if (invoke == null) {
                    return false;
                }
                return ((Boolean) invoke).booleanValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return false;
    }

    private static boolean setIconTintList(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && MenuHostHelper$$ExternalSyntheticLambda0(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView = window.getDecorView();
        if (setBaselineAlignBottom.setX(decorView, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
    }

    private static DialogInterface.OnKeyListener MenuHostHelper$$ExternalSyntheticLambda0(Dialog dialog) {
        if (!setX) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                MenuHostHelper$$ExternalSyntheticLambda0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            setX = true;
        }
        Field field = MenuHostHelper$$ExternalSyntheticLambda0;
        if (field != null) {
            try {
                return (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused2) {
                return null;
            }
        }
        return null;
    }

    private static boolean setX(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(dialog);
        if (MenuHostHelper$$ExternalSyntheticLambda02 == null || !MenuHostHelper$$ExternalSyntheticLambda02.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            Window window = dialog.getWindow();
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (setBaselineAlignBottom.setX(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(dialog, decorView != null ? decorView.getKeyDispatcherState() : null, dialog);
        }
        return true;
    }
}