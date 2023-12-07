package o;

/* loaded from: classes.dex */
abstract class setChipSpacingHorizontalResource {
    static final setChipSpacingHorizontalResource setX = new setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1() { // from class: o.LottieAnimationView$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0
        private Long MenuHostHelper$$ExternalSyntheticLambda0;
        private Integer MenuHostHelper$$ExternalSyntheticLambda1;
        private Integer setIconTintList;
        private Long setX;
        private Integer setY;

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1
        public final setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1 setLayoutAnimation() {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 10485760L;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1
        public final setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1 setY() {
            this.setIconTintList = 200;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1
        public final setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1 setIconTintList() {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 10000;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1
        public final setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1() {
            this.setX = 604800000L;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1
        public final setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1 setX() {
            this.setY = 81920;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // o.setChipSpacingHorizontalResource$MenuHostHelper$$ExternalSyntheticLambda1
        public final setChipSpacingHorizontalResource MenuHostHelper$$ExternalSyntheticLambda0() {
            String str = this.MenuHostHelper$$ExternalSyntheticLambda0 == null ? " maxStorageSizeInBytes" : "";
            if (this.setIconTintList == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" loadBatchSize");
                str = sb.toString();
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" criticalSectionEnterTimeoutMs");
                str = sb2.toString();
            }
            if (this.setX == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventCleanUpAge");
                str = sb3.toString();
            }
            if (this.setY == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" maxBlobByteSizePerRow");
                str = sb4.toString();
            }
            if (!str.isEmpty()) {
                StringBuilder sb5 = new StringBuilder("Missing required properties:");
                sb5.append(str);
                throw new IllegalStateException(sb5.toString());
            }
            return new LottieAnimationView$SavedState$1(this.MenuHostHelper$$ExternalSyntheticLambda0.longValue(), this.setIconTintList.intValue(), this.MenuHostHelper$$ExternalSyntheticLambda1.intValue(), this.setX.longValue(), this.setY.intValue(), (byte) 0);
        }
    }.setLayoutAnimation().setY().setIconTintList().MenuHostHelper$$ExternalSyntheticLambda1().setX().MenuHostHelper$$ExternalSyntheticLambda0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long MenuHostHelper$$ExternalSyntheticLambda0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int MenuHostHelper$$ExternalSyntheticLambda1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int setIconTintList();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int setX();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract long setY();
}