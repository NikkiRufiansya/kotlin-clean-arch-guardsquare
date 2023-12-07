package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0;

/* loaded from: classes.dex */
public class setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0 extends setOrientation {
    public static final Parcelable.Creator<setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0> CREATOR = new Parcelable.ClassLoaderCreator<setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0>() { // from class: androidx.appcompat.widget.Toolbar$SavedState$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* synthetic */ setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0[i];
        }
    };
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    int setX;

    public setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.setX = parcel.readInt();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt() != 0;
    }

    public setTranscriptMode$MenuHostHelper$$ExternalSyntheticLambda0(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // o.setOrientation, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.setX);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : 0);
    }
}