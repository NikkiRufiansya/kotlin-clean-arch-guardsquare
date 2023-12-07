package o;

import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import o.setShowingForActionMode;
import o.setVisibility;

/* loaded from: classes.dex */
public final class setButtonTintBlendMode extends setQueryHint {
    private int m;
    int setBackgroundTintMode;
    private setCompatHoveredFocusedTranslationZ setCalendarViewShown;
    private int setChipTextResource;
    int setEdgeEffectFactory;
    public int setErrorIconTintList;
    public setShowingForActionMode setX = new setShowingForActionMode(this);
    public setThumb ActionMenuPresenter$SavedState$1 = new setThumb(this);
    public setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 RemoteActionCompatParcelizer = null;
    public boolean TextInputLayout$SavedState$1 = false;
    private setWebContentsDebuggingEnabled setCheckableResource = new setWebContentsDebuggingEnabled();
    public int setChipSpacingHorizontal = 0;
    public int setMinEms = 0;
    setColorFilter[] minusKey = new setColorFilter[4];
    setColorFilter[] setEmptyView = new setColorFilter[4];
    private boolean setExpandedTitleTextColor = false;
    private boolean GridLayoutManager = false;
    private boolean setRippleColorResource = false;
    private int setScrollX = 0;
    private int wrap = 0;
    public int setChipIconEnabledResource = 257;
    private boolean setSelectionFromTop = false;
    public boolean setCallingWorkSourceUid = false;
    public boolean setLineBreakStyle = false;
    private int setDelayedApplicationOfInitialState = 0;
    WeakReference<zzD> setCheckedIconEnabledResource = null;
    WeakReference<zzD> setY = null;
    WeakReference<zzD> setOnScrollChangeListener = null;
    WeakReference<zzD> setIconTintList = null;
    private HashSet<setVisibility> setSecondaryProgressTintMode = new HashSet<>();
    private setShowingForActionMode.setX setOnSeekBarChangeListener = new setShowingForActionMode.setX();

