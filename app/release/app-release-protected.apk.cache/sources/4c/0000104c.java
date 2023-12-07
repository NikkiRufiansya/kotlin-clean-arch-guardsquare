package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import o.setTextFilterEnabled;

/* loaded from: classes.dex */
public final class setTextFilterEnabled extends SparseArray<Parcelable> implements Parcelable {
    public static final Parcelable.Creator<setTextFilterEnabled> CREATOR = new Parcelable.ClassLoaderCreator<setTextFilterEnabled>() { // from class: com.google.android.material.internal.ParcelableSparseArray$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setTextFilterEnabled(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* synthetic */ setTextFilterEnabled createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new setTextFilterEnabled(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setTextFilterEnabled[i];
        }
    };

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public setTextFilterEnabled() {
    }

    public setTextFilterEnabled(Parcel parcel, ClassLoader classLoader) {
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        for (int i = 0; i < readInt; i++) {
            put(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = size();
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = keyAt(i2);
            parcelableArr[i2] = valueAt(i2);
        }
        parcel.writeInt(size);
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}