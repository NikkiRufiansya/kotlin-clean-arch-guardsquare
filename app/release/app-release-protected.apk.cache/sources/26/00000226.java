package o;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import o.setVerticalScrollbarPosition;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase implements SavedStateHandleController {
    static final Logger setY = Logger.getLogger(setLengthCounter.class.getName());
    final setVerticalScrollbarPosition MenuHostHelper$$ExternalSyntheticLambda0;
    final setCloseIconSize MenuHostHelper$$ExternalSyntheticLambda1;
    final setOffscreenPageLimit setIconTintList;
    private final Executor setLayoutAnimation;
    final setBoxBackgroundColorResource setX;

    @nE
    public PublicSuffixDatabase(Executor executor, setBoxBackgroundColorResource setboxbackgroundcolorresource, setOffscreenPageLimit setoffscreenpagelimit, setCloseIconSize setcloseiconsize, setVerticalScrollbarPosition setverticalscrollbarposition) {
        this.setLayoutAnimation = executor;
        this.setX = setboxbackgroundcolorresource;
        this.setIconTintList = setoffscreenpagelimit;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = setcloseiconsize;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = setverticalscrollbarposition;
    }

    @Override // o.SavedStateHandleController
    public final void MenuHostHelper$$ExternalSyntheticLambda0(final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1, final setPaddingRelative setpaddingrelative, final setCheckedIconTintResource setcheckedicontintresource) {
        this.setLayoutAnimation.execute(new Runnable() { // from class: o.setForeground
            @Override // java.lang.Runnable
            public final void run() {
                final PublicSuffixDatabase publicSuffixDatabase = PublicSuffixDatabase.this;
                final StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$12 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1;
                setPaddingRelative setpaddingrelative2 = setpaddingrelative;
                try {
                    setCheckMarkTintMode x = publicSuffixDatabase.setX.setX(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$12.setX());
                    if (x == null) {
                        String format = String.format("Transport backend '%s' is not registered", staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$12.setX());
                        PublicSuffixDatabase.setY.warning(format);
                        new IllegalArgumentException(format);
                        return;
                    }
                    final setPaddingRelative MenuHostHelper$$ExternalSyntheticLambda1 = x.MenuHostHelper$$ExternalSyntheticLambda1(setpaddingrelative2);
                    publicSuffixDatabase.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(new setVerticalScrollbarPosition.setY() { // from class: o.setStyleShortcutsEnabled
                        @Override // o.setVerticalScrollbarPosition.setY
                        public final Object setX() {
                            PublicSuffixDatabase publicSuffixDatabase2 = PublicSuffixDatabase.this;
                            StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$1 staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$13 = staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$12;
                            publicSuffixDatabase2.MenuHostHelper$$ExternalSyntheticLambda1.setY(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$13, MenuHostHelper$$ExternalSyntheticLambda1);
                            publicSuffixDatabase2.setIconTintList.MenuHostHelper$$ExternalSyntheticLambda0(staggeredGridLayoutManager$LazySpanLookup$FullSpanItem$13, 1);
                            return null;
                        }
                    });
                } catch (Exception e) {
                    Logger logger = PublicSuffixDatabase.setY;
                    StringBuilder sb = new StringBuilder("Error scheduling event ");
                    sb.append(e.getMessage());
                    logger.warning(sb.toString());
                }
            }
        });
    }
}