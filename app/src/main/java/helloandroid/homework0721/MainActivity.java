package helloandroid.homework0721;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.SimpleAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ArrayList<Map<String, String>> mylist = new ArrayList();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayList<Map<String, String>> mylist = new ArrayList();

        HashMap<String, String> m1 = new HashMap();
        m1.put("city", "台北");
        m1.put("code", "02");
        mylist.add(m1);

        HashMap<String, String> m2 = new HashMap();
        m2.put("city", "台中");
        m2.put("code", "04");
        mylist.add(m2);

        HashMap<String, String> m3 = new HashMap();
        m3.put("city", "台南");
        m3.put("code", "06");
        mylist.add(m3);

        HashMap<String, String> m4 = new HashMap();
        m4.put("city", "高雄");
        m4.put("code", "07");
        mylist.add(m4);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        SimpleAdapter adapter = new SimpleAdapter(MainActivity.this,
                mylist,
                android.R.layout.simple_list_item_2,
                new String[] {"city", "code"},
                new int[] {android.R.id.text1, android.R.id.text2});
        spinner.setAdapter(adapter);
    }
    public void click1(View v)
    {
        EditText ed = (EditText) findViewById(R.id.editText);
        EditText ed2 = (EditText) findViewById(R.id.editText2);
        HashMap<String, String> m5 = new HashMap();
        m5.put("city",ed.getText().toString());
        m5.put("code", ed2.getText().toString());
        mylist.add(m5);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner);
        SimpleAdapter adapter2 = new SimpleAdapter(MainActivity.this,
                mylist,
                android.R.layout.simple_list_item_2,
                new String[] {"city", "code"},
                new int[] {android.R.id.text1, android.R.id.text2});
        spinner2.setAdapter(adapter2);
    }
}