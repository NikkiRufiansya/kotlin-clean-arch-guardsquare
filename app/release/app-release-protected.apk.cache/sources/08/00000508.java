package o;

import o.setPrefixTextColor;

/* loaded from: classes.dex */
final class getSystemWindowInsets extends setPrefixTextColor {
    private final setPrefixTextColor.setX setX;
    private final setPrefixTextColor.setIconTintList setY;

    /* synthetic */ getSystemWindowInsets(setPrefixTextColor.setX setx, setPrefixTextColor.setIconTintList seticontintlist, byte b) {
        this(setx, seticontintlist);
    }

    private getSystemWindowInsets(setPrefixTextColor.setX setx, setPrefixTextColor.setIconTintList seticontintlist) {
        this.setX = setx;
        this.setY = seticontintlist;
    }

    @Override // o.setPrefixTextColor
    public final setPrefixTextColor.setX setIconTintList() {
        return this.setX;
    }

    @Override // o.setPrefixTextColor
    public final setPrefixTextColor.setIconTintList setY() {
        return this.setY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkConnectionInfo{networkType=");
        sb.append(this.setX);
        sb.append(", mobileSubtype=");
        sb.append(this.setY);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setPrefixTextColor) {
            setPrefixTextColor setprefixtextcolor = (setPrefixTextColor) obj;
            setPrefixTextColor.setX setx = this.setX;
            if (setx != null ? setx.equals(setprefixtextcolor.setIconTintList()) : setprefixtextcolor.setIconTintList() == null) {
                setPrefixTextColor.setIconTintList seticontintlist = this.setY;
                if (seticontintlist == null) {
                    if (setprefixtextcolor.setY() == null) {
                        return true;
                    }
                } else if (seticontintlist.equals(setprefixtextcolor.setY())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        setPrefixTextColor.setX setx = this.setX;
        int hashCode = setx == null ? 0 : setx.hashCode();
        setPrefixTextColor.setIconTintList seticontintlist = this.setY;
        return ((hashCode ^ 1000003) * 1000003) ^ (seticontintlist != null ? seticontintlist.hashCode() : 0);
    }

    /* loaded from: classes.dex */
    public static final class setIconTintList extends setPrefixTextColor$MenuHostHelper$$ExternalSyntheticLambda0 {
        private setPrefixTextColor.setX setIconTintList;
        private setPrefixTextColor.setIconTintList setX;

        @Override // o.setPrefixTextColor$MenuHostHelper$$ExternalSyntheticLambda0
        public final setPrefixTextColor$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0(setPrefixTextColor.setX setx) {
            this.setIconTintList = setx;
            return this;
        }

        @Override // o.setPrefixTextColor$MenuHostHelper$$ExternalSyntheticLambda0
        public final setPrefixTextColor$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0(setPrefixTextColor.setIconTintList seticontintlist) {
            this.setX = seticontintlist;
            return this;
        }

        @Override // o.setPrefixTextColor$MenuHostHelper$$ExternalSyntheticLambda0
        public final setPrefixTextColor setY() {
            return new getSystemWindowInsets(this.setIconTintList, this.setX, (byte) 0);
        }
    }
}