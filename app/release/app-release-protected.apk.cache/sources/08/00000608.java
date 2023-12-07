package o;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.id  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0232id {
    static final C0232id MenuHostHelper$$ExternalSyntheticLambda0 = new C0232id((byte) 0);
    private static volatile C0232id setX;
    private Map<Object, Object<?, ?>> setY;

    public static C0232id setY() {
        C0232id c0232id;
        C0232id c0232id2 = setX;
        if (c0232id2 == null) {
            synchronized (C0232id.class) {
                c0232id = setX;
                if (c0232id == null) {
                    c0232id = Cif.setX();
                    setX = c0232id;
                }
            }
            return c0232id;
        }
        return c0232id2;
    }

    C0232id() {
        this.setY = new HashMap();
    }

    private C0232id(byte b) {
        this.setY = Collections.emptyMap();
    }
}