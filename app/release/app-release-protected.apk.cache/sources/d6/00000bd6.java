package o;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import o.ParcelImpl;
import o.setFilters;

/* loaded from: classes.dex */
public final class setFilters implements Parcelable {
    public static final Parcelable.Creator<setFilters> CREATOR = new Parcelable.Creator<setFilters>() { // from class: androidx.fragment.app.FragmentManagerState$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setFilters createFromParcel(Parcel parcel) {
            return new setFilters(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ setFilters[] newArray(int i) {
            return new setFilters[i];
        }
    };
    ArrayList<ParcelImpl.setIconTintList> MenuHostHelper$$ExternalSyntheticLambda0;
    ArrayList<String> MenuHostHelper$$ExternalSyntheticLambda1;
    ArrayList<setCollapsedTitleGravity> setIconTintList;
    ArrayList<Bundle> setNavigationOnClickListener;
    ArrayList<String> setOnLongClickListener;
    String setUnboundedRipple;
    int setX;
    setElevation[] setY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public setFilters() {
        this.setUnboundedRipple = null;
        this.setOnLongClickListener = new ArrayList<>();
        this.setNavigationOnClickListener = new ArrayList<>();
    }

    public setFilters(Parcel parcel) {
        this.setUnboundedRipple = null;
        this.setOnLongClickListener = new ArrayList<>();
        this.setNavigationOnClickListener = new ArrayList<>();
        this.setIconTintList = parcel.createTypedArrayList(setCollapsedTitleGravity.CREATOR);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.createStringArrayList();
        this.setY = (setElevation[]) parcel.createTypedArray(setElevation.CREATOR);
        this.setX = parcel.readInt();
        this.setUnboundedRipple = parcel.readString();
        this.setOnLongClickListener = parcel.createStringArrayList();
        this.setNavigationOnClickListener = parcel.createTypedArrayList(Bundle.CREATOR);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.createTypedArrayList(ParcelImpl.setIconTintList.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.setIconTintList);
        parcel.writeStringList(this.MenuHostHelper$$ExternalSyntheticLambda1);
        parcel.writeTypedArray(this.setY, i);
        parcel.writeInt(this.setX);
        parcel.writeString(this.setUnboundedRipple);
        parcel.writeStringList(this.setOnLongClickListener);
        parcel.writeTypedList(this.setNavigationOnClickListener);
        parcel.writeTypedList(this.MenuHostHelper$$ExternalSyntheticLambda0);
    }
}