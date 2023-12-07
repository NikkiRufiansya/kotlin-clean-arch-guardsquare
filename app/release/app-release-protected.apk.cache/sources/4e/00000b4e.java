package o;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import o.setPlaceholderTextColor;

/* loaded from: classes.dex */
public final class setEndIconTintMode {
    private final setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0;
    private final setTabRippleColorResource MenuHostHelper$$ExternalSyntheticLambda1;
    private final setPlaceholderTextColor setX;

    /* loaded from: classes.dex */
    public static class setIconTintList {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public setEndIconTintMode(setTabRippleColorResource settabripplecolorresource, setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 setendicontintmode_menuhosthelper__externalsyntheticlambda0) {
        this(settabripplecolorresource, setendicontintmode_menuhosthelper__externalsyntheticlambda0, (byte) 0);
        pN.setY(settabripplecolorresource, "");
        pN.setY(setendicontintmode_menuhosthelper__externalsyntheticlambda0, "");
    }

    private setEndIconTintMode(setTabRippleColorResource settabripplecolorresource, setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 setendicontintmode_menuhosthelper__externalsyntheticlambda0, setPlaceholderTextColor setplaceholdertextcolor) {
        pN.setY(settabripplecolorresource, "");
        pN.setY(setendicontintmode_menuhosthelper__externalsyntheticlambda0, "");
        pN.setY(setplaceholdertextcolor, "");
        this.MenuHostHelper$$ExternalSyntheticLambda1 = settabripplecolorresource;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setendicontintmode_menuhosthelper__externalsyntheticlambda0;
        this.setX = setplaceholdertextcolor;
    }

    private /* synthetic */ setEndIconTintMode(setTabRippleColorResource settabripplecolorresource, setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 setendicontintmode_menuhosthelper__externalsyntheticlambda0, byte b) {
        this(settabripplecolorresource, setendicontintmode_menuhosthelper__externalsyntheticlambda0, setPlaceholderTextColor.setX.MenuHostHelper$$ExternalSyntheticLambda0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setEndIconTintMode(o.setPictureListener r4, o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            o.pN.setY(r4, r0)
            o.pN.setY(r5, r0)
            o.setTabRippleColorResource r1 = r4.setUnboundedRipple()
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r1, r0)
            o.pN.setY(r4, r0)
            boolean r2 = r4 instanceof o.ComponentActivity$5
            if (r2 == 0) goto L20
            o.ComponentActivity$5 r4 = (o.ComponentActivity$5) r4
            o.setPlaceholderTextColor r4 = r4.setY()
            o.pN.MenuHostHelper$$ExternalSyntheticLambda0(r4, r0)
            goto L24
        L20:
            o.setPlaceholderTextColor$setX r4 = o.setPlaceholderTextColor.setX.MenuHostHelper$$ExternalSyntheticLambda0
            o.setPlaceholderTextColor r4 = (o.setPlaceholderTextColor) r4
        L24:
            r3.<init>(r1, r5, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setEndIconTintMode.<init>(o.setPictureListener, o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0):void");
    }

    public final <T extends setTitleMarginTop> T setY(Class<T> cls) {
        pN.setY(cls, "");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        StringBuilder sb = new StringBuilder("androidx.lifecycle.ViewModelProvider.DefaultKey:");
        sb.append(canonicalName);
        return (T) setIconTintList(sb.toString(), cls);
    }

    public final <T extends setTitleMarginTop> T setIconTintList(String str, Class<T> cls) {
        T t;
        pN.setY(str, "");
        pN.setY(cls, "");
        T t2 = (T) this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(str);
        if (cls.isInstance(t2)) {
            setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 setendicontintmode_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if ((setendicontintmode_menuhosthelper__externalsyntheticlambda0 instanceof setIconTintList ? (setIconTintList) setendicontintmode_menuhosthelper__externalsyntheticlambda0 : null) != null) {
                pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) t2, "");
                pN.setY(t2, "");
            }
            if (t2 != null) {
                return t2;
            }
            throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        }
        setChipIconSize setchipiconsize = new setChipIconSize(this.setX);
        setPlaceholderTextColor.setY<String> sety = setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda1.setX;
        pN.setY(sety, "");
        setchipiconsize.setX.put(sety, str);
        try {
            t = (T) this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(cls, setchipiconsize);
        } catch (AbstractMethodError unused) {
            t = (T) this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(cls);
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(str, t);
        return t;
    }

    /* loaded from: classes.dex */
    public static class setY extends setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda1 {
        public static final setPlaceholderTextColor.setY<Application> setIconTintList;
        private final Application MenuHostHelper$$ExternalSyntheticLambda1;

        private setY(byte b) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        }

        public setY() {
            this((byte) 0);
        }

        @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda1, o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
        public final <T extends setTitleMarginTop> T setIconTintList(Class<T> cls, setPlaceholderTextColor setplaceholdertextcolor) {
            pN.setY(cls, "");
            pN.setY(setplaceholdertextcolor, "");
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                return (T) setIconTintList(cls);
            }
            Application application = (Application) setplaceholdertextcolor.setIconTintList(setIconTintList);
            if (application != null) {
                return (T) setX(cls, application);
            }
            if (setRepeatCount.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.setIconTintList(cls);
        }

        @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda1, o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
        public final <T extends setTitleMarginTop> T setIconTintList(Class<T> cls) {
            pN.setY(cls, "");
            Application application = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (application == null) {
                throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            }
            return (T) setX(cls, application);
        }

        private final <T extends setTitleMarginTop> T setX(Class<T> cls, Application application) {
            if (setRepeatCount.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) newInstance, "");
                    return newInstance;
                } catch (IllegalAccessException e) {
                    StringBuilder sb = new StringBuilder("Cannot create an instance of ");
                    sb.append(cls);
                    throw new RuntimeException(sb.toString(), e);
                } catch (InstantiationException e2) {
                    StringBuilder sb2 = new StringBuilder("Cannot create an instance of ");
                    sb2.append(cls);
                    throw new RuntimeException(sb2.toString(), e2);
                } catch (NoSuchMethodException e3) {
                    StringBuilder sb3 = new StringBuilder("Cannot create an instance of ");
                    sb3.append(cls);
                    throw new RuntimeException(sb3.toString(), e3);
                } catch (InvocationTargetException e4) {
                    StringBuilder sb4 = new StringBuilder("Cannot create an instance of ");
                    sb4.append(cls);
                    throw new RuntimeException(sb4.toString(), e4);
                }
            }
            return (T) super.setIconTintList(cls);
        }

        /* loaded from: classes.dex */
        public static final class setIconTintList {
            public /* synthetic */ setIconTintList(byte b) {
                this();
            }

            private setIconTintList() {
            }
        }

        static {
            new setIconTintList((byte) 0);
            setIconTintList = new setPlaceholderTextColor.setY<Application>() { // from class: o.setEndIconTintMode$setY$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda0
            };
        }
    }
}