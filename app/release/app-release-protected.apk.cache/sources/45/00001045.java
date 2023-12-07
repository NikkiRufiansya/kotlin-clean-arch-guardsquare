package o;

import android.util.Log;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class setTextCursorDrawable {
    setPopupCallback MenuHostHelper$$ExternalSyntheticLambda0;
    final ArrayList<setDropDownBackgroundResource> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayList<>();
    final HashMap<String, setOverscrollHeader> setX = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(List<String> list) {
        boolean isLoggable;
        this.MenuHostHelper$$ExternalSyntheticLambda1.clear();
        if (list != null) {
            for (String str : list) {
                setOverscrollHeader setoverscrollheader = this.setX.get(str);
                setDropDownBackgroundResource setdropdownbackgroundresource = setoverscrollheader != null ? setoverscrollheader.setIconTintList : null;
                if (setdropdownbackgroundresource == null) {
                    StringBuilder sb = new StringBuilder("No instantiated fragment for (");
                    sb.append(str);
                    sb.append(")");
                    throw new IllegalStateException(sb.toString());
                }
                isLoggable = Log.isLoggable("FragmentManager", 2);
                if (isLoggable) {
                    StringBuilder sb2 = new StringBuilder("restoreSaveState: added (");
                    sb2.append(str);
                    sb2.append("): ");
                    sb2.append(setdropdownbackgroundresource);
                    Log.v("FragmentManager", sb2.toString());
                }
                setX(setdropdownbackgroundresource);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(setDropDownBackgroundResource setdropdownbackgroundresource) {
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.contains(setdropdownbackgroundresource)) {
            StringBuilder sb = new StringBuilder("Fragment already added: ");
            sb.append(setdropdownbackgroundresource);
            throw new IllegalStateException(sb.toString());
        }
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            this.MenuHostHelper$$ExternalSyntheticLambda1.add(setdropdownbackgroundresource);
        }
        setdropdownbackgroundresource.setX = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY() {
        Iterator<setDropDownBackgroundResource> it = this.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
        while (it.hasNext()) {
            setOverscrollHeader setoverscrollheader = this.setX.get(it.next().setShrinkMotionSpec);
            if (setoverscrollheader != null) {
                setoverscrollheader.setNavigationOnClickListener();
            }
        }
        for (setOverscrollHeader setoverscrollheader2 : this.setX.values()) {
            if (setoverscrollheader2 != null) {
                setoverscrollheader2.setNavigationOnClickListener();
                setDropDownBackgroundResource setdropdownbackgroundresource = setoverscrollheader2.setIconTintList;
                if (setdropdownbackgroundresource.ExtendableSavedState$1 && !setdropdownbackgroundresource.setFilterRedundantCalls()) {
                    setY(setoverscrollheader2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArrayList<setCollapsedTitleGravity> setX() {
        boolean isLoggable;
        ArrayList<setCollapsedTitleGravity> arrayList = new ArrayList<>(this.setX.size());
        for (setOverscrollHeader setoverscrollheader : this.setX.values()) {
            if (setoverscrollheader != null) {
                setDropDownBackgroundResource setdropdownbackgroundresource = setoverscrollheader.setIconTintList;
                setCollapsedTitleGravity iconSize = setoverscrollheader.setIconSize();
                arrayList.add(iconSize);
                isLoggable = Log.isLoggable("FragmentManager", 2);
                if (isLoggable) {
                    StringBuilder sb = new StringBuilder("Saved state of ");
                    sb.append(setdropdownbackgroundresource);
                    sb.append(": ");
                    sb.append(iconSize.setTextAlignment);
                    Log.v("FragmentManager", sb.toString());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ArrayList<String> setNavigationOnClickListener() {
        boolean isLoggable;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.MenuHostHelper$$ExternalSyntheticLambda1.size());
            Iterator<setDropDownBackgroundResource> it = this.MenuHostHelper$$ExternalSyntheticLambda1.iterator();
            while (it.hasNext()) {
                setDropDownBackgroundResource next = it.next();
                arrayList.add(next.setShrinkMotionSpec);
                isLoggable = Log.isLoggable("FragmentManager", 2);
                if (isLoggable) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("saveAllState: adding fragment (");
                    sb.append(next.setShrinkMotionSpec);
                    sb.append("): ");
                    sb.append(next);
                    Log.v("FragmentManager", sb.toString());
                }
            }
            return arrayList;
        }
    }

    public final List<setOverscrollHeader> MenuHostHelper$$ExternalSyntheticLambda0() {
        ArrayList arrayList = new ArrayList();
        for (setOverscrollHeader setoverscrollheader : this.setX.values()) {
            if (setoverscrollheader != null) {
                arrayList.add(setoverscrollheader);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<setDropDownBackgroundResource> MenuHostHelper$$ExternalSyntheticLambda1() {
        ArrayList arrayList;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda1) {
            arrayList = new ArrayList(this.MenuHostHelper$$ExternalSyntheticLambda1);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<setDropDownBackgroundResource> setIconTintList() {
        ArrayList arrayList = new ArrayList();
        for (setOverscrollHeader setoverscrollheader : this.setX.values()) {
            if (setoverscrollheader != null) {
                arrayList.add(setoverscrollheader.setIconTintList);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final setDropDownBackgroundResource setIconTintList(String str) {
        setDropDownBackgroundResource iconTintList;
        for (setOverscrollHeader setoverscrollheader : this.setX.values()) {
            if (setoverscrollheader != null && (iconTintList = setoverscrollheader.setIconTintList.setIconTintList(str)) != null) {
                return iconTintList;
            }
        }
        return null;
    }

    public final int setY(setDropDownBackgroundResource setdropdownbackgroundresource) {
        ViewGroup viewGroup = setdropdownbackgroundresource.setUnboundedRipple;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.MenuHostHelper$$ExternalSyntheticLambda1.indexOf(setdropdownbackgroundresource);
        for (int i = indexOf - 1; i >= 0; i--) {
            setDropDownBackgroundResource setdropdownbackgroundresource2 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(i);
            if (setdropdownbackgroundresource2.setUnboundedRipple == viewGroup && setdropdownbackgroundresource2.setImageTintMode != null) {
                return viewGroup.indexOfChild(setdropdownbackgroundresource2.setImageTintMode) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.MenuHostHelper$$ExternalSyntheticLambda1.size()) {
                return -1;
            }
            setDropDownBackgroundResource setdropdownbackgroundresource3 = this.MenuHostHelper$$ExternalSyntheticLambda1.get(indexOf);
            if (setdropdownbackgroundresource3.setUnboundedRipple == viewGroup && setdropdownbackgroundresource3.setImageTintMode != null) {
                return viewGroup.indexOfChild(setdropdownbackgroundresource3.setImageTintMode);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setIconTintList(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("    ");
        String obj = sb.toString();
        if (!this.setX.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (setOverscrollHeader setoverscrollheader : this.setX.values()) {
                printWriter.print(str);
                if (setoverscrollheader == null) {
                    printWriter.println("null");
                } else {
                    setDropDownBackgroundResource setdropdownbackgroundresource = setoverscrollheader.setIconTintList;
                    printWriter.println(setdropdownbackgroundresource);
                    setdropdownbackgroundresource.setIconTintList(obj, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size = this.MenuHostHelper$$ExternalSyntheticLambda1.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(this.MenuHostHelper$$ExternalSyntheticLambda1.get(i).toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setX(setOverscrollHeader setoverscrollheader) {
        boolean isLoggable;
        setDropDownBackgroundResource setdropdownbackgroundresource = setoverscrollheader.setIconTintList;
        if (this.setX.get(setdropdownbackgroundresource.setShrinkMotionSpec) != null) {
            return;
        }
        this.setX.put(setdropdownbackgroundresource.setShrinkMotionSpec, setoverscrollheader);
        if (setdropdownbackgroundresource.FloatingActionButton$BaseBehavior) {
            if (setdropdownbackgroundresource.setHasDecor) {
                this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(setdropdownbackgroundresource);
            } else {
                this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setdropdownbackgroundresource);
            }
            setdropdownbackgroundresource.FloatingActionButton$BaseBehavior = false;
        }
        isLoggable = Log.isLoggable("FragmentManager", 2);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("Added fragment to active set ");
            sb.append(setdropdownbackgroundresource);
            Log.v("FragmentManager", sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setY(setOverscrollHeader setoverscrollheader) {
        boolean isLoggable;
        setDropDownBackgroundResource setdropdownbackgroundresource = setoverscrollheader.setIconTintList;
        if (setdropdownbackgroundresource.setHasDecor) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(setdropdownbackgroundresource);
        }
        if (this.setX.put(setdropdownbackgroundresource.setShrinkMotionSpec, null) == null) {
            return;
        }
        isLoggable = Log.isLoggable("FragmentManager", 2);
        if (isLoggable) {
            StringBuilder sb = new StringBuilder("Removed fragment from active set ");
            sb.append(setdropdownbackgroundresource);
            Log.v("FragmentManager", sb.toString());
        }
    }
}