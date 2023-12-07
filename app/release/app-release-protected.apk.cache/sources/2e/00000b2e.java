package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import o.finalize;
import o.setElevation;

/* loaded from: classes.dex */
public final class setElevation implements Parcelable {
    public static final Parcelable.Creator<setElevation> CREATOR = new Parcelable.Creator<setElevation>() { // from class: androidx.fragment.app.BackStackState$1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ setElevation createFromParcel(Parcel parcel) {
            return new setElevation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ setElevation[] newArray(int i) {
            return new setElevation[i];
        }
    };
    final int MenuHostHelper$$ExternalSyntheticLambda0;
    final int[] MenuHostHelper$$ExternalSyntheticLambda1;
    final ArrayList<String> ViewPager$SavedState$1;
    final int setChipCornerRadius;
    final ArrayList<String> setIconSize;
    final CharSequence setIconTintList;
    final int[] setLayoutAnimation;
    final int[] setNavigationOnClickListener;
    final String setOnLongClickListener;
    final boolean setTextAlignment;
    final ArrayList<String> setUiOptions;
    final int setUnboundedRipple;
    final CharSequence setX;
    final int setY;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public setElevation(setBackgroundTintList setbackgroundtintlist) {
        int size = setbackgroundtintlist.setCenterIfNoTextEnabled.size();
        this.setNavigationOnClickListener = new int[size * 5];
        if (!setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1) {
            throw new IllegalStateException("Not on back stack");
        }
        this.setUiOptions = new ArrayList<>(size);
        this.setLayoutAnimation = new int[size];
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            finalize.setX setx = setbackgroundtintlist.setCenterIfNoTextEnabled.get(i);
            int i3 = i2 + 1;
            this.setNavigationOnClickListener[i2] = setx.setY;
            this.setUiOptions.add(setx.setX != null ? setx.setX.setShrinkMotionSpec : null);
            int i4 = i3 + 1;
            this.setNavigationOnClickListener[i3] = setx.setIconTintList;
            int i5 = i4 + 1;
            this.setNavigationOnClickListener[i4] = setx.MenuHostHelper$$ExternalSyntheticLambda0;
            int i6 = i5 + 1;
            this.setNavigationOnClickListener[i5] = setx.setOnLongClickListener;
            this.setNavigationOnClickListener[i6] = setx.setUiOptions;
            this.setLayoutAnimation[i] = setx.setLayoutAnimation.ordinal();
            this.MenuHostHelper$$ExternalSyntheticLambda1[i] = setx.MenuHostHelper$$ExternalSyntheticLambda1.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.setChipCornerRadius = setbackgroundtintlist.setMaxEms;
        this.setOnLongClickListener = setbackgroundtintlist.setTextAlignment;
        this.setUnboundedRipple = setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setbackgroundtintlist.setLayoutAnimation;
        this.setIconTintList = setbackgroundtintlist.setOnLongClickListener;
        this.setY = setbackgroundtintlist.setNavigationOnClickListener;
        this.setX = setbackgroundtintlist.setUnboundedRipple;
        this.ViewPager$SavedState$1 = setbackgroundtintlist.setOnNavigationItemSelectedListener;
        this.setIconSize = setbackgroundtintlist.setTextScaleX;
        this.setTextAlignment = setbackgroundtintlist.setAnimationFromJson;
    }

    public setElevation(Parcel parcel) {
        this.setNavigationOnClickListener = parcel.createIntArray();
        this.setUiOptions = parcel.createStringArrayList();
        this.setLayoutAnimation = parcel.createIntArray();
        this.MenuHostHelper$$ExternalSyntheticLambda1 = parcel.createIntArray();
        this.setChipCornerRadius = parcel.readInt();
        this.setOnLongClickListener = parcel.readString();
        this.setUnboundedRipple = parcel.readInt();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = parcel.readInt();
        this.setIconTintList = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.setY = parcel.readInt();
        this.setX = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.ViewPager$SavedState$1 = parcel.createStringArrayList();
        this.setIconSize = parcel.createStringArrayList();
        this.setTextAlignment = parcel.readInt() != 0;
    }

