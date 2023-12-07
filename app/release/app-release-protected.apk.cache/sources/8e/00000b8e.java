package o;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class setErrorTextColor extends setTitleMarginBottom {
    private final int MenuHostHelper$$ExternalSyntheticLambda0;
    private final String ViewPager$SavedState$1;
    private int setLayoutAnimation;
    private final SparseIntArray setNavigationOnClickListener;
    private int setOnLongClickListener;
    private final Parcel setUiOptions;
    private final int setUnboundedRipple;
    private int setY;

    public setErrorTextColor(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new setFabAnchorMode(), new setFabAnchorMode(), new setFabAnchorMode());
    }

    private setErrorTextColor(Parcel parcel, int i, int i2, String str, setFabAnchorMode<String, Method> setfabanchormode, setFabAnchorMode<String, Method> setfabanchormode2, setFabAnchorMode<String, Class> setfabanchormode3) {
        super(setfabanchormode, setfabanchormode2, setfabanchormode3);
        this.setNavigationOnClickListener = new SparseIntArray();
        this.setY = -1;
        this.setOnLongClickListener = -1;
        this.setUiOptions = parcel;
        this.setUnboundedRipple = i;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
        this.setLayoutAnimation = i;
        this.ViewPager$SavedState$1 = str;
    }

    @Override // o.setTitleMarginBottom
    public final boolean setY(int i) {
        while (this.setLayoutAnimation < this.MenuHostHelper$$ExternalSyntheticLambda0) {
            int i2 = this.setOnLongClickListener;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.setUiOptions.setDataPosition(this.setLayoutAnimation);
            int readInt = this.setUiOptions.readInt();
            this.setOnLongClickListener = this.setUiOptions.readInt();
            this.setLayoutAnimation += readInt;
        }
        return this.setOnLongClickListener == i;
    }

    @Override // o.setTitleMarginBottom
    public final void setIconTintList(int i) {
        setX();
        this.setY = i;
        this.setNavigationOnClickListener.put(i, this.setUiOptions.dataPosition());
        this.setUiOptions.writeInt(0);
        this.setUiOptions.writeInt(i);
    }

    @Override // o.setTitleMarginBottom
    public final void setX() {
        int i = this.setY;
        if (i >= 0) {
            int i2 = this.setNavigationOnClickListener.get(i);
            int dataPosition = this.setUiOptions.dataPosition();
            this.setUiOptions.setDataPosition(i2);
            this.setUiOptions.writeInt(dataPosition - i2);
            this.setUiOptions.setDataPosition(dataPosition);
        }
    }

    @Override // o.setTitleMarginBottom
    protected final setTitleMarginBottom MenuHostHelper$$ExternalSyntheticLambda1() {
        Parcel parcel = this.setUiOptions;
        int dataPosition = parcel.dataPosition();
        int i = this.setLayoutAnimation;
        if (i == this.setUnboundedRipple) {
            i = this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.ViewPager$SavedState$1);
        sb.append("  ");
        return new setErrorTextColor(parcel, dataPosition, i2, sb.toString(), this.MenuHostHelper$$ExternalSyntheticLambda1, this.setIconTintList, this.setX);
    }

    @Override // o.setTitleMarginBottom
    public final void setIconTintList(byte[] bArr) {
        if (bArr != null) {
            this.setUiOptions.writeInt(bArr.length);
            this.setUiOptions.writeByteArray(bArr);
            return;
        }
        this.setUiOptions.writeInt(-1);
    }

    @Override // o.setTitleMarginBottom
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setUiOptions.writeInt(i);
    }

    @Override // o.setTitleMarginBottom
    public final void MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        this.setUiOptions.writeString(str);
    }

    @Override // o.setTitleMarginBottom
    public final void setY(Parcelable parcelable) {
        this.setUiOptions.writeParcelable(parcelable, 0);
    }

    @Override // o.setTitleMarginBottom
    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z) {
        this.setUiOptions.writeInt(z ? 1 : 0);
    }

    @Override // o.setTitleMarginBottom
    protected final void MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.setUiOptions, 0);
    }

    @Override // o.setTitleMarginBottom
    protected final CharSequence setUnboundedRipple() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.setUiOptions);
    }

    @Override // o.setTitleMarginBottom
    public final int setUiOptions() {
        return this.setUiOptions.readInt();
    }

    @Override // o.setTitleMarginBottom
    public final String setOnLongClickListener() {
        return this.setUiOptions.readString();
    }

    @Override // o.setTitleMarginBottom
    public final byte[] setIconTintList() {
        int readInt = this.setUiOptions.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.setUiOptions.readByteArray(bArr);
        return bArr;
    }

    @Override // o.setTitleMarginBottom
    public final <T extends Parcelable> T setNavigationOnClickListener() {
        return (T) this.setUiOptions.readParcelable(getClass().getClassLoader());
    }

    @Override // o.setTitleMarginBottom
    public final boolean setY() {
        return this.setUiOptions.readInt() != 0;
    }
}