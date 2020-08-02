package com.example.steganography.encrypt;

import android.content.SharedPreferences;

public interface EncryptPresenter {

  SharedPreferences getSharedPreferences();

  void showUserPreferredInfo();

  void selectCoverImage();

  void selectSecretImage();

  void saveUserPreferences();
}
