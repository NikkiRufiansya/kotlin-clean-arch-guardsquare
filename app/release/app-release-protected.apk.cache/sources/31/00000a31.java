package o;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class setChipStrokeColorResource {
    public static setChipStrokeColorResource MenuHostHelper$$ExternalSyntheticLambda1;
    setIconTintList MenuHostHelper$$ExternalSyntheticLambda0;
    public setIconTintList setX;
    public final Object setY = new Object();
    final Handler setIconTintList = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: o.setChipStrokeColorResource.1
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            setChipStrokeColorResource setchipstrokecolorresource = setChipStrokeColorResource.this;
            setIconTintList seticontintlist = (setIconTintList) message.obj;
            synchronized (setchipstrokecolorresource.setY) {
                if (setchipstrokecolorresource.setX == seticontintlist || setchipstrokecolorresource.MenuHostHelper$$ExternalSyntheticLambda0 == seticontintlist) {
                    WeakReference<setX> weakReference = seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0;
                    throw new NullPointerException();
                }
            }
            return true;
        }
    });

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setIconTintList {
        final WeakReference<setX> MenuHostHelper$$ExternalSyntheticLambda0;
    }

    /* loaded from: classes.dex */
    public interface setX {
    }
}