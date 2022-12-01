package com.nhom4.lilpawhome_application;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.nhom4.adapters.AdapterDanhGiaSanPham;
import com.nhom4.adapters.AdapterHinhAnhDanhGia;
import com.nhom4.lilpawhome_application.databinding.ActivityHinhAnhDanhGiaSanPhamBinding;
import com.nhom4.models.DanhGiaSanPhamM;

import java.util.ArrayList;

public class HinhAnhDanhGiaSanPham extends AppCompatActivity {

    ActivityHinhAnhDanhGiaSanPhamBinding binding;
    ArrayList<DanhGiaSanPhamM> dsDanhGiaSanPham;
    AdapterHinhAnhDanhGia adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_hinh_anh_danh_gia_san_pham);

        binding = ActivityHinhAnhDanhGiaSanPhamBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loadData();
    }

    private void loadData() {
        dsDanhGiaSanPham = new ArrayList<>();
        dsDanhGiaSanPham.add(new DanhGiaSanPhamM(R.drawable.avatar_concho,"Kim Hạnh", 5, "Đóng gói sản phẩm cẩn thận, sản phẩm đẹp lắm, bé chó nhà mình thích mê", R.drawable.splongmong, R.drawable.spkhaymeo, R.drawable.spkhay, "28/11/2022"));
        dsDanhGiaSanPham.add(new DanhGiaSanPhamM(R.drawable.avatar_concho,"Thảo Duyên", 4, "Mua lần đầu có hơi lo lắng, tới lúc nhận được sản phẩm bất ngờ quá chừng, tại nó cũng bình thường chứ không xuất sắc như mình đã nghĩ", R.drawable.spkhay,  R.drawable.splongmong, R.drawable.spkhaymeo, "20/11/2022"));
        dsDanhGiaSanPham.add(new DanhGiaSanPhamM(R.drawable.avatar_concho,"Ngọc Thẩm", 4, "Tại dư tiền thích mua sắm vậy thôi, chứ chó thì mình chưa nuôi",  R.drawable.spkhaymeo, R.drawable.spkhay, R.drawable.splongmong,"02/01/2022"));
        dsDanhGiaSanPham.add(new DanhGiaSanPhamM(R.drawable.avatar_concho,"Hồng Xuân", 5 ,"Đừng mua, mua về xài rồi không bỏ được đâu", R.drawable.splongmong, R.drawable.spkhaymeo, R.drawable.spkhay, "28/07/2022"));
        dsDanhGiaSanPham.add(new DanhGiaSanPhamM(R.drawable.avatar_concho,"Bảo Thiện", 3, "Con chó nhà mình nó khen là hàng đẹp quá, kêu mình lần sau có khuyến mãi thì nhớ mua nhiều nhiều để dành nó xài từ từ", R.drawable.splongmong, R.drawable.spkhaymeo, R.drawable.spkhay, "09/09/2022"));

        adapter = new AdapterHinhAnhDanhGia(HinhAnhDanhGiaSanPham.this, R.layout.hinhanhdanhgia_layout, dsDanhGiaSanPham);
        binding.grHinhanhdanhgia.setAdapter(adapter);
    }
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:break;
        }
        return super.onOptionsItemSelected(item);
    }
}