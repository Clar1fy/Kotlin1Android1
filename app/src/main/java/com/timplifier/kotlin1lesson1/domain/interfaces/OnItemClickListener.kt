package com.timplifier.kotlin1lesson1.domain.interfaces

interface OnItemClickListener<T> {

    fun onClick(model: T, position: Int)
}