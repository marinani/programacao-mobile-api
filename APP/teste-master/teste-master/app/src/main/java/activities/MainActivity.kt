package activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ddm_lojavirtual.R.layout.activity_main
import com.example.ddm_lojavirtual.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activity_main)


        }
    }




