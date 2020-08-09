package com.example.steganography.activities.encrypt;

import android.graphics.Bitmap;

interface EncryptInteractor {

  void performSteganography(String message, Bitmap coverImage, Bitmap secretImage);
}
