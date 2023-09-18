package dc.kotlin.kidsdrawingapp

import android.content.Context
import android.graphics.Path
import android.util.AttributeSet
import android.view.View

class DrawinView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var mDrawPath : customPath? = null

    internal inner class customPath(var color: Int, var brushThickness: Float) : Path() {

    }

}