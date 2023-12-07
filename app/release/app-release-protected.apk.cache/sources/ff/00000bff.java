package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;
import o.setAllowStacking;
import o.setCompletionHint;
import o.setGroupDividerEnabled;

/* loaded from: classes.dex */
public final class setGroupDividerEnabled implements Parcelable {
    public static final Parcelable.Creator<setGroupDividerEnabled> CREATOR = new Parcelable.Creator<setGroupDividerEnabled>() { // from class: com.google.android.material.datepicker.CalendarConstraints$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setGroupDividerEnabled createFromParcel(Parcel parcel) {
            return new setGroupDividerEnabled((setCompletionHint) parcel.readParcelable(setCompletionHint.class.getClassLoader()), (setCompletionHint) parcel.readParcelable(setCompletionHint.class.getClassLoader()), (setGroupDividerEnabled.setY) parcel.readParcelable(setGroupDividerEnabled.setY.class.getClassLoader()), (setCompletionHint) parcel.readParcelable(setCompletionHint.class.getClassLoader()), parcel.readInt(), (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ setGroupDividerEnabled[] newArray(int i) {
            return new setGroupDividerEnabled[i];
        }
    };
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    setCompletionHint MenuHostHelper$$ExternalSyntheticLambda1;
    final setCompletionHint setIconTintList;
    final int setNavigationOnClickListener;
    final setY setUiOptions;
    final setCompletionHint setX;
    final int setY;

    /* loaded from: classes.dex */
    public interface setY extends Parcelable {
        boolean MenuHostHelper$$ExternalSyntheticLambda1(long j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ setGroupDividerEnabled(setCompletionHint setcompletionhint, setCompletionHint setcompletionhint2, setY sety, setCompletionHint setcompletionhint3, int i, byte b) {
        this(setcompletionhint, setcompletionhint2, sety, setcompletionhint3, i);
    }

    private setGroupDividerEnabled(setCompletionHint setcompletionhint, setCompletionHint setcompletionhint2, setY sety, setCompletionHint setcompletionhint3, int i) {
        this.setIconTintList = setcompletionhint;
        this.setX = setcompletionhint2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setcompletionhint3;
        this.setY = i;
        this.setUiOptions = sety;
        if (setcompletionhint3 != null && setcompletionhint.setX.compareTo(setcompletionhint3.setX) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (setcompletionhint3 != null && setcompletionhint3.setX.compareTo(setcompletionhint2.setX) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i >= 0) {
            Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            calendar.clear();
            if (i <= calendar.getMaximum(7)) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = setcompletionhint.setY(setcompletionhint2) + 1;
                this.setNavigationOnClickListener = (setcompletionhint2.setLayoutAnimation - setcompletionhint.setLayoutAnimation) + 1;
                return;
            }
        }
        throw new IllegalArgumentException("firstDayOfWeek is not valid");
    }

    public final boolean equals(Object obj) {
        boolean x;
        if (this == obj) {
            return true;
        }
        if (obj instanceof setGroupDividerEnabled) {
            setGroupDividerEnabled setgroupdividerenabled = (setGroupDividerEnabled) obj;
            if (this.setIconTintList.equals(setgroupdividerenabled.setIconTintList) && this.setX.equals(setgroupdividerenabled.setX)) {
                x = setAllowStacking.setX.setX(this.MenuHostHelper$$ExternalSyntheticLambda1, setgroupdividerenabled.MenuHostHelper$$ExternalSyntheticLambda1);
                if (x && this.setY == setgroupdividerenabled.setY && this.setUiOptions.equals(setgroupdividerenabled.setUiOptions)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.setIconTintList, this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1, Integer.valueOf(this.setY), this.setUiOptions});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.setIconTintList, 0);
        parcel.writeParcelable(this.setX, 0);
        parcel.writeParcelable(this.MenuHostHelper$$ExternalSyntheticLambda1, 0);
        parcel.writeParcelable(this.setUiOptions, 0);
        parcel.writeInt(this.setY);
    }
}