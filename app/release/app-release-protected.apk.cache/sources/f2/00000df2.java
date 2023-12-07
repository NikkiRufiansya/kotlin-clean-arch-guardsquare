package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.setGroupDividerEnabled;
import o.setOnCreateContextMenuListener;

/* loaded from: classes.dex */
public final class setOnCreateContextMenuListener implements setGroupDividerEnabled.setY {
    public static final Parcelable.Creator<setOnCreateContextMenuListener> CREATOR = new Parcelable.Creator<setOnCreateContextMenuListener>() { // from class: com.google.android.material.datepicker.DateValidatorPointForward$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setOnCreateContextMenuListener createFromParcel(Parcel parcel) {
            return new setOnCreateContextMenuListener(parcel.readLong(), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ setOnCreateContextMenuListener[] newArray(int i) {
            return new setOnCreateContextMenuListener[i];
        }
    };
    private final long setY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ setOnCreateContextMenuListener(long j, byte b) {
        this(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setOnCreateContextMenuListener(long j) {
        this.setY = j;
    }

    @Override // o.setGroupDividerEnabled.setY
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1(long j) {
        return j >= this.setY;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.setY);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof setOnCreateContextMenuListener) && this.setY == ((setOnCreateContextMenuListener) obj).setY;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.setY)});
    }
}