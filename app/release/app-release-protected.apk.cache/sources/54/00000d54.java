package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public interface setMaxDate extends IInterface {
    int setY(setDrawSelectorOnTop setdrawselectorontop, String str);

    void setY(int i, String[] strArr);

    void setY(setDrawSelectorOnTop setdrawselectorontop, int i);

    /* loaded from: classes.dex */
    public static abstract class setY extends Binder implements setMaxDate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public setY() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int y = setY(setDrawSelectorOnTop$MenuHostHelper$$ExternalSyntheticLambda0.setX(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(y);
                return true;
            } else if (i == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                setY(setDrawSelectorOnTop$MenuHostHelper$$ExternalSyntheticLambda0.setX(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                setY(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }
}