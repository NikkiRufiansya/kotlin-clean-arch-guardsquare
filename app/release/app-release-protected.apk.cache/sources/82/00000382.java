package o;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import o.setMaxDate;

/* loaded from: classes.dex */
public class consumeDisplayCutout extends Service {
    int setIconTintList = 0;
    final HashMap<Integer, String> MenuHostHelper$$ExternalSyntheticLambda1 = new HashMap<>();
    final RemoteCallbackList<setDrawSelectorOnTop> MenuHostHelper$$ExternalSyntheticLambda0 = new RemoteCallbackList<setDrawSelectorOnTop>() { // from class: o.consumeDisplayCutout.2
        @Override // android.os.RemoteCallbackList
        public final /* synthetic */ void onCallbackDied(setDrawSelectorOnTop setdrawselectorontop, Object obj) {
            consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda1.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    };
    private final setMaxDate.setY setX = new setMaxDate.setY() { // from class: o.consumeDisplayCutout.4
        @Override // o.setMaxDate
        public final int setY(setDrawSelectorOnTop setdrawselectorontop, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda0) {
                consumeDisplayCutout consumedisplaycutout = consumeDisplayCutout.this;
                int i = consumedisplaycutout.setIconTintList + 1;
                consumedisplaycutout.setIconTintList = i;
                if (consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda0.register(setdrawselectorontop, Integer.valueOf(i))) {
                    consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda1.put(Integer.valueOf(i), str);
                    return i;
                }
                consumeDisplayCutout consumedisplaycutout2 = consumeDisplayCutout.this;
                consumedisplaycutout2.setIconTintList--;
                return 0;
            }
        }

        @Override // o.setMaxDate
        public final void setY(setDrawSelectorOnTop setdrawselectorontop, int i) {
            synchronized (consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda0) {
                consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda0.unregister(setdrawselectorontop);
                consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda1.remove(Integer.valueOf(i));
            }
        }

        @Override // o.setMaxDate
        public final void setY(int i, String[] strArr) {
            synchronized (consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda0) {
                String str = consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda1.get(Integer.valueOf(i));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda0.beginBroadcast();
                for (int i2 = 0; i2 < beginBroadcast; i2++) {
                    int intValue = ((Integer) consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda0.getBroadcastCookie(i2)).intValue();
                    String str2 = consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda1.get(Integer.valueOf(intValue));
                    if (i != intValue && str.equals(str2)) {
                        try {
                            consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda0.getBroadcastItem(i2).setIconTintList(strArr);
                        } catch (RemoteException e) {
                            Log.w("ROOM", "Error invoking a remote callback", e);
                        }
                    }
                }
                consumeDisplayCutout.this.MenuHostHelper$$ExternalSyntheticLambda0.finishBroadcast();
            }
        }
    };

    @Override // android.app.Service, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    @Override // android.content.ContextWrapper
    public Context getBaseContext() {
        return super.getBaseContext();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return super.getResources();
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.setX;
    }
}