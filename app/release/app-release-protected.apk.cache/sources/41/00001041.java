package o;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class setTextAppearanceResource extends setHasDecor implements DialogInterface {
    public final setCheckedIconEnabled MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: protected */
    public setTextAppearanceResource(Context context, int i) {
        super(context, setY(context, i));
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new setCheckedIconEnabled(getContext(), this, getWindow());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int setY(Context context, int i) {
        if ((i >>> 24) > 0) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.res_0x7f04002a, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // o.setHasDecor, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        setCheckedIconEnabled setcheckediconenabled = this.MenuHostHelper$$ExternalSyntheticLambda1;
        setcheckediconenabled.setConstraintSet = charSequence;
        TextView textView = setcheckediconenabled.setAdapter;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setHasDecor, o.setUnboundedRipple, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        boolean z;
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        super.onCreate(bundle);
        final setCheckedIconEnabled setcheckediconenabled = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setcheckediconenabled.setIconSize == 0) {
            i = setcheckediconenabled.setIconTintList;
        } else {
            int i2 = setcheckediconenabled.setCenterIfNoTextEnabled;
            i = setcheckediconenabled.setIconTintList;
        }
        setcheckediconenabled.setMinAndMaxProgress.setContentView(i);
        View findViewById3 = setcheckediconenabled.setObjectValues.findViewById(R.id.res_0x7f0a0169);
        View findViewById4 = findViewById3.findViewById(R.id.res_0x7f0a01ff);
        View findViewById5 = findViewById3.findViewById(R.id.res_0x7f0a008d);
        View findViewById6 = findViewById3.findViewById(R.id.res_0x7f0a006a);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.res_0x7f0a0097);
        View view = setcheckediconenabled.setViewTranslationCallback;
        int i3 = setcheckediconenabled.setFilterTouchesWhenObscured;
        setcheckediconenabled.setObjectValues.setFlags(131072, 131072);
        viewGroup.setVisibility(8);
        View findViewById7 = viewGroup.findViewById(R.id.res_0x7f0a01ff);
        View findViewById8 = viewGroup.findViewById(R.id.res_0x7f0a008d);
        View findViewById9 = viewGroup.findViewById(R.id.res_0x7f0a006a);
        ViewGroup y = setCheckedIconEnabled.setY(findViewById7, findViewById4);
        ViewGroup y2 = setCheckedIconEnabled.setY(findViewById8, findViewById5);
        ViewGroup y3 = setCheckedIconEnabled.setY(findViewById9, findViewById6);
        setVelocityScale setvelocityscale = (setVelocityScale) setcheckediconenabled.setObjectValues.findViewById(R.id.res_0x7f0a019a);
        setcheckediconenabled.setContentScrimResource = setvelocityscale;
        setvelocityscale.setFocusable(false);
        setcheckediconenabled.setContentScrimResource.setNestedScrollingEnabled(false);
        TextView textView = (TextView) y2.findViewById(16908299);
        setcheckediconenabled.FragmentStateAdapter$5 = textView;
        if (textView != null) {
            CharSequence charSequence = setcheckediconenabled.SearchView$SavedState$1;
            textView.setVisibility(8);
            setcheckediconenabled.setContentScrimResource.removeView(setcheckediconenabled.FragmentStateAdapter$5);
            if (setcheckediconenabled.setHasDecor != null) {
                ViewGroup viewGroup2 = (ViewGroup) setcheckediconenabled.setContentScrimResource.getParent();
                int indexOfChild = viewGroup2.indexOfChild(setcheckediconenabled.setContentScrimResource);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(setcheckediconenabled.setHasDecor, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                y2.setVisibility(8);
            }
        }
        Button button = (Button) y3.findViewById(16908313);
        setcheckediconenabled.setChipCornerRadius = button;
        button.setOnClickListener(setcheckediconenabled.setY);
        if (TextUtils.isEmpty(setcheckediconenabled.setAnimationFromJson)) {
            Drawable drawable = setcheckediconenabled.setMaxEms;
            setcheckediconenabled.setChipCornerRadius.setVisibility(8);
            z = false;
        } else {
            setcheckediconenabled.setChipCornerRadius.setText(setcheckediconenabled.setAnimationFromJson);
            Drawable drawable2 = setcheckediconenabled.setMaxEms;
            setcheckediconenabled.setChipCornerRadius.setVisibility(0);
            z = true;
        }
        Button button2 = (Button) y3.findViewById(16908314);
        setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0 = button2;
        button2.setOnClickListener(setcheckediconenabled.setY);
        if (TextUtils.isEmpty(setcheckediconenabled.setUnboundedRipple)) {
            Drawable drawable3 = setcheckediconenabled.setNavigationOnClickListener;
            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(8);
        } else {
            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0.setText(setcheckediconenabled.setUnboundedRipple);
            Drawable drawable4 = setcheckediconenabled.setNavigationOnClickListener;
            setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0.setVisibility(0);
            z |= true;
        }
        Button button3 = (Button) y3.findViewById(16908315);
        setcheckediconenabled.setOnLongClickListener = button3;
        button3.setOnClickListener(setcheckediconenabled.setY);
        if (TextUtils.isEmpty(setcheckediconenabled.setTextAlignment)) {
            Drawable drawable5 = setcheckediconenabled.setUiOptions;
            setcheckediconenabled.setOnLongClickListener.setVisibility(8);
        } else {
            setcheckediconenabled.setOnLongClickListener.setText(setcheckediconenabled.setTextAlignment);
            Drawable drawable6 = setcheckediconenabled.setUiOptions;
            setcheckediconenabled.setOnLongClickListener.setVisibility(0);
            z |= true;
        }
        Context context = setcheckediconenabled.setTextScaleX;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.res_0x7f040028, typedValue, true);
        if (typedValue.data != 0) {
            if (z) {
                Button button4 = setcheckediconenabled.setChipCornerRadius;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (z) {
                Button button5 = setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda0;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (z) {
                Button button6 = setcheckediconenabled.setOnLongClickListener;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (!(z)) {
            y3.setVisibility(8);
        }
        if (setcheckediconenabled.setGuidelinePercent != null) {
            y.addView(setcheckediconenabled.setGuidelinePercent, 0, new ViewGroup.LayoutParams(-1, -2));
            setcheckediconenabled.setObjectValues.findViewById(R.id.res_0x7f0a01fb).setVisibility(8);
        } else {
            setcheckediconenabled.setChipIconTintResource = (ImageView) setcheckediconenabled.setObjectValues.findViewById(16908294);
            if ((!TextUtils.isEmpty(setcheckediconenabled.setConstraintSet)) && setcheckediconenabled.FragmentStateAdapter$2) {
                TextView textView2 = (TextView) setcheckediconenabled.setObjectValues.findViewById(R.id.res_0x7f0a0047);
                setcheckediconenabled.setAdapter = textView2;
                textView2.setText(setcheckediconenabled.setConstraintSet);
                int i4 = setcheckediconenabled.setLayoutDirection;
                Drawable drawable7 = setcheckediconenabled.setTextAppearanceResource;
                if (drawable7 != null) {
                    setcheckediconenabled.setChipIconTintResource.setImageDrawable(drawable7);
                } else {
                    setcheckediconenabled.setAdapter.setPadding(setcheckediconenabled.setChipIconTintResource.getPaddingLeft(), setcheckediconenabled.setChipIconTintResource.getPaddingTop(), setcheckediconenabled.setChipIconTintResource.getPaddingRight(), setcheckediconenabled.setChipIconTintResource.getPaddingBottom());
                    setcheckediconenabled.setChipIconTintResource.setVisibility(8);
                }
            } else {
                setcheckediconenabled.setObjectValues.findViewById(R.id.res_0x7f0a01fb).setVisibility(8);
                setcheckediconenabled.setChipIconTintResource.setVisibility(8);
                y.setVisibility(8);
            }
        }
        boolean z2 = (viewGroup == null || viewGroup.getVisibility() == 8) ? false : true;
        boolean z3 = (y == null || y.getVisibility() == 8) ? 0 : 1;
        boolean z4 = (y3 == null || y3.getVisibility() == 8) ? false : true;
        if (!z4 && y2 != null && (findViewById2 = y2.findViewById(R.id.res_0x7f0a01eb)) != null) {
            findViewById2.setVisibility(0);
        }
        final View view2 = null;
        if (z3) {
            setVelocityScale setvelocityscale2 = setcheckediconenabled.setContentScrimResource;
            if (setvelocityscale2 != null) {
                setvelocityscale2.setClipToPadding(true);
            }
            CharSequence charSequence2 = setcheckediconenabled.SearchView$SavedState$1;
            View findViewById10 = setcheckediconenabled.setHasDecor == null ? null : y.findViewById(R.id.res_0x7f0a01fa);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        } else if (y2 != null && (findViewById = y2.findViewById(R.id.res_0x7f0a01ec)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = setcheckediconenabled.setHasDecor;
        if (listView instanceof setCheckedIconEnabled$MenuHostHelper$$ExternalSyntheticLambda0) {
            ((setCheckedIconEnabled$MenuHostHelper$$ExternalSyntheticLambda0) listView).setHasDecor(z3, z4);
        }
        if (!z2) {
            View view3 = setcheckediconenabled.setHasDecor;
            if (view3 == null) {
                view3 = setcheckediconenabled.setContentScrimResource;
            }
            if (view3 != null) {
                int i5 = z3 | (z4 ? 2 : 0);
                final View findViewById11 = setcheckediconenabled.setObjectValues.findViewById(R.id.res_0x7f0a0199);
                View findViewById12 = setcheckediconenabled.setObjectValues.findViewById(R.id.res_0x7f0a0198);
                if (Build.VERSION.SDK_INT >= 23) {
                    setBaselineAlignBottom.setY(view3, i5, 3);
                    if (findViewById11 != null) {
                        y2.removeView(findViewById11);
                    }
                    if (findViewById12 != null) {
                        y2.removeView(findViewById12);
                    }
                } else {
                    if (findViewById11 != null && (i5 & 1) == 0) {
                        y2.removeView(findViewById11);
                        findViewById11 = null;
                    }
                    if (findViewById12 == null || (i5 & 2) != 0) {
                        view2 = findViewById12;
                    } else {
                        y2.removeView(findViewById12);
                    }
                    if (findViewById11 != null || view2 != null) {
                        CharSequence charSequence3 = setcheckediconenabled.SearchView$SavedState$1;
                        ListView listView2 = setcheckediconenabled.setHasDecor;
                        if (listView2 != null) {
                            listView2.setOnScrollListener(new AbsListView.OnScrollListener() { // from class: o.setCheckedIconEnabled.3
                                @Override // android.widget.AbsListView.OnScrollListener
                                public final void onScrollStateChanged(AbsListView absListView, int i6) {
                                }

                                @Override // android.widget.AbsListView.OnScrollListener
                                public final void onScroll(AbsListView absListView, int i6, int i7, int i8) {
                                    setCheckedIconEnabled.setY(absListView, findViewById11, view2);
                                }
                            });
                            setcheckediconenabled.setHasDecor.post(new Runnable() { // from class: o.setCheckedIconEnabled.2
                                @Override // java.lang.Runnable
                                public final void run() {
                                    setCheckedIconEnabled.setY(setcheckediconenabled.setHasDecor, findViewById11, view2);
                                }
                            });
                        } else {
                            if (findViewById11 != null) {
                                y2.removeView(findViewById11);
                            }
                            if (view2 != null) {
                                y2.removeView(view2);
                            }
                        }
                    }
                }
            }
        }
        ListView listView3 = setcheckediconenabled.setHasDecor;
        if (listView3 == null || (listAdapter = setcheckediconenabled.MenuHostHelper$$ExternalSyntheticLambda1) == null) {
            return;
        }
        listView3.setAdapter(listAdapter);
        int i6 = setcheckediconenabled.setOnNavigationItemSelectedListener;
        if (i6 >= 0) {
            listView3.setItemChecked(i6, true);
            listView3.setSelection(i6);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        setVelocityScale setvelocityscale = this.MenuHostHelper$$ExternalSyntheticLambda1.setContentScrimResource;
        if (setvelocityscale != null && setvelocityscale.setX(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        setVelocityScale setvelocityscale = this.MenuHostHelper$$ExternalSyntheticLambda1.setContentScrimResource;
        if (setvelocityscale != null && setvelocityscale.setX(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}