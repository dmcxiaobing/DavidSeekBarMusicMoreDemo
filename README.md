# DavidSeekBarMusicMoreDemo
【Android】Android开发实现进度条效果，SeekBar的简单使用。音量，音乐播放进度，视频播放进度等

作者：[程序员小冰](https://github.com/QQ986945193)

新浪微博：http://weibo.com/mcxiaobing 

首先给大家看一下我们今天这个最终实现的效果图： 

![这里写图片描述](https://mcxiaobing.gitee.io/blog/img/github/DavidSeekBarMusicMoreDemo/20160910133005975.gif)

当然，这里的进度，是我们手动触摸控制的。截图可能不是很明显。

其实是很简单的，这只是一个android的控件而已，实现方法是，首先

我们在布局中引用seekbar。

```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <SeekBar
        android:id="@+id/sb"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />

    <TextView
        android:id="@+id/tv_sb"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_gravity="center_horizontal"
        android:text="进度条:" />
</LinearLayout>

```
然后，我们在java代码中实现SeekBar的监听事件。我这里监听事件，就随便打了一下log,

当然，在项目中如果用了它，就做适当的事情就可以了。代码也很简单，如下：



```
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

```

最后直接运行即可看到上面的效果。如果对您有帮助，欢迎star，fork。。。

当然如果我的项目帮到了你，欢迎进行打赏，请作者喝杯茶。谢谢支持。

![支付宝](https://mcxiaobing.gitee.io/blog/img/github/pay/zhifubao.png)

![微信](https://mcxiaobing.gitee.io/blog/img/github/pay/weixin.png)
