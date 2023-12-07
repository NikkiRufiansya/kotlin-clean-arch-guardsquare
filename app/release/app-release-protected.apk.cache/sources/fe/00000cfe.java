package o;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import o.setTextAppearance;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setKeyframes {
    int MenuHostHelper$$ExternalSyntheticLambda1;
    final Context setIconTintList;
    final String setLayoutAnimation;
    final ServiceConnection setNavigationOnClickListener;
    final Runnable setOnLongClickListener;
    final Runnable setTextAlignment;
    setMaxDate setUiOptions;
    final setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1 setUnboundedRipple;
    final setTextAppearance setX;
    final Executor setY;
    final setDrawSelectorOnTop MenuHostHelper$$ExternalSyntheticLambda0 = new setDrawSelectorOnTop$MenuHostHelper$$ExternalSyntheticLambda0() { // from class: o.setKeyframes.2
        @Override // o.setDrawSelectorOnTop
        public final void setIconTintList(final String[] strArr) {
            setKeyframes.this.setY.execute(new Runnable() { // from class: o.setKeyframes.2.2
                @Override // java.lang.Runnable
                public final void run() {
                    setTextAppearance settextappearance = setKeyframes.this.setX;
                    String[] strArr2 = strArr;
                    synchronized (settextappearance.setOnLongClickListener) {
                        Iterator<Map.Entry<setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1, setTextAppearance.setY>> it = settextappearance.setOnLongClickListener.iterator();
                        while (it.hasNext()) {
                            Map.Entry<setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1, setTextAppearance.setY> next = it.next();
                            if (!next.getKey().MenuHostHelper$$ExternalSyntheticLambda0()) {
                                setTextAppearance.setY value = next.getValue();
                                Set<String> set = null;
                                if (value.setIconTintList.length == 1) {
                                    int length = strArr2.length;
                                    int i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            break;
                                        } else if (strArr2[i].equalsIgnoreCase(value.setIconTintList[0])) {
                                            set = value.MenuHostHelper$$ExternalSyntheticLambda0;
                                            break;
                                        } else {
                                            i++;
                                        }
                                    }
                                } else {
                                    HashSet hashSet = new HashSet();
                                    for (String str : strArr2) {
                                        String[] strArr3 = value.setIconTintList;
                                        int length2 = strArr3.length;
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < length2) {
                                                String str2 = strArr3[i2];
                                                if (str2.equalsIgnoreCase(str)) {
                                                    hashSet.add(str2);
                                                    break;
                                                }
                                                i2++;
                                            }
                                        }
                                    }
                                    if (hashSet.size() > 0) {
                                        set = hashSet;
                                    }
                                }
                                if (set != null) {
                                    value.setX.setY(set);
                                }
                            }
                        }
                    }
                }
            });
        }
    };
    final AtomicBoolean setIconSize = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: package-private */
    public setKeyframes(Context context, String str, Intent intent, setTextAppearance settextappearance, Executor executor) {
        ServiceConnection serviceConnection = new ServiceConnection() { // from class: o.setKeyframes.5
            @Override // android.content.ServiceConnection
            public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                setMaxDate setmaxdate;
                setKeyframes setkeyframes = setKeyframes.this;
                if (iBinder == null) {
                    setmaxdate = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof setMaxDate)) {
                        setmaxdate = (setMaxDate) queryLocalInterface;
                    } else {
                        setmaxdate = new setMaxDate(iBinder) { // from class: o.setMaxDate$setY$MenuHostHelper$$ExternalSyntheticLambda0
                            private IBinder setY;

                            /* JADX INFO: Access modifiers changed from: package-private */
                            {
                                this.setY = iBinder;
                            }

                            @Override // android.os.IInterface
                            public final IBinder asBinder() {
                                return this.setY;
                            }

                            @Override // o.setMaxDate
                            public final int setY(setDrawSelectorOnTop setdrawselectorontop, String str2) {
                                Parcel obtain = Parcel.obtain();
                                Parcel obtain2 = Parcel.obtain();
                                try {
                                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                                    obtain.writeStrongBinder(setdrawselectorontop != null ? setdrawselectorontop.asBinder() : null);
                                    obtain.writeString(str2);
                                    this.setY.transact(1, obtain, obtain2, 0);
                                    obtain2.readException();
                                    return obtain2.readInt();
                                } finally {
                                    obtain2.recycle();
                                    obtain.recycle();
                                }
                            }

                            @Override // o.setMaxDate
                            public final void setY(setDrawSelectorOnTop setdrawselectorontop, int i) {
                                Parcel obtain = Parcel.obtain();
                                Parcel obtain2 = Parcel.obtain();
                                try {
                                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                                    obtain.writeStrongBinder(setdrawselectorontop != null ? setdrawselectorontop.asBinder() : null);
                                    obtain.writeInt(i);
                                    this.setY.transact(2, obtain, obtain2, 0);
                                    obtain2.readException();
                                } finally {
                                    obtain2.recycle();
                                    obtain.recycle();
                                }
                            }

                            @Override // o.setMaxDate
                            public final void setY(int i, String[] strArr) {
                                Parcel obtain = Parcel.obtain();
                                try {
                                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                                    obtain.writeInt(i);
                                    obtain.writeStringArray(strArr);
                                    this.setY.transact(3, obtain, null, 1);
                                } finally {
                                    obtain.recycle();
                                }
                            }
                        };
                    }
                }
                setkeyframes.setUiOptions = setmaxdate;
                setKeyframes.this.setY.execute(setKeyframes.this.setTextAlignment);
            }

            @Override // android.content.ServiceConnection
            public final void onServiceDisconnected(ComponentName componentName) {
                setKeyframes.this.setY.execute(setKeyframes.this.setOnLongClickListener);
                setKeyframes.this.setUiOptions = null;
            }
        };
        this.setNavigationOnClickListener = serviceConnection;
        this.setTextAlignment = new Runnable() { // from class: o.setKeyframes.3
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    setMaxDate setmaxdate = setKeyframes.this.setUiOptions;
                    if (setmaxdate != null) {
                        setKeyframes setkeyframes = setKeyframes.this;
                        setkeyframes.MenuHostHelper$$ExternalSyntheticLambda1 = setmaxdate.setY(setkeyframes.MenuHostHelper$$ExternalSyntheticLambda0, setKeyframes.this.setLayoutAnimation);
                        setKeyframes.this.setX.setX(setKeyframes.this.setUnboundedRipple);
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot register multi-instance invalidation callback", e);
                }
            }
        };
        this.setOnLongClickListener = new Runnable() { // from class: o.setKeyframes.1
            @Override // java.lang.Runnable
            public final void run() {
                setTextAppearance.setY MenuHostHelper$$ExternalSyntheticLambda0;
                setTextAppearance settextappearance2 = setKeyframes.this.setX;
                setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1 settextappearance_menuhosthelper__externalsyntheticlambda1 = setKeyframes.this.setUnboundedRipple;
                synchronized (settextappearance2.setOnLongClickListener) {
                    MenuHostHelper$$ExternalSyntheticLambda0 = settextappearance2.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda0(settextappearance_menuhosthelper__externalsyntheticlambda1);
                }
                if (MenuHostHelper$$ExternalSyntheticLambda0 != null && settextappearance2.setUnboundedRipple.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1) && settextappearance2.setY.setUiOptions()) {
                    settextappearance2.MenuHostHelper$$ExternalSyntheticLambda0(settextappearance2.setY.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0());
                }
            }
        };
        Context applicationContext = context.getApplicationContext();
        this.setIconTintList = applicationContext;
        this.setLayoutAnimation = str;
        this.setX = settextappearance;
        this.setY = executor;
        this.setUnboundedRipple = new setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1((String[]) settextappearance.setUiOptions.keySet().toArray(new String[0])) { // from class: o.setKeyframes.4
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // o.setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1
            public final boolean MenuHostHelper$$ExternalSyntheticLambda0() {
                return true;
            }

            @Override // o.setTextAppearance$MenuHostHelper$$ExternalSyntheticLambda1
            public final void setY(Set<String> set) {
                if (setKeyframes.this.setIconSize.get()) {
                    return;
                }
                try {
                    setMaxDate setmaxdate = setKeyframes.this.setUiOptions;
                    if (setmaxdate != null) {
                        setmaxdate.setY(setKeyframes.this.MenuHostHelper$$ExternalSyntheticLambda1, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        };
        applicationContext.bindService(intent, serviceConnection, 1);
    }
}