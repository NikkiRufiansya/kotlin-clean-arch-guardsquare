package o;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import o.setExpandedTitleMargin;
import o.setTextLocale;
import o.setVisibility;

/* loaded from: classes.dex */
public class setMIndicatorOptions extends ViewGroup {
    private static setItemOnTouchListener setX;
    public setButtonTintBlendMode ExtendableSavedState$1;
    private ArrayList<setCardBackgroundColor> MenuHostHelper$$ExternalSyntheticLambda0;
    private setEndIconMode MenuHostHelper$$ExternalSyntheticLambda1;
    private int ViewPager$SavedState$1;
    private int setAnimationFromJson;
    private setY setCenterIfNoTextEnabled;
    public AbsSavedState$2 setCheckedIconEnabled;
    private int setChipCornerRadius;
    public boolean setHasDecor;
    private int setIconSize;
    private WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 setIconTintList;
    private int setLayoutAnimation;
    public SparseArray<View> setLayoutDirection;
    private int setMaxEms;
    private int setNavigationOnClickListener;
    private int setOnLongClickListener;
    private int setOnNavigationItemSelectedListener;
    private int setTextAlignment;
    private SparseArray<setVisibility> setTextAppearanceResource;
    private int setTextScaleX;
    private HashMap<String, Integer> setUiOptions;
    private int setUnboundedRipple;
    private int setY;
    private int setZ;
    private static byte[] setMinAndMaxProgress = {45, -61, 23, 105, 21, -2, 22, 5, 2, 3, -46, 61, 20, 7, 14, -7, 17, 14, -62, 29, 52, 7, 14, -7, 27, 4, 6, 23, -43, 55, 8, 4, 5, 2, 6, 27, -3, 14, 7, -29, 45, 0, 17};
    public static final int SearchView$SavedState$1 = 165;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0036). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 6
            int r8 = 103 - r8
            byte[] r0 = o.setMIndicatorOptions.setMinAndMaxProgress
            int r7 = r7 + 4
            int r6 = r6 * 5
            int r6 = 23 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r1
            r4 = 0
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L36
        L19:
            r3 = 0
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L36:
            int r9 = r9 + r6
            int r6 = r9 + (-8)
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMIndicatorOptions.a(short, short, int, java.lang.Object[]):void");
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static setItemOnTouchListener MenuHostHelper$$ExternalSyntheticLambda0() {
        if (setX == null) {
            setX = new setItemOnTouchListener();
        }
        return setX;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.setUiOptions == null) {
                this.setUiOptions = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.setUiOptions.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public final Object setX(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            HashMap<String, Integer> hashMap = this.setUiOptions;
            if (hashMap == null || !hashMap.containsKey(str)) {
                return null;
            }
            return this.setUiOptions.get(str);
        }
        return null;
    }

    public setMIndicatorOptions(Context context) {
        super(context);
        this.setLayoutDirection = new SparseArray<>();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>(4);
        this.ExtendableSavedState$1 = new setButtonTintBlendMode();
        this.setZ = 0;
        this.setTextScaleX = 0;
        this.setIconSize = Integer.MAX_VALUE;
        this.setTextAlignment = Integer.MAX_VALUE;
        this.setHasDecor = true;
        this.setMaxEms = 257;
        this.setIconTintList = null;
        this.setCheckedIconEnabled = null;
        this.setY = -1;
        this.setUiOptions = new HashMap<>();
        this.setUnboundedRipple = -1;
        this.setNavigationOnClickListener = -1;
        this.setChipCornerRadius = -1;
        this.setLayoutAnimation = -1;
        this.ViewPager$SavedState$1 = 0;
        this.setOnLongClickListener = 0;
        this.setTextAppearanceResource = new SparseArray<>();
        this.setCenterIfNoTextEnabled = new setY(this);
        this.setAnimationFromJson = 0;
        this.setOnNavigationItemSelectedListener = 0;
        MenuHostHelper$$ExternalSyntheticLambda0(null, 0);
    }

    public setMIndicatorOptions(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setLayoutDirection = new SparseArray<>();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>(4);
        this.ExtendableSavedState$1 = new setButtonTintBlendMode();
        this.setZ = 0;
        this.setTextScaleX = 0;
        this.setIconSize = Integer.MAX_VALUE;
        this.setTextAlignment = Integer.MAX_VALUE;
        this.setHasDecor = true;
        this.setMaxEms = 257;
        this.setIconTintList = null;
        this.setCheckedIconEnabled = null;
        this.setY = -1;
        this.setUiOptions = new HashMap<>();
        this.setUnboundedRipple = -1;
        this.setNavigationOnClickListener = -1;
        this.setChipCornerRadius = -1;
        this.setLayoutAnimation = -1;
        this.ViewPager$SavedState$1 = 0;
        this.setOnLongClickListener = 0;
        this.setTextAppearanceResource = new SparseArray<>();
        this.setCenterIfNoTextEnabled = new setY(this);
        this.setAnimationFromJson = 0;
        this.setOnNavigationItemSelectedListener = 0;
        MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, 0);
    }

    public setMIndicatorOptions(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.setLayoutDirection = new SparseArray<>();
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>(4);
        this.ExtendableSavedState$1 = new setButtonTintBlendMode();
        this.setZ = 0;
        this.setTextScaleX = 0;
        this.setIconSize = Integer.MAX_VALUE;
        this.setTextAlignment = Integer.MAX_VALUE;
        this.setHasDecor = true;
        this.setMaxEms = 257;
        this.setIconTintList = null;
        this.setCheckedIconEnabled = null;
        this.setY = -1;
        this.setUiOptions = new HashMap<>();
        this.setUnboundedRipple = -1;
        this.setNavigationOnClickListener = -1;
        this.setChipCornerRadius = -1;
        this.setLayoutAnimation = -1;
        this.ViewPager$SavedState$1 = 0;
        this.setOnLongClickListener = 0;
        this.setTextAppearanceResource = new SparseArray<>();
        this.setCenterIfNoTextEnabled = new setY(this);
        this.setAnimationFromJson = 0;
        this.setOnNavigationItemSelectedListener = 0;
        MenuHostHelper$$ExternalSyntheticLambda0(attributeSet, i);
    }

    @Override // android.view.View
    public void setId(int i) {
        this.setLayoutDirection.remove(getId());
        super.setId(i);
        this.setLayoutDirection.put(getId(), this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class setY implements setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 {
        private int MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int setIconTintList;
        private int setLayoutAnimation;
        private int setOnLongClickListener;
        private int setUnboundedRipple;
        private setMIndicatorOptions setX;

        public final void setY(int i, int i2, int i3, int i4, int i5, int i6) {
            this.setUnboundedRipple = i3;
            this.setOnLongClickListener = i4;
            this.setIconTintList = i5;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = i6;
            this.setLayoutAnimation = i;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = i2;
        }

        public setY(setMIndicatorOptions setmindicatoroptions) {
            this.setX = setmindicatoroptions;
        }

        private static boolean setY(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        @Override // o.setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1
        public final void MenuHostHelper$$ExternalSyntheticLambda1() {
            int childCount = this.setX.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.setX.getChildAt(i);
                if (childAt instanceof setCloseIconSizeResource) {
                    setCloseIconSizeResource setcloseiconsizeresource = (setCloseIconSizeResource) childAt;
                    if (setcloseiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                        setIconTintList seticontintlist = (setIconTintList) setcloseiconsizeresource.getLayoutParams();
                        setIconTintList seticontintlist2 = (setIconTintList) setcloseiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1.getLayoutParams();
                        seticontintlist2.setErrorIconTintList.setFilterRedundantCalls = 0;
                        if (seticontintlist.setErrorIconTintList.setHasDecor[0] != setVisibility.setX.FIXED) {
                            setVisibility setvisibility = seticontintlist.setErrorIconTintList;
                            setVisibility setvisibility2 = seticontintlist2.setErrorIconTintList;
                            setvisibility.setNavigationOnClickListener(setvisibility2.setFilterRedundantCalls == 8 ? 0 : setvisibility2.setHint);
                        }
                        if (seticontintlist.setErrorIconTintList.setHasDecor[1] != setVisibility.setX.FIXED) {
                            setVisibility setvisibility3 = seticontintlist.setErrorIconTintList;
                            setVisibility setvisibility4 = seticontintlist2.setErrorIconTintList;
                            setvisibility3.setY(setvisibility4.setFilterRedundantCalls == 8 ? 0 : setvisibility4.setTextScaleX);
                        }
                        seticontintlist2.setErrorIconTintList.setFilterRedundantCalls = 8;
                    }
                }
            }
            int size = this.setX.MenuHostHelper$$ExternalSyntheticLambda0.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    setCardBackgroundColor setcardbackgroundcolor = (setCardBackgroundColor) this.setX.MenuHostHelper$$ExternalSyntheticLambda0.get(i2);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x017b  */
        /* JADX WARN: Removed duplicated region for block: B:161:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x01fe  */
        /* JADX WARN: Removed duplicated region for block: B:174:0x0200  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0205  */
        /* JADX WARN: Removed duplicated region for block: B:178:0x0207  */
        /* JADX WARN: Removed duplicated region for block: B:203:0x0237 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:204:0x0238  */
        @Override // o.setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void setY(o.setVisibility r18, o.setShowingForActionMode.setX r19) {
            /*
                Method dump skipped, instructions count: 820
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMIndicatorOptions.setY.setY(o.setVisibility, o.setShowingForActionMode$setX):void");
        }
    }

    /* renamed from: o.setMIndicatorOptions$1  reason: invalid class name */
    /* loaded from: classes.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[setVisibility.setX.values().length];
            setX = iArr;
            try {
                iArr[setVisibility.setX.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                setX[setVisibility.setX.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                setX[setVisibility.setX.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                setX[setVisibility.setX.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(AttributeSet attributeSet, int i) {
        this.ExtendableSavedState$1.setAnimationFromJson = this;
        setButtonTintBlendMode setbuttontintblendmode = this.ExtendableSavedState$1;
        setY sety = this.setCenterIfNoTextEnabled;
        setbuttontintblendmode.RemoteActionCompatParcelizer = sety;
        setbuttontintblendmode.ActionMenuPresenter$SavedState$1.setY = sety;
        this.setLayoutDirection.put(getId(), this);
        this.setIconTintList = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setX, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == setExpandedTitleMargin.setY.setUiOptions) {
                    this.setZ = obtainStyledAttributes.getDimensionPixelOffset(index, this.setZ);
                } else if (index == setExpandedTitleMargin.setY.MenuHostHelper$$ExternalSyntheticLambda0) {
                    this.setTextScaleX = obtainStyledAttributes.getDimensionPixelOffset(index, this.setTextScaleX);
                } else if (index == setExpandedTitleMargin.setY.MenuHostHelper$$ExternalSyntheticLambda1) {
                    this.setIconSize = obtainStyledAttributes.getDimensionPixelOffset(index, this.setIconSize);
                } else if (index == setExpandedTitleMargin.setY.setY) {
                    this.setTextAlignment = obtainStyledAttributes.getDimensionPixelOffset(index, this.setTextAlignment);
                } else if (index == setExpandedTitleMargin.setY.setEdgeEffectFactory) {
                    this.setMaxEms = obtainStyledAttributes.getInt(index, this.setMaxEms);
                } else if (index == setExpandedTitleMargin.setY.ViewPager$SavedState$1) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            MenuHostHelper$$ExternalSyntheticLambda0(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.setCheckedIconEnabled = null;
                        }
                    }
                } else if (index == setExpandedTitleMargin.setY.setIconSize) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
                        this.setIconTintList = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.setIconTintList = null;
                    }
                    this.setY = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        setButtonTintBlendMode setbuttontintblendmode2 = this.ExtendableSavedState$1;
        setbuttontintblendmode2.setChipIconEnabledResource = this.setMaxEms;
        setWebContentsDebuggingEnabled.MenuHostHelper$$ExternalSyntheticLambda1 = (setbuttontintblendmode2.setChipIconEnabledResource & 512) == 512;
    }

    protected void MenuHostHelper$$ExternalSyntheticLambda0(int i) {
        this.setCheckedIconEnabled = new AbsSavedState$2(getContext(), this, i);
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        setVisibility MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(view);
        if ((view instanceof setAttachListener) && !(MenuHostHelper$$ExternalSyntheticLambda0 instanceof SwipeDismissBehavior)) {
            setIconTintList seticontintlist = (setIconTintList) view.getLayoutParams();
            seticontintlist.setErrorIconTintList = new SwipeDismissBehavior();
            seticontintlist.FloatingActionButton$BaseBehavior = true;
            ((SwipeDismissBehavior) seticontintlist.setErrorIconTintList).setTextAlignment(seticontintlist.setShrinkMotionSpec);
        }
        if (view instanceof setCardBackgroundColor) {
            setCardBackgroundColor setcardbackgroundcolor = (setCardBackgroundColor) view;
            setcardbackgroundcolor.MenuHostHelper$$ExternalSyntheticLambda0();
            ((setIconTintList) view.getLayoutParams()).setObjectValues = true;
            if (!this.MenuHostHelper$$ExternalSyntheticLambda0.contains(setcardbackgroundcolor)) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.add(setcardbackgroundcolor);
            }
        }
        this.setLayoutDirection.put(view.getId(), view);
        this.setHasDecor = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.setLayoutDirection.remove(view.getId());
        setVisibility MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(view);
        ((setQueryHint) this.ExtendableSavedState$1).setRowOrderPreserved.remove(MenuHostHelper$$ExternalSyntheticLambda0);
        MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms();
        this.MenuHostHelper$$ExternalSyntheticLambda0.remove(view);
        this.setHasDecor = true;
    }

    public void setMinWidth(int i) {
        if (i == this.setZ) {
            return;
        }
        this.setZ = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.setTextScaleX) {
            return;
        }
        this.setTextScaleX = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.setIconSize) {
            return;
        }
        this.setIconSize = i;
        requestLayout();
    }

    public void setMaxHeight(int i) {
        if (i == this.setTextAlignment) {
            return;
        }
        this.setTextAlignment = i;
        requestLayout();
    }

    private boolean setLayoutAnimation() {
        boolean z;
        setVisibility setvisibility;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                z = false;
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            boolean isInEditMode = isInEditMode();
            int childCount2 = getChildCount();
            for (int i2 = 0; i2 < childCount2; i2++) {
                setVisibility MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0(getChildAt(i2));
                if (MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                    MenuHostHelper$$ExternalSyntheticLambda0.setMaxEms();
                }
            }
            int i3 = -1;
            if (isInEditMode) {
                for (int i4 = 0; i4 < childCount2; i4++) {
                    View childAt = getChildAt(i4);
                    try {
                        String resourceName = getResources().getResourceName(childAt.getId());
                        setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                        int indexOf = resourceName.indexOf(47);
                        if (indexOf != -1) {
                            resourceName = resourceName.substring(indexOf + 1);
                        }
                        int id = childAt.getId();
                        if (id == 0) {
                            setvisibility = this.ExtendableSavedState$1;
                        } else {
                            View view = this.setLayoutDirection.get(id);
                            if (view == null && (view = findViewById(id)) != null && view != this && view.getParent() == this) {
                                onViewAdded(view);
                            }
                            if (view == this) {
                                setvisibility = this.ExtendableSavedState$1;
                            } else {
                                setvisibility = view == null ? null : ((setIconTintList) view.getLayoutParams()).setErrorIconTintList;
                            }
                        }
                        setvisibility.setOnNavigationItemSelectedListener = resourceName;
                    } catch (Resources.NotFoundException unused) {
                    }
                }
            }
            if (this.setY != -1) {
                int i5 = 0;
                while (i5 < childCount2) {
                    View childAt2 = getChildAt(i5);
                    if (childAt2.getId() == this.setY && (childAt2 instanceof setTextLocale)) {
                        setTextLocale settextlocale = (setTextLocale) childAt2;
                        if (settextlocale.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                            settextlocale.MenuHostHelper$$ExternalSyntheticLambda1 = new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1();
                        }
                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 = settextlocale.MenuHostHelper$$ExternalSyntheticLambda1;
                        int childCount3 = settextlocale.getChildCount();
                        withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.clear();
                        int i6 = 0;
                        while (i6 < childCount3) {
                            View childAt3 = settextlocale.getChildAt(i6);
                            setTextLocale.setIconTintList seticontintlist = (setTextLocale.setIconTintList) childAt3.getLayoutParams();
                            int id2 = childAt3.getId();
                            if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda1 && id2 == i3) {
                                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                            }
                            if (!withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.containsKey(Integer.valueOf(id2))) {
                                withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.put(Integer.valueOf(id2), new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX());
                            }
                            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setY.get(Integer.valueOf(id2));
                            if (setx != null) {
                                if (childAt3 instanceof setCardBackgroundColor) {
                                    setCardBackgroundColor setcardbackgroundcolor = (setCardBackgroundColor) childAt3;
                                    setx.MenuHostHelper$$ExternalSyntheticLambda0(id2, seticontintlist);
                                    if (setcardbackgroundcolor instanceof AndroidExceptionPreHandler) {
                                        setx.setY.setError = 1;
                                        AndroidExceptionPreHandler androidExceptionPreHandler = (AndroidExceptionPreHandler) setcardbackgroundcolor;
                                        setx.setY.setImageTintMode = androidExceptionPreHandler.setY;
                                        setx.setY.setTitleMarginEnd = androidExceptionPreHandler.MenuHostHelper$$ExternalSyntheticLambda1();
                                        setx.setY.setChipIconEnabled = androidExceptionPreHandler.setX.setX;
                                    }
                                }
                                setx.MenuHostHelper$$ExternalSyntheticLambda0(id2, seticontintlist);
                            }
                            i6++;
                            i3 = -1;
                        }
                        this.setIconTintList = settextlocale.MenuHostHelper$$ExternalSyntheticLambda1;
                    }
                    i5++;
                    i3 = -1;
                }
            }
            WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 = this.setIconTintList;
            if (withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12 != null) {
                withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$12.MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
            ((setQueryHint) this.ExtendableSavedState$1).setRowOrderPreserved.clear();
            int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
            if (size > 0) {
                for (int i7 = 0; i7 < size; i7++) {
                    this.MenuHostHelper$$ExternalSyntheticLambda0.get(i7).setX(this);
                }
            }
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt4 = getChildAt(i8);
                if (childAt4 instanceof setCloseIconSizeResource) {
                    setCloseIconSizeResource setcloseiconsizeresource = (setCloseIconSizeResource) childAt4;
                    if (setcloseiconsizeresource.setIconTintList == -1 && !setcloseiconsizeresource.isInEditMode()) {
                        setcloseiconsizeresource.setVisibility(setcloseiconsizeresource.setX);
                    }
                    View findViewById = findViewById(setcloseiconsizeresource.setIconTintList);
                    setcloseiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1 = findViewById;
                    if (findViewById != null) {
                        ((setIconTintList) findViewById.getLayoutParams()).setAdapter = true;
                        setcloseiconsizeresource.MenuHostHelper$$ExternalSyntheticLambda1.setVisibility(0);
                        setcloseiconsizeresource.setVisibility(0);
                    }
                }
            }
            this.setTextAppearanceResource.clear();
            this.setTextAppearanceResource.put(0, this.ExtendableSavedState$1);
            this.setTextAppearanceResource.put(getId(), this.ExtendableSavedState$1);
            for (int i9 = 0; i9 < childCount2; i9++) {
                View childAt5 = getChildAt(i9);
                this.setTextAppearanceResource.put(childAt5.getId(), MenuHostHelper$$ExternalSyntheticLambda0(childAt5));
            }
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt6 = getChildAt(i10);
                setVisibility MenuHostHelper$$ExternalSyntheticLambda02 = MenuHostHelper$$ExternalSyntheticLambda0(childAt6);
                if (MenuHostHelper$$ExternalSyntheticLambda02 != null) {
                    setIconTintList seticontintlist2 = (setIconTintList) childAt6.getLayoutParams();
                    this.ExtendableSavedState$1.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02);
                    MenuHostHelper$$ExternalSyntheticLambda1(isInEditMode, childAt6, MenuHostHelper$$ExternalSyntheticLambda02, seticontintlist2, this.setTextAppearanceResource);
                }
            }
        }
        return z;
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(boolean z, View view, setVisibility setvisibility, setIconTintList seticontintlist, SparseArray<setVisibility> sparseArray) {
        setVisibility setvisibility2;
        setVisibility setvisibility3;
        setVisibility setvisibility4;
        setVisibility setvisibility5;
        seticontintlist.setX();
        seticontintlist.setIconified = false;
        setvisibility.setFilterRedundantCalls = view.getVisibility();
        if (seticontintlist.setAdapter) {
            setvisibility.setUnboundedRipple = true;
            setvisibility.setFilterRedundantCalls = 8;
        }
        setvisibility.setAnimationFromJson = view;
        if (view instanceof setCardBackgroundColor) {
            ((setCardBackgroundColor) view).setX(setvisibility, this.ExtendableSavedState$1.TextInputLayout$SavedState$1);
        }
        if (seticontintlist.FloatingActionButton$BaseBehavior) {
            SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) setvisibility;
            int i = seticontintlist.setHint;
            int i2 = seticontintlist.onActivityResumed;
            float f = seticontintlist.setTooltipText;
            int i3 = (f > (-1.0f) ? 1 : (f == (-1.0f) ? 0 : -1));
            if (i3 != 0) {
                if (i3 > 0) {
                    swipeDismissBehavior.setEmptyView = f;
                    swipeDismissBehavior.setIconTintList = -1;
                    swipeDismissBehavior.setLineBreakStyle = -1;
                    return;
                }
                return;
            } else if (i != -1) {
                if (i >= 0) {
                    swipeDismissBehavior.setEmptyView = -1.0f;
                    swipeDismissBehavior.setIconTintList = i;
                    swipeDismissBehavior.setLineBreakStyle = -1;
                    return;
                }
                return;
            } else if (i2 == -1 || i2 < 0) {
                return;
            } else {
                swipeDismissBehavior.setEmptyView = -1.0f;
                swipeDismissBehavior.setIconTintList = -1;
                swipeDismissBehavior.setLineBreakStyle = i2;
                return;
            }
        }
        int i4 = seticontintlist.Fragment$5;
        int i5 = seticontintlist.createDispatcher;
        int i6 = seticontintlist.setRevealInfo;
        int i7 = seticontintlist.setCloseIconEndPadding;
        int i8 = seticontintlist.setFilterRedundantCalls;
        int i9 = seticontintlist.getCallingPid;
        float f2 = seticontintlist.FabTransformationBehavior;
        if (seticontintlist.setUnboundedRipple != -1) {
            setVisibility setvisibility6 = sparseArray.get(seticontintlist.setUnboundedRipple);
            if (setvisibility6 != null) {
                setvisibility.setX(setvisibility6, seticontintlist.setNavigationOnClickListener, seticontintlist.setUiOptions);
            }
        } else {
            if (i4 != -1) {
                setVisibility setvisibility7 = sparseArray.get(i4);
                if (setvisibility7 != null) {
                    setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility7.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT), ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin, i8, true);
                }
            } else if (i5 != -1 && (setvisibility2 = sparseArray.get(i5)) != null) {
                setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT), ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin, i8, true);
            }
            if (i6 != -1) {
                setVisibility setvisibility8 = sparseArray.get(i6);
                if (setvisibility8 != null) {
                    setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility8.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT), ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin, i9, true);
                }
            } else if (i7 != -1 && (setvisibility3 = sparseArray.get(i7)) != null) {
                setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility3.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT), ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin, i9, true);
            }
            if (seticontintlist.setChipIconEnabledResource != -1) {
                setVisibility setvisibility9 = sparseArray.get(seticontintlist.setChipIconEnabledResource);
                if (setvisibility9 != null) {
                    setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility9.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP), ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin, seticontintlist.SearchView$SavedState$1, true);
                }
            } else if (seticontintlist.ActionMenuPresenter$SavedState$1 != -1 && (setvisibility4 = sparseArray.get(seticontintlist.ActionMenuPresenter$SavedState$1)) != null) {
                setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility4.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM), ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin, seticontintlist.SearchView$SavedState$1, true);
            }
            if (seticontintlist.setLayoutAnimation != -1) {
                setVisibility setvisibility10 = sparseArray.get(seticontintlist.setLayoutAnimation);
                if (setvisibility10 != null) {
                    setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility10.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP), ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin, seticontintlist.setTextAppearanceResource, true);
                }
            } else if (seticontintlist.setX != -1 && (setvisibility5 = sparseArray.get(seticontintlist.setX)) != null) {
                setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility5.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM), ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin, seticontintlist.setTextAppearanceResource, true);
            }
            if (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0 != -1) {
                MenuHostHelper$$ExternalSyntheticLambda0(setvisibility, seticontintlist, sparseArray, seticontintlist.MenuHostHelper$$ExternalSyntheticLambda0, zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE);
            } else if (seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1 != -1) {
                MenuHostHelper$$ExternalSyntheticLambda0(setvisibility, seticontintlist, sparseArray, seticontintlist.MenuHostHelper$$ExternalSyntheticLambda1, zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP);
            } else if (seticontintlist.setY != -1) {
                MenuHostHelper$$ExternalSyntheticLambda0(setvisibility, seticontintlist, sparseArray, seticontintlist.setY, zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM);
            }
            if (f2 >= 0.0f) {
                setvisibility.setGuidelinePercent = f2;
            }
            if (seticontintlist.setChipSpacingHorizontal >= 0.0f) {
                setvisibility.setTitleMarginEnd = seticontintlist.setChipSpacingHorizontal;
            }
        }
        if (z && (seticontintlist.setZ != -1 || seticontintlist.setTextScaleX != -1)) {
            setvisibility.MenuHostHelper$$ExternalSyntheticLambda0(seticontintlist.setZ, seticontintlist.setTextScaleX);
        }
        if (!seticontintlist.FragmentStateAdapter$2) {
            if (((ViewGroup.LayoutParams) seticontintlist).width == -1) {
                if (seticontintlist.setTextAlignment) {
                    setvisibility.setHasDecor[0] = setVisibility.setX.MATCH_CONSTRAINT;
                } else {
                    setvisibility.setHasDecor[0] = setVisibility.setX.MATCH_PARENT;
                }
                setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT).MenuHostHelper$$ExternalSyntheticLambda1 = ((ViewGroup.MarginLayoutParams) seticontintlist).leftMargin;
                setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT).MenuHostHelper$$ExternalSyntheticLambda1 = ((ViewGroup.MarginLayoutParams) seticontintlist).rightMargin;
            } else {
                setvisibility.setHasDecor[0] = setVisibility.setX.MATCH_CONSTRAINT;
                setvisibility.setNavigationOnClickListener(0);
            }
        } else {
            setvisibility.setHasDecor[0] = setVisibility.setX.FIXED;
            setvisibility.setNavigationOnClickListener(((ViewGroup.LayoutParams) seticontintlist).width);
            if (((ViewGroup.LayoutParams) seticontintlist).width == -2) {
                setvisibility.setHasDecor[0] = setVisibility.setX.WRAP_CONTENT;
            }
        }
        if (!seticontintlist.setBackgroundTintMode) {
            if (((ViewGroup.LayoutParams) seticontintlist).height == -1) {
                if (seticontintlist.setOnLongClickListener) {
                    setvisibility.setHasDecor[1] = setVisibility.setX.MATCH_CONSTRAINT;
                } else {
                    setvisibility.setHasDecor[1] = setVisibility.setX.MATCH_PARENT;
                }
                setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP).MenuHostHelper$$ExternalSyntheticLambda1 = ((ViewGroup.MarginLayoutParams) seticontintlist).topMargin;
                setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM).MenuHostHelper$$ExternalSyntheticLambda1 = ((ViewGroup.MarginLayoutParams) seticontintlist).bottomMargin;
            } else {
                setvisibility.setHasDecor[1] = setVisibility.setX.MATCH_CONSTRAINT;
                setvisibility.setY(0);
            }
        } else {
            setvisibility.setHasDecor[1] = setVisibility.setX.FIXED;
            setvisibility.setY(((ViewGroup.LayoutParams) seticontintlist).height);
            if (((ViewGroup.LayoutParams) seticontintlist).height == -2) {
                setvisibility.setHasDecor[1] = setVisibility.setX.WRAP_CONTENT;
            }
        }
        setvisibility.setIconTintList(seticontintlist.setChipCornerRadius);
        setvisibility.setTooltipText[0] = seticontintlist.FragmentStateAdapter$5;
        setvisibility.setTooltipText[1] = seticontintlist.RemoteActionCompatParcelizer;
        setvisibility.setMinAndMaxProgress = seticontintlist.setConstraintSet;
        setvisibility.setError = seticontintlist.TextInputLayout$SavedState$1;
        int i10 = seticontintlist.setMinEms;
        if (i10 >= 0 && i10 <= 3) {
            setvisibility.getCallingPid = i10;
        }
        setvisibility.setIconTintList(seticontintlist.setFloatValues, seticontintlist.setError, seticontintlist.setSelectedChildViewEnabled, seticontintlist.setTitleMarginEnd);
        setvisibility.setY(seticontintlist.setImageTintMode, seticontintlist.RecyclerView$SavedState$1, seticontintlist.setChipIconEnabled, seticontintlist.setChipSpacingVertical);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(setVisibility setvisibility, setIconTintList seticontintlist, SparseArray<setVisibility> sparseArray, int i, zzD$MenuHostHelper$$ExternalSyntheticLambda0 zzd_menuhosthelper__externalsyntheticlambda0) {
        View view = this.setLayoutDirection.get(i);
        setVisibility setvisibility2 = sparseArray.get(i);
        if (setvisibility2 == null || view == null || !(view.getLayoutParams() instanceof setIconTintList)) {
            return;
        }
        seticontintlist.FirebaseRemoteConfigKtxRegistrar = true;
        if (zzd_menuhosthelper__externalsyntheticlambda0 == zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE) {
            setIconTintList seticontintlist2 = (setIconTintList) view.getLayoutParams();
            seticontintlist2.FirebaseRemoteConfigKtxRegistrar = true;
            seticontintlist2.setErrorIconTintList.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        }
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE).MenuHostHelper$$ExternalSyntheticLambda0(setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(zzd_menuhosthelper__externalsyntheticlambda0), seticontintlist.setIconTintList, seticontintlist.setAnimationFromJson, true);
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda0 = true;
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP).MenuHostHelper$$ExternalSyntheticLambda1();
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM).MenuHostHelper$$ExternalSyntheticLambda1();
    }

    public final setVisibility MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        if (view == this) {
            return this.ExtendableSavedState$1;
        }
        if (view != null) {
            if (view.getLayoutParams() instanceof setIconTintList) {
                return ((setIconTintList) view.getLayoutParams()).setErrorIconTintList;
            }
            view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
            if (view.getLayoutParams() instanceof setIconTintList) {
                return ((setIconTintList) view.getLayoutParams()).setErrorIconTintList;
            }
            return null;
        }
        return null;
    }

    public final void setY(setButtonTintBlendMode setbuttontintblendmode, int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i4 = max + max2;
        int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
        this.setCenterIfNoTextEnabled.setY(i2, i3, max, max2, MenuHostHelper$$ExternalSyntheticLambda1, i4);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 > 0 || max4 > 0) {
            if (setIconTintList()) {
                max3 = max4;
            }
        } else {
            max3 = Math.max(0, getPaddingLeft());
        }
        int i5 = size - MenuHostHelper$$ExternalSyntheticLambda1;
        int i6 = size2 - i4;
        MenuHostHelper$$ExternalSyntheticLambda1(setbuttontintblendmode, mode, i5, mode2, i6);
        setbuttontintblendmode.MenuHostHelper$$ExternalSyntheticLambda0(i, mode, i5, mode2, i6, max3, max);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        int i5 = this.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda1;
        int resolveSizeAndState = resolveSizeAndState(i3 + this.setCenterIfNoTextEnabled.setIconTintList, i, 0);
        int resolveSizeAndState2 = resolveSizeAndState(i4 + i5, i2, 0);
        int min = Math.min(this.setIconSize, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.setTextAlignment, resolveSizeAndState2 & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.setUnboundedRipple = min;
        this.setNavigationOnClickListener = min2;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.setAnimationFromJson;
        if (!this.setHasDecor) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.setHasDecor = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.setAnimationFromJson = i;
        this.setOnNavigationItemSelectedListener = i2;
        this.ExtendableSavedState$1.TextInputLayout$SavedState$1 = setIconTintList();
        if (this.setHasDecor) {
            this.setHasDecor = false;
            if (setLayoutAnimation()) {
                setButtonTintBlendMode setbuttontintblendmode = this.ExtendableSavedState$1;
                setbuttontintblendmode.setX.MenuHostHelper$$ExternalSyntheticLambda0(setbuttontintblendmode);
            }
        }
        setY(this.ExtendableSavedState$1, this.setMaxEms, i, i2);
        setButtonTintBlendMode setbuttontintblendmode2 = this.ExtendableSavedState$1;
        int i5 = setbuttontintblendmode2.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode2.setHint;
        setButtonTintBlendMode setbuttontintblendmode3 = this.ExtendableSavedState$1;
        MenuHostHelper$$ExternalSyntheticLambda0(i, i2, i5, setbuttontintblendmode3.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode3.setTextScaleX, this.ExtendableSavedState$1.setCallingWorkSourceUid, this.ExtendableSavedState$1.setLineBreakStyle);
    }

    public final boolean setIconTintList() {
        Context context = getContext();
        try {
            byte b = setMinAndMaxProgress[41];
            byte b2 = (byte) (b - 1);
            Object[] objArr = new Object[1];
            a(b, b2, (byte) (-b2), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((byte) (SearchView$SavedState$1 & 3), setMinAndMaxProgress[4], setMinAndMaxProgress[41], objArr2);
            return ((((ApplicationInfo) cls.getMethod((String) objArr2[0], null).invoke(context, null)).flags & 4194304) != 0) && 1 == getLayoutDirection();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return max2 > 0 ? max2 : max;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0076, code lost:
        if (r13 != (r9.setFilterRedundantCalls == 8 ? 0 : r9.setTextScaleX)) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MenuHostHelper$$ExternalSyntheticLambda1(o.setButtonTintBlendMode r9, int r10, int r11, int r12, int r13) {
        /*
            r8 = this;
            o.setMIndicatorOptions$setY r0 = r8.setCenterIfNoTextEnabled
            int r0 = r0.MenuHostHelper$$ExternalSyntheticLambda1
            o.setMIndicatorOptions$setY r1 = r8.setCenterIfNoTextEnabled
            int r1 = r1.setIconTintList
            o.setVisibility$setX r2 = o.setVisibility.setX.FIXED
            o.setVisibility$setX r3 = o.setVisibility.setX.FIXED
            int r4 = r8.getChildCount()
            r5 = 1073741824(0x40000000, float:2.0)
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r10 == r6) goto L31
            if (r10 == 0) goto L24
            if (r10 == r5) goto L1c
            goto L2f
        L1c:
            int r10 = r8.setIconSize
            int r10 = r10 - r1
            int r11 = java.lang.Math.min(r10, r11)
            goto L3b
        L24:
            o.setVisibility$setX r2 = o.setVisibility.setX.WRAP_CONTENT
            if (r4 != 0) goto L2f
            int r10 = r8.setZ
            int r11 = java.lang.Math.max(r7, r10)
            goto L3b
        L2f:
            r11 = 0
            goto L3b
        L31:
            o.setVisibility$setX r2 = o.setVisibility.setX.WRAP_CONTENT
            if (r4 != 0) goto L3b
            int r10 = r8.setZ
            int r11 = java.lang.Math.max(r7, r10)
        L3b:
            if (r12 == r6) goto L57
            if (r12 == 0) goto L4a
            if (r12 == r5) goto L42
            goto L55
        L42:
            int r10 = r8.setTextAlignment
            int r10 = r10 - r0
            int r13 = java.lang.Math.min(r10, r13)
            goto L61
        L4a:
            o.setVisibility$setX r3 = o.setVisibility.setX.WRAP_CONTENT
            if (r4 != 0) goto L55
            int r10 = r8.setTextScaleX
            int r13 = java.lang.Math.max(r7, r10)
            goto L61
        L55:
            r13 = 0
            goto L61
        L57:
            o.setVisibility$setX r3 = o.setVisibility.setX.WRAP_CONTENT
            if (r4 != 0) goto L61
            int r10 = r8.setTextScaleX
            int r13 = java.lang.Math.max(r7, r10)
        L61:
            int r10 = r9.setFilterRedundantCalls
            r12 = 8
            if (r10 != r12) goto L69
            r10 = 0
            goto L6b
        L69:
            int r10 = r9.setHint
        L6b:
            r4 = 1
            if (r11 != r10) goto L78
            int r10 = r9.setFilterRedundantCalls
            if (r10 != r12) goto L74
            r10 = 0
            goto L76
        L74:
            int r10 = r9.setTextScaleX
        L76:
            if (r13 == r10) goto L7c
        L78:
            o.setThumb r10 = r9.ActionMenuPresenter$SavedState$1
            r10.MenuHostHelper$$ExternalSyntheticLambda1 = r4
        L7c:
            r9.setUiOptions(r7)
            r9.setLayoutAnimation(r7)
            int r10 = r8.setIconSize
            int r10 = r10 - r1
            int[] r12 = r9.setSuffixText
            r12[r7] = r10
            int r10 = r8.setTextAlignment
            int r10 = r10 - r0
            int[] r12 = r9.setSuffixText
            r12[r4] = r10
            r9.setOnLongClickListener(r7)
            r9.setUnboundedRipple(r7)
            o.setVisibility$setX[] r10 = r9.setHasDecor
            r10[r7] = r2
            r9.setNavigationOnClickListener(r11)
            o.setVisibility$setX[] r10 = r9.setHasDecor
            r10[r4] = r3
            r9.setY(r13)
            int r10 = r8.setZ
            int r10 = r10 - r1
            r9.setOnLongClickListener(r10)
            int r10 = r8.setTextScaleX
            int r10 = r10 - r0
            r9.setUnboundedRipple(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setMIndicatorOptions.MenuHostHelper$$ExternalSyntheticLambda1(o.setButtonTintBlendMode, int, int, int, int):void");
    }

    public void setState(int i, int i2, int i3) {
        AbsSavedState$2 absSavedState$2 = this.setCheckedIconEnabled;
        if (absSavedState$2 != null) {
            absSavedState$2.setY(i, i2, i3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        View view;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            setIconTintList seticontintlist = (setIconTintList) childAt.getLayoutParams();
            setVisibility setvisibility = seticontintlist.setErrorIconTintList;
            if (childAt.getVisibility() == 8 && !seticontintlist.FloatingActionButton$BaseBehavior && !seticontintlist.setObjectValues) {
                boolean z2 = seticontintlist.setFilterTouchesWhenObscured;
                i5 = isInEditMode ? 0 : i5 + 1;
            }
            if (!seticontintlist.setAdapter) {
                int centerIfNoTextEnabled = setvisibility.setCenterIfNoTextEnabled();
                int textAlignment = setvisibility.setTextAlignment();
                int i6 = (setvisibility.setFilterRedundantCalls == 8 ? 0 : setvisibility.setHint) + centerIfNoTextEnabled;
                int i7 = (setvisibility.setFilterRedundantCalls == 8 ? 0 : setvisibility.setTextScaleX) + textAlignment;
                childAt.layout(centerIfNoTextEnabled, textAlignment, i6, i7);
                if ((childAt instanceof setCloseIconSizeResource) && (view = ((setCloseIconSizeResource) childAt).MenuHostHelper$$ExternalSyntheticLambda1) != null) {
                    view.setVisibility(0);
                    view.layout(centerIfNoTextEnabled, textAlignment, i6, i7);
                }
            }
        }
        int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
        if (size > 0) {
            for (int i8 = 0; i8 < size; i8++) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.get(i8);
            }
        }
    }

    public void setOptimizationLevel(int i) {
        this.setMaxEms = i;
        setButtonTintBlendMode setbuttontintblendmode = this.ExtendableSavedState$1;
        setbuttontintblendmode.setChipIconEnabledResource = i;
        setWebContentsDebuggingEnabled.MenuHostHelper$$ExternalSyntheticLambda1 = (setbuttontintblendmode.setChipIconEnabledResource & 512) == 512;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static setIconTintList setX() {
        return new setIconTintList(-2, -2);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new setIconTintList(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof setIconTintList;
    }

    public void setConstraintSet(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1) {
        this.setIconTintList = withLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<setCardBackgroundColor> arrayList = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.get(i);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    public void setOnConstraintsChanged(setEndIconMode setendiconmode) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setendiconmode;
        AbsSavedState$2 absSavedState$2 = this.setCheckedIconEnabled;
        if (absSavedState$2 != null) {
            absSavedState$2.setX = setendiconmode;
        }
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends ViewGroup.MarginLayoutParams {
        public int ActionMenuPresenter$SavedState$1;
        public float ExtendableSavedState$1;
        float FabTransformationBehavior;
        boolean FirebaseRemoteConfigKtxRegistrar;
        boolean FloatingActionButton$BaseBehavior;
        int Fragment$5;
        boolean FragmentStateAdapter$2;
        public float FragmentStateAdapter$5;
        public int MenuHostHelper$$ExternalSyntheticLambda0;
        public int MenuHostHelper$$ExternalSyntheticLambda1;
        public int RecyclerView$SavedState$1;
        public float RemoteActionCompatParcelizer;
        public int SearchView$SavedState$1;
        public int TextInputLayout$SavedState$1;
        public String ViewPager$SavedState$1;
        int createDispatcher;
        int getCallingPid;
        private boolean minusKey;
        int onActivityResumed;
        boolean setAdapter;
        public int setAnimationFromJson;
        boolean setBackgroundTintMode;
        private boolean setCallingWorkSourceUid;
        int setCenterIfNoTextEnabled;
        public int setCheckedIconEnabled;
        public String setChipCornerRadius;
        public int setChipIconEnabled;
        public int setChipIconEnabledResource;
        public int setChipIconTintResource;
        public float setChipSpacingHorizontal;
        public float setChipSpacingVertical;
        int setCloseIconEndPadding;
        public int setConstraintSet;
        public float setContentScrimResource;
        private boolean setEdgeEffectFactory;
        public int setEmptyView;
        public int setError;
        setVisibility setErrorIconTintList;
        int setFilterRedundantCalls;
        boolean setFilterTouchesWhenObscured;
        public int setFloatValues;
        public int setGuidelinePercent;
        public int setHasDecor;
        int setHint;
        float setIconSize;
        public int setIconTintList;
        public boolean setIconified;
        public int setImageTintMode;
        public int setLayoutAnimation;
        public int setLayoutDirection;
        public int setLineBreakStyle;
        public int setMaxEms;
        public int setMinAndMaxProgress;
        public int setMinEms;
        public int setNavigationIconTint;
        public float setNavigationOnClickListener;
        boolean setObjectValues;
        public boolean setOnLongClickListener;
        public int setOnNavigationItemSelectedListener;
        int setRevealInfo;
        public int setSelectedChildViewEnabled;
        public int setShrinkMotionSpec;
        public int setSubmitButtonEnabled;
        public int setSuffixText;
        public boolean setTextAlignment;
        public int setTextAppearanceResource;
        public int setTextScaleX;
        public float setTitleMarginEnd;
        float setTooltipText;
        public int setUiOptions;
        public int setUnboundedRipple;
        public int setViewTranslationCallback;
        public int setX;
        public int setY;
        public int setZ;

        /* loaded from: classes.dex */
        static class setY {
            public static final SparseIntArray MenuHostHelper$$ExternalSyntheticLambda0;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                MenuHostHelper$$ExternalSyntheticLambda0 = sparseIntArray;
                sparseIntArray.append(setExpandedTitleMargin.setY.FabTransformationBehavior, 64);
                sparseIntArray.append(setExpandedTitleMargin.setY.FloatingActionButton$BaseBehavior, 65);
                sparseIntArray.append(setExpandedTitleMargin.setY.setFloatValues, 8);
                sparseIntArray.append(setExpandedTitleMargin.setY.setChipIconEnabled, 9);
                sparseIntArray.append(setExpandedTitleMargin.setY.FirebaseRemoteConfigKtxRegistrar, 10);
                sparseIntArray.append(setExpandedTitleMargin.setY.setChipSpacingVertical, 11);
                sparseIntArray.append(setExpandedTitleMargin.setY.setFilterRedundantCalls, 12);
                sparseIntArray.append(setExpandedTitleMargin.setY.setTooltipText, 13);
                sparseIntArray.append(setExpandedTitleMargin.setY.setMinAndMaxProgress, 14);
                sparseIntArray.append(setExpandedTitleMargin.setY.setLayoutDirection, 15);
                sparseIntArray.append(setExpandedTitleMargin.setY.setAnimationFromJson, 16);
                sparseIntArray.append(setExpandedTitleMargin.setY.setCheckedIconEnabled, 52);
                sparseIntArray.append(setExpandedTitleMargin.setY.setTextScaleX, 53);
                sparseIntArray.append(setExpandedTitleMargin.setY.setTextAppearanceResource, 2);
                sparseIntArray.append(setExpandedTitleMargin.setY.setHasDecor, 3);
                sparseIntArray.append(setExpandedTitleMargin.setY.setChipIconTintResource, 4);
                sparseIntArray.append(setExpandedTitleMargin.setY.setEmptyView, 49);
                sparseIntArray.append(setExpandedTitleMargin.setY.ActionMenuPresenter$SavedState$1, 50);
                sparseIntArray.append(setExpandedTitleMargin.setY.setConstraintSet, 5);
                sparseIntArray.append(setExpandedTitleMargin.setY.setContentScrimResource, 6);
                sparseIntArray.append(setExpandedTitleMargin.setY.FragmentStateAdapter$5, 7);
                sparseIntArray.append(setExpandedTitleMargin.setY.setTextAlignment, 67);
                sparseIntArray.append(setExpandedTitleMargin.setY.setNavigationOnClickListener, 1);
                sparseIntArray.append(setExpandedTitleMargin.setY.setShrinkMotionSpec, 17);
                sparseIntArray.append(setExpandedTitleMargin.setY.setError, 18);
                sparseIntArray.append(setExpandedTitleMargin.setY.SearchView$SavedState$1, 19);
                sparseIntArray.append(setExpandedTitleMargin.setY.setIconified, 20);
                sparseIntArray.append(setExpandedTitleMargin.setY.setBackgroundTintMode, 21);
                sparseIntArray.append(setExpandedTitleMargin.setY.setChipIconEnabledResource, 22);
                sparseIntArray.append(setExpandedTitleMargin.setY.RemoteActionCompatParcelizer, 23);
                sparseIntArray.append(setExpandedTitleMargin.setY.setNavigationIconTint, 24);
                sparseIntArray.append(setExpandedTitleMargin.setY.TextInputLayout$SavedState$1, 25);
                sparseIntArray.append(setExpandedTitleMargin.setY.setChipSpacingHorizontal, 26);
                sparseIntArray.append(setExpandedTitleMargin.setY.setLineBreakStyle, 55);
                sparseIntArray.append(setExpandedTitleMargin.setY.minusKey, 54);
                sparseIntArray.append(setExpandedTitleMargin.setY.setViewTranslationCallback, 29);
                sparseIntArray.append(setExpandedTitleMargin.setY.getCallingPid, 30);
                sparseIntArray.append(setExpandedTitleMargin.setY.ExtendableSavedState$1, 44);
                sparseIntArray.append(setExpandedTitleMargin.setY.RecyclerView$SavedState$1, 45);
                sparseIntArray.append(setExpandedTitleMargin.setY.setRevealInfo, 46);
                sparseIntArray.append(setExpandedTitleMargin.setY.setAdapter, 47);
                sparseIntArray.append(setExpandedTitleMargin.setY.onActivityResumed, 48);
                sparseIntArray.append(setExpandedTitleMargin.setY.setMaxEms, 27);
                sparseIntArray.append(setExpandedTitleMargin.setY.setZ, 28);
                sparseIntArray.append(setExpandedTitleMargin.setY.setCloseIconEndPadding, 31);
                sparseIntArray.append(setExpandedTitleMargin.setY.FragmentStateAdapter$2, 32);
                sparseIntArray.append(setExpandedTitleMargin.setY.Fragment$5, 33);
                sparseIntArray.append(setExpandedTitleMargin.setY.createDispatcher, 34);
                sparseIntArray.append(setExpandedTitleMargin.setY.setSubmitButtonEnabled, 35);
                sparseIntArray.append(setExpandedTitleMargin.setY.setObjectValues, 36);
                sparseIntArray.append(setExpandedTitleMargin.setY.setFilterTouchesWhenObscured, 37);
                sparseIntArray.append(setExpandedTitleMargin.setY.setSuffixText, 38);
                sparseIntArray.append(setExpandedTitleMargin.setY.setSelectedChildViewEnabled, 39);
                sparseIntArray.append(setExpandedTitleMargin.setY.setHint, 40);
                sparseIntArray.append(setExpandedTitleMargin.setY.setImageTintMode, 41);
                sparseIntArray.append(setExpandedTitleMargin.setY.setGuidelinePercent, 42);
                sparseIntArray.append(setExpandedTitleMargin.setY.setOnNavigationItemSelectedListener, 43);
                sparseIntArray.append(setExpandedTitleMargin.setY.setTitleMarginEnd, 51);
                sparseIntArray.append(setExpandedTitleMargin.setY.setMinEms, 66);
            }
        }

        public setIconTintList(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.setChipIconTintResource = -1;
            this.setHasDecor = -1;
            this.ExtendableSavedState$1 = -1.0f;
            this.setEdgeEffectFactory = true;
            this.setSuffixText = -1;
            this.setViewTranslationCallback = -1;
            this.setEmptyView = -1;
            this.setSubmitButtonEnabled = -1;
            this.setChipIconEnabledResource = -1;
            this.ActionMenuPresenter$SavedState$1 = -1;
            this.setLayoutAnimation = -1;
            this.setX = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
            this.setY = -1;
            this.setUnboundedRipple = -1;
            this.setUiOptions = 0;
            this.setNavigationOnClickListener = 0.0f;
            this.setLineBreakStyle = -1;
            this.setNavigationIconTint = -1;
            this.setMaxEms = -1;
            this.setOnNavigationItemSelectedListener = -1;
            this.setCheckedIconEnabled = Integer.MIN_VALUE;
            this.SearchView$SavedState$1 = Integer.MIN_VALUE;
            this.setLayoutDirection = Integer.MIN_VALUE;
            this.setTextAppearanceResource = Integer.MIN_VALUE;
            this.setMinAndMaxProgress = Integer.MIN_VALUE;
            this.setGuidelinePercent = Integer.MIN_VALUE;
            this.setAnimationFromJson = Integer.MIN_VALUE;
            this.setIconTintList = 0;
            this.setCallingWorkSourceUid = true;
            this.minusKey = true;
            this.setContentScrimResource = 0.5f;
            this.setChipSpacingHorizontal = 0.5f;
            this.setChipCornerRadius = null;
            this.setIconSize = 0.0f;
            this.setCenterIfNoTextEnabled = 1;
            this.FragmentStateAdapter$5 = -1.0f;
            this.RemoteActionCompatParcelizer = -1.0f;
            this.setConstraintSet = 0;
            this.TextInputLayout$SavedState$1 = 0;
            this.setFloatValues = 0;
            this.setImageTintMode = 0;
            this.setError = 0;
            this.RecyclerView$SavedState$1 = 0;
            this.setSelectedChildViewEnabled = 0;
            this.setChipIconEnabled = 0;
            this.setTitleMarginEnd = 1.0f;
            this.setChipSpacingVertical = 1.0f;
            this.setZ = -1;
            this.setTextScaleX = -1;
            this.setShrinkMotionSpec = -1;
            this.setTextAlignment = false;
            this.setOnLongClickListener = false;
            this.ViewPager$SavedState$1 = null;
            this.setMinEms = 0;
            this.FragmentStateAdapter$2 = true;
            this.setBackgroundTintMode = true;
            this.FirebaseRemoteConfigKtxRegistrar = false;
            this.FloatingActionButton$BaseBehavior = false;
            this.setObjectValues = false;
            this.setAdapter = false;
            this.setFilterTouchesWhenObscured = false;
            this.Fragment$5 = -1;
            this.createDispatcher = -1;
            this.setRevealInfo = -1;
            this.setCloseIconEndPadding = -1;
            this.setFilterRedundantCalls = Integer.MIN_VALUE;
            this.getCallingPid = Integer.MIN_VALUE;
            this.FabTransformationBehavior = 0.5f;
            this.setErrorIconTintList = new setVisibility();
            this.setIconified = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setX);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = setY.MenuHostHelper$$ExternalSyntheticLambda0.get(index);
                switch (i2) {
                    case 1:
                        this.setShrinkMotionSpec = obtainStyledAttributes.getInt(index, this.setShrinkMotionSpec);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.setUnboundedRipple);
                        this.setUnboundedRipple = resourceId;
                        if (resourceId == -1) {
                            this.setUnboundedRipple = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        this.setUiOptions = obtainStyledAttributes.getDimensionPixelSize(index, this.setUiOptions);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.setNavigationOnClickListener) % 360.0f;
                        this.setNavigationOnClickListener = f;
                        if (f < 0.0f) {
                            this.setNavigationOnClickListener = (360.0f - f) % 360.0f;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        this.setChipIconTintResource = obtainStyledAttributes.getDimensionPixelOffset(index, this.setChipIconTintResource);
                        break;
                    case 6:
                        this.setHasDecor = obtainStyledAttributes.getDimensionPixelOffset(index, this.setHasDecor);
                        break;
                    case 7:
                        this.ExtendableSavedState$1 = obtainStyledAttributes.getFloat(index, this.ExtendableSavedState$1);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.setSuffixText);
                        this.setSuffixText = resourceId2;
                        if (resourceId2 == -1) {
                            this.setSuffixText = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.setViewTranslationCallback);
                        this.setViewTranslationCallback = resourceId3;
                        if (resourceId3 == -1) {
                            this.setViewTranslationCallback = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.setEmptyView);
                        this.setEmptyView = resourceId4;
                        if (resourceId4 == -1) {
                            this.setEmptyView = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.setSubmitButtonEnabled);
                        this.setSubmitButtonEnabled = resourceId5;
                        if (resourceId5 == -1) {
                            this.setSubmitButtonEnabled = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.setChipIconEnabledResource);
                        this.setChipIconEnabledResource = resourceId6;
                        if (resourceId6 == -1) {
                            this.setChipIconEnabledResource = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.ActionMenuPresenter$SavedState$1);
                        this.ActionMenuPresenter$SavedState$1 = resourceId7;
                        if (resourceId7 == -1) {
                            this.ActionMenuPresenter$SavedState$1 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.setLayoutAnimation);
                        this.setLayoutAnimation = resourceId8;
                        if (resourceId8 == -1) {
                            this.setLayoutAnimation = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.setX);
                        this.setX = resourceId9;
                        if (resourceId9 == -1) {
                            this.setX = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.MenuHostHelper$$ExternalSyntheticLambda0);
                        this.MenuHostHelper$$ExternalSyntheticLambda0 = resourceId10;
                        if (resourceId10 == -1) {
                            this.MenuHostHelper$$ExternalSyntheticLambda0 = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.setLineBreakStyle);
                        this.setLineBreakStyle = resourceId11;
                        if (resourceId11 == -1) {
                            this.setLineBreakStyle = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.setNavigationIconTint);
                        this.setNavigationIconTint = resourceId12;
                        if (resourceId12 == -1) {
                            this.setNavigationIconTint = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.setMaxEms);
                        this.setMaxEms = resourceId13;
                        if (resourceId13 == -1) {
                            this.setMaxEms = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.setOnNavigationItemSelectedListener);
                        this.setOnNavigationItemSelectedListener = resourceId14;
                        if (resourceId14 == -1) {
                            this.setOnNavigationItemSelectedListener = obtainStyledAttributes.getInt(index, -1);
                            break;
                        } else {
                            break;
                        }
                    case 21:
                        this.setCheckedIconEnabled = obtainStyledAttributes.getDimensionPixelSize(index, this.setCheckedIconEnabled);
                        break;
                    case 22:
                        this.SearchView$SavedState$1 = obtainStyledAttributes.getDimensionPixelSize(index, this.SearchView$SavedState$1);
                        break;
                    case 23:
                        this.setLayoutDirection = obtainStyledAttributes.getDimensionPixelSize(index, this.setLayoutDirection);
                        break;
                    case 24:
                        this.setTextAppearanceResource = obtainStyledAttributes.getDimensionPixelSize(index, this.setTextAppearanceResource);
                        break;
                    case 25:
                        this.setMinAndMaxProgress = obtainStyledAttributes.getDimensionPixelSize(index, this.setMinAndMaxProgress);
                        break;
                    case 26:
                        this.setGuidelinePercent = obtainStyledAttributes.getDimensionPixelSize(index, this.setGuidelinePercent);
                        break;
                    case 27:
                        this.setTextAlignment = obtainStyledAttributes.getBoolean(index, this.setTextAlignment);
                        break;
                    case 28:
                        this.setOnLongClickListener = obtainStyledAttributes.getBoolean(index, this.setOnLongClickListener);
                        break;
                    case 29:
                        this.setContentScrimResource = obtainStyledAttributes.getFloat(index, this.setContentScrimResource);
                        break;
                    case 30:
                        this.setChipSpacingHorizontal = obtainStyledAttributes.getFloat(index, this.setChipSpacingHorizontal);
                        break;
                    case 31:
                        int i3 = obtainStyledAttributes.getInt(index, 0);
                        this.setFloatValues = i3;
                        if (i3 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 32:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.setImageTintMode = i4;
                        if (i4 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        } else {
                            break;
                        }
                    case 33:
                        try {
                            this.setError = obtainStyledAttributes.getDimensionPixelSize(index, this.setError);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.setError) == -2) {
                                this.setError = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.setSelectedChildViewEnabled = obtainStyledAttributes.getDimensionPixelSize(index, this.setSelectedChildViewEnabled);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.setSelectedChildViewEnabled) == -2) {
                                this.setSelectedChildViewEnabled = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 35:
                        this.setTitleMarginEnd = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.setTitleMarginEnd));
                        this.setFloatValues = 2;
                        break;
                    case setExpandedTitleMargin.setY.setChipCornerRadius /* 36 */:
                        try {
                            this.RecyclerView$SavedState$1 = obtainStyledAttributes.getDimensionPixelSize(index, this.RecyclerView$SavedState$1);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.RecyclerView$SavedState$1) == -2) {
                                this.RecyclerView$SavedState$1 = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.setChipIconEnabled = obtainStyledAttributes.getDimensionPixelSize(index, this.setChipIconEnabled);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.setChipIconEnabled) == -2) {
                                this.setChipIconEnabled = -2;
                                break;
                            } else {
                                break;
                            }
                        }
                    case setExpandedTitleMargin.setY.setSupportCheckMarkTintList /* 38 */:
                        this.setChipSpacingVertical = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.setChipSpacingVertical));
                        this.setImageTintMode = 2;
                        break;
                    default:
                        switch (i2) {
                            case setExpandedTitleMargin.setY.setRecyclerListener /* 44 */:
                                WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0(this, obtainStyledAttributes.getString(index));
                                continue;
                            case setExpandedTitleMargin.setY.setPreferKeepClearRects /* 45 */:
                                this.FragmentStateAdapter$5 = obtainStyledAttributes.getFloat(index, this.FragmentStateAdapter$5);
                                continue;
                            case setExpandedTitleMargin.setY.setInterpolator /* 46 */:
                                this.RemoteActionCompatParcelizer = obtainStyledAttributes.getFloat(index, this.RemoteActionCompatParcelizer);
                                continue;
                            case setExpandedTitleMargin.setY.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 /* 47 */:
                                this.setConstraintSet = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case setExpandedTitleMargin.setY.ParcelableSparseArray$1 /* 48 */:
                                this.TextInputLayout$SavedState$1 = obtainStyledAttributes.getInt(index, 0);
                                continue;
                            case setExpandedTitleMargin.setY.setAutoLinkMask /* 49 */:
                                this.setZ = obtainStyledAttributes.getDimensionPixelOffset(index, this.setZ);
                                continue;
                            case setExpandedTitleMargin.setY.setOrientation /* 50 */:
                                this.setTextScaleX = obtainStyledAttributes.getDimensionPixelOffset(index, this.setTextScaleX);
                                continue;
                            case 51:
                                this.ViewPager$SavedState$1 = obtainStyledAttributes.getString(index);
                                continue;
                            case setExpandedTitleMargin.setY.setSupportCompoundDrawablesTintList /* 52 */:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.MenuHostHelper$$ExternalSyntheticLambda1);
                                this.MenuHostHelper$$ExternalSyntheticLambda1 = resourceId15;
                                if (resourceId15 == -1) {
                                    this.MenuHostHelper$$ExternalSyntheticLambda1 = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case setExpandedTitleMargin.setY.setScrollingCacheEnabled /* 53 */:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.setY);
                                this.setY = resourceId16;
                                if (resourceId16 == -1) {
                                    this.setY = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                } else {
                                    continue;
                                }
                            case 54:
                                this.setIconTintList = obtainStyledAttributes.getDimensionPixelSize(index, this.setIconTintList);
                                continue;
                            case 55:
                                this.setAnimationFromJson = obtainStyledAttributes.getDimensionPixelSize(index, this.setAnimationFromJson);
                                continue;
                            default:
                                switch (i2) {
                                    case 64:
                                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0(this, obtainStyledAttributes, index, 0);
                                        this.setCallingWorkSourceUid = true;
                                        continue;
                                        continue;
                                    case 65:
                                        WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.MenuHostHelper$$ExternalSyntheticLambda0(this, obtainStyledAttributes, index, 1);
                                        this.minusKey = true;
                                        continue;
                                    case 66:
                                        this.setMinEms = obtainStyledAttributes.getInt(index, this.setMinEms);
                                        continue;
                                    case 67:
                                        this.setEdgeEffectFactory = obtainStyledAttributes.getBoolean(index, this.setEdgeEffectFactory);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            setX();
        }

        public final void setX() {
            this.FloatingActionButton$BaseBehavior = false;
            this.FragmentStateAdapter$2 = true;
            this.setBackgroundTintMode = true;
            if (((ViewGroup.LayoutParams) this).width == -2 && this.setTextAlignment) {
                this.FragmentStateAdapter$2 = false;
                if (this.setFloatValues == 0) {
                    this.setFloatValues = 1;
                }
            }
            if (((ViewGroup.LayoutParams) this).height == -2 && this.setOnLongClickListener) {
                this.setBackgroundTintMode = false;
                if (this.setImageTintMode == 0) {
                    this.setImageTintMode = 1;
                }
            }
            if (((ViewGroup.LayoutParams) this).width == 0 || ((ViewGroup.LayoutParams) this).width == -1) {
                this.FragmentStateAdapter$2 = false;
                if (((ViewGroup.LayoutParams) this).width == 0 && this.setFloatValues == 1) {
                    ((ViewGroup.LayoutParams) this).width = -2;
                    this.setTextAlignment = true;
                }
            }
            if (((ViewGroup.LayoutParams) this).height == 0 || ((ViewGroup.LayoutParams) this).height == -1) {
                this.setBackgroundTintMode = false;
                if (((ViewGroup.LayoutParams) this).height == 0 && this.setImageTintMode == 1) {
                    ((ViewGroup.LayoutParams) this).height = -2;
                    this.setOnLongClickListener = true;
                }
            }
            if (this.ExtendableSavedState$1 == -1.0f && this.setChipIconTintResource == -1 && this.setHasDecor == -1) {
                return;
            }
            this.FloatingActionButton$BaseBehavior = true;
            this.FragmentStateAdapter$2 = true;
            this.setBackgroundTintMode = true;
            if (!(this.setErrorIconTintList instanceof SwipeDismissBehavior)) {
                this.setErrorIconTintList = new SwipeDismissBehavior();
            }
            ((SwipeDismissBehavior) this.setErrorIconTintList).setTextAlignment(this.setShrinkMotionSpec);
        }

        public setIconTintList(int i, int i2) {
            super(-2, -2);
            this.setChipIconTintResource = -1;
            this.setHasDecor = -1;
            this.ExtendableSavedState$1 = -1.0f;
            this.setEdgeEffectFactory = true;
            this.setSuffixText = -1;
            this.setViewTranslationCallback = -1;
            this.setEmptyView = -1;
            this.setSubmitButtonEnabled = -1;
            this.setChipIconEnabledResource = -1;
            this.ActionMenuPresenter$SavedState$1 = -1;
            this.setLayoutAnimation = -1;
            this.setX = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
            this.setY = -1;
            this.setUnboundedRipple = -1;
            this.setUiOptions = 0;
            this.setNavigationOnClickListener = 0.0f;
            this.setLineBreakStyle = -1;
            this.setNavigationIconTint = -1;
            this.setMaxEms = -1;
            this.setOnNavigationItemSelectedListener = -1;
            this.setCheckedIconEnabled = Integer.MIN_VALUE;
            this.SearchView$SavedState$1 = Integer.MIN_VALUE;
            this.setLayoutDirection = Integer.MIN_VALUE;
            this.setTextAppearanceResource = Integer.MIN_VALUE;
            this.setMinAndMaxProgress = Integer.MIN_VALUE;
            this.setGuidelinePercent = Integer.MIN_VALUE;
            this.setAnimationFromJson = Integer.MIN_VALUE;
            this.setIconTintList = 0;
            this.setCallingWorkSourceUid = true;
            this.minusKey = true;
            this.setContentScrimResource = 0.5f;
            this.setChipSpacingHorizontal = 0.5f;
            this.setChipCornerRadius = null;
            this.setIconSize = 0.0f;
            this.setCenterIfNoTextEnabled = 1;
            this.FragmentStateAdapter$5 = -1.0f;
            this.RemoteActionCompatParcelizer = -1.0f;
            this.setConstraintSet = 0;
            this.TextInputLayout$SavedState$1 = 0;
            this.setFloatValues = 0;
            this.setImageTintMode = 0;
            this.setError = 0;
            this.RecyclerView$SavedState$1 = 0;
            this.setSelectedChildViewEnabled = 0;
            this.setChipIconEnabled = 0;
            this.setTitleMarginEnd = 1.0f;
            this.setChipSpacingVertical = 1.0f;
            this.setZ = -1;
            this.setTextScaleX = -1;
            this.setShrinkMotionSpec = -1;
            this.setTextAlignment = false;
            this.setOnLongClickListener = false;
            this.ViewPager$SavedState$1 = null;
            this.setMinEms = 0;
            this.FragmentStateAdapter$2 = true;
            this.setBackgroundTintMode = true;
            this.FirebaseRemoteConfigKtxRegistrar = false;
            this.FloatingActionButton$BaseBehavior = false;
            this.setObjectValues = false;
            this.setAdapter = false;
            this.setFilterTouchesWhenObscured = false;
            this.Fragment$5 = -1;
            this.createDispatcher = -1;
            this.setRevealInfo = -1;
            this.setCloseIconEndPadding = -1;
            this.setFilterRedundantCalls = Integer.MIN_VALUE;
            this.getCallingPid = Integer.MIN_VALUE;
            this.FabTransformationBehavior = 0.5f;
            this.setErrorIconTintList = new setVisibility();
            this.setIconified = false;
        }

        public setIconTintList(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.setChipIconTintResource = -1;
            this.setHasDecor = -1;
            this.ExtendableSavedState$1 = -1.0f;
            this.setEdgeEffectFactory = true;
            this.setSuffixText = -1;
            this.setViewTranslationCallback = -1;
            this.setEmptyView = -1;
            this.setSubmitButtonEnabled = -1;
            this.setChipIconEnabledResource = -1;
            this.ActionMenuPresenter$SavedState$1 = -1;
            this.setLayoutAnimation = -1;
            this.setX = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = -1;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = -1;
            this.setY = -1;
            this.setUnboundedRipple = -1;
            this.setUiOptions = 0;
            this.setNavigationOnClickListener = 0.0f;
            this.setLineBreakStyle = -1;
            this.setNavigationIconTint = -1;
            this.setMaxEms = -1;
            this.setOnNavigationItemSelectedListener = -1;
            this.setCheckedIconEnabled = Integer.MIN_VALUE;
            this.SearchView$SavedState$1 = Integer.MIN_VALUE;
            this.setLayoutDirection = Integer.MIN_VALUE;
            this.setTextAppearanceResource = Integer.MIN_VALUE;
            this.setMinAndMaxProgress = Integer.MIN_VALUE;
            this.setGuidelinePercent = Integer.MIN_VALUE;
            this.setAnimationFromJson = Integer.MIN_VALUE;
            this.setIconTintList = 0;
            this.setCallingWorkSourceUid = true;
            this.minusKey = true;
            this.setContentScrimResource = 0.5f;
            this.setChipSpacingHorizontal = 0.5f;
            this.setChipCornerRadius = null;
            this.setIconSize = 0.0f;
            this.setCenterIfNoTextEnabled = 1;
            this.FragmentStateAdapter$5 = -1.0f;
            this.RemoteActionCompatParcelizer = -1.0f;
            this.setConstraintSet = 0;
            this.TextInputLayout$SavedState$1 = 0;
            this.setFloatValues = 0;
            this.setImageTintMode = 0;
            this.setError = 0;
            this.RecyclerView$SavedState$1 = 0;
            this.setSelectedChildViewEnabled = 0;
            this.setChipIconEnabled = 0;
            this.setTitleMarginEnd = 1.0f;
            this.setChipSpacingVertical = 1.0f;
            this.setZ = -1;
            this.setTextScaleX = -1;
            this.setShrinkMotionSpec = -1;
            this.setTextAlignment = false;
            this.setOnLongClickListener = false;
            this.ViewPager$SavedState$1 = null;
            this.setMinEms = 0;
            this.FragmentStateAdapter$2 = true;
            this.setBackgroundTintMode = true;
            this.FirebaseRemoteConfigKtxRegistrar = false;
            this.FloatingActionButton$BaseBehavior = false;
            this.setObjectValues = false;
            this.setAdapter = false;
            this.setFilterTouchesWhenObscured = false;
            this.Fragment$5 = -1;
            this.createDispatcher = -1;
            this.setRevealInfo = -1;
            this.setCloseIconEndPadding = -1;
            this.setFilterRedundantCalls = Integer.MIN_VALUE;
            this.getCallingPid = Integer.MIN_VALUE;
            this.FabTransformationBehavior = 0.5f;
            this.setErrorIconTintList = new setVisibility();
            this.setIconified = false;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0081  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void resolveLayoutDirection(int r11) {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.setMIndicatorOptions.setIconTintList.resolveLayoutDirection(int):void");
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        setY();
        super.requestLayout();
    }

    @Override // android.view.View
    public void forceLayout() {
        setY();
        super.forceLayout();
    }

    private void setY() {
        this.setHasDecor = true;
        this.setUnboundedRipple = -1;
        this.setNavigationOnClickListener = -1;
        this.setChipCornerRadius = -1;
        this.setLayoutAnimation = -1;
        this.ViewPager$SavedState$1 = 0;
        this.setOnLongClickListener = 0;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new setIconTintList(-2, -2);
    }

    @Override // android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setIconTintList(getContext(), attributeSet);
    }
}