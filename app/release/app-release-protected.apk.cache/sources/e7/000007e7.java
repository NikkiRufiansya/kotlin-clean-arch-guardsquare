package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
public class onContextItemSelected extends setScrollbarFadingEnabled {
    String ViewPager$SavedState$1 = null;
    int setLayoutAnimation = -1;
    int setNavigationOnClickListener = 0;
    float setChipCornerRadius = Float.NaN;
    float setUnboundedRipple = Float.NaN;
    float setIconSize = Float.NaN;
    float setCenterIfNoTextEnabled = Float.NaN;
    float setOnLongClickListener = Float.NaN;
    float setUiOptions = Float.NaN;
    int setTextAlignment = 0;
    private float setTextScaleX = Float.NaN;
    private float setZ = Float.NaN;

    @Override // o.setLayoutMode
    public final void MenuHostHelper$$ExternalSyntheticLambda0(HashMap<String, FirebasePerfKtxRegistrar> hashMap) {
    }

    public onContextItemSelected() {
        this.setX = 2;
    }

    @Override // o.setLayoutMode
    public final void setIconTintList(Context context, AttributeSet attributeSet) {
        setY.setY(this, context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setListSelection));
    }

    /* loaded from: classes.dex */
    static class setY {
        private static SparseIntArray setX;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            setX = sparseIntArray;
            sparseIntArray.append(setExpandedTitleMargin.setY.setRenderMode, 1);
            setX.append(setExpandedTitleMargin.setY.setItemAnimator, 2);
            setX.append(setExpandedTitleMargin.setY.setMarqueeRepeatLimit, 3);
            setX.append(setExpandedTitleMargin.setY.setCustomSelectionActionModeCallback, 4);
            setX.append(setExpandedTitleMargin.setY.preHandler, 5);
            setX.append(setExpandedTitleMargin.setY.SingleGeneratedAdapterObserver, 6);
            setX.append(setExpandedTitleMargin.setY.setChipCornerRadiusResource, 7);
            setX.append(setExpandedTitleMargin.setY.dump, 9);
            setX.append(setExpandedTitleMargin.setY.setFastScrollAlwaysVisible, 8);
            setX.append(setExpandedTitleMargin.setY.setOnFitSystemWindowsListener, 11);
            setX.append(setExpandedTitleMargin.setY.findFragmentById, 12);
            setX.append(setExpandedTitleMargin.setY.setEmptyVisibility, 10);
        }

        static /* synthetic */ void setY(onContextItemSelected oncontextitemselected, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (setX.get(index)) {
                    case 1:
                        if (setSubtitle.setIconTintList) {
                            oncontextitemselected.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, oncontextitemselected.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (oncontextitemselected.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                                oncontextitemselected.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            oncontextitemselected.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                            break;
                        } else {
                            oncontextitemselected.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, oncontextitemselected.MenuHostHelper$$ExternalSyntheticLambda1);
                            break;
                        }
                    case 2:
                        oncontextitemselected.setIconTintList = typedArray.getInt(index, oncontextitemselected.setIconTintList);
                        break;
                    case 3:
                        if (typedArray.peekValue(index).type == 3) {
                            oncontextitemselected.ViewPager$SavedState$1 = typedArray.getString(index);
                            break;
                        } else {
                            oncontextitemselected.ViewPager$SavedState$1 = joinThreadPool.setY[typedArray.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        oncontextitemselected.setMaxEms = typedArray.getInteger(index, oncontextitemselected.setMaxEms);
                        break;
                    case 5:
                        oncontextitemselected.setNavigationOnClickListener = typedArray.getInt(index, oncontextitemselected.setNavigationOnClickListener);
                        break;
                    case 6:
                        oncontextitemselected.setIconSize = typedArray.getFloat(index, oncontextitemselected.setIconSize);
                        break;
                    case 7:
                        oncontextitemselected.setCenterIfNoTextEnabled = typedArray.getFloat(index, oncontextitemselected.setCenterIfNoTextEnabled);
                        break;
                    case 8:
                        float f = typedArray.getFloat(index, oncontextitemselected.setUnboundedRipple);
                        oncontextitemselected.setChipCornerRadius = f;
                        oncontextitemselected.setUnboundedRipple = f;
                        break;
                    case 9:
                        oncontextitemselected.setTextAlignment = typedArray.getInt(index, oncontextitemselected.setTextAlignment);
                        break;
                    case 10:
                        oncontextitemselected.setLayoutAnimation = typedArray.getInt(index, oncontextitemselected.setLayoutAnimation);
                        break;
                    case 11:
                        oncontextitemselected.setChipCornerRadius = typedArray.getFloat(index, oncontextitemselected.setChipCornerRadius);
                        break;
                    case 12:
                        oncontextitemselected.setUnboundedRipple = typedArray.getFloat(index, oncontextitemselected.setUnboundedRipple);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(setX.get(index));
                        Log.e("KeyPosition", sb.toString());
                        break;
                }
            }
            if (oncontextitemselected.setIconTintList == -1) {
                Log.e("KeyPosition", "no frame position");
            }
        }
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setX(setLayoutMode setlayoutmode) {
        super.setX(setlayoutmode);
        onContextItemSelected oncontextitemselected = (onContextItemSelected) setlayoutmode;
        this.ViewPager$SavedState$1 = oncontextitemselected.ViewPager$SavedState$1;
        this.setLayoutAnimation = oncontextitemselected.setLayoutAnimation;
        this.setNavigationOnClickListener = oncontextitemselected.setNavigationOnClickListener;
        this.setChipCornerRadius = oncontextitemselected.setChipCornerRadius;
        this.setUnboundedRipple = Float.NaN;
        this.setIconSize = oncontextitemselected.setIconSize;
        this.setCenterIfNoTextEnabled = oncontextitemselected.setCenterIfNoTextEnabled;
        this.setOnLongClickListener = oncontextitemselected.setOnLongClickListener;
        this.setUiOptions = oncontextitemselected.setUiOptions;
        this.setTextScaleX = oncontextitemselected.setTextScaleX;
        this.setZ = oncontextitemselected.setZ;
        return this;
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setIconTintList() {
        return new onContextItemSelected().setX(this);
    }

    @Override // o.setLayoutMode
    public /* synthetic */ Object clone() {
        return new onContextItemSelected().setX(this);
    }
}