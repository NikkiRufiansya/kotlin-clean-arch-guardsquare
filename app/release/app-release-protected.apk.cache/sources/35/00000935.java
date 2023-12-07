package o;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import o.ParcelImpl;

/* loaded from: classes.dex */
public class setAlignmentMode extends setDropDownBackgroundResource implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private boolean createDispatcher;
    private Dialog onActivityResumed;
    private boolean setEmptyView;
    private boolean setError;
    private Handler setFilterRedundantCalls;
    private boolean setTooltipText;
    private Runnable setHint = new Runnable() { // from class: o.setAlignmentMode.5
        @Override // java.lang.Runnable
        public final void run() {
            setAlignmentMode.this.setRevealInfo.onDismiss(setAlignmentMode.this.onActivityResumed);
        }
    };
    private DialogInterface.OnCancelListener setCloseIconEndPadding = new DialogInterface.OnCancelListener() { // from class: o.setAlignmentMode.1
        @Override // android.content.DialogInterface.OnCancelListener
        public final void onCancel(DialogInterface dialogInterface) {
            if (setAlignmentMode.this.onActivityResumed != null) {
                setAlignmentMode setalignmentmode = setAlignmentMode.this;
                setalignmentmode.onCancel(setalignmentmode.onActivityResumed);
            }
        }
    };
    private DialogInterface.OnDismissListener setRevealInfo = new DialogInterface.OnDismissListener() { // from class: o.setAlignmentMode.3
        @Override // android.content.DialogInterface.OnDismissListener
        public final void onDismiss(DialogInterface dialogInterface) {
            if (setAlignmentMode.this.onActivityResumed != null) {
                setAlignmentMode setalignmentmode = setAlignmentMode.this;
                setalignmentmode.onDismiss(setalignmentmode.onActivityResumed);
            }
        }
    };
    private int ActionMenuPresenter$SavedState$1 = 0;
    private int setNavigationIconTint = 0;
    private boolean FirebaseRemoteConfigKtxRegistrar = true;
    private boolean FabTransformationBehavior = true;
    private int setTitleMarginEnd = -1;
    private setOverlayMode<setTouchDelegate> Fragment$5 = new setOverlayMode<setTouchDelegate>() { // from class: o.setAlignmentMode.2
        @Override // o.setOverlayMode
        public final /* synthetic */ void setY(setTouchDelegate settouchdelegate) {
            boolean isLoggable;
            if (settouchdelegate == null || !setAlignmentMode.this.FabTransformationBehavior) {
                return;
            }
            View errorIconTintList = setAlignmentMode.this.setErrorIconTintList();
            if (errorIconTintList.getParent() == null) {
                if (setAlignmentMode.this.onActivityResumed != null) {
                    isLoggable = Log.isLoggable("FragmentManager", 3);
                    if (isLoggable) {
                        StringBuilder sb = new StringBuilder("DialogFragment ");
                        sb.append(this);
                        sb.append(" setting the content view on ");
                        sb.append(setAlignmentMode.this.onActivityResumed);
                        Log.d("FragmentManager", sb.toString());
                    }
                    setAlignmentMode.this.onActivityResumed.setContentView(errorIconTintList);
                    return;
                }
                return;
            }
            throw new IllegalStateException("DialogFragment can not be attached to a container view");
        }
    };
    private boolean getCallingPid = false;

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    public void setX() {
        MenuHostHelper$$ExternalSyntheticLambda0(false, false);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(boolean z, boolean z2) {
        if (this.setTooltipText) {
            return;
        }
        this.setTooltipText = true;
        this.createDispatcher = false;
        Dialog dialog = this.onActivityResumed;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.onActivityResumed.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.setFilterRedundantCalls.getLooper()) {
                    onDismiss(this.onActivityResumed);
                } else {
                    this.setFilterRedundantCalls.post(this.setHint);
                }
            }
        }
        this.setEmptyView = true;
        if (this.setTitleMarginEnd >= 0) {
            final ParcelImpl FragmentStateAdapter$5 = FragmentStateAdapter$5();
            final int i = this.setTitleMarginEnd;
            if (i < 0) {
                StringBuilder sb = new StringBuilder("Bad id: ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            FragmentStateAdapter$5.MenuHostHelper$$ExternalSyntheticLambda0(new ParcelImpl.setY(i, 1) { // from class: o.ParcelImpl$MenuHostHelper$$ExternalSyntheticLambda1
                final int setIconTintList;
                final String MenuHostHelper$$ExternalSyntheticLambda1 = null;
                final int setY = 1;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.setIconTintList = i;
                }

                @Override // o.ParcelImpl.setY
                public final boolean MenuHostHelper$$ExternalSyntheticLambda0(ArrayList<setBackgroundTintList> arrayList, ArrayList<Boolean> arrayList2) {
                    if (ParcelImpl.this.setTextAppearanceResource == null || this.setIconTintList >= 0 || this.MenuHostHelper$$ExternalSyntheticLambda1 != null || !ParcelImpl.this.setTextAppearanceResource.setMinAndMaxProgress().setY()) {
                        return ParcelImpl.this.setX(arrayList, arrayList2, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, this.setY);
                    }
                    return false;
                }
            }, false);
            this.setTitleMarginEnd = -1;
            return;
        }
        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(FragmentStateAdapter$5());
        setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1(this);
        if (z) {
            setbackgroundtintlist.setIconTintList();
        } else {
            setbackgroundtintlist.setX();
        }
    }

    public Dialog MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.onActivityResumed;
    }

    public final Dialog ViewPager$SavedState$1() {
        Dialog MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        StringBuilder sb = new StringBuilder("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public int setUiOptions() {
        return this.setNavigationIconTint;
    }

    public boolean setOnLongClickListener() {
        return this.FirebaseRemoteConfigKtxRegistrar;
    }

    @Override // o.setDropDownBackgroundResource
    public void setIconTintList(Context context) {
        super.setIconTintList(context);
        setError().setX(this.Fragment$5);
        if (this.createDispatcher) {
            return;
        }
        this.setTooltipText = false;
    }

    @Override // o.setDropDownBackgroundResource
    public void setCenterIfNoTextEnabled() {
        super.setCenterIfNoTextEnabled();
        if (!this.createDispatcher && !this.setTooltipText) {
            this.setTooltipText = true;
        }
        setError().setIconTintList(this.Fragment$5);
    }

    @Override // o.setDropDownBackgroundResource
    public void setX(Bundle bundle) {
        super.setX(bundle);
        this.setFilterRedundantCalls = new Handler();
        this.FabTransformationBehavior = this.setLayoutAnimation == 0;
        if (bundle != null) {
            this.ActionMenuPresenter$SavedState$1 = bundle.getInt("android:style", 0);
            this.setNavigationIconTint = bundle.getInt("android:theme", 0);
            this.FirebaseRemoteConfigKtxRegistrar = bundle.getBoolean("android:cancelable", true);
            this.FabTransformationBehavior = bundle.getBoolean("android:showsDialog", this.FabTransformationBehavior);
            this.setTitleMarginEnd = bundle.getInt("android:backStackId", -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setDropDownBackgroundResource
    public void setX(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.setX(layoutInflater, viewGroup, bundle);
        if (this.setImageTintMode != null || this.onActivityResumed == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.onActivityResumed.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setDropDownBackgroundResource
    public getInsets setIconTintList() {
        final getInsets iconTintList = super.setIconTintList();
        return new getInsets() { // from class: o.setAlignmentMode.4
            @Override // o.getInsets
            public final View setY(int i) {
                if (iconTintList.setY()) {
                    return iconTintList.setY(i);
                }
                return setAlignmentMode.this.setX(i);
            }

            @Override // o.getInsets
            public final boolean setY() {
                return iconTintList.setY() || setAlignmentMode.this.setChipCornerRadius();
            }
        };
    }

    View setX(int i) {
        Dialog dialog = this.onActivityResumed;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    boolean setChipCornerRadius() {
        return this.getCallingPid;
    }

    @Override // o.setDropDownBackgroundResource
    public LayoutInflater MenuHostHelper$$ExternalSyntheticLambda0(Bundle bundle) {
        boolean isLoggable;
        boolean isLoggable2;
        LayoutInflater MenuHostHelper$$ExternalSyntheticLambda0 = super.MenuHostHelper$$ExternalSyntheticLambda0(bundle);
        if (!this.FabTransformationBehavior || this.setError) {
            isLoggable = Log.isLoggable("FragmentManager", 2);
            if (isLoggable) {
                StringBuilder sb = new StringBuilder("getting layout inflater for DialogFragment ");
                sb.append(this);
                String obj = sb.toString();
                if (!this.FabTransformationBehavior) {
                    StringBuilder sb2 = new StringBuilder("mShowsDialog = false: ");
                    sb2.append(obj);
                    Log.d("FragmentManager", sb2.toString());
                } else {
                    StringBuilder sb3 = new StringBuilder("mCreatingDialog = true: ");
                    sb3.append(obj);
                    Log.d("FragmentManager", sb3.toString());
                }
            }
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }
        setIconSize(bundle);
        isLoggable2 = Log.isLoggable("FragmentManager", 2);
        if (isLoggable2) {
            StringBuilder sb4 = new StringBuilder("get layout inflater for DialogFragment ");
            sb4.append(this);
            sb4.append(" from dialog context");
            Log.d("FragmentManager", sb4.toString());
        }
        Dialog dialog = this.onActivityResumed;
        return dialog != null ? MenuHostHelper$$ExternalSyntheticLambda0.cloneInContext(dialog.getContext()) : MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public void setIconTintList(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public Dialog setIconTintList(Bundle bundle) {
        boolean isLoggable;
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("onCreateDialog called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        return new Dialog(setCallingWorkSourceUid(), setUiOptions());
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        boolean isLoggable;
        if (this.setEmptyView) {
            return;
        }
        isLoggable = Log.isLoggable("FragmentManager", 3);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("onDismiss called for DialogFragment ");
            sb.append(this);
            Log.d("FragmentManager", sb.toString());
        }
        MenuHostHelper$$ExternalSyntheticLambda0(true, true);
    }

    private void setIconSize(Bundle bundle) {
        if (this.FabTransformationBehavior && !this.getCallingPid) {
            try {
                this.setError = true;
                Dialog iconTintList = setIconTintList(bundle);
                this.onActivityResumed = iconTintList;
                if (this.FabTransformationBehavior) {
                    setIconTintList(iconTintList, this.ActionMenuPresenter$SavedState$1);
                    Context checkedIconEnabled = setCheckedIconEnabled();
                    if (checkedIconEnabled instanceof Activity) {
                        this.onActivityResumed.setOwnerActivity((Activity) checkedIconEnabled);
                    }
                    this.onActivityResumed.setCancelable(this.FirebaseRemoteConfigKtxRegistrar);
                    this.onActivityResumed.setOnCancelListener(this.setCloseIconEndPadding);
                    this.onActivityResumed.setOnDismissListener(this.setRevealInfo);
                    this.getCallingPid = true;
                } else {
                    this.onActivityResumed = null;
                }
            } finally {
                this.setError = false;
            }
        }
    }

    @Override // o.setDropDownBackgroundResource
    public void setY(Bundle bundle) {
        Bundle bundle2;
        super.setY(bundle);
        if (this.onActivityResumed == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.onActivityResumed.onRestoreInstanceState(bundle2);
    }

    @Override // o.setDropDownBackgroundResource
    public void setTextAlignment() {
        super.setTextAlignment();
        Dialog dialog = this.onActivityResumed;
        if (dialog != null) {
            this.setEmptyView = false;
            dialog.show();
            View decorView = this.onActivityResumed.getWindow().getDecorView();
            setShadowLayer.setX(decorView, this);
            decorView.setTag(R.id.res_0x7f0a0219, this);
            pN.setY(decorView, "");
            decorView.setTag(R.id.res_0x7f0a0218, this);
        }
    }

    @Override // o.setDropDownBackgroundResource
    public void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
        Dialog dialog = this.onActivityResumed;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.ActionMenuPresenter$SavedState$1;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.setNavigationIconTint;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.FirebaseRemoteConfigKtxRegistrar;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.FabTransformationBehavior;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.setTitleMarginEnd;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // o.setDropDownBackgroundResource
    public void setIconSize() {
        super.setIconSize();
        Dialog dialog = this.onActivityResumed;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // o.setDropDownBackgroundResource
    public void setLayoutAnimation() {
        super.setLayoutAnimation();
        Dialog dialog = this.onActivityResumed;
        if (dialog != null) {
            this.setEmptyView = true;
            dialog.setOnDismissListener(null);
            this.onActivityResumed.dismiss();
            if (!this.setTooltipText) {
                onDismiss(this.onActivityResumed);
            }
            this.onActivityResumed = null;
            this.getCallingPid = false;
        }
    }
}