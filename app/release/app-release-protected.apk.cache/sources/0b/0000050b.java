package o;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.TimeZone;
import o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
import o.lC;

/* loaded from: classes.dex */
public final class getTranslateX<S> extends setSafeBrowsingWhitelist<S> {
    setEvaluator FirebaseRemoteConfigKtxRegistrar;
    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 getCallingPid;
    setErrorIconTintMode<S> onActivityResumed;
    private View setEmptyView;
    setGroupDividerEnabled setError;
    WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 setFilterRedundantCalls;
    View setHint;
    private int setLineBreakStyle;
    setX setTitleMarginEnd;
    setCompletionHint setTooltipText;
    private static Object Fragment$5 = "MONTHS_VIEW_GROUP_TAG";
    private static Object FabTransformationBehavior = "NAVIGATION_PREV_TAG";
    private static Object createDispatcher = "NAVIGATION_NEXT_TAG";
    private static Object setCloseIconEndPadding = "SELECTOR_TOGGLE_TAG";

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum setX {
        DAY,
        YEAR
    }

    @Override // o.setDropDownBackgroundResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.setLineBreakStyle);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.onActivityResumed);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.setError);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.setTooltipText);
    }

    @Override // o.setDropDownBackgroundResource
    public final void setX(Bundle bundle) {
        super.setX(bundle);
        if (bundle == null) {
            bundle = setMaxEms();
        }
        this.setLineBreakStyle = bundle.getInt("THEME_RES_ID_KEY");
        this.onActivityResumed = (setErrorIconTintMode) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.setError = (setGroupDividerEnabled) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.setTooltipText = (setCompletionHint) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        ViewGroup viewGroup2;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(setCheckedIconEnabled(), this.setLineBreakStyle);
        this.FirebaseRemoteConfigKtxRegistrar = new setEvaluator(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        setCompletionHint setcompletionhint = this.setError.setIconTintList;
        if (setTranslationZ.MenuHostHelper$$ExternalSyntheticLambda1(contextThemeWrapper, 16843277)) {
            i = R.layout.res_0x7f0d0061;
            viewGroup2 = viewGroup;
            i2 = 1;
        } else {
            i = R.layout.res_0x7f0d005c;
            viewGroup2 = viewGroup;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup2, false);
        Resources resources = setCallingWorkSourceUid().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.res_0x7f0701d7);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.res_0x7f0701d8);
        inflate.setMinimumHeight(dimensionPixelSize + dimensionPixelOffset + resources.getDimensionPixelOffset(R.dimen.res_0x7f0701d6) + resources.getDimensionPixelSize(R.dimen.res_0x7f0701c7) + (AppBarLayout$Behavior.setY * resources.getDimensionPixelSize(R.dimen.res_0x7f0701c2)) + ((AppBarLayout$Behavior.setY - 1) * resources.getDimensionPixelOffset(R.dimen.res_0x7f0701d5)) + resources.getDimensionPixelOffset(R.dimen.res_0x7f0701bf));
        GridView gridView = (GridView) inflate.findViewById(R.id.res_0x7f0a0134);
        setBaselineAlignBottom.setX(gridView, new setCounterOverflowTextColor() { // from class: o.getTranslateX.1
            @Override // o.setCounterOverflowTextColor
            public final void setY(View view, setDecorPadding setdecorpadding) {
                super.setY(view, setdecorpadding);
                setdecorpadding.setX((Object) null);
            }
        });
        int i3 = this.setError.setY;
        gridView.setAdapter((ListAdapter) (i3 > 0 ? new setChipStartPadding(i3) : new setChipStartPadding()));
        gridView.setNumColumns(setcompletionhint.MenuHostHelper$$ExternalSyntheticLambda0);
        gridView.setEnabled(false);
        this.setFilterRedundantCalls = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) inflate.findViewById(R.id.res_0x7f0a0137);
        this.setFilterRedundantCalls.setLayoutManager(new setTranslationY(setCheckedIconEnabled(), i2, i2) { // from class: o.getTranslateX.5
            private /* synthetic */ int setY;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(i2, false);
                this.setY = i2;
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setMinAndMaxProgress setminandmaxprogress, int[] iArr) {
                if (this.setY == 0) {
                    iArr[0] = getTranslateX.this.setFilterRedundantCalls.getWidth();
                    iArr[1] = getTranslateX.this.setFilterRedundantCalls.getWidth();
                    return;
                }
                iArr[0] = getTranslateX.this.setFilterRedundantCalls.getHeight();
                iArr[1] = getTranslateX.this.setFilterRedundantCalls.getHeight();
            }

            public static void MenuHostHelper$$ExternalSyntheticLambda0(long j, long j2) {
                String str;
                String str2;
                lC.setY sety = lC.MenuHostHelper$$ExternalSyntheticLambda0;
                lC.MenuHostHelper$$ExternalSyntheticLambda1 = true;
                pN.setY("hook Detected", "");
                lC.setY = "hook Detected";
                str = lC.setIconTintList;
                str2 = lC.setY;
                Log.d(str, str2);
            }
        });
        this.setFilterRedundantCalls.setTag(Fragment$5);
        final setRemoteViewsAdapter setremoteviewsadapter = new setRemoteViewsAdapter(contextThemeWrapper, this.onActivityResumed, this.setError, new getTranslateX$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.getTranslateX.3
            @Override // o.getTranslateX$MenuHostHelper$$ExternalSyntheticLambda1
            public final void setY(long j) {
                if (getTranslateX.this.setError.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda1(j)) {
                    setErrorIconTintMode<S> seterroricontintmode = getTranslateX.this.onActivityResumed;
                    Iterator<setTranslationX<S>> it = getTranslateX.this.setRevealInfo.iterator();
                    while (it.hasNext()) {
                        it.next().setIconTintList(getTranslateX.this.onActivityResumed.setX());
                    }
                    getTranslateX.this.setFilterRedundantCalls.setNavigationOnClickListener.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                    if (getTranslateX.this.getCallingPid != null) {
                        getTranslateX.this.getCallingPid.setNavigationOnClickListener.setX.MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                }
            }
        });
        this.setFilterRedundantCalls.setAdapter(setremoteviewsadapter);
        WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 = (WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0) inflate.findViewById(R.id.res_0x7f0a013a);
        this.getCallingPid = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0;
        if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 != null) {
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setHasFixedSize(true);
            this.getCallingPid.setLayoutManager(new androidx.recyclerview.widget.GridLayoutManager(3));
            this.getCallingPid.setAdapter(new getInterfaceDescriptor(this));
            this.getCallingPid.setIconTintList(new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUnboundedRipple() { // from class: o.getTranslateX.4
                private final Calendar MenuHostHelper$$ExternalSyntheticLambda0;
                private final Calendar setX;

                {
                    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    calendar.clear();
                    this.setX = calendar;
                    Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    calendar2.clear();
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = calendar2;
                }

                @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setUnboundedRipple
                public final void MenuHostHelper$$ExternalSyntheticLambda0(Canvas canvas, WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02) {
                    int width;
                    if ((windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setNavigationOnClickListener instanceof getInterfaceDescriptor) && (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setGuidelinePercent instanceof androidx.recyclerview.widget.GridLayoutManager)) {
                        getInterfaceDescriptor getinterfacedescriptor = (getInterfaceDescriptor) windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setNavigationOnClickListener;
                        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = (androidx.recyclerview.widget.GridLayoutManager) windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setGuidelinePercent;
                        for (setVerticalGravity<Long, Long> setverticalgravity : getTranslateX.this.onActivityResumed.MenuHostHelper$$ExternalSyntheticLambda1()) {
                            if (setverticalgravity.setX != null && setverticalgravity.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                                this.setX.setTimeInMillis(setverticalgravity.setX.longValue());
                                this.MenuHostHelper$$ExternalSyntheticLambda0.setTimeInMillis(setverticalgravity.MenuHostHelper$$ExternalSyntheticLambda1.longValue());
                                int i4 = this.setX.get(1) - getinterfacedescriptor.MenuHostHelper$$ExternalSyntheticLambda1.setError.setIconTintList.setLayoutAnimation;
                                int i5 = this.MenuHostHelper$$ExternalSyntheticLambda0.get(1) - getinterfacedescriptor.MenuHostHelper$$ExternalSyntheticLambda1.setError.setIconTintList.setLayoutAnimation;
                                View MenuHostHelper$$ExternalSyntheticLambda1 = gridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1(i4);
                                View MenuHostHelper$$ExternalSyntheticLambda12 = gridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1(i5);
                                int i6 = i4 / gridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1;
                                int i7 = i5 / gridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1;
                                int i8 = i6;
                                while (i8 <= i7) {
                                    View MenuHostHelper$$ExternalSyntheticLambda13 = gridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1(gridLayoutManager.MenuHostHelper$$ExternalSyntheticLambda1 * i8);
                                    if (MenuHostHelper$$ExternalSyntheticLambda13 != null) {
                                        int top = MenuHostHelper$$ExternalSyntheticLambda13.getTop();
                                        int i9 = getTranslateX.this.FirebaseRemoteConfigKtxRegistrar.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0.top;
                                        int bottom = MenuHostHelper$$ExternalSyntheticLambda13.getBottom();
                                        int i10 = getTranslateX.this.FirebaseRemoteConfigKtxRegistrar.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0.bottom;
                                        int left = i8 == i6 ? MenuHostHelper$$ExternalSyntheticLambda1.getLeft() + (MenuHostHelper$$ExternalSyntheticLambda1.getWidth() / 2) : 0;
                                        if (i8 == i7) {
                                            width = MenuHostHelper$$ExternalSyntheticLambda12.getLeft() + (MenuHostHelper$$ExternalSyntheticLambda12.getWidth() / 2);
                                        } else {
                                            width = windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.getWidth();
                                        }
                                        canvas.drawRect(left, top + i9, width, bottom - i10, getTranslateX.this.FirebaseRemoteConfigKtxRegistrar.MenuHostHelper$$ExternalSyntheticLambda0);
                                    }
                                    i8++;
                                }
                            }
                        }
                    }
                }
            });
        }
        if (inflate.findViewById(R.id.res_0x7f0a012d) != null) {
            final FabTransformationSheetBehavior fabTransformationSheetBehavior = (FabTransformationSheetBehavior) inflate.findViewById(R.id.res_0x7f0a012d);
            fabTransformationSheetBehavior.setTag(setCloseIconEndPadding);
            setBaselineAlignBottom.setX(fabTransformationSheetBehavior, new setCounterOverflowTextColor() { // from class: o.getTranslateX.10
                @Override // o.setCounterOverflowTextColor
                public final void setY(View view, setDecorPadding setdecorpadding) {
                    String iconTintList;
                    super.setY(view, setdecorpadding);
                    if (getTranslateX.this.setHint.getVisibility() == 0) {
                        iconTintList = getTranslateX.this.setIconTintList(R.string.res_0x7f140093);
                    } else {
                        iconTintList = getTranslateX.this.setIconTintList(R.string.res_0x7f140091);
                    }
                    setdecorpadding.setY((CharSequence) iconTintList);
                }
            });
            FabTransformationSheetBehavior fabTransformationSheetBehavior2 = (FabTransformationSheetBehavior) inflate.findViewById(R.id.res_0x7f0a012f);
            fabTransformationSheetBehavior2.setTag(FabTransformationBehavior);
            FabTransformationSheetBehavior fabTransformationSheetBehavior3 = (FabTransformationSheetBehavior) inflate.findViewById(R.id.res_0x7f0a012e);
            fabTransformationSheetBehavior3.setTag(createDispatcher);
            this.setEmptyView = inflate.findViewById(R.id.res_0x7f0a013a);
            this.setHint = inflate.findViewById(R.id.res_0x7f0a0133);
            MenuHostHelper$$ExternalSyntheticLambda1(setX.DAY);
            setCompletionHint setcompletionhint2 = this.setTooltipText;
            if (setcompletionhint2.setIconTintList == null) {
                setcompletionhint2.setIconTintList = DateUtils.formatDateTime(null, setcompletionhint2.setX.getTimeInMillis(), 8228);
            }
            fabTransformationSheetBehavior.setText(setcompletionhint2.setIconTintList);
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02 = this.setFilterRedundantCalls;
            WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled setcenterifnotextenabled = new WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled() { // from class: o.getTranslateX.9
                @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled
                public final void setX(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03, int i4, int i5) {
                    int unboundedRipple;
                    if (i4 < 0) {
                        unboundedRipple = ((androidx.recyclerview.widget.LinearLayoutManager) getTranslateX.this.setFilterRedundantCalls.setGuidelinePercent).setLayoutAnimation();
                    } else {
                        unboundedRipple = ((androidx.recyclerview.widget.LinearLayoutManager) getTranslateX.this.setFilterRedundantCalls.setGuidelinePercent).setUnboundedRipple();
                    }
                    getTranslateX gettranslatex = getTranslateX.this;
                    Calendar x = HideBottomViewOnScrollBehavior.setX(setremoteviewsadapter.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setX);
                    x.add(2, unboundedRipple);
                    gettranslatex.setTooltipText = new setCompletionHint(x);
                    FabTransformationSheetBehavior fabTransformationSheetBehavior4 = fabTransformationSheetBehavior;
                    Calendar x2 = HideBottomViewOnScrollBehavior.setX(setremoteviewsadapter.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setX);
                    x2.add(2, unboundedRipple);
                    setCompletionHint setcompletionhint3 = new setCompletionHint(x2);
                    if (setcompletionhint3.setIconTintList == null) {
                        setcompletionhint3.setIconTintList = DateUtils.formatDateTime(null, setcompletionhint3.setX.getTimeInMillis(), 8228);
                    }
                    fabTransformationSheetBehavior4.setText(setcompletionhint3.setIconTintList);
                }

                @Override // o.WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0.setCenterIfNoTextEnabled
                public final void setIconTintList(WindowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline0 windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03, int i4) {
                    if (i4 == 0) {
                        windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline03.announceForAccessibility(fabTransformationSheetBehavior.getText());
                    }
                }
            };
            if (windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setSuffixText == null) {
                windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setSuffixText = new ArrayList();
            }
            windowInsetsCompat$Impl28$$ExternalSyntheticApiModelOutline02.setSuffixText.add(setcenterifnotextenabled);
            fabTransformationSheetBehavior.setOnClickListener(new View.OnClickListener() { // from class: o.getTranslateX.6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    getTranslateX gettranslatex = getTranslateX.this;
                    if (gettranslatex.setTitleMarginEnd == setX.YEAR) {
                        gettranslatex.MenuHostHelper$$ExternalSyntheticLambda1(setX.DAY);
                    } else if (gettranslatex.setTitleMarginEnd == setX.DAY) {
                        gettranslatex.MenuHostHelper$$ExternalSyntheticLambda1(setX.YEAR);
                    }
                }
            });
            fabTransformationSheetBehavior3.setOnClickListener(new View.OnClickListener() { // from class: o.getTranslateX.7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int layoutAnimation = ((androidx.recyclerview.widget.LinearLayoutManager) getTranslateX.this.setFilterRedundantCalls.setGuidelinePercent).setLayoutAnimation() + 1;
                    if (layoutAnimation < getTranslateX.this.setFilterRedundantCalls.setNavigationOnClickListener.setY()) {
                        getTranslateX gettranslatex = getTranslateX.this;
                        Calendar x = HideBottomViewOnScrollBehavior.setX(setremoteviewsadapter.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setX);
                        x.add(2, layoutAnimation);
                        gettranslatex.setX(new setCompletionHint(x));
                    }
                }
            });
            fabTransformationSheetBehavior2.setOnClickListener(new View.OnClickListener() { // from class: o.getTranslateX.8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int unboundedRipple = ((androidx.recyclerview.widget.LinearLayoutManager) getTranslateX.this.setFilterRedundantCalls.setGuidelinePercent).setUnboundedRipple() - 1;
                    if (unboundedRipple >= 0) {
                        getTranslateX gettranslatex = getTranslateX.this;
                        Calendar x = HideBottomViewOnScrollBehavior.setX(setremoteviewsadapter.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setX);
                        x.add(2, unboundedRipple);
                        gettranslatex.setX(new setCompletionHint(x));
                    }
                }
            });
        }
        if (!setTranslationZ.MenuHostHelper$$ExternalSyntheticLambda1(contextThemeWrapper, 16843277)) {
            new hintOnError().MenuHostHelper$$ExternalSyntheticLambda1(this.setFilterRedundantCalls);
        }
        this.setFilterRedundantCalls.MenuHostHelper$$ExternalSyntheticLambda0(setremoteviewsadapter.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setY(this.setTooltipText));
        return inflate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(setCompletionHint setcompletionhint) {
        setRemoteViewsAdapter setremoteviewsadapter = (setRemoteViewsAdapter) this.setFilterRedundantCalls.setNavigationOnClickListener;
        final int y = setremoteviewsadapter.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setY(setcompletionhint);
        int y2 = y - setremoteviewsadapter.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList.setY(this.setTooltipText);
        boolean z = Math.abs(y2) > 3;
        boolean z2 = y2 > 0;
        this.setTooltipText = setcompletionhint;
        if (z && z2) {
            this.setFilterRedundantCalls.MenuHostHelper$$ExternalSyntheticLambda0(y - 3);
            this.setFilterRedundantCalls.post(new Runnable() { // from class: o.getTranslateX.2
                @Override // java.lang.Runnable
                public final void run() {
                    getTranslateX.this.setFilterRedundantCalls.setIconTintList(y);
                }
            });
        } else if (z) {
            this.setFilterRedundantCalls.MenuHostHelper$$ExternalSyntheticLambda0(y + 3);
            this.setFilterRedundantCalls.post(new Runnable() { // from class: o.getTranslateX.2
                @Override // java.lang.Runnable
                public final void run() {
                    getTranslateX.this.setFilterRedundantCalls.setIconTintList(y);
                }
            });
        } else {
            this.setFilterRedundantCalls.post(new Runnable() { // from class: o.getTranslateX.2
                @Override // java.lang.Runnable
                public final void run() {
                    getTranslateX.this.setFilterRedundantCalls.setIconTintList(y);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setX setx) {
        this.setTitleMarginEnd = setx;
        if (setx == setX.YEAR) {
            this.getCallingPid.setGuidelinePercent.setX(this.setTooltipText.setLayoutAnimation - ((getInterfaceDescriptor) this.getCallingPid.setNavigationOnClickListener).MenuHostHelper$$ExternalSyntheticLambda1.setError.setIconTintList.setLayoutAnimation);
            this.setEmptyView.setVisibility(0);
            this.setHint.setVisibility(8);
        } else if (setx == setX.DAY) {
            this.setEmptyView.setVisibility(8);
            this.setHint.setVisibility(0);
            setX(this.setTooltipText);
        }
    }

    @Override // o.setSafeBrowsingWhitelist
    public final boolean setY(setTranslationX<S> settranslationx) {
        return super.setY(settranslationx);
    }
}