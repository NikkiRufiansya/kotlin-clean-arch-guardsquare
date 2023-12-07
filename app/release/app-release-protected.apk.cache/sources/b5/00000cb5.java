package o;

import java.util.ArrayList;
import java.util.Iterator;
import o.setShowingForActionMode;
import o.setVisibility;

/* loaded from: classes.dex */
public final class setIndicatorBoundsRelative {
    private static setShowingForActionMode.setX MenuHostHelper$$ExternalSyntheticLambda0 = new setShowingForActionMode.setX();
    private static int MenuHostHelper$$ExternalSyntheticLambda1 = 0;
    private static int setIconTintList = 0;

    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
        if (r7.setIconTintList(0, r7.setFilterRedundantCalls == 8 ? 0 : r7.setHint) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0098, code lost:
        if (r7.setIconTintList(1, r7.setFilterRedundantCalls != 8 ? 0 : r7.setTextScaleX) != false) goto L69;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00aa A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean setX(o.setVisibility r7) {
        /*
            o.setVisibility$setX[] r0 = r7.setHasDecor
            r1 = 0
            r0 = r0[r1]
            o.setVisibility$setX[] r2 = r7.setHasDecor
            r3 = 1
            r2 = r2[r3]
            o.setVisibility r4 = r7.RecyclerView$SavedState$1
            if (r4 == 0) goto L13
            o.setVisibility r4 = r7.RecyclerView$SavedState$1
            o.setButtonTintBlendMode r4 = (o.setButtonTintBlendMode) r4
            goto L14
        L13:
            r4 = 0
        L14:
            if (r4 == 0) goto L1c
            o.setVisibility$setX[] r5 = r4.setHasDecor
            r5 = r5[r1]
            o.setVisibility$setX r5 = o.setVisibility.setX.FIXED
        L1c:
            if (r4 == 0) goto L24
            o.setVisibility$setX[] r4 = r4.setHasDecor
            r4 = r4[r3]
            o.setVisibility$setX r4 = o.setVisibility.setX.FIXED
        L24:
            o.setVisibility$setX r4 = o.setVisibility.setX.FIXED
            r5 = 8
            r6 = 0
            if (r0 == r4) goto L61
            boolean r4 = r7.setX()
            if (r4 != 0) goto L61
            o.setVisibility$setX r4 = o.setVisibility.setX.WRAP_CONTENT
            if (r0 == r4) goto L61
            o.setVisibility$setX r4 = o.setVisibility.setX.MATCH_CONSTRAINT
            if (r0 != r4) goto L49
            int r4 = r7.setContentScrimResource
            if (r4 != 0) goto L49
            float r4 = r7.setZ
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L49
            boolean r4 = r7.setX(r1)
            if (r4 != 0) goto L61
        L49:
            o.setVisibility$setX r4 = o.setVisibility.setX.MATCH_CONSTRAINT
            if (r0 != r4) goto L5f
            int r0 = r7.setContentScrimResource
            if (r0 != r3) goto L5f
            int r0 = r7.setFilterRedundantCalls
            if (r0 != r5) goto L57
            r0 = 0
            goto L59
        L57:
            int r0 = r7.setHint
        L59:
            boolean r0 = r7.setIconTintList(r1, r0)
            if (r0 != 0) goto L61
        L5f:
            r0 = 0
            goto L62
        L61:
            r0 = 1
        L62:
            o.setVisibility$setX r4 = o.setVisibility.setX.FIXED
            if (r2 == r4) goto L9c
            boolean r4 = r7.setY()
            if (r4 != 0) goto L9c
            o.setVisibility$setX r4 = o.setVisibility.setX.WRAP_CONTENT
            if (r2 == r4) goto L9c
            o.setVisibility$setX r4 = o.setVisibility.setX.MATCH_CONSTRAINT
            if (r2 != r4) goto L84
            int r4 = r7.FragmentStateAdapter$2
            if (r4 != 0) goto L84
            float r4 = r7.setZ
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L84
            boolean r4 = r7.setX(r3)
            if (r4 != 0) goto L9c
        L84:
            o.setVisibility$setX r4 = o.setVisibility.setX.MATCH_CONSTRAINT
            if (r2 != r4) goto L9a
            int r2 = r7.FragmentStateAdapter$2
            if (r2 != r3) goto L9a
            int r2 = r7.setFilterRedundantCalls
            if (r2 != r5) goto L92
            r2 = 0
            goto L94
        L92:
            int r2 = r7.setTextScaleX
        L94:
            boolean r2 = r7.setIconTintList(r3, r2)
            if (r2 != 0) goto L9c
        L9a:
            r2 = 0
            goto L9d
        L9c:
            r2 = 1
        L9d:
            float r7 = r7.setZ
            int r7 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r7 <= 0) goto La8
            if (r0 != 0) goto La7
            if (r2 == 0) goto La8
        La7:
            return r3
        La8:
            if (r0 == 0) goto Lad
            if (r2 == 0) goto Lad
            r1 = 1
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setIndicatorBoundsRelative.setX(o.setVisibility):boolean");
    }

    private static void setX(int i, setVisibility setvisibility, setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, boolean z) {
        if (setvisibility.setUiOptions) {
            return;
        }
        MenuHostHelper$$ExternalSyntheticLambda1++;
        if (!(setvisibility instanceof setButtonTintBlendMode)) {
            if ((setvisibility.setImageTintMode && setvisibility.setFilterRedundantCalls != 8) && setX(setvisibility)) {
                setButtonTintBlendMode.setX(setvisibility, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, new setShowingForActionMode.setX(), 0);
            }
        }
        zzD MenuHostHelper$$ExternalSyntheticLambda12 = setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.LEFT);
        zzD MenuHostHelper$$ExternalSyntheticLambda13 = setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.RIGHT);
        int i2 = !MenuHostHelper$$ExternalSyntheticLambda12.setX ? 0 : MenuHostHelper$$ExternalSyntheticLambda12.setY;
        int i3 = !MenuHostHelper$$ExternalSyntheticLambda13.setX ? 0 : MenuHostHelper$$ExternalSyntheticLambda13.setY;
        if (MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda12.setX) {
            Iterator<zzD> it = MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
            while (it.hasNext()) {
                zzD next = it.next();
                setVisibility setvisibility2 = next.setIconTintList;
                int i4 = i + 1;
                boolean x = setX(setvisibility2);
                if ((setvisibility2.setImageTintMode && setvisibility2.setFilterRedundantCalls != 8) && x) {
                    setButtonTintBlendMode.setX(setvisibility2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, new setShowingForActionMode.setX(), 0);
                }
                boolean z2 = (next == setvisibility2.setIconified && setvisibility2.setShrinkMotionSpec.setLayoutAnimation != null && setvisibility2.setShrinkMotionSpec.setLayoutAnimation.setX) || (next == setvisibility2.setShrinkMotionSpec && setvisibility2.setIconified.setLayoutAnimation != null && setvisibility2.setIconified.setLayoutAnimation.setX);
                if (setvisibility2.setHasDecor[0] == setVisibility.setX.MATCH_CONSTRAINT && !x) {
                    if (setvisibility2.setHasDecor[0] == setVisibility.setX.MATCH_CONSTRAINT && setvisibility2.FragmentStateAdapter$5 >= 0 && setvisibility2.setObjectValues >= 0 && ((setvisibility2.setFilterRedundantCalls == 8 || (setvisibility2.setContentScrimResource == 0 && setvisibility2.setZ == 0.0f)) && !setvisibility2.setChipCornerRadius() && !setvisibility2.setCheckedIconEnabled && z2 && !setvisibility2.setChipCornerRadius())) {
                        MenuHostHelper$$ExternalSyntheticLambda1(i4, setvisibility, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setvisibility2, z);
                    }
                } else {
                    if (!(setvisibility2.setImageTintMode && setvisibility2.setFilterRedundantCalls != 8)) {
                        if (next == setvisibility2.setIconified && setvisibility2.setShrinkMotionSpec.setLayoutAnimation == null) {
                            int MenuHostHelper$$ExternalSyntheticLambda02 = setvisibility2.setIconified.MenuHostHelper$$ExternalSyntheticLambda0() + i2;
                            setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda02, (setvisibility2.setFilterRedundantCalls == 8 ? 0 : setvisibility2.setHint) + MenuHostHelper$$ExternalSyntheticLambda02);
                            setX(i4, setvisibility2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
                        } else if (next == setvisibility2.setShrinkMotionSpec && setvisibility2.setIconified.setLayoutAnimation == null) {
                            int MenuHostHelper$$ExternalSyntheticLambda03 = i2 - setvisibility2.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda0();
                            setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda03 - (setvisibility2.setFilterRedundantCalls == 8 ? 0 : setvisibility2.setHint), MenuHostHelper$$ExternalSyntheticLambda03);
                            setX(i4, setvisibility2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
                        } else if (z2 && !setvisibility2.setChipCornerRadius()) {
                            setIconTintList(i4, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setvisibility2, z);
                        }
                    }
                }
            }
        }
        if (setvisibility instanceof SwipeDismissBehavior) {
            return;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda13.MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda13.setX) {
            Iterator<zzD> it2 = MenuHostHelper$$ExternalSyntheticLambda13.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
            while (it2.hasNext()) {
                zzD next2 = it2.next();
                setVisibility setvisibility3 = next2.setIconTintList;
                int i5 = i + 1;
                boolean x2 = setX(setvisibility3);
                if ((setvisibility3.setImageTintMode && setvisibility3.setFilterRedundantCalls != 8) && x2) {
                    setButtonTintBlendMode.setX(setvisibility3, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, new setShowingForActionMode.setX(), 0);
                }
                boolean z3 = (next2 == setvisibility3.setIconified && setvisibility3.setShrinkMotionSpec.setLayoutAnimation != null && setvisibility3.setShrinkMotionSpec.setLayoutAnimation.setX) || (next2 == setvisibility3.setShrinkMotionSpec && setvisibility3.setIconified.setLayoutAnimation != null && setvisibility3.setIconified.setLayoutAnimation.setX);
                if (setvisibility3.setHasDecor[0] == setVisibility.setX.MATCH_CONSTRAINT && !x2) {
                    if (setvisibility3.setHasDecor[0] == setVisibility.setX.MATCH_CONSTRAINT) {
                        if (setvisibility3.FragmentStateAdapter$5 >= 0) {
                            if (setvisibility3.setObjectValues >= 0) {
                                if (setvisibility3.setFilterRedundantCalls != 8) {
                                    if (setvisibility3.setContentScrimResource == 0 && setvisibility3.setZ == 0.0f) {
                                    }
                                }
                                if (!setvisibility3.setChipCornerRadius() && !setvisibility3.setCheckedIconEnabled && z3 && !setvisibility3.setChipCornerRadius()) {
                                    MenuHostHelper$$ExternalSyntheticLambda1(i5, setvisibility, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setvisibility3, z);
                                }
                            }
                        }
                    }
                } else {
                    if (!(setvisibility3.setImageTintMode && setvisibility3.setFilterRedundantCalls != 8)) {
                        if (next2 == setvisibility3.setIconified && setvisibility3.setShrinkMotionSpec.setLayoutAnimation == null) {
                            int MenuHostHelper$$ExternalSyntheticLambda04 = setvisibility3.setIconified.MenuHostHelper$$ExternalSyntheticLambda0() + i3;
                            setvisibility3.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda04, (setvisibility3.setFilterRedundantCalls == 8 ? 0 : setvisibility3.setHint) + MenuHostHelper$$ExternalSyntheticLambda04);
                            setX(i5, setvisibility3, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
                        } else if (next2 == setvisibility3.setShrinkMotionSpec && setvisibility3.setIconified.setLayoutAnimation == null) {
                            int MenuHostHelper$$ExternalSyntheticLambda05 = i3 - setvisibility3.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda0();
                            setvisibility3.MenuHostHelper$$ExternalSyntheticLambda1(MenuHostHelper$$ExternalSyntheticLambda05 - (setvisibility3.setFilterRedundantCalls == 8 ? 0 : setvisibility3.setHint), MenuHostHelper$$ExternalSyntheticLambda05);
                            setX(i5, setvisibility3, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
                        } else if (z3 && !setvisibility3.setChipCornerRadius()) {
                            setIconTintList(i5, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setvisibility3, z);
                        }
                    }
                }
            }
        }
        setvisibility.setUiOptions = true;
    }

    private static void setIconTintList(int i, setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setVisibility setvisibility, boolean z) {
        float f = setvisibility.setGuidelinePercent;
        zzD zzd = setvisibility.setIconified.setLayoutAnimation;
        int i2 = !zzd.setX ? 0 : zzd.setY;
        zzD zzd2 = setvisibility.setShrinkMotionSpec.setLayoutAnimation;
        int i3 = !zzd2.setX ? 0 : zzd2.setY;
        int MenuHostHelper$$ExternalSyntheticLambda02 = setvisibility.setIconified.MenuHostHelper$$ExternalSyntheticLambda0();
        int MenuHostHelper$$ExternalSyntheticLambda03 = setvisibility.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda0();
        if (i2 == i3) {
            f = 0.5f;
        } else {
            i2 += MenuHostHelper$$ExternalSyntheticLambda02;
            i3 -= MenuHostHelper$$ExternalSyntheticLambda03;
        }
        int i4 = setvisibility.setFilterRedundantCalls != 8 ? setvisibility.setHint : 0;
        int i5 = (i3 - i2) - i4;
        if (i2 > i3) {
            i5 = (i2 - i3) - i4;
        }
        int i6 = ((int) (i5 > 0 ? (f * i5) + 0.5f : f * i5)) + i2;
        int i7 = i6 + i4;
        if (i2 > i3) {
            i7 = i6 - i4;
        }
        setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(i6, i7);
        setX(i + 1, setvisibility, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(int i, setVisibility setvisibility, setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setVisibility setvisibility2, boolean z) {
        float f = setvisibility2.setGuidelinePercent;
        zzD zzd = setvisibility2.setIconified.setLayoutAnimation;
        int i2 = 0;
        int MenuHostHelper$$ExternalSyntheticLambda02 = (!zzd.setX ? 0 : zzd.setY) + setvisibility2.setIconified.MenuHostHelper$$ExternalSyntheticLambda0();
        zzD zzd2 = setvisibility2.setShrinkMotionSpec.setLayoutAnimation;
        int MenuHostHelper$$ExternalSyntheticLambda03 = (!zzd2.setX ? 0 : zzd2.setY) - setvisibility2.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda03 >= MenuHostHelper$$ExternalSyntheticLambda02) {
            int i3 = setvisibility2.setFilterRedundantCalls == 8 ? 0 : setvisibility2.setHint;
            if (setvisibility2.setFilterRedundantCalls != 8) {
                if (setvisibility2.setContentScrimResource == 2) {
                    if (setvisibility instanceof setButtonTintBlendMode) {
                        if (setvisibility.setFilterRedundantCalls != 8) {
                            i2 = setvisibility.setHint;
                        }
                    } else {
                        setVisibility setvisibility3 = setvisibility.RecyclerView$SavedState$1;
                        if (setvisibility3.setFilterRedundantCalls != 8) {
                            i2 = setvisibility3.setHint;
                        }
                    }
                    i3 = (int) (setvisibility2.setGuidelinePercent * 0.5f * i2);
                } else if (setvisibility2.setContentScrimResource == 0) {
                    i3 = MenuHostHelper$$ExternalSyntheticLambda03 - MenuHostHelper$$ExternalSyntheticLambda02;
                }
                i3 = Math.max(setvisibility2.setObjectValues, i3);
                if (setvisibility2.FragmentStateAdapter$5 > 0) {
                    i3 = Math.min(setvisibility2.FragmentStateAdapter$5, i3);
                }
            }
            int i4 = MenuHostHelper$$ExternalSyntheticLambda02 + ((int) ((f * ((MenuHostHelper$$ExternalSyntheticLambda03 - MenuHostHelper$$ExternalSyntheticLambda02) - i3)) + 0.5f));
            setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(i4, i3 + i4);
            setX(i + 1, setvisibility2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
        }
    }

    private static void setX(int i, setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setVisibility setvisibility) {
        float f = setvisibility.setTitleMarginEnd;
        zzD zzd = setvisibility.setChipSpacingVertical.setLayoutAnimation;
        int i2 = !zzd.setX ? 0 : zzd.setY;
        zzD zzd2 = setvisibility.setIconSize.setLayoutAnimation;
        int i3 = !zzd2.setX ? 0 : zzd2.setY;
        int MenuHostHelper$$ExternalSyntheticLambda02 = setvisibility.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda0();
        int MenuHostHelper$$ExternalSyntheticLambda03 = setvisibility.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0();
        if (i2 == i3) {
            f = 0.5f;
        } else {
            i2 += MenuHostHelper$$ExternalSyntheticLambda02;
            i3 -= MenuHostHelper$$ExternalSyntheticLambda03;
        }
        int i4 = setvisibility.setFilterRedundantCalls != 8 ? setvisibility.setTextScaleX : 0;
        int i5 = (i3 - i2) - i4;
        if (i2 > i3) {
            i5 = (i2 - i3) - i4;
        }
        int i6 = (int) (i5 > 0 ? (f * i5) + 0.5f : f * i5);
        int i7 = i2 + i6;
        int i8 = i7 + i4;
        if (i2 > i3) {
            i7 = i2 - i6;
            i8 = i7 - i4;
        }
        setvisibility.setX(i7, i8);
        MenuHostHelper$$ExternalSyntheticLambda1(i + 1, setvisibility, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
    }

    private static void setIconTintList(int i, setVisibility setvisibility, setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setVisibility setvisibility2) {
        float f = setvisibility2.setTitleMarginEnd;
        zzD zzd = setvisibility2.setChipSpacingVertical.setLayoutAnimation;
        int i2 = 0;
        int MenuHostHelper$$ExternalSyntheticLambda02 = (!zzd.setX ? 0 : zzd.setY) + setvisibility2.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda0();
        zzD zzd2 = setvisibility2.setIconSize.setLayoutAnimation;
        int MenuHostHelper$$ExternalSyntheticLambda03 = (!zzd2.setX ? 0 : zzd2.setY) - setvisibility2.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0();
        if (MenuHostHelper$$ExternalSyntheticLambda03 >= MenuHostHelper$$ExternalSyntheticLambda02) {
            int i3 = setvisibility2.setFilterRedundantCalls == 8 ? 0 : setvisibility2.setTextScaleX;
            if (setvisibility2.setFilterRedundantCalls != 8) {
                if (setvisibility2.FragmentStateAdapter$2 == 2) {
                    if (setvisibility instanceof setButtonTintBlendMode) {
                        if (setvisibility.setFilterRedundantCalls != 8) {
                            i2 = setvisibility.setTextScaleX;
                        }
                    } else {
                        setVisibility setvisibility3 = setvisibility.RecyclerView$SavedState$1;
                        if (setvisibility3.setFilterRedundantCalls != 8) {
                            i2 = setvisibility3.setTextScaleX;
                        }
                    }
                    i3 = (int) (f * 0.5f * i2);
                } else if (setvisibility2.FragmentStateAdapter$2 == 0) {
                    i3 = MenuHostHelper$$ExternalSyntheticLambda03 - MenuHostHelper$$ExternalSyntheticLambda02;
                }
                i3 = Math.max(setvisibility2.setAdapter, i3);
                if (setvisibility2.FloatingActionButton$BaseBehavior > 0) {
                    i3 = Math.min(setvisibility2.FloatingActionButton$BaseBehavior, i3);
                }
            }
            int i4 = MenuHostHelper$$ExternalSyntheticLambda02 + ((int) ((f * ((MenuHostHelper$$ExternalSyntheticLambda03 - MenuHostHelper$$ExternalSyntheticLambda02) - i3)) + 0.5f));
            setvisibility2.setX(i4, i3 + i4);
            MenuHostHelper$$ExternalSyntheticLambda1(i + 1, setvisibility2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
        }
    }

    public static void MenuHostHelper$$ExternalSyntheticLambda1(setButtonTintBlendMode setbuttontintblendmode, setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1) {
        setVisibility.setX setx = setbuttontintblendmode.setHasDecor[0];
        setVisibility.setX setx2 = setbuttontintblendmode.setHasDecor[1];
        MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        setIconTintList = 0;
        setbuttontintblendmode.setAnimationFromJson();
        ArrayList<setVisibility> arrayList = ((setQueryHint) setbuttontintblendmode).setRowOrderPreserved;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).setAnimationFromJson();
        }
        boolean z = setbuttontintblendmode.TextInputLayout$SavedState$1;
        if (setx == setVisibility.setX.FIXED) {
            setbuttontintblendmode.MenuHostHelper$$ExternalSyntheticLambda1(0, setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setHint);
        } else {
            setbuttontintblendmode.setZ();
        }
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            char c = 65535;
            if (i2 >= size) {
                break;
            }
            setVisibility setvisibility = arrayList.get(i2);
            if (setvisibility instanceof SwipeDismissBehavior) {
                SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) setvisibility;
                if (swipeDismissBehavior.setY == 1) {
                    if (swipeDismissBehavior.setIconTintList != -1) {
                        int i3 = swipeDismissBehavior.setIconTintList;
                        zzD zzd = swipeDismissBehavior.setX;
                        zzd.setY = i3;
                        zzd.setX = true;
                        swipeDismissBehavior.ActionMenuPresenter$SavedState$1 = true;
                    } else if (swipeDismissBehavior.setLineBreakStyle == -1 || !setbuttontintblendmode.setX()) {
                        if (setbuttontintblendmode.setX()) {
                            float f = swipeDismissBehavior.setEmptyView;
                            int i4 = setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setHint;
                            zzD zzd2 = swipeDismissBehavior.setX;
                            zzd2.setY = (int) ((f * i4) + 0.5f);
                            zzd2.setX = true;
                            swipeDismissBehavior.ActionMenuPresenter$SavedState$1 = true;
                        }
                    } else {
                        int i5 = (setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setHint) - swipeDismissBehavior.setLineBreakStyle;
                        zzD zzd3 = swipeDismissBehavior.setX;
                        zzd3.setY = i5;
                        zzd3.setX = true;
                        swipeDismissBehavior.ActionMenuPresenter$SavedState$1 = true;
                    }
                    z2 = true;
                }
            } else if (setvisibility instanceof zzB) {
                int i6 = ((zzB) setvisibility).setY;
                if (i6 == 0 || i6 == 1) {
                    c = 0;
                } else if (i6 == 2 || i6 == 3) {
                    c = 1;
                }
                if (c == 0) {
                    z3 = true;
                }
            }
            i2++;
        }
        if (z2) {
            for (int i7 = 0; i7 < size; i7++) {
                setVisibility setvisibility2 = arrayList.get(i7);
                if (setvisibility2 instanceof SwipeDismissBehavior) {
                    SwipeDismissBehavior swipeDismissBehavior2 = (SwipeDismissBehavior) setvisibility2;
                    if (swipeDismissBehavior2.setY == 1) {
                        setX(0, swipeDismissBehavior2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
                    }
                }
            }
        }
        setX(0, setbuttontintblendmode, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
        if (z3) {
            for (int i8 = 0; i8 < size; i8++) {
                setVisibility setvisibility3 = arrayList.get(i8);
                if (setvisibility3 instanceof zzB) {
                    zzB zzb = (zzB) setvisibility3;
                    int i9 = zzb.setY;
                    if (((i9 == 0 || i9 == 1) ? (char) 0 : (i9 == 2 || i9 == 3) ? (char) 1 : (char) 65535) == 0 && zzb.MenuHostHelper$$ExternalSyntheticLambda0()) {
                        setX(1, zzb, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
                    }
                }
            }
        }
        if (setx2 == setVisibility.setX.FIXED) {
            setbuttontintblendmode.setX(0, setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setTextScaleX);
        } else {
            setbuttontintblendmode.setGuidelinePercent();
        }
        boolean z4 = false;
        boolean z5 = false;
        for (int i10 = 0; i10 < size; i10++) {
            setVisibility setvisibility4 = arrayList.get(i10);
            if (setvisibility4 instanceof SwipeDismissBehavior) {
                SwipeDismissBehavior swipeDismissBehavior3 = (SwipeDismissBehavior) setvisibility4;
                if (swipeDismissBehavior3.setY == 0) {
                    if (swipeDismissBehavior3.setIconTintList != -1) {
                        int i11 = swipeDismissBehavior3.setIconTintList;
                        zzD zzd4 = swipeDismissBehavior3.setX;
                        zzd4.setY = i11;
                        zzd4.setX = true;
                        swipeDismissBehavior3.ActionMenuPresenter$SavedState$1 = true;
                    } else if (swipeDismissBehavior3.setLineBreakStyle == -1 || !setbuttontintblendmode.setY()) {
                        if (setbuttontintblendmode.setY()) {
                            float f2 = swipeDismissBehavior3.setEmptyView;
                            int i12 = setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setTextScaleX;
                            zzD zzd5 = swipeDismissBehavior3.setX;
                            zzd5.setY = (int) ((f2 * i12) + 0.5f);
                            zzd5.setX = true;
                            swipeDismissBehavior3.ActionMenuPresenter$SavedState$1 = true;
                        }
                    } else {
                        int i13 = (setbuttontintblendmode.setFilterRedundantCalls == 8 ? 0 : setbuttontintblendmode.setTextScaleX) - swipeDismissBehavior3.setLineBreakStyle;
                        zzD zzd6 = swipeDismissBehavior3.setX;
                        zzd6.setY = i13;
                        zzd6.setX = true;
                        swipeDismissBehavior3.ActionMenuPresenter$SavedState$1 = true;
                    }
                    z4 = true;
                }
            } else if (setvisibility4 instanceof zzB) {
                int i14 = ((zzB) setvisibility4).setY;
                if (((i14 == 0 || i14 == 1) ? (char) 0 : (i14 == 2 || i14 == 3) ? (char) 1 : (char) 65535) == 1) {
                    z5 = true;
                }
            }
        }
        if (z4) {
            for (int i15 = 0; i15 < size; i15++) {
                setVisibility setvisibility5 = arrayList.get(i15);
                if (setvisibility5 instanceof SwipeDismissBehavior) {
                    SwipeDismissBehavior swipeDismissBehavior4 = (SwipeDismissBehavior) setvisibility5;
                    if (swipeDismissBehavior4.setY == 0) {
                        MenuHostHelper$$ExternalSyntheticLambda1(1, swipeDismissBehavior4, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
                    }
                }
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda1(0, setbuttontintblendmode, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
        if (z5) {
            for (int i16 = 0; i16 < size; i16++) {
                setVisibility setvisibility6 = arrayList.get(i16);
                if (setvisibility6 instanceof zzB) {
                    zzB zzb2 = (zzB) setvisibility6;
                    int i17 = zzb2.setY;
                    if (((i17 == 0 || i17 == 1) ? (char) 0 : (i17 == 2 || i17 == 3) ? (char) 1 : (char) 65535) == 1 && zzb2.MenuHostHelper$$ExternalSyntheticLambda0()) {
                        MenuHostHelper$$ExternalSyntheticLambda1(1, zzb2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
                    }
                }
            }
        }
        for (int i18 = 0; i18 < size; i18++) {
            setVisibility setvisibility7 = arrayList.get(i18);
            if ((setvisibility7.setImageTintMode && setvisibility7.setFilterRedundantCalls != 8) && setX(setvisibility7)) {
                setButtonTintBlendMode.setX(setvisibility7, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, MenuHostHelper$$ExternalSyntheticLambda0, 0);
                if (!(setvisibility7 instanceof SwipeDismissBehavior)) {
                    setX(0, setvisibility7, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
                    MenuHostHelper$$ExternalSyntheticLambda1(0, setvisibility7, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
                } else if (((SwipeDismissBehavior) setvisibility7).setY == 0) {
                    MenuHostHelper$$ExternalSyntheticLambda1(0, setvisibility7, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
                } else {
                    setX(0, setvisibility7, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, z);
                }
            }
        }
    }

    private static void MenuHostHelper$$ExternalSyntheticLambda1(int i, setVisibility setvisibility, setShowingForActionMode$MenuHostHelper$$ExternalSyntheticLambda1 setshowingforactionmode_menuhosthelper__externalsyntheticlambda1) {
        if (setvisibility.setSubmitButtonEnabled) {
            return;
        }
        setIconTintList++;
        int i2 = 0;
        if (!(setvisibility instanceof setButtonTintBlendMode)) {
            if ((setvisibility.setImageTintMode && setvisibility.setFilterRedundantCalls != 8) && setX(setvisibility)) {
                setButtonTintBlendMode.setX(setvisibility, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, new setShowingForActionMode.setX(), 0);
            }
        }
        zzD MenuHostHelper$$ExternalSyntheticLambda12 = setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.TOP);
        zzD MenuHostHelper$$ExternalSyntheticLambda13 = setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BOTTOM);
        int i3 = !MenuHostHelper$$ExternalSyntheticLambda12.setX ? 0 : MenuHostHelper$$ExternalSyntheticLambda12.setY;
        int i4 = !MenuHostHelper$$ExternalSyntheticLambda13.setX ? 0 : MenuHostHelper$$ExternalSyntheticLambda13.setY;
        if (MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda12.setX) {
            Iterator<zzD> it = MenuHostHelper$$ExternalSyntheticLambda12.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
            while (it.hasNext()) {
                zzD next = it.next();
                setVisibility setvisibility2 = next.setIconTintList;
                int i5 = i + 1;
                boolean x = setX(setvisibility2);
                if ((setvisibility2.setImageTintMode && setvisibility2.setFilterRedundantCalls != 8) && x) {
                    setButtonTintBlendMode.setX(setvisibility2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, new setShowingForActionMode.setX(), i2);
                }
                boolean z = (next == setvisibility2.setChipSpacingVertical && setvisibility2.setIconSize.setLayoutAnimation != null && setvisibility2.setIconSize.setLayoutAnimation.setX) || (next == setvisibility2.setIconSize && setvisibility2.setChipSpacingVertical.setLayoutAnimation != null && setvisibility2.setChipSpacingVertical.setLayoutAnimation.setX);
                if (setvisibility2.setHasDecor[1] == setVisibility.setX.MATCH_CONSTRAINT && !x) {
                    if (setvisibility2.setHasDecor[1] == setVisibility.setX.MATCH_CONSTRAINT && setvisibility2.FloatingActionButton$BaseBehavior >= 0 && setvisibility2.setAdapter >= 0 && ((setvisibility2.setFilterRedundantCalls == 8 || (setvisibility2.FragmentStateAdapter$2 == 0 && setvisibility2.setZ == 0.0f)) && !setvisibility2.setTextScaleX() && !setvisibility2.setCheckedIconEnabled && z && !setvisibility2.setTextScaleX())) {
                        setIconTintList(i5, setvisibility, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setvisibility2);
                    }
                } else {
                    if (!(setvisibility2.setImageTintMode && setvisibility2.setFilterRedundantCalls != 8)) {
                        if (next == setvisibility2.setChipSpacingVertical && setvisibility2.setIconSize.setLayoutAnimation == null) {
                            int MenuHostHelper$$ExternalSyntheticLambda02 = setvisibility2.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda0() + i3;
                            setvisibility2.setX(MenuHostHelper$$ExternalSyntheticLambda02, (setvisibility2.setFilterRedundantCalls == 8 ? 0 : setvisibility2.setTextScaleX) + MenuHostHelper$$ExternalSyntheticLambda02);
                            MenuHostHelper$$ExternalSyntheticLambda1(i5, setvisibility2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
                        } else if (next == setvisibility2.setIconSize && setvisibility2.setChipSpacingVertical.setLayoutAnimation == null) {
                            int MenuHostHelper$$ExternalSyntheticLambda03 = i3 - setvisibility2.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0();
                            setvisibility2.setX(MenuHostHelper$$ExternalSyntheticLambda03 - (setvisibility2.setFilterRedundantCalls == 8 ? 0 : setvisibility2.setTextScaleX), MenuHostHelper$$ExternalSyntheticLambda03);
                            MenuHostHelper$$ExternalSyntheticLambda1(i5, setvisibility2, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
                        } else if (z && !setvisibility2.setTextScaleX()) {
                            setX(i5, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setvisibility2);
                        }
                    }
                }
                i2 = 0;
            }
        }
        if (setvisibility instanceof SwipeDismissBehavior) {
            return;
        }
        if (MenuHostHelper$$ExternalSyntheticLambda13.MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda13.setX) {
            Iterator<zzD> it2 = MenuHostHelper$$ExternalSyntheticLambda13.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
            while (it2.hasNext()) {
                zzD next2 = it2.next();
                setVisibility setvisibility3 = next2.setIconTintList;
                int i6 = i + 1;
                boolean x2 = setX(setvisibility3);
                if ((setvisibility3.setImageTintMode && setvisibility3.setFilterRedundantCalls != 8) && x2) {
                    setButtonTintBlendMode.setX(setvisibility3, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, new setShowingForActionMode.setX(), 0);
                }
                boolean z2 = (next2 == setvisibility3.setChipSpacingVertical && setvisibility3.setIconSize.setLayoutAnimation != null && setvisibility3.setIconSize.setLayoutAnimation.setX) || (next2 == setvisibility3.setIconSize && setvisibility3.setChipSpacingVertical.setLayoutAnimation != null && setvisibility3.setChipSpacingVertical.setLayoutAnimation.setX);
                if (setvisibility3.setHasDecor[1] == setVisibility.setX.MATCH_CONSTRAINT && !x2) {
                    if (setvisibility3.setHasDecor[1] == setVisibility.setX.MATCH_CONSTRAINT && setvisibility3.FloatingActionButton$BaseBehavior >= 0 && setvisibility3.setAdapter >= 0 && (setvisibility3.setFilterRedundantCalls == 8 || (setvisibility3.FragmentStateAdapter$2 == 0 && setvisibility3.setZ == 0.0f))) {
                        if (!setvisibility3.setTextScaleX() && !setvisibility3.setCheckedIconEnabled && z2 && !setvisibility3.setTextScaleX()) {
                            setIconTintList(i6, setvisibility, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setvisibility3);
                        }
                    }
                } else {
                    if (!(setvisibility3.setImageTintMode && setvisibility3.setFilterRedundantCalls != 8)) {
                        if (next2 == setvisibility3.setChipSpacingVertical && setvisibility3.setIconSize.setLayoutAnimation == null) {
                            int MenuHostHelper$$ExternalSyntheticLambda04 = setvisibility3.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda0() + i4;
                            setvisibility3.setX(MenuHostHelper$$ExternalSyntheticLambda04, (setvisibility3.setFilterRedundantCalls == 8 ? 0 : setvisibility3.setTextScaleX) + MenuHostHelper$$ExternalSyntheticLambda04);
                            MenuHostHelper$$ExternalSyntheticLambda1(i6, setvisibility3, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
                        } else if (next2 == setvisibility3.setIconSize && setvisibility3.setChipSpacingVertical.setLayoutAnimation == null) {
                            int MenuHostHelper$$ExternalSyntheticLambda05 = i4 - setvisibility3.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0();
                            setvisibility3.setX(MenuHostHelper$$ExternalSyntheticLambda05 - (setvisibility3.setFilterRedundantCalls == 8 ? 0 : setvisibility3.setTextScaleX), MenuHostHelper$$ExternalSyntheticLambda05);
                            MenuHostHelper$$ExternalSyntheticLambda1(i6, setvisibility3, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
                        } else if (z2 && !setvisibility3.setTextScaleX()) {
                            setX(i6, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, setvisibility3);
                        }
                    }
                }
            }
        }
        zzD MenuHostHelper$$ExternalSyntheticLambda14 = setvisibility.MenuHostHelper$$ExternalSyntheticLambda1(zzD$MenuHostHelper$$ExternalSyntheticLambda0.BASELINE);
        if (MenuHostHelper$$ExternalSyntheticLambda14.MenuHostHelper$$ExternalSyntheticLambda0 != null && MenuHostHelper$$ExternalSyntheticLambda14.setX) {
            int i7 = !MenuHostHelper$$ExternalSyntheticLambda14.setX ? 0 : MenuHostHelper$$ExternalSyntheticLambda14.setY;
            Iterator<zzD> it3 = MenuHostHelper$$ExternalSyntheticLambda14.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
            while (it3.hasNext()) {
                zzD next3 = it3.next();
                setVisibility setvisibility4 = next3.setIconTintList;
                int i8 = i + 1;
                boolean x3 = setX(setvisibility4);
                if ((setvisibility4.setImageTintMode && setvisibility4.setFilterRedundantCalls != 8) && x3) {
                    setButtonTintBlendMode.setX(setvisibility4, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1, new setShowingForActionMode.setX(), 0);
                }
                if (setvisibility4.setHasDecor[1] != setVisibility.setX.MATCH_CONSTRAINT || x3) {
                    if (!(setvisibility4.setImageTintMode && setvisibility4.setFilterRedundantCalls != 8) && next3 == setvisibility4.ViewPager$SavedState$1) {
                        setvisibility4.MenuHostHelper$$ExternalSyntheticLambda0(next3.MenuHostHelper$$ExternalSyntheticLambda0() + i7);
                        MenuHostHelper$$ExternalSyntheticLambda1(i8, setvisibility4, setshowingforactionmode_menuhosthelper__externalsyntheticlambda1);
                    }
                }
            }
        }
        setvisibility.setSubmitButtonEnabled = true;
    }
}