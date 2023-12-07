package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zzD {
    public final setVisibility setIconTintList;
    public zzD setLayoutAnimation;
    public setBoxStrokeWidthResource setUiOptions;
    public final zzD$MenuHostHelper$$ExternalSyntheticLambda0 setUnboundedRipple;
    public boolean setX;
    public int setY;
    public HashSet<zzD> MenuHostHelper$$ExternalSyntheticLambda0 = null;
    public int MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    private int setOnLongClickListener = Integer.MIN_VALUE;

    public final void setIconTintList(int i, ArrayList<setOnGroupExpandListener> arrayList, setOnGroupExpandListener setongroupexpandlistener) {
        HashSet<zzD> hashSet = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (hashSet != null) {
            Iterator<zzD> it = hashSet.iterator();
            while (it.hasNext()) {
                setActionBarHideOffset.setY(it.next().setIconTintList, i, arrayList, setongroupexpandlistener);
            }
        }
    }

    public final boolean setIconTintList() {
        boolean z;
        HashSet<zzD> hashSet = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (hashSet == null) {
            return false;
        }
        Iterator<zzD> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().setX().setLayoutAnimation != null) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public zzD(setVisibility setvisibility, zzD$MenuHostHelper$$ExternalSyntheticLambda0 zzd_menuhosthelper__externalsyntheticlambda0) {
        this.setIconTintList = setvisibility;
        this.setUnboundedRipple = zzd_menuhosthelper__externalsyntheticlambda0;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0() {
        zzD zzd;
        if (this.setIconTintList.setFilterRedundantCalls == 8) {
            return 0;
        }
        if (this.setOnLongClickListener != Integer.MIN_VALUE && (zzd = this.setLayoutAnimation) != null && zzd.setIconTintList.setFilterRedundantCalls == 8) {
            return this.setOnLongClickListener;
        }
        return this.MenuHostHelper$$ExternalSyntheticLambda1;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        HashSet<zzD> hashSet;
        zzD zzd = this.setLayoutAnimation;
        if (zzd != null && (hashSet = zzd.MenuHostHelper$$ExternalSyntheticLambda0) != null) {
            hashSet.remove(this);
            if (this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0.size() == 0) {
                this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            }
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
        this.setLayoutAnimation = null;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        this.setOnLongClickListener = Integer.MIN_VALUE;
        this.setX = false;
        this.setY = 0;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(zzD zzd, int i, int i2, boolean z) {
        if (zzd == null) {
            MenuHostHelper$$ExternalSyntheticLambda1();
            return true;
        } else if (z || MenuHostHelper$$ExternalSyntheticLambda0(zzd)) {
            this.setLayoutAnimation = zzd;
            if (zzd.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                zzd.MenuHostHelper$$ExternalSyntheticLambda0 = new HashSet<>();
            }
            HashSet<zzD> hashSet = this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0;
            if (hashSet != null) {
                hashSet.add(this);
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
            this.setOnLongClickListener = i2;
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.zzD$4  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[zzD$MenuHostHelper$$ExternalSyntheticLambda0.values().length];
            setX = iArr;
            try {
                iArr[zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                setX[zzD$MenuHostHelper$$ExternalSyntheticLambda0.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.setIconTintList.setOnNavigationItemSelectedListener);
        sb.append(":");
        sb.append(this.setUnboundedRipple.toString());
        return sb.toString();
    }

    public final zzD setX() {
        switch (AnonymousClass4.setX[this.setUnboundedRipple.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.setIconTintList.setShrinkMotionSpec;
            case 3:
                return this.setIconTintList.setIconified;
            case 4:
                return this.setIconTintList.setIconSize;
            case 5:
                return this.setIconTintList.setChipSpacingVertical;
            default:
                throw new AssertionError(this.setUnboundedRipple.name());
        }
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(zzD zzd) {
        boolean z = false;
        if (zzd == null) {
            return false;
        }
        zzD$MenuHostHelper$$ExternalSyntheticLambda0 zzd_menuhosthelper__externalsyntheticlambda0 = zzd.setUnboundedRipple;
        zzD$MenuHostHelper$$ExternalSyntheticLambda0 zzd_menuhosthelper__externalsyntheticlambda02 = this.setUnboundedRipple;
        if (zzd_menuhosthelper__externalsyntheticlambda0 == zzd_menuhosthelper__externalsyntheticlambda02) {
            return zzd_menuhosthelper__externalsyntheticlambda02 != zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE || (zzd.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0 && this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0);
        }
        switch (AnonymousClass4.setX[this.setUnboundedRipple.ordinal()]) {
            case 1:
                return (zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE || zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_X || zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z2 = zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT || zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT;
                if (zzd.setIconTintList instanceof SwipeDismissBehavior) {
                    return (z2 || zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_X) ? true : true;
                }
                return z2;
            case 4:
            case 5:
                boolean z3 = zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP || zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM;
                if (zzd.setIconTintList instanceof SwipeDismissBehavior) {
                    return (z3 || zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_Y) ? true : true;
                }
                return z3;
            case 6:
                return (zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT || zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT) ? false : true;
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.setUnboundedRipple.name());
        }
    }
}