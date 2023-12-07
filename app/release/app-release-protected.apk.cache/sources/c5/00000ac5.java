package o;

import java.util.Map;
import o.setPaddingRelative;

/* loaded from: classes.dex */
final class setConverter extends setPaddingRelative {
    private final Integer MenuHostHelper$$ExternalSyntheticLambda0;
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final setOnChildClickListener setIconTintList;
    private final long setNavigationOnClickListener;
    private final Map<String, String> setX;
    private final long setY;

    /* synthetic */ setConverter(String str, Integer num, setOnChildClickListener setonchildclicklistener, long j, long j2, Map map, byte b) {
        this(str, num, setonchildclicklistener, j, j2, map);
    }

    private setConverter(String str, Integer num, setOnChildClickListener setonchildclicklistener, long j, long j2, Map<String, String> map) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = num;
        this.setIconTintList = setonchildclicklistener;
        this.setY = j;
        this.setNavigationOnClickListener = j2;
        this.setX = map;
    }

    @Override // o.setPaddingRelative
    public final String setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setPaddingRelative
    public final Integer setIconTintList() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setPaddingRelative
    public final setOnChildClickListener MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconTintList;
    }

    @Override // o.setPaddingRelative
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    @Override // o.setPaddingRelative
    public final long setUiOptions() {
        return this.setNavigationOnClickListener;
    }

    @Override // o.setPaddingRelative
    protected final Map<String, String> setX() {
        return this.setX;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventInternal{transportName=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", code=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", encodedPayload=");
        sb.append(this.setIconTintList);
        sb.append(", eventMillis=");
        sb.append(this.setY);
        sb.append(", uptimeMillis=");
        sb.append(this.setNavigationOnClickListener);
        sb.append(", autoMetadata=");
        sb.append(this.setX);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof setPaddingRelative) {
            setPaddingRelative setpaddingrelative = (setPaddingRelative) obj;
            return this.MenuHostHelper$$ExternalSyntheticLambda1.equals(setpaddingrelative.setY()) && ((num = this.MenuHostHelper$$ExternalSyntheticLambda0) != null ? num.equals(setpaddingrelative.setIconTintList()) : setpaddingrelative.setIconTintList() == null) && this.setIconTintList.equals(setpaddingrelative.MenuHostHelper$$ExternalSyntheticLambda1()) && this.setY == setpaddingrelative.MenuHostHelper$$ExternalSyntheticLambda0() && this.setNavigationOnClickListener == setpaddingrelative.setUiOptions() && this.setX.equals(setpaddingrelative.setX());
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.MenuHostHelper$$ExternalSyntheticLambda1.hashCode();
        Integer num = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int hashCode2 = num == null ? 0 : num.hashCode();
        int hashCode3 = this.setIconTintList.hashCode();
        long j = this.setY;
        long j2 = this.setNavigationOnClickListener;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.setX.hashCode();
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends setPaddingRelative.setIconTintList {
        private Long MenuHostHelper$$ExternalSyntheticLambda0;
        private setOnChildClickListener MenuHostHelper$$ExternalSyntheticLambda1;
        String setIconTintList;
        private Long setUnboundedRipple;
        public Map<String, String> setX;
        private Integer setY;

        @Override // o.setPaddingRelative.setIconTintList
        public final setPaddingRelative.setIconTintList setIconTintList(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.setIconTintList = str;
            return this;
        }

        @Override // o.setPaddingRelative.setIconTintList
        public final setPaddingRelative.setIconTintList setX(Integer num) {
            this.setY = num;
            return this;
        }

        @Override // o.setPaddingRelative.setIconTintList
        public final setPaddingRelative.setIconTintList setIconTintList(setOnChildClickListener setonchildclicklistener) {
            if (setonchildclicklistener == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setonchildclicklistener;
            return this;
        }

        @Override // o.setPaddingRelative.setIconTintList
        public final setPaddingRelative.setIconTintList setX(long j) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Long.valueOf(j);
            return this;
        }

        @Override // o.setPaddingRelative.setIconTintList
        public final setPaddingRelative.setIconTintList setY(long j) {
            this.setUnboundedRipple = Long.valueOf(j);
            return this;
        }

        @Override // o.setPaddingRelative.setIconTintList
        protected final setPaddingRelative.setIconTintList setX(Map<String, String> map) {
            this.setX = map;
            return this;
        }

        @Override // o.setPaddingRelative.setIconTintList
        protected final Map<String, String> setY() {
            Map<String, String> map = this.setX;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // o.setPaddingRelative.setIconTintList
        public final setPaddingRelative MenuHostHelper$$ExternalSyntheticLambda1() {
            String str = this.setIconTintList == null ? " transportName" : "";
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" encodedPayload");
                str = sb.toString();
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" eventMillis");
                str = sb2.toString();
            }
            if (this.setUnboundedRipple == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" uptimeMillis");
                str = sb3.toString();
            }
            if (this.setX == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" autoMetadata");
                str = sb4.toString();
            }
            if (!str.isEmpty()) {
                StringBuilder sb5 = new StringBuilder("Missing required properties:");
                sb5.append(str);
                throw new IllegalStateException(sb5.toString());
            }
            return new setConverter(this.setIconTintList, this.setY, this.MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda0.longValue(), this.setUnboundedRipple.longValue(), this.setX, (byte) 0);
        }
    }
}