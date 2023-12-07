package o;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class setDrawSelectorOnTop$MenuHostHelper$$ExternalSyntheticLambda0 extends Binder implements setDrawSelectorOnTop {
    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this;
    }

    public setDrawSelectorOnTop$MenuHostHelper$$ExternalSyntheticLambda0() {
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
    }

    public static setDrawSelectorOnTop setX(final IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
        if (queryLocalInterface != null && (queryLocalInterface instanceof setDrawSelectorOnTop)) {
            return (setDrawSelectorOnTop) queryLocalInterface;
        }
        return new setDrawSelectorOnTop(iBinder) { // from class: o.setDrawSelectorOnTop$MenuHostHelper$$ExternalSyntheticLambda0$MenuHostHelper$$ExternalSyntheticLambda0
            private IBinder setIconTintList;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.setIconTintList = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.setIconTintList;
            }

            @Override // o.setDrawSelectorOnTop
            public final void setIconTintList(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.setIconTintList.transact(1, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        };
    }

    @Override // android.os.Binder
    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            setIconTintList(parcel.createStringArray());
            return true;
        } else if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        } else {
            return super.onTransact(i, parcel, parcel2, i2);
        }
    }
}