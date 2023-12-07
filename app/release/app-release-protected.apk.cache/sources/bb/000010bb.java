package o;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import o.setBaselineAlignBottom;
import o.setGroupDividerEnabled;

/* loaded from: classes.dex */
public final class setTranslationZ<S> extends setAlignmentMode {
    private CharSequence ActionMenuPresenter$SavedState$1;
    private setGroupDividerEnabled FabTransformationBehavior;
    setMinAndMaxFrame FirebaseRemoteConfigKtxRegistrar;
    private boolean Fragment$5;
    private int RemoteActionCompatParcelizer;
    private CharSequence TextInputLayout$SavedState$1;
    private getTranslateX<S> createDispatcher;
    private int minusKey;
    private setSafeBrowsingWhitelist<S> setBackgroundTintMode;
    private int setChipSpacingHorizontal;
    private setWebViewClient setCloseIconEndPadding;
    setErrorIconTintMode<S> setError;
    private CharSequence setErrorIconTintList;
    private int setLineBreakStyle;
    private int setNavigationIconTint;
    private boolean setRevealInfo;
    private TextView setSubmitButtonEnabled;
    Button setTitleMarginEnd;
    private static Object setFilterRedundantCalls = "CONFIRM_BUTTON_TAG";
    private static Object setTooltipText = "CANCEL_BUTTON_TAG";
    private static Object onActivityResumed = "TOGGLE_BUTTON_TAG";
    final LinkedHashSet<setCheckedIconResource<? super S>> getCallingPid = new LinkedHashSet<>();
    final LinkedHashSet<View.OnClickListener> setHint = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> setEmptyView = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> setChipIconEnabledResource = new LinkedHashSet<>();

