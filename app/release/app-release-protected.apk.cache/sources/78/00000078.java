package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
class StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 implements Parcelable {
    public static final Parcelable.Creator<StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0> CREATOR = new Parcelable.Creator<StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0>() { // from class: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0 createFromParcel(Parcel parcel) {
            return new StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0[] newArray(int i) {
            return new StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0[i];
        }
    };
    int MenuHostHelper$$ExternalSyntheticLambda0;
    boolean setIconTintList;
    int setX;
    private int[] setY;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0(Parcel parcel) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt();
        this.setX = parcel.readInt();
        this.setIconTintList = parcel.readInt() == 1;
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int[] iArr = new int[readInt];
            this.setY = iArr;
            parcel.readIntArray(iArr);
        }
    }

    StaggeredGridLayoutManager$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0);
        parcel.writeInt(this.setX);
        parcel.writeInt(this.setIconTintList ? 1 : 0);
        int[] iArr = this.setY;
        if (iArr != null && iArr.length > 0) {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.setY);
            return;
        }
        parcel.writeInt(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FullSpanItem{mPosition=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", mGapDir=");
        sb.append(this.setX);
        sb.append(", mHasUnwantedGapAfter=");
        sb.append(this.setIconTintList);
        sb.append(", mGapPerSpan=");
        sb.append(Arrays.toString(this.setY));
        sb.append('}');
        return sb.toString();
    }
}