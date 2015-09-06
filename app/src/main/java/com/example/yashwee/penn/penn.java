package com.example.yashwee.penn;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class penn extends AppCompatActivity {

    // the input text for getting the input
    private EditText mEditText;
    private ImageView mImageView;
//    private GifGenerator mGifGenrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penn);
        mEditText = (EditText) findViewById(R.id.editText);
        mImageView = (ImageView) findViewById(R.id.imageView);
        Button getGifButton = (Button) findViewById(R.id.getGifButton);
        getGifButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = mEditText.getText().toString();

             Drawable drawable = mGifGenrator.getGif(inputText);

              mImageView.setImageDrawable(drawable);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_penn, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
