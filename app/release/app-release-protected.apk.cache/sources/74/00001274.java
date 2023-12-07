package o;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.C0405ql;
import o.wA;

/* loaded from: classes.dex */
public final class wC implements Closeable {
    static final Logger setX;
    public static final wC$MenuHostHelper$$ExternalSyntheticLambda0 setY = new wC$MenuHostHelper$$ExternalSyntheticLambda0((byte) 0);
    final InterfaceC0607xr MenuHostHelper$$ExternalSyntheticLambda0;
    final boolean MenuHostHelper$$ExternalSyntheticLambda1;
    private final setY setIconTintList;
    private final wA.setY setLayoutAnimation;

    public wC(InterfaceC0607xr interfaceC0607xr, boolean z) {
        pN.setY(interfaceC0607xr, "");
        this.MenuHostHelper$$ExternalSyntheticLambda0 = interfaceC0607xr;
        this.MenuHostHelper$$ExternalSyntheticLambda1 = z;
        setY sety = new setY(interfaceC0607xr);
        this.setIconTintList = sety;
        this.setLayoutAnimation = new wA.setY(sety);
    }

    public final boolean setY(boolean z, wC$MenuHostHelper$$ExternalSyntheticLambda1 wc_menuhosthelper__externalsyntheticlambda1) {
        C0405ql c0405ql;
        int iconSize;
        pN.setY(wc_menuhosthelper__externalsyntheticlambda1, "");
        try {
            this.MenuHostHelper$$ExternalSyntheticLambda0.setUiOptions(9L);
            int MenuHostHelper$$ExternalSyntheticLambda0 = vL.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0);
            if (MenuHostHelper$$ExternalSyntheticLambda0 > 16384) {
                StringBuilder sb = new StringBuilder("FRAME_SIZE_ERROR: ");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda0);
                throw new IOException(sb.toString());
            }
            int MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple());
            int MenuHostHelper$$ExternalSyntheticLambda12 = vL.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple());
            int iconSize2 = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize() & Integer.MAX_VALUE;
            Logger logger = setX;
            if (logger.isLoggable(Level.FINE)) {
                C0586wz c0586wz = C0586wz.setX;
                logger.fine(C0586wz.setY(true, iconSize2, MenuHostHelper$$ExternalSyntheticLambda0, MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda12));
            }
            if (z && MenuHostHelper$$ExternalSyntheticLambda1 != 4) {
                StringBuilder sb2 = new StringBuilder("Expected a SETTINGS frame but was ");
                C0586wz c0586wz2 = C0586wz.setX;
                sb2.append(C0586wz.setX(MenuHostHelper$$ExternalSyntheticLambda1));
                throw new IOException(sb2.toString());
            }
            switch (MenuHostHelper$$ExternalSyntheticLambda1) {
                case 0:
                    if (iconSize2 != 0) {
                        boolean z2 = (MenuHostHelper$$ExternalSyntheticLambda12 & 1) != 0;
                        if ((MenuHostHelper$$ExternalSyntheticLambda12 & 32) != 0) {
                            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                        }
                        int MenuHostHelper$$ExternalSyntheticLambda13 = (MenuHostHelper$$ExternalSyntheticLambda12 & 8) != 0 ? vL.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple()) : 0;
                        wc_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0(z2, iconSize2, this.MenuHostHelper$$ExternalSyntheticLambda0, wC$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0, MenuHostHelper$$ExternalSyntheticLambda12, MenuHostHelper$$ExternalSyntheticLambda13));
                        this.MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener(MenuHostHelper$$ExternalSyntheticLambda13);
                        break;
                    } else {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                case 1:
                    if (iconSize2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z3 = (MenuHostHelper$$ExternalSyntheticLambda12 & 1) != 0;
                    int MenuHostHelper$$ExternalSyntheticLambda14 = (MenuHostHelper$$ExternalSyntheticLambda12 & 8) != 0 ? vL.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple()) : 0;
                    if ((MenuHostHelper$$ExternalSyntheticLambda12 & 32) != 0) {
                        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize();
                        vL.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple());
                        MenuHostHelper$$ExternalSyntheticLambda0 -= 5;
                    }
                    wc_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0(z3, iconSize2, setIconTintList(wC$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0, MenuHostHelper$$ExternalSyntheticLambda12, MenuHostHelper$$ExternalSyntheticLambda14), MenuHostHelper$$ExternalSyntheticLambda14, MenuHostHelper$$ExternalSyntheticLambda12, iconSize2));
                    break;
                case 2:
                    if (MenuHostHelper$$ExternalSyntheticLambda0 != 5) {
                        StringBuilder sb3 = new StringBuilder("TYPE_PRIORITY length: ");
                        sb3.append(MenuHostHelper$$ExternalSyntheticLambda0);
                        sb3.append(" != 5");
                        throw new IOException(sb3.toString());
                    } else if (iconSize2 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    } else {
                        this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize();
                        vL.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple());
                        break;
                    }
                case 3:
                    if (MenuHostHelper$$ExternalSyntheticLambda0 != 4) {
                        StringBuilder sb4 = new StringBuilder("TYPE_RST_STREAM length: ");
                        sb4.append(MenuHostHelper$$ExternalSyntheticLambda0);
                        sb4.append(" != 4");
                        throw new IOException(sb4.toString());
                    } else if (iconSize2 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    } else {
                        int iconSize3 = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize();
                        wx$MenuHostHelper$$ExternalSyntheticLambda0 wx_menuhosthelper__externalsyntheticlambda0 = EnumC0584wx.setIconTintList;
                        EnumC0584wx MenuHostHelper$$ExternalSyntheticLambda15 = wx$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(iconSize3);
                        if (MenuHostHelper$$ExternalSyntheticLambda15 == null) {
                            StringBuilder sb5 = new StringBuilder("TYPE_RST_STREAM unexpected error code: ");
                            sb5.append(iconSize3);
                            throw new IOException(sb5.toString());
                        }
                        wc_menuhosthelper__externalsyntheticlambda1.setY(iconSize2, MenuHostHelper$$ExternalSyntheticLambda15);
                        break;
                    }
                case 4:
                    if (iconSize2 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((MenuHostHelper$$ExternalSyntheticLambda12 & 1) != 0) {
                        if (MenuHostHelper$$ExternalSyntheticLambda0 != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                    } else if (MenuHostHelper$$ExternalSyntheticLambda0 % 6 != 0) {
                        StringBuilder sb6 = new StringBuilder("TYPE_SETTINGS length % 6 != 0: ");
                        sb6.append(MenuHostHelper$$ExternalSyntheticLambda0);
                        throw new IOException(sb6.toString());
                    } else {
                        wH wHVar = new wH();
                        if (MenuHostHelper$$ExternalSyntheticLambda0 <= Integer.MIN_VALUE) {
                            C0405ql.setY sety = C0405ql.setLayoutAnimation;
                            c0405ql = C0405ql.setNavigationOnClickListener;
                        } else {
                            c0405ql = new C0405ql(0, MenuHostHelper$$ExternalSyntheticLambda0 - 1);
                        }
                        C0402qi iconTintList = C0412qs.setIconTintList(c0405ql, 6);
                        int iconTintList2 = iconTintList.setIconTintList();
                        int i = iconTintList.setIconTintList;
                        int i2 = iconTintList.setX;
                        if (i2 < 0 ? iconTintList2 >= i : iconTintList2 <= i) {
                            while (true) {
                                int MenuHostHelper$$ExternalSyntheticLambda16 = vL.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.ViewPager$SavedState$1());
                                iconSize = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize();
                                if (MenuHostHelper$$ExternalSyntheticLambda16 != 2) {
                                    if (MenuHostHelper$$ExternalSyntheticLambda16 == 3) {
                                        MenuHostHelper$$ExternalSyntheticLambda16 = 4;
                                    } else if (MenuHostHelper$$ExternalSyntheticLambda16 != 4) {
                                        if (MenuHostHelper$$ExternalSyntheticLambda16 == 5 && (iconSize < 16384 || iconSize > 16777215)) {
                                        }
                                    } else if (iconSize < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    } else {
                                        MenuHostHelper$$ExternalSyntheticLambda16 = 7;
                                    }
                                } else if (iconSize != 0 && iconSize != 1) {
                                    throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                }
                                wHVar.setIconTintList(MenuHostHelper$$ExternalSyntheticLambda16, iconSize);
                                if (iconTintList2 != i) {
                                    iconTintList2 += i2;
                                }
                            }
                            StringBuilder sb7 = new StringBuilder("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ");
                            sb7.append(iconSize);
                            throw new IOException(sb7.toString());
                        }
                        wc_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda0(wHVar);
                        break;
                    }
                    break;
                case 5:
                    if (iconSize2 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    int MenuHostHelper$$ExternalSyntheticLambda17 = (MenuHostHelper$$ExternalSyntheticLambda12 & 8) != 0 ? vL.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.setUnboundedRipple()) : 0;
                    wc_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize() & Integer.MAX_VALUE, setIconTintList(wC$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(MenuHostHelper$$ExternalSyntheticLambda0 - 4, MenuHostHelper$$ExternalSyntheticLambda12, MenuHostHelper$$ExternalSyntheticLambda17), MenuHostHelper$$ExternalSyntheticLambda17, MenuHostHelper$$ExternalSyntheticLambda12, iconSize2));
                    break;
                case 6:
                    if (MenuHostHelper$$ExternalSyntheticLambda0 != 8) {
                        StringBuilder sb8 = new StringBuilder("TYPE_PING length != 8: ");
                        sb8.append(MenuHostHelper$$ExternalSyntheticLambda0);
                        throw new IOException(sb8.toString());
                    } else if (iconSize2 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    } else {
                        wc_menuhosthelper__externalsyntheticlambda1.setY((MenuHostHelper$$ExternalSyntheticLambda12 & 1) != 0, this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize(), this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize());
                        break;
                    }
                case 7:
                    if (MenuHostHelper$$ExternalSyntheticLambda0 < 8) {
                        StringBuilder sb9 = new StringBuilder("TYPE_GOAWAY length < 8: ");
                        sb9.append(MenuHostHelper$$ExternalSyntheticLambda0);
                        throw new IOException(sb9.toString());
                    } else if (iconSize2 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    } else {
                        int iconSize4 = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize();
                        int iconSize5 = this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize();
                        int i3 = MenuHostHelper$$ExternalSyntheticLambda0 - 8;
                        wx$MenuHostHelper$$ExternalSyntheticLambda0 wx_menuhosthelper__externalsyntheticlambda02 = EnumC0584wx.setIconTintList;
                        EnumC0584wx MenuHostHelper$$ExternalSyntheticLambda18 = wx$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda1(iconSize5);
                        if (MenuHostHelper$$ExternalSyntheticLambda18 == null) {
                            StringBuilder sb10 = new StringBuilder("TYPE_GOAWAY unexpected error code: ");
                            sb10.append(iconSize5);
                            throw new IOException(sb10.toString());
                        }
                        C0610xu c0610xu = C0610xu.setY;
                        if (i3 > 0) {
                            c0610xu = this.MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0(i3);
                        }
                        wc_menuhosthelper__externalsyntheticlambda1.setY(iconSize4, MenuHostHelper$$ExternalSyntheticLambda18, c0610xu);
                        break;
                    }
                case 8:
                    if (MenuHostHelper$$ExternalSyntheticLambda0 != 4) {
                        StringBuilder sb11 = new StringBuilder("TYPE_WINDOW_UPDATE length !=4: ");
                        sb11.append(MenuHostHelper$$ExternalSyntheticLambda0);
                        throw new IOException(sb11.toString());
                    }
                    long MenuHostHelper$$ExternalSyntheticLambda02 = vL.MenuHostHelper$$ExternalSyntheticLambda0(this.MenuHostHelper$$ExternalSyntheticLambda0.setIconSize());
                    if (MenuHostHelper$$ExternalSyntheticLambda02 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    wc_menuhosthelper__externalsyntheticlambda1.setX(iconSize2, MenuHostHelper$$ExternalSyntheticLambda02);
                    break;
                default:
                    this.MenuHostHelper$$ExternalSyntheticLambda0.setOnLongClickListener(MenuHostHelper$$ExternalSyntheticLambda0);
                    break;
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.util.List<o.C0581wu> setIconTintList(int r3, int r4, int r5, int r6) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.wC.setIconTintList(int, int, int, int):java.util.List");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.MenuHostHelper$$ExternalSyntheticLambda0.close();
    }

    /* loaded from: classes.dex */
    public static final class setY implements xJ {
        int MenuHostHelper$$ExternalSyntheticLambda0;
        int MenuHostHelper$$ExternalSyntheticLambda1;
        int setIconTintList;
        private final InterfaceC0607xr setUnboundedRipple;
        int setX;
        int setY;

        @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        public setY(InterfaceC0607xr interfaceC0607xr) {
            pN.setY(interfaceC0607xr, "");
            this.setUnboundedRipple = interfaceC0607xr;
        }

        @Override // o.xJ
        public final long setY(C0602xo c0602xo, long j) {
            int i;
            int iconSize;
            pN.setY(c0602xo, "");
            do {
                int i2 = this.setY;
                if (i2 == 0) {
                    this.setUnboundedRipple.setOnLongClickListener(this.MenuHostHelper$$ExternalSyntheticLambda0);
                    this.MenuHostHelper$$ExternalSyntheticLambda0 = 0;
                    if ((this.MenuHostHelper$$ExternalSyntheticLambda1 & 4) != 0) {
                        return -1L;
                    }
                    i = this.setIconTintList;
                    int MenuHostHelper$$ExternalSyntheticLambda0 = vL.MenuHostHelper$$ExternalSyntheticLambda0(this.setUnboundedRipple);
                    this.setY = MenuHostHelper$$ExternalSyntheticLambda0;
                    this.setX = MenuHostHelper$$ExternalSyntheticLambda0;
                    int MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda1(this.setUnboundedRipple.setUnboundedRipple());
                    this.MenuHostHelper$$ExternalSyntheticLambda1 = vL.MenuHostHelper$$ExternalSyntheticLambda1(this.setUnboundedRipple.setUnboundedRipple());
                    wC$MenuHostHelper$$ExternalSyntheticLambda0 wc_menuhosthelper__externalsyntheticlambda0 = wC.setY;
                    if (wC.setX.isLoggable(Level.FINE)) {
                        wC$MenuHostHelper$$ExternalSyntheticLambda0 wc_menuhosthelper__externalsyntheticlambda02 = wC.setY;
                        Logger logger = wC.setX;
                        C0586wz c0586wz = C0586wz.setX;
                        logger.fine(C0586wz.setY(true, this.setIconTintList, this.setX, MenuHostHelper$$ExternalSyntheticLambda1, this.MenuHostHelper$$ExternalSyntheticLambda1));
                    }
                    iconSize = this.setUnboundedRipple.setIconSize() & Integer.MAX_VALUE;
                    this.setIconTintList = iconSize;
                    if (MenuHostHelper$$ExternalSyntheticLambda1 != 9) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(MenuHostHelper$$ExternalSyntheticLambda1);
                        sb.append(" != TYPE_CONTINUATION");
                        throw new IOException(sb.toString());
                    }
                } else {
                    long y = this.setUnboundedRipple.setY(c0602xo, Math.min(j, i2));
                    if (y == -1) {
                        return -1L;
                    }
                    this.setY -= (int) y;
                    return y;
                }
            } while (iconSize == i);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }

        @Override // o.xJ
        public final xI setX() {
            return this.setUnboundedRipple.setX();
        }
    }

    static {
        Logger logger = Logger.getLogger(C0586wz.class.getName());
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) logger, "");
        setX = logger;
    }
}