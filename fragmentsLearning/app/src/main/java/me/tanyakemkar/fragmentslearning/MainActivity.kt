package me.tanyakemkar.fragmentslearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.fragment.app.add
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            val bundle = bundleOf("some_int" to 0)
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<ExampleFragment>(R.id.fragment_container_view, args = bundle)
            }

            supportFragmentManager.commit {
                replace<ExampleFragment>(R.id.fragment_container_view, "tag")
                setReorderingAllowed(true)
                addToBackStack("name") // name can be null
            }

            val fragment: ExampleFragment =
                supportFragmentManager.findFragmentById(R.id.fragment_container_view) as ExampleFragment

            val fragment1: ExampleFragment =
                supportFragmentManager.findFragmentByTag("tag") as ExampleFragment

            val fragment3 = FragmentB()
            supportFragmentManager.commit {
                setCustomAnimations(
                    enter = R.anim.slide_in,
                    exit = R.anim.fade_out,
                    popEnter = R.anim.fade_in,
                    popExit = R.anim.slide_out
                )
                replace(R.id.fragment_container_view, fragment)
                addToBackStack(null)
            }
        }
    }
}