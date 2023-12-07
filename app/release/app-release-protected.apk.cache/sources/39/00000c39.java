package o;

import java.util.Arrays;
import o.setHourClickDelegate;

/* loaded from: classes.dex */
final class setHorizontalFadingEdgeEnabled extends setHourClickDelegate {
    private final long MenuHostHelper$$ExternalSyntheticLambda0;
    private final setPrefixTextColor MenuHostHelper$$ExternalSyntheticLambda1;
    private final Integer setIconTintList;
    private final long setOnLongClickListener;
    private final String setUnboundedRipple;
    private final byte[] setX;
    private final long setY;

    /* synthetic */ setHorizontalFadingEdgeEnabled(long j, Integer num, long j2, byte[] bArr, String str, long j3, setPrefixTextColor setprefixtextcolor, byte b) {
        this(j, num, j2, bArr, str, j3, setprefixtextcolor);
    }

    private setHorizontalFadingEdgeEnabled(long j, Integer num, long j2, byte[] bArr, String str, long j3, setPrefixTextColor setprefixtextcolor) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
        this.setIconTintList = num;
        this.setY = j2;
        this.setX = bArr;
        this.setUnboundedRipple = str;
        this.setOnLongClickListener = j3;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setprefixtextcolor;
    }

    @Override // o.setHourClickDelegate
    public final long setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setHourClickDelegate
    public final Integer setIconTintList() {
        return this.setIconTintList;
    }

    @Override // o.setHourClickDelegate
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setY;
    }

    @Override // o.setHourClickDelegate
    public final byte[] MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setX;
    }

    @Override // o.setHourClickDelegate
    public final String setLayoutAnimation() {
        return this.setUnboundedRipple;
    }

    @Override // o.setHourClickDelegate
    public final long setOnLongClickListener() {
        return this.setOnLongClickListener;
    }

    @Override // o.setHourClickDelegate
    public final setPrefixTextColor setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogEvent{eventTimeMs=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", eventCode=");
        sb.append(this.setIconTintList);
        sb.append(", eventUptimeMs=");
        sb.append(this.setY);
        sb.append(", sourceExtension=");
        sb.append(Arrays.toString(this.setX));
        sb.append(", sourceExtensionJsonProto3=");
        sb.append(this.setUnboundedRipple);
        sb.append(", timezoneOffsetSeconds=");
        sb.append(this.setOnLongClickListener);
        sb.append(", networkConnectionInfo=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof setHourClickDelegate) {
            setHourClickDelegate sethourclickdelegate = (setHourClickDelegate) obj;
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == sethourclickdelegate.setX() && ((num = this.setIconTintList) != null ? num.equals(sethourclickdelegate.setIconTintList()) : sethourclickdelegate.setIconTintList() == null) && this.setY == sethourclickdelegate.MenuHostHelper$$ExternalSyntheticLambda0()) {
                if (Arrays.equals(this.setX, sethourclickdelegate instanceof setHorizontalFadingEdgeEnabled ? ((setHorizontalFadingEdgeEnabled) sethourclickdelegate).setX : sethourclickdelegate.MenuHostHelper$$ExternalSyntheticLambda1()) && ((str = this.setUnboundedRipple) != null ? str.equals(sethourclickdelegate.setLayoutAnimation()) : sethourclickdelegate.setLayoutAnimation() == null) && this.setOnLongClickListener == sethourclickdelegate.setOnLongClickListener()) {
                    setPrefixTextColor setprefixtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (setprefixtextcolor == null) {
                        if (sethourclickdelegate.setY() == null) {
                            return true;
                        }
                    } else if (setprefixtextcolor.equals(sethourclickdelegate.setY())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i = (int) (j ^ (j >>> 32));
        Integer num = this.setIconTintList;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.setY;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        int hashCode2 = Arrays.hashCode(this.setX);
        String str = this.setUnboundedRipple;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.setOnLongClickListener;
        int i3 = (int) (j3 ^ (j3 >>> 32));
        setPrefixTextColor setprefixtextcolor = this.MenuHostHelper$$ExternalSyntheticLambda1;
        return ((((((((((hashCode ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ i2) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ i3) * 1000003) ^ (setprefixtextcolor != null ? setprefixtextcolor.hashCode() : 0);
    }

    /* loaded from: classes.dex */
    public static final class setY extends setHourClickDelegate.setY {
        private byte[] MenuHostHelper$$ExternalSyntheticLambda0;
        private Integer MenuHostHelper$$ExternalSyntheticLambda1;
        private setPrefixTextColor setIconTintList;
        private String setLayoutAnimation;
        private Long setUnboundedRipple;
        private Long setX;
        private Long setY;

        @Override // o.setHourClickDelegate.setY
        public final setHourClickDelegate.setY setX(long j) {
            this.setX = Long.valueOf(j);
            return this;
        }

        @Override // o.setHourClickDelegate.setY
        public final setHourClickDelegate.setY setIconTintList(Integer num) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = num;
            return this;
        }

        @Override // o.setHourClickDelegate.setY
        public final setHourClickDelegate.setY setY(long j) {
            this.setY = Long.valueOf(j);
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHourClickDelegate.setY
        public final setHourClickDelegate.setY MenuHostHelper$$ExternalSyntheticLambda0(byte[] bArr) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = bArr;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setHourClickDelegate.setY
        public final setHourClickDelegate.setY MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            this.setLayoutAnimation = str;
            return this;
        }

        @Override // o.setHourClickDelegate.setY
        public final setHourClickDelegate.setY MenuHostHelper$$ExternalSyntheticLambda0(long j) {
            this.setUnboundedRipple = Long.valueOf(j);
            return this;
        }

        @Override // o.setHourClickDelegate.setY
        public final setHourClickDelegate.setY setX(setPrefixTextColor setprefixtextcolor) {
            this.setIconTintList = setprefixtextcolor;
            return this;
        }

        @Override // o.setHourClickDelegate.setY
        public final setHourClickDelegate setIconTintList() {
            String str = this.setX == null ? " eventTimeMs" : "";
            if (this.setY == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" eventUptimeMs");
                str = sb.toString();
            }
            if (this.setUnboundedRipple == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" timezoneOffsetSeconds");
                str = sb2.toString();
            }
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder("Missing required properties:");
                sb3.append(str);
                throw new IllegalStateException(sb3.toString());
            }
            return new setHorizontalFadingEdgeEnabled(this.setX.longValue(), this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY.longValue(), this.MenuHostHelper$$ExternalSyntheticLambda0, this.setLayoutAnimation, this.setUnboundedRipple.longValue(), this.setIconTintList, (byte) 0);
        }
    }
}