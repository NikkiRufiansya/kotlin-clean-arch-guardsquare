package o;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class setChipIcon extends onActivityPreDestroyed {
    private final setSubtitleTextAppearance<Integer, Integer> MenuHostHelper$$ExternalSyntheticLambda1;
    private final setEndIconCheckable setNavigationOnClickListener;
    private final String setOnLongClickListener;
    private setSubtitleTextAppearance<ColorFilter, ColorFilter> setX;
    private final boolean setY;

    @Override // o.onActivityPreDestroyed, o.EmojiCompatInitializer.AnonymousClass1
    public final void setIconTintList(Canvas canvas, Matrix matrix, int i) {
        if (this.setY) {
            return;
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0.setColor(((setOverScrollMode) this.MenuHostHelper$$ExternalSyntheticLambda1).setUnboundedRipple());
        if (this.setX != null) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setColorFilter(this.setX.setOnLongClickListener());
        }
        super.setIconTintList(canvas, matrix, i);
    }

    @Override // o.setContentInsetStartWithNavigation
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setOnLongClickListener;
    }

    @Override // o.onActivityPreDestroyed, o.setDropDownBackgroundDrawable
    public final <T> void MenuHostHelper$$ExternalSyntheticLambda1(T t, setPrompt<T> setprompt) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(t, setprompt);
        if (t == setItemViewCacheSize.setZ) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        } else if (t == setItemViewCacheSize.setY) {
            setSubtitleTextAppearance<ColorFilter, ColorFilter> setsubtitletextappearance = this.setX;
            if (setsubtitletextappearance != null) {
                this.setNavigationOnClickListener.setX.remove(setsubtitletextappearance);
            }
            if (setprompt == null) {
                this.setX = null;
                return;
            }
            setExtraMultilineHeightEnabled setextramultilineheightenabled = new setExtraMultilineHeightEnabled(setprompt);
            this.setX = setextramultilineheightenabled;
            setextramultilineheightenabled.MenuHostHelper$$ExternalSyntheticLambda0.add(this);
            setEndIconCheckable setendiconcheckable = this.setNavigationOnClickListener;
            setSubtitleTextAppearance<Integer, Integer> setsubtitletextappearance2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setsubtitletextappearance2 != null) {
                setendiconcheckable.setX.add(setsubtitletextappearance2);
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setChipIcon(o.setPointerIcon r12, o.setEndIconCheckable r13, o.setIndicatorBounds r14) {
        /*
            r11 = this;
            o.setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0 r0 = r14.setX
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
            o.setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1 r0 = r14.MenuHostHelper$$ExternalSyntheticLambda1
            android.graphics.Paint$Join r5 = r0.MenuHostHelper$$ExternalSyntheticLambda1()
            float r6 = r14.setNavigationOnClickListener
            o.setFirstDayOfWeek r7 = r14.setUnboundedRipple
            o.setOnReceiveContentListener r8 = r14.setOnLongClickListener
            java.util.List<o.setOnReceiveContentListener> r9 = r14.setIconTintList
            o.setOnReceiveContentListener r10 = r14.setUiOptions
            r1 = r11
            r2 = r12
            r3 = r13
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.setNavigationOnClickListener = r13
            java.lang.String r12 = r14.setLayoutAnimation
            r11.setOnLongClickListener = r12
            boolean r12 = r14.setY
            r11.setY = r12
            o.setUseCompatPadding r12 = r14.MenuHostHelper$$ExternalSyntheticLambda0
            o.setOverScrollMode r14 = new o.setOverScrollMode
            java.util.List<o.setChildIndicatorBoundsRelative<V>> r12 = r12.MenuHostHelper$$ExternalSyntheticLambda1
            r14.<init>(r12)
            r11.MenuHostHelper$$ExternalSyntheticLambda1 = r14
            java.util.List<o.setSubtitleTextAppearance$setX> r12 = r14.MenuHostHelper$$ExternalSyntheticLambda0
            r12.add(r11)
            java.util.List<o.setSubtitleTextAppearance<?, ?>> r12 = r13.setX
            r12.add(r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setChipIcon.<init>(o.setPointerIcon, o.setEndIconCheckable, o.setIndicatorBounds):void");
    }
}