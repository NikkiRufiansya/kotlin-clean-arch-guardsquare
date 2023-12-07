package o;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class setOnGroupExpandListener {
    private static int setIconTintList;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    int setX;
    public ArrayList<setVisibility> MenuHostHelper$$ExternalSyntheticLambda0 = new ArrayList<>();
    private boolean setY = false;
    private ArrayList<setIconTintList> setLayoutAnimation = null;
    private int setUiOptions = -1;

    public setOnGroupExpandListener(int i) {
        int i2 = setIconTintList;
        setIconTintList = i2 + 1;
        this.setX = i2;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.MenuHostHelper$$ExternalSyntheticLambda1;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.setX);
        sb.append("] <");
        String obj = sb.toString();
        Iterator<setVisibility> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        while (it.hasNext()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" ");
            sb2.append(it.next().setOnNavigationItemSelectedListener);
            obj = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(obj);
        sb3.append(" >");
        return sb3.toString();
    }

    public final void setX(int i, setOnGroupExpandListener setongroupexpandlistener) {
        Iterator<setVisibility> it = this.MenuHostHelper$$ExternalSyntheticLambda0.iterator();
        while (it.hasNext()) {
            setVisibility next = it.next();
            if (!setongroupexpandlistener.MenuHostHelper$$ExternalSyntheticLambda0.contains(next)) {
                setongroupexpandlistener.MenuHostHelper$$ExternalSyntheticLambda0.add(next);
            }
            if (i == 0) {
                next.setLayoutAnimation = setongroupexpandlistener.setX;
            } else {
                next.createDispatcher = setongroupexpandlistener.setX;
            }
        }
        this.setUiOptions = setongroupexpandlistener.setX;
    }

    public final int MenuHostHelper$$ExternalSyntheticLambda0(setWebContentsDebuggingEnabled setwebcontentsdebuggingenabled, ArrayList<setVisibility> arrayList, int i) {
        int i2;
        int i3;
        setButtonTintBlendMode setbuttontintblendmode = (setButtonTintBlendMode) arrayList.get(0).RecyclerView$SavedState$1;
        setwebcontentsdebuggingenabled.setX();
        setbuttontintblendmode.setX(setwebcontentsdebuggingenabled, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            arrayList.get(i4).setX(setwebcontentsdebuggingenabled, false);
        }
        if (i == 0 && setbuttontintblendmode.setChipSpacingHorizontal > 0) {
            OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.setY(setbuttontintblendmode, setwebcontentsdebuggingenabled, arrayList, 0);
        }
        if (i == 1 && setbuttontintblendmode.setMinEms > 0) {
            OnBackPressedDispatcher$LifecycleOnBackPressedCancellable.setY(setbuttontintblendmode, setwebcontentsdebuggingenabled, arrayList, 1);
        }
        try {
            setwebcontentsdebuggingenabled.MenuHostHelper$$ExternalSyntheticLambda0();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.setLayoutAnimation = new ArrayList<>();
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            this.setLayoutAnimation.add(new setIconTintList(arrayList.get(i5), i));
        }
        if (i == 0) {
            setBoxStrokeWidthResource setboxstrokewidthresource = setbuttontintblendmode.setIconified.setUiOptions;
            i2 = setboxstrokewidthresource != null ? (int) (setboxstrokewidthresource.setIconTintList + 0.5f) : 0;
            setBoxStrokeWidthResource setboxstrokewidthresource2 = setbuttontintblendmode.setShrinkMotionSpec.setUiOptions;
            i3 = setboxstrokewidthresource2 != null ? (int) (setboxstrokewidthresource2.setIconTintList + 0.5f) : 0;
            setwebcontentsdebuggingenabled.setX();
        } else {
            setBoxStrokeWidthResource setboxstrokewidthresource3 = setbuttontintblendmode.setChipSpacingVertical.setUiOptions;
            i2 = setboxstrokewidthresource3 != null ? (int) (setboxstrokewidthresource3.setIconTintList + 0.5f) : 0;
            setBoxStrokeWidthResource setboxstrokewidthresource4 = setbuttontintblendmode.setIconSize.setUiOptions;
            i3 = setboxstrokewidthresource4 != null ? (int) (setboxstrokewidthresource4.setIconTintList + 0.5f) : 0;
            setwebcontentsdebuggingenabled.setX();
        }
        return i3 - i2;
    }

    public final void setIconTintList(ArrayList<setOnGroupExpandListener> arrayList) {
        int size = this.MenuHostHelper$$ExternalSyntheticLambda0.size();
        if (this.setUiOptions != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                setOnGroupExpandListener setongroupexpandlistener = arrayList.get(i);
                if (this.setUiOptions == setongroupexpandlistener.setX) {
                    setX(this.MenuHostHelper$$ExternalSyntheticLambda1, setongroupexpandlistener);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* loaded from: classes.dex */
    class setIconTintList {
        private int MenuHostHelper$$ExternalSyntheticLambda0;
        private int setIconTintList;
        private int setNavigationOnClickListener;
        private int setOnLongClickListener;
        private WeakReference<setVisibility> setUnboundedRipple;
        private int setX;
        private int setY;

        public setIconTintList(setVisibility setvisibility, int i) {
            this.setUnboundedRipple = new WeakReference<>(setvisibility);
            setBoxStrokeWidthResource setboxstrokewidthresource = setvisibility.setIconified.setUiOptions;
            this.setIconTintList = setboxstrokewidthresource != null ? (int) (setboxstrokewidthresource.setIconTintList + 0.5f) : 0;
            setBoxStrokeWidthResource setboxstrokewidthresource2 = setvisibility.setChipSpacingVertical.setUiOptions;
            this.setNavigationOnClickListener = setboxstrokewidthresource2 != null ? (int) (setboxstrokewidthresource2.setIconTintList + 0.5f) : 0;
            setBoxStrokeWidthResource setboxstrokewidthresource3 = setvisibility.setShrinkMotionSpec.setUiOptions;
            this.setOnLongClickListener = setboxstrokewidthresource3 != null ? (int) (setboxstrokewidthresource3.setIconTintList + 0.5f) : 0;
            setBoxStrokeWidthResource setboxstrokewidthresource4 = setvisibility.setIconSize.setUiOptions;
            this.setX = setboxstrokewidthresource4 != null ? (int) (setboxstrokewidthresource4.setIconTintList + 0.5f) : 0;
            setBoxStrokeWidthResource setboxstrokewidthresource5 = setvisibility.ViewPager$SavedState$1.setUiOptions;
            this.MenuHostHelper$$ExternalSyntheticLambda0 = setboxstrokewidthresource5 != null ? (int) (setboxstrokewidthresource5.setIconTintList + 0.5f) : 0;
            this.setY = i;
        }
    }
}