    public final setBackgroundTintList setIconTintList(ParcelImpl parcelImpl) {
        boolean isLoggable;
        setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(parcelImpl);
        int i = 0;
        int i2 = 0;
        while (i < this.setNavigationOnClickListener.length) {
            finalize.setX setx = new finalize.setX();
            int i3 = i + 1;
            setx.setY = this.setNavigationOnClickListener[i];
            isLoggable = Log.isLoggable("FragmentManager", 2);
            if (isLoggable) {
                StringBuilder sb = new StringBuilder("Instantiate ");
                sb.append(setbackgroundtintlist);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.setNavigationOnClickListener[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            String str = this.setUiOptions.get(i2);
            if (str == null) {
                setx.setX = null;
            } else {
                setOverscrollHeader setoverscrollheader = parcelImpl.setNavigationOnClickListener.setX.get(str);
                setx.setX = setoverscrollheader != null ? setoverscrollheader.setIconTintList : null;
            }
            setx.setLayoutAnimation = registerIn$MenuHostHelper$$ExternalSyntheticLambda1.values()[this.setLayoutAnimation[i2]];
            setx.MenuHostHelper$$ExternalSyntheticLambda1 = registerIn$MenuHostHelper$$ExternalSyntheticLambda1.values()[this.MenuHostHelper$$ExternalSyntheticLambda1[i2]];
            int i4 = i3 + 1;
            setx.setIconTintList = this.setNavigationOnClickListener[i3];
            int i5 = i4 + 1;
            setx.MenuHostHelper$$ExternalSyntheticLambda0 = this.setNavigationOnClickListener[i4];
            int i6 = i5 + 1;
            setx.setOnLongClickListener = this.setNavigationOnClickListener[i5];
            setx.setUiOptions = this.setNavigationOnClickListener[i6];
            setbackgroundtintlist.setChipCornerRadius = setx.setIconTintList;
            setbackgroundtintlist.ViewPager$SavedState$1 = setx.MenuHostHelper$$ExternalSyntheticLambda0;
            setbackgroundtintlist.setIconSize = setx.setOnLongClickListener;
            setbackgroundtintlist.setZ = setx.setUiOptions;
            setbackgroundtintlist.setX(setx);
            i2++;
            i = i6 + 1;
        }
        setbackgroundtintlist.setMaxEms = this.setChipCornerRadius;
        setbackgroundtintlist.setTextAlignment = this.setOnLongClickListener;
        setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda0 = this.setUnboundedRipple;
        setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        setbackgroundtintlist.setLayoutAnimation = this.MenuHostHelper$$ExternalSyntheticLambda0;
        setbackgroundtintlist.setOnLongClickListener = this.setIconTintList;
        setbackgroundtintlist.setNavigationOnClickListener = this.setY;
        setbackgroundtintlist.setUnboundedRipple = this.setX;
        setbackgroundtintlist.setOnNavigationItemSelectedListener = this.ViewPager$SavedState$1;
        setbackgroundtintlist.setTextScaleX = this.setIconSize;
        setbackgroundtintlist.setAnimationFromJson = this.setTextAlignment;
        setbackgroundtintlist.setY(1);
        return setbackgroundtintlist;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.setNavigationOnClickListener);
        parcel.writeStringList(this.setUiOptions);
        parcel.writeIntArray(this.setLayoutAnimation);
        parcel.writeIntArray(this.MenuHostHelper$$ExternalSyntheticLambda1);
        parcel.writeInt(this.setChipCornerRadius);
        parcel.writeString(this.setOnLongClickListener);
        parcel.writeInt(this.setUnboundedRipple);
        parcel.writeInt(this.MenuHostHelper$$ExternalSyntheticLambda0);
        TextUtils.writeToParcel(this.setIconTintList, parcel, 0);
        parcel.writeInt(this.setY);
        TextUtils.writeToParcel(this.setX, parcel, 0);
        parcel.writeStringList(this.ViewPager$SavedState$1);
        parcel.writeStringList(this.setIconSize);
        parcel.writeInt(this.setTextAlignment ? 1 : 0);
    }
}