package o;

import android.graphics.Rect;

/* loaded from: classes.dex */
final class setInterpolator {

    /* loaded from: classes.dex */
    public interface setIconTintList<T, V> {
        V MenuHostHelper$$ExternalSyntheticLambda0(T t, int i);

        int setY(T t);
    }

    /* loaded from: classes.dex */
    public interface setY<T> {
        void setIconTintList(T t, Rect rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setY(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean iconTintList = setIconTintList(i, rect, rect2);
        if (setIconTintList(i, rect, rect3) || !iconTintList) {
            return false;
        }
        return !MenuHostHelper$$ExternalSyntheticLambda1(i, rect, rect3) || i == 17 || i == 66 || Math.max(0, MenuHostHelper$$ExternalSyntheticLambda0(i, rect, rect2)) < Math.max(1, setY(i, rect, rect3));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean setIconTintList(Rect rect, Rect rect2, int i) {
        if (i == 17) {
            return (rect.right > rect2.right || rect.left >= rect2.right) && rect.left > rect2.left;
        } else if (i == 33) {
            return (rect.bottom > rect2.bottom || rect.top >= rect2.bottom) && rect.top > rect2.top;
        } else if (i == 66) {
            return (rect.left < rect2.left || rect.right <= rect2.left) && rect.right < rect2.right;
        } else if (i == 130) {
            return (rect.top < rect2.top || rect.bottom <= rect2.top) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    private static boolean setIconTintList(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            return rect.left >= rect2.right;
        } else if (i == 33) {
            return rect.top >= rect2.bottom;
        } else if (i == 66) {
            return rect.right <= rect2.left;
        } else if (i == 130) {
            return rect.bottom <= rect2.top;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int MenuHostHelper$$ExternalSyntheticLambda0(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    private static int setY(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.top;
        } else if (i == 66) {
            i2 = rect2.right;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.bottom;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return i2 - i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setX(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs((rect.left + (rect.width() / 2)) - (rect2.left + (rect2.width() / 2)));
        }
        return Math.abs((rect.top + (rect.height() / 2)) - (rect2.top + (rect2.height() / 2)));
    }
}