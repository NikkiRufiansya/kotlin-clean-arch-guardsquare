package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class setHandwritingBoundsOffsets {
    public static boolean setY(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        return !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) ? z : typedArray.getBoolean(i, z);
    }

    public static setImageMatrix setY(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return setImageMatrix.setX(typedValue.data);
            }
            setImageMatrix x = setImageMatrix.setX(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (x != null) {
                return x;
            }
        }
        return setImageMatrix.setX(0);
    }

    public static float setIconTintList(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        return !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) ? f : typedArray.getFloat(i, f);
    }

    public static int setX(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) ? i2 : typedArray.getInt(i, i2);
    }

    public static int MenuHostHelper$$ExternalSyntheticLambda1(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return typedArray.getResourceId(i, 0);
        }
        return 0;
    }

    public static String setX(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static TypedValue setIconTintList(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return typedArray.peekValue(0);
        }
        return null;
    }
}