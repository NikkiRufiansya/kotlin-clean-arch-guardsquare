package o;

import o.setPlaceholderTextColor;

/* loaded from: classes.dex */
public class setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda1 implements setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0 {
    public static final setPlaceholderTextColor.setY<String> setX;

    @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
    public /* synthetic */ setTitleMarginTop setIconTintList(Class cls, setPlaceholderTextColor setplaceholdertextcolor) {
        return setSubtitleTextColor.MenuHostHelper$$ExternalSyntheticLambda1(this, cls, setplaceholdertextcolor);
    }

    @Override // o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda0
    public <T extends setTitleMarginTop> T setIconTintList(Class<T> cls) {
        pN.setY(cls, "");
        try {
            T newInstance = cls.newInstance();
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
        }
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
        setX = new setPlaceholderTextColor.setY<String>() { // from class: o.setEndIconTintMode$MenuHostHelper$$ExternalSyntheticLambda1$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda0
        };
    }
}