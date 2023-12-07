package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import o.SingleGeneratedAdapterObserver;
import o.WindowInsetsCompat$Impl30;
import o.setScrollContainer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda1 implements setScrollContainer.setOnLongClickListener {
    private Executor MenuHostHelper$$ExternalSyntheticLambda0;
    setScrollContainer.setNavigationOnClickListener MenuHostHelper$$ExternalSyntheticLambda1;
    private WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda0 ViewPager$SavedState$1;
    private final Object setIconTintList = new Object();
    private ContentObserver setLayoutAnimation;
    private Handler setNavigationOnClickListener;
    private ThreadPoolExecutor setOnLongClickListener;
    private final setMarqueeRepeatLimit setUiOptions;
    private Runnable setUnboundedRipple;
    private final WindowInsetsCompat$Impl30.setY setX;
    private final Context setY;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda1(Context context, setMarqueeRepeatLimit setmarqueerepeatlimit, WindowInsetsCompat$Impl30.setY sety) {
        if (context == null) {
            throw new NullPointerException("Context cannot be null");
        }
        if (setmarqueerepeatlimit != null) {
            this.setY = context.getApplicationContext();
            this.setUiOptions = setmarqueerepeatlimit;
            this.setX = sety;
            return;
        }
        throw new NullPointerException("FontRequest cannot be null");
    }

    public void setX(Executor executor) {
        synchronized (this.setIconTintList) {
            this.MenuHostHelper$$ExternalSyntheticLambda0 = executor;
        }
    }

    @Override // o.setScrollContainer.setOnLongClickListener
    public void MenuHostHelper$$ExternalSyntheticLambda0(setScrollContainer.setNavigationOnClickListener setnavigationonclicklistener) {
        if (setnavigationonclicklistener != null) {
            synchronized (this.setIconTintList) {
                this.MenuHostHelper$$ExternalSyntheticLambda1 = setnavigationonclicklistener;
            }
            MenuHostHelper$$ExternalSyntheticLambda0();
            return;
        }
        throw new NullPointerException("LoaderCallback cannot be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void MenuHostHelper$$ExternalSyntheticLambda0() {
        synchronized (this.setIconTintList) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                return;
            }
            if (this.MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                ThreadPoolExecutor y = setOnHierarchyChangeListener.setY("emojiCompat");
                this.setOnLongClickListener = y;
                this.MenuHostHelper$$ExternalSyntheticLambda0 = y;
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0.execute(new Runnable() { // from class: o.clearCallingIdentity
                @Override // java.lang.Runnable
                public final void run() {
                    WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda1.this.setIconTintList();
                }
            });
        }
    }

    private SingleGeneratedAdapterObserver.setX setY() {
        try {
            SingleGeneratedAdapterObserver$MenuHostHelper$$ExternalSyntheticLambda1 MenuHostHelper$$ExternalSyntheticLambda0 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, this.setUiOptions);
            if (MenuHostHelper$$ExternalSyntheticLambda0.setY() != 0) {
                StringBuilder sb = new StringBuilder("fetchFonts failed (");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda0.setY());
                sb.append(")");
                throw new RuntimeException(sb.toString());
            }
            SingleGeneratedAdapterObserver.setX[] iconTintList = MenuHostHelper$$ExternalSyntheticLambda0.setIconTintList();
            if (iconTintList == null || iconTintList.length == 0) {
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            return iconTintList[0];
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }

    private void setIconTintList(Uri uri, long j) {
        synchronized (this.setIconTintList) {
            Handler handler = this.setNavigationOnClickListener;
            if (handler == null) {
                if (Build.VERSION.SDK_INT < 28) {
                    handler = new Handler(Looper.getMainLooper());
                } else {
                    handler = Handler.createAsync(Looper.getMainLooper());
                }
                this.setNavigationOnClickListener = handler;
            }
            if (this.setLayoutAnimation == null) {
                ContentObserver contentObserver = new ContentObserver(handler) { // from class: o.WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda1.4
                    @Override // android.database.ContentObserver
                    public void onChange(boolean z, Uri uri2) {
                        WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda1.this.MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                };
                this.setLayoutAnimation = contentObserver;
                this.setX.MenuHostHelper$$ExternalSyntheticLambda1(this.setY, uri, contentObserver);
            }
            if (this.setUnboundedRipple == null) {
                this.setUnboundedRipple = new Runnable() { // from class: o.getMandatorySystemGestureInsets
                    @Override // java.lang.Runnable
                    public final void run() {
                        WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda1.this.MenuHostHelper$$ExternalSyntheticLambda0();
                    }
                };
            }
            handler.postDelayed(this.setUnboundedRipple, j);
        }
    }

    private void setX() {
        synchronized (this.setIconTintList) {
            this.MenuHostHelper$$ExternalSyntheticLambda1 = null;
            ContentObserver contentObserver = this.setLayoutAnimation;
            if (contentObserver != null) {
                this.setX.setIconTintList(this.setY, contentObserver);
                this.setLayoutAnimation = null;
            }
            Handler handler = this.setNavigationOnClickListener;
            if (handler != null) {
                handler.removeCallbacks(this.setUnboundedRipple);
            }
            this.setNavigationOnClickListener = null;
            ThreadPoolExecutor threadPoolExecutor = this.setOnLongClickListener;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.MenuHostHelper$$ExternalSyntheticLambda0 = null;
            this.setOnLongClickListener = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setIconTintList() {
        synchronized (this.setIconTintList) {
            if (this.MenuHostHelper$$ExternalSyntheticLambda1 == null) {
                return;
            }
            try {
                SingleGeneratedAdapterObserver.setX y = setY();
                int MenuHostHelper$$ExternalSyntheticLambda0 = y.MenuHostHelper$$ExternalSyntheticLambda0();
                if (MenuHostHelper$$ExternalSyntheticLambda0 == 2) {
                    synchronized (this.setIconTintList) {
                        WindowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda0 windowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda0 = this.ViewPager$SavedState$1;
                        if (windowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda0 != null) {
                            long MenuHostHelper$$ExternalSyntheticLambda02 = windowInsetsCompat$Impl30$MenuHostHelper$$ExternalSyntheticLambda0.MenuHostHelper$$ExternalSyntheticLambda0();
                            if (MenuHostHelper$$ExternalSyntheticLambda02 >= 0) {
                                setIconTintList(y.setIconTintList(), MenuHostHelper$$ExternalSyntheticLambda02);
                                return;
                            }
                        }
                    }
                }
                if (MenuHostHelper$$ExternalSyntheticLambda0 == 0) {
                    setItemAnimator$MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    Typeface MenuHostHelper$$ExternalSyntheticLambda03 = this.setX.MenuHostHelper$$ExternalSyntheticLambda0(this.setY, y);
                    ByteBuffer y2 = setExpandedFormat.setY(this.setY, (CancellationSignal) null, y.setIconTintList());
                    if (y2 == null || MenuHostHelper$$ExternalSyntheticLambda03 == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    LinearLayoutManager$SavedState$1 x = LinearLayoutManager$SavedState$1.setX(MenuHostHelper$$ExternalSyntheticLambda03, y2);
                    setItemAnimator$MenuHostHelper$$ExternalSyntheticLambda1.setIconTintList();
                    synchronized (this.setIconTintList) {
                        setScrollContainer.setNavigationOnClickListener setnavigationonclicklistener = this.MenuHostHelper$$ExternalSyntheticLambda1;
                        if (setnavigationonclicklistener != null) {
                            setnavigationonclicklistener.MenuHostHelper$$ExternalSyntheticLambda0(x);
                        }
                    }
                    setX();
                    return;
                }
                StringBuilder sb = new StringBuilder("fetchFonts result is not OK. (");
                sb.append(MenuHostHelper$$ExternalSyntheticLambda0);
                sb.append(")");
                throw new RuntimeException(sb.toString());
            } catch (Throwable th) {
                synchronized (this.setIconTintList) {
                    setScrollContainer.setNavigationOnClickListener setnavigationonclicklistener2 = this.MenuHostHelper$$ExternalSyntheticLambda1;
                    if (setnavigationonclicklistener2 != null) {
                        setnavigationonclicklistener2.MenuHostHelper$$ExternalSyntheticLambda0(th);
                    }
                    setX();
                }
            }
        }
    }
}