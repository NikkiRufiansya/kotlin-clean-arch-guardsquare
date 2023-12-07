package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import o.setErrorTextColor;
import o.toString;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() { // from class: androidx.versionedparcelable.ParcelImpl.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    };
    private final toString MenuHostHelper$$ExternalSyntheticLambda0;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected ParcelImpl(Parcel parcel) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new setErrorTextColor(parcel).setLayoutAnimation();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new setErrorTextColor(parcel).setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda0);
    }
}