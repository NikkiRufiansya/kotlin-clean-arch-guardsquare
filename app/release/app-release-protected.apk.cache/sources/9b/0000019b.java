package o;

import android.os.Parcel;
import android.os.Parcelable;
import o.FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public class FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 extends setOrientation {
    public static final Parcelable.Creator<FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1> CREATOR = new Parcelable.ClassLoaderCreator<FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1>() { // from class: com.google.android.material.button.MaterialButton$SavedState$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* synthetic */ FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1[i];
        }
    };
    boolean MenuHostHelper$$ExternalSyntheticLambda0;

    public FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(Parcelable parcelable) {
        super(parcelable);
    }

    public FabTransformationSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt() == 1;
    }

    @Override // o.setOrientation, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : 0);
    }
}