// Generated code from Butter Knife. Do not modify!
package com.example.steganography.activities.decrypt;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.steganography.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DecryptActivity_ViewBinding implements Unbinder {
  private DecryptActivity target;

  private View view7f070071;

  private View view7f070044;

  @UiThread
  public DecryptActivity_ViewBinding(DecryptActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DecryptActivity_ViewBinding(final DecryptActivity target, View source) {
    this.target = target;

    View view;
    view = Utils.findRequiredView(source, R.id.ivStegoImage, "field 'ivStegoImage' and method 'onStegoImageClick'");
    target.ivStegoImage = Utils.castView(view, R.id.ivStegoImage, "field 'ivStegoImage'", ImageView.class);
    view7f070071 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onStegoImageClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.bDecrypt, "method 'onButtonClick'");
    view7f070044 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onButtonClick();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    DecryptActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivStegoImage = null;

    view7f070071.setOnClickListener(null);
    view7f070071 = null;
    view7f070044.setOnClickListener(null);
    view7f070044 = null;
  }
}
