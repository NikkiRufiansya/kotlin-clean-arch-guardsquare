package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import o.setAnimationFromJson;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setAllowedHandwritingDelegatorPackage {
    private final TextView setCenterIfNoTextEnabled;
    private final setIconTintList setIconSize;
    private final Context setLayoutAnimation;
    private TextPaint setTextAlignment;
    private static final RectF MenuHostHelper$$ExternalSyntheticLambda0 = new RectF();
    private static ConcurrentHashMap<String, Method> setY = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Field> MenuHostHelper$$ExternalSyntheticLambda1 = new ConcurrentHashMap<>();
    private int setUnboundedRipple = 0;
    private boolean ViewPager$SavedState$1 = false;
    private float setUiOptions = -1.0f;
    private float setX = -1.0f;
    private float setIconTintList = -1.0f;
    private int[] setOnLongClickListener = new int[0];
    private boolean setNavigationOnClickListener = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda1(StaticLayout.Builder builder, TextView textView) {
        }

        boolean setX(TextView textView) {
            return ((Boolean) setAllowedHandwritingDelegatorPackage.MenuHostHelper$$ExternalSyntheticLambda0(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    static class setUiOptions extends setAllowedHandwritingDelegatorPackage$MenuHostHelper$$ExternalSyntheticLambda0 {
        setUiOptions() {
        }

        @Override // o.setAllowedHandwritingDelegatorPackage.setIconTintList
        boolean setX(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }

        @Override // o.setAllowedHandwritingDelegatorPackage$MenuHostHelper$$ExternalSyntheticLambda0, o.setAllowedHandwritingDelegatorPackage.setIconTintList
        void MenuHostHelper$$ExternalSyntheticLambda1(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setAllowedHandwritingDelegatorPackage(TextView textView) {
        this.setCenterIfNoTextEnabled = textView;
        this.setLayoutAnimation = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.setIconSize = new setUiOptions();
        } else if (Build.VERSION.SDK_INT >= 23) {
            this.setIconSize = new setAllowedHandwritingDelegatorPackage$MenuHostHelper$$ExternalSyntheticLambda0();
        } else {
            this.setIconSize = new setIconTintList();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(AttributeSet attributeSet, int i) {
        int resourceId;
        TypedArray obtainStyledAttributes = this.setLayoutAnimation.obtainStyledAttributes(attributeSet, setAnimationFromJson.setY.setRevealInfo, i, 0);
        TextView textView = this.setCenterIfNoTextEnabled;
        setBaselineAlignBottom.setY(textView, textView.getContext(), setAnimationFromJson.setY.setRevealInfo, attributeSet, obtainStyledAttributes, i, 0);
        if (obtainStyledAttributes.hasValue(setAnimationFromJson.setY.setNavigationIconTint)) {
            this.setUnboundedRipple = obtainStyledAttributes.getInt(setAnimationFromJson.setY.setNavigationIconTint, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(setAnimationFromJson.setY.createDispatcher) ? obtainStyledAttributes.getDimension(setAnimationFromJson.setY.createDispatcher, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(setAnimationFromJson.setY.setCloseIconEndPadding) ? obtainStyledAttributes.getDimension(setAnimationFromJson.setY.setCloseIconEndPadding, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(setAnimationFromJson.setY.FabTransformationBehavior) ? obtainStyledAttributes.getDimension(setAnimationFromJson.setY.FabTransformationBehavior, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(setAnimationFromJson.setY.Fragment$5) && (resourceId = obtainStyledAttributes.getResourceId(setAnimationFromJson.setY.Fragment$5, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            MenuHostHelper$$ExternalSyntheticLambda0(obtainTypedArray);
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (setChipCornerRadius()) {
            if (this.setUnboundedRipple == 1) {
                if (!this.setNavigationOnClickListener) {
                    DisplayMetrics displayMetrics = this.setLayoutAnimation.getResources().getDisplayMetrics();
                    if (dimension2 == -1.0f) {
                        dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    }
                    if (dimension3 == -1.0f) {
                        dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                    }
                    if (dimension == -1.0f) {
                        dimension = 1.0f;
                    }
                    MenuHostHelper$$ExternalSyntheticLambda1(dimension2, dimension3, dimension);
                }
                setUnboundedRipple();
                return;
            }
            return;
        }
        this.setUnboundedRipple = 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setX(int i) {
        if (setChipCornerRadius()) {
            if (i == 0) {
                setOnLongClickListener();
            } else if (i == 1) {
                DisplayMetrics displayMetrics = this.setLayoutAnimation.getResources().getDisplayMetrics();
                MenuHostHelper$$ExternalSyntheticLambda1(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                if (setUnboundedRipple()) {
                    setIconTintList();
                }
            } else {
                StringBuilder sb = new StringBuilder("Unknown auto-size text type: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setY(int i, int i2, int i3, int i4) {
        if (setChipCornerRadius()) {
            DisplayMetrics displayMetrics = this.setLayoutAnimation.getResources().getDisplayMetrics();
            MenuHostHelper$$ExternalSyntheticLambda1(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (setUnboundedRipple()) {
                setIconTintList();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0(int[] iArr, int i) {
        if (setChipCornerRadius()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.setLayoutAnimation.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                this.setOnLongClickListener = setX(iArr2);
                if (!setUiOptions()) {
                    StringBuilder sb = new StringBuilder("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.setNavigationOnClickListener = false;
            }
            if (setUnboundedRipple()) {
                setIconTintList();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setLayoutAnimation() {
        return this.setUnboundedRipple;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int MenuHostHelper$$ExternalSyntheticLambda0() {
        return Math.round(this.setUiOptions);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int MenuHostHelper$$ExternalSyntheticLambda1() {
        return Math.round(this.setX);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int setX() {
        return Math.round(this.setIconTintList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int[] setY() {
        return this.setOnLongClickListener;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                iArr[i] = typedArray.getDimensionPixelSize(i, -1);
            }
            this.setOnLongClickListener = setX(iArr);
            setUiOptions();
        }
    }

    private boolean setUiOptions() {
        int[] iArr = this.setOnLongClickListener;
        int length = iArr.length;
        boolean z = length > 0;
        this.setNavigationOnClickListener = z;
        if (z) {
            this.setUnboundedRipple = 1;
            this.setX = iArr[0];
            this.setIconTintList = iArr[length - 1];
            this.setUiOptions = -1.0f;
        }
        return z;
    }

    private int[] setX(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 <= 0.0f) {
            StringBuilder sb3 = new StringBuilder("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        } else {
            this.setUnboundedRipple = 1;
            this.setX = f;
            this.setIconTintList = f2;
            this.setUiOptions = f3;
            this.setNavigationOnClickListener = false;
        }
    }

    private boolean setUnboundedRipple() {
        if (setChipCornerRadius() && this.setUnboundedRipple == 1) {
            if (!this.setNavigationOnClickListener || this.setOnLongClickListener.length == 0) {
                int floor = ((int) Math.floor((this.setIconTintList - this.setX) / this.setUiOptions)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round(this.setX + (i * this.setUiOptions));
                }
                this.setOnLongClickListener = setX(iArr);
            }
            this.ViewPager$SavedState$1 = true;
        } else {
            this.ViewPager$SavedState$1 = false;
        }
        return this.ViewPager$SavedState$1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList() {
        int measuredWidth;
        if (setNavigationOnClickListener()) {
            if (this.ViewPager$SavedState$1) {
                if (this.setCenterIfNoTextEnabled.getMeasuredHeight() <= 0 || this.setCenterIfNoTextEnabled.getMeasuredWidth() <= 0) {
                    return;
                }
                if (this.setIconSize.setX(this.setCenterIfNoTextEnabled)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.setCenterIfNoTextEnabled.getMeasuredWidth() - this.setCenterIfNoTextEnabled.getTotalPaddingLeft()) - this.setCenterIfNoTextEnabled.getTotalPaddingRight();
                }
                int height = (this.setCenterIfNoTextEnabled.getHeight() - this.setCenterIfNoTextEnabled.getCompoundPaddingBottom()) - this.setCenterIfNoTextEnabled.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = MenuHostHelper$$ExternalSyntheticLambda0;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float y = setY(rectF);
                    if (y != this.setCenterIfNoTextEnabled.getTextSize()) {
                        MenuHostHelper$$ExternalSyntheticLambda1(0, y);
                    }
                }
            }
            this.ViewPager$SavedState$1 = true;
        }
    }

    private void setOnLongClickListener() {
        this.setUnboundedRipple = 0;
        this.setX = -1.0f;
        this.setIconTintList = -1.0f;
        this.setUiOptions = -1.0f;
        this.setOnLongClickListener = new int[0];
        this.ViewPager$SavedState$1 = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda1(int i, float f) {
        Resources resources;
        Context context = this.setLayoutAnimation;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        setX(TypedValue.applyDimension(i, f, resources.getDisplayMetrics()));
    }

    private void setX(float f) {
        if (f != this.setCenterIfNoTextEnabled.getPaint().getTextSize()) {
            this.setCenterIfNoTextEnabled.getPaint().setTextSize(f);
            boolean x = setAllowedHandwritingDelegatorPackage$MenuHostHelper$$ExternalSyntheticLambda1.setX(this.setCenterIfNoTextEnabled);
            if (this.setCenterIfNoTextEnabled.getLayout() != null) {
                this.ViewPager$SavedState$1 = false;
                try {
                    Method MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0("nullLayouts");
                    if (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
                        MenuHostHelper$$ExternalSyntheticLambda02.invoke(this.setCenterIfNoTextEnabled, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!x) {
                    this.setCenterIfNoTextEnabled.requestLayout();
                } else {
                    this.setCenterIfNoTextEnabled.forceLayout();
                }
                this.setCenterIfNoTextEnabled.invalidate();
            }
        }
    }

    private int setY(RectF rectF) {
        int length = this.setOnLongClickListener.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = 1;
        int i2 = length - 1;
        int i3 = 0;
        while (i <= i2) {
            int i4 = (i + i2) / 2;
            if (setX(this.setOnLongClickListener[i4], rectF)) {
                int i5 = i4 + 1;
                i3 = i;
                i = i5;
            } else {
                i3 = i4 - 1;
                i2 = i3;
            }
        }
        return this.setOnLongClickListener[i3];
    }

    void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        TextPaint textPaint = this.setTextAlignment;
        if (textPaint == null) {
            this.setTextAlignment = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.setTextAlignment.set(this.setCenterIfNoTextEnabled.getPaint());
        this.setTextAlignment.setTextSize(i);
    }

    StaticLayout MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence, Layout.Alignment alignment, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return setY.MenuHostHelper$$ExternalSyntheticLambda1(charSequence, alignment, i, i2, this.setCenterIfNoTextEnabled, this.setTextAlignment, this.setIconSize);
        }
        return setX.MenuHostHelper$$ExternalSyntheticLambda1(charSequence, alignment, i, this.setCenterIfNoTextEnabled, this.setTextAlignment);
    }

    private boolean setX(int i, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.setCenterIfNoTextEnabled.getText();
        TransformationMethod transformationMethod = this.setCenterIfNoTextEnabled.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.setCenterIfNoTextEnabled)) != null) {
            text = transformation;
        }
        int x = setX.setX(this.setCenterIfNoTextEnabled);
        MenuHostHelper$$ExternalSyntheticLambda0(i);
        StaticLayout MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(text, (Layout.Alignment) MenuHostHelper$$ExternalSyntheticLambda0(this.setCenterIfNoTextEnabled, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), x);
        return (x == -1 || (MenuHostHelper$$ExternalSyntheticLambda12.getLineCount() <= x && MenuHostHelper$$ExternalSyntheticLambda12.getLineEnd(MenuHostHelper$$ExternalSyntheticLambda12.getLineCount() - 1) == text.length())) && ((float) MenuHostHelper$$ExternalSyntheticLambda12.getHeight()) <= rectF.bottom;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T MenuHostHelper$$ExternalSyntheticLambda0(Object obj, String str, T t) {
        try {
            return (T) MenuHostHelper$$ExternalSyntheticLambda0(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed to invoke TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return t;
        }
    }

    private static Method MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        try {
            Method method = setY.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                setY.put(str, method);
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean setNavigationOnClickListener() {
        return setChipCornerRadius() && this.setUnboundedRipple != 0;
    }

    private boolean setChipCornerRadius() {
        return !(this.setCenterIfNoTextEnabled instanceof setSystemUiVisibility);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY {
        static StaticLayout MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence, Layout.Alignment alignment, int i, int i2, TextView textView, TextPaint textPaint, setIconTintList seticontintlist) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i2 == -1) {
                i2 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i2);
            try {
                seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX {
        static int setX(TextView textView) {
            return textView.getMaxLines();
        }

        static StaticLayout MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence, Layout.Alignment alignment, int i, TextView textView, TextPaint textPaint) {
            return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        }
    }
}