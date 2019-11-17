package com.mindev.animationscrollview

import android.content.Context
import android.util.AttributeSet
import androidx.core.widget.NestedScrollView

class AnimationScrollView : NestedScrollView, NestedScrollView.OnScrollChangeListener {

    private var onScrollChangeListener: OnScrollChangeListener? = null
    private var onUserScrollChangeListener = mutableListOf<AnimationScrollChangedListener>()

    constructor(context: Context) : super(context)
    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)
    constructor(context: Context, attributeSet: AttributeSet, defStyle: Int) : super(context)

    fun setUpListenerView(view: AnimationRotateButton) {
        this.onUserScrollChangeListener?.add(view)
    }

    fun setUpListenerView(view: AnimationRotateImageView) {
        this.onUserScrollChangeListener?.add(view)
    }

    fun setUpListenerView(view: AnimationRotateTextView) {
        this.onUserScrollChangeListener?.add(view)
    }

    override fun onFinishInflate() {
        super.onFinishInflate()
        super.setOnScrollChangeListener(this)
    }

    override fun setOnScrollChangeListener(onScrollChangeListener: OnScrollChangeListener?) {
        super.setOnScrollChangeListener(this)
        if (onScrollChangeListener != this) {
            this.onScrollChangeListener = onScrollChangeListener
        }
    }

    override fun onScrollChange(
        nestedScrollView: NestedScrollView?,
        scrollX: Int,
        scrollY: Int,
        oldScrollX: Int,
        oldScrollY: Int
    ) {
        this.onScrollChangeListener?.onScrollChange(
            nestedScrollView, scrollX, scrollY, oldScrollX,
            oldScrollY
        )
        onUserScrollChangeListener.forEach {
            it.onChanged(oldScrollY.toFloat(), scaleY)
        }
    }
}