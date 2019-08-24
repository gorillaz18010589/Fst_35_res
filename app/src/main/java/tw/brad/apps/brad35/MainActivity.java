package tw.brad.apps.brad35;
//玩資源路徑不能亂改
//layout=>res file => 左邊選擇 oretion =>一個直port版本,一個橫的land版本
//Values => resFile => locacl國家
//少很多端段包含layout頁面
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
