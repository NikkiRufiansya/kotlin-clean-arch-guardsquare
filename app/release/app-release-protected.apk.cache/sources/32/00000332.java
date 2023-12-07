package o;

import o.cD;

/* loaded from: classes.dex */
final class cB extends cD {
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setIconTintList;
    private final cD.setY setX;
    private final cE setY;

    /* synthetic */ cB(String str, String str2, String str3, cE cEVar, cD.setY sety, byte b) {
        this(str, str2, str3, cEVar, sety);
    }

    private cB(String str, String str2, String str3, cE cEVar, cD.setY sety) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str2;
        this.setIconTintList = str3;
        this.setY = cEVar;
        this.setX = sety;
    }

    @Override // o.cD
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.cD
    public final String setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.cD
    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setIconTintList;
    }

    @Override // o.cD
    public final cE setX() {
        return this.setY;
    }

    @Override // o.cD
    public final cD.setY setIconTintList() {
        return this.setX;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", fid=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", refreshToken=");
        sb.append(this.setIconTintList);
        sb.append(", authToken=");
        sb.append(this.setY);
        sb.append(", responseCode=");
        sb.append(this.setX);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cD) {
            cD cDVar = (cD) obj;
            String str = this.MenuHostHelper$$ExternalSyntheticLambda0;
            if (str != null ? str.equals(cDVar.MenuHostHelper$$ExternalSyntheticLambda0()) : cDVar.MenuHostHelper$$ExternalSyntheticLambda0() == null) {
                String str2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                if (str2 != null ? str2.equals(cDVar.setY()) : cDVar.setY() == null) {
                    String str3 = this.setIconTintList;
                    if (str3 != null ? str3.equals(cDVar.MenuHostHelper$$ExternalSyntheticLambda1()) : cDVar.MenuHostHelper$$ExternalSyntheticLambda1() == null) {
                        cE cEVar = this.setY;
                        if (cEVar != null ? cEVar.equals(cDVar.setX()) : cDVar.setX() == null) {
                            cD.setY sety = this.setX;
                            if (sety == null) {
                                if (cDVar.setIconTintList() == null) {
                                    return true;
                                }
                            } else if (sety.equals(cDVar.setIconTintList())) {
                                return true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.setIconTintList;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        cE cEVar = this.setY;
        int hashCode4 = cEVar == null ? 0 : cEVar.hashCode();
        cD.setY sety = this.setX;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (sety != null ? sety.hashCode() : 0);
    }

    /* loaded from: classes.dex */
    static final class setX extends cD.setIconTintList {
        private cD.setY MenuHostHelper$$ExternalSyntheticLambda0;
        private String MenuHostHelper$$ExternalSyntheticLambda1;
        private String setIconTintList;
        private String setX;
        private cE setY;

        @Override // o.cD.setIconTintList
        public final cD.setIconTintList setX(String str) {
            this.setIconTintList = str;
            return this;
        }

        @Override // o.cD.setIconTintList
        public final cD.setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
            return this;
        }

        @Override // o.cD.setIconTintList
        public final cD.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(String str) {
            this.setX = str;
            return this;
        }

        @Override // o.cD.setIconTintList
        public final cD.setIconTintList MenuHostHelper$$ExternalSyntheticLambda1(cE cEVar) {
            this.setY = cEVar;
            return this;
        }

        @Override // o.cD.setIconTintList
        public final cD.setIconTintList setX(cD.setY sety) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = sety;
            return this;
        }

        @Override // o.cD.setIconTintList
        public final cD setIconTintList() {
            return new cB(this.setIconTintList, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setX, this.setY, this.MenuHostHelper$$ExternalSyntheticLambda0, (byte) 0);
        }
    }
}