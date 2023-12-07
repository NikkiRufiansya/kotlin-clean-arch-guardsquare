package o;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.util.ArrayList;
import o.setIconifiedByDefault;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class setNextClusterForwardId {
    private static boolean MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        return i >= 28 && i <= 31;
    }

    public static Animator MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator(context, i);
        }
        return setX(context, context.getResources(), context.getTheme(), i);
    }

    public static Animator setX(Context context, Resources resources, Resources.Theme theme, int i) {
        return setY(context, resources, theme, i, 1.0f);
    }

    public static Animator setY(Context context, Resources resources, Resources.Theme theme, int i, float f) {
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return MenuHostHelper$$ExternalSyntheticLambda1(context, resources, theme, xmlResourceParser, f);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder("Can't load animation resource ID #0x");
                    sb.append(Integer.toHexString(i));
                    Resources.NotFoundException notFoundException = new Resources.NotFoundException(sb.toString());
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (XmlPullParserException e2) {
                StringBuilder sb2 = new StringBuilder("Can't load animation resource ID #0x");
                sb2.append(Integer.toHexString(i));
                Resources.NotFoundException notFoundException2 = new Resources.NotFoundException(sb2.toString());
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY implements TypeEvaluator<setIconifiedByDefault.setIconTintList[]> {
        private setIconifiedByDefault.setIconTintList[] MenuHostHelper$$ExternalSyntheticLambda0;

        setY() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
        public setIconifiedByDefault.setIconTintList[] evaluate(float f, setIconifiedByDefault.setIconTintList[] seticontintlistArr, setIconifiedByDefault.setIconTintList[] seticontintlistArr2) {
            if (!setIconifiedByDefault.setIconTintList(seticontintlistArr, seticontintlistArr2)) {
                throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!setIconifiedByDefault.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0, seticontintlistArr)) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setIconifiedByDefault.setIconTintList(seticontintlistArr);
            }
            for (int i = 0; i < seticontintlistArr.length; i++) {
                setIconifiedByDefault.setIconTintList seticontintlist = this.MenuHostHelper$$ExternalSyntheticLambda0[i];
                setIconifiedByDefault.setIconTintList seticontintlist2 = seticontintlistArr[i];
                setIconifiedByDefault.setIconTintList seticontintlist3 = seticontintlistArr2[i];
                seticontintlist.setX = seticontintlist2.setX;
                int i2 = 0;
                while (true) {
                    float[] fArr = seticontintlist2.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (i2 < fArr.length) {
                        seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1[i2] = (fArr[i2] * (1.0f - f)) + (seticontintlist3.MenuHostHelper$$ExternalSyntheticLambda1[i2] * f);
                        i2++;
                    }
                }
            }
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
    }

    private static PropertyValuesHolder MenuHostHelper$$ExternalSyntheticLambda0(TypedArray typedArray, int i, int i2, int i3, String str) {
        int i4;
        PropertyValuesHolder ofInt;
        int i5;
        int i6;
        float f;
        float f2;
        float f3;
        TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && MenuHostHelper$$ExternalSyntheticLambda1(i7)) || (z2 && MenuHostHelper$$ExternalSyntheticLambda1(i8))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        PropertyValuesHolder propertyValuesHolder = null;
        if (i != 2) {
            setCollapsedTitleTypeface setcollapsedtitletypeface = i == 3 ? setCollapsedTitleTypeface.setIconTintList : null;
            if (z3) {
                if (z) {
                    if (i7 == 5) {
                        f2 = typedArray.getDimension(i2, 0.0f);
                    } else {
                        f2 = typedArray.getFloat(i2, 0.0f);
                    }
                    if (z2) {
                        if (i8 == 5) {
                            f3 = typedArray.getDimension(i3, 0.0f);
                        } else {
                            f3 = typedArray.getFloat(i3, 0.0f);
                        }
                        ofInt = PropertyValuesHolder.ofFloat(str, f2, f3);
                    } else {
                        ofInt = PropertyValuesHolder.ofFloat(str, f2);
                    }
                } else {
                    if (i8 == 5) {
                        f = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f = typedArray.getFloat(i3, 0.0f);
                    }
                    ofInt = PropertyValuesHolder.ofFloat(str, f);
                }
            } else if (!z) {
                if (z2) {
                    if (i8 == 5) {
                        i4 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (MenuHostHelper$$ExternalSyntheticLambda1(i8)) {
                        i4 = typedArray.getColor(i3, 0);
                    } else {
                        i4 = typedArray.getInt(i3, 0);
                    }
                    ofInt = PropertyValuesHolder.ofInt(str, i4);
                }
                if (propertyValuesHolder == null && setcollapsedtitletypeface != null) {
                    propertyValuesHolder.setEvaluator(setcollapsedtitletypeface);
                    return propertyValuesHolder;
                }
            } else {
                if (i7 == 5) {
                    i5 = (int) typedArray.getDimension(i2, 0.0f);
                } else if (MenuHostHelper$$ExternalSyntheticLambda1(i7)) {
                    i5 = typedArray.getColor(i2, 0);
                } else {
                    i5 = typedArray.getInt(i2, 0);
                }
                if (z2) {
                    if (i8 == 5) {
                        i6 = (int) typedArray.getDimension(i3, 0.0f);
                    } else if (MenuHostHelper$$ExternalSyntheticLambda1(i8)) {
                        i6 = typedArray.getColor(i3, 0);
                    } else {
                        i6 = typedArray.getInt(i3, 0);
                    }
                    ofInt = PropertyValuesHolder.ofInt(str, i5, i6);
                } else {
                    ofInt = PropertyValuesHolder.ofInt(str, i5);
                }
            }
            propertyValuesHolder = ofInt;
            return propertyValuesHolder == null ? propertyValuesHolder : propertyValuesHolder;
        }
        String string = typedArray.getString(i2);
        String string2 = typedArray.getString(i3);
        setIconifiedByDefault.setIconTintList[] iconTintList = setIconifiedByDefault.setIconTintList(string);
        setIconifiedByDefault.setIconTintList[] iconTintList2 = setIconifiedByDefault.setIconTintList(string2);
        if (iconTintList == null && iconTintList2 == null) {
            return null;
        }
        if (iconTintList == null) {
            if (iconTintList2 != null) {
                return PropertyValuesHolder.ofObject(str, new setY(), iconTintList2);
            }
            return null;
        }
        setY sety = new setY();
        if (iconTintList2 != null) {
            if (!setIconifiedByDefault.setIconTintList(iconTintList, iconTintList2)) {
                StringBuilder sb = new StringBuilder(" Can't morph from ");
                sb.append(string);
                sb.append(" to ");
                sb.append(string2);
                throw new InflateException(sb.toString());
            }
            return PropertyValuesHolder.ofObject(str, sety, iconTintList, iconTintList2);
        }
        return PropertyValuesHolder.ofObject(str, sety, iconTintList);
    }

    private static void setX(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f, XmlPullParser xmlPullParser) {
        long x = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "duration", 1, 300);
        long x2 = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "startOffset", 2, 0);
        int x3 = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "valueType", 7, 4);
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueFrom") != null) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "valueTo") != null) {
                if (x3 == 4) {
                    x3 = setIconTintList(typedArray, 5, 6);
                }
                PropertyValuesHolder MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(typedArray, x3, 5, 6, "");
                if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                    valueAnimator.setValues(MenuHostHelper$$ExternalSyntheticLambda0);
                }
            }
        }
        valueAnimator.setDuration(x);
        valueAnimator.setStartDelay(x2);
        valueAnimator.setRepeatCount(setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            setY(valueAnimator, typedArray2, x3, f, xmlPullParser);
        }
    }

    private static void setY(ValueAnimator valueAnimator, TypedArray typedArray, int i, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator) valueAnimator;
        String x = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "pathData", 1);
        if (x != null) {
            String x2 = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "propertyXName", 2);
            String x3 = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "propertyYName", 3);
            if (x2 == null && x3 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(sb.toString());
            }
            MenuHostHelper$$ExternalSyntheticLambda0(setIconifiedByDefault.setX(x), objectAnimator, f * 0.5f, x2, x3);
            return;
        }
        objectAnimator.setPropertyName(setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda0(Path path, ObjectAnimator objectAnimator, float f, String str, String str2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        float f2 = 0.0f;
        arrayList.add(Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int min = Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((Float) arrayList.get(i2)).floatValue(), fArr3, null);
            fArr[i] = fArr3[0];
            fArr2[i] = fArr3[1];
            f2 += f4;
            int i3 = i2 + 1;
            if (i3 < arrayList.size() && f2 > ((Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i2 = i3;
            }
            i++;
        }
        PropertyValuesHolder ofFloat = str != null ? PropertyValuesHolder.ofFloat(str, fArr) : null;
        PropertyValuesHolder ofFloat2 = str2 != null ? PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }

    private static Animator MenuHostHelper$$ExternalSyntheticLambda1(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f) {
        return setX(context, resources, theme, xmlPullParser, Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00eb, code lost:
        if (r23 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ed, code lost:
        if (r14 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ef, code lost:
        r1 = new android.animation.Animator[r14.size()];
        r2 = r14.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fd, code lost:
        if (r2.hasNext() == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ff, code lost:
        r1[r15] = (android.animation.Animator) r2.next();
        r15 = r15 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0109, code lost:
        if (r24 != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x010b, code lost:
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x010f, code lost:
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0112, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.animation.Animator setX(android.content.Context r18, android.content.res.Resources r19, android.content.res.Resources.Theme r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.animation.AnimatorSet r23, int r24, float r25) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setNextClusterForwardId.setX(android.content.Context, android.content.res.Resources, android.content.res.Resources$Theme, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.animation.AnimatorSet, int, float):android.animation.Animator");
    }

    private static PropertyValuesHolder[] setIconTintList(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        int i;
        TypedArray obtainStyledAttributes;
        PropertyValuesHolder[] propertyValuesHolderArr = null;
        ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            } else if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    int[] iArr = setClipToPadding.setUiOptions;
                    if (theme == null) {
                        obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    TypedArray typedArray = obtainStyledAttributes;
                    String x = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "propertyName", 3);
                    int x2 = setHandwritingBoundsOffsets.setX(typedArray, xmlPullParser, "valueType", 2, 4);
                    PropertyValuesHolder y = setY(context, resources, theme, xmlPullParser, x, x2);
                    if (y == null) {
                        y = MenuHostHelper$$ExternalSyntheticLambda0(typedArray, x2, 0, 1, x);
                    }
                    if (y != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(y);
                    }
                    typedArray.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            propertyValuesHolderArr = new PropertyValuesHolder[size];
            for (i = 0; i < size; i++) {
                propertyValuesHolderArr[i] = (PropertyValuesHolder) arrayList.get(i);
            }
        }
        return propertyValuesHolderArr;
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda0(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes;
        int[] iArr = setClipToPadding.setIconTintList;
        int i = 0;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        TypedValue iconTintList = setHandwritingBoundsOffsets.setIconTintList(obtainStyledAttributes, xmlPullParser, "value");
        if ((iconTintList != null) && MenuHostHelper$$ExternalSyntheticLambda1(iconTintList.type)) {
            i = 3;
        }
        obtainStyledAttributes.recycle();
        return i;
    }

    private static int setIconTintList(TypedArray typedArray, int i, int i2) {
        TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        return ((z && MenuHostHelper$$ExternalSyntheticLambda1(i3)) || (z2 && MenuHostHelper$$ExternalSyntheticLambda1(z2 ? peekValue2.type : 0))) ? 3 : 0;
    }

    private static PropertyValuesHolder setY(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String str, int i) {
        int size;
        setCollapsedTitleTypeface setcollapsedtitletypeface;
        PropertyValuesHolder propertyValuesHolder = null;
        ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            } else if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = MenuHostHelper$$ExternalSyntheticLambda0(resources, theme, Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                Keyframe MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(context, resources, theme, Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(MenuHostHelper$$ExternalSyntheticLambda1);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList != null && (size = arrayList.size()) > 0) {
            Keyframe keyframe = (Keyframe) arrayList.get(0);
            Keyframe keyframe2 = (Keyframe) arrayList.get(size - 1);
            float fraction = keyframe2.getFraction();
            if (fraction < 1.0f) {
                if (fraction < 0.0f) {
                    keyframe2.setFraction(1.0f);
                } else {
                    arrayList.add(arrayList.size(), setX(keyframe2, 1.0f));
                    size++;
                }
            }
            float fraction2 = keyframe.getFraction();
            if (fraction2 != 0.0f) {
                if (fraction2 < 0.0f) {
                    keyframe.setFraction(0.0f);
                } else {
                    arrayList.add(0, setX(keyframe, 0.0f));
                    size++;
                }
            }
            Keyframe[] keyframeArr = new Keyframe[size];
            arrayList.toArray(keyframeArr);
            for (int i2 = 0; i2 < size; i2++) {
                Keyframe keyframe3 = keyframeArr[i2];
                if (keyframe3.getFraction() < 0.0f) {
                    if (i2 == 0) {
                        keyframe3.setFraction(0.0f);
                    } else {
                        int i3 = size - 1;
                        if (i2 == i3) {
                            keyframe3.setFraction(1.0f);
                        } else {
                            int i4 = i2;
                            for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                                i4 = i5;
                            }
                            MenuHostHelper$$ExternalSyntheticLambda1(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                        }
                    }
                }
            }
            propertyValuesHolder = PropertyValuesHolder.ofKeyframe(str, keyframeArr);
            if (i == 3) {
                setcollapsedtitletypeface = setCollapsedTitleTypeface.setIconTintList;
                propertyValuesHolder.setEvaluator(setcollapsedtitletypeface);
            }
        }
        return propertyValuesHolder;
    }

    private static Keyframe setX(Keyframe keyframe, float f) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt(f);
        }
        return Keyframe.ofObject(f);
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static Keyframe MenuHostHelper$$ExternalSyntheticLambda1(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int i, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes;
        Keyframe ofInt;
        int[] iArr = setClipToPadding.setIconTintList;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        float iconTintList = setHandwritingBoundsOffsets.setIconTintList(obtainStyledAttributes, xmlPullParser, "fraction", 3, -1.0f);
        TypedValue iconTintList2 = setHandwritingBoundsOffsets.setIconTintList(obtainStyledAttributes, xmlPullParser, "value");
        boolean z = iconTintList2 != null;
        if (i == 4) {
            i = (z && MenuHostHelper$$ExternalSyntheticLambda1(iconTintList2.type)) ? 3 : 0;
        }
        if (z) {
            if (i == 0) {
                ofInt = Keyframe.ofFloat(iconTintList, setHandwritingBoundsOffsets.setIconTintList(obtainStyledAttributes, xmlPullParser, "value", 0, 0.0f));
            } else {
                ofInt = (i == 1 || i == 3) ? Keyframe.ofInt(iconTintList, setHandwritingBoundsOffsets.setX(obtainStyledAttributes, xmlPullParser, "value", 0, 0)) : null;
            }
        } else if (i == 0) {
            ofInt = Keyframe.ofFloat(iconTintList);
        } else {
            ofInt = Keyframe.ofInt(iconTintList);
        }
        int MenuHostHelper$$ExternalSyntheticLambda1 = setHandwritingBoundsOffsets.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, xmlPullParser, "interpolator", 1);
        if (MenuHostHelper$$ExternalSyntheticLambda1 > 0) {
            ofInt.setInterpolator(setTrimPathOffset.setY(context, MenuHostHelper$$ExternalSyntheticLambda1));
        }
        obtainStyledAttributes.recycle();
        return ofInt;
    }

    private static ObjectAnimator MenuHostHelper$$ExternalSyntheticLambda0(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        MenuHostHelper$$ExternalSyntheticLambda0(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static ValueAnimator MenuHostHelper$$ExternalSyntheticLambda0(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes;
        TypedArray obtainStyledAttributes2;
        int[] iArr = setClipToPadding.setY;
        if (theme == null) {
            obtainStyledAttributes = resources.obtainAttributes(attributeSet, iArr);
        } else {
            obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        }
        int[] iArr2 = setClipToPadding.setOnLongClickListener;
        if (theme == null) {
            obtainStyledAttributes2 = resources.obtainAttributes(attributeSet, iArr2);
        } else {
            obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr2, 0, 0);
        }
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        setX(valueAnimator, obtainStyledAttributes, obtainStyledAttributes2, f, xmlPullParser);
        int MenuHostHelper$$ExternalSyntheticLambda1 = setHandwritingBoundsOffsets.MenuHostHelper$$ExternalSyntheticLambda1(obtainStyledAttributes, xmlPullParser, "interpolator", 0);
        if (MenuHostHelper$$ExternalSyntheticLambda1 > 0) {
            valueAnimator.setInterpolator(setTrimPathOffset.setY(context, MenuHostHelper$$ExternalSyntheticLambda1));
        }
        obtainStyledAttributes.recycle();
        if (obtainStyledAttributes2 != null) {
            obtainStyledAttributes2.recycle();
        }
        return valueAnimator;
    }
}