package o;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import o.setCheckedIconEnabled;

/* loaded from: classes.dex */
public class setTextAppearanceResource$MenuHostHelper$$ExternalSyntheticLambda0 {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    public final setCheckedIconEnabled.setX setX;

    public setTextAppearanceResource$MenuHostHelper$$ExternalSyntheticLambda0(Context context) {
        this(context, setTextAppearanceResource.setY(context, 0));
    }

    private setTextAppearanceResource$MenuHostHelper$$ExternalSyntheticLambda0(Context context, int i) {
        this.setX = new setCheckedIconEnabled.setX(new ContextThemeWrapper(context, setTextAppearanceResource.setY(context, i)));
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i;
    }

    public final setTextAppearanceResource MenuHostHelper$$ExternalSyntheticLambda1() {
        int i;
        setTextAppearanceResource settextappearanceresource = new setTextAppearanceResource(this.setX.setX, this.MenuHostHelper$$ExternalSyntheticLambda0);
        final setCheckedIconEnabled.setX setx = this.setX;
        final setCheckedIconEnabled setcheckediconenabled = settextappearanceresource.MenuHostHelper$$ExternalSyntheticLambda1;
        View view = setx.setOnLongClickListener;
        if (view == null) {
            CharSequence charSequence = setx.SearchView$SavedState$1;
            if (charSequence != null) {
                setcheckediconenabled.setConstraintSet = charSequence;
                TextView textView = setcheckediconenabled.setAdapter;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = setx.setNavigationOnClickListener;
            if (drawable != null) {
                setcheckediconenabled.setTextAppearanceResource = drawable;
                setcheckediconenabled.setLayoutDirection = 0;
                ImageView imageView = setcheckediconenabled.setChipIconTintResource;
                if (imageView != null) {
                    if (drawable != null) {
                        imageView.setVisibility(0);
                        setcheckediconenabled.setChipIconTintResource.setImageDrawable(drawable);
                    } else {
                        imageView.setVisibility(8);
                    }
                }
            }
            int i2 = setx.setUnboundedRipple;
            int i3 = setx.setUiOptions;
        } else {
            setcheckediconenabled.setGuidelinePercent = view;
        }
        CharSequence charSequence2 = setx.setChipCornerRadius;
        CharSequence charSequence3 = setx.ExtendableSavedState$1;
        Drawable drawable2 = setx.setChipIconTintResource;
        CharSequence charSequence4 = setx.setAnimationFromJson;
        Drawable drawable3 = setx.setCenterIfNoTextEnabled;
        CharSequence charSequence5 = setx.setMaxEms;
        Drawable drawable4 = setx.setOnNavigationItemSelectedListener;
        CharSequence[] charSequenceArr = setx.setTextAlignment;
        Cursor cursor = setx.setIconTintList;
        if (setx.setY != null) {
            setCheckedIconEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setcheckediconenabled_menuhosthelper__externalsyntheticlambda0 = (setCheckedIconEnabled$MenuHostHelper$$ExternalSyntheticLambda0) setx.setLayoutAnimation.inflate(setcheckediconenabled.ExtendableSavedState$1, (ViewGroup) null);
            boolean z = setx.ViewPager$SavedState$1;
            if (setx.setIconSize) {
                i = setcheckediconenabled.FloatingActionButton$BaseBehavior;
            } else {
                i = setcheckediconenabled.setIconified;
            }
            Cursor cursor2 = setx.setIconTintList;
            ListAdapter listAdapter = setx.setY;
            if (listAdapter == null) {
                listAdapter = new setCheckedIconEnabled.setY(setx.setX, i, setx.setTextAlignment);
            }
            setCheckedIconEnabled.setX.setIconTintList seticontintlist = setx.setMinAndMaxProgress;
            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1 = listAdapter;
            setcheckediconenabled.setOnNavigationItemSelectedListener = setx.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setx.setLayoutDirection != null) {
                setcheckediconenabled_menuhosthelper__externalsyntheticlambda0.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: o.setCheckedIconEnabled.setX.2
                    @Override // android.widget.AdapterView.OnItemClickListener
                    public final void onItemClick(AdapterView<?> adapterView, View view2, int i4, long j) {
                        setx.setLayoutDirection.onClick(setcheckediconenabled.setMinAndMaxProgress, i4);
                        if (setx.setIconSize) {
                            return;
                        }
                        setcheckediconenabled.setMinAndMaxProgress.dismiss();
                    }
                });
            } else {
                DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener = setx.setZ;
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = setx.setGuidelinePercent;
            if (setx.setIconSize) {
                setcheckediconenabled_menuhosthelper__externalsyntheticlambda0.setChoiceMode(1);
            } else {
                boolean z2 = setx.ViewPager$SavedState$1;
            }
            setcheckediconenabled.setHasDecor = setcheckediconenabled_menuhosthelper__externalsyntheticlambda0;
        }
        View view2 = setx.setIconified;
        int i4 = setx.setHasDecor;
        settextappearanceresource.setCancelable(this.setX.MenuHostHelper$$ExternalSyntheticLambda1);
        if (this.setX.MenuHostHelper$$ExternalSyntheticLambda1) {
            settextappearanceresource.setCanceledOnTouchOutside(true);
        }
        settextappearanceresource.setOnCancelListener(this.setX.setTextScaleX);
        settextappearanceresource.setOnDismissListener(this.setX.setTextAppearanceResource);
        if (this.setX.setCheckedIconEnabled != null) {
            settextappearanceresource.setOnKeyListener(this.setX.setCheckedIconEnabled);
        }
        return settextappearanceresource;
    }
}