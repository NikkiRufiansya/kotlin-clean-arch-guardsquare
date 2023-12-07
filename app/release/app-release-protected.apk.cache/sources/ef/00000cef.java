package o;

import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class setItemTextAppearanceInactive extends setDropDownBackgroundResource {
    private static final WeakHashMap setError = new WeakHashMap();
    private Bundle setHint;
    private final Map FirebaseRemoteConfigKtxRegistrar = Collections.synchronizedMap(new setFabAnchorMode());
    private int setTitleMarginEnd = 0;

    @Override // o.setDropDownBackgroundResource
    public final void Fragment$5() {
        super.Fragment$5();
        this.setTitleMarginEnd = 3;
        for (setButtonIconDrawableResource setbuttonicondrawableresource : this.FirebaseRemoteConfigKtxRegistrar.values()) {
            setbuttonicondrawableresource.setIconTintList();
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Bundle bundle) {
        super.MenuHostHelper$$ExternalSyntheticLambda1(bundle);
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.FirebaseRemoteConfigKtxRegistrar.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((setButtonIconDrawableResource) entry.getValue()).setY(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void setIconSize() {
        super.setIconSize();
        this.setTitleMarginEnd = 4;
        for (setButtonIconDrawableResource setbuttonicondrawableresource : this.FirebaseRemoteConfigKtxRegistrar.values()) {
            setbuttonicondrawableresource.setX();
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void setIconTintList(int i, int i2, Intent intent) {
        super.setIconTintList(i, i2, intent);
        for (setButtonIconDrawableResource setbuttonicondrawableresource : this.FirebaseRemoteConfigKtxRegistrar.values()) {
            setbuttonicondrawableresource.setY(i, i2, intent);
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void setIconTintList(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.setIconTintList(str, fileDescriptor, printWriter, strArr);
        for (setButtonIconDrawableResource setbuttonicondrawableresource : this.FirebaseRemoteConfigKtxRegistrar.values()) {
            setbuttonicondrawableresource.setX(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void setRevealInfo() {
        super.setRevealInfo();
        this.setTitleMarginEnd = 5;
        for (setButtonIconDrawableResource setbuttonicondrawableresource : this.FirebaseRemoteConfigKtxRegistrar.values()) {
            setbuttonicondrawableresource.setY();
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void setTextAlignment() {
        super.setTextAlignment();
        this.setTitleMarginEnd = 2;
        for (setButtonIconDrawableResource setbuttonicondrawableresource : this.FirebaseRemoteConfigKtxRegistrar.values()) {
            setbuttonicondrawableresource.MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    @Override // o.setDropDownBackgroundResource
    public final void setX(Bundle bundle) {
        super.setX(bundle);
        this.setTitleMarginEnd = 1;
        this.setHint = bundle;
        for (Map.Entry entry : this.FirebaseRemoteConfigKtxRegistrar.entrySet()) {
            ((setButtonIconDrawableResource) entry.getValue()).MenuHostHelper$$ExternalSyntheticLambda1(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }
}