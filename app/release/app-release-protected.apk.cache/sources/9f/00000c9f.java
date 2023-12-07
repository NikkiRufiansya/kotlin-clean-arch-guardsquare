package o;

/* loaded from: classes.dex */
final class setImeOptions extends setCollapseIcon {
    private final String MenuHostHelper$$ExternalSyntheticLambda0;
    private final String MenuHostHelper$$ExternalSyntheticLambda1;
    private final String setChipCornerRadius;
    private final String setIconTintList;
    private final String setLayoutAnimation;
    private final String setNavigationOnClickListener;
    private final String setOnLongClickListener;
    private final Integer setTextAlignment;
    private final String setUiOptions;
    private final String setUnboundedRipple;
    private final String setX;
    private final String setY;

    /* synthetic */ setImeOptions(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, byte b) {
        this(num, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    private setImeOptions(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.setTextAlignment = num;
        this.setUnboundedRipple = str;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str3;
        this.setChipCornerRadius = str4;
        this.setOnLongClickListener = str5;
        this.setUiOptions = str6;
        this.setX = str7;
        this.setNavigationOnClickListener = str8;
        this.setY = str9;
        this.setLayoutAnimation = str10;
        this.setIconTintList = str11;
    }

    @Override // o.setCollapseIcon
    public final Integer setChipCornerRadius() {
        return this.setTextAlignment;
    }

    @Override // o.setCollapseIcon
    public final String setNavigationOnClickListener() {
        return this.setUnboundedRipple;
    }

    @Override // o.setCollapseIcon
    public final String MenuHostHelper$$ExternalSyntheticLambda0() {
        return this.MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setCollapseIcon
    public final String setY() {
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    @Override // o.setCollapseIcon
    public final String ViewPager$SavedState$1() {
        return this.setChipCornerRadius;
    }

    @Override // o.setCollapseIcon
    public final String setUnboundedRipple() {
        return this.setOnLongClickListener;
    }

    @Override // o.setCollapseIcon
    public final String setLayoutAnimation() {
        return this.setUiOptions;
    }

    @Override // o.setCollapseIcon
    public final String MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setX;
    }

    @Override // o.setCollapseIcon
    public final String setUiOptions() {
        return this.setNavigationOnClickListener;
    }

    @Override // o.setCollapseIcon
    public final String setIconTintList() {
        return this.setY;
    }

    @Override // o.setCollapseIcon
    public final String setOnLongClickListener() {
        return this.setLayoutAnimation;
    }

    @Override // o.setCollapseIcon
    public final String setX() {
        return this.setIconTintList;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.setTextAlignment);
        sb.append(", model=");
        sb.append(this.setUnboundedRipple);
        sb.append(", hardware=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append(", device=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", product=");
        sb.append(this.setChipCornerRadius);
        sb.append(", osBuild=");
        sb.append(this.setOnLongClickListener);
        sb.append(", manufacturer=");
        sb.append(this.setUiOptions);
        sb.append(", fingerprint=");
        sb.append(this.setX);
        sb.append(", locale=");
        sb.append(this.setNavigationOnClickListener);
        sb.append(", country=");
        sb.append(this.setY);
        sb.append(", mccMnc=");
        sb.append(this.setLayoutAnimation);
        sb.append(", applicationBuild=");
        sb.append(this.setIconTintList);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof setCollapseIcon) {
            setCollapseIcon setcollapseicon = (setCollapseIcon) obj;
            Integer num = this.setTextAlignment;
            if (num != null ? num.equals(setcollapseicon.setChipCornerRadius()) : setcollapseicon.setChipCornerRadius() == null) {
                String str = this.setUnboundedRipple;
                if (str != null ? str.equals(setcollapseicon.setNavigationOnClickListener()) : setcollapseicon.setNavigationOnClickListener() == null) {
                    String str2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
                    if (str2 != null ? str2.equals(setcollapseicon.MenuHostHelper$$ExternalSyntheticLambda0()) : setcollapseicon.MenuHostHelper$$ExternalSyntheticLambda0() == null) {
                        String str3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (str3 != null ? str3.equals(setcollapseicon.setY()) : setcollapseicon.setY() == null) {
                            String str4 = this.setChipCornerRadius;
                            if (str4 != null ? str4.equals(setcollapseicon.ViewPager$SavedState$1()) : setcollapseicon.ViewPager$SavedState$1() == null) {
                                String str5 = this.setOnLongClickListener;
                                if (str5 != null ? str5.equals(setcollapseicon.setUnboundedRipple()) : setcollapseicon.setUnboundedRipple() == null) {
                                    String str6 = this.setUiOptions;
                                    if (str6 != null ? str6.equals(setcollapseicon.setLayoutAnimation()) : setcollapseicon.setLayoutAnimation() == null) {
                                        String str7 = this.setX;
                                        if (str7 != null ? str7.equals(setcollapseicon.MenuHostHelper$$ExternalSyntheticLambda1()) : setcollapseicon.MenuHostHelper$$ExternalSyntheticLambda1() == null) {
                                            String str8 = this.setNavigationOnClickListener;
                                            if (str8 != null ? str8.equals(setcollapseicon.setUiOptions()) : setcollapseicon.setUiOptions() == null) {
                                                String str9 = this.setY;
                                                if (str9 != null ? str9.equals(setcollapseicon.setIconTintList()) : setcollapseicon.setIconTintList() == null) {
                                                    String str10 = this.setLayoutAnimation;
                                                    if (str10 != null ? str10.equals(setcollapseicon.setOnLongClickListener()) : setcollapseicon.setOnLongClickListener() == null) {
                                                        String str11 = this.setIconTintList;
                                                        if (str11 == null) {
                                                            if (setcollapseicon.setX() == null) {
                                                                return true;
                                                            }
                                                        } else if (str11.equals(setcollapseicon.setX())) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
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
        Integer num = this.setTextAlignment;
        int hashCode = num == null ? 0 : num.hashCode();
        String str = this.setUnboundedRipple;
        int hashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int hashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.setChipCornerRadius;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.setOnLongClickListener;
        int hashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.setUiOptions;
        int hashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.setX;
        int hashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.setNavigationOnClickListener;
        int hashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.setY;
        int hashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.setLayoutAnimation;
        int hashCode11 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.setIconTintList;
        return ((((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ hashCode11) * 1000003) ^ (str11 != null ? str11.hashCode() : 0);
    }

    /* loaded from: classes.dex */
    public static final class setY extends setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 {
        private String MenuHostHelper$$ExternalSyntheticLambda0;
        private String MenuHostHelper$$ExternalSyntheticLambda1;
        private Integer setChipCornerRadius;
        private String setIconSize;
        private String setIconTintList;
        private String setLayoutAnimation;
        private String setNavigationOnClickListener;
        private String setOnLongClickListener;
        private String setUiOptions;
        private String setUnboundedRipple;
        private String setX;
        private String setY;

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setY(Integer num) {
            this.setChipCornerRadius = num;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setUnboundedRipple(String str) {
            this.setLayoutAnimation = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setY(String str) {
            this.setIconTintList = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setX(String str) {
            this.setY = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setTextAlignment(String str) {
            this.setIconSize = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setOnLongClickListener(String str) {
            this.setNavigationOnClickListener = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setLayoutAnimation(String str) {
            this.setOnLongClickListener = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1(String str) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setNavigationOnClickListener(String str) {
            this.setUiOptions = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setIconTintList(String str) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 setUiOptions(String str) {
            this.setUnboundedRipple = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda0(String str) {
            this.setX = str;
            return this;
        }

        @Override // o.setCollapseIcon$MenuHostHelper$$ExternalSyntheticLambda0
        public final setCollapseIcon setY() {
            return new setImeOptions(this.setChipCornerRadius, this.setLayoutAnimation, this.setIconTintList, this.setY, this.setIconSize, this.setNavigationOnClickListener, this.setOnLongClickListener, this.MenuHostHelper$$ExternalSyntheticLambda1, this.setUiOptions, this.MenuHostHelper$$ExternalSyntheticLambda0, this.setUnboundedRipple, this.setX, (byte) 0);
        }
    }
}