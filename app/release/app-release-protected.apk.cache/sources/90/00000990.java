package o;

/* loaded from: classes.dex */
class setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 {
    setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 MenuHostHelper$$ExternalSyntheticLambda1;
    long setIconTintList = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
        setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = this;
        while (i >= 64) {
            setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 == null) {
                return;
            }
            i -= 64;
        }
        setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.setIconTintList &= ~(1 << i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int setIconTintList(int i) {
        setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 == null) {
            if (i >= 64) {
                return Long.bitCount(this.setIconTintList);
            }
            return Long.bitCount(this.setIconTintList & ((1 << i) - 1));
        } else if (i < 64) {
            return Long.bitCount(this.setIconTintList & ((1 << i) - 1));
        } else {
            return setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.setIconTintList(i - 64) + Long.bitCount(this.setIconTintList);
        }
    }

    public final String toString() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return Long.toBinaryString(this.setIconTintList);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1.toString());
        sb.append("xx");
        sb.append(Long.toBinaryString(this.setIconTintList));
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setX(int i) {
        setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = this;
        while (i >= 64) {
            if (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = new setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0();
            }
            setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
            i -= 64;
        }
        return (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.setIconTintList & (1 << i)) != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(int i, boolean z) {
        setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = this;
        while (true) {
            if (i < 64) {
                long j = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.setIconTintList;
                boolean z2 = (Long.MIN_VALUE & j) != 0;
                long j2 = (1 << i) - 1;
                setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.setIconTintList = (j & j2) | (((~j2) & j) << 1);
                if (z) {
                    setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0(i);
                } else {
                    setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1(i);
                }
                if (!z2 && setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    return;
                }
                if (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = new setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0();
                }
                setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                z = z2;
                i = 0;
            } else {
                if (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                    setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = new setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0();
                }
                setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
                i -= 64;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean setY(int i) {
        setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = this;
        while (i >= 64) {
            if (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = new setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0();
            }
            setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
            i -= 64;
        }
        long j = 1 << i;
        long j2 = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.setIconTintList;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.setIconTintList = j3;
        long j4 = j - 1;
        setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.setIconTintList = Long.rotateRight((~j4) & j3, 1) | (j4 & j3);
        setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda02 = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda02 != null) {
            if (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda02.setX(0)) {
                setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda0(63);
            }
            setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1.setY(0);
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0 setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = this;
        while (i >= 64) {
            if (setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1 = new setBoxBackgroundColorStateList$MenuHostHelper$$ExternalSyntheticLambda0();
            }
            setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0 = setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.MenuHostHelper$$ExternalSyntheticLambda1;
            i -= 64;
        }
        setboxbackgroundcolorstatelist_menuhosthelper__externalsyntheticlambda0.setIconTintList |= 1 << i;
    }
}