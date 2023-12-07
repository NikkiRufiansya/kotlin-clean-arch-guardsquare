package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.HashMap;
import java.util.HashSet;
import o.setExpandedTitleMargin;

/* loaded from: classes.dex */
public class wait extends setLayoutMode {
    private String setZ;
    private int setUiOptions = -1;
    private boolean setTextAppearanceResource = false;
    private float setOnLongClickListener = Float.NaN;
    private float setNavigationOnClickListener = Float.NaN;
    private float setCenterIfNoTextEnabled = Float.NaN;
    private float setTextAlignment = Float.NaN;
    private float ViewPager$SavedState$1 = Float.NaN;
    private float setLayoutAnimation = Float.NaN;
    private float setUnboundedRipple = Float.NaN;
    private float setOnNavigationItemSelectedListener = Float.NaN;
    private float setChipCornerRadius = Float.NaN;
    private float setMaxEms = Float.NaN;
    private float setAnimationFromJson = Float.NaN;
    private float setTextScaleX = Float.NaN;
    private float setLayoutDirection = Float.NaN;
    private float setIconSize = Float.NaN;

    public wait() {
        this.setX = 1;
        this.setY = new HashMap<>();
    }

    @Override // o.setLayoutMode
    public final void setIconTintList(Context context, AttributeSet attributeSet) {
        setIconTintList.setY(this, context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setIndeterminateTintMode));
    }

    @Override // o.setLayoutMode
    public final void MenuHostHelper$$ExternalSyntheticLambda1(HashSet<String> hashSet) {
        if (!Float.isNaN(this.setOnLongClickListener)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.setNavigationOnClickListener)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.setCenterIfNoTextEnabled)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.setTextAlignment)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.ViewPager$SavedState$1)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.setLayoutAnimation)) {
            hashSet.add("transformPivotX");
        }
        if (!Float.isNaN(this.setUnboundedRipple)) {
            hashSet.add("transformPivotY");
        }
        if (!Float.isNaN(this.setAnimationFromJson)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.setTextScaleX)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.setLayoutDirection)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.setOnNavigationItemSelectedListener)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.setChipCornerRadius)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.setMaxEms)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.setIconSize)) {
            hashSet.add("progress");
        }
        if (this.setY.size() > 0) {
            for (String str : this.setY.keySet()) {
                StringBuilder sb = new StringBuilder("CUSTOM,");
                sb.append(str);
                hashSet.add(sb.toString());
            }
        }
    }

    @Override // o.setLayoutMode
    public final void setY(HashMap<String, Integer> hashMap) {
        if (this.setUiOptions == -1) {
            return;
        }
        if (!Float.isNaN(this.setOnLongClickListener)) {
            hashMap.put("alpha", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setNavigationOnClickListener)) {
            hashMap.put("elevation", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setCenterIfNoTextEnabled)) {
            hashMap.put("rotation", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setTextAlignment)) {
            hashMap.put("rotationX", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.ViewPager$SavedState$1)) {
            hashMap.put("rotationY", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setLayoutAnimation)) {
            hashMap.put("transformPivotX", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setUnboundedRipple)) {
            hashMap.put("transformPivotY", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setAnimationFromJson)) {
            hashMap.put("translationX", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setTextScaleX)) {
            hashMap.put("translationY", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setLayoutDirection)) {
            hashMap.put("translationZ", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setOnNavigationItemSelectedListener)) {
            hashMap.put("transitionPathRotate", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setChipCornerRadius)) {
            hashMap.put("scaleX", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setMaxEms)) {
            hashMap.put("scaleY", Integer.valueOf(this.setUiOptions));
        }
        if (!Float.isNaN(this.setIconSize)) {
            hashMap.put("progress", Integer.valueOf(this.setUiOptions));
        }
        if (this.setY.size() > 0) {
            for (String str : this.setY.keySet()) {
                StringBuilder sb = new StringBuilder("CUSTOM,");
                sb.append(str);
                hashMap.put(sb.toString(), Integer.valueOf(this.setUiOptions));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r1.equals("scaleY") == false) goto L154;
     */
    @Override // o.setLayoutMode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void MenuHostHelper$$ExternalSyntheticLambda0(java.util.HashMap<java.lang.String, o.FirebasePerfKtxRegistrar> r6) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wait.MenuHostHelper$$ExternalSyntheticLambda0(java.util.HashMap):void");
    }

    /* loaded from: classes.dex */
    static class setIconTintList {
        private static SparseIntArray setIconTintList;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            setIconTintList = sparseIntArray;
            sparseIntArray.append(setExpandedTitleMargin.setY.setIsHandwritingDelegate, 1);
            setIconTintList.append(setExpandedTitleMargin.setY.RemoteActionCompat, 2);
            setIconTintList.append(setExpandedTitleMargin.setY.onOptionsItemSelected, 4);
            setIconTintList.append(setExpandedTitleMargin.setY.restoreCallingIdentity, 5);
            setIconTintList.append(setExpandedTitleMargin.setY.setTransitionName, 6);
            setIconTintList.append(setExpandedTitleMargin.setY.setContentInsetsRelative, 19);
            setIconTintList.append(setExpandedTitleMargin.setY.setImageMatrix, 20);
            setIconTintList.append(setExpandedTitleMargin.setY.read, 7);
            setIconTintList.append(setExpandedTitleMargin.setY.setStatusBarForegroundColor, 8);
            setIconTintList.append(setExpandedTitleMargin.setY.setTextStartPaddingResource, 9);
            setIconTintList.append(setExpandedTitleMargin.setY.setSupportImageTintList, 10);
            setIconTintList.append(setExpandedTitleMargin.setY.setCheckedIconVisible, 12);
            setIconTintList.append(setExpandedTitleMargin.setY.setCustomView, 13);
            setIconTintList.append(setExpandedTitleMargin.setY.setLineHeight, 14);
            setIconTintList.append(setExpandedTitleMargin.setY.flushPendingCommands, 15);
            setIconTintList.append(setExpandedTitleMargin.setY.setScale, 16);
            setIconTintList.append(setExpandedTitleMargin.setY.setTextMetricsParams, 17);
            setIconTintList.append(setExpandedTitleMargin.setY.setHandwritingBoundsOffsets, 18);
        }

        public static void setY(wait waitVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArray.getIndex(i);
                switch (setIconTintList.get(index)) {
                    case 1:
                        waitVar.setOnLongClickListener = typedArray.getFloat(index, waitVar.setOnLongClickListener);
                        break;
                    case 2:
                        waitVar.setNavigationOnClickListener = typedArray.getDimension(index, waitVar.setNavigationOnClickListener);
                        break;
                    case 3:
                    case 11:
                    default:
                        StringBuilder sb = new StringBuilder("unused attribute 0x");
                        sb.append(Integer.toHexString(index));
                        sb.append("   ");
                        sb.append(setIconTintList.get(index));
                        Log.e("KeyAttribute", sb.toString());
                        break;
                    case 4:
                        waitVar.setCenterIfNoTextEnabled = typedArray.getFloat(index, waitVar.setCenterIfNoTextEnabled);
                        break;
                    case 5:
                        waitVar.setTextAlignment = typedArray.getFloat(index, waitVar.setTextAlignment);
                        break;
                    case 6:
                        waitVar.ViewPager$SavedState$1 = typedArray.getFloat(index, waitVar.ViewPager$SavedState$1);
                        break;
                    case 7:
                        waitVar.setChipCornerRadius = typedArray.getFloat(index, waitVar.setChipCornerRadius);
                        break;
                    case 8:
                        waitVar.setOnNavigationItemSelectedListener = typedArray.getFloat(index, waitVar.setOnNavigationItemSelectedListener);
                        break;
                    case 9:
                        waitVar.setZ = typedArray.getString(index);
                        break;
                    case 10:
                        if (setSubtitle.setIconTintList) {
                            waitVar.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, waitVar.MenuHostHelper$$ExternalSyntheticLambda1);
                            if (waitVar.MenuHostHelper$$ExternalSyntheticLambda1 == -1) {
                                waitVar.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (typedArray.peekValue(index).type == 3) {
                            waitVar.MenuHostHelper$$ExternalSyntheticLambda0 = typedArray.getString(index);
                            break;
                        } else {
                            waitVar.MenuHostHelper$$ExternalSyntheticLambda1 = typedArray.getResourceId(index, waitVar.MenuHostHelper$$ExternalSyntheticLambda1);
                            break;
                        }
                    case 12:
                        waitVar.setIconTintList = typedArray.getInt(index, waitVar.setIconTintList);
                        break;
                    case 13:
                        waitVar.setUiOptions = typedArray.getInteger(index, waitVar.setUiOptions);
                        break;
                    case 14:
                        waitVar.setMaxEms = typedArray.getFloat(index, waitVar.setMaxEms);
                        break;
                    case 15:
                        waitVar.setAnimationFromJson = typedArray.getDimension(index, waitVar.setAnimationFromJson);
                        break;
                    case 16:
                        waitVar.setTextScaleX = typedArray.getDimension(index, waitVar.setTextScaleX);
                        break;
                    case 17:
                        waitVar.setLayoutDirection = typedArray.getDimension(index, waitVar.setLayoutDirection);
                        break;
                    case 18:
                        waitVar.setIconSize = typedArray.getFloat(index, waitVar.setIconSize);
                        break;
                    case 19:
                        waitVar.setLayoutAnimation = typedArray.getDimension(index, waitVar.setLayoutAnimation);
                        break;
                    case 20:
                        waitVar.setUnboundedRipple = typedArray.getDimension(index, waitVar.setUnboundedRipple);
                        break;
                }
            }
        }
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setX(setLayoutMode setlayoutmode) {
        super.setX(setlayoutmode);
        wait waitVar = (wait) setlayoutmode;
        this.setUiOptions = waitVar.setUiOptions;
        this.setTextAppearanceResource = waitVar.setTextAppearanceResource;
        this.setOnLongClickListener = waitVar.setOnLongClickListener;
        this.setNavigationOnClickListener = waitVar.setNavigationOnClickListener;
        this.setCenterIfNoTextEnabled = waitVar.setCenterIfNoTextEnabled;
        this.setTextAlignment = waitVar.setTextAlignment;
        this.ViewPager$SavedState$1 = waitVar.ViewPager$SavedState$1;
        this.setLayoutAnimation = waitVar.setLayoutAnimation;
        this.setUnboundedRipple = waitVar.setUnboundedRipple;
        this.setOnNavigationItemSelectedListener = waitVar.setOnNavigationItemSelectedListener;
        this.setChipCornerRadius = waitVar.setChipCornerRadius;
        this.setMaxEms = waitVar.setMaxEms;
        this.setAnimationFromJson = waitVar.setAnimationFromJson;
        this.setTextScaleX = waitVar.setTextScaleX;
        this.setLayoutDirection = waitVar.setLayoutDirection;
        this.setIconSize = waitVar.setIconSize;
        return this;
    }

    @Override // o.setLayoutMode
    public final setLayoutMode setIconTintList() {
        return new wait().setX((setLayoutMode) this);
    }

    @Override // o.setLayoutMode
    public /* synthetic */ Object clone() {
        return new wait().setX((setLayoutMode) this);
    }
}