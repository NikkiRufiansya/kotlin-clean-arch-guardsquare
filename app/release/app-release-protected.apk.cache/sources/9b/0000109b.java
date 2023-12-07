package o;

import java.util.ArrayDeque;
import java.util.Queue;

/* loaded from: classes.dex */
public final class setTop {
    private boolean MenuHostHelper$$ExternalSyntheticLambda0;
    public boolean setY;
    public boolean setX = true;
    private final Queue<Runnable> MenuHostHelper$$ExternalSyntheticLambda1 = new ArrayDeque();

    public final void setIconTintList() {
        if (this.MenuHostHelper$$ExternalSyntheticLambda0) {
            return;
        }
        try {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = true;
            while (!this.MenuHostHelper$$ExternalSyntheticLambda1.isEmpty()) {
                if (!(this.setY || !this.setX)) {
                    break;
                }
                Runnable poll = this.MenuHostHelper$$ExternalSyntheticLambda1.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void MenuHostHelper$$ExternalSyntheticLambda1(Runnable runnable) {
        if (!this.MenuHostHelper$$ExternalSyntheticLambda1.offer(runnable)) {
            throw new IllegalStateException("cannot enqueue any more runnables".toString());
        }
        setIconTintList();
    }
}