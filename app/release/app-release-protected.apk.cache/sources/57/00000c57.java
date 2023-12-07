package o;

import java.util.List;
import o.setOnItemReselectedListener;

/* loaded from: classes.dex */
final class setIcon extends setOnItemReselectedListener {
    private final setThumbTintMode MenuHostHelper$$ExternalSyntheticLambda0;
    private final List<setHourClickDelegate> MenuHostHelper$$ExternalSyntheticLambda1;
    private final Integer setIconTintList;
    private final long setUiOptions;
    private final long setUnboundedRipple;
    private final getScaleX setX;
    private final String setY;

    /* synthetic */ setIcon(long j, long j2, getScaleX getscalex, Integer num, String str, List list, setThumbTintMode setthumbtintmode, byte b) {
        this(j, j2, getscalex, num, str, list, setthumbtintmode);
    }

    private setIcon(long j, long j2, getScaleX getscalex, Integer num, String str, List<setHourClickDelegate> list, setThumbTintMode setthumbtintmode) {
        this.setUnboundedRipple = j;
        this.setUiOptions = j2;
        this.setX = getscalex;
        this.setIconTintList = num;
        this.setY = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = list;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setthumbtintmode;
    }

    @Override // o.setOnItemReselectedListener
    public final long setOnLongClickListener() {
        return this.setUnboundedRipple;
    }

    @Override // o.setOnItemReselectedListener
    public final long setLayoutAnimation() {
        return this.setUiOptions;
    }

    @Override // o.setOnItemReselectedListener
    public final getScaleX MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setX;
    }

    @Override // o.setOnItemReselectedListener
    public final Integer setIconTintList() {
        return this.setIconTintList;
    }

    @Override // o.setOnItemReselectedListener
    public final String setY() {
        return this.setY;
    }

    @Override // o.setOnItemReselectedListener
    public final List<setHourClickDelegate> MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setOnItemReselectedListener
    public final setThumbTintMode setX() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogRequest{requestTimeMs=");
        sb.append(this.setUnboundedRipple);
        sb.append(", requestUptimeMs=");
        sb.append(this.setUiOptions);
        sb.append(", clientInfo=");
        sb.append(this.setX);
        sb.append(", logSource=");
        sb.append(this.setIconTintList);
        sb.append(", logSourceName=");
        sb.append(this.setY);
        sb.append(", logEvents=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", qosTier=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        getScaleX getscalex;
        Integer num;
        String str;
        List<setHourClickDelegate> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof setOnItemReselectedListener) {
            setOnItemReselectedListener setonitemreselectedlistener = (setOnItemReselectedListener) obj;
            if (this.setUnboundedRipple == setonitemreselectedlistener.setOnLongClickListener() && this.setUiOptions == setonitemreselectedlistener.setLayoutAnimation() && ((getscalex = this.setX) != null ? getscalex.equals(setonitemreselectedlistener.MenuHostHelper$$ExternalSyntheticLambda1()) : setonitemreselectedlistener.MenuHostHelper$$ExternalSyntheticLambda1() == null) && ((num = this.setIconTintList) != null ? num.equals(setonitemreselectedlistener.setIconTintList()) : setonitemreselectedlistener.setIconTintList() == null) && ((str = this.setY) != null ? str.equals(setonitemreselectedlistener.setY()) : setonitemreselectedlistener.setY() == null) && ((list = this.MenuHostHelper$$ExternalSyntheticLambda1) != null ? list.equals(setonitemreselectedlistener.MenuHostHelper$$ExternalSyntheticLambda0()) : setonitemreselectedlistener.MenuHostHelper$$ExternalSyntheticLambda0() == null)) {
                setThumbTintMode setthumbtintmode = this.MenuHostHelper$$ExternalSyntheticLambda0;
                if (setthumbtintmode == null) {
                    if (setonitemreselectedlistener.setX() == null) {
                        return true;
                    }
                } else if (setthumbtintmode.equals(setonitemreselectedlistener.setX())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.setUnboundedRipple;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.setUiOptions;
        int i2 = (int) ((j2 >>> 32) ^ j2);
        getScaleX getscalex = this.setX;
        int hashCode = getscalex == null ? 0 : getscalex.hashCode();
        Integer num = this.setIconTintList;
        int hashCode2 = num == null ? 0 : num.hashCode();
        String str = this.setY;
        int hashCode3 = str == null ? 0 : str.hashCode();
        List<setHourClickDelegate> list = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int hashCode4 = list == null ? 0 : list.hashCode();
        setThumbTintMode setthumbtintmode = this.MenuHostHelper$$ExternalSyntheticLambda0;
        return ((((((((((i2 ^ ((i ^ 1000003) * 1000003)) * 1000003) ^ hashCode) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (setthumbtintmode != null ? setthumbtintmode.hashCode() : 0);
    }

    /* loaded from: classes.dex */
    public static final class setX extends setOnItemReselectedListener.setY {
        private Integer MenuHostHelper$$ExternalSyntheticLambda0;
        private String MenuHostHelper$$ExternalSyntheticLambda1;
        private getScaleX setIconTintList;
        private Long setNavigationOnClickListener;
        private Long setUnboundedRipple;
        private setThumbTintMode setX;
        private List<setHourClickDelegate> setY;

        @Override // o.setOnItemReselectedListener.setY
        public final setOnItemReselectedListener.setY setIconTintList(long j) {
            this.setNavigationOnClickListener = Long.valueOf(j);
            return this;
        }

        @Override // o.setOnItemReselectedListener.setY
        public final setOnItemReselectedListener.setY MenuHostHelper$$ExternalSyntheticLambda1(long j) {
            this.setUnboundedRipple = Long.valueOf(j);
            return this;
        }

        @Override // o.setOnItemReselectedListener.setY
        public final setOnItemReselectedListener.setY MenuHostHelper$$ExternalSyntheticLambda1(getScaleX getscalex) {
            this.setIconTintList = getscalex;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setOnItemReselectedListener.setY
        public final setOnItemReselectedListener.setY MenuHostHelper$$ExternalSyntheticLambda0(Integer num) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = num;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setOnItemReselectedListener.setY
        public final setOnItemReselectedListener.setY setY(String str) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
            return this;
        }

        @Override // o.setOnItemReselectedListener.setY
        public final setOnItemReselectedListener.setY setIconTintList(List<setHourClickDelegate> list) {
            this.setY = list;
            return this;
        }

        @Override // o.setOnItemReselectedListener.setY
        public final setOnItemReselectedListener.setY setX(setThumbTintMode setthumbtintmode) {
            this.setX = setthumbtintmode;
            return this;
        }

        @Override // o.setOnItemReselectedListener.setY
        public final setOnItemReselectedListener setIconTintList() {
            String str = this.setNavigationOnClickListener == null ? " requestTimeMs" : "";
            if (this.setUnboundedRipple == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" requestUptimeMs");
                str = sb.toString();
            }
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder("Missing required properties:");
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            return new setIcon(this.setNavigationOnClickListener.longValue(), this.setUnboundedRipple.longValue(), this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda0, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setY, this.setX, (byte) 0);
        }
    }
}