    @Override // o.setAlignmentMode, o.setDropDownBackgroundResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        setCompletionHint setcompletionhint;
        super.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.setChipSpacingHorizontal);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.setError);
        setGroupDividerEnabled$MenuHostHelper$$ExternalSyntheticLambda1 setgroupdividerenabled_menuhosthelper__externalsyntheticlambda1 = new setGroupDividerEnabled$MenuHostHelper$$ExternalSyntheticLambda1(this.FabTransformationBehavior);
        if (this.createDispatcher.setTooltipText != null) {
            setgroupdividerenabled_menuhosthelper__externalsyntheticlambda1.setIconTintList = Long.valueOf(this.createDispatcher.setTooltipText.setNavigationOnClickListener);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", setgroupdividerenabled_menuhosthelper__externalsyntheticlambda1.setY);
        long j = setgroupdividerenabled_menuhosthelper__externalsyntheticlambda1.setX;
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.setTimeInMillis(j);
        setCompletionHint setcompletionhint2 = new setCompletionHint(calendar);
        long j2 = setgroupdividerenabled_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.clear();
        calendar2.setTimeInMillis(j2);
        setCompletionHint setcompletionhint3 = new setCompletionHint(calendar2);
        setGroupDividerEnabled.setY sety = (setGroupDividerEnabled.setY) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = setgroupdividerenabled_menuhosthelper__externalsyntheticlambda1.setIconTintList;
        if (l == null) {
            setcompletionhint = null;
        } else {
            long longValue = l.longValue();
            Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar3.clear();
            calendar3.setTimeInMillis(longValue);
            setcompletionhint = new setCompletionHint(calendar3);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new setGroupDividerEnabled(setcompletionhint2, setcompletionhint3, sety, setcompletionhint, setgroupdividerenabled_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1, (byte) 0));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.minusKey);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.setErrorIconTintList);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.RemoteActionCompatParcelizer);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.TextInputLayout$SavedState$1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.setLineBreakStyle);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.ActionMenuPresenter$SavedState$1);
    }

    @Override // o.setAlignmentMode, o.setDropDownBackgroundResource
    public final void setX(Bundle bundle) {
        super.setX(bundle);
        if (bundle == null) {
            bundle = setMaxEms();
        }
        this.setChipSpacingHorizontal = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.setError = (setErrorIconTintMode) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.FabTransformationBehavior = (setGroupDividerEnabled) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.minusKey = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.setErrorIconTintList = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.setNavigationIconTint = bundle.getInt("INPUT_MODE_KEY");
        this.RemoteActionCompatParcelizer = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.TextInputLayout$SavedState$1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.setLineBreakStyle = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.ActionMenuPresenter$SavedState$1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    private int setOnScrollChangeListener() {
        int i = this.setChipSpacingHorizontal;
        if (i != 0) {
            return i;
        }
        if (this.setError == null) {
            this.setError = (setErrorIconTintMode) setMaxEms().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.setError.setY();
    }

    @Override // o.setAlignmentMode
    public final Dialog setIconTintList(Bundle bundle) {
        Context callingWorkSourceUid = setCallingWorkSourceUid();
        setCallingWorkSourceUid();
        Dialog dialog = new Dialog(callingWorkSourceUid, setOnScrollChangeListener());
        Context context = dialog.getContext();
        this.Fragment$5 = MenuHostHelper$$ExternalSyntheticLambda1(context, 16843277);
        int i = setShowDividerVertical.setIconTintList(context, (int) R.attr.res_0x7f040101, setTranslationZ.class.getCanonicalName()).data;
        setWebViewClient setwebviewclient = new setWebViewClient(context, null, R.attr.res_0x7f0402be, R.style._res_0x7f1503d7);
        this.setCloseIconEndPadding = setwebviewclient;
        setwebviewclient.setX(context);
        setWebViewClient setwebviewclient2 = this.setCloseIconEndPadding;
        ColorStateList valueOf = ColorStateList.valueOf(i);
        if (setwebviewclient2.setChipIconTintResource.setX != valueOf) {
            setwebviewclient2.setChipIconTintResource.setX = valueOf;
            setwebviewclient2.onStateChange(setwebviewclient2.getState());
        }
        this.setCloseIconEndPadding.setIconSize(setBaselineAlignBottom.setUiOptions(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.Fragment$5 ? R.layout.res_0x7f0d0068 : R.layout.res_0x7f0d0067, viewGroup);
        Context context = inflate.getContext();
        if (this.Fragment$5) {
            inflate.findViewById(R.id.res_0x7f0a0135).setLayoutParams(new LinearLayout.LayoutParams(MenuHostHelper$$ExternalSyntheticLambda0(context), -2));
        } else {
            inflate.findViewById(R.id.res_0x7f0a0136).setLayoutParams(new LinearLayout.LayoutParams(MenuHostHelper$$ExternalSyntheticLambda0(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.res_0x7f0a0141);
        this.setSubmitButtonEnabled = textView;
        textView.setAccessibilityLiveRegion(1);
        this.FirebaseRemoteConfigKtxRegistrar = (setMinAndMaxFrame) inflate.findViewById(R.id.res_0x7f0a0143);
        TextView textView2 = (TextView) inflate.findViewById(R.id.res_0x7f0a0147);
        CharSequence charSequence = this.setErrorIconTintList;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.minusKey);
        }
        this.FirebaseRemoteConfigKtxRegistrar.setTag(onActivityResumed);
        setMinAndMaxFrame setminandmaxframe = this.FirebaseRemoteConfigKtxRegistrar;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, setFilterTouchesWhenObscured.setIconTintList(context, R.drawable.res_0x7f0800a8));
        stateListDrawable.addState(new int[0], setFilterTouchesWhenObscured.setIconTintList(context, R.drawable.res_0x7f0800aa));
        setminandmaxframe.setImageDrawable(stateListDrawable);
        this.FirebaseRemoteConfigKtxRegistrar.setChecked(this.setNavigationIconTint != 0);
        setBaselineAlignBottom.setX(this.FirebaseRemoteConfigKtxRegistrar, (setCounterOverflowTextColor) null);
        MenuHostHelper$$ExternalSyntheticLambda1(this.FirebaseRemoteConfigKtxRegistrar);
        this.FirebaseRemoteConfigKtxRegistrar.setOnClickListener(new View.OnClickListener() { // from class: o.setTranslationZ.1
            {
                setTranslationZ.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Button button = setTranslationZ.this.setTitleMarginEnd;
                setTranslationZ settranslationz = setTranslationZ.this;
                if (settranslationz.setError == null) {
                    settranslationz.setError = (setErrorIconTintMode) settranslationz.setMaxEms().getParcelable("DATE_SELECTOR_KEY");
                }
                button.setEnabled(settranslationz.setError.setNavigationOnClickListener());
                setTranslationZ.this.FirebaseRemoteConfigKtxRegistrar.toggle();
                setTranslationZ settranslationz2 = setTranslationZ.this;
                settranslationz2.MenuHostHelper$$ExternalSyntheticLambda1(settranslationz2.FirebaseRemoteConfigKtxRegistrar);
                setTranslationZ.this.setMinEms();
            }
        });
        this.setTitleMarginEnd = (Button) inflate.findViewById(R.id.res_0x7f0a0089);
        if (this.setError == null) {
            this.setError = (setErrorIconTintMode) setMaxEms().getParcelable("DATE_SELECTOR_KEY");
        }
        if (this.setError.setNavigationOnClickListener()) {
            this.setTitleMarginEnd.setEnabled(true);
        } else {
            this.setTitleMarginEnd.setEnabled(false);
        }
        this.setTitleMarginEnd.setTag(setFilterRedundantCalls);
        CharSequence charSequence2 = this.TextInputLayout$SavedState$1;
        if (charSequence2 != null) {
            this.setTitleMarginEnd.setText(charSequence2);
        } else {
            int i = this.RemoteActionCompatParcelizer;
            if (i != 0) {
                this.setTitleMarginEnd.setText(i);
            }
        }
        this.setTitleMarginEnd.setOnClickListener(new View.OnClickListener() { // from class: o.setTranslationZ.4
            {
                setTranslationZ.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator<setCheckedIconResource<? super S>> it = setTranslationZ.this.getCallingPid.iterator();
                while (it.hasNext()) {
                    it.next();
                    setTranslationZ settranslationz = setTranslationZ.this;
                    if (settranslationz.setError == null) {
                        settranslationz.setError = (setErrorIconTintMode) settranslationz.setMaxEms().getParcelable("DATE_SELECTOR_KEY");
                    }
                    setErrorIconTintMode<S> seterroricontintmode = settranslationz.setError;
                }
                setTranslationZ.this.setX();
            }
        });
        Button button = (Button) inflate.findViewById(R.id.res_0x7f0a006d);
        button.setTag(setTooltipText);
        CharSequence charSequence3 = this.ActionMenuPresenter$SavedState$1;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i2 = this.setLineBreakStyle;
            if (i2 != 0) {
                button.setText(i2);
            }
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: o.setTranslationZ.2
            {
                setTranslationZ.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Iterator<View.OnClickListener> it = setTranslationZ.this.setHint.iterator();
                while (it.hasNext()) {
                    it.next().onClick(view);
                }
                setTranslationZ.this.setX();
            }
        });
        return inflate;
    }

    @Override // o.setAlignmentMode, o.setDropDownBackgroundResource
    public final void setTextAlignment() {
        super.setTextAlignment();
        Window window = ViewPager$SavedState$1().getWindow();
        if (this.Fragment$5) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.setCloseIconEndPadding);
            if (!this.setRevealInfo) {
                final View findViewById = setErrorIconTintList().findViewById(R.id.res_0x7f0a00da);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int y = setIndeterminateDrawable.setY(window.getContext(), 16842801, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(y);
                }
                Integer valueOf2 = Integer.valueOf(y);
                setCloseIconResource.setIconTintList(window, false);
                int iconTintList = Build.VERSION.SDK_INT < 23 ? setExtended.setIconTintList(setIndeterminateDrawable.setY(window.getContext(), 16843857, -16777216), 128) : 0;
                int iconTintList2 = Build.VERSION.SDK_INT < 27 ? setExtended.setIconTintList(setIndeterminateDrawable.setY(window.getContext(), 16843858, -16777216), 128) : 0;
                window.setStatusBarColor(iconTintList);
                window.setNavigationBarColor(iconTintList2);
                int intValue = valueOf.intValue();
                setCloseIconResource.setY(window, window.getDecorView()).setIconTintList((iconTintList != 0 && (setExtended.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList) > 0.5d ? 1 : (setExtended.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList) == 0.5d ? 0 : -1)) > 0) || (iconTintList == 0 && (intValue != 0 && (setExtended.MenuHostHelper$$ExternalSyntheticLambda0(intValue) > 0.5d ? 1 : (setExtended.MenuHostHelper$$ExternalSyntheticLambda0(intValue) == 0.5d ? 0 : -1)) > 0)));
                int intValue2 = valueOf2.intValue();
                boolean z3 = intValue2 != 0 && setExtended.MenuHostHelper$$ExternalSyntheticLambda0(intValue2) > 0.5d;
                if ((iconTintList2 != 0 && setExtended.MenuHostHelper$$ExternalSyntheticLambda0(iconTintList2) > 0.5d) || (iconTintList2 == 0 && z3)) {
                    z = true;
                }
                setCloseIconResource.setY(window, window.getDecorView()).setY(z);
                final int paddingTop = findViewById.getPaddingTop();
                final int i = findViewById.getLayoutParams().height;
                setBaselineAlignBottom.setUnboundedRipple.MenuHostHelper$$ExternalSyntheticLambda1(findViewById, new setCircularRevealScrimColor() { // from class: o.setTranslationZ.3
                    {
                        setTranslationZ.this = this;
                    }

                    @Override // o.setCircularRevealScrimColor
                    public final WindowInsetsCompat setIconTintList(View view, WindowInsetsCompat windowInsetsCompat) {
                        int i2 = windowInsetsCompat.MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat.setNavigationOnClickListener.setIconTintList()).MenuHostHelper$$ExternalSyntheticLambda1;
                        if (i >= 0) {
                            findViewById.getLayoutParams().height = i + i2;
                            View view2 = findViewById;
                            view2.setLayoutParams(view2.getLayoutParams());
                        }
                        View view3 = findViewById;
                        view3.setPadding(view3.getPaddingLeft(), paddingTop + i2, findViewById.getPaddingRight(), findViewById.getPaddingBottom());
                        return windowInsetsCompat;
                    }
                });
                this.setRevealInfo = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = setSuffixText().getDimensionPixelOffset(R.dimen.res_0x7f0701c8);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.setCloseIconEndPadding, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new setItemPaddingTop(ViewPager$SavedState$1(), rect));
        }
        setMinEms();
    }

    @Override // o.setAlignmentMode, o.setDropDownBackgroundResource
    public final void setIconSize() {
        this.setBackgroundTintMode.MenuHostHelper$$ExternalSyntheticLambda0();
        super.setIconSize();
    }

    @Override // o.setAlignmentMode, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.setEmptyView.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // o.setAlignmentMode, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.setChipIconEnabledResource.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    final void setMinEms() {
        setSafeBrowsingWhitelist<S> setsafebrowsingwhitelist;
        setCallingWorkSourceUid();
        int onScrollChangeListener = setOnScrollChangeListener();
        if (this.setError == null) {
            this.setError = (setErrorIconTintMode) setMaxEms().getParcelable("DATE_SELECTOR_KEY");
        }
        setErrorIconTintMode<S> seterroricontintmode = this.setError;
        setGroupDividerEnabled setgroupdividerenabled = this.FabTransformationBehavior;
        getTranslateX<S> gettranslatex = new getTranslateX<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", onScrollChangeListener);
        bundle.putParcelable("GRID_SELECTOR_KEY", seterroricontintmode);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", setgroupdividerenabled);
        bundle.putParcelable("CURRENT_MONTH_KEY", setgroupdividerenabled.MenuHostHelper$$ExternalSyntheticLambda1);
        gettranslatex.ViewPager$SavedState$1(bundle);
        this.createDispatcher = gettranslatex;
        if (!this.FirebaseRemoteConfigKtxRegistrar.isChecked()) {
            setsafebrowsingwhitelist = this.createDispatcher;
        } else {
            if (this.setError == null) {
                this.setError = (setErrorIconTintMode) setMaxEms().getParcelable("DATE_SELECTOR_KEY");
            }
            setErrorIconTintMode<S> seterroricontintmode2 = this.setError;
            setGroupDividerEnabled setgroupdividerenabled2 = this.FabTransformationBehavior;
            setsafebrowsingwhitelist = new setShowSoftInputOnFocus<>();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", onScrollChangeListener);
            bundle2.putParcelable("DATE_SELECTOR_KEY", seterroricontintmode2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", setgroupdividerenabled2);
            setsafebrowsingwhitelist.ViewPager$SavedState$1(bundle2);
        }
        this.setBackgroundTintMode = setsafebrowsingwhitelist;
        setRowOrderPreserved();
        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(setMinAndMaxProgress());
        setbackgroundtintlist.setIconTintList(R.id.res_0x7f0a0135, this.setBackgroundTintMode, null, 2);
        setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1();
        this.setBackgroundTintMode.setY(new setTranslationX<S>() { // from class: o.setTranslationZ.5
            {
                setTranslationZ.this = this;
            }

            @Override // o.setTranslationX
            public final void setIconTintList(S s) {
                setTranslationZ.this.setRowOrderPreserved();
                Button button = setTranslationZ.this.setTitleMarginEnd;
                setTranslationZ settranslationz = setTranslationZ.this;
                if (settranslationz.setError == null) {
                    settranslationz.setError = (setErrorIconTintMode) settranslationz.setMaxEms().getParcelable("DATE_SELECTOR_KEY");
                }
                button.setEnabled(settranslationz.setError.setNavigationOnClickListener());
            }
        });
    }

    final void MenuHostHelper$$ExternalSyntheticLambda1(setMinAndMaxFrame setminandmaxframe) {
        String string;
        if (this.FirebaseRemoteConfigKtxRegistrar.isChecked()) {
            string = setminandmaxframe.getContext().getString(R.string.res_0x7f140090);
        } else {
            string = setminandmaxframe.getContext().getString(R.string.res_0x7f140092);
        }
        this.FirebaseRemoteConfigKtxRegistrar.setContentDescription(string);
    }

    public static boolean MenuHostHelper$$ExternalSyntheticLambda1(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(setShowDividerVertical.setIconTintList(context, (int) R.attr.res_0x7f0402be, getTranslateX.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    private static int MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.res_0x7f0701c0);
        int i = new setCompletionHint(HideBottomViewOnScrollBehavior.setIconTintList()).MenuHostHelper$$ExternalSyntheticLambda0;
        return (dimensionPixelOffset << 1) + (resources.getDimensionPixelSize(R.dimen.res_0x7f0701c6) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.res_0x7f0701d4));
    }

    final void setRowOrderPreserved() {
        if (this.setError == null) {
            this.setError = (setErrorIconTintMode) setMaxEms().getParcelable("DATE_SELECTOR_KEY");
        }
        setErrorIconTintMode<S> seterroricontintmode = this.setError;
        setCheckedIconEnabled();
        String iconTintList = seterroricontintmode.setIconTintList();
        this.setSubmitButtonEnabled.setContentDescription(String.format(setIconTintList((int) R.string.res_0x7f140077), iconTintList));
        this.setSubmitButtonEnabled.setText(iconTintList);
    }
}