package o;

import android.content.Context;
import android.os.Build;
import java.io.File;
import o.setBoxBackgroundMode;
import o.setImageResource;

/* loaded from: classes.dex */
public final class setActiveIndicatorEnabled implements setImageResource {
    private setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0;
    private final Object MenuHostHelper$$ExternalSyntheticLambda1 = new Object();
    private final Context setIconTintList;
    private boolean setUiOptions;
    private final boolean setUnboundedRipple;
    private final String setX;
    private final setImageResource.setY setY;

    public setActiveIndicatorEnabled(Context context, String str, setImageResource.setY sety, boolean z) {
        this.setIconTintList = context;
        this.setX = str;
        this.setY = sety;
        this.setUnboundedRipple = z;
    }

    private setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setY() {
        setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setactiveindicatorenabled_menuhosthelper__externalsyntheticlambda0;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                setCursorVisible[] setcursorvisibleArr = new setCursorVisible[1];
                if (Build.VERSION.SDK_INT >= 23 && this.setX != null && this.setUnboundedRipple) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = new setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, new File(setBoxBackgroundMode.setX.setX(this.setIconTintList), this.setX).getAbsolutePath(), setcursorvisibleArr, this.setY);
                } else {
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = new setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0(this.setIconTintList, this.setX, setcursorvisibleArr, this.setY);
                }
                this.MenuHostHelper$$ExternalSyntheticLambda0.setWriteAheadLoggingEnabled(this.setUiOptions);
            }
            setactiveindicatorenabled_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return setactiveindicatorenabled_menuhosthelper__externalsyntheticlambda0;
    }

    @Override // o.setImageResource
    public final String setX() {
        return this.setX;
    }

    @Override // o.setImageResource
    public final void setY(boolean z) {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            setActiveIndicatorEnabled$MenuHostHelper$$ExternalSyntheticLambda0 setactiveindicatorenabled_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (setactiveindicatorenabled_menuhosthelper__externalsyntheticlambda0 != null) {
                setactiveindicatorenabled_menuhosthelper__externalsyntheticlambda0.setWriteAheadLoggingEnabled(z);
            }
            this.setUiOptions = z;
        }
    }

    @Override // o.setImageResource
    public final setWindowCallback MenuHostHelper$$ExternalSyntheticLambda0() {
        return setY().MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // o.setImageResource
    public final setWindowCallback setIconTintList() {
        return setY().setY();
    }

    @Override // o.setImageResource, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        setY().close();
    }
}