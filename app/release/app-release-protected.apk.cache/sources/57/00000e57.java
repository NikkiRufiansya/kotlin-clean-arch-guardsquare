package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.setOrientation;

/* loaded from: classes.dex */
public abstract class setOrientation implements Parcelable {
    public final Parcelable setUiOptions;
    public static final setOrientation setIconTintList = new setOrientation() { // from class: o.setOrientation.2
    };
    public static final Parcelable.Creator<setOrientation> CREATOR = new Parcelable.ClassLoaderCreator<setOrientation>() { // from class: androidx.customview.view.AbsSavedState$2
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            if (parcel.readParcelable(null) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return setOrientation.setIconTintList;
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* synthetic */ setOrientation createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return setOrientation.setIconTintList;
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setOrientation[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ setOrientation(byte b) {
        this();
    }

    private setOrientation() {
        this.setUiOptions = null;
    }

    public setOrientation(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.setUiOptions = parcelable == setIconTintList ? null : parcelable;
    }

    public setOrientation(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.setUiOptions = readParcelable == null ? setIconTintList : readParcelable;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.setUiOptions, i);
    }
}