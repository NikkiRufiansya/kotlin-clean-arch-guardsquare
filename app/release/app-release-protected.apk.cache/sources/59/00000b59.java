package o;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class setEnsureMinTouchTargetSize {
    private static boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private static Method MenuHostHelper$$ExternalSyntheticLambda1;
    private static Method setX;
    private static boolean setY;

    @Deprecated
    public static void setUiOptions(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static boolean setUnboundedRipple(Drawable drawable) {
        return setY.setX(drawable);
    }

    public static void setX(Drawable drawable, float f, float f2) {
        drawable.setHotspot(f, f2);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(Drawable drawable, ColorStateList colorStateList) {
        setIconTintList.setIconTintList(drawable, colorStateList);
    }

    public static void setX(Drawable drawable, PorterDuff.Mode mode) {
        drawable.setTintMode(mode);
    }

    public static int setX(Drawable drawable) {
        return setY.setIconTintList(drawable);
    }

    public static void setY(Drawable drawable, Resources.Theme theme) {
        drawable.applyTheme(theme);
    }

    public static ColorFilter setY(Drawable drawable) {
        return setIconTintList.setY(drawable);
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable) {
        DrawableContainer.DrawableContainerState drawableContainerState;
        while (Build.VERSION.SDK_INT < 23) {
            drawable.clearColorFilter();
            if (!(drawable instanceof InsetDrawable)) {
                if (drawable instanceof setExpanded) {
                    drawable = ((setExpanded) drawable).MenuHostHelper$$ExternalSyntheticLambda0();
                } else if (!(drawable instanceof DrawableContainer) || (drawableContainerState = (DrawableContainer.DrawableContainerState) ((DrawableContainer) drawable).getConstantState()) == null) {
                    return;
                } else {
                    int childCount = drawableContainerState.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        Drawable child = drawableContainerState.getChild(i);
                        if (child != null) {
                            MenuHostHelper$$ExternalSyntheticLambda0(child);
                        }
                    }
                    return;
                }
            } else {
                drawable = ((InsetDrawable) drawable).getDrawable();
            }
        }
        drawable.clearColorFilter();
    }

    public static Drawable setNavigationOnClickListener(Drawable drawable) {
        return (Build.VERSION.SDK_INT < 23 && !(drawable instanceof setButtonDrawable)) ? new setLeft(drawable) : drawable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends Drawable> T setOnLongClickListener(Drawable drawable) {
        return drawable instanceof setExpanded ? (T) ((setExpanded) drawable).MenuHostHelper$$ExternalSyntheticLambda0() : drawable;
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable, int i) {
        if (Build.VERSION.SDK_INT < 23) {
            if (!setY) {
                try {
                    Method declaredMethod = Drawable.class.getDeclaredMethod("setLayoutDirection", Integer.TYPE);
                    setX = declaredMethod;
                    declaredMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", e);
                }
                setY = true;
            }
            Method method = setX;
            if (method != null) {
                try {
                    method.invoke(drawable, Integer.valueOf(i));
                    return true;
                } catch (Exception e2) {
                    Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", e2);
                    setX = null;
                }
            }
            return false;
        }
        return drawable.setLayoutDirection(i);
    }

    public static int setIconTintList(Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setX.setY(drawable);
        }
        if (!MenuHostHelper$$ExternalSyntheticLambda0) {
            try {
                Method declaredMethod = Drawable.class.getDeclaredMethod("getLayoutDirection", new Class[0]);
                MenuHostHelper$$ExternalSyntheticLambda1 = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", e);
            }
            MenuHostHelper$$ExternalSyntheticLambda0 = true;
        }
        Method method = MenuHostHelper$$ExternalSyntheticLambda1;
        if (method != null) {
            try {
                return ((Integer) method.invoke(drawable, new Object[0])).intValue();
            } catch (Exception e2) {
                Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", e2);
                MenuHostHelper$$ExternalSyntheticLambda1 = null;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        static boolean setX(Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static int setIconTintList(Drawable drawable) {
            return drawable.getAlpha();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void setIconTintList(Drawable drawable, int i) {
            drawable.setTint(i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void setIconTintList(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static boolean setX(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static ColorFilter setY(Drawable drawable) {
            return drawable.getColorFilter();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void setX(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setX {
        static int setY(Drawable drawable) {
            return drawable.getLayoutDirection();
        }
    }
}