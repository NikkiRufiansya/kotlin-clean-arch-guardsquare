package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import o.ParcelImpl;
import o.setBackgroundTintList;
import o.setBaselineAlignBottom;
import o.setDropDownBackgroundResource;
import o.setForegroundTintMode;
import o.setLogo;
import o.setOverscrollHeader;

/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    private ArrayList<View> MenuHostHelper$$ExternalSyntheticLambda0;
    private ArrayList<View> MenuHostHelper$$ExternalSyntheticLambda1;
    private View.OnApplyWindowInsetsListener setIconTintList;
    public boolean setX;

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    public FragmentContainerView(Context context) {
        super(context);
        this.setX = true;
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.setX = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setLogo.setY.MenuHostHelper$$ExternalSyntheticLambda1);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(setLogo.setY.setY);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            StringBuilder sb = new StringBuilder("FragmentContainerView must be within a FragmentActivity to use ");
            sb.append(str);
            sb.append("=\"");
            sb.append(classAttribute);
            sb.append("\"");
            throw new UnsupportedOperationException(sb.toString());
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, ParcelImpl parcelImpl) {
        super(context, attributeSet);
        setForegroundTintMode setforegroundtintmode;
        String str;
        this.setX = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setLogo.setY.MenuHostHelper$$ExternalSyntheticLambda1);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(setLogo.setY.setY) : classAttribute;
        String string = obtainStyledAttributes.getString(setLogo.setY.setX);
        obtainStyledAttributes.recycle();
        int id = getId();
        setDropDownBackgroundResource findFragmentById = parcelImpl.findFragmentById(id);
        if (classAttribute != null && findFragmentById == null) {
            if (id <= 0) {
                if (string != null) {
                    StringBuilder sb = new StringBuilder(" with tag ");
                    sb.append(string);
                    str = sb.toString();
                } else {
                    str = "";
                }
                StringBuilder sb2 = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
                sb2.append(classAttribute);
                sb2.append(str);
                throw new IllegalStateException(sb2.toString());
            }
            setForegroundTintMode setforegroundtintmode2 = parcelImpl.setUnboundedRipple;
            setDropDownBackgroundResource setdropdownbackgroundresource = parcelImpl.setGuidelinePercent;
            if (setdropdownbackgroundresource != null) {
                ParcelImpl parcelImpl2 = setdropdownbackgroundresource.ViewPager$SavedState$1;
                while (true) {
                    setForegroundTintMode setforegroundtintmode3 = parcelImpl2.setUnboundedRipple;
                    setDropDownBackgroundResource setdropdownbackgroundresource2 = parcelImpl2.setGuidelinePercent;
                    if (setdropdownbackgroundresource2 == null) {
                        break;
                    }
                    parcelImpl2 = setdropdownbackgroundresource2.ViewPager$SavedState$1;
                }
                setforegroundtintmode = parcelImpl2.setTextAlignment;
            } else {
                setforegroundtintmode = parcelImpl.setTextAlignment;
            }
            setDropDownBackgroundResource MenuHostHelper$$ExternalSyntheticLambda1 = setforegroundtintmode.MenuHostHelper$$ExternalSyntheticLambda1(context.getClassLoader(), classAttribute);
            MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList(context, attributeSet, (Bundle) null);
            setBackgroundTintList setbackgroundtintlist = new setBackgroundTintList(parcelImpl);
            setbackgroundtintlist.setAnimationFromJson = true;
            MenuHostHelper$$ExternalSyntheticLambda1.setUnboundedRipple = this;
            setbackgroundtintlist.setIconTintList(getId(), MenuHostHelper$$ExternalSyntheticLambda1, string, 1);
            setbackgroundtintlist.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        for (setOverscrollHeader setoverscrollheader : parcelImpl.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0()) {
            setDropDownBackgroundResource setdropdownbackgroundresource3 = setoverscrollheader.setIconTintList;
            if (setdropdownbackgroundresource3.setLayoutAnimation == getId() && setdropdownbackgroundresource3.setImageTintMode != null && setdropdownbackgroundresource3.setImageTintMode.getParent() == null) {
                setdropdownbackgroundresource3.setUnboundedRipple = this;
                setoverscrollheader.setIconTintList.setUnboundedRipple.addView(setoverscrollheader.setIconTintList.setImageTintMode, setoverscrollheader.MenuHostHelper$$ExternalSyntheticLambda0.setY(setoverscrollheader.setIconTintList));
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.setIconTintList = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsetsCompat iconTintList;
        WindowInsetsCompat x = WindowInsetsCompat.setX(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.setIconTintList;
        if (onApplyWindowInsetsListener != null) {
            iconTintList = WindowInsetsCompat.setX(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            iconTintList = setBaselineAlignBottom.setIconTintList(this, x);
        }
        if (!iconTintList.setLayoutAnimation()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                setBaselineAlignBottom.setX(getChildAt(i), iconTintList);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        if (this.setX && this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            for (int i = 0; i < this.MenuHostHelper$$ExternalSyntheticLambda1.size(); i++) {
                super.drawChild(canvas, this.MenuHostHelper$$ExternalSyntheticLambda1.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList<View> arrayList;
        if (!this.setX || (arrayList = this.MenuHostHelper$$ExternalSyntheticLambda1) == null || arrayList.size() <= 0 || !this.MenuHostHelper$$ExternalSyntheticLambda1.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.add(view);
        }
        super.startViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList<View> arrayList = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.setX = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (ParcelImpl.MenuHostHelper$$ExternalSyntheticLambda1(view) == null) {
            StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(view);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString());
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (ParcelImpl.MenuHostHelper$$ExternalSyntheticLambda1(view) == null) {
            StringBuilder sb = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
            sb.append(view);
            sb.append(" is not associated with a Fragment.");
            throw new IllegalStateException(sb.toString());
        }
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        MenuHostHelper$$ExternalSyntheticLambda0(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        MenuHostHelper$$ExternalSyntheticLambda0(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        MenuHostHelper$$ExternalSyntheticLambda0(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            MenuHostHelper$$ExternalSyntheticLambda0(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            MenuHostHelper$$ExternalSyntheticLambda0(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            MenuHostHelper$$ExternalSyntheticLambda0(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup
    protected final void removeDetachedView(View view, boolean z) {
        if (z) {
            MenuHostHelper$$ExternalSyntheticLambda0(view);
        }
        super.removeDetachedView(view, z);
    }

    private void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        ArrayList<View> arrayList = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda1.add(view);
    }
}