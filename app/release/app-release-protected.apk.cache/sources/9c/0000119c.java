package o;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class uW {
    static final /* synthetic */ AtomicReferenceFieldUpdater MenuHostHelper$$ExternalSyntheticLambda1 = AtomicReferenceFieldUpdater.newUpdater(uW.class, Object.class, "lastScheduledTask");
    private static final /* synthetic */ AtomicIntegerFieldUpdater MenuHostHelper$$ExternalSyntheticLambda0 = AtomicIntegerFieldUpdater.newUpdater(uW.class, "producerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater setY = AtomicIntegerFieldUpdater.newUpdater(uW.class, "consumerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater setX = AtomicIntegerFieldUpdater.newUpdater(uW.class, "blockingTasksInBuffer");
    private final AtomicReferenceArray<uU> setIconTintList = new AtomicReferenceArray<>(128);
    volatile /* synthetic */ Object lastScheduledTask = null;
    volatile /* synthetic */ int producerIndex = 0;
    volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public final uU setIconTintList(uU uUVar, boolean z) {
        if (z) {
            return MenuHostHelper$$ExternalSyntheticLambda0(uUVar);
        }
        uU uUVar2 = (uU) MenuHostHelper$$ExternalSyntheticLambda1.getAndSet(this, uUVar);
        if (uUVar2 == null) {
            return null;
        }
        return MenuHostHelper$$ExternalSyntheticLambda0(uUVar2);
    }

    public final long setY(uW uWVar) {
        rX.setIconTintList();
        uU y = uWVar.setY();
        if (y == null) {
            return setY(uWVar, false);
        }
        setIconTintList(y, false);
        rX.setIconTintList();
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        return setY(r9, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long MenuHostHelper$$ExternalSyntheticLambda0(o.uW r9) {
        /*
            r8 = this;
            o.rX.setIconTintList()
            int r0 = r9.consumerIndex
            int r1 = r9.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray<o.uU> r2 = r9.setIconTintList
        L9:
            r3 = 1
            if (r0 == r1) goto L47
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r9.blockingTasksInBuffer
            if (r5 == 0) goto L47
            java.lang.Object r5 = r2.get(r4)
            o.uU r5 = (o.uU) r5
            if (r5 == 0) goto L44
            o.uV r6 = r5.setLayoutAnimation
            int r6 = r6.MenuHostHelper$$ExternalSyntheticLambda0()
            r7 = 0
            if (r6 != r3) goto L25
            r6 = 1
            goto L26
        L25:
            r6 = 0
        L26:
            if (r6 == 0) goto L44
        L28:
            r6 = 0
            boolean r6 = r2.compareAndSet(r4, r5, r6)
            if (r6 == 0) goto L30
            goto L37
        L30:
            java.lang.Object r6 = r2.get(r4)
            if (r6 == r5) goto L28
            r3 = 0
        L37:
            if (r3 == 0) goto L44
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = o.uW.setX
            r0.decrementAndGet(r9)
            r8.setIconTintList(r5, r7)
            r0 = -1
            return r0
        L44:
            int r0 = r0 + 1
            goto L9
        L47:
            long r0 = r8.setY(r9, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.uW.MenuHostHelper$$ExternalSyntheticLambda0(o.uW):long");
    }

    private final long setY(uW uWVar, boolean z) {
        uU uUVar;
        boolean z2;
        do {
            uUVar = (uU) uWVar.lastScheduledTask;
            if (uUVar == null) {
                return -2L;
            }
            z2 = true;
            if (z) {
                if (!(uUVar.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0() == 1)) {
                    return -2L;
                }
            }
            long iconTintList = uS.setOnLongClickListener.setIconTintList() - uUVar.setOnLongClickListener;
            if (iconTintList < uS.setUiOptions) {
                return uS.setUiOptions - iconTintList;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = MenuHostHelper$$ExternalSyntheticLambda1;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(uWVar, uUVar, null)) {
                    if (atomicReferenceFieldUpdater.get(uWVar) != uUVar) {
                        z2 = false;
                        continue;
                        break;
                    }
                }
            }
        } while (!z2);
        setIconTintList(uUVar, false);
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final uU setY() {
        uU andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            if (setY.compareAndSet(this, i, i + 1) && (andSet = this.setIconTintList.getAndSet(i & 127, null)) != null) {
                setX(andSet);
                return andSet;
            }
        }
    }

    private final uU MenuHostHelper$$ExternalSyntheticLambda0(uU uUVar) {
        if (uUVar.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0() == 1) {
            setX.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return uUVar;
        }
        int i = this.producerIndex & 127;
        while (this.setIconTintList.get(i) != null) {
            Thread.yield();
        }
        this.setIconTintList.lazySet(i, uUVar);
        MenuHostHelper$$ExternalSyntheticLambda0.incrementAndGet(this);
        return null;
    }

    private final void setX(uU uUVar) {
        if (uUVar != null) {
            if (uUVar.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0() == 1) {
                setX.decrementAndGet(this);
                rX.setIconTintList();
            }
        }
    }
}