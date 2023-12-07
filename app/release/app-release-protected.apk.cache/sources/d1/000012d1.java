package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.writeObject$MenuHostHelper$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public class writeObject$MenuHostHelper$$ExternalSyntheticLambda0 implements Parcelable {
    public static final Parcelable.Creator<writeObject$MenuHostHelper$$ExternalSyntheticLambda0> CREATOR = new Parcelable.Creator<writeObject$MenuHostHelper$$ExternalSyntheticLambda0>() { // from class: com.google.android.material.navigation.NavigationBarPresenter$SavedState$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ writeObject$MenuHostHelper$$ExternalSyntheticLambda0 createFromParcel(Parcel parcel) {
            return new writeObject$MenuHostHelper$$ExternalSyntheticLambda0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ writeObject$MenuHostHelper$$ExternalSyntheticLambda0[] newArray(int i) {
            return new writeObject$MenuHostHelper$$ExternalSyntheticLambda0[i];
        }
    };
    setTextFilterEnabled MenuHostHelper$$ExternalSyntheticLambda0;
    int setY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public writeObject$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    public writeObject$MenuHostHelper$$ExternalSyntheticLambda0(Parcel parcel) {
        this.setY = parcel.readInt();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = (setTextFilterEnabled) parcel.readParcelable(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.setY);
        parcel.writeParcelable(this.MenuHostHelper$$ExternalSyntheticLambda0, 0);
    }
}