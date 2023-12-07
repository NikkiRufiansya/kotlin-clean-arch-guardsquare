package o;

import android.view.inputmethod.EditorInfo;
import o.setScrollContainer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda0 extends setScrollContainer.setIconTintList {
    private volatile LinearLayoutManager$SavedState$1 setIconTintList;
    private volatile setFocusable setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda0(setScrollContainer setscrollcontainer) {
        super(setscrollcontainer);
    }

    @Override // o.setScrollContainer.setIconTintList
    final void setX() {
        try {
            this.setX.setX.MenuHostHelper$$ExternalSyntheticLambda0(new setScrollContainer.setNavigationOnClickListener() { // from class: o.setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda0.1
                @Override // o.setScrollContainer.setNavigationOnClickListener
                public void MenuHostHelper$$ExternalSyntheticLambda0(LinearLayoutManager$SavedState$1 linearLayoutManager$SavedState$1) {
                    setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda0.this.MenuHostHelper$$ExternalSyntheticLambda0(linearLayoutManager$SavedState$1);
                }

                @Override // o.setScrollContainer.setNavigationOnClickListener
                public void MenuHostHelper$$ExternalSyntheticLambda0(Throwable th) {
                    setScrollContainer$MenuHostHelper$$ExternalSyntheticLambda0.this.setX.MenuHostHelper$$ExternalSyntheticLambda1(th);
                }
            });
        } catch (Throwable th) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda1(th);
        }
    }

    final void MenuHostHelper$$ExternalSyntheticLambda0(LinearLayoutManager$SavedState$1 linearLayoutManager$SavedState$1) {
        setScrollContainer.setY sety;
        if (linearLayoutManager$SavedState$1 == null) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda1(new IllegalArgumentException("metadataRepo cannot be null"));
            return;
        }
        this.setIconTintList = linearLayoutManager$SavedState$1;
        LinearLayoutManager$SavedState$1 linearLayoutManager$SavedState$12 = this.setIconTintList;
        setScrollContainer.setLayoutAnimation setlayoutanimation = new setScrollContainer.setLayoutAnimation();
        sety = this.setX.setLayoutAnimation;
        this.setY = new setFocusable(linearLayoutManager$SavedState$12, setlayoutanimation, sety, this.setX.setY, this.setX.setIconTintList);
        this.setX.setUnboundedRipple();
    }

    @Override // o.setScrollContainer.setIconTintList
    final CharSequence setX(CharSequence charSequence, int i, int i2, int i3, boolean z) {
        return this.setY.MenuHostHelper$$ExternalSyntheticLambda0(charSequence, i, i2, i3, z);
    }

    @Override // o.setScrollContainer.setIconTintList
    final void setX(EditorInfo editorInfo) {
        editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0.setY());
        editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.setX.MenuHostHelper$$ExternalSyntheticLambda0);
    }
}