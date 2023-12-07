package o;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setCheckedIconTint extends ListView {
    boolean MenuHostHelper$$ExternalSyntheticLambda0;
    setCheckedIconTint$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1;
    private final Rect ViewPager$SavedState$1;
    private int setChipCornerRadius;
    private int setIconSize;
    private boolean setIconTintList;
    private int setLayoutAnimation;
    private int setNavigationOnClickListener;
    private int setOnLongClickListener;
    private setY setTextAlignment;
    private Field setUiOptions;
    private setCheckedIconGravity setUnboundedRipple;
    private setHeaderDividersEnabled setX;
    private boolean setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setCheckedIconTint(Context context, boolean z) {
        super(context, null, R.attr.res_0x7f040166);
        this.ViewPager$SavedState$1 = new Rect();
        this.setOnLongClickListener = 0;
        this.setIconSize = 0;
        this.setChipCornerRadius = 0;
        this.setNavigationOnClickListener = 0;
        this.setIconTintList = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.setUiOptions = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.setIconTintList && this.MenuHostHelper$$ExternalSyntheticLambda0) || super.isInTouchMode();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.setIconTintList || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.setIconTintList || super.isFocused();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.setIconTintList || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        setY sety = drawable != null ? new setY(drawable) : null;
        this.setTextAlignment = sety;
        super.setSelector(sety);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.setOnLongClickListener = rect.left;
        this.setIconSize = rect.top;
        this.setChipCornerRadius = rect.right;
        this.setNavigationOnClickListener = rect.bottom;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            return;
        }
        super.drawableStateChanged();
        setY sety = this.setTextAlignment;
        if (sety != null) {
            sety.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }
        setY();
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.setLayoutAnimation = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        setCheckedIconTint$MenuHostHelper$$ExternalSyntheticLambda1 setcheckedicontint_menuhosthelper__externalsyntheticlambda1 = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (setcheckedicontint_menuhosthelper__externalsyntheticlambda1 != null) {
            setcheckedicontint_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            setcheckedicontint_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1.removeCallbacks(setcheckedicontint_menuhosthelper__externalsyntheticlambda1);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int setX(int i, int i2, int i3, int i4, int i5) {
        int makeMeasureSpec;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        int i6 = listPaddingTop + listPaddingBottom;
        if (adapter == null) {
            return i6;
        }
        dividerHeight = (dividerHeight <= 0 || divider == null) ? 0 : 0;
        int count = adapter.getCount();
        View view = null;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i7 < count) {
            int itemViewType = adapter.getItemViewType(i7);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i7, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, makeMeasureSpec);
            view.forceLayout();
            if (i7 > 0) {
                i6 += dividerHeight;
            }
            i6 += view.getMeasuredHeight();
            if (i6 >= i4) {
                return (i5 < 0 || i7 <= i5 || i9 <= 0 || i6 == i4) ? i4 : i9;
            }
            if (i5 >= 0 && i7 >= i5) {
                i9 = i6;
            }
            i7++;
        }
        return i6;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY extends setObjectValues {
        boolean MenuHostHelper$$ExternalSyntheticLambda1;

        setY(Drawable drawable) {
            super(drawable);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = true;
        }

        @Override // o.setObjectValues, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // o.setObjectValues, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                super.draw(canvas);
            }
        }

        @Override // o.setObjectValues, android.graphics.drawable.Drawable
        public final void setHotspot(float f, float f2) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                super.setHotspot(f, f2);
            }
        }

        @Override // o.setObjectValues, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                super.setHotspotBounds(i, i2, i3, i4);
            }
        }

        @Override // o.setObjectValues, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z, boolean z2) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
            setCheckedIconTint$MenuHostHelper$$ExternalSyntheticLambda1 setcheckedicontint_menuhosthelper__externalsyntheticlambda1 = new setCheckedIconTint$MenuHostHelper$$ExternalSyntheticLambda1(this);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = setcheckedicontint_menuhosthelper__externalsyntheticlambda1;
            setcheckedicontint_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1.post(setcheckedicontint_menuhosthelper__externalsyntheticlambda1);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition != -1 && pointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (Build.VERSION.SDK_INT >= 30 && setIconTintList.setY()) {
                        setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(this, pointToPosition, childAt);
                    } else {
                        setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                    }
                }
                setY();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r3 != 3) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean setX(android.view.MotionEvent r17, int r18) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setCheckedIconTint.setX(android.view.MotionEvent, int):boolean");
    }

    private void setY() {
        Drawable selector = getSelector();
        if (selector != null && this.setY && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    /* loaded from: classes.dex */
    static class setIconTintList {
        private static boolean MenuHostHelper$$ExternalSyntheticLambda0;
        private static Method MenuHostHelper$$ExternalSyntheticLambda1;
        private static Method setIconTintList;
        private static Method setX;

        static {
            try {
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", Integer.TYPE, View.class, Boolean.TYPE, Float.TYPE, Float.TYPE);
                setIconTintList = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", Integer.TYPE);
                setX = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", Integer.TYPE);
                MenuHostHelper$$ExternalSyntheticLambda1 = declaredMethod3;
                declaredMethod3.setAccessible(true);
                MenuHostHelper$$ExternalSyntheticLambda0 = true;
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        }

        static boolean setY() {
            return MenuHostHelper$$ExternalSyntheticLambda0;
        }

        static void MenuHostHelper$$ExternalSyntheticLambda0(setCheckedIconTint setcheckedicontint, int i, View view) {
            try {
                setIconTintList.invoke(setcheckedicontint, Integer.valueOf(i), view, Boolean.FALSE, -1, -1);
                setX.invoke(setcheckedicontint, Integer.valueOf(i));
                MenuHostHelper$$ExternalSyntheticLambda1.invoke(setcheckedicontint, Integer.valueOf(i));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    /* loaded from: classes.dex */
    static class setX {
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.ViewPager$SavedState$1.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.ViewPager$SavedState$1);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }
}