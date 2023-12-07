package o;

import java.util.Map;

/* loaded from: classes.dex */
public final class dB extends dC {
    private static final C0106dm setX = C0106dm.setY();
    private final C0149fc MenuHostHelper$$ExternalSyntheticLambda1;

    public dB(C0149fc c0149fc) {
        this.MenuHostHelper$$ExternalSyntheticLambda1 = c0149fc;
    }

    @Override // o.dC
    public final boolean setIconTintList() {
        boolean z;
        boolean z2;
        if (!setY(this.MenuHostHelper$$ExternalSyntheticLambda1, 0)) {
            C0106dm c0106dm = setX;
            StringBuilder sb = new StringBuilder("Invalid Trace:");
            sb.append(this.MenuHostHelper$$ExternalSyntheticLambda1.name_);
            String obj = sb.toString();
            if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                Cdo.setX(obj);
            }
            return false;
        }
        C0149fc c0149fc = this.MenuHostHelper$$ExternalSyntheticLambda1;
        if (c0149fc.counters_.size() > 0) {
            z = true;
            break;
        }
        for (C0149fc c0149fc2 : c0149fc.subtraces_) {
            if (c0149fc2.counters_.size() > 0) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                z = true;
                break;
            }
        }
        z = false;
        if (!z || MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda1, 0)) {
            return true;
        }
        C0106dm c0106dm2 = setX;
        StringBuilder sb2 = new StringBuilder("Invalid Counters for Trace:");
        sb2.append(this.MenuHostHelper$$ExternalSyntheticLambda1.name_);
        String obj2 = sb2.toString();
        if (c0106dm2.MenuHostHelper$$ExternalSyntheticLambda0) {
            Cdo cdo2 = c0106dm2.MenuHostHelper$$ExternalSyntheticLambda1;
            Cdo.setX(obj2);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean MenuHostHelper$$ExternalSyntheticLambda1(o.C0149fc r7, int r8) {
        /*
            r6 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 1
            if (r8 <= r1) goto L15
            o.dm r7 = o.dB.setX
            boolean r8 = r7.MenuHostHelper$$ExternalSyntheticLambda0
            if (r8 == 0) goto L14
            o.do r7 = r7.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.String r7 = "Exceed MAX_SUBTRACE_DEEP:1"
            o.Cdo.setX(r7)
        L14:
            return r0
        L15:
            o.iA<java.lang.String, java.lang.Long> r2 = r7.counters_
            java.util.Map r2 = java.util.Collections.unmodifiableMap(r2)
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb5
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L39
        L37:
            r4 = 0
            goto L68
        L39:
            java.lang.String r4 = r4.trim()
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L51
            o.dm r4 = o.dB.setX
            boolean r5 = r4.MenuHostHelper$$ExternalSyntheticLambda0
            if (r5 == 0) goto L37
            o.do r4 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.String r4 = "counterId is empty"
            o.Cdo.setX(r4)
            goto L37
        L51:
            int r4 = r4.length()
            r5 = 100
            if (r4 <= r5) goto L67
            o.dm r4 = o.dB.setX
            boolean r5 = r4.MenuHostHelper$$ExternalSyntheticLambda0
            if (r5 == 0) goto L37
            o.do r4 = r4.MenuHostHelper$$ExternalSyntheticLambda1
            java.lang.String r4 = "counterId exceeded max length 100"
            o.Cdo.setX(r4)
            goto L37
        L67:
            r4 = 1
        L68:
            if (r4 != 0) goto L8a
            o.dm r7 = o.dB.setX
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "invalid CounterId:"
            r8.<init>(r1)
            java.lang.Object r1 = r3.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            boolean r1 = r7.MenuHostHelper$$ExternalSyntheticLambda0
            if (r1 == 0) goto L89
            o.do r7 = r7.MenuHostHelper$$ExternalSyntheticLambda1
            o.Cdo.setX(r8)
        L89:
            return r0
        L8a:
            java.lang.Object r4 = r3.getValue()
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L94
            r4 = 1
            goto L95
        L94:
            r4 = 0
        L95:
            if (r4 != 0) goto L23
            o.dm r7 = o.dB.setX
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "invalid CounterValue:"
            r8.<init>(r1)
            java.lang.Object r1 = r3.getValue()
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            boolean r1 = r7.MenuHostHelper$$ExternalSyntheticLambda0
            if (r1 == 0) goto Lb4
            o.do r7 = r7.MenuHostHelper$$ExternalSyntheticLambda1
            o.Cdo.setX(r8)
        Lb4:
            return r0
        Lb5:
            o.ip$setY<o.fc> r7 = r7.subtraces_
            java.util.Iterator r7 = r7.iterator()
        Lbb:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto Ld0
            java.lang.Object r2 = r7.next()
            o.fc r2 = (o.C0149fc) r2
            int r3 = r8 + 1
            boolean r2 = r6.MenuHostHelper$$ExternalSyntheticLambda1(r2, r3)
            if (r2 != 0) goto Lbb
            return r0
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dB.MenuHostHelper$$ExternalSyntheticLambda1(o.fc, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean setY(o.C0149fc r8, int r9) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.dB.setY(o.fc, int):boolean");
    }

    private static boolean setX(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            try {
                setX(entry.getKey(), entry.getValue());
            } catch (IllegalArgumentException e) {
                C0106dm c0106dm = setX;
                String localizedMessage = e.getLocalizedMessage();
                if (c0106dm.MenuHostHelper$$ExternalSyntheticLambda0) {
                    Cdo cdo = c0106dm.MenuHostHelper$$ExternalSyntheticLambda1;
                    Cdo.setX(localizedMessage);
                    return false;
                }
                return false;
            }
        }
        return true;
    }
}