package o;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import o.setTabContainer;

/* loaded from: classes.dex */
public class setTabContainer extends Spinner {
    private static final int[] setIconTintList = {16843505};
    private onActivityPreStopped MenuHostHelper$$ExternalSyntheticLambda0;
    final Rect MenuHostHelper$$ExternalSyntheticLambda1;
    private final Context setLayoutAnimation;
    private setUiOptions setNavigationOnClickListener;
    private SpinnerAdapter setOnLongClickListener;
    private final boolean setUnboundedRipple;
    int setX;
    private final setChipTextResource setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface setUiOptions {
        int MenuHostHelper$$ExternalSyntheticLambda0();

        void MenuHostHelper$$ExternalSyntheticLambda0(int i);

        void MenuHostHelper$$ExternalSyntheticLambda0(Drawable drawable);

        Drawable MenuHostHelper$$ExternalSyntheticLambda1();

        void MenuHostHelper$$ExternalSyntheticLambda1(int i);

        int a_();

        void setIconTintList();

        void setIconTintList(int i);

        void setIconTintList(int i, int i2);

        void setIconTintList(ListAdapter listAdapter);

        boolean setUnboundedRipple();

        CharSequence setX();

        void setY(CharSequence charSequence);
    }

    @Override // android.widget.AdapterView
    public /* bridge */ /* synthetic */ void setAdapter(SpinnerAdapter spinnerAdapter) {
        setAdapter(spinnerAdapter);
    }

    public setTabContainer(Context context) {
        this(context, null);
    }

