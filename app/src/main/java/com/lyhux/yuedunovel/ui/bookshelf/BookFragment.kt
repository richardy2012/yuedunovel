package com.lyhux.yuedunovel.ui.bookshelf

import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.lyhux.yuedunovel.R
import com.lyhux.yuedunovel.data.BaseRecord
import com.lyhux.yuedunovel.data.BookRecordBean
import com.lyhux.yuedunovel.data.BookshelfBean


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FragmentAlarm.newInstance] factory method to
 * create an instance of this fragment.
 */
class BookFragment: Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    private  lateinit var gridView: GridView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view : View = inflater.inflate(R.layout.fragment_bookshelf_book, container, false)

        gridView = view.findViewById(R.id.fg_book_grid_view)

        val recordList = arrayListOf<BaseRecord>(BookshelfBean().apply {
            bookId = "a1234"
            bookTitle = "测试1"
            bookCover = "https://lookimg.com/images/2020/09/17/P0OfQo.jpg"
        }, BookshelfBean().apply {
            bookId = "a12345"
            bookTitle = "测试2"
            bookCover = "https://lookimg.com/images/2020/09/17/P0OfQo.jpg"
        }, BookshelfBean().apply {
            bookId = "a123456"
            bookTitle = "测试3"
            bookCover = "https://lookimg.com/images/2020/09/17/P0OfQo.jpg"
        }, BookshelfBean().apply {
            bookId = "a1234567"
            bookTitle = "测试4"
            bookCover = "https://lookimg.com/images/2020/09/17/P0OfQo.jpg"
        }, BookshelfBean().apply {
            bookId = "a1234567"
            bookTitle = "测试5"
            bookCover = "https://lookimg.com/images/2020/09/17/P0OfQo.jpg"
        }, BookshelfBean().apply {
            bookId = "a1234567"
            bookTitle = "测试6"
            bookCover = "https://lookimg.com/images/2020/09/17/P0OfQo.jpg"
        }, BookshelfBean().apply {
            bookId = "a1234567"
            bookTitle = "测试7"
            bookCover = "https://lookimg.com/images/2020/09/17/P0OfQo.jpg"
        }, BookshelfBean().apply {
            bookId = "a1234567"
            bookTitle = "测试8"
            bookCover = "https://lookimg.com/images/2020/09/17/P0OfQo.jpg"
        }
        )
        val adapter = BookListAdapter(requireContext(), recordList)

        gridView.adapter = adapter

        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentAlarm.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            BookFragment().apply {
                arguments = Bundle().apply {
                    // putString(ARG_PARAM1, param1)
                    // putString(ARG_PARAM2, param2)
                }
            }
    }
}