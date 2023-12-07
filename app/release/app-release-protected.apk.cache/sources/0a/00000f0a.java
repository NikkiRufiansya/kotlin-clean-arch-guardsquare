package o;

/* loaded from: classes.dex */
public final class setRootViewData implements getRootAlpha {
    public final setY MenuHostHelper$$ExternalSyntheticLambda0;
    public final String MenuHostHelper$$ExternalSyntheticLambda1;
    public final boolean setIconTintList;

    /* loaded from: classes.dex */
    public enum setY {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static setY MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                return EXCLUDE_INTERSECTIONS;
                            }
                            return MERGE;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public setRootViewData(String str, setY sety, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = str;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = sety;
        this.setIconTintList = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append('}');
        return sb.toString();
    }

    @Override // o.getRootAlpha
    public final setContentInsetStartWithNavigation setIconTintList(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable) {
        if (!setpointericon.MenuHostHelper$$ExternalSyntheticLambda0) {
            setDrawingCacheEnabled.setIconTintList("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new setStatusBarBackgroundResource(this);
    }
}