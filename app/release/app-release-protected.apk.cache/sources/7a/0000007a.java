package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public class StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1> CREATOR = new Parcelable.Creator<StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 createFromParcel(Parcel parcel) {
            return new StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1[] newArray(int i) {
            return new StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1[i];
        }
    };
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    List<StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0> MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    int[] setLayoutAnimation;
    int setNavigationOnClickListener;
    int setOnLongClickListener;
    int setUiOptions;
    int[] setUnboundedRipple;
    boolean setX;
    boolean setY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1(Parcel parcel) {
        this.setIconTintList = parcel.readInt();
        this.setUiOptions = parcel.readInt();
        int readInt = parcel.readInt();
        this.setNavigationOnClickListener = readInt;
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.setLayoutAnimation = iArr;
            parcel.readIntArray(iArr);
        }
        int readInt2 = parcel.readInt();
        this.setOnLongClickListener = readInt2;
        if (readInt2 > 0) {
            int[] iArr2 = new int[readInt2];
            this.setUnboundedRipple = iArr2;
            parcel.readIntArray(iArr2);
        }
        this.setY = parcel.readInt() == 1;
        this.setX = parcel.readInt() == 1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt() == 1;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readArrayList(StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0.class.getClassLoader());
    }

    public StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1(StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1 staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1) {
        this.setNavigationOnClickListener = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener;
        this.setIconTintList = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList;
        this.setUiOptions = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setUiOptions;
        this.setLayoutAnimation = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation;
        this.setOnLongClickListener = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
        this.setUnboundedRipple = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple;
        this.setY = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setY;
        this.setX = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.setX;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = staggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.setIconTintList);
        parcel.writeInt(this.setUiOptions);
        parcel.writeInt(this.setNavigationOnClickListener);
        if (this.setNavigationOnClickListener > 0) {
            parcel.writeIntArray(this.setLayoutAnimation);
        }
        parcel.writeInt(this.setOnLongClickListener);
        if (this.setOnLongClickListener > 0) {
            parcel.writeIntArray(this.setUnboundedRipple);
        }
        parcel.writeInt(this.setY ? 1 : 0);
        parcel.writeInt(this.setX ? 1 : 0);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : 0);
        parcel.writeList(this.MenuHostHelper$$ExternalSyntheticLambda1);
    }
}