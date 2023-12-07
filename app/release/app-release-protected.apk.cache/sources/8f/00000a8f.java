package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import o.setCompletionHint;

/* loaded from: classes.dex */
public final class setCompletionHint implements Comparable<setCompletionHint>, Parcelable {
    public static final Parcelable.Creator<setCompletionHint> CREATOR = new Parcelable.Creator<setCompletionHint>() { // from class: com.google.android.material.datepicker.Month$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setCompletionHint createFromParcel(Parcel parcel) {
            return setCompletionHint.setY(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ setCompletionHint[] newArray(int i) {
            return new setCompletionHint[i];
        }
    };
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    final int MenuHostHelper$$ExternalSyntheticLambda1;
    String setIconTintList;
    final int setLayoutAnimation;
    final long setNavigationOnClickListener;
    final Calendar setX;
    final int setY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(setCompletionHint setcompletionhint) {
        return this.setX.compareTo(setcompletionhint.setX);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCompletionHint(Calendar calendar) {
        calendar.set(5, 1);
        Calendar x = HideBottomViewOnScrollBehavior.setX(calendar);
        this.setX = x;
        this.setY = x.get(2);
        this.setLayoutAnimation = x.get(1);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = x.getMaximum(7);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = x.getActualMaximum(5);
        this.setNavigationOnClickListener = x.getTimeInMillis();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setY(int i) {
        int i2 = this.setX.get(7);
        if (i <= 0) {
            i = this.setX.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.MenuHostHelper$$ExternalSyntheticLambda0 : i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof setCompletionHint) {
            setCompletionHint setcompletionhint = (setCompletionHint) obj;
            return this.setY == setcompletionhint.setY && this.setLayoutAnimation == setcompletionhint.setLayoutAnimation;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.setY), Integer.valueOf(this.setLayoutAnimation)});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setY(setCompletionHint setcompletionhint) {
        if (this.setX instanceof GregorianCalendar) {
            return ((setcompletionhint.setLayoutAnimation - this.setLayoutAnimation) * 12) + (setcompletionhint.setY - this.setY);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.setLayoutAnimation);
        parcel.writeInt(this.setY);
    }

    public static setCompletionHint setY(int i, int i2) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar.clear();
        calendar.set(1, i);
        calendar.set(2, i2);
        return new setCompletionHint(calendar);
    }
}