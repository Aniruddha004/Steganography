package com.example.steganography;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.steganography.activities.encrypt.EncryptActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

  @OnClick(R.id.bAMEncrypt)
  public void onClickEncrypt() {
    Intent intent = new Intent(MainActivity.this, EncryptActivity.class);
    startActivity(intent);
  }

  @OnClick(R.id.bAMDecrypt)
  public void onClickDecrypt() {
    //(TODO) Start DecryptActivity
  }

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    ButterKnife.bind(this);
  }
}
