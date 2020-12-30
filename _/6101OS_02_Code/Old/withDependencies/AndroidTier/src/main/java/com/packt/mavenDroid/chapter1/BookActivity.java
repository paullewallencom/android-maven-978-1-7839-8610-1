package com.packt.mavenDroid.chapter1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;
import com.packt.androidMaven.chapter2.model.Book;
import com.packt.androidMaven.chapter2.service.BookService;
import com.packt.androidMaven.chapter2.service.impl.BookServiceImpl;

public class BookActivity extends Activity {
    private BookService bookService;

    public BookActivity() {
        this.bookService = new BookServiceImpl();
    }

    /**
     * Called when the activity is first created.
     *
     * @param savedInstanceState If the activity is being re-initialized after
     *                           previously being shut down then this Bundle contains the data it most
     *                           recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final TextView textview;
        final Book book;
        book = bookService.createBook("Maven and Android", "eBook", "black", 150);
        textview = new TextView(this);
        textview.setText(book.toString());
        setContentView(textview);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(com.packt.mavenDroid.chapter1.R.menu.main, menu);
        return true;
    }
}