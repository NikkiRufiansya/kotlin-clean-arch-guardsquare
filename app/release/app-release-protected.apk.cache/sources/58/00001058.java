package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import o.setNextFocusUpId;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class setTextMetricsParams {

    /* loaded from: classes.dex */
    public static final class setX implements setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda1 {
        private final int MenuHostHelper$$ExternalSyntheticLambda0;
        private final int MenuHostHelper$$ExternalSyntheticLambda1;
        private final setMarqueeRepeatLimit setIconTintList;
        private final String setY;

        public setX(setMarqueeRepeatLimit setmarqueerepeatlimit, int i, int i2, String str) {
            this.setIconTintList = setmarqueerepeatlimit;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
            this.setY = str;
        }

        public final setMarqueeRepeatLimit MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setIconTintList;
        }

        public final int setIconTintList() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        public final int setY() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        public final String setX() {
            return this.setY;
        }
    }

    /* loaded from: classes.dex */
    public static final class setY {
        private final String MenuHostHelper$$ExternalSyntheticLambda0;
        private final int MenuHostHelper$$ExternalSyntheticLambda1;
        private final int setIconTintList;
        private final int setLayoutAnimation;
        private final String setX;
        private final boolean setY;

        public setY(String str, int i, boolean z, String str2, int i2, int i3) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
            this.setLayoutAnimation = i;
            this.setY = z;
            this.setX = str2;
            this.setIconTintList = i2;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i3;
        }

        public final String setY() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        public final int MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.setLayoutAnimation;
        }

        public final boolean setNavigationOnClickListener() {
            return this.setY;
        }

        public final String setX() {
            return this.setX;
        }

        public final int MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.setIconTintList;
        }

        public final int setIconTintList() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    public static setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        return setIconTintList(xmlPullParser, resources);
    }

    private static setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return setY(xmlPullParser, resources);
        }
        MenuHostHelper$$ExternalSyntheticLambda0(xmlPullParser);
        return null;
    }

    private static setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda1 setY(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), setNextFocusUpId.setY.setLayoutAnimation);
        String string = obtainAttributes.getString(setNextFocusUpId.setY.setOnNavigationItemSelectedListener);
        String string2 = obtainAttributes.getString(setNextFocusUpId.setY.setCheckedIconEnabled);
        String string3 = obtainAttributes.getString(setNextFocusUpId.setY.setLayoutDirection);
        int resourceId = obtainAttributes.getResourceId(setNextFocusUpId.setY.setZ, 0);
        int integer = obtainAttributes.getInteger(setNextFocusUpId.setY.setTextAppearanceResource, 1);
        int integer2 = obtainAttributes.getInteger(setNextFocusUpId.setY.setGuidelinePercent, 500);
        int i = setNextFocusUpId.setY.setMinAndMaxProgress;
        String string4 = obtainAttributes.getString(6);
        obtainAttributes.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                MenuHostHelper$$ExternalSyntheticLambda0(xmlPullParser);
            }
            return new setX(new setMarqueeRepeatLimit(string, string2, string3, MenuHostHelper$$ExternalSyntheticLambda1(resources, resourceId)), integer, integer2, string4);
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("font")) {
                    arrayList.add(setX(xmlPullParser, resources));
                } else {
                    MenuHostHelper$$ExternalSyntheticLambda0(xmlPullParser);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new setTextMetricsParams$MenuHostHelper$$ExternalSyntheticLambda0((setY[]) arrayList.toArray(new setY[0]));
    }

    private static int setY(TypedArray typedArray, int i) {
        return setIconTintList.setIconTintList(typedArray, i);
    }

    public static List<List<byte[]>> MenuHostHelper$$ExternalSyntheticLambda1(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (setY(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(setIconTintList(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(setIconTintList(resources.getStringArray(i)));
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    private static List<byte[]> setIconTintList(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }

    private static setY setX(XmlPullParser xmlPullParser, Resources resources) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), setNextFocusUpId.setY.setNavigationOnClickListener);
        if (obtainAttributes.hasValue(setNextFocusUpId.setY.setMaxEms)) {
            i = setNextFocusUpId.setY.setMaxEms;
        } else {
            i = setNextFocusUpId.setY.setCenterIfNoTextEnabled;
        }
        int i6 = obtainAttributes.getInt(i, 400);
        if (obtainAttributes.hasValue(setNextFocusUpId.setY.ViewPager$SavedState$1)) {
            i2 = setNextFocusUpId.setY.ViewPager$SavedState$1;
        } else {
            i2 = setNextFocusUpId.setY.setUnboundedRipple;
        }
        boolean z = 1 == obtainAttributes.getInt(i2, 0);
        if (obtainAttributes.hasValue(setNextFocusUpId.setY.setAnimationFromJson)) {
            i3 = setNextFocusUpId.setY.setAnimationFromJson;
        } else {
            i3 = setNextFocusUpId.setY.setIconSize;
        }
        if (obtainAttributes.hasValue(setNextFocusUpId.setY.setTextScaleX)) {
            i4 = setNextFocusUpId.setY.setTextScaleX;
        } else {
            i4 = setNextFocusUpId.setY.setChipCornerRadius;
        }
        String string = obtainAttributes.getString(i4);
        int i7 = obtainAttributes.getInt(i3, 0);
        if (obtainAttributes.hasValue(setNextFocusUpId.setY.setTextAlignment)) {
            i5 = setNextFocusUpId.setY.setTextAlignment;
        } else {
            i5 = setNextFocusUpId.setY.setUiOptions;
        }
        int resourceId = obtainAttributes.getResourceId(i5, 0);
        String string2 = obtainAttributes.getString(i5);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            MenuHostHelper$$ExternalSyntheticLambda0(xmlPullParser);
        }
        return new setY(string2, i6, z, string, i7, resourceId);
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda0(XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList {
        static int setIconTintList(TypedArray typedArray, int i) {
            return typedArray.getType(i);
        }
    }
}