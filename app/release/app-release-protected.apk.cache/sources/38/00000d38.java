package o;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.setJustificationMode;

/* loaded from: classes.dex */
public final class setLongClickable extends setEndIconCheckable {
    private final Paint ViewPager$SavedState$1;
    private final StringBuilder setAnimationFromJson;
    private final Map<setImageBitmap, List<setFastScrollStyle>> setCenterIfNoTextEnabled;
    private setSubtitleTextAppearance<Float, Float> setCheckedIconEnabled;
    private final setPointerIcon setChipCornerRadius;
    private setSubtitleTextAppearance<Float, Float> setGuidelinePercent;
    private setSubtitleTextAppearance<Float, Float> setHasDecor;
    private final setBoxStrokeErrorColor setIconSize;
    private setSubtitleTextAppearance<Float, Float> setIconified;
    private setSubtitleTextAppearance<Integer, Integer> setLayoutAnimation;
    private setSubtitleTextAppearance<Float, Float> setLayoutDirection;
    private final Paint setMaxEms;
    private setSubtitleTextAppearance<Float, Float> setMinAndMaxProgress;
    private final setPrefixTextAppearance<String> setNavigationOnClickListener;
    private setSubtitleTextAppearance<Integer, Integer> setOnNavigationItemSelectedListener;
    private final Matrix setTextAlignment;
    private final setPasswordVisibilityToggleTintMode setTextAppearanceResource;
    private final RectF setTextScaleX;
    private setSubtitleTextAppearance<Integer, Integer> setUiOptions;
    private setSubtitleTextAppearance<Integer, Integer> setZ;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setLongClickable(setPointerIcon setpointericon, setSimpleItems setsimpleitems) {
        super(setpointericon, setsimpleitems);
        this.setAnimationFromJson = new StringBuilder(2);
        this.setTextScaleX = new RectF();
        this.setTextAlignment = new Matrix();
        this.ViewPager$SavedState$1 = new Paint() { // from class: o.setLongClickable.5
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.setMaxEms = new Paint() { // from class: o.setLongClickable.3
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.setCenterIfNoTextEnabled = new HashMap();
        this.setNavigationOnClickListener = new setPrefixTextAppearance<>();
        this.setChipCornerRadius = setpointericon;
        this.setIconSize = setsimpleitems.setY;
        setPasswordVisibilityToggleTintMode setpasswordvisibilitytoggletintmode = new setPasswordVisibilityToggleTintMode(setsimpleitems.setMaxEms.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setTextAppearanceResource = setpasswordvisibilitytoggletintmode;
        setpasswordvisibilitytoggletintmode.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        this.setX.add(setpasswordvisibilitytoggletintmode);
        setLines setlines = setsimpleitems.setZ;
        if (setlines != null && setlines.setIconTintList != null) {
            setOverScrollMode setoverscrollmode = new setOverScrollMode(setlines.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda1);
            this.setLayoutAnimation = setoverscrollmode;
            setoverscrollmode.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance = this.setLayoutAnimation;
            if (setsubtitletextappearance != null) {
                this.setX.add(setsubtitletextappearance);
            }
        }
        if (setlines != null && setlines.setX != null) {
            setOverScrollMode setoverscrollmode2 = new setOverScrollMode(setlines.setX.MenuHostHelper$$ExternalSyntheticLambda1);
            this.setZ = setoverscrollmode2;
            setoverscrollmode2.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance2 = this.setZ;
            if (setsubtitletextappearance2 != null) {
                this.setX.add(setsubtitletextappearance2);
            }
        }
        if (setlines != null && setlines.MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            setOnTouchListener setontouchlistener = new setOnTouchListener(setlines.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1);
            this.setGuidelinePercent = setontouchlistener;
            setontouchlistener.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance3 = this.setGuidelinePercent;
            if (setsubtitletextappearance3 != null) {
                this.setX.add(setsubtitletextappearance3);
            }
        }
        if (setlines == null || setlines.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return;
        }
        setOnTouchListener setontouchlistener2 = new setOnTouchListener(setlines.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1);
        this.setIconified = setontouchlistener2;
        setontouchlistener2.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
        setSubtitleTextAppearance<Float, Float> setsubtitletextappearance4 = this.setIconified;
        if (setsubtitletextappearance4 != null) {
            this.setX.add(setsubtitletextappearance4);
        }
    }

    @Override // o.setEndIconCheckable, o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(RectF rectF, Matrix matrix, boolean z) {
        super.setIconTintList(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0.width(), this.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0.height());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v10, types: [T, java.lang.Object, java.lang.String] */
    @Override // o.setEndIconCheckable
    final void MenuHostHelper$$ExternalSyntheticLambda1(Canvas canvas, Matrix matrix, int i) {
        setBreakStrategy setbreakstrategy;
        Typeface typeface;
        float f;
        List list;
        String obj;
        float floatValue;
        float f2;
        float f3;
        List list2;
        int i2;
        List<setFastScrollStyle> list3;
        float floatValue2;
        int i3;
        String str;
        float f4;
        canvas.save();
        setPointerIcon setpointericon = this.setChipCornerRadius;
        if (!(setpointericon.setMaxEms == null && setpointericon.setY.setY.setY() > 0)) {
            canvas.setMatrix(matrix);
        }
        setJustificationMode onLongClickListener = this.setTextAppearanceResource.setOnLongClickListener();
        setThumbOffset setthumboffset = this.setIconSize.setX.get(onLongClickListener.setX);
        if (setthumboffset == null) {
            canvas.restore();
            return;
        }
        setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance = this.setUiOptions;
        if (setsubtitletextappearance != null) {
            this.ViewPager$SavedState$1.setColor(setsubtitletextappearance.setOnLongClickListener().intValue());
        } else {
            setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance2 = this.setLayoutAnimation;
            if (setsubtitletextappearance2 != null) {
                this.ViewPager$SavedState$1.setColor(setsubtitletextappearance2.setOnLongClickListener().intValue());
            } else {
                this.ViewPager$SavedState$1.setColor(onLongClickListener.setIconTintList);
            }
        }
        setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance3 = this.setOnNavigationItemSelectedListener;
        if (setsubtitletextappearance3 != null) {
            this.setMaxEms.setColor(setsubtitletextappearance3.setOnLongClickListener().intValue());
        } else {
            setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance4 = this.setZ;
            if (setsubtitletextappearance4 != null) {
                this.setMaxEms.setColor(setsubtitletextappearance4.setOnLongClickListener().intValue());
            } else {
                this.setMaxEms.setColor(onLongClickListener.setUnboundedRipple);
            }
        }
        int intValue = ((this.setUnboundedRipple.setX == null ? 100 : this.setUnboundedRipple.setX.setOnLongClickListener().intValue()) * 255) / 100;
        this.ViewPager$SavedState$1.setAlpha(intValue);
        this.setMaxEms.setAlpha(intValue);
        setSubtitleTextAppearance<Float, Float> setsubtitletextappearance5 = this.setMinAndMaxProgress;
        if (setsubtitletextappearance5 != null) {
            this.setMaxEms.setStrokeWidth(setsubtitletextappearance5.setOnLongClickListener().floatValue());
        } else {
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance6 = this.setGuidelinePercent;
            if (setsubtitletextappearance6 != null) {
                this.setMaxEms.setStrokeWidth(setsubtitletextappearance6.setOnLongClickListener().floatValue());
            } else {
                this.setMaxEms.setStrokeWidth(onLongClickListener.setNavigationOnClickListener * setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0() * setOnPageChangeListener.setY(matrix));
            }
        }
        setPointerIcon setpointericon2 = this.setChipCornerRadius;
        if (setpointericon2.setMaxEms == null && setpointericon2.setY.setY.setY() > 0) {
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance7 = this.setCheckedIconEnabled;
            if (setsubtitletextappearance7 != null) {
                f2 = setsubtitletextappearance7.setOnLongClickListener().floatValue();
            } else {
                f2 = onLongClickListener.setOnLongClickListener;
            }
            float f5 = f2 / 100.0f;
            float y = setOnPageChangeListener.setY(matrix);
            String str2 = onLongClickListener.setUiOptions;
            float MenuHostHelper$$ExternalSyntheticLambda0 = onLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0 * setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0();
            List asList = Arrays.asList(str2.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
            int size = asList.size();
            int i4 = 0;
            while (i4 < size) {
                String str3 = (String) asList.get(i4);
                float f6 = 0.0f;
                int i5 = 0;
                while (i5 < str3.length()) {
                    setImageBitmap x = this.setIconSize.setY.setX((((str3.charAt(i5) * 31) + setthumboffset.MenuHostHelper$$ExternalSyntheticLambda0.hashCode()) * 31) + setthumboffset.setX.hashCode());
                    if (x != null) {
                        i3 = i4;
                        double d = x.setX;
                        str = str3;
                        f4 = MenuHostHelper$$ExternalSyntheticLambda0;
                        f6 = (float) (f6 + (d * f5 * setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0() * y));
                    } else {
                        i3 = i4;
                        str = str3;
                        f4 = MenuHostHelper$$ExternalSyntheticLambda0;
                    }
                    i5++;
                    MenuHostHelper$$ExternalSyntheticLambda0 = f4;
                    i4 = i3;
                    str3 = str;
                }
                int i6 = i4;
                String str4 = str3;
                float f7 = MenuHostHelper$$ExternalSyntheticLambda0;
                canvas.save();
                MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1, canvas, f6);
                canvas.translate(0.0f, (i6 * f7) - (((size - 1) * f7) / 2.0f));
                int i7 = 0;
                while (i7 < str4.length()) {
                    String str5 = str4;
                    setImageBitmap x2 = this.setIconSize.setY.setX((((str5.charAt(i7) * 31) + setthumboffset.MenuHostHelper$$ExternalSyntheticLambda0.hashCode()) * 31) + setthumboffset.setX.hashCode());
                    if (x2 != null) {
                        if (this.setCenterIfNoTextEnabled.containsKey(x2)) {
                            list3 = this.setCenterIfNoTextEnabled.get(x2);
                            f3 = f7;
                            list2 = asList;
                            i2 = size;
                        } else {
                            List<setEndIconOnClickListener> list4 = x2.MenuHostHelper$$ExternalSyntheticLambda0;
                            int size2 = list4.size();
                            ArrayList arrayList = new ArrayList(size2);
                            f3 = f7;
                            int i8 = 0;
                            while (i8 < size2) {
                                arrayList.add(new setFastScrollStyle(this.setChipCornerRadius, this, list4.get(i8)));
                                i8++;
                                size = size;
                                asList = asList;
                                list4 = list4;
                            }
                            list2 = asList;
                            i2 = size;
                            this.setCenterIfNoTextEnabled.put(x2, arrayList);
                            list3 = arrayList;
                        }
                        int i9 = 0;
                        while (i9 < list3.size()) {
                            Path x3 = list3.get(i9).setX();
                            x3.computeBounds(this.setTextScaleX, false);
                            this.setTextAlignment.set(matrix);
                            List<setFastScrollStyle> list5 = list3;
                            this.setTextAlignment.preTranslate(0.0f, (-onLongClickListener.setY) * setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0());
                            this.setTextAlignment.preScale(f5, f5);
                            x3.transform(this.setTextAlignment);
                            if (onLongClickListener.setLayoutAnimation) {
                                setY(x3, this.ViewPager$SavedState$1, canvas);
                                setY(x3, this.setMaxEms, canvas);
                            } else {
                                setY(x3, this.setMaxEms, canvas);
                                setY(x3, this.ViewPager$SavedState$1, canvas);
                            }
                            i9++;
                            list3 = list5;
                        }
                        float f8 = (float) x2.setX;
                        float MenuHostHelper$$ExternalSyntheticLambda02 = setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0();
                        float f9 = onLongClickListener.ViewPager$SavedState$1 / 10.0f;
                        setSubtitleTextAppearance<Float, Float> setsubtitletextappearance8 = this.setHasDecor;
                        if (setsubtitletextappearance8 != null) {
                            floatValue2 = setsubtitletextappearance8.setOnLongClickListener().floatValue();
                        } else {
                            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance9 = this.setIconified;
                            if (setsubtitletextappearance9 != null) {
                                floatValue2 = setsubtitletextappearance9.setOnLongClickListener().floatValue();
                            }
                            canvas.translate((f8 * f5 * MenuHostHelper$$ExternalSyntheticLambda02 * y) + (f9 * y), 0.0f);
                        }
                        f9 += floatValue2;
                        canvas.translate((f8 * f5 * MenuHostHelper$$ExternalSyntheticLambda02 * y) + (f9 * y), 0.0f);
                    } else {
                        f3 = f7;
                        list2 = asList;
                        i2 = size;
                    }
                    i7++;
                    f7 = f3;
                    size = i2;
                    asList = list2;
                    str4 = str5;
                }
                canvas.restore();
                i4 = i6 + 1;
                MenuHostHelper$$ExternalSyntheticLambda0 = f7;
            }
        } else {
            float y2 = setOnPageChangeListener.setY(matrix);
            setPointerIcon setpointericon3 = this.setChipCornerRadius;
            ?? r7 = setthumboffset.MenuHostHelper$$ExternalSyntheticLambda0;
            ?? r3 = setthumboffset.setX;
            if (setpointericon3.getCallback() == null) {
                setbreakstrategy = null;
            } else {
                if (setpointericon3.setOnLongClickListener == null) {
                    setpointericon3.setOnLongClickListener = new setBreakStrategy(setpointericon3.getCallback(), setpointericon3.MenuHostHelper$$ExternalSyntheticLambda1);
                }
                setbreakstrategy = setpointericon3.setOnLongClickListener;
            }
            if (setbreakstrategy != null) {
                inset<String> insetVar = setbreakstrategy.setUnboundedRipple;
                insetVar.setY = r7;
                insetVar.MenuHostHelper$$ExternalSyntheticLambda0 = r3;
                typeface = setbreakstrategy.setIconTintList.get(setbreakstrategy.setUnboundedRipple);
                if (typeface == null) {
                    typeface = setbreakstrategy.setX.get(r7);
                    if (typeface == null) {
                        setInputMethodMode setinputmethodmode = setbreakstrategy.MenuHostHelper$$ExternalSyntheticLambda1;
                        setInputMethodMode setinputmethodmode2 = setbreakstrategy.MenuHostHelper$$ExternalSyntheticLambda1;
                        StringBuilder sb = new StringBuilder("fonts/");
                        sb.append((String) r7);
                        sb.append(setbreakstrategy.setY);
                        typeface = Typeface.createFromAsset(setbreakstrategy.MenuHostHelper$$ExternalSyntheticLambda0, sb.toString());
                        setbreakstrategy.setX.put(r7, typeface);
                    }
                    boolean contains = r3.contains("Italic");
                    boolean contains2 = r3.contains("Bold");
                    int i10 = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
                    if (typeface.getStyle() != i10) {
                        typeface = Typeface.create(typeface, i10);
                    }
                    setbreakstrategy.setIconTintList.put(setbreakstrategy.setUnboundedRipple, typeface);
                }
            } else {
                typeface = null;
            }
            if (typeface != null) {
                String str6 = onLongClickListener.setUiOptions;
                setCameraDistance setcameradistance = this.setChipCornerRadius.setMaxEms;
                if (setcameradistance != null) {
                    if (setcameradistance.setY && setcameradistance.MenuHostHelper$$ExternalSyntheticLambda1.containsKey(str6)) {
                        str6 = setcameradistance.MenuHostHelper$$ExternalSyntheticLambda1.get(str6);
                    } else if (setcameradistance.setY) {
                        setcameradistance.MenuHostHelper$$ExternalSyntheticLambda1.put(str6, str6);
                    }
                }
                this.ViewPager$SavedState$1.setTypeface(typeface);
                setSubtitleTextAppearance<Float, Float> setsubtitletextappearance10 = this.setCheckedIconEnabled;
                if (setsubtitletextappearance10 != null) {
                    f = setsubtitletextappearance10.setOnLongClickListener().floatValue();
                } else {
                    f = onLongClickListener.setOnLongClickListener;
                }
                this.ViewPager$SavedState$1.setTextSize(f * setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0());
                this.setMaxEms.setTypeface(this.ViewPager$SavedState$1.getTypeface());
                this.setMaxEms.setTextSize(this.ViewPager$SavedState$1.getTextSize());
                float MenuHostHelper$$ExternalSyntheticLambda03 = onLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0 * setOnPageChangeListener.MenuHostHelper$$ExternalSyntheticLambda0();
                List asList2 = Arrays.asList(str6.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = asList2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    String str7 = (String) asList2.get(i11);
                    MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1, canvas, this.setMaxEms.measureText(str7));
                    canvas.translate(0.0f, (i11 * MenuHostHelper$$ExternalSyntheticLambda03) - (((size3 - 1) * MenuHostHelper$$ExternalSyntheticLambda03) / 2.0f));
                    int i12 = 0;
                    while (i12 < str7.length()) {
                        int codePointAt = str7.codePointAt(i12);
                        int charCount = Character.charCount(codePointAt) + i12;
                        while (charCount < str7.length()) {
                            int codePointAt2 = str7.codePointAt(charCount);
                            if (!(Character.getType(codePointAt2) == 16 || Character.getType(codePointAt2) == 27 || Character.getType(codePointAt2) == 6 || Character.getType(codePointAt2) == 28 || Character.getType(codePointAt2) == 19)) {
                                break;
                            }
                            charCount += Character.charCount(codePointAt2);
                            codePointAt = (codePointAt * 31) + codePointAt2;
                        }
                        setPrefixTextAppearance<String> setprefixtextappearance = this.setNavigationOnClickListener;
                        long j = codePointAt;
                        if (setprefixtextappearance.setIconTintList) {
                            setprefixtextappearance.setIconTintList();
                        }
                        if (!(setStatusBarBackground.setY(setprefixtextappearance.MenuHostHelper$$ExternalSyntheticLambda0, setprefixtextappearance.setX, j) >= 0)) {
                            this.setAnimationFromJson.setLength(0);
                            int i13 = i12;
                            while (i13 < charCount) {
                                int codePointAt3 = str7.codePointAt(i13);
                                this.setAnimationFromJson.appendCodePoint(codePointAt3);
                                i13 += Character.charCount(codePointAt3);
                                asList2 = asList2;
                            }
                            list = asList2;
                            obj = this.setAnimationFromJson.toString();
                            this.setNavigationOnClickListener.setX(j, obj);
                        } else {
                            obj = this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(j, null);
                            list = asList2;
                        }
                        i12 += obj.length();
                        if (onLongClickListener.setLayoutAnimation) {
                            setX(obj, this.ViewPager$SavedState$1, canvas);
                            setX(obj, this.setMaxEms, canvas);
                        } else {
                            setX(obj, this.setMaxEms, canvas);
                            setX(obj, this.ViewPager$SavedState$1, canvas);
                        }
                        float measureText = this.ViewPager$SavedState$1.measureText(obj, 0, 1);
                        float f10 = onLongClickListener.ViewPager$SavedState$1 / 10.0f;
                        setSubtitleTextAppearance<Float, Float> setsubtitletextappearance11 = this.setHasDecor;
                        if (setsubtitletextappearance11 != null) {
                            floatValue = setsubtitletextappearance11.setOnLongClickListener().floatValue();
                        } else {
                            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance12 = this.setIconified;
                            if (setsubtitletextappearance12 != null) {
                                floatValue = setsubtitletextappearance12.setOnLongClickListener().floatValue();
                            } else {
                                canvas.translate(measureText + (f10 * y2), 0.0f);
                                asList2 = list;
                            }
                        }
                        f10 += floatValue;
                        canvas.translate(measureText + (f10 * y2), 0.0f);
                        asList2 = list;
                    }
                    canvas.setMatrix(matrix);
                }
            }
        }
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setLongClickable$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[setJustificationMode.setX.values().length];
            setY = iArr;
            try {
                iArr[setJustificationMode.setX.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setY[setJustificationMode.setX.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setY[setJustificationMode.setX.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda0(setJustificationMode.setX setx, Canvas canvas, float f) {
        int i = AnonymousClass1.setY[setx.ordinal()];
        if (i == 2) {
            canvas.translate(-f, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f) / 2.0f, 0.0f);
        }
    }

    private static void setY(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static void setX(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    @Override // o.setEndIconCheckable, o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(t, setprompt);
        if (t == setItemViewCacheSize.setIconTintList) {
            setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance = this.setUiOptions;
            if (setsubtitletextappearance != null) {
                this.setX.remove(setsubtitletextappearance);
            }
            if (setprompt == null) {
                this.setUiOptions = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled = new setExtraMultilineHeightEnabled(setprompt);
            this.setUiOptions = setextramultilineheightenabled;
            setextramultilineheightenabled.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance2 = this.setUiOptions;
            if (setsubtitletextappearance2 != null) {
                this.setX.add(setsubtitletextappearance2);
            }
        } else if (t == setItemViewCacheSize.setZ) {
            setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance3 = this.setOnNavigationItemSelectedListener;
            if (setsubtitletextappearance3 != null) {
                this.setX.remove(setsubtitletextappearance3);
            }
            if (setprompt == null) {
                this.setOnNavigationItemSelectedListener = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled2 = new setExtraMultilineHeightEnabled(setprompt);
            this.setOnNavigationItemSelectedListener = setextramultilineheightenabled2;
            setextramultilineheightenabled2.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance4 = this.setOnNavigationItemSelectedListener;
            if (setsubtitletextappearance4 != null) {
                this.setX.add(setsubtitletextappearance4);
            }
        } else if (t == setItemViewCacheSize.setTextScaleX) {
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance5 = this.setMinAndMaxProgress;
            if (setsubtitletextappearance5 != null) {
                this.setX.remove(setsubtitletextappearance5);
            }
            if (setprompt == null) {
                this.setMinAndMaxProgress = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled3 = new setExtraMultilineHeightEnabled(setprompt);
            this.setMinAndMaxProgress = setextramultilineheightenabled3;
            setextramultilineheightenabled3.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance6 = this.setMinAndMaxProgress;
            if (setsubtitletextappearance6 != null) {
                this.setX.add(setsubtitletextappearance6);
            }
        } else if (t == setItemViewCacheSize.setAnimationFromJson) {
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance7 = this.setHasDecor;
            if (setsubtitletextappearance7 != null) {
                this.setX.remove(setsubtitletextappearance7);
            }
            if (setprompt == null) {
                this.setHasDecor = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled4 = new setExtraMultilineHeightEnabled(setprompt);
            this.setHasDecor = setextramultilineheightenabled4;
            setextramultilineheightenabled4.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance8 = this.setHasDecor;
            if (setsubtitletextappearance8 != null) {
                this.setX.add(setsubtitletextappearance8);
            }
        } else if (t == setItemViewCacheSize.setOnNavigationItemSelectedListener) {
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance9 = this.setCheckedIconEnabled;
            if (setsubtitletextappearance9 != null) {
                this.setX.remove(setsubtitletextappearance9);
            }
            if (setprompt == null) {
                this.setCheckedIconEnabled = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled5 = new setExtraMultilineHeightEnabled(setprompt);
            this.setCheckedIconEnabled = setextramultilineheightenabled5;
            setextramultilineheightenabled5.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setSubtitleTextAppearance<Float, Float> setsubtitletextappearance10 = this.setCheckedIconEnabled;
            if (setsubtitletextappearance10 != null) {
                this.setX.add(setsubtitletextappearance10);
            }
        }
    }
}