package o;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class wA {
    private static final Map<C0610xu, Integer> setIconTintList;
    public static final wA setY = new wA();
    private static final C0581wu[] setX = {new C0581wu(C0581wu.setIconTintList, ""), new C0581wu(C0581wu.setX, "GET"), new C0581wu(C0581wu.setX, "POST"), new C0581wu(C0581wu.MenuHostHelper$$ExternalSyntheticLambda1, "/"), new C0581wu(C0581wu.MenuHostHelper$$ExternalSyntheticLambda1, "/index.html"), new C0581wu(C0581wu.setOnLongClickListener, "http"), new C0581wu(C0581wu.setOnLongClickListener, "https"), new C0581wu(C0581wu.setY, "200"), new C0581wu(C0581wu.setY, "204"), new C0581wu(C0581wu.setY, "206"), new C0581wu(C0581wu.setY, "304"), new C0581wu(C0581wu.setY, "400"), new C0581wu(C0581wu.setY, "404"), new C0581wu(C0581wu.setY, "500"), new C0581wu("accept-charset", ""), new C0581wu("accept-encoding", "gzip, deflate"), new C0581wu("accept-language", ""), new C0581wu("accept-ranges", ""), new C0581wu("accept", ""), new C0581wu("access-control-allow-origin", ""), new C0581wu("age", ""), new C0581wu("allow", ""), new C0581wu("authorization", ""), new C0581wu("cache-control", ""), new C0581wu("content-disposition", ""), new C0581wu("content-encoding", ""), new C0581wu("content-language", ""), new C0581wu("content-length", ""), new C0581wu("content-location", ""), new C0581wu("content-range", ""), new C0581wu("content-type", ""), new C0581wu("cookie", ""), new C0581wu("date", ""), new C0581wu("etag", ""), new C0581wu("expect", ""), new C0581wu("expires", ""), new C0581wu("from", ""), new C0581wu("host", ""), new C0581wu("if-match", ""), new C0581wu("if-modified-since", ""), new C0581wu("if-none-match", ""), new C0581wu("if-range", ""), new C0581wu("if-unmodified-since", ""), new C0581wu("last-modified", ""), new C0581wu("link", ""), new C0581wu("location", ""), new C0581wu("max-forwards", ""), new C0581wu("proxy-authenticate", ""), new C0581wu("proxy-authorization", ""), new C0581wu("range", ""), new C0581wu("referer", ""), new C0581wu("refresh", ""), new C0581wu("retry-after", ""), new C0581wu("server", ""), new C0581wu("set-cookie", ""), new C0581wu("strict-transport-security", ""), new C0581wu("transfer-encoding", ""), new C0581wu("user-agent", ""), new C0581wu("vary", ""), new C0581wu("via", ""), new C0581wu("www-authenticate", "")};

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        for (int i = 0; i < 61; i++) {
            C0581wu[] c0581wuArr = setX;
            if (!linkedHashMap.containsKey(c0581wuArr[i].setUiOptions)) {
                linkedHashMap.put(c0581wuArr[i].setUiOptions, Integer.valueOf(i));
            }
        }
        Map<C0610xu, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) unmodifiableMap, "");
        setIconTintList = unmodifiableMap;
    }

    private wA() {
    }

    public static C0581wu[] setIconTintList() {
        return setX;
    }

    /* loaded from: classes.dex */
    public static final class setY {
        final int MenuHostHelper$$ExternalSyntheticLambda0;
        public int MenuHostHelper$$ExternalSyntheticLambda1;
        public C0581wu[] setIconTintList;
        final InterfaceC0607xr setLayoutAnimation;
        private int setOnLongClickListener;
        int setUiOptions;
        int setX;
        final List<C0581wu> setY;

        private setY(xJ xJVar, int i, int i2) {
            pN.setY(xJVar, "");
            this.MenuHostHelper$$ExternalSyntheticLambda0 = 4096;
            this.setX = 4096;
            this.setY = new ArrayList();
            pN.setY(xJVar, "");
            this.setLayoutAnimation = new xB(xJVar);
            this.setIconTintList = new C0581wu[8];
            this.setUiOptions = 7;
        }

        public /* synthetic */ setY(xJ xJVar) {
            this(xJVar, 4096, 4096);
        }

        public final void setY() {
            C0581wu[] c0581wuArr = this.setIconTintList;
            int length = c0581wuArr.length;
            pN.setY(c0581wuArr, "");
            Arrays.fill(c0581wuArr, 0, length, (Object) null);
            this.setUiOptions = this.setIconTintList.length - 1;
            this.setOnLongClickListener = 0;
            this.MenuHostHelper$$ExternalSyntheticLambda1 = 0;
        }

        public final int MenuHostHelper$$ExternalSyntheticLambda0(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.setIconTintList.length;
                while (true) {
                    length--;
                    i2 = this.setUiOptions;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    C0581wu c0581wu = this.setIconTintList[length];
                    pN.setX(c0581wu);
                    i -= c0581wu.setNavigationOnClickListener;
                    this.MenuHostHelper$$ExternalSyntheticLambda1 -= c0581wu.setNavigationOnClickListener;
                    this.setOnLongClickListener--;
                    i3++;
                }
                C0581wu[] c0581wuArr = this.setIconTintList;
                int i4 = i2 + 1;
                System.arraycopy(c0581wuArr, i4, c0581wuArr, i4 + i3, this.setOnLongClickListener);
                this.setUiOptions += i3;
            }
            return i3;
        }

        public final void setIconTintList(C0581wu c0581wu) {
            this.setY.add(c0581wu);
            int i = c0581wu.setNavigationOnClickListener;
            int i2 = this.setX;
            if (i > i2) {
                setY();
                return;
            }
            MenuHostHelper$$ExternalSyntheticLambda0((this.MenuHostHelper$$ExternalSyntheticLambda1 + i) - i2);
            int i3 = this.setOnLongClickListener;
            C0581wu[] c0581wuArr = this.setIconTintList;
            if (i3 + 1 > c0581wuArr.length) {
                C0581wu[] c0581wuArr2 = new C0581wu[c0581wuArr.length << 1];
                System.arraycopy(c0581wuArr, 0, c0581wuArr2, c0581wuArr.length, c0581wuArr.length);
                this.setUiOptions = this.setIconTintList.length - 1;
                this.setIconTintList = c0581wuArr2;
            }
            int i4 = this.setUiOptions;
            this.setUiOptions = i4 - 1;
            this.setIconTintList[i4] = c0581wu;
            this.setOnLongClickListener++;
            this.MenuHostHelper$$ExternalSyntheticLambda1 += i;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0013  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x001e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final o.C0610xu setY(int r5) {
            /*
                r4 = this;
                r0 = 1
                if (r5 < 0) goto L10
                o.wA r1 = o.wA.setY
                o.wu[] r1 = o.wA.setIconTintList()
                int r1 = r1.length
                int r1 = r1 - r0
                if (r5 <= r1) goto Le
                goto L10
            Le:
                r1 = 1
                goto L11
            L10:
                r1 = 0
            L11:
                if (r1 == 0) goto L1e
                o.wA r0 = o.wA.setY
                o.wu[] r0 = o.wA.setIconTintList()
                r5 = r0[r5]
                o.xu r5 = r5.setUiOptions
                goto L39
            L1e:
                o.wA r1 = o.wA.setY
                o.wu[] r1 = o.wA.setIconTintList()
                int r1 = r1.length
                int r1 = r5 - r1
                int r2 = r4.setUiOptions
                int r2 = r2 + r0
                int r2 = r2 + r1
                if (r2 < 0) goto L3a
                o.wu[] r1 = r4.setIconTintList
                int r3 = r1.length
                if (r2 >= r3) goto L3a
                r5 = r1[r2]
                o.pN.setX(r5)
                o.xu r5 = r5.setUiOptions
            L39:
                return r5
            L3a:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Header index too large "
                r1.<init>(r2)
                int r5 = r5 + r0
                r1.append(r5)
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r0 = r1.toString()
                r5.<init>(r0)
                java.lang.Throwable r5 = (java.lang.Throwable) r5
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: o.wA.setY.setY(int):o.xu");
        }

        public final C0610xu MenuHostHelper$$ExternalSyntheticLambda1() {
            int MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda1(this.setLayoutAnimation.setUnboundedRipple());
            boolean z = (MenuHostHelper$$ExternalSyntheticLambda1 & 128) == 128;
            long y = setY(MenuHostHelper$$ExternalSyntheticLambda1, 127);
            if (z) {
                C0602xo c0602xo = new C0602xo();
                wD wDVar = wD.MenuHostHelper$$ExternalSyntheticLambda1;
                wD.MenuHostHelper$$ExternalSyntheticLambda0(this.setLayoutAnimation, y, c0602xo);
                return c0602xo.MenuHostHelper$$ExternalSyntheticLambda0(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0);
            }
            return this.setLayoutAnimation.MenuHostHelper$$ExternalSyntheticLambda0(y);
        }

        public final int setY(int i, int i2) {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda1(this.setLayoutAnimation.setUnboundedRipple());
                if ((MenuHostHelper$$ExternalSyntheticLambda1 & 128) == 0) {
                    return i2 + (MenuHostHelper$$ExternalSyntheticLambda1 << i4);
                }
                i2 += (MenuHostHelper$$ExternalSyntheticLambda1 & 127) << i4;
                i4 += 7;
            }
        }
    }

    public static C0610xu setX(C0610xu c0610xu) {
        pN.setY(c0610xu, "");
        int MenuHostHelper$$ExternalSyntheticLambda0 = c0610xu.MenuHostHelper$$ExternalSyntheticLambda0();
        for (int i = 0; i < MenuHostHelper$$ExternalSyntheticLambda0; i++) {
            byte y = c0610xu.setY(i);
            if (65 <= y && 90 >= y) {
                StringBuilder sb = new StringBuilder("PROTOCOL_ERROR response malformed: mixed case name: ");
                String str = c0610xu.setX;
                if (str == null) {
                    byte[] x = c0610xu.setX();
                    pN.setY(x, "");
                    String str2 = new String(x, qQ.setIconTintList);
                    c0610xu.setX = str2;
                    str = str2;
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
        }
        return c0610xu;
    }
}