package o;

import java.util.concurrent.TimeUnit;

/* renamed from: o.vj  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0540vj {
    public static final C0540vj MenuHostHelper$$ExternalSyntheticLambda1;
    public static final vj$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList = new vj$MenuHostHelper$$ExternalSyntheticLambda1((byte) 0);
    public final boolean MenuHostHelper$$ExternalSyntheticLambda0;
    private final boolean ViewPager$SavedState$1;
    public final boolean setCenterIfNoTextEnabled;
    private final int setChipCornerRadius;
    private String setIconSize;
    public final boolean setLayoutAnimation;
    public final int setNavigationOnClickListener;
    public final boolean setOnLongClickListener;
    private final boolean setTextAlignment;
    public final int setUiOptions;
    public final boolean setUnboundedRipple;
    public final boolean setX;
    public final int setY;

    private C0540vj(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.setLayoutAnimation = z;
        this.setOnLongClickListener = z2;
        this.setY = i;
        this.setChipCornerRadius = i2;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = z3;
        this.setX = z4;
        this.setUnboundedRipple = z5;
        this.setNavigationOnClickListener = i3;
        this.setUiOptions = i4;
        this.setCenterIfNoTextEnabled = z6;
        this.ViewPager$SavedState$1 = z7;
        this.setTextAlignment = z8;
        this.setIconSize = str;
    }

    public /* synthetic */ C0540vj(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, byte b) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }

    public final String toString() {
        String str = this.setIconSize;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.setLayoutAnimation) {
                sb.append("no-cache, ");
            }
            if (this.setOnLongClickListener) {
                sb.append("no-store, ");
            }
            if (this.setY != -1) {
                sb.append("max-age=");
                sb.append(this.setY);
                sb.append(", ");
            }
            if (this.setChipCornerRadius != -1) {
                sb.append("s-maxage=");
                sb.append(this.setChipCornerRadius);
                sb.append(", ");
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                sb.append("private, ");
            }
            if (this.setX) {
                sb.append("public, ");
            }
            if (this.setUnboundedRipple) {
                sb.append("must-revalidate, ");
            }
            if (this.setNavigationOnClickListener != -1) {
                sb.append("max-stale=");
                sb.append(this.setNavigationOnClickListener);
                sb.append(", ");
            }
            if (this.setUiOptions != -1) {
                sb.append("min-fresh=");
                sb.append(this.setUiOptions);
                sb.append(", ");
            }
            if (this.setCenterIfNoTextEnabled) {
                sb.append("only-if-cached, ");
            }
            if (this.ViewPager$SavedState$1) {
                sb.append("no-transform, ");
            }
            if (this.setTextAlignment) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String obj = sb.toString();
            pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) obj, "");
            this.setIconSize = obj;
            return obj;
        }
        return str;
    }

    /* renamed from: o.vj$setX */
    /* loaded from: classes.dex */
    public static final class setX {
        private boolean MenuHostHelper$$ExternalSyntheticLambda0;
        public boolean MenuHostHelper$$ExternalSyntheticLambda1;
        private boolean setLayoutAnimation;
        public boolean setX;
        boolean setY;
        private int setNavigationOnClickListener = -1;
        int setIconTintList = -1;
        private int setOnLongClickListener = -1;

        public final C0540vj setY() {
            return new C0540vj(this.setX, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setNavigationOnClickListener, -1, false, false, false, this.setIconTintList, this.setOnLongClickListener, this.setY, false, false, null, (byte) 0);
        }
    }

    static {
        setX setx = new setX();
        setx.setX = true;
        setx.setY();
        setX setx2 = new setX();
        setx2.setY = true;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        pN.setY(timeUnit, "");
        long seconds = timeUnit.toSeconds(2147483647L);
        setx2.setIconTintList = seconds <= 2147483647L ? (int) seconds : Integer.MAX_VALUE;
        MenuHostHelper$$ExternalSyntheticLambda1 = setx2.setY();
    }
}