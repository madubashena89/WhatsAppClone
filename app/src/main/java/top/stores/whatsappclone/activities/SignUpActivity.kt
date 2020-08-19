package top.stores.whatsappclone.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import top.stores.whatsappclone.R

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
    }

    fun onCLick(v : View){
        startActivity(MainActivity.newIntent(this))
        finish()
    }



    companion object{
        fun newIntent(context : Context) = Intent(context , SignUpActivity::class.java)
    }
}