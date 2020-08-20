package top.stores.whatsappclone.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import top.stores.whatsappclone.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }



    fun onLogin(v: View){
        Toast.makeText(this, "Login clicked", Toast.LENGTH_LONG).show()
    }

  fun onSignUp(v : View){
      startActivity(SignUpActivity.newIntent(this))
      finish()
  }





    companion object{
        fun newIntent (context : Context) = Intent(context, LoginActivity::class.java)
    }
}