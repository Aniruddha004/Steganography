package com.example.steganography.activities.encrypt;

import android.graphics.Bitmap;

public interface EncryptInteractor {

  void performSteganography(String message, Bitmap coverImage, Bitmap secretImage);
}