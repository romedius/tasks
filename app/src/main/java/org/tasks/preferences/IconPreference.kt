package org.tasks.preferences

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.ImageView
import androidx.preference.Preference
import androidx.preference.PreferenceViewHolder
import org.tasks.R

class IconPreference(context: Context?, attrs: AttributeSet?) : Preference(context, attrs) {

    private var imageView: ImageView? = null

    override fun onBindViewHolder(holder: PreferenceViewHolder?) {
        super.onBindViewHolder(holder)

        imageView = holder?.findViewById(R.id.preference_icon) as ImageView?
        updateVisibility()
    }

    var iconVisible: Boolean = false
        set(value) {
            field = value
            updateVisibility()
        }

    private fun updateVisibility() {
        imageView?.visibility = if (iconVisible) View.VISIBLE else View.GONE
    }

    init {
        widgetLayoutResource = R.layout.preference_icon
    }
}