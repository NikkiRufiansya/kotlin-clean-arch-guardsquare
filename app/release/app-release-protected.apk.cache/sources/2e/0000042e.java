package o;

/* renamed from: o.es  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138es {

    /* renamed from: o.es$setX */
    /* loaded from: classes.dex */
    public enum setX {
        APP_START_TRACE_NAME("_as"),
        ON_CREATE_TRACE_NAME("_astui"),
        ON_START_TRACE_NAME("_astfd"),
        ON_RESUME_TRACE_NAME("_asti"),
        FOREGROUND_TRACE_NAME("_fs"),
        BACKGROUND_TRACE_NAME("_bs");
        
        private String setOnLongClickListener;

        setX(String str) {
            this.setOnLongClickListener = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.setOnLongClickListener;
        }
    }
}