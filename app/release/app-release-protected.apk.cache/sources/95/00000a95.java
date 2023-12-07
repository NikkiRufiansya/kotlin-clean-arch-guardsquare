package o;

/* loaded from: classes.dex */
public final class setCompoundDrawableTintBlendMode {
    public static <T, C> T MenuHostHelper$$ExternalSyntheticLambda0(Class<C> cls, String str) {
        String obj;
        String name = cls.getPackage().getName();
        String canonicalName = cls.getCanonicalName();
        if (!name.isEmpty()) {
            canonicalName = canonicalName.substring(name.length() + 1);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(canonicalName.replace('.', '_'));
        sb.append(str);
        String obj2 = sb.toString();
        try {
            if (name.isEmpty()) {
                obj = obj2;
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(name);
                sb2.append(".");
                sb2.append(obj2);
                obj = sb2.toString();
            }
            return (T) Class.forName(obj, true, cls.getClassLoader()).newInstance();
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder("cannot find implementation for ");
            sb3.append(cls.getCanonicalName());
            sb3.append(". ");
            sb3.append(obj2);
            sb3.append(" does not exist");
            throw new RuntimeException(sb3.toString());
        } catch (IllegalAccessException unused2) {
            StringBuilder sb4 = new StringBuilder("Cannot access the constructor");
            sb4.append(cls.getCanonicalName());
            throw new RuntimeException(sb4.toString());
        } catch (InstantiationException unused3) {
            StringBuilder sb5 = new StringBuilder("Failed to create an instance of ");
            sb5.append(cls.getCanonicalName());
            throw new RuntimeException(sb5.toString());
        }
    }
}