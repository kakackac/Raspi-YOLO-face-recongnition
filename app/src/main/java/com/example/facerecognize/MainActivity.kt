package com.example.facerecognize
import com.example.facerecognize.R
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNav = findViewById<BottomNavigationView?>(R.id.bottom_navigation)


        // 처음 실행 시 홈 화면 보여주기
        getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragment_container, HomeFragment()).commit()

        // 메뉴 클릭 시 화면 전환 리스너
        bottomNav.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item: MenuItem? ->
            var selectedFragment: Fragment? = null
            val itemId = item!!.getItemId()

            if (itemId == R.id.nav_home) {
                selectedFragment = HomeFragment()
            } else if (itemId == R.id.nav_management) {
                selectedFragment = ManagementFragment()
            }

            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, selectedFragment).commit()
            }
            true
        })
    }
}