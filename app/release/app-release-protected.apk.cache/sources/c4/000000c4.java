package com.google.android.material.bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import o.setOrientation;

/* loaded from: classes.dex */
protected class BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 extends setOrientation {
    public static final Parcelable.Creator<BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1> CREATOR = new Parcelable.ClassLoaderCreator<BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1>() { // from class: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(parcel, (ClassLoader) null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* synthetic */ BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1 createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1[i];
        }
    };
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    boolean MenuHostHelper$$ExternalSyntheticLambda1;
    final int setOnLongClickListener;
    int setX;
    boolean setY;

    public BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.setOnLongClickListener = parcel.readInt();
        this.setX = parcel.readInt();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.readInt() == 1;
        this.setY = parcel.readInt() == 1;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt() == 1;
    }

    public BottomSheetBehavior$MenuHostHelper$$ExternalSyntheticLambda1(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
        super(parcelable);
        this.setOnLongClickListener = bottomSheetBehavior.setTextAppearanceResource;
        this.setX = bottomSheetBehavior.setLayoutDirection;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = bottomSheetBehavior.MenuHostHelper$$ExternalSyntheticLambda0;
        this.setY = bottomSheetBehavior.setLayoutAnimation;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = bottomSheetBehavior.setGuidelinePercent;
    }

    @Override // o.setOrientation, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.setOnLongClickListener);
        parcel.writeInt(this.setX);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda1 ? 1 : 0);
        parcel.writeInt(this.setY ? 1 : 0);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0 ? 1 : 0);
    }
}