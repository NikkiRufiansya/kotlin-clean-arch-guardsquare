package o;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
final class FirebaseInitProvider {
    static final int MenuHostHelper$$ExternalSyntheticLambda0;
    private static Object ViewPager$SavedState$1;
    private static boolean setCenterIfNoTextEnabled;
    private static Constructor<StaticLayout> setChipCornerRadius;
    private final int setAnimationFromJson;
    private int setIconSize;
    getTrimPathEnd setNavigationOnClickListener;
    boolean setOnLongClickListener;
    private final TextPaint setTextAlignment;
    private CharSequence setTextScaleX;
    private int setMaxEms = 0;
    Layout.Alignment setY = Layout.Alignment.ALIGN_NORMAL;
    int setUnboundedRipple = Integer.MAX_VALUE;
    float setLayoutAnimation = 0.0f;
    float setUiOptions = 1.0f;
    int setIconTintList = MenuHostHelper$$ExternalSyntheticLambda0;
    boolean setX = true;
    TextUtils.TruncateAt MenuHostHelper$$ExternalSyntheticLambda1 = null;

    static {
        MenuHostHelper$$ExternalSyntheticLambda0 = Build.VERSION.SDK_INT >= 23 ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseInitProvider(CharSequence charSequence, TextPaint textPaint, int i) {
        this.setTextScaleX = charSequence;
        this.setTextAlignment = textPaint;
        this.setAnimationFromJson = i;
        this.setIconSize = charSequence.length();
    }

    public final StaticLayout setY() {
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout build;
        if (this.setTextScaleX == null) {
            this.setTextScaleX = "";
        }
        int max = Math.max(0, this.setAnimationFromJson);
        CharSequence charSequence = this.setTextScaleX;
        if (this.setUnboundedRipple == 1) {
            charSequence = TextUtils.ellipsize(charSequence, this.setTextAlignment, max, this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        this.setIconSize = Math.min(charSequence.length(), this.setIconSize);
        if (Build.VERSION.SDK_INT >= 23) {
            if (this.setOnLongClickListener && this.setUnboundedRipple == 1) {
                this.setY = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, 0, this.setIconSize, this.setTextAlignment, max);
            obtain.setAlignment(this.setY);
            obtain.setIncludePad(this.setX);
            if (this.setOnLongClickListener) {
                textDirectionHeuristic = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic);
            TextUtils.TruncateAt truncateAt = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.setUnboundedRipple);
            float f = this.setLayoutAnimation;
            if (f != 0.0f || this.setUiOptions != 1.0f) {
                obtain.setLineSpacing(f, this.setUiOptions);
            }
            if (this.setUnboundedRipple > 1) {
                obtain.setHyphenationFrequency(this.setIconTintList);
            }
            build = obtain.build();
            return build;
        }
        if (!setCenterIfNoTextEnabled) {
            try {
                ViewPager$SavedState$1 = this.setOnLongClickListener && Build.VERSION.SDK_INT >= 23 ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
                Constructor<StaticLayout> declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, Integer.TYPE, Integer.TYPE, TextPaint.class, Integer.TYPE, Layout.Alignment.class, TextDirectionHeuristic.class, Float.TYPE, Float.TYPE, Boolean.TYPE, TextUtils.TruncateAt.class, Integer.TYPE, Integer.TYPE);
                setChipCornerRadius = declaredConstructor;
                declaredConstructor.setAccessible(true);
                setCenterIfNoTextEnabled = true;
            } catch (Exception e) {
                throw new setY(e);
            }
        }
        try {
            return setChipCornerRadius.newInstance(charSequence, 0, Integer.valueOf(this.setIconSize), this.setTextAlignment, Integer.valueOf(max), this.setY, ViewPager$SavedState$1, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.setX), null, Integer.valueOf(max), Integer.valueOf(this.setUnboundedRipple));
        } catch (Exception e2) {
            throw new setY(e2);
        }
    }

    /* loaded from: classes.dex */
    static class setY extends Exception {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        setY(java.lang.Throwable r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Error thrown initializing StaticLayout "
                r0.<init>(r1)
                java.lang.String r1 = r3.getMessage()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o.FirebaseInitProvider.setY.<init>(java.lang.Throwable):void");
        }
    }
}