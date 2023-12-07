package o;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class setStepSize<K, V> {
    private int MenuHostHelper$$ExternalSyntheticLambda0;
    private final LinkedHashMap<K, V> MenuHostHelper$$ExternalSyntheticLambda1;
    private int setIconTintList;
    private int setLayoutAnimation;
    private int setUiOptions;
    private int setX;
    private int setY;

    public setStepSize(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.setY = i;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final V setY(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.MenuHostHelper$$ExternalSyntheticLambda1.get(k);
            if (v != null) {
                this.setIconTintList++;
                return v;
            }
            this.setX++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r4 = new java.lang.StringBuilder();
        r4.append(getClass().getName());
        r4.append(".sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008a, code lost:
        throw new java.lang.IllegalStateException(r4.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final V MenuHostHelper$$ExternalSyntheticLambda1(K r3, V r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L91
            if (r4 == 0) goto L91
            monitor-enter(r2)
            int r0 = r2.setUiOptions     // Catch: java.lang.Throwable -> L8e
            int r0 = r0 + 1
            r2.setUiOptions = r0     // Catch: java.lang.Throwable -> L8e
            int r0 = r2.setLayoutAnimation     // Catch: java.lang.Throwable -> L8e
            int r0 = r0 + 1
            r2.setLayoutAnimation = r0     // Catch: java.lang.Throwable -> L8e
            java.util.LinkedHashMap<K, V> r0 = r2.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L1f
            int r4 = r2.setLayoutAnimation     // Catch: java.lang.Throwable -> L8e
            int r4 = r4 + (-1)
            r2.setLayoutAnimation = r4     // Catch: java.lang.Throwable -> L8e
        L1f:
            monitor-exit(r2)
            int r4 = r2.setY
        L22:
            monitor-enter(r2)
            int r0 = r2.setLayoutAnimation     // Catch: java.lang.Throwable -> L8b
            if (r0 < 0) goto L6c
            java.util.LinkedHashMap<K, V> r0 = r2.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L33
            int r0 = r2.setLayoutAnimation     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L6c
        L33:
            int r0 = r2.setLayoutAnimation     // Catch: java.lang.Throwable -> L8b
            if (r0 <= r4) goto L6a
            java.util.LinkedHashMap<K, V> r0 = r2.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L8b
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8b
            if (r0 == 0) goto L40
            goto L6a
        L40:
            java.util.LinkedHashMap<K, V> r0 = r2.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L8b
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L8b
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L8b
            r0.getValue()     // Catch: java.lang.Throwable -> L8b
            java.util.LinkedHashMap<K, V> r0 = r2.MenuHostHelper$$ExternalSyntheticLambda1     // Catch: java.lang.Throwable -> L8b
            r0.remove(r1)     // Catch: java.lang.Throwable -> L8b
            int r0 = r2.setLayoutAnimation     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 + (-1)
            r2.setLayoutAnimation = r0     // Catch: java.lang.Throwable -> L8b
            int r0 = r2.MenuHostHelper$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L8b
            int r0 = r0 + 1
            r2.MenuHostHelper$$ExternalSyntheticLambda0 = r0     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r2)
            goto L22
        L6a:
            monitor-exit(r2)
            return r3
        L6c:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L8b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8b
            r4.<init>()     // Catch: java.lang.Throwable -> L8b
            java.lang.Class r0 = r2.getClass()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L8b
            r4.append(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L8b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L8b
            throw r3     // Catch: java.lang.Throwable -> L8b
        L8b:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L8e:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        L91:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "key == null || value == null"
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setStepSize.MenuHostHelper$$ExternalSyntheticLambda1(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        String format;
        synchronized (this) {
            int i = this.setIconTintList;
            int i2 = this.setX + i;
            format = String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.setY), Integer.valueOf(this.setIconTintList), Integer.valueOf(this.setX), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
        }
        return format;
    }
}