    public setTabContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.res_0x7f0403b5);
    }

    public setTabContainer(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public setTabContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r11 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
        r11.recycle();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public setTabContainer(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setTabContainer.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.setLayoutAnimation;
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        if (setuioptions != null) {
            setuioptions.MenuHostHelper$$ExternalSyntheticLambda0(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(setFilterTouchesWhenObscured.setIconTintList(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        if (setuioptions != null) {
            return setuioptions.MenuHostHelper$$ExternalSyntheticLambda1();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        if (setuioptions != null) {
            setuioptions.setIconTintList(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        if (setuioptions != null) {
            return setuioptions.a_();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        if (setuioptions != null) {
            setuioptions.MenuHostHelper$$ExternalSyntheticLambda1(i);
            this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        if (setuioptions != null) {
            return setuioptions.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.setNavigationOnClickListener != null) {
            this.setX = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.setNavigationOnClickListener != null) {
            return this.setX;
        }
        return super.getDropDownWidth();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner
    /* renamed from: setAdapter  reason: avoid collision after fix types in other method */
    public void setAdapter2(SpinnerAdapter spinnerAdapter) {
        if (!this.setUnboundedRipple) {
            this.setOnLongClickListener = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.setNavigationOnClickListener != null) {
            Context context = this.setLayoutAnimation;
            if (context == null) {
                context = getContext();
            }
            this.setNavigationOnClickListener.setIconTintList(new setTabContainer$MenuHostHelper$$ExternalSyntheticLambda1(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        if (setuioptions == null || !setuioptions.setUnboundedRipple()) {
            return;
        }
        this.setNavigationOnClickListener.setIconTintList();
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        onActivityPreStopped onactivityprestopped = this.MenuHostHelper$$ExternalSyntheticLambda0;
        if (onactivityprestopped == null || !onactivityprestopped.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.setNavigationOnClickListener == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), setX(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        if (setuioptions != null) {
            if (setuioptions.setUnboundedRipple()) {
                return true;
            }
            MenuHostHelper$$ExternalSyntheticLambda0();
            return true;
        }
        return super.performClick();
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        if (setuioptions != null) {
            setuioptions.setY(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        return setuioptions != null ? setuioptions.setX() : super.getPrompt();
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setIconTintList(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setY(drawable);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.MenuHostHelper$$ExternalSyntheticLambda0(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setY(mode);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        setChipTextResource setchiptextresource = this.setY;
        if (setchiptextresource != null) {
            setchiptextresource.setX();
        }
    }

    int setX(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i = Math.max(i, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.MenuHostHelper$$ExternalSyntheticLambda1);
            return i + this.MenuHostHelper$$ExternalSyntheticLambda1.left + this.MenuHostHelper$$ExternalSyntheticLambda1.right;
        }
        return i;
    }

    final setUiOptions setX() {
        return this.setNavigationOnClickListener;
    }

    void MenuHostHelper$$ExternalSyntheticLambda0() {
        this.setNavigationOnClickListener.setIconTintList(setY.setX(this), setY.setIconTintList(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation(super.onSaveInstanceState());
        setUiOptions setuioptions = this.setNavigationOnClickListener;
        setlayoutanimation.setX = setuioptions != null && setuioptions.setUnboundedRipple();
        return setlayoutanimation;
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        setLayoutAnimation setlayoutanimation = (setLayoutAnimation) parcelable;
        super.onRestoreInstanceState(setlayoutanimation.getSuperState());
        if (!setlayoutanimation.setX || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.setTabContainer.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                if (!setTabContainer.this.setX().setUnboundedRipple()) {
                    setTabContainer.this.MenuHostHelper$$ExternalSyntheticLambda0();
                }
                ViewTreeObserver viewTreeObserver2 = setTabContainer.this.getViewTreeObserver();
                if (viewTreeObserver2 != null) {
                    setX.setIconTintList(viewTreeObserver2, this);
                }
            }
        });
    }

    /* loaded from: classes.dex */
    public static class setLayoutAnimation extends View.BaseSavedState {
        public static final Parcelable.Creator<setLayoutAnimation> CREATOR = new Parcelable.Creator<setLayoutAnimation>() { // from class: androidx.appcompat.widget.AppCompatSpinner$SavedState$1
            @Override // android.os.Parcelable.Creator
            /* renamed from: setY */
            public setTabContainer.setLayoutAnimation createFromParcel(Parcel parcel) {
                return new setTabContainer.setLayoutAnimation(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: MenuHostHelper$$ExternalSyntheticLambda1 */
            public setTabContainer.setLayoutAnimation[] newArray(int i) {
                return new setTabContainer.setLayoutAnimation[i];
            }
        };
        boolean setX;

        setLayoutAnimation(Parcelable parcelable) {
            super(parcelable);
        }

        public setLayoutAnimation(Parcel parcel) {
            super(parcel);
            this.setX = parcel.readByte() != 0;
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.setX ? (byte) 1 : (byte) 0);
        }
    }

    /* loaded from: classes.dex */
    class setUnboundedRipple extends setAccessibilityTraversalBefore implements setUiOptions {
        ListAdapter MenuHostHelper$$ExternalSyntheticLambda1;
        private CharSequence setLayoutAnimation;
        private int setOnLongClickListener;
        private final Rect setUiOptions;

        public setUnboundedRipple(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.setUiOptions = new Rect();
            setY(setTabContainer.this);
            setIconTintList(true);
            setOnLongClickListener(0);
            MenuHostHelper$$ExternalSyntheticLambda1(new AdapterView.OnItemClickListener() { // from class: o.setTabContainer.setUnboundedRipple.2
                @Override // android.widget.AdapterView.OnItemClickListener
                public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j) {
                    setTabContainer.this.setSelection(i2);
                    if (setTabContainer.this.getOnItemClickListener() != null) {
                        setTabContainer.this.performItemClick(view, i2, setUnboundedRipple.this.MenuHostHelper$$ExternalSyntheticLambda1.getItemId(i2));
                    }
                    setUnboundedRipple.this.setIconTintList();
                }
            });
        }

        @Override // o.setAccessibilityTraversalBefore, o.setTabContainer.setUiOptions
        public void setIconTintList(ListAdapter listAdapter) {
            super.setIconTintList(listAdapter);
            this.MenuHostHelper$$ExternalSyntheticLambda1 = listAdapter;
        }

        @Override // o.setTabContainer.setUiOptions
        public CharSequence setX() {
            return this.setLayoutAnimation;
        }

        @Override // o.setTabContainer.setUiOptions
        public void setY(CharSequence charSequence) {
            this.setLayoutAnimation = charSequence;
        }

        void setUiOptions() {
            int onLongClickListener;
            Drawable MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1();
            int i = 0;
            if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                MenuHostHelper$$ExternalSyntheticLambda1.getPadding(setTabContainer.this.MenuHostHelper$$ExternalSyntheticLambda1);
                i = setTabMode.MenuHostHelper$$ExternalSyntheticLambda0(setTabContainer.this) ? setTabContainer.this.MenuHostHelper$$ExternalSyntheticLambda1.right : -setTabContainer.this.MenuHostHelper$$ExternalSyntheticLambda1.left;
            } else {
                Rect rect = setTabContainer.this.MenuHostHelper$$ExternalSyntheticLambda1;
                setTabContainer.this.MenuHostHelper$$ExternalSyntheticLambda1.right = 0;
                rect.left = 0;
            }
            int paddingLeft = setTabContainer.this.getPaddingLeft();
            int paddingRight = setTabContainer.this.getPaddingRight();
            int width = setTabContainer.this.getWidth();
            if (setTabContainer.this.setX == -2) {
                int x = setTabContainer.this.setX((SpinnerAdapter) this.MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda1());
                int i2 = (setTabContainer.this.getContext().getResources().getDisplayMetrics().widthPixels - setTabContainer.this.MenuHostHelper$$ExternalSyntheticLambda1.left) - setTabContainer.this.MenuHostHelper$$ExternalSyntheticLambda1.right;
                if (x > i2) {
                    x = i2;
                }
                setX(Math.max(x, (width - paddingLeft) - paddingRight));
            } else if (setTabContainer.this.setX == -1) {
                setX((width - paddingLeft) - paddingRight);
            } else {
                setX(setTabContainer.this.setX);
            }
            if (setTabMode.MenuHostHelper$$ExternalSyntheticLambda0(setTabContainer.this)) {
                onLongClickListener = i + (((width - paddingRight) - setOnNavigationItemSelectedListener()) - setOnLongClickListener());
            } else {
                onLongClickListener = i + paddingLeft + setOnLongClickListener();
            }
            MenuHostHelper$$ExternalSyntheticLambda0(onLongClickListener);
        }

        @Override // o.setTabContainer.setUiOptions
        public void setIconTintList(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean unboundedRipple = setUnboundedRipple();
            setUiOptions();
            setNavigationOnClickListener(2);
            super.setLayoutAnimation();
            ListView y = setY();
            y.setChoiceMode(1);
            y.setTextDirection(i);
            setY.setX(y, i2);
            setUnboundedRipple(setTabContainer.this.getSelectedItemPosition());
            if (unboundedRipple || (viewTreeObserver = setTabContainer.this.getViewTreeObserver()) == null) {
                return;
            }
            final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.setTabContainer.setUnboundedRipple.3
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    setUnboundedRipple setunboundedripple = setUnboundedRipple.this;
                    if (!setunboundedripple.setX(setTabContainer.this)) {
                        setUnboundedRipple.this.setIconTintList();
                        return;
                    }
                    setUnboundedRipple.this.setUiOptions();
                    setUnboundedRipple.super.setLayoutAnimation();
                }
            };
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            MenuHostHelper$$ExternalSyntheticLambda0(new PopupWindow.OnDismissListener() { // from class: o.setTabContainer.setUnboundedRipple.1
                @Override // android.widget.PopupWindow.OnDismissListener
                public void onDismiss() {
                    ViewTreeObserver viewTreeObserver2 = setTabContainer.this.getViewTreeObserver();
                    if (viewTreeObserver2 != null) {
                        viewTreeObserver2.removeGlobalOnLayoutListener(onGlobalLayoutListener);
                    }
                }
            });
        }

        boolean setX(View view) {
            return setBaselineAlignBottom.setChipIconTintResource(view) && view.getGlobalVisibleRect(this.setUiOptions);
        }

        @Override // o.setTabContainer.setUiOptions
        public void MenuHostHelper$$ExternalSyntheticLambda1(int i) {
            this.setOnLongClickListener = i;
        }

        public int setOnLongClickListener() {
            return this.setOnLongClickListener;
        }
    }

    /* loaded from: classes.dex */
    static final class setIconTintList {
        /* JADX INFO: Access modifiers changed from: package-private */
        public static void MenuHostHelper$$ExternalSyntheticLambda1(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class setY {
        static int setIconTintList(View view) {
            return view.getTextAlignment();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static void setX(View view, int i) {
            view.setTextAlignment(i);
        }

        static int setX(View view) {
            return view.getTextDirection();
        }
    }

    /* loaded from: classes.dex */
    static final class setX {
        static void setIconTintList(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }
}