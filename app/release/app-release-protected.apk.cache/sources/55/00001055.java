package o;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import o.setExpandedTitleMargin;
import o.setMIndicatorOptions;

/* loaded from: classes.dex */
public final class setTextLocale extends ViewGroup {
    WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 MenuHostHelper$$ExternalSyntheticLambda1;

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public setTextLocale(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public setTextLocale(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    public setTextLocale(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Log.v("Constraints", " ################# init");
        super.setVisibility(8);
    }

    /* loaded from: classes.dex */
    public static class setIconTintList extends setMIndicatorOptions.setIconTintList {
        public float GridLayoutManager;
        public float m;
        public float minusKey;
        public float setCalendarViewShown;
        public float setCallingWorkSourceUid;
        public float setCheckedIconEnabledResource;
        public float setChipTextResource;
        public float setDelayedApplicationOfInitialState;
        public boolean setEdgeEffectFactory;
        public float setExpandedTitleTextColor;
        public float setOnScrollChangeListener;
        public float setOnSeekBarChangeListener;
        public float setRowOrderPreserved;

        public setIconTintList() {
            super(-2, -2);
            this.setCallingWorkSourceUid = 1.0f;
            this.setEdgeEffectFactory = false;
            this.minusKey = 0.0f;
            this.setCheckedIconEnabledResource = 0.0f;
            this.setOnScrollChangeListener = 0.0f;
            this.setExpandedTitleTextColor = 0.0f;
            this.setDelayedApplicationOfInitialState = 1.0f;
            this.setRowOrderPreserved = 1.0f;
            this.setOnSeekBarChangeListener = 0.0f;
            this.setChipTextResource = 0.0f;
            this.setCalendarViewShown = 0.0f;
            this.GridLayoutManager = 0.0f;
            this.m = 0.0f;
        }

        public setIconTintList(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.setCallingWorkSourceUid = 1.0f;
            this.setEdgeEffectFactory = false;
            this.minusKey = 0.0f;
            this.setCheckedIconEnabledResource = 0.0f;
            this.setOnScrollChangeListener = 0.0f;
            this.setExpandedTitleTextColor = 0.0f;
            this.setDelayedApplicationOfInitialState = 1.0f;
            this.setRowOrderPreserved = 1.0f;
            this.setOnSeekBarChangeListener = 0.0f;
            this.setChipTextResource = 0.0f;
            this.setCalendarViewShown = 0.0f;
            this.GridLayoutManager = 0.0f;
            this.m = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setExpandedTitleMargin.setY.AbtRegistrar);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == setExpandedTitleMargin.setY.setErrorShown) {
                    this.setCallingWorkSourceUid = obtainStyledAttributes.getFloat(index, this.setCallingWorkSourceUid);
                } else if (index == setExpandedTitleMargin.setY.setNextFocusDownId) {
                    this.minusKey = obtainStyledAttributes.getFloat(index, this.minusKey);
                    this.setEdgeEffectFactory = true;
                } else if (index == setExpandedTitleMargin.setY.setFrame) {
                    this.setOnScrollChangeListener = obtainStyledAttributes.getFloat(index, this.setOnScrollChangeListener);
                } else if (index == setExpandedTitleMargin.setY.setFabAnchorMode) {
                    this.setExpandedTitleTextColor = obtainStyledAttributes.getFloat(index, this.setExpandedTitleTextColor);
                } else if (index == setExpandedTitleMargin.setY.setMinWidthResource) {
                    this.setCheckedIconEnabledResource = obtainStyledAttributes.getFloat(index, this.setCheckedIconEnabledResource);
                } else if (index == setExpandedTitleMargin.setY.setPrefixTextAppearance) {
                    this.setDelayedApplicationOfInitialState = obtainStyledAttributes.getFloat(index, this.setDelayedApplicationOfInitialState);
                } else if (index == setExpandedTitleMargin.setY.setOnConstraintsChanged) {
                    this.setRowOrderPreserved = obtainStyledAttributes.getFloat(index, this.setRowOrderPreserved);
                } else if (index == setExpandedTitleMargin.setY.setHasNonEmbeddedTabs) {
                    this.setOnSeekBarChangeListener = obtainStyledAttributes.getFloat(index, this.setOnSeekBarChangeListener);
                } else if (index == setExpandedTitleMargin.setY.setStatusBarBackground) {
                    this.setChipTextResource = obtainStyledAttributes.getFloat(index, this.setChipTextResource);
                } else if (index == setExpandedTitleMargin.setY.setStepSize) {
                    this.setCalendarViewShown = obtainStyledAttributes.getFloat(index, this.setCalendarViewShown);
                } else if (index == setExpandedTitleMargin.setY.setHorizontalScrollBarEnabled) {
                    this.GridLayoutManager = obtainStyledAttributes.getFloat(index, this.GridLayoutManager);
                } else if (index == setExpandedTitleMargin.setY.setShortcut) {
                    this.m = obtainStyledAttributes.getFloat(index, this.m);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    protected final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new setMIndicatorOptions.setIconTintList(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new setIconTintList();
    }

    @Override // android.view.ViewGroup
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new setIconTintList(getContext(), attributeSet);
    }
}