package o;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import o.D;

/* loaded from: classes.dex */
public final class D implements Parcelable {
    public static final Parcelable.Creator<D> CREATOR = new Parcelable.Creator<D>() { // from class: com.google.android.material.timepicker.TimeModel$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ D createFromParcel(Parcel parcel) {
            return new D(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ D[] newArray(int i) {
            return new D[i];
        }
    };
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    final B MenuHostHelper$$ExternalSyntheticLambda1;
    int setIconTintList;
    int setOnLongClickListener;
    int setUnboundedRipple;
    final B setX;
    int setY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public D() {
        this((byte) 0);
    }

    private D(byte b) {
        this(0, 0, 10, 0);
    }

    private D(int i, int i2, int i3, int i4) {
        this.setIconTintList = i;
        this.setY = i2;
        this.setUnboundedRipple = i3;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i4;
        this.setOnLongClickListener = i >= 12 ? 1 : 0;
        this.setX = new B(59);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new B(i4 == 1 ? 24 : 12);
    }

    public D(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public final void setY(int i) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
            this.setIconTintList = i;
        } else {
            this.setIconTintList = (i % 12) + (this.setOnLongClickListener != 1 ? 0 : 12);
        }
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0 == 1) {
            return this.setIconTintList % 24;
        }
        int i = this.setIconTintList;
        if (i % 12 == 0) {
            return 12;
        }
        return this.setOnLongClickListener == 1 ? i - 12 : i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.MenuHostHelper$$ExternalSyntheticLambda0), Integer.valueOf(this.setIconTintList), Integer.valueOf(this.setY), Integer.valueOf(this.setUnboundedRipple)});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof D) {
            D d = (D) obj;
            return this.setIconTintList == d.setIconTintList && this.setY == d.setY && this.MenuHostHelper$$ExternalSyntheticLambda0 == d.MenuHostHelper$$ExternalSyntheticLambda0 && this.setUnboundedRipple == d.setUnboundedRipple;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.setIconTintList);
        parcel.writeInt(this.setY);
        parcel.writeInt(this.setUnboundedRipple);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        if (i != this.setOnLongClickListener) {
            this.setOnLongClickListener = i;
            int i2 = this.setIconTintList;
            if (i2 < 12 && i == 1) {
                this.setIconTintList = i2 + 12;
            } else if (i2 < 12 || i != 0) {
            } else {
                this.setIconTintList = i2 - 12;
            }
        }
    }

    public static String setX(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
    }
}