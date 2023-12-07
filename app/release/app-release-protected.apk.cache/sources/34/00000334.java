package o;

import o.AbstractC0091cy;
import o.cA;

/* loaded from: classes.dex */
final class cC extends AbstractC0091cy {
    private final long MenuHostHelper$$ExternalSyntheticLambda0;
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setIconTintList;
    private final long setLayoutAnimation;
    private final cA.setIconTintList setUnboundedRipple;
    private final String setX;
    private final String setY;

    /* synthetic */ cC(String str, cA.setIconTintList seticontintlist, String str2, String str3, long j, long j2, String str4, byte b) {
        this(str, seticontintlist, str2, str3, j, j2, str4);
    }

    private cC(String str, cA.setIconTintList seticontintlist, String str2, String str3, long j, long j2, String str4) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.setUnboundedRipple = seticontintlist;
        this.setIconTintList = str2;
        this.setX = str3;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = j;
        this.setLayoutAnimation = j2;
        this.setY = str4;
    }

    @Override // o.AbstractC0091cy
    public final String setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.AbstractC0091cy
    public final cA.setIconTintList setUiOptions() {
        return this.setUnboundedRipple;
    }

    @Override // o.AbstractC0091cy
    public final String setX() {
        return this.setIconTintList;
    }

    @Override // o.AbstractC0091cy
    public final String setIconTintList() {
        return this.setX;
    }

    @Override // o.AbstractC0091cy
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.AbstractC0091cy
    public final long setNavigationOnClickListener() {
        return this.setLayoutAnimation;
    }

    @Override // o.AbstractC0091cy
    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setY;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", registrationStatus=");
        sb.append(this.setUnboundedRipple);
        sb.append(", authToken=");
        sb.append(this.setIconTintList);
        sb.append(", refreshToken=");
        sb.append(this.setX);
        sb.append(", expiresInSecs=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.setLayoutAnimation);
        sb.append(", fisError=");
        sb.append(this.setY);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0091cy) {
            AbstractC0091cy abstractC0091cy = (AbstractC0091cy) obj;
            String str3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (str3 != null ? str3.equals(abstractC0091cy.setY()) : abstractC0091cy.setY() == null) {
                if (this.setUnboundedRipple.equals(abstractC0091cy.setUiOptions()) && ((str = this.setIconTintList) != null ? str.equals(abstractC0091cy.setX()) : abstractC0091cy.setX() == null) && ((str2 = this.setX) != null ? str2.equals(abstractC0091cy.setIconTintList()) : abstractC0091cy.setIconTintList() == null) && this.MenuHostHelper$$ExternalSyntheticLambda0 == abstractC0091cy.MenuHostHelper$$ExternalSyntheticLambda0() && this.setLayoutAnimation == abstractC0091cy.setNavigationOnClickListener()) {
                    String str4 = this.setY;
                    if (str4 == null) {
                        if (abstractC0091cy.MenuHostHelper$$ExternalSyntheticLambda1() == null) {
                            return true;
                        }
                    } else if (str4.equals(abstractC0091cy.MenuHostHelper$$ExternalSyntheticLambda1())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int hashCode = str == null ? 0 : str.hashCode();
        int hashCode2 = this.setUnboundedRipple.hashCode();
        String str2 = this.setIconTintList;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.setX;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        long j = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i = (int) (j ^ (j >>> 32));
        long j2 = this.setLayoutAnimation;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        String str4 = this.setY;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // o.AbstractC0091cy
    public final AbstractC0091cy.setIconTintList setOnLongClickListener() {
        return new setX(this, (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setX extends AbstractC0091cy.setIconTintList {
        Long MenuHostHelper$$ExternalSyntheticLambda0;
        private String MenuHostHelper$$ExternalSyntheticLambda1;
        private String setIconTintList;
        private String setLayoutAnimation;
        private cA.setIconTintList setUnboundedRipple;
        private String setX;
        private Long setY;

        /* synthetic */ setX(AbstractC0091cy abstractC0091cy, byte b) {
            this(abstractC0091cy);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public setX() {
        }

        private setX(AbstractC0091cy abstractC0091cy) {
            this.setX = abstractC0091cy.setY();
            this.setUnboundedRipple = abstractC0091cy.setUiOptions();
            this.setIconTintList = abstractC0091cy.setX();
            this.setLayoutAnimation = abstractC0091cy.setIconTintList();
            this.setY = Long.valueOf(abstractC0091cy.MenuHostHelper$$ExternalSyntheticLambda0());
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Long.valueOf(abstractC0091cy.setNavigationOnClickListener());
            this.MenuHostHelper$$ExternalSyntheticLambda1 = abstractC0091cy.MenuHostHelper$$ExternalSyntheticLambda1();
        }

        @Override // o.AbstractC0091cy.setIconTintList
        public final AbstractC0091cy.setIconTintList setY(String str) {
            this.setX = str;
            return this;
        }

        @Override // o.AbstractC0091cy.setIconTintList
        public final AbstractC0091cy.setIconTintList setX(cA.setIconTintList seticontintlist) {
            if (seticontintlist == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.setUnboundedRipple = seticontintlist;
            return this;
        }

        @Override // o.AbstractC0091cy.setIconTintList
        public final AbstractC0091cy.setIconTintList MenuHostHelper$$ExternalSyntheticLambda0(String str) {
            this.setIconTintList = str;
            return this;
        }

        @Override // o.AbstractC0091cy.setIconTintList
        public final AbstractC0091cy.setIconTintList setX(String str) {
            this.setLayoutAnimation = str;
            return this;
        }

        @Override // o.AbstractC0091cy.setIconTintList
        public final AbstractC0091cy.setIconTintList setY(long j) {
            this.setY = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC0091cy.setIconTintList
        public final AbstractC0091cy.setIconTintList setX(long j) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Long.valueOf(j);
            return this;
        }

        @Override // o.AbstractC0091cy.setIconTintList
        public final AbstractC0091cy.setIconTintList setIconTintList(String str) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
            return this;
        }

        @Override // o.AbstractC0091cy.setIconTintList
        public final AbstractC0091cy MenuHostHelper$$ExternalSyntheticLambda1() {
            String str = this.setUnboundedRipple == null ? " registrationStatus" : "";
            if (this.setY == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" expiresInSecs");
                str = sb.toString();
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" tokenCreationEpochInSecs");
                str = sb2.toString();
            }
            if (!str.isEmpty()) {
                StringBuilder sb3 = new StringBuilder("Missing required properties:");
                sb3.append(str);
                throw new IllegalStateException(sb3.toString());
            }
            return new cC(this.setX, this.setUnboundedRipple, this.setIconTintList, this.setLayoutAnimation, this.setY.longValue(), this.MenuHostHelper$$ExternalSyntheticLambda0.longValue(), this.MenuHostHelper$$ExternalSyntheticLambda1, (byte) 0);
        }
    }
}