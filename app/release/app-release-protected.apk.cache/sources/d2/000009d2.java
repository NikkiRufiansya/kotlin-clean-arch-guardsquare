package o;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import o.setBaselineAlignBottom;
import o.setDecorPadding;
import o.setScrollBarDefaultDelayBeforeFade;

/* loaded from: classes.dex */
public class setCheckMarkTintBlendMode extends LinearLayout {
    private static final int setIconTintList = 2132083670;
    private static final String setY = "MaterialButtonToggleGroup";
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public final LinkedHashSet<setIconTintList> MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean ViewPager$SavedState$1;
    private boolean setChipCornerRadius;
    private final setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0 setLayoutAnimation;
    private final Comparator<FabTransformationSheetBehavior> setNavigationOnClickListener;
    private final int setOnLongClickListener;
    private Integer[] setUiOptions;
    private final List<setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1> setUnboundedRipple;
    private Set<Integer> setX;

    /* loaded from: classes.dex */
    public interface setIconTintList {
        void MenuHostHelper$$ExternalSyntheticLambda1(int i, boolean z);
    }

    public setCheckMarkTintBlendMode(Context context) {
        this(context, null);
    }

    public setCheckMarkTintBlendMode(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0402b1);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setCheckMarkTintBlendMode(android.content.Context r10, android.util.AttributeSet r11, int r12) {
        /*
            r9 = this;
            int r6 = o.setCheckMarkTintBlendMode.setIconTintList
            android.content.Context r10 = o.C0501u.MenuHostHelper$$ExternalSyntheticLambda0(r10, r11, r12, r6)
            r9.<init>(r10, r11, r12)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r9.setUnboundedRipple = r10
            o.setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0 r10 = new o.setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda0
            r7 = 0
            r10.<init>(r9, r7)
            r9.setLayoutAnimation = r10
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            r9.MenuHostHelper$$ExternalSyntheticLambda1 = r10
            o.setCheckMarkTintBlendMode$2 r10 = new o.setCheckMarkTintBlendMode$2
            r10.<init>()
            r9.setNavigationOnClickListener = r10
            r9.MenuHostHelper$$ExternalSyntheticLambda0 = r7
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            r9.setX = r10
            android.content.Context r10 = r9.getContext()
            int[] r8 = o.setIconTint.setIconTintList.setLayoutDirection
            int[] r5 = new int[r7]
            o.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(r10, r11, r12, r6)
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r12
            r4 = r6
            o.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior.setY(r0, r1, r2, r3, r4, r5)
            android.content.res.TypedArray r10 = r10.obtainStyledAttributes(r11, r8, r12, r6)
            r11 = 2
            boolean r11 = r10.getBoolean(r11, r7)
            r9.setSingleSelection(r11)
            r11 = -1
            int r11 = r10.getResourceId(r7, r11)
            r9.setOnLongClickListener = r11
            r11 = 1
            boolean r12 = r10.getBoolean(r11, r7)
            r9.ViewPager$SavedState$1 = r12
            r9.setChildrenDrawingOrderEnabled(r11)
            r10.recycle()
            o.setBaselineAlignBottom.setUnboundedRipple(r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCheckMarkTintBlendMode.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i = this.setOnLongClickListener;
        if (i != -1) {
            MenuHostHelper$$ExternalSyntheticLambda1(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        int iconTintList;
        if (!(view instanceof FabTransformationSheetBehavior)) {
            Log.e(setY, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        FabTransformationSheetBehavior fabTransformationSheetBehavior = (FabTransformationSheetBehavior) view;
        if (fabTransformationSheetBehavior.getId() == -1) {
            iconTintList = setBaselineAlignBottom.setX.setIconTintList();
            fabTransformationSheetBehavior.setId(iconTintList);
        }
        fabTransformationSheetBehavior.setMaxLines(1);
        fabTransformationSheetBehavior.setEllipsize(TextUtils.TruncateAt.END);
        fabTransformationSheetBehavior.setCheckable(true);
        fabTransformationSheetBehavior.MenuHostHelper$$ExternalSyntheticLambda0 = this.setLayoutAnimation;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = fabTransformationSheetBehavior.setY;
        if ((lifecycleCoroutineScopeImpl == null || lifecycleCoroutineScopeImpl.setY) ? false : true) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = fabTransformationSheetBehavior.setY;
            lifecycleCoroutineScopeImpl2.setAnimationFromJson = true;
            lifecycleCoroutineScopeImpl2.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        MenuHostHelper$$ExternalSyntheticLambda0(fabTransformationSheetBehavior.getId(), fabTransformationSheetBehavior.isChecked());
        setScrollBarDefaultDelayBeforeFade iconTintList2 = fabTransformationSheetBehavior.setIconTintList();
        this.setUnboundedRipple.add(new setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1(iconTintList2.setCenterIfNoTextEnabled, iconTintList2.setX, iconTintList2.setChipCornerRadius, iconTintList2.setUnboundedRipple));
        setBaselineAlignBottom.setX(fabTransformationSheetBehavior, new setCounterOverflowTextColor() { // from class: o.setCheckMarkTintBlendMode.3
            @Override // o.setCounterOverflowTextColor
            public final void setY(View view2, setDecorPadding setdecorpadding) {
                int i2;
                super.setY(view2, setdecorpadding);
                setCheckMarkTintBlendMode setcheckmarktintblendmode = setCheckMarkTintBlendMode.this;
                if (view2 instanceof FabTransformationSheetBehavior) {
                    int i3 = 0;
                    for (int i4 = 0; i4 < setcheckmarktintblendmode.getChildCount(); i4++) {
                        if (setcheckmarktintblendmode.getChildAt(i4) == view2) {
                            i2 = i3;
                            break;
                        }
                        if (setcheckmarktintblendmode.getChildAt(i4) instanceof FabTransformationSheetBehavior) {
                            if (setcheckmarktintblendmode.getChildAt(i4).getVisibility() != 8) {
                                i3++;
                            }
                        }
                    }
                }
                i2 = -1;
                setdecorpadding.setY(setDecorPadding.setY.MenuHostHelper$$ExternalSyntheticLambda0(0, 1, i2, 1, false, ((FabTransformationSheetBehavior) view2).isChecked()));
            }
        });
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof FabTransformationSheetBehavior) {
            ((FabTransformationSheetBehavior) view).MenuHostHelper$$ExternalSyntheticLambda0 = null;
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.setUnboundedRipple.remove(indexOfChild);
        }
        setX();
        MenuHostHelper$$ExternalSyntheticLambda0();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        setX();
        MenuHostHelper$$ExternalSyntheticLambda0();
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        setDecorPadding y = setDecorPadding.setY(accessibilityNodeInfo);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= getChildCount()) {
                break;
            }
            if (getChildAt(i) instanceof FabTransformationSheetBehavior) {
                if (getChildAt(i).getVisibility() != 8) {
                    i2++;
                }
            }
            i++;
        }
        y.setX(setDecorPadding.setX.setIconTintList(1, i2, false, this.setChipCornerRadius ? 1 : 2));
    }

    public void setSingleSelection(boolean z) {
        if (this.setChipCornerRadius != z) {
            this.setChipCornerRadius = z;
            MenuHostHelper$$ExternalSyntheticLambda1(new HashSet());
        }
    }

    public void setSelectionRequired(boolean z) {
        this.ViewPager$SavedState$1 = z;
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }

    private void setX() {
        int childCount = getChildCount();
        int MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
        int y = setY();
        for (int i = 0; i < childCount; i++) {
            FabTransformationSheetBehavior fabTransformationSheetBehavior = (FabTransformationSheetBehavior) getChildAt(i);
            if (fabTransformationSheetBehavior.getVisibility() != 8) {
                setScrollBarDefaultDelayBeforeFade.setY sety = new setScrollBarDefaultDelayBeforeFade.setY(fabTransformationSheetBehavior.setIconTintList());
                setX(sety, setY(i, MenuHostHelper$$ExternalSyntheticLambda1, y));
                fabTransformationSheetBehavior.setShapeAppearanceModel(new setScrollBarDefaultDelayBeforeFade(sety, (byte) 0));
            }
        }
    }

    private int MenuHostHelper$$ExternalSyntheticLambda1() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (getChildAt(i).getVisibility() != 8) {
                return i;
            }
        }
        return -1;
    }

    private int setY() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (getChildAt(childCount).getVisibility() != 8) {
                return childCount;
            }
        }
        return -1;
    }

    private setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1 setY(int i, int i2, int i3) {
        setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1 setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1;
        int x;
        int x2;
        setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1 setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12 = this.setUnboundedRipple.get(i);
        if (i2 == i3) {
            return setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12;
        }
        boolean z = getOrientation() == 0;
        if (i == i2) {
            if (z) {
                x2 = setBaselineAlignBottom.setX.setX(this);
                if (x2 == 1) {
                    setImageURI setimageuri = setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1.setX;
                    return new setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1(setimageuri, setimageuri, setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0, setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.setIconTintList);
                }
                setImageURI setimageuri2 = setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.setY;
                setImageURI setimageuri3 = setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1;
                setImageURI setimageuri4 = setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1.setX;
                return new setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1(setimageuri2, setimageuri3, setimageuri4, setimageuri4);
            }
            setImageURI setimageuri5 = setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.setY;
            setImageURI setimageuri6 = setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1.setX;
            return new setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1(setimageuri5, setimageuri6, setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0, setimageuri6);
        } else if (i == i3) {
            if (z) {
                x = setBaselineAlignBottom.setX.setX(this);
                if (x == 1) {
                    setImageURI setimageuri7 = setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.setY;
                    setImageURI setimageuri8 = setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1;
                    setImageURI setimageuri9 = setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1.setX;
                    return new setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1(setimageuri7, setimageuri8, setimageuri9, setimageuri9);
                }
                setImageURI setimageuri10 = setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1.setX;
                setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1 = new setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1(setimageuri10, setimageuri10, setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda0, setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.setIconTintList);
            } else {
                setImageURI setimageuri11 = setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1.setX;
                setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1 = new setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1(setimageuri11, setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.MenuHostHelper$$ExternalSyntheticLambda1, setimageuri11, setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda12.setIconTintList);
            }
            return setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1;
        } else {
            return null;
        }
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0(int i, boolean z) {
        if (i == -1) {
            String str = setY;
            StringBuilder sb = new StringBuilder("Button ID is not valid: ");
            sb.append(i);
            Log.e(str, sb.toString());
            return;
        }
        HashSet hashSet = new HashSet(this.setX);
        if (z && !hashSet.contains(Integer.valueOf(i))) {
            if (this.setChipCornerRadius && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else if (z || !hashSet.contains(Integer.valueOf(i))) {
            return;
        } else {
            if (!this.ViewPager$SavedState$1 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        MenuHostHelper$$ExternalSyntheticLambda1(hashSet);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(Set<Integer> set) {
        Set<Integer> set2 = this.setX;
        this.setX = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((FabTransformationSheetBehavior) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof FabTransformationSheetBehavior) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
                ((FabTransformationSheetBehavior) findViewById).setChecked(contains);
                this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            }
            if (set2.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                setIconTintList(id, set.contains(Integer.valueOf(id)));
            }
        }
        invalidate();
    }

    private void setIconTintList(int i, boolean z) {
        Iterator<setIconTintList> it = this.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
        while (it.hasNext()) {
            it.next().MenuHostHelper$$ExternalSyntheticLambda1(i, z);
        }
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.setUiOptions;
        if (numArr == null || i2 >= numArr.length) {
            Log.w(setY, "Child order wasn't updated");
            return i2;
        }
        return numArr[i2].intValue();
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0() {
        LinearLayout.LayoutParams layoutParams;
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                i = -1;
                break;
            }
            if (getChildAt(i).getVisibility() != 8) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return;
        }
        for (int i2 = i + 1; i2 < getChildCount(); i2++) {
            FabTransformationSheetBehavior fabTransformationSheetBehavior = (FabTransformationSheetBehavior) getChildAt(i2);
            int min = Math.min(fabTransformationSheetBehavior.MenuHostHelper$$ExternalSyntheticLambda0(), ((FabTransformationSheetBehavior) getChildAt(i2 - 1)).MenuHostHelper$$ExternalSyntheticLambda0());
            ViewGroup.LayoutParams layoutParams2 = fabTransformationSheetBehavior.getLayoutParams();
            if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                layoutParams = (LinearLayout.LayoutParams) layoutParams2;
            } else {
                layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
            }
            if (getOrientation() == 0) {
                setImeHintLocales.setX(layoutParams, 0);
                setImeHintLocales.setIconTintList(layoutParams, -min);
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = 0;
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = 0;
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = -min;
                setImeHintLocales.setIconTintList(layoutParams, 0);
            }
            fabTransformationSheetBehavior.setLayoutParams(layoutParams);
        }
        if (getChildCount() == 0 || i == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((FabTransformationSheetBehavior) getChildAt(i)).getLayoutParams();
        if (getOrientation() == 1) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = 0;
            return;
        }
        setImeHintLocales.setX(layoutParams3, 0);
        setImeHintLocales.setIconTintList(layoutParams3, 0);
        ((ViewGroup.MarginLayoutParams) layoutParams3).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = 0;
    }

    private static void setX(setScrollBarDefaultDelayBeforeFade.setY sety, setCheckMarkTintBlendMode$MenuHostHelper$$ExternalSyntheticLambda1 setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1) {
        if (setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1 == null) {
            sety.setNavigationOnClickListener = new setActionBarVisibilityCallback(0.0f);
            sety.ViewPager$SavedState$1 = new setActionBarVisibilityCallback(0.0f);
            sety.setIconTintList = new setActionBarVisibilityCallback(0.0f);
            sety.setY = new setActionBarVisibilityCallback(0.0f);
            return;
        }
        sety.setNavigationOnClickListener = setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1.setY;
        sety.setY = setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1;
        sety.ViewPager$SavedState$1 = setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0;
        sety.setIconTintList = setcheckmarktintblendmode_menuhosthelper__externalsyntheticlambda1.setIconTintList;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.setNavigationOnClickListener);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((FabTransformationSheetBehavior) getChildAt(i), Integer.valueOf(i));
        }
        this.setUiOptions = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }
}