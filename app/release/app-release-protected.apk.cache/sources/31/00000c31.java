package o;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import o.setAllowStacking;

/* loaded from: classes.dex */
public class setHighlights implements Spannable {
    private static final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    private final setX MenuHostHelper$$ExternalSyntheticLambda0;
    private final Spannable setIconTintList;
    private final PrecomputedText setX;

    /* loaded from: classes.dex */
    public static final class setX {
        private final TextDirectionHeuristic MenuHostHelper$$ExternalSyntheticLambda0;
        private final int MenuHostHelper$$ExternalSyntheticLambda1;
        private final int setIconTintList;
        private final TextPaint setX;
        final PrecomputedText.Params setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            PrecomputedText.Params.Builder breakStrategy;
            PrecomputedText.Params.Builder hyphenationFrequency;
            PrecomputedText.Params.Builder textDirection;
            PrecomputedText.Params build;
            if (Build.VERSION.SDK_INT >= 29) {
                breakStrategy = setErrorIconDrawable.MenuHostHelper$$ExternalSyntheticLambda0(textPaint).setBreakStrategy(i);
                hyphenationFrequency = breakStrategy.setHyphenationFrequency(i2);
                textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
                build = textDirection.build();
                this.setY = build;
            } else {
                this.setY = null;
            }
            this.setX = textPaint;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = textDirectionHeuristic;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            this.setIconTintList = i2;
        }

        public setX(PrecomputedText.Params params) {
            TextPaint textPaint;
            TextDirectionHeuristic textDirection;
            int breakStrategy;
            int hyphenationFrequency;
            textPaint = params.getTextPaint();
            this.setX = textPaint;
            textDirection = params.getTextDirection();
            this.MenuHostHelper$$ExternalSyntheticLambda0 = textDirection;
            breakStrategy = params.getBreakStrategy();
            this.MenuHostHelper$$ExternalSyntheticLambda1 = breakStrategy;
            hyphenationFrequency = params.getHyphenationFrequency();
            this.setIconTintList = hyphenationFrequency;
            this.setY = Build.VERSION.SDK_INT < 29 ? null : params;
        }

        public final TextPaint setX() {
            return this.setX;
        }

        public final TextDirectionHeuristic MenuHostHelper$$ExternalSyntheticLambda1() {
            return this.MenuHostHelper$$ExternalSyntheticLambda0;
        }

        public final int MenuHostHelper$$ExternalSyntheticLambda0() {
            return this.MenuHostHelper$$ExternalSyntheticLambda1;
        }

        public final int setY() {
            return this.setIconTintList;
        }

        public final boolean setIconTintList(setX setx) {
            LocaleList textLocales;
            LocaleList textLocales2;
            boolean equals;
            if ((Build.VERSION.SDK_INT < 23 || (this.MenuHostHelper$$ExternalSyntheticLambda1 == setx.MenuHostHelper$$ExternalSyntheticLambda0() && this.setIconTintList == setx.setY())) && this.setX.getTextSize() == setx.setX().getTextSize() && this.setX.getTextScaleX() == setx.setX().getTextScaleX() && this.setX.getTextSkewX() == setx.setX().getTextSkewX() && this.setX.getLetterSpacing() == setx.setX().getLetterSpacing() && TextUtils.equals(this.setX.getFontFeatureSettings(), setx.setX().getFontFeatureSettings()) && this.setX.getFlags() == setx.setX().getFlags()) {
                if (Build.VERSION.SDK_INT >= 24) {
                    textLocales = this.setX.getTextLocales();
                    textLocales2 = setx.setX().getTextLocales();
                    equals = textLocales.equals(textLocales2);
                    if (!equals) {
                        return false;
                    }
                } else if (!this.setX.getTextLocale().equals(setx.setX().getTextLocale())) {
                    return false;
                }
                return this.setX.getTypeface() == null ? setx.setX().getTypeface() == null : this.setX.getTypeface().equals(setx.setX().getTypeface());
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof setX) {
                setX setx = (setX) obj;
                return setIconTintList(setx) && this.MenuHostHelper$$ExternalSyntheticLambda0 == setx.MenuHostHelper$$ExternalSyntheticLambda1();
            }
            return false;
        }

