package hn.uth.myapplicationII;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import hn.uth.myapplicationII.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnSaludar.setOnClickListener(v ->{
            binding.txtSaludar.setText("Bienvenido "+binding.edtNombre.getText());
        });


    }
}