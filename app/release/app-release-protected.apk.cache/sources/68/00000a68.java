package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import o.setCollapsedTitleGravity;

/* loaded from: classes.dex */
public final class setCollapsedTitleGravity implements Parcelable {
    public static final Parcelable.Creator<setCollapsedTitleGravity> CREATOR = new Parcelable.Creator<setCollapsedTitleGravity>() { // from class: androidx.fragment.app.FragmentState$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setCollapsedTitleGravity createFromParcel(Parcel parcel) {
            return new setCollapsedTitleGravity(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ setCollapsedTitleGravity[] newArray(int i) {
            return new setCollapsedTitleGravity[i];
        }
    };
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    final String MenuHostHelper$$ExternalSyntheticLambda1;
    final String setCenterIfNoTextEnabled;
    final String setIconSize;
    final int setIconTintList;
    final boolean setLayoutAnimation;
    final boolean setNavigationOnClickListener;
    final int setOnLongClickListener;
    Bundle setTextAlignment;
    final boolean setUiOptions;
    final boolean setUnboundedRipple;
    final boolean setX;
    final Bundle setY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCollapsedTitleGravity(setDropDownBackgroundResource setdropdownbackgroundresource) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setdropdownbackgroundresource.getClass().getName();
        this.setCenterIfNoTextEnabled = setdropdownbackgroundresource.setShrinkMotionSpec;
        this.setUiOptions = setdropdownbackgroundresource.setChipCornerRadius;
        this.setIconTintList = setdropdownbackgroundresource.setCenterIfNoTextEnabled;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setdropdownbackgroundresource.setLayoutAnimation;
        this.setIconSize = setdropdownbackgroundresource.setObjectValues;
        this.setLayoutAnimation = setdropdownbackgroundresource.setHasDecor;
        this.setNavigationOnClickListener = setdropdownbackgroundresource.ExtendableSavedState$1;
        this.setX = setdropdownbackgroundresource.setIconSize;
        this.setY = setdropdownbackgroundresource.setIconTintList;
        this.setUnboundedRipple = setdropdownbackgroundresource.setTextScaleX;
        this.setOnLongClickListener = setdropdownbackgroundresource.setGuidelinePercent.ordinal();
    }

    public setCollapsedTitleGravity(Parcel parcel) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readString();
        this.setCenterIfNoTextEnabled = parcel.readString();
        this.setUiOptions = parcel.readInt() != 0;
        this.setIconTintList = parcel.readInt();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt();
        this.setIconSize = parcel.readString();
        this.setLayoutAnimation = parcel.readInt() != 0;
        this.setNavigationOnClickListener = parcel.readInt() != 0;
        this.setX = parcel.readInt() != 0;
        this.setY = parcel.readBundle();
        this.setUnboundedRipple = parcel.readInt() != 0;
        this.setTextAlignment = parcel.readBundle();
        this.setOnLongClickListener = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(" (");
        sb.append(this.setCenterIfNoTextEnabled);
        sb.append(")}:");
        if (this.setUiOptions) {
            sb.append(" fromLayout");
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.MenuHostHelper$$ExternalSyntheticLambda0));
        }
        String str = this.setIconSize;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.setIconSize);
        }
        if (this.setLayoutAnimation) {
            sb.append(" retainInstance");
        }
        if (this.setNavigationOnClickListener) {
            sb.append(" removing");
        }
        if (this.setX) {
            sb.append(" detached");
        }
        if (this.setUnboundedRipple) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MenuHostHelper$$ExternalSyntheticLambda1);
        parcel.writeString(this.setCenterIfNoTextEnabled);
        parcel.writeInt(this.setUiOptions ? 1 : 0);
        parcel.writeInt(this.setIconTintList);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0);
        parcel.writeString(this.setIconSize);
        parcel.writeInt(this.setLayoutAnimation ? 1 : 0);
        parcel.writeInt(this.setNavigationOnClickListener ? 1 : 0);
        parcel.writeInt(this.setX ? 1 : 0);
        parcel.writeBundle(this.setY);
        parcel.writeInt(this.setUnboundedRipple ? 1 : 0);
        parcel.writeBundle(this.setTextAlignment);
        parcel.writeInt(this.setOnLongClickListener);
    }
}