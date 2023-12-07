package o;

/* renamed from: o.gf  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180gf implements InterfaceC0171fy {
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final int setX;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0180gf(String str, int i) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        this.setX = i;
    }

    @Override // o.InterfaceC0171fy
    public final long setY() {
        if (this.setX == 0) {
            return 0L;
        }
        String navigationOnClickListener = setNavigationOnClickListener();
        try {
            return Long.valueOf(navigationOnClickListener).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", navigationOnClickListener, "long"), e);
        }
    }

    @Override // o.InterfaceC0171fy
    public final double setIconTintList() {
        if (this.setX == 0) {
            return 0.0d;
        }
        String navigationOnClickListener = setNavigationOnClickListener();
        try {
            return Double.valueOf(navigationOnClickListener).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", navigationOnClickListener, "double"), e);
        }
    }

    @Override // o.InterfaceC0171fy
    public final String setX() {
        if (this.setX == 0) {
            return "";
        }
        String str = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }

    @Override // o.InterfaceC0171fy
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        if (this.setX == 0) {
            return false;
        }
        String navigationOnClickListener = setNavigationOnClickListener();
        if (fT.setIconTintList.matcher(navigationOnClickListener).matches()) {
            return true;
        }
        if (fT.setX.matcher(navigationOnClickListener).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", navigationOnClickListener, "boolean"));
    }

    @Override // o.InterfaceC0171fy
    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.setX;
    }

    private String setNavigationOnClickListener() {
        String str;
        if (this.setX == 0) {
            str = "";
        } else {
            str = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (str == null) {
                throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
            }
        }
        return str.trim();
    }
}