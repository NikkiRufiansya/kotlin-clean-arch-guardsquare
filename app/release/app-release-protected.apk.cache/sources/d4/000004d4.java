package o;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class getCallingPid {
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;
    setSelectAllOnFocus setX;
    private Interpolator setY;
    private long setIconTintList = -1;
    private final setCloseIconStartPaddingResource setUnboundedRipple = new setCloseIconStartPaddingResource() { // from class: o.getCallingPid.5
        private boolean MenuHostHelper$$ExternalSyntheticLambda0 = false;
        private int setIconTintList = 0;

        @Override // o.setCloseIconStartPaddingResource, o.setSelectAllOnFocus
        public void setX(View view) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                return;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            if (getCallingPid.this.setX != null) {
                getCallingPid.this.setX.setX(null);
            }
        }

        void setY() {
            this.setIconTintList = 0;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
            getCallingPid.this.setIconTintList();
        }

        @Override // o.setCloseIconStartPaddingResource, o.setSelectAllOnFocus
        public void MenuHostHelper$$ExternalSyntheticLambda0(View view) {
            int i = this.setIconTintList + 1;
            this.setIconTintList = i;
            if (i == getCallingPid.this.MenuHostHelper$$ExternalSyntheticLambda1.size()) {
                if (getCallingPid.this.setX != null) {
                    getCallingPid.this.setX.MenuHostHelper$$ExternalSyntheticLambda0(null);
                }
                setY();
            }
        }
    };
    final ArrayList<setHeaderDividersEnabled> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();

    public getCallingPid setX(setHeaderDividersEnabled setheaderdividersenabled) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.add(setheaderdividersenabled);
        }
        return this;
    }

    public getCallingPid setY(setHeaderDividersEnabled setheaderdividersenabled, setHeaderDividersEnabled setheaderdividersenabled2) {
        this.MenuHostHelper$$ExternalSyntheticLambda1.add(setheaderdividersenabled);
        setheaderdividersenabled2.setX(setheaderdividersenabled.MenuHostHelper$$ExternalSyntheticLambda1());
        this.MenuHostHelper$$ExternalSyntheticLambda1.add(setheaderdividersenabled2);
        return this;
    }

    public void setX() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        Iterator<setHeaderDividersEnabled> it = this.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
        while (it.hasNext()) {
            setHeaderDividersEnabled next = it.next();
            long j = this.setIconTintList;
            if (j >= 0) {
                next.MenuHostHelper$$ExternalSyntheticLambda1(j);
            }
            Interpolator interpolator = this.setY;
            if (interpolator != null) {
                next.MenuHostHelper$$ExternalSyntheticLambda1(interpolator);
            }
            if (this.setX != null) {
                next.MenuHostHelper$$ExternalSyntheticLambda0(this.setUnboundedRipple);
            }
            next.setIconTintList();
        }
        this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
    }

    void setIconTintList() {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
    }

    public void MenuHostHelper$$ExternalSyntheticLambda0() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            Iterator<setHeaderDividersEnabled> it = this.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
            while (it.hasNext()) {
                it.next().MenuHostHelper$$ExternalSyntheticLambda0();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }
    }

    public getCallingPid setIconTintList(long j) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.setIconTintList = j;
        }
        return this;
    }

    public getCallingPid setIconTintList(Interpolator interpolator) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.setY = interpolator;
        }
        return this;
    }

    public getCallingPid setY(setSelectAllOnFocus setselectallonfocus) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda0) {
            this.setX = setselectallonfocus;
        }
        return this;
    }
}