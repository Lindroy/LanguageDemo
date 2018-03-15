package com.lindroid.languagedemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.finddreams.languagelib.LanguageType;
import com.finddreams.languagelib.MultiLanguageUtil;

/**
 * @author linyulong
 */
public class MainActivity extends BaseActivity {
    private int selectedLanguage = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        MultiLanguageUtil.init(this);
        selectedLanguage = MultiLanguageUtil.getInstance().getLanguageType();

    }

    public void english(View view) {
        selectedLanguage = LanguageType.LANGUAGE_EN;
        changeLanguage();
    }

    public void simple(View view){
        selectedLanguage = LanguageType.LANGUAGE_CHINESE_SIMPLIFIED;
        changeLanguage();
    }

    public void traditional(View view) {
        selectedLanguage = LanguageType.LANGUAGE_CHINESE_TRADITIONAL;
        changeLanguage();
    }

    public void korean(View view) {
        selectedLanguage = LanguageType.LANGUAGE_KOREAN;
        changeLanguage();
    }

    private void changeLanguage(){
        MultiLanguageUtil.getInstance().updateLanguage(selectedLanguage);
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }
}
