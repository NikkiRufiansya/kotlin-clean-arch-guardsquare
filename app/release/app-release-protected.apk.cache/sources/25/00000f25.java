package o;

/* loaded from: classes.dex */
public enum setScene {
    VOID(Void.class, Void.class, null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, Boolean.FALSE),
    STRING(String.class, String.class, ""),
    BYTE_STRING(setSpeed.class, setSpeed.class, setSpeed.setIconTintList),
    ENUM(Integer.TYPE, Integer.class, null),
    MESSAGE(Object.class, Object.class, null);
    
    final Class<?> setCenterIfNoTextEnabled;
    private final Object setIconSize;
    private final Class<?> setTextAlignment;

    setScene(Class cls, Class cls2, Object obj) {
        this.setTextAlignment = cls;
        this.setCenterIfNoTextEnabled = cls2;
        this.setIconSize = obj;
    }
}