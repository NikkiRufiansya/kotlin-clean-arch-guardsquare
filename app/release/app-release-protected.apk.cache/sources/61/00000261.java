package o;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import o.ViewPager$SavedState$1;

/* loaded from: classes.dex */
public final class ViewPager$SavedState$1 implements Parcelable {
    public static final Parcelable.Creator<ViewPager$SavedState$1> CREATOR = new Parcelable.Creator<ViewPager$SavedState$1>() { // from class: androidx.activity.result.ActivityResult$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ ViewPager$SavedState$1 createFromParcel(Parcel parcel) {
            return new ViewPager$SavedState$1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ ViewPager$SavedState$1[] newArray(int i) {
            return new ViewPager$SavedState$1[i];
        }
    };
    public final Intent MenuHostHelper$$ExternalSyntheticLambda0;
    public final int MenuHostHelper$$ExternalSyntheticLambda1;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ViewPager$SavedState$1(int i, Intent intent) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = intent;
    }

    public ViewPager$SavedState$1(Parcel parcel) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readInt();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (i != -1) {
            str = i != 0 ? String.valueOf(i) : "RESULT_CANCELED";
        } else {
            str = "RESULT_OK";
        }
        sb.append(str);
        sb.append(", data=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda1);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0 == null ? 0 : 1);
        Intent intent = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}