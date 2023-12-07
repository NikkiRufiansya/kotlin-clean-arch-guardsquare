package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import o.LinearLayoutManager$SavedState$1;
import o.WindowInsetsCompat$Impl28;
import o.WindowInsetsCompat$Impl30;
import o.asInterface;
import o.registerIn;
import o.setItemActiveIndicatorEnabled;
import o.setItemAnimator;
import o.setOnHierarchyChangeListener;
import o.setScrollContainer;
import o.setTouchDelegate;
import o.setTransitionState;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements setItemActiveIndicatorEnabled<Boolean> {
    @Override // o.setItemActiveIndicatorEnabled
    /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
    public Boolean setX(Context context) {
        setScrollContainer.MenuHostHelper$$ExternalSyntheticLambda0(new setY(context));
        MenuHostHelper$$ExternalSyntheticLambda1(context);
        return Boolean.TRUE;
    }

    void MenuHostHelper$$ExternalSyntheticLambda1(Context context) {
        final registerIn MenuHostHelper$$ExternalSyntheticLambda1 = ((setTouchDelegate) asInterface.setIconTintList(context).MenuHostHelper$$ExternalSyntheticLambda0(ProcessLifecycleInitializer.class)).MenuHostHelper$$ExternalSyntheticLambda1();
        MenuHostHelper$$ExternalSyntheticLambda1.setY(new setTransitionState() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // o.setItemInvoker
            public /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda0(setTouchDelegate settouchdelegate) {
            }

            @Override // o.setItemInvoker
            public /* synthetic */ void MenuHostHelper$$ExternalSyntheticLambda1(setTouchDelegate settouchdelegate) {
            }

            @Override // o.setItemInvoker
            public /* synthetic */ void setUiOptions(setTouchDelegate settouchdelegate) {
            }

            @Override // o.setItemInvoker
            public /* synthetic */ void setX(setTouchDelegate settouchdelegate) {
            }

            @Override // o.setItemInvoker
            public /* synthetic */ void setY(setTouchDelegate settouchdelegate) {
            }

            @Override // o.setItemInvoker
            public void setIconTintList(setTouchDelegate settouchdelegate) {
                EmojiCompatInitializer.this.setIconTintList();
                MenuHostHelper$$ExternalSyntheticLambda1.MenuHostHelper$$ExternalSyntheticLambda1(this);
            }
        });
    }

    @Override // o.setItemActiveIndicatorEnabled
    public List<Class<? extends setItemActiveIndicatorEnabled<?>>> setX() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class setY extends setScrollContainer.setX {
        protected setY(Context context) {
            super(new setX(context));
            setY(1);
        }
    }

    /* loaded from: classes.dex */
    public static class setX implements setScrollContainer.setOnLongClickListener {
        private final Context setX;

        setX(Context context) {
            this.setX = context.getApplicationContext();
        }

        @Override // o.setScrollContainer.setOnLongClickListener
        public void MenuHostHelper$$ExternalSyntheticLambda0(final setScrollContainer.setNavigationOnClickListener setnavigationonclicklistener) {
            final ThreadPoolExecutor y = setOnHierarchyChangeListener.setY("EmojiCompatInitializer");
            y.execute(new Runnable() { // from class: o.setAnimation
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.setX.this.setIconTintList(setnavigationonclicklistener, y);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: MenuHostHelper$$ExternalSyntheticLambda0 */
        public void setIconTintList(final setScrollContainer.setNavigationOnClickListener setnavigationonclicklistener, final ThreadPoolExecutor threadPoolExecutor) {
            try {
                WindowInsetsCompat$Impl30 MenuHostHelper$$ExternalSyntheticLambda0 = WindowInsetsCompat$Impl28.MenuHostHelper$$ExternalSyntheticLambda0(this.setX);
                if (MenuHostHelper$$ExternalSyntheticLambda0 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                MenuHostHelper$$ExternalSyntheticLambda0.setX(threadPoolExecutor);
                MenuHostHelper$$ExternalSyntheticLambda0.setX().MenuHostHelper$$ExternalSyntheticLambda0(new setScrollContainer.setNavigationOnClickListener() { // from class: androidx.emoji2.text.EmojiCompatInitializer.setX.2
                    @Override // o.setScrollContainer.setNavigationOnClickListener
                    public void MenuHostHelper$$ExternalSyntheticLambda0(LinearLayoutManager$SavedState$1 linearLayoutManager$SavedState$1) {
                        try {
                            setnavigationonclicklistener.MenuHostHelper$$ExternalSyntheticLambda0(linearLayoutManager$SavedState$1);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }

                    @Override // o.setScrollContainer.setNavigationOnClickListener
                    public void MenuHostHelper$$ExternalSyntheticLambda0(Throwable th) {
                        try {
                            setnavigationonclicklistener.MenuHostHelper$$ExternalSyntheticLambda0(th);
                        } finally {
                            threadPoolExecutor.shutdown();
                        }
                    }
                });
            } catch (Throwable th) {
                setnavigationonclicklistener.MenuHostHelper$$ExternalSyntheticLambda0(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    void setIconTintList() {
        Handler handler;
        if (Build.VERSION.SDK_INT < 28) {
            handler = new Handler(Looper.getMainLooper());
        } else {
            handler = Handler.createAsync(Looper.getMainLooper());
        }
        handler.postDelayed(new Runnable() { // from class: androidx.emoji2.text.EmojiCompatInitializer$MenuHostHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public void run() {
                try {
                    setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0("EmojiCompat.EmojiCompatInitializer.run");
                    if (setScrollContainer.setX()) {
                        setScrollContainer.setIconTintList().setOnLongClickListener();
                    }
                } finally {
                    setItemAnimator.MenuHostHelper$$ExternalSyntheticLambda0();
                }
            }
        }, 500L);
    }
}