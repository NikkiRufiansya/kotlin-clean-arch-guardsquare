package com.google.android.gms.dynamic;

import android.os.IBinder;
import android.os.IInterface;
import o.AndroidDispatcherFactory;

/* loaded from: classes.dex */
public interface IObjectWrapper extends IInterface {

    /* loaded from: classes.dex */
    public static abstract class Stub extends AndroidDispatcherFactory implements IObjectWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static IObjectWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return queryLocalInterface instanceof IObjectWrapper ? (IObjectWrapper) queryLocalInterface : new zzb(iBinder);
        }
    }
}