package o;

import java.util.List;

/* loaded from: classes.dex */
public final class setCloseIconContentDescription extends RuntimeException {
    private final List<String> setY;

    public setCloseIconContentDescription() {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.setY = null;
    }
}