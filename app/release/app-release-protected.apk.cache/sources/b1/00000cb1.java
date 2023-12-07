package o;

import java.util.List;

/* loaded from: classes.dex */
public final class setIndicatorBounds implements getRootAlpha {
    public final setUseCompatPadding MenuHostHelper$$ExternalSyntheticLambda0;
    public final setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    public final List<setOnReceiveContentListener> setIconTintList;
    public final String setLayoutAnimation;
    public final float setNavigationOnClickListener;
    public final setOnReceiveContentListener setOnLongClickListener;
    public final setOnReceiveContentListener setUiOptions;
    public final setFirstDayOfWeek setUnboundedRipple;
    public final setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0 setX;
    public final boolean setY;

    /* renamed from: o.setIndicatorBounds$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;
        public static final /* synthetic */ int[] setIconTintList;

        static {
            int[] iArr = new int[setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0.values().length];
            setIconTintList = iArr2;
            try {
                iArr2[setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                setIconTintList[setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                setIconTintList[setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public setIndicatorBounds(String str, setOnReceiveContentListener setonreceivecontentlistener, List<setOnReceiveContentListener> list, setUseCompatPadding setusecompatpadding, setFirstDayOfWeek setfirstdayofweek, setOnReceiveContentListener setonreceivecontentlistener2, setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda0 setindicatorbounds_menuhosthelper__externalsyntheticlambda0, setIndicatorBounds$MenuHostHelper$$ExternalSyntheticLambda1 setindicatorbounds_menuhosthelper__externalsyntheticlambda1, float f, boolean z) {
        this.setLayoutAnimation = str;
        this.setUiOptions = setonreceivecontentlistener;
        this.setIconTintList = list;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setusecompatpadding;
        this.setUnboundedRipple = setfirstdayofweek;
        this.setOnLongClickListener = setonreceivecontentlistener2;
        this.setX = setindicatorbounds_menuhosthelper__externalsyntheticlambda0;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setindicatorbounds_menuhosthelper__externalsyntheticlambda1;
        this.setNavigationOnClickListener = f;
        this.setY = z;
    }

    @Override // o.getRootAlpha
    public final setContentInsetStartWithNavigation setIconTintList(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable) {
        return new setChipIcon(setpointericon, setendiconcheckable, this);
    }
}