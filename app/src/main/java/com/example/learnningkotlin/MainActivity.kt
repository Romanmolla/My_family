package com.example.learnningkotlin

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    @SuppressLint("CommitTransaction")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_bar)

        bottomBar.setOnItemSelectedListener {

            if (it.itemId == R.id.nav_guard) {
                inflateFragment(GuardFragment.newInstance())
            } else if (it.itemId == R.id.nav_home) {
                inflateFragment(HomeFragment.newInstance())
            }else if (it.itemId == R.id.nav_dashboard){
                inflateFragment(DashboardFragment.newInstance())
            }else{

            }

            true
        }

    }
        private fun inflateFragment(newInstance: Fragment) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container,newInstance)
            transaction.commit()
        }



//        Toast.makeText(this, "welcome", Toast.LENGTH_SHORT).show()
//
//        var btn = findViewById<Button>(R.id.calculator)
//        btn.setOnClickListener {
//            openScreen()
//        }
//
//    }
//
//
//    fun openScreen() {
//
//        val intent = Intent(this,GuardScreen::class.java)
//        startActivity(intent)

//        Toast.makeText(this, "Btn click", Toast.LENGTH_SHORT).show()
//        var numA = findViewById<EditText>(R.id.num_a)
//        var numB = findViewById<EditText>(R.id.num_b)
//
//        var valueA = numA.text.toString().toInt()
//        var valueB = numB.text.toString().toInt()
//
//        var sum1 = valueA+valueB
//        Toast.makeText(this, "$sum1", Toast.LENGTH_LONG).show()


}