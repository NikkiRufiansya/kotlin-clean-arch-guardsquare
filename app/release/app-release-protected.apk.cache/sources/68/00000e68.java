package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o.setConverter;

/* loaded from: classes.dex */
public abstract class setPaddingRelative {
    public abstract long MenuHostHelper$$ExternalSyntheticLambda0();

    public abstract setOnChildClickListener MenuHostHelper$$ExternalSyntheticLambda1();

    public abstract Integer setIconTintList();

    public abstract long setUiOptions();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Map<String, String> setX();

    public abstract String setY();

    public final Map<String, String> setOnLongClickListener() {
        return Collections.unmodifiableMap(setX());
    }

    public final int setX(String str) {
        String str2 = setX().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final long MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        String str2 = setX().get(str);
        if (str2 == null) {
            return 0L;
        }
        return Long.valueOf(str2).longValue();
    }

    public final String setY(String str) {
        String str2 = setX().get(str);
        return str2 == null ? "" : str2;
    }

    public final setIconTintList setLayoutAnimation() {
        setConverter.setIconTintList seticontintlist = new setConverter.setIconTintList();
        String y = setY();
        if (y == null) {
            throw new NullPointerException("Null transportName");
        }
        seticontintlist.setIconTintList = y;
        return seticontintlist.setX(setIconTintList()).setIconTintList(MenuHostHelper$$ExternalSyntheticLambda1()).setX(MenuHostHelper$$ExternalSyntheticLambda0()).setY(setUiOptions()).setX(new HashMap(setX()));
    }

    /* loaded from: classes.dex */
    public static abstract class setIconTintList {
        public abstract setPaddingRelative MenuHostHelper$$ExternalSyntheticLambda1();

        public abstract setIconTintList setIconTintList(String str);

        public abstract setIconTintList setIconTintList(setOnChildClickListener setonchildclicklistener);

        public abstract setIconTintList setX(long j);

        public abstract setIconTintList setX(Integer num);

        protected abstract setIconTintList setX(Map<String, String> map);

        protected abstract Map<String, String> setY();

        public abstract setIconTintList setY(long j);

        public final setIconTintList setIconTintList(String str, String str2) {
            setY().put(str, str2);
            return this;
        }

        public final setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(String str, long j) {
            setY().put(str, String.valueOf(j));
            return this;
        }

        public final setIconTintList setX(String str, int i) {
            setY().put(str, String.valueOf(i));
            return this;
        }
    }
}