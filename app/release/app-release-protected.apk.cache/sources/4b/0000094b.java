package o;

import java.io.File;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class setAlwaysDrawnWithCacheEnabled {
    private static final Map<String, Lock> MenuHostHelper$$ExternalSyntheticLambda0 = new HashMap();
    public FileChannel MenuHostHelper$$ExternalSyntheticLambda1;
    public final File setIconTintList;
    public final boolean setX;
    public final Lock setY;

    public setAlwaysDrawnWithCacheEnabled(String str, File file, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".lck");
        File file2 = new File(file, sb.toString());
        this.setIconTintList = file2;
        this.setY = MenuHostHelper$$ExternalSyntheticLambda1(file2.getAbsolutePath());
        this.setX = z;
    }

    private static Lock MenuHostHelper$$ExternalSyntheticLambda1(String str) {
        Lock lock;
        Map<String, Lock> map = MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (map) {
            lock = map.get(str);
            if (lock == null) {
                lock = new ReentrantLock();
                map.put(str, lock);
            }
        }
        return lock;
    }
}