package o;

import java.util.HashMap;
import o.setVisibility;

/* loaded from: classes.dex */
public final class SwipeDismissBehavior extends setVisibility {
    public boolean ActionMenuPresenter$SavedState$1;
    public float setEmptyView = -1.0f;
    public int setIconTintList = -1;
    public int setLineBreakStyle = -1;
    private boolean setBackgroundTintMode = true;
    public zzD setX = this.setChipSpacingVertical;
    public int setY = 0;
    private int setChipSpacingHorizontal = 0;

    @Override // o.setVisibility
    public final boolean MenuHostHelper$$ExternalSyntheticLambda1() {
        return true;
    }

    public SwipeDismissBehavior() {
        this.setOnLongClickListener.clear();
        this.setOnLongClickListener.add(this.setX);
        int length = this.setChipIconTintResource.length;
        for (int i = 0; i < length; i++) {
            this.setChipIconTintResource[i] = this.setX;
        }
    }

    @Override // o.setVisibility
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setVisibility setvisibility, HashMap<setVisibility, setVisibility> hashMap) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility, hashMap);
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) setvisibility;
        this.setEmptyView = swipeDismissBehavior.setEmptyView;
        this.setIconTintList = swipeDismissBehavior.setIconTintList;
        this.setLineBreakStyle = swipeDismissBehavior.setLineBreakStyle;
        this.setBackgroundTintMode = swipeDismissBehavior.setBackgroundTintMode;
        setTextAlignment(swipeDismissBehavior.setY);
    }

    public final void setTextAlignment(int i) {
        if (this.setY == i) {
            return;
        }
        this.setY = i;
        this.setOnLongClickListener.clear();
        if (this.setY == 1) {
            this.setX = this.setIconified;
        } else {
            this.setX = this.setChipSpacingVertical;
        }
        this.setOnLongClickListener.add(this.setX);
        int length = this.setChipIconTintResource.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.setChipIconTintResource[i2] = this.setX;
        }
    }

    /* renamed from: o.SwipeDismissBehavior$5  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda0;

        static {
            int[] iArr = new int[zzD$MenuHostHelper$$ExternalSyntheticLambda0.values().length];
            MenuHostHelper$$ExternalSyntheticLambda0 = iArr;
            try {
                iArr[zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[zzD$MenuHostHelper$$ExternalSyntheticLambda0.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda0[zzD$MenuHostHelper$$ExternalSyntheticLambda0.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    @Override // o.setVisibility
    public final zzD MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0 zzd_menuhosthelper__externalsyntheticlambda0) {
        int i = AnonymousClass5.MenuHostHelper$$ExternalSyntheticLambda0[zzd_menuhosthelper__externalsyntheticlambda0.ordinal()];
        if (i == 1 || i == 2) {
            if (this.setY == 1) {
                return this.setX;
            }
            return null;
        } else if ((i == 3 || i == 4) && this.setY == 0) {
            return this.setX;
        } else {
            return null;
        }
    }

    @Override // o.setVisibility
    public final boolean setX() {
        return this.ActionMenuPresenter$SavedState$1;
    }

    @Override // o.setVisibility
    public final boolean setY() {
        return this.ActionMenuPresenter$SavedState$1;
    }

    @Override // o.setVisibility
    public final void setX(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, boolean z) {
        setButtonTintBlendMode setbuttontintblendmode = (setButtonTintBlendMode) this.RecyclerView$SavedState$1;
        if (setbuttontintblendmode == null) {
            return;
        }
        zzD MenuHostHelper$$ExternalSyntheticLambda1 = setbuttontintblendmode.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT);
        zzD MenuHostHelper$$ExternalSyntheticLambda12 = setbuttontintblendmode.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT);
        boolean z2 = true;
        boolean z3 = this.RecyclerView$SavedState$1 != null && this.RecyclerView$SavedState$1.setHasDecor[0] == setVisibility.setX.WRAP_CONTENT;
        if (this.setY == 0) {
            MenuHostHelper$$ExternalSyntheticLambda1 = setbuttontintblendmode.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP);
            MenuHostHelper$$ExternalSyntheticLambda12 = setbuttontintblendmode.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM);
            if (this.RecyclerView$SavedState$1 == null || this.RecyclerView$SavedState$1.setHasDecor[1] != setVisibility.setX.WRAP_CONTENT) {
                z2 = false;
            }
        } else {
            z2 = z3;
        }
        if (this.ActionMenuPresenter$SavedState$1 && this.setX.setX) {
            setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda0 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
            zzD zzd = this.setX;
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, !zzd.setX ? 0 : zzd.setY);
            if (this.setIconTintList != -1) {
                if (z2) {
                    setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda12), MenuHostHelper$$ExternalSyntheticLambda0, 0, 5);
                }
            } else if (this.setLineBreakStyle != -1 && z2) {
                setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda02 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda12);
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda0, setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1), 0, 5);
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02, MenuHostHelper$$ExternalSyntheticLambda0, 0, 5);
            }
            this.ActionMenuPresenter$SavedState$1 = false;
        } else if (this.setIconTintList != -1) {
            setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda03 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda03, setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1), this.setIconTintList, 8);
            if (z2) {
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda12), MenuHostHelper$$ExternalSyntheticLambda03, 0, 5);
            }
        } else if (this.setLineBreakStyle != -1) {
            setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda04 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
            setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda05 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda12);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda04, MenuHostHelper$$ExternalSyntheticLambda05, -this.setLineBreakStyle, 8);
            if (z2) {
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda04, setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda1), 0, 5);
                setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda05, MenuHostHelper$$ExternalSyntheticLambda04, 0, 5);
            }
        } else if (this.setEmptyView != -1.0f) {
            setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda06 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
            setBoxStrokeWidthResource MenuHostHelper$$ExternalSyntheticLambda07 = setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda12);
            float f = this.setEmptyView;
            setShortcut y = setwebcontentsdebuggingenabled.setY();
            y.setY.setY(MenuHostHelper$$ExternalSyntheticLambda06, -1.0f);
            y.setY.setY(MenuHostHelper$$ExternalSyntheticLambda07, f);
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda1(y);
        }
    }

    @Override // o.setVisibility
    public final void MenuHostHelper$$ExternalSyntheticLambda0(boolean z) {
        if (this.RecyclerView$SavedState$1 == null) {
            return;
        }
        setBoxStrokeWidthResource setboxstrokewidthresource = this.setX.setUiOptions;
        int i = setboxstrokewidthresource != null ? (int) (setboxstrokewidthresource.setIconTintList + 0.5f) : 0;
        if (this.setY == 1) {
            setUiOptions(i);
            setLayoutAnimation(0);
            setVisibility setvisibility = this.RecyclerView$SavedState$1;
            setY(setvisibility.setFilterRedundantCalls == 8 ? 0 : setvisibility.setTextScaleX);
            setNavigationOnClickListener(0);
            return;
        }
        setUiOptions(0);
        setLayoutAnimation(i);
        setVisibility setvisibility2 = this.RecyclerView$SavedState$1;
        setNavigationOnClickListener(setvisibility2.setFilterRedundantCalls == 8 ? 0 : setvisibility2.setHint);
        setY(0);
    }
}