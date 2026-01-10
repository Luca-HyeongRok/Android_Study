package com.survivalcoding.gangnam2kiandroidstudy.presentation.screen.saved_recipes_legacy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.survivalcoding.gangnam2kiandroidstudy.R

/**
 * 레거시 RecyclerView 기반 화면의 진입점 Activity
 *
 * Compose Navigation 흐름과 분리하여
 * Activity + Fragment + RecyclerView 구조를 명확히 보여주기 위함
 */
class SavedRecipesLegacyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saved_recipes_legacy)

        // Activity는 Fragment를 "담는 컨테이너" 역할만 수행한다.
        // 실제 UI 로직은 Fragment에서 처리한다.
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(
                    R.id.fragmentContainer,
                    SavedRecipesLegacyFragment()
                )
                .commit()
        }
    }
}
