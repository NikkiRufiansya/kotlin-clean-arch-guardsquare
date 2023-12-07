package o;

/* loaded from: classes.dex */
public class setItemTextAppearanceActive extends setLastBaselineToBottomHeight {
    public int setCenterIfNoTextEnabled;

    public setItemTextAppearanceActive(setSupportButtonTintList setsupportbuttontintlist) {
        super(setsupportbuttontintlist);
        if (setsupportbuttontintlist instanceof setExtractedText) {
            this.setUiOptions = setLastBaselineToBottomHeight$MenuHostHelper$$ExternalSyntheticLambda1.HORIZONTAL_DIMENSION;
        } else {
            this.setUiOptions = setLastBaselineToBottomHeight$MenuHostHelper$$ExternalSyntheticLambda1.VERTICAL_DIMENSION;
        }
    }

    @Override // o.setLastBaselineToBottomHeight
    public final void setX(int i) {
        if (this.setOnLongClickListener) {
            return;
        }
        this.setOnLongClickListener = true;
        this.setChipCornerRadius = i;
        for (getPropertyName getpropertyname : this.setIconTintList) {
            getpropertyname.setLayoutAnimation();
        }
    }
}