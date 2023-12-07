package o;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class setCompatHoveredFocusedTranslationZ {
    private long MenuHostHelper$$ExternalSyntheticLambda0;
    private long MenuHostHelper$$ExternalSyntheticLambda1;
    private long setIconTintList;
    private long setLayoutAnimation;
    private long setNavigationOnClickListener;
    private ArrayList<String> setOnLongClickListener = new ArrayList<>();
    private long setUiOptions;
    private long setUnboundedRipple;
    private long setX;
    private long setY;

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n*** Metrics ***\nmeasures: ");
        sb.append(this.setLayoutAnimation);
        sb.append("\nmeasuresWrap: ");
        sb.append(this.setNavigationOnClickListener);
        sb.append("\nmeasuresWrapInfeasible: ");
        sb.append(this.setUiOptions);
        sb.append("\ndetermineGroups: ");
        sb.append(this.setX);
        sb.append("\ninfeasibleDetermineGroups: ");
        sb.append(this.setY);
        sb.append("\ngraphOptimizer: ");
        sb.append(this.setIconTintList);
        sb.append("\nwidgets: ");
        sb.append(this.setUnboundedRipple);
        sb.append("\ngraphSolved: ");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1);
        sb.append("\nlinearSolved: ");
        sb.append(this.MenuHostHelper$$ExternalSyntheticLambda0);
        sb.append("\n");
        return sb.toString();
    }
}