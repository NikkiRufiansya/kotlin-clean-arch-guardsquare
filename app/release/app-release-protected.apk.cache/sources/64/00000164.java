package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import o.setBaselineAlignBottom;
import o.setIconTint;
import o.setScrollBarDefaultDelayBeforeFade;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class C extends setMIndicatorOptions {
    private final Runnable MenuHostHelper$$ExternalSyntheticLambda1;
    private setWebViewClient setIconTintList;
    private int setY;

    public C(Context context) {
        this(context, null);
    }

    public C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.res_0x7f0d004b, this);
        setWebViewClient setwebviewclient = new setWebViewClient();
        this.setIconTintList = setwebviewclient;
        setSuffixTextAppearance setsuffixtextappearance = new setSuffixTextAppearance(0.5f);
        setScrollBarDefaultDelayBeforeFade.setY sety = new setScrollBarDefaultDelayBeforeFade.setY(setwebviewclient.setChipIconTintResource.setTextAlignment);
        sety.setNavigationOnClickListener = setsuffixtextappearance;
        sety.ViewPager$SavedState$1 = setsuffixtextappearance;
        sety.setIconTintList = setsuffixtextappearance;
        sety.setY = setsuffixtextappearance;
        setwebviewclient.setShapeAppearanceModel(new setScrollBarDefaultDelayBeforeFade(sety, (byte) 0));
        setWebViewClient setwebviewclient2 = this.setIconTintList;
        ColorStateList valueOf = ColorStateList.valueOf(-1);
        if (setwebviewclient2.setChipIconTintResource.setX != valueOf) {
            setwebviewclient2.setChipIconTintResource.setX = valueOf;
            setwebviewclient2.onStateChange(setwebviewclient2.getState());
        }
        setBaselineAlignBottom$MenuHostHelper$$ExternalSyntheticLambda1.setY(this, this.setIconTintList);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setIconTint.setIconTintList.FloatingActionButton$BaseBehavior, i, 0);
        this.setY = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new Runnable() { // from class: o.A
            @Override // java.lang.Runnable
            public final void run() {
                C.this.setY();
            }
        };
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        setWebViewClient setwebviewclient = this.setIconTintList;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (setwebviewclient.setChipIconTintResource.setX != valueOf) {
            setwebviewclient.setChipIconTintResource.setX = valueOf;
            setwebviewclient.onStateChange(setwebviewclient.getState());
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int iconTintList;
        super.addView(view, i, layoutParams);
        if (view.getId() == -1) {
            iconTintList = setBaselineAlignBottom.setX.setIconTintList();
            view.setId(iconTintList);
        }
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.MenuHostHelper$$ExternalSyntheticLambda1);
            handler.post(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }

    @Override // o.setMIndicatorOptions, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.MenuHostHelper$$ExternalSyntheticLambda1);
            handler.post(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        setY();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setY() {
        int childCount = getChildCount();
        int i = 1;
        for (int i2 = 0; i2 < childCount; i2++) {
            if ("skip".equals(getChildAt(i2).getTag())) {
                i++;
            }
        }
        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY(this);
        float f = 0.0f;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getId() != R.id.res_0x7f0a007f && !"skip".equals(childAt.getTag())) {
                withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(childAt.getId(), R.id.res_0x7f0a007f, this.setY, f);
                f += 360.0f / (childCount - i);
            }
        }
        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList(this);
    }

    public void setRadius(int i) {
        this.setY = i;
        setY();
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY;
    }
}