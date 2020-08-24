package com.example.steganography;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.steganography.activities.decrypt.DecryptActivity;
import com.example.steganography.activities.encrypt.EncryptActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  @OnClick({R.id.bAMEncrypt, R.id.bAMDecrypt})
  public void onButtonClick(View view) {
    if(view.getId() == R.id.bAMEncrypt) {
      Intent intent = new Intent(MainActivity.this, EncryptActivity.class);
      startActivity(intent);
    } else if(view.getId() == R.id.bAMDecrypt) {
      Intent intent = new Intent(MainActivity.this, DecryptActivity.class);
      startActivity(intent);
    }
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ButterKnife.bind(this);
  }
}
