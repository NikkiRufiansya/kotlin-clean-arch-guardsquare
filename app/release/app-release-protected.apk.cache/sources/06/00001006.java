package o;

import o.setVisibility;

/* loaded from: classes.dex */
public abstract class setSupportButtonTintList implements getPropertyName {
    protected setVisibility.setX MenuHostHelper$$ExternalSyntheticLambda0;
    public setVisibility setIconSize;
    setFreezesText setLayoutAnimation;
    public int setUnboundedRipple;
    public setItemTextAppearanceActive MenuHostHelper$$ExternalSyntheticLambda1 = new setItemTextAppearanceActive(this);
    public int setOnLongClickListener = 0;
    public boolean setNavigationOnClickListener = false;
    public setLastBaselineToBottomHeight setCenterIfNoTextEnabled = new setLastBaselineToBottomHeight(this);
    public setLastBaselineToBottomHeight setIconTintList = new setLastBaselineToBottomHeight(this);
    protected setSupportButtonTintList$MenuHostHelper$$ExternalSyntheticLambda1 setUiOptions = setSupportButtonTintList$MenuHostHelper$$ExternalSyntheticLambda1.NONE;

    public abstract void MenuHostHelper$$ExternalSyntheticLambda1();

    public abstract boolean setIconTintList();

    @Override // o.getPropertyName
    public void setLayoutAnimation() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setX();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void setY();

