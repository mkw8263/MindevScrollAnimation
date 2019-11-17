package com.mindev.animationscrollview

import android.content.Context
import android.util.AttributeSet
import android.view.animation.RotateAnimation
import android.widget.TextView

class AnimationRotateTextView : TextView, AnimationScrollChangedListener {
    override fun onChanged(oldY: Float, currentY: Float) {
        RotateAnimation(
            oldY,
            currentY,
            this.width / 2.toFloat(),
            this.height / 2.toFloat()
        ).apply { duration = 1500 }.let(this::startAnimation)
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)
    constructor(context: Context, attributeSet: AttributeSet, defStyle: Int) : super(context)
}