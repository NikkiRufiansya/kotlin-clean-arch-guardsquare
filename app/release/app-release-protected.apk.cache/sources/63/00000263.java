package o;

import android.text.TextUtils;

/* loaded from: classes.dex */
public class W extends Exception {
    @Deprecated
    public W() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(String str) {
        super(str);
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(String str, Throwable th) {
        super(str, th);
        if (!TextUtils.isEmpty(str)) {
            return;
        }
        throw new IllegalArgumentException("Detail message must not be empty");
    }
}