package o;

import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class setFabAlignmentModeAndReplaceMenu extends setCompoundDrawablesWithIntrinsicBounds {
    private int minusKey = -1;
    private int GridLayoutManager = -1;
    private int setChipIconEnabledResource = -1;
    private int setCallingWorkSourceUid = -1;
    private int setOnScrollChangeListener = -1;
    private int setCheckedIconEnabledResource = -1;
    private float setEdgeEffectFactory = 0.5f;
    private float setOnSeekBarChangeListener = 0.5f;
    private float setBackgroundTintMode = 0.5f;
    private float RemoteActionCompatParcelizer = 0.5f;
    private float setRowOrderPreserved = 0.5f;
    private float setExpandedTitleTextColor = 0.5f;
    private int setMinEms = 0;
    private int m = 0;
    private int setErrorIconTintList = 2;
    private int setChipTextResource = 2;
    private int setCheckableResource = 0;
    private int setDelayedApplicationOfInitialState = -1;
    private int setCalendarViewShown = 0;
    private ArrayList<setIconTintList> setChipSpacingHorizontal = new ArrayList<>();
    private setVisibility[] setIconTintList = null;
    private setVisibility[] setY = null;
    private int[] setEmptyView = null;
    private int TextInputLayout$SavedState$1 = 0;

    /* loaded from: classes.dex */
    class setIconTintList {
        int MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setForceApplySystemWindowInsetTop, o.setVisibility
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setVisibility setvisibility, HashMap<setVisibility, setVisibility> hashMap) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility, hashMap);
        setFabAlignmentModeAndReplaceMenu setfabalignmentmodeandreplacemenu = (setFabAlignmentModeAndReplaceMenu) setvisibility;
        this.minusKey = setfabalignmentmodeandreplacemenu.minusKey;
        this.GridLayoutManager = setfabalignmentmodeandreplacemenu.GridLayoutManager;
        this.setChipIconEnabledResource = setfabalignmentmodeandreplacemenu.setChipIconEnabledResource;
        this.setCallingWorkSourceUid = setfabalignmentmodeandreplacemenu.setCallingWorkSourceUid;
        this.setOnScrollChangeListener = setfabalignmentmodeandreplacemenu.setOnScrollChangeListener;
        this.setCheckedIconEnabledResource = setfabalignmentmodeandreplacemenu.setCheckedIconEnabledResource;
        this.setEdgeEffectFactory = setfabalignmentmodeandreplacemenu.setEdgeEffectFactory;
        this.setOnSeekBarChangeListener = setfabalignmentmodeandreplacemenu.setOnSeekBarChangeListener;
        this.setBackgroundTintMode = setfabalignmentmodeandreplacemenu.setBackgroundTintMode;
        this.RemoteActionCompatParcelizer = setfabalignmentmodeandreplacemenu.RemoteActionCompatParcelizer;
        this.setRowOrderPreserved = setfabalignmentmodeandreplacemenu.setRowOrderPreserved;
        this.setExpandedTitleTextColor = setfabalignmentmodeandreplacemenu.setExpandedTitleTextColor;
        this.setMinEms = setfabalignmentmodeandreplacemenu.setMinEms;
        this.m = setfabalignmentmodeandreplacemenu.m;
        this.setErrorIconTintList = setfabalignmentmodeandreplacemenu.setErrorIconTintList;
        this.setChipTextResource = setfabalignmentmodeandreplacemenu.setChipTextResource;
        this.setCheckableResource = setfabalignmentmodeandreplacemenu.setCheckableResource;
        this.setDelayedApplicationOfInitialState = setfabalignmentmodeandreplacemenu.setDelayedApplicationOfInitialState;
        this.setCalendarViewShown = setfabalignmentmodeandreplacemenu.setCalendarViewShown;
    }

    @Override // o.setVisibility
    public final void setX(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, boolean z) {
        super.setX(setwebcontentsdebuggingenabled, z);
        if (this.RecyclerView$SavedState$1 != null) {
            boolean z2 = ((setButtonTintBlendMode) this.RecyclerView$SavedState$1).TextInputLayout$SavedState$1;
        }
        int i = this.setCheckableResource;
        if (i != 0) {
            if (i == 1) {
                int size = this.setChipSpacingHorizontal.size();
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = this.setChipSpacingHorizontal.get(i2).MenuHostHelper$$ExternalSyntheticLambda0;
                }
            } else if (i != 2 && i == 3) {
                int size2 = this.setChipSpacingHorizontal.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    int i5 = this.setChipSpacingHorizontal.get(i4).MenuHostHelper$$ExternalSyntheticLambda0;
                }
            }
        } else if (this.setChipSpacingHorizontal.size() > 0) {
            int i6 = this.setChipSpacingHorizontal.get(0).MenuHostHelper$$ExternalSyntheticLambda0;
        }
        ((setCompoundDrawablesWithIntrinsicBounds) this).setX = false;
    }
}