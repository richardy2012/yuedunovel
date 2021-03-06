package com.lyhux.yuedunovel.ui.bookshelf

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.lyhux.yuedunovel.R
import com.lyhux.yuedunovel.data.BaseRecord

class BookListAdapter(private var context: Context, private var recordList: List<BaseRecord>) : BaseAdapter() {

    override fun getView(pos: Int, contentView: View?, parent: ViewGroup?): View {
        val item = recordList[pos]

        if (contentView == null)  {
            val view = LayoutInflater.from(context).inflate(R.layout.fragment_bookshelf_item, null)

            val imageView = view.findViewById<ImageView>(R.id.fg_bookshelf_item_img)
            Glide.with(context)
                    .load(item.bookCover)
                    .placeholder(R.drawable.book_shelf_search)
                    .into(imageView);

            val title = view.findViewById<TextView>(R.id.fg_bookshelf_item_title)

            title.text = item.bookTitle

            return view
        }

        return contentView
    }

    override fun getItem(pos: Int): Any {
        return recordList[pos]
    }

    override fun getItemId(p0: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
        return recordList.size
    }

}