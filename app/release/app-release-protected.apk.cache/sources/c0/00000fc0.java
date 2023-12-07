package o;

import java.util.Iterator;
import java.util.Map;
import o.setRightStripDrawable;

/* loaded from: classes.dex */
final class setStartIconOnLongClickListener implements setSafeMode {
    @Override // o.setSafeMode
    public final Map<?, ?> setX(Object obj) {
        return (setTextOn) obj;
    }

    @Override // o.setSafeMode
    public final setRightStripDrawable.setY<?, ?> setY(Object obj) {
        return ((setRightStripDrawable) obj).setIconTintList;
    }

    @Override // o.setSafeMode
    public final Map<?, ?> MenuHostHelper$$ExternalSyntheticLambda0(Object obj) {
        return (setTextOn) obj;
    }

    @Override // o.setSafeMode
    public final boolean setIconTintList(Object obj) {
        return !((setTextOn) obj).MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setSafeMode
    public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj) {
        ((setTextOn) obj).MenuHostHelper$$ExternalSyntheticLambda1 = false;
        return obj;
    }

    @Override // o.setSafeMode
    public final Object setY() {
        setTextOn settexton;
        settexton = setTextOn.MenuHostHelper$$ExternalSyntheticLambda0;
        return settexton.isEmpty() ? new setTextOn() : new setTextOn(settexton);
    }

    @Override // o.setSafeMode
    public final int MenuHostHelper$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        int centerIfNoTextEnabled;
        setTextOn settexton = (setTextOn) obj;
        setRightStripDrawable setrightstripdrawable = (setRightStripDrawable) obj2;
        int i2 = 0;
        if (settexton.isEmpty()) {
            return 0;
        }
        Iterator it = settexton.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            centerIfNoTextEnabled = setMenuPrepared.setCenterIfNoTextEnabled(setCloseIconVisible.setY(i, 0));
            setRightStripDrawable.setY<K, V> sety = setrightstripdrawable.setIconTintList;
            i2 += centerIfNoTextEnabled + setMenuPrepared.setUiOptions(RemoteConfigRegistrar.setY(sety.setIconTintList, 1, key) + RemoteConfigRegistrar.setY(sety.setX, 2, value));
        }
        return i2;
    }

    @Override // o.setSafeMode
    public final Object MenuHostHelper$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        setTextOn settexton = (setTextOn) obj;
        setTextOn settexton2 = (setTextOn) obj2;
        if (!settexton2.isEmpty()) {
            if (!settexton.MenuHostHelper$$ExternalSyntheticLambda1) {
                settexton = settexton.isEmpty() ? new setTextOn() : new setTextOn(settexton);
            }
            if (settexton.MenuHostHelper$$ExternalSyntheticLambda1) {
                if (!settexton2.isEmpty()) {
                    settexton.putAll(settexton2);
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        return settexton;
    }
}