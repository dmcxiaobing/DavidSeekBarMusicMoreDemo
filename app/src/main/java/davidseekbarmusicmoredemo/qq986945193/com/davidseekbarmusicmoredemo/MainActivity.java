package davidseekbarmusicmoredemo.qq986945193.com.davidseekbarmusicmoredemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.SeekBar;
import android.widget.TextView;

/**
 * @author ：程序员小冰
 * @新浪微博 ：http://weibo.com/mcxiaobing
 * @GitHub: https://github.com/QQ986945193
 * @CSDN博客: http://blog.csdn.net/qq_21376985
 * @码云OsChina ：http://git.oschina.net/MCXIAOBING
 */
public class MainActivity extends AppCompatActivity {
    private TextView tv_sb;
    private SeekBar sb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * 初始化控件
     */
    private void initView() {
        tv_sb = (TextView) findViewById(R.id.tv_sb);
        sb = (SeekBar) findViewById(R.id.sb);
        //SeekBar的监听事件
        sb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //监听点击时
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Log.e("xiaobing", "开始");
                tv_sb.setText("开始");
            }

            //监听滑动时
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Log.e("xiaobing", "变化" + progress);
                tv_sb.setText("进度条" + progress);
            }

            //监听停止时
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Log.d("xiaobing", "结束");
                tv_sb.setText("结束");
            }
        });
    }
}
