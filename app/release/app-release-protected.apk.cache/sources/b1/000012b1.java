package o;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import o.C0568wi;

/* renamed from: o.wb  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0561wb {
    public final C0532vb MenuHostHelper$$ExternalSyntheticLambda0;
    public int MenuHostHelper$$ExternalSyntheticLambda1;
    public vG setIconTintList;
    public C0568wi.setX setLayoutAnimation;
    public C0568wi setNavigationOnClickListener;
    private final vZ setOnLongClickListener;
    private final C0564we setUiOptions;
    private final AbstractC0549vs setUnboundedRipple;
    public int setX;
    public int setY;

    public C0561wb(C0564we c0564we, C0532vb c0532vb, vZ vZVar, AbstractC0549vs abstractC0549vs) {
        pN.setY(c0564we, "");
        pN.setY(c0532vb, "");
        pN.setY(vZVar, "");
        pN.setY(abstractC0549vs, "");
        this.setUiOptions = c0564we;
        this.MenuHostHelper$$ExternalSyntheticLambda0 = c0532vb;
        this.setOnLongClickListener = vZVar;
        this.setUnboundedRipple = abstractC0549vs;
    }

    private final C0563wd setY(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        while (true) {
            C0563wd MenuHostHelper$$ExternalSyntheticLambda1 = MenuHostHelper$$ExternalSyntheticLambda1(i, i2, i3, i4, z);
            if (MenuHostHelper$$ExternalSyntheticLambda1.setY(z2)) {
                return MenuHostHelper$$ExternalSyntheticLambda1;
            }
            synchronized (MenuHostHelper$$ExternalSyntheticLambda1) {
                MenuHostHelper$$ExternalSyntheticLambda1.setLayoutAnimation = true;
            }
            if (this.setIconTintList == null) {
                C0568wi.setX setx = this.setLayoutAnimation;
                if (setx == null || setx.setY < setx.MenuHostHelper$$ExternalSyntheticLambda0.size()) {
                    continue;
                } else {
                    C0568wi c0568wi = this.setNavigationOnClickListener;
                    if (!(c0568wi != null ? c0568wi.MenuHostHelper$$ExternalSyntheticLambda1() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0223, code lost:
        r2 = new java.lang.StringBuilder("No route to ");
        r2.append(r13);
        r2.append(':');
        r2.append(r12);
        r2.append("; port is out of range");
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0245, code lost:
        throw new java.net.SocketException(r2.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0549, code lost:
        if (r6 == null) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x054b, code lost:
        r1 = r9.setUnboundedRipple;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x054d, code lost:
        if (r1 == null) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x054f, code lost:
        o.vL.MenuHostHelper$$ExternalSyntheticLambda0(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x057f, code lost:
        throw new java.io.IOException("TLS tunnel buffered too many bytes!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x090b, code lost:
        r1 = r9.ViewPager$SavedState$1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0911, code lost:
        if (r1.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions == null) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x091b, code lost:
        if (r1.setX.type() != java.net.Proxy.Type.HTTP) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x091d, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x091f, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0920, code lost:
        if (r6 == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x0924, code lost:
        if (r9.setUnboundedRipple == null) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x0937, code lost:
        throw new o.C0566wg(new java.net.ProtocolException("Too many tunnel connections attempted: 21"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x0938, code lost:
        r9.MenuHostHelper$$ExternalSyntheticLambda0 = java.lang.System.nanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x093e, code lost:
        r22.setOnLongClickListener.setY = null;
        r2 = r22.setOnLongClickListener.setIconTintList.setGuidelinePercent;
        r3 = r9.ViewPager$SavedState$1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x094d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x094e, code lost:
        o.pN.setY(r3, "");
        r2.setIconTintList.remove(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x0958, code lost:
        monitor-exit(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0966, code lost:
        if (r22.setUiOptions.MenuHostHelper$$ExternalSyntheticLambda0(r22.MenuHostHelper$$ExternalSyntheticLambda0, r22.setOnLongClickListener, r21, true) == false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0968, code lost:
        r2 = r22.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1;
        o.pN.setX(r2);
        r22.setIconTintList = r20;
        r3 = r9.setCenterIfNoTextEnabled;
        o.pN.setX(r3);
        o.vL.MenuHostHelper$$ExternalSyntheticLambda0(r3);
        o.AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda0(r22.setOnLongClickListener, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0985, code lost:
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0986, code lost:
        monitor-enter(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0987, code lost:
        r2 = r22.setUiOptions;
        o.pN.setY(r9, "");
        r3 = o.vL.MenuHostHelper$$ExternalSyntheticLambda0;
        r2.MenuHostHelper$$ExternalSyntheticLambda0.add(r9);
        r2.setY.setX(r2.setIconTintList, 0);
        r22.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1(r9);
        r2 = o.nX.setX;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x09a5, code lost:
        monitor-exit(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x09a6, code lost:
        o.AbstractC0549vs.MenuHostHelper$$ExternalSyntheticLambda0(r22.setOnLongClickListener, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x09b0, code lost:
        return r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0a2d A[Catch: IOException -> 0x0a29, all -> 0x0aff, TryCatch #8 {IOException -> 0x0a29, blocks: (B:372:0x0a1f, B:376:0x0a2d, B:377:0x0a32), top: B:452:0x0a1f }] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0a56 A[Catch: all -> 0x0aff, TryCatch #22 {all -> 0x0aff, blocks: (B:116:0x02bd, B:121:0x02d6, B:123:0x02e9, B:125:0x02f1, B:135:0x0348, B:137:0x0350, B:390:0x0a52, B:392:0x0a56, B:393:0x0a59, B:395:0x0a5d, B:396:0x0a60, B:398:0x0a7f, B:404:0x0aa9, B:407:0x0ab6, B:409:0x0aba, B:411:0x0abe, B:413:0x0ac2, B:415:0x0aca, B:417:0x0ace, B:423:0x0add, B:424:0x0adf, B:399:0x0a85, B:401:0x0a9f, B:402:0x0aa4, B:372:0x0a1f, B:376:0x0a2d, B:377:0x0a32, B:128:0x0306, B:129:0x0327, B:130:0x0328, B:131:0x0338, B:132:0x0339, B:425:0x0ae0, B:426:0x0af0, B:427:0x0af1, B:428:0x0afe), top: B:479:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0a5d A[Catch: all -> 0x0aff, TryCatch #22 {all -> 0x0aff, blocks: (B:116:0x02bd, B:121:0x02d6, B:123:0x02e9, B:125:0x02f1, B:135:0x0348, B:137:0x0350, B:390:0x0a52, B:392:0x0a56, B:393:0x0a59, B:395:0x0a5d, B:396:0x0a60, B:398:0x0a7f, B:404:0x0aa9, B:407:0x0ab6, B:409:0x0aba, B:411:0x0abe, B:413:0x0ac2, B:415:0x0aca, B:417:0x0ace, B:423:0x0add, B:424:0x0adf, B:399:0x0a85, B:401:0x0a9f, B:402:0x0aa4, B:372:0x0a1f, B:376:0x0a2d, B:377:0x0a32, B:128:0x0306, B:129:0x0327, B:130:0x0328, B:131:0x0338, B:132:0x0339, B:425:0x0ae0, B:426:0x0af0, B:427:0x0af1, B:428:0x0afe), top: B:479:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0a7f A[Catch: all -> 0x0aff, TryCatch #22 {all -> 0x0aff, blocks: (B:116:0x02bd, B:121:0x02d6, B:123:0x02e9, B:125:0x02f1, B:135:0x0348, B:137:0x0350, B:390:0x0a52, B:392:0x0a56, B:393:0x0a59, B:395:0x0a5d, B:396:0x0a60, B:398:0x0a7f, B:404:0x0aa9, B:407:0x0ab6, B:409:0x0aba, B:411:0x0abe, B:413:0x0ac2, B:415:0x0aca, B:417:0x0ace, B:423:0x0add, B:424:0x0adf, B:399:0x0a85, B:401:0x0a9f, B:402:0x0aa4, B:372:0x0a1f, B:376:0x0a2d, B:377:0x0a32, B:128:0x0306, B:129:0x0327, B:130:0x0328, B:131:0x0338, B:132:0x0339, B:425:0x0ae0, B:426:0x0af0, B:427:0x0af1, B:428:0x0afe), top: B:479:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0a85 A[Catch: all -> 0x0aff, TryCatch #22 {all -> 0x0aff, blocks: (B:116:0x02bd, B:121:0x02d6, B:123:0x02e9, B:125:0x02f1, B:135:0x0348, B:137:0x0350, B:390:0x0a52, B:392:0x0a56, B:393:0x0a59, B:395:0x0a5d, B:396:0x0a60, B:398:0x0a7f, B:404:0x0aa9, B:407:0x0ab6, B:409:0x0aba, B:411:0x0abe, B:413:0x0ac2, B:415:0x0aca, B:417:0x0ace, B:423:0x0add, B:424:0x0adf, B:399:0x0a85, B:401:0x0a9f, B:402:0x0aa4, B:372:0x0a1f, B:376:0x0a2d, B:377:0x0a32, B:128:0x0306, B:129:0x0327, B:130:0x0328, B:131:0x0338, B:132:0x0339, B:425:0x0ae0, B:426:0x0af0, B:427:0x0af1, B:428:0x0afe), top: B:479:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x0aa9 A[Catch: all -> 0x0aff, TryCatch #22 {all -> 0x0aff, blocks: (B:116:0x02bd, B:121:0x02d6, B:123:0x02e9, B:125:0x02f1, B:135:0x0348, B:137:0x0350, B:390:0x0a52, B:392:0x0a56, B:393:0x0a59, B:395:0x0a5d, B:396:0x0a60, B:398:0x0a7f, B:404:0x0aa9, B:407:0x0ab6, B:409:0x0aba, B:411:0x0abe, B:413:0x0ac2, B:415:0x0aca, B:417:0x0ace, B:423:0x0add, B:424:0x0adf, B:399:0x0a85, B:401:0x0a9f, B:402:0x0aa4, B:372:0x0a1f, B:376:0x0a2d, B:377:0x0a32, B:128:0x0306, B:129:0x0327, B:130:0x0328, B:131:0x0338, B:132:0x0339, B:425:0x0ae0, B:426:0x0af0, B:427:0x0af1, B:428:0x0afe), top: B:479:0x02bd }] */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0ad7 A[LOOP:0: B:450:0x0348->B:422:0x0ad7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x05c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0a1f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:454:0x0365 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0add A[EDGE_INSN: B:482:0x0add->B:423:0x0add ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:485:0x0add A[EDGE_INSN: B:485:0x0add->B:423:0x0add ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final o.C0563wd MenuHostHelper$$ExternalSyntheticLambda1(int r23, int r24, int r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 2851
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.C0561wb.MenuHostHelper$$ExternalSyntheticLambda1(int, int, int, int, boolean):o.wd");
    }

    public final void MenuHostHelper$$ExternalSyntheticLambda1(IOException iOException) {
        pN.setY((Object) iOException, "");
        this.setIconTintList = null;
        if ((iOException instanceof wJ) && ((wJ) iOException).setIconTintList == EnumC0584wx.REFUSED_STREAM) {
            this.MenuHostHelper$$ExternalSyntheticLambda1++;
        } else if (iOException instanceof C0583ww) {
            this.setY++;
        } else {
            this.setX++;
        }
    }

    public final vG setIconTintList() {
        C0563wd c0563wd;
        if (this.MenuHostHelper$$ExternalSyntheticLambda1 > 1 || this.setY > 1 || this.setX > 0 || (c0563wd = this.setOnLongClickListener.MenuHostHelper$$ExternalSyntheticLambda1) == null) {
            return null;
        }
        synchronized (c0563wd) {
            if (c0563wd.setIconSize != 0) {
                return null;
            }
            if (vL.MenuHostHelper$$ExternalSyntheticLambda0(c0563wd.ViewPager$SavedState$1.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled, this.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled)) {
                return c0563wd.ViewPager$SavedState$1;
            }
            return null;
        }
    }

    public final boolean setY(C0555vx c0555vx) {
        pN.setY(c0555vx, "");
        C0555vx c0555vx2 = this.MenuHostHelper$$ExternalSyntheticLambda0.setCenterIfNoTextEnabled;
        return c0555vx.setIconTintList == c0555vx2.setIconTintList && pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0555vx.setY, (Object) c0555vx2.setY);
    }

    public final InterfaceC0574wn setIconTintList(vD vDVar, C0576wp c0576wp) {
        pN.setY(vDVar, "");
        pN.setY(c0576wp, "");
        try {
            C0563wd y = setY(c0576wp.setX, c0576wp.setY, c0576wp.setNavigationOnClickListener, vDVar.setZ, vDVar.setCheckedIconEnabled, !pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) c0576wp.MenuHostHelper$$ExternalSyntheticLambda0.setX, (Object) "GET"));
            pN.setY(vDVar, "");
            pN.setY(c0576wp, "");
            Socket socket = y.setCenterIfNoTextEnabled;
            pN.setX(socket);
            InterfaceC0607xr interfaceC0607xr = y.setChipCornerRadius;
            pN.setX(interfaceC0607xr);
            InterfaceC0606xq interfaceC0606xq = y.setTextAlignment;
            pN.setX(interfaceC0606xq);
            wB wBVar = y.setY;
            if (wBVar != null) {
                return new C0585wy(vDVar, y, c0576wp, wBVar);
            }
            socket.setSoTimeout(c0576wp.setY);
            interfaceC0607xr.setX().setY(c0576wp.setY, TimeUnit.MILLISECONDS);
            interfaceC0606xq.setX().setY(c0576wp.setNavigationOnClickListener, TimeUnit.MILLISECONDS);
            return new C0582wv(vDVar, y, interfaceC0607xr, interfaceC0606xq);
        } catch (IOException e) {
            MenuHostHelper$$ExternalSyntheticLambda1(e);
            throw new C0566wg(e);
        } catch (C0566wg e2) {
            MenuHostHelper$$ExternalSyntheticLambda1(e2.MenuHostHelper$$ExternalSyntheticLambda0);
            throw e2;
        }
    }
}