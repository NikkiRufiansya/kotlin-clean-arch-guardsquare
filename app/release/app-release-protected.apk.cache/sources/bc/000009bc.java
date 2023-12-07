package o;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class setButtonIconTintList extends onActivityPreDestroyed {
    private final setSubtitleTextAppearance<setHintTextAppearance, setHintTextAppearance> MenuHostHelper$$ExternalSyntheticLambda1;
    private final setPrefixTextAppearance<RadialGradient> ViewPager$SavedState$1;
    private final getCallingWorkSourceUid setChipCornerRadius;
    private setExtraMultilineHeightEnabled setLayoutAnimation;
    private final boolean setNavigationOnClickListener;
    private final setPrefixTextAppearance<LinearGradient> setOnLongClickListener;
    private final setSubtitleTextAppearance<PointF, PointF> setTextAlignment;
    private final setSubtitleTextAppearance<PointF, PointF> setUiOptions;
    private final String setUnboundedRipple;
    private final int setX;
    private final RectF setY;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.onActivityPreDestroyed, o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(Canvas canvas, Matrix matrix, int i) {
        RadialGradient MenuHostHelper$$ExternalSyntheticLambda0;
        float f;
        float f2;
        if (this.setNavigationOnClickListener) {
            return;
        }
        setIconTintList(this.setY, matrix, false);
        if (this.setChipCornerRadius == getCallingWorkSourceUid.LINEAR) {
            long iconTintList = setIconTintList();
            MenuHostHelper$$ExternalSyntheticLambda0 = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList, null);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                PointF onLongClickListener = this.setTextAlignment.setOnLongClickListener();
                PointF onLongClickListener2 = this.setUiOptions.setOnLongClickListener();
                setHintTextAppearance onLongClickListener3 = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener();
                MenuHostHelper$$ExternalSyntheticLambda0 = new LinearGradient(onLongClickListener.x, onLongClickListener.y, onLongClickListener2.x, onLongClickListener2.y, setIconTintList(onLongClickListener3.setX), onLongClickListener3.MenuHostHelper$$ExternalSyntheticLambda0, Shader.TileMode.CLAMP);
                this.setOnLongClickListener.setX(iconTintList, MenuHostHelper$$ExternalSyntheticLambda0);
            }
        } else {
            long iconTintList2 = setIconTintList();
            MenuHostHelper$$ExternalSyntheticLambda0 = this.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList2, null);
            if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                PointF onLongClickListener4 = this.setTextAlignment.setOnLongClickListener();
                PointF onLongClickListener5 = this.setUiOptions.setOnLongClickListener();
                setHintTextAppearance onLongClickListener6 = this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener();
                int[] iconTintList3 = setIconTintList(onLongClickListener6.setX);
                float[] fArr = onLongClickListener6.MenuHostHelper$$ExternalSyntheticLambda0;
                MenuHostHelper$$ExternalSyntheticLambda0 = new RadialGradient(onLongClickListener4.x, onLongClickListener4.y, (float) Math.hypot(onLongClickListener5.x - f, onLongClickListener5.y - f2), iconTintList3, fArr, Shader.TileMode.CLAMP);
                this.ViewPager$SavedState$1.setX(iconTintList2, MenuHostHelper$$ExternalSyntheticLambda0);
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setLocalMatrix(matrix);
        this.MenuHostHelper$$ExternalSyntheticLambda0.setShader(MenuHostHelper$$ExternalSyntheticLambda0);
        super.setIconTintList(canvas, matrix, i);
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setUnboundedRipple;
    }

    private int setIconTintList() {
        int round = Math.round(this.setTextAlignment.setX() * this.setX);
        int round2 = Math.round(this.setUiOptions.setX() * this.setX);
        int round3 = Math.round(this.MenuHostHelper$$ExternalSyntheticLambda1.setX() * this.setX);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    private int[] setIconTintList(int[] iArr) {
        setExtraMultilineHeightEnabled setextramultilineheightenabled = this.setLayoutAnimation;
        if (setextramultilineheightenabled != null) {
            Integer[] numArr = (Integer[]) setextramultilineheightenabled.setOnLongClickListener();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.onActivityPreDestroyed, o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(t, setprompt);
        if (t == setItemViewCacheSize.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (this.setLayoutAnimation != null) {
                setEndIconCheckable setendiconcheckable = this.setIconTintList;
                setendiconcheckable.setX.remove(this.setLayoutAnimation);
            }
            if (setprompt == null) {
                this.setLayoutAnimation = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled = new setExtraMultilineHeightEnabled(setprompt);
            this.setLayoutAnimation = setextramultilineheightenabled;
            setextramultilineheightenabled.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setEndIconCheckable setendiconcheckable2 = this.setIconTintList;
            setExtraMultilineHeightEnabled setextramultilineheightenabled2 = this.setLayoutAnimation;
            if (setextramultilineheightenabled2 != null) {
                setendiconcheckable2.setX.add(setextramultilineheightenabled2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setButtonIconTintList(o.setPointerIcon r12, o.setEndIconCheckable r13, o.setNetworkAvailable r14) {
        /*
            r11 = this;
            o.setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0 r0 = r14.setY
            int[] r1 = o.setIndicatorBounds.AnonymousClass3.setIconTintList
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L16
            r1 = 2
            if (r0 == r1) goto L13
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.SQUARE
            goto L18
        L13:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L18
        L16:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L18:
            r4 = r0
            o.setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1 r0 = r14.setNavigationOnClickListener
            android.graphics.Paint$Join r5 = r0.MenuHostHelper$$ExternalSyntheticLambda1()
            float r6 = r14.setLayoutAnimation
            o.setFirstDayOfWeek r7 = r14.ViewPager$SavedState$1
            o.setOnReceiveContentListener r8 = r14.setIconSize
            java.util.List<o.setOnReceiveContentListener> r9 = r14.setUnboundedRipple
            o.setOnReceiveContentListener r10 = r14.setIconTintList
            r1 = r11
            r2 = r12
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            o.setPrefixTextAppearance r0 = new o.setPrefixTextAppearance
            r0.<init>()
            r11.setOnLongClickListener = r0
            o.setPrefixTextAppearance r0 = new o.setPrefixTextAppearance
            r0.<init>()
            r11.ViewPager$SavedState$1 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r11.setY = r0
            java.lang.String r0 = r14.setUiOptions
            r11.setUnboundedRipple = r0
            o.getCallingWorkSourceUid r0 = r14.MenuHostHelper$$ExternalSyntheticLambda1
            r11.setChipCornerRadius = r0
            boolean r0 = r14.setOnLongClickListener
            r11.setNavigationOnClickListener = r0
            o.setBoxStrokeErrorColor r12 = r12.setY
            float r0 = r12.MenuHostHelper$$ExternalSyntheticLambda1
            float r1 = r12.setChipCornerRadius
            float r0 = r0 - r1
            float r12 = r12.setIconTintList
            float r0 = r0 / r12
            r12 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 * r12
            long r0 = (long) r0
            float r12 = (float) r0
            r0 = 1107296256(0x42000000, float:32.0)
            float r12 = r12 / r0
            int r12 = (int) r12
            r11.setX = r12
            o.setAutoSizeTextTypeUniformWithPresetSizes r12 = r14.MenuHostHelper$$ExternalSyntheticLambda0
            o.consumeStableInsets r0 = new o.consumeStableInsets
            java.util.List<o.setChildIndicatorBoundsRelative<V>> r12 = r12.MenuHostHelper$$ExternalSyntheticLambda1
            r0.<init>(r12)
            r11.MenuHostHelper$$ExternalSyntheticLambda1 = r0
            java.util.List<o.setSubtitleTextAppearance$setX> r12 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            r12.add(r11)
            java.util.List<o.setSubtitleTextAppearance<?, ?>> r12 = r13.setX
            r12.add(r0)
            o.setTokenizer r12 = r14.setChipCornerRadius
            o.setChildIndicatorBounds r0 = new o.setChildIndicatorBounds
            java.util.List<o.setChildIndicatorBoundsRelative<V>> r12 = r12.MenuHostHelper$$ExternalSyntheticLambda1
            r0.<init>(r12)
            r11.setTextAlignment = r0
            java.util.List<o.setSubtitleTextAppearance$setX> r12 = r0.MenuHostHelper$$ExternalSyntheticLambda0
            r12.add(r11)
            java.util.List<o.setSubtitleTextAppearance<?, ?>> r12 = r13.setX
            r12.add(r0)
            o.setTokenizer r12 = r14.setX
            o.setChildIndicatorBounds r14 = new o.setChildIndicatorBounds
            java.util.List<o.setChildIndicatorBoundsRelative<V>> r12 = r12.MenuHostHelper$$ExternalSyntheticLambda1
            r14.<init>(r12)
            r11.setUiOptions = r14
            java.util.List<o.setSubtitleTextAppearance$setX> r12 = r14.MenuHostHelper$$ExternalSyntheticLambda0
            r12.add(r11)
            java.util.List<o.setSubtitleTextAppearance<?, ?>> r12 = r13.setX
            r12.add(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setButtonIconTintList.<init>(o.setPointerIcon, o.setEndIconCheckable, o.setNetworkAvailable):void");
    }
}