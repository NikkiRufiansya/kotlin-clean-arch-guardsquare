package o;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
final class setShowMotionSpec implements Runnable {
    final /* synthetic */ setCheckedIconMarginResource setX;
    final /* synthetic */ setAutoSizeTextTypeUniformWithConfiguration setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public setShowMotionSpec(setCheckedIconMarginResource setcheckediconmarginresource, setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        this.setX = setcheckediconmarginresource;
        this.setY = setautosizetexttypeuniformwithconfiguration;
    }

    @Override // java.lang.Runnable
    public final void run() {
        getCallingUid getcallinguid;
        try {
            getcallinguid = this.setX.MenuHostHelper$$ExternalSyntheticLambda0;
            setAutoSizeTextTypeUniformWithConfiguration iconTintList = getcallinguid.setIconTintList(this.setY.MenuHostHelper$$ExternalSyntheticLambda1());
            if (iconTintList == null) {
                this.setX.MenuHostHelper$$ExternalSyntheticLambda1(new NullPointerException("Continuation returned null"));
                return;
            }
            iconTintList.setX(setAccessibilityPaneTitle.setY, (CalendarConstraints$1) this.setX);
            iconTintList.setX(setAccessibilityPaneTitle.setY, (setAccessibilityDataSensitive) this.setX);
            iconTintList.setX(setAccessibilityPaneTitle.setY, (getTrimPathStart) this.setX);
        } catch (CancellationException unused) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda0();
        } catch (setChipIconVisible e) {
            if (e.getCause() instanceof Exception) {
                this.setX.MenuHostHelper$$ExternalSyntheticLambda1((Exception) e.getCause());
            } else {
                this.setX.MenuHostHelper$$ExternalSyntheticLambda1(e);
            }
        } catch (Exception e2) {
            this.setX.MenuHostHelper$$ExternalSyntheticLambda1(e2);
        }
    }
}