        public final int hashCode() {
            int x;
            LocaleList textLocales;
            int x2;
            if (Build.VERSION.SDK_INT < 24) {
                x = setAllowStacking.setX.setX(Float.valueOf(this.setX.getTextSize()), Float.valueOf(this.setX.getTextScaleX()), Float.valueOf(this.setX.getTextSkewX()), Float.valueOf(this.setX.getLetterSpacing()), Integer.valueOf(this.setX.getFlags()), this.setX.getTextLocale(), this.setX.getTypeface(), Boolean.valueOf(this.setX.isElegantTextHeight()), this.MenuHostHelper$$ExternalSyntheticLambda0, Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(this.setIconTintList));
                return x;
            }
            textLocales = this.setX.getTextLocales();
            x2 = setAllowStacking.setX.setX(Float.valueOf(this.setX.getTextSize()), Float.valueOf(this.setX.getTextScaleX()), Float.valueOf(this.setX.getTextSkewX()), Float.valueOf(this.setX.getLetterSpacing()), Integer.valueOf(this.setX.getFlags()), textLocales, this.setX.getTypeface(), Boolean.valueOf(this.setX.isElegantTextHeight()), this.MenuHostHelper$$ExternalSyntheticLambda0, Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda1), Integer.valueOf(this.setIconTintList));
            return x2;
        }

        public final String toString() {
            String fontVariationSettings;
            LocaleList textLocales;
            StringBuilder sb = new StringBuilder("{");
            StringBuilder sb2 = new StringBuilder("textSize=");
            sb2.append(this.setX.getTextSize());
            sb.append(sb2.toString());
            StringBuilder sb3 = new StringBuilder(", textScaleX=");
            sb3.append(this.setX.getTextScaleX());
            sb.append(sb3.toString());
            StringBuilder sb4 = new StringBuilder(", textSkewX=");
            sb4.append(this.setX.getTextSkewX());
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder(", letterSpacing=");
            sb5.append(this.setX.getLetterSpacing());
            sb.append(sb5.toString());
            StringBuilder sb6 = new StringBuilder(", elegantTextHeight=");
            sb6.append(this.setX.isElegantTextHeight());
            sb.append(sb6.toString());
            if (Build.VERSION.SDK_INT >= 24) {
                StringBuilder sb7 = new StringBuilder(", textLocale=");
                textLocales = this.setX.getTextLocales();
                sb7.append(textLocales);
                sb.append(sb7.toString());
            } else {
                StringBuilder sb8 = new StringBuilder(", textLocale=");
                sb8.append(this.setX.getTextLocale());
                sb.append(sb8.toString());
            }
            StringBuilder sb9 = new StringBuilder(", typeface=");
            sb9.append(this.setX.getTypeface());
            sb.append(sb9.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder sb10 = new StringBuilder(", variationSettings=");
                fontVariationSettings = this.setX.getFontVariationSettings();
                sb10.append(fontVariationSettings);
                sb.append(sb10.toString());
            }
            StringBuilder sb11 = new StringBuilder(", textDir=");
            sb11.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
            sb.append(sb11.toString());
            StringBuilder sb12 = new StringBuilder(", breakStrategy=");
            sb12.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
            sb.append(sb12.toString());
            StringBuilder sb13 = new StringBuilder(", hyphenationFrequency=");
            sb13.append(this.setIconTintList);
            sb.append(sb13.toString());
            sb.append("}");
            return sb.toString();
        }
    }

    public PrecomputedText setY() {
        if (setErrorIconDrawable.MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList)) {
            return setErrorIconDrawable.setY(this.setIconTintList);
        }
        return null;
    }

    public setX setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // android.text.Spannable
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.setX.setSpan(obj, i, i2, i3);
        } else {
            this.setIconTintList.setSpan(obj, i, i2, i3);
        }
    }

    @Override // android.text.Spannable
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.setX.removeSpan(obj);
        } else {
            this.setIconTintList.removeSpan(obj);
        }
    }

    @Override // android.text.Spanned
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        Object[] spans;
        if (Build.VERSION.SDK_INT >= 29) {
            spans = this.setX.getSpans(i, i2, cls);
            return (T[]) spans;
        }
        return (T[]) this.setIconTintList.getSpans(i, i2, cls);
    }

    @Override // android.text.Spanned
    public int getSpanStart(Object obj) {
        return this.setIconTintList.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public int getSpanEnd(Object obj) {
        return this.setIconTintList.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public int getSpanFlags(Object obj) {
        return this.setIconTintList.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.setIconTintList.nextSpanTransition(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public int length() {
        return this.setIconTintList.length();
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return this.setIconTintList.charAt(i);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return this.setIconTintList.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return this.setIconTintList.toString();
    }
}