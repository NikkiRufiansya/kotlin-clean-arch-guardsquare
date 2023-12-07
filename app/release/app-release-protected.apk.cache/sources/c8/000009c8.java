package o;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.Arrays;
import java.util.HashMap;
import o.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1;
import o.setExpandedTitleMargin;
import o.setMIndicatorOptions;

/* loaded from: classes.dex */
public abstract class setCardBackgroundColor extends View {
    protected int[] MenuHostHelper$$ExternalSyntheticLambda0;
    protected setSoundEffectsEnabled MenuHostHelper$$ExternalSyntheticLambda1;
    public int setIconTintList;
    private boolean setLayoutAnimation;
    private Context setOnLongClickListener;
    private View[] setUiOptions;
    private String setUnboundedRipple;
    private String setX;
    private HashMap<Integer, String> setY;

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    public void setX(setVisibility setvisibility, boolean z) {
    }

    public setCardBackgroundColor(Context context) {
        super(context);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new int[32];
        this.setLayoutAnimation = false;
        this.setUiOptions = null;
        this.setY = new HashMap<>();
        this.setOnLongClickListener = context;
        setY((AttributeSet) null);
    }

    public setCardBackgroundColor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new int[32];
        this.setLayoutAnimation = false;
        this.setUiOptions = null;
        this.setY = new HashMap<>();
        this.setOnLongClickListener = context;
        setY(attributeSet);
    }

    public setCardBackgroundColor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MenuHostHelper$$ExternalSyntheticLambda0 = new int[32];
        this.setLayoutAnimation = false;
        this.setUiOptions = null;
        this.setY = new HashMap<>();
        this.setOnLongClickListener = context;
        setY(attributeSet);
    }

    public void setY(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.setX);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setExpandedTitleMargin.setY.setCenterIfNoTextEnabled) {
                    String string = obtainStyledAttributes.getString(index);
                    this.setX = string;
                    MenuHostHelper$$ExternalSyntheticLambda0(string);
                } else if (index == setExpandedTitleMargin.setY.setChipCornerRadius) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.setUnboundedRipple = string2;
                    setX(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.setX;
        if (str != null) {
            MenuHostHelper$$ExternalSyntheticLambda0(str);
        }
        String str2 = this.setUnboundedRipple;
        if (str2 != null) {
            setX(str2);
        }
    }

    public final int[] MenuHostHelper$$ExternalSyntheticLambda1() {
        return Arrays.copyOf(this.MenuHostHelper$$ExternalSyntheticLambda0, this.setIconTintList);
    }

    public void setReferencedIds(int[] iArr) {
        this.setX = null;
        this.setIconTintList = 0;
        for (int i : iArr) {
            setIconTintList(i);
        }
    }

    private void setIconTintList(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.setIconTintList;
        int[] iArr = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (i2 + 1 > iArr.length) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = Arrays.copyOf(iArr, iArr.length << 1);
        }
        int[] iArr2 = this.MenuHostHelper$$ExternalSyntheticLambda0;
        int i3 = this.setIconTintList;
        iArr2[i3] = i;
        this.setIconTintList = i3 + 1;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof setMIndicatorOptions.setIconTintList) {
            ((setMIndicatorOptions.setIconTintList) layoutParams).setErrorIconTintList = (setVisibility) this.MenuHostHelper$$ExternalSyntheticLambda1;
        }
    }

    private void setIconTintList(String str) {
        if (str == null || str.length() == 0 || this.setOnLongClickListener == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof setMIndicatorOptions) {
            setMIndicatorOptions setmindicatoroptions = (setMIndicatorOptions) getParent();
        }
        int y = setY(trim);
        if (y != 0) {
            this.setY.put(Integer.valueOf(y), trim);
            setIconTintList(y);
            return;
        }
        StringBuilder sb = new StringBuilder("Could not find id of \"");
        sb.append(trim);
        sb.append("\"");
        Log.w("ConstraintHelper", sb.toString());
    }

    private void MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        if (str == null || str.length() == 0 || this.setOnLongClickListener == null) {
            return;
        }
        String trim = str.trim();
        setMIndicatorOptions setmindicatoroptions = getParent() instanceof setMIndicatorOptions ? (setMIndicatorOptions) getParent() : null;
        if (setmindicatoroptions == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = setmindicatoroptions.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = setmindicatoroptions.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof setMIndicatorOptions.setIconTintList) && trim.equals(((setMIndicatorOptions.setIconTintList) layoutParams).ViewPager$SavedState$1)) {
                if (childAt.getId() == -1) {
                    StringBuilder sb = new StringBuilder("to use ConstraintTag view ");
                    sb.append(childAt.getClass().getSimpleName());
                    sb.append(" must have an ID");
                    Log.w("ConstraintHelper", sb.toString());
                } else {
                    setIconTintList(childAt.getId());
                }
            }
        }
    }

    private int setY(String str) {
        setMIndicatorOptions setmindicatoroptions = getParent() instanceof setMIndicatorOptions ? (setMIndicatorOptions) getParent() : null;
        int i = 0;
        if (isInEditMode() && setmindicatoroptions != null) {
            Object x = setmindicatoroptions.setX(str);
            if (x instanceof Integer) {
                i = ((Integer) x).intValue();
            }
        }
        if (i == 0 && setmindicatoroptions != null) {
            i = setY(setmindicatoroptions, str);
        }
        if (i == 0) {
            try {
                i = setExpandedTitleMargin.setX.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.setOnLongClickListener.getResources().getIdentifier(str, "id", this.setOnLongClickListener.getPackageName()) : i;
    }

    private int setY(setMIndicatorOptions setmindicatoroptions, String str) {
        Resources resources;
        String str2;
        if (str == null || setmindicatoroptions == null || (resources = this.setOnLongClickListener.getResources()) == null) {
            return 0;
        }
        int childCount = setmindicatoroptions.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = setmindicatoroptions.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(String str) {
        this.setX = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.setIconTintList = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                setIconTintList(str.substring(i));
                return;
            } else {
                setIconTintList(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    private void setX(String str) {
        this.setUnboundedRipple = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.setIconTintList = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                MenuHostHelper$$ExternalSyntheticLambda1(str.substring(i));
                return;
            } else {
                MenuHostHelper$$ExternalSyntheticLambda1(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setX() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof setMIndicatorOptions)) {
            return;
        }
        setMIndicatorOptions setmindicatoroptions = (setMIndicatorOptions) parent;
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.setIconTintList; i++) {
            View view = setmindicatoroptions.setLayoutDirection.get(this.MenuHostHelper$$ExternalSyntheticLambda0[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final void setX(setMIndicatorOptions setmindicatoroptions) {
        String str;
        int y;
        if (isInEditMode()) {
            MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
        }
        setSoundEffectsEnabled setsoundeffectsenabled = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setsoundeffectsenabled == null) {
            return;
        }
        setsoundeffectsenabled.setNavigationOnClickListener();
        for (int i = 0; i < this.setIconTintList; i++) {
            int i2 = this.MenuHostHelper$$ExternalSyntheticLambda0[i];
            View view = setmindicatoroptions.setLayoutDirection.get(i2);
            if (view == null && (y = setY(setmindicatoroptions, (str = this.setY.get(Integer.valueOf(i2))))) != 0) {
                this.MenuHostHelper$$ExternalSyntheticLambda0[i] = y;
                this.setY.put(Integer.valueOf(y), str);
                view = setmindicatoroptions.setLayoutDirection.get(y);
            }
            if (view != null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0(setmindicatoroptions.MenuHostHelper$$ExternalSyntheticLambda0(view));
            }
        }
        setSoundEffectsEnabled setsoundeffectsenabled2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        setButtonTintBlendMode setbuttontintblendmode = setmindicatoroptions.ExtendableSavedState$1;
        setsoundeffectsenabled2.setUnboundedRipple();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setSoundEffectsEnabled setsoundeffectsenabled, SparseArray<setVisibility> sparseArray) {
        setsoundeffectsenabled.setNavigationOnClickListener();
        for (int i = 0; i < this.setIconTintList; i++) {
            setsoundeffectsenabled.MenuHostHelper$$ExternalSyntheticLambda0(sparseArray.get(this.MenuHostHelper$$ExternalSyntheticLambda0[i]));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View[] MenuHostHelper$$ExternalSyntheticLambda0(setMIndicatorOptions setmindicatoroptions) {
        View[] viewArr = this.setUiOptions;
        if (viewArr == null || viewArr.length != this.setIconTintList) {
            this.setUiOptions = new View[this.setIconTintList];
        }
        for (int i = 0; i < this.setIconTintList; i++) {
            this.setUiOptions[i] = setmindicatoroptions.setLayoutDirection.get(this.MenuHostHelper$$ExternalSyntheticLambda0[i]);
        }
        return this.setUiOptions;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setX setx, setForceApplySystemWindowInsetTop setforceapplysystemwindowinsettop, setMIndicatorOptions.setIconTintList seticontintlist, SparseArray<setVisibility> sparseArray) {
        if (setx.setY.setTitleMarginEnd != null) {
            setReferencedIds(setx.setY.setTitleMarginEnd);
        } else if (setx.setY.FirebaseRemoteConfigKtxRegistrar != null) {
            if (setx.setY.FirebaseRemoteConfigKtxRegistrar.length() > 0) {
                WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1.setIconTintList seticontintlist2 = setx.setY;
                String[] split = setx.setY.FirebaseRemoteConfigKtxRegistrar.split(",");
                getContext();
                int[] iArr = new int[split.length];
                int i = 0;
                for (String str : split) {
                    int y = setY(str.trim());
                    if (y != 0) {
                        iArr[i] = y;
                        i++;
                    }
                }
                if (i != split.length) {
                    iArr = Arrays.copyOf(iArr, i);
                }
                seticontintlist2.setTitleMarginEnd = iArr;
            } else {
                setx.setY.setTitleMarginEnd = null;
            }
        }
        if (setforceapplysystemwindowinsettop != null) {
            setforceapplysystemwindowinsettop.setLineBreakStyle = 0;
            Arrays.fill(setforceapplysystemwindowinsettop.ActionMenuPresenter$SavedState$1, (Object) null);
            if (setx.setY.setTitleMarginEnd != null) {
                for (int i2 = 0; i2 < setx.setY.setTitleMarginEnd.length; i2++) {
                    setVisibility setvisibility = sparseArray.get(setx.setY.setTitleMarginEnd[i2]);
                    if (setvisibility != null) {
                        setforceapplysystemwindowinsettop.MenuHostHelper$$ExternalSyntheticLambda0(setvisibility);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.setX == null) {
            setIconTintList(i);
        }
    }
}