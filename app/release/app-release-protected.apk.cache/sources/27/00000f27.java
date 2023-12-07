package o;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class setScrimAnimationDuration {
    private final Object MenuHostHelper$$ExternalSyntheticLambda0 = new Object();
    private Queue MenuHostHelper$$ExternalSyntheticLambda1;
    private boolean setIconTintList;

    public final void setIconTintList(setAutoSizeTextTypeUniformWithConfiguration setautosizetexttypeuniformwithconfiguration) {
        computeValue computevalue;
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 != null && !this.setIconTintList) {
                this.setIconTintList = true;
                while (true) {
                    synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
                        computevalue = (computeValue) this.MenuHostHelper$$ExternalSyntheticLambda1.poll();
                        if (computevalue == null) {
                            this.setIconTintList = false;
                            return;
                        }
                    }
                    computevalue.setX(setautosizetexttypeuniformwithconfiguration);
                }
            }
        }
    }

    public final void setX(computeValue computevalue) {
        synchronized (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayDeque();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda1.add(computevalue);
        }
    }
}