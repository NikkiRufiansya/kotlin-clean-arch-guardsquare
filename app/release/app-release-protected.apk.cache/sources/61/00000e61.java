package o;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* loaded from: classes.dex */
public final class setOverriddenInsets {
    private static final ThreadLocal<setVerticalGravity<Rect, Rect>> MenuHostHelper$$ExternalSyntheticLambda0 = new ThreadLocal<>();

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setY.setX(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float measureText = paint.measureText("\udfffd");
        float measureText2 = paint.measureText("m");
        float measureText3 = paint.measureText(str);
        float f = 0.0f;
        if (measureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (measureText3 > measureText2 * 2.0f) {
                return false;
            }
            int i = 0;
            while (i < length) {
                int charCount = Character.charCount(str.codePointAt(i)) + i;
                f += paint.measureText(str, i, charCount);
                i = charCount;
            }
            if (measureText3 >= f) {
                return false;
            }
        }
        if (measureText3 != measureText) {
            return true;
        }
        setVerticalGravity<Rect, Rect> y = setY();
        paint.getTextBounds("\udfffd", 0, 2, y.setX);
        paint.getTextBounds(str, 0, length, y.MenuHostHelper$$ExternalSyntheticLambda1);
        return !y.setX.equals(y.MenuHostHelper$$ExternalSyntheticLambda1);
    }

    private static setVerticalGravity<Rect, Rect> setY() {
        ThreadLocal<setVerticalGravity<Rect, Rect>> threadLocal = MenuHostHelper$$ExternalSyntheticLambda0;
        setVerticalGravity<Rect, Rect> setverticalgravity = threadLocal.get();
        if (setverticalgravity == null) {
            setVerticalGravity<Rect, Rect> setverticalgravity2 = new setVerticalGravity<>(new Rect(), new Rect());
            threadLocal.set(setverticalgravity2);
            return setverticalgravity2;
        }
        setverticalgravity.setX.setEmpty();
        setverticalgravity.MenuHostHelper$$ExternalSyntheticLambda1.setEmpty();
        return setverticalgravity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY {
        static boolean setX(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }
}