    public setSupportButtonTintList(setVisibility setvisibility) {
        this.setIconSize = setvisibility;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static setLastBaselineToBottomHeight setIconTintList(zzD zzd) {
        if (zzd.setLayoutAnimation == null) {
            return null;
        }
        setVisibility setvisibility = zzd.setLayoutAnimation.setIconTintList;
        int i = AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda1[zzd.setLayoutAnimation.setUnboundedRipple.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return setvisibility.setNavigationIconTint.setIconTintList;
                    }
                    return setvisibility.setNavigationIconTint.setY;
                }
                return setvisibility.setNavigationIconTint.setCenterIfNoTextEnabled;
            }
            return setvisibility.setNavigationOnClickListener.setIconTintList;
        }
        return setvisibility.setNavigationOnClickListener.setCenterIfNoTextEnabled;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o.setSupportButtonTintList$3  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] MenuHostHelper$$ExternalSyntheticLambda1;

        static {
            int[] iArr = new int[zzD$MenuHostHelper$$ExternalSyntheticLambda0.values().length];
            MenuHostHelper$$ExternalSyntheticLambda1 = iArr;
            try {
                iArr[zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                MenuHostHelper$$ExternalSyntheticLambda1[zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setX(zzD zzd, zzD zzd2, int i) {
        float f;
        int i2;
        int i3;
        setLastBaselineToBottomHeight iconTintList = setIconTintList(zzd);
        setLastBaselineToBottomHeight iconTintList2 = setIconTintList(zzd2);
        if (iconTintList.setOnLongClickListener && iconTintList2.setOnLongClickListener) {
            int MenuHostHelper$$ExternalSyntheticLambda0 = iconTintList.setChipCornerRadius + zzd.MenuHostHelper$$ExternalSyntheticLambda0();
            int MenuHostHelper$$ExternalSyntheticLambda02 = iconTintList2.setChipCornerRadius - zzd2.MenuHostHelper$$ExternalSyntheticLambda0();
            int i4 = MenuHostHelper$$ExternalSyntheticLambda02 - MenuHostHelper$$ExternalSyntheticLambda0;
            if (!this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener && this.MenuHostHelper$$ExternalSyntheticLambda0 == setVisibility.setX.MATCH_CONSTRAINT) {
                int i5 = this.setUnboundedRipple;
                if (i5 == 0) {
                    i2 = i4;
                } else if (i5 == 1) {
                    this.MenuHostHelper$$ExternalSyntheticLambda1.setX(Math.min(setX(this.MenuHostHelper$$ExternalSyntheticLambda1.setCenterIfNoTextEnabled, i), i4));
                } else if (i5 != 2) {
                    if (i5 == 3 && (this.setIconSize.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0 != setVisibility.setX.MATCH_CONSTRAINT || this.setIconSize.setNavigationOnClickListener.setUnboundedRipple != 3 || this.setIconSize.setNavigationIconTint.MenuHostHelper$$ExternalSyntheticLambda0 != setVisibility.setX.MATCH_CONSTRAINT || this.setIconSize.setNavigationIconTint.setUnboundedRipple != 3)) {
                        setVisibility setvisibility = this.setIconSize;
                        setSupportButtonTintList setsupportbuttontintlist = i == 0 ? setvisibility.setNavigationIconTint : setvisibility.setNavigationOnClickListener;
                        if (setsupportbuttontintlist.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener) {
                            float f2 = this.setIconSize.setZ;
                            if (i == 1) {
                                i3 = (int) ((setsupportbuttontintlist.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius / f2) + 0.5f);
                            } else {
                                i3 = (int) ((f2 * setsupportbuttontintlist.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius) + 0.5f);
                            }
                            this.MenuHostHelper$$ExternalSyntheticLambda1.setX(i3);
                        }
                    }
                } else {
                    setVisibility setvisibility2 = this.setIconSize.RecyclerView$SavedState$1;
                    if (setvisibility2 != null) {
                        setSupportButtonTintList setsupportbuttontintlist2 = i == 0 ? setvisibility2.setNavigationOnClickListener : setvisibility2.setNavigationIconTint;
                        if (setsupportbuttontintlist2.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener) {
                            setVisibility setvisibility3 = this.setIconSize;
                            i2 = (int) ((setsupportbuttontintlist2.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius * (i == 0 ? setvisibility3.setFilterTouchesWhenObscured : setvisibility3.setViewTranslationCallback)) + 0.5f);
                        }
                    }
                }
                this.MenuHostHelper$$ExternalSyntheticLambda1.setX(setX(i2, i));
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener) {
                if (this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius == i4) {
                    this.setCenterIfNoTextEnabled.setX(MenuHostHelper$$ExternalSyntheticLambda0);
                    this.setIconTintList.setX(MenuHostHelper$$ExternalSyntheticLambda02);
                    return;
                }
                setVisibility setvisibility4 = this.setIconSize;
                if (i == 0) {
                    f = setvisibility4.setGuidelinePercent;
                } else {
                    f = setvisibility4.setTitleMarginEnd;
                }
                if (iconTintList == iconTintList2) {
                    MenuHostHelper$$ExternalSyntheticLambda0 = iconTintList.setChipCornerRadius;
                    MenuHostHelper$$ExternalSyntheticLambda02 = iconTintList2.setChipCornerRadius;
                    f = 0.5f;
                }
                this.setCenterIfNoTextEnabled.setX((int) (MenuHostHelper$$ExternalSyntheticLambda0 + 0.5f + (((MenuHostHelper$$ExternalSyntheticLambda02 - MenuHostHelper$$ExternalSyntheticLambda0) - this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius) * f)));
                this.setIconTintList.setX(this.setCenterIfNoTextEnabled.setChipCornerRadius + this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int setX(int i, int i2) {
        int max;
        if (i2 == 0) {
            int i3 = this.setIconSize.FragmentStateAdapter$5;
            max = Math.max(this.setIconSize.setObjectValues, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max == i) {
                return i;
            }
        } else {
            int i4 = this.setIconSize.FloatingActionButton$BaseBehavior;
            max = Math.max(this.setIconSize.setAdapter, i);
            if (i4 > 0) {
                max = Math.min(i4, i);
            }
            if (max == i) {
                return i;
            }
        }
        return max;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static setLastBaselineToBottomHeight MenuHostHelper$$ExternalSyntheticLambda1(zzD zzd, int i) {
        if (zzd.setLayoutAnimation == null) {
            return null;
        }
        setVisibility setvisibility = zzd.setLayoutAnimation.setIconTintList;
        setSupportButtonTintList setsupportbuttontintlist = i == 0 ? setvisibility.setNavigationOnClickListener : setvisibility.setNavigationIconTint;
        int i2 = AnonymousClass3.MenuHostHelper$$ExternalSyntheticLambda1[zzd.setLayoutAnimation.setUnboundedRipple.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 5) {
                        return null;
                    }
                }
            }
            return setsupportbuttontintlist.setIconTintList;
        }
        return setsupportbuttontintlist.setCenterIfNoTextEnabled;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(setLastBaselineToBottomHeight setlastbaselinetobottomheight, setLastBaselineToBottomHeight setlastbaselinetobottomheight2, int i, setItemTextAppearanceActive setitemtextappearanceactive) {
        setlastbaselinetobottomheight.setNavigationOnClickListener.add(setlastbaselinetobottomheight2);
        setlastbaselinetobottomheight.setNavigationOnClickListener.add(this.MenuHostHelper$$ExternalSyntheticLambda1);
        setlastbaselinetobottomheight.MenuHostHelper$$ExternalSyntheticLambda1 = i;
        setlastbaselinetobottomheight.setX = setitemtextappearanceactive;
        setlastbaselinetobottomheight2.setIconTintList.add(setlastbaselinetobottomheight);
        setitemtextappearanceactive.setIconTintList.add(setlastbaselinetobottomheight);
    }

    public long MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener) {
            return this.MenuHostHelper$$ExternalSyntheticLambda1.setChipCornerRadius;
        }
        return 0L;
    }
}