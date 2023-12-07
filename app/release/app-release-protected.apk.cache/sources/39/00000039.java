package androidx.core.view;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import o.setHelperTextColor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda0 extends WindowInsetsCompat.setY {
    private static Field MenuHostHelper$$ExternalSyntheticLambda0 = null;
    private static boolean MenuHostHelper$$ExternalSyntheticLambda1 = false;
    private static Constructor<WindowInsets> setIconTintList = null;
    private static boolean setY = false;
    private WindowInsets setLayoutAnimation;
    private setHelperTextColor setNavigationOnClickListener;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setLayoutAnimation = MenuHostHelper$$ExternalSyntheticLambda1();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowInsetsCompat$MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat windowInsetsCompat) {
        super(windowInsetsCompat);
        this.setLayoutAnimation = windowInsetsCompat.setIconSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.core.view.WindowInsetsCompat.setY
    public void setX(setHelperTextColor sethelpertextcolor) {
        WindowInsets windowInsets = this.setLayoutAnimation;
        if (windowInsets != null) {
            this.setLayoutAnimation = windowInsets.replaceSystemWindowInsets(sethelpertextcolor.setY, sethelpertextcolor.MenuHostHelper$$ExternalSyntheticLambda1, sethelpertextcolor.setX, sethelpertextcolor.setIconTintList);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.core.view.WindowInsetsCompat.setY
    public void setY(setHelperTextColor sethelpertextcolor) {
        this.setNavigationOnClickListener = sethelpertextcolor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.core.view.WindowInsetsCompat.setY
    public WindowInsetsCompat MenuHostHelper$$ExternalSyntheticLambda0() {
        setIconTintList();
        WindowInsetsCompat x = WindowInsetsCompat.setX(this.setLayoutAnimation);
        x.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
        x.MenuHostHelper$$ExternalSyntheticLambda1(this.setNavigationOnClickListener);
        return x;
    }

    private static WindowInsets MenuHostHelper$$ExternalSyntheticLambda1() {
        if (!setY) {
            try {
                MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
            }
            setY = true;
        }
        Field field = MenuHostHelper$$ExternalSyntheticLambda0;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
            }
        }
        if (!MenuHostHelper$$ExternalSyntheticLambda1) {
            try {
                setIconTintList = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
            }
            MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }
        Constructor<WindowInsets> constructor = setIconTintList;
        if (constructor != null) {
            try {
                return constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
            }
        }
        return null;
    }
}