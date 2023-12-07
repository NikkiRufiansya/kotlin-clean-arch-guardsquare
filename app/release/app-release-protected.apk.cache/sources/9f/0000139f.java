package o;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class zza extends setSupportButtonTintList {
    private ArrayList<setSupportButtonTintList> setX;
    private int setY;

    public zza(setVisibility setvisibility, int i) {
        super(setvisibility);
        setVisibility setvisibility2;
        setSupportButtonTintList setsupportbuttontintlist;
        int i2;
        setSupportButtonTintList setsupportbuttontintlist2;
        this.setX = new ArrayList<>();
        this.setOnLongClickListener = i;
        setVisibility setvisibility3 = this.setIconSize;
        setVisibility iconTintList = setvisibility3.setIconTintList(this.setOnLongClickListener);
        while (true) {
            setVisibility setvisibility4 = iconTintList;
            setvisibility2 = setvisibility3;
            setvisibility3 = setvisibility4;
            if (setvisibility3 == null) {
                break;
            }
            iconTintList = setvisibility3.setIconTintList(this.setOnLongClickListener);
        }
        this.setIconSize = setvisibility2;
        ArrayList<setSupportButtonTintList> arrayList = this.setX;
        int i3 = this.setOnLongClickListener;
        if (i3 == 0) {
            setsupportbuttontintlist = setvisibility2.setNavigationOnClickListener;
        } else {
            setsupportbuttontintlist = i3 == 1 ? setvisibility2.setNavigationIconTint : null;
        }
        arrayList.add(setsupportbuttontintlist);
        setVisibility MenuHostHelper$$ExternalSyntheticLambda1 = setvisibility2.MenuHostHelper$$ExternalSyntheticLambda1(this.setOnLongClickListener);
        while (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
            ArrayList<setSupportButtonTintList> arrayList2 = this.setX;
            int i4 = this.setOnLongClickListener;
            if (i4 == 0) {
                setsupportbuttontintlist2 = MenuHostHelper$$ExternalSyntheticLambda1.setNavigationOnClickListener;
            } else {
                setsupportbuttontintlist2 = i4 == 1 ? MenuHostHelper$$ExternalSyntheticLambda1.setNavigationIconTint : null;
            }
            arrayList2.add(setsupportbuttontintlist2);
            MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this.setOnLongClickListener);
        }
        Iterator<setSupportButtonTintList> it = this.setX.iterator();
        while (it.hasNext()) {
            setSupportButtonTintList next = it.next();
            if (this.setOnLongClickListener == 0) {
                next.setIconSize.MenuHostHelper$$ExternalSyntheticLambda1 = this;
            } else if (this.setOnLongClickListener == 1) {
                next.setIconSize.FabTransformationBehavior = this;
            }
        }
        if ((this.setOnLongClickListener == 0 && ((setButtonTintBlendMode) this.setIconSize.RecyclerView$SavedState$1).TextInputLayout$SavedState$1) && this.setX.size() > 1) {
            ArrayList<setSupportButtonTintList> arrayList3 = this.setX;
            this.setIconSize = arrayList3.get(arrayList3.size() - 1).setIconSize;
        }
        if (this.setOnLongClickListener == 0) {
            i2 = this.setIconSize.setMinAndMaxProgress;
        } else {
            i2 = this.setIconSize.setError;
        }
        this.setY = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChainRun ");
        sb.append(this.setOnLongClickListener == 0 ? "horizontal : " : "vertical : ");
        Iterator<setSupportButtonTintList> it = this.setX.iterator();
        while (it.hasNext()) {
            sb.append("<");
            sb.append(it.next());
            sb.append("> ");
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setSupportButtonTintList
    public final boolean setIconTintList() {
        int size = this.setX.size();
        for (int i = 0; i < size; i++) {
            if (!this.setX.get(i).setIconTintList()) {
                return false;
            }
        }
        return true;
    }

    @Override // o.setSupportButtonTintList
    public final long MenuHostHelper$$ExternalSyntheticLambda0() {
        int size = this.setX.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            setSupportButtonTintList setsupportbuttontintlist = this.setX.get(i);
            j = j + setsupportbuttontintlist.setCenterIfNoTextEnabled.MenuHostHelper$$ExternalSyntheticLambda0 + setsupportbuttontintlist.MenuHostHelper$$ExternalSyntheticLambda0() + setsupportbuttontintlist.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0;
        }
        return j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setSupportButtonTintList
    public final void setY() {
        this.setLayoutAnimation = null;
        Iterator<setSupportButtonTintList> it = this.setX.iterator();
        while (it.hasNext()) {
            it.next().setY();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x03c1, code lost:
        r2 = r2 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c1, code lost:
        if (r3.MenuHostHelper$$ExternalSyntheticLambda1.setOnLongClickListener != false) goto L66;
     */
    @Override // o.setSupportButtonTintList, o.getPropertyName
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setLayoutAnimation() {
        /*
            Method dump skipped, instructions count: 998
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.zza.setLayoutAnimation():void");
    }

    @Override // o.setSupportButtonTintList
    public final void MenuHostHelper$$ExternalSyntheticLambda1() {
        for (int i = 0; i < this.setX.size(); i++) {
            this.setX.get(i).MenuHostHelper$$ExternalSyntheticLambda1();
        }
    }

    private setVisibility setOnLongClickListener() {
        for (int i = 0; i < this.setX.size(); i++) {
            setSupportButtonTintList setsupportbuttontintlist = this.setX.get(i);
            if (setsupportbuttontintlist.setIconSize.setFilterRedundantCalls != 8) {
                return setsupportbuttontintlist.setIconSize;
            }
        }
        return null;
    }

    private setVisibility setUiOptions() {
        for (int size = this.setX.size() - 1; size >= 0; size--) {
            setSupportButtonTintList setsupportbuttontintlist = this.setX.get(size);
            if (setsupportbuttontintlist.setIconSize.setFilterRedundantCalls != 8) {
                return setsupportbuttontintlist.setIconSize;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // o.setSupportButtonTintList
    public final void setX() {
        Iterator<setSupportButtonTintList> it = this.setX.iterator();
        while (it.hasNext()) {
            it.next().setX();
        }
        int size = this.setX.size();
        if (size <= 0) {
            return;
        }
        setVisibility setvisibility = this.setX.get(0).setIconSize;
        setVisibility setvisibility2 = this.setX.get(size - 1).setIconSize;
        if (this.setOnLongClickListener == 0) {
            zzD zzd = setvisibility.setIconified;
            zzD zzd2 = setvisibility2.setShrinkMotionSpec;
            setLastBaselineToBottomHeight MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(zzd, 0);
            int MenuHostHelper$$ExternalSyntheticLambda0 = zzd.MenuHostHelper$$ExternalSyntheticLambda0();
            setVisibility onLongClickListener = setOnLongClickListener();
            if (onLongClickListener != null) {
                MenuHostHelper$$ExternalSyntheticLambda0 = onLongClickListener.setIconified.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            if (MenuHostHelper$$ExternalSyntheticLambda1 != null) {
                setLastBaselineToBottomHeight setlastbaselinetobottomheight = this.setCenterIfNoTextEnabled;
                setlastbaselinetobottomheight.setNavigationOnClickListener.add(MenuHostHelper$$ExternalSyntheticLambda1);
                setlastbaselinetobottomheight.MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda0;
                MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList.add(setlastbaselinetobottomheight);
            }
            setLastBaselineToBottomHeight MenuHostHelper$$ExternalSyntheticLambda12 = MenuHostHelper$$ExternalSyntheticLambda1(zzd2, 0);
            int MenuHostHelper$$ExternalSyntheticLambda02 = zzd2.MenuHostHelper$$ExternalSyntheticLambda0();
            setVisibility uiOptions = setUiOptions();
            if (uiOptions != null) {
                MenuHostHelper$$ExternalSyntheticLambda02 = uiOptions.setShrinkMotionSpec.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            if (MenuHostHelper$$ExternalSyntheticLambda12 != null) {
                setLastBaselineToBottomHeight setlastbaselinetobottomheight2 = this.setIconTintList;
                setlastbaselinetobottomheight2.setNavigationOnClickListener.add(MenuHostHelper$$ExternalSyntheticLambda12);
                setlastbaselinetobottomheight2.MenuHostHelper$$ExternalSyntheticLambda0 = -MenuHostHelper$$ExternalSyntheticLambda02;
                MenuHostHelper$$ExternalSyntheticLambda12.setIconTintList.add(setlastbaselinetobottomheight2);
            }
        } else {
            zzD zzd3 = setvisibility.setChipSpacingVertical;
            zzD zzd4 = setvisibility2.setIconSize;
            setLastBaselineToBottomHeight MenuHostHelper$$ExternalSyntheticLambda13 = MenuHostHelper$$ExternalSyntheticLambda1(zzd3, 1);
            int MenuHostHelper$$ExternalSyntheticLambda03 = zzd3.MenuHostHelper$$ExternalSyntheticLambda0();
            setVisibility onLongClickListener2 = setOnLongClickListener();
            if (onLongClickListener2 != null) {
                MenuHostHelper$$ExternalSyntheticLambda03 = onLongClickListener2.setChipSpacingVertical.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            if (MenuHostHelper$$ExternalSyntheticLambda13 != null) {
                setLastBaselineToBottomHeight setlastbaselinetobottomheight3 = this.setCenterIfNoTextEnabled;
                setlastbaselinetobottomheight3.setNavigationOnClickListener.add(MenuHostHelper$$ExternalSyntheticLambda13);
                setlastbaselinetobottomheight3.MenuHostHelper$$ExternalSyntheticLambda0 = MenuHostHelper$$ExternalSyntheticLambda03;
                MenuHostHelper$$ExternalSyntheticLambda13.setIconTintList.add(setlastbaselinetobottomheight3);
            }
            setLastBaselineToBottomHeight MenuHostHelper$$ExternalSyntheticLambda14 = MenuHostHelper$$ExternalSyntheticLambda1(zzd4, 1);
            int MenuHostHelper$$ExternalSyntheticLambda04 = zzd4.MenuHostHelper$$ExternalSyntheticLambda0();
            setVisibility uiOptions2 = setUiOptions();
            if (uiOptions2 != null) {
                MenuHostHelper$$ExternalSyntheticLambda04 = uiOptions2.setIconSize.MenuHostHelper$$ExternalSyntheticLambda0();
            }
            if (MenuHostHelper$$ExternalSyntheticLambda14 != null) {
                setLastBaselineToBottomHeight setlastbaselinetobottomheight4 = this.setIconTintList;
                setlastbaselinetobottomheight4.setNavigationOnClickListener.add(MenuHostHelper$$ExternalSyntheticLambda14);
                setlastbaselinetobottomheight4.MenuHostHelper$$ExternalSyntheticLambda0 = -MenuHostHelper$$ExternalSyntheticLambda04;
                MenuHostHelper$$ExternalSyntheticLambda14.setIconTintList.add(setlastbaselinetobottomheight4);
            }
        }
        this.setCenterIfNoTextEnabled.setIconSize = this;
        this.setIconTintList.setIconSize = this;
    }
}