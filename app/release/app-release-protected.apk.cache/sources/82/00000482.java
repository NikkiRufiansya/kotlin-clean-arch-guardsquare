package o;

/* renamed from: o.ft  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0166ft extends W {
    private final setIconTintList MenuHostHelper$$ExternalSyntheticLambda1;

    public C0166ft(String str) {
        super(str);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setIconTintList.UNKNOWN;
    }

    public C0166ft(String str, Throwable th) {
        super(str, th);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setIconTintList.UNKNOWN;
    }

    public C0166ft(String str, setIconTintList seticontintlist) {
        super(str);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist;
    }

    public C0166ft(String str, Throwable th, setIconTintList seticontintlist) {
        super(str, th);
        this.MenuHostHelper$$ExternalSyntheticLambda1 = seticontintlist;
    }

    /* renamed from: o.ft$setIconTintList */
    /* loaded from: classes.dex */
    public enum setIconTintList {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);
        
        private final int setLayoutAnimation;

        setIconTintList(int i) {
            this.setLayoutAnimation = i;
        }
    }
}