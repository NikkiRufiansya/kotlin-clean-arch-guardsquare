package o;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class xG extends C0603xp {
    private final Socket setY;

    public xG(Socket socket) {
        pN.setY(socket, "");
        this.setY = socket;
    }

    @Override // o.C0603xp
    protected final IOException setIconTintList(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }

    @Override // o.C0603xp
    protected final void setY() {
        Logger logger;
        Logger logger2;
        try {
            this.setY.close();
        } catch (AssertionError e) {
            if (C0615xz.MenuHostHelper$$ExternalSyntheticLambda1(e)) {
                logger2 = C0615xz.setY;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder("Failed to close timed out socket ");
                sb.append(this.setY);
                logger2.log(level, sb.toString(), (Throwable) e);
                return;
            }
            throw e;
        } catch (Exception e2) {
            logger = C0615xz.setY;
            Level level2 = Level.WARNING;
            StringBuilder sb2 = new StringBuilder("Failed to close timed out socket ");
            sb2.append(this.setY);
            logger.log(level2, sb2.toString(), (Throwable) e2);
        }
    }
}