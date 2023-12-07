package o;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import o.C0603xp;

/* renamed from: o.xz  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0615xz {
    private static final Logger setY = Logger.getLogger("okio.Okio");

    public static final xJ setY(InputStream inputStream) {
        pN.setY(inputStream, "");
        return new xA(inputStream, new xI());
    }

    public static final xK MenuHostHelper$$ExternalSyntheticLambda1(Socket socket) {
        pN.setY(socket, "");
        final xG xGVar = new xG(socket);
        OutputStream outputStream = socket.getOutputStream();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) outputStream, "");
        final xF xFVar = new xF(outputStream, xGVar);
        pN.setY(xFVar, "");
        return new xK() { // from class: o.xp$MenuHostHelper$$ExternalSyntheticLambda1
            @Override // o.xK, java.io.Flushable
            public final void flush() {
                boolean y;
                C0603xp c0603xp = C0603xp.this;
                c0603xp.setIconTintList();
                boolean z = false;
                try {
                    try {
                        xFVar.flush();
                        nX nXVar = nX.setX;
                        if (c0603xp.setIconTintList) {
                            c0603xp.setIconTintList = false;
                            C0603xp.setX setx = C0603xp.setX;
                            z = C0603xp.setX.setY(c0603xp);
                        }
                        if (z) {
                            throw c0603xp.MenuHostHelper$$ExternalSyntheticLambda0((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (c0603xp.setIconTintList) {
                            c0603xp.setIconTintList = false;
                            C0603xp.setX setx2 = C0603xp.setX;
                            y = C0603xp.setX.setY(c0603xp);
                        } else {
                            y = false;
                        }
                        if (y) {
                            e = c0603xp.MenuHostHelper$$ExternalSyntheticLambda0(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    if (c0603xp.setIconTintList) {
                        c0603xp.setIconTintList = false;
                        C0603xp.setX setx3 = C0603xp.setX;
                        C0603xp.setX.setY(c0603xp);
                    }
                    throw th;
                }
            }

            @Override // o.xK, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                boolean y;
                C0603xp c0603xp = C0603xp.this;
                c0603xp.setIconTintList();
                boolean z = false;
                try {
                    try {
                        xFVar.close();
                        nX nXVar = nX.setX;
                        if (c0603xp.setIconTintList) {
                            c0603xp.setIconTintList = false;
                            C0603xp.setX setx = C0603xp.setX;
                            z = C0603xp.setX.setY(c0603xp);
                        }
                        if (z) {
                            throw c0603xp.MenuHostHelper$$ExternalSyntheticLambda0((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (c0603xp.setIconTintList) {
                            c0603xp.setIconTintList = false;
                            C0603xp.setX setx2 = C0603xp.setX;
                            y = C0603xp.setX.setY(c0603xp);
                        } else {
                            y = false;
                        }
                        if (y) {
                            e = c0603xp.MenuHostHelper$$ExternalSyntheticLambda0(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    if (c0603xp.setIconTintList) {
                        c0603xp.setIconTintList = false;
                        C0603xp.setX setx3 = C0603xp.setX;
                        C0603xp.setX.setY(c0603xp);
                    }
                    throw th;
                }
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AsyncTimeout.sink(");
                sb.append(xFVar);
                sb.append(')');
                return sb.toString();
            }

            @Override // o.xK
            public final /* bridge */ /* synthetic */ xI setX() {
                return C0603xp.this;
            }

            @Override // o.xK
            public final void a_(C0602xo c0602xo, long j) {
                boolean y;
                pN.setY(c0602xo, "");
                C0601xn.setIconTintList(c0602xo.MenuHostHelper$$ExternalSyntheticLambda0, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    xE xEVar = c0602xo.MenuHostHelper$$ExternalSyntheticLambda1;
                    pN.setX(xEVar);
                    while (true) {
                        if (j2 >= 65536) {
                            break;
                        }
                        j2 += xEVar.setIconTintList - xEVar.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            xEVar = xEVar.setY;
                            pN.setX(xEVar);
                        }
                    }
                    C0603xp c0603xp = C0603xp.this;
                    c0603xp.setIconTintList();
                    boolean z = false;
                    try {
                        try {
                            xFVar.a_(c0602xo, j2);
                            nX nXVar = nX.setX;
                            if (c0603xp.setIconTintList) {
                                c0603xp.setIconTintList = false;
                                C0603xp.setX setx = C0603xp.setX;
                                z = C0603xp.setX.setY(c0603xp);
                            }
                            if (z) {
                                throw c0603xp.MenuHostHelper$$ExternalSyntheticLambda0((IOException) null);
                            }
                            j -= j2;
                        } catch (IOException e) {
                            e = e;
                            if (c0603xp.setIconTintList) {
                                c0603xp.setIconTintList = false;
                                C0603xp.setX setx2 = C0603xp.setX;
                                y = C0603xp.setX.setY(c0603xp);
                            } else {
                                y = false;
                            }
                            if (y) {
                                e = c0603xp.MenuHostHelper$$ExternalSyntheticLambda0(e);
                            }
                            throw e;
                        }
                    } catch (Throwable th) {
                        if (c0603xp.setIconTintList) {
                            c0603xp.setIconTintList = false;
                            C0603xp.setX setx3 = C0603xp.setX;
                            C0603xp.setX.setY(c0603xp);
                        }
                        throw th;
                    }
                }
            }
        };
    }

    public static final xJ MenuHostHelper$$ExternalSyntheticLambda0(Socket socket) {
        pN.setY(socket, "");
        final xG xGVar = new xG(socket);
        InputStream inputStream = socket.getInputStream();
        pN.MenuHostHelper$$ExternalSyntheticLambda0((Object) inputStream, "");
        final xA xAVar = new xA(inputStream, xGVar);
        pN.setY(xAVar, "");
        return new xJ() { // from class: o.xp$MenuHostHelper$$ExternalSyntheticLambda0
            @Override // o.xJ
            public final long setY(C0602xo c0602xo, long j) {
                boolean y;
                pN.setY(c0602xo, "");
                C0603xp c0603xp = C0603xp.this;
                c0603xp.setIconTintList();
                boolean z = false;
                try {
                    try {
                        long y2 = xAVar.setY(c0602xo, j);
                        if (c0603xp.setIconTintList) {
                            c0603xp.setIconTintList = false;
                            C0603xp.setX setx = C0603xp.setX;
                            z = C0603xp.setX.setY(c0603xp);
                        }
                        if (z) {
                            throw c0603xp.MenuHostHelper$$ExternalSyntheticLambda0((IOException) null);
                        }
                        return y2;
                    } catch (IOException e) {
                        e = e;
                        if (c0603xp.setIconTintList) {
                            c0603xp.setIconTintList = false;
                            C0603xp.setX setx2 = C0603xp.setX;
                            y = C0603xp.setX.setY(c0603xp);
                        } else {
                            y = false;
                        }
                        if (y) {
                            e = c0603xp.MenuHostHelper$$ExternalSyntheticLambda0(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    if (c0603xp.setIconTintList) {
                        c0603xp.setIconTintList = false;
                        C0603xp.setX setx3 = C0603xp.setX;
                        C0603xp.setX.setY(c0603xp);
                    }
                    throw th;
                }
            }

            @Override // o.xJ, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                boolean y;
                C0603xp c0603xp = C0603xp.this;
                c0603xp.setIconTintList();
                boolean z = false;
                try {
                    try {
                        xAVar.close();
                        nX nXVar = nX.setX;
                        if (c0603xp.setIconTintList) {
                            c0603xp.setIconTintList = false;
                            C0603xp.setX setx = C0603xp.setX;
                            z = C0603xp.setX.setY(c0603xp);
                        }
                        if (z) {
                            throw c0603xp.MenuHostHelper$$ExternalSyntheticLambda0((IOException) null);
                        }
                    } catch (IOException e) {
                        e = e;
                        if (c0603xp.setIconTintList) {
                            c0603xp.setIconTintList = false;
                            C0603xp.setX setx2 = C0603xp.setX;
                            y = C0603xp.setX.setY(c0603xp);
                        } else {
                            y = false;
                        }
                        if (y) {
                            e = c0603xp.MenuHostHelper$$ExternalSyntheticLambda0(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    if (c0603xp.setIconTintList) {
                        c0603xp.setIconTintList = false;
                        C0603xp.setX setx3 = C0603xp.setX;
                        C0603xp.setX.setY(c0603xp);
                    }
                    throw th;
                }
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("AsyncTimeout.source(");
                sb.append(xAVar);
                sb.append(')');
                return sb.toString();
            }

            @Override // o.xJ
            public final /* bridge */ /* synthetic */ xI setX() {
                return C0603xp.this;
            }
        };
    }

    public static final xK setX(File file) {
        pN.setY(file, "");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        pN.setY(fileOutputStream, "");
        return new xF(fileOutputStream, new xI());
    }

    public static final xJ MenuHostHelper$$ExternalSyntheticLambda1(File file) {
        pN.setY(file, "");
        FileInputStream fileInputStream = new FileInputStream(file);
        pN.setY(fileInputStream, "");
        return new xA(fileInputStream, new xI());
    }

    public static final boolean MenuHostHelper$$ExternalSyntheticLambda1(AssertionError assertionError) {
        pN.setY((Object) assertionError, "");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            return message != null ? qR.setIconTintList((CharSequence) message, (CharSequence) "getsockname failed", false) : false;
        }
        return false;
    }

    public static /* synthetic */ xK MenuHostHelper$$ExternalSyntheticLambda0(File file, boolean z, int i) {
        pN.setY(file, "");
        FileOutputStream fileOutputStream = new FileOutputStream(file, false);
        pN.setY(fileOutputStream, "");
        return new xF(fileOutputStream, new xI());
    }
}