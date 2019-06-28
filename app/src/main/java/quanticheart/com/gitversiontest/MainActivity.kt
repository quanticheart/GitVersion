package quanticheart.com.gitversiontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /**
         * Simple example
         *
         * fist, create tag for your project in git with command:
         *
         * git tag x.x.x (this number equal number your project)
         *
         * after call git add ., git commit ...
         *
         * for finish, call
         *
         * git push --tag (for push and create tag in your project)
         *
         *  **
         *  if the project already has a version and you are adding this library now,
         *  you must create the tag from the version number of the current project
         *
         *  example **
         *  current project version 1.5.3
         *
         *  git tag 1.5.4
         */

    }
}
