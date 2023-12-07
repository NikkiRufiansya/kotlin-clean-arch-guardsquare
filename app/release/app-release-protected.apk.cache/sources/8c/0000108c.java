package o;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class setTitleMarginBottom {
    protected final setFabAnchorMode<String, Method> MenuHostHelper$$ExternalSyntheticLambda1;
    protected final setFabAnchorMode<String, Method> setIconTintList;
    protected final setFabAnchorMode<String, Class> setX;

    public static boolean MenuHostHelper$$ExternalSyntheticLambda0() {
        return false;
    }

    protected abstract void MenuHostHelper$$ExternalSyntheticLambda0(int i);

    protected abstract setTitleMarginBottom MenuHostHelper$$ExternalSyntheticLambda1();

    protected abstract void MenuHostHelper$$ExternalSyntheticLambda1(CharSequence charSequence);

    protected abstract void MenuHostHelper$$ExternalSyntheticLambda1(String str);

    protected abstract void MenuHostHelper$$ExternalSyntheticLambda1(boolean z);

    protected abstract void setIconTintList(int i);

    protected abstract void setIconTintList(byte[] bArr);

    protected abstract byte[] setIconTintList();

    protected abstract <T extends Parcelable> T setNavigationOnClickListener();

    protected abstract String setOnLongClickListener();

    protected abstract int setUiOptions();

    protected abstract CharSequence setUnboundedRipple();

    protected abstract void setX();

    protected abstract void setY(Parcelable parcelable);

    protected abstract boolean setY();

    protected abstract boolean setY(int i);

    public setTitleMarginBottom(setFabAnchorMode<String, Method> setfabanchormode, setFabAnchorMode<String, Method> setfabanchormode2, setFabAnchorMode<String, Class> setfabanchormode3) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setfabanchormode;
        this.setIconTintList = setfabanchormode2;
        this.setX = setfabanchormode3;
    }

    public final void setX(boolean z, int i) {
        setIconTintList(i);
        MenuHostHelper$$ExternalSyntheticLambda1(z);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(byte[] bArr) {
        setIconTintList(2);
        setIconTintList(bArr);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(CharSequence charSequence, int i) {
        setIconTintList(i);
        MenuHostHelper$$ExternalSyntheticLambda1(charSequence);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2) {
        setIconTintList(i2);
        MenuHostHelper$$ExternalSyntheticLambda0(i);
    }

    public final void setX(String str, int i) {
        setIconTintList(i);
        MenuHostHelper$$ExternalSyntheticLambda1(str);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(Parcelable parcelable, int i) {
        setIconTintList(i);
        setY(parcelable);
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(boolean z, int i) {
        return !setY(i) ? z : setY();
    }

    public final int setY(int i, int i2) {
        return !setY(i2) ? i : setUiOptions();
    }

    public final String MenuHostHelper$$ExternalSyntheticLambda0(String str, int i) {
        return !setY(i) ? str : setOnLongClickListener();
    }

    public final byte[] MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr) {
        return !setY(2) ? bArr : setIconTintList();
    }

    public final <T extends Parcelable> T setX(T t, int i) {
        return !setY(i) ? t : (T) setNavigationOnClickListener();
    }

    public final CharSequence setX(CharSequence charSequence, int i) {
        return !setY(i) ? charSequence : setUnboundedRipple();
    }

    public final void setY(toString tostring) {
        setIconTintList(1);
        setIconTintList(tostring);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setIconTintList(toString tostring) {
        if (tostring == null) {
            MenuHostHelper$$ExternalSyntheticLambda1((String) null);
            return;
        }
        try {
            MenuHostHelper$$ExternalSyntheticLambda1(setX((Class<? extends toString>) tostring.getClass()).getName());
            setTitleMarginBottom MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
            try {
                Class<?> cls = tostring.getClass();
                Method method = this.setIconTintList.get(cls.getName());
                if (method == null) {
                    method = setX((Class<? extends toString>) cls).getDeclaredMethod("write", cls, setTitleMarginBottom.class);
                    this.setIconTintList.put(cls.getName(), method);
                }
                method.invoke(null, tostring, MenuHostHelper$$ExternalSyntheticLambda1);
                MenuHostHelper$$ExternalSyntheticLambda1.setX();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (e4.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e4.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
            }
        } catch (ClassNotFoundException e5) {
            StringBuilder sb = new StringBuilder();
            sb.append(tostring.getClass().getSimpleName());
            sb.append(" does not have a Parcelizer");
            throw new RuntimeException(sb.toString(), e5);
        }
    }

    public final <T extends toString> T setX(T t) {
        if (setY(1)) {
            String onLongClickListener = setOnLongClickListener();
            if (onLongClickListener == null) {
                return null;
            }
            return (T) MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener, MenuHostHelper$$ExternalSyntheticLambda1());
        }
        return t;
    }

    public final <T extends toString> T setLayoutAnimation() {
        String onLongClickListener = setOnLongClickListener();
        if (onLongClickListener == null) {
            return null;
        }
        return (T) MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener, MenuHostHelper$$ExternalSyntheticLambda1());
    }

    private Class setX(Class<? extends toString> cls) {
        Class cls2 = this.setX.get(cls.getName());
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            this.setX.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    private <T extends toString> T MenuHostHelper$$ExternalSyntheticLambda0(String str, setTitleMarginBottom settitlemarginbottom) {
        try {
            Method method = this.MenuHostHelper$$ExternalSyntheticLambda1.get(str);
            if (method == null) {
                method = Class.forName(str, true, setTitleMarginBottom.class.getClassLoader()).getDeclaredMethod("read", setTitleMarginBottom.class);
                this.MenuHostHelper$$ExternalSyntheticLambda1.put(str, method);
            }
            return (T) method.invoke(null, settitlemarginbottom);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }
}