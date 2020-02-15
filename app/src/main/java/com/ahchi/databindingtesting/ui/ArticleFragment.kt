package com.ahchi.databindingtesting.ui
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ahchi.databindingtesting.R
import com.ahchi.databindingtesting.databinding.FragmentArticleBinding
import com.ahchi.databindingtesting.model.Person

class ArticleFragment : Fragment() {

    private lateinit var binding:FragmentArticleBinding
    private var person: Person =
        Person("John", "Programmer")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_article,
            container,
            false
        )
        binding.person1 = person
        return binding.root
//        return inflater.inflate(R.layout.fragment_article, container, false)

    }
}
