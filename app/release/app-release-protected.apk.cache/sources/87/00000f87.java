package o;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class setShowSoftInputOnFocus<S> extends setSafeBrowsingWhitelist<S> {
    private setGroupDividerEnabled FirebaseRemoteConfigKtxRegistrar;
    private setErrorIconTintMode<S> setError;
    private int setTitleMarginEnd;

    @Override // o.setDropDownBackgroundResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.setTitleMarginEnd);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.setError);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.FirebaseRemoteConfigKtxRegistrar);
    }

    @Override // o.setDropDownBackgroundResource
    public final void setX(Bundle bundle) {
        super.setX(bundle);
        if (bundle == null) {
            bundle = setMaxEms();
        }
        this.setTitleMarginEnd = bundle.getInt("THEME_RES_ID_KEY");
        this.setError = (setErrorIconTintMode) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.FirebaseRemoteConfigKtxRegistrar = (setGroupDividerEnabled) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // o.setDropDownBackgroundResource
    public final View setY(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(setCheckedIconEnabled(), this.setTitleMarginEnd));
        setErrorIconTintMode<S> seterroricontintmode = this.setError;
        new setTranslationX<S>() { // from class: o.setShowSoftInputOnFocus.4
            @Override // o.setTranslationX
            public final void setIconTintList(S s) {
                Iterator<setTranslationX<S>> it = setShowSoftInputOnFocus.this.setRevealInfo.iterator();
                while (it.hasNext()) {
                    it.next().setIconTintList(s);
                }
            }
        };
        return seterroricontintmode.setOnLongClickListener();
    }
}