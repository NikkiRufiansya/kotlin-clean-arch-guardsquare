package o;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import o.setRendererPriorityPolicy;

/* loaded from: classes.dex */
public class setColumnWidth extends setRendererPriorityPolicy {
    private boolean ViewPager$SavedState$1;
    private int setCenterIfNoTextEnabled;
    boolean setIconSize;
    ArrayList<setRendererPriorityPolicy> setTextAlignment;
    int setUiOptions;

    @Override // o.setRendererPriorityPolicy
    public /* synthetic */ Object clone() {
        return clone();
    }

    public setColumnWidth() {
        this.setTextAlignment = new ArrayList<>();
        this.ViewPager$SavedState$1 = true;
        this.setIconSize = false;
        this.setCenterIfNoTextEnabled = 0;
    }

    public setColumnWidth(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setTextAlignment = new ArrayList<>();
        this.ViewPager$SavedState$1 = true;
        this.setIconSize = false;
        this.setCenterIfNoTextEnabled = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, setChipBackgroundColor.setX);
        setX(setHandwritingBoundsOffsets.setX(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionOrdering", 0, 0));
        obtainStyledAttributes.recycle();
    }

    public final setColumnWidth setX(int i) {
        if (i == 0) {
            this.ViewPager$SavedState$1 = true;
        } else if (i == 1) {
            this.ViewPager$SavedState$1 = false;
        } else {
            StringBuilder sb = new StringBuilder("Invalid parameter for TransitionSet ordering: ");
            sb.append(i);
            throw new AndroidRuntimeException(sb.toString());
        }
        return this;
    }

    @Override // o.setRendererPriorityPolicy
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
    public final setColumnWidth setY(long j) {
        ArrayList<setRendererPriorityPolicy> arrayList;
        super.setY(j);
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 >= 0 && (arrayList = this.setTextAlignment) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.setTextAlignment.get(i).setY(j);
            }
        }
        return this;
    }

    @Override // o.setRendererPriorityPolicy
    /* renamed from: setX */
    public final setColumnWidth MenuHostHelper$$ExternalSyntheticLambda0(TimeInterpolator timeInterpolator) {
        this.setCenterIfNoTextEnabled |= 1;
        ArrayList<setRendererPriorityPolicy> arrayList = this.setTextAlignment;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.setTextAlignment.get(i).MenuHostHelper$$ExternalSyntheticLambda0(timeInterpolator);
            }
        }
        return (setColumnWidth) super.MenuHostHelper$$ExternalSyntheticLambda0(timeInterpolator);
    }

    @Override // o.setRendererPriorityPolicy
    public final void setIconTintList(setSaveEnabled setsaveenabled) {
        super.setIconTintList(setsaveenabled);
        this.setCenterIfNoTextEnabled |= 4;
        if (this.setTextAlignment != null) {
            for (int i = 0; i < this.setTextAlignment.size(); i++) {
                this.setTextAlignment.get(i).setIconTintList(setsaveenabled);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setRendererPriorityPolicy
    public final void setY(ViewGroup viewGroup, setSpannableFactory setspannablefactory, setSpannableFactory setspannablefactory2, ArrayList<WindowInsetsCompat$Impl> arrayList, ArrayList<WindowInsetsCompat$Impl> arrayList2) {
        long layoutAnimation = setLayoutAnimation();
        int size = this.setTextAlignment.size();
        for (int i = 0; i < size; i++) {
            setRendererPriorityPolicy setrendererprioritypolicy = this.setTextAlignment.get(i);
            if (layoutAnimation > 0 && (this.ViewPager$SavedState$1 || i == 0)) {
                long layoutAnimation2 = setrendererprioritypolicy.setLayoutAnimation();
                if (layoutAnimation2 > 0) {
                    setrendererprioritypolicy.setX(layoutAnimation2 + layoutAnimation);
                } else {
                    setrendererprioritypolicy.setX(layoutAnimation);
                }
            }
            setrendererprioritypolicy.setY(viewGroup, setspannablefactory, setspannablefactory2, arrayList, arrayList2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setRendererPriorityPolicy
    public final void setUnboundedRipple() {
        if (this.setTextAlignment.isEmpty()) {
            setOnLongClickListener();
            setX();
            return;
        }
        setBoxBackgroundColor setboxbackgroundcolor = new setBoxBackgroundColor(this) { // from class: o.setColumnWidth$MenuHostHelper$$ExternalSyntheticLambda0
            private setColumnWidth setY;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.setY = this;
            }

            @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
            public final void MenuHostHelper$$ExternalSyntheticLambda1() {
                if (this.setY.setIconSize) {
                    return;
                }
                this.setY.setOnLongClickListener();
                this.setY.setIconSize = true;
            }

            @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
            public final void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy setrendererprioritypolicy) {
                setColumnWidth setcolumnwidth = this.setY;
                setcolumnwidth.setUiOptions--;
                if (this.setY.setUiOptions == 0) {
                    this.setY.setIconSize = false;
                    this.setY.setX();
                }
                setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        };
        Iterator<setRendererPriorityPolicy> it = this.setTextAlignment.iterator();
        while (it.hasNext()) {
            it.next().setY(setboxbackgroundcolor);
        }
        this.setUiOptions = this.setTextAlignment.size();
        if (!this.ViewPager$SavedState$1) {
            for (int i = 1; i < this.setTextAlignment.size(); i++) {
                final setRendererPriorityPolicy setrendererprioritypolicy = this.setTextAlignment.get(i);
                this.setTextAlignment.get(i - 1).setY(new setBoxBackgroundColor() { // from class: o.setColumnWidth.5
                    @Override // o.setBoxBackgroundColor, o.setRendererPriorityPolicy.setIconTintList
                    public final void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy setrendererprioritypolicy2) {
                        setrendererprioritypolicy.setUnboundedRipple();
                        setrendererprioritypolicy2.MenuHostHelper$$ExternalSyntheticLambda1(this);
                    }
                });
            }
            setRendererPriorityPolicy setrendererprioritypolicy2 = this.setTextAlignment.get(0);
            if (setrendererprioritypolicy2 != null) {
                setrendererprioritypolicy2.setUnboundedRipple();
                return;
            }
            return;
        }
        Iterator<setRendererPriorityPolicy> it2 = this.setTextAlignment.iterator();
        while (it2.hasNext()) {
            it2.next().setUnboundedRipple();
        }
    }

    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda1(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        if (setY(windowInsetsCompat$Impl.setX)) {
            Iterator<setRendererPriorityPolicy> it = this.setTextAlignment.iterator();
            while (it.hasNext()) {
                setRendererPriorityPolicy next = it.next();
                if (next.setY(windowInsetsCompat$Impl.setX)) {
                    next.MenuHostHelper$$ExternalSyntheticLambda1(windowInsetsCompat$Impl);
                    windowInsetsCompat$Impl.MenuHostHelper$$ExternalSyntheticLambda1.add(next);
                }
            }
        }
    }

    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda0(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        if (setY(windowInsetsCompat$Impl.setX)) {
            Iterator<setRendererPriorityPolicy> it = this.setTextAlignment.iterator();
            while (it.hasNext()) {
                setRendererPriorityPolicy next = it.next();
                if (next.setY(windowInsetsCompat$Impl.setX)) {
                    next.MenuHostHelper$$ExternalSyntheticLambda0(windowInsetsCompat$Impl);
                    windowInsetsCompat$Impl.MenuHostHelper$$ExternalSyntheticLambda1.add(next);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setRendererPriorityPolicy
    public final void setIconTintList(WindowInsetsCompat$Impl windowInsetsCompat$Impl) {
        super.setIconTintList(windowInsetsCompat$Impl);
        int size = this.setTextAlignment.size();
        for (int i = 0; i < size; i++) {
            this.setTextAlignment.get(i).setIconTintList(windowInsetsCompat$Impl);
        }
    }

    @Override // o.setRendererPriorityPolicy
    public final void setIconTintList(View view) {
        super.setIconTintList(view);
        int size = this.setTextAlignment.size();
        for (int i = 0; i < size; i++) {
            this.setTextAlignment.get(i).setIconTintList(view);
        }
    }

    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(view);
        int size = this.setTextAlignment.size();
        for (int i = 0; i < size; i++) {
            this.setTextAlignment.get(i).MenuHostHelper$$ExternalSyntheticLambda0(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda0() {
        super.MenuHostHelper$$ExternalSyntheticLambda0();
        int size = this.setTextAlignment.size();
        for (int i = 0; i < size; i++) {
            this.setTextAlignment.get(i).MenuHostHelper$$ExternalSyntheticLambda0();
        }
    }

    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setActiveIndicatorWidth setactiveindicatorwidth) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(setactiveindicatorwidth);
        this.setCenterIfNoTextEnabled |= 2;
        int size = this.setTextAlignment.size();
        for (int i = 0; i < size; i++) {
            this.setTextAlignment.get(i).MenuHostHelper$$ExternalSyntheticLambda0(setactiveindicatorwidth);
        }
    }

    @Override // o.setRendererPriorityPolicy
    public final void MenuHostHelper$$ExternalSyntheticLambda0(setRendererPriorityPolicy.setY sety) {
        super.MenuHostHelper$$ExternalSyntheticLambda0(sety);
        this.setCenterIfNoTextEnabled |= 8;
        int size = this.setTextAlignment.size();
        for (int i = 0; i < size; i++) {
            this.setTextAlignment.get(i).MenuHostHelper$$ExternalSyntheticLambda0(sety);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setRendererPriorityPolicy
    public final String setY(String str) {
        String y = super.setY(str);
        for (int i = 0; i < this.setTextAlignment.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(y);
            sb.append("\n");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("  ");
            sb.append(this.setTextAlignment.get(i).setY(sb2.toString()));
            y = sb.toString();
        }
        return y;
    }

    @Override // o.setRendererPriorityPolicy
    public final setRendererPriorityPolicy MenuHostHelper$$ExternalSyntheticLambda1() {
        setColumnWidth setcolumnwidth = (setColumnWidth) super.clone();
        setcolumnwidth.setTextAlignment = new ArrayList<>();
        int size = this.setTextAlignment.size();
        for (int i = 0; i < size; i++) {
            setRendererPriorityPolicy clone = this.setTextAlignment.get(i).clone();
            setcolumnwidth.setTextAlignment.add(clone);
            clone.setIconTintList = setcolumnwidth;
        }
        return setcolumnwidth;
    }

    @Override // o.setRendererPriorityPolicy
    public final /* bridge */ /* synthetic */ setRendererPriorityPolicy setY(setRendererPriorityPolicy.setIconTintList seticontintlist) {
        return (setColumnWidth) super.setY(seticontintlist);
    }

    @Override // o.setRendererPriorityPolicy
    public final /* synthetic */ setRendererPriorityPolicy MenuHostHelper$$ExternalSyntheticLambda1(View view) {
        for (int i = 0; i < this.setTextAlignment.size(); i++) {
            this.setTextAlignment.get(i).MenuHostHelper$$ExternalSyntheticLambda1(view);
        }
        return (setColumnWidth) super.MenuHostHelper$$ExternalSyntheticLambda1(view);
    }

    public final setColumnWidth MenuHostHelper$$ExternalSyntheticLambda1(setRendererPriorityPolicy setrendererprioritypolicy) {
        this.setTextAlignment.add(setrendererprioritypolicy);
        setrendererprioritypolicy.setIconTintList = this;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 >= 0) {
            setrendererprioritypolicy.setY(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        if ((this.setCenterIfNoTextEnabled & 1) != 0) {
            setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda0(setUiOptions());
        }
        if ((this.setCenterIfNoTextEnabled & 2) != 0) {
            setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
        }
        if ((this.setCenterIfNoTextEnabled & 4) != 0) {
            setrendererprioritypolicy.setIconTintList(setNavigationOnClickListener());
        }
        if ((this.setCenterIfNoTextEnabled & 8) != 0) {
            setrendererprioritypolicy.MenuHostHelper$$ExternalSyntheticLambda0(setY());
        }
        return this;
    }

    @Override // o.setRendererPriorityPolicy
    public final /* bridge */ /* synthetic */ setRendererPriorityPolicy MenuHostHelper$$ExternalSyntheticLambda1(setRendererPriorityPolicy.setIconTintList seticontintlist) {
        return (setColumnWidth) super.MenuHostHelper$$ExternalSyntheticLambda1(seticontintlist);
    }

    @Override // o.setRendererPriorityPolicy
    public final /* synthetic */ setRendererPriorityPolicy setX(View view) {
        for (int i = 0; i < this.setTextAlignment.size(); i++) {
            this.setTextAlignment.get(i).setX(view);
        }
        return (setColumnWidth) super.setX(view);
    }

    @Override // o.setRendererPriorityPolicy
    public final /* bridge */ /* synthetic */ setRendererPriorityPolicy setX(long j) {
        return (setColumnWidth) super.setX(j);
    }
}