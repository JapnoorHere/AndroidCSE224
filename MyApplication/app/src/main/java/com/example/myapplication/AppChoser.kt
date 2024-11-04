import com.example.myapplication.R

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AppChoser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_app_choser)

        var btn = findViewById<Button>(R.id.btn)
        var radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        var first = findViewById<RadioButton>(R.id.first)
        var second = findViewById<RadioButton>(R.id.second)
        var third = findViewById<RadioButton>(R.id.third)
        var fourth = findViewById<RadioButton>(R.id.fourth)
        var fifth = findViewById<RadioButton>(R.id.fifth)

        btn.setOnClickListener {
            var quoteId = radioGroup.checkedRadioButtonId
            var quote = when(quoteId){

                R.id.first -> shareText(first.text.toString())
                R.id.second -> shareText(second.text.toString())
                R.id.third -> shareText(third.text.toString())
                R.id.fourth -> shareText(fourth.text.toString())
                R.id.fifth -> shareText(fifth.text.toString())

                else -> {}
            }
        }

    }

    private fun shareText(s: String) {
        var share: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_TEXT,s)
            type = "text/plain"
        }
        var i = Intent.createChooser(share,"Share Via")
        startActivity(i)
    }
}