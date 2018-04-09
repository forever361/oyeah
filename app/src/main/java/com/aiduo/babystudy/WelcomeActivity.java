package com.aiduo.babystudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class WelcomeActivity extends Activity {

    private Button m_button;
    private Button m_button1;
    private Button m_button2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //隐藏标题栏以及状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        /**标题是属于View的，所以窗口所有的修饰部分被隐藏后标题依然有效,需要去掉标题**/
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_welcome);

        initView();

    }

    private void initView() {
        m_button=(Button) findViewById(R.id.button);
        m_button1=(Button) findViewById(R.id.button1);
        m_button2=(Button) findViewById(R.id.button2);

        ClickListener listener = new ClickListener();
        m_button.setOnClickListener(listener);
        m_button1.setOnClickListener(listener);
        m_button2.setOnClickListener(listener);

    }

    class ClickListener implements View.OnClickListener {
        public void onClick(View v){
            switch (v.getId()) {
                case R.id.button:
                    Intent i = new Intent(WelcomeActivity.this ,FruitSpalsh.class);
                    startActivity(i);
                    break;

            }
        }
    }


    private long lastBackTime = 0;

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // 判断按下的键是否是“返回”键
        if(keyCode == KeyEvent.KEYCODE_BACK) {

            // 判断当前时间与上次按“返回”键的时间差是否在2秒之内
            if(System.currentTimeMillis() - lastBackTime < 2000) {
                // 返回，且不消费，即让系统按照默认方式处理
                return super.onKeyDown(keyCode, event);
            }
            // 记录下当前按下“返回”键的时间
            lastBackTime = System.currentTimeMillis();
            // 提示
            Toast.makeText(this, "再次点击返回键退出！", Toast.LENGTH_SHORT).show();
            // 消费
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }






}
