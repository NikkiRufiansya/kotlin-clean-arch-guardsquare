package o;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import o.setShowingForActionMode;
import o.setVisibility;

/* loaded from: classes.dex */
public final class setThumb {
    public setButtonTintBlendMode setIconTintList;
    public setButtonTintBlendMode setX;
    public boolean MenuHostHelper$$ExternalSyntheticLambda0 = true;
    public boolean MenuHostHelper$$ExternalSyntheticLambda1 = true;
    public ArrayList<setSupportButtonTintList> setUiOptions = new ArrayList<>();
    private ArrayList<setFreezesText> setOnLongClickListener = new ArrayList<>();
    public setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setY = null;
    private setShowingForActionMode.setX setLayoutAnimation = new setShowingForActionMode.setX();
    private ArrayList<setFreezesText> setUnboundedRipple = new ArrayList<>();

    public setThumb(setButtonTintBlendMode setbuttontintblendmode) {
        this.setIconTintList = setbuttontintblendmode;
        this.setX = setbuttontintblendmode;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0(setButtonTintBlendMode setbuttontintblendmode, int i) {
        int size = this.setUnboundedRipple.size();
        long j = 0;
        for (int i2 = 0; i2 < size; i2++) {
            j = Math.max(j, this.setUnboundedRipple.get(i2).setX(setbuttontintblendmode, i));
        }
        return (int) j;
    }

    private void setIconTintList(setVisibility setvisibility, setVisibility.setX setx, int i, setVisibility.setX setx2, int i2) {
        this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda1 = setx;
        this.setLayoutAnimation.setOnLongClickListener = setx2;
        this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0 = i;
        this.setLayoutAnimation.setLayoutAnimation = i2;
        this.setY.setY(setvisibility, this.setLayoutAnimation);
        setvisibility.setNavigationOnClickListener(this.setLayoutAnimation.setUnboundedRipple);
        setvisibility.setY(this.setLayoutAnimation.setUiOptions);
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda0 = this.setLayoutAnimation.setX;
        int i3 = this.setLayoutAnimation.setY;
        setvisibility.setTextAlignment = i3;
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda0 = i3 > 0;
    }

    public final boolean MenuHostHelper$$ExternalSyntheticLambda0(setButtonTintBlendMode setbuttontintblendmode) {
        Iterator<setVisibility> it = ((setQueryHint) setbuttontintblendmode).setRowOrderPreserved.iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            setVisibility next = it.next();
            setVisibility.setX setx = next.setHasDecor[0];
            setVisibility.setX setx2 = next.setHasDecor[1];
            if (next.setFilterRedundantCalls == 8) {
                next.setCloseIconEndPadding = true;
            } else {
                if (next.setFilterTouchesWhenObscured < 1.0f && setx == setVisibility.setX.MATCH_CONSTRAINT) {
                    next.setContentScrimResource = 2;
                }
                if (next.setViewTranslationCallback < 1.0f && setx2 == setVisibility.setX.MATCH_CONSTRAINT) {
                    next.FragmentStateAdapter$2 = 2;
                }
                if (next.setZ > 0.0f) {
                    if (setx == setVisibility.setX.MATCH_CONSTRAINT && (setx2 == setVisibility.setX.WRAP_CONTENT || setx2 == setVisibility.setX.FIXED)) {
                        next.setContentScrimResource = 3;
                    } else if (setx2 == setVisibility.setX.MATCH_CONSTRAINT && (setx == setVisibility.setX.WRAP_CONTENT || setx == setVisibility.setX.FIXED)) {
                        next.FragmentStateAdapter$2 = 3;
                    } else if (setx == setVisibility.setX.MATCH_CONSTRAINT && setx2 == setVisibility.setX.MATCH_CONSTRAINT) {
                        if (next.setContentScrimResource == 0) {
                            next.setContentScrimResource = 3;
                        }
                        if (next.FragmentStateAdapter$2 == 0) {
                            next.FragmentStateAdapter$2 = 3;
                        }
                    }
                }
                if (setx == setVisibility.setX.MATCH_CONSTRAINT && next.setContentScrimResource == 1 && (next.setIconified.setLayoutAnimation == null || next.setShrinkMotionSpec.setLayoutAnimation == null)) {
                    setx = setVisibility.setX.WRAP_CONTENT;
                }
                setVisibility.setX setx3 = setx;
                setVisibility.setX setx4 = (setx2 == setVisibility.setX.MATCH_CONSTRAINT && next.FragmentStateAdapter$2 == 1 && (next.setChipSpacingVertical.setLayoutAnimation == null || next.setIconSize.setLayoutAnimation == null)) ? setVisibility.setX.WRAP_CONTENT : setx2;
                next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0 = setx3;
                next.setNavigationOnClickListener.setUnboundedRipple = next.setContentScrimResource;
                next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda0 = setx4;
                next.setNavigationIconTint.setUnboundedRipple = next.FragmentStateAdapter$2;
                if ((setx3 != setVisibility.setX.MATCH_PARENT && setx3 != setVisibility.setX.FIXED && setx3 != setVisibility.setX.WRAP_CONTENT) || (setx4 != setVisibility.setX.MATCH_PARENT && setx4 != setVisibility.setX.FIXED && setx4 != setVisibility.setX.WRAP_CONTENT)) {
                    if (setx3 == setVisibility.setX.MATCH_CONSTRAINT && (setx4 == setVisibility.setX.WRAP_CONTENT || setx4 == setVisibility.setX.FIXED)) {
                        if (next.setContentScrimResource == 3) {
                            if (setx4 == setVisibility.setX.WRAP_CONTENT) {
                                setIconTintList(next, setVisibility.setX.WRAP_CONTENT, 0, setVisibility.setX.WRAP_CONTENT, 0);
                            }
                            int i = next.setFilterRedundantCalls == 8 ? 0 : next.setTextScaleX;
                            setVisibility.setX setx5 = setVisibility.setX.FIXED;
                            setIconTintList(next, setx5, (int) ((i * next.setZ) + 0.5f), setx5, i);
                            next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls == 8 ? 0 : next.setHint);
                            next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0);
                            next.setCloseIconEndPadding = true;
                        } else if (next.setContentScrimResource == 1) {
                            setIconTintList(next, setVisibility.setX.WRAP_CONTENT, 0, setx4, 0);
                            next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled = next.setFilterRedundantCalls != 8 ? next.setHint : 0;
                        } else if (next.setContentScrimResource == 2) {
                            if (setbuttontintblendmode.setHasDecor[0] == setVisibility.setX.FIXED || setbuttontintblendmode.setHasDecor[0] == setVisibility.setX.MATCH_PARENT) {
                                setIconTintList(next, setVisibility.setX.FIXED, (int) ((next.setFilterTouchesWhenObscured * (setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setHint)) + 0.5f), setx4, next.setFilterRedundantCalls == 8 ? 0 : next.setTextScaleX);
                                next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls == 8 ? 0 : next.setHint);
                                next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0);
                                next.setCloseIconEndPadding = true;
                            }
                        } else if (next.setChipIconTintResource[0].setLayoutAnimation == null || next.setChipIconTintResource[1].setLayoutAnimation == null) {
                            setIconTintList(next, setVisibility.setX.WRAP_CONTENT, 0, setx4, 0);
                            next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls == 8 ? 0 : next.setHint);
                            next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0);
                            next.setCloseIconEndPadding = true;
                        }
                    }
                    if (setx4 == setVisibility.setX.MATCH_CONSTRAINT && (setx3 == setVisibility.setX.WRAP_CONTENT || setx3 == setVisibility.setX.FIXED)) {
                        if (next.FragmentStateAdapter$2 == 3) {
                            if (setx3 == setVisibility.setX.WRAP_CONTENT) {
                                setIconTintList(next, setVisibility.setX.WRAP_CONTENT, 0, setVisibility.setX.WRAP_CONTENT, 0);
                            }
                            int i2 = next.setFilterRedundantCalls == 8 ? 0 : next.setHint;
                            float f = next.setZ;
                            if (next.setMaxEms == -1) {
                                f = 1.0f / f;
                            }
                            setVisibility.setX setx6 = setVisibility.setX.FIXED;
                            setIconTintList(next, setx6, i2, setx6, (int) ((i2 * f) + 0.5f));
                            next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls == 8 ? 0 : next.setHint);
                            next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0);
                            next.setCloseIconEndPadding = true;
                        } else if (next.FragmentStateAdapter$2 == 1) {
                            setIconTintList(next, setx3, 0, setVisibility.setX.WRAP_CONTENT, 0);
                            next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled = next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0;
                        } else if (next.FragmentStateAdapter$2 == 2) {
                            if (setbuttontintblendmode.setHasDecor[1] == setVisibility.setX.FIXED || setbuttontintblendmode.setHasDecor[1] == setVisibility.setX.MATCH_PARENT) {
                                setIconTintList(next, setx3, next.setFilterRedundantCalls == 8 ? 0 : next.setHint, setVisibility.setX.FIXED, (int) ((next.setViewTranslationCallback * (setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setTextScaleX)) + 0.5f));
                                next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls == 8 ? 0 : next.setHint);
                                next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0);
                                next.setCloseIconEndPadding = true;
                            }
                        } else if (next.setChipIconTintResource[2].setLayoutAnimation == null || next.setChipIconTintResource[3].setLayoutAnimation == null) {
                            setIconTintList(next, setVisibility.setX.WRAP_CONTENT, 0, setx4, 0);
                            next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls == 8 ? 0 : next.setHint);
                            next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0);
                            next.setCloseIconEndPadding = true;
                        }
                    }
                    if (setx3 == setVisibility.setX.MATCH_CONSTRAINT && setx4 == setVisibility.setX.MATCH_CONSTRAINT) {
                        if (next.setContentScrimResource == 1 || next.FragmentStateAdapter$2 == 1) {
                            setIconTintList(next, setVisibility.setX.WRAP_CONTENT, 0, setVisibility.setX.WRAP_CONTENT, 0);
                            next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled = next.setFilterRedundantCalls == 8 ? 0 : next.setHint;
                            next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled = next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0;
                        } else if (next.FragmentStateAdapter$2 == 2 && next.setContentScrimResource == 2 && setbuttontintblendmode.setHasDecor[0] == setVisibility.setX.FIXED && setbuttontintblendmode.setHasDecor[1] == setVisibility.setX.FIXED) {
                            float f2 = next.setFilterTouchesWhenObscured;
                            float f3 = next.setViewTranslationCallback;
                            int i3 = (int) ((f2 * (setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setHint)) + 0.5f);
                            int i4 = setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setTextScaleX;
                            setVisibility.setX setx7 = setVisibility.setX.FIXED;
                            setIconTintList(next, setx7, i3, setx7, (int) ((f3 * i4) + 0.5f));
                            next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls == 8 ? 0 : next.setHint);
                            next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0);
                            next.setCloseIconEndPadding = true;
                        }
                    }
                } else {
                    int i5 = next.setFilterRedundantCalls == 8 ? 0 : next.setHint;
                    if (setx3 == setVisibility.setX.MATCH_PARENT) {
                        i5 = ((setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setHint) - next.setIconified.MenuHostHelper$$ExternalSyntheticLambda1) - next.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda1;
                        setx3 = setVisibility.setX.FIXED;
                    }
                    int i6 = i5;
                    int i7 = next.setFilterRedundantCalls == 8 ? 0 : next.setTextScaleX;
                    if (setx4 == setVisibility.setX.MATCH_PARENT) {
                        i7 = ((setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setTextScaleX) - next.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda1) - next.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1;
                        setx4 = setVisibility.setX.FIXED;
                    }
                    setIconTintList(next, setx3, i6, setx4, i7);
                    next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls == 8 ? 0 : next.setHint);
                    next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0);
                    next.setCloseIconEndPadding = true;
                }
            }
        }
    }

    public final void setX() {
        Iterator<setVisibility> it = ((setQueryHint) this.setIconTintList).setRowOrderPreserved.iterator();
        while (it.hasNext()) {
            setVisibility next = it.next();
            if (!next.setCloseIconEndPadding) {
                setVisibility.setX setx = next.setHasDecor[0];
                setVisibility.setX setx2 = next.setHasDecor[1];
                int i = next.setContentScrimResource;
                int i2 = next.FragmentStateAdapter$2;
                boolean z = setx == setVisibility.setX.WRAP_CONTENT || (setx == setVisibility.setX.MATCH_CONSTRAINT && i == 1);
                boolean z2 = setx2 == setVisibility.setX.WRAP_CONTENT || (setx2 == setVisibility.setX.MATCH_CONSTRAINT && i2 == 1);
                boolean z3 = next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
                boolean z4 = next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener;
                if (z3 && z4) {
                    setIconTintList(next, setVisibility.setX.FIXED, next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius, setVisibility.setX.FIXED, next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius);
                    next.setCloseIconEndPadding = true;
                } else if (z3 && z2) {
                    setIconTintList(next, setVisibility.setX.FIXED, next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius, setVisibility.setX.WRAP_CONTENT, next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius);
                    if (setx2 == setVisibility.setX.MATCH_CONSTRAINT) {
                        next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled = next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0;
                    } else {
                        next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setTextScaleX : 0);
                        next.setCloseIconEndPadding = true;
                    }
                } else if (z4 && z) {
                    setIconTintList(next, setVisibility.setX.WRAP_CONTENT, next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius, setVisibility.setX.FIXED, next.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius);
                    if (setx == setVisibility.setX.MATCH_CONSTRAINT) {
                        next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled = next.setFilterRedundantCalls != 8 ? next.setHint : 0;
                    } else {
                        next.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda1.setX(next.setFilterRedundantCalls != 8 ? next.setHint : 0);
                        next.setCloseIconEndPadding = true;
                    }
                }
                if (next.setCloseIconEndPadding && next.setNavigationIconTint.setX != null) {
                    next.setNavigationIconTint.setX.setX(next.setTextAlignment);
                }
            }
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        setX(this.setUiOptions);
        this.setUnboundedRipple.clear();
        setFreezesText.setIconTintList = 0;
        MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.setNavigationOnClickListener, 0, this.setUnboundedRipple);
        MenuHostHelper$$ExternalSyntheticLambda1(this.setIconTintList.setNavigationIconTint, 1, this.setUnboundedRipple);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
    }

    private void setX(ArrayList<setSupportButtonTintList> arrayList) {
        arrayList.clear();
        setExtractedText setextractedtext = this.setX.setNavigationOnClickListener;
        HashSet hashSet = null;
        setextractedtext.setLayoutAnimation = null;
        setextractedtext.setCenterIfNoTextEnabled.setY();
        setextractedtext.setIconTintList.setY();
        setextractedtext.MenuHostHelper$$ExternalSyntheticLambda1.setY();
        setextractedtext.setNavigationOnClickListener = false;
        this.setX.setNavigationIconTint.setY();
        arrayList.add(this.setX.setNavigationOnClickListener);
        arrayList.add(this.setX.setNavigationIconTint);
        Iterator<setVisibility> it = ((setQueryHint) this.setX).setRowOrderPreserved.iterator();
        while (it.hasNext()) {
            setVisibility next = it.next();
            if (next instanceof SwipeDismissBehavior) {
                arrayList.add(new setRootAlpha(next));
            } else {
                if (next.setChipCornerRadius()) {
                    if (next.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                        next.MenuHostHelper$$ExternalSyntheticLambda1 = new zza(next, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.MenuHostHelper$$ExternalSyntheticLambda1);
                } else {
                    arrayList.add(next.setNavigationOnClickListener);
                }
                if (next.setTextScaleX()) {
                    if (next.FabTransformationBehavior == null) {
                        next.FabTransformationBehavior = new zza(next, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(next.FabTransformationBehavior);
                } else {
                    arrayList.add(next.setNavigationIconTint);
                }
                if (next instanceof setForceApplySystemWindowInsetTop) {
                    arrayList.add(new loadReflectionField(next));
                }
            }
        }
        if (hashSet != null) {
            arrayList.addAll(hashSet);
        }
        Iterator<setSupportButtonTintList> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().setY();
        }
        Iterator<setSupportButtonTintList> it3 = arrayList.iterator();
        while (it3.hasNext()) {
            setSupportButtonTintList next2 = it3.next();
            if (next2.setIconSize != this.setX) {
                next2.setX();
            }
        }
    }

    private void setX(setLastBaselineToBottomHeight setlastbaselinetobottomheight, int i, int i2, setLastBaselineToBottomHeight setlastbaselinetobottomheight2, ArrayList<setFreezesText> arrayList, setFreezesText setfreezestext) {
        setSupportButtonTintList setsupportbuttontintlist = setlastbaselinetobottomheight.setUnboundedRipple;
        if (setsupportbuttontintlist.setLayoutAnimation != null || setsupportbuttontintlist == this.setIconTintList.setNavigationOnClickListener || setsupportbuttontintlist == this.setIconTintList.setNavigationIconTint) {
            return;
        }
        if (setfreezestext == null) {
            setfreezestext = new setFreezesText(setsupportbuttontintlist, i2);
            arrayList.add(setfreezestext);
        }
        setsupportbuttontintlist.setLayoutAnimation = setfreezestext;
        setfreezestext.MenuHostHelper$$ExternalSyntheticLambda1.add(setsupportbuttontintlist);
        setfreezestext.setY = setsupportbuttontintlist;
        for (getPropertyName getpropertyname : setsupportbuttontintlist.setCenterIfNoTextEnabled.setIconTintList) {
            if (getpropertyname instanceof setLastBaselineToBottomHeight) {
                setX((setLastBaselineToBottomHeight) getpropertyname, i, 0, setlastbaselinetobottomheight2, arrayList, setfreezestext);
            }
        }
        for (getPropertyName getpropertyname2 : setsupportbuttontintlist.setIconTintList.setIconTintList) {
            if (getpropertyname2 instanceof setLastBaselineToBottomHeight) {
                setX((setLastBaselineToBottomHeight) getpropertyname2, i, 1, setlastbaselinetobottomheight2, arrayList, setfreezestext);
            }
        }
        if (i == 1 && (setsupportbuttontintlist instanceof setIndeterminateTintBlendMode)) {
            for (getPropertyName getpropertyname3 : ((setIndeterminateTintBlendMode) setsupportbuttontintlist).setY.setIconTintList) {
                if (getpropertyname3 instanceof setLastBaselineToBottomHeight) {
                    setX((setLastBaselineToBottomHeight) getpropertyname3, i, 2, setlastbaselinetobottomheight2, arrayList, setfreezestext);
                }
            }
        }
        for (setLastBaselineToBottomHeight setlastbaselinetobottomheight3 : setsupportbuttontintlist.setCenterIfNoTextEnabled.setNavigationOnClickListener) {
            if (setlastbaselinetobottomheight3 == setlastbaselinetobottomheight2) {
                setfreezestext.setX = true;
            }
            setX(setlastbaselinetobottomheight3, i, 0, setlastbaselinetobottomheight2, arrayList, setfreezestext);
        }
        for (setLastBaselineToBottomHeight setlastbaselinetobottomheight4 : setsupportbuttontintlist.setIconTintList.setNavigationOnClickListener) {
            if (setlastbaselinetobottomheight4 == setlastbaselinetobottomheight2) {
                setfreezestext.setX = true;
            }
            setX(setlastbaselinetobottomheight4, i, 1, setlastbaselinetobottomheight2, arrayList, setfreezestext);
        }
        if (i == 1 && (setsupportbuttontintlist instanceof setIndeterminateTintBlendMode)) {
            for (setLastBaselineToBottomHeight setlastbaselinetobottomheight5 : ((setIndeterminateTintBlendMode) setsupportbuttontintlist).setY.setNavigationOnClickListener) {
                setX(setlastbaselinetobottomheight5, i, 2, setlastbaselinetobottomheight2, arrayList, setfreezestext);
            }
        }
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(setSupportButtonTintList setsupportbuttontintlist, int i, ArrayList<setFreezesText> arrayList) {
        for (getPropertyName getpropertyname : setsupportbuttontintlist.setCenterIfNoTextEnabled.setIconTintList) {
            if (getpropertyname instanceof setLastBaselineToBottomHeight) {
                setX((setLastBaselineToBottomHeight) getpropertyname, i, 0, setsupportbuttontintlist.setIconTintList, arrayList, null);
            } else if (getpropertyname instanceof setSupportButtonTintList) {
                setX(((setSupportButtonTintList) getpropertyname).setCenterIfNoTextEnabled, i, 0, setsupportbuttontintlist.setIconTintList, arrayList, null);
            }
        }
        for (getPropertyName getpropertyname2 : setsupportbuttontintlist.setIconTintList.setIconTintList) {
            if (getpropertyname2 instanceof setLastBaselineToBottomHeight) {
                setX((setLastBaselineToBottomHeight) getpropertyname2, i, 1, setsupportbuttontintlist.setCenterIfNoTextEnabled, arrayList, null);
            } else if (getpropertyname2 instanceof setSupportButtonTintList) {
                setX(((setSupportButtonTintList) getpropertyname2).setIconTintList, i, 1, setsupportbuttontintlist.setCenterIfNoTextEnabled, arrayList, null);
            }
        }
        if (i == 1) {
            for (getPropertyName getpropertyname3 : ((setIndeterminateTintBlendMode) setsupportbuttontintlist).setY.setIconTintList) {
                if (getpropertyname3 instanceof setLastBaselineToBottomHeight) {
                    setX((setLastBaselineToBottomHeight) getpropertyname3, i, 2, null, arrayList, null);
                }
            }
        }
    }
}