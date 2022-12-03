package com.frogobox.research.ui.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import com.frogobox.research.databinding.ItemSpinnerBinding
import com.frogobox.research.ext.DiffableListItemType
import com.mikepenz.fastadapter.binding.AbstractBindingItem

/**
 * Created by Faisal Amir on 04/12/22
 * -----------------------------------------
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) Frogobox ID / amirisback
 * All rights reserved
 */

class SpinnerMainListItemLoading() : AbstractBindingItem<ItemSpinnerBinding>(), DiffableListItemType {

    override val type: Int
        get() = SpinnerMainListItemLoading::class.java.hashCode()

    override fun createBinding(
        inflater: LayoutInflater,
        parent: ViewGroup?,
    ): ItemSpinnerBinding {
        return ItemSpinnerBinding.inflate(inflater, parent, false)
    }

    override fun itemIdentifier(): Any {
        return hashCode()
    }

    override fun comparableContents(): List<Any> {
        return listOf(type)
    }

    override fun bindView(binding: ItemSpinnerBinding, payloads: List<Any>) {
        super.bindView(binding, payloads)
        binding.apply {
            tvText.text = "Loading"
        }
    }

}