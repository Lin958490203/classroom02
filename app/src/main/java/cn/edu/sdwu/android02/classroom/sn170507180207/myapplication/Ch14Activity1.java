package cn.edu.sdwu.android02.classroom.sn170507180207.myapplication;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Ch14Activity1 extends AppCompatActivity {
    private MyOpenHelper myOpenHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch14_1);

        myOpenHelper=new MyOpenHelper(this);
        //以可写方法打开数据库
        SQLiteDatabase sqLiteDatabase=myOpenHelper.getWritableDatabase();
        //使用完毕，关闭数据库
        sqLiteDatabase.close();
    }
}
