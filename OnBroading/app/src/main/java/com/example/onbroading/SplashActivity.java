package com.example.onbroading;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash); // Layout chứa ảnh tùy chọn của bạn
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Thiết lập thời gian chờ (ví dụ 2 giây)
        new Handler().postDelayed(() -> {
            // Chuyển đến màn hình chính khi hết thời gian chờ
            Intent intent = new Intent(SplashActivity.this, OnBroadingActivity.class);
            startActivity(intent);
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            finish(); // Kết thúc SplashActivity để không quay lại khi nhấn nút back
        }, 1600); // Thời gian chờ trong mili giây
    }
}
