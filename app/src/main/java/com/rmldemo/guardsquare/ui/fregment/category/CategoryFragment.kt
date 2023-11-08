package com.rmldemo.guardsquare.ui.fregment.category

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rmldemo.guardsquare.databinding.FragmentCategoryBinding
import com.rmldemo.guardsquare.ui.adapters.CategoryAdapter
import com.rmldemo.guardsquare.themes.MyAppTheme
import com.rmldemo.guardsquare.ui.activity.MainView
import com.rmldemo.guardsquare.utils.Topics
import com.dolatkia.animatedThemeManager.AppTheme
import com.dolatkia.animatedThemeManager.ThemeFragment
import com.google.gson.Gson
import javax.inject.Inject

class CategoryFragment : ThemeFragment() {

    private var _binding: FragmentCategoryBinding? =null
    private val binding get() = _binding!!
    private lateinit var adapter: CategoryAdapter
    @Inject lateinit var sPref:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        adapter = CategoryAdapter()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoryBinding.inflate(layoutInflater, container, false)
        Topics.appComponent.inject(this)
        (activity as MainView?)?.showBottomBar()

        binding.rv.adapter = adapter
        val mlist = getSelectedList()
        adapter.setSelectedTopics(mlist, binding.root.context)

        return binding.root
    }

    private fun getSelectedList(): ArrayList<String> {
        val gson = Gson()
        val jsonText: String = sPref.getString("topic", "")!!
        val list = gson.fromJson(
            jsonText,
            Array<String>::class.java
        )
        val mlist = arrayListOf<String>()
        mlist.addAll(list)
        return mlist
    }

    override fun syncTheme(appTheme: AppTheme) {
        val myAppTheme = appTheme as MyAppTheme
        context?.let {
            binding.root.setBackgroundColor(myAppTheme.fragmentBackgroundColor(it))
            binding.titleTv.setTextColor(myAppTheme.fragmentLargeTextColor(it))
            binding.descTv.setTextColor(myAppTheme.fragmentSmallTextColor(it))
           // initAdapter(myAppTheme.fragmentCheckboxDrawable(it))
        }
    }

    private fun saveSelected(){
        val editor = sPref.edit()
        val selectedTopics = adapter.getSelectedTopics()
        val gson = Gson()
        val jsonText: String = gson.toJson(selectedTopics)
        editor.putString("topic", jsonText)
        editor.apply()
    }

    override fun onStop() {
        super.onStop()
        saveSelected()
    }


}