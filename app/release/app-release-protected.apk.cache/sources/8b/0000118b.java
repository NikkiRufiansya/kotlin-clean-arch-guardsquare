package o;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
final class uJ extends AbstractC0508ue {
    public static final uJ setIconTintList = new uJ();
    private static final ReentrantReadWriteLock MenuHostHelper$$ExternalSyntheticLambda1 = new ReentrantReadWriteLock();
    private static final WeakHashMap<Class<? extends Throwable>, InterfaceC0377pk<Throwable, Throwable>> setX = new WeakHashMap<>();

    private uJ() {
    }

    @Override // o.AbstractC0508ue
    public final InterfaceC0377pk<Throwable, Throwable> MenuHostHelper$$ExternalSyntheticLambda0(Class<? extends Throwable> cls) {
        ReentrantReadWriteLock reentrantReadWriteLock = MenuHostHelper$$ExternalSyntheticLambda1;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            InterfaceC0377pk<Throwable, Throwable> interfaceC0377pk = setX.get(cls);
            if (interfaceC0377pk != null) {
                return interfaceC0377pk;
            }
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                readLock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap<Class<? extends Throwable>, InterfaceC0377pk<Throwable, Throwable>> weakHashMap = setX;
                InterfaceC0377pk<Throwable, Throwable> interfaceC0377pk2 = weakHashMap.get(cls);
                if (interfaceC0377pk2 != null) {
                    return interfaceC0377pk2;
                }
                InterfaceC0377pk<Throwable, Throwable> MenuHostHelper$$ExternalSyntheticLambda12 = C0505ud.MenuHostHelper$$ExternalSyntheticLambda1(cls);
                weakHashMap.put(cls, MenuHostHelper$$ExternalSyntheticLambda12);
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
                return MenuHostHelper$$ExternalSyntheticLambda12;
            } finally {
                while (i < readHoldCount) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}