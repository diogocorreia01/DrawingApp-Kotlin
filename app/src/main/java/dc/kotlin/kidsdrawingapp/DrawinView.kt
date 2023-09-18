package dc.kotlin.kidsdrawingapp

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.View
import androidx.compose.ui.graphics.Color

class DrawinView(context: Context, attrs: AttributeSet) : View(context, attrs) {

    private var mDrawPath: customPath? = null
    private var mCanvasBitmap: Bitmap? = null
    private var mDrawPaint: Paint? = null
    private var mCanvasPaint: Paint? = null
    private var mBrushSize: Float = 0.toFloat()
    private var color = Color.Black
    private var canvas: Canvas? = null

    init {
        setUpDrawing()
    }

    private fun setUpDrawing() {
        mDrawPaint = Paint()
    }

    internal inner class customPath(var color: Int, var brushThickness: Float) : Path() {

    }

}