package o;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Locale;
import o.setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1;

/* loaded from: classes.dex */
public final class setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1 implements Parcelable {
    public static final Parcelable.Creator<setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1> CREATOR = new Parcelable.Creator<setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1>() { // from class: com.google.android.material.badge.BadgeState$State$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1 createFromParcel(Parcel parcel) {
            return new setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1[] newArray(int i) {
            return new setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1[i];
        }
    };
    int MenuHostHelper$$ExternalSyntheticLambda0;
    Integer MenuHostHelper$$ExternalSyntheticLambda1;
    Boolean ViewPager$SavedState$1;
    Integer setAnimationFromJson;
    public Integer setCenterIfNoTextEnabled;
    int setChipCornerRadius;
    public int setIconSize;
    Integer setIconTintList;
    int setLayoutAnimation;
    public CharSequence setNavigationOnClickListener;
    public int setOnLongClickListener;
    Integer setOnNavigationItemSelectedListener;
    Integer setTextAlignment;
    Locale setTextScaleX;
    public int setUiOptions;
    Integer setUnboundedRipple;
    Integer setX;
    Integer setY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 255;
        this.setIconSize = -2;
        this.setChipCornerRadius = -2;
        this.ViewPager$SavedState$1 = Boolean.TRUE;
    }

    public setLeftTopRightBottom$MenuHostHelper$$ExternalSyntheticLambda1(Parcel parcel) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = 255;
        this.setIconSize = -2;
        this.setChipCornerRadius = -2;
        this.ViewPager$SavedState$1 = Boolean.TRUE;
        this.setLayoutAnimation = parcel.readInt();
        this.setY = (Integer) parcel.readSerializable();
        this.setUnboundedRipple = (Integer) parcel.readSerializable();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt();
        this.setIconSize = parcel.readInt();
        this.setChipCornerRadius = parcel.readInt();
        this.setNavigationOnClickListener = parcel.readString();
        this.setUiOptions = parcel.readInt();
        this.setIconTintList = (Integer) parcel.readSerializable();
        this.setCenterIfNoTextEnabled = (Integer) parcel.readSerializable();
        this.setOnNavigationItemSelectedListener = (Integer) parcel.readSerializable();
        this.setTextAlignment = (Integer) parcel.readSerializable();
        this.setAnimationFromJson = (Integer) parcel.readSerializable();
        this.setX = (Integer) parcel.readSerializable();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = (Integer) parcel.readSerializable();
        this.ViewPager$SavedState$1 = (Boolean) parcel.readSerializable();
        this.setTextScaleX = (Locale) parcel.readSerializable();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.setLayoutAnimation);
        parcel.writeSerializable(this.setY);
        parcel.writeSerializable(this.setUnboundedRipple);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0);
        parcel.writeInt(this.setIconSize);
        parcel.writeInt(this.setChipCornerRadius);
        CharSequence charSequence = this.setNavigationOnClickListener;
        parcel.writeString(charSequence == null ? null : charSequence.toString());
        parcel.writeInt(this.setUiOptions);
        parcel.writeSerializable(this.setIconTintList);
        parcel.writeSerializable(this.setCenterIfNoTextEnabled);
        parcel.writeSerializable(this.setOnNavigationItemSelectedListener);
        parcel.writeSerializable(this.setTextAlignment);
        parcel.writeSerializable(this.setAnimationFromJson);
        parcel.writeSerializable(this.setX);
        parcel.writeSerializable(this.MenuHostHelper$$ExternalSyntheticLambda1);
        parcel.writeSerializable(this.ViewPager$SavedState$1);
        parcel.writeSerializable(this.setTextScaleX);
    }
}