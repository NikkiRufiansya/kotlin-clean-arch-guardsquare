package o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.util.List;
import o.setNextFocusUpId;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
final class setCheckedIconVisible {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Shader MenuHostHelper$$ExternalSyntheticLambda0(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainStyledAttributes;
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            StringBuilder sb = new StringBuilder();
            sb.append(xmlPullParser.getPositionDescription());
            sb.append(": invalid gradient color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        int[] iArr = setNextFocusUpId.setY.setChipIconTintResource;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int i = setNextFocusUpId.setY.setAdapter;
        float f = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startX") != null) ? 0.0f : obtainStyledAttributes.getFloat(8, 0.0f);
        int i2 = setNextFocusUpId.setY.setViewTranslationCallback;
        float f2 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startY") != null) ? 0.0f : obtainStyledAttributes.getFloat(9, 0.0f);
        int i3 = setNextFocusUpId.setY.setContentScrimResource;
        float f3 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endX") != null) ? 0.0f : obtainStyledAttributes.getFloat(10, 0.0f);
        int i4 = setNextFocusUpId.setY.FloatingActionButton$BaseBehavior;
        float f4 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endY") != null) ? 0.0f : obtainStyledAttributes.getFloat(11, 0.0f);
        int i5 = setNextFocusUpId.setY.setConstraintSet;
        float f5 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerX") != null) ? 0.0f : obtainStyledAttributes.getFloat(3, 0.0f);
        int i6 = setNextFocusUpId.setY.FragmentStateAdapter$2;
        float f6 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerY") != null) ? 0.0f : obtainStyledAttributes.getFloat(4, 0.0f);
        int i7 = setNextFocusUpId.setY.setSelectedChildViewEnabled;
        int i8 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "type") != null) ? 0 : obtainStyledAttributes.getInt(2, 0);
        int i9 = setNextFocusUpId.setY.setFilterTouchesWhenObscured;
        int color = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "startColor") != null) ? 0 : obtainStyledAttributes.getColor(0, 0);
        boolean z = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null;
        int i10 = setNextFocusUpId.setY.SearchView$SavedState$1;
        int color2 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "centerColor") != null) ? 0 : obtainStyledAttributes.getColor(7, 0);
        int i11 = setNextFocusUpId.setY.FragmentStateAdapter$5;
        int color3 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "endColor") != null) ? 0 : obtainStyledAttributes.getColor(1, 0);
        int i12 = setNextFocusUpId.setY.setObjectValues;
        int i13 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tileMode") != null) ? 0 : obtainStyledAttributes.getInt(6, 0);
        int i14 = setNextFocusUpId.setY.setSuffixText;
        float f7 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "gradientRadius") != null) ? 0.0f : obtainStyledAttributes.getFloat(5, 0.0f);
        obtainStyledAttributes.recycle();
        setY MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(setIconTintList(resources, xmlPullParser, attributeSet, theme), color, color3, z, color2);
        if (i8 != 1) {
            if (i8 == 2) {
                return new SweepGradient(f5, f6, MenuHostHelper$$ExternalSyntheticLambda1.setX, MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1);
            }
            return new LinearGradient(f, f2, f3, f4, MenuHostHelper$$ExternalSyntheticLambda1.setX, MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda1(i13));
        } else if (f7 <= 0.0f) {
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        } else {
            return new RadialGradient(f5, f6, f7, MenuHostHelper$$ExternalSyntheticLambda1.setX, MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda1(i13));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006f, code lost:
        r8 = new java.lang.StringBuilder();
        r8.append(r9.getPositionDescription());
        r8.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
        throw new org.xmlpull.v1.XmlPullParserException(r8.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static o.setCheckedIconVisible.setY setIconTintList(android.content.res.Resources r8, org.xmlpull.v1.XmlPullParser r9, android.util.AttributeSet r10, android.content.res.Resources.Theme r11) {
        /*
            int r0 = r9.getDepth()
            r1 = 1
            int r0 = r0 + r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 20
            r2.<init>(r3)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r3)
        L12:
            int r3 = r9.next()
            if (r3 == r1) goto L8a
            int r5 = r9.getDepth()
            if (r5 >= r0) goto L21
            r6 = 3
            if (r3 == r6) goto L8a
        L21:
            r6 = 2
            if (r3 != r6) goto L12
            if (r5 > r0) goto L12
            java.lang.String r3 = r9.getName()
            java.lang.String r5 = "item"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L12
            int[] r3 = o.setNextFocusUpId.setY.ExtendableSavedState$1
            r5 = 0
            if (r11 != 0) goto L3c
            android.content.res.TypedArray r3 = r8.obtainAttributes(r10, r3)
            goto L40
        L3c:
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r10, r3, r5, r5)
        L40:
            int r6 = o.setNextFocusUpId.setY.setIconified
            boolean r6 = r3.hasValue(r6)
            int r7 = o.setNextFocusUpId.setY.setHasDecor
            boolean r7 = r3.hasValue(r7)
            if (r6 == 0) goto L6f
            if (r7 == 0) goto L6f
            int r6 = o.setNextFocusUpId.setY.setIconified
            int r5 = r3.getColor(r6, r5)
            int r6 = o.setNextFocusUpId.setY.setHasDecor
            r7 = 0
            float r6 = r3.getFloat(r6, r7)
            r3.recycle()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            r4.add(r3)
            java.lang.Float r3 = java.lang.Float.valueOf(r6)
            r2.add(r3)
            goto L12
        L6f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = r9.getPositionDescription()
            r8.append(r9)
            java.lang.String r9 = ": <item> tag requires a 'color' attribute and a 'offset' attribute!"
            r8.append(r9)
            org.xmlpull.v1.XmlPullParserException r9 = new org.xmlpull.v1.XmlPullParserException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L8a:
            int r8 = r4.size()
            if (r8 <= 0) goto L96
            o.setCheckedIconVisible$setY r8 = new o.setCheckedIconVisible$setY
            r8.<init>(r4, r2)
            return r8
        L96:
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCheckedIconVisible.setIconTintList(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):o.setCheckedIconVisible$setY");
    }

    private static setY MenuHostHelper$$ExternalSyntheticLambda1(setY sety, int i, int i2, boolean z, int i3) {
        if (sety != null) {
            return sety;
        }
        if (z) {
            return new setY(i, i3, i2);
        }
        return new setY(i, i2);
    }

    private static Shader.TileMode MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        if (i != 1) {
            if (i == 2) {
                return Shader.TileMode.MIRROR;
            }
            return Shader.TileMode.CLAMP;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY {
        final float[] MenuHostHelper$$ExternalSyntheticLambda1;
        final int[] setX;

        setY(List<Integer> list, List<Float> list2) {
            int size = list.size();
            this.setX = new int[size];
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new float[size];
            for (int i = 0; i < size; i++) {
                this.setX[i] = list.get(i).intValue();
                this.MenuHostHelper$$ExternalSyntheticLambda1[i] = list2.get(i).floatValue();
            }
        }

        setY(int i, int i2) {
            this.setX = new int[]{i, i2};
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new float[]{0.0f, 1.0f};
        }

        setY(int i, int i2, int i3) {
            this.setX = new int[]{i, i2, i3};
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}