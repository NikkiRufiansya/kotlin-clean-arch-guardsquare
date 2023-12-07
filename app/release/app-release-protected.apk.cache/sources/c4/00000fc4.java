package o;

import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setState implements Runnable {
    final /* synthetic */ setTitleTextAppearance MenuHostHelper$$ExternalSyntheticLambda0;
    final /* synthetic */ Callable MenuHostHelper$$ExternalSyntheticLambda1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setState(setTitleTextAppearance settitletextappearance, Callable callable) {
        this.MenuHostHelper$$ExternalSyntheticLambda0 = settitletextappearance;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(this.MenuHostHelper$$ExternalSyntheticLambda1.call());
        } catch (Exception e) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList(e);
        } catch (Throwable th) {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList((Exception) new RuntimeException(th));
        }
    }
}