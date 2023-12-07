package o;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
class BottomSheetBehavior$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 {
    private static SparseIntArray setIconTintList;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        setIconTintList = sparseIntArray;
        sparseIntArray.append(setExpandedTitleMargin.setY.setBackgroundTint, 1);
        setIconTintList.append(setExpandedTitleMargin.setY.setOnApplyWindowInsetsListener, 2);
        setIconTintList.append(setExpandedTitleMargin.setY.setHighlights, 4);
        setIconTintList.append(setExpandedTitleMargin.setY.setChipEndPadding, 5);
        setIconTintList.append(setExpandedTitleMargin.setY.setContentPadding, 6);
        setIconTintList.append(setExpandedTitleMargin.setY.getGroupName, 7);
        setIconTintList.append(setExpandedTitleMargin.setY.setContentView, 8);
        setIconTintList.append(setExpandedTitleMargin.setY.LifecycleController$observer$1, 9);
        setIconTintList.append(setExpandedTitleMargin.setY.setStrokeAlpha, 10);
        setIconTintList.append(setExpandedTitleMargin.setY.setVerticalGravity, 12);
        setIconTintList.append(setExpandedTitleMargin.setY.AppBarLayout$BaseBehavior, 13);
        setIconTintList.append(setExpandedTitleMargin.setY.setAllowStacking, 14);
        setIconTintList.append(setExpandedTitleMargin.setY.setErrorIconDrawable, 15);
        setIconTintList.append(setExpandedTitleMargin.setY.setCustomInsertionActionModeCallback, 16);
        setIconTintList.append(setExpandedTitleMargin.setY.setAnimateShowBeforeLayout, 17);
        setIconTintList.append(setExpandedTitleMargin.setY.setCounterOverflowTextColor, 18);
        setIconTintList.append(setExpandedTitleMargin.setY.setWeightSum, 20);
        setIconTintList.append(setExpandedTitleMargin.setY.setImeHintLocales, 21);
        setIconTintList.append(setExpandedTitleMargin.setY.setCompoundDrawableTintMode, 19);
    }

    public static void setY(BottomSheetBehavior$SavedState$1 bottomSheetBehavior$SavedState$1, TypedArray typedArray) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        int i2;
        float f13;
        float f14;
        float f15;
        int indexCount = typedArray.getIndexCount();
        for (int i3 = 0; i3 < indexCount; i3++) {
            int index = typedArray.getIndex(i3);
            switch (setIconTintList.get(index)) {
                case 1:
                    f = bottomSheetBehavior$SavedState$1.setUiOptions;
                    bottomSheetBehavior$SavedState$1.setUiOptions = typedArray.getFloat(index, f);
                    break;
                case 2:
                    f2 = bottomSheetBehavior$SavedState$1.setUnboundedRipple;
                    bottomSheetBehavior$SavedState$1.setUnboundedRipple = typedArray.getDimension(index, f2);
                    break;
                case 3:
                case 11:
                default:
                    StringBuilder sb = new StringBuilder("unused attribute 0x");
                    sb.append(Integer.toHexString(index));
                    sb.append("   ");
                    sb.append(setIconTintList.get(index));
                    Log.e("KeyTimeCycle", sb.toString());
                    break;
                case 4:
                    f3 = bottomSheetBehavior$SavedState$1.setNavigationOnClickListener;
                    bottomSheetBehavior$SavedState$1.setNavigationOnClickListener = typedArray.getFloat(index, f3);
                    break;
                case 5:
                    f4 = bottomSheetBehavior$SavedState$1.setLayoutAnimation;
                    bottomSheetBehavior$SavedState$1.setLayoutAnimation = typedArray.getFloat(index, f4);
                    break;
                case 6:
                    f5 = bottomSheetBehavior$SavedState$1.setChipCornerRadius;
                    bottomSheetBehavior$SavedState$1.setChipCornerRadius = typedArray.getFloat(index, f5);
                    break;
                case 7:
                    f6 = bottomSheetBehavior$SavedState$1.ViewPager$SavedState$1;
                    bottomSheetBehavior$SavedState$1.ViewPager$SavedState$1 = typedArray.getFloat(index, f6);
                    break;
                case 8:
                    f7 = bottomSheetBehavior$SavedState$1.setCenterIfNoTextEnabled;
                    bottomSheetBehavior$SavedState$1.setCenterIfNoTextEnabled = typedArray.getFloat(index, f7);
                    break;
                case 9:
                    bottomSheetBehavior$SavedState$1.setGuidelinePercent = typedArray.getString(index);
                    break;
                case 10:
                    if (setSubtitle.setIconTintList) {
                        bottomSheetBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, bottomSheetBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1);
                        if (bottomSheetBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                            bottomSheetBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        bottomSheetBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                        break;
                    } else {
                        bottomSheetBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, bottomSheetBehavior$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda1);
                        break;
                    }
                case 12:
                    bottomSheetBehavior$SavedState$1.setIconTintList = typedArray.getInt(index, bottomSheetBehavior$SavedState$1.setIconTintList);
                    break;
                case 13:
                    i = bottomSheetBehavior$SavedState$1.setCheckedIconEnabled;
                    bottomSheetBehavior$SavedState$1.setCheckedIconEnabled = typedArray.getInteger(index, i);
                    break;
                case 14:
                    f8 = bottomSheetBehavior$SavedState$1.setIconSize;
                    bottomSheetBehavior$SavedState$1.setIconSize = typedArray.getFloat(index, f8);
                    break;
                case 15:
                    f9 = bottomSheetBehavior$SavedState$1.setTextAlignment;
                    bottomSheetBehavior$SavedState$1.setTextAlignment = typedArray.getDimension(index, f9);
                    break;
                case 16:
                    f10 = bottomSheetBehavior$SavedState$1.setZ;
                    bottomSheetBehavior$SavedState$1.setZ = typedArray.getDimension(index, f10);
                    break;
                case 17:
                    f11 = bottomSheetBehavior$SavedState$1.setTextScaleX;
                    bottomSheetBehavior$SavedState$1.setTextScaleX = typedArray.getDimension(index, f11);
                    break;
                case 18:
                    f12 = bottomSheetBehavior$SavedState$1.setOnLongClickListener;
                    bottomSheetBehavior$SavedState$1.setOnLongClickListener = typedArray.getFloat(index, f12);
                    break;
                case 19:
                    if (typedArray.peekValue(index).type == 3) {
                        bottomSheetBehavior$SavedState$1.setMinAndMaxProgress = typedArray.getString(index);
                        bottomSheetBehavior$SavedState$1.setMaxEms = 7;
                        break;
                    } else {
                        i2 = bottomSheetBehavior$SavedState$1.setMaxEms;
                        bottomSheetBehavior$SavedState$1.setMaxEms = typedArray.getInt(index, i2);
                        break;
                    }
                case 20:
                    f13 = bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener;
                    bottomSheetBehavior$SavedState$1.setOnNavigationItemSelectedListener = typedArray.getFloat(index, f13);
                    break;
                case 21:
                    if (typedArray.peekValue(index).type == 5) {
                        f15 = bottomSheetBehavior$SavedState$1.setAnimationFromJson;
                        bottomSheetBehavior$SavedState$1.setAnimationFromJson = typedArray.getDimension(index, f15);
                        break;
                    } else {
                        f14 = bottomSheetBehavior$SavedState$1.setAnimationFromJson;
                        bottomSheetBehavior$SavedState$1.setAnimationFromJson = typedArray.getFloat(index, f14);
                        break;
                    }
            }
        }
    }
}