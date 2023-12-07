package o;

import java.util.concurrent.CancellationException;
import o.setMeasureWithLargestChildEnabled;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes.dex */
final class setMeasureWithLargestChildEnabled$MenuHostHelper$$ExternalSyntheticLambda1<T> extends pO implements InterfaceC0389pw<setMeasureWithLargestChildEnabled.setIconTintList<T>, Throwable, nX> {
    public static final setMeasureWithLargestChildEnabled$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda1 = new setMeasureWithLargestChildEnabled$MenuHostHelper$$ExternalSyntheticLambda1();

    setMeasureWithLargestChildEnabled$MenuHostHelper$$ExternalSyntheticLambda1() {
        super(2);
    }

    @Override // o.InterfaceC0389pw
    public final /* synthetic */ nX MenuHostHelper$$ExternalSyntheticLambda0(Object obj, Throwable th) {
        setMeasureWithLargestChildEnabled.setIconTintList seticontintlist = (setMeasureWithLargestChildEnabled.setIconTintList) obj;
        CancellationException cancellationException = th;
        pN.setY(seticontintlist, "");
        if (seticontintlist instanceof setMeasureWithLargestChildEnabled.setIconTintList.setX) {
            InterfaceC0445ry<T> interfaceC0445ry = ((setMeasureWithLargestChildEnabled.setIconTintList.setX) seticontintlist).MenuHostHelper$$ExternalSyntheticLambda1;
            if (cancellationException == null) {
                cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
            }
            interfaceC0445ry.setY(cancellationException);
        }
        return nX.setX;
    }
}