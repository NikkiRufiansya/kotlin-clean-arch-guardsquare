package o;

import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public final class setOverflowReserved {
    private static final String[] setY = new String[0];

    private static boolean MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    public static void setX(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    public static String[] MenuHostHelper$$ExternalSyntheticLambda1(EditorInfo editorInfo) {
        String[] strArr;
        if (Build.VERSION.SDK_INT >= 25) {
            strArr = editorInfo.contentMimeTypes;
            return strArr == null ? setY : strArr;
        } else if (editorInfo.extras == null) {
            return setY;
        } else {
            String[] stringArray = editorInfo.extras.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            if (stringArray == null) {
                stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
            }
            return stringArray == null ? setY : stringArray;
        }
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda0(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            setOverflowReserved$MenuHostHelper$$ExternalSyntheticLambda1.setX(editorInfo, charSequence, 0);
        } else {
            setIconTintList(editorInfo, charSequence, 0);
        }
    }

    public static void setIconTintList(EditorInfo editorInfo, CharSequence charSequence, int i) {
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT >= 30) {
            setOverflowReserved$MenuHostHelper$$ExternalSyntheticLambda1.setX(editorInfo, charSequence, i);
            return;
        }
        if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
            i2 = editorInfo.initialSelEnd;
        } else {
            i2 = editorInfo.initialSelStart;
        }
        int i4 = i2 - i;
        if (editorInfo.initialSelStart > editorInfo.initialSelEnd) {
            i3 = editorInfo.initialSelStart;
        } else {
            i3 = editorInfo.initialSelEnd;
        }
        int i5 = i3 - i;
        int length = charSequence.length();
        if (i < 0 || i4 < 0 || i5 > length) {
            setY(editorInfo, null, 0, 0);
        } else if (MenuHostHelper$$ExternalSyntheticLambda0(editorInfo.inputType)) {
            setY(editorInfo, null, 0, 0);
        } else if (length <= 2048) {
            setY(editorInfo, charSequence, i4, i5);
        } else {
            setIconTintList(editorInfo, charSequence, i4, i5);
        }
    }

    private static void setIconTintList(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        CharSequence subSequence;
        int i3 = i2 - i;
        int i4 = i3 > 1024 ? 0 : i3;
        int i5 = 2048 - i4;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (i5 * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (setY(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (setY(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        if (i4 != i3) {
            subSequence = TextUtils.concat(charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2));
        } else {
            subSequence = charSequence.subSequence(i6, min2 + i4 + min + i6);
        }
        setY(editorInfo, subSequence, min2, i4 + min2);
    }

    private static boolean setY(CharSequence charSequence, int i, int i2) {
        if (i2 != 0) {
            if (i2 != 1) {
                return false;
            }
            return Character.isHighSurrogate(charSequence.charAt(i));
        }
        return Character.isLowSurrogate(charSequence.charAt(i));
    }

    private static void setY(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }
}