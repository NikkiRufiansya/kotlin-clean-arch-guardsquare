package o;

import java.util.Collections;

/* loaded from: classes.dex */
public final class setExtraMultilineHeightEnabled<K, A> extends setSubtitleTextAppearance<K, A> {
    private final A setNavigationOnClickListener;
    private final setTextClassifier<A> setUiOptions;

    @Override // o.setSubtitleTextAppearance
    final float MenuHostHelper$$ExternalSyntheticLambda0() {
        return 1.0f;
    }

    public setExtraMultilineHeightEnabled(setPrompt<A> setprompt) {
        this(setprompt, null);
    }

    public setExtraMultilineHeightEnabled(setPrompt<A> setprompt, A a) {
        super(Collections.emptyList());
        this.setUiOptions = new setTextClassifier<>();
        MenuHostHelper$$ExternalSyntheticLambda1(setprompt);
        this.setNavigationOnClickListener = a;
    }

    @Override // o.setSubtitleTextAppearance
    public final void setY(float f) {
        this.setX = f;
    }

    @Override // o.setSubtitleTextAppearance
    public final void setLayoutAnimation() {
        if (this.setIconTintList != null) {
            super.setLayoutAnimation();
        }
    }

    @Override // o.setSubtitleTextAppearance
    public final A setOnLongClickListener() {
        setPrompt<A> setprompt = this.setIconTintList;
        setX();
        setX();
        setX();
        setTextClassifier<A> settextclassifier = setprompt.setX;
        return setprompt.setIconTintList;
    }

    @Override // o.setSubtitleTextAppearance
    final A MenuHostHelper$$ExternalSyntheticLambda1(setChildIndicatorBoundsRelative<K> setchildindicatorboundsrelative, float f) {
        setPrompt<A> setprompt = this.setIconTintList;
        setX();
        setX();
        setX();
        setTextClassifier<A> settextclassifier = setprompt.setX;
        return setprompt.setIconTintList;
    }
}