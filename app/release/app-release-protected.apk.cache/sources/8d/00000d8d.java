package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public class setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0 extends setOrientation {
    public static final Parcelable.Creator<setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0> CREATOR = new Parcelable.ClassLoaderCreator<setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0>() { // from class: com.google.android.material.internal.CheckableImageButton$SavedState$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* synthetic */ setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0[i];
        }
    };
    boolean setX;

    public setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0(Parcelable parcelable) {
        super(parcelable);
    }

    public setMinAndMaxFrame$MenuHostHelper$$ExternalSyntheticLambda0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.setX = parcel.readInt() == 1;
    }

    @Override // o.setOrientation, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.setX ? 1 : 0);
    }
}