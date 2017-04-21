package navigation.bean.com.myeventbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().replace(R.id.tv,new myFragment()).commit();
//        EventBus.getDefault().register(this);
//        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(MainActivity.this,Second.class));
//            }
//        });
//        tv = (TextView) findViewById(R.id.tv);
    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        EventBus.getDefault().unregister(this);
//    }
//    @Subscribe(threadMode = ThreadMode.MAIN)
//    public void  hello(Bean bean){
//        Toast.makeText(this,"名字是"+bean.getName(),Toast.LENGTH_SHORT).show();
//        tv.setText(bean.getName());
//    }
}
