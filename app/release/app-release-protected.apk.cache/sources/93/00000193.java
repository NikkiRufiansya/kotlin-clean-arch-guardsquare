package o;

/* loaded from: classes.dex */
public final class ExpandableTransformationBehavior implements getRootAlpha {
    public final String MenuHostHelper$$ExternalSyntheticLambda0;
    public final setOnReceiveContentListener MenuHostHelper$$ExternalSyntheticLambda1;
    public final setOnReceiveContentListener setIconTintList;
    public final setX setOnLongClickListener;
    public final setOnReceiveContentListener setX;
    public final boolean setY;

    /* loaded from: classes.dex */
    public enum setX {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static setX setY(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                StringBuilder sb = new StringBuilder("Unknown trim path type ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
            }
            return SIMULTANEOUSLY;
        }
    }

    public ExpandableTransformationBehavior(String str, setX setx, setOnReceiveContentListener setonreceivecontentlistener, setOnReceiveContentListener setonreceivecontentlistener2, setOnReceiveContentListener setonreceivecontentlistener3, boolean z) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = str;
        this.setOnLongClickListener = setx;
        this.setX = setonreceivecontentlistener;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setonreceivecontentlistener2;
        this.setIconTintList = setonreceivecontentlistener3;
        this.setY = z;
    }

    @Override // o.getRootAlpha
    public final setContentInsetStartWithNavigation setIconTintList(setPointerIcon setpointericon, setEndIconCheckable setendiconcheckable) {
        return new setActiveIndicatorHeight(setendiconcheckable, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Trim Path: {start: ");
        sb.append(this.setX);
        sb.append(", end: ");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append(", offset: ");
        sb.append(this.setIconTintList);
        sb.append("}");
        return sb.toString();
    }
}