package o;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import o.setBaselineAlignBottom;
import o.setIconTint;
import o.setPopupTheme;

/* loaded from: classes.dex */
public class setWindowTitle extends setPopupTheme {

    @Deprecated
    /* loaded from: classes.dex */
    public interface setIconTintList extends setPopupTheme.setY {
    }

    @Deprecated
    /* loaded from: classes.dex */
    public interface setX extends setPopupTheme.setIconTintList {
    }

    @Override // o.setPopupTheme
    public final int setIconTintList() {
        return 5;
    }

    public setWindowTitle(Context context) {
        this(context, null);
    }

    public setWindowTitle(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f040067);
    }

    public setWindowTitle(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, R.style._res_0x7f150304);
    }

    private setWindowTitle(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, R.style._res_0x7f150304);
        Context context2 = getContext();
        int[] iArr = setIconTint.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context2, attributeSet, i, R.style._res_0x7f150304);
        ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(context2, attributeSet, iArr, i, R.style._res_0x7f150304, new int[0]);
        setExpandedHintEnabled MenuHostHelper$$ExternalSyntheticLambda0 = setExpandedHintEnabled.MenuHostHelper$$ExternalSyntheticLambda0(context2, attributeSet, iArr, i, R.style._res_0x7f150304);
        setItemHorizontalTranslationEnabled(MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(1, true));
        if (MenuHostHelper$$ExternalSyntheticLambda0.setLayoutAnimation(0)) {
            setMinimumHeight(MenuHostHelper$$ExternalSyntheticLambda0.setY(0, 0));
        }
        MenuHostHelper$$ExternalSyntheticLambda0.setX();
        setTitleMargin.setX(this, new setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setWindowTitle.5
            @Override // o.setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda0
            public final WindowInsetsCompat setY(View view, WindowInsetsCompat windowInsetsCompat, setTitleMargin$MenuHostHelper$$ExternalSyntheticLambda1 settitlemargin_menuhosthelper__externalsyntheticlambda1) {
                int x;
                settitlemargin_menuhosthelper__externalsyntheticlambda1.setX += windowInsetsCompat.setUnboundedRipple();
                x = setBaselineAlignBottom.setX.setX(view);
                boolean z = x == 1;
                int navigationOnClickListener = windowInsetsCompat.setNavigationOnClickListener();
                int onLongClickListener = windowInsetsCompat.setOnLongClickListener();
                settitlemargin_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 += z ? onLongClickListener : navigationOnClickListener;
                int i3 = settitlemargin_menuhosthelper__externalsyntheticlambda1.setY;
                if (!z) {
                    navigationOnClickListener = onLongClickListener;
                }
                settitlemargin_menuhosthelper__externalsyntheticlambda1.setY = i3 + navigationOnClickListener;
                setBaselineAlignBottom.setX.setX(view, settitlemargin_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1, settitlemargin_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0, settitlemargin_menuhosthelper__externalsyntheticlambda1.setY, settitlemargin_menuhosthelper__externalsyntheticlambda1.setX);
                return windowInsetsCompat;
            }
        });
    }

    @Override // o.setPopupTheme
    public final setStatusBarForegroundResource MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        return new setTextEndPadding(context);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(setX setx) {
        setOnItemSelectedListener(setx);
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(setIconTintList seticontintlist) {
        setOnItemReselectedListener(seticontintlist);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), suggestedMinimumHeight + getPaddingTop() + getPaddingBottom()), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        setTextEndPadding settextendpadding = (setTextEndPadding) this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (settextendpadding.setIconTintList != z) {
            settextendpadding.setItemHorizontalTranslationEnabled(z);
            setY().MenuHostHelper$$ExternalSyntheticLambda0(false);
        }
    }
}