    private boolean setIconTintList(boolean z, int i) {
        boolean z2;
        boolean z3;
        setThumb setthumb = this.ActionMenuPresenter$SavedState$1;
        boolean z4 = z & true;
        setVisibility.setX setx = setthumb.setIconTintList.setHasDecor[0];
        setVisibility.setX setx2 = setthumb.setIconTintList.setHasDecor[1];
        int centerIfNoTextEnabled = setthumb.setIconTintList.setCenterIfNoTextEnabled();
        int textAlignment = setthumb.setIconTintList.setTextAlignment();
        if (z4 && (setx == setVisibility.setX.WRAP_CONTENT || setx2 == setVisibility.setX.WRAP_CONTENT)) {
            Iterator<setSupportButtonTintList> it = setthumb.setUiOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                setSupportButtonTintList next = it.next();
                if (next.setOnLongClickListener == i && !next.setIconTintList()) {
                    z4 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z4 && setx == setVisibility.setX.WRAP_CONTENT) {
                    setthumb.setIconTintList.setHasDecor[0] = setVisibility.setX.FIXED;
                    setButtonTintBlendMode setbuttontintblendmode = setthumb.setIconTintList;
                    setbuttontintblendmode.setNavigationOnClickListener(setthumb.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode, 0));
                    setItemTextAppearanceActive setitemtextappearanceactive = setthumb.setIconTintList.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1;
                    setButtonTintBlendMode setbuttontintblendmode2 = setthumb.setIconTintList;
                    setitemtextappearanceactive.setX(setbuttontintblendmode2.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode2.setHint);
                }
            } else if (z4 && setx2 == setVisibility.setX.WRAP_CONTENT) {
                setthumb.setIconTintList.setHasDecor[1] = setVisibility.setX.FIXED;
                setButtonTintBlendMode setbuttontintblendmode3 = setthumb.setIconTintList;
                setbuttontintblendmode3.setY(setthumb.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode3, 1));
                setItemTextAppearanceActive setitemtextappearanceactive2 = setthumb.setIconTintList.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1;
                setButtonTintBlendMode setbuttontintblendmode4 = setthumb.setIconTintList;
                setitemtextappearanceactive2.setX(setbuttontintblendmode4.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode4.setTextScaleX);
            }
        }
        if (i == 0) {
            if (setthumb.setIconTintList.setHasDecor[0] == setVisibility.setX.FIXED || setthumb.setIconTintList.setHasDecor[0] == setVisibility.setX.MATCH_PARENT) {
                setButtonTintBlendMode setbuttontintblendmode5 = setthumb.setIconTintList;
                int i2 = (setbuttontintblendmode5.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode5.setHint) + centerIfNoTextEnabled;
                setthumb.setIconTintList.setNavigationOnClickListener.setIconTintList.setX(i2);
                setthumb.setIconTintList.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(i2 - centerIfNoTextEnabled);
                z2 = true;
            }
            z2 = false;
        } else {
            if (setthumb.setIconTintList.setHasDecor[1] == setVisibility.setX.FIXED || setthumb.setIconTintList.setHasDecor[1] == setVisibility.setX.MATCH_PARENT) {
                setButtonTintBlendMode setbuttontintblendmode6 = setthumb.setIconTintList;
                int i3 = (setbuttontintblendmode6.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode6.setTextScaleX) + textAlignment;
                setthumb.setIconTintList.setNavigationIconTint.setIconTintList.setX(i3);
                setthumb.setIconTintList.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(i3 - textAlignment);
                z2 = true;
            }
            z2 = false;
        }
        setthumb.setX();
        Iterator<setSupportButtonTintList> it2 = setthumb.setUiOptions.iterator();
        while (it2.hasNext()) {
            setSupportButtonTintList next2 = it2.next();
            if (next2.setOnLongClickListener == i && (next2.setIconSize != setthumb.setIconTintList || next2.setNavigationOnClickListener)) {
                next2.MenuHostHelper$$ExternalSyntheticLambda1();
            }
        }
        Iterator<setSupportButtonTintList> it3 = setthumb.setUiOptions.iterator();
        while (it3.hasNext()) {
            setSupportButtonTintList next3 = it3.next();
            if (next3.setOnLongClickListener == i && (z2 || next3.setIconSize != setthumb.setIconTintList)) {
                if (!next3.setCenterIfNoTextEnabled.setOnLongClickListener || !next3.setIconTintList.setOnLongClickListener || (!(next3 instanceof zza) && !next3.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener)) {
                    z3 = false;
                    break;
                }
            }
        }
        z3 = true;
        setthumb.setIconTintList.setHasDecor[0] = setx;
        setthumb.setIconTintList.setHasDecor[1] = setx2;
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:172:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0486 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long MenuHostHelper$$ExternalSyntheticLambda0(int r22, int r23, int r24, int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 1664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setButtonTintBlendMode.MenuHostHelper$$ExternalSyntheticLambda0(int, int, int, int, int, int, int):long");
    }

    @Override // o.setQueryHint, o.setVisibility
    public final void setMaxEms() {
        this.setCheckableResource.setX();
        this.setBackgroundTintMode = 0;
        this.setChipTextResource = 0;
        this.setEdgeEffectFactory = 0;
        this.m = 0;
        this.setSelectionFromTop = false;
        super.setMaxEms();
    }

    @Override // o.setVisibility
    public final void setX(boolean z, boolean z2) {
        super.setX(z, z2);
        int size = ((setQueryHint) this).setRowOrderPreserved.size();
        for (int i = 0; i < size; i++) {
            ((setQueryHint) this).setRowOrderPreserved.get(i).setX(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:258:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x047b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x051a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x055a  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x0865  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0897  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x08b0  */
    /* JADX WARN: Removed duplicated region for block: B:572:0x093d  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0949  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x094b  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x094f  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0964  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x0966  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0970  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0985  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x09c2  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x09c8  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x09e3  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x09fa  */
    /* JADX WARN: Type inference failed for: r1v39 */
    /* JADX WARN: Type inference failed for: r1v40, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v43 */
    @Override // o.setQueryHint
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setIconTintList() {
        /*
            Method dump skipped, instructions count: 2572
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setButtonTintBlendMode.setIconTintList():void");
    }

    public static boolean setX(setVisibility setvisibility, setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setShowingForActionMode.setX setx, int i) {
        int i2;
        int i3;
        if (setshowingforactionmode_menuhosthelper__externalsyntheticlambda1 == null) {
            return false;
        }
        if (setvisibility.setFilterRedundantCalls == 8 || (setvisibility instanceof SwipeDismissBehavior) || (setvisibility instanceof zzB)) {
            setx.setUnboundedRipple = 0;
            setx.setUiOptions = 0;
            return false;
        }
        setx.MenuHostHelper$$ExternalSyntheticLambda1 = setvisibility.setHasDecor[0];
        setx.setOnLongClickListener = setvisibility.setHasDecor[1];
        setx.MenuHostHelper$$ExternalSyntheticLambda0 = setvisibility.setFilterRedundantCalls == 8 ? 0 : setvisibility.setHint;
        setx.setLayoutAnimation = setvisibility.setFilterRedundantCalls == 8 ? 0 : setvisibility.setTextScaleX;
        setx.setNavigationOnClickListener = false;
        setx.setIconTintList = 0;
        boolean z = setx.MenuHostHelper$$ExternalSyntheticLambda1 == setVisibility.setX.MATCH_CONSTRAINT;
        boolean z2 = setx.setOnLongClickListener == setVisibility.setX.MATCH_CONSTRAINT;
        boolean z3 = z && setvisibility.setZ > 0.0f;
        boolean z4 = z2 && setvisibility.setZ > 0.0f;
        if (z && setvisibility.setX(0) && setvisibility.setContentScrimResource == 0 && !z3) {
            setx.MenuHostHelper$$ExternalSyntheticLambda1 = setVisibility.setX.WRAP_CONTENT;
            if (z2 && setvisibility.FragmentStateAdapter$2 == 0) {
                setx.MenuHostHelper$$ExternalSyntheticLambda1 = setVisibility.setX.FIXED;
            }
            z = false;
        }
        if (z2 && setvisibility.setX(1) && setvisibility.FragmentStateAdapter$2 == 0 && !z4) {
            setx.setOnLongClickListener = setVisibility.setX.WRAP_CONTENT;
            if (z && setvisibility.setContentScrimResource == 0) {
                setx.setOnLongClickListener = setVisibility.setX.FIXED;
            }
            z2 = false;
        }
        if (setvisibility.setX()) {
            setx.MenuHostHelper$$ExternalSyntheticLambda1 = setVisibility.setX.FIXED;
            z = false;
        }
        if (setvisibility.setY()) {
            setx.setOnLongClickListener = setVisibility.setX.FIXED;
            z2 = false;
        }
        if (z3) {
            if (setvisibility.FirebaseRemoteConfigKtxRegistrar[0] == 4) {
                setx.MenuHostHelper$$ExternalSyntheticLambda1 = setVisibility.setX.FIXED;
            } else if (!z2) {
                if (setx.setOnLongClickListener == setVisibility.setX.FIXED) {
                    i3 = setx.setLayoutAnimation;
                } else {
                    setx.MenuHostHelper$$ExternalSyntheticLambda1 = setVisibility.setX.WRAP_CONTENT;
                    setshowingforactionmode_menuhosthelper__externalsyntheticlambda1.setY(setvisibility, setx);
                    i3 = setx.setUiOptions;
                }
                setx.MenuHostHelper$$ExternalSyntheticLambda1 = setVisibility.setX.FIXED;
                setx.MenuHostHelper$$ExternalSyntheticLambda0 = (int) (setvisibility.setZ * i3);
            }
        }
        if (z4) {
            if (setvisibility.FirebaseRemoteConfigKtxRegistrar[1] == 4) {
                setx.setOnLongClickListener = setVisibility.setX.FIXED;
            } else if (!z) {
                if (setx.MenuHostHelper$$ExternalSyntheticLambda1 == setVisibility.setX.FIXED) {
                    i2 = setx.MenuHostHelper$$ExternalSyntheticLambda0;
                } else {
                    setx.setOnLongClickListener = setVisibility.setX.WRAP_CONTENT;
                    setshowingforactionmode_menuhosthelper__externalsyntheticlambda1.setY(setvisibility, setx);
                    i2 = setx.setUnboundedRipple;
                }
                setx.setOnLongClickListener = setVisibility.setX.FIXED;
                if (setvisibility.b_() == -1) {
                    setx.setLayoutAnimation = (int) (i2 / setvisibility.setZ);
                } else {
                    setx.setLayoutAnimation = (int) (setvisibility.setZ * i2);
                }
            }
        }
        setshowingforactionmode_menuhosthelper__externalsyntheticlambda1.setY(setvisibility, setx);
        setvisibility.setNavigationOnClickListener(setx.setUnboundedRipple);
        setvisibility.setY(setx.setUiOptions);
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda0 = setx.setX;
        int i4 = setx.setY;
        setvisibility.setTextAlignment = i4;
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda0 = i4 > 0;
        setx.setIconTintList = 0;
        return setx.setNavigationOnClickListener;
    }
}