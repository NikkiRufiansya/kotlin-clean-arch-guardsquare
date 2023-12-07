package o;

import java.util.List;

/* loaded from: classes.dex */
public final class ja extends RuntimeException {
    private final List<String> setIconTintList;

    public ja() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.setIconTintList = null;
    }
}