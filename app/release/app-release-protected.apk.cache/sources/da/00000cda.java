package o;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import o.setImageResource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class setItemActiveIndicatorWidth implements setImageResource, setTextFuture {
    private final Context MenuHostHelper$$ExternalSyntheticLambda0;
    setSelectedTabIndicatorHeight MenuHostHelper$$ExternalSyntheticLambda1;
    private final Callable<InputStream> setIconTintList;
    private boolean setLayoutAnimation;
    private final setImageResource setNavigationOnClickListener;
    private final int setUiOptions;
    private final String setX;
    private final File setY;

    @Override // o.setImageResource
    public final String setX() {
        return this.setNavigationOnClickListener.setX();
    }

    @Override // o.setImageResource
    public final void setY(boolean z) {
        this.setNavigationOnClickListener.setY(z);
    }

    @Override // o.setImageResource
    public final setWindowCallback MenuHostHelper$$ExternalSyntheticLambda0() {
        setWindowCallback MenuHostHelper$$ExternalSyntheticLambda0;
        synchronized (this) {
            if (!this.setLayoutAnimation) {
                setIconTintList(true);
                this.setLayoutAnimation = true;
            }
            MenuHostHelper$$ExternalSyntheticLambda0 = this.setNavigationOnClickListener.MenuHostHelper$$ExternalSyntheticLambda0();
        }
        return MenuHostHelper$$ExternalSyntheticLambda0;
    }

    @Override // o.setImageResource
    public final setWindowCallback setIconTintList() {
        setWindowCallback iconTintList;
        synchronized (this) {
            if (!this.setLayoutAnimation) {
                setIconTintList(false);
                this.setLayoutAnimation = true;
            }
            iconTintList = this.setNavigationOnClickListener.setIconTintList();
        }
        return iconTintList;
    }

    @Override // o.setImageResource, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.setNavigationOnClickListener.close();
            this.setLayoutAnimation = false;
        }
    }

    @Override // o.setTextFuture
    public final setImageResource MenuHostHelper$$ExternalSyntheticLambda1() {
        return this.setNavigationOnClickListener;
    }

    private void setY(File file, boolean z) {
        ReadableByteChannel newChannel;
        if (this.setX != null) {
            newChannel = Channels.newChannel(this.MenuHostHelper$$ExternalSyntheticLambda0.getAssets().open(this.setX));
        } else if (this.setY != null) {
            newChannel = new FileInputStream(this.setY).getChannel();
        } else {
            Callable<InputStream> callable = this.setIconTintList;
            if (callable != null) {
                try {
                    newChannel = Channels.newChannel(callable.call());
                } catch (Exception e) {
                    throw new IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        File createTempFile = File.createTempFile("room-copy-helper", ".tmp", this.MenuHostHelper$$ExternalSyntheticLambda0.getCacheDir());
        createTempFile.deleteOnExit();
        FileChannel channel = new FileOutputStream(createTempFile).getChannel();
        try {
            if (Build.VERSION.SDK_INT > 23) {
                channel.transferFrom(newChannel, 0L, Long.MAX_VALUE);
            } else {
                InputStream newInputStream = Channels.newInputStream(newChannel);
                OutputStream newOutputStream = Channels.newOutputStream(channel);
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = newInputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    newOutputStream.write(bArr, 0, read);
                }
            }
            channel.force(false);
            newChannel.close();
            channel.close();
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                StringBuilder sb = new StringBuilder("Failed to create directories for ");
                sb.append(file.getAbsolutePath());
                throw new IOException(sb.toString());
            }
            setSelectedTabIndicatorHeight setselectedtabindicatorheight = this.MenuHostHelper$$ExternalSyntheticLambda1;
            if (setselectedtabindicatorheight != null && setselectedtabindicatorheight.ViewPager$SavedState$1 != null) {
                setImageResource iconTintList = setIconTintList(createTempFile);
                try {
                    if (z) {
                        iconTintList.MenuHostHelper$$ExternalSyntheticLambda0();
                    } else {
                        iconTintList.setIconTintList();
                    }
                    MaterialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 materialCheckBox$SavedState$1$MenuHostHelper$$ExternalSyntheticLambda0 = this.MenuHostHelper$$ExternalSyntheticLambda1.ViewPager$SavedState$1;
                } finally {
                    iconTintList.close();
                }
            }
            if (createTempFile.renameTo(file)) {
                return;
            }
            StringBuilder sb2 = new StringBuilder("Failed to move intermediate file (");
            sb2.append(createTempFile.getAbsolutePath());
            sb2.append(") to destination (");
            sb2.append(file.getAbsolutePath());
            sb2.append(").");
            throw new IOException(sb2.toString());
        } catch (Throwable th) {
            newChannel.close();
            channel.close();
            throw th;
        }
    }

    private setImageResource setIconTintList(File file) {
        try {
            int iconTintList = setNormalSlideWidth.setIconTintList(file);
            new setSmoothScrollbarEnabled();
            setImageResource$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1 setimageresource_seticontintlist_menuhosthelper__externalsyntheticlambda1 = new setImageResource$setIconTintList$MenuHostHelper$$ExternalSyntheticLambda1(this.MenuHostHelper$$ExternalSyntheticLambda0);
            setimageresource_seticontintlist_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1 = file.getAbsolutePath();
            setimageresource_seticontintlist_menuhosthelper__externalsyntheticlambda1.setIconTintList = new setImageResource.setY(Math.max(iconTintList, 1)) { // from class: o.setItemActiveIndicatorWidth.1
                @Override // o.setImageResource.setY
                public final void MenuHostHelper$$ExternalSyntheticLambda1(setWindowCallback setwindowcallback) {
                }

                @Override // o.setImageResource.setY
                public final void setIconTintList(setWindowCallback setwindowcallback, int i, int i2) {
                }

                @Override // o.setImageResource.setY
                public final void setX(setWindowCallback setwindowcallback) {
                    if (this.MenuHostHelper$$ExternalSyntheticLambda1 <= 0) {
                        setwindowcallback.setY(this.MenuHostHelper$$ExternalSyntheticLambda1);
                    }
                }
            };
            setImageResource.setIconTintList MenuHostHelper$$ExternalSyntheticLambda1 = setimageresource_seticontintlist_menuhosthelper__externalsyntheticlambda1.MenuHostHelper$$ExternalSyntheticLambda1();
            return new setActiveIndicatorEnabled(MenuHostHelper$$ExternalSyntheticLambda1.setY, MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1, MenuHostHelper$$ExternalSyntheticLambda1.setX, MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda0);
        } catch (IOException e) {
            throw new RuntimeException("Malformed database file, unable to read version.", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x00ed A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void setIconTintList(boolean r9) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o.setItemActiveIndicatorWidth.setIconTintList(boolean):void");
    }
}