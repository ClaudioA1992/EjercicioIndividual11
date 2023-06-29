package cl.awakelab.ejercicioindividual11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import cl.awakelab.ejercicioindividual11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button1.setOnClickListener(v -> Toast.makeText(this, "Modo avión desactivado", Toast.LENGTH_SHORT).show());
        binding.button2.setOnClickListener(v -> Toast.makeText(this, "Imagen grabada en galería", Toast.LENGTH_SHORT).show());
        binding.button3.setOnClickListener(v -> Toast.makeText(this, "Recompensa obtenida", Toast.LENGTH_SHORT).show());
        binding.button4.setOnClickListener(v -> Toast.makeText(this, "Actualizando perfil", Toast.LENGTH_SHORT).show());
        binding.button5.setOnClickListener(v -> Toast.makeText(this, "Puedes encontrarlo en {level5.ubicacion}", Toast.LENGTH_SHORT).show());
        binding.button6.setOnClickListener(v -> Toast.makeText(this, "Música reanudada", Toast.LENGTH_SHORT).show());

    };

}


