package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class setQueryHint extends setVisibility {
    public ArrayList<setVisibility> setRowOrderPreserved = new ArrayList<>();

    @Override // o.setVisibility
    public void setMaxEms() {
        this.setRowOrderPreserved.clear();
        super.setMaxEms();
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(setVisibility setvisibility) {
        this.setRowOrderPreserved.add(setvisibility);
        if (setvisibility.RecyclerView$SavedState$1 != null) {
            ((setQueryHint) setvisibility.RecyclerView$SavedState$1).setRowOrderPreserved.remove(setvisibility);
            setvisibility.setMaxEms();
        }
        setvisibility.RecyclerView$SavedState$1 = this;
    }

    public void setIconTintList() {
        ArrayList<setVisibility> arrayList = this.setRowOrderPreserved;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            setVisibility setvisibility = this.setRowOrderPreserved.get(i);
            if (setvisibility instanceof setQueryHint) {
                ((setQueryHint) setvisibility).setIconTintList();
            }
        }
    }

    @Override // o.setVisibility
    public final void setIconTintList(setCurrentTabByTag setcurrenttabbytag) {
        super.setIconTintList(setcurrenttabbytag);
        int size = this.setRowOrderPreserved.size();
        for (int i = 0; i < size; i++) {
            this.setRowOrderPreserved.get(i).setIconTintList(setcurrenttabbytag);
        }
    }
}