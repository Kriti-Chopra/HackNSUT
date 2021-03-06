package kriti.somevalue.com.iom;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Customer extends AppCompatActivity {

    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

//        ActionBar bar=getSupportActionBar();
//        bar.setDisplayShowHomeEnabled(true);
//        bar.setLogo(R.drawable.logo);
//        bar.setDisplayUseLogoEnabled(true);



        viewPager=(ViewPager) findViewById(R.id.viewPager);
        pagerAdapter=new MyPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(pagerAdapter);
        tabLayout=(TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);

//        if(viewPager.getCurrentItem()==0){
//            bar.setCustomView(textView0);
//        }
//        else if(viewPager.getCurrentItem()==1){
//            bar.setCustomView(textView1);
//        }


    }


}
