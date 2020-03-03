package th.ac.kku.coe.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{
            Toast.makeText(
                this, "button clicked", Toast.LENGTH_LONG).show()

            rollDice()
        }
    }
    private fun rollDice(){
        val resultText: TextView =findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6)+1
        resultText.text = randomInt.toString()

        if(randomInt == 1){
            dice_image.setImageResource(R.drawable.dice_1)
        }else if(randomInt == 2){
            dice_image.setImageResource(R.drawable.dice_2)
        }else if(randomInt == 3){
            dice_image.setImageResource(R.drawable.dice_3)
        }else if(randomInt == 4){
            dice_image.setImageResource(R.drawable.dice_4)
        }else if(randomInt == 5){
            dice_image.setImageResource(R.drawable.dice_5)
        }else if(randomInt == 6){
            dice_image.setImageResource(R.drawable.dice_6)
        }
    }

}
