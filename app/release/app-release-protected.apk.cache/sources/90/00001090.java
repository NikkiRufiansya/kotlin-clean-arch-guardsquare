package o;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class setTitleMarginTop {
    private final Map<String, Object> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap();
    private final Set<Closeable> MenuHostHelper$$ExternalSyntheticLambda1 = new LinkedHashSet();
    private volatile boolean setY = false;

    public void setIconTintList() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        this.setY = true;
        Map<String, Object> map = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (map != null) {
            synchronized (map) {
                for (Object obj : this.MenuHostHelper$$ExternalSyntheticLambda0.values()) {
                    if (obj instanceof Closeable) {
                        try {
                            ((Closeable) obj).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        Set<Closeable> set = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (set != null) {
            synchronized (set) {
                for (Closeable closeable : this.MenuHostHelper$$ExternalSyntheticLambda1) {
                    if (closeable instanceof Closeable) {
                        try {
                            closeable.close();
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                }
            }
        }
        setIconTintList();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> T setX(String str, T t) {
        Object obj;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            obj = this.MenuHostHelper$$ExternalSyntheticLambda0.get(str);
            if (obj == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.put(str, t);
            }
        }
        if (obj != null) {
            t = obj;
        }
        if (this.setY && (t instanceof Closeable)) {
            try {
                ((Closeable) t).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final <T> T MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        T t;
        Map<String, Object> map = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = (T) this.MenuHostHelper$$ExternalSyntheticLambda0.get(str);
        }
        return t;
    }
}